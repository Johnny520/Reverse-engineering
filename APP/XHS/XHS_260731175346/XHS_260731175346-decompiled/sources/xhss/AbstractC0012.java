package xhss;

/* JADX INFO: renamed from: xhss.ᛱᛲᛳᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0012 implements java.lang.Comparable {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public static final xhss.C0263 f154 = null;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public static final long f155 = 0;

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public static final long f156 = 0;

    static {
            xhss.ᛳᛴᲀᲁ r0 = new xhss.ᛳᛴᲀᲁ
            r1 = 22
            r0.<init>(r1)
            xhss.AbstractC0012.f154 = r0
            r0 = 4611686018427387903(0x3fffffffffffffff, double:1.9999999999999998)
            long r0 = xhss.AbstractC0694.m1208(r0)
            xhss.AbstractC0012.f155 = r0
            r0 = -4611686018427387903(0xc000000000000001, double:-2.0000000000000004)
            long r0 = xhss.AbstractC0694.m1208(r0)
            xhss.AbstractC0012.f156 = r0
            return
    }

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public static final long m113(long r3, xhss.EnumC0540 r5) {
            long r0 = xhss.AbstractC0012.f155
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 != 0) goto Lc
            r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            return r3
        Lc:
            long r0 = xhss.AbstractC0012.f156
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 != 0) goto L15
            r3 = -9223372036854775808
            return r3
        L15:
            r0 = 1
            long r1 = r3 >> r0
            int r3 = (int) r3
            r3 = r3 & r0
            if (r3 != 0) goto L1f
            xhss.ᛶᛲᛲᲁ r3 = xhss.EnumC0540.f1957
            goto L21
        L1f:
            xhss.ᛶᛲᛲᲁ r3 = xhss.EnumC0540.f1959
        L21:
            java.util.concurrent.TimeUnit r4 = r5.f1961
            java.util.concurrent.TimeUnit r3 = r3.f1961
            long r3 = r4.convert(r1, r3)
            return r3
    }

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public static final long m114(long r6, long r8) {
            r0 = 1000000(0xf4240, double:4.940656E-318)
            long r2 = r8 / r0
            long r6 = xhss.AbstractC0694.m1193(r6, r2)
            r4 = -4611686018426(0xfffffbce4217d286, double:NaN)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 > 0) goto L24
            r4 = 4611686018427(0x431bde82d7b, double:2.278475631111E-311)
            int r4 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r4 >= 0) goto L24
            long r2 = r2 * r0
            long r8 = r8 - r2
            long r6 = r6 * r0
            long r6 = r6 + r8
            r8 = 1
            long r6 = r6 << r8
            int r8 = xhss.AbstractC0344.f1269
            return r6
        L24:
            long r6 = xhss.AbstractC0694.m1208(r6)
            return r6
    }
}
