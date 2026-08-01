package defpackage;

/* JADX INFO: renamed from: ᛵᲇᛷᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0984 implements java.lang.Comparable {

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public static final long f4411 = 0;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public static final long f4412 = 0;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public static final defpackage.C1403 f4413 = null;

    static {
            ᛷᲈᲀ r0 = new ᛷᲈᲀ
            r1 = 19
            r0.<init>(r1)
            defpackage.AbstractC0984.f4413 = r0
            r0 = 4611686018427387903(0x3fffffffffffffff, double:1.9999999999999998)
            long r0 = defpackage.AbstractC0498.m1273(r0)
            defpackage.AbstractC0984.f4412 = r0
            r0 = -4611686018427387903(0xc000000000000001, double:-2.0000000000000004)
            long r0 = defpackage.AbstractC0498.m1273(r0)
            defpackage.AbstractC0984.f4411 = r0
            return
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public static final long m1926(long r6, long r8) {
            r0 = 1000000(0xf4240, double:4.940656E-318)
            long r2 = r8 / r0
            long r6 = defpackage.AbstractC0498.m1277(r6, r2)
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
            int r8 = defpackage.AbstractC1556.f6889
            return r6
        L24:
            long r6 = defpackage.AbstractC0498.m1273(r6)
            return r6
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public static final long m1927(long r3, defpackage.EnumC1551 r5) {
            long r0 = defpackage.AbstractC0984.f4412
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 != 0) goto Lc
            r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            return r3
        Lc:
            long r0 = defpackage.AbstractC0984.f4411
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
            ᛸᛸᲁᛵ r3 = defpackage.EnumC1551.f6876
            goto L21
        L1f:
            ᛸᛸᲁᛵ r3 = defpackage.EnumC1551.f6875
        L21:
            java.util.concurrent.TimeUnit r4 = r5.f6879
            java.util.concurrent.TimeUnit r3 = r3.f6879
            long r3 = r4.convert(r1, r3)
            return r3
    }
}
