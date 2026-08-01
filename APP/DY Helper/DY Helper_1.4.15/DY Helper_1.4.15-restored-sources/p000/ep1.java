package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class ep1 {

    /* JADX INFO: renamed from: α */
    public float f3629;

    /* JADX INFO: renamed from: β */
    public boolean f3630;

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L1d
        L3:
            boolean r0 = r3 instanceof p000.ep1
            if (r0 != 0) goto L8
            goto L1b
        L8:
            ep1 r3 = (p000.ep1) r3
            float r0 = r2.f3629
            float r1 = r3.f3629
            int r0 = java.lang.Float.compare(r0, r1)
            if (r0 == 0) goto L15
            goto L1b
        L15:
            boolean r2 = r2.f3630
            boolean r3 = r3.f3630
            if (r2 == r3) goto L1d
        L1b:
            r2 = 0
            return r2
        L1d:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r2 = this;
            float r0 = r2.f3629
            int r0 = java.lang.Float.hashCode(r0)
            int r0 = r0 * 31
            boolean r2 = r2.f3630
            r1 = 961(0x3c1, float:1.347E-42)
            int r2 = p000.lz1.m3678(r0, r1, r2)
            return r2
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "RowColumnParentData(weight="
            r0.<init>(r1)
            float r1 = r2.f3629
            r0.append(r1)
            java.lang.String r1 = ", fill="
            r0.append(r1)
            boolean r2 = r2.f3630
            java.lang.String r1 = ", crossAxisAlignment=null, flowLayoutData=null)"
            java.lang.String r2 = p000.lz1.m3693(r0, r2, r1)
            return r2
    }
}
