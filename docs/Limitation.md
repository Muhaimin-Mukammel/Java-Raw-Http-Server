# Limitations

The project is functional as a low-level HTTP server, but it has several limitations due to its simplified and learning-focused implementation.

### Hardcoded Configuration
The server uses hardcoded values such as the database file path and server port, making it environment-dependent and not portable across different systems.

### Single Resource Endpoint
The server is limited to a single resource endpoint (`/data/dev/{id}`), which restricts scalability and does not support multiple resources or modular API design.

### No Concurrency Support
The server does not handle multiple client requests concurrently. Requests are processed sequentially, which limits performance under load.

### File-Based Storage System
The project uses a simple file-based database instead of a proper database system. This limits scalability, performance, and data integrity in larger applications.

### No JSON Parsing Library
Request and response handling is done manually without a dedicated JSON library, making parsing less robust and more error-prone.

### Minimal Error Handling
Error handling is basic and does not fully follow standard HTTP conventions in all cases. Some edge cases may not return fully standardized responses.

### No Authentication or Security Layer
The server does not include authentication, authorization, or encryption mechanisms, making it unsuitable for real-world deployment.

### No Persistent Connection Handling
The server does not support advanced HTTP features such as persistent connections (Keep-Alive), limiting efficiency in repeated requests.

### No Testing Framework
The project does not include automated unit tests, which reduces reliability during future modifications or scaling.