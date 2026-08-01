package xhss;

/* JADX INFO: renamed from: xhss.ᲈᛳᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C1131 {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final java.lang.reflect.Method f3652;

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final int f3653;

    public C1131(int r1, java.lang.reflect.Method r2) {
            r0 = this;
            r0.<init>()
            r0.f3653 = r1
            r0.f3652 = r2
            r0 = 1
            r2.setAccessible(r0)
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L22
        L3:
            boolean r0 = r3 instanceof xhss.C1131
            if (r0 != 0) goto L8
            goto L24
        L8:
            xhss.ᲈᛳᛶ r3 = (xhss.C1131) r3
            int r0 = r2.f3653
            int r1 = r3.f3653
            if (r0 != r1) goto L24
            java.lang.reflect.Method r2 = r2.f3652
            java.lang.String r2 = r2.getName()
            java.lang.reflect.Method r3 = r3.f3652
            java.lang.String r3 = r3.getName()
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L24
        L22:
            r2 = 1
            return r2
        L24:
            r2 = 0
            return r2
    }

    public final int hashCode() {
            r1 = this;
            int r0 = r1.f3653
            int r0 = r0 * 31
            java.lang.reflect.Method r1 = r1.f3652
            java.lang.String r1 = r1.getName()
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }
}
