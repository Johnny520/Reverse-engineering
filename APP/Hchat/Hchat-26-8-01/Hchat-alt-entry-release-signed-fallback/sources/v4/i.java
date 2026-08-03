package v4;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends v4.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final v4.q f14096g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f14097h;

    public i(v4.q r1, int r2) {
            r0 = this;
            r0.<init>()
            if (r1 == 0) goto La
            r0.f14096g = r1
            r0.f14097h = r2
            return
        La:
            java.lang.String r1 = "invokeDynamic == null"
            bsh.j.c(r1)
            r1 = 0
            throw r1
    }

    @Override // z4.k
    public final java.lang.String a() {
            r1 = this;
            v4.q r0 = r1.f14096g
            v4.h r0 = r0.f14118k
            java.lang.String r0 = r0.a()
            return r0
    }

    @Override // v4.a
    public final int e(v4.a r3) {
            r2 = this;
            v4.i r3 = (v4.i) r3
            v4.q r0 = r2.f14096g
            v4.q r1 = r3.f14096g
            int r0 = r0.d(r1)
            if (r0 == 0) goto Ld
            return r0
        Ld:
            int r0 = r2.f14097h
            int r3 = r3.f14097h
            int r3 = java.lang.Integer.compare(r0, r3)
            return r3
    }

    @Override // v4.a
    public final boolean i() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // v4.a
    public final java.lang.String j() {
            r1 = this;
            java.lang.String r0 = "CallSiteRef"
            return r0
    }

    public final java.lang.String toString() {
            r1 = this;
            v4.q r0 = r1.f14096g
            v4.h r0 = r0.f14118k
            java.lang.String r0 = r0.toString()
            return r0
    }
}
