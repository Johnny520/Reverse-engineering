package r4;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class u0 extends r4.o0 {
    @Override // r4.o0
    public final int a(r4.a0 r2) {
            r1 = this;
            r4.z r2 = (r4.z) r2
            int r0 = r2.e()
            int r2 = r2.c()
            int r2 = r2 * r0
            if (r2 < 0) goto L1a
            int r0 = r1.f11474d
            if (r0 < 0) goto L13
            int r0 = r0 + r2
            return r0
        L13:
            java.lang.String r2 = "fileOffset not yet set"
            bsh.j.g(r2)
        L18:
            r2 = 0
            return r2
        L1a:
            java.lang.String r2 = "relative < 0"
            j8.o.t(r2)
            goto L18
    }

    @Override // r4.o0
    public final void e() {
            r3 = this;
            r3.k()
            java.util.Collection r0 = r3.c()
            java.util.Iterator r0 = r0.iterator()
        Lb:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1d
            java.lang.Object r1 = r0.next()
            r4.a0 r1 = (r4.a0) r1
            r4.p r2 = r3.f11472b
            r1.a(r2)
            goto Lb
        L1d:
            return
    }

    @Override // r4.o0
    public final int h() {
            r2 = this;
            java.util.Collection r0 = r2.c()
            int r1 = r0.size()
            if (r1 != 0) goto Lc
            r0 = 0
            return r0
        Lc:
            java.util.Iterator r0 = r0.iterator()
            java.lang.Object r0 = r0.next()
            r4.a0 r0 = (r4.a0) r0
            int r0 = r0.c()
            int r0 = r0 * r1
            return r0
    }

    @Override // r4.o0
    public final void j(z4.d r4) {
            r3 = this;
            java.util.Collection r0 = r3.c()
            java.util.Iterator r0 = r0.iterator()
        L8:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1f
            java.lang.Object r1 = r0.next()
            r4.a0 r1 = (r4.a0) r1
            r4.p r2 = r3.f11472b
            r1.d(r2, r4)
            int r1 = r3.f11473c
            r4.a(r1)
            goto L8
        L1f:
            return
    }

    public abstract void k();
}
