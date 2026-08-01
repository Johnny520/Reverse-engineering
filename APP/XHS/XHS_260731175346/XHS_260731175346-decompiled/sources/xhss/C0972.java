package xhss;

/* JADX INFO: renamed from: xhss.ᲁᛸᛱᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0972 implements java.lang.Iterable, xhss.InterfaceC0057 {

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public static final xhss.C0972 f3172 = null;

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final java.lang.String[] f3173;

    static {
            xhss.ᲁᛸᛱᛵ r0 = new xhss.ᲁᛸᛱᛵ
            r1 = 0
            java.lang.String[] r1 = new java.lang.String[r1]
            r0.<init>(r1)
            xhss.C0972.f3172 = r0
            return
    }

    public C0972(java.lang.String[] r1) {
            r0 = this;
            r0.<init>()
            r0.f3173 = r1
            return
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof xhss.C0972
            if (r0 == 0) goto L12
            xhss.ᲁᛸᛱᛵ r2 = (xhss.C0972) r2
            java.lang.String[] r2 = r2.f3173
            java.lang.String[] r1 = r1.f3173
            boolean r1 = java.util.Arrays.equals(r1, r2)
            if (r1 == 0) goto L12
            r1 = 1
            return r1
        L12:
            r1 = 0
            return r1
    }

    public final int hashCode() {
            r0 = this;
            java.lang.String[] r0 = r0.f3173
            int r0 = java.util.Arrays.hashCode(r0)
            return r0
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator iterator() {
            r6 = this;
            int r0 = r6.size()
            xhss.ᲀᛴᛳᛸ[] r1 = new xhss.C0857[r0]
            r2 = 0
        L7:
            if (r2 >= r0) goto L1b
            java.lang.String r3 = xhss.AbstractC0694.m1204(r6, r2)
            java.lang.String r4 = xhss.AbstractC0694.m1219(r6, r2)
            xhss.ᲀᛴᛳᛸ r5 = new xhss.ᲀᛴᛳᛸ
            r5.<init>(r3, r4)
            r1[r2] = r5
            int r2 = r2 + 1
            goto L7
        L1b:
            xhss.ᛸᛲᲀᛵ r6 = new xhss.ᛸᛲᲀᛵ
            r0 = 1
            r6.<init>(r0, r1)
            return r6
    }

    public final int size() {
            r0 = this;
            java.lang.String[] r0 = r0.f3173
            int r0 = r0.length
            int r0 = r0 / 2
            return r0
    }

    public final java.lang.String toString() {
            r6 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r1 = r6.size()
            r2 = 0
        La:
            if (r2 >= r1) goto L2f
            java.lang.String r3 = xhss.AbstractC0694.m1204(r6, r2)
            java.lang.String r4 = xhss.AbstractC0694.m1219(r6, r2)
            r0.append(r3)
            java.lang.String r5 = ": "
            r0.append(r5)
            boolean r3 = xhss.AbstractC0577.m1043(r3)
            if (r3 == 0) goto L24
            java.lang.String r4 = "██"
        L24:
            r0.append(r4)
            java.lang.String r3 = "\n"
            r0.append(r3)
            int r2 = r2 + 1
            goto La
        L2f:
            java.lang.String r6 = r0.toString()
            return r6
    }

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final java.lang.String m1605(java.lang.String r4) {
            r3 = this;
            java.lang.String[] r3 = r3.f3173
            int r0 = r3.length
            int r0 = r0 + (-2)
            r1 = 0
            r2 = -2
            int r1 = xhss.AbstractC0694.m1205(r0, r1, r2)
            if (r1 > r0) goto L1f
        Ld:
            r2 = r3[r0]
            boolean r2 = r4.equalsIgnoreCase(r2)
            if (r2 == 0) goto L1a
            int r0 = r0 + 1
            r3 = r3[r0]
            return r3
        L1a:
            if (r0 == r1) goto L1f
            int r0 = r0 + (-2)
            goto Ld
        L1f:
            r3 = 0
            return r3
    }
}
