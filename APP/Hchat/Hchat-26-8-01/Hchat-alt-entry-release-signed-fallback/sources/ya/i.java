package ya;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicBoolean f22391a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile r8.g f22392b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile java.lang.reflect.Method f22393c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile java.lang.Object f22394d;

    static {
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 0
            r0.<init>(r1)
            ya.i.f22391a = r0
            return
    }

    public static void a(r8.g r4) {
            r4.getClass()
            ya.i.f22392b = r4
            java.util.concurrent.atomic.AtomicBoolean r0 = ya.i.f22391a
            r1 = 1
            r2 = 0
            boolean r0 = r0.compareAndSet(r2, r1)
            if (r0 != 0) goto L10
            return
        L10:
            java.lang.reflect.Method r0 = d(r4, r2)
            if (r0 == 0) goto L20
            h.Hchat.hooks.api.runtime.WeChatDatabaseApi r1 = h.Hchat.hooks.api.core.WeChatApis.database()
            if (r1 == 0) goto L20
            java.lang.Object r0 = g(r1, r0)
        L20:
            android.os.Handler r0 = r8.e.f11615a
            r8.c r0 = r8.c.f11604j
            c9.f r1 = new c9.f
            r2 = 9
            r1.<init>(r4, r2)
            r4 = 8
            java.lang.String r2 = "quick_mark_read:native_mark_read"
            java.lang.String r3 = "快捷已读原生已读入口"
            r8.e.f(r4, r1, r2, r3, r0)
            return
    }

    public static boolean b(java.lang.reflect.Method r3) {
            boolean r0 = h.Hchat.utils.KavaReflector.isStatic(r3)
            r1 = 0
            if (r0 == 0) goto L8
            goto L2f
        L8:
            java.lang.Class r0 = r3.getReturnType()
            java.lang.Class[] r3 = r3.getParameterTypes()
            java.lang.Class r2 = java.lang.Boolean.TYPE
            boolean r2 = gg.l.a(r0, r2)
            if (r2 != 0) goto L20
            java.lang.Class<java.lang.Boolean> r2 = java.lang.Boolean.class
            boolean r0 = gg.l.a(r0, r2)
            if (r0 == 0) goto L2f
        L20:
            int r0 = r3.length
            r2 = 1
            if (r0 != r2) goto L2f
            r3 = r3[r1]
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            boolean r3 = gg.l.a(r3, r0)
            if (r3 == 0) goto L2f
            return r2
        L2f:
            return r1
    }

    public static final boolean c(android.content.Context r2) {
            r0 = 0
            if (r2 != 0) goto L4
            return r0
        L4:
            java.lang.String r1 = "Hchat_quick_mark_read_config"
            android.content.SharedPreferences r2 = ub.b.c(r2, r1)
            java.lang.String r1 = "plus_menu_read_enable"
            boolean r2 = r2.getBoolean(r1, r0)
            return r2
    }

    public static java.lang.reflect.Method d(r8.g r10, boolean r11) {
            android.content.Context r0 = r10.f11620a
            java.lang.String r1 = "Hchat_quick_mark_read_method_cache"
            android.content.SharedPreferences r0 = ub.b.c(r0, r1)
            android.content.Context r1 = r10.f11620a
            java.lang.ClassLoader r2 = r10.f11622c
            r2.getClass()
            l8.i r1 = o8.k.a(r1, r2)
            java.lang.String r1 = r1.f7933h
            boolean r2 = og.m.t0(r1)
            r3 = 0
            if (r2 != 0) goto L1d
            goto L1e
        L1d:
            r1 = r3
        L1e:
            if (r1 == 0) goto L27
            java.lang.String r2 = "|quick_mark_read_native_v1"
            java.lang.String r1 = r1.concat(r2)
            goto L28
        L27:
            r1 = r3
        L28:
            java.lang.String r2 = ""
            if (r1 != 0) goto L2d
            r1 = r2
        L2d:
            java.lang.ClassLoader r4 = r10.f11622c
            java.lang.String r5 = "native_mark_read"
            java.lang.reflect.Method r4 = e8.b.c(r0, r1, r4, r5)
            if (r4 == 0) goto L40
            boolean r6 = b(r4)
            if (r6 == 0) goto L40
            ya.i.f22393c = r4
            return r4
        L40:
            if (r4 == 0) goto L49
            e8.b.a(r0, r1, r5)
            ya.i.f22393c = r3
            ya.i.f22394d = r3
        L49:
            if (r11 != 0) goto L4c
            return r3
        L4c:
            org.luckypray.dexkit.DexKitBridge r11 = r10.f11623d     // Catch: java.lang.Throwable -> L8a
            ch.e r4 = new ch.e     // Catch: java.lang.Throwable -> L8a
            r4.<init>()     // Catch: java.lang.Throwable -> L8a
            fh.k r6 = new fh.k     // Catch: java.lang.Throwable -> L8a
            r6.<init>()     // Catch: java.lang.Throwable -> L8a
            java.lang.String r7 = "updateUnreadByTalker %s"
            java.lang.String r8 = "unReadMuteCount"
            java.lang.String r9 = "atCount"
            java.lang.String[] r7 = new java.lang.String[]{r7, r8, r9}     // Catch: java.lang.Throwable -> L8a
            r6.r0(r7)     // Catch: java.lang.Throwable -> L8a
            r4.f1666h = r6     // Catch: java.lang.Throwable -> L8a
            hh.p r11 = r11.findMethod(r4)     // Catch: java.lang.Throwable -> L8a
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L8a
            r4.<init>()     // Catch: java.lang.Throwable -> L8a
            java.util.Iterator r11 = r11.iterator()     // Catch: java.lang.Throwable -> L8a
        L74:
            boolean r6 = r11.hasNext()     // Catch: java.lang.Throwable -> L8a
            if (r6 == 0) goto L90
            java.lang.Object r6 = r11.next()     // Catch: java.lang.Throwable -> L8a
            hh.o r6 = (hh.o) r6     // Catch: java.lang.Throwable -> L8a
            java.lang.ClassLoader r7 = r10.f11622c     // Catch: java.lang.Throwable -> L8a
            java.lang.reflect.Method r6 = r6.r(r7)     // Catch: java.lang.Throwable -> L8a
            r4.add(r6)     // Catch: java.lang.Throwable -> L8a
            goto L74
        L8a:
            r10 = move-exception
            sf.f r4 = new sf.f
            r4.<init>(r10)
        L90:
            java.lang.Throwable r10 = sf.g.b(r4)
            if (r10 != 0) goto L97
            goto La2
        L97:
            java.lang.String r11 = r10.getMessage()
            java.lang.String r4 = "[Hchat:QuickRead] DexKit 定位原生已读入口失败: "
            eh.a.x(r4, r11, r10)
            tf.t r4 = tf.t.f13167g
        La2:
            java.util.List r4 = (java.util.List) r4
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.Iterator r11 = r4.iterator()
        Lad:
            boolean r4 = r11.hasNext()
            if (r4 == 0) goto Lc4
            java.lang.Object r4 = r11.next()
            r6 = r4
            java.lang.reflect.Method r6 = (java.lang.reflect.Method) r6
            boolean r6 = b(r6)
            if (r6 == 0) goto Lad
            r10.add(r4)
            goto Lad
        Lc4:
            java.util.HashSet r11 = new java.util.HashSet
            r11.<init>()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r10 = r10.iterator()
        Ld2:
            boolean r6 = r10.hasNext()
            if (r6 == 0) goto Led
            java.lang.Object r6 = r10.next()
            r7 = r6
            java.lang.reflect.Method r7 = (java.lang.reflect.Method) r7
            java.lang.String r7 = r7.toGenericString()
            boolean r7 = r11.add(r7)
            if (r7 == 0) goto Ld2
            r4.add(r6)
            goto Ld2
        Led:
            java.lang.Object r10 = tf.m.I1(r4)
            java.lang.reflect.Method r10 = (java.lang.reflect.Method) r10
            if (r10 == 0) goto Lfd
            ya.i.f22393c = r10
            ya.i.f22394d = r3
            e8.b.h(r0, r1, r5, r10)
            return r10
        Lfd:
            java.lang.String r10 = "cache.key"
            android.content.SharedPreferences$Editor r11 = r0.edit()     // Catch: java.lang.Throwable -> L11b
            java.lang.String r0 = r0.getString(r10, r2)     // Catch: java.lang.Throwable -> L11b
            boolean r0 = gg.l.a(r0, r1)     // Catch: java.lang.Throwable -> L11b
            if (r0 != 0) goto L114
            android.content.SharedPreferences$Editor r0 = r11.clear()     // Catch: java.lang.Throwable -> L11b
            r0.putString(r10, r1)     // Catch: java.lang.Throwable -> L11b
        L114:
            android.content.SharedPreferences$Editor r10 = r11.remove(r5)     // Catch: java.lang.Throwable -> L11b
            r10.apply()     // Catch: java.lang.Throwable -> L11b
        L11b:
            ya.i.f22393c = r3
            ya.i.f22394d = r3
            int r10 = r4.size()
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r0 = "[Hchat:QuickRead] 原生已读入口定位失败，候选数="
            r11.<init>(r0)
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            fb.v0.m(r10)
            return r3
    }

    public static final int e(android.content.Context r10, boolean r11) {
            if (r10 == 0) goto L9
            android.content.Context r0 = r10.getApplicationContext()
            if (r0 == 0) goto L9
            r10 = r0
        L9:
            h.Hchat.hooks.api.runtime.WeChatDatabaseApi r0 = h.Hchat.hooks.api.core.WeChatApis.database()
            java.lang.String r1 = "数据库未就绪"
            r2 = -1
            if (r0 != 0) goto L18
            if (r11 == 0) goto L9c
            h(r10, r1)
            return r2
        L18:
            java.lang.String r3 = "SELECT username FROM rconversation WHERE IFNULL(unReadCount,0)>0 OR IFNULL(unReadMuteCount,0)>0 OR IFNULL(atCount,0)>0"
            r4 = 0
            java.util.List r3 = r0.query(r3, r4)
            r3.getClass()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r3 = r3.iterator()
        L2b:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto L53
            java.lang.Object r6 = r3.next()
            java.util.Map r6 = (java.util.Map) r6
            java.lang.String r7 = "username"
            java.lang.Object r6 = r6.get(r7)
            if (r6 == 0) goto L4c
            java.lang.String r6 = r6.toString()
            if (r6 == 0) goto L4c
            boolean r7 = og.m.t0(r6)
            if (r7 != 0) goto L4c
            goto L4d
        L4c:
            r6 = r4
        L4d:
            if (r6 == 0) goto L2b
            r5.add(r6)
            goto L2b
        L53:
            java.util.Set r3 = tf.m.T1(r5)
            java.util.List r3 = tf.m.P1(r3)
            boolean r5 = r0.isReady()
            if (r5 != 0) goto L67
            if (r11 == 0) goto L9c
            h(r10, r1)
            return r2
        L67:
            boolean r1 = r3.isEmpty()
            r5 = 0
            if (r1 == 0) goto L76
            if (r11 == 0) goto L75
            java.lang.String r11 = "没有未读会话"
            h(r10, r11)
        L75:
            return r5
        L76:
            java.lang.reflect.Method r1 = ya.i.f22393c
            if (r1 == 0) goto L7b
            goto L85
        L7b:
            r8.g r1 = ya.i.f22392b
            if (r1 == 0) goto L84
            java.lang.reflect.Method r1 = d(r1, r5)
            goto L85
        L84:
            r1 = r4
        L85:
            if (r1 != 0) goto L8f
            if (r11 == 0) goto L9c
            java.lang.String r11 = "原生已读入口未就绪"
            h(r10, r11)
            return r2
        L8f:
            java.lang.Object r0 = g(r0, r1)
            if (r0 != 0) goto L9d
            if (r11 == 0) goto L9c
            java.lang.String r11 = "原生会话存储未就绪"
            h(r10, r11)
        L9c:
            return r2
        L9d:
            java.util.Iterator r3 = r3.iterator()
        La1:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto Led
            java.lang.Object r6 = r3.next()
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object[] r7 = new java.lang.Object[]{r6}     // Catch: java.lang.Throwable -> Lbc
            java.lang.Object r7 = h.Hchat.utils.KavaReflector.invokeOrThrow(r1, r0, r7)     // Catch: java.lang.Throwable -> Lbc
            boolean r8 = r7 instanceof java.lang.Boolean     // Catch: java.lang.Throwable -> Lbc
            if (r8 == 0) goto Lbe
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Throwable -> Lbc
            goto Lbf
        Lbc:
            r7 = move-exception
            goto Lca
        Lbe:
            r7 = r4
        Lbf:
            java.lang.Boolean r8 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> Lbc
            boolean r7 = gg.l.a(r7, r8)     // Catch: java.lang.Throwable -> Lbc
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)     // Catch: java.lang.Throwable -> Lbc
            goto Ld0
        Lca:
            sf.f r8 = new sf.f
            r8.<init>(r7)
            r7 = r8
        Ld0:
            java.lang.Throwable r8 = sf.g.b(r7)
            if (r8 == 0) goto Ldb
            java.lang.String r9 = "[Hchat:QuickRead] 调用原生已读失败: "
            eh.a.x(r9, r6, r8)
        Ldb:
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            boolean r8 = r7 instanceof sf.f
            if (r8 == 0) goto Le2
            r7 = r6
        Le2:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r6 = r7.booleanValue()
            if (r6 == 0) goto La1
            int r5 = r5 + 1
            goto La1
        Led:
            if (r5 > 0) goto Lfc
            if (r11 == 0) goto Lf6
            java.lang.String r11 = "全部已读失败"
            h(r10, r11)
        Lf6:
            java.lang.String r10 = "[Hchat:QuickRead] 原生已读未成功处理会话"
            fb.v0.m(r10)
            return r2
        Lfc:
            if (r10 != 0) goto Lff
            goto L127
        Lff:
            java.lang.String r0 = "notification"
            java.lang.Object r0 = r10.getSystemService(r0)     // Catch: java.lang.Throwable -> L10c
            boolean r1 = r0 instanceof android.app.NotificationManager     // Catch: java.lang.Throwable -> L10c
            if (r1 == 0) goto L10e
            android.app.NotificationManager r0 = (android.app.NotificationManager) r0     // Catch: java.lang.Throwable -> L10c
            goto L10f
        L10c:
            r0 = move-exception
            goto L117
        L10e:
            r0 = r4
        L10f:
            if (r0 == 0) goto L11c
            r0.cancelAll()     // Catch: java.lang.Throwable -> L10c
            sf.n r4 = sf.n.f12433a     // Catch: java.lang.Throwable -> L10c
            goto L11c
        L117:
            sf.f r4 = new sf.f
            r4.<init>(r0)
        L11c:
            java.lang.Throwable r0 = sf.g.b(r4)
            if (r0 == 0) goto L127
            java.lang.String r1 = "[Hchat:QuickRead] 清理微信通知失败"
            fb.v0.n(r1, r0)
        L127:
            if (r11 == 0) goto L13f
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r0 = "已读 "
            r11.<init>(r0)
            r11.append(r5)
            java.lang.String r0 = " 个会话"
            r11.append(r0)
            java.lang.String r11 = r11.toString()
            h(r10, r11)
        L13f:
            return r5
    }

    public static final boolean f(android.content.Context r4, java.lang.String r5, boolean r6) {
            if (r4 == 0) goto L9
            android.content.Context r0 = r4.getApplicationContext()
            if (r0 == 0) goto L9
            r4 = r0
        L9:
            r0 = 0
            if (r5 == 0) goto L15
            java.lang.CharSequence r5 = og.m.R0(r5)
            java.lang.String r5 = r5.toString()
            goto L16
        L15:
            r5 = r0
        L16:
            if (r5 != 0) goto L1a
            java.lang.String r5 = ""
        L1a:
            int r1 = r5.length()
            r2 = 0
            if (r1 != 0) goto L29
            if (r6 == 0) goto Lae
            java.lang.String r5 = "会话无效"
            h(r4, r5)
            return r2
        L29:
            h.Hchat.hooks.api.runtime.WeChatDatabaseApi r1 = h.Hchat.hooks.api.core.WeChatApis.database()
            if (r1 == 0) goto La7
            boolean r3 = r1.isReady()
            if (r3 != 0) goto L37
            goto La7
        L37:
            java.lang.reflect.Method r3 = ya.i.f22393c
            if (r3 == 0) goto L3c
            goto L46
        L3c:
            r8.g r3 = ya.i.f22392b
            if (r3 == 0) goto L45
            java.lang.reflect.Method r3 = d(r3, r2)
            goto L46
        L45:
            r3 = r0
        L46:
            if (r3 != 0) goto L50
            if (r6 == 0) goto Lae
            java.lang.String r5 = "原生已读入口未就绪"
            h(r4, r5)
            return r2
        L50:
            java.lang.Object r1 = g(r1, r3)
            if (r1 != 0) goto L5e
            if (r6 == 0) goto Lae
            java.lang.String r5 = "原生会话存储未就绪"
            h(r4, r5)
            return r2
        L5e:
            java.lang.Object[] r2 = new java.lang.Object[]{r5}     // Catch: java.lang.Throwable -> L6e
            java.lang.Object r1 = h.Hchat.utils.KavaReflector.invokeOrThrow(r3, r1, r2)     // Catch: java.lang.Throwable -> L6e
            boolean r2 = r1 instanceof java.lang.Boolean     // Catch: java.lang.Throwable -> L6e
            if (r2 == 0) goto L70
            r0 = r1
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L6e
            goto L70
        L6e:
            r0 = move-exception
            goto L7b
        L70:
            java.lang.Boolean r1 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L6e
            boolean r0 = gg.l.a(r0, r1)     // Catch: java.lang.Throwable -> L6e
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.Throwable -> L6e
            goto L81
        L7b:
            sf.f r1 = new sf.f
            r1.<init>(r0)
            r0 = r1
        L81:
            java.lang.Throwable r1 = sf.g.b(r0)
            if (r1 == 0) goto L90
            java.lang.String r2 = "[Hchat:QuickRead] 调用原生已读失败: "
            java.lang.String r5 = r2.concat(r5)
            fb.v0.n(r5, r1)
        L90:
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            boolean r1 = r0 instanceof sf.f
            if (r1 == 0) goto L97
            r0 = r5
        L97:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r5 = r0.booleanValue()
            if (r5 != 0) goto La6
            if (r6 == 0) goto La6
            java.lang.String r6 = "会话已读失败"
            h(r4, r6)
        La6:
            return r5
        La7:
            if (r6 == 0) goto Lae
            java.lang.String r5 = "数据库未就绪"
            h(r4, r5)
        Lae:
            return r2
    }

    public static java.lang.Object g(h.Hchat.hooks.api.runtime.WeChatDatabaseApi r3, java.lang.reflect.Method r4) {
            java.lang.Object r0 = ya.i.f22394d
            r1 = 0
            if (r0 == 0) goto L12
            java.lang.Class r2 = r4.getDeclaringClass()
            boolean r2 = r2.isInstance(r0)
            if (r2 == 0) goto L10
            return r0
        L10:
            ya.i.f22394d = r1
        L12:
            java.lang.Object r3 = r3.storageObjectForMethod(r4)
            if (r3 == 0) goto L1b
            ya.i.f22394d = r3
            return r3
        L1b:
            return r1
    }

    public static void h(android.content.Context r3, java.lang.String r4) {
            if (r3 != 0) goto L3
            return
        L3:
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            eb.w r1 = new eb.w
            r2 = 8
            r1.<init>(r3, r4, r2)
            r0.post(r1)
            return
    }
}
