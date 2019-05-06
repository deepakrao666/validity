# validity
Project for validity full-stack developer role
**Problem statement** 

1.	Write an app that parses the attached normal.csv file using any language you choose (unless you’ve been asked otherwise).
2.	Identify possible duplicate records in the data-set.
1.	Leverage existing algorithms (no need to reinvent the wheel)
2.	Example algorithms include Metaphone and Levenshtein distance
3.	We’re looking to find not just exact duplicates but also records that are likely to be a duplicate entry with different spelling, missing data, small differences, etc.
1.	Ignore the ID column for deduplication as they are here to help you visually identify duplicates
2.	Here is an example of a duplicate record: bill,smith,bsmith@gmail.com,190 main st boston mass and bill,smith,bsmith@gmail.com,400 west street boston ma
4.	Build a lightweight web application to display the processed data. Print each set of duplicates separately as well as a set of non-duplicate entries.
1.	Create a JSON object output
2.	Print the results to the standard output (stdout)
3.	Display duplicates separately as well as a set of non-duplicate entries.
4.	Example output attached Note: the values returned aren’t necessarily duplicates:
5.	Some duplicates are harder to identify than others and some false negatives harder to eliminate. Do what you can in the few hours you can dedicate to this.
5.	Submit your code through a Github repository for us to review, with a Pull Request showing the commits you made that allows us to comment on it.
6.	Try to time-box your effort to around 4 hours if you can.


**Features provided in this application :**

1. All points covered from problem statement
2. Application supported by Swagger2 Api, all documented URLs can be found in swagger url.
3. Docker implementation supported. More information about commands provided below. 
4. Acuator implementation supported, this can be used to check open ended URLs for health and metrics
5. Response in format of JSON, contained separated structure for both unique and possible duplicate records in the file.
    Also contains redundancy rate, which a metric of redundancy of the entire file. 

**Requirements**

For building and running the application you need:

    JDK 1.8
    Maven 3

**Running the application locally**

There are several ways to run a Spring Boot application on your local machine. 
One way is to execute the main method in the com.validity.ProApplication class from your IDE.

Alternatively you can use the Spring Boot Maven plugin like so:

mvn spring-boot:run

**Deploying the application using Docker**

Requirements 

    Locally installed docker (Hyper V for window 10)
    
Use Docker file within the file structure to run the project:

    docker build -t validity-app .
    
    docker run -p 8080:8080 -name validity validity-app

This should run the application on 0.0.0.0:8080

Open Urls:

/swagger-ui.html

status
/

health
/health

file upload and other utilities 
/upload
