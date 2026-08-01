package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class ee0 {

    /* JADX INFO: renamed from: α */
    public final java.lang.reflect.Method f3518;

    /* JADX INFO: renamed from: β */
    public final java.lang.Class f3519;

    /* JADX INFO: renamed from: γ */
    public final int f3520;

    /* JADX INFO: renamed from: δ */
    public final boolean f3521;

    public ee0(java.lang.reflect.Method r1, java.lang.Class r2, int r3, boolean r4) {
            r0 = this;
            r0.<init>()
            r0.f3518 = r1
            r0.f3519 = r2
            r0.f3520 = r3
            r0.f3521 = r4
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L2f
        L3:
            boolean r0 = r3 instanceof p000.ee0
            if (r0 != 0) goto L8
            goto L2d
        L8:
            ee0 r3 = (p000.ee0) r3
            java.lang.reflect.Method r0 = r2.f3518
            java.lang.reflect.Method r1 = r3.f3518
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L2d
        L15:
            java.lang.Class r0 = r2.f3519
            java.lang.Class r1 = r3.f3519
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L20
            goto L2d
        L20:
            int r0 = r2.f3520
            int r1 = r3.f3520
            if (r0 == r1) goto L27
            goto L2d
        L27:
            boolean r2 = r2.f3521
            boolean r3 = r3.f3521
            if (r2 == r3) goto L2f
        L2d:
            r2 = 0
            return r2
        L2f:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r3 = this;
            java.lang.reflect.Method r0 = r3.f3518
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            java.lang.Class r2 = r3.f3519
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            int r0 = r3.f3520
            int r0 = p000.a12.m14(r0, r2, r1)
            boolean r3 = r3.f3521
            int r3 = java.lang.Boolean.hashCode(r3)
            int r3 = r3 + r0
            return r3
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "RelationSubmitTarget(method="
            r0.<init>(r1)
            java.lang.reflect.Method r1 = r2.f3518
            r0.append(r1)
            java.lang.String r1 = ", receiverClass="
            r0.append(r1)
            java.lang.Class r1 = r2.f3519
            r0.append(r1)
            java.lang.String r1 = ", listParameterIndex="
            r0.append(r1)
            int r1 = r2.f3520
            r0.append(r1)
            java.lang.String r1 = ", refreshable="
            r0.append(r1)
            boolean r2 = r2.f3521
            r0.append(r2)
            java.lang.String r2 = ")"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
