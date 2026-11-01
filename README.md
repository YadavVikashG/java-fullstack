# Java Full-Stack Developer Course

A practical, job-focused 24-week course for learning Java full-stack development and teaching it to another person. It contains 120 numbered study-day lesson plans. Each lesson includes a teaching sequence, a hands-on task, one interview question, one DSA exercise, and a checkpoint.

## How to use this course

- Study one numbered lesson per study day, budgeting about 2-3 hours: 30-45 minutes of instruction, 60-90 minutes of implementation, and 20-30 minutes of DSA and review.
- Keep all code in a Git repository. Commit working milestones and write down mistakes and fixes; do not copy solutions before attempting the exercise.
- Complete the checkpoint before moving on. If it is not met, use the next session to review and retry rather than piling on new topics.
- Start each session by recalling yesterday's ideas without notes. End by explaining today's code aloud and writing a short progress note.
- Lesson files are in [`curriculum/days`](curriculum/days/). Follow them in order; the DSA track is cumulative.
- For repository updates and contributing to another project, see the [GitHub workflow guide](curriculum/github-workflow.md).

## Roadmap

| Days | Focus | Deliverable |
| --- | --- | --- |
| 1-10 | Java setup, syntax, control flow, methods, arrays, strings | Command-line profile and utility programs |
| 11-20 | Classes, object design, interfaces, inheritance, enums, records | Object-oriented library checkout model |
| 21-30 | Collections, generics, exceptions, files, testing, Git, Maven | Tested command-line expense tracker |
| 31-40 | Relational modeling, SQL, joins, constraints, transactions, PostgreSQL | Designed and queried PostgreSQL schema |
| 41-50 | JDBC, HTTP, JSON, REST, Maven, API design | JDBC-backed library API foundation |
| 51-65 | Spring Boot, REST controllers, services, validation, errors, tests | Task management REST API |
| 66-75 | Spring Data JPA, relationships, migrations, auth and backend security | Persistent, authenticated PostgreSQL API |
| 76-85 | HTML, CSS, JavaScript, TypeScript, browser and web fundamentals | Responsive frontend prototype |
| 86-95 | React, components, state, forms, routing, API integration | Full-stack task management application |
| 96-105 | Integration, security, testing, Docker, CI, deployment and observability | Deployable full-stack release |
| 106-110 | MongoDB Atlas, document modeling, Spring Data MongoDB, SQL vs NoSQL | Mongo-backed activity or audit feed |
| 111-115 | Performance, caching, async messaging, system design and cloud concepts | Measured, resilient service design |
| 116-120 | Capstone, portfolio, resume, interview practice and job search | Production-minded portfolio and interview plan |

## Project ladder

1. **Java console utilities (Days 1-10):** small programs that read input, validate it, and produce useful output.
2. **Library domain model (Days 11-20):** model books, members, and loans with clear responsibilities and testable rules.
3. **Expense tracker (Days 21-30):** persist and test a command-line workflow; use collections, files, and Maven.
4. **PostgreSQL library service (Days 31-50):** design relational tables, query them, then access data with JDBC and expose HTTP endpoints.
5. **Task management REST API (Days 51-75):** build a layered Spring Boot API with PostgreSQL, validation, migrations, tests, and authentication.
6. **React task manager (Days 76-105):** connect a responsive React/TypeScript client to the API; test, containerize, and deploy it.
7. **MongoDB activity feed (Days 106-110):** store flexible event documents in MongoDB Atlas while keeping transactional business records in PostgreSQL.
8. **Capstone (Days 116-120):** deliver a polished, documented, tested full-stack product. Choose a real problem and justify the database and architecture choices.

## Teaching a lesson

Use the lesson's teaching sequence as a repeatable class plan:

1. Ask the student to recall a related idea and predict what the new code will do.
2. Explain one concept, then demonstrate a small example while narrating decisions and tradeoffs.
3. Have the student implement the lesson task independently. Ask guiding questions before offering a solution.
4. Review the code together: correctness, naming, edge cases, tests, and one possible improvement.
5. Ask the interview question orally, then have the student solve and explain the DSA exercise. Give hints in stages, not the finished answer.
6. Use the checkpoint to decide whether to continue, review, or revisit a prerequisite.

For a 1:1 class, let the student drive the keyboard. For a group, use short individual attempts, pair explanations, and a final solo check so attendance is not mistaken for understanding. Adapt timing to the student's pace; mastery matters more than finishing all 120 days on schedule.

## Tooling and databases

Use Java 21 or newer, Git, an IDE, Maven, PostgreSQL, a current Node.js LTS release, and Docker when its lessons begin. The course uses Spring Boot, JPA, React, and TypeScript as the main full-stack path. Prefer current stable releases and follow the lesson's setup notes rather than pinning an old tutorial version.

Use PostgreSQL for structured business data and relationships. Use MongoDB Atlas later for a document-shaped workload such as an activity feed; it is an additional tool, not a replacement for learning SQL. Keep credentials in environment variables or a local ignored config file. Never commit database passwords, API keys, or production secrets. Use a disposable development database and least-privilege accounts.

## Job-readiness standard

By the end, be prepared to explain and demonstrate Java and object-oriented fundamentals, SQL and data modeling, HTTP and REST, Spring layering, validation and security, React state and API calls, testing, Git, and deployment. For each portfolio project, include a clear README, setup instructions, architecture sketch, sample environment configuration without secrets, meaningful tests, screenshots or a demo, and a short explanation of tradeoffs. Practice DSA consistently, but prioritize explaining a correct, tested approach over memorizing answers.

The course is a structured path, not a guarantee of employment. Tailor the capstone and interview practice to the roles and local market you are targeting.