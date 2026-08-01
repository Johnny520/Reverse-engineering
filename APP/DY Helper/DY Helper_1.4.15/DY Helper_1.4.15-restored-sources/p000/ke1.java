package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class ke1 {

    /* JADX INFO: renamed from: α */
    public final int f5875;

    /* JADX INFO: renamed from: β */
    public final java.lang.String f5876;

    /* JADX INFO: renamed from: γ */
    public final java.lang.Integer f5877;

    /* JADX INFO: renamed from: δ */
    public final boolean f5878;

    public ke1(int r1, java.lang.String r2, java.lang.Integer r3, boolean r4) {
            r0 = this;
            r0.<init>()
            r0.f5875 = r1
            r0.f5876 = r2
            r0.f5877 = r3
            r0.f5878 = r4
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof p000.ke1
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            ke1 r5 = (p000.ke1) r5
            int r1 = r4.f5875
            int r3 = r5.f5875
            if (r1 == r3) goto L13
            return r2
        L13:
            java.lang.String r1 = r4.f5876
            java.lang.String r3 = r5.f5876
            boolean r1 = p000.ln0.m3626(r1, r3)
            if (r1 != 0) goto L1e
            return r2
        L1e:
            java.lang.Integer r1 = r4.f5877
            java.lang.Integer r3 = r5.f5877
            boolean r1 = p000.ln0.m3626(r1, r3)
            if (r1 != 0) goto L29
            return r2
        L29:
            boolean r4 = r4.f5878
            boolean r5 = r5.f5878
            if (r4 == r5) goto L30
            return r2
        L30:
            return r0
    }

    public final int hashCode() {
            r3 = this;
            int r0 = r3.f5875
            int r0 = java.lang.Integer.hashCode(r0)
            int r0 = r0 * 31
            r1 = 0
            java.lang.String r2 = r3.f5876
            if (r2 != 0) goto Lf
            r2 = r1
            goto L13
        Lf:
            int r2 = r2.hashCode()
        L13:
            int r0 = r0 + r2
            int r0 = r0 * 31
            java.lang.Integer r2 = r3.f5877
            if (r2 != 0) goto L1b
            goto L1f
        L1b:
            int r1 = r2.hashCode()
        L1f:
            int r0 = r0 + r1
            int r0 = r0 * 31
            boolean r3 = r3.f5878
            int r3 = java.lang.Boolean.hashCode(r3)
            int r3 = r3 + r0
            return r3
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = ", behaviorName="
            java.lang.String r1 = ", amount="
            int r2 = r5.f5875
            java.lang.String r3 = "Behavior(behaviorId="
            java.lang.String r4 = r5.f5876
            java.lang.StringBuilder r0 = p000.a12.m20(r2, r3, r0, r4, r1)
            java.lang.Integer r1 = r5.f5877
            r0.append(r1)
            java.lang.String r1 = ", isClaimable="
            r0.append(r1)
            boolean r5 = r5.f5878
            r0.append(r5)
            java.lang.String r5 = ")"
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            return r5
    }
}
