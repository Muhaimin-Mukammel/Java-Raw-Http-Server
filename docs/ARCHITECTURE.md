# Architecture

## What This Project Does
This project is a simple HTTP server built using Java sockets with file-based storage.
It mimics basic REST API behaviour (GET, POST, PATCH, DELETE).

## Architecture
Client -> Server -> Router -> Logic -> Database ( request cycle )
Database -> Logic -> Router -> Server -> Client ( response cycle )

## Request-Response Flow
1. Client sends HTTP request using Socket
2. Server receives request via ServerSocket
3. Server parses request line and headers
4. Server extracts body using Content-Length header
5. Router checks HTTP method (GET/POST/PATCH/DELETE)
6. Router forwards request to Logic layer
7. Logic performs operations on file-based database
8. Response is returned back to Client

## Modules

**Server** — Handles incoming connections, header parsing, and body extraction.

**Client** — Sends raw HTTP requests to the server for testing.

**Router** — Decides which function to call based on HTTP method and URL.

**Logic** — Contains business logic and enforces resource validation.

**Database** — Handles all file-based storage operations (read, write, update, delete).