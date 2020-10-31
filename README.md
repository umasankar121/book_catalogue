# book_catalogue
Maven Setup:
Clone the project.
run- mvn install
once build is successfull, do a run configuration

Run - BookcateloguesystemApplication.java

Database Setup- 
Once application is up and running

go to http://localhost:8080/h2/
login:
user: sa
password:

copy the sql statemets in Test.sql
and execute the sql statements.

Goto browser or any webservice client(postman, soapui) and try pinging the below urls

localhost:8080/book/create

localhost:8080/book/findBookByTitle/bookTitle - replace bookTitle with the title
localhost:8080/book/findBookByAuthor/author - replace author
locahost:8080/book/findBookByISBN/isbn - replace isbn

locahost:8080/book/deleteBookBytitle/title - {title} replace with title
locahost:8080/book/deleteBookByIsbn/isbn- {isbn} replace with isbn


