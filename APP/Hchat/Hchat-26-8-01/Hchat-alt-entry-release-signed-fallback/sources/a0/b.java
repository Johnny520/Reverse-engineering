package a0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends yf.h implements fg.p {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f7g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f8h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f9i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f10j;

    public /* synthetic */ b(java.lang.Object r1, wf.c r2, int r3) {
            r0 = this;
            r0.f7g = r3
            r0.f10j = r1
            r0.<init>(r2)
            return
    }

    @Override // yf.a
    public final wf.c create(java.lang.Object r4, wf.c r5) {
            r3 = this;
            int r0 = r3.f7g
            switch(r0) {
                case 0: goto L2c;
                case 1: goto L1f;
                case 2: goto L12;
                default: goto L5;
            }
        L5:
            a0.b r0 = new a0.b
            java.lang.Object r1 = r3.f10j
            s1.t r1 = (s1.t) r1
            r2 = 3
            r0.<init>(r1, r5, r2)
            r0.f9i = r4
            return r0
        L12:
            a0.b r0 = new a0.b
            java.lang.Object r1 = r3.f10j
            k.i r1 = (k.i) r1
            r2 = 2
            r0.<init>(r1, r5, r2)
            r0.f9i = r4
            return r0
        L1f:
            a0.b r0 = new a0.b
            java.lang.Object r1 = r3.f10j
            w.w r1 = (w.w) r1
            r2 = 1
            r0.<init>(r1, r5, r2)
            r0.f9i = r4
            return r0
        L2c:
            a0.b r0 = new a0.b
            java.lang.Object r1 = r3.f10j
            fg.l r1 = (fg.l) r1
            r2 = 0
            r0.<init>(r1, r5, r2)
            r0.f9i = r4
            return r0
    }

    @Override // fg.p
    public final java.lang.Object invoke(java.lang.Object r2, java.lang.Object r3) {
            r1 = this;
            int r0 = r1.f7g
            s1.k0 r2 = (s1.k0) r2
            wf.c r3 = (wf.c) r3
            switch(r0) {
                case 0: goto L31;
                case 1: goto L23;
                case 2: goto L16;
                default: goto L9;
            }
        L9:
            wf.c r2 = r1.create(r2, r3)
            a0.b r2 = (a0.b) r2
            sf.n r3 = sf.n.f12433a
            java.lang.Object r2 = r2.invokeSuspend(r3)
            return r2
        L16:
            wf.c r2 = r1.create(r2, r3)
            a0.b r2 = (a0.b) r2
            sf.n r3 = sf.n.f12433a
            java.lang.Object r2 = r2.invokeSuspend(r3)
            return r2
        L23:
            wf.c r2 = r1.create(r2, r3)
            a0.b r2 = (a0.b) r2
            sf.n r3 = sf.n.f12433a
            r2.invokeSuspend(r3)
            xf.a r2 = xf.a.f21579g
            return r2
        L31:
            wf.c r2 = r1.create(r2, r3)
            a0.b r2 = (a0.b) r2
            sf.n r3 = sf.n.f12433a
            java.lang.Object r2 = r2.invokeSuspend(r3)
            return r2
    }

    @Override // yf.a
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            r11 = this;
            int r0 = r11.f7g
            switch(r0) {
                case 0: goto L1a6;
                case 1: goto L165;
                case 2: goto Lae;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r11.f10j
            s1.t r0 = (s1.t) r0
            java.lang.Object r1 = r11.f9i
            s1.k0 r1 = (s1.k0) r1
            int r2 = r11.f8h
            r3 = 1
            if (r2 == 0) goto L20
            if (r2 != r3) goto L18
            f8.i.I0(r12)
            goto L34
        L18:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            j8.o.A(r12)
            r12 = 0
            goto Lad
        L20:
            f8.i.I0(r12)
        L23:
            r11.f9i = r1
            r11.f8h = r3
            s1.l r12 = s1.l.f12274g
            java.lang.Object r12 = r1.e(r12, r11)
            xf.a r2 = xf.a.f21579g
            if (r12 != r2) goto L34
            r12 = r2
            goto Lad
        L34:
            s1.k r12 = (s1.k) r12
            java.lang.Object r12 = r12.f12262a
            java.util.Iterator r12 = r12.iterator()
        L3c:
            boolean r2 = r12.hasNext()
            if (r2 == 0) goto L54
            java.lang.Object r2 = r12.next()
            r4 = r2
            s1.t r4 = (s1.t) r4
            long r4 = r4.f12291a
            long r6 = r0.f12291a
            boolean r4 = s1.s.e(r4, r6)
            if (r4 == 0) goto L3c
            goto L55
        L54:
            r2 = 0
        L55:
            s1.t r2 = (s1.t) r2
            if (r2 == 0) goto Lab
            long r4 = r2.f12293c
            boolean r12 = r2.f12294d
            if (r12 != 0) goto L62
            java.lang.Boolean r12 = java.lang.Boolean.TRUE
            goto Lad
        L62:
            r12 = 32
            long r6 = r4 >> r12
            int r2 = (int) r6
            float r2 = java.lang.Float.intBitsToFloat(r2)
            long r6 = r0.f12293c
            long r6 = r6 >> r12
            int r12 = (int) r6
            float r12 = java.lang.Float.intBitsToFloat(r12)
            float r2 = r2 - r12
            float r12 = java.lang.Math.abs(r2)
            y1.l2 r2 = r1.B()
            float r2 = r2.f()
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r12 > 0) goto La8
            r6 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r4 = r4 & r6
            int r12 = (int) r4
            float r12 = java.lang.Float.intBitsToFloat(r12)
            long r4 = r0.f12293c
            long r4 = r4 & r6
            int r2 = (int) r4
            float r2 = java.lang.Float.intBitsToFloat(r2)
            float r12 = r12 - r2
            float r12 = java.lang.Math.abs(r12)
            y1.l2 r2 = r1.B()
            float r2 = r2.f()
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r12 <= 0) goto L23
        La8:
            java.lang.Boolean r12 = java.lang.Boolean.TRUE
            goto Lad
        Lab:
            java.lang.Boolean r12 = java.lang.Boolean.TRUE
        Lad:
            return r12
        Lae:
            java.lang.Object r0 = r11.f10j
            k.i r0 = (k.i) r0
            int r1 = r11.f8h
            r2 = 2
            r3 = 1
            xf.a r4 = xf.a.f21579g
            if (r1 == 0) goto Ld6
            if (r1 == r3) goto Lce
            if (r1 != r2) goto Lc6
            java.lang.Object r1 = r11.f9i
            s1.k0 r1 = (s1.k0) r1
            f8.i.I0(r12)
            goto L101
        Lc6:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            j8.o.A(r12)
            r4 = 0
            goto L164
        Lce:
            java.lang.Object r1 = r11.f9i
            s1.k0 r1 = (s1.k0) r1
            f8.i.I0(r12)
            goto Lea
        Ld6:
            f8.i.I0(r12)
            java.lang.Object r12 = r11.f9i
            r1 = r12
            s1.k0 r1 = (s1.k0) r1
            r11.f9i = r1
            r11.f8h = r3
            java.lang.Object r12 = m.y2.b(r1, r11, r2)
            if (r12 != r4) goto Lea
            goto L164
        Lea:
            s1.t r12 = (s1.t) r12
            long r5 = r12.f12291a
            r0.f6993h = r5
            long r5 = r12.f12293c
            r0.f6987b = r5
        Lf4:
            r11.f9i = r1
            r11.f8h = r2
            s1.l r12 = s1.l.f12275h
            java.lang.Object r12 = r1.e(r12, r11)
            if (r12 != r4) goto L101
            goto L164
        L101:
            s1.k r12 = (s1.k) r12
            java.lang.Object r12 = r12.f12262a
            java.util.ArrayList r3 = new java.util.ArrayList
            int r5 = r12.size()
            r3.<init>(r5)
            int r5 = r12.size()
            r6 = 0
            r7 = r6
        L114:
            if (r7 >= r5) goto L127
            java.lang.Object r8 = r12.get(r7)
            r9 = r8
            s1.t r9 = (s1.t) r9
            boolean r9 = r9.f12294d
            if (r9 == 0) goto L124
            r3.add(r8)
        L124:
            int r7 = r7 + 1
            goto L114
        L127:
            int r12 = r3.size()
        L12b:
            if (r6 >= r12) goto L142
            java.lang.Object r5 = r3.get(r6)
            r7 = r5
            s1.t r7 = (s1.t) r7
            long r7 = r7.f12291a
            long r9 = r0.f6993h
            boolean r7 = s1.s.e(r7, r9)
            if (r7 == 0) goto L13f
            goto L143
        L13f:
            int r6 = r6 + 1
            goto L12b
        L142:
            r5 = 0
        L143:
            s1.t r5 = (s1.t) r5
            if (r5 != 0) goto L14e
            java.lang.Object r12 = tf.m.v1(r3)
            r5 = r12
            s1.t r5 = (s1.t) r5
        L14e:
            if (r5 == 0) goto L158
            long r6 = r5.f12291a
            r0.f6993h = r6
            long r5 = r5.f12293c
            r0.f6987b = r5
        L158:
            boolean r12 = r3.isEmpty()
            if (r12 == 0) goto Lf4
            r1 = -1
            r0.f6993h = r1
            sf.n r4 = sf.n.f12433a
        L164:
            return r4
        L165:
            int r0 = r11.f8h
            r1 = 1
            if (r0 == 0) goto L17b
            if (r0 != r1) goto L174
            java.lang.Object r0 = r11.f9i
            s1.k0 r0 = (s1.k0) r0
            f8.i.I0(r12)
            goto L193
        L174:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            j8.o.A(r12)
            r12 = 0
            goto L192
        L17b:
            f8.i.I0(r12)
            java.lang.Object r12 = r11.f9i
            s1.k0 r12 = (s1.k0) r12
            r0 = r12
        L183:
            r11.f9i = r0
            r11.f8h = r1
            s1.l r12 = s1.l.f12274g
            java.lang.Object r12 = r0.e(r12, r11)
            xf.a r2 = xf.a.f21579g
            if (r12 != r2) goto L193
            r12 = r2
        L192:
            return r12
        L193:
            s1.k r12 = (s1.k) r12
            java.lang.Object r2 = r11.f10j
            w.w r2 = (w.w) r2
            boolean r12 = h0.e0.a(r12)
            r12 = r12 ^ r1
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r12)
            r2.invoke(r12)
            goto L183
        L1a6:
            int r0 = r11.f8h
            r1 = 2
            r2 = 1
            xf.a r3 = xf.a.f21579g
            if (r0 == 0) goto L1c5
            if (r0 == r2) goto L1bd
            if (r0 != r1) goto L1b6
            f8.i.I0(r12)
            goto L1f9
        L1b6:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            j8.o.A(r12)
            r3 = 0
            goto L202
        L1bd:
            java.lang.Object r0 = r11.f9i
            s1.k0 r0 = (s1.k0) r0
            f8.i.I0(r12)
            goto L1d8
        L1c5:
            f8.i.I0(r12)
            java.lang.Object r12 = r11.f9i
            r0 = r12
            s1.k0 r0 = (s1.k0) r0
            r11.f9i = r0
            r11.f8h = r2
            java.lang.Object r12 = a.a.g(r0, r11)
            if (r12 != r3) goto L1d8
            goto L202
        L1d8:
            s1.t r12 = (s1.t) r12
            r12.a()
            java.lang.Object r2 = r11.f10j
            fg.l r2 = (fg.l) r2
            long r4 = r12.f12293c
            e1.b r12 = new e1.b
            r12.<init>(r4)
            r2.invoke(r12)
            r12 = 0
            r11.f9i = r12
            r11.f8h = r1
            s1.l r12 = s1.l.f12275h
            java.lang.Object r12 = m.y2.i(r0, r12, r11)
            if (r12 != r3) goto L1f9
            goto L202
        L1f9:
            s1.t r12 = (s1.t) r12
            if (r12 == 0) goto L200
            r12.a()
        L200:
            sf.n r3 = sf.n.f12433a
        L202:
            return r3
    }
}
