public interface CheckTransport {
    default public void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    default public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    default public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }


}
