package Week4.soal1;

public class Commision extends Hourly{
    double totalSales;
    double commisionRate;

    public Commision(String eName, String eAddress, String ePhone, String socSecNumber, double rate, double commisionRate){
        super(eName, eAddress, ePhone, socSecNumber, rate);

    }

    public void addSales(double totalSales){
        this.totalSales += totalSales;
    }

    public double pay(){
        double payment = super.pay() + (totalSales * commisionRate);
        totalSales = 0;
        return payment;
    }

    public String toString(){
        String result = super.toString();
        result += "\nTotal Sales: " + totalSales;
        return result;
    }
}

/*
The pay method must call the pay method of the parent class to compute the pay for hours worked then add to that the
pay from commission on sales. (See the pay method in the Executive class.) The total sales should be set back to 0 (note:
you don't need to set the hoursWorked back to 0—why not?).
The toString method needs to call the toString method of the parent class then add the total sales to that.
*/