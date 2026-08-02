package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ed2 {

    /* JADX INFO: renamed from: a */
    public static final long[] f2401a = {-9187201950435737345L, -1};

    static {
        new rk1(0);
    }

    /* JADX INFO: renamed from: a */
    public static final int m1336a(int i) {
        if (i == 7) {
            return 6;
        }
        return i - (i / 8);
    }

    /* JADX INFO: renamed from: b */
    public static final int m1337b(int i) {
        if (i == 0) {
            return 6;
        }
        return (i * 2) + 1;
    }

    /* JADX INFO: renamed from: c */
    public static final int m1338c(int i) {
        if (i > 0) {
            return (-1) >>> Integer.numberOfLeadingZeros(i);
        }
        return 0;
    }

    /* JADX INFO: renamed from: d */
    public static final int m1339d(int i) {
        if (i == 7) {
            return 8;
        }
        return ((i - 1) / 7) + i;
    }
}
