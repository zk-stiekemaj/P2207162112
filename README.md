# CORS requests in Spring Web MVC applications

## Setup
1. Install npm http-server: `npm install http-server -g`
2. Start server on port 4200 to host test.html: `http-server ./ -p 4200`
3. Start the spring boot application

## Test in browser
Open http://localhost:4200/test.html in a browser. Press the buttons to trigger some cross-side requests on different
end points. CORS policy errors can be viewed in the browser's console.

## Test with curl
- Preflight request:
  - `curl -v -H "Access-Control-Request-Method: POST" -H "Origin: http://localhost:4200" -H "Authorization: Basic dXNlcjp1c2Vy" -X OPTIONS http://localhost:8080/userWithCors`
- Executing Cross-origin GET request without Cors enabled:
  - `curl -v -H "Origin: http://localhost:4200" -H "Authorization: Basic dXNlcjp1c2Vy" -X POST http://localhost:8080/user`
- Executing Cross-origin GET request with Cors enabled:
  - `curl -v -H "Origin: http://localhost:4200" -H "Authorization: Basic dXNlcjp1c2Vy" -X POST http://localhost:8080/userWithCors`