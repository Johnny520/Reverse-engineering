package xhss;

/* JADX INFO: renamed from: xhss.ᲁᛵᛶᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public class C0953 implements java.lang.Iterable, xhss.InterfaceC0057 {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final int f3090;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public final int f3091;

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public final int f3092;

    public C0953(int r2, int r3, int r4) {
            r1 = this;
            r1.<init>()
            if (r4 == 0) goto L1b
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r4 == r0) goto L14
            r1.f3090 = r2
            int r2 = xhss.AbstractC0694.m1205(r2, r3, r4)
            r1.f3091 = r2
            r1.f3092 = r4
            return
        L14:
            java.lang.String r1 = "Step must be greater than Int.MIN_VALUE to avoid overflow on negation."
            xhss.C0532.m959(r1)
            r1 = 0
            throw r1
        L1b:
            java.lang.String r1 = "Step must be non-zero."
            xhss.C0532.m959(r1)
            r1 = 0
            throw r1
    }

    public boolean equals(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof xhss.C0953
            if (r0 == 0) goto L29
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L13
            r0 = r3
            xhss.ᲁᛵᛶᲁ r0 = (xhss.C0953) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L27
        L13:
            xhss.ᲁᛵᛶᲁ r3 = (xhss.C0953) r3
            int r0 = r3.f3090
            int r1 = r2.f3090
            if (r1 != r0) goto L29
            int r0 = r2.f3091
            int r1 = r3.f3091
            if (r0 != r1) goto L29
            int r2 = r2.f3092
            int r3 = r3.f3092
            if (r2 != r3) goto L29
        L27:
            r2 = 1
            return r2
        L29:
            r2 = 0
            return r2
    }

    public int hashCode() {
            r2 = this;
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L8
            r2 = -1
            return r2
        L8:
            int r0 = r2.f3090
            int r0 = r0 * 31
            int r1 = r2.f3091
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r2 = r2.f3092
            int r0 = r0 + r2
            return r0
    }

    public boolean isEmpty() {
            r4 = this;
            r0 = 0
            r1 = 1
            int r2 = r4.f3091
            int r3 = r4.f3092
            int r4 = r4.f3090
            if (r3 <= 0) goto Le
            if (r4 <= r2) goto Ld
            return r1
        Ld:
            return r0
        Le:
            if (r4 >= r2) goto L11
            return r1
        L11:
            return r0
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator iterator() {
            r3 = this;
            xhss.ᛲᲀᛲᲁ r0 = new xhss.ᛲᲀᛲᲁ
            int r1 = r3.f3091
            int r2 = r3.f3092
            int r3 = r3.f3090
            r0.<init>(r3, r1, r2)
            return r0
    }

    public java.lang.String toString() {
            r4 = this;
            java.lang.String r0 = " step "
            int r1 = r4.f3091
            int r2 = r4.f3092
            int r4 = r4.f3090
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            if (r2 <= 0) goto L25
            r3.<init>()
            r3.append(r4)
            java.lang.String r4 = ".."
            r3.append(r4)
            r3.append(r1)
            r3.append(r0)
            r3.append(r2)
        L20:
            java.lang.String r4 = r3.toString()
            return r4
        L25:
            r3.<init>()
            r3.append(r4)
            java.lang.String r4 = " downTo "
            r3.append(r4)
            r3.append(r1)
            r3.append(r0)
            int r4 = -r2
            r3.append(r4)
            goto L20
    }
}
