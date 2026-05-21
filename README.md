# Java Raw HTTP Server

## Overview
A hand-built HTTP server written in Java from scratch — no Spring, no frameworks, no external libraries.  
Built using raw sockets, manual HTTP parsing, and file-based storage.

---

## My Experience While Building This Project

This project was developed entirely in Java without any frameworks or external tools. It helped me 
understand backend systems at a low level, especially how HTTP servers actually work internally.

### Key Challenges
- Designing a stable client–server architecture from the ground up
- Implementing CRUD operations using a file-based storage system
- Handling low-level HTTP request and response formatting manually
- Debugging data inconsistency and request parsing issues
- Managing structural limitations that appeared as the project scaled

### Iterations & Improvements
- Rebuilt the client–server communication system twice for better structure
- Changed the database handling approach multiple times for stability
- Refactored core logic after identifying design limitations during testing

### What I Learned
- How low-level HTTP request/response structure actually works
- Importance of clean architecture before scaling features
- Debugging complex systems improves understanding faster than tutorials
- File-based storage limitations vs real database systems
- How to design APIs with future extensibility in mind

---

## How I Used AI in This Project

I used AI strictly as a learning and debugging tool — never as a code writer.

**What I used AI for:**
- Deep diving into concepts I did not fully understand
- Getting guidelines and planning the architecture
- Debugging — when I was stuck, I described the problem and asked for explanations
- Understanding why something was broken, not what to build

**What I never did:**
- Copy pasted a single line of code from AI
- Asked AI to write any feature or implementation for me
- Used AI as a shortcut around actually understanding something

**Honest breakdown:**
Roughly 40% of problems I solved myself. The harder 60% I needed AI assistance to debug and understand. I am aware of that ratio and I am working to close it.

All syntax and implementation patterns were learned from documentation, videos, and Google — not AI output. Every line of code in this project was written by me.

---

## Note
- The project currently uses a hardcoded database file path, making it environment-dependent
- This is a learning project and is not intended for production use

---

## Documentation

- Capabilities → [docs/Capability.md](docs/Capability.md)
- Limitations → [docs/Limitations.md](docs/Limitations.md)
- Architecture → [docs/Architecture.md](docs/ARCHITECTURE.md)
- API → [docs/API.md](docs/API.md)
- Future Improvements → [docs/Improvements.md](docs/Improvements.md)

---

## For Professionals

This is my first backend project. I built everything from scratch intentionally — 
to understand what frameworks abstract away.

If you are an experienced engineer, I would genuinely appreciate feedback on:
- Whether my layer separation (Server → Router → Logic → Database) makes sense
- Where my architecture breaks down and how you would restructure it
- What I should build next to continue growing as a backend engineer

I am not looking for validation. Honest, direct feedback is welcome.