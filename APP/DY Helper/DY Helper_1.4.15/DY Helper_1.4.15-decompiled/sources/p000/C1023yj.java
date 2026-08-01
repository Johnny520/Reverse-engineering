package p000;

/* JADX INFO: renamed from: yj */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C1023yj {

    /* JADX INFO: renamed from: α */
    public final java.lang.Class f12643;

    /* JADX INFO: renamed from: β */
    public final java.lang.reflect.Method f12644;

    /* JADX INFO: renamed from: γ */
    public final java.lang.reflect.Field f12645;

    public C1023yj(java.lang.Class r1, java.lang.reflect.Method r2, java.lang.reflect.Field r3) {
            r0 = this;
            r1.getClass()
            r0.<init>()
            r0.f12643 = r1
            r0.f12644 = r2
            r0.f12645 = r3
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof p000.C1023yj
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            yj r5 = (p000.C1023yj) r5
            java.lang.Class r1 = r4.f12643
            java.lang.Class r3 = r5.f12643
            boolean r1 = p000.ln0.m3626(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.lang.reflect.Method r1 = r4.f12644
            java.lang.reflect.Method r3 = r5.f12644
            boolean r1 = p000.ln0.m3626(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            java.lang.reflect.Field r4 = r4.f12645
            java.lang.reflect.Field r5 = r5.f12645
            boolean r4 = p000.ln0.m3626(r4, r5)
            if (r4 != 0) goto L2d
            return r2
        L2d:
            return r0
    }

    public final int hashCode() {
            r3 = this;
            java.lang.Class r0 = r3.f12643
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            r1 = 0
            java.lang.reflect.Method r2 = r3.f12644
            if (r2 != 0) goto Lf
            r2 = r1
            goto L13
        Lf:
            int r2 = r2.hashCode()
        L13:
            int r0 = r0 + r2
            int r0 = r0 * 31
            java.lang.reflect.Field r3 = r3.f12645
            if (r3 != 0) goto L1b
            goto L1f
        L1b:
            int r1 = r3.hashCode()
        L1f:
            int r0 = r0 + r1
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "BuryViewTarget(viewClass="
            r0.<init>(r1)
            java.lang.Class r1 = r2.f12643
            r0.append(r1)
            java.lang.String r1 = ", updateMethod="
            r0.append(r1)
            java.lang.reflect.Method r1 = r2.f12644
            r0.append(r1)
            java.lang.String r1 = ", iconField="
            r0.append(r1)
            java.lang.reflect.Field r2 = r2.f12645
            r0.append(r2)
            java.lang.String r2 = ")"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
