package a;

/* JADX INFO: renamed from: a.l4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0241l4 implements a.D7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f555a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;

    public /* synthetic */ C0241l4(java.lang.Object r1, int r2, java.lang.Object r3) {
            r0 = this;
            r0.f555a = r2
            r0.b = r1
            r0.c = r3
            r0.<init>()
            return
    }

    @Override // a.D7
    public final java.lang.Object f(java.lang.Object r23) {
            r22 = this;
            r1 = r22
            java.lang.String r0 = "getMethods(...)"
            r2 = 0
            java.lang.String r4 = "chain"
            r5 = 1
            int r6 = r1.f555a
            switch(r6) {
                case 0: goto L251;
                case 1: goto L207;
                case 2: goto L142;
                case 3: goto L105;
                case 4: goto L7d;
                case 5: goto L41;
                default: goto Ld;
            }
        Ld:
            java.lang.Object r0 = r1.b
            a.va r0 = (a.C0426va) r0
            java.lang.Object r2 = r1.c
            java.lang.ClassLoader r2 = (java.lang.ClassLoader) r2
            r3 = r23
            io.github.libxposed.api.XposedInterface$Chain r3 = (io.github.libxposed.api.XposedInterface.Chain) r3
            a.C0193i9.e(r3, r4)
            java.util.List r4 = r3.getArgs()     // Catch: java.lang.Throwable -> L2d
            java.lang.String r5 = "getArgs(...)"
            a.C0193i9.d(r4, r5)     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r4 = a.C0383t3.n0(r4)     // Catch: java.lang.Throwable -> L2d
            r0.b(r4, r2)     // Catch: java.lang.Throwable -> L2d
            goto L3c
        L2d:
            r0 = move-exception
            java.lang.String r2 = "[MaskedMsgVibrate] onMessageInserted fail"
            java.lang.Object[] r0 = new java.lang.Object[]{r2, r0}
            r2 = 2
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r2)
            a.C0453x1.a(r0)
        L3c:
            java.lang.Object r0 = r3.proceed()
            return r0
        L41:
            r0 = r23
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            java.lang.Object r2 = r1.b
            a.X9 r2 = (a.X9) r2
            r2.getClass()
            org.json.JSONObject r3 = new org.json.JSONObject
            java.lang.Object r4 = r1.c
            a.jc r4 = (a.C0213jc) r4
            java.lang.String r4 = a.C0213jc.a.b(r4)
            r3.<init>(r4)
            java.lang.String r4 = "hideMaskedMessageNotification"
            r3.put(r4, r0)
            java.lang.String r0 = r3.toString()
            java.lang.String r3 = "toString(...)"
            a.C0193i9.d(r0, r3)
            a.jc r0 = a.C0213jc.a.a(r0)
            a.K3$a r3 = a.K3.f148a
            r3.getClass()
            a.K3.a.t(r0)
            r2.F()
            a.Wf r0 = a.Wf.f330a
            return r0
        L7d:
            java.lang.Object r0 = r1.c
            r2 = r0
            java.lang.String r2 = (java.lang.String) r2
            r0 = r23
            io.github.libxposed.api.XposedInterface$Chain r0 = (io.github.libxposed.api.XposedInterface.Chain) r0
            java.lang.String r6 = "HideTextStatus: ["
            a.C0193i9.e(r0, r4)
            java.lang.Object r4 = r0.proceed()
            java.lang.Object r0 = r1.b
            a.D8 r0 = (a.D8) r0
            r0.getClass()
            boolean r0 = a.D8.i()
            if (r0 != 0) goto L9d
            goto L104
        L9d:
            java.util.HashSet r0 = a.D8.f()     // Catch: java.lang.Throwable -> Lb0
            boolean r7 = r0.isEmpty()     // Catch: java.lang.Throwable -> Lb0
            if (r7 == 0) goto La8
            goto L104
        La8:
            boolean r7 = r4 instanceof java.util.ArrayList     // Catch: java.lang.Throwable -> Lb0
            if (r7 == 0) goto Lb2
            r3 = r4
            java.util.ArrayList r3 = (java.util.ArrayList) r3     // Catch: java.lang.Throwable -> Lb0
            goto Lb3
        Lb0:
            r0 = move-exception
            goto Le1
        Lb2:
            r3 = 0
        Lb3:
            if (r3 != 0) goto Lb6
            goto L104
        Lb6:
            int r0 = a.D8.b(r3, r0)     // Catch: java.lang.Throwable -> Lb0
            if (r0 <= 0) goto L104
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb0
            r3.<init>(r6)     // Catch: java.lang.Throwable -> Lb0
            r3.append(r2)     // Catch: java.lang.Throwable -> Lb0
            java.lang.String r7 = "] filtered "
            r3.append(r7)     // Catch: java.lang.Throwable -> Lb0
            r3.append(r0)     // Catch: java.lang.Throwable -> Lb0
            java.lang.String r0 = " masked cards from R6 output"
            r3.append(r0)     // Catch: java.lang.Throwable -> Lb0
            java.lang.String r0 = r3.toString()     // Catch: java.lang.Throwable -> Lb0
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch: java.lang.Throwable -> Lb0
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r5)     // Catch: java.lang.Throwable -> Lb0
            a.C0453x1.b(r0)     // Catch: java.lang.Throwable -> Lb0
            goto L104
        Le1:
            java.lang.String r0 = r0.getMessage()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r6)
            r3.append(r2)
            java.lang.String r2 = "] filter output error (safe skip): "
            r3.append(r2)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r5)
            a.C0453x1.a(r0)
        L104:
            return r4
        L105:
            r0 = r23
            io.github.libxposed.api.XposedInterface$Chain r0 = (io.github.libxposed.api.XposedInterface.Chain) r0
            a.C0193i9.e(r0, r4)
            java.lang.Object r4 = r0.proceed()
            java.lang.Object r5 = r1.b
            a.A8 r5 = (a.A8) r5
            a.K3$a r6 = a.K3.f148a
            r6.getClass()
            boolean r6 = a.K3.a.l()
            if (r6 == 0) goto L141
            a.jc r6 = a.K3.a.i()
            boolean r6 = r6.d
            if (r6 == 0) goto L141
            java.lang.Object r0 = r0.getThisObject()
            boolean r6 = r0 instanceof android.app.Activity
            if (r6 == 0) goto L133
            r3 = r0
            android.app.Activity r3 = (android.app.Activity) r3
            goto L134
        L133:
            r3 = 0
        L134:
            if (r3 == 0) goto L141
            java.lang.Object r0 = r1.c
            boolean r0 = a.A8.c(r3, r0)
            if (r0 != 0) goto L141
            r5.d(r3, r2)
        L141:
            return r4
        L142:
            java.lang.Object r6 = r1.c
            java.lang.Class r6 = (java.lang.Class) r6
            r7 = r23
            io.github.libxposed.api.XposedInterface$Chain r7 = (io.github.libxposed.api.XposedInterface.Chain) r7
            a.C0193i9.e(r7, r4)
            java.lang.Object r4 = r7.proceed()
            java.lang.Object r8 = r1.b
            a.r8 r8 = (a.C0352r8) r8
            a.K3$a r9 = a.K3.f148a
            r9.getClass()
            boolean r9 = a.K3.a.l()
            if (r9 == 0) goto L206
            a.jc r9 = a.K3.a.i()
            boolean r9 = r9.f532a
            if (r9 == 0) goto L206
            java.util.List r9 = r7.getArgs()
            java.lang.Object r9 = r9.get(r2)
            boolean r10 = r9 instanceof java.lang.Integer
            if (r10 == 0) goto L177
            java.lang.Integer r9 = (java.lang.Integer) r9
            goto L178
        L177:
            r9 = 0
        L178:
            if (r9 == 0) goto L206
            int r10 = r9.intValue()
            boolean r11 = r4 instanceof android.view.View
            if (r11 == 0) goto L186
            r11 = r4
            android.view.View r11 = (android.view.View) r11
            goto L187
        L186:
            r11 = 0
        L187:
            if (r11 != 0) goto L18b
            goto L206
        L18b:
            java.lang.reflect.Method[] r6 = r6.getMethods()     // Catch: java.lang.Throwable -> L1ba
            a.C0193i9.d(r6, r0)     // Catch: java.lang.Throwable -> L1ba
            int r0 = r6.length     // Catch: java.lang.Throwable -> L1ba
            r12 = r2
        L194:
            if (r12 >= r0) goto L1be
            r13 = r6[r12]     // Catch: java.lang.Throwable -> L1ba
            java.lang.String r14 = r13.getName()     // Catch: java.lang.Throwable -> L1ba
            java.lang.String r15 = "getItem"
            boolean r14 = a.C0193i9.a(r14, r15)     // Catch: java.lang.Throwable -> L1ba
            if (r14 == 0) goto L1bc
            java.lang.Class[] r14 = r13.getParameterTypes()     // Catch: java.lang.Throwable -> L1ba
            int r14 = r14.length     // Catch: java.lang.Throwable -> L1ba
            if (r14 != r5) goto L1bc
            java.lang.Class[] r14 = r13.getParameterTypes()     // Catch: java.lang.Throwable -> L1ba
            r14 = r14[r2]     // Catch: java.lang.Throwable -> L1ba
            java.lang.Class r15 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> L1ba
            boolean r14 = a.C0193i9.a(r14, r15)     // Catch: java.lang.Throwable -> L1ba
            if (r14 == 0) goto L1bc
            goto L1bf
        L1ba:
            r0 = move-exception
            goto L1d0
        L1bc:
            int r12 = r12 + r5
            goto L194
        L1be:
            r13 = 0
        L1bf:
            if (r13 == 0) goto L1ce
            java.lang.Object r0 = r7.getThisObject()     // Catch: java.lang.Throwable -> L1ba
            java.lang.Object[] r5 = new java.lang.Object[]{r9}     // Catch: java.lang.Throwable -> L1ba
            java.lang.Object r0 = r13.invoke(r0, r5)     // Catch: java.lang.Throwable -> L1ba
            goto L1d4
        L1ce:
            r0 = 0
            goto L1d4
        L1d0:
            a.wd$a r0 = a.C0465xd.a(r0)
        L1d4:
            boolean r5 = r0 instanceof a.C0447wd.a
            if (r5 == 0) goto L1da
            r3 = 0
            goto L1db
        L1da:
            r3 = r0
        L1db:
            if (r3 != 0) goto L1de
            goto L206
        L1de:
            boolean r0 = r8.b(r3)
            if (r0 == 0) goto L206
            r0 = 8
            r11.setVisibility(r0)
            android.widget.AbsListView$LayoutParams r0 = new android.widget.AbsListView$LayoutParams
            r0.<init>(r2, r2)
            r11.setLayoutParams(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "HideSearchList: hidden search result at position "
            r0.<init>(r2)
            r0.append(r10)
            java.lang.String r0 = r0.toString()
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            a.C0282n9.m(r0)
        L206:
            return r4
        L207:
            java.lang.Object r0 = r1.b
            a.q8 r0 = (a.C0335q8) r0
            java.lang.Object r2 = r1.c
            java.lang.String r2 = (java.lang.String) r2
            r5 = r23
            io.github.libxposed.api.XposedInterface$Chain r5 = (io.github.libxposed.api.XposedInterface.Chain) r5
            java.lang.String r6 = "[RecentForward] provider."
            a.C0193i9.e(r5, r4)
            java.lang.Object r4 = r5.proceed()
            boolean r5 = a.C0335q8.j()     // Catch: java.lang.Exception -> L250
            if (r5 != 0) goto L223
            goto L250
        L223:
            boolean r5 = a.Kf.b(r4)     // Catch: java.lang.Exception -> L250
            if (r5 == 0) goto L22d
            r3 = r4
            java.util.List r3 = (java.util.List) r3     // Catch: java.lang.Exception -> L250
            goto L22e
        L22d:
            r3 = 0
        L22e:
            if (r3 != 0) goto L231
            goto L250
        L231:
            int r0 = r0.g(r3)     // Catch: java.lang.Exception -> L250
            if (r0 <= 0) goto L250
            java.lang.String r3 = "MyPlugin-DexKit"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L250
            r5.<init>(r6)     // Catch: java.lang.Exception -> L250
            r5.append(r2)     // Catch: java.lang.Exception -> L250
            java.lang.String r2 = " filtered "
            r5.append(r2)     // Catch: java.lang.Exception -> L250
            r5.append(r0)     // Catch: java.lang.Exception -> L250
            java.lang.String r0 = r5.toString()     // Catch: java.lang.Exception -> L250
            android.util.Log.i(r3, r0)     // Catch: java.lang.Exception -> L250
        L250:
            return r4
        L251:
            java.lang.Object r6 = r1.b
            java.lang.reflect.Method r6 = (java.lang.reflect.Method) r6
            java.lang.Object r7 = r1.c
            a.s4 r7 = (a.C0366s4) r7
            r8 = r23
            io.github.libxposed.api.XposedInterface$Chain r8 = (io.github.libxposed.api.XposedInterface.Chain) r8
            java.lang.String r9 = "EVENT-FILTER: "
            a.C0193i9.e(r8, r4)
            java.lang.Object r4 = r8.getThisObject()
            if (r4 == 0) goto L26b
            a.C0435w1.c(r4, r6)
        L26b:
            java.util.List r4 = r8.getArgs()
            java.lang.Object r4 = r4.get(r5)
            boolean r6 = r4 instanceof java.lang.String
            if (r6 == 0) goto L27a
            java.lang.String r4 = (java.lang.String) r4
            goto L27b
        L27a:
            r4 = 0
        L27b:
            int r6 = r7.x
            java.lang.String r10 = "] "
            java.lang.String r11 = "["
            java.lang.String r12 = "ConvRV"
            java.lang.String r13 = "[ConvRV] "
            r14 = 5
            java.lang.String r15 = "msg"
            if (r6 >= r14) goto L2cf
            int r6 = r6 + r5
            r7.x = r6
            java.util.List r6 = r8.getArgs()
            java.lang.Object r6 = r6.get(r2)
            java.lang.Object r7 = a.C0435w1.r
            if (r7 == 0) goto L29f
            java.lang.reflect.Method r7 = a.C0435w1.s
            if (r7 == 0) goto L29f
            r7 = r5
            goto L2a0
        L29f:
            r7 = r2
        L2a0:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r16 = r2
            java.lang.String r2 = "DIAG fh5.w.k CALLED: type="
            r14.<init>(r2)
            r14.append(r6)
            java.lang.String r2 = " username="
            r14.append(r2)
            r14.append(r4)
            java.lang.String r2 = " dsReady="
            r14.append(r2)
            r14.append(r7)
            java.lang.String r2 = r14.toString()
            a.C0193i9.e(r2, r15)
            java.lang.String r2 = r13.concat(r2)
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            a.C0453x1.b(r2)
            goto L2d1
        L2cf:
            r16 = r2
        L2d1:
            a.K3$a r2 = a.K3.f148a
            r2.getClass()
            boolean r2 = a.K3.a.l()
            if (r2 == 0) goto L443
            a.jc r2 = a.K3.a.i()
            boolean r2 = r2.n
            if (r2 != 0) goto L2e6
            goto L443
        L2e6:
            a.x8 r2 = a.C0460x8.f762a
            boolean r2 = a.C0460x8.a()
            if (r2 != 0) goto L43e
            boolean r2 = a.C0435w1.q
            if (r2 == 0) goto L2f4
            goto L43e
        L2f4:
            if (r4 == 0) goto L439
            java.util.concurrent.ExecutorService r2 = a.fh.G
            boolean r2 = a.fh.a.a(r4)
            if (r2 == 0) goto L439
            java.lang.Object r2 = r8.getThisObject()
            java.lang.Class r6 = r2.getClass()     // Catch: java.lang.Throwable -> L378
            java.lang.reflect.Field[] r6 = r6.getDeclaredFields()     // Catch: java.lang.Throwable -> L378
            java.lang.String r7 = "getDeclaredFields(...)"
            a.C0193i9.d(r6, r7)     // Catch: java.lang.Throwable -> L378
            int r7 = r6.length     // Catch: java.lang.Throwable -> L378
            r8 = r16
        L312:
            java.lang.Class<java.lang.String> r14 = java.lang.String.class
            java.lang.String r3 = "c"
            if (r8 >= r7) goto L391
            r17 = r6[r8]     // Catch: java.lang.Throwable -> L378
            java.lang.String r5 = r17.getName()     // Catch: java.lang.Throwable -> L378
            java.lang.String r1 = "f269481g"
            boolean r1 = a.C0193i9.a(r5, r1)     // Catch: java.lang.Throwable -> L378
            if (r1 != 0) goto L38e
            java.lang.String r1 = r17.getName()     // Catch: java.lang.Throwable -> L378
            java.lang.String r5 = "g"
            boolean r1 = a.C0193i9.a(r1, r5)     // Catch: java.lang.Throwable -> L378
            if (r1 != 0) goto L38e
            int r1 = r17.getModifiers()     // Catch: java.lang.Throwable -> L378
            boolean r1 = java.lang.reflect.Modifier.isStatic(r1)     // Catch: java.lang.Throwable -> L378
            if (r1 != 0) goto L386
            java.lang.Class r1 = r17.getType()     // Catch: java.lang.Throwable -> L378
            java.lang.reflect.Method[] r1 = r1.getDeclaredMethods()     // Catch: java.lang.Throwable -> L378
            java.lang.String r5 = "getDeclaredMethods(...)"
            a.C0193i9.d(r1, r5)     // Catch: java.lang.Throwable -> L378
            int r5 = r1.length     // Catch: java.lang.Throwable -> L378
            r23 = r1
            r1 = r16
        L34e:
            if (r1 >= r5) goto L386
            r19 = r23[r1]     // Catch: java.lang.Throwable -> L378
            r20 = r1
            java.lang.String r1 = r19.getName()     // Catch: java.lang.Throwable -> L378
            boolean r1 = a.C0193i9.a(r1, r3)     // Catch: java.lang.Throwable -> L378
            if (r1 == 0) goto L37e
            java.lang.Class[] r1 = r19.getParameterTypes()     // Catch: java.lang.Throwable -> L378
            int r1 = r1.length     // Catch: java.lang.Throwable -> L378
            r21 = r5
            r5 = 1
            if (r1 != r5) goto L37b
            java.lang.Class[] r1 = r19.getParameterTypes()     // Catch: java.lang.Throwable -> L378
            r1 = r1[r16]     // Catch: java.lang.Throwable -> L378
            boolean r1 = a.C0193i9.a(r1, r14)     // Catch: java.lang.Throwable -> L378
            if (r1 == 0) goto L375
            goto L38e
        L375:
            r18 = 1
            goto L381
        L378:
            r0 = move-exception
            goto L416
        L37b:
            r18 = r5
            goto L381
        L37e:
            r21 = r5
            goto L375
        L381:
            int r1 = r20 + 1
            r5 = r21
            goto L34e
        L386:
            r18 = 1
            int r8 = r8 + 1
            r1 = r22
            r5 = 1
            goto L312
        L38e:
            r1 = r17
            goto L392
        L391:
            r1 = 0
        L392:
            if (r1 == 0) goto L413
            r5 = 1
            r1.setAccessible(r5)     // Catch: java.lang.Throwable -> L378
            java.lang.Object r1 = r1.get(r2)     // Catch: java.lang.Throwable -> L378
            if (r1 == 0) goto L413
            java.lang.Class r2 = r1.getClass()     // Catch: java.lang.Throwable -> L378
            java.lang.reflect.Method[] r2 = r2.getMethods()     // Catch: java.lang.Throwable -> L378
            a.C0193i9.d(r2, r0)     // Catch: java.lang.Throwable -> L378
            int r0 = r2.length     // Catch: java.lang.Throwable -> L378
            r5 = r16
        L3ac:
            if (r5 >= r0) goto L3d3
            r6 = r2[r5]     // Catch: java.lang.Throwable -> L378
            java.lang.String r7 = r6.getName()     // Catch: java.lang.Throwable -> L378
            boolean r7 = a.C0193i9.a(r7, r3)     // Catch: java.lang.Throwable -> L378
            if (r7 == 0) goto L3d0
            java.lang.Class[] r7 = r6.getParameterTypes()     // Catch: java.lang.Throwable -> L378
            int r7 = r7.length     // Catch: java.lang.Throwable -> L378
            r8 = 1
            if (r7 != r8) goto L3d1
            java.lang.Class[] r7 = r6.getParameterTypes()     // Catch: java.lang.Throwable -> L378
            r7 = r7[r16]     // Catch: java.lang.Throwable -> L378
            boolean r7 = a.C0193i9.a(r7, r14)     // Catch: java.lang.Throwable -> L378
            if (r7 == 0) goto L3d0
        L3ce:
            r8 = 1
            goto L3d5
        L3d0:
            r8 = 1
        L3d1:
            int r5 = r5 + r8
            goto L3ac
        L3d3:
            r6 = 0
            goto L3ce
        L3d5:
            if (r6 == 0) goto L413
            r6.setAccessible(r8)     // Catch: java.lang.Throwable -> L378
            java.lang.Object[] r0 = new java.lang.Object[]{r4}     // Catch: java.lang.Throwable -> L378
            r6.invoke(r1, r0)     // Catch: java.lang.Throwable -> L378
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L378
            r0.<init>()     // Catch: java.lang.Throwable -> L378
            r0.append(r9)     // Catch: java.lang.Throwable -> L378
            r0.append(r4)     // Catch: java.lang.Throwable -> L378
            java.lang.String r1 = " forced submitRemove"
            r0.append(r1)     // Catch: java.lang.Throwable -> L378
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L378
            a.C0193i9.e(r0, r15)     // Catch: java.lang.Throwable -> L378
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L378
            r1.<init>(r11)     // Catch: java.lang.Throwable -> L378
            r1.append(r12)     // Catch: java.lang.Throwable -> L378
            r1.append(r10)     // Catch: java.lang.Throwable -> L378
            r1.append(r0)     // Catch: java.lang.Throwable -> L378
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Throwable -> L378
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch: java.lang.Throwable -> L378
            a.C0453x1.b(r0)     // Catch: java.lang.Throwable -> L378
        L411:
            r3 = 0
            goto L447
        L413:
            a.Wf r0 = a.Wf.f330a     // Catch: java.lang.Throwable -> L378
            goto L419
        L416:
            a.C0465xd.a(r0)
        L419:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r9)
            r0.append(r4)
            java.lang.String r1 = " blocked (fallback)"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            a.C0193i9.e(r0, r15)
            java.lang.String r0 = r13.concat(r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            a.C0453x1.b(r0)
            goto L411
        L439:
            java.lang.Object r3 = r8.proceed()
            goto L447
        L43e:
            java.lang.Object r3 = r8.proceed()
            goto L447
        L443:
            java.lang.Object r3 = r8.proceed()
        L447:
            return r3
    }
}
