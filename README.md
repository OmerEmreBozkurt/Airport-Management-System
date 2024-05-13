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

![image](https://github.com/OmerEmreBozkurt/Airport-Management-System/assets/94068773/1852e6e8-100c-4ada-a11c-4b8ee8a33659)


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

![image](https://github.com/OmerEmreBozkurt/Airport-Management-System/assets/94068773/d46f8db2-5289-4979-ab9f-a0f3914d256a)

**Step 2**: For the Passenger management system, the following functionalities need to be achieved in this gui pattern.

-   User can be able to **add** passenger details by entering his/her first name, last name, date of birth and luggage details.
    -   User can be able to select **Passenger type** i-e Business class, Economy class and Family class.
    -   User can be able to delete or **remove** passengers info
    -   User can be able to **update** passenger details as well

For example, to add the passenger details, we need to enter Name, Surname, passenger type, luggage count and date of birth

![image](https://github.com/OmerEmreBozkurt/Airport-Management-System/assets/94068773/8c3a2bb4-3ab2-4f00-814b-372c4e2e2ff7)

To remove a particular user, we can remove the passenger by specifying the attribute and that particular passenger will be removed.

![image](https://github.com/OmerEmreBozkurt/Airport-Management-System/assets/94068773/3c0b7bb7-7a04-415c-a702-25945aeb1346)

To update a user i-e to change the information of passenger.

![image](https://github.com/OmerEmreBozkurt/Airport-Management-System/assets/94068773/3d387fea-6529-46ca-8041-521d559c715d)

If any invalid entry is entered it should pop a window error message (Exception error handling)

![image](https://github.com/OmerEmreBozkurt/Airport-Management-System/assets/94068773/18792711-4d7f-480c-a23e-b3d280613462)

Step 3: For the Plane management system, the following functionalities need to be achieved in this gui pattern.

-   User can be able to **add** plane details
    -   User can be able to **delete** or **remove** plane details
    -   User can be able to **add and remove** hangers details
    -   User can be able to **reserve and reset** hangers for any plane added
    -   User can be able to **add and remove** runways details
    -   User can be able to **reserve and reset** runways for any plane added

For example, to add the plane, we need to enter its plane details

![image](https://github.com/OmerEmreBozkurt/Airport-Management-System/assets/94068773/9c21b212-f1d3-4c82-9631-30620f495f12)

A particular plane details can be deleted as well

![image](https://github.com/OmerEmreBozkurt/Airport-Management-System/assets/94068773/dc841db4-ad8b-4781-bade-6a8b9a89c679)

Similarly to add the hanger and runway we need to mention its airport id and we can remove the hanger and runway as well

![image](https://github.com/OmerEmreBozkurt/Airport-Management-System/assets/94068773/90b2f34c-2c0e-40dd-ae42-815fd3ed1978)

We can reserve the hanger and runway for the particular plane that is added previously

![image](https://github.com/OmerEmreBozkurt/Airport-Management-System/assets/94068773/12c5fad9-2091-48a1-abed-ccc20c617a16)

![image](https://github.com/OmerEmreBozkurt/Airport-Management-System/assets/94068773/98e159dc-a272-4e72-b54c-0bbd52d3b666)

Similarly we can reset the hanger and runway if it is not being used by any plane

![image](https://github.com/OmerEmreBozkurt/Airport-Management-System/assets/94068773/aebd5b48-5814-4adf-bbc5-353f4a2472c7)

For an invalid entries , error must be pop up as well

![image](https://github.com/OmerEmreBozkurt/Airport-Management-System/assets/94068773/43380f6a-ee17-487f-b0bb-875a755e6f0e)

Step 4: For the Flight management system, the following functionalities need to be achieved in this gui pattern.

-   User can be able to **generate** flight details by entering departure and landing location information, departure and return date, and capacity information of the plane.
-   User can be able to **add or remove** flights.
-   User can be able to manage tickets by i-e buying a ticket for a particular passenger that is created earlier. Users can allocate a seat number as well.
-   User can cancel a ticket for particular passenger as well.

    ![image](https://github.com/OmerEmreBozkurt/Airport-Management-System/assets/94068773/8fda232b-3452-447d-9eb2-12ac3fe2b52e)


For example, to add a flight, we need to enter its departure and landing location, departure and return date

![image](https://github.com/OmerEmreBozkurt/Airport-Management-System/assets/94068773/d2608c47-b972-4515-8caa-7e865328f725)

A flight can be removed as well by selecting a particular flight that is added earlier

![image](https://github.com/OmerEmreBozkurt/Airport-Management-System/assets/94068773/75ea83ad-8cc0-4c64-8f78-4691efd73b4a)

Ticket can be purchased or cancelled for a particular passenger that is created earlier by mentioning his/her id , and seat number and seat number allocated to him. Ticket price will vary depending upon the nature of ticket that is booked at the time of booking

For example VIP tickets can only be purchased by business class. Please add some discount ratio as well for different categories of class. So that business class ticket will be most expensive one, then economy class and least expensive ticket will be for family class

![image](https://github.com/OmerEmreBozkurt/Airport-Management-System/assets/94068773/1d8ca319-50ad-40b9-9ceb-df4ae240d8ad)
![image](https://github.com/OmerEmreBozkurt/Airport-Management-System/assets/94068773/d4f4c1e9-a7eb-478a-933d-9ad4de415e06)


To handle an invalid entry, pop up message need to be displayed

![image](https://github.com/OmerEmreBozkurt/Airport-Management-System/assets/94068773/fe49d3df-a571-4756-b1d1-48cb251d83a3)

