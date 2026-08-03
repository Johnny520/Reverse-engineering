package ke;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends r9.e0 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final java.util.HashSet f7600j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final java.util.HashSet f7601k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public xd.d f7602l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f7603m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f7604n;

    public k(int r1) {
            r0 = this;
            r0.f7604n = r1
            r0.<init>()
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            r0.f7600j = r1
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            r0.f7601k = r1
            r1 = 0
            r0.f7603m = r1
            return
    }

    @Override // r9.e0, ke.e
    public final boolean a(ud.r r12, ud.n r13) {
            r11 = this;
            int r0 = r11.f7604n
            switch(r0) {
                case 0: goto L7a;
                default: goto L5;
            }
        L5:
            java.util.List r12 = r13.u()
            java.lang.Object r0 = be.h.F(r12)
            ud.j r0 = (ud.j) r0
            boolean r1 = r0 instanceof ud.h
            if (r1 == 0) goto L131
            ud.h r0 = (ud.h) r0
            boolean r1 = r11.t0(r0)
            if (r1 == 0) goto L131
            java.util.List r1 = r0.g()
            int r1 = r1.size()
            r2 = 1
            if (r1 <= r2) goto L37
            java.util.List r12 = r0.g()
            int r1 = r12.size()
            int r1 = r1 + (-2)
            java.lang.Object r12 = r12.get(r1)
            ud.p r12 = (ud.p) r12
            goto L5b
        L37:
            int r1 = r12.size()
            if (r1 <= r2) goto L5a
            int r1 = r12.size()
            int r1 = r1 + (-2)
            java.lang.Object r12 = r12.get(r1)
            ud.j r12 = (ud.j) r12
            boolean r1 = r12 instanceof ud.h
            if (r1 == 0) goto L5a
            ud.h r12 = (ud.h) r12
            java.util.List r12 = r12.g()
            java.lang.Object r12 = be.h.F(r12)
            ud.p r12 = (ud.p) r12
            goto L5b
        L5a:
            r12 = 0
        L5b:
            if (r12 == 0) goto L131
            pd.k r12 = r12.f13713k
            int r12 = r12.ordinal()
            r1 = 9
            if (r12 == r1) goto L75
            r1 = 11
            if (r12 == r1) goto L75
            r1 = 39
            if (r12 == r1) goto L75
            r1 = 40
            if (r12 == r1) goto L75
            goto L131
        L75:
            r11.u0(r0, r13)
            goto L131
        L7a:
            boolean r0 = r13 instanceof ud.i
            if (r0 == 0) goto L131
            boolean r0 = r13 instanceof xd.d
            if (r0 != 0) goto L131
            r0 = r13
            xd.a r0 = (xd.a) r0
            ud.n r0 = r0.f21538i
            r1 = r0
            md.e r1 = (md.e) r1
            md.f r1 = r1.f8877g
            md.a r2 = md.a.U
            boolean r1 = r1.a(r2)
            if (r1 == 0) goto L96
            goto L131
        L96:
            ud.h r1 = f8.i.D(r0)
            boolean r2 = a.a.A(r1)
            r3 = 1
            r4 = 0
            if (r2 == 0) goto Laa
            boolean r2 = r11.t0(r1)
            if (r2 == 0) goto L131
            r2 = r3
            goto Lab
        Laa:
            r2 = r4
        Lab:
            ud.i r13 = (ud.i) r13
            java.util.List r13 = r13.i()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r13 = r13.iterator()
            r6 = r3
        Lbb:
            boolean r7 = r13.hasNext()
            if (r7 == 0) goto Lfe
            java.lang.Object r7 = r13.next()
            ud.j r7 = (ud.j) r7
            if (r7 != 0) goto Lcb
        Lc9:
            r6 = r4
            goto Lbb
        Lcb:
            xe.b r8 = f8.i.F(r7)
            if (r8 != 0) goto Ld2
            goto L131
        Ld2:
            ud.p r9 = r8.f21553b
            pd.k r9 = r9.f13713k
            pd.k r10 = pd.k.T
            if (r9 != r10) goto Le9
            ud.h r6 = r8.f21552a
            ud.j r7 = f8.i.z(r6, r7)
            xe.c r8 = new xe.c
            r8.<init>(r6, r7)
            r5.add(r8)
            goto Lc9
        Le9:
            int r7 = r9.ordinal()
            r8 = 9
            if (r7 == r8) goto Lbb
            r8 = 11
            if (r7 == r8) goto Lbb
            r8 = 39
            if (r7 == r8) goto Lbb
            r8 = 40
            if (r7 == r8) goto Lbb
            goto Lc9
        Lfe:
            boolean r13 = r5.isEmpty()
            if (r13 != 0) goto L12a
            java.util.Iterator r13 = r5.iterator()
        L108:
            boolean r4 = r13.hasNext()
            if (r4 == 0) goto L11c
            java.lang.Object r4 = r13.next()
            xe.c r4 = (xe.c) r4
            ud.h r5 = r4.f21555b
            ud.j r4 = r4.f21554a
            r11.u0(r5, r4)
            goto L108
        L11c:
            if (r2 != 0) goto L125
            java.util.HashSet r13 = r11.f7600j
            r13.add(r0)
            r11.f7603m = r3
        L125:
            md.a r13 = md.a.f8813a0
            r12.w(r13)
        L12a:
            if (r6 == 0) goto L131
            if (r1 == 0) goto L131
            r11.u0(r1, r0)
        L131:
            r12 = 1
            return r12
    }

    @Override // r9.e0, ke.e
    public final void b(ud.r r5, ud.n r6) {
            r4 = this;
            java.util.HashSet r5 = r4.f7600j
            boolean r0 = r5.contains(r6)
            if (r0 == 0) goto L2e
            r5.remove(r6)
            java.util.List r5 = r6.u()
            xd.d r0 = r4.f7602l
            ud.p r1 = new ud.p
            pd.k r2 = pd.k.T
            r3 = 0
            r1.<init>(r2, r3)
            md.a r2 = md.a.f8831m
            r1.w(r2)
            nd.e0 r2 = new nd.e0
            r2.<init>(r0)
            r1.y(r2)
            ud.o r0 = new ud.o
            r0.<init>(r1)
            r5.add(r0)
        L2e:
            java.util.HashSet r5 = r4.f7601k
            boolean r0 = r5.contains(r6)
            if (r0 == 0) goto L47
            r5.remove(r6)
            java.util.List r5 = r6.u()
            ce.n r6 = new ce.n
            r0 = 12
            r6.<init>(r0)
            r5.removeIf(r6)
        L47:
            return
    }

    public final boolean t0(ud.h r3) {
            r2 = this;
            if (r3 == 0) goto L28
            java.util.List r3 = r3.g()
            java.lang.Object r3 = be.h.F(r3)
            ud.p r3 = (ud.p) r3
            if (r3 == 0) goto L28
            pd.k r0 = r3.f13713k
            pd.k r1 = pd.k.T
            if (r0 != r1) goto L28
            md.b r0 = md.b.K
            md.f r3 = r3.f8877g
            oc.b r3 = r3.c(r0)
            nd.e0 r3 = (nd.e0) r3
            if (r3 == 0) goto L28
            ud.n r3 = r3.f9361g
            xd.d r0 = r2.f7602l
            if (r3 != r0) goto L28
            r3 = 1
            return r3
        L28:
            r3 = 0
            return r3
    }

    public final void u0(ud.h r4, ud.j r5) {
            r3 = this;
            java.util.List r0 = r4.g()
            java.lang.Object r1 = be.h.F(r0)
            ud.p r1 = (ud.p) r1
            if (r1 == 0) goto L27
            pd.k r1 = r1.f13713k
            pd.k r2 = pd.k.T
            if (r1 != r2) goto L27
            be.h.U(r0)
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L27
            md.a r0 = md.a.f8840u
            md.e r4 = (md.e) r4
            r4.w(r0)
            java.util.HashSet r4 = r3.f7601k
            r4.add(r5)
        L27:
            return
    }
}
