package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class ti1 {

    /* JADX INFO: renamed from: α */
    public final boolean f10391;

    /* JADX INFO: renamed from: β */
    public final int f10392;

    /* JADX INFO: renamed from: γ */
    public final int f10393;

    /* JADX INFO: renamed from: δ */
    public final java.util.List f10394;

    public ti1(boolean r1, int r2, int r3, java.util.List r4) {
            r0 = this;
            r0.<init>()
            r0.f10391 = r1
            r0.f10392 = r2
            r0.f10393 = r3
            r0.f10394 = r4
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L2b
        L3:
            boolean r0 = r3 instanceof p000.ti1
            if (r0 != 0) goto L8
            goto L29
        L8:
            ti1 r3 = (p000.ti1) r3
            boolean r0 = r2.f10391
            boolean r1 = r3.f10391
            if (r0 == r1) goto L11
            goto L29
        L11:
            int r0 = r2.f10392
            int r1 = r3.f10392
            if (r0 == r1) goto L18
            goto L29
        L18:
            int r0 = r2.f10393
            int r1 = r3.f10393
            if (r0 == r1) goto L1f
            goto L29
        L1f:
            java.util.List r2 = r2.f10394
            java.util.List r3 = r3.f10394
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L2b
        L29:
            r2 = 0
            return r2
        L2b:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r3 = this;
            boolean r0 = r3.f10391
            int r0 = java.lang.Boolean.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            int r2 = r3.f10392
            int r0 = p000.a12.m14(r2, r0, r1)
            int r2 = r3.f10393
            int r0 = p000.a12.m14(r2, r0, r1)
            java.util.List r3 = r3.f10394
            int r3 = r3.hashCode()
            int r3 = r3 + r0
            return r3
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "ImportPrefsResult(success="
            r0.<init>(r1)
            boolean r1 = r2.f10391
            r0.append(r1)
            java.lang.String r1 = ", importedPrefs="
            r0.append(r1)
            int r1 = r2.f10392
            r0.append(r1)
            java.lang.String r1 = ", importedKeys="
            r0.append(r1)
            int r1 = r2.f10393
            r0.append(r1)
            java.lang.String r1 = ", failures="
            r0.append(r1)
            java.util.List r2 = r2.f10394
            r0.append(r2)
            java.lang.String r2 = ")"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
