package softwarecommunity.internetsharingapp;

/**
 * Created by sachin on 26/01/18.
 */

public class seller {
    private int DATA_LIMIT;
    private int TIME_LIMIT;
    seller(int d,int t){
    DATA_LIMIT=d;
    TIME_LIMIT=t;
    }
    public String GetDataLimit(){
        return Integer.toString(DATA_LIMIT);
    }
    public String GetTimeLimit(){
        return Integer.toString(TIME_LIMIT);
    }

}