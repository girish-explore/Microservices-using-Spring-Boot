Project Components
API Gateway
The API Gateway acts as the single entry point for all client requests. It handles request management, routing, and forwarding client calls to the appropriate microservices. Additionally, it ensures security, load balancing, and centralized API management.

Config Server
The Config Server centralizes configuration management for all microservices. It simplifies application maintenance by externalizing configuration and ensuring consistency across environments (e.g., development, staging, production).

Discovery Server
The Discovery Server provides service registration and discovery. It allows microservices to dynamically register themselves and discover other services, enabling seamless communication and reducing manual configuration overhead.

Student Microservice
The Student Microservice manages all student-related data and operations, such as:

Adding new student records.
Updating existing student records.
Retrieving student information.

School Microservice
The School Microservice is dedicated to managing school-related data and functionalities, including:

Adding new school records.
Updating existing school details.
Retrieving school information.

Inter-Service Communication Using OpenFeign
This project showcases inter-service communication utilizing OpenFeign, a declarative REST client designed to streamline and simplify service-to-service interactions within the microservices ecosystem. 
