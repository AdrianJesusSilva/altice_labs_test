## Running the application in dev mode (REST Service)
```shell script
./mvnw quarkus:dev
```

## To test the the endpoint use the following in a terminal o postman 
```
curl http://localhost:8080/labseq/n

please substitute the 'n' with the index of the value you what to obtain
```

## Openai 
```
---
openapi: 3.0.3
info:
  title: altice-labs-test-job-interview API
  version: 1.0.0-SNAPSHOT
paths:
  /labseq/{index}:
    get:
      tags:
      - Lab Seq Resource
      parameters:
      - name: index
        in: path
        required: true
        schema:
          format: int32
          type: integer
      responses:
        "200":
          description: OK
```

if want to download the file use the following in a terminal o postman
``` 
curl http://localhost:8080/q/openapi
```

if need the json format use the following in a terminal o postman
``` 
curl http://localhost:8080/q/openapi?format=json
```

# Assumptions
the cache is only in memory while the service is active, when the service shutdowm the cache is lost and will be recalculate with the use of the service the next time is active.