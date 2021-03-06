public class Coronavirus {

    private float infeccio;

    private float mortaldat;

    Coronavirus() {
        infeccio = 0;
        mortaldat = 0;
    }

    //contructor copiador
    Coronavirus(Coronavirus c) {
        infeccio = c.infeccio;
        mortaldat = c.mortaldat;
    }

    Coronavirus(float x, float y) {
        infeccio = x;
        mortaldat = y;
    }

    public float getInfeccio() {
        return infeccio;
    }

    public void setInfeccio(float infeccio) {
        this.infeccio = infeccio;
    }

    public float getMortaldat() {
        return mortaldat;
    }

    public void setMortaldat(float mortaldat) {
        this.mortaldat = mortaldat;
    }

    @Override
    public String toString() {
        return "Coronavirus{" + "infeccio=" + infeccio + ", mortaldat=" + mortaldat + '}';
    }


}
