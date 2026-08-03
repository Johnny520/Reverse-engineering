package aa;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements fg.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f124g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f125h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f126i;

    public /* synthetic */ c(java.lang.Object r1, int r2, java.lang.Object r3) {
            r0 = this;
            r0.f124g = r2
            r0.f125h = r1
            r0.f126i = r3
            r0.<init>()
            return
    }

    public /* synthetic */ c(qg.t r2, fg.l r3) {
            r1 = this;
            r0 = 10
            r1.f124g = r0
            r1.<init>()
            r1.f125h = r2
            yf.i r3 = (yf.i) r3
            r1.f126i = r3
            return
    }

    public /* synthetic */ c(r8.g r2, fg.p r3) {
            r1 = this;
            r0 = 23
            r1.f124g = r0
            r1.<init>()
            r1.f126i = r2
            gg.j r3 = (gg.j) r3
            r1.f125h = r3
            return
    }

    private final java.lang.Object e() {
            r6 = this;
            java.lang.Object r0 = r6.f125h
            b9.a r0 = (b9.a) r0
            java.lang.Object r1 = r6.f126i
            r8.g r1 = (r8.g) r1
            r2 = 0
            java.lang.Object r3 = r0.f524f     // Catch: java.lang.Throwable -> L33
            na.e r3 = (na.e) r3     // Catch: java.lang.Throwable -> L33
            if (r3 == 0) goto L10
            goto L1d
        L10:
            na.e r3 = new na.e     // Catch: java.lang.Throwable -> L33
            android.content.Context r4 = r1.f11620a     // Catch: java.lang.Throwable -> L33
            java.lang.ClassLoader r5 = r1.f11622c     // Catch: java.lang.Throwable -> L33
            h.Hchat.dexkit.DexFinder r1 = r1.f11624e     // Catch: java.lang.Throwable -> L33
            r3.<init>(r4, r5, r1)     // Catch: java.lang.Throwable -> L33
            r0.f524f = r3     // Catch: java.lang.Throwable -> L33
        L1d:
            java.util.ArrayList r1 = r3.c()     // Catch: java.lang.Throwable -> L33
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L33
        L25:
            boolean r4 = r1.hasNext()     // Catch: java.lang.Throwable -> L33
            if (r4 == 0) goto L35
            java.lang.Object r4 = r1.next()     // Catch: java.lang.Throwable -> L33
            r0.j(r4)     // Catch: java.lang.Throwable -> L33
            goto L25
        L33:
            r1 = move-exception
            goto L56
        L35:
            h.Hchat.dexkit.DexFinder r1 = r3.f9109c     // Catch: java.lang.Throwable -> L33
            java.lang.Class<?> r3 = r1.receiveLuckyMoneyClass     // Catch: java.lang.Throwable -> L33
            r4 = 1
            if (r3 != 0) goto L43
            java.lang.Class<?> r3 = r1.receiveLuckyMoneyUnionClass     // Catch: java.lang.Throwable -> L33
            if (r3 == 0) goto L41
            goto L43
        L41:
            r3 = r2
            goto L44
        L43:
            r3 = r4
        L44:
            java.lang.Class<?> r5 = r1.openLuckyMoneyClass     // Catch: java.lang.Throwable -> L33
            if (r5 != 0) goto L4f
            java.lang.Class<?> r0 = r1.openLuckyMoneyUnionClass     // Catch: java.lang.Throwable -> L33
            if (r0 == 0) goto L4d
            goto L4f
        L4d:
            r0 = r2
            goto L50
        L4f:
            r0 = r4
        L50:
            if (r3 == 0) goto L5b
            if (r0 == 0) goto L5b
            r2 = r4
            goto L5b
        L56:
            java.lang.String r3 = "自动抢红包安装失败"
            r0.e(r3, r1)
        L5b:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            return r0
    }

    private final java.lang.Object f() {
            r8 = this;
            java.lang.Object r0 = r8.f125h
            p8.d0 r0 = (p8.d0) r0
            java.lang.Object r1 = r8.f126i
            p8.h r0 = r0.g()
            r2 = 0
            if (r0 == 0) goto Lc9
            if (r1 == 0) goto Lc4
            java.lang.Class r3 = r1.getClass()
            java.lang.String r3 = r3.getName()
            java.lang.String r4 = "com.tencent.mm.plugin.sns.storage.SnsInfo"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L21
            goto Lc4
        L21:
            java.lang.Object r3 = r0.k()
            if (r3 == 0) goto Lc4
            java.lang.reflect.Method r4 = r0.f10370j
            r5 = 0
            if (r4 == 0) goto L3b
            java.lang.Class r6 = r3.getClass()
            boolean r6 = p8.h.e(r6, r4)
            if (r6 == 0) goto L37
            goto L38
        L37:
            r4 = r5
        L38:
            if (r4 == 0) goto L3b
            goto L4e
        L3b:
            java.util.List r4 = p8.h.f10360o
            c9.k1 r6 = new c9.k1
            r7 = 10
            r6.<init>(r0, r3, r7)
            java.lang.String r7 = "sns_info_update_v1"
            java.lang.reflect.Method r4 = r0.f(r4, r6, r7)
            if (r4 == 0) goto Lc4
            r0.f10370j = r4
        L4e:
            java.lang.String r6 = "field_snsId"
            java.lang.Object r6 = h.Hchat.utils.KavaReflector.readField(r1, r6)
            if (r6 == 0) goto L57
            goto L5f
        L57:
            java.lang.String r6 = "snsId"
            java.lang.Object r6 = h.Hchat.utils.KavaReflector.readField(r1, r6)
            if (r6 == 0) goto Lc4
        L5f:
            boolean r7 = r6 instanceof java.lang.Number
            if (r7 == 0) goto L66
            r5 = r6
            java.lang.Number r5 = (java.lang.Number) r5
        L66:
            if (r5 == 0) goto L6d
            long r5 = r5.longValue()
            goto L7b
        L6d:
            java.lang.String r5 = r6.toString()
            java.lang.Long r5 = og.t.g0(r5)
            if (r5 == 0) goto Lc4
            long r5 = r5.longValue()
        L7b:
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch: java.lang.Throwable -> L92
            java.lang.Object[] r1 = new java.lang.Object[]{r5, r1}     // Catch: java.lang.Throwable -> L92
            java.lang.Object r1 = h.Hchat.utils.KavaReflector.invokeOrThrow(r4, r3, r1)     // Catch: java.lang.Throwable -> L92
            java.lang.Boolean r3 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L92
            boolean r1 = gg.l.a(r1, r3)     // Catch: java.lang.Throwable -> L92
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)     // Catch: java.lang.Throwable -> L92
            goto L99
        L92:
            r1 = move-exception
            sf.f r3 = new sf.f
            r3.<init>(r1)
            r1 = r3
        L99:
            java.lang.Throwable r3 = sf.g.b(r1)
            if (r3 == 0) goto Lb6
            p8.p r0 = r0.f10364d
            java.lang.String r3 = r3.getMessage()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "更新朋友圈缓存失败: "
            r4.<init>(r5)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            r0.invoke(r3)
        Lb6:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            boolean r3 = r1 instanceof sf.f
            if (r3 == 0) goto Lbd
            r1 = r0
        Lbd:
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r0 = r1.booleanValue()
            goto Lc5
        Lc4:
            r0 = r2
        Lc5:
            r1 = 1
            if (r0 != r1) goto Lc9
            r2 = r1
        Lc9:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            return r0
    }

    private final java.lang.Object g() {
            r4 = this;
            java.lang.Object r0 = r4.f125h
            android.widget.TextView r0 = (android.widget.TextView) r0
            java.lang.Object r1 = r4.f126i
            r9.d0 r1 = (r9.d0) r1
            android.view.ViewParent r2 = r0.getParent()
            if (r2 == 0) goto L1d
            java.lang.Object r2 = r0.getTag()
            java.lang.String r3 = "hchat_message_details_view"
            boolean r2 = gg.l.a(r2, r3)
            if (r2 == 0) goto L1d
            r1.e(r0)
        L1d:
            sf.n r0 = sf.n.f12433a
            return r0
    }

    @Override // fg.a
    public final java.lang.Object invoke() {
            r19 = this;
            r1 = r19
            int r0 = r1.f124g
            r2 = 2
            r3 = 0
            r4 = 0
            r5 = 1
            switch(r0) {
                case 0: goto L844;
                case 1: goto L833;
                case 2: goto L817;
                case 3: goto L807;
                case 4: goto L7af;
                case 5: goto L79a;
                case 6: goto L776;
                case 7: goto L769;
                case 8: goto L6cf;
                case 9: goto L68d;
                case 10: goto L67a;
                case 11: goto L58c;
                case 12: goto L569;
                case 13: goto L550;
                case 14: goto L537;
                case 15: goto L52b;
                case 16: goto L512;
                case 17: goto L4c6;
                case 18: goto L1ab;
                case 19: goto L15c;
                case 20: goto L13f;
                case 21: goto L12c;
                case 22: goto L127;
                case 23: goto L114;
                case 24: goto Lf8;
                case 25: goto Lf3;
                case 26: goto La7;
                case 27: goto La2;
                case 28: goto L92;
                default: goto Lb;
            }
        Lb:
            java.lang.Object r0 = r1.f125h
            r2 = r0
            s8.c r2 = (s8.c) r2
            java.lang.Object r0 = r1.f126i
            r6 = r0
            r8.g r6 = (r8.g) r6
            monitor-enter(r2)
            java.util.List r7 = r2.E(r6)     // Catch: java.lang.Throwable -> L46
            r2.r(r6)     // Catch: java.lang.Throwable -> L46
            r2.p(r6)     // Catch: java.lang.Throwable -> L46
            r2.q(r6, r7)     // Catch: java.lang.Throwable -> L46
            boolean r0 = r2.f12389j     // Catch: java.lang.Throwable -> L46
            if (r0 != 0) goto L79
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L46
            int r8 = tf.n.e1(r7)     // Catch: java.lang.Throwable -> L46
            r0.<init>(r8)     // Catch: java.lang.Throwable -> L46
            java.util.Iterator r8 = r7.iterator()     // Catch: java.lang.Throwable -> L46
        L34:
            boolean r9 = r8.hasNext()     // Catch: java.lang.Throwable -> L46
            if (r9 == 0) goto L48
            java.lang.Object r9 = r8.next()     // Catch: java.lang.Throwable -> L46
            s8.a r9 = (s8.a) r9     // Catch: java.lang.Throwable -> L46
            java.lang.reflect.Method r9 = r9.f12378a     // Catch: java.lang.Throwable -> L46
            r0.add(r9)     // Catch: java.lang.Throwable -> L46
            goto L34
        L46:
            r0 = move-exception
            goto L90
        L48:
            java.util.Iterator r8 = r0.iterator()     // Catch: java.lang.Throwable -> L46
            r9 = r4
        L4d:
            boolean r0 = r8.hasNext()     // Catch: java.lang.Throwable -> L46
            if (r0 == 0) goto L6c
            java.lang.Object r0 = r8.next()     // Catch: java.lang.Throwable -> L46
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0     // Catch: java.lang.Throwable -> L46
            r8.i r10 = r8.i.f11631b     // Catch: java.lang.Throwable -> L65
            s8.b r11 = new s8.b     // Catch: java.lang.Throwable -> L65
            r11.<init>(r2, r6, r5)     // Catch: java.lang.Throwable -> L65
            r10.b(r0, r11)     // Catch: java.lang.Throwable -> L65
            r9 = r5
            goto L4d
        L65:
            r0 = move-exception
            java.lang.String r10 = "防撤回入口Hook安装失败"
            r2.e(r10, r0)     // Catch: java.lang.Throwable -> L46
            goto L4d
        L6c:
            r2.f12389j = r9     // Catch: java.lang.Throwable -> L46
            boolean r0 = r7.isEmpty()     // Catch: java.lang.Throwable -> L46
            if (r0 == 0) goto L79
            java.lang.String r0 = "防撤回入口未找到"
            r2.e(r0, r3)     // Catch: java.lang.Throwable -> L46
        L79:
            boolean r0 = r2.f12389j     // Catch: java.lang.Throwable -> L46
            if (r0 == 0) goto L8a
            boolean r0 = r2.f12390k     // Catch: java.lang.Throwable -> L46
            if (r0 == 0) goto L8a
            boolean r0 = r2.f12391l     // Catch: java.lang.Throwable -> L46
            if (r0 != 0) goto L89
            boolean r0 = r2.f12392m     // Catch: java.lang.Throwable -> L46
            if (r0 == 0) goto L8a
        L89:
            r4 = r5
        L8a:
            monitor-exit(r2)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            return r0
        L90:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L46
            throw r0
        L92:
            java.lang.Object r0 = r1.f125h
            v0.f r0 = (v0.f) r0
            java.lang.Object r2 = r1.f126i
            v0.d r2 = (v0.d) r2
            s.x0 r3 = new s.x0
            tf.u r4 = tf.u.f13168g
            r3.<init>(r0, r4, r2)
            return r3
        La2:
            java.lang.Object r0 = r1.g()
            return r0
        La7:
            java.lang.Object r0 = r1.f125h
            r2 = r0
            qb.k r2 = (qb.k) r2
            java.lang.Object r0 = r1.f126i
            qb.i r0 = (qb.i) r0
            r2.getClass()
            java.io.File r4 = new java.io.File     // Catch: java.lang.Throwable -> Ld7
            java.io.File r5 = new java.io.File     // Catch: java.lang.Throwable -> Ld7
            java.io.File r6 = r2.n()     // Catch: java.lang.Throwable -> Ld7
            java.lang.String r7 = "Cache"
            r5.<init>(r6, r7)     // Catch: java.lang.Throwable -> Ld7
            java.lang.String r6 = "favorite_voice_preview.mp3"
            r4.<init>(r5, r6)     // Catch: java.lang.Throwable -> Ld7
            java.io.File r5 = new java.io.File     // Catch: java.lang.Throwable -> Ld7
            java.lang.String r0 = r0.f10829a     // Catch: java.lang.Throwable -> Ld7
            r5.<init>(r0)     // Catch: java.lang.Throwable -> Ld7
            boolean r0 = r2.E(r5, r4)     // Catch: java.lang.Throwable -> Ld7
            if (r0 == 0) goto Ld9
            java.lang.String r0 = r4.getAbsolutePath()     // Catch: java.lang.Throwable -> Ld7
            goto Le1
        Ld7:
            r0 = move-exception
            goto Ldb
        Ld9:
            r0 = r3
            goto Le1
        Ldb:
            sf.f r4 = new sf.f
            r4.<init>(r0)
            r0 = r4
        Le1:
            java.lang.Throwable r4 = sf.g.b(r0)
            if (r4 != 0) goto Le9
            r3 = r0
            goto Lf0
        Le9:
            ia.t r0 = r2.f10835b
            java.lang.String r2 = "收藏语音预览转码失败"
            r0.invoke(r2, r4)
        Lf0:
            java.lang.String r3 = (java.lang.String) r3
            return r3
        Lf3:
            java.lang.Object r0 = r1.f()
            return r0
        Lf8:
            java.lang.Object r0 = r1.f125h
            og.k r0 = (og.k) r0
            java.lang.Object r2 = r1.f126i
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r0.getClass()
            r2.getClass()
            java.util.regex.Pattern r0 = r0.f9833g
            java.util.regex.Matcher r0 = r0.matcher(r2)
            r0.getClass()
            og.i r0 = a7.a.b(r0, r4, r2)
            return r0
        L114:
            java.lang.Object r0 = r1.f126i
            r8.g r0 = (r8.g) r0
            java.lang.Object r2 = r1.f125h
            gg.j r2 = (gg.j) r2
            o9.c r3 = o9.c.f9620a
            boolean r0 = r3.c(r0, r5, r2)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L127:
            java.lang.Object r0 = r1.e()
            return r0
        L12c:
            java.lang.Object r0 = r1.f125h
            gg.u r0 = (gg.u) r0
            java.lang.Object r2 = r1.f126i
            k.i0 r2 = (k.i0) r2
            i0.u r3 = v1.z0.f14057a
            java.lang.Object r2 = x1.k.h(r2, r3)
            r0.f4564g = r2
            sf.n r0 = sf.n.f12433a
            return r0
        L13f:
            java.lang.Object r0 = r1.f125h
            k.o r0 = (k.o) r0
            java.lang.Object r2 = r1.f126i
            x1.h0 r2 = (x1.h0) r2
            f1.r0 r3 = r0.f7024x
            h1.b r4 = r2.f20932g
            long r4 = r4.a()
            u2.m r6 = r2.getLayoutDirection()
            f1.c0 r2 = r3.a(r4, r6, r2)
            r0.C = r2
            sf.n r0 = sf.n.f12433a
            return r0
        L15c:
            java.lang.Object r0 = r1.f125h
            r5 = r0
            ia.a0 r5 = (ia.a0) r5
            java.lang.Object r0 = r1.f126i
            r6 = r0
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r2 = r5.f6548k
            monitor-enter(r2)
            p8.f r0 = r5.m(r6)     // Catch: java.lang.Throwable -> L198
            java.lang.Object r7 = r0.f10353b     // Catch: java.lang.Throwable -> L198
            boolean r0 = r0.f10352a     // Catch: java.lang.Throwable -> L198
            if (r0 == 0) goto L19a
            if (r7 != 0) goto L176
            goto L19a
        L176:
            b5.c r0 = r5.f6539b     // Catch: java.lang.Throwable -> L198
            ia.c r0 = r0.l(r6)     // Catch: java.lang.Throwable -> L198
            ia.c r8 = r5.d(r0)     // Catch: java.lang.Throwable -> L198
            ia.c r9 = ia.a0.g(r0)     // Catch: java.lang.Throwable -> L198
            boolean r10 = r5.f()     // Catch: java.lang.Throwable -> L198
            boolean r11 = r5.e()     // Catch: java.lang.Throwable -> L198
            boolean r4 = r5.h(r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L198
            if (r4 == 0) goto L19a
            b5.c r7 = r5.f6539b     // Catch: java.lang.Throwable -> L198
            r7.a(r6, r0)     // Catch: java.lang.Throwable -> L198
            goto L19a
        L198:
            r0 = move-exception
            goto L1a9
        L19a:
            monitor-exit(r2)
            if (r4 == 0) goto L1a6
            android.app.Activity r0 = ia.a0.c()
            if (r0 == 0) goto L1a6
            r5.n(r0, r3)
        L1a6:
            sf.n r0 = sf.n.f12433a
            return r0
        L1a9:
            monitor-exit(r2)
            throw r0
        L1ab:
            java.lang.Object r0 = r1.f125h
            r8 = r0
            ia.u r8 = (ia.u) r8
            java.lang.Object r0 = r1.f126i
            r2 = r0
            r8.g r2 = (r8.g) r2
            p8.o r15 = r8.f6634g
            if (r15 == 0) goto L4c0
            p8.d0 r0 = h.Hchat.hooks.api.core.WeChatApis.snsApi()
            if (r0 == 0) goto L225
            p8.h r0 = r0.g()
            if (r0 == 0) goto L221
            java.lang.Object r6 = r0.k()
            if (r6 == 0) goto L221
            java.lang.reflect.Method r7 = r0.f10367g
            if (r7 == 0) goto L1de
            java.lang.Class r9 = r6.getClass()
            boolean r9 = p8.h.a(r9, r7)
            if (r9 == 0) goto L1da
            goto L1db
        L1da:
            r7 = r3
        L1db:
            if (r7 == 0) goto L1de
            goto L1f3
        L1de:
            java.lang.String r7 = "sns_info_get_by_id_v1"
            java.util.List r9 = p8.h.f10357l
            c9.k1 r10 = new c9.k1
            r11 = 15
            r10.<init>(r0, r6, r11)
            java.lang.reflect.Method r7 = r0.f(r9, r10, r7)
            if (r7 == 0) goto L1f2
            r0.f10367g = r7
            goto L1f3
        L1f2:
            r7 = r3
        L1f3:
            java.lang.reflect.Method r9 = r0.f10370j
            if (r9 == 0) goto L206
            java.lang.Class r10 = r6.getClass()
            boolean r10 = p8.h.e(r10, r9)
            if (r10 == 0) goto L202
            goto L203
        L202:
            r9 = r3
        L203:
            if (r9 == 0) goto L206
            goto L21b
        L206:
            java.lang.String r9 = "sns_info_update_v1"
            java.util.List r10 = p8.h.f10360o
            c9.k1 r11 = new c9.k1
            r12 = 16
            r11.<init>(r0, r6, r12)
            java.lang.reflect.Method r9 = r0.f(r10, r11, r9)
            if (r9 == 0) goto L21a
            r0.f10370j = r9
            goto L21b
        L21a:
            r9 = r3
        L21b:
            if (r7 == 0) goto L221
            if (r9 == 0) goto L221
            r0 = r5
            goto L222
        L221:
            r0 = r4
        L222:
            r16 = r0
            goto L227
        L225:
            r16 = r4
        L227:
            ia.h r0 = r8.f6633f
            if (r0 == 0) goto L237
            boolean r0 = r0.g()
            if (r0 != r5) goto L233
            r0 = r5
            goto L234
        L233:
            r0 = r4
        L234:
            r17 = r0
            goto L239
        L237:
            r17 = r4
        L239:
            ia.a0 r6 = r8.f6632e
            if (r6 == 0) goto L42d
            boolean r7 = r6.f6552o
            p8.d0 r0 = h.Hchat.hooks.api.core.WeChatApis.snsApi()
            if (r0 == 0) goto L3a1
            p8.x r9 = r0.h()
            if (r9 == 0) goto L39c
            monitor-enter(r9)
            java.lang.Object r0 = r9.f10439h     // Catch: java.lang.Throwable -> L29a
            boolean r10 = p8.x.a(r0)     // Catch: java.lang.Throwable -> L29a
            if (r10 == 0) goto L255
            goto L256
        L255:
            r0 = r3
        L256:
            if (r0 == 0) goto L25c
            monitor-exit(r9)
        L259:
            r3 = r0
            goto L39c
        L25c:
            android.content.Context r0 = r9.f10432a     // Catch: java.lang.Throwable -> L29a
            java.lang.ClassLoader r10 = r9.f10433b     // Catch: java.lang.Throwable -> L29a
            java.lang.String r0 = e8.b.g(r0, r10)     // Catch: java.lang.Throwable -> L29a
            android.content.SharedPreferences r10 = r9.f10436e     // Catch: java.lang.Throwable -> L29a
            java.lang.ClassLoader r11 = r9.f10433b     // Catch: java.lang.Throwable -> L29a
            java.lang.String r12 = "native_comment_guards_v2"
            java.util.List r10 = e8.b.f(r10, r0, r11, r12)     // Catch: java.lang.Throwable -> L29a
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L29a
            r11.<init>()     // Catch: java.lang.Throwable -> L29a
            java.util.Iterator r10 = r10.iterator()     // Catch: java.lang.Throwable -> L29a
        L277:
            boolean r12 = r10.hasNext()     // Catch: java.lang.Throwable -> L29a
            if (r12 == 0) goto L29d
            java.lang.Object r12 = r10.next()     // Catch: java.lang.Throwable -> L29a
            r13 = r12
            java.lang.reflect.Method r13 = (java.lang.reflect.Method) r13     // Catch: java.lang.Throwable -> L29a
            boolean r14 = p8.x.b(r13)     // Catch: java.lang.Throwable -> L29a
            if (r14 != 0) goto L293
            boolean r13 = p8.x.c(r13)     // Catch: java.lang.Throwable -> L29a
            if (r13 == 0) goto L291
            goto L293
        L291:
            r13 = r4
            goto L294
        L293:
            r13 = r5
        L294:
            if (r13 == 0) goto L277
            r11.add(r12)     // Catch: java.lang.Throwable -> L29a
            goto L277
        L29a:
            r0 = move-exception
            goto L39a
        L29d:
            java.util.HashSet r10 = new java.util.HashSet     // Catch: java.lang.Throwable -> L29a
            r10.<init>()     // Catch: java.lang.Throwable -> L29a
            java.util.ArrayList r12 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L29a
            r12.<init>()     // Catch: java.lang.Throwable -> L29a
            java.util.Iterator r11 = r11.iterator()     // Catch: java.lang.Throwable -> L29a
        L2ab:
            boolean r13 = r11.hasNext()     // Catch: java.lang.Throwable -> L29a
            if (r13 == 0) goto L2c6
            java.lang.Object r13 = r11.next()     // Catch: java.lang.Throwable -> L29a
            r14 = r13
            java.lang.reflect.Method r14 = (java.lang.reflect.Method) r14     // Catch: java.lang.Throwable -> L29a
            java.lang.String r14 = r14.toGenericString()     // Catch: java.lang.Throwable -> L29a
            boolean r14 = r10.add(r14)     // Catch: java.lang.Throwable -> L29a
            if (r14 == 0) goto L2ab
            r12.add(r13)     // Catch: java.lang.Throwable -> L29a
            goto L2ab
        L2c6:
            boolean r10 = p8.x.a(r12)     // Catch: java.lang.Throwable -> L29a
            if (r10 == 0) goto L2cd
            r3 = r12
        L2cd:
            if (r3 == 0) goto L2d4
            r9.f10439h = r3     // Catch: java.lang.Throwable -> L29a
            monitor-exit(r9)
            goto L39c
        L2d4:
            java.lang.reflect.Method r3 = r9.f()     // Catch: java.lang.Throwable -> L29a
            if (r3 == 0) goto L395
            java.lang.Class r3 = r3.getDeclaringClass()     // Catch: java.lang.Throwable -> L29a
            if (r3 == 0) goto L395
            java.util.List r3 = h.Hchat.utils.KavaReflector.declaredMethods(r3)     // Catch: java.lang.Throwable -> L29a
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L29a
            r10.<init>()     // Catch: java.lang.Throwable -> L29a
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L29a
        L2ed:
            boolean r11 = r3.hasNext()     // Catch: java.lang.Throwable -> L29a
            if (r11 == 0) goto L310
            java.lang.Object r11 = r3.next()     // Catch: java.lang.Throwable -> L29a
            r12 = r11
            java.lang.reflect.Method r12 = (java.lang.reflect.Method) r12     // Catch: java.lang.Throwable -> L29a
            boolean r13 = p8.x.b(r12)     // Catch: java.lang.Throwable -> L29a
            if (r13 != 0) goto L309
            boolean r12 = p8.x.c(r12)     // Catch: java.lang.Throwable -> L29a
            if (r12 == 0) goto L307
            goto L309
        L307:
            r12 = r4
            goto L30a
        L309:
            r12 = r5
        L30a:
            if (r12 == 0) goto L2ed
            r10.add(r11)     // Catch: java.lang.Throwable -> L29a
            goto L2ed
        L310:
            java.util.HashSet r3 = new java.util.HashSet     // Catch: java.lang.Throwable -> L29a
            r3.<init>()     // Catch: java.lang.Throwable -> L29a
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L29a
            r11.<init>()     // Catch: java.lang.Throwable -> L29a
            java.util.Iterator r10 = r10.iterator()     // Catch: java.lang.Throwable -> L29a
        L31e:
            boolean r12 = r10.hasNext()     // Catch: java.lang.Throwable -> L29a
            if (r12 == 0) goto L339
            java.lang.Object r12 = r10.next()     // Catch: java.lang.Throwable -> L29a
            r13 = r12
            java.lang.reflect.Method r13 = (java.lang.reflect.Method) r13     // Catch: java.lang.Throwable -> L29a
            java.lang.String r13 = r13.toGenericString()     // Catch: java.lang.Throwable -> L29a
            boolean r13 = r3.add(r13)     // Catch: java.lang.Throwable -> L29a
            if (r13 == 0) goto L31e
            r11.add(r12)     // Catch: java.lang.Throwable -> L29a
            goto L31e
        L339:
            boolean r3 = p8.x.a(r11)     // Catch: java.lang.Throwable -> L29a
            if (r3 != 0) goto L387
            android.content.SharedPreferences r3 = r9.f10436e     // Catch: java.lang.Throwable -> L29a
            java.lang.String r10 = "native_comment_guards_v2"
            java.lang.String r12 = "cache.key"
            r3.getClass()     // Catch: java.lang.Throwable -> L29a
            android.content.SharedPreferences$Editor r13 = r3.edit()     // Catch: java.lang.Throwable -> L366
            java.lang.String r14 = ""
            java.lang.String r3 = r3.getString(r12, r14)     // Catch: java.lang.Throwable -> L366
            boolean r3 = gg.l.a(r3, r0)     // Catch: java.lang.Throwable -> L366
            if (r3 != 0) goto L35f
            android.content.SharedPreferences$Editor r3 = r13.clear()     // Catch: java.lang.Throwable -> L366
            r3.putString(r12, r0)     // Catch: java.lang.Throwable -> L366
        L35f:
            android.content.SharedPreferences$Editor r0 = r13.remove(r10)     // Catch: java.lang.Throwable -> L366
            r0.apply()     // Catch: java.lang.Throwable -> L366
        L366:
            p8.p r0 = r9.f10435d     // Catch: java.lang.Throwable -> L29a
            int r3 = r11.size()     // Catch: java.lang.Throwable -> L29a
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L29a
            r10.<init>()     // Catch: java.lang.Throwable -> L29a
            java.lang.String r11 = "朋友圈评论保护入口不完整: count="
            r10.append(r11)     // Catch: java.lang.Throwable -> L29a
            r10.append(r3)     // Catch: java.lang.Throwable -> L29a
            java.lang.String r3 = r10.toString()     // Catch: java.lang.Throwable -> L29a
            r0.invoke(r3)     // Catch: java.lang.Throwable -> L29a
            tf.t r0 = tf.t.f13167g     // Catch: java.lang.Throwable -> L29a
            r9.f10439h = r0     // Catch: java.lang.Throwable -> L29a
            monitor-exit(r9)
            goto L259
        L387:
            e8.b r3 = e8.b.f2358a     // Catch: java.lang.Throwable -> L29a
            android.content.SharedPreferences r10 = r9.f10436e     // Catch: java.lang.Throwable -> L29a
            java.lang.String r12 = "native_comment_guards_v2"
            r3.j(r10, r0, r12, r11)     // Catch: java.lang.Throwable -> L29a
            r9.f10439h = r11     // Catch: java.lang.Throwable -> L29a
            monitor-exit(r9)
            r3 = r11
            goto L39c
        L395:
            tf.t r0 = tf.t.f13167g     // Catch: java.lang.Throwable -> L29a
            monitor-exit(r9)
            goto L259
        L39a:
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L29a
            throw r0
        L39c:
            if (r3 != 0) goto L3a1
            tf.t r0 = tf.t.f13167g
            r3 = r0
        L3a1:
            if (r3 != 0) goto L3a5
            tf.t r3 = tf.t.f13167g
        L3a5:
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L3b0
            r6.f6552o = r4
            r0 = r4
            goto L429
        L3b0:
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L3b8
        L3b6:
            r0 = r5
            goto L41b
        L3b8:
            java.util.Iterator r3 = r3.iterator()
        L3bc:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L3b6
            java.lang.Object r0 = r3.next()
            r9 = r0
            java.lang.reflect.Method r9 = (java.lang.reflect.Method) r9
            java.util.Set r10 = r6.f6544g
            boolean r0 = r10.add(r9)
            if (r0 != 0) goto L3d3
            r0 = r5
            goto L418
        L3d3:
            r8.i r0 = r8.i.f11631b     // Catch: java.lang.Throwable -> L3e8
            java.lang.reflect.Method r11 = h.Hchat.utils.KavaReflector.accessible(r9)     // Catch: java.lang.Throwable -> L3e8
            if (r11 == 0) goto L3dc
            goto L3dd
        L3dc:
            r11 = r9
        L3dd:
            ia.z r12 = new ia.z     // Catch: java.lang.Throwable -> L3e8
            r12.<init>(r6, r4)     // Catch: java.lang.Throwable -> L3e8
            r0.b(r11, r12)     // Catch: java.lang.Throwable -> L3e8
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L3e8
            goto L3ef
        L3e8:
            r0 = move-exception
            sf.f r11 = new sf.f
            r11.<init>(r0)
            r0 = r11
        L3ef:
            java.lang.Throwable r11 = sf.g.b(r0)
            if (r11 != 0) goto L3f6
            goto L412
        L3f6:
            r10.remove(r9)
            ab.b r0 = r6.f6541d
            java.lang.String r9 = r9.toGenericString()
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r12 = "安装朋友圈伪评论交互保护失败: "
            r10.<init>(r12)
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            r0.invoke(r9, r11)
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
        L412:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
        L418:
            if (r0 != 0) goto L3bc
            r0 = r4
        L41b:
            r6.f6552o = r0
            if (r0 == 0) goto L429
            if (r7 != 0) goto L429
            ia.x r3 = new ia.x
            r3.<init>(r6, r5)
            r6.r(r3)
        L429:
            if (r0 != r5) goto L42d
            r0 = r5
            goto L42e
        L42d:
            r0 = r4
        L42e:
            p8.d0 r3 = h.Hchat.hooks.api.core.WeChatApis.snsApi()
            if (r3 == 0) goto L43c
            boolean r3 = r3.i()
            if (r3 != r5) goto L43c
            r3 = r5
            goto L43d
        L43c:
            r3 = r4
        L43d:
            p8.j r6 = p8.j.f10380a
            r7 = r6
            ia.t r6 = new ia.t
            java.lang.Class<ia.u> r9 = ia.u.class
            java.lang.Class r9 = eh.a.i(r9)
            java.lang.String r10 = "logFeatureError"
            java.lang.String r11 = "logFeatureError(Ljava/lang/String;Ljava/lang/Throwable;)V"
            r13 = 0
            r14 = 0
            r12 = r7
            r7 = 2
            r18 = r12
            r12 = 0
            r4 = r18
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14)
            boolean r2 = r4.d(r2, r15, r6)
            if (r2 == 0) goto L466
            if (r3 == 0) goto L466
            if (r16 == 0) goto L466
            if (r17 == 0) goto L466
            r2 = r5
            goto L467
        L466:
            r2 = 0
        L467:
            ia.a0 r3 = r8.f6632e
            if (r3 == 0) goto L480
            boolean r4 = r3.f6551n
            if (r4 == r2) goto L471
            r4 = r5
            goto L472
        L471:
            r4 = 0
        L472:
            r3.f6551n = r2
            if (r2 == 0) goto L480
            if (r4 == 0) goto L480
            ia.x r4 = new ia.x
            r4.<init>(r3, r5)
            r3.r(r4)
        L480:
            if (r2 == 0) goto L4ba
            ia.a0 r3 = r8.f6632e
            if (r3 == 0) goto L4ba
            android.content.SharedPreferences r4 = r3.f6542e
            java.lang.String r6 = "pending_restore_all_v1"
            r7 = 0
            boolean r6 = r4.getBoolean(r6, r7)
            if (r6 != 0) goto L49c
            java.lang.String r8 = "pending_restore_likes_v1"
            boolean r8 = r4.getBoolean(r8, r7)
            if (r8 == 0) goto L49a
            goto L49c
        L49a:
            r8 = r7
            goto L49d
        L49c:
            r8 = r5
        L49d:
            if (r6 != 0) goto L4aa
            java.lang.String r6 = "pending_restore_comments_v1"
            boolean r4 = r4.getBoolean(r6, r7)
            if (r4 == 0) goto L4a8
            goto L4aa
        L4a8:
            r4 = 0
            goto L4ab
        L4aa:
            r4 = r5
        L4ab:
            if (r8 != 0) goto L4b0
            if (r4 != 0) goto L4b0
            goto L4ba
        L4b0:
            b0.d0 r6 = new b0.d0
            r7 = 21
            r6.<init>(r3, r7)
            r3.o(r8, r4, r6)
        L4ba:
            if (r2 == 0) goto L4c0
            if (r0 == 0) goto L4c0
            r4 = r5
            goto L4c1
        L4c0:
            r4 = 0
        L4c1:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            return r0
        L4c6:
            java.lang.Object r0 = r1.f125h
            f.l0 r0 = (f.l0) r0
            java.lang.Object r3 = r1.f126i
            i0.q r3 = (i0.q) r3
            java.lang.Object[] r4 = r0.f2856b
            long[] r0 = r0.f2855a
            int r5 = r0.length
            int r5 = r5 - r2
            if (r5 < 0) goto L50f
            r2 = 0
        L4d7:
            r6 = r0[r2]
            long r8 = ~r6
            r10 = 7
            long r8 = r8 << r10
            long r8 = r8 & r6
            r10 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r8 = r8 & r10
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 == 0) goto L50a
            int r8 = r2 - r5
            int r8 = ~r8
            int r8 = r8 >>> 31
            r9 = 8
            int r8 = 8 - r8
            r10 = 0
        L4f1:
            if (r10 >= r8) goto L508
            r11 = 255(0xff, double:1.26E-321)
            long r11 = r11 & r6
            r13 = 128(0x80, double:6.3E-322)
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 >= 0) goto L504
            int r11 = r2 << 3
            int r11 = r11 + r10
            r11 = r4[r11]
            r3.z(r11)
        L504:
            long r6 = r6 >> r9
            int r10 = r10 + 1
            goto L4f1
        L508:
            if (r8 != r9) goto L50f
        L50a:
            if (r2 == r5) goto L50f
            int r2 = r2 + 1
            goto L4d7
        L50f:
            sf.n r0 = sf.n.f12433a
            return r0
        L512:
            java.lang.Object r0 = r1.f125h
            b5.c r0 = (b5.c) r0
            java.lang.Object r2 = r1.f126i
            i0.s1 r2 = (i0.s1) r2
            java.lang.Object r0 = r0.f469a
            s0.a r0 = (s0.a) r0
            int r0 = r0.get()
            if (r0 == 0) goto L525
            goto L528
        L525:
            r2.invoke()
        L528:
            sf.n r0 = sf.n.f12433a
            return r0
        L52b:
            java.lang.Object r0 = r1.f125h
            sg.g r0 = (sg.g) r0
            java.lang.Object r2 = r1.f126i
            r0.p(r2)
            sf.n r0 = sf.n.f12433a
            return r0
        L537:
            java.lang.Object r0 = r1.f125h
            hb.r r0 = (hb.r) r0
            java.lang.Object r2 = r1.f126i
            hb.q r2 = (hb.q) r2
            java.lang.String r2 = r2.f5444a
            java.lang.Object r3 = r0.f5457d
            android.os.Handler r3 = (android.os.Handler) r3
            hb.o r4 = new hb.o
            r4.<init>(r0, r2, r5)
            r3.post(r4)
            sf.n r0 = sf.n.f12433a
            return r0
        L550:
            java.lang.Object r0 = r1.f125h
            hb.k r0 = (hb.k) r0
            java.lang.Object r2 = r1.f126i
            hb.i r2 = (hb.i) r2
            java.lang.String r2 = r2.f5394a
            android.os.Handler r3 = r0.f5420c
            a1.d r4 = new a1.d
            r5 = 17
            r4.<init>(r0, r5, r2)
            r3.post(r4)
            sf.n r0 = sf.n.f12433a
            return r0
        L569:
            java.lang.Object r0 = r1.f125h
            hb.c r0 = (hb.c) r0
            java.lang.Object r2 = r1.f126i
            hb.b r2 = (hb.b) r2
            java.lang.String r2 = r2.f5327a
            java.lang.Object r0 = r0.f5341j
            java.util.concurrent.ConcurrentHashMap r0 = (java.util.concurrent.ConcurrentHashMap) r0
            java.lang.Object r0 = r0.get(r2)
            hb.b r0 = (hb.b) r0
            if (r0 == 0) goto L589
            java.util.concurrent.atomic.AtomicBoolean r2 = r0.f5328b
            r2.set(r5)
            java.util.concurrent.CountDownLatch r0 = r0.f5329c
            r0.countDown()
        L589:
            sf.n r0 = sf.n.f12433a
            return r0
        L58c:
            java.lang.Object r0 = r1.f125h
            h0.d1 r0 = (h0.d1) r0
            java.lang.Object r4 = r1.f126i
            i0.a1 r4 = (i0.a1) r4
            java.lang.Object r4 = r4.getValue()
            u2.l r4 = (u2.l) r4
            long r6 = r4.f13353a
            e1.b r4 = r0.i()
            r8 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            if (r4 == 0) goto L674
            long r10 = r4.f2294a
            i2.g r4 = r0.m()
            if (r4 == 0) goto L674
            java.lang.String r4 = r4.f6314h
            int r4 = r4.length()
            if (r4 != 0) goto L5b9
            goto L674
        L5b9:
            i0.j1 r4 = r0.f4863q
            java.lang.Object r4 = r4.getValue()
            w.g0 r4 = (w.g0) r4
            r12 = -1
            if (r4 != 0) goto L5c6
            r4 = r12
            goto L5ce
        L5c6:
            int[] r13 = h0.f1.f4888a
            int r4 = r4.ordinal()
            r4 = r13[r4]
        L5ce:
            if (r4 == r12) goto L674
            r12 = 4294967295(0xffffffff, double:2.1219957905E-314)
            r14 = 32
            if (r4 == r5) goto L5ee
            if (r4 == r2) goto L5ee
            r5 = 3
            if (r4 != r5) goto L5e9
            n2.s r3 = r0.n()
            long r3 = r3.f8977b
            int r5 = i2.m0.f6359c
            long r3 = r3 & r12
        L5e7:
            int r3 = (int) r3
            goto L5f8
        L5e9:
            okio.a.k()
            goto L679
        L5ee:
            n2.s r3 = r0.n()
            long r3 = r3.f8977b
            int r5 = i2.m0.f6359c
            long r3 = r3 >> r14
            goto L5e7
        L5f8:
            w.q0 r4 = r0.f4850d
            if (r4 == 0) goto L674
            w.m1 r4 = r4.d()
            if (r4 != 0) goto L603
            goto L674
        L603:
            w.q0 r5 = r0.f4850d
            if (r5 == 0) goto L674
            w.x0 r5 = r5.f14600a
            i2.g r5 = r5.f14710a
            if (r5 != 0) goto L60e
            goto L674
        L60e:
            b5.k r0 = r0.f4848b
            r0.l(r3)
            java.lang.String r0 = r5.f6314h
            int r0 = r0.length()
            r5 = 0
            int r0 = r9.e0.r(r3, r5, r0)
            long r10 = r4.d(r10)
            long r10 = r10 >> r14
            int r3 = (int) r10
            float r3 = java.lang.Float.intBitsToFloat(r3)
            i2.k0 r4 = r4.f14569a
            i2.o r5 = r4.f6347b
            int r0 = r5.d(r0)
            float r10 = r4.e(r0)
            float r4 = r4.f(r0)
            float r11 = java.lang.Math.min(r10, r4)
            float r4 = java.lang.Math.max(r10, r4)
            float r4 = r9.e0.q(r3, r11, r4)
            r10 = 0
            boolean r10 = u2.l.a(r6, r10)
            if (r10 != 0) goto L65a
            float r3 = r3 - r4
            float r3 = java.lang.Math.abs(r3)
            long r6 = r6 >> r14
            int r6 = (int) r6
            int r6 = r6 / r2
            float r6 = (float) r6
            int r3 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r3 <= 0) goto L65a
            goto L674
        L65a:
            float r3 = r5.f(r0)
            float r0 = r5.b(r0)
            float r0 = r0 - r3
            float r2 = (float) r2
            float r0 = r0 / r2
            float r0 = r0 + r3
            int r2 = java.lang.Float.floatToRawIntBits(r4)
            long r2 = (long) r2
            int r0 = java.lang.Float.floatToRawIntBits(r0)
            long r4 = (long) r0
            long r2 = r2 << r14
            long r4 = r4 & r12
            long r8 = r2 | r4
        L674:
            e1.b r3 = new e1.b
            r3.<init>(r8)
        L679:
            return r3
        L67a:
            java.lang.Object r0 = r1.f125h
            qg.t r0 = (qg.t) r0
            java.lang.Object r2 = r1.f126i
            yf.i r2 = (yf.i) r2
            ci.c r4 = new ci.c
            r4.<init>(r2, r3)
            qg.v.q(r0, r3, r4, r5)
            sf.n r0 = sf.n.f12433a
            return r0
        L68d:
            java.lang.Object r0 = r1.f125h
            java.util.concurrent.atomic.AtomicBoolean r0 = (java.util.concurrent.atomic.AtomicBoolean) r0
            java.lang.Object r2 = r1.f126i
            java.lang.String r2 = (java.lang.String) r2
            boolean r0 = r0.get()
            if (r0 == 0) goto L6bb
            h.Hchat.crash.g r0 = h.Hchat.crash.g.f4581a
            java.io.File r0 = h.Hchat.crash.g.f4600t
            if (r0 == 0) goto L6b5
            boolean r0 = h.Hchat.crash.g.l(r0, r2)
            if (r0 == 0) goto L6bb
            java.io.File r0 = h.Hchat.crash.g.f4599s
            if (r0 == 0) goto L6af
            r0.delete()
            goto L6bb
        L6af:
            java.lang.String r0 = "pendingReportFile"
            gg.l.g(r0)
            throw r3
        L6b5:
            java.lang.String r0 = "lastReportFile"
            gg.l.g(r0)
            throw r3
        L6bb:
            h.Hchat.crash.g.f4593m = r3
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r3)
            h.Hchat.crash.g.f4594n = r0
            h.Hchat.crash.g.f4595o = r3
            java.util.concurrent.atomic.AtomicBoolean r0 = h.Hchat.crash.g.f4586f
            r5 = 0
            r0.set(r5)
            sf.n r0 = sf.n.f12433a
            return r0
        L6cf:
            java.lang.Object r0 = r1.f125h
            android.content.Context r0 = (android.content.Context) r0
            java.lang.Object r2 = r1.f126i
            java.lang.ClassLoader r2 = (java.lang.ClassLoader) r2
            java.util.HashSet r4 = fa.a.f3384f
            java.lang.String r4 = "[Hchat:MiniProgramSplashAds] 小程序进程开屏广告 Hook 安装失败: "
            java.lang.Class r6 = r2.getClass()
            java.lang.String r6 = r6.getName()
            int r7 = java.lang.System.identityHashCode(r2)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r6)
            java.lang.String r6 = "@"
            r8.append(r6)
            r8.append(r7)
            java.lang.String r6 = r8.toString()
            java.util.HashSet r7 = fa.a.f3384f
            monitor-enter(r7)
            boolean r8 = r7.contains(r6)     // Catch: java.lang.Throwable -> L75e
            if (r8 == 0) goto L707
            monitor-exit(r7)
            r4 = r5
            goto L762
        L707:
            java.lang.String r8 = "Hchat_skip_global_mini_program_splash_ads_method_cache"
            android.content.SharedPreferences r8 = ub.b.c(r0, r8)     // Catch: java.lang.Throwable -> L75e
            java.lang.String r9 = e8.b.g(r0, r2)     // Catch: java.lang.Throwable -> L75e
            java.lang.String r10 = "splash_ad_check_method"
            java.lang.reflect.Method r2 = e8.b.e(r8, r9, r2, r10)     // Catch: java.lang.Throwable -> L75e
            if (r2 == 0) goto L760
            boolean r8 = f8.i.b(r2)     // Catch: java.lang.Throwable -> L75e
            if (r8 == 0) goto L720
            r3 = r2
        L720:
            if (r3 == 0) goto L760
            r8.i r2 = r8.i.f11631b     // Catch: java.lang.Throwable -> L733
            ea.b r8 = new ea.b     // Catch: java.lang.Throwable -> L733
            r9 = 0
            r8.<init>(r0, r5, r9)     // Catch: java.lang.Throwable -> L733
            r2.b(r3, r8)     // Catch: java.lang.Throwable -> L733
            r7.add(r6)     // Catch: java.lang.Throwable -> L733
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L733
            goto L73a
        L733:
            r0 = move-exception
            sf.f r2 = new sf.f     // Catch: java.lang.Throwable -> L75e
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L75e
            r0 = r2
        L73a:
            java.lang.Throwable r2 = sf.g.b(r0)     // Catch: java.lang.Throwable -> L75e
            if (r2 != 0) goto L741
            goto L756
        L741:
            java.lang.String r0 = r2.getMessage()     // Catch: java.lang.Throwable -> L75e
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L75e
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L75e
            r3.append(r0)     // Catch: java.lang.Throwable -> L75e
            java.lang.String r0 = r3.toString()     // Catch: java.lang.Throwable -> L75e
            fb.v0.n(r0, r2)     // Catch: java.lang.Throwable -> L75e
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L75e
        L756:
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L75e
            boolean r4 = r0.booleanValue()     // Catch: java.lang.Throwable -> L75e
            monitor-exit(r7)
            goto L762
        L75e:
            r0 = move-exception
            goto L767
        L760:
            monitor-exit(r7)
            r4 = 0
        L762:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            return r0
        L767:
            monitor-exit(r7)
            throw r0
        L769:
            java.lang.Object r0 = r1.f125h
            h.Hchat.hooks.items.script.ScriptPluginBridge r0 = (h.Hchat.hooks.items.script.ScriptPluginBridge) r0
            java.lang.Object r2 = r1.f126i
            wb.dr r2 = (wb.dr) r2
            sf.n r0 = h.Hchat.hooks.items.script.ScriptPluginBridge.l(r0, r2)
            return r0
        L776:
            java.lang.Object r0 = r1.f125h
            android.content.Context r0 = (android.content.Context) r0
            java.lang.Object r2 = r1.f126i
            c9.d2.y(r0)
            c9.d2 r3 = c9.d2.f1137a
            c9.d2.A(r2, r0)
            c9.d2.B(r2)
            java.lang.String r0 = "adapter"
            java.lang.Object r0 = h.Hchat.utils.KavaReflector.readField(r2, r0)
            if (r0 == 0) goto L797
            java.lang.reflect.Method r2 = c9.d2.f1152p
            r7 = 0
            java.lang.Object[] r3 = new java.lang.Object[r7]
            h.Hchat.utils.KavaReflector.invokeSuccessfully(r2, r0, r3)
        L797:
            sf.n r0 = sf.n.f12433a
            return r0
        L79a:
            java.lang.Object r0 = r1.f125h
            android.app.Activity r0 = (android.app.Activity) r0
            java.lang.Object r2 = r1.f126i
            c9.u1 r2 = (c9.u1) r2
            c9.d2.y(r0)
            c9.d2 r3 = c9.d2.f1137a
            java.lang.Object r2 = r2.f1396d
            c9.d2.w(r2, r0)
            sf.n r0 = sf.n.f12433a
            return r0
        L7af:
            r7 = r4
            java.lang.Object r0 = r1.f125h
            android.content.Context r0 = (android.content.Context) r0
            java.lang.Object r2 = r1.f126i
            android.view.textclassifier.TextClassification r2 = (android.view.textclassifier.TextClassification) r2
            java.lang.String r3 = r2.getText()
            if (r3 == 0) goto L7c3
            int r4 = r3.hashCode()
            goto L7c4
        L7c3:
            r4 = r7
        L7c4:
            android.content.Intent r2 = r2.getIntent()
            r3 = 201326592(0xc000000, float:9.8607613E-32)
            android.app.PendingIntent r2 = android.app.PendingIntent.getActivity(r0, r4, r2, r3)
            int r0 = android.os.Build.VERSION.SDK_INT
            r3 = 34
            if (r0 < r3) goto L801
            android.app.ActivityOptions r0 = android.app.ActivityOptions.makeBasic()     // Catch: android.app.PendingIntent.CanceledException -> L7e4
            android.app.ActivityOptions r0 = b0.a0.a(r0)     // Catch: android.app.PendingIntent.CanceledException -> L7e4
            android.os.Bundle r0 = r0.toBundle()     // Catch: android.app.PendingIntent.CanceledException -> L7e4
            b0.a0.m(r2, r0)     // Catch: android.app.PendingIntent.CanceledException -> L7e4
            goto L804
        L7e4:
            r0 = move-exception
            java.lang.String r3 = "TextClassification"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "error sending pendingIntent: "
            r4.<init>(r5)
            r4.append(r2)
            java.lang.String r2 = " error: "
            r4.append(r2)
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            android.util.Log.e(r3, r0)
            goto L804
        L801:
            r2.send()
        L804:
            sf.n r0 = sf.n.f12433a
            return r0
        L807:
            java.lang.Object r0 = r1.f125h
            z.d r0 = (z.d) r0
            java.lang.Object r2 = r1.f126i
            z.g r2 = (z.g) r2
            fg.l r0 = r0.f22465d
            r0.invoke(r2)
            sf.n r0 = sf.n.f12433a
            return r0
        L817:
            java.lang.Object r0 = r1.f125h
            d0.d r0 = (d0.d) r0
            java.lang.Object r2 = r1.f126i
            fg.a r2 = (fg.a) r2
            java.lang.Object r2 = r2.invoke()
            v1.t r2 = (v1.t) r2
            long r2 = r0.E0(r2)
            long r2 = ig.a.W(r2)
            u2.j r0 = new u2.j
            r0.<init>(r2)
            return r0
        L833:
            java.lang.Object r0 = r1.f125h
            gg.u r0 = (gg.u) r0
            java.lang.Object r2 = r1.f126i
            fg.a r2 = (fg.a) r2
            java.lang.Object r2 = r2.invoke()
            r0.f4564g = r2
            sf.n r0 = sf.n.f12433a
            return r0
        L844:
            r7 = r4
            java.lang.Object r0 = r1.f125h
            aa.e r0 = (aa.e) r0
            java.lang.Object r2 = r1.f126i
            r8.g r2 = (r8.g) r2
            boolean r4 = r0.f131e
            if (r4 == 0) goto L854
            r4 = r5
            goto L8e6
        L854:
            k8.q r4 = h.Hchat.hooks.api.core.WeChatApis.messageParser()
            if (r4 == 0) goto L8e5
            h.Hchat.dexkit.DexFinder r6 = r2.f11624e
            java.util.List<java.lang.Class<?>> r6 = r6.addMsgClasses
            if (r6 == 0) goto L8e5
            boolean r8 = r6.isEmpty()
            if (r8 == 0) goto L868
            goto L8e5
        L868:
            java.util.Iterator r6 = r6.iterator()
            r8 = r7
        L86d:
            boolean r9 = r6.hasNext()
            if (r9 == 0) goto L8d2
            java.lang.Object r9 = r6.next()
            java.lang.Class r9 = (java.lang.Class) r9
            java.util.List r9 = h.Hchat.utils.KavaReflector.declaredMethods(r9)
            java.util.Iterator r9 = r9.iterator()
        L881:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L86d
            java.lang.Object r10 = r9.next()
            java.lang.reflect.Method r10 = (java.lang.reflect.Method) r10
            java.lang.Class r11 = r10.getReturnType()
            java.lang.Class r12 = java.lang.Void.TYPE
            boolean r11 = gg.l.a(r11, r12)
            if (r11 != 0) goto L89a
            goto L881
        L89a:
            java.lang.Class[] r11 = r10.getParameterTypes()
            if (r11 == 0) goto L8bc
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            int r13 = r11.length
            r14 = r7
        L8a7:
            if (r14 < r13) goto L8aa
            goto L8be
        L8aa:
            r15 = r11[r14]
            boolean r15 = k8.q.h(r15)
            if (r15 == 0) goto L8b9
            java.lang.Integer r15 = java.lang.Integer.valueOf(r14)
            r12.add(r15)
        L8b9:
            int r14 = r14 + 1
            goto L8a7
        L8bc:
            tf.t r12 = tf.t.f13167g
        L8be:
            boolean r11 = r12.isEmpty()
            if (r11 == 0) goto L8c5
            goto L881
        L8c5:
            r8.i r11 = r8.i.f11631b
            aa.d r13 = new aa.d
            r13.<init>(r2, r12, r0, r4)
            r11.b(r10, r13)
            int r8 = r8 + 1
            goto L881
        L8d2:
            if (r8 <= 0) goto L8d6
            r4 = r5
            goto L8d7
        L8d6:
            r4 = r7
        L8d7:
            r0.f131e = r4
            boolean r2 = r0.f131e
            if (r2 != 0) goto L8e2
            java.lang.String r2 = "AddMsg 屏蔽入口未找到"
            r0.e(r2, r3)
        L8e2:
            boolean r4 = r0.f131e
            goto L8e6
        L8e5:
            r4 = r7
        L8e6:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            return r0
    }
}
