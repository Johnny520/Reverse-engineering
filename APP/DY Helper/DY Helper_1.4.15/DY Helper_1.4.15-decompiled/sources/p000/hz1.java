package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class hz1 {

    /* JADX INFO: renamed from: α */
    public final java.lang.String f4847;

    /* JADX INFO: renamed from: β */
    public final java.lang.String f4848;

    /* JADX INFO: renamed from: γ */
    public final p000.gy1 f4849;

    /* JADX INFO: renamed from: δ */
    public final boolean f4850;

    /* JADX INFO: renamed from: ε */
    public final java.lang.String f4851;

    /* JADX INFO: renamed from: ζ */
    public final java.lang.String f4852;

    public hz1(java.lang.String r1, java.lang.String r2, p000.gy1 r3, boolean r4, java.lang.String r5, java.lang.String r6) {
            r0 = this;
            r2.getClass()
            r0.<init>()
            r0.f4847 = r1
            r0.f4848 = r2
            r0.f4849 = r3
            r0.f4850 = r4
            r0.f4851 = r5
            r0.f4852 = r6
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L49
        L3:
            boolean r0 = r3 instanceof p000.hz1
            if (r0 != 0) goto L8
            goto L47
        L8:
            hz1 r3 = (p000.hz1) r3
            java.lang.String r0 = r2.f4847
            java.lang.String r1 = r3.f4847
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L47
        L15:
            java.lang.String r0 = r2.f4848
            java.lang.String r1 = r3.f4848
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L20
            goto L47
        L20:
            gy1 r0 = r2.f4849
            gy1 r1 = r3.f4849
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L2b
            goto L47
        L2b:
            boolean r0 = r2.f4850
            boolean r1 = r3.f4850
            if (r0 == r1) goto L32
            goto L47
        L32:
            java.lang.String r0 = r2.f4851
            java.lang.String r1 = r3.f4851
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L3d
            goto L47
        L3d:
            java.lang.String r2 = r2.f4852
            java.lang.String r3 = r3.f4852
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L49
        L47:
            r2 = 0
            return r2
        L49:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.f4847
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r3.f4848
            int r0 = p000.a12.m15(r0, r1, r2)
            gy1 r2 = r3.f4849
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            boolean r0 = r3.f4850
            int r0 = p000.lz1.m3678(r2, r1, r0)
            java.lang.String r2 = r3.f4851
            int r0 = p000.a12.m15(r0, r1, r2)
            java.lang.String r3 = r3.f4852
            int r3 = r3.hashCode()
            int r3 = r3 + r0
            return r3
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = ", displayName="
            java.lang.String r1 = ", decision="
            java.lang.String r2 = "SparkRenderState(key="
            java.lang.String r3 = r5.f4847
            java.lang.String r4 = r5.f4848
            java.lang.StringBuilder r0 = p000.lz1.m3695(r2, r3, r0, r4, r1)
            gy1 r1 = r5.f4849
            r0.append(r1)
            java.lang.String r1 = ", sentToday="
            r0.append(r1)
            boolean r1 = r5.f4850
            r0.append(r1)
            java.lang.String r1 = ", messageLabel="
            r0.append(r1)
            java.lang.String r1 = r5.f4851
            r0.append(r1)
            java.lang.String r1 = ", campLabel="
            r0.append(r1)
            java.lang.String r5 = r5.f4852
            r0.append(r5)
            java.lang.String r5 = ")"
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            return r5
    }
}
