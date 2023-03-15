package VectorPackage;

public class Vector {

    private final double[] data;
    
    // Конструктор
    public Vector(int n) {
        data = new double[n];
    }
    // Получение элемента по индексу
    public double get(int i) {

        return data[i];
    }
    // Установка значения элемента по индексу
    public void set(int i, double value) {
        data[i] = value;
    }
    // Получение размера вектора
    public int size() {

        return data.length;
    }
    // Поиск минимального значения
    public double min() {
        double min = data[0];
        for (int i = 1; i < data.length; ++i) {
            if (data[i] < min) min = data[i];
    }
        return min;
    }
    // Поиск максимального значения
    public double max() {
        double max = data[0];
        for (int i = 1; i < data.length; ++i) {
            if (data[i] > max) max = data[i];
        }
        return max;
    }
    // Сортировка вставками
    public void sort() {
        for (int i = 1; i < data.length; ++i) {
            double itemToInsert = data[i];
            int j = i - 1;
            for (; j >= 0 && data[j] > itemToInsert; --j) {
                data[j + 1] = data[j];
            }
                data[j + 1] = itemToInsert;
            }
        }
        // Нахождение нормы Евклида
        public double normEuclidean() {
            double r = 0;
            for (double x : data) {
                r += x * x;
            }
            return Math.sqrt(r);
        }
        // Умножение вектора на число
        public Vector mul(double number) {
            Vector r = new Vector(data.length);
            for (int i = 0; i < data.length; ++i) {
                r.data[i] = data[i] * number;
            }
            return r;
        }
        // Сложение двух векторов
        public Vector sum(Vector arg) {
            double[] minSizeVec = data, maxSizeVec = arg.data;
            if (minSizeVec.length > maxSizeVec.length) {
                double[] t = minSizeVec;
                minSizeVec = maxSizeVec;
                maxSizeVec = t;
            }
        Vector r = new Vector(maxSizeVec.length);
        for (int i = 0, len = maxSizeVec.length; i < len; ++i) {
            r.data[i] = maxSizeVec[i];
        }
        for (int i = 0, len = minSizeVec.length; i < len; ++i) {
            r.data[i] += minSizeVec[i];
        }
        return r;
        }
        // Скалярное произведение двух векторов
        public double mul(Vector arg) {
            int len = Math.min(data.length, arg.data.length);
            double r = 0;
            for (int i = 0; i < len; ++i) {
                r += data[i] * arg.data[i];
            }
            return r;
        }
        // Вывод вектора на экран
        public void print() {
        if (data.length > 0) {
            System.out.print(data[0]);
        }
        for (int i = 1; i < data.length; ++i) {
            System.out.print(" " + data[i]);
            }
            System.out.println();
    }

   }