package a;

/* JADX INFO: renamed from: a.w8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0442w8 implements top.mmjz.floatingclouds.plugin.IPlugin {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.util.WeakHashMap<android.database.Cursor, a.Re> f749a;

    public C0442w8() {
            r1 = this;
            r1.<init>()
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r0.<init>()
            r1.f749a = r0
            return
    }

    public static int a(java.lang.Object r6, java.util.HashSet r7) {
            java.lang.Class r0 = r6.getClass()
            r1 = 0
        L5:
            if (r0 == 0) goto L47
            java.lang.reflect.Field[] r2 = r0.getDeclaredFields()
            a.G1 r2 = a.C0435w1.I(r2)
        Lf:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L42
            java.lang.Object r3 = r2.next()
            java.lang.reflect.Field r3 = (java.lang.reflect.Field) r3
            java.lang.Class r4 = r3.getType()
            java.lang.Class<java.util.List> r5 = java.util.List.class
            boolean r4 = r5.isAssignableFrom(r4)
            if (r4 == 0) goto Lf
            r4 = 1
            r3.setAccessible(r4)
            java.lang.Object r3 = r3.get(r6)
            boolean r4 = a.Kf.b(r3)
            if (r4 == 0) goto L38
            java.util.List r3 = (java.util.List) r3
            goto L39
        L38:
            r3 = 0
        L39:
            if (r3 != 0) goto L3c
            goto Lf
        L3c:
            int r3 = b(r3, r7)
            int r1 = r1 + r3
            goto Lf
        L42:
            java.lang.Class r0 = r0.getSuperclass()
            goto L5
        L47:
            return r1
    }

    public static int b(java.util.List r5, java.util.HashSet r6) {
            java.util.Iterator r5 = r5.iterator()
            r0 = 0
            r1 = r0
        L6:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L2c
            java.lang.Object r2 = r5.next()
            if (r2 == 0) goto L6
            java.util.IdentityHashMap r3 = new java.util.IdentityHashMap
            r3.<init>()
            java.util.Set r3 = java.util.Collections.newSetFromMap(r3)
            java.lang.String r4 = "newSetFromMap(...)"
            a.C0193i9.d(r3, r4)
            boolean r2 = d(r2, r6, r0, r3)
            if (r2 == 0) goto L6
            r5.remove()
            int r1 = r1 + 1
            goto L6
        L2c:
            return r1
    }

    public static boolean c() {
            a.K3$a r0 = a.K3.f148a
            r0.getClass()
            boolean r0 = a.K3.a.l()
            if (r0 == 0) goto L1f
            a.jc r0 = a.K3.a.i()
            boolean r0 = r0.l
            if (r0 == 0) goto L1f
            java.util.ArrayList r0 = a.K3.a.f()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L1f
            r0 = 1
            return r0
        L1f:
            r0 = 0
            return r0
    }

    public static boolean d(java.lang.Object r6, java.util.HashSet r7, int r8, java.util.Set r9) {
            r0 = 0
            if (r6 == 0) goto Ld4
            r1 = 3
            if (r8 > r1) goto Ld4
            boolean r1 = r9.add(r6)
            if (r1 != 0) goto Le
            goto Ld4
        Le:
            boolean r1 = r6 instanceof java.lang.String
            if (r1 == 0) goto L17
            boolean r6 = r7.contains(r6)
            return r6
        L17:
            boolean r1 = r6 instanceof java.lang.CharSequence
            if (r1 == 0) goto L24
            java.lang.String r6 = r6.toString()
            boolean r6 = r7.contains(r6)
            return r6
        L24:
            boolean r1 = r6 instanceof java.lang.Object[]
            r2 = 1
            if (r1 == 0) goto L3e
            java.lang.Object[] r6 = (java.lang.Object[]) r6
            int r1 = r6.length
            r3 = r0
        L2d:
            if (r3 >= r1) goto Ld4
            r4 = r6[r3]
            int r5 = r8 + 1
            boolean r4 = d(r4, r7, r5, r9)
            if (r4 == 0) goto L3b
            goto Lce
        L3b:
            int r3 = r3 + 1
            goto L2d
        L3e:
            boolean r1 = r6 instanceof java.lang.Iterable
            if (r1 == 0) goto L5c
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.Iterator r6 = r6.iterator()
        L48:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto Ld4
            java.lang.Object r1 = r6.next()
            int r3 = r8 + 1
            boolean r1 = d(r1, r7, r3, r9)
            if (r1 == 0) goto L48
            goto Lce
        L5c:
            java.lang.Class r1 = r6.getClass()
            java.lang.String r1 = r1.getName()
            java.lang.String r3 = "java."
            boolean r3 = a.Ae.H(r1, r3, r0)
            if (r3 != 0) goto Ld4
            java.lang.String r3 = "android."
            boolean r3 = a.Ae.H(r1, r3, r0)
            if (r3 != 0) goto Ld4
            java.lang.String r3 = "kotlin."
            boolean r3 = a.Ae.H(r1, r3, r0)
            if (r3 != 0) goto Ld4
            java.lang.String r3 = "androidx."
            boolean r1 = a.Ae.H(r1, r3, r0)
            if (r1 == 0) goto L85
            goto Ld4
        L85:
            java.lang.Class r1 = r6.getClass()
        L89:
            if (r1 == 0) goto Ld4
            java.lang.Class<java.lang.Object> r3 = java.lang.Object.class
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto Ld4
            java.lang.reflect.Field[] r3 = r1.getDeclaredFields()
            a.G1 r3 = a.C0435w1.I(r3)
        L9b:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto Lcf
            java.lang.Object r4 = r3.next()
            java.lang.reflect.Field r4 = (java.lang.reflect.Field) r4
            int r5 = r4.getModifiers()
            boolean r5 = java.lang.reflect.Modifier.isStatic(r5)
            if (r5 != 0) goto L9b
            java.lang.Class r5 = r4.getType()
            boolean r5 = r5.isPrimitive()
            if (r5 == 0) goto Lbc
            goto L9b
        Lbc:
            r4.setAccessible(r2)     // Catch: java.lang.Throwable -> L9b
            java.lang.Object r4 = r4.get(r6)     // Catch: java.lang.Throwable -> L9b
            if (r4 != 0) goto Lc6
            goto L9b
        Lc6:
            int r5 = r8 + 1
            boolean r4 = d(r4, r7, r5, r9)     // Catch: java.lang.Throwable -> L9b
            if (r4 == 0) goto L9b
        Lce:
            return r2
        Lcf:
            java.lang.Class r1 = r1.getSuperclass()
            goto L89
        Ld4:
            return r0
    }

    public static java.util.HashSet e() {
            a.K3$a r0 = a.K3.f148a
            r0.getClass()
            java.util.ArrayList r0 = a.K3.a.f()
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 10
            int r2 = a.C0312p3.g0(r0, r2)
            r1.<init>(r2)
            java.util.Iterator r0 = r0.iterator()
        L18:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L2c
            java.lang.Object r2 = r0.next()
            top.mmjz.floatingclouds.bean.MaskItemBean r2 = (top.mmjz.floatingclouds.bean.MaskItemBean) r2
            java.lang.String r2 = r2.getMaskId()
            r1.add(r2)
            goto L18
        L2c:
            java.util.HashSet r0 = a.C0383t3.u0(r1)
            return r0
    }

    @Override // top.mmjz.floatingclouds.plugin.IPlugin
    public final void handleHook(a.J8 r17) {
            r16 = this;
            r1 = r16
            r2 = r17
            java.lang.String r3 = "notifyDataSetChanged"
            r5 = 1
            java.lang.String r0 = "session"
            a.C0193i9.e(r2, r0)
            boolean r0 = a.Ed.f75a
            java.lang.Class<?> r0 = a.Ed.c
            java.lang.String r7 = "getParameterTypes(...)"
            if (r0 != 0) goto L23
            java.lang.String r0 = "[HideSnsInteraction] ctor: CommentListAdapter cls NULL"
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r5)
            a.C0453x1.e(r0)
            goto Lb3
        L23:
            java.lang.reflect.Constructor[] r0 = r0.getDeclaredConstructors()
            java.lang.String r8 = "getDeclaredConstructors(...)"
            a.C0193i9.d(r0, r8)
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            int r9 = r0.length
            r10 = 0
        L33:
            if (r10 >= r9) goto L57
            r11 = r0[r10]
            java.lang.Class[] r12 = r11.getParameterTypes()
            a.C0193i9.d(r12, r7)
            int r13 = r12.length
            r14 = 0
            r15 = 0
        L41:
            if (r14 >= r13) goto L50
            r6 = r12[r14]
            java.lang.Class<java.util.List> r4 = java.util.List.class
            boolean r4 = r4.isAssignableFrom(r6)
            if (r4 == 0) goto L4e
            int r15 = r15 + r5
        L4e:
            int r14 = r14 + r5
            goto L41
        L50:
            if (r15 < r5) goto L55
            r8.add(r11)
        L55:
            int r10 = r10 + r5
            goto L33
        L57:
            boolean r0 = r8.isEmpty()
            if (r0 == 0) goto L6b
            java.lang.String r0 = "[HideSnsInteraction] ctor: no List-param ctor"
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r5)
            a.C0453x1.e(r0)
            goto Lb3
        L6b:
            java.util.Iterator r4 = r8.iterator()
            r6 = 0
        L70:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L9e
            java.lang.Object r0 = r4.next()
            java.lang.reflect.Constructor r0 = (java.lang.reflect.Constructor) r0
            a.C0193i9.b(r0)     // Catch: java.lang.Throwable -> L8e
            io.github.libxposed.api.XposedInterface$HookBuilder r0 = r2.f(r0)     // Catch: java.lang.Throwable -> L8e
            a.v8 r8 = new a.v8     // Catch: java.lang.Throwable -> L8e
            r9 = 0
            r8.<init>(r1, r9)     // Catch: java.lang.Throwable -> L8e
            r0.intercept(r8)     // Catch: java.lang.Throwable -> L8e
            int r6 = r6 + r5
            goto L70
        L8e:
            r0 = move-exception
            java.lang.String r8 = "[HideSnsInteraction] ctor hook fail"
            java.lang.Object[] r0 = new java.lang.Object[]{r8, r0}
            r8 = 2
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r8)
            a.C0453x1.e(r0)
            goto L70
        L9e:
            java.lang.String r0 = "[HideSnsInteraction] OK ctor hooks="
            java.lang.String r0 = a.C0487z.e(r0, r6)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r5)
            a.C0453x1.b(r0)
            if (r6 <= 0) goto Lb3
            r4 = r5
            goto Lb4
        Lb3:
            r4 = 0
        Lb4:
            boolean r0 = a.Ed.f75a
            java.lang.Class<?> r0 = a.Ed.b
            if (r0 != 0) goto Lc8
            java.lang.String r0 = "[HideSnsInteraction] initView: snsCommentDetailUICls NULL"
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r5)
            a.C0453x1.e(r0)
            goto L107
        Lc8:
            java.lang.String r0 = r0.getName()     // Catch: java.lang.Throwable -> Le9
            java.lang.String r6 = "initView"
            a.l8 r8 = new a.l8     // Catch: java.lang.Throwable -> Le9
            r9 = 7
            r8.<init>(r1, r9)     // Catch: java.lang.Throwable -> Le9
            io.github.libxposed.api.XposedInterface$HookHandle r0 = a.J8.e(r2, r0, r6, r8)     // Catch: java.lang.Throwable -> Le9
            if (r0 == 0) goto Leb
            java.lang.String r0 = "[HideSnsInteraction] OK initView"
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch: java.lang.Throwable -> Le9
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r5)     // Catch: java.lang.Throwable -> Le9
            a.C0453x1.b(r0)     // Catch: java.lang.Throwable -> Le9
            int r4 = r4 + r5
            goto L107
        Le9:
            r0 = move-exception
            goto Lf9
        Leb:
            java.lang.String r0 = "[HideSnsInteraction] initView NOT FOUND"
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch: java.lang.Throwable -> Le9
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r5)     // Catch: java.lang.Throwable -> Le9
            a.C0453x1.e(r0)     // Catch: java.lang.Throwable -> Le9
            goto L107
        Lf9:
            java.lang.String r6 = "[HideSnsInteraction] initView FAILED"
            java.lang.Object[] r0 = new java.lang.Object[]{r6, r0}
            r8 = 2
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r8)
            a.C0453x1.a(r0)
        L107:
            boolean r0 = a.Ed.f75a
            java.lang.Class<?> r0 = a.Ed.c
            r6 = 0
            if (r0 != 0) goto L11c
            java.lang.String r0 = "[HideSnsInteraction] ndc: CommentListAdapter cls NULL"
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r5)
            a.C0453x1.e(r0)
            goto L16e
        L11c:
            r9 = 0
            java.lang.Class[] r8 = new java.lang.Class[r9]     // Catch: java.lang.Throwable -> L140
            r10 = r0
        L120:
            if (r10 == 0) goto L136
            java.lang.Object[] r11 = java.util.Arrays.copyOf(r8, r9)     // Catch: java.lang.NoSuchMethodException -> L130 java.lang.Throwable -> L140
            java.lang.Class[] r11 = (java.lang.Class[]) r11     // Catch: java.lang.NoSuchMethodException -> L130 java.lang.Throwable -> L140
            java.lang.reflect.Method r9 = r10.getDeclaredMethod(r3, r11)     // Catch: java.lang.NoSuchMethodException -> L130 java.lang.Throwable -> L140
            r9.setAccessible(r5)     // Catch: java.lang.NoSuchMethodException -> L130 java.lang.Throwable -> L140
            goto L137
        L130:
            java.lang.Class r10 = r10.getSuperclass()     // Catch: java.lang.Throwable -> L140
            r9 = 0
            goto L120
        L136:
            r9 = r6
        L137:
            if (r9 != 0) goto L142
            java.lang.Class<android.widget.BaseAdapter> r8 = android.widget.BaseAdapter.class
            java.lang.reflect.Method r9 = r8.getDeclaredMethod(r3, r6)     // Catch: java.lang.Throwable -> L140
            goto L142
        L140:
            r0 = move-exception
            goto L160
        L142:
            a.C0193i9.b(r9)     // Catch: java.lang.Throwable -> L140
            io.github.libxposed.api.XposedInterface$HookBuilder r3 = r2.f(r9)     // Catch: java.lang.Throwable -> L140
            a.m2 r8 = new a.m2     // Catch: java.lang.Throwable -> L140
            r8.<init>(r1, r0)     // Catch: java.lang.Throwable -> L140
            r3.intercept(r8)     // Catch: java.lang.Throwable -> L140
            java.lang.String r0 = "[HideSnsInteraction] OK ndc"
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch: java.lang.Throwable -> L140
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r5)     // Catch: java.lang.Throwable -> L140
            a.C0453x1.b(r0)     // Catch: java.lang.Throwable -> L140
            int r4 = r4 + r5
            goto L16e
        L160:
            java.lang.String r3 = "[HideSnsInteraction] ndc FAILED"
            java.lang.Object[] r0 = new java.lang.Object[]{r3, r0}
            r8 = 2
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r8)
            a.C0453x1.a(r0)
        L16e:
            java.lang.String r0 = "[HideSnsInteraction] OK b8 hooks="
            boolean r3 = a.Ed.f75a
            java.lang.Class<?> r3 = a.Ed.b
            if (r3 != 0) goto L184
            java.lang.String r0 = "[HideSnsInteraction] b8: snsCommentDetailUICls NULL"
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r5)
            a.C0453x1.e(r0)
            goto L1db
        L184:
            java.lang.String r3 = r3.getName()     // Catch: java.lang.Throwable -> L1bd
            a.l8 r8 = new a.l8     // Catch: java.lang.Throwable -> L1bd
            r9 = 12
            r8.<init>(r9)     // Catch: java.lang.Throwable -> L1bd
            a.l8 r9 = new a.l8     // Catch: java.lang.Throwable -> L1bd
            r10 = 13
            r9.<init>(r1, r10)     // Catch: java.lang.Throwable -> L1bd
            java.util.ArrayList r3 = a.J8.b(r2, r3, r8, r9)     // Catch: java.lang.Throwable -> L1bd
            boolean r8 = r3.isEmpty()     // Catch: java.lang.Throwable -> L1bd
            if (r8 != 0) goto L1bf
            int r3 = r3.size()     // Catch: java.lang.Throwable -> L1bd
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1bd
            r8.<init>(r0)     // Catch: java.lang.Throwable -> L1bd
            r8.append(r3)     // Catch: java.lang.Throwable -> L1bd
            java.lang.String r0 = r8.toString()     // Catch: java.lang.Throwable -> L1bd
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch: java.lang.Throwable -> L1bd
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r5)     // Catch: java.lang.Throwable -> L1bd
            a.C0453x1.b(r0)     // Catch: java.lang.Throwable -> L1bd
            int r4 = r4 + r5
            goto L1db
        L1bd:
            r0 = move-exception
            goto L1cd
        L1bf:
            java.lang.String r0 = "[HideSnsInteraction] b8 NOT FOUND"
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch: java.lang.Throwable -> L1bd
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r5)     // Catch: java.lang.Throwable -> L1bd
            a.C0453x1.e(r0)     // Catch: java.lang.Throwable -> L1bd
            goto L1db
        L1cd:
            java.lang.String r3 = "[HideSnsInteraction] b8 FAILED"
            java.lang.Object[] r0 = new java.lang.Object[]{r3, r0}
            r8 = 2
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r8)
            a.C0453x1.a(r0)
        L1db:
            java.lang.String r3 = "[HideSnsInteraction] OK timeline model hooks ok="
            java.lang.String r8 = "[HideSnsInteraction] timeline: P0 not found on "
            java.lang.String r9 = "[HideSnsInteraction] timeline: getCommentList not found on "
            a.fd r10 = new a.fd
            int r0 = a.B1.f21a
            r11 = -1
            if (r0 != r11) goto L20d
            android.content.Context r0 = a.C0435w1.p     // Catch: java.lang.Exception -> L1fd
            a.C0193i9.b(r0)     // Catch: java.lang.Exception -> L1fd
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch: java.lang.Exception -> L1fd
            java.lang.String r12 = "com.tencent.mm"
            r13 = 0
            android.content.pm.PackageInfo r0 = r0.getPackageInfo(r12, r13)     // Catch: java.lang.Exception -> L1fb
            int r11 = r0.versionCode     // Catch: java.lang.Exception -> L1fb
            goto L20a
        L1fb:
            r0 = move-exception
            goto L1ff
        L1fd:
            r0 = move-exception
            r13 = 0
        L1ff:
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r5)
            a.C0453x1.a(r0)
        L20a:
            a.B1.f21a = r11
            goto L20e
        L20d:
            r13 = 0
        L20e:
            int r0 = a.B1.f21a
            java.lang.ClassLoader r11 = r2.f136a
            r10.<init>(r0, r11)
            a.hd r0 = a.C0179hd.f499a
            r0.getClass()
            java.lang.String r0 = "sns_info_model"
            a.gd r0 = a.C0179hd.a(r0, r10)
            java.lang.Class<?> r10 = r0.b
            if (r10 == 0) goto L2b3
            java.lang.String r0 = r10.getName()
            a.l8 r6 = new a.l8     // Catch: java.lang.Throwable -> L2a3
            r10 = 8
            r6.<init>(r10)     // Catch: java.lang.Throwable -> L2a3
            a.l8 r10 = new a.l8     // Catch: java.lang.Throwable -> L2a3
            r11 = 9
            r10.<init>(r1, r11)     // Catch: java.lang.Throwable -> L2a3
            java.util.ArrayList r6 = a.J8.b(r2, r0, r6, r10)     // Catch: java.lang.Throwable -> L2a3
            boolean r6 = r6.isEmpty()     // Catch: java.lang.Throwable -> L2a3
            if (r6 != 0) goto L242
            r9 = r5
            goto L252
        L242:
            java.lang.String r6 = r9.concat(r0)     // Catch: java.lang.Throwable -> L2a3
            java.lang.Object[] r6 = new java.lang.Object[]{r6}     // Catch: java.lang.Throwable -> L2a3
            java.lang.Object[] r6 = java.util.Arrays.copyOf(r6, r5)     // Catch: java.lang.Throwable -> L2a3
            a.C0453x1.e(r6)     // Catch: java.lang.Throwable -> L2a3
            r9 = r13
        L252:
            a.l8 r6 = new a.l8     // Catch: java.lang.Throwable -> L2a3
            r10 = 10
            r6.<init>(r10)     // Catch: java.lang.Throwable -> L2a3
            a.l8 r10 = new a.l8     // Catch: java.lang.Throwable -> L2a3
            r11 = 11
            r10.<init>(r1, r11)     // Catch: java.lang.Throwable -> L2a3
            java.util.ArrayList r6 = a.J8.b(r2, r0, r6, r10)     // Catch: java.lang.Throwable -> L2a3
            boolean r6 = r6.isEmpty()     // Catch: java.lang.Throwable -> L2a3
            if (r6 != 0) goto L26c
            int r9 = r9 + r5
            goto L27b
        L26c:
            java.lang.String r6 = r8.concat(r0)     // Catch: java.lang.Throwable -> L2a3
            java.lang.Object[] r6 = new java.lang.Object[]{r6}     // Catch: java.lang.Throwable -> L2a3
            java.lang.Object[] r6 = java.util.Arrays.copyOf(r6, r5)     // Catch: java.lang.Throwable -> L2a3
            a.C0453x1.e(r6)     // Catch: java.lang.Throwable -> L2a3
        L27b:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2a3
            r6.<init>(r3)     // Catch: java.lang.Throwable -> L2a3
            r6.append(r9)     // Catch: java.lang.Throwable -> L2a3
            java.lang.String r3 = "/2 ("
            r6.append(r3)     // Catch: java.lang.Throwable -> L2a3
            r6.append(r0)     // Catch: java.lang.Throwable -> L2a3
            java.lang.String r0 = ")"
            r6.append(r0)     // Catch: java.lang.Throwable -> L2a3
            java.lang.String r0 = r6.toString()     // Catch: java.lang.Throwable -> L2a3
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch: java.lang.Throwable -> L2a3
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r5)     // Catch: java.lang.Throwable -> L2a3
            a.C0453x1.b(r0)     // Catch: java.lang.Throwable -> L2a3
            if (r9 <= 0) goto L2ca
            int r4 = r4 + r5
            goto L2ca
        L2a3:
            r0 = move-exception
            java.lang.String r3 = "[HideSnsInteraction] timeline FAILED"
            java.lang.Object[] r0 = new java.lang.Object[]{r3, r0}
            r8 = 2
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r8)
            a.C0453x1.a(r0)
            goto L2ca
        L2b3:
            a.j6 r0 = r0.c
            if (r0 == 0) goto L2b9
            java.lang.String r6 = r0.c
        L2b9:
            java.lang.String r0 = "[HideSnsInteraction] sns_info_model resolve FAILED: "
            java.lang.String r0 = a.C0487z.k(r0, r6)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r5)
            a.C0453x1.e(r0)
        L2ca:
            java.lang.String r0 = "com.tencent.mm.plugin.sns.ui.rm"
            java.lang.String r3 = "com.tencent.mm.plugin.sns.ui.bm"
            java.lang.String[] r0 = new java.lang.String[]{r0, r3}     // Catch: java.lang.Throwable -> L361
            java.util.List r0 = a.C0294o3.d0(r0)     // Catch: java.lang.Throwable -> L361
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L361
            r9 = r13
        L2db:
            boolean r3 = r0.hasNext()     // Catch: java.lang.Throwable -> L361
            if (r3 == 0) goto L36a
            java.lang.Object r3 = r0.next()     // Catch: java.lang.Throwable -> L361
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L361
            java.lang.ClassLoader r6 = r2.f136a     // Catch: java.lang.Throwable -> L361
            java.lang.Class r6 = a.A1.b(r6, r3)     // Catch: java.lang.Throwable -> L361
            if (r6 != 0) goto L2f0
            goto L2db
        L2f0:
            if (r6 == 0) goto L368
            if (r9 != 0) goto L368
            java.lang.reflect.Method[] r8 = r6.getDeclaredMethods()     // Catch: java.lang.Throwable -> L361
            a.G1 r8 = a.C0435w1.I(r8)     // Catch: java.lang.Throwable -> L361
        L2fc:
            boolean r10 = r8.hasNext()     // Catch: java.lang.Throwable -> L361
            if (r10 == 0) goto L363
            java.lang.Object r10 = r8.next()     // Catch: java.lang.Throwable -> L361
            java.lang.reflect.Method r10 = (java.lang.reflect.Method) r10     // Catch: java.lang.Throwable -> L361
            java.lang.Class[] r11 = r10.getParameterTypes()     // Catch: java.lang.Throwable -> L361
            a.C0193i9.d(r11, r7)     // Catch: java.lang.Throwable -> L361
            int r11 = r11.length     // Catch: java.lang.Throwable -> L361
            if (r11 != 0) goto L2fc
            java.lang.Class<android.database.Cursor> r11 = android.database.Cursor.class
            java.lang.Class r12 = r10.getReturnType()     // Catch: java.lang.Throwable -> L361
            boolean r11 = r11.isAssignableFrom(r12)     // Catch: java.lang.Throwable -> L361
            if (r11 == 0) goto L2fc
            io.github.libxposed.api.XposedInterface$HookBuilder r8 = r2.f(r10)     // Catch: java.lang.Throwable -> L361
            a.m2 r9 = new a.m2     // Catch: java.lang.Throwable -> L361
            r11 = 6
            r9.<init>(r11, r1)     // Catch: java.lang.Throwable -> L361
            r8.intercept(r9)     // Catch: java.lang.Throwable -> L361
            java.lang.String r8 = r6.getName()     // Catch: java.lang.Throwable -> L361
            java.lang.String r9 = r10.getName()     // Catch: java.lang.Throwable -> L361
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L361
            r10.<init>()     // Catch: java.lang.Throwable -> L361
            java.lang.String r11 = "[HideSnsInteraction] OK snsMsg cursor hook via "
            r10.append(r11)     // Catch: java.lang.Throwable -> L361
            r10.append(r3)     // Catch: java.lang.Throwable -> L361
            java.lang.String r11 = " -> "
            r10.append(r11)     // Catch: java.lang.Throwable -> L361
            r10.append(r8)     // Catch: java.lang.Throwable -> L361
            java.lang.String r8 = "."
            r10.append(r8)     // Catch: java.lang.Throwable -> L361
            r10.append(r9)     // Catch: java.lang.Throwable -> L361
            java.lang.String r8 = r10.toString()     // Catch: java.lang.Throwable -> L361
            java.lang.Object[] r8 = new java.lang.Object[]{r8}     // Catch: java.lang.Throwable -> L361
            java.lang.Object[] r8 = java.util.Arrays.copyOf(r8, r5)     // Catch: java.lang.Throwable -> L361
            a.C0453x1.b(r8)     // Catch: java.lang.Throwable -> L361
            r9 = r5
            goto L363
        L361:
            r0 = move-exception
            goto L37a
        L363:
            java.lang.Class r6 = r6.getSuperclass()     // Catch: java.lang.Throwable -> L361
            goto L2f0
        L368:
            if (r9 == 0) goto L2db
        L36a:
            if (r9 != 0) goto L389
            java.lang.String r0 = "[HideSnsInteraction] snsMsg: no cursor method found on rm/bm"
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch: java.lang.Throwable -> L361
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r5)     // Catch: java.lang.Throwable -> L361
            a.C0453x1.e(r0)     // Catch: java.lang.Throwable -> L361
            goto L389
        L37a:
            java.lang.String r2 = "[HideSnsInteraction] snsMsg FAILED"
            java.lang.Object[] r0 = new java.lang.Object[]{r2, r0}
            r8 = 2
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r8)
            a.C0453x1.a(r0)
            r9 = r13
        L389:
            if (r9 == 0) goto L38c
            int r4 = r4 + r5
        L38c:
            java.lang.String r0 = "[HideSnsInteraction] registered "
            java.lang.String r2 = "/6 OK"
            java.lang.String r0 = a.C0487z.c(r4, r0, r2)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r5)
            a.C0453x1.b(r0)
            java.util.concurrent.ConcurrentHashMap<java.lang.String, a.F8> r0 = a.E8.f71a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "registered="
            r0.<init>(r2)
            r0.append(r4)
            java.lang.String r2 = "/6"
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "F007"
            java.lang.String r3 = "snsInteraction"
            a.E8.b(r2, r3, r0)
            return
    }
}
