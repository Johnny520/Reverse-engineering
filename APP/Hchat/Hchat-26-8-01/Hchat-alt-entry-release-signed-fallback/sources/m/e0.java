package m;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class e0 extends yf.h implements fg.p {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public s1.k f8124g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f8125h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f8126i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f8127j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ gg.q f8128k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ gg.u f8129l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ gg.u f8130m;

    public e0(gg.q r1, gg.u r2, gg.u r3, wf.c r4) {
            r0 = this;
            r0.f8128k = r1
            r0.f8129l = r2
            r0.f8130m = r3
            r0.<init>(r4)
            return
    }

    @Override // yf.a
    public final wf.c create(java.lang.Object r5, wf.c r6) {
            r4 = this;
            m.e0 r0 = new m.e0
            gg.u r1 = r4.f8129l
            gg.u r2 = r4.f8130m
            gg.q r3 = r4.f8128k
            r0.<init>(r3, r1, r2, r6)
            r0.f8127j = r5
            return r0
    }

    @Override // fg.p
    public final java.lang.Object invoke(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            s1.k0 r1 = (s1.k0) r1
            wf.c r2 = (wf.c) r2
            wf.c r1 = r0.create(r1, r2)
            m.e0 r1 = (m.e0) r1
            sf.n r2 = sf.n.f12433a
            java.lang.Object r1 = r1.invokeSuspend(r2)
            return r1
    }

    @Override // yf.a
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
            r16 = this;
            r0 = r16
            int r1 = r0.f8126i
            r2 = 0
            r3 = 2
            r5 = 1
            xf.a r6 = xf.a.f21579g
            if (r1 == 0) goto L32
            if (r1 == r5) goto L26
            if (r1 != r3) goto L1f
            int r1 = r0.f8125h
            s1.k r7 = r0.f8124g
            java.lang.Object r8 = r0.f8127j
            s1.k0 r8 = (s1.k0) r8
            f8.i.I0(r17)
            r4 = r5
            r5 = r17
            goto Lb3
        L1f:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            j8.o.A(r1)
            r1 = 0
            return r1
        L26:
            int r1 = r0.f8125h
            java.lang.Object r7 = r0.f8127j
            s1.k0 r7 = (s1.k0) r7
            f8.i.I0(r17)
            r8 = r17
            goto L4e
        L32:
            f8.i.I0(r17)
            java.lang.Object r1 = r0.f8127j
            s1.k0 r1 = (s1.k0) r1
            r7 = r1
            r1 = 0
        L3b:
            if (r1 != 0) goto L132
            r0.f8127j = r7
            r0.f8124g = r2
            r0.f8125h = r1
            r0.f8126i = r5
            s1.l r8 = s1.l.f12275h
            java.lang.Object r8 = r7.e(r8, r0)
            if (r8 != r6) goto L4e
            goto Laf
        L4e:
            s1.k r8 = (s1.k) r8
            java.lang.Object r9 = r8.f12262a
            int r10 = r9.size()
            r11 = 0
        L57:
            if (r11 >= r10) goto L69
            java.lang.Object r12 = r9.get(r11)
            s1.t r12 = (s1.t) r12
            boolean r12 = s1.s.d(r12)
            if (r12 != 0) goto L66
            goto L6a
        L66:
            int r11 = r11 + 1
            goto L57
        L69:
            r1 = r5
        L6a:
            java.lang.Object r9 = r8.f12262a
            int r10 = r9.size()
            r11 = 0
        L71:
            if (r11 >= r10) goto L93
            java.lang.Object r12 = r9.get(r11)
            s1.t r12 = (s1.t) r12
            boolean r13 = r12.b()
            if (r13 != 0) goto L92
            s1.l0 r13 = r7.f12273l
            long r13 = r13.E
            long r4 = r7.m()
            boolean r4 = s1.s.f(r12, r13, r4)
            if (r4 == 0) goto L8e
            goto L92
        L8e:
            int r11 = r11 + 1
            r5 = 1
            goto L71
        L92:
            r1 = 1
        L93:
            int r4 = r8.f12264c
            if (r4 != r3) goto L9e
            gg.q r1 = r0.f8128k
            r4 = 1
            r1.f4560g = r4
            r1 = r4
            goto L9f
        L9e:
            r4 = 1
        L9f:
            r0.f8127j = r7
            r0.f8124g = r8
            r0.f8125h = r1
            r0.f8126i = r3
            s1.l r5 = s1.l.f12276i
            java.lang.Object r5 = r7.e(r5, r0)
            if (r5 != r6) goto Lb0
        Laf:
            return r6
        Lb0:
            r15 = r8
            r8 = r7
            r7 = r15
        Lb3:
            s1.k r5 = (s1.k) r5
            java.lang.Object r5 = r5.f12262a
            int r9 = r5.size()
            r10 = 0
        Lbc:
            if (r10 >= r9) goto Lcf
            java.lang.Object r11 = r5.get(r10)
            s1.t r11 = (s1.t) r11
            boolean r11 = r11.b()
            if (r11 == 0) goto Lcc
            r1 = r4
            goto Lcf
        Lcc:
            int r10 = r10 + 1
            goto Lbc
        Lcf:
            gg.u r5 = r0.f8129l
            java.lang.Object r9 = r5.f4564g
            s1.t r9 = (s1.t) r9
            long r9 = r9.f12291a
            boolean r9 = m.j0.e(r7, r9)
            java.lang.Object r7 = r7.f12262a
            gg.u r10 = r0.f8130m
            if (r9 == 0) goto L106
            int r9 = r7.size()
            r11 = 0
        Le6:
            if (r11 >= r9) goto Lf7
            java.lang.Object r12 = r7.get(r11)
            r13 = r12
            s1.t r13 = (s1.t) r13
            boolean r13 = r13.f12294d
            if (r13 == 0) goto Lf4
            goto Lf8
        Lf4:
            int r11 = r11 + 1
            goto Le6
        Lf7:
            r12 = r2
        Lf8:
            s1.t r12 = (s1.t) r12
            if (r12 == 0) goto L101
            r5.f4564g = r12
            r10.f4564g = r12
            goto L12c
        L101:
            r1 = r4
            r5 = r1
            r7 = r8
            goto L3b
        L106:
            int r9 = r7.size()
            r11 = 0
        L10b:
            if (r11 >= r9) goto L129
            java.lang.Object r12 = r7.get(r11)
            r13 = r12
            s1.t r13 = (s1.t) r13
            long r13 = r13.f12291a
            java.lang.Object r2 = r5.f4564g
            s1.t r2 = (s1.t) r2
            long r3 = r2.f12291a
            boolean r2 = s1.s.e(r13, r3)
            if (r2 == 0) goto L123
            goto L12a
        L123:
            int r11 = r11 + 1
            r2 = 0
            r3 = 2
            r4 = 1
            goto L10b
        L129:
            r12 = 0
        L12a:
            r10.f4564g = r12
        L12c:
            r7 = r8
            r2 = 0
            r3 = 2
            r5 = 1
            goto L3b
        L132:
            sf.n r1 = sf.n.f12433a
            return r1
    }
}
