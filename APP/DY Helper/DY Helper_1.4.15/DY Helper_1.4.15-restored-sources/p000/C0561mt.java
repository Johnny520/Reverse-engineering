package p000;

/* JADX INFO: renamed from: mt */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0561mt {

    /* JADX INFO: renamed from: α */
    public final android.view.DisplayCutout f7267;

    public C0561mt(android.view.DisplayCutout r1) {
            r0 = this;
            r0.<init>()
            r0.f7267 = r1
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L4
            r2 = 1
            return r2
        L4:
            if (r3 == 0) goto L1a
            java.lang.Class<mt> r0 = p000.C0561mt.class
            java.lang.Class r1 = r3.getClass()
            if (r0 == r1) goto Lf
            goto L1a
        Lf:
            mt r3 = (p000.C0561mt) r3
            android.view.DisplayCutout r2 = r2.f7267
            android.view.DisplayCutout r3 = r3.f7267
            boolean r2 = r2.equals(r3)
            return r2
        L1a:
            r2 = 0
            return r2
    }

    public final int hashCode() {
            r0 = this;
            android.view.DisplayCutout r0 = r0.f7267
            int r0 = r0.hashCode()
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "DisplayCutoutCompat{"
            r0.<init>(r1)
            android.view.DisplayCutout r2 = r2.f7267
            r0.append(r2)
            java.lang.String r2 = "}"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
