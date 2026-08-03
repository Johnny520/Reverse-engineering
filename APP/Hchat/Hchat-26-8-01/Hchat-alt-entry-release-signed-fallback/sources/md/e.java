package md;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class e implements md.i {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final md.g f8876h = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public md.f f8877g;

    static {
            md.g r0 = md.g.f8881d
            md.e.f8876h = r0
            return
    }

    public e() {
            r1 = this;
            r1.<init>()
            md.g r0 = md.e.f8876h
            r1.f8877g = r0
            return
    }

    public final void A(nd.r r1, md.b r2) {
            r0 = this;
            md.f r1 = r1.f8877g
            oc.b r1 = r1.c(r2)
            if (r1 == 0) goto Lb
            r0.y(r1)
        Lb:
            return
    }

    public final void B(md.e r4) {
            r3 = this;
            md.f r4 = r4.f8877g
            boolean r0 = r4.f()
            if (r0 != 0) goto L24
            md.f r0 = r3.C()
            java.util.EnumSet r1 = r0.f8879a
            java.util.EnumSet r2 = r4.f8879a
            r1.addAll(r2)
            java.util.Map r1 = r4.f8880b
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L24
            md.d r1 = new md.d
            r2 = 1
            r1.<init>(r4, r2)
            r0.i(r1)
        L24:
            return
    }

    public final md.f C() {
            r2 = this;
            md.f r0 = r2.f8877g
            md.g r1 = md.e.f8876h
            if (r0 != r1) goto Ld
            md.f r0 = new md.f
            r0.<init>()
            r2.f8877g = r0
        Ld:
            return r0
    }

    public final void D(md.a r2) {
            r1 = this;
            md.f r0 = r1.f8877g
            r0.g(r2)
            r1.G()
            return
    }

    public final void E(oc.a r2) {
            r1 = this;
            md.f r0 = r1.f8877g
            r0.h(r2)
            r1.G()
            return
    }

    public final void F() {
            r3 = this;
            md.f r0 = r3.f8877g
            md.g r1 = md.e.f8876h
            if (r0 != r1) goto L7
            return
        L7:
            java.util.Map r1 = r0.f8880b
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L10
            goto L1a
        L10:
            ae.e r1 = new ae.e
            r2 = 23
            r1.<init>(r2)
            r0.i(r1)
        L1a:
            md.f r0 = r3.f8877g
            java.util.EnumSet r0 = r0.f8879a
            r0.clear()
            r3.G()
            return
    }

    public final void G() {
            r2 = this;
            md.f r0 = r2.f8877g
            boolean r0 = r0.f()
            if (r0 == 0) goto L10
            md.f r0 = r2.f8877g
            md.g r1 = md.e.f8876h
            if (r0 == r1) goto L10
            r2.f8877g = r1
        L10:
            return
    }

    public final void w(md.a r2) {
            r1 = this;
            md.f r0 = r1.C()
            java.util.EnumSet r0 = r0.f8879a
            r0.add(r2)
            return
    }

    public final void x(md.b r4, java.lang.Object r5) {
            r3 = this;
            md.f r0 = r3.C()
            oc.b r1 = r0.c(r4)
            md.c r1 = (md.c) r1
            if (r1 != 0) goto L1b
            md.c r1 = new md.c
            r1.<init>(r4)
            ae.g r4 = new ae.g
            r2 = 12
            r4.<init>(r1, r2)
            r0.i(r4)
        L1b:
            java.util.ArrayList r4 = r1.f8873h
            r4.add(r5)
            return
    }

    public final void y(oc.b r4) {
            r3 = this;
            md.f r0 = r3.C()
            r0.getClass()
            ae.g r1 = new ae.g
            r2 = 12
            r1.<init>(r4, r2)
            r0.i(r1)
            return
    }

    public final void z(java.util.ArrayList r4) {
            r3 = this;
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L7
            return
        L7:
            md.f r0 = r3.C()
            r0.getClass()
            be.m0 r1 = new be.m0
            r2 = 4
            r1.<init>(r2, r4)
            r0.i(r1)
            return
    }
}
