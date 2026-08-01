package p000;

/* JADX INFO: renamed from: w9 */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0939w9 {

    /* JADX INFO: renamed from: α */
    public final boolean f11604;

    /* JADX INFO: renamed from: β */
    public final java.lang.String f11605;

    public C0939w9(java.lang.String r1, boolean r2) {
            r0 = this;
            r0.<init>()
            r0.f11604 = r2
            r0.f11605 = r1
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L1d
        L3:
            boolean r0 = r3 instanceof p000.C0939w9
            if (r0 != 0) goto L8
            goto L1b
        L8:
            w9 r3 = (p000.C0939w9) r3
            boolean r0 = r2.f11604
            boolean r1 = r3.f11604
            if (r0 == r1) goto L11
            goto L1b
        L11:
            java.lang.String r2 = r2.f11605
            java.lang.String r3 = r3.f11605
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L1d
        L1b:
            r2 = 0
            return r2
        L1d:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r1 = this;
            boolean r0 = r1.f11604
            int r0 = java.lang.Boolean.hashCode(r0)
            int r0 = r0 * 31
            java.lang.String r1 = r1.f11605
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "UiState(available="
            r0.<init>(r1)
            boolean r1 = r2.f11604
            r0.append(r1)
            java.lang.String r1 = ", expire="
            r0.append(r1)
            java.lang.String r2 = r2.f11605
            r0.append(r2)
            java.lang.String r2 = ")"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
