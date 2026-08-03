package ab;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements fg.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f143g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f144h;

    public /* synthetic */ a(java.lang.Object r1, int r2) {
            r0 = this;
            r0.f143g = r2
            r0.f144h = r1
            r0.<init>()
            return
    }

    private final java.lang.Object e() {
            r9 = this;
            java.lang.Object r0 = r9.f144h
            d9.d r0 = (d9.d) r0
            d9.m r0 = r0.f2091e
            r1 = 0
            if (r0 == 0) goto L72
            monitor-enter(r0)
            d9.i r2 = r0.h()     // Catch: java.lang.Throwable -> L38
            r3 = 1
            if (r2 == 0) goto L6a
            java.lang.reflect.Method r4 = r2.f2107a     // Catch: java.lang.Throwable -> L38
            d9.l r5 = new d9.l     // Catch: java.lang.Throwable -> L38
            r6 = 2
            r5.<init>(r0, r6)     // Catch: java.lang.Throwable -> L38
            boolean r4 = r0.e(r4, r5)     // Catch: java.lang.Throwable -> L38
            java.lang.reflect.Constructor r5 = r2.f2108b     // Catch: java.lang.Throwable -> L38
            d9.l r6 = new d9.l     // Catch: java.lang.Throwable -> L38
            r7 = 0
            r6.<init>(r0, r7)     // Catch: java.lang.Throwable -> L38
            boolean r5 = r0.e(r5, r6)     // Catch: java.lang.Throwable -> L38
            java.lang.reflect.Method r6 = r2.f2109c     // Catch: java.lang.Throwable -> L38
            if (r6 == 0) goto L3a
            d9.l r7 = new d9.l     // Catch: java.lang.Throwable -> L38
            r8 = 3
            r7.<init>(r0, r8)     // Catch: java.lang.Throwable -> L38
            boolean r6 = r0.e(r6, r7)     // Catch: java.lang.Throwable -> L38
            goto L3b
        L38:
            r1 = move-exception
            goto L70
        L3a:
            r6 = r3
        L3b:
            java.lang.reflect.Method r2 = r2.f2110d     // Catch: java.lang.Throwable -> L38
            d9.l r7 = new d9.l     // Catch: java.lang.Throwable -> L38
            r8 = 1
            r7.<init>(r0, r8)     // Catch: java.lang.Throwable -> L38
            boolean r2 = r0.e(r2, r7)     // Catch: java.lang.Throwable -> L38
            if (r4 == 0) goto L51
            if (r5 == 0) goto L51
            if (r6 == 0) goto L51
            if (r2 == 0) goto L51
            r0.f2129i = r3     // Catch: java.lang.Throwable -> L38
        L51:
            xa.a r2 = xa.a.f21418a     // Catch: java.lang.Throwable -> L38
            r8.g r4 = r0.f2121a     // Catch: java.lang.Throwable -> L38
            ab.b r5 = r0.f2122b     // Catch: java.lang.Throwable -> L38
            java.lang.reflect.Method r2 = r2.d(r4, r5)     // Catch: java.lang.Throwable -> L38
            if (r2 == 0) goto L66
            d9.l r4 = new d9.l     // Catch: java.lang.Throwable -> L38
            r5 = 5
            r4.<init>(r0, r5)     // Catch: java.lang.Throwable -> L38
            r0.e(r2, r4)     // Catch: java.lang.Throwable -> L38
        L66:
            boolean r2 = r0.f2129i     // Catch: java.lang.Throwable -> L38
            monitor-exit(r0)
            goto L6c
        L6a:
            monitor-exit(r0)
            r2 = r1
        L6c:
            if (r2 != r3) goto L72
            r1 = r3
            goto L72
        L70:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L38
            throw r1
        L72:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            return r0
    }

    private final java.lang.Object f() {
            r8 = this;
            java.lang.Object r0 = r8.f144h
            b9.a r0 = (b9.a) r0
            java.lang.Object r0 = r0.f524f
            da.h r0 = (da.h) r0
            r1 = 0
            if (r0 == 0) goto L66
            java.lang.String r2 = "[Hchat:MessageTextColor] 安装聊天消息绑定 Hook 失败: "
            monitor-enter(r0)
            boolean r3 = r0.f2165j     // Catch: java.lang.Throwable -> L57
            r4 = 1
            if (r3 == 0) goto L16
            monitor-exit(r0)
            r2 = r4
            goto L60
        L16:
            java.lang.reflect.Method r3 = r0.p()     // Catch: java.lang.Throwable -> L57
            if (r3 == 0) goto L59
            r8.i r5 = r8.i.f11631b     // Catch: java.lang.Throwable -> L2c
            b9.e r6 = new b9.e     // Catch: java.lang.Throwable -> L2c
            r7 = 5
            r6.<init>(r0, r7)     // Catch: java.lang.Throwable -> L2c
            r5.b(r3, r6)     // Catch: java.lang.Throwable -> L2c
            r0.f2165j = r4     // Catch: java.lang.Throwable -> L2c
            java.lang.Boolean r3 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L2c
            goto L33
        L2c:
            r3 = move-exception
            sf.f r5 = new sf.f     // Catch: java.lang.Throwable -> L57
            r5.<init>(r3)     // Catch: java.lang.Throwable -> L57
            r3 = r5
        L33:
            java.lang.Throwable r5 = sf.g.b(r3)     // Catch: java.lang.Throwable -> L57
            if (r5 != 0) goto L3a
            goto L4f
        L3a:
            java.lang.String r3 = r5.getMessage()     // Catch: java.lang.Throwable -> L57
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L57
            r6.<init>(r2)     // Catch: java.lang.Throwable -> L57
            r6.append(r3)     // Catch: java.lang.Throwable -> L57
            java.lang.String r2 = r6.toString()     // Catch: java.lang.Throwable -> L57
            fb.v0.n(r2, r5)     // Catch: java.lang.Throwable -> L57
            java.lang.Boolean r3 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L57
        L4f:
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch: java.lang.Throwable -> L57
            boolean r2 = r3.booleanValue()     // Catch: java.lang.Throwable -> L57
            monitor-exit(r0)
            goto L60
        L57:
            r1 = move-exception
            goto L64
        L59:
            java.lang.String r2 = "[Hchat:MessageTextColor] 定位聊天消息绑定方法失败"
            fb.v0.m(r2)     // Catch: java.lang.Throwable -> L57
            monitor-exit(r0)
            r2 = r1
        L60:
            if (r2 != r4) goto L66
            r1 = r4
            goto L66
        L64:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L57
            throw r1
        L66:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            return r0
    }

    private final java.lang.Object g() {
            r7 = this;
            java.lang.Object r0 = r7.f144h
            ea.a r0 = (ea.a) r0
            ea.c r0 = r0.f2479e
            r1 = 0
            if (r0 == 0) goto L5b
            monitor-enter(r0)
            boolean r2 = r0.f2484c     // Catch: java.lang.Throwable -> L58
            r3 = 1
            if (r2 == 0) goto L12
            monitor-exit(r0)
            r2 = r3
            goto L54
        L12:
            java.lang.reflect.Constructor r2 = r0.d()     // Catch: java.lang.Throwable -> L2e
            if (r2 == 0) goto L33
            java.lang.reflect.Method r4 = r0.e()     // Catch: java.lang.Throwable -> L2e
            if (r4 == 0) goto L30
            r8.i r4 = r8.i.f11631b     // Catch: java.lang.Throwable -> L2e
            b9.e r5 = new b9.e     // Catch: java.lang.Throwable -> L2e
            r6 = 7
            r5.<init>(r0, r6)     // Catch: java.lang.Throwable -> L2e
            r4.b(r2, r5)     // Catch: java.lang.Throwable -> L2e
            r0.f2484c = r3     // Catch: java.lang.Throwable -> L2e
            java.lang.Boolean r2 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L2e
            goto L3b
        L2e:
            r2 = move-exception
            goto L35
        L30:
            monitor-exit(r0)
        L31:
            r2 = r1
            goto L54
        L33:
            monitor-exit(r0)
            goto L31
        L35:
            sf.f r4 = new sf.f     // Catch: java.lang.Throwable -> L58
            r4.<init>(r2)     // Catch: java.lang.Throwable -> L58
            r2 = r4
        L3b:
            java.lang.Throwable r4 = sf.g.b(r2)     // Catch: java.lang.Throwable -> L58
            if (r4 != 0) goto L42
            goto L4d
        L42:
            java.lang.Object r2 = r0.f2485d     // Catch: java.lang.Throwable -> L58
            ab.b r2 = (ab.b) r2     // Catch: java.lang.Throwable -> L58
            java.lang.String r5 = "兼容低版本小程序Hook失败"
            r2.invoke(r5, r4)     // Catch: java.lang.Throwable -> L58
            java.lang.Boolean r2 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L58
        L4d:
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: java.lang.Throwable -> L58
            boolean r2 = r2.booleanValue()     // Catch: java.lang.Throwable -> L58
            monitor-exit(r0)
        L54:
            if (r2 != r3) goto L5b
            r1 = r3
            goto L5b
        L58:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L58
            throw r1
        L5b:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            return r0
    }

    private final java.lang.Object h() {
            r9 = this;
            java.lang.Object r0 = r9.f144h
            fa.a r0 = (fa.a) r0
            ea.c r0 = r0.f3385e
            r1 = 0
            if (r0 == 0) goto L5a
            monitor-enter(r0)
            boolean r2 = r0.f2484c     // Catch: java.lang.Throwable -> L57
            r3 = 1
            if (r2 == 0) goto L12
            monitor-exit(r0)
            r2 = r3
            goto L53
        L12:
            java.lang.reflect.Method r2 = r0.h()     // Catch: java.lang.Throwable -> L2f
            if (r2 == 0) goto L31
            java.lang.Object r4 = r0.f2482a     // Catch: java.lang.Throwable -> L2f
            r8.g r4 = (r8.g) r4     // Catch: java.lang.Throwable -> L2f
            android.content.Context r4 = r4.f11620a     // Catch: java.lang.Throwable -> L2f
            r8.i r5 = r8.i.f11631b     // Catch: java.lang.Throwable -> L2f
            ea.b r6 = new ea.b     // Catch: java.lang.Throwable -> L2f
            r7 = 1
            r8 = 0
            r6.<init>(r4, r7, r8)     // Catch: java.lang.Throwable -> L2f
            r5.b(r2, r6)     // Catch: java.lang.Throwable -> L2f
            r0.f2484c = r3     // Catch: java.lang.Throwable -> L2f
            java.lang.Boolean r2 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L2f
            goto L3a
        L2f:
            r2 = move-exception
            goto L34
        L31:
            monitor-exit(r0)
            r2 = r1
            goto L53
        L34:
            sf.f r4 = new sf.f     // Catch: java.lang.Throwable -> L57
            r4.<init>(r2)     // Catch: java.lang.Throwable -> L57
            r2 = r4
        L3a:
            java.lang.Throwable r4 = sf.g.b(r2)     // Catch: java.lang.Throwable -> L57
            if (r4 != 0) goto L41
            goto L4c
        L41:
            java.lang.Object r2 = r0.f2485d     // Catch: java.lang.Throwable -> L57
            ab.b r2 = (ab.b) r2     // Catch: java.lang.Throwable -> L57
            java.lang.String r5 = "小程序开屏广告 Hook 安装失败"
            r2.invoke(r5, r4)     // Catch: java.lang.Throwable -> L57
            java.lang.Boolean r2 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L57
        L4c:
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: java.lang.Throwable -> L57
            boolean r2 = r2.booleanValue()     // Catch: java.lang.Throwable -> L57
            monitor-exit(r0)
        L53:
            if (r2 != r3) goto L5a
            r1 = r3
            goto L5a
        L57:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L57
            throw r1
        L5a:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            return r0
    }

    private final java.lang.Object i() {
            r9 = this;
            java.lang.Object r0 = r9.f144h
            g9.a r0 = (g9.a) r0
            g9.d r0 = r0.f4390e
            r1 = 0
            if (r0 == 0) goto L9a
            monitor-enter(r0)
            r8.g r2 = r0.f4397a     // Catch: java.lang.Throwable -> L41
            ab.b r3 = r0.f4398b     // Catch: java.lang.Throwable -> L41
            java.util.List r2 = f8.i.k0(r2, r3)     // Catch: java.lang.Throwable -> L41
            boolean r3 = r2.isEmpty()     // Catch: java.lang.Throwable -> L41
            r4 = 0
            if (r3 == 0) goto L1b
            r3 = r1
            goto L43
        L1b:
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L41
            r3 = r1
        L20:
            boolean r5 = r2.hasNext()     // Catch: java.lang.Throwable -> L41
            if (r5 == 0) goto L43
            java.lang.Object r5 = r2.next()     // Catch: java.lang.Throwable -> L41
            java.lang.reflect.Method r5 = (java.lang.reflect.Method) r5     // Catch: java.lang.Throwable -> L41
            g9.c r6 = new g9.c     // Catch: java.lang.Throwable -> L41
            r7 = 1
            r6.<init>(r0, r7)     // Catch: java.lang.Throwable -> L41
            boolean r5 = r0.b(r5, r6)     // Catch: java.lang.Throwable -> L41
            if (r5 == 0) goto L20
            int r3 = r3 + 1
            if (r3 < 0) goto L3d
            goto L20
        L3d:
            a.a.P0()     // Catch: java.lang.Throwable -> L41
            throw r4     // Catch: java.lang.Throwable -> L41
        L41:
            r1 = move-exception
            goto L98
        L43:
            r8.g r2 = r0.f4397a     // Catch: java.lang.Throwable -> L41
            ab.b r5 = r0.f4398b     // Catch: java.lang.Throwable -> L41
            java.util.List r2 = f8.i.j0(r2, r5)     // Catch: java.lang.Throwable -> L41
            boolean r5 = r2.isEmpty()     // Catch: java.lang.Throwable -> L41
            if (r5 == 0) goto L53
            r5 = r1
            goto L79
        L53:
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L41
            r5 = r1
        L58:
            boolean r6 = r2.hasNext()     // Catch: java.lang.Throwable -> L41
            if (r6 == 0) goto L79
            java.lang.Object r6 = r2.next()     // Catch: java.lang.Throwable -> L41
            java.lang.reflect.Method r6 = (java.lang.reflect.Method) r6     // Catch: java.lang.Throwable -> L41
            g9.c r7 = new g9.c     // Catch: java.lang.Throwable -> L41
            r8 = 0
            r7.<init>(r0, r8)     // Catch: java.lang.Throwable -> L41
            boolean r6 = r0.b(r6, r7)     // Catch: java.lang.Throwable -> L41
            if (r6 == 0) goto L58
            int r5 = r5 + 1
            if (r5 < 0) goto L75
            goto L58
        L75:
            a.a.P0()     // Catch: java.lang.Throwable -> L41
            throw r4     // Catch: java.lang.Throwable -> L41
        L79:
            if (r3 > 0) goto L82
            ab.b r2 = r0.f4398b     // Catch: java.lang.Throwable -> L41
            java.lang.String r6 = "保存表情菜单创建 Hook 未安装"
            r2.invoke(r6, r4)     // Catch: java.lang.Throwable -> L41
        L82:
            if (r5 > 0) goto L8b
            ab.b r2 = r0.f4398b     // Catch: java.lang.Throwable -> L41
            java.lang.String r6 = "保存表情菜单点击 Hook 未安装"
            r2.invoke(r6, r4)     // Catch: java.lang.Throwable -> L41
        L8b:
            r2 = 1
            if (r3 <= 0) goto L92
            if (r5 <= 0) goto L92
            r3 = r2
            goto L93
        L92:
            r3 = r1
        L93:
            monitor-exit(r0)
            if (r3 != r2) goto L9a
            r1 = r2
            goto L9a
        L98:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L41
            throw r1
        L9a:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            return r0
    }

    private final java.lang.Object j() {
            r6 = this;
            java.lang.Object r0 = r6.f144h
            h9.a r0 = (h9.a) r0
            h9.b r0 = r0.f5144e
            r1 = 0
            if (r0 == 0) goto L37
            monitor-enter(r0)
            boolean r2 = r0.f5149d     // Catch: java.lang.Throwable -> L34
            r3 = 1
            if (r2 == 0) goto L12
            monitor-exit(r0)
            r2 = r3
            goto L30
        L12:
            java.util.ArrayList r2 = r0.a()     // Catch: java.lang.Throwable -> L34
            boolean r4 = r2.isEmpty()     // Catch: java.lang.Throwable -> L34
            if (r4 == 0) goto L1f
            monitor-exit(r0)
            r2 = r1
            goto L30
        L1f:
            java.util.concurrent.ConcurrentHashMap$KeySetView r4 = h9.d.f5152a     // Catch: java.lang.Throwable -> L34
            r8.g r4 = r0.f5146a     // Catch: java.lang.Throwable -> L34
            android.content.Context r4 = r4.f11620a     // Catch: java.lang.Throwable -> L34
            ab.b r5 = r0.f5147b     // Catch: java.lang.Throwable -> L34
            boolean r2 = h9.d.c(r4, r2, r5)     // Catch: java.lang.Throwable -> L34
            r0.f5149d = r2     // Catch: java.lang.Throwable -> L34
            boolean r2 = r0.f5149d     // Catch: java.lang.Throwable -> L34
            monitor-exit(r0)
        L30:
            if (r2 != r3) goto L37
            r1 = r3
            goto L37
        L34:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L34
            throw r1
        L37:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            return r0
    }

    private final java.lang.Object k() {
            r3 = this;
            java.lang.Object r0 = r3.f144h
            ha.l r0 = (ha.l) r0
            ha.m r0 = r0.f5256e
            if (r0 == 0) goto L14
            android.content.SharedPreferences r1 = r0.f5258b
            b9.b r2 = r0.f5259c
            r1.registerOnSharedPreferenceChangeListener(r2)
            r0.a()
            r0 = 1
            goto L15
        L14:
            r0 = 0
        L15:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
    }

    private final java.lang.Object l() {
            r10 = this;
            java.lang.Object r0 = r10.f144h
            ha.e0 r0 = (ha.e0) r0
            ea.c r0 = r0.f5193e
            r1 = 0
            if (r0 == 0) goto Lae
            java.lang.String r2 = "朋友圈上传尾巴Hook安装失败: "
            monitor-enter(r0)
            boolean r3 = r0.f2484c     // Catch: java.lang.Throwable -> L38
            r4 = 1
            if (r3 == 0) goto L15
            monitor-exit(r0)
            r2 = r4
            goto La8
        L15:
            java.lang.Object r3 = r0.f2482a     // Catch: java.lang.Throwable -> L38
            r8.g r3 = (r8.g) r3     // Catch: java.lang.Throwable -> L38
            h.Hchat.dexkit.DexFinder r3 = r3.f11624e     // Catch: java.lang.Throwable -> L38
            r3.resolveSnsUploadApi()     // Catch: java.lang.Throwable -> L21
            sf.n r5 = sf.n.f12433a     // Catch: java.lang.Throwable -> L21
            goto L28
        L21:
            r5 = move-exception
            sf.f r6 = new sf.f     // Catch: java.lang.Throwable -> L38
            r6.<init>(r5)     // Catch: java.lang.Throwable -> L38
            r5 = r6
        L28:
            java.lang.Throwable r5 = sf.g.b(r5)     // Catch: java.lang.Throwable -> L38
            if (r5 == 0) goto L3b
            java.lang.Object r6 = r0.f2485d     // Catch: java.lang.Throwable -> L38
            ab.b r6 = (ab.b) r6     // Catch: java.lang.Throwable -> L38
            java.lang.String r7 = "朋友圈上传尾巴定位朋友圈发布方法失败"
            r6.invoke(r7, r5)     // Catch: java.lang.Throwable -> L38
            goto L3b
        L38:
            r1 = move-exception
            goto Lac
        L3b:
            java.lang.reflect.Method r5 = r3.snsCommitMethod     // Catch: java.lang.Throwable -> L38
            if (r5 == 0) goto La6
            java.lang.reflect.Method r6 = r3.snsSetSdkIdMethod     // Catch: java.lang.Throwable -> L38
            if (r6 == 0) goto La4
            java.lang.reflect.Method r3 = r3.snsSetSdkAppNameMethod     // Catch: java.lang.Throwable -> L38
            if (r3 == 0) goto La2
            int r7 = r5.getModifiers()     // Catch: java.lang.Throwable -> L38
            boolean r7 = java.lang.reflect.Modifier.isAbstract(r7)     // Catch: java.lang.Throwable -> L38
            if (r7 != 0) goto L9f
            java.lang.Class r7 = r5.getDeclaringClass()     // Catch: java.lang.Throwable -> L38
            boolean r7 = r7.isInterface()     // Catch: java.lang.Throwable -> L38
            if (r7 == 0) goto L5c
            goto L9f
        L5c:
            r8.i r7 = r8.i.f11631b     // Catch: java.lang.Throwable -> L6c
            aa.d r8 = new aa.d     // Catch: java.lang.Throwable -> L6c
            r9 = 1
            r8.<init>(r0, r6, r3, r9)     // Catch: java.lang.Throwable -> L6c
            r7.b(r5, r8)     // Catch: java.lang.Throwable -> L6c
            r0.f2484c = r4     // Catch: java.lang.Throwable -> L6c
            java.lang.Boolean r3 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L6c
            goto L73
        L6c:
            r3 = move-exception
            sf.f r6 = new sf.f     // Catch: java.lang.Throwable -> L38
            r6.<init>(r3)     // Catch: java.lang.Throwable -> L38
            r3 = r6
        L73:
            java.lang.Throwable r6 = sf.g.b(r3)     // Catch: java.lang.Throwable -> L38
            if (r6 == 0) goto L90
            java.lang.Object r7 = r0.f2485d     // Catch: java.lang.Throwable -> L38
            ab.b r7 = (ab.b) r7     // Catch: java.lang.Throwable -> L38
            java.lang.String r5 = r5.toGenericString()     // Catch: java.lang.Throwable -> L38
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L38
            r8.<init>(r2)     // Catch: java.lang.Throwable -> L38
            r8.append(r5)     // Catch: java.lang.Throwable -> L38
            java.lang.String r2 = r8.toString()     // Catch: java.lang.Throwable -> L38
            r7.invoke(r2, r6)     // Catch: java.lang.Throwable -> L38
        L90:
            java.lang.Boolean r2 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L38
            boolean r5 = r3 instanceof sf.f     // Catch: java.lang.Throwable -> L38
            if (r5 == 0) goto L97
            r3 = r2
        L97:
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch: java.lang.Throwable -> L38
            boolean r2 = r3.booleanValue()     // Catch: java.lang.Throwable -> L38
            monitor-exit(r0)
            goto La8
        L9f:
            monitor-exit(r0)
        La0:
            r2 = r1
            goto La8
        La2:
            monitor-exit(r0)
            goto La0
        La4:
            monitor-exit(r0)
            goto La0
        La6:
            monitor-exit(r0)
            goto La0
        La8:
            if (r2 != r4) goto Lae
            r1 = r4
            goto Lae
        Lac:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L38
            throw r1
        Lae:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            return r0
    }

    private final java.lang.Object m() {
            r2 = this;
            java.lang.Object r0 = r2.f144h
            b9.a r0 = (b9.a) r0
            java.lang.Object r0 = r0.f524f
            ha.g0 r0 = (ha.g0) r0
            if (r0 == 0) goto L12
            r1 = 1
            boolean r0 = r0.b(r1)
            if (r0 != r1) goto L12
            goto L13
        L12:
            r1 = 0
        L13:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            return r0
    }

    @Override // fg.a
    public final java.lang.Object invoke() {
            r17 = this;
            r1 = r17
            int r0 = r1.f143g
            switch(r0) {
                case 0: goto L82e;
                case 1: goto L825;
                case 2: goto L81b;
                case 3: goto L7da;
                case 4: goto L76e;
                case 5: goto L6a7;
                case 6: goto L634;
                case 7: goto L584;
                case 8: goto L574;
                case 9: goto L568;
                case 10: goto L38a;
                case 11: goto L31d;
                case 12: goto L318;
                case 13: goto L313;
                case 14: goto L30e;
                case 15: goto L305;
                case 16: goto L2fc;
                case 17: goto L2e6;
                case 18: goto L2d9;
                case 19: goto L265;
                case 20: goto L260;
                case 21: goto L24d;
                case 22: goto L23a;
                case 23: goto L235;
                case 24: goto L230;
                case 25: goto L22b;
                case 26: goto L21c;
                case 27: goto L217;
                case 28: goto L212;
                default: goto L7;
            }
        L7:
            java.lang.Object r0 = r1.f144h
            hb.u r0 = (hb.u) r0
            hb.i0 r2 = r0.f5475e
            if (r2 == 0) goto L20c
            r8.g r0 = r2.f5400a
            ab.b r4 = r2.f5401b
            java.lang.reflect.Method r0 = ac.p.F(r0, r4)
            r8.g r4 = r2.f5400a
            ab.b r5 = r2.f5401b
            java.lang.reflect.Method r4 = ac.p.E(r4, r5)
            r5 = 0
            if (r4 == 0) goto L2b
            r8.g r6 = r2.f5400a
            ab.b r7 = r2.f5401b
            java.lang.reflect.Method r6 = ac.p.G(r6, r4, r7)
            goto L2c
        L2b:
            r6 = r5
        L2c:
            r7 = 1
            if (r0 == 0) goto L3f
            if (r6 == 0) goto L3f
            hb.h0 r8 = new hb.h0
            r9 = 0
            r8.<init>(r2, r9)
            boolean r0 = r2.b(r0, r8)
            if (r0 == 0) goto L3f
            r8 = r7
            goto L40
        L3f:
            r8 = 0
        L40:
            if (r4 == 0) goto L52
            if (r6 == 0) goto L52
            c9.c2 r0 = new c9.c2
            r9 = 5
            r0.<init>(r2, r9, r6)
            boolean r0 = r2.b(r4, r0)
            if (r0 == 0) goto L52
            r4 = r7
            goto L53
        L52:
            r4 = 0
        L53:
            e8.b r6 = e8.b.f2358a
            r8.g r9 = r2.f5400a
            android.content.Context r0 = r9.f11620a
            java.lang.ClassLoader r10 = r9.f11622c
            java.lang.String r10 = e8.b.g(r0, r10)
            android.content.SharedPreferences r11 = r2.f5405f
            java.lang.ClassLoader r0 = r9.f11622c
            java.lang.String r12 = "retransmit_done_v1"
            java.util.List r0 = e8.b.f(r11, r10, r0, r12)
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            java.util.Iterator r0 = r0.iterator()
        L72:
            boolean r14 = r0.hasNext()
            if (r14 == 0) goto L89
            java.lang.Object r14 = r0.next()
            r15 = r14
            java.lang.reflect.Method r15 = (java.lang.reflect.Method) r15
            boolean r15 = hb.i0.c(r15)
            if (r15 == 0) goto L72
            r13.add(r14)
            goto L72
        L89:
            boolean r0 = r13.isEmpty()
            if (r0 != 0) goto L91
            goto L159
        L91:
            org.luckypray.dexkit.DexKitBridge r0 = r9.f11623d     // Catch: java.lang.Throwable -> Le9
            ch.e r13 = new ch.e     // Catch: java.lang.Throwable -> Le9
            r13.<init>()     // Catch: java.lang.Throwable -> Le9
            fh.k r14 = new fh.k     // Catch: java.lang.Throwable -> Le9
            r14.<init>()     // Catch: java.lang.Throwable -> Le9
            java.lang.String r15 = "com.tencent.mm.ui.transmit.MsgRetransmitUI"
            r3 = 5
            r14.l0(r3, r15)     // Catch: java.lang.Throwable -> Le9
            java.lang.String r3 = "sendResult"
            java.lang.String r15 = "SendMsgUsernames"
            java.lang.String[] r3 = new java.lang.String[]{r3, r15}     // Catch: java.lang.Throwable -> Le9
            java.util.List r3 = a.a.y0(r3)     // Catch: java.lang.Throwable -> Le9
            fh.k.u0(r14, r3)     // Catch: java.lang.Throwable -> Le9
            r13.f1666h = r14     // Catch: java.lang.Throwable -> Le9
            hh.p r0 = r0.findMethod(r13)     // Catch: java.lang.Throwable -> Le9
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Le9
            r3.<init>()     // Catch: java.lang.Throwable -> Le9
            java.util.Iterator r13 = r0.iterator()     // Catch: java.lang.Throwable -> Le9
        Lc1:
            boolean r0 = r13.hasNext()     // Catch: java.lang.Throwable -> Le9
            if (r0 == 0) goto Leb
            java.lang.Object r0 = r13.next()     // Catch: java.lang.Throwable -> Le9
            hh.o r0 = (hh.o) r0     // Catch: java.lang.Throwable -> Le9
            java.lang.ClassLoader r14 = r9.f11622c     // Catch: java.lang.Throwable -> Ld4
            java.lang.reflect.Method r0 = r0.r(r14)     // Catch: java.lang.Throwable -> Ld4
            goto Ldb
        Ld4:
            r0 = move-exception
            sf.f r14 = new sf.f     // Catch: java.lang.Throwable -> Le9
            r14.<init>(r0)     // Catch: java.lang.Throwable -> Le9
            r0 = r14
        Ldb:
            boolean r14 = r0 instanceof sf.f     // Catch: java.lang.Throwable -> Le9
            if (r14 == 0) goto Le1
            r0 = r5
        Le1:
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0     // Catch: java.lang.Throwable -> Le9
            if (r0 == 0) goto Lc1
            r3.add(r0)     // Catch: java.lang.Throwable -> Le9
            goto Lc1
        Le9:
            r0 = move-exception
            goto L134
        Leb:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Le9
            r0.<init>()     // Catch: java.lang.Throwable -> Le9
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> Le9
        Lf4:
            boolean r9 = r3.hasNext()     // Catch: java.lang.Throwable -> Le9
            if (r9 == 0) goto L10b
            java.lang.Object r9 = r3.next()     // Catch: java.lang.Throwable -> Le9
            r13 = r9
            java.lang.reflect.Method r13 = (java.lang.reflect.Method) r13     // Catch: java.lang.Throwable -> Le9
            boolean r13 = hb.i0.c(r13)     // Catch: java.lang.Throwable -> Le9
            if (r13 == 0) goto Lf4
            r0.add(r9)     // Catch: java.lang.Throwable -> Le9
            goto Lf4
        L10b:
            java.util.HashSet r3 = new java.util.HashSet     // Catch: java.lang.Throwable -> Le9
            r3.<init>()     // Catch: java.lang.Throwable -> Le9
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Le9
            r9.<init>()     // Catch: java.lang.Throwable -> Le9
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> Le9
        L119:
            boolean r13 = r0.hasNext()     // Catch: java.lang.Throwable -> Le9
            if (r13 == 0) goto L139
            java.lang.Object r13 = r0.next()     // Catch: java.lang.Throwable -> Le9
            r14 = r13
            java.lang.reflect.Method r14 = (java.lang.reflect.Method) r14     // Catch: java.lang.Throwable -> Le9
            java.lang.String r14 = r14.toGenericString()     // Catch: java.lang.Throwable -> Le9
            boolean r14 = r3.add(r14)     // Catch: java.lang.Throwable -> Le9
            if (r14 == 0) goto L119
            r9.add(r13)     // Catch: java.lang.Throwable -> Le9
            goto L119
        L134:
            sf.f r9 = new sf.f
            r9.<init>(r0)
        L139:
            java.lang.Throwable r0 = sf.g.b(r9)
            if (r0 == 0) goto L146
            ab.b r3 = r2.f5401b
            java.lang.String r13 = "定位群发助手重发完成方法失败"
            r3.invoke(r13, r0)
        L146:
            tf.t r0 = tf.t.f13167g
            boolean r3 = r9 instanceof sf.f
            if (r3 == 0) goto L14d
            r9 = r0
        L14d:
            r13 = r9
            java.util.List r13 = (java.util.List) r13
            boolean r0 = r13.isEmpty()
            if (r0 != 0) goto L159
            r6.j(r11, r10, r12, r13)
        L159:
            boolean r0 = r13.isEmpty()
            if (r0 != 0) goto L185
            boolean r0 = r13.isEmpty()
            if (r0 == 0) goto L166
            goto L183
        L166:
            java.util.Iterator r0 = r13.iterator()
        L16a:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L183
            java.lang.Object r3 = r0.next()
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3
            hb.h0 r6 = new hb.h0
            r9 = 1
            r6.<init>(r2, r9)
            boolean r3 = r2.b(r3, r6)
            if (r3 != 0) goto L16a
            goto L185
        L183:
            r3 = r7
            goto L186
        L185:
            r3 = 0
        L186:
            hb.k r6 = r2.f5408i
            hb.g r9 = r6.i()
            if (r9 == 0) goto L1dd
            r6.f5423f = r9
            boolean r0 = r6.f5427j
            if (r0 == 0) goto L196
            r0 = r7
            goto L1de
        L196:
            r8.i r0 = r8.i.f11631b     // Catch: java.lang.Throwable -> L1a9
            java.lang.reflect.Method r10 = r9.f5379c     // Catch: java.lang.Throwable -> L1a9
            b9.e r11 = new b9.e     // Catch: java.lang.Throwable -> L1a9
            r12 = 11
            r11.<init>(r6, r12)     // Catch: java.lang.Throwable -> L1a9
            r0.b(r10, r11)     // Catch: java.lang.Throwable -> L1a9
            r6.f5427j = r7     // Catch: java.lang.Throwable -> L1a9
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L1a9
            goto L1b0
        L1a9:
            r0 = move-exception
            sf.f r10 = new sf.f
            r10.<init>(r0)
            r0 = r10
        L1b0:
            java.lang.Throwable r10 = sf.g.b(r0)
            if (r10 == 0) goto L1cf
            ab.b r6 = r6.f5419b
            java.lang.reflect.Method r9 = r9.f5379c
            java.lang.String r9 = r9.toGenericString()
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r12 = "微信原生群发助手完成回调Hook失败: "
            r11.<init>(r12)
            r11.append(r9)
            java.lang.String r9 = r11.toString()
            r6.invoke(r9, r10)
        L1cf:
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            boolean r9 = r0 instanceof sf.f
            if (r9 == 0) goto L1d6
            r0 = r6
        L1d6:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            goto L1de
        L1dd:
            r0 = 0
        L1de:
            if (r8 != 0) goto L1e7
            ab.b r6 = r2.f5401b
            java.lang.String r9 = "群发助手菜单创建Hook未安装"
            r6.invoke(r9, r5)
        L1e7:
            if (r4 != 0) goto L1f0
            ab.b r6 = r2.f5401b
            java.lang.String r9 = "群发助手菜单点击Hook未安装"
            r6.invoke(r9, r5)
        L1f0:
            if (r3 != 0) goto L1f9
            ab.b r6 = r2.f5401b
            java.lang.String r9 = "群发助手重发完成Hook未安装"
            r6.invoke(r9, r5)
        L1f9:
            if (r0 != 0) goto L202
            ab.b r2 = r2.f5401b
            java.lang.String r6 = "微信原生群发助手通道未安装"
            r2.invoke(r6, r5)
        L202:
            if (r8 == 0) goto L20c
            if (r4 == 0) goto L20c
            if (r3 == 0) goto L20c
            if (r0 == 0) goto L20c
            r3 = r7
            goto L20d
        L20c:
            r3 = 0
        L20d:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            return r0
        L212:
            java.lang.Object r0 = r1.m()
            return r0
        L217:
            java.lang.Object r0 = r1.l()
            return r0
        L21c:
            java.lang.Object r0 = r1.f144h
            ha.z r0 = (ha.z) r0
            java.lang.String r2 = "com.tencent.mm.plugin.sns.storage.SnsInfo"
            r8.g r0 = r0.f5294a
            java.lang.ClassLoader r0 = r0.f11622c
            java.lang.Class r0 = h.Hchat.utils.KavaReflector.loadClass(r2, r0)
            return r0
        L22b:
            java.lang.Object r0 = r1.k()
            return r0
        L230:
            java.lang.Object r0 = r1.j()
            return r0
        L235:
            java.lang.Object r0 = r1.i()
            return r0
        L23a:
            java.lang.Object r0 = r1.f144h
            g0.n r0 = (g0.n) r0
            r2 = 0
            r0.F = r2
            x1.k.n(r0)
            x1.k.m(r0)
            x1.k.l(r0)
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            return r0
        L24d:
            java.lang.Object r0 = r1.f144h
            g0.j r0 = (g0.j) r0
            r2 = 0
            r0.I = r2
            x1.k.n(r0)
            x1.k.m(r0)
            x1.k.l(r0)
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            return r0
        L260:
            java.lang.Object r0 = r1.h()
            return r0
        L265:
            java.lang.Object r0 = r1.f144h
            f9.a r0 = (f9.a) r0
            f9.e r0 = r0.f3351e
            r2 = 0
            if (r0 == 0) goto L2d4
            r8.g r3 = r0.f3359a
            ab.b r4 = r0.f3360b
            java.util.List r5 = f8.i.j0(r3, r4)
            java.util.List r3 = f8.i.k0(r3, r4)
            boolean r6 = r5.isEmpty()
            r7 = 0
            if (r6 == 0) goto L286
            java.lang.String r6 = "修改聊天记录定位菜单点击方法失败"
            r4.invoke(r6, r7)
        L286:
            boolean r6 = r3.isEmpty()
            if (r6 == 0) goto L291
            java.lang.String r6 = "修改聊天记录定位菜单创建方法失败"
            r4.invoke(r6, r7)
        L291:
            java.util.Iterator r3 = r3.iterator()
            r6 = r2
        L296:
            boolean r8 = r3.hasNext()
            r9 = 1
            if (r8 == 0) goto L2ac
            java.lang.Object r8 = r3.next()
            java.lang.reflect.Method r8 = (java.lang.reflect.Method) r8
            boolean r8 = r0.b(r8, r9)
            if (r8 == 0) goto L296
            int r6 = r6 + 1
            goto L296
        L2ac:
            java.util.Iterator r3 = r5.iterator()
            r5 = r2
        L2b1:
            boolean r8 = r3.hasNext()
            if (r8 == 0) goto L2c6
            java.lang.Object r8 = r3.next()
            java.lang.reflect.Method r8 = (java.lang.reflect.Method) r8
            boolean r8 = r0.b(r8, r2)
            if (r8 == 0) goto L2b1
            int r5 = r5 + 1
            goto L2b1
        L2c6:
            if (r6 <= 0) goto L2ca
            if (r5 > 0) goto L2cf
        L2ca:
            java.lang.String r0 = "修改聊天记录Hook未安装"
            r4.invoke(r0, r7)
        L2cf:
            if (r6 <= 0) goto L2d4
            if (r5 <= 0) goto L2d4
            r2 = r9
        L2d4:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            return r0
        L2d9:
            java.lang.Object r0 = r1.f144h
            f0.u r0 = (f0.u) r0
            android.view.inputmethod.BaseInputConnection r2 = new android.view.inputmethod.BaseInputConnection
            android.view.View r0 = r0.f2999a
            r3 = 0
            r2.<init>(r0, r3)
            return r2
        L2e6:
            java.lang.Object r0 = r1.f144h
            f0.n r0 = (f0.n) r0
            android.view.View r0 = r0.f2972b
            android.content.Context r0 = r0.getContext()
            java.lang.String r2 = "input_method"
            java.lang.Object r0 = r0.getSystemService(r2)
            r0.getClass()
            android.view.inputmethod.InputMethodManager r0 = (android.view.inputmethod.InputMethodManager) r0
            return r0
        L2fc:
            java.lang.Object r0 = r1.f144h
            wb.p3 r0 = (wb.p3) r0
            java.lang.Boolean r0 = h.Hchat.hooks.items.script.ScriptPluginBridge.o(r0)
            return r0
        L305:
            java.lang.Object r0 = r1.f144h
            java.util.concurrent.CopyOnWriteArrayList r0 = (java.util.concurrent.CopyOnWriteArrayList) r0
            java.lang.Boolean r0 = h.Hchat.hooks.items.script.ScriptPluginBridge.p(r0)
            return r0
        L30e:
            java.lang.Object r0 = r1.g()
            return r0
        L313:
            java.lang.Object r0 = r1.f()
            return r0
        L318:
            java.lang.Object r0 = r1.e()
            return r0
        L31d:
            java.lang.Object r0 = r1.f144h
            b9.a r0 = (b9.a) r0
            java.lang.Object r0 = r0.f524f
            r2 = r0
            cb.f r2 = (cb.f) r2
            r0 = 0
            if (r2 == 0) goto L385
            monitor-enter(r2)
            boolean r3 = r2.f1622c     // Catch: java.lang.Throwable -> L366
            r4 = 1
            if (r3 == 0) goto L332
            monitor-exit(r2)
            r3 = r4
            goto L37f
        L332:
            cb.c r3 = r2.o()     // Catch: java.lang.Throwable -> L366
            if (r3 == 0) goto L378
            java.lang.reflect.Method r5 = r3.f1612a     // Catch: java.lang.Throwable -> L366
            r6 = -1
            r7 = 2
            boolean r5 = r2.f(r5, r7, r6)     // Catch: java.lang.Throwable -> L366
            java.lang.reflect.Constructor r6 = r3.f1613b     // Catch: java.lang.Throwable -> L366
            java.lang.Class[] r8 = r6.getParameterTypes()     // Catch: java.lang.Throwable -> L366
            r8.getClass()     // Catch: java.lang.Throwable -> L366
            int r8 = cb.f.m(r8)     // Catch: java.lang.Throwable -> L366
            boolean r6 = r2.f(r6, r7, r8)     // Catch: java.lang.Throwable -> L366
            java.lang.reflect.Method r3 = r3.f1614c     // Catch: java.lang.Throwable -> L366
            if (r3 == 0) goto L368
            java.lang.Class[] r7 = r3.getParameterTypes()     // Catch: java.lang.Throwable -> L366
            r7.getClass()     // Catch: java.lang.Throwable -> L366
            int r7 = cb.f.m(r7)     // Catch: java.lang.Throwable -> L366
            r8 = 3
            boolean r3 = r2.f(r3, r8, r7)     // Catch: java.lang.Throwable -> L366
            goto L369
        L366:
            r0 = move-exception
            goto L383
        L368:
            r3 = r4
        L369:
            if (r5 == 0) goto L371
            if (r6 == 0) goto L371
            if (r3 == 0) goto L371
            r3 = r4
            goto L372
        L371:
            r3 = r0
        L372:
            r2.f1622c = r3     // Catch: java.lang.Throwable -> L366
            boolean r3 = r2.f1622c     // Catch: java.lang.Throwable -> L366
            monitor-exit(r2)
            goto L37f
        L378:
            java.lang.String r3 = "[Hchat:RoundAvatar] 定位微信全局头像入口失败"
            fb.v0.m(r3)     // Catch: java.lang.Throwable -> L366
            monitor-exit(r2)
            r3 = r0
        L37f:
            if (r3 != r4) goto L385
            r0 = r4
            goto L385
        L383:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L366
            throw r0
        L385:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L38a:
            java.lang.Object r0 = r1.f144h
            b5.c r0 = (b5.c) r0
            java.lang.Object r2 = r0.f469a
            r8.g r2 = (r8.g) r2
            java.lang.Object r0 = r0.f470b
            r3 = r0
            ab.b r3 = (ab.b) r3
            r2.getClass()
            android.content.Context r0 = r2.f11620a
            java.lang.String r4 = "Hchat_chat_live_photo_method_cache"
            android.content.SharedPreferences r4 = ub.b.c(r0, r4)
            java.lang.ClassLoader r5 = r2.f11622c
            java.lang.String r6 = e8.b.g(r0, r5)
            java.lang.String r7 = "storage_getter_v1"
            java.lang.reflect.Method r0 = e8.b.c(r4, r6, r5, r7)
            java.lang.String r8 = "record_query_v1"
            java.lang.reflect.Method r9 = e8.b.c(r4, r6, r5, r8)
            java.lang.String r10 = "media_factory_v1"
            java.lang.reflect.Method r11 = e8.b.c(r4, r6, r5, r10)
            r12 = 0
            r13 = 1
            if (r0 == 0) goto L3fe
            if (r9 == 0) goto L3fe
            if (r11 == 0) goto L3fe
            ca.b r15 = new ca.b
            r15.<init>(r0, r9, r11)
            java.lang.Class[] r14 = r11.getParameterTypes()
            r14.getClass()
            java.lang.Object r14 = tf.l.C0(r12, r14)
            java.lang.Class r14 = (java.lang.Class) r14
            if (r14 == 0) goto L3f9
            boolean r14 = ac.p.x(r14, r11)
            if (r14 == 0) goto L3f9
            java.lang.Class[] r11 = r11.getParameterTypes()
            r11 = r11[r13]
            r11.getClass()
            boolean r11 = ac.p.B(r11, r9)
            if (r11 == 0) goto L3f9
            java.lang.Class r9 = r9.getDeclaringClass()
            r9.getClass()
            boolean r0 = ac.p.C(r9, r0)
            if (r0 == 0) goto L3f9
            goto L3fa
        L3f9:
            r15 = 0
        L3fa:
            if (r15 == 0) goto L3fe
            goto L567
        L3fe:
            e8.b.a(r4, r6, r7)
            e8.b.a(r4, r6, r8)
            e8.b.a(r4, r6, r10)
            org.luckypray.dexkit.DexKitBridge r0 = r2.f11623d     // Catch: java.lang.Throwable -> L4a4
            ch.e r2 = new ch.e     // Catch: java.lang.Throwable -> L4a4
            r2.<init>()     // Catch: java.lang.Throwable -> L4a4
            fh.k r9 = new fh.k     // Catch: java.lang.Throwable -> L4a4
            r9.<init>()     // Catch: java.lang.Throwable -> L4a4
            java.lang.String r11 = "ChatLiveMediaInfo imgInfo query failed, msgId="
            java.lang.String r14 = "create ChatLiveMediaInfo, msgId="
            java.lang.String[] r11 = new java.lang.String[]{r11, r14}     // Catch: java.lang.Throwable -> L4a4
            java.util.List r11 = a.a.y0(r11)     // Catch: java.lang.Throwable -> L4a4
            fh.k.u0(r9, r11)     // Catch: java.lang.Throwable -> L4a4
            r2.f1666h = r9     // Catch: java.lang.Throwable -> L4a4
            hh.p r0 = r0.findMethod(r2)     // Catch: java.lang.Throwable -> L4a4
            java.util.Iterator r2 = r0.iterator()     // Catch: java.lang.Throwable -> L4a4
            r2.getClass()     // Catch: java.lang.Throwable -> L4a4
        L42f:
            boolean r0 = r2.hasNext()     // Catch: java.lang.Throwable -> L4a4
            if (r0 == 0) goto L538
            java.lang.Object r0 = r2.next()     // Catch: java.lang.Throwable -> L4a4
            r0.getClass()     // Catch: java.lang.Throwable -> L4a4
            r9 = r0
            hh.o r9 = (hh.o) r9     // Catch: java.lang.Throwable -> L4a4
            lh.d r0 = r9.p()     // Catch: java.lang.Throwable -> L448
            java.lang.reflect.Method r0 = r0.b(r5)     // Catch: java.lang.Throwable -> L448
            goto L44f
        L448:
            r0 = move-exception
            sf.f r11 = new sf.f     // Catch: java.lang.Throwable -> L4a4
            r11.<init>(r0)     // Catch: java.lang.Throwable -> L4a4
            r0 = r11
        L44f:
            boolean r11 = r0 instanceof sf.f     // Catch: java.lang.Throwable -> L4a4
            if (r11 == 0) goto L455
            r0 = 0
        L455:
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0     // Catch: java.lang.Throwable -> L4a4
            if (r0 == 0) goto L42f
            java.lang.Class[] r0 = r0.getParameterTypes()     // Catch: java.lang.Throwable -> L4a4
            r0.getClass()     // Catch: java.lang.Throwable -> L4a4
            int r11 = r0.length     // Catch: java.lang.Throwable -> L4a4
            if (r11 != r13) goto L467
            r0 = r0[r12]     // Catch: java.lang.Throwable -> L4a4
            r11 = r0
            goto L468
        L467:
            r11 = 0
        L468:
            if (r11 == 0) goto L42f
            hh.p r0 = r9.q()     // Catch: java.lang.Throwable -> L4a4
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L4a4
            r9.<init>()     // Catch: java.lang.Throwable -> L4a4
            java.util.Iterator r14 = r0.iterator()     // Catch: java.lang.Throwable -> L4a4
        L477:
            boolean r0 = r14.hasNext()     // Catch: java.lang.Throwable -> L4a4
            if (r0 == 0) goto L4a7
            java.lang.Object r0 = r14.next()     // Catch: java.lang.Throwable -> L4a4
            hh.o r0 = (hh.o) r0     // Catch: java.lang.Throwable -> L4a4
            r0.getClass()     // Catch: java.lang.Throwable -> L48f
            lh.d r0 = r0.p()     // Catch: java.lang.Throwable -> L48f
            java.lang.reflect.Method r0 = r0.b(r5)     // Catch: java.lang.Throwable -> L48f
            goto L496
        L48f:
            r0 = move-exception
            sf.f r15 = new sf.f     // Catch: java.lang.Throwable -> L4a4
            r15.<init>(r0)     // Catch: java.lang.Throwable -> L4a4
            r0 = r15
        L496:
            boolean r15 = r0 instanceof sf.f     // Catch: java.lang.Throwable -> L4a4
            if (r15 == 0) goto L49c
            r0 = 0
        L49c:
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0     // Catch: java.lang.Throwable -> L4a4
            if (r0 == 0) goto L477
            r9.add(r0)     // Catch: java.lang.Throwable -> L4a4
            goto L477
        L4a4:
            r0 = move-exception
            goto L53a
        L4a7:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L4a4
            r0.<init>()     // Catch: java.lang.Throwable -> L4a4
            java.util.Iterator r14 = r9.iterator()     // Catch: java.lang.Throwable -> L4a4
        L4b0:
            boolean r15 = r14.hasNext()     // Catch: java.lang.Throwable -> L4a4
            if (r15 == 0) goto L4c8
            java.lang.Object r15 = r14.next()     // Catch: java.lang.Throwable -> L4a4
            r12 = r15
            java.lang.reflect.Method r12 = (java.lang.reflect.Method) r12     // Catch: java.lang.Throwable -> L4a4
            boolean r12 = ac.p.x(r11, r12)     // Catch: java.lang.Throwable -> L4a4
            if (r12 == 0) goto L4c6
            r0.add(r15)     // Catch: java.lang.Throwable -> L4a4
        L4c6:
            r12 = 0
            goto L4b0
        L4c8:
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L4a4
        L4cc:
            boolean r11 = r0.hasNext()     // Catch: java.lang.Throwable -> L4a4
            if (r11 == 0) goto L535
            java.lang.Object r11 = r0.next()     // Catch: java.lang.Throwable -> L4a4
            java.lang.reflect.Method r11 = (java.lang.reflect.Method) r11     // Catch: java.lang.Throwable -> L4a4
            java.lang.Class[] r12 = r11.getParameterTypes()     // Catch: java.lang.Throwable -> L4a4
            r12 = r12[r13]     // Catch: java.lang.Throwable -> L4a4
            java.util.Iterator r14 = r9.iterator()     // Catch: java.lang.Throwable -> L4a4
        L4e2:
            boolean r15 = r14.hasNext()     // Catch: java.lang.Throwable -> L4a4
            if (r15 == 0) goto L4fb
            java.lang.Object r15 = r14.next()     // Catch: java.lang.Throwable -> L4a4
            r13 = r15
            java.lang.reflect.Method r13 = (java.lang.reflect.Method) r13     // Catch: java.lang.Throwable -> L4a4
            r12.getClass()     // Catch: java.lang.Throwable -> L4a4
            boolean r13 = ac.p.B(r12, r13)     // Catch: java.lang.Throwable -> L4a4
            if (r13 == 0) goto L4f9
            goto L4fc
        L4f9:
            r13 = 1
            goto L4e2
        L4fb:
            r15 = 0
        L4fc:
            java.lang.reflect.Method r15 = (java.lang.reflect.Method) r15     // Catch: java.lang.Throwable -> L4a4
            if (r15 == 0) goto L533
            java.util.Iterator r12 = r9.iterator()     // Catch: java.lang.Throwable -> L4a4
        L504:
            boolean r13 = r12.hasNext()     // Catch: java.lang.Throwable -> L4a4
            if (r13 == 0) goto L524
            java.lang.Object r13 = r12.next()     // Catch: java.lang.Throwable -> L4a4
            r14 = r13
            java.lang.reflect.Method r14 = (java.lang.reflect.Method) r14     // Catch: java.lang.Throwable -> L4a4
            r16 = r0
            java.lang.Class r0 = r15.getDeclaringClass()     // Catch: java.lang.Throwable -> L4a4
            r0.getClass()     // Catch: java.lang.Throwable -> L4a4
            boolean r0 = ac.p.C(r0, r14)     // Catch: java.lang.Throwable -> L4a4
            if (r0 == 0) goto L521
            goto L527
        L521:
            r0 = r16
            goto L504
        L524:
            r16 = r0
            r13 = 0
        L527:
            java.lang.reflect.Method r13 = (java.lang.reflect.Method) r13     // Catch: java.lang.Throwable -> L4a4
            if (r13 == 0) goto L531
            ca.b r0 = new ca.b     // Catch: java.lang.Throwable -> L4a4
            r0.<init>(r13, r15, r11)     // Catch: java.lang.Throwable -> L4a4
            goto L540
        L531:
            r0 = r16
        L533:
            r13 = 1
            goto L4cc
        L535:
            r12 = 0
            goto L42f
        L538:
            r0 = 0
            goto L540
        L53a:
            sf.f r2 = new sf.f
            r2.<init>(r0)
            r0 = r2
        L540:
            java.lang.Throwable r2 = sf.g.b(r0)
            if (r2 == 0) goto L54b
            java.lang.String r5 = "定位聊天实况图片方法失败"
            r3.invoke(r5, r2)
        L54b:
            boolean r2 = r0 instanceof sf.f
            if (r2 == 0) goto L550
            r0 = 0
        L550:
            ca.b r0 = (ca.b) r0
            if (r0 == 0) goto L565
            java.lang.reflect.Method r2 = r0.f1462a
            e8.b.h(r4, r6, r7, r2)
            java.lang.reflect.Method r2 = r0.f1463b
            e8.b.h(r4, r6, r8, r2)
            java.lang.reflect.Method r2 = r0.f1464c
            e8.b.h(r4, r6, r10, r2)
            r14 = r0
            goto L566
        L565:
            r14 = 0
        L566:
            r15 = r14
        L567:
            return r15
        L568:
            java.lang.Object r0 = r1.f144h
            c9.r1 r0 = (c9.r1) r0
            android.app.Activity r0 = r0.f1335a
            c9.d2.y(r0)
            sf.n r0 = sf.n.f12433a
            return r0
        L574:
            java.lang.Object r0 = r1.f144h
            c0.n r0 = (c0.n) r0
            boolean r2 = r0.f21832t
            if (r2 == 0) goto L581
            z.c r0 = c0.k.b(r0)
            goto L583
        L581:
            z.c r0 = z.c.f22461b
        L583:
            return r0
        L584:
            java.lang.Object r0 = r1.f144h
            bb.e r0 = (bb.e) r0
            bb.g r2 = r0.f647e
            r3 = 0
            if (r2 == 0) goto L62f
            boolean r0 = r2.f662l
            r4 = 1
            if (r0 == 0) goto L594
            goto L625
        L594:
            java.lang.String r0 = "fillingUsername:need getKfInfo"
            r8.g r5 = r2.f651a
            android.content.Context r6 = r5.f11620a
            java.lang.ClassLoader r7 = r5.f11622c
            r7.getClass()
            l8.i r6 = o8.k.a(r6, r7)
            java.lang.String r6 = r6.f7933h
            android.content.SharedPreferences r7 = r2.f661k
            java.lang.ClassLoader r5 = r5.f11622c
            java.lang.String r8 = "username_bind"
            java.lang.reflect.Method r5 = e8.b.c(r7, r6, r5, r8)
            r9 = 0
            if (r5 == 0) goto L5bd
            boolean r10 = r2.m(r5)
            if (r10 == 0) goto L5b9
            goto L5ba
        L5b9:
            r5 = r9
        L5ba:
            if (r5 == 0) goto L5bd
            goto L616
        L5bd:
            java.lang.String r5 = "MicroMsg.ChattingItem"
            java.lang.String[] r5 = new java.lang.String[]{r5, r0}
            java.util.List r5 = r2.g(r5)
            boolean r10 = r5.isEmpty()
            if (r10 == 0) goto L5d5
            java.lang.String[] r0 = new java.lang.String[]{r0}
            java.util.List r5 = r2.g(r0)
        L5d5:
            java.util.Iterator r0 = r5.iterator()
        L5d9:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L5ed
            java.lang.Object r5 = r0.next()
            r10 = r5
            java.lang.reflect.Method r10 = (java.lang.reflect.Method) r10
            boolean r10 = r2.m(r10)
            if (r10 == 0) goto L5d9
            r9 = r5
        L5ed:
            r5 = r9
            java.lang.reflect.Method r5 = (java.lang.reflect.Method) r5
            if (r5 == 0) goto L5f6
            e8.b.h(r7, r6, r8, r5)
            goto L616
        L5f6:
            java.lang.String r0 = "cache.key"
            android.content.SharedPreferences$Editor r9 = r7.edit()     // Catch: java.lang.Throwable -> L616
            java.lang.String r10 = ""
            java.lang.String r7 = r7.getString(r0, r10)     // Catch: java.lang.Throwable -> L616
            boolean r7 = gg.l.a(r7, r6)     // Catch: java.lang.Throwable -> L616
            if (r7 != 0) goto L60f
            android.content.SharedPreferences$Editor r7 = r9.clear()     // Catch: java.lang.Throwable -> L616
            r7.putString(r0, r6)     // Catch: java.lang.Throwable -> L616
        L60f:
            android.content.SharedPreferences$Editor r0 = r9.remove(r8)     // Catch: java.lang.Throwable -> L616
            r0.apply()     // Catch: java.lang.Throwable -> L616
        L616:
            if (r5 == 0) goto L62f
            r8.i r0 = r8.i.f11631b     // Catch: java.lang.Throwable -> L627
            b9.e r6 = new b9.e     // Catch: java.lang.Throwable -> L627
            r7 = 3
            r6.<init>(r2, r7)     // Catch: java.lang.Throwable -> L627
            r0.b(r5, r6)     // Catch: java.lang.Throwable -> L627
            r2.f662l = r4     // Catch: java.lang.Throwable -> L627
        L625:
            r3 = r4
            goto L62f
        L627:
            r0 = move-exception
            ab.b r2 = r2.f655e
            java.lang.String r4 = "实名尾字Hook安装失败"
            r2.invoke(r4, r0)
        L62f:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            return r0
        L634:
            java.lang.Object r0 = r1.f144h
            ba.m r0 = (ba.m) r0
            java.util.ArrayList r2 = ba.m.f593w
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
            int r4 = tf.n.e1(r2)
            int r4 = tf.y.a0(r4)
            r5 = 16
            if (r4 >= r5) goto L649
            r4 = r5
        L649:
            r3.<init>(r4)
            java.util.Iterator r2 = r2.iterator()
        L650:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L675
            java.lang.Object r4 = r2.next()
            r5 = r4
            java.lang.String r5 = (java.lang.String) r5
            r8.g r6 = r0.f594a
            android.content.Context r6 = r6.f11620a
            android.content.res.Resources r6 = r6.getResources()
            java.lang.String r7 = "id"
            java.lang.String r8 = "com.tencent.mm"
            int r5 = r6.getIdentifier(r5, r7, r8)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r3.put(r4, r5)
            goto L650
        L675:
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            java.util.Set r2 = r3.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L682:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L6a6
            java.lang.Object r3 = r2.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getValue()
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            if (r4 == 0) goto L682
            java.lang.Object r4 = r3.getKey()
            java.lang.Object r3 = r3.getValue()
            r0.put(r4, r3)
            goto L682
        L6a6:
            return r0
        L6a7:
            java.lang.Object r0 = r1.f144h
            b9.a r0 = (b9.a) r0
            java.lang.Object r0 = r0.f524f
            r2 = r0
            ba.m r2 = (ba.m) r2
            r3 = 0
            if (r2 == 0) goto L769
            java.lang.String r4 = "[Hchat:MessageBubble] 安装聊天气泡 Hook 失败: "
            java.lang.String r0 = "[Hchat:MessageBubble] 未找到聊天气泡资源: "
            monitor-enter(r2)
            boolean r5 = r2.f607n     // Catch: java.lang.Throwable -> L6f0
            r6 = 1
            if (r5 == 0) goto L6c1
            monitor-exit(r2)
            r0 = r6
            goto L763
        L6c1:
            android.content.SharedPreferences r5 = r2.f595b     // Catch: java.lang.Throwable -> L6f0
            java.lang.String r7 = "message_bubble_enable"
            boolean r5 = r5.getBoolean(r7, r3)     // Catch: java.lang.Throwable -> L6f0
            if (r5 == 0) goto L6fb
            r8.g r5 = r2.f594a     // Catch: java.lang.Throwable -> L6f0
            android.content.Context r5 = r5.f11620a     // Catch: java.lang.Throwable -> L6f0
            android.content.res.Resources r5 = r5.getResources()     // Catch: java.lang.Throwable -> L6f0
            android.content.res.Configuration r5 = r5.getConfiguration()     // Catch: java.lang.Throwable -> L6f0
            int r5 = r5.uiMode     // Catch: java.lang.Throwable -> L6f0
            r5 = r5 & 48
            r7 = 32
            if (r5 != r7) goto L6e1
            r5 = r6
            goto L6e2
        L6e1:
            r5 = r3
        L6e2:
            if (r5 == 0) goto L6f3
            android.content.SharedPreferences r5 = r2.f595b     // Catch: java.lang.Throwable -> L6f0
            java.lang.String r7 = "message_bubble_separate_dark_mode"
            boolean r5 = r5.getBoolean(r7, r3)     // Catch: java.lang.Throwable -> L6f0
            if (r5 == 0) goto L6f3
            r5 = r6
            goto L6f4
        L6f0:
            r0 = move-exception
            goto L767
        L6f3:
            r5 = r3
        L6f4:
            r8.g r7 = r2.f594a     // Catch: java.lang.Throwable -> L6f0
            android.content.Context r7 = r7.f11620a     // Catch: java.lang.Throwable -> L6f0
            ba.r.g(r7, r5)     // Catch: java.lang.Throwable -> L6f0
        L6fb:
            java.util.Map r5 = r2.g()     // Catch: java.lang.Throwable -> L6f0
            boolean r5 = r5.isEmpty()     // Catch: java.lang.Throwable -> L6f0
            if (r5 == 0) goto L71b
            java.util.ArrayList r7 = ba.m.f593w     // Catch: java.lang.Throwable -> L6f0
            r11 = 0
            r12 = 63
            r8 = 0
            r9 = 0
            r10 = 0
            java.lang.String r4 = tf.m.A1(r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> L6f0
            java.lang.String r0 = r0.concat(r4)     // Catch: java.lang.Throwable -> L6f0
            fb.v0.m(r0)     // Catch: java.lang.Throwable -> L6f0
            monitor-exit(r2)
        L719:
            r0 = r3
            goto L763
        L71b:
            java.lang.reflect.Method r0 = r2.p()     // Catch: java.lang.Throwable -> L6f0
            if (r0 == 0) goto L75c
            r8.i r5 = r8.i.f11631b     // Catch: java.lang.Throwable -> L731
            b9.e r7 = new b9.e     // Catch: java.lang.Throwable -> L731
            r8 = 1
            r7.<init>(r2, r8)     // Catch: java.lang.Throwable -> L731
            r5.b(r0, r7)     // Catch: java.lang.Throwable -> L731
            r2.f607n = r6     // Catch: java.lang.Throwable -> L731
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L731
            goto L738
        L731:
            r0 = move-exception
            sf.f r5 = new sf.f     // Catch: java.lang.Throwable -> L6f0
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L6f0
            r0 = r5
        L738:
            java.lang.Throwable r5 = sf.g.b(r0)     // Catch: java.lang.Throwable -> L6f0
            if (r5 != 0) goto L73f
            goto L754
        L73f:
            java.lang.String r0 = r5.getMessage()     // Catch: java.lang.Throwable -> L6f0
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6f0
            r7.<init>(r4)     // Catch: java.lang.Throwable -> L6f0
            r7.append(r0)     // Catch: java.lang.Throwable -> L6f0
            java.lang.String r0 = r7.toString()     // Catch: java.lang.Throwable -> L6f0
            fb.v0.n(r0, r5)     // Catch: java.lang.Throwable -> L6f0
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L6f0
        L754:
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L6f0
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L6f0
            monitor-exit(r2)
            goto L763
        L75c:
            java.lang.String r0 = "[Hchat:MessageBubble] 定位聊天消息绑定方法失败"
            fb.v0.m(r0)     // Catch: java.lang.Throwable -> L6f0
            monitor-exit(r2)
            goto L719
        L763:
            if (r0 != r6) goto L769
            r3 = r6
            goto L769
        L767:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L6f0
            throw r0
        L769:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            return r0
        L76e:
            java.lang.Object r0 = r1.f144h
            b9.a r0 = (b9.a) r0
            java.lang.Object r0 = r0.f524f
            r2 = r0
            b9.f r2 = (b9.f) r2
            r3 = 0
            if (r2 == 0) goto L7d5
            java.lang.String r4 = "[Hchat:ChatTimeStyle] 安装聊天时间样式 Hook 失败: "
            monitor-enter(r2)
            boolean r0 = r2.f540d     // Catch: java.lang.Throwable -> L7c6
            r5 = 1
            if (r0 == 0) goto L785
            monitor-exit(r2)
            r0 = r5
            goto L7cf
        L785:
            java.lang.reflect.Method r0 = r2.h()     // Catch: java.lang.Throwable -> L7c6
            if (r0 == 0) goto L7c8
            r8.i r6 = r8.i.f11631b     // Catch: java.lang.Throwable -> L79b
            b9.e r7 = new b9.e     // Catch: java.lang.Throwable -> L79b
            r8 = 0
            r7.<init>(r2, r8)     // Catch: java.lang.Throwable -> L79b
            r6.b(r0, r7)     // Catch: java.lang.Throwable -> L79b
            r2.f540d = r5     // Catch: java.lang.Throwable -> L79b
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L79b
            goto L7a2
        L79b:
            r0 = move-exception
            sf.f r6 = new sf.f     // Catch: java.lang.Throwable -> L7c6
            r6.<init>(r0)     // Catch: java.lang.Throwable -> L7c6
            r0 = r6
        L7a2:
            java.lang.Throwable r6 = sf.g.b(r0)     // Catch: java.lang.Throwable -> L7c6
            if (r6 != 0) goto L7a9
            goto L7be
        L7a9:
            java.lang.String r0 = r6.getMessage()     // Catch: java.lang.Throwable -> L7c6
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7c6
            r7.<init>(r4)     // Catch: java.lang.Throwable -> L7c6
            r7.append(r0)     // Catch: java.lang.Throwable -> L7c6
            java.lang.String r0 = r7.toString()     // Catch: java.lang.Throwable -> L7c6
            fb.v0.n(r0, r6)     // Catch: java.lang.Throwable -> L7c6
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L7c6
        L7be:
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L7c6
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L7c6
            monitor-exit(r2)
            goto L7cf
        L7c6:
            r0 = move-exception
            goto L7d3
        L7c8:
            java.lang.String r0 = "[Hchat:ChatTimeStyle] 定位聊天时间绑定方法失败"
            fb.v0.m(r0)     // Catch: java.lang.Throwable -> L7c6
            monitor-exit(r2)
            r0 = r3
        L7cf:
            if (r0 != r5) goto L7d5
            r3 = r5
            goto L7d5
        L7d3:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L7c6
            throw r0
        L7d5:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            return r0
        L7da:
            java.lang.Object r0 = r1.f144h
            android.app.RemoteAction r0 = (android.app.RemoteAction) r0
            android.app.PendingIntent r2 = r0.getActionIntent()
            int r0 = android.os.Build.VERSION.SDK_INT
            r3 = 34
            if (r0 < r3) goto L815
            android.app.ActivityOptions r0 = android.app.ActivityOptions.makeBasic()     // Catch: android.app.PendingIntent.CanceledException -> L7f8
            android.app.ActivityOptions r0 = b0.a0.a(r0)     // Catch: android.app.PendingIntent.CanceledException -> L7f8
            android.os.Bundle r0 = r0.toBundle()     // Catch: android.app.PendingIntent.CanceledException -> L7f8
            b0.a0.m(r2, r0)     // Catch: android.app.PendingIntent.CanceledException -> L7f8
            goto L818
        L7f8:
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
            goto L818
        L815:
            r2.send()
        L818:
            sf.n r0 = sf.n.f12433a
            return r0
        L81b:
            java.lang.Object r0 = r1.f144h
            z.g r0 = (z.g) r0
            r0.close()
            sf.n r0 = sf.n.f12433a
            return r0
        L825:
            java.lang.Object r0 = r1.f144h
            d0.d r0 = (d0.d) r0
            z.c r0 = r0.j0()
            return r0
        L82e:
            java.lang.Object r0 = r1.f144h
            ab.c r0 = (ab.c) r0
            ab.f r2 = r0.f146e
            r0 = 0
            if (r2 == 0) goto L864
            monitor-enter(r2)
            boolean r3 = r2.f158f     // Catch: java.lang.Throwable -> L861
            r4 = 1
            if (r3 == 0) goto L840
            monitor-exit(r2)
            r3 = r4
            goto L85d
        L840:
            boolean r3 = r2.d()     // Catch: java.lang.Throwable -> L861
            boolean r5 = r2.e()     // Catch: java.lang.Throwable -> L861
            boolean r6 = r2.f()     // Catch: java.lang.Throwable -> L861
            r2.j()     // Catch: java.lang.Throwable -> L84f
        L84f:
            if (r3 == 0) goto L857
            if (r5 != 0) goto L855
            if (r6 == 0) goto L857
        L855:
            r3 = r4
            goto L858
        L857:
            r3 = r0
        L858:
            r2.f158f = r3     // Catch: java.lang.Throwable -> L861
            boolean r3 = r2.f158f     // Catch: java.lang.Throwable -> L861
            monitor-exit(r2)
        L85d:
            if (r3 != r4) goto L864
            r0 = r4
            goto L864
        L861:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L861
            throw r0
        L864:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
    }
}
