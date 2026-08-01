package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class az {
    public static final m a = null;

    static {
        Integer r0 = lp.a;
        if (r0 != null) goto L5;
    L8:
        m r02 = new rx();
    L9:
        a = r02;
        return;
    L5:
        if (r0.intValue() >= 34) goto L8;
        r02 = new qj();
        goto L9
    }

    public az() {
    }

    public abstract int a(int r1);

    public abstract int b();

    public int c(int r4, int r5) {
        if (r5 <= r4) goto L21;
        int r0 = r5 - r4;
        if (r0 > 0) goto L13;
        if (r0 == Integer.MIN_VALUE) goto L13;
    L8:
        int r02 = b();
        if (r4 > r02) goto L8;
        if (r02 >= r5) goto L8;
        return r02;
    L13:
        if (((-r0) & r0) != r0) goto L15;
        int r52 = a(31 - Integer.numberOfLeadingZeros(r0));
    L19:
        return r4 + r52;
    L15:
        int r53 = b() >>> 1;
        int r1 = r53 % r0;
        if (((r0 - 1) + (r53 - r1)) < 0) goto L15;
        r52 = r1;
        goto L19
    L21:
        throw new IllegalArgumentException(("Random range is empty: [" + Integer.valueOf(r4) + ", " + Integer.valueOf(r5) + ").").toString());
    }
}
