package a;

/* JADX INFO: renamed from: a.o4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0295o4 implements io.github.libxposed.api.XposedInterface.Hooker {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f617a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;

    public /* synthetic */ C0295o4(java.lang.Object r1, int r2, java.lang.Object r3) {
            r0 = this;
            r0.f617a = r2
            r0.b = r1
            r0.c = r3
            r0.<init>()
            return
    }

    public /* synthetic */ C0295o4(java.lang.Object r2, a.C0366s4 r3) {
            r1 = this;
            r0 = 1
            r1.f617a = r0
            r1.<init>()
            r1.c = r2
            r1.b = r3
            return
    }

    private final java.lang.Object a(io.github.libxposed.api.XposedInterface.Chain r11) {
            r10 = this;
            java.lang.Object r0 = r10.b
            java.lang.ClassLoader r0 = (java.lang.ClassLoader) r0
            java.lang.Object r1 = r10.c
            a.h8 r1 = (a.C0174h8) r1
            java.lang.String r2 = "chain"
            a.C0193i9.e(r11, r2)
            java.util.List r2 = r11.getArgs()
            r3 = 0
            java.lang.Object r2 = r2.get(r3)
            if (r2 == 0) goto L130
            a.fd r4 = new a.fd
            int r5 = a.B1.f21a
            r6 = 1
            r7 = -1
            if (r5 != r7) goto L40
            android.content.Context r5 = a.C0435w1.p     // Catch: java.lang.Exception -> L32
            a.C0193i9.b(r5)     // Catch: java.lang.Exception -> L32
            android.content.pm.PackageManager r5 = r5.getPackageManager()     // Catch: java.lang.Exception -> L32
            java.lang.String r8 = "com.tencent.mm"
            android.content.pm.PackageInfo r5 = r5.getPackageInfo(r8, r3)     // Catch: java.lang.Exception -> L32
            int r7 = r5.versionCode     // Catch: java.lang.Exception -> L32
            goto L3e
        L32:
            r5 = move-exception
            java.lang.Object[] r5 = new java.lang.Object[]{r5}
            java.lang.Object[] r5 = java.util.Arrays.copyOf(r5, r6)
            a.C0453x1.a(r5)
        L3e:
            a.B1.f21a = r7
        L40:
            int r5 = a.B1.f21a
            r4.<init>(r5, r0)
            a.hd r0 = a.C0179hd.f499a
            r0.getClass()
            java.lang.String r0 = "F004_contact_adapter_locator"
            a.gd r0 = a.C0179hd.a(r0, r4)
            java.lang.Class<?> r4 = r0.b
            r5 = 0
            if (r4 == 0) goto L5a
            java.lang.String r4 = r4.getName()
            goto L5b
        L5a:
            r4 = r5
        L5b:
            if (r4 == 0) goto L6b
            java.lang.Class r7 = r2.getClass()
            java.lang.String r7 = r7.getName()
            boolean r7 = r7.equals(r4)
            if (r7 != 0) goto Lcf
        L6b:
            java.lang.Object r7 = r11.getThisObject()
            boolean r8 = r7 instanceof android.view.View
            if (r8 == 0) goto L76
            android.view.View r7 = (android.view.View) r7
            goto L77
        L76:
            r7 = r5
        L77:
            if (r7 != 0) goto L7b
            r5 = r3
            goto Lc7
        L7b:
            android.content.Context r8 = r7.getContext()     // Catch: java.lang.Throwable -> Lb5
            java.lang.String r9 = "getContext(...)"
            a.C0193i9.d(r8, r9)     // Catch: java.lang.Throwable -> Lb5
        L84:
            if (r8 == 0) goto L9f
            boolean r9 = r8 instanceof a.X6     // Catch: java.lang.Throwable -> Lb5
            if (r9 == 0) goto L8e
            r5 = r8
            a.X6 r5 = (a.X6) r5     // Catch: java.lang.Throwable -> Lb5
            goto L9f
        L8e:
            boolean r9 = r8 instanceof android.content.ContextWrapper     // Catch: java.lang.Throwable -> Lb5
            if (r9 == 0) goto L95
            android.content.ContextWrapper r8 = (android.content.ContextWrapper) r8     // Catch: java.lang.Throwable -> Lb5
            goto L96
        L95:
            r8 = r5
        L96:
            if (r8 == 0) goto L9d
            android.content.Context r8 = r8.getBaseContext()     // Catch: java.lang.Throwable -> Lb5
            goto L84
        L9d:
            r8 = r5
            goto L84
        L9f:
            if (r5 != 0) goto La3
            r5 = r3
            goto Lb0
        La3:
            a.e7 r5 = r5.getSupportFragmentManager()     // Catch: java.lang.Throwable -> Lb5
            java.lang.String r8 = "getSupportFragmentManager(...)"
            a.C0193i9.d(r5, r8)     // Catch: java.lang.Throwable -> Lb5
            boolean r5 = a.C0174h8.f(r1, r7, r5)     // Catch: java.lang.Throwable -> Lb5
        Lb0:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)     // Catch: java.lang.Throwable -> Lb5
            goto Lba
        Lb5:
            r5 = move-exception
            a.wd$a r5 = a.C0465xd.a(r5)
        Lba:
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            boolean r8 = r5 instanceof a.C0447wd.a
            if (r8 == 0) goto Lc1
            r5 = r7
        Lc1:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
        Lc7:
            if (r5 == 0) goto Ld0
            boolean r5 = a.C0174h8.g(r2)
            if (r5 == 0) goto Ld0
        Lcf:
            r3 = r6
        Ld0:
            if (r3 == 0) goto L130
            if (r4 == 0) goto Leb
            java.lang.Class r3 = r2.getClass()
            java.lang.String r3 = r3.getName()
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto Leb
            java.lang.String r3 = "ENGINE("
            java.lang.String r5 = ")"
            java.lang.String r3 = a.C0487z.g(r3, r4, r5)
            goto Led
        Leb:
            java.lang.String r3 = "HOST_FRAGMENT"
        Led:
            java.lang.Object r4 = r11.getThisObject()
            r1.e = r4
            r1.d = r2
            java.lang.Class r2 = r2.getClass()
            java.lang.String r2 = r2.getName()
            a.cd r0 = r0.d
            java.lang.String r4 = "HideContactList: captured contact adapter via setAdapter -> "
            java.lang.String r5 = " via="
            java.lang.String r7 = " path="
            java.lang.StringBuilder r2 = a.C0487z.i(r4, r2, r5, r3, r7)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r6)
            a.C0453x1.b(r0)
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r2 = android.os.Looper.getMainLooper()
            r0.<init>(r2)
            a.M2 r2 = new a.M2
            r3 = 11
            r2.<init>(r3, r1)
            r3 = 60
            r0.postDelayed(r2, r3)
        L130:
            java.lang.Object r11 = r11.proceed()
            return r11
    }

    public final java.lang.Object intercept(io.github.libxposed.api.XposedInterface.Chain r26) {
            r25 = this;
            r1 = r25
            r2 = r26
            java.lang.String r3 = "msg"
            r4 = 10
            r5 = 3
            java.lang.String r6 = "getMethods(...)"
            r7 = 2
            java.lang.String r0 = "chain"
            r8 = 0
            r9 = 0
            r10 = 1
            int r11 = r1.f617a
            switch(r11) {
                case 0: goto L444;
                case 1: goto L13d;
                case 2: goto L138;
                case 3: goto Lb4;
                default: goto L16;
            }
        L16:
            java.lang.Object r3 = r1.b
            a.s8 r3 = (a.C0370s8) r3
            java.lang.Object r4 = r1.c
            a.J8 r4 = (a.J8) r4
            a.C0193i9.e(r2, r0)
            java.util.List r0 = r2.getArgs()
            java.lang.Object r0 = r0.get(r9)
            r2.proceed()
            if (r0 == 0) goto Lb3
            boolean r2 = a.C0370s8.b()
            if (r2 == 0) goto Lb3
            java.lang.Class r2 = r0.getClass()
            java.lang.String r2 = r2.getName()
            java.lang.String r11 = "sns"
            boolean r11 = a.Be.I(r2, r11, r9)
            if (r11 != 0) goto L5e
            java.lang.String r11 = "Sns"
            boolean r11 = a.Be.I(r2, r11, r9)
            if (r11 != 0) goto L5e
            boolean r11 = a.Ed.f75a
            java.lang.Class<?> r11 = a.Ed.m
            if (r11 == 0) goto L57
            java.lang.String r11 = r11.getName()
            goto L58
        L57:
            r11 = r8
        L58:
            boolean r2 = r2.equals(r11)
            if (r2 == 0) goto Lb3
        L5e:
            r3.f683a = r0
            boolean r2 = r3.b
            if (r2 == 0) goto L65
            goto Lb3
        L65:
            r3.b = r10
            java.lang.Class r2 = r0.getClass()
            java.lang.reflect.Method[] r2 = r2.getMethods()
            a.C0193i9.d(r2, r6)
            int r6 = r2.length
        L73:
            if (r9 >= r6) goto L8f
            r11 = r2[r9]
            java.lang.Class[] r12 = r11.getParameterTypes()
            int r12 = r12.length
            if (r12 != r7) goto L8d
            java.lang.Class[] r12 = r11.getParameterTypes()
            r12 = r12[r10]
            java.lang.Class r13 = java.lang.Integer.TYPE
            boolean r12 = a.C0193i9.a(r12, r13)
            if (r12 == 0) goto L8d
            goto L90
        L8d:
            int r9 = r9 + r10
            goto L73
        L8f:
            r11 = r8
        L90:
            if (r11 != 0) goto L93
            goto Lb3
        L93:
            r11.setAccessible(r10)
            io.github.libxposed.api.XposedInterface$HookBuilder r2 = r4.f(r11)
            a.m2 r4 = new a.m2
            r4.<init>(r5, r3)
            r2.intercept(r4)
            java.util.concurrent.ConcurrentHashMap<java.lang.String, a.F8> r2 = a.E8.f71a
            java.lang.Class r0 = r0.getClass()
            java.lang.String r0 = r0.getSimpleName()
            java.lang.String r2 = "F006"
            java.lang.String r3 = "timelineBind"
            a.E8.b(r2, r3, r0)
        Lb3:
            return r8
        Lb4:
            java.lang.Object r3 = r1.b
            a.q8 r3 = (a.C0335q8) r3
            java.lang.Object r4 = r1.c
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r5 = "MyPlugin-DexKit: [RecentForward] adapter captured from WxRecyclerView ("
            a.C0193i9.e(r2, r0)
            java.lang.Object r0 = r2.getThisObject()
            java.util.List r6 = r2.getArgs()
            java.lang.Object r6 = r6.get(r9)
            r2.proceed()
            boolean r2 = a.C0335q8.j()     // Catch: java.lang.Throwable -> L121
            if (r2 != 0) goto Ld7
            goto L137
        Ld7:
            if (r6 != 0) goto Lda
            goto L137
        Lda:
            java.lang.Class r2 = r6.getClass()     // Catch: java.lang.Throwable -> L121
            java.lang.String r2 = r2.getName()     // Catch: java.lang.Throwable -> L121
            boolean r4 = r2.equals(r4)     // Catch: java.lang.Throwable -> L121
            if (r4 != 0) goto Le9
            goto L137
        Le9:
            boolean r4 = r0 instanceof android.view.View     // Catch: java.lang.Throwable -> L121
            if (r4 != 0) goto Lee
            goto L137
        Lee:
            android.view.View r0 = (android.view.View) r0     // Catch: java.lang.Throwable -> L121
            android.content.Context r0 = r0.getContext()     // Catch: java.lang.Throwable -> L121
            java.lang.String r0 = a.C0335q8.a(r0)     // Catch: java.lang.Throwable -> L121
            java.lang.String r4 = "com.tencent.mm.ui.mvvm.MvvmContactListUI"
            boolean r0 = a.C0193i9.a(r0, r4)     // Catch: java.lang.Throwable -> L121
            if (r0 != 0) goto L101
            goto L137
        L101:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L121
            r0.<init>(r5)     // Catch: java.lang.Throwable -> L121
            r0.append(r2)     // Catch: java.lang.Throwable -> L121
            java.lang.String r2 = "), scheduling filter"
            r0.append(r2)     // Catch: java.lang.Throwable -> L121
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L121
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch: java.lang.Throwable -> L121
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r10)     // Catch: java.lang.Throwable -> L121
            a.C0453x1.b(r0)     // Catch: java.lang.Throwable -> L121
            r3.m(r6)     // Catch: java.lang.Throwable -> L121
            goto L137
        L121:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()
            java.lang.String r2 = "MyPlugin-DexKit: [RecentForward] setAdapter filter err: "
            java.lang.String r0 = a.C0487z.k(r2, r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r10)
            a.C0453x1.e(r0)
        L137:
            return r8
        L138:
            java.lang.Object r0 = r25.a(r26)
            return r0
        L13d:
            java.lang.Object r6 = r1.c
            java.lang.String r0 = "slChain"
            a.C0193i9.e(r2, r0)
            java.util.List r0 = r2.getArgs()
            java.lang.Object r0 = r0.get(r9)
            boolean r11 = r0 instanceof java.util.List
            if (r11 == 0) goto L154
            java.util.List r0 = (java.util.List) r0
            r11 = r0
            goto L155
        L154:
            r11 = r8
        L155:
            if (r11 != 0) goto L15d
            java.lang.Object r0 = r2.proceed()
            goto L443
        L15d:
            a.K3$a r0 = a.K3.f148a
            r0.getClass()
            boolean r0 = a.K3.a.l()
            if (r0 == 0) goto L43f
            a.jc r0 = a.K3.a.i()
            boolean r0 = r0.n
            if (r0 != 0) goto L172
            goto L43f
        L172:
            java.util.ArrayList r0 = a.K3.a.f()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L182
            java.lang.Object r0 = r2.proceed()
            goto L443
        L182:
            a.x8 r0 = a.C0460x8.f762a
            boolean r0 = a.C0460x8.a()
            if (r0 != 0) goto L43a
            java.util.ArrayList r0 = a.K3.a.f()
            java.util.ArrayList r12 = new java.util.ArrayList
            int r4 = a.C0312p3.g0(r0, r4)
            r12.<init>(r4)
            java.util.Iterator r0 = r0.iterator()
        L19b:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L1af
            java.lang.Object r4 = r0.next()
            top.mmjz.floatingclouds.bean.MaskItemBean r4 = (top.mmjz.floatingclouds.bean.MaskItemBean) r4
            java.lang.String r4 = r4.getMaskId()
            r12.add(r4)
            goto L19b
        L1af:
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>(r12)
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.util.Iterator r13 = r11.iterator()
        L1bd:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L3c0
            java.lang.Object r14 = r13.next()
            if (r14 != 0) goto L1cf
            r21 = r6
            r16 = r8
            goto L3bc
        L1cf:
            java.lang.Object r0 = r1.b
            a.s4 r0 = (a.C0366s4) r0
            r0.getClass()
            java.lang.Class r0 = r14.getClass()     // Catch: java.lang.Throwable -> L398
            r15 = r0
            r16 = r8
            r8 = r9
        L1de:
            java.lang.String r9 = "field_username"
            java.lang.Class<java.lang.Object> r7 = java.lang.Object.class
            if (r15 == 0) goto L26b
            boolean r0 = r15.equals(r7)     // Catch: java.lang.Throwable -> L259
            if (r0 != 0) goto L26b
            if (r8 >= r5) goto L26b
            java.lang.reflect.Field[] r0 = r15.getDeclaredFields()     // Catch: java.lang.Throwable -> L259
            a.G1 r7 = a.C0435w1.I(r0)     // Catch: java.lang.Throwable -> L259
        L1f4:
            boolean r0 = r7.hasNext()     // Catch: java.lang.Throwable -> L259
            if (r0 == 0) goto L25d
            java.lang.Object r0 = r7.next()     // Catch: java.lang.Throwable -> L259
            r5 = r0
            java.lang.reflect.Field r5 = (java.lang.reflect.Field) r5     // Catch: java.lang.Throwable -> L259
            int r0 = r5.getModifiers()     // Catch: java.lang.Throwable -> L259
            boolean r0 = java.lang.reflect.Modifier.isStatic(r0)     // Catch: java.lang.Throwable -> L259
            if (r0 != 0) goto L225
            r5.setAccessible(r10)     // Catch: java.lang.Throwable -> L259
            java.lang.Object r0 = r5.get(r14)     // Catch: java.lang.Throwable -> L215
        L212:
            r19 = r10
            goto L21b
        L215:
            r0 = move-exception
            a.wd$a r0 = a.C0465xd.a(r0)     // Catch: java.lang.Throwable -> L259
            goto L212
        L21b:
            boolean r10 = r0 instanceof a.C0447wd.a     // Catch: java.lang.Throwable -> L23a
            if (r10 == 0) goto L221
            r0 = r16
        L221:
            if (r0 != 0) goto L227
        L223:
            r10 = r19
        L225:
            r5 = 3
            goto L1f4
        L227:
            boolean r10 = r0 instanceof java.lang.String     // Catch: java.lang.Throwable -> L23a
            if (r10 == 0) goto L23f
            r10 = r0
            java.lang.String r10 = (java.lang.String) r10     // Catch: java.lang.Throwable -> L23a
            boolean r10 = a.yh.a(r10)     // Catch: java.lang.Throwable -> L23a
            if (r10 == 0) goto L23f
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L23a
        L236:
            r21 = r6
            goto L3a1
        L23a:
            r0 = move-exception
        L23b:
            r21 = r6
            goto L39d
        L23f:
            java.lang.String r5 = r5.getName()     // Catch: java.lang.Throwable -> L23a
            boolean r5 = a.C0193i9.a(r5, r9)     // Catch: java.lang.Throwable -> L23a
            if (r5 == 0) goto L223
            boolean r5 = r0 instanceof java.lang.String     // Catch: java.lang.Throwable -> L23a
            if (r5 == 0) goto L223
            r5 = r0
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5     // Catch: java.lang.Throwable -> L23a
            boolean r5 = a.Be.P(r5)     // Catch: java.lang.Throwable -> L23a
            if (r5 != 0) goto L223
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L23a
            goto L236
        L259:
            r0 = move-exception
            r19 = r10
            goto L23b
        L25d:
            r19 = r10
            java.lang.Class r15 = r15.getSuperclass()     // Catch: java.lang.Throwable -> L23a
            int r8 = r8 + 1
            r10 = r19
            r5 = 3
            r7 = 2
            goto L1de
        L26b:
            r19 = r10
            java.lang.Class r0 = r14.getClass()     // Catch: java.lang.Throwable -> L23a
            r5 = r0
            r8 = 0
        L273:
            if (r5 == 0) goto L393
            boolean r0 = r5.equals(r7)     // Catch: java.lang.Throwable -> L23a
            if (r0 != 0) goto L393
            r10 = 2
            if (r8 >= r10) goto L393
            java.lang.reflect.Field[] r0 = r5.getDeclaredFields()     // Catch: java.lang.Throwable -> L23a
            a.G1 r10 = a.C0435w1.I(r0)     // Catch: java.lang.Throwable -> L23a
        L286:
            boolean r0 = r10.hasNext()     // Catch: java.lang.Throwable -> L23a
            if (r0 == 0) goto L37d
            java.lang.Object r0 = r10.next()     // Catch: java.lang.Throwable -> L23a
            java.lang.reflect.Field r0 = (java.lang.reflect.Field) r0     // Catch: java.lang.Throwable -> L23a
            int r15 = r0.getModifiers()     // Catch: java.lang.Throwable -> L23a
            boolean r15 = java.lang.reflect.Modifier.isStatic(r15)     // Catch: java.lang.Throwable -> L23a
            if (r15 != 0) goto L2d2
            java.lang.Class r15 = r0.getType()     // Catch: java.lang.Throwable -> L23a
            boolean r15 = r15.isPrimitive()     // Catch: java.lang.Throwable -> L23a
            if (r15 != 0) goto L2d2
            java.lang.Class r15 = r0.getType()     // Catch: java.lang.Throwable -> L23a
            r20 = r5
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            boolean r5 = a.C0193i9.a(r15, r5)     // Catch: java.lang.Throwable -> L23a
            if (r5 == 0) goto L2b7
            r5 = r20
            goto L286
        L2b7:
            r5 = r19
            r0.setAccessible(r5)     // Catch: java.lang.Throwable -> L23a
            java.lang.Object r0 = r0.get(r14)     // Catch: java.lang.Throwable -> L2c1
            goto L2c6
        L2c1:
            r0 = move-exception
            a.wd$a r0 = a.C0465xd.a(r0)     // Catch: java.lang.Throwable -> L23a
        L2c6:
            boolean r5 = r0 instanceof a.C0447wd.a     // Catch: java.lang.Throwable -> L23a
            if (r5 == 0) goto L2cd
            r5 = r16
            goto L2ce
        L2cd:
            r5 = r0
        L2ce:
            if (r5 != 0) goto L2d5
        L2d0:
            r5 = r20
        L2d2:
            r19 = 1
            goto L286
        L2d5:
            boolean r0 = r5 instanceof java.util.List     // Catch: java.lang.Throwable -> L23a
            if (r0 != 0) goto L2d0
            boolean r0 = r5 instanceof java.lang.Object[]     // Catch: java.lang.Throwable -> L23a
            if (r0 == 0) goto L2de
            goto L2d0
        L2de:
            java.lang.Class r0 = r5.getClass()     // Catch: java.lang.Throwable -> L23a
            r15 = r0
            r21 = r6
            r6 = 0
        L2e6:
            if (r15 == 0) goto L377
            boolean r0 = r15.equals(r7)     // Catch: java.lang.Throwable -> L342
            if (r0 != 0) goto L377
            r22 = r7
            r7 = 2
            if (r6 >= r7) goto L36f
            java.lang.reflect.Field[] r0 = r15.getDeclaredFields()     // Catch: java.lang.Throwable -> L342
            a.G1 r7 = a.C0435w1.I(r0)     // Catch: java.lang.Throwable -> L342
        L2fb:
            boolean r0 = r7.hasNext()     // Catch: java.lang.Throwable -> L342
            if (r0 == 0) goto L361
            java.lang.Object r0 = r7.next()     // Catch: java.lang.Throwable -> L342
            r23 = r6
            r6 = r0
            java.lang.reflect.Field r6 = (java.lang.reflect.Field) r6     // Catch: java.lang.Throwable -> L342
            int r0 = r6.getModifiers()     // Catch: java.lang.Throwable -> L342
            boolean r0 = java.lang.reflect.Modifier.isStatic(r0)     // Catch: java.lang.Throwable -> L342
            if (r0 != 0) goto L35e
            r24 = r7
            r7 = 1
            r6.setAccessible(r7)     // Catch: java.lang.Throwable -> L342
            java.lang.Object r0 = r6.get(r5)     // Catch: java.lang.Throwable -> L31f
            goto L324
        L31f:
            r0 = move-exception
            a.wd$a r0 = a.C0465xd.a(r0)     // Catch: java.lang.Throwable -> L342
        L324:
            boolean r7 = r0 instanceof a.C0447wd.a     // Catch: java.lang.Throwable -> L342
            if (r7 == 0) goto L32a
            r0 = r16
        L32a:
            if (r0 != 0) goto L331
        L32c:
            r6 = r23
            r7 = r24
            goto L2fb
        L331:
            boolean r7 = r0 instanceof java.lang.String     // Catch: java.lang.Throwable -> L342
            if (r7 == 0) goto L344
            r7 = r0
            java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.Throwable -> L342
            boolean r7 = a.yh.a(r7)     // Catch: java.lang.Throwable -> L342
            if (r7 == 0) goto L344
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L342
            goto L3a1
        L342:
            r0 = move-exception
            goto L39d
        L344:
            java.lang.String r6 = r6.getName()     // Catch: java.lang.Throwable -> L342
            boolean r6 = a.C0193i9.a(r6, r9)     // Catch: java.lang.Throwable -> L342
            if (r6 == 0) goto L32c
            boolean r6 = r0 instanceof java.lang.String     // Catch: java.lang.Throwable -> L342
            if (r6 == 0) goto L32c
            r6 = r0
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6     // Catch: java.lang.Throwable -> L342
            boolean r6 = a.Be.P(r6)     // Catch: java.lang.Throwable -> L342
            if (r6 != 0) goto L32c
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L342
            goto L3a1
        L35e:
            r6 = r23
            goto L2fb
        L361:
            r23 = r6
            java.lang.Class r15 = r15.getSuperclass()     // Catch: java.lang.Throwable -> L342
            r19 = 1
            int r6 = r23 + 1
            r7 = r22
            goto L2e6
        L36f:
            r5 = r20
            r6 = r21
            r7 = r22
            goto L2d2
        L377:
            r5 = r20
            r6 = r21
            goto L2d2
        L37d:
            r20 = r5
            r21 = r6
            r22 = r7
            java.lang.Class r5 = r20.getSuperclass()     // Catch: java.lang.Throwable -> L342
            r19 = 1
            int r8 = r8 + 1
            r6 = r21
            r7 = r22
            r19 = 1
            goto L273
        L393:
            r21 = r6
            r0 = r16
            goto L3a1
        L398:
            r0 = move-exception
            r21 = r6
            r16 = r8
        L39d:
            a.wd$a r0 = a.C0465xd.a(r0)
        L3a1:
            boolean r5 = r0 instanceof a.C0447wd.a
            if (r5 == 0) goto L3a7
            r0 = r16
        L3a7:
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L3bc
            boolean r0 = r4.contains(r0)
            if (r0 != 0) goto L3b2
            goto L3bc
        L3b2:
            r8 = r16
            r6 = r21
            r5 = 3
            r7 = 2
            r9 = 0
            r10 = 1
            goto L1bd
        L3bc:
            r12.add(r14)
            goto L3b2
        L3c0:
            r21 = r6
            int r0 = r12.size()
            int r4 = r11.size()
            if (r0 >= r4) goto L435
            int r0 = r11.size()
            int r4 = r12.size()
            java.lang.Class r5 = r21.getClass()
            java.lang.String r5 = r5.getName()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "submitList FILTER: "
            r6.<init>(r7)
            r6.append(r0)
            java.lang.String r0 = " -> "
            r6.append(r0)
            r6.append(r4)
            java.lang.String r0 = " (adapter="
            r6.append(r0)
            r6.append(r5)
            java.lang.String r0 = ")"
            r6.append(r0)
            java.lang.String r0 = r6.toString()
            a.C0193i9.e(r0, r3)
            java.lang.String r3 = "[ConvRV] "
            java.lang.String r0 = r3.concat(r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            a.C0453x1.b(r0)
            java.util.List r0 = r2.getArgs()
            java.lang.String r3 = "getArgs(...)"
            a.C0193i9.d(r0, r3)
            int r3 = r0.size()
            java.lang.Object[] r4 = new java.lang.Object[r3]
            r9 = 0
        L41f:
            if (r9 >= r3) goto L430
            if (r9 != 0) goto L425
            r5 = r12
            goto L429
        L425:
            java.lang.Object r5 = r0.get(r9)
        L429:
            r4[r9] = r5
            r19 = 1
            int r9 = r9 + 1
            goto L41f
        L430:
            java.lang.Object r0 = r2.proceed(r4)
            goto L443
        L435:
            java.lang.Object r0 = r2.proceed()
            goto L443
        L43a:
            java.lang.Object r0 = r2.proceed()
            goto L443
        L43f:
            java.lang.Object r0 = r2.proceed()
        L443:
            return r0
        L444:
            r16 = r8
            java.lang.Object r5 = r1.b
            a.s4 r5 = (a.C0366s4) r5
            java.lang.Object r7 = r1.c
            a.J8 r7 = (a.J8) r7
            a.C0193i9.e(r2, r0)
            java.lang.Object r8 = r2.proceed()
            java.util.List r0 = r2.getArgs()
            r2 = 0
            java.lang.Object r9 = r0.get(r2)
            if (r9 != 0) goto L464
        L460:
            r20 = r8
            goto L7dd
        L464:
            java.lang.Class r0 = r9.getClass()
            java.lang.String r2 = r0.getName()
            java.lang.String r0 = "[SetAdapter] "
            java.lang.String r0 = r0.concat(r2)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            a.C0453x1.b(r0)
            java.lang.String r0 = "android."
            r10 = 0
            boolean r0 = a.Ae.H(r2, r0, r10)
            if (r0 != 0) goto L460
            java.lang.String r0 = "androidx."
            boolean r0 = a.Ae.H(r2, r0, r10)
            if (r0 != 0) goto L460
            java.lang.String r0 = "java."
            boolean r0 = a.Ae.H(r2, r0, r10)
            if (r0 == 0) goto L493
            goto L460
        L493:
            java.lang.String r0 = "com.tencent.mm.ui.contact"
            boolean r0 = a.Ae.H(r2, r0, r10)
            if (r0 != 0) goto L460
            java.lang.String r0 = "com.tencent.mm.plugin.fts"
            boolean r0 = a.Ae.H(r2, r0, r10)
            if (r0 == 0) goto L4a4
            goto L460
        L4a4:
            java.lang.Object r0 = a.C0435w1.r
            if (r0 == 0) goto L4ad
            java.lang.reflect.Method r0 = a.C0435w1.s
            if (r0 == 0) goto L4ad
            goto L4c0
        L4ad:
            r5.getClass()
            java.util.HashSet r0 = new java.util.HashSet     // Catch: java.lang.Throwable -> L4bc
            r0.<init>()     // Catch: java.lang.Throwable -> L4bc
            r10 = 0
            a.C0366s4.A(r0, r9, r10)     // Catch: java.lang.Throwable -> L4bc
            a.Wf r0 = a.Wf.f330a     // Catch: java.lang.Throwable -> L4bc
            goto L4c0
        L4bc:
            r0 = move-exception
            a.C0465xd.a(r0)
        L4c0:
            java.util.List<java.lang.String> r0 = r5.d
            java.lang.String r10 = "["
            java.lang.String r11 = "] "
            java.lang.String r12 = "ConvRV"
            if (r0 == 0) goto L650
            boolean r0 = r0.contains(r2)
            r2 = 1
            if (r0 != r2) goto L650
            a.x8 r0 = a.C0460x8.f762a
            boolean r0 = a.C0460x8.a()
            if (r0 != 0) goto L650
            java.lang.Class r0 = r9.getClass()     // Catch: java.lang.Throwable -> L4f2
            java.lang.String r13 = "e"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r13)     // Catch: java.lang.Throwable -> L4f2
            r0.setAccessible(r2)     // Catch: java.lang.Throwable -> L4f2
            java.lang.Object r0 = r0.get(r9)     // Catch: java.lang.Throwable -> L4f2
            boolean r2 = r0 instanceof java.util.ArrayList     // Catch: java.lang.Throwable -> L4f2
            if (r2 == 0) goto L4f7
            java.util.ArrayList r0 = (java.util.ArrayList) r0     // Catch: java.lang.Throwable -> L4f2
            r2 = r0
            goto L4f9
        L4f2:
            r0 = move-exception
            r20 = r8
            goto L63c
        L4f7:
            r2 = r16
        L4f9:
            if (r2 == 0) goto L637
            boolean r0 = r2.isEmpty()     // Catch: java.lang.Throwable -> L4f2
            if (r0 != 0) goto L637
            a.K3$a r0 = a.K3.f148a     // Catch: java.lang.Throwable -> L4f2
            r0.getClass()     // Catch: java.lang.Throwable -> L4f2
            java.util.ArrayList r0 = a.K3.a.f()     // Catch: java.lang.Throwable -> L4f2
            java.util.ArrayList r13 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L4f2
            int r4 = a.C0312p3.g0(r0, r4)     // Catch: java.lang.Throwable -> L4f2
            r13.<init>(r4)     // Catch: java.lang.Throwable -> L4f2
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L4f2
        L517:
            boolean r4 = r0.hasNext()     // Catch: java.lang.Throwable -> L4f2
            if (r4 == 0) goto L52b
            java.lang.Object r4 = r0.next()     // Catch: java.lang.Throwable -> L4f2
            top.mmjz.floatingclouds.bean.MaskItemBean r4 = (top.mmjz.floatingclouds.bean.MaskItemBean) r4     // Catch: java.lang.Throwable -> L4f2
            java.lang.String r4 = r4.getMaskId()     // Catch: java.lang.Throwable -> L4f2
            r13.add(r4)     // Catch: java.lang.Throwable -> L4f2
            goto L517
        L52b:
            java.util.HashSet r4 = new java.util.HashSet     // Catch: java.lang.Throwable -> L4f2
            r4.<init>(r13)     // Catch: java.lang.Throwable -> L4f2
            int r0 = r2.size()     // Catch: java.lang.Throwable -> L4f2
            int r13 = r4.size()     // Catch: java.lang.Throwable -> L4f2
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4f2
            r14.<init>()     // Catch: java.lang.Throwable -> L4f2
            java.lang.String r15 = "lr.f1: "
            r14.append(r15)     // Catch: java.lang.Throwable -> L4f2
            r14.append(r0)     // Catch: java.lang.Throwable -> L4f2
            java.lang.String r0 = " items, masked="
            r14.append(r0)     // Catch: java.lang.Throwable -> L4f2
            r14.append(r13)     // Catch: java.lang.Throwable -> L4f2
            java.lang.String r0 = r14.toString()     // Catch: java.lang.Throwable -> L4f2
            a.C0193i9.e(r0, r3)     // Catch: java.lang.Throwable -> L4f2
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4f2
            r13.<init>(r10)     // Catch: java.lang.Throwable -> L4f2
            r13.append(r12)     // Catch: java.lang.Throwable -> L4f2
            r13.append(r11)     // Catch: java.lang.Throwable -> L4f2
            r13.append(r0)     // Catch: java.lang.Throwable -> L4f2
            java.lang.String r0 = r13.toString()     // Catch: java.lang.Throwable -> L4f2
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch: java.lang.Throwable -> L4f2
            a.C0453x1.b(r0)     // Catch: java.lang.Throwable -> L4f2
            java.util.ArrayList r13 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L4f2
            r13.<init>()     // Catch: java.lang.Throwable -> L4f2
            java.util.Iterator r14 = r2.iterator()     // Catch: java.lang.Throwable -> L4f2
            java.lang.String r0 = "iterator(...)"
            a.C0193i9.d(r14, r0)     // Catch: java.lang.Throwable -> L4f2
        L57b:
            boolean r0 = r14.hasNext()     // Catch: java.lang.Throwable -> L4f2
            if (r0 == 0) goto L60d
            java.lang.Object r15 = r14.next()     // Catch: java.lang.Throwable -> L4f2
            if (r15 == 0) goto L609
            java.lang.Class r0 = r15.getClass()     // Catch: java.lang.Throwable -> L5c0
            r18 = r16
        L58d:
            if (r0 == 0) goto L5b9
            java.lang.String r1 = "a"
            java.lang.reflect.Field r1 = r0.getDeclaredField(r1)     // Catch: java.lang.Throwable -> L5aa java.lang.Exception -> L5ae
            r20 = r8
            r8 = 1
            r1.setAccessible(r8)     // Catch: java.lang.Throwable -> L5a8 java.lang.Exception -> L5b0
            java.lang.Object r1 = r1.get(r15)     // Catch: java.lang.Throwable -> L5a8 java.lang.Exception -> L5b0
            if (r1 == 0) goto L5b0
            java.lang.String r18 = r5.a(r1)     // Catch: java.lang.Throwable -> L5a8 java.lang.Exception -> L5b0
            if (r18 == 0) goto L5b0
            goto L5bb
        L5a8:
            r0 = move-exception
            goto L5c5
        L5aa:
            r0 = move-exception
            r20 = r8
            goto L5c5
        L5ae:
            r20 = r8
        L5b0:
            java.lang.Class r0 = r0.getSuperclass()     // Catch: java.lang.Throwable -> L5a8
            r1 = r25
            r8 = r20
            goto L58d
        L5b9:
            r20 = r8
        L5bb:
            a.Wf r0 = a.Wf.f330a     // Catch: java.lang.Throwable -> L5a8
        L5bd:
            r0 = r18
            goto L5c9
        L5c0:
            r0 = move-exception
            r20 = r8
            r18 = r16
        L5c5:
            a.C0465xd.a(r0)     // Catch: java.lang.Throwable -> L607
            goto L5bd
        L5c9:
            if (r0 == 0) goto L601
            boolean r1 = r4.contains(r0)     // Catch: java.lang.Throwable -> L607
            if (r1 == 0) goto L601
            r13.add(r15)     // Catch: java.lang.Throwable -> L607
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L607
            r1.<init>()     // Catch: java.lang.Throwable -> L607
            java.lang.String r8 = "lr.f1 HIDE: "
            r1.append(r8)     // Catch: java.lang.Throwable -> L607
            r1.append(r0)     // Catch: java.lang.Throwable -> L607
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Throwable -> L607
            a.C0193i9.e(r0, r3)     // Catch: java.lang.Throwable -> L607
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L607
            r1.<init>(r10)     // Catch: java.lang.Throwable -> L607
            r1.append(r12)     // Catch: java.lang.Throwable -> L607
            r1.append(r11)     // Catch: java.lang.Throwable -> L607
            r1.append(r0)     // Catch: java.lang.Throwable -> L607
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Throwable -> L607
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch: java.lang.Throwable -> L607
            a.C0453x1.b(r0)     // Catch: java.lang.Throwable -> L607
        L601:
            r1 = r25
            r8 = r20
            goto L57b
        L607:
            r0 = move-exception
            goto L63c
        L609:
            r1 = r25
            goto L57b
        L60d:
            r20 = r8
            boolean r0 = r13.isEmpty()     // Catch: java.lang.Throwable -> L607
            if (r0 != 0) goto L639
            boolean r0 = r2 instanceof a.InterfaceC0336q9     // Catch: java.lang.Throwable -> L607
            if (r0 == 0) goto L624
            boolean r0 = r2 instanceof a.InterfaceC0353r9     // Catch: java.lang.Throwable -> L607
            if (r0 == 0) goto L61e
            goto L624
        L61e:
            java.lang.String r0 = "kotlin.collections.MutableCollection"
            a.Kf.c(r2, r0)     // Catch: java.lang.Throwable -> L607
            throw r16     // Catch: java.lang.Throwable -> L607
        L624:
            r2.removeAll(r13)     // Catch: java.lang.Throwable -> L607
            java.lang.Class r0 = r9.getClass()     // Catch: java.lang.Throwable -> L607
            java.lang.String r1 = "notifyDataSetChanged"
            r2 = r16
            java.lang.reflect.Method r0 = r0.getMethod(r1, r2)     // Catch: java.lang.Throwable -> L607
            r0.invoke(r9, r2)     // Catch: java.lang.Throwable -> L607
            goto L639
        L637:
            r20 = r8
        L639:
            a.Wf r0 = a.Wf.f330a     // Catch: java.lang.Throwable -> L607
            goto L640
        L63c:
            a.wd$a r0 = a.C0465xd.a(r0)
        L640:
            java.lang.Throwable r0 = a.C0447wd.a(r0)
            if (r0 == 0) goto L652
            java.lang.String r1 = "[ConvRV] lr.f1 process fail"
            java.lang.Object[] r0 = new java.lang.Object[]{r1, r0}
            a.C0453x1.a(r0)
            goto L652
        L650:
            r20 = r8
        L652:
            java.util.Set<java.lang.Class<?>> r0 = r5.u
            java.lang.Class r1 = r9.getClass()
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L660
            goto L7dd
        L660:
            java.util.Set<java.lang.Class<?>> r0 = r5.u
            java.lang.Class r1 = r9.getClass()
            r0.add(r1)
            java.lang.Class r0 = r9.getClass()     // Catch: java.lang.Throwable -> L699
            java.lang.reflect.Method[] r0 = r0.getMethods()     // Catch: java.lang.Throwable -> L699
            a.C0193i9.d(r0, r6)     // Catch: java.lang.Throwable -> L699
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L699
            r1.<init>()     // Catch: java.lang.Throwable -> L699
            int r2 = r0.length     // Catch: java.lang.Throwable -> L699
            r4 = 0
        L67b:
            if (r4 >= r2) goto L6a1
            r8 = r0[r4]     // Catch: java.lang.Throwable -> L699
            java.lang.String r13 = r8.getName()     // Catch: java.lang.Throwable -> L699
            java.lang.String r14 = "onBindViewHolder"
            boolean r13 = a.C0193i9.a(r13, r14)     // Catch: java.lang.Throwable -> L699
            if (r13 == 0) goto L69c
            java.lang.Class[] r13 = r8.getParameterTypes()     // Catch: java.lang.Throwable -> L699
            int r13 = r13.length     // Catch: java.lang.Throwable -> L699
            r14 = 2
            if (r13 != r14) goto L696
            r1.add(r8)     // Catch: java.lang.Throwable -> L699
        L696:
            r19 = 1
            goto L69e
        L699:
            r0 = move-exception
            goto L73e
        L69c:
            r14 = 2
            goto L696
        L69e:
            int r4 = r4 + 1
            goto L67b
        L6a1:
            boolean r0 = r1.isEmpty()     // Catch: java.lang.Throwable -> L699
            if (r0 == 0) goto L6e2
            java.lang.Class r0 = r9.getClass()     // Catch: java.lang.Throwable -> L699
            java.lang.String r0 = r0.getName()     // Catch: java.lang.Throwable -> L699
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L699
            r1.<init>()     // Catch: java.lang.Throwable -> L699
            java.lang.String r2 = "onBindViewHolder NOT found in "
            r1.append(r2)     // Catch: java.lang.Throwable -> L699
            r1.append(r0)     // Catch: java.lang.Throwable -> L699
            java.lang.String r0 = " hierarchy"
            r1.append(r0)     // Catch: java.lang.Throwable -> L699
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Throwable -> L699
            a.C0193i9.e(r0, r3)     // Catch: java.lang.Throwable -> L699
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L699
            r1.<init>(r10)     // Catch: java.lang.Throwable -> L699
            r1.append(r12)     // Catch: java.lang.Throwable -> L699
            r1.append(r11)     // Catch: java.lang.Throwable -> L699
            r1.append(r0)     // Catch: java.lang.Throwable -> L699
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Throwable -> L699
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch: java.lang.Throwable -> L699
            a.C0453x1.b(r0)     // Catch: java.lang.Throwable -> L699
            goto L73b
        L6e2:
            r2 = 0
            java.lang.Object r0 = r1.get(r2)     // Catch: java.lang.Throwable -> L699
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0     // Catch: java.lang.Throwable -> L699
            java.lang.Class r1 = r0.getDeclaringClass()     // Catch: java.lang.Throwable -> L699
            java.lang.String r1 = r1.getName()     // Catch: java.lang.Throwable -> L699
            java.lang.Class r2 = r9.getClass()     // Catch: java.lang.Throwable -> L699
            java.lang.String r2 = r2.getName()     // Catch: java.lang.Throwable -> L699
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L699
            r4.<init>()     // Catch: java.lang.Throwable -> L699
            java.lang.String r8 = "hooking onBindViewHolder in "
            r4.append(r8)     // Catch: java.lang.Throwable -> L699
            r4.append(r1)     // Catch: java.lang.Throwable -> L699
            java.lang.String r1 = " for adapter "
            r4.append(r1)     // Catch: java.lang.Throwable -> L699
            r4.append(r2)     // Catch: java.lang.Throwable -> L699
            java.lang.String r1 = r4.toString()     // Catch: java.lang.Throwable -> L699
            a.C0193i9.e(r1, r3)     // Catch: java.lang.Throwable -> L699
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L699
            r2.<init>(r10)     // Catch: java.lang.Throwable -> L699
            r2.append(r12)     // Catch: java.lang.Throwable -> L699
            r2.append(r11)     // Catch: java.lang.Throwable -> L699
            r2.append(r1)     // Catch: java.lang.Throwable -> L699
            java.lang.String r1 = r2.toString()     // Catch: java.lang.Throwable -> L699
            java.lang.Object[] r1 = new java.lang.Object[]{r1}     // Catch: java.lang.Throwable -> L699
            a.C0453x1.b(r1)     // Catch: java.lang.Throwable -> L699
            io.github.libxposed.api.XposedInterface$HookBuilder r0 = r7.f(r0)     // Catch: java.lang.Throwable -> L699
            a.p4 r1 = new a.p4     // Catch: java.lang.Throwable -> L699
            r2 = 1
            r1.<init>(r5, r2)     // Catch: java.lang.Throwable -> L699
            r0.intercept(r1)     // Catch: java.lang.Throwable -> L699
        L73b:
            a.Wf r0 = a.Wf.f330a     // Catch: java.lang.Throwable -> L699
            goto L741
        L73e:
            a.C0465xd.a(r0)
        L741:
            java.lang.Class r0 = r9.getClass()     // Catch: java.lang.Throwable -> L781
            java.lang.reflect.Method[] r0 = r0.getMethods()     // Catch: java.lang.Throwable -> L781
            a.C0193i9.d(r0, r6)     // Catch: java.lang.Throwable -> L781
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L781
            r1.<init>()     // Catch: java.lang.Throwable -> L781
            int r2 = r0.length     // Catch: java.lang.Throwable -> L781
            r4 = 0
        L753:
            if (r4 >= r2) goto L786
            r6 = r0[r4]     // Catch: java.lang.Throwable -> L781
            java.lang.String r8 = r6.getName()     // Catch: java.lang.Throwable -> L781
            java.lang.String r13 = "submitList"
            boolean r8 = a.C0193i9.a(r8, r13)     // Catch: java.lang.Throwable -> L781
            if (r8 == 0) goto L77e
            java.lang.Class[] r8 = r6.getParameterTypes()     // Catch: java.lang.Throwable -> L781
            int r8 = r8.length     // Catch: java.lang.Throwable -> L781
            r13 = 1
            if (r8 < r13) goto L77e
            java.lang.Class<java.util.List> r8 = java.util.List.class
            java.lang.Class[] r13 = r6.getParameterTypes()     // Catch: java.lang.Throwable -> L781
            r17 = 0
            r13 = r13[r17]     // Catch: java.lang.Throwable -> L781
            boolean r8 = r8.isAssignableFrom(r13)     // Catch: java.lang.Throwable -> L781
            if (r8 == 0) goto L77e
            r1.add(r6)     // Catch: java.lang.Throwable -> L781
        L77e:
            r19 = 1
            goto L783
        L781:
            r0 = move-exception
            goto L7da
        L783:
            int r4 = r4 + 1
            goto L753
        L786:
            boolean r0 = r1.isEmpty()     // Catch: java.lang.Throwable -> L781
            if (r0 != 0) goto L7d7
            r2 = 0
            java.lang.Object r0 = r1.get(r2)     // Catch: java.lang.Throwable -> L781
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0     // Catch: java.lang.Throwable -> L781
            a.C0193i9.b(r0)     // Catch: java.lang.Throwable -> L781
            io.github.libxposed.api.XposedInterface$HookBuilder r0 = r7.f(r0)     // Catch: java.lang.Throwable -> L781
            a.o4 r1 = new a.o4     // Catch: java.lang.Throwable -> L781
            r1.<init>(r9, r5)     // Catch: java.lang.Throwable -> L781
            r0.intercept(r1)     // Catch: java.lang.Throwable -> L781
            java.lang.Class r0 = r9.getClass()     // Catch: java.lang.Throwable -> L781
            java.lang.String r0 = r0.getName()     // Catch: java.lang.Throwable -> L781
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L781
            r1.<init>()     // Catch: java.lang.Throwable -> L781
            java.lang.String r2 = "hooked submitList on "
            r1.append(r2)     // Catch: java.lang.Throwable -> L781
            r1.append(r0)     // Catch: java.lang.Throwable -> L781
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Throwable -> L781
            a.C0193i9.e(r0, r3)     // Catch: java.lang.Throwable -> L781
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L781
            r1.<init>(r10)     // Catch: java.lang.Throwable -> L781
            r1.append(r12)     // Catch: java.lang.Throwable -> L781
            r1.append(r11)     // Catch: java.lang.Throwable -> L781
            r1.append(r0)     // Catch: java.lang.Throwable -> L781
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Throwable -> L781
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch: java.lang.Throwable -> L781
            a.C0453x1.b(r0)     // Catch: java.lang.Throwable -> L781
        L7d7:
            a.Wf r0 = a.Wf.f330a     // Catch: java.lang.Throwable -> L781
            goto L7dd
        L7da:
            a.C0465xd.a(r0)
        L7dd:
            return r20
    }
}
