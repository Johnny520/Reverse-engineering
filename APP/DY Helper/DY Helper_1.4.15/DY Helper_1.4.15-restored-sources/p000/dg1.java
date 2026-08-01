package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class dg1 {

    /* JADX INFO: renamed from: α */
    public final java.lang.Class f3152;

    /* JADX INFO: renamed from: β */
    public final java.lang.reflect.Method f3153;

    /* JADX INFO: renamed from: γ */
    public final java.lang.reflect.Method f3154;

    /* JADX INFO: renamed from: δ */
    public final java.lang.reflect.Method f3155;

    /* JADX INFO: renamed from: ε */
    public final java.lang.Class f3156;

    public dg1(java.lang.Class r1, java.lang.reflect.Method r2, java.lang.reflect.Method r3, java.lang.reflect.Method r4, java.lang.Class r5) {
            r0 = this;
            r0.<init>()
            r0.f3152 = r1
            r0.f3153 = r2
            r0.f3154 = r3
            r0.f3155 = r4
            r0.f3156 = r5
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L42
        L3:
            boolean r0 = r3 instanceof p000.dg1
            if (r0 != 0) goto L8
            goto L40
        L8:
            dg1 r3 = (p000.dg1) r3
            java.lang.Class r0 = r2.f3152
            java.lang.Class r1 = r3.f3152
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L40
        L15:
            java.lang.reflect.Method r0 = r2.f3153
            java.lang.reflect.Method r1 = r3.f3153
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L20
            goto L40
        L20:
            java.lang.reflect.Method r0 = r2.f3154
            java.lang.reflect.Method r1 = r3.f3154
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L2b
            goto L40
        L2b:
            java.lang.reflect.Method r0 = r2.f3155
            java.lang.reflect.Method r1 = r3.f3155
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L36
            goto L40
        L36:
            java.lang.Class r2 = r2.f3156
            java.lang.Class r3 = r3.f3156
            boolean r2 = p000.ln0.m3626(r2, r3)
            if (r2 != 0) goto L42
        L40:
            r2 = 0
            return r2
        L42:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r3 = this;
            java.lang.Class r0 = r3.f3152
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.lang.reflect.Method r1 = r3.f3153
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.reflect.Method r0 = r3.f3154
            int r0 = r0.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            r1 = 0
            java.lang.reflect.Method r2 = r3.f3155
            if (r2 != 0) goto L21
            r2 = r1
            goto L25
        L21:
            int r2 = r2.hashCode()
        L25:
            int r0 = r0 + r2
            int r0 = r0 * 31
            java.lang.Class r3 = r3.f3156
            if (r3 != 0) goto L2d
            goto L31
        L2d:
            int r1 = r3.hashCode()
        L31:
            int r0 = r0 + r1
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "HostShareServiceProbe(internalServiceClass="
            r0.<init>(r1)
            java.lang.Class r1 = r2.f3152
            r0.append(r1)
            java.lang.String r1 = ", getServiceMethod="
            r0.append(r1)
            java.lang.reflect.Method r1 = r2.f3153
            r0.append(r1)
            java.lang.String r1 = ", getShareServiceMethod="
            r0.append(r1)
            java.lang.reflect.Method r1 = r2.f3154
            r0.append(r1)
            java.lang.String r1 = ", ensurePluginMethod="
            r0.append(r1)
            java.lang.reflect.Method r1 = r2.f3155
            r0.append(r1)
            java.lang.String r1 = ", ensureCallbackClass="
            r0.append(r1)
            java.lang.Class r2 = r2.f3156
            r0.append(r2)
            java.lang.String r2 = ")"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
