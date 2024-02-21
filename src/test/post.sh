#!/bin/bash
curl -X POST -H "Content-Type: application/json" -d '{  "urls": ["http://www.youtube.com/watch?v=kpsUM700OvE aaahttp://www.youtube.com/watch?v=kpsUM700OvE"]}' http://localhost:8080/parse-url
