public abstract class Beverages {
    protected boolean wantsExtras;

    public void boilWater() {
        System.out.println("Boiling water...");
    }

    public void pourInCup() {
        System.out.println("Pouring in cup...");
    }

    public abstract void brew();

    public abstract void addCondiments();

    public abstract void addExtras();

    public void finalTemplateMethod() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
        if (wantsExtras) {
            addExtras();
        }
    }

    public void setWantsExtras(boolean wantsExtras) {
        this.wantsExtras = wantsExtras;
    }
}