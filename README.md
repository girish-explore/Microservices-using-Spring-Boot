#H1 Project Components

##H2 API Gateway
The API Gateway acts as the single entry point for all client requests. It handles request management, routing, and forwarding client calls to the appropriate microservices. Additionally, it ensures security, load balancing, and centralized API management.

##H2 Config Server
The Config Server centralizes configuration management for all microservices. It simplifies application maintenance by externalizing configuration and ensuring consistency across environments (e.g., development, staging, production).

##H2 Discovery Server
The Discovery Server provides service registration and discovery. It allows microservices to dynamically register themselves and discover other services, enabling seamless communication and reducing manual configuration overhead.

##H2 Student Microservice
The Student Microservice manages all student-related data and operations, such as:

###H3 Adding new student records.
###H3 Updating existing student records.
###H3 Retrieving student information.

##H2 School Microservice
The School Microservice is dedicated to managing school-related data and functionalities, including:

###H3 Adding new school records.
###H3 Updating existing school details.
###H3 Retrieving school information.

##H2 Inter-Service Communication Using OpenFeign
This project showcases inter-service communication utilizing OpenFeign, a declarative REST client designed to streamline and simplify service-to-service interactions within the microservices ecosystem. 
