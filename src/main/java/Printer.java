public class Printer {

    private int paper_left;
    private int toner;

    public Printer(int paper_left){
        this.paper_left = paper_left;
        this.toner = 100;
    }

    public int getPaper() {
        return this.paper_left;
    }

    public int getToner() {
        return this.toner;
    }

    public void setPaper(int sheets) {
        this.paper_left += sheets;
    }

    public void print(int i, int i1) {
        if ((this.paper_left - (i * i1)) >= 0 && (this.toner - (i * i1)) >= 0) {
            this.paper_left -= (i * i1);
            this.toner -= (i * i1);
        } else if ((this.paper_left - (i * i1)) >= 0) {
            System.out.println("Please add some toner to the printer!");
        } else {
            System.out.println("Please add some paper to the printer!");
        }
    }


}