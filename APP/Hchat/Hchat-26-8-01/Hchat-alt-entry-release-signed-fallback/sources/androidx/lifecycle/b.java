package androidx.lifecycle;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f275a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.reflect.Method f276b;

    public b(java.lang.reflect.Method r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.f275a = r2
            r0.f276b = r1
            r2 = 1
            r1.setAccessible(r2)
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L22
        L3:
            boolean r0 = r3 instanceof androidx.lifecycle.b
            if (r0 != 0) goto L8
            goto L24
        L8:
            androidx.lifecycle.b r3 = (androidx.lifecycle.b) r3
            int r0 = r2.f275a
            int r1 = r3.f275a
            if (r0 != r1) goto L24
            java.lang.reflect.Method r0 = r2.f276b
            java.lang.String r0 = r0.getName()
            java.lang.reflect.Method r3 = r3.f276b
            java.lang.String r3 = r3.getName()
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L24
        L22:
            r3 = 1
            return r3
        L24:
            r3 = 0
            return r3
    }

    public final int hashCode() {
            r2 = this;
            int r0 = r2.f275a
            int r0 = r0 * 31
            java.lang.reflect.Method r1 = r2.f276b
            java.lang.String r1 = r1.getName()
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }
}
