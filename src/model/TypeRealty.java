package model;

public enum TypeRealty {
    FLAT("Квартира"),
    HOUSE("Дом"),
    OFFICE("Офис");
    private String title;
    private TypeRealty(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Тип недвижимосьти: " + title;
    }
}
