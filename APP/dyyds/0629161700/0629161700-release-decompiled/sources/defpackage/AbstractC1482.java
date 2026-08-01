package defpackage;

/* JADX INFO: renamed from: ᛸᛴᲇᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1482 {

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public static final defpackage.AbstractC0742 f6568 = null;

    static {
            java.lang.Integer r0 = defpackage.AbstractC0760.f3549
            if (r0 == 0) goto L13
            int r0 = r0.intValue()
            r1 = 34
            if (r0 < r1) goto Ld
            goto L13
        Ld:
            ᲈᲇᛱᛶ r0 = new ᲈᲇᛱᛶ
            r0.<init>()
            goto L18
        L13:
            ᛵᛸᛲᛱ r0 = new ᛵᛸᛲᛱ
            r0.<init>()
        L18:
            defpackage.AbstractC1482.f6568 = r0
            return
    }

    public AbstractC1482() {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ */
    public long mo1887(long r10, long r12) {
            r9 = this;
            int r0 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r0 <= 0) goto L6a
            long r0 = r12 - r10
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L5d
            long r12 = -r0
            long r12 = r12 & r0
            int r12 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            r4 = 1
            if (r12 != 0) goto L49
            int r12 = (int) r0
            r13 = 32
            long r0 = r0 >>> r13
            int r0 = (int) r0
            r1 = 4294967295(0xffffffff, double:2.1219957905E-314)
            if (r12 == 0) goto L2c
            int r12 = java.lang.Integer.numberOfLeadingZeros(r12)
            int r12 = 31 - r12
            int r9 = r9.mo1659(r12)
        L29:
            long r12 = (long) r9
            long r12 = r12 & r1
            goto L5b
        L2c:
            if (r0 != r4) goto L33
            int r9 = r9.mo1660()
            goto L29
        L33:
            int r12 = java.lang.Integer.numberOfLeadingZeros(r0)
            int r12 = 31 - r12
            int r12 = r9.mo1659(r12)
            long r3 = (long) r12
            long r12 = r3 << r13
            int r9 = r9.mo1660()
            long r3 = (long) r9
            long r0 = r3 & r1
            long r12 = r12 + r0
            goto L5b
        L49:
            long r12 = r9.mo1658()
            long r12 = r12 >>> r4
            long r5 = r12 % r0
            long r12 = r12 - r5
            r7 = 1
            long r7 = r0 - r7
            long r7 = r7 + r12
            int r12 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r12 < 0) goto L49
            r12 = r5
        L5b:
            long r10 = r10 + r12
            return r10
        L5d:
            long r0 = r9.mo1658()
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r2 > 0) goto L5d
            int r2 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r2 >= 0) goto L5d
            return r0
        L6a:
            java.lang.Long r9 = java.lang.Long.valueOf(r10)
            java.lang.Long r10 = java.lang.Long.valueOf(r12)
            java.lang.String r11 = ", "
            java.lang.String r12 = ")."
            java.lang.String r13 = "Random range is empty: ["
            defpackage.C0086.m547(r13, r9, r11, r10, r12)
            r9 = 0
            return r9
    }

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ */
    public abstract long mo1658();

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ */
    public int mo1888(int r4, int r5) {
            r3 = this;
            if (r5 <= r4) goto L34
            int r0 = r5 - r4
            if (r0 > 0) goto L14
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 != r1) goto Lb
            goto L14
        Lb:
            int r0 = r3.mo1660()
            if (r4 > r0) goto Lb
            if (r0 >= r5) goto Lb
            return r0
        L14:
            int r5 = -r0
            r5 = r5 & r0
            if (r5 != r0) goto L23
            int r5 = java.lang.Integer.numberOfLeadingZeros(r0)
            int r5 = 31 - r5
            int r3 = r3.mo1659(r5)
            goto L32
        L23:
            int r5 = r3.mo1660()
            int r5 = r5 >>> 1
            int r1 = r5 % r0
            int r5 = r5 - r1
            int r2 = r0 + (-1)
            int r2 = r2 + r5
            if (r2 < 0) goto L23
            r3 = r1
        L32:
            int r4 = r4 + r3
            return r4
        L34:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r5)
            java.lang.String r5 = ", "
            java.lang.String r0 = ")."
            java.lang.String r1 = "Random range is empty: ["
            defpackage.C0086.m547(r1, r3, r5, r4, r0)
            r3 = 0
            return r3
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ */
    public abstract int mo1659(int r1);

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ */
    public abstract int mo1660();
}
