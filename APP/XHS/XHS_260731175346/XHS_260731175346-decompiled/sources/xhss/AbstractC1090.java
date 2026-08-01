package xhss;

/* JADX INFO: renamed from: xhss.ᲇᲁᛴᛴ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1090 {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public static final xhss.AbstractC0330 f3516 = null;

    static {
            java.lang.Integer r0 = xhss.AbstractC0016.f193
            if (r0 == 0) goto L13
            int r0 = r0.intValue()
            r1 = 34
            if (r0 < r1) goto Ld
            goto L13
        Ld:
            xhss.ᲇᲀᛵᛲ r0 = new xhss.ᲇᲀᛵᛲ
            r0.<init>()
            goto L18
        L13:
            xhss.ᛶᛴᛴᛸ r0 = new xhss.ᛶᛴᛴᛸ
            r0.<init>()
        L18:
            xhss.AbstractC1090.f3516 = r0
            return
    }

    public AbstractC1090() {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ */
    public abstract int mo666();

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ */
    public int mo985(int r4, int r5) {
            r3 = this;
            if (r5 <= r4) goto L34
            int r0 = r5 - r4
            if (r0 > 0) goto L14
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 != r1) goto Lb
            goto L14
        Lb:
            int r0 = r3.mo666()
            if (r4 > r0) goto Lb
            if (r0 >= r5) goto Lb
            return r0
        L14:
            int r5 = -r0
            r5 = r5 & r0
            if (r5 != r0) goto L23
            int r5 = java.lang.Integer.numberOfLeadingZeros(r0)
            int r5 = 31 - r5
            int r3 = r3.mo667(r5)
            goto L32
        L23:
            int r5 = r3.mo666()
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
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r0 = "Random range is empty: ["
            r5.<init>(r0)
            r5.append(r3)
            java.lang.String r3 = ", "
            r5.append(r3)
            r5.append(r4)
            java.lang.String r3 = ")."
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r3 = r3.toString()
            r4.<init>(r3)
            throw r4
    }

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ */
    public abstract int mo667(int r1);
}
