package a;

/* JADX INFO: renamed from: a.s8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0370s8 implements top.mmjz.floatingclouds.plugin.IPlugin {
    public static final java.util.Set<java.lang.String> c = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile java.lang.Object f683a;
    public boolean b;

    static {
            java.lang.String r6 = "find_friends_by_ting_play_state"
            java.lang.String r7 = "find_friends_by_near_v3"
            java.lang.String r0 = "find_friends_by_finder"
            java.lang.String r1 = "find_friends_by_finder_live"
            java.lang.String r2 = "find_friends_by_finder_live_above_look"
            java.lang.String r3 = "find_friends_by_look"
            java.lang.String r4 = "app_brand_entrance"
            java.lang.String r5 = "find_friends_by_ting"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1, r2, r3, r4, r5, r6, r7}
            java.util.Set r0 = a.C0282n9.z(r0)
            a.C0370s8.c = r0
            return
    }

    public static void a(java.lang.Object r12) {
            a.K3$a r0 = a.K3.f148a
            r0.getClass()
            boolean r0 = a.K3.a.l()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L17
            a.jc r0 = a.K3.a.i()
            boolean r0 = r0.g
            if (r0 == 0) goto L17
            r0 = r1
            goto L18
        L17:
            r0 = r2
        L18:
            boolean r3 = a.K3.a.l()
            if (r3 == 0) goto L28
            a.jc r3 = a.K3.a.i()
            boolean r3 = r3.h
            if (r3 == 0) goto L28
            r3 = r1
            goto L29
        L28:
            r3 = r2
        L29:
            if (r0 != 0) goto L2f
            if (r3 != 0) goto L2f
            goto L107
        L2f:
            java.lang.Class r4 = r12.getClass()     // Catch: java.lang.Throwable -> L95
            java.lang.reflect.Field[] r4 = r4.getFields()     // Catch: java.lang.Throwable -> L95
            a.G1 r4 = a.C0435w1.I(r4)     // Catch: java.lang.Throwable -> L95
        L3b:
            boolean r5 = r4.hasNext()     // Catch: java.lang.Throwable -> L95
            if (r5 == 0) goto L107
            java.lang.Object r5 = r4.next()     // Catch: java.lang.Throwable -> L95
            java.lang.reflect.Field r5 = (java.lang.reflect.Field) r5     // Catch: java.lang.Throwable -> L95
            r5.setAccessible(r1)     // Catch: java.lang.Throwable -> L95
            java.lang.Object r5 = r5.get(r12)     // Catch: java.lang.Throwable -> L95
            if (r5 != 0) goto L51
            goto L3b
        L51:
            java.lang.Class r6 = r5.getClass()     // Catch: java.lang.Throwable -> L95
            java.lang.reflect.Method[] r6 = r6.getMethods()     // Catch: java.lang.Throwable -> L95
            java.lang.String r7 = "getMethods(...)"
            a.C0193i9.d(r6, r7)     // Catch: java.lang.Throwable -> L95
            int r7 = r6.length     // Catch: java.lang.Throwable -> L95
            r8 = r2
        L60:
            if (r8 >= r7) goto L9a
            r9 = r6[r8]     // Catch: java.lang.Throwable -> L95
            java.lang.String r10 = r9.getName()     // Catch: java.lang.Throwable -> L95
            java.lang.String r11 = "l"
            boolean r10 = a.C0193i9.a(r10, r11)     // Catch: java.lang.Throwable -> L95
            if (r10 == 0) goto L97
            java.lang.Class[] r10 = r9.getParameterTypes()     // Catch: java.lang.Throwable -> L95
            int r10 = r10.length     // Catch: java.lang.Throwable -> L95
            r11 = 2
            if (r10 != r11) goto L97
            java.lang.Class[] r10 = r9.getParameterTypes()     // Catch: java.lang.Throwable -> L95
            r10 = r10[r2]     // Catch: java.lang.Throwable -> L95
            java.lang.Class<java.lang.String> r11 = java.lang.String.class
            boolean r10 = a.C0193i9.a(r10, r11)     // Catch: java.lang.Throwable -> L95
            if (r10 == 0) goto L97
            java.lang.Class[] r10 = r9.getParameterTypes()     // Catch: java.lang.Throwable -> L95
            r10 = r10[r1]     // Catch: java.lang.Throwable -> L95
            java.lang.Class r11 = java.lang.Boolean.TYPE     // Catch: java.lang.Throwable -> L95
            boolean r10 = a.C0193i9.a(r10, r11)     // Catch: java.lang.Throwable -> L95
            if (r10 == 0) goto L97
            goto L9b
        L95:
            r12 = move-exception
            goto Lf2
        L97:
            int r8 = r8 + 1
            goto L60
        L9a:
            r9 = 0
        L9b:
            if (r9 == 0) goto L3b
            if (r0 == 0) goto Laa
            java.lang.String r12 = "album_dyna_photo_ui_title"
            java.lang.Boolean r2 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L95
            java.lang.Object[] r12 = new java.lang.Object[]{r12, r2}     // Catch: java.lang.Throwable -> L95
            r9.invoke(r5, r12)     // Catch: java.lang.Throwable -> L95
        Laa:
            if (r3 == 0) goto Lc8
            java.util.Set<java.lang.String> r12 = a.C0370s8.c     // Catch: java.lang.Throwable -> L95
            java.util.Iterator r12 = r12.iterator()     // Catch: java.lang.Throwable -> L95
        Lb2:
            boolean r2 = r12.hasNext()     // Catch: java.lang.Throwable -> L95
            if (r2 == 0) goto Lc8
            java.lang.Object r2 = r12.next()     // Catch: java.lang.Throwable -> L95
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L95
            java.lang.Boolean r4 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L95
            java.lang.Object[] r2 = new java.lang.Object[]{r2, r4}     // Catch: java.lang.Throwable -> L95
            r9.invoke(r5, r2)     // Catch: java.lang.Throwable -> L95
            goto Lb2
        Lc8:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L95
            r12.<init>()     // Catch: java.lang.Throwable -> L95
            java.lang.String r2 = "HideSnsEntry: discover tab entries processed (sns="
            r12.append(r2)     // Catch: java.lang.Throwable -> L95
            r12.append(r0)     // Catch: java.lang.Throwable -> L95
            java.lang.String r0 = ", f020="
            r12.append(r0)     // Catch: java.lang.Throwable -> L95
            r12.append(r3)     // Catch: java.lang.Throwable -> L95
            java.lang.String r0 = ")"
            r12.append(r0)     // Catch: java.lang.Throwable -> L95
            java.lang.String r12 = r12.toString()     // Catch: java.lang.Throwable -> L95
            java.lang.Object[] r12 = new java.lang.Object[]{r12}     // Catch: java.lang.Throwable -> L95
            java.lang.Object[] r12 = java.util.Arrays.copyOf(r12, r1)     // Catch: java.lang.Throwable -> L95
            a.C0453x1.b(r12)     // Catch: java.lang.Throwable -> L95
            return
        Lf2:
            java.lang.String r12 = r12.getMessage()
            java.lang.String r0 = "HideSnsEntry: hideDiscoverTabEntries failed: "
            java.lang.String r12 = a.C0487z.k(r0, r12)
            java.lang.Object[] r12 = new java.lang.Object[]{r12}
            java.lang.Object[] r12 = java.util.Arrays.copyOf(r12, r1)
            a.C0453x1.e(r12)
        L107:
            return
    }

    public static boolean b() {
            a.K3$a r0 = a.K3.f148a
            r0.getClass()
            boolean r0 = a.K3.a.l()
            if (r0 == 0) goto L15
            a.jc r0 = a.K3.a.i()
            boolean r0 = r0.f
            if (r0 == 0) goto L15
            r0 = 1
            return r0
        L15:
            r0 = 0
            return r0
    }

    @Override // top.mmjz.floatingclouds.plugin.IPlugin
    public final void handleHook(a.J8 r15) {
            r14 = this;
            r1 = 3
            r2 = 4
            r3 = 1
            java.lang.String r0 = "session"
            a.C0193i9.e(r15, r0)
            a.fd r4 = new a.fd
            int r0 = a.B1.f21a
            r5 = 0
            r6 = -1
            if (r0 != r6) goto L30
            android.content.Context r0 = a.C0435w1.p     // Catch: java.lang.Exception -> L22
            a.C0193i9.b(r0)     // Catch: java.lang.Exception -> L22
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch: java.lang.Exception -> L22
            java.lang.String r7 = "com.tencent.mm"
            android.content.pm.PackageInfo r0 = r0.getPackageInfo(r7, r5)     // Catch: java.lang.Exception -> L22
            int r6 = r0.versionCode     // Catch: java.lang.Exception -> L22
            goto L2e
        L22:
            r0 = move-exception
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r3)
            a.C0453x1.a(r0)
        L2e:
            a.B1.f21a = r6
        L30:
            int r0 = a.B1.f21a
            java.lang.ClassLoader r6 = r15.f136a
            r4.<init>(r0, r6)
            a.hd r0 = a.C0179hd.f499a
            r0.getClass()
            java.lang.String r0 = "F006_find_more_friends_ui"
            a.gd r0 = a.C0179hd.a(r0, r4)
            boolean r6 = r0.f485a
            java.lang.String r7 = "F006"
            r8 = 0
            java.lang.String r9 = "HideSnsEntry"
            if (r6 == 0) goto L123
            java.lang.Class<?> r6 = r0.b
            if (r6 != 0) goto L51
            goto L123
        L51:
            java.lang.String r0 = r6.getName()
            java.lang.String r10 = "Resolver: FindMoreFriendsUI → "
            java.lang.String r0 = r10.concat(r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r9, r0}
            a.C0453x1.b(r0)
            java.lang.String r0 = "F006_entry_control_method"
            a.gd r0 = a.C0179hd.a(r0, r4)
            java.lang.reflect.Method r0 = r0.f
            java.lang.String r4 = "."
            if (r0 == 0) goto Laa
            java.lang.String r3 = r0.getName()
            java.lang.String r8 = "Resolver: C1() → "
            java.lang.String r3 = a.C0487z.k(r8, r3)
            java.lang.Object[] r3 = new java.lang.Object[]{r9, r3}
            a.C0453x1.b(r3)
            a.l8 r3 = new a.l8
            r3.<init>(r14, r2)
            a.J8.h(r15, r7, r0, r3)
            java.util.concurrent.ConcurrentHashMap<java.lang.String, a.F8> r3 = a.E8.f71a
            java.lang.String r3 = r6.getName()
            java.lang.String r0 = r0.getName()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r3)
            r6.append(r4)
            r6.append(r0)
            java.lang.String r0 = r6.toString()
            java.lang.String r3 = "entryControl_C1"
            a.E8.b(r7, r3, r0)
            goto L149
        Laa:
            java.lang.String r0 = "Resolver: C1() not resolved, fallback to reflection"
            java.lang.Object[] r0 = new java.lang.Object[]{r9, r0}
            a.C0453x1.e(r0)
            java.lang.reflect.Method[] r0 = r6.getDeclaredMethods()
            java.lang.String r9 = "getDeclaredMethods(...)"
            a.C0193i9.d(r0, r9)
            int r9 = r0.length
            r10 = r5
        Lbe:
            if (r10 >= r9) goto Le8
            r11 = r0[r10]
            java.lang.Class r12 = r11.getReturnType()
            java.lang.Class r13 = java.lang.Void.TYPE
            boolean r12 = a.C0193i9.a(r12, r13)
            if (r12 == 0) goto Le6
            java.lang.Class[] r12 = r11.getParameterTypes()
            java.lang.String r13 = "getParameterTypes(...)"
            a.C0193i9.d(r12, r13)
            int r12 = r12.length
            if (r12 != 0) goto Le6
            java.lang.String r12 = r11.getName()
            int r12 = r12.length()
            if (r12 > r1) goto Le6
            r8 = r11
            goto Le8
        Le6:
            int r10 = r10 + r3
            goto Lbe
        Le8:
            if (r8 == 0) goto L115
            a.l8 r0 = new a.l8
            r3 = 5
            r0.<init>(r14, r3)
            a.J8.h(r15, r7, r8, r0)
            java.util.concurrent.ConcurrentHashMap<java.lang.String, a.F8> r0 = a.E8.f71a
            java.lang.String r0 = r6.getName()
            java.lang.String r3 = r8.getName()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r0)
            r6.append(r4)
            r6.append(r3)
            java.lang.String r0 = r6.toString()
            java.lang.String r3 = "entryControl_fb"
            a.E8.b(r7, r3, r0)
            goto L149
        L115:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, a.F8> r0 = a.E8.f71a
            java.lang.String r0 = r6.getName()
            java.lang.String r3 = "no void() method"
            java.lang.String r4 = "entryControl"
            a.E8.a(r7, r4, r0, r3)
            goto L149
        L123:
            a.j6 r3 = r0.c
            if (r3 == 0) goto L129
            java.lang.String r8 = r3.c
        L129:
            java.lang.String r3 = "Resolver: FindMoreFriendsUI not resolved: "
            java.lang.String r3 = a.C0487z.k(r3, r8)
            java.lang.Object[] r3 = new java.lang.Object[]{r9, r3}
            a.C0453x1.e(r3)
            java.util.concurrent.ConcurrentHashMap<java.lang.String, a.F8> r3 = a.E8.f71a
            a.j6 r0 = r0.c
            if (r0 == 0) goto L140
            java.lang.String r0 = r0.c
            if (r0 != 0) goto L142
        L140:
            java.lang.String r0 = "unknown"
        L142:
            java.lang.String r3 = "findMoreUI"
            java.lang.String r4 = "FindMoreFriendsUI"
            a.E8.a(r7, r3, r4, r0)
        L149:
            java.lang.ClassLoader r0 = r15.f136a
            java.lang.String r10 = "com.tencent.mm.plugin.profile.ui.ContactInfoUI"
            java.lang.Class r0 = a.A1.b(r0, r10)
            if (r0 != 0) goto L155
            r8 = r15
            goto L169
        L155:
            java.lang.Class[] r12 = new java.lang.Class[r5]
            a.l8 r13 = new a.l8
            r13.<init>(r14, r1)
            java.lang.String r9 = "F006"
            java.lang.String r11 = "initView"
            r8 = r15
            a.J8.d(r8, r9, r10, r11, r12, r13)
            java.lang.String r15 = "contactProfile"
            a.E8.b(r7, r15, r10)
        L169:
            java.lang.ClassLoader r15 = r8.f136a
            java.lang.String r0 = "com.tencent.mm.view.recyclerview.WxRecyclerView"
            java.lang.Class r15 = a.A1.b(r15, r0)
            if (r15 != 0) goto L174
            goto L193
        L174:
            a.l8 r0 = new a.l8
            r1 = 2
            r0.<init>(r1)
            java.lang.reflect.Method[] r15 = a.A1.f(r15, r0)
            java.lang.Object r15 = a.N1.d0(r15)
            java.lang.reflect.Method r15 = (java.lang.reflect.Method) r15
            if (r15 != 0) goto L187
            goto L193
        L187:
            io.github.libxposed.api.XposedInterface$HookBuilder r15 = r8.f(r15)
            a.o4 r0 = new a.o4
            r0.<init>(r14, r2, r8)
            r15.intercept(r0)
        L193:
            return
    }
}
