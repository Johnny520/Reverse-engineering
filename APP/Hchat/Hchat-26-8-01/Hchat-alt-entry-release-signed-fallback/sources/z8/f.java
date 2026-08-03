package z8;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.reflect.Method f22644a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.reflect.Method f22645b;

    public f(java.lang.reflect.Method r1, java.lang.reflect.Method r2) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            r0.<init>()
            r0.f22644a = r1
            r0.f22645b = r2
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof z8.f
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            z8.f r5 = (z8.f) r5
            java.lang.reflect.Method r1 = r4.f22644a
            java.lang.reflect.Method r3 = r5.f22644a
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.lang.reflect.Method r1 = r4.f22645b
            java.lang.reflect.Method r5 = r5.f22645b
            boolean r5 = gg.l.a(r1, r5)
            if (r5 != 0) goto L22
            return r2
        L22:
            return r0
    }

    public final int hashCode() {
            r2 = this;
            java.lang.reflect.Method r0 = r2.f22644a
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.lang.reflect.Method r1 = r2.f22645b
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "CoreStartAccess(start="
            r0.<init>(r1)
            java.lang.reflect.Method r1 = r2.f22644a
            r0.append(r1)
            java.lang.String r1 = ", acknowledge="
            r0.append(r1)
            java.lang.reflect.Method r1 = r2.f22645b
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
