# API Documentation

## Endpoints

### GET /data/dev/{id}
Description: Retrieve a record by ID.

### POST /data/dev/{id}
Description: Create a new record with the given ID.
Body: `name:value,occupation:value,language:value`

### PATCH /data/dev/{id}
Description: Update an existing record by ID.
Body: `name:value,occupation:value,language:value`

### DELETE /data/dev/{id}
Description: Delete a record by ID.

---

## Request Body Format
Fields are passed as comma-separated key-value pairs:

## Note
This server does not return standard HTTP responses currently.
Responses are plain text strings.