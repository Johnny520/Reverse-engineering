package xhss;

/* JADX INFO: renamed from: xhss.ᛸᛵᲇᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0772 {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final java.lang.Object f2548;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public boolean f2549;

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final java.lang.Class f2550;

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public int f2551;

    public C0772(int r1, java.lang.Class r2, java.lang.Object r3) {
            r0 = this;
            r0.<init>()
            r0.f2550 = r2
            r0.f2548 = r3
            r2 = 0
            r0.f2549 = r2
            r0.f2551 = r1
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L2f
        L3:
            boolean r0 = r3 instanceof xhss.C0772
            if (r0 != 0) goto L8
            goto L2d
        L8:
            xhss.ᛸᛵᲇᲈ r3 = (xhss.C0772) r3
            java.lang.Class r0 = r2.f2550
            java.lang.Class r1 = r3.f2550
            boolean r0 = xhss.AbstractC0007.m97(r0, r1)
            if (r0 != 0) goto L15
            goto L2d
        L15:
            java.lang.Object r0 = r2.f2548
            java.lang.Object r1 = r3.f2548
            boolean r0 = xhss.AbstractC0007.m97(r0, r1)
            if (r0 != 0) goto L20
            goto L2d
        L20:
            boolean r0 = r2.f2549
            boolean r1 = r3.f2549
            if (r0 == r1) goto L27
            goto L2d
        L27:
            int r2 = r2.f2551
            int r3 = r3.f2551
            if (r2 == r3) goto L2f
        L2d:
            r2 = 0
            return r2
        L2f:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r2 = this;
            java.lang.Class r0 = r2.f2550
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.lang.Object r1 = r2.f2548
            if (r1 != 0) goto Le
            r1 = 0
            goto L12
        Le:
            int r1 = r1.hashCode()
        L12:
            int r0 = r0 + r1
            int r0 = r0 * 961
            boolean r1 = r2.f2549
            int r1 = java.lang.Boolean.hashCode(r1)
            int r1 = r1 + r0
            int r1 = r1 * 31
            int r2 = r2.f2551
            int r2 = xhss.AbstractC0390.m784(r2)
            int r2 = r2 + r1
            return r2
    }

    public final java.lang.String toString() {
            r4 = this;
            boolean r0 = r4.f2549
            int r1 = r4.f2551
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Configuration(declaringClass="
            r2.<init>(r3)
            java.lang.Class r3 = r4.f2550
            r2.append(r3)
            java.lang.String r3 = ", memberInstance="
            r2.append(r3)
            java.lang.Object r4 = r4.f2548
            r2.append(r4)
            java.lang.String r4 = ", processorResolver=null, superclass="
            r2.append(r4)
            r2.append(r0)
            java.lang.String r4 = ", optional="
            r2.append(r4)
            r4 = 1
            if (r1 == r4) goto L39
            r4 = 2
            if (r1 == r4) goto L36
            r4 = 3
            if (r1 == r4) goto L33
            java.lang.String r4 = "null"
            goto L3b
        L33:
            java.lang.String r4 = "SILENT"
            goto L3b
        L36:
            java.lang.String r4 = "NOTICE"
            goto L3b
        L39:
            java.lang.String r4 = "NO"
        L3b:
            r2.append(r4)
            java.lang.String r4 = ")"
            r2.append(r4)
            java.lang.String r4 = r2.toString()
            return r4
    }
}
