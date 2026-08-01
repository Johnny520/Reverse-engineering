package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class vi0 {

    /* JADX INFO: renamed from: α */
    public final java.lang.reflect.Method f11299;

    /* JADX INFO: renamed from: β */
    public final java.lang.reflect.Method f11300;

    /* JADX INFO: renamed from: γ */
    public final java.lang.reflect.Method f11301;

    /* JADX INFO: renamed from: δ */
    public final java.lang.reflect.Method f11302;

    /* JADX INFO: renamed from: ε */
    public final java.lang.reflect.Method f11303;

    /* JADX INFO: renamed from: ζ */
    public final java.lang.reflect.Method f11304;

    public vi0(java.lang.reflect.Method r1, java.lang.reflect.Method r2, java.lang.reflect.Method r3, java.lang.reflect.Method r4, java.lang.reflect.Method r5, java.lang.reflect.Method r6) {
            r0 = this;
            r0.<init>()
            r0.f11299 = r1
            r0.f11300 = r2
            r0.f11301 = r3
            r0.f11302 = r4
            r0.f11303 = r5
            r0.f11304 = r6
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L4d
        L3:
            boolean r0 = r3 instanceof p000.vi0
            if (r0 != 0) goto L8
            goto L4b
        L8:
            vi0 r3 = (p000.vi0) r3
            java.lang.reflect.Method r0 = r2.f11299
            java.lang.reflect.Method r1 = r3.f11299
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L4b
        L15:
            java.lang.reflect.Method r0 = r2.f11300
            java.lang.reflect.Method r1 = r3.f11300
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L20
            goto L4b
        L20:
            java.lang.reflect.Method r0 = r2.f11301
            java.lang.reflect.Method r1 = r3.f11301
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L2b
            goto L4b
        L2b:
            java.lang.reflect.Method r0 = r2.f11302
            java.lang.reflect.Method r1 = r3.f11302
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L36
            goto L4b
        L36:
            java.lang.reflect.Method r0 = r2.f11303
            java.lang.reflect.Method r1 = r3.f11303
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L41
            goto L4b
        L41:
            java.lang.reflect.Method r2 = r2.f11304
            java.lang.reflect.Method r3 = r3.f11304
            boolean r2 = p000.ln0.m3626(r2, r3)
            if (r2 != 0) goto L4d
        L4b:
            r2 = 0
            return r2
        L4d:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r3 = this;
            java.lang.reflect.Method r0 = r3.f11299
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            r1 = 0
            java.lang.reflect.Method r2 = r3.f11300
            if (r2 != 0) goto Lf
            r2 = r1
            goto L13
        Lf:
            int r2 = r2.hashCode()
        L13:
            int r0 = r0 + r2
            int r0 = r0 * 31
            java.lang.reflect.Method r2 = r3.f11301
            if (r2 != 0) goto L1c
            r2 = r1
            goto L20
        L1c:
            int r2 = r2.hashCode()
        L20:
            int r0 = r0 + r2
            int r0 = r0 * 31
            java.lang.reflect.Method r2 = r3.f11302
            if (r2 != 0) goto L29
            r2 = r1
            goto L2d
        L29:
            int r2 = r2.hashCode()
        L2d:
            int r0 = r0 + r2
            int r0 = r0 * 31
            java.lang.reflect.Method r2 = r3.f11303
            if (r2 != 0) goto L36
            r2 = r1
            goto L3a
        L36:
            int r2 = r2.hashCode()
        L3a:
            int r0 = r0 + r2
            int r0 = r0 * 31
            java.lang.reflect.Method r3 = r3.f11304
            if (r3 != 0) goto L42
            goto L46
        L42:
            int r1 = r3.hashCode()
        L46:
            int r0 = r0 + r1
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "StrangerModelMethods(cachedList="
            r0.<init>(r1)
            java.lang.reflect.Method r1 = r2.f11299
            r0.append(r1)
            java.lang.String r1 = ", refresh="
            r0.append(r1)
            java.lang.reflect.Method r1 = r2.f11300
            r0.append(r1)
            java.lang.String r1 = ", loadMore="
            r0.append(r1)
            java.lang.reflect.Method r1 = r2.f11301
            r0.append(r1)
            java.lang.String r1 = ", hasMore="
            r0.append(r1)
            java.lang.reflect.Method r1 = r2.f11302
            r0.append(r1)
            java.lang.String r1 = ", isLoading="
            r0.append(r1)
            java.lang.reflect.Method r1 = r2.f11303
            r0.append(r1)
            java.lang.String r1 = ", unregister="
            r0.append(r1)
            java.lang.reflect.Method r2 = r2.f11304
            r0.append(r2)
            java.lang.String r2 = ")"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
