# HTTP Server

## Overview
A hand-built HTTP server written in Java from scratch — no Spring, no frameworks, no external libraries.  
Built using raw sockets, manual HTTP parsing, and file-based storage.

---

## About Me
Hello, I am **Muhaimin Mukammel**. This is my first full-scale backend project.

---

## My Experience While Building This Project

This project was developed entirely in Java without any frameworks or external tools. It helped me understand backend systems at a low level, especially how HTTP servers actually work internally.

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

### Note
The project currently uses a hardcoded database file path, which makes it environment-dependent and not portable across devices.

---

## Documentation

- Capabilities → [docs/Capability.md]
- Limitations → [docs/Limitations.md]  
- Future Improvements → [docs/Improvements.md]