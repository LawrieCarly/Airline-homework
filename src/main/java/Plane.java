public enum Plane {

    BOEING747(5, 20),
    PISTON349(300, 1000),
    TURBOPROP(10, 50);

    private final int capacity;
    private final int weight;

    Plane(int capacity, int weight){
        this.capacity = capacity;
        this.weight = weight;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getWeight() {
        return weight;
    }
}
