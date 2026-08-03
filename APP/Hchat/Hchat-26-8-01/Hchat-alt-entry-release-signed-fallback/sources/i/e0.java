package i;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e0 implements fg.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f5656g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f5657h;

    public /* synthetic */ e0(java.lang.Object r1, int r2) {
            r0 = this;
            r0.f5656g = r2
            r0.f5657h = r1
            r0.<init>()
            return
    }

    private final java.lang.Object e() {
            r4 = this;
            java.lang.Object r0 = r4.f5657h
            b9.a r0 = (b9.a) r0
            java.lang.Object r0 = r0.f524f
            qa.f r0 = (qa.f) r0
            r1 = 0
            if (r0 == 0) goto L47
            monitor-enter(r0)
            boolean r2 = r0.f10792h     // Catch: java.lang.Throwable -> L14
            if (r2 != 0) goto L16
            r0.o()     // Catch: java.lang.Throwable -> L14
            goto L16
        L14:
            r1 = move-exception
            goto L45
        L16:
            boolean r2 = r0.f10793i     // Catch: java.lang.Throwable -> L14
            if (r2 != 0) goto L1d
            r0.p()     // Catch: java.lang.Throwable -> L14
        L1d:
            boolean r2 = r0.f10794j     // Catch: java.lang.Throwable -> L14
            if (r2 != 0) goto L24
            r0.n()     // Catch: java.lang.Throwable -> L14
        L24:
            boolean r2 = r0.f10795k     // Catch: java.lang.Throwable -> L14
            if (r2 != 0) goto L2b
            r0.m()     // Catch: java.lang.Throwable -> L14
        L2b:
            boolean r2 = r0.f10792h     // Catch: java.lang.Throwable -> L14
            r3 = 1
            if (r2 != 0) goto L3f
            boolean r2 = r0.f10793i     // Catch: java.lang.Throwable -> L14
            if (r2 != 0) goto L3f
            boolean r2 = r0.f10794j     // Catch: java.lang.Throwable -> L14
            if (r2 != 0) goto L3f
            boolean r2 = r0.f10795k     // Catch: java.lang.Throwable -> L14
            if (r2 == 0) goto L3d
            goto L3f
        L3d:
            r2 = r1
            goto L40
        L3f:
            r2 = r3
        L40:
            monitor-exit(r0)
            if (r2 != r3) goto L47
            r1 = r3
            goto L47
        L45:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            throw r1
        L47:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            return r0
    }

    private final java.lang.Object f() {
            r8 = this;
            java.lang.Object r0 = r8.f5657h
            rb.b r0 = (rb.b) r0
            rb.c r0 = r0.f11872e
            r1 = 0
            if (r0 == 0) goto L93
            monitor-enter(r0)
            boolean r2 = r0.f11880h     // Catch: java.lang.Throwable -> L90
            r3 = 1
            if (r2 == 0) goto L13
            monitor-exit(r0)
            r2 = r3
            goto L8c
        L13:
            java.lang.reflect.Constructor r2 = r0.h()     // Catch: java.lang.Throwable -> L30
            if (r2 == 0) goto L6d
            java.lang.reflect.Method r4 = r0.f(r2)     // Catch: java.lang.Throwable -> L30
            if (r4 == 0) goto L6a
            r0.g()     // Catch: java.lang.Throwable -> L30
            m8.a r5 = h.Hchat.hooks.api.core.WeChatApis.network()     // Catch: java.lang.Throwable -> L30
            if (r5 == 0) goto L32
            r8.g r6 = r0.f11873a     // Catch: java.lang.Throwable -> L30
            h.Hchat.dexkit.DexFinder r6 = r6.f11624e     // Catch: java.lang.Throwable -> L30
            r5.a(r6)     // Catch: java.lang.Throwable -> L30
            goto L32
        L30:
            r2 = move-exception
            goto L6f
        L32:
            r8.i r5 = r8.i.f11631b     // Catch: java.lang.Throwable -> L30
            b9.e r6 = new b9.e     // Catch: java.lang.Throwable -> L30
            r7 = 25
            r6.<init>(r0, r7)     // Catch: java.lang.Throwable -> L30
            r5.b(r4, r6)     // Catch: java.lang.Throwable -> L30
            r0.f11877e = r2     // Catch: java.lang.Throwable -> L30
            r0.f11880h = r3     // Catch: java.lang.Throwable -> L30
            rb.k r2 = r0.f11874b     // Catch: java.lang.Throwable -> L30
            java.lang.Object r4 = r2.f11907d     // Catch: java.lang.Throwable -> L30
            monitor-enter(r4)     // Catch: java.lang.Throwable -> L30
            r2.f11915l = r3     // Catch: java.lang.Throwable -> L62
            boolean r5 = r2.f11916m     // Catch: java.lang.Throwable -> L62
            if (r5 != 0) goto L64
            java.util.ArrayDeque r5 = r2.f11910g     // Catch: java.lang.Throwable -> L62
            boolean r5 = r5.isEmpty()     // Catch: java.lang.Throwable -> L62
            if (r5 == 0) goto L64
            java.util.ArrayList r5 = r2.f11911h     // Catch: java.lang.Throwable -> L62
            boolean r5 = r5.isEmpty()     // Catch: java.lang.Throwable -> L62
            if (r5 == 0) goto L64
            java.lang.String r5 = "等待检测"
            r2.f11917n = r5     // Catch: java.lang.Throwable -> L62
            goto L64
        L62:
            r2 = move-exception
            goto L68
        L64:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L30
            java.lang.Boolean r2 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L30
            goto L75
        L68:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L30
            throw r2     // Catch: java.lang.Throwable -> L30
        L6a:
            monitor-exit(r0)
        L6b:
            r2 = r1
            goto L8c
        L6d:
            monitor-exit(r0)
            goto L6b
        L6f:
            sf.f r4 = new sf.f     // Catch: java.lang.Throwable -> L90
            r4.<init>(r2)     // Catch: java.lang.Throwable -> L90
            r2 = r4
        L75:
            java.lang.Throwable r4 = sf.g.b(r2)     // Catch: java.lang.Throwable -> L90
            if (r4 != 0) goto L7c
            goto L85
        L7c:
            ia.t r2 = r0.f11875c     // Catch: java.lang.Throwable -> L90
            java.lang.String r5 = "僵尸粉检测 Hook 安装失败"
            r2.invoke(r5, r4)     // Catch: java.lang.Throwable -> L90
            java.lang.Boolean r2 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L90
        L85:
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: java.lang.Throwable -> L90
            boolean r2 = r2.booleanValue()     // Catch: java.lang.Throwable -> L90
            monitor-exit(r0)
        L8c:
            if (r2 != r3) goto L93
            r1 = r3
            goto L93
        L90:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L90
            throw r1
        L93:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            return r0
    }

    private final java.lang.Object g() {
            r8 = this;
            java.lang.Object r0 = r8.f5657h
            b9.a r0 = (b9.a) r0
            java.lang.Object r0 = r0.f524f
            s9.b r0 = (s9.b) r0
            r1 = 0
            if (r0 == 0) goto L67
            java.lang.String r2 = "[Hchat:HideChatAvatar] 安装聊天头像绑定 Hook 失败: "
            monitor-enter(r0)
            boolean r3 = r0.f12401g     // Catch: java.lang.Throwable -> L58
            r4 = 1
            if (r3 == 0) goto L16
            monitor-exit(r0)
            r2 = r4
            goto L61
        L16:
            java.lang.reflect.Method r3 = r0.c()     // Catch: java.lang.Throwable -> L58
            if (r3 == 0) goto L5a
            r8.i r5 = r8.i.f11631b     // Catch: java.lang.Throwable -> L2d
            b9.e r6 = new b9.e     // Catch: java.lang.Throwable -> L2d
            r7 = 26
            r6.<init>(r0, r7)     // Catch: java.lang.Throwable -> L2d
            r5.b(r3, r6)     // Catch: java.lang.Throwable -> L2d
            r0.f12401g = r4     // Catch: java.lang.Throwable -> L2d
            java.lang.Boolean r3 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L2d
            goto L34
        L2d:
            r3 = move-exception
            sf.f r5 = new sf.f     // Catch: java.lang.Throwable -> L58
            r5.<init>(r3)     // Catch: java.lang.Throwable -> L58
            r3 = r5
        L34:
            java.lang.Throwable r5 = sf.g.b(r3)     // Catch: java.lang.Throwable -> L58
            if (r5 != 0) goto L3b
            goto L50
        L3b:
            java.lang.String r3 = r5.getMessage()     // Catch: java.lang.Throwable -> L58
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L58
            r6.<init>(r2)     // Catch: java.lang.Throwable -> L58
            r6.append(r3)     // Catch: java.lang.Throwable -> L58
            java.lang.String r2 = r6.toString()     // Catch: java.lang.Throwable -> L58
            fb.v0.n(r2, r5)     // Catch: java.lang.Throwable -> L58
            java.lang.Boolean r3 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L58
        L50:
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch: java.lang.Throwable -> L58
            boolean r2 = r3.booleanValue()     // Catch: java.lang.Throwable -> L58
            monitor-exit(r0)
            goto L61
        L58:
            r1 = move-exception
            goto L65
        L5a:
            java.lang.String r2 = "[Hchat:HideChatAvatar] 定位聊天头像绑定方法失败"
            fb.v0.m(r2)     // Catch: java.lang.Throwable -> L58
            monitor-exit(r0)
            r2 = r1
        L61:
            if (r2 != r4) goto L67
            r1 = r4
            goto L67
        L65:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L58
            throw r1
        L67:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            return r0
    }

    private final java.lang.Object h() {
            r2 = this;
            java.lang.Object r0 = r2.f5657h
            sh.w1 r0 = (sh.w1) r0
            sh.x r0 = r0.f12892a
            if (r0 == 0) goto L13
            sh.e2 r0 = r0.f12893a
            if (r0 == 0) goto L13
            i0.f1 r0 = r0.f12574c
            float r0 = r0.g()
            goto L14
        L13:
            r0 = 0
        L14:
            boolean r1 = java.lang.Float.isNaN(r0)
            if (r1 == 0) goto L1c
            r0 = 0
            goto L20
        L1c:
            int r0 = ig.a.X(r0)
        L20:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            return r0
    }

    private final java.lang.Object i() {
            r6 = this;
            java.lang.Object r0 = r6.f5657h
            b9.a r0 = (b9.a) r0
            java.lang.Object r0 = r0.f524f
            b5.c r0 = (b5.c) r0
            r1 = 0
            if (r0 == 0) goto L60
            monitor-enter(r0)
            java.lang.Object r2 = r0.f469a     // Catch: java.lang.Throwable -> L4a
            r8.g r2 = (r8.g) r2     // Catch: java.lang.Throwable -> L4a
            i2.y r3 = new i2.y     // Catch: java.lang.Throwable -> L4a
            r4 = 23
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L4a
            java.util.List r2 = f8.i.k0(r2, r3)     // Catch: java.lang.Throwable -> L4a
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L4a
            r3 = r1
        L20:
            boolean r4 = r2.hasNext()     // Catch: java.lang.Throwable -> L4a
            if (r4 == 0) goto L4c
            java.lang.Object r4 = r2.next()     // Catch: java.lang.Throwable -> L4a
            java.lang.reflect.Method r4 = (java.lang.reflect.Method) r4     // Catch: java.lang.Throwable -> L4a
            java.lang.Object r5 = r0.f471c     // Catch: java.lang.Throwable -> L4a
            java.util.Set r5 = (java.util.Set) r5     // Catch: java.lang.Throwable -> L4a
            boolean r5 = r5.contains(r4)     // Catch: java.lang.Throwable -> L4a
            if (r5 == 0) goto L39
        L36:
            int r3 = r3 + 1
            goto L20
        L39:
            java.lang.Object r5 = r0.f471c     // Catch: java.lang.Throwable -> L4a
            java.util.Set r5 = (java.util.Set) r5     // Catch: java.lang.Throwable -> L4a
            boolean r5 = r5.add(r4)     // Catch: java.lang.Throwable -> L4a
            if (r5 == 0) goto L20
            boolean r4 = r0.x(r4)     // Catch: java.lang.Throwable -> L4a
            if (r4 == 0) goto L20
            goto L36
        L4a:
            r1 = move-exception
            goto L5e
        L4c:
            if (r3 != 0) goto L53
            java.lang.String r2 = "[Hchat:HideChatMenu] 定位或安装聊天长按菜单 Hook 失败"
            fb.v0.m(r2)     // Catch: java.lang.Throwable -> L4a
        L53:
            r2 = 1
            if (r3 <= 0) goto L58
            r3 = r2
            goto L59
        L58:
            r3 = r1
        L59:
            monitor-exit(r0)
            if (r3 != r2) goto L60
            r1 = r2
            goto L60
        L5e:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4a
            throw r1
        L60:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            return r0
    }

    private final java.lang.Object j() {
            r2 = this;
            java.lang.Object r0 = r2.f5657h
            u.d r0 = (u.d) r0
            fg.l r1 = r0.U
            boolean r0 = r0.T
            r0 = r0 ^ 1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1.invoke(r0)
            sf.n r0 = sf.n.f12433a
            return r0
    }

    private final java.lang.Object k() {
            r3 = this;
            java.lang.Object r0 = r3.f5657h
            u3.c r0 = (u3.c) r0
            androidx.lifecycle.s r1 = r0.f()
            u3.a r2 = new u3.a
            r2.<init>(r0)
            r1.a(r2)
            sf.n r0 = sf.n.f12433a
            return r0
    }

    @Override // fg.a
    public final java.lang.Object invoke() {
            r18 = this;
            r1 = r18
            int r0 = r1.f5656g
            switch(r0) {
                case 0: goto L932;
                case 1: goto L91a;
                case 2: goto L8c1;
                case 3: goto L85f;
                case 4: goto L5ed;
                case 5: goto L5d2;
                case 6: goto L56d;
                case 7: goto L4cd;
                case 8: goto L4c0;
                case 9: goto L4aa;
                case 10: goto L40b;
                case 11: goto L3f5;
                case 12: goto L3f0;
                case 13: goto L120;
                case 14: goto L10d;
                case 15: goto Lc6;
                case 16: goto Lc1;
                case 17: goto Lb3;
                case 18: goto L7c;
                case 19: goto L62;
                case 20: goto L5d;
                case 21: goto L49;
                case 22: goto L44;
                case 23: goto L3f;
                case 24: goto L3a;
                case 25: goto L31;
                case 26: goto L27;
                case 27: goto L22;
                case 28: goto L1d;
                default: goto L7;
            }
        L7:
            java.lang.Object r0 = r1.f5657h
            u9.c r0 = (u9.c) r0
            u9.h r0 = r0.f13541e
            if (r0 == 0) goto L17
            r2 = 1
            boolean r0 = r0.f(r2)
            if (r0 != r2) goto L17
            goto L18
        L17:
            r2 = 0
        L18:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            return r0
        L1d:
            java.lang.Object r0 = r1.k()
            return r0
        L22:
            java.lang.Object r0 = r1.j()
            return r0
        L27:
            java.lang.Object r0 = r1.f5657h
            th.i r0 = (th.i) r0
            r0.q1()
            sf.n r0 = sf.n.f12433a
            return r0
        L31:
            java.lang.Object r0 = r1.f5657h
            java.util.List r0 = (java.util.List) r0
            java.util.Iterator r0 = r0.iterator()
            return r0
        L3a:
            java.lang.Object r0 = r1.i()
            return r0
        L3f:
            java.lang.Object r0 = r1.f5657h
            e1.c r0 = (e1.c) r0
            return r0
        L44:
            java.lang.Object r0 = r1.h()
            return r0
        L49:
            java.lang.Object r0 = r1.f5657h
            i0.g1 r0 = (i0.g1) r0
            int r0 = r0.g()
            float r0 = (float) r0
            r2 = 0
            int r3 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r3 >= 0) goto L58
            r0 = r2
        L58:
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            return r0
        L5d:
            java.lang.Object r0 = r1.g()
            return r0
        L62:
            java.lang.Object r0 = r1.f5657h
            s3.e r0 = (s3.e) r0
            r3.c r2 = r3.c.f11340a
            tf.t r3 = tf.t.f13167g
            i0.j1 r4 = r0.f12360c
            r4.setValue(r2)
            i0.j1 r2 = r0.f12359b
            r2.setValue(r3)
            i0.j1 r0 = r0.f12361d
            r0.setValue(r3)
            sf.n r0 = sf.n.f12433a
            return r0
        L7c:
            java.lang.Object r0 = r1.f5657h
            s2.b r0 = (s2.b) r0
            i0.j1 r2 = r0.f12333i
            java.lang.Object r3 = r2.getValue()
            e1.e r3 = (e1.e) r3
            long r3 = r3.f2308a
            r5 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 != 0) goto L94
            goto La2
        L94:
            java.lang.Object r3 = r2.getValue()
            e1.e r3 = (e1.e) r3
            long r3 = r3.f2308a
            boolean r3 = e1.e.c(r3)
            if (r3 == 0) goto La4
        La2:
            r0 = 0
            goto Lb2
        La4:
            f1.p0 r0 = r0.f12331g
            java.lang.Object r2 = r2.getValue()
            e1.e r2 = (e1.e) r2
            long r2 = r2.f2308a
            android.graphics.Shader r0 = r0.b(r2)
        Lb2:
            return r0
        Lb3:
            java.lang.Object r0 = r1.f5657h
            s.z r0 = (s.z) r0
            s.w r0 = r0.f12155j
            if (r0 == 0) goto Lbe
            x1.k.l(r0)
        Lbe:
            sf.n r0 = sf.n.f12433a
            return r0
        Lc1:
            java.lang.Object r0 = r1.f()
            return r0
        Lc6:
            java.lang.Object r0 = r1.f5657h
            r9.a r0 = (r9.a) r0
            r9.d0 r2 = r0.f11633e
            r3 = 0
            if (r2 == 0) goto L108
            boolean r4 = r2.I()     // Catch: java.lang.Throwable -> Lf0
            boolean r0 = r2.H()     // Catch: java.lang.Throwable -> Lee
            if (r0 == 0) goto Ldb
            int r4 = r4 + 1
        Ldb:
            boolean r0 = r2.F()     // Catch: java.lang.Throwable -> Lee
            if (r0 == 0) goto Le3
            int r4 = r4 + 1
        Le3:
            boolean r0 = r2.G()     // Catch: java.lang.Throwable -> Lee
            if (r0 == 0) goto Leb
            int r4 = r4 + 1
        Leb:
            sf.n r0 = sf.n.f12433a     // Catch: java.lang.Throwable -> Lee
            goto Lf8
        Lee:
            r0 = move-exception
            goto Lf2
        Lf0:
            r0 = move-exception
            r4 = r3
        Lf2:
            sf.f r5 = new sf.f
            r5.<init>(r0)
            r0 = r5
        Lf8:
            java.lang.Throwable r0 = sf.g.b(r0)
            if (r0 == 0) goto L105
            ia.t r2 = r2.f11654b
            java.lang.String r5 = "Hchat扩展功能安装异常"
            r2.invoke(r5, r0)
        L105:
            if (r4 <= 0) goto L108
            r3 = 1
        L108:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            return r0
        L10d:
            java.lang.Object r0 = r1.f5657h
            java.util.concurrent.Callable r0 = (java.util.concurrent.Callable) r0
            java.lang.Object r0 = r0.call()
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            boolean r0 = gg.l.a(r0, r2)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L120:
            java.lang.Object r0 = r1.f5657h
            qb.a r0 = (qb.a) r0
            qb.k r2 = r0.f10797e
            if (r2 == 0) goto L3e9
            java.lang.Class<android.view.View> r4 = android.view.View.class
            java.util.concurrent.ConcurrentHashMap r5 = r2.f10840g
            ia.t r6 = r2.f10835b
            e8.b r7 = e8.b.f2358a
            android.content.SharedPreferences r8 = r2.f10838e
            java.lang.String r0 = r2.z()
            r8.g r9 = r2.f10834a
            java.lang.ClassLoader r10 = r9.f11622c
            java.lang.String r11 = "voice_menu_click"
            java.util.List r0 = e8.b.f(r8, r0, r10, r11)
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.util.Iterator r0 = r0.iterator()
        L149:
            boolean r13 = r0.hasNext()
            if (r13 == 0) goto L160
            java.lang.Object r13 = r0.next()
            r14 = r13
            java.lang.reflect.Method r14 = (java.lang.reflect.Method) r14
            boolean r14 = qb.k.t(r14)
            if (r14 == 0) goto L149
            r12.add(r13)
            goto L149
        L160:
            boolean r0 = r12.isEmpty()
            if (r0 != 0) goto L16a
            r16 = 0
            goto L25a
        L16a:
            org.luckypray.dexkit.DexKitBridge r0 = r9.f11623d     // Catch: java.lang.Throwable -> L210
            ch.e r12 = new ch.e     // Catch: java.lang.Throwable -> L210
            r12.<init>()     // Catch: java.lang.Throwable -> L210
            fh.k r14 = new fh.k     // Catch: java.lang.Throwable -> L210
            r14.<init>()     // Catch: java.lang.Throwable -> L210
            java.lang.String r15 = "ChattingItemVoice"
            r16 = 0
            java.lang.String r3 = "Retr_Msg_content"
            java.lang.String r13 = "Retr_Msg_Type"
            java.lang.String[] r3 = new java.lang.String[]{r15, r3, r13}     // Catch: java.lang.Throwable -> L1c5
            java.util.List r3 = a.a.y0(r3)     // Catch: java.lang.Throwable -> L1c5
            fh.k.u0(r14, r3)     // Catch: java.lang.Throwable -> L1c5
            r12.f1666h = r14     // Catch: java.lang.Throwable -> L1c5
            hh.p r0 = r0.findMethod(r12)     // Catch: java.lang.Throwable -> L1c5
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L1c5
            r3.<init>()     // Catch: java.lang.Throwable -> L1c5
            java.util.Iterator r12 = r0.iterator()     // Catch: java.lang.Throwable -> L1c5
        L198:
            boolean r0 = r12.hasNext()     // Catch: java.lang.Throwable -> L1c5
            if (r0 == 0) goto L1c7
            java.lang.Object r0 = r12.next()     // Catch: java.lang.Throwable -> L1c5
            hh.o r0 = (hh.o) r0     // Catch: java.lang.Throwable -> L1c5
            r0.getClass()     // Catch: java.lang.Throwable -> L1b0
            lh.d r0 = r0.p()     // Catch: java.lang.Throwable -> L1b0
            java.lang.reflect.Method r0 = r0.b(r10)     // Catch: java.lang.Throwable -> L1b0
            goto L1b7
        L1b0:
            r0 = move-exception
            sf.f r13 = new sf.f     // Catch: java.lang.Throwable -> L1c5
            r13.<init>(r0)     // Catch: java.lang.Throwable -> L1c5
            r0 = r13
        L1b7:
            boolean r13 = r0 instanceof sf.f     // Catch: java.lang.Throwable -> L1c5
            if (r13 == 0) goto L1bd
            r0 = 0
        L1bd:
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0     // Catch: java.lang.Throwable -> L1c5
            if (r0 == 0) goto L198
            r3.add(r0)     // Catch: java.lang.Throwable -> L1c5
            goto L198
        L1c5:
            r0 = move-exception
            goto L213
        L1c7:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L1c5
            r0.<init>()     // Catch: java.lang.Throwable -> L1c5
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L1c5
        L1d0:
            boolean r12 = r3.hasNext()     // Catch: java.lang.Throwable -> L1c5
            if (r12 == 0) goto L1e7
            java.lang.Object r12 = r3.next()     // Catch: java.lang.Throwable -> L1c5
            r13 = r12
            java.lang.reflect.Method r13 = (java.lang.reflect.Method) r13     // Catch: java.lang.Throwable -> L1c5
            boolean r13 = qb.k.t(r13)     // Catch: java.lang.Throwable -> L1c5
            if (r13 == 0) goto L1d0
            r0.add(r12)     // Catch: java.lang.Throwable -> L1c5
            goto L1d0
        L1e7:
            java.util.HashSet r3 = new java.util.HashSet     // Catch: java.lang.Throwable -> L1c5
            r3.<init>()     // Catch: java.lang.Throwable -> L1c5
            java.util.ArrayList r12 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L1c5
            r12.<init>()     // Catch: java.lang.Throwable -> L1c5
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L1c5
        L1f5:
            boolean r13 = r0.hasNext()     // Catch: java.lang.Throwable -> L1c5
            if (r13 == 0) goto L218
            java.lang.Object r13 = r0.next()     // Catch: java.lang.Throwable -> L1c5
            r14 = r13
            java.lang.reflect.Method r14 = (java.lang.reflect.Method) r14     // Catch: java.lang.Throwable -> L1c5
            java.lang.String r14 = r14.toGenericString()     // Catch: java.lang.Throwable -> L1c5
            boolean r14 = r3.add(r14)     // Catch: java.lang.Throwable -> L1c5
            if (r14 == 0) goto L1f5
            r12.add(r13)     // Catch: java.lang.Throwable -> L1c5
            goto L1f5
        L210:
            r0 = move-exception
            r16 = 0
        L213:
            sf.f r12 = new sf.f
            r12.<init>(r0)
        L218:
            java.lang.Throwable r0 = sf.g.b(r12)
            if (r0 != 0) goto L21f
            goto L226
        L21f:
            java.lang.String r3 = "转发语音DexKit定位失败"
            r6.invoke(r3, r0)
            tf.t r12 = tf.t.f13167g
        L226:
            java.util.List r12 = (java.util.List) r12
            boolean r0 = r12.isEmpty()
            if (r0 != 0) goto L236
            java.lang.String r0 = r2.z()
            r7.j(r8, r0, r11, r12)
            goto L25a
        L236:
            java.lang.String r0 = r2.z()
            java.lang.String r3 = "cache.key"
            android.content.SharedPreferences$Editor r7 = r8.edit()     // Catch: java.lang.Throwable -> L25a
            java.lang.String r13 = ""
            java.lang.String r8 = r8.getString(r3, r13)     // Catch: java.lang.Throwable -> L25a
            boolean r8 = gg.l.a(r8, r0)     // Catch: java.lang.Throwable -> L25a
            if (r8 != 0) goto L253
            android.content.SharedPreferences$Editor r8 = r7.clear()     // Catch: java.lang.Throwable -> L25a
            r8.putString(r3, r0)     // Catch: java.lang.Throwable -> L25a
        L253:
            android.content.SharedPreferences$Editor r0 = r7.remove(r11)     // Catch: java.lang.Throwable -> L25a
            r0.apply()     // Catch: java.lang.Throwable -> L25a
        L25a:
            boolean r0 = r12.isEmpty()
            if (r0 == 0) goto L266
            java.lang.String r0 = "转发语音定位菜单点击方法失败"
            r3 = 0
            r6.invoke(r0, r3)
        L266:
            java.util.Iterator r0 = r12.iterator()
            r3 = r16
        L26c:
            boolean r7 = r0.hasNext()
            if (r7 == 0) goto L329
            java.lang.Object r7 = r0.next()
            java.lang.reflect.Method r7 = (java.lang.reflect.Method) r7
            java.lang.Class r11 = r7.getDeclaringClass()
            r11.getClass()
            java.util.Collection r12 = r5.values()
            r12.getClass()
            java.lang.Iterable r12 = (java.lang.Iterable) r12
            java.util.Iterator r12 = r12.iterator()
        L28c:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L2a4
            java.lang.Object r13 = r12.next()
            r14 = r13
            java.lang.reflect.Method r14 = (java.lang.reflect.Method) r14
            java.lang.Class r14 = r14.getDeclaringClass()
            boolean r14 = gg.l.a(r14, r11)
            if (r14 == 0) goto L28c
            goto L2a5
        L2a4:
            r13 = 0
        L2a5:
            java.lang.reflect.Method r13 = (java.lang.reflect.Method) r13
            if (r13 == 0) goto L2ac
            r17 = 1
            goto L2fd
        L2ac:
            java.util.List r11 = h.Hchat.utils.KavaReflector.declaredMethods(r11)
            java.util.Iterator r11 = r11.iterator()
        L2b4:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L2f7
            java.lang.Object r12 = r11.next()
            r13 = r12
            java.lang.reflect.Method r13 = (java.lang.reflect.Method) r13
            java.lang.Class[] r14 = r13.getParameterTypes()
            java.lang.Class r15 = r13.getReturnType()
            r17 = 1
            java.lang.Class r8 = java.lang.Boolean.TYPE
            boolean r8 = gg.l.a(r15, r8)
            if (r8 == 0) goto L2b4
            int r8 = r13.getModifiers()
            boolean r8 = java.lang.reflect.Modifier.isStatic(r8)
            if (r8 != 0) goto L2b4
            int r8 = r14.length
            r13 = 3
            if (r13 > r8) goto L2b4
            r13 = 5
            if (r8 >= r13) goto L2b4
            java.lang.Class<android.view.MenuItem> r8 = android.view.MenuItem.class
            r13 = r14[r16]
            boolean r8 = r8.isAssignableFrom(r13)
            if (r8 != 0) goto L2b4
            r8 = r14[r17]
            boolean r8 = r4.isAssignableFrom(r8)
            if (r8 == 0) goto L2b4
            goto L2fa
        L2f7:
            r17 = 1
            r12 = 0
        L2fa:
            r13 = r12
            java.lang.reflect.Method r13 = (java.lang.reflect.Method) r13
        L2fd:
            if (r13 == 0) goto L323
            f9.d r8 = new f9.d
            r11 = 2
            r12 = r17
            r8.<init>(r12, r2, r11)
            boolean r8 = r2.o(r13, r8)
            if (r8 == 0) goto L30f
            int r3 = r3 + 1
        L30f:
            f9.d r8 = new f9.d
            r11 = 2
            r12 = r16
            r8.<init>(r12, r2, r11)
            boolean r8 = r2.o(r7, r8)
            if (r8 == 0) goto L325
            r5.put(r7, r13)
            int r3 = r3 + 1
            goto L325
        L323:
            r12 = r16
        L325:
            r16 = r12
            goto L26c
        L329:
            r12 = r16
            r7 = 1
            java.util.ArrayList r0 = j8.a.g(r9, r7, r6)
            java.util.Iterator r0 = r0.iterator()
        L334:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L34f
            java.lang.Object r5 = r0.next()
            java.lang.reflect.Method r5 = (java.lang.reflect.Method) r5
            qb.j r7 = new qb.j
            r8 = 1
            r7.<init>(r2, r8)
            boolean r5 = r2.o(r5, r7)
            if (r5 == 0) goto L334
            int r3 = r3 + 1
            goto L334
        L34f:
            r7 = 1
            java.util.ArrayList r0 = j8.a.f(r9, r7, r6)
            java.util.Iterator r0 = r0.iterator()
        L358:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L373
            java.lang.Object r5 = r0.next()
            java.lang.reflect.Method r5 = (java.lang.reflect.Method) r5
            qb.j r7 = new qb.j
            r8 = 0
            r7.<init>(r2, r8)
            boolean r5 = r2.o(r5, r7)
            if (r5 == 0) goto L358
            int r3 = r3 + 1
            goto L358
        L373:
            java.lang.String r0 = "com.tencent.mm.plugin.fav.ui.FavSelectUI"
            java.lang.Class r0 = h.Hchat.utils.KavaReflector.loadClass(r0, r10)
            if (r0 == 0) goto L39e
            java.lang.String r5 = "onItemClick"
            java.lang.Class<android.widget.AdapterView> r7 = android.widget.AdapterView.class
            java.lang.Class r8 = java.lang.Integer.TYPE
            r8.getClass()
            java.lang.Class r10 = java.lang.Long.TYPE
            r10.getClass()
            java.lang.Class[] r4 = new java.lang.Class[]{r7, r4, r8, r10}
            java.lang.reflect.Method r0 = h.Hchat.utils.KavaReflector.findMethod(r0, r5, r4)
            if (r0 == 0) goto L39e
            qb.j r4 = new qb.j
            r5 = 2
            r4.<init>(r2, r5)
            boolean r0 = r2.o(r0, r4)
            goto L39f
        L39e:
            r0 = r12
        L39f:
            if (r0 == 0) goto L3a3
            int r3 = r3 + 1
        L3a3:
            java.lang.reflect.Method r0 = ac.p.E(r9, r6)
            if (r0 == 0) goto L3ae
            java.lang.reflect.Method r4 = ac.p.G(r9, r0, r6)
            goto L3af
        L3ae:
            r4 = 0
        L3af:
            if (r0 == 0) goto L3d6
            if (r4 == 0) goto L3d6
            java.lang.reflect.Method r5 = ac.p.F(r9, r6)
            if (r5 == 0) goto L3c7
            qb.j r7 = new qb.j
            r8 = 3
            r7.<init>(r2, r8)
            boolean r5 = r2.o(r5, r7)
            if (r5 == 0) goto L3c7
            int r3 = r3 + 1
        L3c7:
            c9.c2 r5 = new c9.c2
            r7 = 14
            r5.<init>(r2, r7, r4)
            boolean r0 = r2.o(r0, r5)
            if (r0 == 0) goto L3d6
            int r3 = r3 + 1
        L3d6:
            if (r3 > 0) goto L3de
            java.lang.String r0 = "转发语音Hook未安装"
            r2 = 0
            r6.invoke(r0, r2)
        L3de:
            if (r3 <= 0) goto L3e3
            r0 = 1
        L3e1:
            r7 = 1
            goto L3e5
        L3e3:
            r0 = r12
            goto L3e1
        L3e5:
            if (r0 != r7) goto L3ea
            r3 = r7
            goto L3eb
        L3e9:
            r12 = 0
        L3ea:
            r3 = r12
        L3eb:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            return r0
        L3f0:
            java.lang.Object r0 = r1.e()
            return r0
        L3f5:
            java.lang.Object r0 = r1.f5657h
            pb.a r0 = (pb.a) r0
            cb.f r0 = r0.f10459e
            if (r0 == 0) goto L405
            r2 = 1
            boolean r0 = r0.g(r2)
            if (r0 != r2) goto L405
            goto L406
        L405:
            r2 = 0
        L406:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            return r0
        L40b:
            java.lang.Object r0 = r1.f5657h
            ob.f r0 = (ob.f) r0
            ob.n r2 = r0.f9719e
            r0 = 0
            if (r2 == 0) goto L4a5
            monitor-enter(r2)
            r8.g r3 = r2.f9737a     // Catch: java.lang.Throwable -> L44c
            ia.t r4 = r2.f9738b     // Catch: java.lang.Throwable -> L44c
            java.util.List r3 = f8.i.k0(r3, r4)     // Catch: java.lang.Throwable -> L44c
            boolean r4 = r3.isEmpty()     // Catch: java.lang.Throwable -> L44c
            r5 = 0
            if (r4 == 0) goto L426
            r4 = r0
            goto L44e
        L426:
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L44c
            r4 = r0
        L42b:
            boolean r6 = r3.hasNext()     // Catch: java.lang.Throwable -> L44c
            if (r6 == 0) goto L44e
            java.lang.Object r6 = r3.next()     // Catch: java.lang.Throwable -> L44c
            java.lang.reflect.Method r6 = (java.lang.reflect.Method) r6     // Catch: java.lang.Throwable -> L44c
            ob.m r7 = new ob.m     // Catch: java.lang.Throwable -> L44c
            r8 = 1
            r7.<init>(r2, r8)     // Catch: java.lang.Throwable -> L44c
            boolean r6 = r2.a(r6, r7)     // Catch: java.lang.Throwable -> L44c
            if (r6 == 0) goto L42b
            int r4 = r4 + 1
            if (r4 < 0) goto L448
            goto L42b
        L448:
            a.a.P0()     // Catch: java.lang.Throwable -> L44c
            throw r5     // Catch: java.lang.Throwable -> L44c
        L44c:
            r0 = move-exception
            goto L4a3
        L44e:
            r8.g r3 = r2.f9737a     // Catch: java.lang.Throwable -> L44c
            ia.t r6 = r2.f9738b     // Catch: java.lang.Throwable -> L44c
            java.util.List r3 = f8.i.j0(r3, r6)     // Catch: java.lang.Throwable -> L44c
            boolean r6 = r3.isEmpty()     // Catch: java.lang.Throwable -> L44c
            if (r6 == 0) goto L45e
            r6 = r0
            goto L484
        L45e:
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L44c
            r6 = r0
        L463:
            boolean r7 = r3.hasNext()     // Catch: java.lang.Throwable -> L44c
            if (r7 == 0) goto L484
            java.lang.Object r7 = r3.next()     // Catch: java.lang.Throwable -> L44c
            java.lang.reflect.Method r7 = (java.lang.reflect.Method) r7     // Catch: java.lang.Throwable -> L44c
            ob.m r8 = new ob.m     // Catch: java.lang.Throwable -> L44c
            r9 = 0
            r8.<init>(r2, r9)     // Catch: java.lang.Throwable -> L44c
            boolean r7 = r2.a(r7, r8)     // Catch: java.lang.Throwable -> L44c
            if (r7 == 0) goto L463
            int r6 = r6 + 1
            if (r6 < 0) goto L480
            goto L463
        L480:
            a.a.P0()     // Catch: java.lang.Throwable -> L44c
            throw r5     // Catch: java.lang.Throwable -> L44c
        L484:
            if (r4 > 0) goto L48d
            ia.t r3 = r2.f9738b     // Catch: java.lang.Throwable -> L44c
            java.lang.String r7 = "文本转语音菜单创建 Hook 未安装"
            r3.invoke(r7, r5)     // Catch: java.lang.Throwable -> L44c
        L48d:
            if (r6 > 0) goto L496
            ia.t r3 = r2.f9738b     // Catch: java.lang.Throwable -> L44c
            java.lang.String r7 = "文本转语音菜单点击 Hook 未安装"
            r3.invoke(r7, r5)     // Catch: java.lang.Throwable -> L44c
        L496:
            r3 = 1
            if (r4 <= 0) goto L49d
            if (r6 <= 0) goto L49d
            r4 = r3
            goto L49e
        L49d:
            r4 = r0
        L49e:
            monitor-exit(r2)
            if (r4 != r3) goto L4a5
            r0 = r3
            goto L4a5
        L4a3:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L44c
            throw r0
        L4a5:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L4aa:
            java.lang.Object r0 = r1.f5657h
            ma.a r0 = (ma.a) r0
            cb.f r0 = r0.f8810e
            if (r0 == 0) goto L4ba
            r2 = 1
            boolean r0 = r0.g(r2)
            if (r0 != r2) goto L4ba
            goto L4bb
        L4ba:
            r2 = 0
        L4bb:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            return r0
        L4c0:
            java.lang.Object r0 = r1.f5657h
            m9.e r0 = (m9.e) r0
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.f8807e
            r2 = 0
            r0.set(r2)
            sf.n r0 = sf.n.f12433a
            return r0
        L4cd:
            java.lang.Object r0 = r1.f5657h
            m9.a r0 = (m9.a) r0
            m9.e r2 = r0.f8784e
            r3 = 0
            if (r2 == 0) goto L568
            monitor-enter(r2)
            boolean r0 = r2.f8809g     // Catch: java.lang.Throwable -> L559
            r4 = 1
            if (r0 == 0) goto L4e0
            monitor-exit(r2)
            r0 = r4
            goto L562
        L4e0:
            r8.g r0 = r2.f8803a     // Catch: java.lang.Throwable -> L559
            h.Hchat.dexkit.DexFinder r0 = r0.f11624e     // Catch: java.lang.Throwable -> L559
            java.lang.reflect.Method r0 = r0.emojiSendMethod     // Catch: java.lang.Throwable -> L559
            if (r0 == 0) goto L560
            java.lang.Class[] r5 = r0.getParameterTypes()     // Catch: java.lang.Throwable -> L559
            java.lang.Class r6 = r0.getReturnType()     // Catch: java.lang.Throwable -> L559
            java.lang.Class r7 = java.lang.Void.TYPE     // Catch: java.lang.Throwable -> L559
            boolean r6 = gg.l.a(r6, r7)     // Catch: java.lang.Throwable -> L559
            if (r6 == 0) goto L55e
            int r6 = r5.length     // Catch: java.lang.Throwable -> L559
            r7 = 4
            if (r6 < r7) goto L55e
            r6 = r5[r3]     // Catch: java.lang.Throwable -> L559
            java.lang.Class<java.lang.String> r7 = java.lang.String.class
            boolean r6 = gg.l.a(r6, r7)     // Catch: java.lang.Throwable -> L559
            if (r6 == 0) goto L55e
            r5 = r5[r4]     // Catch: java.lang.Throwable -> L559
            java.lang.String r5 = r5.getName()     // Catch: java.lang.Throwable -> L559
            java.lang.String r6 = "com.tencent.mm.storage.emotion.EmojiInfo"
            boolean r5 = r5.equals(r6)     // Catch: java.lang.Throwable -> L559
            if (r5 == 0) goto L55e
            java.lang.Class[] r5 = r0.getParameterTypes()     // Catch: java.lang.Throwable -> L559
            r5 = r5[r4]     // Catch: java.lang.Throwable -> L559
            r5.getClass()     // Catch: java.lang.Throwable -> L559
            java.util.LinkedHashMap r5 = r2.d(r5)     // Catch: java.lang.Throwable -> L559
            if (r5 == 0) goto L55b
            r2.f8808f = r5     // Catch: java.lang.Throwable -> L559
            r8.i r5 = r8.i.f11631b     // Catch: java.lang.Throwable -> L536
            c9.c2 r6 = new c9.c2     // Catch: java.lang.Throwable -> L536
            r7 = 9
            r6.<init>(r2, r7, r0)     // Catch: java.lang.Throwable -> L536
            r5.b(r0, r6)     // Catch: java.lang.Throwable -> L536
            r2.f8809g = r4     // Catch: java.lang.Throwable -> L536
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L536
            goto L53d
        L536:
            r0 = move-exception
            sf.f r5 = new sf.f     // Catch: java.lang.Throwable -> L559
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L559
            r0 = r5
        L53d:
            java.lang.Throwable r5 = sf.g.b(r0)     // Catch: java.lang.Throwable -> L559
            if (r5 != 0) goto L544
            goto L551
        L544:
            tf.u r0 = tf.u.f13168g     // Catch: java.lang.Throwable -> L559
            r2.f8808f = r0     // Catch: java.lang.Throwable -> L559
            ia.t r0 = r2.f8804b     // Catch: java.lang.Throwable -> L559
            java.lang.String r6 = "游戏表情发送 Hook 安装失败"
            r0.invoke(r6, r5)     // Catch: java.lang.Throwable -> L559
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L559
        L551:
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L559
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L559
            monitor-exit(r2)
            goto L562
        L559:
            r0 = move-exception
            goto L566
        L55b:
            monitor-exit(r2)
        L55c:
            r0 = r3
            goto L562
        L55e:
            monitor-exit(r2)
            goto L55c
        L560:
            monitor-exit(r2)
            goto L55c
        L562:
            if (r0 != r4) goto L568
            r3 = r4
            goto L568
        L566:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L559
            throw r0
        L568:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            return r0
        L56d:
            java.lang.Object r0 = r1.f5657h
            l9.a r0 = (l9.a) r0
            l9.d r2 = r0.f7934e
            r0 = 0
            if (r2 == 0) goto L5cd
            monitor-enter(r2)
            boolean r3 = r2.f7945f     // Catch: java.lang.Throwable -> L589
            if (r3 != 0) goto L58d
            java.lang.reflect.Method r3 = r2.f()     // Catch: java.lang.Throwable -> L589
            if (r3 == 0) goto L58b
            boolean r3 = r2.b(r3)     // Catch: java.lang.Throwable -> L589
            if (r3 != 0) goto L58d
            monitor-exit(r2)
            goto L5cd
        L589:
            r0 = move-exception
            goto L5cb
        L58b:
            monitor-exit(r2)
            goto L5cd
        L58d:
            o8.k r3 = h.Hchat.hooks.api.core.WeChatApis.version()     // Catch: java.lang.Throwable -> L589
            r4 = 0
            if (r3 == 0) goto L59c
            l8.i r3 = r3.b()     // Catch: java.lang.Throwable -> L589
            long r6 = r3.f7926a     // Catch: java.lang.Throwable -> L589
            goto L59d
        L59c:
            r6 = r4
        L59d:
            int r3 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            r4 = 1
            if (r3 == 0) goto L5a8
            r8 = 2841(0xb19, double:1.4036E-320)
            int r3 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r3 < 0) goto L5ac
        L5a8:
            boolean r3 = r2.f7946g     // Catch: java.lang.Throwable -> L589
            if (r3 == 0) goto L5af
        L5ac:
            monitor-exit(r2)
        L5ad:
            r0 = r4
            goto L5cd
        L5af:
            java.lang.reflect.Method r3 = r2.g()     // Catch: java.lang.Throwable -> L589
            if (r3 == 0) goto L5c9
            java.lang.String r5 = "新版转发联系人配置"
            l9.b r6 = new l9.b     // Catch: java.lang.Throwable -> L589
            r7 = 1
            r6.<init>(r2, r7)     // Catch: java.lang.Throwable -> L589
            boolean r3 = r2.a(r3, r5, r6)     // Catch: java.lang.Throwable -> L589
            if (r3 != 0) goto L5c5
            monitor-exit(r2)
            goto L5cd
        L5c5:
            r2.f7946g = r4     // Catch: java.lang.Throwable -> L589
            monitor-exit(r2)
            goto L5ad
        L5c9:
            monitor-exit(r2)
            goto L5cd
        L5cb:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L589
            throw r0
        L5cd:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L5d2:
            java.lang.Object r0 = r1.f5657h
            k.y1 r0 = (k.y1) r0
            i0.u r2 = k.m1.f7016a
            java.lang.Object r2 = x1.k.h(r0, r2)
            k.l1 r2 = (k.l1) r2
            r0.F = r2
            if (r2 == 0) goto L5e7
            k.k1 r2 = r2.a()
            goto L5e8
        L5e7:
            r2 = 0
        L5e8:
            r0.G = r2
            sf.n r0 = sf.n.f12433a
            return r0
        L5ed:
            java.lang.Object r0 = r1.f5657h
            jb.a r0 = (jb.a) r0
            jb.e r2 = r0.f6850e
            r3 = 0
            if (r2 == 0) goto L85a
            r8.g r4 = r2.f6858a
            java.util.Set r5 = r2.f6861d
            ia.t r6 = r2.f6859b
            android.content.Context r0 = r4.f11620a
            java.lang.ClassLoader r7 = r4.f11622c
            r7.getClass()
            l8.i r0 = o8.k.a(r0, r7)
            java.lang.String r0 = r0.f7933h
            android.content.SharedPreferences r7 = r2.f6860c
            java.lang.ClassLoader r8 = r4.f11622c
            java.lang.String r9 = "finder_menu_create"
            java.util.List r8 = e8.b.f(r7, r0, r8, r9)
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.Iterator r8 = r8.iterator()
        L61c:
            boolean r11 = r8.hasNext()
            if (r11 == 0) goto L633
            java.lang.Object r11 = r8.next()
            r12 = r11
            java.lang.reflect.Method r12 = (java.lang.reflect.Method) r12
            boolean r12 = jb.e.g(r12)
            if (r12 == 0) goto L61c
            r10.add(r11)
            goto L61c
        L633:
            boolean r8 = r10.isEmpty()
            if (r8 != 0) goto L63b
            goto L6da
        L63b:
            java.util.LinkedHashSet r8 = new java.util.LinkedHashSet
            r8.<init>()
            java.lang.String r10 = "pos is error "
            java.lang.String[] r10 = new java.lang.String[]{r10}
            java.util.List r10 = r2.c(r10)
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.Iterator r10 = r10.iterator()
        L653:
            boolean r12 = r10.hasNext()
            if (r12 == 0) goto L66a
            java.lang.Object r12 = r10.next()
            r13 = r12
            java.lang.reflect.Method r13 = (java.lang.reflect.Method) r13
            boolean r13 = jb.e.g(r13)
            if (r13 == 0) goto L653
            r11.add(r12)
            goto L653
        L66a:
            tf.r.h1(r8, r11)
            java.lang.String r10 = "feed"
            java.lang.String r11 = "menu"
            java.lang.String r12 = "sheet"
            java.lang.String r13 = "holder"
            java.lang.String r14 = "KEY_FINDER_SELF_FLAG"
            java.lang.String[] r10 = new java.lang.String[]{r10, r11, r12, r13, r14}
            java.util.List r10 = r2.c(r10)
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.Iterator r10 = r10.iterator()
        L688:
            boolean r12 = r10.hasNext()
            if (r12 == 0) goto L69f
            java.lang.Object r12 = r10.next()
            r13 = r12
            java.lang.reflect.Method r13 = (java.lang.reflect.Method) r13
            boolean r13 = jb.e.g(r13)
            if (r13 == 0) goto L688
            r11.add(r12)
            goto L688
        L69f:
            tf.r.h1(r8, r11)
            java.lang.String r10 = "getCreateSecondMoreMenuListener: username="
            java.lang.String[] r10 = new java.lang.String[]{r10}
            java.util.List r10 = r2.c(r10)
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.Iterator r10 = r10.iterator()
        L6b5:
            boolean r12 = r10.hasNext()
            if (r12 == 0) goto L6cc
            java.lang.Object r12 = r10.next()
            r13 = r12
            java.lang.reflect.Method r13 = (java.lang.reflect.Method) r13
            boolean r13 = jb.e.g(r13)
            if (r13 == 0) goto L6b5
            r11.add(r12)
            goto L6b5
        L6cc:
            tf.r.h1(r8, r11)
            java.util.List r10 = tf.m.P1(r8)
            r2.j(r0, r9, r10)
            java.util.List r10 = tf.m.P1(r8)
        L6da:
            java.util.Iterator r8 = r10.iterator()
            r9 = r3
        L6df:
            boolean r0 = r8.hasNext()
            r10 = 1
            if (r0 == 0) goto L725
            java.lang.Object r0 = r8.next()
            r11 = r0
            java.lang.reflect.Method r11 = (java.lang.reflect.Method) r11
            boolean r0 = r5.add(r11)
            if (r0 != 0) goto L6f4
            goto L720
        L6f4:
            r8.i r0 = r8.i.f11631b     // Catch: java.lang.Throwable -> L702
            jb.d r10 = new jb.d     // Catch: java.lang.Throwable -> L702
            r12 = 1
            r10.<init>(r2, r12)     // Catch: java.lang.Throwable -> L702
            r0.b(r11, r10)     // Catch: java.lang.Throwable -> L702
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L702
            goto L709
        L702:
            r0 = move-exception
            sf.f r10 = new sf.f
            r10.<init>(r0)
            r0 = r10
        L709:
            java.lang.Throwable r10 = sf.g.b(r0)
            if (r10 != 0) goto L710
            goto L71a
        L710:
            r5.remove(r11)
            java.lang.String r0 = "视频号菜单创建Hook失败"
            r6.invoke(r0, r10)
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
        L71a:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r10 = r0.booleanValue()
        L720:
            if (r10 == 0) goto L6df
            int r9 = r9 + 1
            goto L6df
        L725:
            android.content.Context r0 = r4.f11620a
            java.lang.ClassLoader r8 = r4.f11622c
            r8.getClass()
            l8.i r0 = o8.k.a(r0, r8)
            java.lang.String r0 = r0.f7933h
            java.lang.ClassLoader r4 = r4.f11622c
            java.lang.String r8 = "finder_menu_click"
            java.util.List r4 = e8.b.f(r7, r0, r4, r8)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r4 = r4.iterator()
        L743:
            boolean r11 = r4.hasNext()
            if (r11 == 0) goto L75a
            java.lang.Object r11 = r4.next()
            r12 = r11
            java.lang.reflect.Method r12 = (java.lang.reflect.Method) r12
            boolean r12 = jb.e.f(r12)
            if (r12 == 0) goto L743
            r7.add(r11)
            goto L743
        L75a:
            boolean r4 = r7.isEmpty()
            if (r4 != 0) goto L762
            goto L7fb
        L762:
            java.util.LinkedHashSet r4 = new java.util.LinkedHashSet
            r4.<init>()
            java.lang.String r7 = "[getMoreMenuItemSelectedListener] feed "
            java.lang.String[] r7 = new java.lang.String[]{r7}
            java.util.List r7 = r2.c(r7)
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.Iterator r7 = r7.iterator()
        L77a:
            boolean r12 = r7.hasNext()
            if (r12 == 0) goto L791
            java.lang.Object r12 = r7.next()
            r13 = r12
            java.lang.reflect.Method r13 = (java.lang.reflect.Method) r13
            boolean r13 = jb.e.f(r13)
            if (r13 == 0) goto L77a
            r11.add(r12)
            goto L77a
        L791:
            tf.r.h1(r4, r11)
            java.lang.String r7 = "getMoreMenuItemSelectedListener feed "
            java.lang.String[] r7 = new java.lang.String[]{r7}
            java.util.List r7 = r2.c(r7)
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.Iterator r7 = r7.iterator()
        L7a7:
            boolean r12 = r7.hasNext()
            if (r12 == 0) goto L7be
            java.lang.Object r12 = r7.next()
            r13 = r12
            java.lang.reflect.Method r13 = (java.lang.reflect.Method) r13
            boolean r13 = jb.e.f(r13)
            if (r13 == 0) goto L7a7
            r11.add(r12)
            goto L7a7
        L7be:
            tf.r.h1(r4, r11)
            java.lang.String r7 = "button_speedplay"
            java.lang.String r11 = "ref_eid"
            java.lang.String[] r7 = new java.lang.String[]{r7, r11}
            java.util.List r7 = r2.c(r7)
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.Iterator r7 = r7.iterator()
        L7d6:
            boolean r12 = r7.hasNext()
            if (r12 == 0) goto L7ed
            java.lang.Object r12 = r7.next()
            r13 = r12
            java.lang.reflect.Method r13 = (java.lang.reflect.Method) r13
            boolean r13 = jb.e.f(r13)
            if (r13 == 0) goto L7d6
            r11.add(r12)
            goto L7d6
        L7ed:
            tf.r.h1(r4, r11)
            java.util.List r7 = tf.m.P1(r4)
            r2.j(r0, r8, r7)
            java.util.List r7 = tf.m.P1(r4)
        L7fb:
            java.util.Iterator r4 = r7.iterator()
            r7 = r3
        L800:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L846
            java.lang.Object r0 = r4.next()
            r8 = r0
            java.lang.reflect.Method r8 = (java.lang.reflect.Method) r8
            boolean r0 = r5.add(r8)
            if (r0 != 0) goto L815
            r0 = r10
            goto L841
        L815:
            r8.i r0 = r8.i.f11631b     // Catch: java.lang.Throwable -> L823
            jb.d r11 = new jb.d     // Catch: java.lang.Throwable -> L823
            r12 = 0
            r11.<init>(r2, r12)     // Catch: java.lang.Throwable -> L823
            r0.b(r8, r11)     // Catch: java.lang.Throwable -> L823
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L823
            goto L82a
        L823:
            r0 = move-exception
            sf.f r11 = new sf.f
            r11.<init>(r0)
            r0 = r11
        L82a:
            java.lang.Throwable r11 = sf.g.b(r0)
            if (r11 != 0) goto L831
            goto L83b
        L831:
            r5.remove(r8)
            java.lang.String r0 = "视频号菜单点击Hook失败"
            r6.invoke(r0, r11)
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
        L83b:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
        L841:
            if (r0 == 0) goto L800
            int r7 = r7 + 1
            goto L800
        L846:
            if (r9 <= 0) goto L84a
            if (r7 > 0) goto L850
        L84a:
            java.lang.String r0 = "视频号媒体下载Hook未安装"
            r2 = 0
            r6.invoke(r0, r2)
        L850:
            if (r9 <= 0) goto L856
            if (r7 <= 0) goto L856
            r0 = r10
            goto L857
        L856:
            r0 = r3
        L857:
            if (r0 != r10) goto L85a
            r3 = r10
        L85a:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            return r0
        L85f:
            java.lang.Object r0 = r1.f5657h
            ja.a r0 = (ja.a) r0
            hb.c r0 = r0.f6849e
            r2 = 0
            if (r0 == 0) goto L8bc
            java.lang.Object r3 = r0.f5338g
            r8.g r3 = (r8.g) r3
            java.lang.Object r4 = r0.f5339h
            ia.t r4 = (ia.t) r4
            java.lang.reflect.Method r5 = ac.p.F(r3, r4)
            java.lang.reflect.Method r6 = ac.p.E(r3, r4)
            r7 = 0
            if (r6 == 0) goto L880
            java.lang.reflect.Method r3 = ac.p.G(r3, r6, r4)
            goto L881
        L880:
            r3 = r7
        L881:
            r8 = 1
            if (r5 == 0) goto L895
            if (r3 == 0) goto L895
            b9.e r9 = new b9.e
            r10 = 14
            r9.<init>(r0, r10)
            boolean r5 = r0.p(r5, r9)
            if (r5 == 0) goto L895
            r5 = r8
            goto L896
        L895:
            r5 = r2
        L896:
            if (r6 == 0) goto L8a8
            if (r3 == 0) goto L8a8
            c9.c2 r9 = new c9.c2
            r10 = 6
            r9.<init>(r0, r10, r3)
            boolean r0 = r0.p(r6, r9)
            if (r0 == 0) goto L8a8
            r0 = r8
            goto L8a9
        L8a8:
            r0 = r2
        L8a9:
            if (r5 != 0) goto L8b0
            java.lang.String r3 = "多选撤回菜单创建Hook未安装"
            r4.invoke(r3, r7)
        L8b0:
            if (r0 != 0) goto L8b7
            java.lang.String r3 = "多选撤回菜单点击Hook未安装"
            r4.invoke(r3, r7)
        L8b7:
            if (r5 == 0) goto L8bc
            if (r0 == 0) goto L8bc
            r2 = r8
        L8bc:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            return r0
        L8c1:
            java.lang.Object r0 = r1.f5657h
            j9.a r0 = (j9.a) r0
            ea.c r2 = r0.f6848e
            r3 = 0
            if (r2 == 0) goto L915
            monitor-enter(r2)
            boolean r0 = r2.f2484c     // Catch: java.lang.Throwable -> L912
            r4 = 1
            if (r0 == 0) goto L8d3
            monitor-exit(r2)
            r0 = r4
            goto L90e
        L8d3:
            java.lang.reflect.Method r0 = r2.g()     // Catch: java.lang.Throwable -> L8ea
            if (r0 == 0) goto L8ec
            r8.i r5 = r8.i.f11631b     // Catch: java.lang.Throwable -> L8ea
            b9.e r6 = new b9.e     // Catch: java.lang.Throwable -> L8ea
            r7 = 13
            r6.<init>(r2, r7)     // Catch: java.lang.Throwable -> L8ea
            r5.b(r0, r6)     // Catch: java.lang.Throwable -> L8ea
            r2.f2484c = r4     // Catch: java.lang.Throwable -> L8ea
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L8ea
            goto L8f5
        L8ea:
            r0 = move-exception
            goto L8ef
        L8ec:
            monitor-exit(r2)
            r0 = r3
            goto L90e
        L8ef:
            sf.f r5 = new sf.f     // Catch: java.lang.Throwable -> L912
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L912
            r0 = r5
        L8f5:
            java.lang.Throwable r5 = sf.g.b(r0)     // Catch: java.lang.Throwable -> L912
            if (r5 != 0) goto L8fc
            goto L907
        L8fc:
            java.lang.Object r0 = r2.f2485d     // Catch: java.lang.Throwable -> L912
            ia.t r0 = (ia.t) r0     // Catch: java.lang.Throwable -> L912
            java.lang.String r6 = "伪造语音时长录音长度Hook失败"
            r0.invoke(r6, r5)     // Catch: java.lang.Throwable -> L912
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L912
        L907:
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L912
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L912
            monitor-exit(r2)
        L90e:
            if (r0 != r4) goto L915
            r3 = r4
            goto L915
        L912:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L912
            throw r0
        L915:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            return r0
        L91a:
            java.lang.Object r0 = r1.f5657h
            b9.a r0 = (b9.a) r0
            java.lang.Object r0 = r0.f524f
            ea.c r0 = (ea.c) r0
            if (r0 == 0) goto L92c
            r2 = 1
            boolean r0 = r0.a(r2)
            if (r0 != r2) goto L92c
            goto L92d
        L92c:
            r2 = 0
        L92d:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            return r0
        L932:
            java.lang.Object r0 = r1.f5657h
            qg.t r0 = (qg.t) r0
            wf.g r0 = r0.n()
            float r0 = i.d.n(r0)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            return r0
    }
}
