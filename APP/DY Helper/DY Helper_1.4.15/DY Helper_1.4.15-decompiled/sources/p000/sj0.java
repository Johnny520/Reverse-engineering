package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class sj0 {

    /* JADX INFO: renamed from: α */
    public final java.lang.Object f9933;

    /* JADX INFO: renamed from: β */
    public final java.lang.reflect.Method f9934;

    /* JADX INFO: renamed from: γ */
    public final java.lang.reflect.Method f9935;

    public sj0(java.lang.Object r1, java.lang.reflect.Method r2, java.lang.reflect.Method r3) {
            r0 = this;
            r0.<init>()
            r0.f9933 = r1
            r0.f9934 = r2
            r0.f9935 = r3
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L2c
        L3:
            boolean r0 = r3 instanceof p000.sj0
            if (r0 != 0) goto L8
            goto L2a
        L8:
            sj0 r3 = (p000.sj0) r3
            java.lang.Object r0 = r2.f9933
            java.lang.Object r1 = r3.f9933
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L2a
        L15:
            java.lang.reflect.Method r0 = r2.f9934
            java.lang.reflect.Method r1 = r3.f9934
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L20
            goto L2a
        L20:
            java.lang.reflect.Method r2 = r2.f9935
            java.lang.reflect.Method r3 = r3.f9935
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L2c
        L2a:
            r2 = 0
            return r2
        L2c:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r2 = this;
            java.lang.Object r0 = r2.f9933
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.lang.reflect.Method r1 = r2.f9934
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.reflect.Method r2 = r2.f9935
            int r2 = r2.hashCode()
            int r2 = r2 + r1
            return r2
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "ApiHandle(client="
            r0.<init>(r1)
            java.lang.Object r1 = r2.f9933
            r0.append(r1)
            java.lang.String r1 = ", fetchMethod="
            r0.append(r1)
            java.lang.reflect.Method r1 = r2.f9934
            r0.append(r1)
            java.lang.String r1 = ", deleteMethod="
            r0.append(r1)
            java.lang.reflect.Method r2 = r2.f9935
            r0.append(r2)
            java.lang.String r2 = ")"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
