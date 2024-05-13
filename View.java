import javax.swing.*;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.ActionListener;

public class View extends JFrame {

    DefaultListModel passengerListModel = new DefaultListModel();
    DefaultListModel planeListModel = new DefaultListModel();
    DefaultListModel hangarListModel = new DefaultListModel();
    DefaultListModel runwayListModel = new DefaultListModel();
    DefaultListModel flightListModel = new DefaultListModel();
    DefaultListModel ticketListModel = new DefaultListModel();
    JFrame frame = new JFrame("Demo Airport");
    JTabbedPane TabbedPane = new JTabbedPane ();
    JPanel PassengerManagementPanel = new JPanel(new GridLayout(4,1));
    JPanel AllPassengersPanel = new JPanel();
    JList passengerListArea = new JList(passengerListModel);
    JScrollPane passengerScrollPane = new JScrollPane();


    JPanel userPanel = new JPanel(new GridLayout(2,5));
    JTextField nameField = new JTextField();
    JTextField surnameField = new JTextField();
    JComboBox passengerTypeBox = new JComboBox();
    JTextField luggageCountField = new JTextField();
    JTextField yearField = new JTextField();
    JPanel buttonPanel = new JPanel();
    JButton addUserButton = new JButton("Add User");
    JButton removeUserButton = new JButton("Remove User");
    JButton updateUserButton = new JButton("Update User");
    JPanel PlaneManagementPanel = new JPanel(new GridLayout(3,1));
    JList planeArea = new JList(planeListModel);
    JPanel planeSettingsPanel = new JPanel();
    JTextField planeCodeField = new JTextField();
    JButton addPlaneButton = new JButton("Add Plane");
    JLabel capacityLabel = new JLabel("Capacity:");
    JSpinner capacitySpinner = new JSpinner();
    JButton removePlaneButton = new JButton("Remove Plane");
    JPanel airportPanel = new JPanel(new GridLayout(4,3));
    JTextField hangarCodeField = new JTextField();
    JButton addHangarButton = new JButton("Add Hangar");
    JButton removeHangarButton = new JButton("Remove Hanger");
    JTextField runwayCodeField = new JTextField();
    JButton addRunwayButton = new JButton("Add Runway");
    JButton removeRunwayButton = new JButton("Remove Runway");
    JButton reserveHangarButton = new JButton("Reserve Hangar");
    JButton resetHangarButton = new JButton("Reset Hangar");
    JList hangarArea = new JList(hangarListModel);
    JScrollPane hangarScrollPane = new JScrollPane();
    JList runwayArea = new JList(runwayListModel);
    JScrollPane runwayScrollPane = new JScrollPane();
    JButton reserveRunwayButton = new JButton("Reserve Runway");
    JButton resetRunwayButton = new JButton("Reset Runway");


    JPanel FlightManagementPanel = new JPanel();
    JPanel flightPanel1 = new JPanel(new GridLayout(2,1));
    JPanel generateFlightPanel = new JPanel(new GridLayout(3,4));
    JLabel departureLabel = new JLabel("Departure");
    JLabel landingLabel = new JLabel("Landing");

    JLabel departureDateLabel = new JLabel("Departure Date");

    JLabel returnDateLabel = new JLabel("ReturnDate");

    JTextField departureField = new JTextField();
    JTextField landingField = new JTextField();
    JTextField departureDateField = new JTextField();
    JTextField returnDateField = new JTextField();
    JButton addFlightButton = new JButton("Add Flight");
    JButton removeFlightButton = new JButton("Remove Flight");
    JPanel currentFlightsPanel = new JPanel(new BorderLayout());
    JList currentFlightsArea = new JList(flightListModel);
    JScrollPane flightsScrollPane = new JScrollPane();
    JPanel manageTicketPanel = new JPanel(new GridLayout(2,1));
    JList ticketsArea = new JList(ticketListModel);
    JScrollPane ticketsScrollPane = new JScrollPane();
    JPanel ticketSettingsPanel = new JPanel(new GridLayout(3,2));
    JTextField ticketPriceField = new JTextField();
    JTextField passengerIDField = new JTextField();
    JButton buyTicketButton = new JButton("Buy Ticket");
    JButton cancelTicketButton = new JButton("cancelTicket");



    public View (){
        setupFrame();
    }

    public void addActionListener(ActionListener actionListener){
        addUserButton.addActionListener(actionListener);
        removeUserButton.addActionListener(actionListener);
        updateUserButton.addActionListener(actionListener);
        addPlaneButton.addActionListener(actionListener);
        removePlaneButton.addActionListener(actionListener);
        addHangarButton.addActionListener(actionListener);
        removeHangarButton.addActionListener(actionListener);
        addRunwayButton.addActionListener(actionListener);
        removeRunwayButton.addActionListener(actionListener);
        reserveHangarButton.addActionListener(actionListener);
        resetHangarButton.addActionListener(actionListener);
        reserveRunwayButton.addActionListener(actionListener);
        resetRunwayButton.addActionListener(actionListener);
        addFlightButton.addActionListener(actionListener);
        removeFlightButton.addActionListener(actionListener);
        buyTicketButton.addActionListener(actionListener);
        cancelTicketButton.addActionListener(actionListener);
    }

    public void addListSelectionListener(ListSelectionListener listSelectionListener){
        passengerListArea.addListSelectionListener(listSelectionListener);
        planeArea.addListSelectionListener(listSelectionListener);
        currentFlightsArea.addListSelectionListener(listSelectionListener);
        ticketsArea.addListSelectionListener(listSelectionListener);
    }


