package r4;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends r4.l0 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public r4.b f11377k;

    @Override // r4.a0
    public final void a(r4.p r2) {
            r1 = this;
            r4.k0 r2 = r2.f11477b
            r4.b r0 = r1.f11377k
            r4.l0 r2 = r2.l(r0)
            r4.b r2 = (r4.b) r2
            r1.f11377k = r2
            return
    }

    @Override // r4.a0
    public final r4.b0 b() {
            r1 = this;
            r4.b0 r0 = r4.b0.E
            return r0
    }

    @Override // r4.l0
    public final java.lang.String l() {
            r1 = this;
            r4.b r0 = r1.f11377k
            t4.b r0 = r0.f11355k
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // r4.l0
    public final void m(r4.p r3, z4.d r4) {
            r2 = this;
            r4.b r3 = r2.f11377k
            int r3 = r3.f()
            boolean r0 = r4.d()
            if (r0 == 0) goto L1a
            java.lang.String r0 = a.a.Y0(r3)
            java.lang.String r1 = "  annotations_off: "
            java.lang.String r0 = r1.concat(r0)
            r1 = 4
            r4.b(r1, r0)
        L1a:
            r4.k(r3)
            return
    }
}
