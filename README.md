# Santander Dev Week 2024
Java RESTful API criada para a Satander Dev Week.

## Diagrama de Classes

```mermaid
classDiagram
    class User {
        - String name
    }
    
    class Account {
        - String Number
        - String Agency
        - float Balance
        - float Limit
    }

    class Feature {
        - String icon
        - String description
    }

    class Card {
        - String cardNumber
        - float cardLimit
    }

    class News {
        - String icon
        - String Description
    }

    User "1" *-- "1" Account
    User "1" *-- "1..N" Feature
    User "1" *-- "1" Card
    User "1" *-- "1..N" News
```
