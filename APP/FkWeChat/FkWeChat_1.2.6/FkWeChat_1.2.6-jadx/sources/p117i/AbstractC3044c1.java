package p117i;

/* JADX INFO: renamed from: i.c1 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3044c1 {

    /* JADX INFO: renamed from: a */
    public static final long[] f8088a = {-9187201950435737345L, -1};

    /* JADX INFO: renamed from: b */
    public static final C3082r0 f8089b = new C3082r0(0);

    /* JADX INFO: renamed from: a */
    public static final int m11261a(int i10) {
        if (i10 == 7) {
            return 6;
        }
        return i10 - (i10 / 8);
    }

    /* JADX INFO: renamed from: b */
    public static final C3082r0 m11262b() {
        return new C3082r0(0, 1, null);
    }

    /* JADX INFO: renamed from: c */
    public static final int m11263c(int i10) {
        if (i10 == 0) {
            return 6;
        }
        return (i10 * 2) + 1;
    }

    /* JADX INFO: renamed from: d */
    public static final int m11264d(int i10) {
        if (i10 > 0) {
            return (-1) >>> Integer.numberOfLeadingZeros(i10);
        }
        return 0;
    }

    /* JADX INFO: renamed from: e */
    public static final int m11265e(int i10) {
        if (i10 == 7) {
            return 8;
        }
        return i10 + ((i10 - 1) / 7);
    }
}
