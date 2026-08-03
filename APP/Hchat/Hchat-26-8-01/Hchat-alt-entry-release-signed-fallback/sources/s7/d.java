package s7;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d extends o7.b {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final r7.g f12371m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final o7.c f12372n;

    public d(r7.f r2, o7.c r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            r1.f12371m = r2
            r1.f12372n = r3
            return
    }

    public d(r7.f r1, o7.c r2, k7.f r3) {
            r0 = this;
            r0.<init>(r3)
            r0.f12371m = r1
            r0.f12372n = r2
            return
    }

    @Override // k7.a
    public final void B(q7.b r4) {
            r3 = this;
            o7.c r0 = r3.l0()
            z7.c r0 = r0.f9563k
            int r0 = r0.size()
            if (r0 == 0) goto L29
            r7.g r0 = r3.f12371m
            int r0 = r0.get()
            r4.g(r0)
            int r1 = r4.available()
            q7.b r1 = r4.a(r1)
            r3.Y(r1)
            int r2 = r1.f10666k
            int r0 = r0 + r2
            r1.close()
            r4.g(r0)
        L29:
            return
    }

    @Override // o7.b
    public void V() {
            r2 = this;
            o7.c r0 = r2.l0()
            z7.c r1 = r2.f9563k
            int r1 = r1.size()
            r0.c0(r1)
            return
    }

    @Override // o7.b
    public void X() {
            r0 = this;
            r0.U()
            r0.j0()
            return
    }

    @Override // o7.b
    public void Y(q7.b r10) {
            r9 = this;
            o7.c r0 = r9.l0()
            z7.c r1 = r0.f9563k
            int r1 = r1.size()
            r2 = 1
            super.d0(r1, r2)
            r2 = 0
        Lf:
            if (r2 >= r1) goto L73
            k7.a r3 = r0.Q(r2)
            r7.k r3 = (r7.k) r3
            k7.a r4 = r9.Q(r2)
            boolean r5 = r3.O()
            int r6 = r3.f11568m
            if (r5 != 0) goto L3b
            int r7 = r10.f10666k
            int r8 = r10.available()
            int r8 = r8 + r7
            if (r6 < 0) goto L2f
            if (r6 > r8) goto L2f
            goto L3b
        L2f:
            java.lang.String r10 = "Offset "
            java.lang.String r0 = " is out of range "
            java.lang.String r10 = p.a.j(r6, r10, r0, r8)
            j8.o.y(r10)
            return
        L3b:
            r4.I(r5)
            if (r5 != 0) goto L70
            int r5 = r10.f10666k
            r10.g(r6)
            r4.G(r10)     // Catch: java.lang.Exception -> L50
            int r3 = r10.f10666k
            if (r3 >= r5) goto L70
            r10.g(r5)
            goto L70
        L50:
            r10 = move-exception
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = r3.toString()
            java.lang.String r2 = r10.getMessage()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Error at:"
            r3.<init>(r4)
            r3.append(r1)
            r3.append(r2)
            java.lang.String r1 = r3.toString()
            r0.<init>(r1, r10)
            throw r0
        L70:
            int r2 = r2 + 1
            goto Lf
        L73:
            return
    }

    @Override // o7.b
    public final void Z() {
            r3 = this;
            z7.c r0 = r3.f9563k
            int r0 = r0.size()
            if (r0 == 0) goto L1f
            r1 = 0
            k7.a r2 = r3.Q(r1)
            boolean r2 = r2 instanceof k7.e
            if (r2 == 0) goto L1f
        L11:
            if (r1 >= r0) goto L1f
            k7.a r2 = r3.Q(r1)
            k7.e r2 = (k7.e) r2
            r2.c()
            int r1 = r1 + 1
            goto L11
        L1f:
            return
    }

    @Override // o7.b
    public final void d0(int r1, boolean r2) {
            r0 = this;
            r2 = 1
            super.d0(r1, r2)
            return
    }

    public final boolean isEmpty() {
            r1 = this;
            z7.c r0 = r1.f9563k
            int r0 = r0.size()
            if (r0 != 0) goto La
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
    }

    public int j0() {
            r8 = this;
            o7.c r0 = r8.l0()
            z7.c r1 = r8.f9563k
            int r1 = r1.size()
            r0.c0(r1)
            k7.a r0 = r8.f7389h
            r1 = 0
            if (r0 == 0) goto L23
            boolean r2 = r8.isEmpty()
            if (r2 != 0) goto L23
            f6.b r2 = new f6.b
            r2.<init>(r8)
            r0.z(r2)
            int r0 = r2.f3307c
            goto L24
        L23:
            r0 = r1
        L24:
            r7.g r2 = r8.f12371m
            r2.k(r0)
            o7.c r0 = r8.l0()
            z7.c r2 = r8.f9563k
            int r2 = r2.size()
            r0.c0(r2)
            r3 = r1
        L37:
            if (r1 >= r2) goto L67
            k7.a r4 = r0.Q(r1)
            r7.k r4 = (r7.k) r4
            k7.a r5 = r8.Q(r1)
            r4.getClass()
            boolean r6 = r5.y()
            int r7 = r4.f11568m
            if (r6 == 0) goto L57
            r5 = -1
            if (r5 == r7) goto L64
            r4.S(r5)
            r4.f11568m = r5
            goto L64
        L57:
            if (r3 == r7) goto L5e
            r4.S(r3)
            r4.f11568m = r3
        L5e:
            int r4 = r5.p()
            int r4 = r4 + r3
            r3 = r4
        L64:
            int r1 = r1 + 1
            goto L37
        L67:
            r7.a r0 = r8.k0()
            if (r0 == 0) goto L73
            int r0 = r0.N(r3)
            int r0 = r0 + r3
            return r0
        L73:
            return r3
    }

    public r7.a k0() {
            r1 = this;
            r0 = 0
            return r0
    }

    public o7.c l0() {
            r1 = this;
            o7.c r0 = r1.f12372n
            return r0
    }
}
