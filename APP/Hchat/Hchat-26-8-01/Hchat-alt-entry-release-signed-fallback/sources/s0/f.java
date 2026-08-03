package s0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements i0.a2 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final java.util.Set f12187g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final j0.b f12188h;

    public f(java.util.Set r2) {
            r1 = this;
            r1.<init>()
            r1.f12187g = r2
            j0.b r2 = new j0.b
            r0 = 16
            i0.k0[] r0 = new i0.k0[r0]
            r2.<init>(r0)
            r1.f12188h = r2
            return
    }

    @Override // i0.a2
    public final void d() {
            r0 = this;
            return
    }

    @Override // i0.a2
    public final void f() {
            r0 = this;
            return
    }

    @Override // i0.a2
    public final void j() {
            r5 = this;
            j0.b r0 = r5.f12188h
            java.lang.Object[] r1 = r0.f6671g
            int r0 = r0.f6673i
            r2 = 0
        L7:
            if (r2 >= r0) goto L1a
            r3 = r1[r2]
            i0.k0 r3 = (i0.k0) r3
            i0.a2 r3 = r3.f5944a
            java.util.Set r4 = r5.f12187g
            r4.remove(r3)
            r3.j()
            int r2 = r2 + 1
            goto L7
        L1a:
            return
    }
}