    private void setupFrame(){
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(900,600);
        TabbedPane.setFocusable(false);
        frame.add(TabbedPane);
        setupPassengerManagementSystem();
        setupPlaneManagementSystem();
        setupFlightManagementSystem();


        frame.setVisible(true);
    }

    private void setupPassengerManagementSystem() {
        AllPassengersPanel.setBorder(BorderFactory.createTitledBorder("All Passengers"));
        PassengerManagementPanel.add(AllPassengersPanel);


        passengerScrollPane.setViewportView(passengerListArea);
        passengerListArea.setLayoutOrientation(JList.VERTICAL);
        AllPassengersPanel.add(passengerScrollPane);

        userPanel.add(new JLabel("Name"));
        userPanel.add(new JLabel("Surname"));
        userPanel.add(new JLabel("Passenger Type"));
        userPanel.add(new JLabel("Luggage Count"));
        userPanel.add(new JLabel("Year of birth"));
        userPanel.add(nameField);
        userPanel.add(surnameField);
        passengerTypeBox.addItem(new String("Business"));
        passengerTypeBox.addItem(new String("Family"));
        passengerTypeBox.addItem(new String("Economy"));
        userPanel.add(passengerTypeBox);
        userPanel.add(luggageCountField);
        userPanel.add(yearField);
        userPanel.setBorder(BorderFactory.createTitledBorder("Create a new user"));
        PassengerManagementPanel.add(userPanel);
        buttonPanel.add(addUserButton);
        buttonPanel.add(removeUserButton);
        buttonPanel.add(updateUserButton);
        PassengerManagementPanel.add(buttonPanel);

        TabbedPane.add("Passenger Management System", PassengerManagementPanel);
    }


    private void setupPlaneManagementSystem() {
        PlaneManagementPanel.add(planeArea);
        PlaneManagementPanel.add(planeSettingsPanel);
        planeSettingsPanel.add(planeCodeField);
        planeCodeField.setText("TK123456");
        planeSettingsPanel.add(capacityLabel);
        planeSettingsPanel.add(capacitySpinner);
        planeSettingsPanel.add(addPlaneButton);
        planeSettingsPanel.add(removePlaneButton);

        airportPanel.setBorder(BorderFactory.createTitledBorder("Airport"));
        PlaneManagementPanel.add(airportPanel);
        airportPanel.add(addHangarButton);
        airportPanel.add(removeHangarButton);
        airportPanel.add(hangarCodeField);
        airportPanel.add(addRunwayButton);
        airportPanel.add(removeRunwayButton);
        airportPanel.add(runwayCodeField);
        airportPanel.add(reserveHangarButton);
        airportPanel.add(resetHangarButton);
        hangarScrollPane.setViewportView(hangarArea);
        hangarArea.setLayoutOrientation(JList.VERTICAL);
        airportPanel.add(hangarScrollPane);
        airportPanel.add(reserveRunwayButton);
        airportPanel.add(resetRunwayButton);
        runwayScrollPane.setViewportView(runwayArea);
        runwayArea.setLayoutOrientation(JList.VERTICAL);
        airportPanel.add(runwayScrollPane);



        TabbedPane.add("Plane Management System", PlaneManagementPanel);

    }

    private void setupFlightManagementSystem() {
        FlightManagementPanel.add(flightPanel1);
        flightPanel1.add(generateFlightPanel);
        generateFlightPanel.setBorder(BorderFactory.createTitledBorder("Generate Flight"));
        generateFlightPanel.add(departureLabel);
        generateFlightPanel.add(landingLabel);
        generateFlightPanel.add(departureDateLabel);
        generateFlightPanel.add(returnDateLabel);
        generateFlightPanel.add(departureField);
        generateFlightPanel.add(landingField);
        departureDateField.setText("DD/MM/YYYY");
        generateFlightPanel.add(departureDateField);
        returnDateField.setText("DD/MM/YYYY");
        generateFlightPanel.add(returnDateField);
        generateFlightPanel.add(addFlightButton);
        generateFlightPanel.add(removeFlightButton);
        flightPanel1.add(currentFlightsPanel);
        currentFlightsPanel.setBorder(BorderFactory.createTitledBorder("Current Flights"));
        flightsScrollPane.setViewportView(currentFlightsArea);
        currentFlightsArea.setLayoutOrientation(JList.VERTICAL);
        currentFlightsPanel.add(flightsScrollPane,BorderLayout.CENTER);

        FlightManagementPanel.add(manageTicketPanel);
        manageTicketPanel.setBorder(BorderFactory.createTitledBorder("Manage Tickets"));
        ticketsScrollPane.setViewportView(ticketsArea);
        ticketsArea.setLayoutOrientation(JList.VERTICAL);
        manageTicketPanel.add(ticketsScrollPane);
        manageTicketPanel.add(ticketSettingsPanel);
        ticketSettingsPanel.add(new JLabel("Passenger ID"));
        ticketSettingsPanel.add(passengerIDField);
        ticketSettingsPanel.add(new JLabel("Ticket Price:"));
        ticketSettingsPanel.add(ticketPriceField);
        ticketPriceField.setEditable(false);
        ticketSettingsPanel.add(buyTicketButton);
        ticketSettingsPanel.add(cancelTicketButton);

        TabbedPane.add("Flight Management System", FlightManagementPanel);

    }




}
