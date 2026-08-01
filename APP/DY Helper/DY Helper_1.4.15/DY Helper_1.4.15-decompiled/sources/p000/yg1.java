package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class yg1 {

    /* JADX INFO: renamed from: α */
    public final p000.ky1 f12611;

    /* JADX INFO: renamed from: β */
    public final java.lang.String f12612;

    /* JADX INFO: renamed from: γ */
    public final int f12613;

    /* JADX INFO: renamed from: δ */
    public final java.util.ArrayList f12614;

    public yg1(p000.ky1 r1, java.lang.String r2, int r3, java.util.ArrayList r4) {
            r0 = this;
            r2.getClass()
            r0.<init>()
            r0.f12611 = r1
            r0.f12612 = r2
            r0.f12613 = r3
            r0.f12614 = r4
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L33
        L3:
            boolean r0 = r3 instanceof p000.yg1
            if (r0 != 0) goto L8
            goto L31
        L8:
            yg1 r3 = (p000.yg1) r3
            ky1 r0 = r2.f12611
            ky1 r1 = r3.f12611
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L31
        L15:
            java.lang.String r0 = r2.f12612
            java.lang.String r1 = r3.f12612
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L20
            goto L31
        L20:
            int r0 = r2.f12613
            int r1 = r3.f12613
            if (r0 == r1) goto L27
            goto L31
        L27:
            java.util.ArrayList r2 = r2.f12614
            java.util.ArrayList r3 = r3.f12614
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L33
        L31:
            r2 = 0
            return r2
        L33:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r3 = this;
            ky1 r0 = r3.f12611
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r3.f12612
            int r0 = p000.a12.m15(r0, r1, r2)
            int r2 = r3.f12613
            int r0 = p000.a12.m14(r2, r0, r1)
            java.util.ArrayList r3 = r3.f12614
            int r3 = r3.hashCode()
            int r3 = r3 + r0
            return r3
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "MutualMessagePlan(spark="
            r0.<init>(r1)
            ky1 r1 = r2.f12611
            r0.append(r1)
            java.lang.String r1 = ", displayName="
            r0.append(r1)
            java.lang.String r1 = r2.f12612
            r0.append(r1)
            java.lang.String r1 = ", requestedCount="
            r0.append(r1)
            int r1 = r2.f12613
            r0.append(r1)
            java.lang.String r1 = ", requirements="
            r0.append(r1)
            java.util.ArrayList r2 = r2.f12614
            r0.append(r2)
            java.lang.String r2 = ")"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
