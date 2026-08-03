package hb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j0 implements fg.q {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f5413g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f5414h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f5415i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f5416j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f5417k;

    public /* synthetic */ j0(int r1, java.lang.Object r2, java.lang.Object r3, java.lang.Object r4, boolean r5) {
            r0 = this;
            r0.f5413g = r1
            r0.f5415i = r2
            r0.f5416j = r3
            r0.f5414h = r5
            r0.f5417k = r4
            r0.<init>()
            return
    }

    public /* synthetic */ j0(sh.x r2, r.z r3, android.content.SharedPreferences r4, boolean r5) {
            r1 = this;
            r0 = 3
            r1.f5413g = r0
            r1.<init>()
            r1.f5415i = r2
            r1.f5416j = r3
            r1.f5417k = r4
            r1.f5414h = r5
            return
    }

    public /* synthetic */ j0(boolean r2, fg.l r3, java.util.List r4, fg.a r5) {
            r1 = this;
            r0 = 1
            r1.f5413g = r0
            r1.<init>()
            r1.f5414h = r2
            r1.f5415i = r3
            r1.f5416j = r4
            r1.f5417k = r5
            return
    }

    @Override // fg.q
    public final java.lang.Object b(java.lang.Object r15, java.lang.Object r16, java.lang.Object r17) {
            r14 = this;
            int r0 = r14.f5413g
            switch(r0) {
                case 0: goto L119;
                case 1: goto Lcc;
                case 2: goto L8e;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r14.f5415i
            sh.x r0 = (sh.x) r0
            java.lang.Object r1 = r14.f5416j
            r3 = r1
            r.z r3 = (r.z) r3
            java.lang.Object r1 = r14.f5417k
            android.content.SharedPreferences r1 = (android.content.SharedPreferences) r1
            p.x0 r15 = (p.x0) r15
            r11 = r16
            i0.h0 r11 = (i0.h0) r11
            r2 = r17
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r15.getClass()
            r4 = r2 & 6
            if (r4 != 0) goto L31
            boolean r4 = r11.f(r15)
            if (r4 == 0) goto L2f
            r4 = 4
            goto L30
        L2f:
            r4 = 2
        L30:
            r2 = r2 | r4
        L31:
            r4 = r2 & 19
            r5 = 18
            r6 = 1
            if (r4 == r5) goto L3a
            r4 = r6
            goto L3b
        L3a:
            r4 = 0
        L3b:
            r2 = r2 & r6
            boolean r2 = r11.S(r2, r4)
            if (r2 == 0) goto L88
            p.a0 r2 = p.h1.f9915c
            m.a r0 = r0.f12897e
            r4 = 0
            y0.o r2 = r1.f.a(r2, r0, r4)
            float r0 = r15.c()
            r4 = 8
            float r4 = (float) r4
            float r0 = r0 + r4
            float r15 = r15.a()
            r4 = 84
            float r4 = (float) r4
            float r15 = r15 + r4
            r4 = 5
            p.z0 r4 = p.d.b(r0, r15, r4)
            boolean r15 = r11.h(r1)
            java.lang.Object r0 = r11.P()
            if (r15 != 0) goto L6e
            i0.e r15 = i0.l.f5952a
            if (r0 != r15) goto L79
        L6e:
            wb.g3 r0 = new wb.g3
            r15 = 1
            boolean r5 = r14.f5414h
            r0.<init>(r1, r5, r15)
            r11.k0(r0)
        L79:
            r10 = r0
            fg.l r10 = (fg.l) r10
            r12 = 0
            r13 = 504(0x1f8, float:7.06E-43)
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            a.a.b(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            goto L8b
        L88:
            r11.V()
        L8b:
            sf.n r15 = sf.n.f12433a
            return r15
        L8e:
            java.lang.Object r0 = r14.f5415i
            r1 = r0
            wb.s0 r1 = (wb.s0) r1
            java.lang.Object r0 = r14.f5416j
            r2 = r0
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r0 = r14.f5417k
            r4 = r0
            fg.a r4 = (fg.a) r4
            p.u r15 = (p.u) r15
            r5 = r16
            i0.h0 r5 = (i0.h0) r5
            r0 = r17
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r15.getClass()
            r15 = r0 & 17
            r3 = 16
            r6 = 1
            if (r15 == r3) goto Lb7
            r15 = r6
            goto Lb8
        Lb7:
            r15 = 0
        Lb8:
            r0 = r0 & r6
            boolean r15 = r5.S(r0, r15)
            if (r15 == 0) goto Lc6
            r6 = 0
            boolean r3 = r14.f5414h
            wb.ho.W1(r1, r2, r3, r4, r5, r6)
            goto Lc9
        Lc6:
            r5.V()
        Lc9:
            sf.n r15 = sf.n.f12433a
            return r15
        Lcc:
            java.lang.Object r0 = r14.f5415i
            r3 = r0
            fg.l r3 = (fg.l) r3
            java.lang.Object r0 = r14.f5416j
            r4 = r0
            java.util.List r4 = (java.util.List) r4
            java.lang.Object r0 = r14.f5417k
            r5 = r0
            fg.a r5 = (fg.a) r5
            r.d r15 = (r.d) r15
            r0 = r16
            i0.h0 r0 = (i0.h0) r0
            r1 = r17
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r15.getClass()
            r15 = r1 & 17
            r2 = 16
            r7 = 1
            if (r15 == r2) goto Lf5
            r15 = r7
            goto Lf6
        Lf5:
            r15 = 0
        Lf6:
            r1 = r1 & r7
            boolean r15 = r0.S(r1, r15)
            if (r15 == 0) goto L113
            sh.j r1 = new sh.j
            r2 = 3
            boolean r6 = r14.f5414h
            r1.<init>(r2, r3, r4, r5, r6)
            r15 = -122897600(0xfffffffff8acbb40, float:-2.802728E34)
            s0.d r15 = s0.i.e(r15, r1, r0)
            r1 = 48
            r2 = 0
            wb.ho.C3(r2, r15, r0, r1, r7)
            goto L116
        L113:
            r0.V()
        L116:
            sf.n r15 = sf.n.f12433a
            return r15
        L119:
            java.lang.Object r0 = r14.f5415i
            java.util.concurrent.atomic.AtomicBoolean r0 = (java.util.concurrent.atomic.AtomicBoolean) r0
            java.lang.Object r1 = r14.f5416j
            wb.kv r1 = (wb.kv) r1
            java.lang.Object r2 = r14.f5417k
            android.app.Activity r2 = (android.app.Activity) r2
            java.lang.Integer r15 = (java.lang.Integer) r15
            int r15 = r15.intValue()
            r3 = r16
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r4 = r17
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            r5 = 1
            r0.set(r5)
            if (r1 == 0) goto L144
            r1.close()
        L144:
            boolean r0 = r14.f5414h
            if (r0 == 0) goto L14b
            java.lang.String r0 = "原生群发"
            goto L14d
        L14b:
            java.lang.String r0 = "模块群发"
        L14d:
            java.lang.String r1 = "/"
            if (r4 == 0) goto L16c
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r0)
            java.lang.String r0 = " 已取消: "
            r4.append(r0)
            r4.append(r15)
            r4.append(r1)
            r4.append(r3)
            java.lang.String r15 = r4.toString()
            goto L1a3
        L16c:
            if (r15 != r3) goto L189
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r0)
            java.lang.String r0 = " 完成: "
            r4.append(r0)
            r4.append(r15)
            r4.append(r1)
            r4.append(r3)
            java.lang.String r15 = r4.toString()
            goto L1a3
        L189:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r0)
            java.lang.String r0 = " 部分失败: "
            r4.append(r0)
            r4.append(r15)
            r4.append(r1)
            r4.append(r3)
            java.lang.String r15 = r4.toString()
        L1a3:
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            c9.t r1 = new c9.t
            r3 = 7
            r1.<init>(r2, r15, r3)
            r0.post(r1)
            sf.n r15 = sf.n.f12433a
            return r15
    }
}
