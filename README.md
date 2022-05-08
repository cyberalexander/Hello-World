# Hello-World 2.0
Console application, aimed to greet the person or AI who runs it.

### How it works
1) When the application is starting, it uniquely identifies the pair: 
unique **environment** (env), where it's executing and **unique user** who 
currently logged in to the system and runs the application.
2) If such **unique_identifier** already registered in application database (`select * from users where environment = XXX and user = YYY`)
3) Then application just reads this information from a database and greets the user. Steps below skipped.
4) If **unique_identifier** was not found, then application treats current env and user
as new one and creates new entry in database. 
5) Then application reads new entry from a database and prints the greeting to console.

#### Notes
* Unique identifier = env + user
* Same env can have multiple users

### Schema
##### Users

| environment | username |
|-------------|----------|
| XXXXXXX     | YYYYYYY  |
| AAAAAAA     | BBBBBBB  |
| CCCCCCC     | DDDDDDD  |

##### Notes
* Columns environment and user are the part of **composite primary_key**
* Index on **environment+user** columns to be created

### Build and run
```bash
$ mvn -U clean install
$ java -jar target/hello-world.jar
```

### Technologies
* Java 17
* Maven
* Junit 5
* Database *TBD*
* *TBD*

### Code quality
* Checkstyle
