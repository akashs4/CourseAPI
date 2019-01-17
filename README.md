# CourseAPI
A basic REST API for different courses available under various topics capable of performing CRUD operations.

/topics/ - will display all available topics

/topics/id - will display one topic with one id

/topics/id/courses/ - will display all courses available under each topic

/topics/id/courses/courseid - will display one particular course

For performing CRUD operations for topics, URLs will be like this:

/topics/ - for adding new topic using POST

/topics/id - for getting one particular topic using GET

/topics/id - for deleting one particular topic using DELETE

/topics/id - for updating one particular topic using PUT

Similarly, we will be doing for courses.

Initially, no data will be there, since Apache Derby db is embedded in spring boot and each time we restart application, data is erased.
However, we can use application.properties file in resources section to configure the local database as per requirement.

https://docs.spring.io/spring-boot/docs/current/reference/html/common-application-properties.html contains most of the common application properties
spring.datasource properties can be used to connect to external db.

Happy learning!!
