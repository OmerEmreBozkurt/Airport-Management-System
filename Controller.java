import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.IllegalFormatException;
import java.util.Objects;

public class Controller implements ActionListener {
    private Model model;
    private View view;


    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
        view.addActionListener(this);
    }

    public void actionPerformed(ActionEvent event) {


        if (event.getSource() == view.addUserButton) {
            if (!Objects.equals(view.nameField.getText(), "") && !Objects.equals(view.surnameField.getText(), "")){
                try {
                Passenger passenger = new Passenger(view.nameField.getText(), view.surnameField.getText(), String.valueOf(view.passengerTypeBox.getSelectedItem()), Integer.parseInt(view.luggageCountField.getText()), Integer.parseInt(view.yearField.getText()));
                passenger.setId(model.passengerArrayList.size() + 1);
                model.passengerArrayList.add(passenger);
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(view.frame, "Luggage count and Year must be an integer");
                }
            } else {JOptionPane.showMessageDialog(view.frame,"Please fill in the blanks");}
                refreshPassengerListModel();
        }

        if (event.getSource() == view.removeUserButton) {
            if (view.passengerListArea.getSelectedValue()!=null){
                for (int i = view.passengerListArea.getSelectedIndex(); i < model.passengerArrayList.size(); i++) {
                    model.passengerArrayList.get(i).setId(i);
                }
                model.passengerArrayList.remove(view.passengerListArea.getSelectedValue());
            } else {JOptionPane.showMessageDialog(view.frame,"Please select a Passenger");}

            view.passengerListArea.clearSelection();
            refreshPassengerListModel();
        }

        if (event.getSource() == view.addPlaneButton){
            if  ((Integer) view.capacitySpinner.getValue() > 0) {
                Plane plane = new Plane(view.planeCodeField.getText(), (Integer) view.capacitySpinner.getValue());
                model.planeArrayList.add(plane);
            } else {
                JOptionPane.showMessageDialog(view.frame,"Capacity should be greater than 0");
            }
            refreshPlaneListModel();
        }

        if (event.getSource() == view.removePlaneButton){
            if (view.planeArea.getSelectedValue()!=null){
                model.planeArrayList.remove(view.planeArea.getSelectedValue());
            } else {JOptionPane.showMessageDialog(view.frame,"Please select a Plane");}
            view.planeArea.clearSelection();
            refreshPlaneListModel();
        }

        if (event.getSource() == view.updateUserButton) {
            Passenger p = (Passenger) view.passengerListArea.getSelectedValue();
            if (p!=null){
                p.setName(view.nameField.getText());
                p.setSurname(view.surnameField.getText());
                p.setPassengerType(String.valueOf(view.passengerTypeBox.getSelectedItem()));
                p.setLuggageCount(Integer.parseInt(view.luggageCountField.getText()));
                p.setYearOfBirth(Integer.parseInt(view.yearField.getText()));
            } else {JOptionPane.showMessageDialog(view.frame,"Please select a Passenger");}
            refreshPassengerListModel();
        }

        if (event.getSource() == view.addHangarButton) {
            if (!Objects.equals(view.hangarCodeField.getText(), "")){
                Hangar hangar = new Hangar(view.hangarCodeField.getText());
                model.hangarArrayList.add(hangar);}
            else {JOptionPane.showMessageDialog(view.frame,"Please give a name to Hangar");}
            refreshHangarListModel();
        }

        if (event.getSource() == view.addRunwayButton) {
            if (!Objects.equals(view.runwayCodeField.getText(), "")){
                Runway runway = new Runway(view.runwayCodeField.getText());
                model.runwayArrayList.add(runway);}
            else {JOptionPane.showMessageDialog(view.frame,"Please give a name to Runway");}
            refreshRunwayListModel();
        }

        if (event.getSource() == view.removeHangarButton){
            if (view.hangarArea.getSelectedValue() != null) {
                if (((Hangar) view.hangarArea.getSelectedValue()).getReservedPlane() != null){((Hangar) view.hangarArea.getSelectedValue()).getReservedPlane().setInHangar(false);}
                model.hangarArrayList.remove(view.hangarArea.getSelectedValue());}
            else {JOptionPane.showMessageDialog(view.frame,"Please select a Hangar");}
            view.hangarArea.clearSelection();
            refreshHangarListModel();
        }

        if (event.getSource() == view.removeRunwayButton){
            if (view.runwayArea.getSelectedValue() != null) {
                if (((Runway) view.runwayArea.getSelectedValue()).getReservedPlane() != null){((Runway) view.runwayArea.getSelectedValue()).getReservedPlane().setInRunway(false);}
                model.runwayArrayList.remove(view.runwayArea.getSelectedValue());}
            else {JOptionPane.showMessageDialog(view.frame,"Please select a Runway");}
            view.runwayArea.clearSelection();
            refreshRunwayListModel();
        }

        if (event.getSource() == view.reserveHangarButton){
            if (view.hangarArea.getSelectedValue() != null && ((Hangar) view.hangarArea.getSelectedValue()).getReservedPlane() == null && view.planeArea.getSelectedValue() != null && !(((Plane) view.planeArea.getSelectedValue()).isInHangar())) {
                ((Hangar) view.hangarArea.getSelectedValue()).reserveHangar((Plane) view.planeArea.getSelectedValue());
            } else {
                JOptionPane.showMessageDialog(view.frame,"Please select an available Hangar and a Plane");
            }
            refreshHangarListModel();
        }

        if (event.getSource() == view.reserveRunwayButton){
            if (view.runwayArea.getSelectedValue() != null && ((Runway) view.runwayArea.getSelectedValue()).getReservedPlane() == null && view.planeArea.getSelectedValue() != null && !(((Plane) view.planeArea.getSelectedValue()).isInRunway())) {
                ((Runway) view.runwayArea.getSelectedValue()).reserveRunway((Plane) view.planeArea.getSelectedValue());
            } else {
                JOptionPane.showMessageDialog(view.frame,"Please select a Runway and a available Plane");
            }
            refreshRunwayListModel();
        }

        if (event.getSource() == view.resetHangarButton){
            try {
                if (view.hangarArea.getSelectedValue() != null && ((Hangar) view.hangarArea.getSelectedValue()).getReservedPlane() != null) {
                    ((Hangar) view.hangarArea.getSelectedValue()).resetHangar();
                } else {
                    JOptionPane.showMessageDialog(view.frame, "Please select a reserved Hangar");
                }
            } catch (NullPointerException e) {
                ((Hangar) view.hangarArea.getSelectedValue()).resetHangar();
            }
            refreshHangarListModel();
        }

        if (event.getSource() == view.resetRunwayButton){
            try {
                if (view.runwayArea.getSelectedValue() != null && ((Runway) view.runwayArea.getSelectedValue()).getReservedPlane() != null) {
                    ((Runway) view.runwayArea.getSelectedValue()).resetRunway();
                } else {
                    JOptionPane.showMessageDialog(view.frame, "Please select a reserved Runway");
                }
            } catch (NullPointerException e) {
                ((Runway) view.runwayArea.getSelectedValue()).resetRunway();
            }
            refreshRunwayListModel();
        }

        if (event.getSource() == view.addFlightButton){
            try {
                SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy");
                if (view.planeArea.getSelectedValue() != null && !Objects.equals(view.departureField.getText(), "") && !Objects.equals(view.landingField.getText(), "") && !Objects.equals(view.departureDateField.getText(), "")) {
                    if (Objects.equals(view.returnDateField.getText(), "")) {
                        Flight flight = new Flight(view.departureField.getText(), view.landingField.getText(), date.parse(view.departureDateField.getText()), (Plane) view.planeArea.getSelectedValue());
                        model.flightArrayList.add(flight);
                    } else {
                        Flight flight = new Flight(view.departureField.getText(), view.landingField.getText(), date.parse(view.departureDateField.getText()), (Plane) view.planeArea.getSelectedValue());
                        model.flightArrayList.add(flight);
                        Flight flight2 = new Flight(view.landingField.getText(), view.departureField.getText(), date.parse(view.returnDateField.getText()), (Plane) view.planeArea.getSelectedValue());
                        model.flightArrayList.add(flight2);
                    }
                    refreshFlightListModel();
                } else {
                    JOptionPane.showMessageDialog(view.frame, "Please provide valid values and select a Plane");
                }
            } catch (ParseException e) {JOptionPane.showMessageDialog(view.frame,"Please provide valid dates");}
        }

        if (event.getSource() == view.removeFlightButton){
            if  (view.currentFlightsArea.getSelectedValue() != null){model.flightArrayList.remove(view.currentFlightsArea.getSelectedValue());}
            else {JOptionPane.showMessageDialog(view.frame,"Please select a Flight");}
            view.currentFlightsArea.clearSelection();
            refreshFlightListModel();
        }

        if (event.getSource() == view.buyTicketButton){

            try {
                if (((Ticket) view.ticketsArea.getSelectedValue()).isVIP() && !Objects.equals(((Passenger) model.passengerArrayList.get(Integer.parseInt(view.passengerIDField.getText()) - 1)).getPassengerType(), "Business")) {
                    JOptionPane.showMessageDialog(view.frame, "Only Business Passengers can buy a VIP Ticket");
                } else {
                    if (view.ticketsArea.getSelectedValue() != null) {
                        ((Ticket) view.ticketsArea.getSelectedValue()).setPassenger(model.passengerArrayList.get(Integer.parseInt(view.passengerIDField.getText()) - 1));
                        refreshTicketListModel();
                    } else {
                        JOptionPane.showMessageDialog(view.frame, "Please select a seat");
                    }
                }
            } catch (IndexOutOfBoundsException | NumberFormatException e) {JOptionPane.showMessageDialog(view.frame,"Please provide a valid Passenger ID");
            } catch (NullPointerException e) {JOptionPane.showMessageDialog(view.frame,"Please select a seat");
            }
        }

        if (event.getSource() == view.cancelTicketButton) {
            if (view.ticketsArea.getSelectedValue() != null){
                ((Ticket) view.ticketsArea.getSelectedValue()).setPassenger(null);
                refreshTicketListModel();
            } else {
                JOptionPane.showMessageDialog(view.frame,"Please select a seat");
            }
        }




    }
    private void refreshPassengerListModel() {
        view.passengerListModel.removeAllElements();
        for (Passenger element : model.passengerArrayList) {
            view.passengerListModel.addElement(element);
        }
    }

    private void refreshPlaneListModel() {
        view.planeListModel.removeAllElements();
        for (Plane element : model.planeArrayList) {
            view.planeListModel.addElement(element);
        }
    }

    private void refreshHangarListModel() {
        view.hangarListModel.removeAllElements();
        for (Hangar element : model.hangarArrayList) {
            view.hangarListModel.addElement(element);
        }
    }

    private void refreshRunwayListModel() {
        view.runwayListModel.removeAllElements();
        for (Runway element : model.runwayArrayList) {
            view.runwayListModel.addElement(element);
        }
    }

    private void refreshFlightListModel(){
        view.flightListModel.removeAllElements();
        for (Flight element : model.flightArrayList) {
            view.flightListModel.addElement(element);
        }
    }

    private void refreshTicketListModel(){
        view.ticketListModel.removeAllElements();
        for (Ticket element : ((Flight) view.currentFlightsArea.getSelectedValue()).getTicketArrayList()) {
            view.ticketListModel.addElement(element);
        }
    }


}
