package a;

/* JADX INFO: renamed from: a.h4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0170h4 implements a.D7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f492a;
    public final /* synthetic */ a.C0366s4 b;

    public /* synthetic */ C0170h4(a.C0366s4 r1, int r2) {
            r0 = this;
            r0.f492a = r2
            r0.b = r1
            r0.<init>()
            return
    }

    public /* synthetic */ C0170h4(a.C0366s4 r1, a.J8 r2, int r3) {
            r0 = this;
            r0.f492a = r3
            r0.b = r1
            r0.<init>()
            return
    }

    @Override // a.D7
    public final java.lang.Object f(java.lang.Object r23) {
            r22 = this;
            r1 = r22
            r0 = 10
            java.lang.String r2 = "msg"
            java.lang.String r3 = "[ConvRV] "
            java.lang.String r5 = "chain"
            r6 = 0
            r7 = 1
            int r8 = r1.f492a
            switch(r8) {
                case 0: goto L270;
                case 1: goto L177;
                case 2: goto L169;
                case 3: goto Lb4;
                case 4: goto L55;
                default: goto L11;
            }
        L11:
            r0 = r23
            io.github.libxposed.api.XposedInterface$Chain r0 = (io.github.libxposed.api.XposedInterface.Chain) r0
            a.C0193i9.e(r0, r5)
            java.lang.Object r2 = r0.proceed()
            a.x8 r3 = a.C0460x8.f762a
            boolean r3 = a.C0460x8.a()
            if (r3 != 0) goto L25
            goto L54
        L25:
            java.lang.Object r0 = r0.getThisObject()     // Catch: java.lang.Throwable -> L38
            java.lang.String r3 = "getArguments"
            java.lang.Object[] r5 = new java.lang.Object[r6]     // Catch: java.lang.Throwable -> L38
            java.lang.Object r0 = a.A1.a(r0, r3, r5)     // Catch: java.lang.Throwable -> L38
            boolean r3 = r0 instanceof android.os.Bundle     // Catch: java.lang.Throwable -> L38
            if (r3 == 0) goto L3b
            android.os.Bundle r0 = (android.os.Bundle) r0     // Catch: java.lang.Throwable -> L38
            goto L3c
        L38:
            r0 = move-exception
            r4 = 0
            goto L4a
        L3b:
            r0 = 0
        L3c:
            if (r0 == 0) goto L45
            java.lang.String r3 = "Chat_User"
            java.lang.String r4 = r0.getString(r3)     // Catch: java.lang.Throwable -> L38
            goto L46
        L45:
            r4 = 0
        L46:
            a.Wf r0 = a.Wf.f330a     // Catch: java.lang.Throwable -> L49
            goto L4d
        L49:
            r0 = move-exception
        L4a:
            a.C0465xd.a(r0)
        L4d:
            a.s4 r0 = r1.b
            java.lang.String r3 = "onActivityCreated"
            r0.i(r4, r3)
        L54:
            return r2
        L55:
            r0 = r23
            io.github.libxposed.api.XposedInterface$Chain r0 = (io.github.libxposed.api.XposedInterface.Chain) r0
            a.C0193i9.e(r0, r5)
            java.lang.Object r2 = r0.proceed()
            java.lang.Object r0 = r0.getThisObject()
            if (r0 != 0) goto L67
            goto Lb3
        L67:
            long r3 = java.lang.System.currentTimeMillis()
            a.s4 r5 = r1.b
            java.util.concurrent.ConcurrentHashMap<java.lang.Object, java.lang.Long> r6 = r5.q
            java.lang.Object r6 = r6.get(r0)
            java.lang.Long r6 = (java.lang.Long) r6
            r7 = 0
            if (r6 == 0) goto L7e
            long r9 = r6.longValue()
            goto L7f
        L7e:
            r9 = r7
        L7f:
            long r9 = r3 - r9
            r11 = 50
            int r6 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r6 <= 0) goto Lb3
            java.util.concurrent.ConcurrentHashMap<java.lang.Object, java.lang.Long> r6 = r5.r
            java.lang.Object r6 = r6.get(r0)
            java.lang.Long r6 = (java.lang.Long) r6
            if (r6 == 0) goto L95
            long r7 = r6.longValue()
        L95:
            long r6 = r3 - r7
            r8 = 200(0xc8, double:9.9E-322)
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 >= 0) goto L9e
            goto Lb3
        L9e:
            java.util.Map<java.lang.Object, java.lang.String> r6 = r5.w
            r6.clear()
            java.util.concurrent.ConcurrentHashMap<java.lang.Object, java.lang.Boolean> r6 = r5.n
            java.lang.Boolean r7 = java.lang.Boolean.TRUE
            r6.put(r0, r7)
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            java.util.concurrent.ConcurrentHashMap<java.lang.Object, java.lang.Long> r4 = r5.q
            r4.put(r0, r3)
        Lb3:
            return r2
        Lb4:
            r0 = r23
            io.github.libxposed.api.XposedInterface$Chain r0 = (io.github.libxposed.api.XposedInterface.Chain) r0
            a.C0193i9.e(r0, r5)
            a.s4 r2 = r1.b
            a.K3$a r3 = a.K3.f148a
            r3.getClass()
            a.jc r3 = a.K3.a.i()
            boolean r5 = r3.n
            if (r5 == 0) goto L164
            boolean r5 = a.K3.a.l()
            if (r5 != 0) goto Ld2
            goto L164
        Ld2:
            java.lang.ThreadLocal<java.lang.Boolean> r5 = r2.v
            java.lang.Object r5 = r5.get()
            java.lang.Boolean r7 = java.lang.Boolean.TRUE
            boolean r5 = a.C0193i9.a(r5, r7)
            if (r5 != 0) goto L15f
            a.x8 r5 = a.C0460x8.f762a
            boolean r5 = a.C0460x8.a()
            if (r5 != 0) goto L15f
            java.util.ArrayList r5 = a.K3.a.f()
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto Lf4
            goto L15f
        Lf4:
            java.lang.Object r5 = r0.getThisObject()
            if (r5 != 0) goto L100
            java.lang.Object r0 = r0.proceed()
            goto L168
        L100:
            int r3 = r2.g(r5, r3)
            if (r3 != 0) goto L10b
            java.lang.Object r0 = r0.proceed()
            goto L168
        L10b:
            java.util.concurrent.ConcurrentHashMap<java.lang.Object, int[]> r3 = r2.m
            java.lang.Object r3 = r3.get(r5)
            int[] r3 = (int[]) r3
            if (r3 != 0) goto L11a
            java.lang.Object r0 = r0.proceed()
            goto L168
        L11a:
            java.util.concurrent.ConcurrentHashMap<java.lang.Object, java.lang.Integer> r2 = r2.o
            java.lang.Object r2 = r2.get(r5)
            java.lang.Integer r2 = (java.lang.Integer) r2
            if (r2 == 0) goto L129
            int r2 = r2.intValue()
            goto L12a
        L129:
            int r2 = r3.length
        L12a:
            java.util.List r5 = r0.getArgs()
            java.lang.Object r5 = r5.get(r6)
            boolean r6 = r5 instanceof java.lang.Integer
            if (r6 == 0) goto L13a
            r4 = r5
            java.lang.Integer r4 = (java.lang.Integer) r4
            goto L13b
        L13a:
            r4 = 0
        L13b:
            if (r4 == 0) goto L15a
            int r4 = r4.intValue()
            if (r4 < 0) goto L155
            if (r4 < r2) goto L146
            goto L155
        L146:
            r2 = r3[r4]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Integer[] r2 = new java.lang.Integer[]{r2}
            java.lang.Object r0 = r0.proceed(r2)
            goto L168
        L155:
            java.lang.Object r0 = r0.proceed()
            goto L168
        L15a:
            java.lang.Object r0 = r0.proceed()
            goto L168
        L15f:
            java.lang.Object r0 = r0.proceed()
            goto L168
        L164:
            java.lang.Object r0 = r0.proceed()
        L168:
            return r0
        L169:
            r0 = r23
            io.github.libxposed.api.XposedInterface$Chain r0 = (io.github.libxposed.api.XposedInterface.Chain) r0
            a.C0193i9.e(r0, r5)
            a.s4 r2 = r1.b
            java.lang.Object r0 = r2.b(r0)
            return r0
        L177:
            a.s4 r5 = r1.b
            r8 = r23
            io.github.libxposed.api.XposedInterface$Chain r8 = (io.github.libxposed.api.XposedInterface.Chain) r8
            java.lang.String r9 = "chain3"
            a.C0193i9.e(r8, r9)
            int r9 = r5.y
            r10 = 5
            java.lang.String r11 = "getArgs(...)"
            r12 = 2
            if (r9 >= r10) goto L1c4
            int r9 = r9 + r7
            r5.y = r9
            java.util.List r7 = r8.getArgs()
            java.lang.Object r7 = r7.get(r6)
            java.util.List r9 = r8.getArgs()
            a.C0193i9.d(r9, r11)
            java.lang.Object r9 = a.C0383t3.o0(r9, r12)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r13 = "DIAG fh5.w0.i CALLED: arg0="
            r10.<init>(r13)
            r10.append(r7)
            java.lang.String r7 = " arg2="
            r10.append(r7)
            r10.append(r9)
            java.lang.String r7 = r10.toString()
            a.C0193i9.e(r7, r2)
            java.lang.String r7 = r3.concat(r7)
            java.lang.Object[] r7 = new java.lang.Object[]{r7}
            a.C0453x1.b(r7)
        L1c4:
            a.K3$a r7 = a.K3.f148a
            r7.getClass()
            boolean r7 = a.K3.a.l()
            if (r7 == 0) goto L26b
            a.jc r7 = a.K3.a.i()
            boolean r7 = r7.n
            if (r7 != 0) goto L1d9
            goto L26b
        L1d9:
            a.x8 r7 = a.C0460x8.f762a
            boolean r7 = a.C0460x8.a()
            if (r7 != 0) goto L266
            boolean r7 = a.C0435w1.q
            if (r7 == 0) goto L1e7
            goto L266
        L1e7:
            java.util.List r7 = r8.getArgs()
            a.C0193i9.d(r7, r11)
            java.lang.Object r7 = a.C0383t3.o0(r7, r12)
            boolean r9 = r7 instanceof java.lang.String
            if (r9 == 0) goto L1f9
            java.lang.String r7 = (java.lang.String) r7
            goto L1fa
        L1f9:
            r7 = 0
        L1fa:
            if (r7 == 0) goto L234
            java.lang.String r9 = "wxid_"
            boolean r6 = a.Ae.H(r7, r9, r6)
            if (r6 == 0) goto L234
            java.util.concurrent.ExecutorService r6 = a.fh.G
            boolean r6 = a.fh.a.a(r7)
            if (r6 == 0) goto L234
            int r5 = r5.y
            if (r5 >= r0) goto L234
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r5 = "DIAG W0-I MASKED HIT: "
            r0.<init>(r5)
            r0.append(r7)
            java.lang.String r5 = " containChatUser="
            r0.append(r5)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            a.C0193i9.e(r0, r2)
            java.lang.String r0 = r3.concat(r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            a.C0453x1.b(r0)
        L234:
            if (r7 == 0) goto L261
            java.util.concurrent.ExecutorService r0 = a.fh.G
            boolean r0 = a.fh.a.a(r7)
            if (r0 == 0) goto L261
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r5 = "W0-I-BLOCK: "
            r0.<init>(r5)
            r0.append(r7)
            java.lang.String r5 = " event blocked at entry"
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            a.C0193i9.e(r0, r2)
            java.lang.String r0 = r3.concat(r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            a.C0453x1.b(r0)
            r4 = 0
            goto L26f
        L261:
            java.lang.Object r4 = r8.proceed()
            goto L26f
        L266:
            java.lang.Object r4 = r8.proceed()
            goto L26f
        L26b:
            java.lang.Object r4 = r8.proceed()
        L26f:
            return r4
        L270:
            a.s4 r5 = r1.b
            r8 = r23
            io.github.libxposed.api.XposedInterface$Chain r8 = (io.github.libxposed.api.XposedInterface.Chain) r8
            java.lang.String r9 = "chain2"
            a.C0193i9.e(r8, r9)
            a.K3$a r9 = a.K3.f148a
            r9.getClass()
            boolean r9 = a.K3.a.l()
            if (r9 == 0) goto L4ad
            a.jc r9 = a.K3.a.i()
            boolean r9 = r9.n
            if (r9 != 0) goto L290
            goto L4ad
        L290:
            a.x8 r9 = a.C0460x8.f762a
            boolean r9 = a.C0460x8.a()
            if (r9 != 0) goto L4a8
            boolean r9 = a.C0435w1.q
            if (r9 == 0) goto L29e
            goto L4a8
        L29e:
            java.util.ArrayList r9 = a.K3.a.f()
            boolean r10 = r9.isEmpty()
            if (r10 == 0) goto L2ae
            java.lang.Object r0 = r8.proceed()
            goto L4b1
        L2ae:
            java.util.ArrayList r10 = new java.util.ArrayList
            int r0 = a.C0312p3.g0(r9, r0)
            r10.<init>(r0)
            java.util.Iterator r0 = r9.iterator()
        L2bb:
            boolean r9 = r0.hasNext()
            if (r9 == 0) goto L2cf
            java.lang.Object r9 = r0.next()
            top.mmjz.floatingclouds.bean.MaskItemBean r9 = (top.mmjz.floatingclouds.bean.MaskItemBean) r9
            java.lang.String r9 = r9.getMaskId()
            r10.add(r9)
            goto L2bb
        L2cf:
            java.util.HashSet r9 = new java.util.HashSet
            r9.<init>(r10)
            java.util.List r0 = r8.getArgs()
            java.lang.Object r0 = r0.get(r6)
            boolean r10 = r0 instanceof java.util.List
            if (r10 == 0) goto L2e4
            java.util.List r0 = (java.util.List) r0
            r10 = r0
            goto L2e5
        L2e4:
            r10 = 0
        L2e5:
            if (r10 != 0) goto L2ed
            java.lang.Object r0 = r8.proceed()
            goto L4b1
        L2ed:
            boolean r0 = r10.isEmpty()
            if (r0 == 0) goto L2f9
            java.lang.Object r0 = r8.proceed()
            goto L4b1
        L2f9:
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.Iterator r12 = r10.iterator()
        L302:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L461
            java.lang.Object r13 = r12.next()
            if (r13 != 0) goto L312
            r16 = r6
            goto L45d
        L312:
            r5.getClass()
            java.lang.Class<java.lang.String> r14 = java.lang.String.class
            java.lang.Class r0 = r13.getClass()     // Catch: java.lang.Throwable -> L43f
            r15 = r0
            r16 = r6
        L31e:
            if (r15 == 0) goto L43d
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            boolean r0 = r15.equals(r0)     // Catch: java.lang.Throwable -> L3b2
            if (r0 != 0) goto L43d
            r0 = 3
            if (r6 >= r0) goto L43d
            java.lang.reflect.Field[] r0 = r15.getDeclaredFields()     // Catch: java.lang.Throwable -> L3b2
            a.G1 r17 = a.C0435w1.I(r0)     // Catch: java.lang.Throwable -> L3b2
        L333:
            boolean r0 = r17.hasNext()     // Catch: java.lang.Throwable -> L3b2
            if (r0 == 0) goto L430
            java.lang.Object r0 = r17.next()     // Catch: java.lang.Throwable -> L3b2
            java.lang.reflect.Field r0 = (java.lang.reflect.Field) r0     // Catch: java.lang.Throwable -> L3b2
            int r18 = r0.getModifiers()     // Catch: java.lang.Throwable -> L3b2
            boolean r18 = java.lang.reflect.Modifier.isStatic(r18)     // Catch: java.lang.Throwable -> L3b2
            if (r18 != 0) goto L42c
            java.lang.Class r18 = r0.getType()     // Catch: java.lang.Throwable -> L3b2
            boolean r18 = r18.isPrimitive()     // Catch: java.lang.Throwable -> L3b2
            if (r18 != 0) goto L42c
            java.lang.Class r4 = r0.getType()     // Catch: java.lang.Throwable -> L3b2
            boolean r4 = a.C0193i9.a(r4, r14)     // Catch: java.lang.Throwable -> L3b2
            if (r4 == 0) goto L35e
            goto L333
        L35e:
            r0.setAccessible(r7)     // Catch: java.lang.Throwable -> L3b2
            java.lang.Object r0 = r0.get(r13)     // Catch: java.lang.Throwable -> L366
            goto L36b
        L366:
            r0 = move-exception
            a.wd$a r0 = a.C0465xd.a(r0)     // Catch: java.lang.Throwable -> L3b2
        L36b:
            boolean r4 = r0 instanceof a.C0447wd.a     // Catch: java.lang.Throwable -> L3b2
            if (r4 == 0) goto L370
            r0 = 0
        L370:
            if (r0 != 0) goto L373
            goto L333
        L373:
            java.lang.Class r4 = r0.getClass()     // Catch: java.lang.Throwable -> L3b2
            java.lang.reflect.Method[] r4 = r4.getMethods()     // Catch: java.lang.Throwable -> L3b2
            r19 = r7
            java.lang.String r7 = "getMethods(...)"
            a.C0193i9.d(r4, r7)     // Catch: java.lang.Throwable -> L3b2
            int r7 = r4.length     // Catch: java.lang.Throwable -> L3b2
            r1 = r16
        L385:
            if (r1 >= r7) goto L3ba
            r20 = r4[r1]     // Catch: java.lang.Throwable -> L3b2
            r23 = r1
            java.lang.String r1 = r20.getName()     // Catch: java.lang.Throwable -> L3b2
            r21 = r4
            java.lang.String r4 = "i1"
            boolean r1 = a.C0193i9.a(r1, r4)     // Catch: java.lang.Throwable -> L3b2
            if (r1 == 0) goto L3b5
            java.lang.Class[] r1 = r20.getParameterTypes()     // Catch: java.lang.Throwable -> L3b2
            java.lang.String r4 = "getParameterTypes(...)"
            a.C0193i9.d(r1, r4)     // Catch: java.lang.Throwable -> L3b2
            int r1 = r1.length     // Catch: java.lang.Throwable -> L3b2
            if (r1 != 0) goto L3b5
            java.lang.Class r1 = r20.getReturnType()     // Catch: java.lang.Throwable -> L3b2
            boolean r1 = a.C0193i9.a(r1, r14)     // Catch: java.lang.Throwable -> L3b2
            if (r1 == 0) goto L3b5
            r1 = r20
            goto L3bb
        L3b2:
            r0 = move-exception
            goto L442
        L3b5:
            int r1 = r23 + 1
            r4 = r21
            goto L385
        L3ba:
            r1 = 0
        L3bb:
            if (r1 == 0) goto L3dc
            r4 = r19
            r1.setAccessible(r4)     // Catch: java.lang.Throwable -> L3d8
            r4 = 0
            java.lang.Object r1 = r1.invoke(r0, r4)     // Catch: java.lang.Throwable -> L3b2
            boolean r7 = r1 instanceof java.lang.String     // Catch: java.lang.Throwable -> L3b2
            if (r7 == 0) goto L3ce
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L3b2
            goto L3cf
        L3ce:
            r1 = r4
        L3cf:
            if (r1 == 0) goto L3dd
            boolean r7 = a.Be.P(r1)     // Catch: java.lang.Throwable -> L3b2
            if (r7 == 0) goto L446
            goto L3dd
        L3d8:
            r0 = move-exception
            r4 = 0
            goto L442
        L3dc:
            r4 = 0
        L3dd:
            java.lang.Class r1 = r0.getClass()     // Catch: java.lang.Throwable -> L3b2
            java.lang.reflect.Field[] r1 = r1.getDeclaredFields()     // Catch: java.lang.Throwable -> L3b2
            java.lang.String r7 = "getDeclaredFields(...)"
            a.C0193i9.d(r1, r7)     // Catch: java.lang.Throwable -> L3b2
            int r7 = r1.length     // Catch: java.lang.Throwable -> L3b2
            r4 = r16
        L3ed:
            if (r4 >= r7) goto L40b
            r20 = r1[r4]     // Catch: java.lang.Throwable -> L3b2
            r23 = r1
            java.lang.String r1 = r20.getName()     // Catch: java.lang.Throwable -> L3b2
            r21 = r4
            java.lang.String r4 = "field_username"
            boolean r1 = a.C0193i9.a(r1, r4)     // Catch: java.lang.Throwable -> L3b2
            if (r1 == 0) goto L404
            r1 = r20
            goto L40c
        L404:
            r19 = 1
            int r4 = r21 + 1
            r1 = r23
            goto L3ed
        L40b:
            r1 = 0
        L40c:
            if (r1 == 0) goto L427
            r4 = 1
            r1.setAccessible(r4)     // Catch: java.lang.Throwable -> L3b2
            java.lang.Object r0 = r1.get(r0)     // Catch: java.lang.Throwable -> L3b2
            boolean r1 = r0 instanceof java.lang.String     // Catch: java.lang.Throwable -> L3b2
            if (r1 == 0) goto L41e
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L3b2
            r1 = r0
            goto L41f
        L41e:
            r1 = 0
        L41f:
            if (r1 == 0) goto L427
            boolean r0 = a.Be.P(r1)     // Catch: java.lang.Throwable -> L3b2
            if (r0 == 0) goto L446
        L427:
            r1 = r22
            r7 = 1
            goto L333
        L42c:
            r1 = r22
            goto L333
        L430:
            java.lang.Class r15 = r15.getSuperclass()     // Catch: java.lang.Throwable -> L3b2
            r19 = 1
            int r6 = r6 + 1
            r1 = r22
            r7 = 1
            goto L31e
        L43d:
            r1 = 0
            goto L446
        L43f:
            r0 = move-exception
            r16 = r6
        L442:
            a.wd$a r1 = a.C0465xd.a(r0)
        L446:
            boolean r0 = r1 instanceof a.C0447wd.a
            if (r0 == 0) goto L44b
            r1 = 0
        L44b:
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L45d
            boolean r0 = r9.contains(r1)
            if (r0 != 0) goto L456
            goto L45d
        L456:
            r1 = r22
            r6 = r16
            r7 = 1
            goto L302
        L45d:
            r11.add(r13)
            goto L456
        L461:
            r16 = r6
            int r0 = r11.size()
            int r1 = r10.size()
            if (r0 >= r1) goto L4a3
            int r0 = r10.size()
            int r1 = r11.size()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "fh5.a FILTER: "
            r4.<init>(r5)
            r4.append(r0)
            java.lang.String r0 = " -> "
            r4.append(r0)
            r4.append(r1)
            java.lang.String r0 = r4.toString()
            a.C0193i9.e(r0, r2)
            java.lang.String r0 = r3.concat(r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            a.C0453x1.b(r0)
            r4 = 1
            java.util.List[] r0 = new java.util.List[r4]
            r0[r16] = r11
            java.lang.Object r0 = r8.proceed(r0)
            goto L4b1
        L4a3:
            java.lang.Object r0 = r8.proceed()
            goto L4b1
        L4a8:
            java.lang.Object r0 = r8.proceed()
            goto L4b1
        L4ad:
            java.lang.Object r0 = r8.proceed()
        L4b1:
            return r0
    }
}
