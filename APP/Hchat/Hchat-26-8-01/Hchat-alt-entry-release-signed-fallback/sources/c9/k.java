package c9;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k implements fg.l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f1231g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f1232h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f1233i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f1234j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f1235k;

    public /* synthetic */ k(android.view.View r1, android.view.View r2, android.view.View r3, r9.d0 r4, android.view.ViewGroup r5) {
            r0 = this;
            r4 = 10
            r0.f1231g = r4
            r0.<init>()
            r0.f1233i = r1
            r0.f1235k = r2
            r0.f1232h = r3
            r0.f1234j = r5
            return
    }

    public /* synthetic */ k(fg.l r1, java.lang.Object r2, java.lang.String r3, java.lang.Object r4, int r5) {
            r0 = this;
            r0.f1231g = r5
            r0.f1233i = r1
            r0.f1232h = r2
            r0.f1235k = r3
            r0.f1234j = r4
            r0.<init>()
            return
    }

    public /* synthetic */ k(java.lang.Object r1, java.lang.Object r2, java.lang.Object r3, java.lang.Object r4, int r5) {
            r0 = this;
            r0.f1231g = r5
            r0.f1233i = r1
            r0.f1235k = r2
            r0.f1232h = r3
            r0.f1234j = r4
            r0.<init>()
            return
    }

    public /* synthetic */ k(java.lang.Object r1, java.lang.Object r2, boolean r3, java.lang.Object r4, java.lang.Object r5, int r6) {
            r0 = this;
            r0.f1231g = r6
            r0.f1235k = r1
            r0.f1233i = r2
            r0.f1232h = r4
            r0.f1234j = r5
            r0.<init>()
            return
    }

    public /* synthetic */ k(java.util.ArrayList r2, android.app.Activity r3, java.util.List r4, aa.c r5) {
            r1 = this;
            r0 = 1
            r1.f1231g = r0
            r1.<init>()
            r1.f1232h = r2
            r1.f1233i = r3
            r1.f1235k = r4
            r1.f1234j = r5
            return
    }

    public /* synthetic */ k(java.util.ArrayList r2, java.lang.String r3, c9.o2 r4, fg.l r5) {
            r1 = this;
            r0 = 2
            r1.f1231g = r0
            r1.<init>()
            r1.f1232h = r2
            r1.f1235k = r3
            r1.f1233i = r4
            r1.f1234j = r5
            return
    }

    private final java.lang.Object e(java.lang.Object r5) {
            r4 = this;
            java.lang.Object r0 = r4.f1233i
            u2.c r0 = (u2.c) r0
            java.lang.Object r1 = r4.f1235k
            i0.l2 r1 = (i0.l2) r1
            java.lang.Object r2 = r4.f1232h
            i0.l2 r2 = (i0.l2) r2
            java.lang.Object r3 = r4.f1234j
            i0.a1 r3 = (i0.a1) r3
            f1.d0 r5 = (f1.d0) r5
            r5.getClass()
            java.lang.Object r1 = r1.getValue()
            java.lang.Number r1 = (java.lang.Number) r1
            float r1 = r1.floatValue()
            r5.g(r1)
            java.lang.Object r1 = r2.getValue()
            java.lang.Number r1 = (java.lang.Number) r1
            float r1 = r1.floatValue()
            r5.q(r1)
            java.lang.Object r1 = r2.getValue()
            java.lang.Number r1 = (java.lang.Number) r1
            float r1 = r1.floatValue()
            r5.i(r1)
            java.lang.Object r1 = r3.getValue()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            r2 = 8
            if (r1 == 0) goto L50
            float r1 = (float) r2
            float r0 = r0.x0(r1)
            goto L51
        L50:
            r0 = 0
        L51:
            r5.c(r0)
            float r0 = (float) r2
            v.d r0 = v.e.a(r0)
            r5.Q0(r0)
            sf.n r5 = sf.n.f12433a
            return r5
    }

    private final java.lang.Object f(java.lang.Object r11) {
            r10 = this;
            java.lang.Object r0 = r10.f1233i
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r1 = r10.f1235k
            r4 = r1
            fg.l r4 = (fg.l) r4
            java.lang.Object r1 = r10.f1232h
            r6 = r1
            fg.l r6 = (fg.l) r6
            java.lang.Object r1 = r10.f1234j
            r7 = r1
            fg.l r7 = (fg.l) r7
            r.h r11 = (r.h) r11
            r11.getClass()
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
            r3 = r1
        L1e:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L4e
            java.lang.Object r1 = r0.next()
            int r8 = r3 + 1
            if (r3 < 0) goto L49
            r5 = r1
            wb.rt r5 = (wb.rt) r5
            long r1 = r5.f18955a
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            wb.fs r2 = new wb.fs
            r2.<init>(r3, r4, r5, r6, r7)
            s0.d r3 = new s0.d
            r5 = 615267004(0x24ac3abc, float:7.469261E-17)
            r9 = 1
            r3.<init>(r5, r2, r9)
            r2 = 2
            r.h.a(r11, r1, r3, r2)
            r3 = r8
            goto L1e
        L49:
            a.a.Q0()
            r11 = 0
            throw r11
        L4e:
            sf.n r11 = sf.n.f12433a
            return r11
    }

    @Override // fg.l
    public final java.lang.Object invoke(java.lang.Object r25) {
            r24 = this;
            r1 = r24
            int r0 = r1.f1231g
            r2 = 0
            r4 = 0
            r5 = 1
            r6 = 0
            switch(r0) {
                case 0: goto Lb7b;
                case 1: goto Lb1f;
                case 2: goto Lad7;
                case 3: goto Laba;
                case 4: goto La9d;
                case 5: goto La51;
                case 6: goto L97e;
                case 7: goto L865;
                case 8: goto L80a;
                case 9: goto L7b4;
                case 10: goto L782;
                case 11: goto L639;
                case 12: goto L5f4;
                case 13: goto L55a;
                case 14: goto L501;
                case 15: goto L4d5;
                case 16: goto L47c;
                case 17: goto L43d;
                case 18: goto L39a;
                case 19: goto L338;
                case 20: goto L302;
                case 21: goto L2d4;
                case 22: goto L2b4;
                case 23: goto L26b;
                case 24: goto L1f4;
                case 25: goto L12f;
                case 26: goto L8b;
                case 27: goto L86;
                case 28: goto L81;
                default: goto Lb;
            }
        Lb:
            java.lang.Object r0 = r1.f1233i
            i0.j1 r0 = (i0.j1) r0
            java.lang.Object r2 = r1.f1235k
            i0.j1 r2 = (i0.j1) r2
            java.lang.Object r3 = r1.f1232h
            i0.j1 r3 = (i0.j1) r3
            java.lang.Object r5 = r1.f1234j
            i0.j1 r5 = (i0.j1) r5
            r6 = r25
            java.lang.Long r6 = (java.lang.Long) r6
            long r6 = r6.longValue()
            java.lang.Object r8 = r0.getValue()
            java.util.List r8 = (java.util.List) r8
            java.util.Iterator r8 = r8.iterator()
        L2d:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L41
            java.lang.Object r9 = r8.next()
            r10 = r9
            wb.rt r10 = (wb.rt) r10
            long r10 = r10.f18955a
            int r10 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r10 != 0) goto L2d
            r4 = r9
        L41:
            wb.rt r4 = (wb.rt) r4
            if (r4 == 0) goto L7e
            java.lang.Object r8 = r0.getValue()
            java.util.List r8 = (java.util.List) r8
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.Iterator r8 = r8.iterator()
        L54:
            boolean r10 = r8.hasNext()
            if (r10 == 0) goto L6c
            java.lang.Object r10 = r8.next()
            r11 = r10
            wb.rt r11 = (wb.rt) r11
            long r11 = r11.f18955a
            int r11 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
            if (r11 != 0) goto L68
            goto L54
        L68:
            r9.add(r10)
            goto L54
        L6c:
            r0.setValue(r9)
            java.lang.String r0 = r4.f18956b
            r2.setValue(r0)
            java.util.List r0 = r4.f18957c
            r3.setValue(r0)
            fb.a1 r0 = r4.f18958d
            r5.setValue(r0)
        L7e:
            sf.n r0 = sf.n.f12433a
            return r0
        L81:
            java.lang.Object r0 = r24.f(r25)
            return r0
        L86:
            java.lang.Object r0 = r24.e(r25)
            return r0
        L8b:
            java.lang.Object r0 = r1.f1233i
            android.content.Context r0 = (android.content.Context) r0
            java.lang.Object r2 = r1.f1235k
            wb.v3 r2 = (wb.v3) r2
            java.lang.Object r3 = r1.f1232h
            i0.a1 r3 = (i0.a1) r3
            java.lang.Object r4 = r1.f1234j
            i0.a1 r4 = (i0.a1) r4
            r5 = r25
            n9.a r5 = (n9.a) r5
            r5.getClass()
            java.lang.String r7 = r5.f9069a
            java.lang.Object r8 = r3.getValue()
            java.util.List r8 = (java.util.List) r8
            if (r8 == 0) goto Lb3
            boolean r9 = r8.isEmpty()
            if (r9 == 0) goto Lb3
            goto Ldf
        Lb3:
            java.util.Iterator r8 = r8.iterator()
        Lb7:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto Ldf
            java.lang.Object r9 = r8.next()
            n9.a r9 = (n9.a) r9
            java.lang.String r10 = r9.f9069a
            boolean r10 = gg.l.a(r10, r7)
            if (r10 != 0) goto Lb7
            java.lang.String r9 = r9.f9070b
            java.lang.String r10 = r5.f9070b
            boolean r9 = og.t.X(r9, r10)
            if (r9 == 0) goto Lb7
            java.lang.String r2 = "标签名称已存在"
            android.widget.Toast r0 = android.widget.Toast.makeText(r0, r2, r6)
            r0.show()
            goto L12c
        Ldf:
            wb.s3 r2 = (wb.s3) r2
            boolean r2 = r2.f18985b
            if (r2 == 0) goto L111
            java.lang.Object r2 = r3.getValue()
            java.util.List r2 = (java.util.List) r2
            java.util.ArrayList r8 = new java.util.ArrayList
            int r9 = tf.n.e1(r2)
            r8.<init>(r9)
            java.util.Iterator r2 = r2.iterator()
        Lf8:
            boolean r9 = r2.hasNext()
            if (r9 == 0) goto L11b
            java.lang.Object r9 = r2.next()
            n9.a r9 = (n9.a) r9
            java.lang.String r10 = r9.f9069a
            boolean r10 = gg.l.a(r10, r7)
            if (r10 == 0) goto L10d
            r9 = r5
        L10d:
            r8.add(r9)
            goto Lf8
        L111:
            java.lang.Object r2 = r3.getValue()
            java.util.List r2 = (java.util.List) r2
            java.util.ArrayList r8 = tf.m.G1(r2, r5)
        L11b:
            wb.ho.e1(r0, r3, r8)
            java.lang.String r2 = "群聊标签已保存"
            android.widget.Toast r0 = android.widget.Toast.makeText(r0, r2, r6)
            r0.show()
            wb.u3 r0 = wb.u3.f19354a
            r4.setValue(r0)
        L12c:
            sf.n r0 = sf.n.f12433a
            return r0
        L12f:
            java.lang.Object r0 = r1.f1233i
            android.content.Context r0 = (android.content.Context) r0
            java.lang.Object r2 = r1.f1235k
            nb.z r2 = (nb.z) r2
            java.lang.Object r3 = r1.f1232h
            i0.a1 r3 = (i0.a1) r3
            java.lang.Object r4 = r1.f1234j
            i0.a1 r4 = (i0.a1) r4
            r7 = r25
            java.util.List r7 = (java.util.List) r7
            r7.getClass()
            java.util.ArrayList r8 = new java.util.ArrayList
            int r9 = tf.n.e1(r7)
            r8.<init>(r9)
            java.util.Iterator r7 = r7.iterator()
        L153:
            boolean r9 = r7.hasNext()
            if (r9 == 0) goto L165
            java.lang.Object r9 = r7.next()
            wb.s0 r9 = (wb.s0) r9
            java.lang.String r9 = r9.f18970a
            r8.add(r9)
            goto L153
        L165:
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r8 = r8.iterator()
        L16e:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L185
            java.lang.Object r9 = r8.next()
            r10 = r9
            java.lang.String r10 = (java.lang.String) r10
            boolean r10 = og.m.t0(r10)
            if (r10 != 0) goto L16e
            r7.add(r9)
            goto L16e
        L185:
            java.util.Set r7 = tf.m.U1(r7)
            r3.setValue(r7)
            r2.getClass()
            android.content.SharedPreferences r2 = r2.f9339a
            if (r2 == 0) goto L1e3
            android.content.SharedPreferences$Editor r2 = r2.edit()
            if (r2 == 0) goto L1e3
            java.lang.String r3 = "text_speech_allowed_contacts"
            org.json.JSONArray r8 = new org.json.JSONArray
            r8.<init>()
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            dg.n r9 = new dg.n
            r10 = 6
            r9.<init>(r7, r10)
            nb.x r7 = nb.x.f9337n
            ng.t r7 = ng.m.W(r9, r7)
            nb.y r9 = nb.y.f9338n
            r9.getClass()
            ng.i r10 = new ng.i
            r10.<init>(r7, r5, r9)
            ng.c r5 = ng.m.S(r10)
            java.util.Iterator r5 = r5.iterator()
        L1c0:
            r7 = r5
            tf.b r7 = (tf.b) r7
            boolean r9 = r7.hasNext()
            if (r9 == 0) goto L1d3
            java.lang.Object r7 = r7.next()
            java.lang.String r7 = (java.lang.String) r7
            r8.put(r7)
            goto L1c0
        L1d3:
            java.lang.String r5 = r8.toString()
            r5.getClass()
            android.content.SharedPreferences$Editor r2 = r2.putString(r3, r5)
            if (r2 == 0) goto L1e3
            r2.apply()
        L1e3:
            java.lang.String r2 = "允许名单已保存"
            android.widget.Toast r0 = android.widget.Toast.makeText(r0, r2, r6)
            r0.show()
            wb.hu r0 = wb.hu.f16689a
            r4.setValue(r0)
            sf.n r0 = sf.n.f12433a
            return r0
        L1f4:
            java.lang.Object r0 = r1.f1233i
            ka.g r0 = (ka.g) r0
            java.lang.Object r2 = r1.f1235k
            android.content.Context r2 = (android.content.Context) r2
            java.lang.Object r3 = r1.f1232h
            i0.a1 r3 = (i0.a1) r3
            java.lang.Object r4 = r1.f1234j
            i0.a1 r4 = (i0.a1) r4
            r5 = r25
            java.util.List r5 = (java.util.List) r5
            r5.getClass()
            java.util.ArrayList r7 = new java.util.ArrayList
            int r8 = tf.n.e1(r5)
            r7.<init>(r8)
            java.util.Iterator r5 = r5.iterator()
        L218:
            boolean r8 = r5.hasNext()
            if (r8 == 0) goto L22a
            java.lang.Object r8 = r5.next()
            wb.s0 r8 = (wb.s0) r8
            java.lang.String r8 = r8.f18970a
            r7.add(r8)
            goto L218
        L22a:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r7 = r7.iterator()
        L233:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L24a
            java.lang.Object r8 = r7.next()
            r9 = r8
            java.lang.String r9 = (java.lang.String) r9
            boolean r9 = og.m.t0(r9)
            if (r9 != 0) goto L233
            r5.add(r8)
            goto L233
        L24a:
            java.util.Set r5 = tf.m.U1(r5)
            r3.setValue(r5)
            java.lang.Object r3 = r3.getValue()
            java.util.Set r3 = (java.util.Set) r3
            r0.c(r3)
            java.lang.String r0 = "点歌范围已保存"
            android.widget.Toast r0 = android.widget.Toast.makeText(r2, r0, r6)
            r0.show()
            wb.fq r0 = wb.fq.f16251a
            r4.setValue(r0)
            sf.n r0 = sf.n.f12433a
            return r0
        L26b:
            java.lang.Object r0 = r1.f1233i
            r7 = r0
            v8.a r7 = (v8.a) r7
            java.lang.Object r0 = r1.f1235k
            android.content.Context r0 = (android.content.Context) r0
            java.lang.Object r2 = r1.f1232h
            i0.a1 r2 = (i0.a1) r2
            java.lang.Object r3 = r1.f1234j
            i0.a1 r3 = (i0.a1) r3
            r4 = r25
            java.util.List r4 = (java.util.List) r4
            r4.getClass()
            java.util.Set r12 = tf.m.U1(r4)
            r21 = 0
            r22 = 16351(0x3fdf, float:2.2913E-41)
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            v8.a r5 = v8.a.a(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r18, r19, r20, r21, r22)
            r2.setValue(r5)
            int r2 = r4.size()
            java.lang.String r4 = "已选择 "
            java.lang.String r5 = " 个群成员"
            wb.en.o(r4, r2, r5, r0, r6)
            wb.g r0 = wb.g.f16288i
            r3.setValue(r0)
            sf.n r0 = sf.n.f12433a
            return r0
        L2b4:
            java.lang.Object r0 = r1.f1233i
            fg.l r0 = (fg.l) r0
            java.lang.Object r2 = r1.f1235k
            android.content.SharedPreferences r2 = (android.content.SharedPreferences) r2
            java.lang.Object r3 = r1.f1232h
            i0.a1 r3 = (i0.a1) r3
            java.lang.Object r4 = r1.f1234j
            i0.a1 r4 = (i0.a1) r4
            r5 = r25
            eb.c0 r5 = (eb.c0) r5
            r5.getClass()
            wb.ho.H3(r2, r3, r4)
            r0.invoke(r5)
            sf.n r0 = sf.n.f12433a
            return r0
        L2d4:
            java.lang.Object r0 = r1.f1233i
            android.content.Context r0 = (android.content.Context) r0
            java.lang.Object r2 = r1.f1235k
            x9.e r2 = (x9.e) r2
            java.lang.Object r3 = r1.f1232h
            i0.a1 r3 = (i0.a1) r3
            java.lang.Object r4 = r1.f1234j
            i0.a1 r4 = (i0.a1) r4
            r5 = r25
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            tf.v r7 = tf.v.f13169g
            wb.ho.J1(r2, r3, r4, r5, r7)
            if (r5 == 0) goto L2f6
            java.lang.String r2 = "已清空仅生效名单"
            goto L2f8
        L2f6:
            java.lang.String r2 = "已清空排除名单"
        L2f8:
            android.widget.Toast r0 = android.widget.Toast.makeText(r0, r2, r6)
            r0.show()
            sf.n r0 = sf.n.f12433a
            return r0
        L302:
            java.lang.Object r0 = r1.f1233i
            r7 = r0
            android.content.SharedPreferences r7 = (android.content.SharedPreferences) r7
            java.lang.Object r0 = r1.f1235k
            r8 = r0
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r0 = r1.f1232h
            r9 = r0
            vb.a r9 = (vb.a) r9
            java.lang.Object r0 = r1.f1234j
            r10 = r0
            java.lang.String r10 = (java.lang.String) r10
            r0 = r25
            r.h r0 = (r.h) r0
            r0.getClass()
            s0.d r2 = wb.p0.f18311o0
            r3 = 3
            r.h.a(r0, r4, r2, r3)
            c9.k0 r6 = new c9.k0
            r11 = 21
            r6.<init>(r7, r8, r9, r10, r11)
            s0.d r2 = new s0.d
            r7 = -1087723475(0xffffffffbf2aa82d, float:-0.66662866)
            r2.<init>(r7, r6, r5)
            r.h.a(r0, r4, r2, r3)
            sf.n r0 = sf.n.f12433a
            return r0
        L338:
            java.lang.Object r0 = r1.f1233i
            wb.i5 r0 = (wb.i5) r0
            java.lang.Object r2 = r1.f1235k
            android.content.SharedPreferences r2 = (android.content.SharedPreferences) r2
            java.lang.Object r3 = r1.f1232h
            i0.a1 r3 = (i0.a1) r3
            java.lang.Object r5 = r1.f1234j
            i0.a1 r5 = (i0.a1) r5
            r6 = r25
            aa.a r6 = (aa.a) r6
            r6.getClass()
            aa.a r6 = wb.ho.t6(r6)
            java.lang.Object r7 = r3.getValue()
            java.util.List r7 = (java.util.List) r7
            int r7 = r7.size()
            int r0 = r0.f16718a
            if (r0 < 0) goto L371
            if (r0 >= r7) goto L371
            java.lang.Object r7 = r3.getValue()
            java.util.List r7 = (java.util.List) r7
            java.util.ArrayList r7 = tf.m.R1(r7)
            r7.remove(r0)
            goto L378
        L371:
            java.lang.Object r0 = r3.getValue()
            r7 = r0
            java.util.List r7 = (java.util.List) r7
        L378:
            java.util.List r0 = a.a.x0(r6)
            java.util.List r0 = wb.ho.s7(r7, r0)
            r3.setValue(r0)
            android.content.SharedPreferences$Editor r2 = r2.edit()
            java.lang.String r3 = "message_block_bindings"
            java.lang.String r0 = a2.a.e(r0)
            android.content.SharedPreferences$Editor r0 = r2.putString(r3, r0)
            r0.apply()
            r5.setValue(r4)
            sf.n r0 = sf.n.f12433a
            return r0
        L39a:
            java.lang.Object r0 = r1.f1233i
            wb.d6 r0 = (wb.d6) r0
            java.lang.Object r2 = r1.f1235k
            android.content.SharedPreferences r2 = (android.content.SharedPreferences) r2
            java.lang.Object r3 = r1.f1232h
            i0.a1 r3 = (i0.a1) r3
            java.lang.Object r5 = r1.f1234j
            i0.a1 r5 = (i0.a1) r5
            r6 = r25
            aa.h r6 = (aa.h) r6
            r6.getClass()
            java.lang.String r7 = r6.f142k
            java.util.Set r8 = r6.f141j
            java.lang.String r9 = r6.f133b
            r17 = r8
            java.lang.String r8 = r6.f132a
            java.lang.Object r10 = r3.getValue()
            java.util.List r10 = (java.util.List) r10
            int r10 = r10.size()
            int r0 = r0.f15616a
            if (r0 < 0) goto L3fd
            if (r0 >= r10) goto L3fd
            java.lang.Object r10 = r3.getValue()
            java.util.List r10 = (java.util.List) r10
            java.util.ArrayList r10 = tf.m.R1(r10)
            java.lang.String r12 = ""
            java.lang.String r13 = ""
            java.lang.String r14 = ""
            java.lang.String r15 = ""
            r11 = r10
            boolean r10 = r6.f134c
            boolean r6 = r6.f140i
            r17.getClass()
            r7.getClass()
            r18 = r7
            aa.h r7 = new aa.h
            r16 = r11
            r11 = 0
            r23 = r16
            r16 = r6
            r6 = r23
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r6.set(r0, r7)
            r10 = r6
            goto L423
        L3fd:
            r18 = r7
            java.lang.Object r0 = r3.getValue()
            java.util.List r0 = (java.util.List) r0
            java.lang.String r12 = ""
            java.lang.String r13 = ""
            java.lang.String r14 = ""
            java.lang.String r15 = ""
            boolean r10 = r6.f134c
            boolean r6 = r6.f140i
            r17.getClass()
            r18.getClass()
            aa.h r7 = new aa.h
            r11 = 0
            r16 = r6
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            java.util.ArrayList r10 = tf.m.G1(r0, r7)
        L423:
            r3.setValue(r10)
            android.content.SharedPreferences$Editor r0 = r2.edit()
            java.lang.String r2 = "message_block_templates"
            java.lang.String r3 = a2.a.g(r10)
            android.content.SharedPreferences$Editor r0 = r0.putString(r2, r3)
            r0.apply()
            r5.setValue(r4)
            sf.n r0 = sf.n.f12433a
            return r0
        L43d:
            java.lang.Object r0 = r1.f1233i
            android.app.Activity r0 = (android.app.Activity) r0
            java.lang.Object r2 = r1.f1235k
            wb.s0 r2 = (wb.s0) r2
            java.lang.Object r3 = r1.f1232h
            android.content.Context r3 = (android.content.Context) r3
            java.lang.Object r4 = r1.f1234j
            i0.a1 r4 = (i0.a1) r4
            r6 = r25
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            if (r6 != 0) goto L46b
            java.lang.String r2 = r2.f18970a
            wb.aj r3 = new wb.aj
            r6 = 15
            r3.<init>(r4, r6)
            d9.f r4 = d9.f.f2096a
            r2.getClass()
            d9.f r4 = d9.f.f2096a
            r4.b(r0, r3, r2, r5)
            goto L479
        L46b:
            java.lang.String r0 = r2.f18970a
            d9.o.g(r3, r0)
            java.lang.Object r0 = r4.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            p.a.u(r0, r5, r4)
        L479:
            sf.n r0 = sf.n.f12433a
            return r0
        L47c:
            java.lang.Object r0 = r1.f1233i
            c9.n0 r0 = (c9.n0) r0
            java.lang.Object r2 = r1.f1235k
            android.content.Context r2 = (android.content.Context) r2
            java.lang.Object r3 = r1.f1232h
            ba.n r3 = (ba.n) r3
            java.lang.Object r4 = r1.f1234j
            fg.a r4 = (fg.a) r4
            r7 = r25
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            if (r7 != 0) goto L49a
            r0.invoke()
            goto L4d0
        L49a:
            ba.r r0 = ba.r.f632a
            java.lang.Class<ba.r> r7 = ba.r.class
            monitor-enter(r7)
            r2.getClass()     // Catch: java.lang.Throwable -> L4bf
            r3.getClass()     // Catch: java.lang.Throwable -> L4bf
            java.util.concurrent.ConcurrentHashMap r0 = ba.r.f633b     // Catch: java.lang.Throwable -> L4bf
            r0.remove(r3)     // Catch: java.lang.Throwable -> L4bf
            ba.r r0 = ba.r.f632a     // Catch: java.lang.Throwable -> L4bf
            java.io.File r0 = ba.r.a(r2, r3)     // Catch: java.lang.Throwable -> L4bf
            boolean r3 = r0.exists()     // Catch: java.lang.Throwable -> L4bf
            if (r3 == 0) goto L4c1
            boolean r0 = r0.delete()     // Catch: java.lang.Throwable -> L4bf
            if (r0 == 0) goto L4bd
            goto L4c1
        L4bd:
            r5 = r6
            goto L4c1
        L4bf:
            r0 = move-exception
            goto L4d3
        L4c1:
            monitor-exit(r7)
            if (r5 == 0) goto L4d0
            r4.invoke()
            java.lang.String r0 = "已恢复微信气泡"
            android.widget.Toast r0 = android.widget.Toast.makeText(r2, r0, r6)
            r0.show()
        L4d0:
            sf.n r0 = sf.n.f12433a
            return r0
        L4d3:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L4bf
            throw r0
        L4d5:
            java.lang.Object r0 = r1.f1233i
            fg.l r0 = (fg.l) r0
            java.lang.Object r2 = r1.f1232h
            android.content.SharedPreferences r2 = (android.content.SharedPreferences) r2
            java.lang.Object r3 = r1.f1235k
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r4 = r1.f1234j
            i0.a1 r4 = (i0.a1) r4
            r5 = r25
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r6 = r5.intValue()
            r4.setValue(r5)
            r0.invoke(r5)
            android.content.SharedPreferences$Editor r0 = r2.edit()
            android.content.SharedPreferences$Editor r0 = r0.putInt(r3, r6)
            r0.apply()
            sf.n r0 = sf.n.f12433a
            return r0
        L501:
            java.lang.Object r0 = r1.f1233i
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r2 = r1.f1235k
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r3 = r1.f1232h
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r4 = r1.f1234j
            fg.l r4 = (fg.l) r4
            r5 = r25
            java.lang.String r5 = (java.lang.String) r5
            r5.getClass()
            boolean r6 = og.m.t0(r5)
            if (r6 == 0) goto L540
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r0 = r0.iterator()
        L527:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L554
            java.lang.Object r5 = r0.next()
            r6 = r5
            q9.h r6 = (q9.h) r6
            java.lang.String r6 = r6.f10768a
            boolean r6 = gg.l.a(r6, r2)
            if (r6 != 0) goto L527
            r3.add(r5)
            goto L527
        L540:
            boolean r6 = og.m.t0(r3)
            if (r6 == 0) goto L547
            r3 = r2
        L547:
            q9.h r6 = new q9.h
            r6.<init>(r2, r3, r5)
            java.util.List r2 = a.a.x0(r6)
            java.util.List r3 = wb.ho.r7(r0, r2)
        L554:
            r4.invoke(r3)
            sf.n r0 = sf.n.f12433a
            return r0
        L55a:
            java.lang.Object r0 = r1.f1233i
            wb.a1 r0 = (wb.a1) r0
            java.lang.Object r2 = r1.f1235k
            android.content.Context r2 = (android.content.Context) r2
            java.lang.Object r3 = r1.f1232h
            i0.a1 r3 = (i0.a1) r3
            java.lang.Object r4 = r1.f1234j
            i0.a1 r4 = (i0.a1) r4
            r5 = r25
            c9.a r5 = (c9.a) r5
            r5.getClass()
            wb.x0 r0 = (wb.x0) r0
            boolean r0 = r0.f20075b
            java.lang.Object r7 = r3.getValue()
            java.util.List r7 = (java.util.List) r7
            if (r7 == 0) goto L584
            boolean r8 = r7.isEmpty()
            if (r8 == 0) goto L584
            goto L5c4
        L584:
            java.util.Iterator r7 = r7.iterator()
        L588:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L5c4
            java.lang.Object r8 = r7.next()
            c9.a r8 = (c9.a) r8
            java.lang.String r9 = r8.f1081a
            java.lang.String r10 = r5.f1081a
            boolean r9 = gg.l.a(r9, r10)
            if (r9 != 0) goto L588
            java.lang.String r9 = r8.f1083c
            java.lang.String r10 = r5.f1083c
            boolean r9 = gg.l.a(r9, r10)
            if (r9 == 0) goto L588
            java.lang.String r8 = r8.f1082b
            java.lang.String r9 = r5.f1082b
            java.lang.CharSequence r9 = og.m.R0(r9)
            java.lang.String r9 = r9.toString()
            boolean r8 = og.t.X(r8, r9)
            if (r8 == 0) goto L588
            java.lang.String r0 = "同一层级已存在同名分组"
            android.widget.Toast r0 = android.widget.Toast.makeText(r2, r0, r6)
            r0.show()
            goto L5ea
        L5c4:
            if (r0 == 0) goto L5cb
            boolean r0 = c9.o2.u(r2, r5)
            goto L5cf
        L5cb:
            boolean r0 = c9.o2.b(r2, r5)
        L5cf:
            if (r0 == 0) goto L5d4
            java.lang.String r5 = "聊天分组已保存"
            goto L5d6
        L5d4:
            java.lang.String r5 = "聊天分组保存失败"
        L5d6:
            android.widget.Toast r5 = android.widget.Toast.makeText(r2, r5, r6)
            r5.show()
            if (r0 == 0) goto L5e9
            java.util.List r5 = c9.o2.i(r2)
            r3.setValue(r5)
            c9.d2.y(r2)
        L5e9:
            r6 = r0
        L5ea:
            if (r6 == 0) goto L5f1
            wb.y0 r0 = wb.y0.f20278a
            r4.setValue(r0)
        L5f1:
            sf.n r0 = sf.n.f12433a
            return r0
        L5f4:
            java.lang.Object r0 = r1.f1233i
            w.q0 r0 = (w.q0) r0
            java.lang.Object r2 = r1.f1235k
            n2.t r2 = (n2.t) r2
            java.lang.Object r3 = r1.f1232h
            n2.s r3 = (n2.s) r3
            java.lang.Object r4 = r1.f1234j
            n2.j r4 = (n2.j) r4
            r5 = r25
            i0.a0 r5 = (i0.a0) r5
            boolean r5 = r0.b()
            if (r5 == 0) goto L633
            b.e r5 = r0.f14603d
            w.w r6 = r0.f14621v
            w.w r7 = r0.f14622w
            gg.u r8 = new gg.u
            r8.<init>()
            b0.s r9 = new b0.s
            r10 = 23
            r9.<init>(r5, r6, r8, r10)
            n2.n r5 = r2.f8979a
            r5.a(r3, r4, r9, r7)
            n2.y r3 = new n2.y
            r3.<init>(r2, r5)
            java.util.concurrent.atomic.AtomicReference r2 = r2.f8980b
            r2.set(r3)
            r8.f4564g = r3
            r0.f14604e = r3
        L633:
            w.b0 r0 = new w.b0
            r0.<init>()
            return r0
        L639:
            java.lang.Object r0 = r1.f1233i
            fg.a r0 = (fg.a) r0
            java.lang.Object r4 = r1.f1235k
            sh.f0 r4 = (sh.f0) r4
            java.lang.Object r5 = r1.f1232h
            f1.r0 r5 = (f1.r0) r5
            java.lang.Object r6 = r1.f1234j
            u2.c r6 = (u2.c) r6
            r7 = r25
            x1.h0 r7 = (x1.h0) r7
            r7.getClass()
            java.lang.Object r0 = r0.invoke()
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
            boolean r8 = r4.f12577a
            boolean r4 = r4.f12578b
            h1.b r9 = r7.f20932g
            long r10 = r9.a()
            r12 = 4294967295(0xffffffff, double:2.1219957905E-314)
            if (r4 == 0) goto L677
            long r14 = r10 & r12
            int r14 = (int) r14
            float r14 = java.lang.Float.intBitsToFloat(r14)
            r15 = 1065353216(0x3f800000, float:1.0)
            float r15 = r15 - r0
            float r15 = r15 * r14
            goto L678
        L677:
            r15 = r2
        L678:
            if (r8 == 0) goto L687
            r16 = r4
            r14 = 1056964608(0x3f000000, float:0.5)
            long r3 = r10 & r12
            int r3 = (int) r3
            float r3 = java.lang.Float.intBitsToFloat(r3)
            float r3 = r3 * r0
            goto L6a0
        L687:
            r16 = r4
            r14 = 1056964608(0x3f000000, float:0.5)
            if (r16 == 0) goto L695
            long r3 = r10 & r12
            int r3 = (int) r3
            float r3 = java.lang.Float.intBitsToFloat(r3)
            goto L6a0
        L695:
            long r3 = r10 & r12
            int r3 = (int) r3
            float r3 = java.lang.Float.intBitsToFloat(r3)
            float r4 = r0 * r14
            float r4 = r4 + r14
            float r3 = r3 * r4
        L6a0:
            if (r8 != 0) goto L6b3
            if (r16 != 0) goto L6b3
            r16 = r12
            long r12 = r10 & r16
            int r4 = (int) r12
            float r4 = java.lang.Float.intBitsToFloat(r4)
            float r0 = r0 * r14
            float r0 = r14 - r0
            float r15 = r0 * r4
            goto L6b5
        L6b3:
            r16 = r12
        L6b5:
            float r3 = r3 - r15
            int r0 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r0 <= 0) goto L77f
            r0 = 32
            long r10 = r10 >> r0
            int r4 = (int) r10
            float r4 = java.lang.Float.intBitsToFloat(r4)
            int r4 = java.lang.Float.floatToRawIntBits(r4)
            long r10 = (long) r4
            int r3 = java.lang.Float.floatToRawIntBits(r3)
            long r3 = (long) r3
            long r10 = r10 << r0
            long r3 = r3 & r16
            long r3 = r3 | r10
            u2.m r0 = r7.getLayoutDirection()
            f1.c0 r0 = r5.a(r3, r0, r6)
            b5.c r3 = r9.f5038h
            java.lang.Object r3 = r3.f469a
            androidx.lifecycle.x r3 = (androidx.lifecycle.x) r3
            r3.c0(r2, r15)
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            boolean r4 = r0 instanceof f1.k0     // Catch: java.lang.Throwable -> L6f3
            if (r4 == 0) goto L6f6
            f1.j r4 = f1.l.a()     // Catch: java.lang.Throwable -> L6f3
            f1.k0 r0 = (f1.k0) r0     // Catch: java.lang.Throwable -> L6f3
            e1.c r0 = r0.f3073f     // Catch: java.lang.Throwable -> L6f3
            f1.j.b(r4, r0)     // Catch: java.lang.Throwable -> L6f3
            goto L70e
        L6f3:
            r0 = move-exception
            goto L774
        L6f6:
            boolean r4 = r0 instanceof f1.l0     // Catch: java.lang.Throwable -> L6f3
            if (r4 == 0) goto L706
            f1.j r4 = f1.l.a()     // Catch: java.lang.Throwable -> L6f3
            f1.l0 r0 = (f1.l0) r0     // Catch: java.lang.Throwable -> L6f3
            e1.d r0 = r0.f3074f     // Catch: java.lang.Throwable -> L6f3
            f1.j.c(r4, r0)     // Catch: java.lang.Throwable -> L6f3
            goto L70e
        L706:
            boolean r4 = r0 instanceof f1.j0     // Catch: java.lang.Throwable -> L6f3
            if (r4 == 0) goto L76e
            f1.j0 r0 = (f1.j0) r0     // Catch: java.lang.Throwable -> L6f3
            f1.j r4 = r0.f3071f     // Catch: java.lang.Throwable -> L6f3
        L70e:
            b5.c r5 = r9.f5038h     // Catch: java.lang.Throwable -> L6f3
            long r10 = r5.v()     // Catch: java.lang.Throwable -> L6f3
            f1.u r0 = r5.p()     // Catch: java.lang.Throwable -> L6f3
            r0.e()     // Catch: java.lang.Throwable -> L6f3
            java.lang.Object r0 = r5.f469a     // Catch: java.lang.Throwable -> L755
            androidx.lifecycle.x r0 = (androidx.lifecycle.x) r0     // Catch: java.lang.Throwable -> L755
            java.lang.Object r0 = r0.f310h     // Catch: java.lang.Throwable -> L755
            b5.c r0 = (b5.c) r0     // Catch: java.lang.Throwable -> L755
            f1.u r0 = r0.p()     // Catch: java.lang.Throwable -> L755
            r0.d(r4)     // Catch: java.lang.Throwable -> L755
            float r4 = -r15
            b5.c r0 = r9.f5038h     // Catch: java.lang.Throwable -> L755
            java.lang.Object r0 = r0.f469a     // Catch: java.lang.Throwable -> L755
            androidx.lifecycle.x r0 = (androidx.lifecycle.x) r0     // Catch: java.lang.Throwable -> L755
            r0.c0(r2, r4)     // Catch: java.lang.Throwable -> L755
            r7.e()     // Catch: java.lang.Throwable -> L757
            b5.c r0 = r9.f5038h     // Catch: java.lang.Throwable -> L755
            java.lang.Object r0 = r0.f469a     // Catch: java.lang.Throwable -> L755
            androidx.lifecycle.x r0 = (androidx.lifecycle.x) r0     // Catch: java.lang.Throwable -> L755
            float r2 = -r4
            r0.c0(r3, r2)     // Catch: java.lang.Throwable -> L755
            f1.u r0 = r5.p()     // Catch: java.lang.Throwable -> L6f3
            r0.p()     // Catch: java.lang.Throwable -> L6f3
            r5.U(r10)     // Catch: java.lang.Throwable -> L6f3
            b5.c r0 = r9.f5038h
            java.lang.Object r0 = r0.f469a
            androidx.lifecycle.x r0 = (androidx.lifecycle.x) r0
            r0.c0(r3, r4)
            goto L77f
        L755:
            r0 = move-exception
            goto L763
        L757:
            r0 = move-exception
            b5.c r2 = r9.f5038h     // Catch: java.lang.Throwable -> L755
            java.lang.Object r2 = r2.f469a     // Catch: java.lang.Throwable -> L755
            androidx.lifecycle.x r2 = (androidx.lifecycle.x) r2     // Catch: java.lang.Throwable -> L755
            float r4 = -r4
            r2.c0(r3, r4)     // Catch: java.lang.Throwable -> L755
            throw r0     // Catch: java.lang.Throwable -> L755
        L763:
            f1.u r2 = r5.p()     // Catch: java.lang.Throwable -> L6f3
            r2.p()     // Catch: java.lang.Throwable -> L6f3
            r5.U(r10)     // Catch: java.lang.Throwable -> L6f3
            throw r0     // Catch: java.lang.Throwable -> L6f3
        L76e:
            af.d r0 = new af.d     // Catch: java.lang.Throwable -> L6f3
            r0.<init>()     // Catch: java.lang.Throwable -> L6f3
            throw r0     // Catch: java.lang.Throwable -> L6f3
        L774:
            b5.c r2 = r9.f5038h
            java.lang.Object r2 = r2.f469a
            androidx.lifecycle.x r2 = (androidx.lifecycle.x) r2
            float r4 = -r15
            r2.c0(r3, r4)
            throw r0
        L77f:
            sf.n r0 = sf.n.f12433a
            return r0
        L782:
            java.lang.Object r0 = r1.f1233i
            android.view.View r0 = (android.view.View) r0
            java.lang.Object r2 = r1.f1235k
            android.view.View r2 = (android.view.View) r2
            java.lang.Object r3 = r1.f1232h
            android.view.View r3 = (android.view.View) r3
            java.lang.Object r4 = r1.f1234j
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            r7 = r25
            android.view.View r7 = (android.view.View) r7
            r7.getClass()
            if (r7 == r0) goto L7ae
            if (r7 == r2) goto L7ae
            if (r7 == r3) goto L7ae
            int r0 = r7.getVisibility()
            r2 = 8
            if (r0 == r2) goto L7ae
            boolean r0 = r9.d0.P(r7, r4)
            if (r0 == 0) goto L7ae
            goto L7af
        L7ae:
            r5 = r6
        L7af:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
            return r0
        L7b4:
            java.lang.Object r0 = r1.f1233i
            gg.r r0 = (gg.r) r0
            java.lang.Object r2 = r1.f1235k
            m.l1 r2 = (m.l1) r2
            java.lang.Object r3 = r1.f1232h
            m.m2 r3 = (m.m2) r3
            java.lang.Object r4 = r1.f1234j
            eb.o r4 = (eb.o) r4
            r5 = r25
            i.j r5 = (i.j) r5
            i0.j1 r6 = r5.f5698e
            java.lang.Object r6 = r6.getValue()
            java.lang.Number r6 = (java.lang.Number) r6
            float r6 = r6.floatValue()
            float r7 = r0.f4561g
            float r6 = r6 - r7
            boolean r7 = m.m1.a(r6)
            if (r7 != 0) goto L7f2
            float r2 = r2.e(r3, r6)
            float r2 = r6 - r2
            boolean r2 = m.m1.a(r2)
            if (r2 != 0) goto L7ed
            r5.a()
            goto L807
        L7ed:
            float r2 = r0.f4561g
            float r2 = r2 + r6
            r0.f4561g = r2
        L7f2:
            float r0 = r0.f4561g
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            java.lang.Object r0 = r4.invoke(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L807
            r5.a()
        L807:
            sf.n r0 = sf.n.f12433a
            return r0
        L80a:
            r14 = 1056964608(0x3f000000, float:0.5)
            java.lang.Object r0 = r1.f1233i
            gg.r r0 = (gg.r) r0
            java.lang.Object r2 = r1.f1235k
            m.k2 r2 = (m.k2) r2
            java.lang.Object r3 = r1.f1232h
            gg.r r3 = (gg.r) r3
            java.lang.Object r4 = r1.f1234j
            m.p r4 = (m.p) r4
            r5 = r25
            i.j r5 = (i.j) r5
            i0.j1 r6 = r5.f5698e
            java.lang.Object r6 = r6.getValue()
            java.lang.Number r6 = (java.lang.Number) r6
            float r6 = r6.floatValue()
            float r7 = r0.f4561g
            float r6 = r6 - r7
            float r2 = r2.a(r6)
            i0.j1 r7 = r5.f5698e
            java.lang.Object r7 = r7.getValue()
            java.lang.Number r7 = (java.lang.Number) r7
            float r7 = r7.floatValue()
            r0.f4561g = r7
            i.m1 r0 = r5.f5694a
            fg.l r0 = r0.f5731b
            i.q r7 = r5.f5699f
            java.lang.Object r0 = r0.invoke(r7)
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
            r3.f4561g = r0
            float r6 = r6 - r2
            float r0 = java.lang.Math.abs(r6)
            int r0 = (r0 > r14 ? 1 : (r0 == r14 ? 0 : -1))
            if (r0 <= 0) goto L85f
            r5.a()
        L85f:
            r4.getClass()
            sf.n r0 = sf.n.f12433a
            return r0
        L865:
            java.lang.Object r0 = r1.f1235k
            r9 = r0
            ia.q r9 = (ia.q) r9
            java.lang.Object r0 = r1.f1233i
            r10 = r0
            android.app.Activity r10 = (android.app.Activity) r10
            java.lang.Object r0 = r1.f1232h
            r11 = r0
            p8.l r11 = (p8.l) r11
            java.lang.Object r0 = r1.f1234j
            java.util.List r0 = (java.util.List) r0
            r2 = r25
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r3 = 7
            if (r2 != 0) goto L8c3
            r8 = r10
            java.lang.String r10 = r11.f10391a
            if (r10 == 0) goto L97b
            java.lang.String r0 = "选择评论好友"
            ia.j r7 = new ia.j
            r12 = 2
            r7.<init>(r8, r9, r10, r11, r12)
            android.content.SharedPreferences r2 = r9.f6624d
            java.lang.String r4 = "fake_comment_use_non_friends"
            boolean r10 = r2.getBoolean(r4, r6)
            if (r10 == 0) goto L89d
            java.lang.String r2 = "正在载入好友和非好友..."
            goto L89f
        L89d:
            java.lang.String r2 = "正在载入好友列表..."
        L89f:
            k.s1 r4 = new k.s1
            r4.<init>(r3)
            wb.kv r11 = wb.y2.X1(r8, r4, r0, r2)
            java.lang.Thread r0 = new java.lang.Thread
            r12 = r7
            ia.l r7 = new ia.l
            r13 = 0
            r23 = r9
            r9 = r8
            r8 = r23
            r7.<init>(r8, r9, r10, r11, r12, r13)
            java.lang.String r2 = "Hchat-MomentsFakeContacts"
            r0.<init>(r7, r2)
            r0.setDaemon(r5)
            r0.start()
            goto L97b
        L8c3:
            r8 = r10
            if (r5 > r2) goto L96a
            int r0 = r0.size()
            if (r2 > r0) goto L96a
            int r12 = r2 + (-1)
            java.lang.String r0 = r11.f10391a
            if (r0 == 0) goto L97b
            b5.c r4 = r9.f6621a
            ia.c r0 = r4.l(r0)
            java.util.List r0 = r0.f6559b
            java.lang.Object r4 = tf.m.w1(r12, r0)
            r13 = r4
            ia.b r13 = (ia.b) r13
            if (r13 == 0) goto L97b
            long r6 = r13.f6557e
            uf.c r4 = a.a.E()
            java.lang.String r10 = "修改评论内容"
            java.lang.String r14 = r13.f6556d
            sf.e r15 = new sf.e
            r15.<init>(r10, r14)
            r4.add(r15)
            java.lang.String r10 = "修改评论时间"
            java.lang.String r14 = ia.q.c(r6)
            sf.e r15 = new sf.e
            r15.<init>(r10, r14)
            r4.add(r15)
            if (r12 <= 0) goto L911
            java.lang.String r10 = "上移"
            java.lang.String r14 = "提前一位显示"
            sf.e r15 = new sf.e
            r15.<init>(r10, r14)
            r4.add(r15)
        L911:
            int r0 = r0.size()
            int r0 = r0 - r5
            if (r12 >= r0) goto L924
            java.lang.String r0 = "下移"
            java.lang.String r5 = "延后一位显示"
            sf.e r10 = new sf.e
            r10.<init>(r0, r5)
            r4.add(r10)
        L924:
            java.lang.String r0 = "删除伪评论"
            java.lang.String r5 = "恢复该位置的真实显示"
            sf.e r10 = new sf.e
            r10.<init>(r0, r5)
            r4.add(r10)
            uf.c r0 = a.a.t(r4)
            java.lang.String r4 = r9.a(r13)
            java.lang.String r5 = ia.q.c(r6)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r5)
            java.lang.String r5 = " · 第 "
            r6.append(r5)
            r6.append(r2)
            java.lang.String r2 = " 条"
            r6.append(r2)
            java.lang.String r2 = r6.toString()
            ia.o r14 = new ia.o
            r10 = r8
            r7 = r14
            r8 = r0
            r7.<init>(r8, r9, r10, r11, r12, r13)
            r13 = r8
            r8 = r10
            k.s1 r15 = new k.s1
            r15.<init>(r3)
            r12 = r2
            r11 = r4
            wb.y2.R1(r10, r11, r12, r13, r14, r15)
            goto L97b
        L96a:
            java.lang.String r0 = "清空伪评论"
            java.lang.String r2 = "清空后恢复该朋友圈的真实评论显示。"
            ia.m r4 = new ia.m
            r4.<init>(r5, r8, r9, r11)
            k.s1 r5 = new k.s1
            r5.<init>(r3)
            wb.y2.T1(r8, r0, r2, r4, r5)
        L97b:
            sf.n r0 = sf.n.f12433a
            return r0
        L97e:
            java.lang.Object r0 = r1.f1233i
            i0.a1 r0 = (i0.a1) r0
            java.lang.Object r3 = r1.f1235k
            i.g0 r3 = (i.g0) r3
            java.lang.Object r4 = r1.f1232h
            gg.r r4 = (gg.r) r4
            java.lang.Object r7 = r1.f1234j
            qg.t r7 = (qg.t) r7
            r8 = r25
            java.lang.Long r8 = (java.lang.Long) r8
            long r8 = r8.longValue()
            java.lang.Object r0 = r0.getValue()
            i0.l2 r0 = (i0.l2) r0
            if (r0 == 0) goto L9a9
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            long r10 = r0.longValue()
            goto L9aa
        L9a9:
            r10 = r8
        L9aa:
            long r12 = r3.f5664c
            j0.b r0 = r3.f5662a
            r14 = -9223372036854775808
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 == 0) goto L9c3
            float r12 = r4.f4561g
            wf.g r13 = r7.n()
            float r13 = i.d.n(r13)
            int r12 = (r12 > r13 ? 1 : (r12 == r13 ? 0 : -1))
            if (r12 != 0) goto L9c3
            goto L9df
        L9c3:
            r3.f5664c = r8
            java.lang.Object[] r8 = r0.f6671g
            int r9 = r0.f6673i
            r12 = r6
        L9ca:
            if (r12 >= r9) goto L9d5
            r13 = r8[r12]
            i.d0 r13 = (i.d0) r13
            r13.f5642l = r5
            int r12 = r12 + 1
            goto L9ca
        L9d5:
            wf.g r7 = r7.n()
            float r7 = i.d.n(r7)
            r4.f4561g = r7
        L9df:
            float r4 = r4.f4561g
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 != 0) goto L9fd
            java.lang.Object[] r2 = r0.f6671g
            int r0 = r0.f6673i
        L9e9:
            if (r6 >= r0) goto La4e
            r3 = r2[r6]
            i.d0 r3 = (i.d0) r3
            i.z0 r4 = r3.f5640j
            java.lang.Object r4 = r4.f5840c
            i0.j1 r7 = r3.f5639i
            r7.setValue(r4)
            r3.f5642l = r5
            int r6 = r6 + 1
            goto L9e9
        L9fd:
            long r7 = r3.f5664c
            long r10 = r10 - r7
            float r2 = (float) r10
            float r2 = r2 / r4
            long r7 = (long) r2
            java.lang.Object[] r2 = r0.f6671g
            int r0 = r0.f6673i
            r9 = r5
            r4 = r6
        La09:
            if (r4 >= r0) goto La43
            r10 = r2[r4]
            i.d0 r10 = (i.d0) r10
            boolean r11 = r10.f5641k
            if (r11 != 0) goto La3b
            i.g0 r11 = r10.f5644n
            i0.j1 r11 = r11.f5663b
            java.lang.Boolean r12 = java.lang.Boolean.FALSE
            r11.setValue(r12)
            boolean r11 = r10.f5642l
            if (r11 == 0) goto La24
            r10.f5642l = r6
            r10.f5643m = r7
        La24:
            long r11 = r10.f5643m
            long r11 = r7 - r11
            i.z0 r13 = r10.f5640j
            java.lang.Object r13 = r13.f(r11)
            i0.j1 r14 = r10.f5639i
            r14.setValue(r13)
            i.z0 r13 = r10.f5640j
            boolean r11 = r13.e(r11)
            r10.f5641k = r11
        La3b:
            boolean r10 = r10.f5641k
            if (r10 != 0) goto La40
            r9 = r6
        La40:
            int r4 = r4 + 1
            goto La09
        La43:
            r0 = r9 ^ 1
            i0.j1 r2 = r3.f5665d
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.setValue(r0)
        La4e:
            sf.n r0 = sf.n.f12433a
            return r0
        La51:
            java.lang.Object r0 = r1.f1233i
            i.c r0 = (i.c) r0
            java.lang.Object r2 = r1.f1235k
            i.l r2 = (i.l) r2
            java.lang.Object r3 = r1.f1232h
            fg.l r3 = (fg.l) r3
            java.lang.Object r4 = r1.f1234j
            gg.q r4 = (gg.q) r4
            r6 = r25
            i.j r6 = (i.j) r6
            i.l r7 = r0.f5604c
            i.d.q(r6, r7)
            i0.j1 r7 = r6.f5698e
            java.lang.Object r8 = r7.getValue()
            java.lang.Object r8 = i.c.a(r0, r8)
            java.lang.Object r7 = r7.getValue()
            boolean r7 = gg.l.a(r8, r7)
            if (r7 != 0) goto La95
            i.l r7 = r0.f5604c
            i0.j1 r7 = r7.f5719h
            r7.setValue(r8)
            i0.j1 r2 = r2.f5719h
            r2.setValue(r8)
            if (r3 == 0) goto La8f
            r3.invoke(r0)
        La8f:
            r6.a()
            r4.f4560g = r5
            goto La9a
        La95:
            if (r3 == 0) goto La9a
            r3.invoke(r0)
        La9a:
            sf.n r0 = sf.n.f12433a
            return r0
        La9d:
            java.lang.Object r0 = r1.f1233i
            wb.qb r0 = (wb.qb) r0
            java.lang.Object r2 = r1.f1232h
            gg.u r2 = (gg.u) r2
            java.lang.Object r3 = r1.f1235k
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r4 = r1.f1234j
            gg.u r4 = (gg.u) r4
            r5 = r25
            fb.p1 r5 = (fb.p1) r5
            r5.getClass()
            fb.u.L(r0, r2, r3, r4, r5)
            sf.n r0 = sf.n.f12433a
            return r0
        Laba:
            java.lang.Object r0 = r1.f1235k
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r2 = r1.f1233i
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r3 = r1.f1232h
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r4 = r1.f1234j
            java.lang.String r4 = (java.lang.String) r4
            r5 = r25
            j8.p r5 = (j8.p) r5
            boolean r0 = h.Hchat.hooks.items.script.ScriptWaBridge.d(r0, r2, r3, r4, r5)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        Lad7:
            java.lang.Object r0 = r1.f1232h
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.lang.Object r2 = r1.f1235k
            r8 = r2
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r2 = r1.f1233i
            r9 = r2
            c9.o2 r9 = (c9.o2) r9
            java.lang.Object r2 = r1.f1234j
            r10 = r2
            fg.l r10 = (fg.l) r10
            r2 = r25
            r.h r2 = (r.h) r2
            r2.getClass()
            java.util.Iterator r0 = r0.iterator()
        Laf5:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto Lb1c
            java.lang.Object r3 = r0.next()
            r7 = r3
            c9.c1 r7 = (c9.c1) r7
            java.lang.String r3 = r7.f1118a
            if (r3 == 0) goto Lb07
            goto Lb09
        Lb07:
            java.lang.String r3 = "__wechat_home__"
        Lb09:
            c9.k0 r6 = new c9.k0
            r11 = 0
            r6.<init>(r7, r8, r9, r10, r11)
            s0.d r4 = new s0.d
            r7 = -286165060(0xffffffffeef177bc, float:-3.7365319E28)
            r4.<init>(r7, r6, r5)
            r6 = 2
            r.h.a(r2, r3, r4, r6)
            goto Laf5
        Lb1c:
            sf.n r0 = sf.n.f12433a
            return r0
        Lb1f:
            java.lang.Object r0 = r1.f1232h
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.lang.Object r2 = r1.f1233i
            android.app.Activity r2 = (android.app.Activity) r2
            java.lang.Object r3 = r1.f1235k
            java.util.List r3 = (java.util.List) r3
            java.lang.Object r5 = r1.f1234j
            aa.c r5 = (aa.c) r5
            r6 = r25
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            java.lang.Object r0 = tf.m.w1(r6, r0)
            sf.e r0 = (sf.e) r0
            if (r0 == 0) goto Lb44
            java.lang.Object r0 = r0.f12418g
            r4 = r0
            java.lang.String r4 = (java.lang.String) r4
        Lb44:
            java.util.ArrayList r0 = new java.util.ArrayList
            int r6 = tf.n.e1(r3)
            r0.<init>(r6)
            java.util.Iterator r3 = r3.iterator()
        Lb51:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto Lb63
            java.lang.Object r6 = r3.next()
            wb.jv r6 = (wb.jv) r6
            java.lang.String r6 = r6.f17140a
            r0.add(r6)
            goto Lb51
        Lb63:
            boolean r0 = c9.o2.t(r2, r4, r0)
            android.os.Handler r3 = c9.b0.f1104a
            if (r0 == 0) goto Lb6e
            java.lang.String r3 = "会话已移动"
            goto Lb70
        Lb6e:
            java.lang.String r3 = "移动会话失败"
        Lb70:
            c9.b0.h(r2, r3)
            if (r0 == 0) goto Lb78
            r5.invoke()
        Lb78:
            sf.n r0 = sf.n.f12433a
            return r0
        Lb7b:
            java.lang.Object r0 = r1.f1233i
            android.app.Activity r0 = (android.app.Activity) r0
            java.lang.Object r2 = r1.f1235k
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r3 = r1.f1232h
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            java.lang.Object r4 = r1.f1234j
            aa.c r4 = (aa.c) r4
            r7 = r25
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 != 0) goto Lb96
            goto Lba9
        Lb96:
            android.os.Handler r7 = c9.b0.f1104a
            java.lang.String r7 = "批量删除消息"
            java.lang.String r8 = "正在清空聊天记录..."
            b0.s r9 = new b0.s
            r9.<init>(r0, r2, r3, r5)
            c9.l r2 = new c9.l
            r2.<init>(r4, r0, r6)
            c9.b0.d(r0, r7, r8, r9, r2)
        Lba9:
            sf.n r0 = sf.n.f12433a
            return r0
    }
}
