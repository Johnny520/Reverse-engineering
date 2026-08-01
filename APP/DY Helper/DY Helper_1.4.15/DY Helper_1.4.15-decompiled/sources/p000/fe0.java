package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class fe0 {

    /* JADX INFO: renamed from: α */
    public final java.lang.reflect.Method f3910;

    /* JADX INFO: renamed from: β */
    public final java.lang.Class f3911;

    public fe0(java.lang.Class r1, java.lang.reflect.Method r2) {
            r0 = this;
            r2.getClass()
            r0.<init>()
            r0.f3910 = r2
            r0.f3911 = r1
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L21
        L3:
            boolean r0 = r3 instanceof p000.fe0
            if (r0 != 0) goto L8
            goto L1f
        L8:
            fe0 r3 = (p000.fe0) r3
            java.lang.reflect.Method r0 = r2.f3910
            java.lang.reflect.Method r1 = r3.f3910
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L15
            goto L1f
        L15:
            java.lang.Class r2 = r2.f3911
            java.lang.Class r3 = r3.f3911
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L21
        L1f:
            r2 = 0
            return r2
        L21:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r1 = this;
            java.lang.reflect.Method r0 = r1.f3910
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.lang.Class r1 = r1.f3911
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "ScopedMethodTarget(method="
            r0.<init>(r1)
            java.lang.reflect.Method r1 = r2.f3910
            r0.append(r1)
            java.lang.String r1 = ", receiverClass="
            r0.append(r1)
            java.lang.Class r2 = r2.f3911
            r0.append(r2)
            java.lang.String r2 = ")"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
