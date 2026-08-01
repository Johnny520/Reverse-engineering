package xhss;

/* JADX INFO: renamed from: xhss.ᛳᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0312 implements xhss.InterfaceC0162 {

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final java.lang.Class f1185;

    public C0312(java.lang.Class r1) {
            r0 = this;
            r0.<init>()
            r0.f1185 = r1
            return
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof xhss.C0312
            if (r0 == 0) goto L12
            xhss.ᛳᲁ r2 = (xhss.C0312) r2
            java.lang.Class r2 = r2.f1185
            java.lang.Class r1 = r1.f1185
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L12
            r1 = 1
            return r1
        L12:
            r1 = 0
            return r1
    }

    public final int hashCode() {
            r0 = this;
            java.lang.Class r0 = r0.f1185
            int r0 = r0.hashCode()
            return r0
    }

    public final java.lang.String toString() {
            r1 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class r1 = r1.f1185
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            java.lang.String r1 = " (Kotlin reflection is not available)"
            r0.append(r1)
            java.lang.String r1 = r0.toString()
            return r1
    }

    @Override // xhss.InterfaceC0162
    /* JADX INFO: renamed from: ᛷᛵᛵᲈ */
    public final java.lang.Class mo236() {
            r0 = this;
            java.lang.Class r0 = r0.f1185
            return r0
    }
}
