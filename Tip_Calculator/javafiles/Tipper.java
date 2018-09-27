package javafiles;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Scanner;

class Tipper{

    private double bill_amount;

    private float tip_percentage;

    private double tip_dollar_amount;

    private double round_amount;

    private boolean isRoundedUp;

    private double total;

    private boolean cli_or_web; //True is CLI False is Web

    private ArrayList<Character> backlog = new ArrayList<>();

    public Tipper(String mode) {
        if(mode.toLowerCase() == "cli")
            setCli_or_web(true);
        else if(mode.toLowerCase() == "web")
            setCli_or_web(false);
        System.out.println("Tipper Online");
    }

    public double getBill_amount() {
        return bill_amount;
    }

    public void setBill_amount(double bill_amount) {
        this.bill_amount = bill_amount;
    }

    public float getTip_percentage() {
        return tip_percentage;
    }

    public void setTip_percentage(float tip_percentage) {
        this.tip_percentage = (tip_percentage/100);
    }

    public double getTip_dollar_amount() {
        return tip_dollar_amount;
    }

    public void setTip_dollar_amount(double tip_dollar_amount) {
        this.tip_dollar_amount = tip_dollar_amount;
    }

    public double getRound_amount() {
        return round_amount;
    }

    public void setRound_amount(double round_amount) {
        this.round_amount = round_amount;
    }

    public boolean isRoundedUp() {
        return isRoundedUp;
    }

    public void setRoundedUp(boolean roundedUp) {
        isRoundedUp = roundedUp;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public ArrayList<Character> getBacklog() {
        return backlog;
    }

    public void setBacklog(ArrayList<Character> backlog) {
        this.backlog = backlog;
    }

    public void setCli_or_web(boolean cli_or_web) {
        this.cli_or_web = cli_or_web;
    }

    public void calculateBillTotal(){
        double bill = getBill_amount();
        float tip_percent = getTip_percentage();
        bill = bill + (bill*tip_percent);
        setBill_amount(bill);
        return;
    }

    public void calculateTipDollarAmount(){
        double tip_dollar_amount = getTip_percentage()*getBill_amount();
        setTip_dollar_amount(tip_dollar_amount);
        return;
    }

    public void addToBacklog(char addition){
        ArrayList<Character> backlog = getBacklog();
        backlog.add(addition);
        setBacklog(backlog);
        return;
    }

    public void removeFromBacklog(char removal){
        ArrayList<Character> backlog = getBacklog();
        backlog.remove(removal);
        setBacklog(backlog);
        return;
    }

    private static void startup(Tipper tipper){
        Scanner scanner = new Scanner( System.in );
        System.out.println("This is a tip calculator");
        System.out.println("How much was the bill?");
        tipper.setBill_amount(Double.parseDouble(scanner.nextLine()));
        System.out.println("How much are you looking to tip? This should be the percentage number. Ex: '20%' enter 20");
        tipper.setTip_percentage(Integer.parseInt(scanner.nextLine()));
        System.out.println("Do you wish to round your bill up to the nearest dollar amount? Enter (yes/y/no/n");
        String round = scanner.nextLine();
        if(round.equalsIgnoreCase("y") || round.equalsIgnoreCase("yes")){
            tipper.setRoundedUp(true);
        }
        else if(round.equalsIgnoreCase("n") || round.equalsIgnoreCase("no")){
            tipper.setRoundedUp(false);
        }
        tipper.calculateBillTotal();
        tipper.calculateTipDollarAmount();
        String ouput = String.format("%f, %f, %f, %f", tipper.getTotal(), tipper.getTip_percentage(),
                tipper.getTip_dollar_amount(), tipper.getRound_amount());
        System.out.println(ouput);
    }

    public static void main(){
        System.out.println("We are starting now");
        Tipper tip_calculator = new Tipper("cli");
        startup(tip_calculator);
    }

}