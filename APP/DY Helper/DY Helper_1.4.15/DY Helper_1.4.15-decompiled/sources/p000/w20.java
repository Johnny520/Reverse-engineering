package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class w20 {

    /* JADX INFO: renamed from: α */
    public final android.view.ViewGroup f11544;

    /* JADX INFO: renamed from: β */
    public final android.content.Context f11545;

    /* JADX INFO: renamed from: γ */
    public final android.app.Activity f11546;

    /* JADX INFO: renamed from: δ */
    public final java.lang.Object f11547;

    public w20(android.view.ViewGroup r1, android.content.Context r2, android.app.Activity r3, java.lang.Object r4) {
            r0 = this;
            r0.<init>()
            r0.f11544 = r1
            r0.f11545 = r2
            r0.f11546 = r3
            r0.f11547 = r4
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L37
        L3:
            boolean r0 = r3 instanceof p000.w20
            if (r0 != 0) goto L8
            goto L35
        L8:
            w20 r3 = (p000.w20) r3
            android.view.ViewGroup r0 = r2.f11544
            android.view.ViewGroup r1 = r3.f11544
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L35
        L15:
            android.content.Context r0 = r2.f11545
            android.content.Context r1 = r3.f11545
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L20
            goto L35
        L20:
            android.app.Activity r0 = r2.f11546
            android.app.Activity r1 = r3.f11546
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L2b
            goto L35
        L2b:
            java.lang.Object r2 = r2.f11547
            java.lang.Object r3 = r3.f11547
            boolean r2 = p000.ln0.m3626(r2, r3)
            if (r2 != 0) goto L37
        L35:
            r2 = 0
            return r2
        L37:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r3 = this;
            android.view.ViewGroup r0 = r3.f11544
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            android.content.Context r1 = r3.f11545
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            r0 = 0
            android.app.Activity r2 = r3.f11546
            if (r2 != 0) goto L18
            r2 = r0
            goto L1c
        L18:
            int r2 = r2.hashCode()
        L1c:
            int r1 = r1 + r2
            int r1 = r1 * 31
            java.lang.Object r3 = r3.f11547
            if (r3 != 0) goto L24
            goto L28
        L24:
            int r0 = r3.hashCode()
        L28:
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "ClickScope(panel="
            r0.<init>(r1)
            android.view.ViewGroup r1 = r2.f11544
            r0.append(r1)
            java.lang.String r1 = ", context="
            r0.append(r1)
            android.content.Context r1 = r2.f11545
            r0.append(r1)
            java.lang.String r1 = ", activity="
            r0.append(r1)
            android.app.Activity r1 = r2.f11546
            r0.append(r1)
            java.lang.String r1 = ", aweme="
            r0.append(r1)
            java.lang.Object r2 = r2.f11547
            r0.append(r2)
            java.lang.String r2 = ")"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
