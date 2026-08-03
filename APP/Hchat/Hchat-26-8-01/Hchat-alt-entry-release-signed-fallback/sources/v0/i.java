package v0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class i implements v0.f, u3.c {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ v0.g f13883g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public androidx.lifecycle.s f13884h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public p4.t f13885i;

    public i(v0.g r4) {
            r3 = this;
            r3.<init>()
            r3.f13883g = r4
            java.lang.String r0 = "androidx.savedstate.SavedStateRegistry"
            java.lang.Object r1 = r4.d(r0)
            boolean r2 = r1 instanceof android.os.Bundle
            if (r2 == 0) goto L12
            android.os.Bundle r1 = (android.os.Bundle) r1
            goto L13
        L12:
            r1 = 0
        L13:
            if (r1 == 0) goto L18
            r3.g(r1)
        L18:
            v0.a r1 = new v0.a
            r2 = 1
            r1.<init>(r3, r2)
            r4.e(r0, r1)
            return
    }

    @Override // v0.f
    public final boolean a(java.lang.Object r2) {
            r1 = this;
            v0.g r0 = r1.f13883g
            boolean r2 = r0.a(r2)
            return r2
    }

    @Override // u3.c
    public final m.a b() {
            r1 = this;
            r0 = 0
            p4.t r0 = r1.g(r0)
            java.lang.Object r0 = r0.f10225i
            m.a r0 = (m.a) r0
            return r0
    }

    @Override // v0.f
    public final java.util.Map c() {
            r1 = this;
            v0.g r0 = r1.f13883g
            java.util.Map r0 = r0.c()
            return r0
    }

    @Override // v0.f
    public final java.lang.Object d(java.lang.String r2) {
            r1 = this;
            v0.g r0 = r1.f13883g
            java.lang.Object r2 = r0.d(r2)
            return r2
    }

    @Override // v0.f
    public final v0.e e(java.lang.String r2, fg.a r3) {
            r1 = this;
            v0.g r0 = r1.f13883g
            v0.e r2 = r0.e(r2, r3)
            return r2
    }

    @Override // androidx.lifecycle.q
    public final androidx.lifecycle.s f() {
            r2 = this;
            androidx.lifecycle.s r0 = r2.f13884h
            if (r0 != 0) goto Lc
            androidx.lifecycle.s r0 = new androidx.lifecycle.s
            r1 = 0
            r0.<init>(r2, r1)
            r2.f13884h = r0
        Lc:
            return r0
    }

    public final p4.t g(android.os.Bundle r4) {
            r3 = this;
            p4.t r0 = r3.f13885i
            if (r0 != 0) goto L1b
            pa.c r0 = new pa.c
            i.e0 r1 = new i.e0
            r2 = 28
            r1.<init>(r3, r2)
            r0.<init>(r3, r1)
            p4.t r1 = new p4.t
            r1.<init>(r0)
            r3.f13885i = r1
            r1.F(r4)
            return r1
        L1b:
            return r0
    }
}
