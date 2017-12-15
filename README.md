## Denis Gallo (194441) | denis.gallo@studenti.unitn.it
My heroku server: http://assignment3-denisgallo.herokuapp.com/people?wsdl  
My github repositories:  
https://github.com/DenisGallo/introsde-2017-assignment-3-server  
https://github.com/DenisGallo/introsde-2017-assignment-3-client  
I worked with Mattia Buffa.  
Heroku server: https://server-as3.herokuapp.com/people?wsdl  
His github repositories:  
https://github.com/CommanderBuffin/introsde-2017-assignment-3-server  
https://github.com/CommanderBuffin/introsde-2017-assignment-3-client  

## Project

### Description of the code
The client has a main package named **introsde.assignment3.soap**, in the **client** package there is only 1 class, **PeopleClient** which contains the main method to execute the entire client. In the **ws** package there are the classes imported with wsimport.  
In the AssignmentClient class there is a main method which calls every step one by one. Other methods to print in the output the results are PrintPerson() and a PrintActivity().

### Description of the tasks
The client is calling sequentally every step specified on the assignment website. On the system output it prints every method number that it's about to executing followed by "done" when it's terminated. Meanwhile on the log file it's printing all information needed to understand what it is going on.  
Method 5 and 9 are not returning a value (on the assignment page they have no return value, so i implemented it accordingly). A simple "DELETED" or "CREATED" message is outputed on the logfile, we trust the server that everything went fine.

## Execution
In order to run the client you just need to **ant execute.client** in the root folder of the application, it should print the entire application in the logfile (every run will overwrite the logfile)  

## Additional Notes
Some requests were hard to understand and maybe i got a different interpretion on what i should do, you can ask me if something is really not working because all of my tests went fine on the server and the client of my partner is running perfectly.