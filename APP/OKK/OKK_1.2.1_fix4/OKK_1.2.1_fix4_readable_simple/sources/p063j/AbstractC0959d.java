package p063j;

/* JADX INFO: renamed from: j.d */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0959d {

    /* JADX INFO: renamed from: a */
    public static final int[] f3402a = null;

    /* JADX INFO: renamed from: b */
    public static final Object[] f3403b = null;

    static {
        f3402a = new int[0];
        f3403b = new Object[0];
    }

    /* JADX INFO: renamed from: a */
    public static int m2304a(int r3, int r4, int[] r5) {
        int r32 = r3 - 1;
        int r02 = 0;
    L3:
        if (r02 > r32) goto L11;
        int r1 = (r02 + r32) >>> 1;
        int r2 = r5[r1];
        if (r2 < r4) goto L6;
        if (r2 <= r4) goto L9;
        r32 = r1 - 1;
        goto L3
    L9:
        return r1;
    L6:
        r02 = r1 + 1;
        goto L3
    L11:
        return ~r02;
    }

    /* JADX INFO: renamed from: b */
    public static int m2305b(long[] r4, int r5, long r6) {
        int r52 = r5 - 1;
        int r02 = 0;
    L3:
        if (r02 > r52) goto L11;
        int r1 = (r02 + r52) >>> 1;
        long r2 = r4[r1];
        if (r2 < r6) goto L6;
        if (r2 <= r6) goto L9;
        r52 = r1 - 1;
        goto L3
    L9:
        return r1;
    L6:
        r02 = r1 + 1;
        goto L3
    L11:
        return ~r02;
    }
}
