package m7;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b extends l7.a {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final r7.f f8734o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final r7.f f8735p;

    public b(int r2, int r3) {
            r1 = this;
            o7.g r0 = new o7.g
            r0.<init>()
            r1.<init>(r2, r0, r3)
            return
    }

    public b(int r2, o7.g r3, int r4) {
            r1 = this;
            p7.m r0 = new p7.m
            r0.<init>(r2)
            int r4 = r4 + 2
            r1.<init>(r0, r3, r4)
            r7.f r2 = new r7.f
            r3 = -1
            r2.<init>(r3)
            r1.f8734o = r2
            r7.f r4 = new r7.f
            r4.<init>(r3)
            r1.f8735p = r4
            r1.P(r2)
            r1.P(r4)
            return
    }

    @Override // l7.a
    public void S() {
            r0 = this;
            return
    }

    public java.lang.String U() {
            r1 = this;
            r7.f r0 = r1.f8735p
            int r0 = r0.f11560n
            r7.o r0 = r1.V(r0)
            if (r0 == 0) goto Ld
            java.lang.String r0 = r0.f11578m
            return r0
        Ld:
            r0 = 0
            return r0
    }

    public final r7.o V(int r3) {
            r2 = this;
            r0 = -1
            r1 = 0
            if (r3 != r0) goto L5
            return r1
        L5:
            u7.a r0 = r2.W()
            if (r0 == 0) goto L12
            r7.s r3 = r0.V(r3)
            r7.o r3 = (r7.o) r3
            return r3
        L12:
            return r1
    }

    public final u7.a W() {
            r2 = this;
            k7.a r0 = r2.f7389h
        L2:
            if (r0 == 0) goto L2b
            boolean r1 = r0 instanceof m7.f
            if (r1 == 0) goto L11
            m7.f r0 = (m7.f) r0
            k7.c r0 = r0.f8760k
            m7.g r0 = (m7.g) r0
            u7.a r0 = r0.f8744o
            return r0
        L11:
            boolean r1 = r0 instanceof m7.j
            if (r1 == 0) goto L28
            m7.j r0 = (m7.j) r0
            java.lang.Class<m7.f> r1 = m7.f.class
            k7.a r0 = r0.v(r1)
            m7.f r0 = (m7.f) r0
            if (r0 == 0) goto L2b
            k7.c r0 = r0.f8760k
            m7.g r0 = (m7.g) r0
            u7.a r0 = r0.f8744o
            return r0
        L28:
            k7.a r0 = r0.f7389h
            goto L2
        L2b:
            r0 = 0
            return r0
    }

    public final void X(r7.f r2) {
            r1 = this;
            int r0 = r2.f11560n
            r7.o r0 = r1.V(r0)
            if (r0 == 0) goto Lb
            r0.P(r2)
        Lb:
            return
    }

    public void Y() {
            r1 = this;
            p7.a r0 = r1.f7869m
            p7.m r0 = (p7.m) r0
            r7.f r0 = r0.f10306s
            r1.X(r0)
            r7.f r0 = r1.f8734o
            r1.X(r0)
            r7.f r0 = r1.f8735p
            r1.X(r0)
            return
    }

    public void Z() {
            r2 = this;
            u7.a r0 = r2.W()
            if (r0 != 0) goto L7
            return
        L7:
            p7.a r1 = r2.f7869m
            p7.m r1 = (p7.m) r1
            r7.f r1 = r1.f10306s
            r0.b0(r1)
            r7.f r1 = r2.f8734o
            r0.b0(r1)
            r7.f r1 = r2.f8735p
            r0.b0(r1)
            return
    }

    public void a0(int r3) {
            r2 = this;
            r7.f r0 = r2.f8734o
            int r1 = r0.f11560n
            if (r3 != r1) goto L7
            return
        L7:
            r7.o r1 = r2.V(r1)
            if (r1 == 0) goto L10
            r1.a0(r0)
        L10:
            r0.k(r3)
            r2.X(r0)
            return
    }

    public void b0(int r3) {
            r2 = this;
            r7.f r0 = r2.f8735p
            int r1 = r0.f11560n
            if (r3 != r1) goto L7
            return
        L7:
            r7.o r1 = r2.V(r1)
            if (r1 == 0) goto L10
            r1.a0(r0)
        L10:
            r0.k(r3)
            r2.X(r0)
            return
    }

    @Override // l7.a
    public java.lang.String toString() {
            r3 = this;
            p7.a r0 = r3.f7869m
            p7.m r0 = (p7.m) r0
            int r1 = r0.Q()
            if (r1 != 0) goto Lf
            java.lang.String r0 = super.toString()
            return r0
        Lf:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r1 = j8.b.b(r1)
            r2.append(r1)
            java.lang.String r1 = ": line="
            r2.append(r1)
            r7.f r0 = r0.f10305r
            int r0 = r0.f11560n
            r2.append(r0)
            java.lang.String r0 = " {"
            r2.append(r0)
            java.lang.String r0 = r3.U()
            r2.append(r0)
            java.lang.String r0 = "}"
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            return r0
    }
}
