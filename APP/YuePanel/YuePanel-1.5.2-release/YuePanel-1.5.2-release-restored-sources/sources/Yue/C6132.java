package Yue;

/* JADX INFO: renamed from: Yue.ۥۡ۠ۤۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C6132 {
    /* JADX INFO: renamed from: ۥ */
    public static int m2627(int i, int i2) {
        int i3 = i + i2;
        if ((i >= 0) == (i2 >= 0)) {
            if ((i >= 0) != (i3 >= 0)) {
                throw new ArithmeticException("integer overflow");
            }
        }
        return i3;
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public static long m2628(long j, long j2) {
        long j3 = j + j2;
        if ((j >= 0) == (j2 >= 0)) {
            if ((j >= 0) != (j3 >= 0)) {
                throw new ArithmeticException("integer overflow");
            }
        }
        return j3;
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static double m18836(double d, double d2, double d3) {
        return d < d2 ? d2 : d > d3 ? d3 : d;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static float m18837(float f, float f2, float f3) {
        return f < f2 ? f2 : f > f3 ? f3 : f;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static int m18838(int i, int i2, int i3) {
        return i < i2 ? i2 : i > i3 ? i3 : i;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static long m18839(long j, long j2, long j3) {
        return j < j2 ? j2 : j > j3 ? j3 : j;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static int m18840(int i) {
        if (i != Integer.MIN_VALUE) {
            return i - 1;
        }
        throw new ArithmeticException("integer overflow");
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static long m18841(long j) {
        if (j != Long.MIN_VALUE) {
            return j - 1;
        }
        throw new ArithmeticException("integer overflow");
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static int m18842(int i) {
        if (i != Integer.MAX_VALUE) {
            return i + 1;
        }
        throw new ArithmeticException("integer overflow");
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static long m18843(long j) {
        if (j != Long.MAX_VALUE) {
            return j + 1;
        }
        throw new ArithmeticException("integer overflow");
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static int m18844(int i, int i2) {
        int i3 = i * i2;
        if (i == 0 || i2 == 0 || (i3 / i == i2 && i3 / i2 == i)) {
            return i3;
        }
        throw new ArithmeticException("integer overflow");
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static long m18845(long j, long j2) {
        long j3 = j * j2;
        if (j == 0 || j2 == 0 || (j3 / j == j2 && j3 / j2 == j)) {
            return j3;
        }
        throw new ArithmeticException("integer overflow");
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static int m18846(int i) {
        if (i != Integer.MIN_VALUE) {
            return -i;
        }
        throw new ArithmeticException("integer overflow");
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static long m18847(long j) {
        if (j != Long.MIN_VALUE) {
            return -j;
        }
        throw new ArithmeticException("integer overflow");
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static int m18848(int i, int i2) {
        int i3 = i - i2;
        if ((i < 0) != (i2 < 0)) {
            if ((i < 0) != (i3 < 0)) {
                throw new ArithmeticException("integer overflow");
            }
        }
        return i3;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static long m18849(long j, long j2) {
        long j3 = j - j2;
        if ((j < 0) != (j2 < 0)) {
            if ((j < 0) != (j3 < 0)) {
                throw new ArithmeticException("integer overflow");
            }
        }
        return j3;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static int m18850(long j) {
        if (j > 2147483647L || j < -2147483648L) {
            throw new ArithmeticException("integer overflow");
        }
        return (int) j;
    }
}
