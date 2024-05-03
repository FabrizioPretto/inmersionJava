package src.model;

public class Title {
    private String name;
    private int releaseDate;
    private double evaluation;
    private boolean incluidedOnBasicPlan;
    private String sinopsys;
    private int durationTimeInMinutes;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDurationTimeInMinutes() {
        return durationTimeInMinutes;
    }

    public void setDurationTimeInMinutes(int durationTimeInMinutes) {
        this.durationTimeInMinutes = durationTimeInMinutes;
    }

    public double getEvaluation() {
        return evaluation;
    }

    public void setEvaluation(double evaluation) {
        this.evaluation = evaluation;
    }

    public int getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(int releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getSinopsys() {
        return sinopsys;
    }

    public void setSinopsys(String sinopsys) {
        this.sinopsys = sinopsys;
    }

    public boolean getIncluidedOnBasicPlan(){
        return incluidedOnBasicPlan;
    }

    public void setIncluidedOnBasicPlan(boolean incluidedOnBasicPlan){
        this.incluidedOnBasicPlan = incluidedOnBasicPlan;
    }

    


    public void showTechnicFile(){
        System.out.println("\n****FICHA TÉCNICA****");
        System.out.println("Nombre del Título: " + name);
        System.out.println("Fecha de Lanzamiento: " + releaseDate );
        System.out.println("Tiempo de Duración: " + getDurationTimeInMinutes() + " minutos.");
    }
}
