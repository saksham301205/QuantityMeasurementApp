public class QuantityMeasurementApp {

    static class Feet {
        private final double value;

        public Feet(double value) {
            this.value = value;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;

            Feet feet = (Feet) obj;
            return Double.compare(feet.value, this.value) == 0;
        }
    }

    static class Inches {
        private final double value;

        public Inches(double value) {
            this.value = value;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;

            Inches inches = (Inches) obj;
            return Double.compare(inches.value, this.value) == 0;
        }
    }

    public static void main(String[] args) {

        // Feet check
        Feet f1 = new Feet(1.0);
        Feet f2 = new Feet(1.0);
        System.out.println("Feet equal: " + f1.equals(f2));

        // Inches check
        Inches i1 = new Inches(1.0);
        Inches i2 = new Inches(1.0);
        System.out.println("Inches equal: " + i1.equals(i2));
    }
}