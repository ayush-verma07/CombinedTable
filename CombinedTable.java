public class CombinedTable {

    SingleTable t1;
    SingleTable t2;
    
    public CombinedTable(SingleTable x, SingleTable y)
    {
        t1 = x;
        t2 = y;
    }

    public boolean canSeat(int a) {
        int n1 = t1.getNumSeats();
        int n2 = t2.getNumSeats();
        int c = (n1 + n2) - 2;

        if(c >= a) {return true;}

        else {return false;}
    }

    public double getDesirability() {
        if(t1.getHeight() == t2.getHeight()) {
            return (t1.getViewQuality() + t2.getViewQuality())/2;
        }

        else {
            double b = (t1.getViewQuality() + t2.getViewQuality())/2;
            return b - 10;
        }
    }
}
