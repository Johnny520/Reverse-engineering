package r4;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class z extends r4.a0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f11516g;

    public z() {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1.f11516g = r0
            return
    }

    public final int e() {
            r1 = this;
            int r0 = r1.f11516g
            if (r0 < 0) goto L5
            return r0
        L5:
            java.lang.String r0 = "index not yet set"
            bsh.j.g(r0)
            r0 = 0
            return r0
    }

    public final java.lang.String f() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "["
            r0.<init>(r1)
            int r1 = r2.f11516g
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            r0.append(r1)
            r1 = 93
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public final void g(int r3) {
            r2 = this;
            int r0 = r2.f11516g
            r1 = -1
            if (r0 != r1) goto L8
            r2.f11516g = r3
            return
        L8:
            java.lang.String r3 = "index already set"
            bsh.j.g(r3)
            return
    }
}
