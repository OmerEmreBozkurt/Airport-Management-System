**Airport Management Systems**

# Background

An airport management system (AMS) is a software solution used to manage and optimize airport operations, including flight operations, passenger processing, baggage handling, and other airport services. An AMS typically integrates multiple modules to provide a comprehensive solution for airport management. Some of the key modules in an AMS include but are not limited to:

-   **Flight Management**: This module manages flight schedules, tracks flight movements, and provides real-time information on flight status. It also facilitates communication between airlines, ground handlers, and air traffic control.
-   **Passenger Management**: This module manages passenger processing, including check-in, security screening, boarding, and baggage handling. It provides real-time information on passenger flow and facilitates communication with passengers.
-   **Plane Management**: This module manages all the operations related to airplanes and resources related to plane such as runways allocation, hanger where plane need to be parked and other multiple things. It helps optimize the use of these resources and tracks their availability and usage.
-   **Baggage Management**: This module tracks baggage from check-in to arrival, ensuring that it is properly routed and delivered to the correct destination. It also manages baggage handling equipment and provides real-time information on baggage status.

Overall, an AMS helps optimize airport operations and improve the passenger experience by providing real-time information and facilitating communication between stakeholders. It is an essential tool for modern airports and helps ensure safe, efficient, and profitable airport operations.

In this project we are going to implement AMS and its following key modules as shown in fig 1.

-   Passenger Management System
-   Plane Management System
-   Flight Management System
-   Tickets

![](media/7669fbd1172efa3f3507af7859c6e685.jpg)

*Figure 1: Airport Management System*

**Flight Management System contain the following functions/modules**

-   Generate Flights
-   Add flights details
-   Remove flights
-   Current flights
-   Manage Tickets
-   Buy ticket and cancel ticket for a particular flight

**Plane Management System contain the following functions/modules**

-   Add plane
-   Remove plane
-   Add and remove hanger
-   Add and remove runways
-   Reserve and reset hanger
-   Reserve and reset runways

**Passenger Management System contain the following functions/modules**

-   Add passenger details (name, sur name)
-   Passenger type (Business, Economy or family)
-   Add luggage details
-   Add date of birth

**An Ticket class need to be created which contain the following details:-**

-   Flight details
-   Passenger details
-   Seat allocation
-   Base price calculation
-   Regular ticket and VIP ticket
-   VIP tickets can only be purchased by business class. Please add some discount ratio as well for different categories of class.
1.  Students are expected to deploy all the concepts in this project that are learned in the class i-e abstract class, interface concept, inheritance and polymorphism concept, exception handling techniques.
2.  Students must utilize the abstract and inheritance feature as the project contains multiple subclasses. It should be implemented properly so that it can inherit properties and methods from another subclass (superclass or base class)
3.  Students must utilize the interface feature as well. Since multiple classes can implement the same interface, so that your code can work with any object that implements that interface.
4.  Students must utilize exception handling for invalid data entries. As an example, few screen shots are shown in the figures as well that pop up a window when an invalid entry is added in their respective filed. You can think of multiple scenarios by yourself for the whole project.
5.  UI must include **a MVC pattern** GUI and listeners.
6.  Students must utilize array list for storing any kind of information.
7.  Demo session is mandatory to be attended (31 May 2023), otherwise it will be graded 0 from the project (It does not matter if you submit your project or not)

**Step 1**: Create a GUI (MVC based pattern) which contains the: -

-   Passenger management system
    -   Plane management system
    -   Flight management system

![](media/27edab187917a3d206c8131a7bf0e3cd.jpg)

**Step 2**: For the Passenger management system, the following functionalities need to be achieved in this gui pattern.

-   User can be able to **add** passenger details by entering his/her first name, last name, date of birth and luggage details.
    -   User can be able to select **Passenger type** i-e Business class, Economy class and Family class.
    -   User can be able to delete or **remove** passengers info
    -   User can be able to **update** passenger details as well

For example, to add the passenger details, we need to enter Name, Surname, passenger type, luggage count and date of birth

![](media/ae85d382d08c1b1bba70d84d462e3803.jpg)

To remove a particular user, we can remove the passenger by specifying the attribute and that particular passenger will be removed.

![](media/98c57ee1b7cc5c91d9419c49189fae8f.jpg)

To update a user i-e to change the information of passenger.

![](media/1565c02ed97393155cecca5328c1ac71.jpg)

If any invalid entry is entered it should pop a window error message (Exception error handling)

![](media/4c4addfc3cb4d11e39a29bccdaae17ca.jpg)

Step 3: For the Plane management system, the following functionalities need to be achieved in this gui pattern.

-   User can be able to **add** plane details
    -   User can be able to **delete** or **remove** plane details
    -   User can be able to **add and remove** hangers details
    -   User can be able to **reserve and reset** hangers for any plane added
    -   User can be able to **add and remove** runways details
    -   User can be able to **reserve and reset** runways for any plane added

For example, to add the plane, we need to enter its plane details

![](media/2e7d370ed963d0f0e0800e82b6740c4d.jpg)

A particular plane details can be deleted as well

![](media/443fa4348920b9d9cf40cfa9801efde5.jpg)

Similarly to add the hanger and runway we need to mention its airport id and we can remove the hanger and runway as well

![](media/4b3f2d7f24f6c561d0f81bef3e7eb2c3.jpg)

We can reserve the hanger and runway for the particular plane that is added previously

![](media/c1ed3387aa50de4fb04733bea5abfadb.jpg)

![](media/d26c61ec2146b509d25072695417b5a1.jpg)

Similarly we can reset the hanger and runway if it is not being used by any plane

![](media/292bc87d8921dd59b8cf5916975dadb5.jpg)

For an invalid entries , error must be pop up as well

![](media/b9f01d5554f22e0e41a98b7b3b74c05f.jpg)

Step 4: For the Flight management system, the following functionalities need to be achieved in this gui pattern.

-   User can be able to **generate** flight details by entering departure and landing location information, departure and return date, and capacity information of the plane.
-   User can be able to **add or remove** flights.
-   User can be able to manage tickets by i-e buying a ticket for a particular passenger that is created earlier. Users can allocate a seat number as well.
-   User can cancel a ticket for particular passenger as well.

    ![](media/37bc53ae59b0dd1b6a4eae8e83c665fb.jpg)

For example, to add a flight, we need to enter its departure and landing location, departure and return date

![](media/bac63d6d34a0d69b78472f501dc23594.jpg)

A flight can be removed as well by selecting a particular flight that is added earlier

![](media/ecadf19cee027d814cce718757ab5c15.jpg)

Ticket can be purchased or cancelled for a particular passenger that is created earlier by mentioning his/her id , and seat number and seat number allocated to him. Ticket price will vary depending upon the nature of ticket that is booked at the time of booking

For example VIP tickets can only be purchased by business class. Please add some discount ratio as well for different categories of class. So that business class ticket will be most expensive one, then economy class and least expensive ticket will be for family class

![](media/c9cccf2a9c15fee5e6e51a48caf785ee.jpg)

![](media/e068934fc613ab6fccf80bfd012a1fa3.jpg)

To handle an invalid entry, pop up message need to be displayed

![](media/77732407525008803d347380a27df1a9.jpg)
