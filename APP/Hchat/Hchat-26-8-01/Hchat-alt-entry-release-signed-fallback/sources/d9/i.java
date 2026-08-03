package d9;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.reflect.Method f2107a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.reflect.Constructor f2108b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.reflect.Method f2109c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.lang.reflect.Method f2110d;

    public i(java.lang.reflect.Method r1, java.lang.reflect.Constructor r2, java.lang.reflect.Method r3, java.lang.reflect.Method r4) {
            r0 = this;
            r0.<init>()
            r0.f2107a = r1
            r0.f2108b = r2
            r0.f2109c = r3
            r0.f2110d = r4
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L37
        L3:
            boolean r0 = r3 instanceof d9.i
            if (r0 != 0) goto L8
            goto L35
        L8:
            d9.i r3 = (d9.i) r3
            java.lang.reflect.Method r0 = r2.f2107a
            java.lang.reflect.Method r1 = r3.f2107a
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L35
        L15:
            java.lang.reflect.Constructor r0 = r2.f2108b
            java.lang.reflect.Constructor r1 = r3.f2108b
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L20
            goto L35
        L20:
            java.lang.reflect.Method r0 = r2.f2109c
            java.lang.reflect.Method r1 = r3.f2109c
            boolean r0 = gg.l.a(r0, r1)
            if (r0 != 0) goto L2b
            goto L35
        L2b:
            java.lang.reflect.Method r0 = r2.f2110d
            java.lang.reflect.Method r3 = r3.f2110d
            boolean r3 = r0.equals(r3)
            if (r3 != 0) goto L37
        L35:
            r3 = 0
            return r3
        L37:
            r3 = 1
            return r3
    }

    public final int hashCode() {
            r2 = this;
            java.lang.reflect.Method r0 = r2.f2107a
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.lang.reflect.Constructor r1 = r2.f2108b
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.reflect.Method r0 = r2.f2109c
            if (r0 != 0) goto L17
            r0 = 0
            goto L1b
        L17:
            int r0 = r0.hashCode()
        L1b:
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.reflect.Method r0 = r2.f2110d
            int r0 = r0.hashCode()
            int r0 = r0 + r1
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "AvatarMembers(legacyLoad="
            r0.<init>(r1)
            java.lang.reflect.Method r1 = r2.f2107a
            r0.append(r1)
            java.lang.String r1 = ", workerConstructor="
            r0.append(r1)
            java.lang.reflect.Constructor r1 = r2.f2108b
            r0.append(r1)
            java.lang.String r1 = ", workerModify="
            r0.append(r1)
            java.lang.reflect.Method r1 = r2.f2109c
            r0.append(r1)
            java.lang.String r1 = ", draw="
            r0.append(r1)
            java.lang.reflect.Method r1 = r2.f2110d
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
