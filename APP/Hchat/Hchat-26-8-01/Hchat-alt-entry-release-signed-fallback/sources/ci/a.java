package ci;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class a {
    public void a(i0.h0 r9, int r10) {
            r8 = this;
            r0 = -74985928(0xfffffffffb87ce38, float:-1.4102854E36)
            r9.b0(r0)
            r0 = r10 & 1
            r1 = 0
            if (r0 == 0) goto Ld
            r2 = 1
            goto Le
        Ld:
            r2 = r1
        Le:
            boolean r0 = r9.S(r0, r2)
            if (r0 == 0) goto Le2
            i0.m2 r0 = ci.y.f1810b
            java.lang.Object r0 = r9.j(r0)
            w0.p r0 = (w0.p) r0
            i0.m2 r2 = ci.y.f1809a
            java.lang.Object r2 = r9.j(r2)
            w0.p r2 = (w0.p) r2
            i0.m2 r3 = y1.h1.f21959u
            java.lang.Object r3 = r9.j(r3)
            y1.o2 r3 = (y1.o2) r3
            y1.v1 r3 = (y1.v1) r3
            long r4 = r3.a()
            float r4 = u2.h.b(r4)
            long r5 = r3.a()
            float r3 = u2.h.a(r5)
            r5 = 480(0x1e0, float:6.73E-43)
            float r5 = (float) r5
            int r3 = u2.f.a(r3, r5)
            if (r3 < 0) goto L4e
            r3 = 840(0x348, float:1.177E-42)
            float r3 = (float) r3
            int r3 = u2.f.a(r4, r3)
        L4e:
            r3 = 952973683(0x38cd3973, float:9.7858625E-5)
            r9.a0(r3)
            java.util.ListIterator r3 = r0.listIterator()
            uf.a r3 = (uf.a) r3
            boolean r4 = r3.hasNext()
            if (r4 != 0) goto Ld7
            r9.p(r1)
            r3 = 952982109(0x38cd5a5d, float:9.791993E-5)
            r9.a0(r3)
            java.util.ListIterator r3 = r2.listIterator()
            uf.a r3 = (uf.a) r3
            boolean r4 = r3.hasNext()
            if (r4 != 0) goto Lcc
            r9.p(r1)
            int r1 = r0.size()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            int r3 = r2.size()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            boolean r4 = r9.f(r0)
            boolean r5 = r9.f(r2)
            r4 = r4 | r5
            java.lang.Object r5 = r9.P()
            i0.e r6 = i0.l.f5952a
            if (r4 != 0) goto L9b
            if (r5 != r6) goto La5
        L9b:
            ci.u r5 = new ci.u
            r4 = 0
            r7 = 0
            r5.<init>(r0, r2, r7, r4)
            r9.k0(r5)
        La5:
            fg.p r5 = (fg.p) r5
            i0.r.g(r1, r3, r5, r9)
            boolean r1 = r9.f(r0)
            boolean r3 = r9.f(r2)
            r1 = r1 | r3
            java.lang.Object r3 = r9.P()
            if (r1 != 0) goto Lbb
            if (r3 != r6) goto Lc4
        Lbb:
            c9.i r3 = new c9.i
            r1 = 7
            r3.<init>(r0, r1, r2)
            r9.k0(r3)
        Lc4:
            fg.l r3 = (fg.l) r3
            sf.n r0 = sf.n.f12433a
            i0.r.c(r0, r3, r9)
            goto Le5
        Lcc:
            java.lang.Object r9 = r3.next()
            r9.getClass()
            ah.a.d()
            return
        Ld7:
            java.lang.Object r9 = r3.next()
            r9.getClass()
            ah.a.d()
            return
        Le2:
            r9.V()
        Le5:
            i0.r1 r9 = r9.t()
            if (r9 == 0) goto Lf3
            b0.t r0 = new b0.t
            r1 = 5
            r0.<init>(r10, r1, r8)
            r9.f6035d = r0
        Lf3:
            return
    }
}
