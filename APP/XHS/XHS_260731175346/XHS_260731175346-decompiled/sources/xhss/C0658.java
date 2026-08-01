package xhss;

/* JADX INFO: renamed from: xhss.ᛷᛵᛳᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0658 {

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final android.view.DisplayCutout f2254;

    public C0658(android.view.DisplayCutout r1) {
            r0 = this;
            r0.<init>()
            r0.f2254 = r1
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L4
            r2 = 1
            return r2
        L4:
            if (r3 == 0) goto L1a
            java.lang.Class<xhss.ᛷᛵᛳᛸ> r0 = xhss.C0658.class
            java.lang.Class r1 = r3.getClass()
            if (r0 == r1) goto Lf
            goto L1a
        Lf:
            xhss.ᛷᛵᛳᛸ r3 = (xhss.C0658) r3
            android.view.DisplayCutout r2 = r2.f2254
            android.view.DisplayCutout r3 = r3.f2254
            boolean r2 = r2.equals(r3)
            return r2
        L1a:
            r2 = 0
            return r2
    }

    public final int hashCode() {
            r0 = this;
            android.view.DisplayCutout r0 = r0.f2254
            int r0 = r0.hashCode()
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "DisplayCutoutCompat{"
            r0.<init>(r1)
            android.view.DisplayCutout r2 = r2.f2254
            r0.append(r2)
            java.lang.String r2 = "}"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
