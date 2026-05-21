# Capabilities

The server can handle four core HTTP operations against a single resource endpoint `/data/dev/{id}`:

### Create (POST)
Accepts a POST request with a structured body containing `name`, `occupation`, and `language` fields. Validates that the ID does not already exist before writing a new record to the database.

### Read (GET)
Accepts a GET request with an ID in the URL. Searches the database for a matching record and returns the `name`, `occupation`, and `language` associated with that ID.

### Update (PATCH)
Accepts a PATCH request with a new set of field values in the body. Locates the existing record by ID and overwrites it in place, rewriting the entire database file with the updated entry.

### Delete (DELETE)
Accepts a DELETE request with an ID in the URL. Locates the record, removes it from the dataset, and rewrites the file without it.

## Additional Capabilities

- Parse raw HTTP/1.1 request lines and headers without any external library  
- Extract and read request bodies using `Content-Length` header  
- Validate URL structure and reject malformed requests  
- Detect duplicate IDs on insertion and refuse the operation  
- Handle missing records gracefully and return descriptive messages  
- Auto-create the database file if it does not exist on first write  