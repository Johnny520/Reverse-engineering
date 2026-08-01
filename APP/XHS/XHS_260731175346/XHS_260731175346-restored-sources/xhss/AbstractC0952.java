package xhss;

/* JADX INFO: renamed from: xhss.ᲁᛵᛱᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0952 {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public static final /* synthetic */ long f3088 = 0;
    private volatile /* synthetic */ int _size$volatile;

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public xhss.AbstractRunnableC1032[] f3089;

    static {
            sun.misc.Unsafe r0 = xhss.AbstractC1067.f3442
            java.lang.Class<xhss.ᲁᛵᛱᛸ> r1 = xhss.AbstractC0952.class
            java.lang.String r2 = "_size$volatile"
            java.lang.reflect.Field r1 = r1.getDeclaredField(r2)
            long r0 = r0.objectFieldOffset(r1)
            xhss.AbstractC0952.f3088 = r0
            return
    }

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final int m1544() {
            r3 = this;
            sun.misc.Unsafe r0 = xhss.AbstractC1067.f3442
            long r1 = xhss.AbstractC0952.f3088
            int r3 = r0.getIntVolatile(r3, r1)
            return r3
    }

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public final xhss.AbstractRunnableC1032 m1545(int r8) {
            r7 = this;
            xhss.ᲇᛴᲀᛴ[] r0 = r7.f3089
            int r1 = r7.m1544()
            r2 = -1
            int r1 = r1 + r2
            sun.misc.Unsafe r3 = xhss.AbstractC1067.f3442
            long r4 = xhss.AbstractC0952.f3088
            r3.putIntVolatile(r7, r4, r1)
            int r1 = r7.m1544()
            if (r8 >= r1) goto L79
            int r1 = r7.m1544()
            r7.m1547(r8, r1)
            int r1 = r8 + (-1)
            int r1 = r1 / 2
            if (r8 <= 0) goto L48
            r3 = r0[r8]
            r4 = r0[r1]
            int r3 = r3.compareTo(r4)
            if (r3 >= 0) goto L48
            r7.m1547(r8, r1)
        L2f:
            if (r1 > 0) goto L32
            goto L79
        L32:
            xhss.ᲇᛴᲀᛴ[] r8 = r7.f3089
            int r3 = r1 + (-1)
            int r3 = r3 / 2
            r4 = r8[r3]
            r8 = r8[r1]
            int r8 = r4.compareTo(r8)
            if (r8 > 0) goto L43
            goto L79
        L43:
            r7.m1547(r1, r3)
            r1 = r3
            goto L2f
        L48:
            int r1 = r8 * 2
            int r3 = r1 + 1
            int r4 = r7.m1544()
            if (r3 < r4) goto L53
            goto L79
        L53:
            xhss.ᲇᛴᲀᛴ[] r4 = r7.f3089
            int r1 = r1 + 2
            int r5 = r7.m1544()
            if (r1 >= r5) goto L68
            r5 = r4[r1]
            r6 = r4[r3]
            int r5 = r5.compareTo(r6)
            if (r5 >= 0) goto L68
            goto L69
        L68:
            r1 = r3
        L69:
            r3 = r4[r8]
            r4 = r4[r1]
            int r3 = r3.compareTo(r4)
            if (r3 > 0) goto L74
            goto L79
        L74:
            r7.m1547(r8, r1)
            r8 = r1
            goto L48
        L79:
            int r8 = r7.m1544()
            r8 = r0[r8]
            r1 = 0
            r8.m1683(r1)
            r8.f3337 = r2
            int r7 = r7.m1544()
            r0[r7] = r1
            return r8
    }

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final void m1546(xhss.AbstractRunnableC1032 r7) {
            r6 = this;
            r0 = r6
            xhss.ᛵᛲᲀᛵ r0 = (xhss.C0448) r0
            r7.m1683(r0)
            xhss.ᲇᛴᲀᛴ[] r0 = r6.f3089
            if (r0 != 0) goto L10
            r0 = 4
            xhss.ᲇᛴᲀᛴ[] r0 = new xhss.AbstractRunnableC1032[r0]
            r6.f3089 = r0
            goto L25
        L10:
            int r1 = r6.m1544()
            int r2 = r0.length
            if (r1 < r2) goto L25
            int r1 = r6.m1544()
            int r1 = r1 * 2
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r1)
            xhss.ᲇᛴᲀᛴ[] r0 = (xhss.AbstractRunnableC1032[]) r0
            r6.f3089 = r0
        L25:
            int r1 = r6.m1544()
            int r2 = r1 + 1
            sun.misc.Unsafe r3 = xhss.AbstractC1067.f3442
            long r4 = xhss.AbstractC0952.f3088
            r3.putIntVolatile(r6, r4, r2)
            r0[r1] = r7
            r7.f3337 = r1
        L36:
            if (r1 > 0) goto L39
            goto L49
        L39:
            xhss.ᲇᛴᲀᛴ[] r7 = r6.f3089
            int r0 = r1 + (-1)
            int r0 = r0 / 2
            r2 = r7[r0]
            r7 = r7[r1]
            int r7 = r2.compareTo(r7)
            if (r7 > 0) goto L4a
        L49:
            return
        L4a:
            r6.m1547(r1, r0)
            r1 = r0
            goto L36
    }

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public final void m1547(int r3, int r4) {
            r2 = this;
            xhss.ᲇᛴᲀᛴ[] r2 = r2.f3089
            r0 = r2[r4]
            r1 = r2[r3]
            r2[r3] = r0
            r2[r4] = r1
            r0.f3337 = r3
            r1.f3337 = r4
            return
    }
}
