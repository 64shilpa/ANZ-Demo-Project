# ANZ-Demo-Project
Prerequisites to run application
Java 8
Maven
Access to maven central to download required jars
Port 5000 should be available for use.

APIs can be accessed via http://localhost:8080 Example:

GET localhost:5000/jpa/accounts/
POST localhost:5000/jpa/accounts/
BODY: { "name": "test", "transactionDate": "2019-09-11T16:00:00.000+0000", "transactions": [] ... }

GET localhost:5000/jpa/accounts/10001/transactions

POST localhost:5000/jpa/accounts/10001/transactions

BODY: { "description": "Account 6", "postDate": "2019-09-11T16:00:00.000+0000" ... }
