public class ZombiePlant {
    private int potencyRequired;
    private int treatmentsNeeded;

    public ZombiePlant(int potencyRequired, int treatmentsNeeded){

        this.potencyRequired = potencyRequired;
        this.treatmentsNeeded = treatmentsNeeded;

    }

    public int getPotencyRequired() {
        return potencyRequired;
    }

    public void setPotencyRequired(int potencyRequired) {
        this.potencyRequired = potencyRequired;
    }

    public int getTreatmentsNeeded() {
        return treatmentsNeeded;
    }

    public void setTreatmentsNeeded(int treatmentsNeeded) {
        this.treatmentsNeeded = treatmentsNeeded;
    }

    public int treatmentsNeeded() {
        return treatmentsNeeded;
    }

    public void treat(int currTreat){
        if(currTreat > potencyRequired)
        {
            treatmentsNeeded = treatmentsNeeded + 1;
        }
        if (currTreat <= potencyRequired && currTreat>0 &&treatmentsNeeded>0)
        {
            treatmentsNeeded = treatmentsNeeded - 1;
        }
    }

    public boolean isDangerous()
    {
        if(treatmentsNeeded > 0)
        {
            return true;
        }
        else {
            return false;
        }
    }

}
