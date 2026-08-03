package m7;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class f extends m7.i implements l7.b, l7.g {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public a7.c f8742m;

    public f() {
            r1 = this;
            m7.g r0 = new m7.g
            r0.<init>()
            r1.<init>(r0)
            return
    }

    @Override // m7.i
    public final d7.b R() {
            r1 = this;
            k7.c r0 = r1.f8760k
            m7.g r0 = (m7.g) r0
            d7.b r0 = r0.f8746q
            return r0
    }

    public final a7.c U() {
            r2 = this;
            a7.c r0 = r2.f8742m
            if (r0 != 0) goto L12
            java.lang.Class<m7.f> r1 = m7.f.class
            k7.a r1 = r2.v(r1)
            m7.f r1 = (m7.f) r1
            if (r1 == 0) goto L12
            a7.c r0 = r1.U()
        L12:
            return r0
    }

    @Override // l7.g
    public final u7.c a() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // l7.b
    public final u7.c g() {
            r1 = this;
            k7.c r0 = r1.f8760k
            m7.g r0 = (m7.g) r0
            u7.a r0 = r0.f8744o
            return r0
    }

    @Override // l7.g
    public final l7.f i() {
            r3 = this;
            k7.c r0 = r3.f8760k
            m7.g r0 = (m7.g) r0
            m7.f r1 = r0.U()
            a7.c r1 = r1.U()
            l7.f r2 = r0.f8747r
            if (r1 == 0) goto L35
            if (r2 == 0) goto L13
            goto L35
        L13:
            l7.l r1 = r1.e()
            if (r1 == 0) goto L35
            l7.f r2 = r1.Z()
            if (r2 != 0) goto L33
            l7.f r2 = r1.Z()
            if (r2 != 0) goto L33
            l7.e r2 = r1.f7889s
            if (r2 != 0) goto L33
            l7.e r2 = new l7.e
            r2.<init>(r1)
            r2.J(r1)
            r1.f7889s = r2
        L33:
            r0.f8747r = r2
        L35:
            if (r2 != 0) goto L46
            java.lang.Class<m7.f> r0 = m7.f.class
            k7.a r0 = r3.v(r0)
            m7.f r0 = (m7.f) r0
            if (r0 == 0) goto L46
            l7.f r0 = r0.i()
            return r0
        L46:
            return r2
    }
}
