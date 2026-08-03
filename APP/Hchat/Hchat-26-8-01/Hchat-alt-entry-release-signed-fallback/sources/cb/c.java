package cb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.reflect.Method f1612a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.reflect.Constructor f1613b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.reflect.Method f1614c;

    public c(java.lang.reflect.Method r1, java.lang.reflect.Constructor r2, java.lang.reflect.Method r3) {
            r0 = this;
            r2.getClass()
            r0.<init>()
            r0.f1612a = r1
            r0.f1613b = r2
            r0.f1614c = r3
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L2c
        L3:
            boolean r0 = r3 instanceof cb.c
            if (r0 != 0) goto L8
            goto L2a
        L8:
            cb.c r3 = (cb.c) r3
            java.lang.reflect.Method r0 = r2.f1612a
            java.lang.reflect.Method r1 = r3.f1612a
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L2a
        L15:
            java.lang.reflect.Constructor r0 = r2.f1613b
            java.lang.reflect.Constructor r1 = r3.f1613b
            boolean r0 = gg.l.a(r0, r1)
            if (r0 != 0) goto L20
            goto L2a
        L20:
            java.lang.reflect.Method r0 = r2.f1614c
            java.lang.reflect.Method r3 = r3.f1614c
            boolean r3 = gg.l.a(r0, r3)
            if (r3 != 0) goto L2c
        L2a:
            r3 = 0
            return r3
        L2c:
            r3 = 1
            return r3
    }

    public final int hashCode() {
            r2 = this;
            java.lang.reflect.Method r0 = r2.f1612a
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.lang.reflect.Constructor r1 = r2.f1613b
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.reflect.Method r0 = r2.f1614c
            if (r0 != 0) goto L17
            r0 = 0
            goto L1b
        L17:
            int r0 = r0.hashCode()
        L1b:
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "AvatarMembers(legacyLoad="
            r0.<init>(r1)
            java.lang.reflect.Method r1 = r2.f1612a
            r0.append(r1)
            java.lang.String r1 = ", workerConstructor="
            r0.append(r1)
            java.lang.reflect.Constructor r1 = r2.f1613b
            r0.append(r1)
            java.lang.String r1 = ", workerModify="
            r0.append(r1)
            java.lang.reflect.Method r1 = r2.f1614c
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
