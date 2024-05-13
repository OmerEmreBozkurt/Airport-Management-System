import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.util.Objects;

public class ListController implements ListSelectionListener {
    private Model model;
    private View view;


    public ListController(Model model, View view) {
        this.model = model;
        this.view = view;
        view.addListSelectionListener(this);
    }


    @Override
    public void valueChanged(ListSelectionEvent event) {
        if (event.getSource() == view.passengerListArea) {
               Passenger p = (Passenger) view.passengerListArea.getSelectedValue();
               if (view.passengerListArea.getSelectedValue()!=null){
               view.nameField.setText(p.getName());
               view.surnameField.setText(p.getSurname());
               view.passengerTypeBox.setSelectedItem(p.getPassengerType());
               view.luggageCountField.setText(String.valueOf(p.getLuggageCount()));
               view.yearField.setText(String.valueOf(p.getYearOfBirth()));
               }
        }
        if (event.getSource() == view.planeArea){
            Plane p = (Plane) view.planeArea.getSelectedValue();
            if (view.planeArea.getSelectedValue()!=null){
            view.planeCodeField.setText(p.getPlaneId());
            view.capacitySpinner.setValue(p.getCapacity());}
        }
        if (event.getSource() == view.currentFlightsArea){
            if (view.currentFlightsArea.getSelectedValue()!=null){
                setTicketList((Flight) view.currentFlightsArea.getSelectedValue());
            }
        }

        if (event.getSource() == view.ticketsArea){
           try{ if (view.ticketsArea.getSelectedValue()!=null && !Objects.equals(view.passengerIDField.getText(), "")){
                int passengerIndex = Integer.parseInt(view.passengerIDField.getText()) - 1;
                    view.ticketPriceField.setText(String.valueOf(((Ticket) view.ticketsArea.getSelectedValue()).showPrice(model.passengerArrayList.get(passengerIndex))));

            }} catch (IndexOutOfBoundsException | NumberFormatException e) {
               JOptionPane.showMessageDialog(view.frame,"Please give a valid Passenger ID");
           }
        }

    }

    private void setTicketList(Flight flight){
        view.ticketListModel.removeAllElements();
        for (Ticket element : flight.getTicketArrayList()) {
            view.ticketListModel.addElement(element);
        }
    }
}
