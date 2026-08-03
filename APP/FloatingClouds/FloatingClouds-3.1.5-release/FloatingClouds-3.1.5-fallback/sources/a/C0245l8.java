package a;

/* JADX INFO: renamed from: a.l8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0245l8 implements a.D7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f556a;

    public /* synthetic */ C0245l8(int r1) {
            r0 = this;
            r0.f556a = r1
            r0.<init>()
            return
    }

    public /* synthetic */ C0245l8(top.mmjz.floatingclouds.plugin.IPlugin r1, int r2) {
            r0 = this;
            r0.f556a = r2
            r0.<init>()
            return
    }

    @Override // a.D7
    public final java.lang.Object f(java.lang.Object r14) {
            r13 = this;
            java.lang.String r0 = "setAdapter"
            java.lang.Class<java.util.List> r1 = java.util.List.class
            java.lang.String r2 = "it"
            java.lang.String r3 = "getThisObject(...)"
            r4 = 2
            java.lang.String r5 = "getParameterTypes(...)"
            java.lang.String r6 = "getArgs(...)"
            java.lang.String r7 = "m"
            r8 = 0
            r9 = 0
            r10 = 1
            java.lang.String r11 = "chain"
            int r12 = r13.f556a
            switch(r12) {
                case 0: goto L4a8;
                case 1: goto L48a;
                case 2: goto L46e;
                case 3: goto L414;
                case 4: goto L401;
                case 5: goto L3ee;
                case 6: goto L3d2;
                case 7: goto L328;
                case 8: goto L307;
                case 9: goto L2d3;
                case 10: goto L2b2;
                case 11: goto L22d;
                case 12: goto L1f3;
                case 13: goto L1b2;
                case 14: goto L1ab;
                case 15: goto L174;
                case 16: goto L165;
                case 17: goto L15e;
                case 18: goto L152;
                case 19: goto L148;
                case 20: goto L13e;
                case 21: goto L134;
                case 22: goto L12a;
                case 23: goto L120;
                case 24: goto Le2;
                case 25: goto La7;
                case 26: goto L69;
                case 27: goto L2d;
                case 28: goto L23;
                default: goto L19;
            }
        L19:
            io.github.libxposed.api.XposedInterface$Chain r14 = (io.github.libxposed.api.XposedInterface.Chain) r14
            a.C0193i9.e(r14, r11)
            java.lang.Object r14 = a.R8.f(r14)
            return r14
        L23:
            io.github.libxposed.api.XposedInterface$Chain r14 = (io.github.libxposed.api.XposedInterface.Chain) r14
            a.C0193i9.e(r14, r11)
            java.lang.Object r14 = a.R8.f(r14)
            return r14
        L2d:
            io.github.libxposed.api.XposedInterface$Chain r14 = (io.github.libxposed.api.XposedInterface.Chain) r14
            a.C0193i9.e(r14, r11)
            java.util.List r0 = r14.getArgs()
            a.C0193i9.d(r0, r6)
            r1 = 4
            java.lang.Object r0 = a.C0383t3.o0(r0, r1)
            boolean r1 = r0 instanceof android.content.Intent
            if (r1 == 0) goto L45
            android.content.Intent r0 = (android.content.Intent) r0
            goto L46
        L45:
            r0 = r8
        L46:
            if (r0 == 0) goto L64
            boolean r1 = a.R8.t(r0)
            if (r1 == 0) goto L64
            android.content.ComponentName r14 = r0.getComponent()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "intercept Instrumentation.execStartActivity intent="
            r0.<init>(r1)
            r0.append(r14)
            java.lang.String r14 = r0.toString()
            a.R8.r(r14)
            goto L68
        L64:
            java.lang.Object r8 = r14.proceed()
        L68:
            return r8
        L69:
            io.github.libxposed.api.XposedInterface$Chain r14 = (io.github.libxposed.api.XposedInterface.Chain) r14
            a.C0193i9.e(r14, r11)
            java.util.List r0 = r14.getArgs()
            a.C0193i9.d(r0, r6)
            java.lang.Object r0 = a.C0383t3.o0(r0, r4)
            boolean r1 = r0 instanceof android.content.Intent
            if (r1 == 0) goto L80
            r8 = r0
            android.content.Intent r8 = (android.content.Intent) r8
        L80:
            if (r8 == 0) goto La2
            boolean r0 = a.R8.t(r8)
            if (r0 == 0) goto La2
            android.content.ComponentName r14 = r8.getComponent()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "intercept IActivityManager.bindService intent="
            r0.<init>(r1)
            r0.append(r14)
            java.lang.String r14 = r0.toString()
            a.R8.r(r14)
            java.lang.Integer r14 = java.lang.Integer.valueOf(r9)
            goto La6
        La2:
            java.lang.Object r14 = r14.proceed()
        La6:
            return r14
        La7:
            io.github.libxposed.api.XposedInterface$Chain r14 = (io.github.libxposed.api.XposedInterface.Chain) r14
            a.C0193i9.e(r14, r11)
            java.util.List r0 = r14.getArgs()
            a.C0193i9.d(r0, r6)
            java.lang.Object r0 = a.C0383t3.o0(r0, r10)
            boolean r1 = r0 instanceof android.content.Intent
            if (r1 == 0) goto Lbe
            android.content.Intent r0 = (android.content.Intent) r0
            goto Lbf
        Lbe:
            r0 = r8
        Lbf:
            if (r0 == 0) goto Ldd
            boolean r1 = a.R8.t(r0)
            if (r1 == 0) goto Ldd
            android.content.ComponentName r14 = r0.getComponent()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "intercept IActivityManager.startService intent="
            r0.<init>(r1)
            r0.append(r14)
            java.lang.String r14 = r0.toString()
            a.R8.r(r14)
            goto Le1
        Ldd:
            java.lang.Object r8 = r14.proceed()
        Le1:
            return r8
        Le2:
            io.github.libxposed.api.XposedInterface$Chain r14 = (io.github.libxposed.api.XposedInterface.Chain) r14
            a.C0193i9.e(r14, r11)
            java.util.List r0 = r14.getArgs()
            a.C0193i9.d(r0, r6)
            java.lang.Object r0 = a.C0383t3.o0(r0, r4)
            boolean r1 = r0 instanceof android.content.Intent
            if (r1 == 0) goto Lf9
            r8 = r0
            android.content.Intent r8 = (android.content.Intent) r8
        Lf9:
            if (r8 == 0) goto L11b
            boolean r0 = a.R8.t(r8)
            if (r0 == 0) goto L11b
            android.content.ComponentName r14 = r8.getComponent()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "intercept IActivityManager.startActivity intent="
            r0.<init>(r1)
            r0.append(r14)
            java.lang.String r14 = r0.toString()
            a.R8.r(r14)
            java.lang.Integer r14 = java.lang.Integer.valueOf(r9)
            goto L11f
        L11b:
            java.lang.Object r14 = r14.proceed()
        L11f:
            return r14
        L120:
            io.github.libxposed.api.XposedInterface$Chain r14 = (io.github.libxposed.api.XposedInterface.Chain) r14
            a.C0193i9.e(r14, r11)
            java.lang.Object r14 = a.R8.h(r14)
            return r14
        L12a:
            io.github.libxposed.api.XposedInterface$Chain r14 = (io.github.libxposed.api.XposedInterface.Chain) r14
            a.C0193i9.e(r14, r11)
            java.lang.Object r14 = a.R8.h(r14)
            return r14
        L134:
            io.github.libxposed.api.XposedInterface$Chain r14 = (io.github.libxposed.api.XposedInterface.Chain) r14
            a.C0193i9.e(r14, r11)
            java.lang.Object r14 = a.R8.g(r14)
            return r14
        L13e:
            io.github.libxposed.api.XposedInterface$Chain r14 = (io.github.libxposed.api.XposedInterface.Chain) r14
            a.C0193i9.e(r14, r11)
            java.lang.Object r14 = a.R8.h(r14)
            return r14
        L148:
            io.github.libxposed.api.XposedInterface$Chain r14 = (io.github.libxposed.api.XposedInterface.Chain) r14
            a.C0193i9.e(r14, r11)
            java.lang.Object r14 = a.R8.j(r14)
            return r14
        L152:
            java.lang.Class r14 = (java.lang.Class) r14
            if (r14 == 0) goto L15b
            java.lang.String r14 = r14.getSimpleName()
            goto L15d
        L15b:
            java.lang.String r14 = "?"
        L15d:
            return r14
        L15e:
            java.lang.Class r14 = (java.lang.Class) r14
            java.lang.String r14 = r14.getName()
            return r14
        L165:
            java.lang.reflect.Field r14 = (java.lang.reflect.Field) r14
            a.C0193i9.e(r14, r2)
            java.lang.String r14 = r14.getName()
            java.lang.String r0 = "getName(...)"
            a.C0193i9.d(r14, r0)
            return r14
        L174:
            java.lang.reflect.Method r14 = (java.lang.reflect.Method) r14
            a.C0193i9.e(r14, r2)
            java.lang.String r0 = r14.getName()
            java.lang.Class[] r14 = r14.getParameterTypes()
            a.C0193i9.d(r14, r5)
            a.l8 r1 = new a.l8
            r2 = 17
            r1.<init>(r2)
            r2 = 31
            java.lang.String r14 = a.N1.e0(r14, r8, r1, r2)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = "("
            r1.append(r0)
            r1.append(r14)
            java.lang.String r14 = ")"
            r1.append(r14)
            java.lang.String r14 = r1.toString()
            return r14
        L1ab:
            java.lang.Class r14 = (java.lang.Class) r14
            java.lang.String r14 = r14.getName()
            return r14
        L1b2:
            io.github.libxposed.api.XposedInterface$Chain r14 = (io.github.libxposed.api.XposedInterface.Chain) r14
            a.C0193i9.e(r14, r11)
            boolean r0 = a.C0442w8.c()
            if (r0 == 0) goto L1ee
            java.util.List r0 = r14.getArgs()
            a.C0193i9.d(r0, r6)
            java.lang.Object r0 = a.C0383t3.o0(r0, r9)
            boolean r1 = a.Kf.b(r0)
            if (r1 == 0) goto L1d1
            r8 = r0
            java.util.List r8 = (java.util.List) r8
        L1d1:
            if (r8 == 0) goto L1ee
            java.util.HashSet r0 = a.C0442w8.e()
            int r0 = a.C0442w8.b(r8, r0)
            if (r0 <= 0) goto L1ee
            java.lang.String r1 = "[HideSnsInteraction] b8 filter "
            java.lang.String r0 = a.C0487z.e(r1, r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r10)
            a.C0453x1.b(r0)
        L1ee:
            java.lang.Object r14 = r14.proceed()
            return r14
        L1f3:
            java.lang.reflect.Method r14 = (java.lang.reflect.Method) r14
            a.C0193i9.e(r14, r7)
            java.lang.Class[] r0 = r14.getParameterTypes()
            int r0 = r0.length
            if (r0 != r4) goto L228
            java.lang.Class[] r0 = r14.getParameterTypes()
            r0 = r0[r9]
            boolean r0 = r1.isAssignableFrom(r0)
            if (r0 == 0) goto L228
            java.lang.Class[] r0 = r14.getParameterTypes()
            r0 = r0[r10]
            java.lang.Class r1 = java.lang.Boolean.TYPE
            boolean r0 = a.C0193i9.a(r0, r1)
            if (r0 != 0) goto L227
            java.lang.Class[] r14 = r14.getParameterTypes()
            r14 = r14[r10]
            java.lang.Class<java.lang.Boolean> r0 = java.lang.Boolean.class
            boolean r14 = a.C0193i9.a(r14, r0)
            if (r14 == 0) goto L228
        L227:
            r9 = r10
        L228:
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r9)
            return r14
        L22d:
            io.github.libxposed.api.XposedInterface$Chain r14 = (io.github.libxposed.api.XposedInterface.Chain) r14
            a.C0193i9.e(r14, r11)
            java.lang.Object r14 = r14.proceed()
            boolean r0 = a.C0442w8.c()
            if (r0 == 0) goto L2b1
            if (r14 == 0) goto L2b1
            java.lang.Class r0 = r14.getClass()
        L242:
            if (r0 == 0) goto L2b1
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
            boolean r2 = r0.equals(r2)
            if (r2 != 0) goto L2b1
            java.lang.reflect.Field[] r2 = r0.getDeclaredFields()
            a.G1 r2 = a.C0435w1.I(r2)
        L254:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L2ac
            java.lang.Object r3 = r2.next()
            java.lang.reflect.Field r3 = (java.lang.reflect.Field) r3
            java.lang.Class r4 = r3.getType()
            boolean r4 = r1.isAssignableFrom(r4)
            if (r4 == 0) goto L254
            r3.setAccessible(r10)     // Catch: java.lang.Throwable -> L27a
            java.lang.Object r3 = r3.get(r14)     // Catch: java.lang.Throwable -> L27a
            boolean r4 = a.Kf.b(r3)     // Catch: java.lang.Throwable -> L27a
            if (r4 == 0) goto L27c
            java.util.List r3 = (java.util.List) r3     // Catch: java.lang.Throwable -> L27a
            goto L27d
        L27a:
            r3 = move-exception
            goto L2a8
        L27c:
            r3 = r8
        L27d:
            if (r3 == 0) goto L254
            java.util.HashSet r4 = a.C0442w8.e()     // Catch: java.lang.Throwable -> L27a
            int r3 = a.C0442w8.b(r3, r4)     // Catch: java.lang.Throwable -> L27a
            if (r3 <= 0) goto L2a5
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L27a
            r4.<init>()     // Catch: java.lang.Throwable -> L27a
            java.lang.String r5 = "[HideSnsInteraction] timeline like filter "
            r4.append(r5)     // Catch: java.lang.Throwable -> L27a
            r4.append(r3)     // Catch: java.lang.Throwable -> L27a
            java.lang.String r3 = r4.toString()     // Catch: java.lang.Throwable -> L27a
            java.lang.Object[] r3 = new java.lang.Object[]{r3}     // Catch: java.lang.Throwable -> L27a
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r10)     // Catch: java.lang.Throwable -> L27a
            a.C0453x1.b(r3)     // Catch: java.lang.Throwable -> L27a
        L2a5:
            a.Wf r3 = a.Wf.f330a     // Catch: java.lang.Throwable -> L27a
            goto L254
        L2a8:
            a.C0465xd.a(r3)
            goto L254
        L2ac:
            java.lang.Class r0 = r0.getSuperclass()
            goto L242
        L2b1:
            return r14
        L2b2:
            java.lang.reflect.Method r14 = (java.lang.reflect.Method) r14
            a.C0193i9.e(r14, r7)
            java.lang.String r0 = r14.getName()
            java.lang.String r1 = "P0"
            boolean r0 = a.C0193i9.a(r0, r1)
            if (r0 == 0) goto L2ce
            java.lang.Class[] r14 = r14.getParameterTypes()
            a.C0193i9.d(r14, r5)
            int r14 = r14.length
            if (r14 != 0) goto L2ce
            r9 = r10
        L2ce:
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r9)
            return r14
        L2d3:
            io.github.libxposed.api.XposedInterface$Chain r14 = (io.github.libxposed.api.XposedInterface.Chain) r14
            a.C0193i9.e(r14, r11)
            java.lang.Object r14 = r14.proceed()
            boolean r0 = a.C0442w8.c()
            if (r0 == 0) goto L306
            boolean r0 = a.Kf.b(r14)
            if (r0 == 0) goto L306
            r0 = r14
            java.util.List r0 = (java.util.List) r0
            java.util.HashSet r1 = a.C0442w8.e()
            int r0 = a.C0442w8.b(r0, r1)
            if (r0 <= 0) goto L306
            java.lang.String r1 = "[HideSnsInteraction] timeline comment filter "
            java.lang.String r0 = a.C0487z.e(r1, r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r10)
            a.C0453x1.b(r0)
        L306:
            return r14
        L307:
            java.lang.reflect.Method r14 = (java.lang.reflect.Method) r14
            a.C0193i9.e(r14, r7)
            java.lang.String r0 = r14.getName()
            java.lang.String r1 = "getCommentList"
            boolean r0 = a.C0193i9.a(r0, r1)
            if (r0 == 0) goto L323
            java.lang.Class[] r14 = r14.getParameterTypes()
            a.C0193i9.d(r14, r5)
            int r14 = r14.length
            if (r14 != 0) goto L323
            r9 = r10
        L323:
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r9)
            return r14
        L328:
            io.github.libxposed.api.XposedInterface$Chain r14 = (io.github.libxposed.api.XposedInterface.Chain) r14
            a.C0193i9.e(r14, r11)
            r14.proceed()
            boolean r0 = a.C0442w8.c()
            if (r0 != 0) goto L338
            goto L3d1
        L338:
            java.util.HashSet r0 = a.C0442w8.e()
            java.lang.Object r14 = r14.getThisObject()
            a.C0193i9.d(r14, r3)
            java.lang.Class r1 = r14.getClass()
        L347:
            if (r1 == 0) goto L37a
            java.lang.reflect.Field[] r2 = r1.getDeclaredFields()
            a.G1 r2 = a.C0435w1.I(r2)
        L351:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L375
            java.lang.Object r3 = r2.next()
            java.lang.reflect.Field r3 = (java.lang.reflect.Field) r3
            java.lang.Class r4 = r3.getType()
            java.lang.String r4 = r4.getName()
            java.lang.String r6 = "CommentListAdapter"
            boolean r4 = r4.endsWith(r6)
            if (r4 == 0) goto L351
            r3.setAccessible(r10)
            java.lang.Object r14 = r3.get(r14)
            goto L37b
        L375:
            java.lang.Class r1 = r1.getSuperclass()
            goto L347
        L37a:
            r14 = r8
        L37b:
            if (r14 != 0) goto L37e
            goto L3d1
        L37e:
            int r0 = a.C0442w8.a(r14, r0)
            if (r0 <= 0) goto L3d1
            java.lang.String r1 = "[HideSnsInteraction] initView filter "
            java.lang.String r0 = a.C0487z.e(r1, r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r10)
            a.C0453x1.b(r0)
            java.lang.Class r0 = r14.getClass()     // Catch: java.lang.Throwable -> L3be
            java.lang.reflect.Method[] r0 = r0.getMethods()     // Catch: java.lang.Throwable -> L3be
            java.lang.String r1 = "getMethods(...)"
            a.C0193i9.d(r0, r1)     // Catch: java.lang.Throwable -> L3be
            int r1 = r0.length     // Catch: java.lang.Throwable -> L3be
        L3a3:
            if (r9 >= r1) goto L3c2
            r2 = r0[r9]     // Catch: java.lang.Throwable -> L3be
            java.lang.String r3 = r2.getName()     // Catch: java.lang.Throwable -> L3be
            java.lang.String r4 = "notifyDataSetChanged"
            boolean r3 = a.C0193i9.a(r3, r4)     // Catch: java.lang.Throwable -> L3be
            if (r3 == 0) goto L3c0
            java.lang.Class[] r3 = r2.getParameterTypes()     // Catch: java.lang.Throwable -> L3be
            a.C0193i9.d(r3, r5)     // Catch: java.lang.Throwable -> L3be
            int r3 = r3.length     // Catch: java.lang.Throwable -> L3be
            if (r3 != 0) goto L3c0
            goto L3c3
        L3be:
            r14 = move-exception
            goto L3ce
        L3c0:
            int r9 = r9 + r10
            goto L3a3
        L3c2:
            r2 = r8
        L3c3:
            if (r2 == 0) goto L3c8
            r2.setAccessible(r10)     // Catch: java.lang.Throwable -> L3be
        L3c8:
            if (r2 == 0) goto L3d1
            r2.invoke(r14, r8)     // Catch: java.lang.Throwable -> L3be
            goto L3d1
        L3ce:
            a.C0465xd.a(r14)
        L3d1:
            return r8
        L3d2:
            java.lang.reflect.Method r14 = (java.lang.reflect.Method) r14
            a.C0193i9.e(r14, r7)
            java.lang.String r1 = r14.getName()
            boolean r0 = a.C0193i9.a(r1, r0)
            if (r0 == 0) goto L3e9
            java.lang.Class[] r14 = r14.getParameterTypes()
            int r14 = r14.length
            if (r14 != r10) goto L3e9
            r9 = r10
        L3e9:
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r9)
            return r14
        L3ee:
            io.github.libxposed.api.XposedInterface$Chain r14 = (io.github.libxposed.api.XposedInterface.Chain) r14
            a.C0193i9.e(r14, r11)
            r14.proceed()
            java.lang.Object r14 = r14.getThisObject()
            a.C0193i9.d(r14, r3)
            a.C0370s8.a(r14)
            return r8
        L401:
            io.github.libxposed.api.XposedInterface$Chain r14 = (io.github.libxposed.api.XposedInterface.Chain) r14
            a.C0193i9.e(r14, r11)
            r14.proceed()
            java.lang.Object r14 = r14.getThisObject()
            a.C0193i9.d(r14, r3)
            a.C0370s8.a(r14)
            return r8
        L414:
            io.github.libxposed.api.XposedInterface$Chain r14 = (io.github.libxposed.api.XposedInterface.Chain) r14
            a.C0193i9.e(r14, r11)
            boolean r0 = a.C0370s8.b()
            if (r0 != 0) goto L424
            java.lang.Object r8 = r14.proceed()
            goto L46d
        L424:
            r14.proceed()
            java.lang.Object r14 = r14.getThisObject()
            boolean r0 = r14 instanceof android.app.Activity
            if (r0 == 0) goto L432
            android.app.Activity r14 = (android.app.Activity) r14
            goto L433
        L432:
            r14 = r8
        L433:
            if (r14 == 0) goto L46d
            android.content.Intent r0 = r14.getIntent()
            if (r0 == 0) goto L46d
            java.lang.String r1 = "Contact_User"
            java.lang.String r0 = r0.getStringExtra(r1)
            if (r0 != 0) goto L444
            goto L46d
        L444:
            java.util.concurrent.ExecutorService r1 = a.fh.G
            boolean r0 = a.fh.a.a(r0)
            if (r0 == 0) goto L46d
            java.lang.Object[] r0 = new java.lang.Object[r9]
            java.lang.String r1 = "getPreferenceScreen"
            java.lang.Object r14 = a.A1.a(r14, r1, r0)
            if (r14 == 0) goto L46d
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            java.lang.String r1 = "contact_profile_sns"
            java.lang.Object[] r2 = new java.lang.Object[]{r1, r0}
            java.lang.Object r2 = a.A1.a(r14, r7, r2)
            if (r2 != 0) goto L46d
            java.lang.Object[] r0 = new java.lang.Object[]{r1, r0}
            java.lang.String r1 = "l"
            a.A1.a(r14, r1, r0)
        L46d:
            return r8
        L46e:
            java.lang.reflect.Method r14 = (java.lang.reflect.Method) r14
            a.C0193i9.e(r14, r7)
            java.lang.String r1 = r14.getName()
            boolean r0 = a.C0193i9.a(r1, r0)
            if (r0 == 0) goto L485
            java.lang.Class[] r14 = r14.getParameterTypes()
            int r14 = r14.length
            if (r14 != r10) goto L485
            r9 = r10
        L485:
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r9)
            return r14
        L48a:
            java.lang.reflect.Method r14 = (java.lang.reflect.Method) r14
            a.C0193i9.e(r14, r7)
            java.lang.String r0 = r14.getName()
            java.lang.String r1 = "S"
            boolean r0 = a.C0193i9.a(r0, r1)
            if (r0 == 0) goto L4a3
            java.lang.Class[] r14 = r14.getParameterTypes()
            int r14 = r14.length
            if (r14 != r10) goto L4a3
            r9 = r10
        L4a3:
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r9)
            return r14
        L4a8:
            java.lang.reflect.Method r14 = (java.lang.reflect.Method) r14
            a.C0193i9.e(r14, r7)
            java.lang.String r0 = r14.getName()
            java.lang.String r1 = "Q"
            boolean r0 = a.C0193i9.a(r0, r1)
            if (r0 == 0) goto L4cf
            java.lang.Class[] r0 = r14.getParameterTypes()
            int r0 = r0.length
            if (r0 != r10) goto L4cf
            java.lang.Class[] r14 = r14.getParameterTypes()
            r14 = r14[r9]
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            boolean r14 = a.C0193i9.a(r14, r0)
            if (r14 == 0) goto L4cf
            r9 = r10
        L4cf:
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r9)
            return r14
    }
}
