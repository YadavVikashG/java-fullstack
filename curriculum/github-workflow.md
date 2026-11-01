# Git and GitHub: Update, Pull, and Push

This guide covers common repository workflows from the terminal or VS Code terminal. Replace example usernames, repository names, and branch names with your own. The examples use `main`; check the repository's default branch before running a command.

## First: What changes when you push?

Git tracks file changes and commits. Pushing sends commits from your local repository to a GitHub repository. This updates files in that repository; it does **not** directly update data in a running PostgreSQL or MongoDB database.

To change database records, use the application or a database client. To change a database schema through the project, create and run a database migration. Committing a migration file stores it in GitHub, but it only changes a database when the migration is applied in the appropriate environment.

## Configure Git once

Set the author name and email that should appear on your commits:

```sh
git config --global user.name "Your Name"
git config --global user.email "you@example.com"
```

Authenticate with GitHub using GitHub CLI:

```sh
gh auth login
gh auth status
```

Follow the prompts and choose HTTPS or SSH. Never paste a password or access token into a Git command, source file, or remote URL. If working in VS Code, its Source Control view can also stage, commit, pull, and push; the terminal commands below make the operations explicit.

## Update your own GitHub repository

### Clone it the first time

Copy the HTTPS or SSH URL from the GitHub repository's **Code** menu, then run:

```sh
git clone https://github.com/YOUR-USERNAME/REPOSITORY.git
cd REPOSITORY
git remote -v
```

`origin` is the nickname for the remote repository you cloned. Confirm it points to the repository you intend to update.

### Get the latest changes and make an update

If the repository is already on your computer, open its folder first. Then:

```sh
git status
git switch main
git pull --ff-only origin main
git switch -c update/my-change
```

The pull gets the latest `main` from GitHub. The new branch gives your work a separate place to review. If your default branch is not `main`, substitute its actual name.

Edit or add files, then inspect exactly what will be committed:

```sh
git status
git diff
```

Stage only the files you mean to update, commit them, and push your branch:

```sh
git add README.md src/example/Example.java
git diff --staged
git commit -m "Describe the update"
git push -u origin update/my-change
```

Open the repository on GitHub and create a pull request from `update/my-change` into `main`. Review the changes and checks before merging. If you have permission and the project explicitly allows direct updates to `main`, follow its contribution rules; a branch and pull request are safer for normal work.

## Pull changes from another person's repository

You can download and use another repository if its license and access rules allow it. To contribute changes back, use the project's contribution instructions. Most projects expect a fork and pull request rather than a direct push to the owner's repository.

### Fork and clone

1. On GitHub, open the repository and select **Fork**. This creates a copy under your account.
2. Clone your fork, not the original repository:

```sh
git clone https://github.com/YOUR-USERNAME/REPOSITORY.git
cd REPOSITORY
git remote -v
```

Here `origin` should point to your fork. Add the original repository as `upstream`:

```sh
git remote add upstream https://github.com/ORIGINAL-OWNER/REPOSITORY.git
git remote -v
```

### Sync your fork and make a contribution

Fetch the original project's latest changes and update your local `main`:

```sh
git fetch upstream
git switch main
git merge --ff-only upstream/main
git push origin main
```

If `--ff-only` reports that the branches have diverged, stop and inspect `git status` and the repository's contribution instructions rather than forcing the update. Then make a work branch:

```sh
git switch -c fix/describe-your-change
```

Make and test your change, then review, commit, and push it to **your fork**:

```sh
git status
git diff
git add path/to/changed-file
git diff --staged
git commit -m "Describe the fix"
git push -u origin fix/describe-your-change
```

On GitHub, open a pull request from your fork's branch to the original repository's `main` branch. Follow its template, tests, and review requirements.

## If Git reports a conflict

Do not delete your work or force-push. Check the current state first:

```sh
git status
```

Open each reported conflicted file. Git marks the competing sections with `<<<<<<<`, `=======`, and `>>>>>>>`. Edit the file so it contains the intended final version, remove the markers, run the relevant tests, then stage and commit the resolved file:

```sh
git add path/to/resolved-file
git commit -m "Resolve merge conflict"
```

If you are unsure which change to keep, stop and ask the repository maintainer before resolving it. Never use `git push --force` on a shared branch unless the maintainer specifically instructs you and you understand the consequences.

## Keep secrets and generated files out of Git

Before staging, inspect `git status` and `git diff`. Do not commit passwords, database connection strings, API keys, `.env` files, private user data, or production exports. Put local secrets in ignored files or environment variables. Avoid committing build output such as Java `target/`, frontend `node_modules/`, or compiled `.class` files. If a secret was committed, deleting it in a later commit does not erase it from history; rotate the credential and follow GitHub's sensitive-data cleanup guidance.

## Quick command meanings

| Command | Meaning |
| --- | --- |
| `git status` | Show changed, staged, and untracked files |
| `git diff` | Review unstaged edits |
| `git diff --staged` | Review what will enter the next commit |
| `git fetch origin` | Download remote branch information without merging it |
| `git pull --ff-only origin main` | Update the current branch from remote `main` when it can fast-forward cleanly |
| `git add path` | Stage a chosen file or directory |
| `git commit -m "message"` | Save staged changes as a local commit |
| `git push -u origin branch` | Send a local branch to the `origin` remote and remember its upstream |