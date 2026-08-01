package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class d01 {

    /* JADX INFO: renamed from: α */
    public final java.lang.reflect.Method f2831;

    /* JADX INFO: renamed from: β */
    public final java.util.ArrayList f2832;

    /* JADX INFO: renamed from: γ */
    public final boolean f2833;

    /* JADX INFO: renamed from: δ */
    public final int f2834;

    /* JADX INFO: renamed from: ε */
    public final java.lang.String f2835;

    public d01(java.lang.reflect.Method r1, java.util.ArrayList r2, boolean r3, int r4, java.lang.String r5) {
            r0 = this;
            r1.getClass()
            r0.<init>()
            r0.f2831 = r1
            r0.f2832 = r2
            r0.f2833 = r3
            r0.f2834 = r4
            r0.f2835 = r5
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L3a
        L3:
            boolean r0 = r3 instanceof p000.d01
            if (r0 != 0) goto L8
            goto L38
        L8:
            d01 r3 = (p000.d01) r3
            java.lang.reflect.Method r0 = r2.f2831
            java.lang.reflect.Method r1 = r3.f2831
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L15
            goto L38
        L15:
            java.util.ArrayList r0 = r2.f2832
            java.util.ArrayList r1 = r3.f2832
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L20
            goto L38
        L20:
            boolean r0 = r2.f2833
            boolean r1 = r3.f2833
            if (r0 == r1) goto L27
            goto L38
        L27:
            int r0 = r2.f2834
            int r1 = r3.f2834
            if (r0 == r1) goto L2e
            goto L38
        L2e:
            java.lang.String r2 = r2.f2835
            java.lang.String r3 = r3.f2835
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L3a
        L38:
            r2 = 0
            return r2
        L3a:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r3 = this;
            java.lang.reflect.Method r0 = r3.f2831
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            java.util.ArrayList r2 = r3.f2832
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            boolean r0 = r3.f2833
            int r0 = p000.lz1.m3678(r2, r1, r0)
            int r2 = r3.f2834
            int r0 = p000.a12.m14(r2, r0, r1)
            java.lang.String r3 = r3.f2835
            int r3 = r3.hashCode()
            int r3 = r3 + r0
            return r3
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "LegacyState(method="
            r0.<init>(r1)
            java.lang.reflect.Method r1 = r2.f2831
            r0.append(r1)
            java.lang.String r1 = ", originalItems="
            r0.append(r1)
            java.util.ArrayList r1 = r2.f2832
            r0.append(r1)
            java.lang.String r1 = ", fromCache="
            r0.append(r1)
            boolean r1 = r2.f2833
            r0.append(r1)
            java.lang.String r1 = ", requestType="
            r0.append(r1)
            int r1 = r2.f2834
            r0.append(r1)
            java.lang.String r1 = ", reason="
            r0.append(r1)
            java.lang.String r1 = ")"
            java.lang.String r2 = r2.f2835
            java.lang.String r2 = p000.lz1.m3691(r0, r2, r1)
            return r2
    }
}
