# ARCHITECTURE documentation

## Simple Explanation of what the project dose
    This project is a simple HTTP server build using Java sockets with file-based storage. 
    It mimics basic REST API behaviour (GET, POST, PATCH, DELETE).

## Architecture 
    Client -> Server -> Router -> Logic -> Database ( request cycle )
    Database -> Logic -> Router -> Server -> Client ( response cycle )

## Request-Response flow
    1. Client sends HTTP request using Socket
    2. Server receives request via ServerSocket
    3. Server parses request line + body
    4. Router checks HTTP method (GET/POST/PATCH/DELETE)
    5. Router forwards request to Logic layer
    6. Logic performs operations on file-based database
    7. Response is returned back to Client

## Modules 

1. Server
Handles incoming connections and request parsing.

2. Client
Sends raw HTTP-like requests to server.

3. Router
Decides which function to call based on HTTP method and URL.

4. Logic
Contains business logic (CRUD operations).

5. Database
Handles file-based storage operations.

