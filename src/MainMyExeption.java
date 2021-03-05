public class MainMyExeption extends Exception {
    private String detail;

    MainMyExeption(String detail) {
        this.detail = detail;
    }

    @Override
    public String toString() {
        return  this.getClass().getSimpleName() + "{" +
                "detail=" + detail +
                '}';
    }
}
