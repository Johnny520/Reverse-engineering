package r7;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class l implements r7.m {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final r7.b f11569g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f11570h;

    public l(r7.b r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.f11569g = r1
            r0.f11570h = r2
            return
    }

    @Override // r7.m
    public final k7.a d(java.lang.Class r3) {
            r2 = this;
            r7.b r0 = r2.f11569g
            boolean r1 = r3.isInstance(r0)
            if (r1 == 0) goto L9
            return r0
        L9:
            k7.a r3 = r0.v(r3)
            return r3
    }

    @Override // r7.g
    public final int get() {
            r2 = this;
            r7.b r0 = r2.f11569g
            byte[] r0 = r0.r()
            int r1 = r2.f11570h
            int r0 = k7.a.s(r0, r1)
            return r0
    }

    @Override // r7.g
    public final void k(int r3) {
            r2 = this;
            r7.b r0 = r2.f11569g
            byte[] r0 = r0.r()
            int r1 = r2.f11570h
            k7.a.D(r0, r1, r3)
            return
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r1 = r2.get()
            r0.append(r1)
            java.lang.String r1 = ":"
            r0.append(r1)
            r7.b r1 = r2.f11569g
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
