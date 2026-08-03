package y4;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f22285a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.Class[] f22286b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.Class f22287c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.lang.reflect.Method f22288d;

    public a(java.lang.reflect.Method r2) {
            r1 = this;
            r1.<init>()
            r1.f22288d = r2
            java.lang.String r0 = r2.getName()
            r1.f22285a = r0
            java.lang.Class[] r0 = r2.getParameterTypes()
            r1.f22286b = r0
            java.lang.Class r2 = r2.getReturnType()
            r1.f22287c = r2
            return
    }

    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            boolean r0 = r4 instanceof y4.a
            r1 = 0
            if (r0 == 0) goto L27
            y4.a r4 = (y4.a) r4
            java.lang.String r0 = r3.f22285a
            java.lang.String r2 = r4.f22285a
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L27
            java.lang.Class r0 = r3.f22287c
            java.lang.Class r2 = r4.f22287c
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L27
            java.lang.Class[] r0 = r3.f22286b
            java.lang.Class[] r4 = r4.f22286b
            boolean r4 = java.util.Arrays.equals(r0, r4)
            if (r4 == 0) goto L27
            r4 = 1
            return r4
        L27:
            return r1
    }

    public final int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.f22285a
            int r0 = r0.hashCode()
            int r0 = r0 + 544
            int r1 = r0 * 31
            java.lang.Class r2 = r3.f22287c
            int r2 = r2.hashCode()
            int r2 = r2 + r1
            int r2 = r2 + r0
            int r0 = r2 * 31
            java.lang.Class[] r1 = r3.f22286b
            int r1 = java.util.Arrays.hashCode(r1)
            int r0 = r0 + r1
            int r0 = r0 + r2
            return r0
    }
}
