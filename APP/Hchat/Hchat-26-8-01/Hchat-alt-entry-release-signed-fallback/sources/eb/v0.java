package eb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class v0 implements fg.l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f2672g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f2673h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f2674i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f2675j;

    public /* synthetic */ v0(int r1, java.lang.Object r2, java.lang.Object r3, int r4) {
            r0 = this;
            r0.f2672g = r4
            r0.f2673h = r1
            r0.f2674i = r2
            r0.f2675j = r3
            r0.<init>()
            return
    }

    public /* synthetic */ v0(java.lang.Object r1, int r2, java.lang.Object r3, int r4) {
            r0 = this;
            r0.f2672g = r4
            r0.f2674i = r1
            r0.f2673h = r2
            r0.f2675j = r3
            r0.<init>()
            return
    }

    public /* synthetic */ v0(java.lang.Object r1, java.lang.Object r2, int r3, int r4) {
            r0 = this;
            r0.f2672g = r4
            r0.f2674i = r1
            r0.f2675j = r2
            r0.f2673h = r3
            r0.<init>()
            return
    }

    @Override // fg.l
    public final java.lang.Object invoke(java.lang.Object r21) {
            r20 = this;
            r0 = r20
            int r1 = r0.f2672g
            r2 = 2
            r3 = 1
            r4 = 0
            sf.n r5 = sf.n.f12433a
            java.lang.Object r6 = r0.f2675j
            java.lang.Object r7 = r0.f2674i
            int r8 = r0.f2673h
            switch(r1) {
                case 0: goto L1ea;
                case 1: goto L12e;
                case 2: goto L103;
                case 3: goto Lc8;
                case 4: goto Lb1;
                case 5: goto L94;
                case 6: goto L56;
                default: goto L12;
            }
        L12:
            i0.a1 r7 = (i0.a1) r7
            i0.a1 r6 = (i0.a1) r6
            r1 = r21
            n2.s r1 = (n2.s) r1
            r1.getClass()
            i2.g r2 = r1.f8976a
            java.lang.String r2 = r2.f6314h
            java.lang.String r2 = og.m.P0(r8, r2)
            long r3 = r1.f8977b
            int r1 = i2.m0.f6359c
            r1 = 32
            long r8 = r3 >> r1
            int r1 = (int) r8
            int r8 = r2.length()
            if (r1 <= r8) goto L35
            r1 = r8
        L35:
            r8 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r3 = r3 & r8
            int r3 = (int) r3
            int r4 = r2.length()
            if (r3 <= r4) goto L43
            r3 = r4
        L43:
            n2.s r4 = new n2.s
            long r8 = i2.e0.b(r1, r3)
            r1 = 4
            r4.<init>(r1, r2, r8)
            r7.setValue(r4)
            java.lang.String r1 = ""
            r6.setValue(r1)
            return r5
        L56:
            android.content.Context r7 = (android.content.Context) r7
            i0.a1 r6 = (i0.a1) r6
            r1 = r21
            java.util.List r1 = (java.util.List) r1
            r1.getClass()
            if (r8 != r3) goto L75
            int r9 = r1.size()
            r10 = 9
            if (r9 <= r10) goto L75
            java.lang.String r2 = "朋友圈最多保留前 9 张图片"
            android.widget.Toast r2 = android.widget.Toast.makeText(r7, r2, r4)
            r2.show()
            goto L86
        L75:
            if (r8 != r2) goto L86
            int r2 = r1.size()
            if (r2 <= r3) goto L86
            java.lang.String r2 = "朋友圈只保留第 1 个视频"
            android.widget.Toast r2 = android.widget.Toast.makeText(r7, r2, r4)
            r2.show()
        L86:
            java.lang.Object r2 = r6.getValue()
            db.c r2 = (db.c) r2
            db.c r1 = wb.ho.o7(r2, r8, r1)
            r6.setValue(r1)
            return r5
        L94:
            fg.l r7 = (fg.l) r7
            android.content.Context r6 = (android.content.Context) r6
            r1 = r21
            java.lang.String r1 = (java.lang.String) r1
            r1.getClass()
            boolean r2 = og.m.t0(r1)
            if (r2 != 0) goto Lb0
            if (r8 != r3) goto Lad
            java.util.concurrent.atomic.AtomicBoolean r2 = e9.q.f2460a
            java.lang.String r1 = e9.q.h(r6, r1)
        Lad:
            r7.invoke(r1)
        Lb0:
            return r5
        Lb1:
            java.lang.String r7 = (java.lang.String) r7
            k9.c r6 = (k9.c) r6
            r1 = r21
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r1.getClass()
            r1.setContentDescription(r7)
            k9.d r2 = new k9.d
            r2.<init>(r6, r8)
            r1.setImageDrawable(r2)
            return r5
        Lc8:
            w.r1 r7 = (w.r1) r7
            v1.b1 r6 = (v1.b1) r6
            r9 = r21
            v1.a1 r9 = (v1.a1) r9
            int r10 = r7.f14638b
            w.j1 r1 = r7.f14637a
            n2.z r11 = r7.f14639c
            fg.a r2 = r7.f14640d
            java.lang.Object r2 = r2.invoke()
            w.m1 r2 = (w.m1) r2
            if (r2 == 0) goto Le4
            i2.k0 r2 = r2.f14569a
        Le2:
            r12 = r2
            goto Le6
        Le4:
            r2 = 0
            goto Le2
        Le6:
            r13 = 0
            int r14 = r6.f13900g
            e1.c r2 = w.s.k(r9, r10, r11, r12, r13, r14)
            m.p1 r3 = m.p1.f8324g
            int r7 = r6.f13901h
            r1.a(r3, r2, r8, r7)
            i0.f1 r1 = r1.f14510a
            float r1 = r1.g()
            float r1 = -r1
            int r1 = java.lang.Math.round(r1)
            v1.a1.E(r9, r6, r4, r1)
            return r5
        L103:
            k.u1 r7 = (k.u1) r7
            v1.b1 r6 = (v1.b1) r6
            r1 = r21
            v1.a1 r1 = (v1.a1) r1
            k.w1 r2 = r7.f7081u
            i0.g1 r2 = r2.f7093a
            int r2 = r2.g()
            if (r2 >= 0) goto L116
            r2 = r4
        L116:
            if (r2 <= r8) goto L119
            goto L11a
        L119:
            r8 = r2
        L11a:
            int r2 = -r8
            boolean r7 = r7.f7082v
            if (r7 == 0) goto L121
            r8 = r4
            goto L122
        L121:
            r8 = r2
        L122:
            if (r7 == 0) goto L125
            goto L126
        L125:
            r2 = r4
        L126:
            r1.f13890g = r3
            v1.a1.F(r1, r6, r8, r2)
            r1.f13890g = r4
            return r5
        L12e:
            i0.r1 r7 = (i0.r1) r7
            f.b0 r6 = (f.b0) r6
            r1 = r21
            i0.n r1 = (i0.n) r1
            int r9 = r7.f6036e
            if (r9 != r8) goto L1e7
            f.b0 r9 = r7.f6037f
            boolean r9 = gg.l.a(r6, r9)
            if (r9 == 0) goto L1e7
            boolean r9 = r1 instanceof i0.q
            if (r9 == 0) goto L1e7
            long[] r9 = r6.f2774a
            int r10 = r9.length
            int r10 = r10 - r2
            if (r10 < 0) goto L1e7
            r2 = r4
        L14d:
            r11 = r9[r2]
            long r13 = ~r11
            r15 = 7
            long r13 = r13 << r15
            long r13 = r13 & r11
            r15 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r13 = r13 & r15
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 == 0) goto L1d5
            int r13 = r2 - r10
            int r13 = ~r13
            int r13 = r13 >>> 31
            r14 = 8
            int r13 = 8 - r13
            r15 = r4
        L167:
            if (r15 >= r13) goto L1cd
            r16 = 255(0xff, double:1.26E-321)
            long r16 = r11 & r16
            r18 = 128(0x80, double:6.3E-322)
            int r16 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r16 >= 0) goto L1b8
            int r16 = r2 << 3
            int r3 = r16 + r15
            java.lang.Object[] r4 = r6.f2775b
            r4 = r4[r3]
            r21 = r14
            int[] r14 = r6.f2776c
            r14 = r14[r3]
            if (r14 == r8) goto L185
            r14 = 1
            goto L186
        L185:
            r14 = 0
        L186:
            if (r14 == 0) goto L1ae
            r0 = r1
            i0.q r0 = (i0.q) r0
            r18 = r1
            f.k0 r1 = r0.f6002m
            f8.i.w0(r1, r4, r7)
            r19 = r5
            boolean r5 = r4 instanceof i0.x
            if (r5 == 0) goto L1b2
            r5 = r4
            i0.x r5 = (i0.x) r5
            boolean r1 = r1.c(r5)
            if (r1 != 0) goto L1a6
            f.k0 r0 = r0.f6005p
            f8.i.x0(r0, r5)
        L1a6:
            f.k0 r0 = r7.f6038g
            if (r0 == 0) goto L1b2
            r0.k(r4)
            goto L1b2
        L1ae:
            r18 = r1
            r19 = r5
        L1b2:
            if (r14 == 0) goto L1be
            r6.f(r3)
            goto L1be
        L1b8:
            r18 = r1
            r19 = r5
            r21 = r14
        L1be:
            long r11 = r11 >> r21
            int r15 = r15 + 1
            r0 = r20
            r14 = r21
            r1 = r18
            r5 = r19
            r3 = 1
            r4 = 0
            goto L167
        L1cd:
            r18 = r1
            r19 = r5
            r0 = r14
            if (r13 != r0) goto L1e9
            goto L1d9
        L1d5:
            r18 = r1
            r19 = r5
        L1d9:
            if (r2 == r10) goto L1e9
            int r2 = r2 + 1
            r0 = r20
            r1 = r18
            r5 = r19
            r3 = 1
            r4 = 0
            goto L14d
        L1e7:
            r19 = r5
        L1e9:
            return r19
        L1ea:
            java.lang.String r7 = (java.lang.String) r7
            java.lang.String r6 = (java.lang.String) r6
            r0 = r21
            j8.p r0 = (j8.p) r0
            boolean r0 = h.Hchat.hooks.items.script.ScriptWaBridge.r(r8, r7, r6, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
    }
}
