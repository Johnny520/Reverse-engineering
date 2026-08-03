package a;

/* JADX INFO: renamed from: a.g4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0152g4 implements a.D7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f480a;
    public final /* synthetic */ a.C0366s4 b;
    public final /* synthetic */ a.J8 c;

    public /* synthetic */ C0152g4(a.C0366s4 r1, a.J8 r2, int r3) {
            r0 = this;
            r0.f480a = r3
            r0.b = r1
            r0.c = r2
            r0.<init>()
            return
    }

    @Override // a.D7
    public final java.lang.Object f(java.lang.Object r19) {
            r18 = this;
            r1 = r18
            r2 = 0
            r3 = 0
            java.lang.String r0 = "chain"
            r4 = 1
            int r5 = r1.f480a
            switch(r5) {
                case 0: goto L408;
                case 1: goto L39d;
                default: goto Lc;
            }
        Lc:
            a.s4 r5 = r1.b
            a.J8 r6 = r1.c
            r7 = r19
            io.github.libxposed.api.XposedInterface$Chain r7 = (io.github.libxposed.api.XposedInterface.Chain) r7
            a.C0193i9.e(r7, r0)
            java.util.concurrent.atomic.AtomicBoolean r0 = r5.e
            boolean r0 = r0.get()
            if (r0 != 0) goto L38
            a.K3$a r0 = a.K3.f148a
            r0.getClass()
            boolean r0 = a.K3.a.l()
            if (r0 == 0) goto L32
            a.jc r0 = a.K3.a.i()
            boolean r0 = r0.n
            if (r0 != 0) goto L38
        L32:
            java.lang.Object r0 = r7.proceed()
            goto L39c
        L38:
            a.x8 r0 = a.C0460x8.f762a
            boolean r0 = a.C0460x8.a()
            if (r0 != 0) goto L398
            a.K3$a r0 = a.K3.f148a
            r0.getClass()
            java.util.ArrayList r0 = a.K3.a.f()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L398
            java.lang.ThreadLocal<java.lang.Boolean> r0 = r5.v
            java.lang.Object r0 = r0.get()
            java.lang.Boolean r8 = java.lang.Boolean.TRUE
            boolean r0 = a.C0193i9.a(r0, r8)
            if (r0 == 0) goto L5f
            goto L398
        L5f:
            java.lang.Object r8 = r7.getThisObject()
            if (r8 != 0) goto L6b
            java.lang.Object r0 = r7.proceed()
            goto L39c
        L6b:
            java.util.Set<java.lang.Class<?>> r0 = r5.u
            java.lang.Class r9 = r8.getClass()
            boolean r0 = r0.contains(r9)
            java.lang.String r9 = "getCount"
            if (r0 != 0) goto La2
            boolean r0 = r8 instanceof android.widget.ListAdapter
            if (r0 == 0) goto La2
            java.lang.Class r0 = r8.getClass()     // Catch: java.lang.Throwable -> L9e
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r9, r2)     // Catch: java.lang.Throwable -> L9e
            a.C0193i9.b(r0)     // Catch: java.lang.Throwable -> L9e
            io.github.libxposed.api.XposedInterface$HookBuilder r0 = r6.f(r0)     // Catch: java.lang.Throwable -> L9e
            a.p4 r10 = new a.p4     // Catch: java.lang.Throwable -> L9e
            r10.<init>(r5, r6)     // Catch: java.lang.Throwable -> L9e
            r0.intercept(r10)     // Catch: java.lang.Throwable -> L9e
            java.util.Set<java.lang.Class<?>> r0 = r5.u     // Catch: java.lang.Throwable -> L9e
            java.lang.Class r6 = r8.getClass()     // Catch: java.lang.Throwable -> L9e
            r0.add(r6)     // Catch: java.lang.Throwable -> L9e
            goto La2
        L9e:
            r0 = move-exception
            a.C0465xd.a(r0)
        La2:
            java.util.concurrent.ConcurrentHashMap<java.lang.Object, int[]> r0 = r5.m
            boolean r0 = r0.containsKey(r8)
            if (r0 == 0) goto Lb8
            java.util.concurrent.ConcurrentHashMap<java.lang.Object, java.lang.Boolean> r0 = r5.n
            java.lang.Object r0 = r0.get(r8)
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            boolean r0 = a.C0193i9.a(r0, r6)
            if (r0 == 0) goto L2a5
        Lb8:
            java.lang.ThreadLocal<java.lang.Boolean> r0 = r5.v
            java.lang.Object r0 = r0.get()
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            boolean r0 = a.C0193i9.a(r0, r6)
            if (r0 != 0) goto L2a5
            a.x8 r0 = a.C0460x8.f762a
            boolean r0 = a.C0460x8.a()
            if (r0 == 0) goto Ld0
            goto L2a5
        Ld0:
            java.lang.ThreadLocal<java.lang.Boolean> r0 = r5.v
            r0.set(r6)
            java.lang.Object[] r0 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> Le2
            java.lang.Object r0 = a.A1.a(r8, r9, r0)     // Catch: java.lang.Throwable -> Le2
            boolean r6 = r0 instanceof java.lang.Integer     // Catch: java.lang.Throwable -> Le2
            if (r6 == 0) goto Le4
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch: java.lang.Throwable -> Le2
            goto Lea
        Le2:
            r0 = move-exception
            goto Le6
        Le4:
            r0 = r2
            goto Lea
        Le6:
            a.wd$a r0 = a.C0465xd.a(r0)     // Catch: java.lang.Throwable -> L10f
        Lea:
            boolean r6 = r0 instanceof a.C0447wd.a     // Catch: java.lang.Throwable -> L10f
            if (r6 == 0) goto Lef
            r0 = r2
        Lef:
            r6 = r0
            java.lang.Integer r6 = (java.lang.Integer) r6     // Catch: java.lang.Throwable -> L10f
            if (r6 == 0) goto L298
            int r9 = r6.intValue()     // Catch: java.lang.Throwable -> L10f
            if (r9 > 0) goto L112
            java.util.concurrent.ConcurrentHashMap<java.lang.Object, int[]> r0 = r5.m     // Catch: java.lang.Throwable -> L10f
            int[] r6 = new int[r3]     // Catch: java.lang.Throwable -> L10f
            r0.put(r8, r6)     // Catch: java.lang.Throwable -> L10f
            java.util.concurrent.ConcurrentHashMap<java.lang.Object, java.lang.Boolean> r0 = r5.n     // Catch: java.lang.Throwable -> L10f
            java.lang.Boolean r6 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L10f
            r0.put(r8, r6)     // Catch: java.lang.Throwable -> L10f
            java.lang.ThreadLocal<java.lang.Boolean> r0 = r5.v
            r0.set(r6)
            goto L2a5
        L10f:
            r0 = move-exception
            goto L29d
        L112:
            int[] r10 = new int[r9]     // Catch: java.lang.Throwable -> L10f
            java.lang.reflect.Method r11 = a.C0366s4.Q     // Catch: java.lang.Throwable -> L10f
            a.K3$a r0 = a.K3.f148a     // Catch: java.lang.Throwable -> L10f
            r0.getClass()     // Catch: java.lang.Throwable -> L10f
            java.util.ArrayList r12 = a.K3.a.f()     // Catch: java.lang.Throwable -> L10f
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L10f
            r13 = 10
            int r14 = a.C0312p3.g0(r12, r13)     // Catch: java.lang.Throwable -> L10f
            r0.<init>(r14)     // Catch: java.lang.Throwable -> L10f
            java.util.Iterator r14 = r12.iterator()     // Catch: java.lang.Throwable -> L10f
        L12e:
            boolean r15 = r14.hasNext()     // Catch: java.lang.Throwable -> L10f
            if (r15 == 0) goto L142
            java.lang.Object r15 = r14.next()     // Catch: java.lang.Throwable -> L10f
            top.mmjz.floatingclouds.bean.MaskItemBean r15 = (top.mmjz.floatingclouds.bean.MaskItemBean) r15     // Catch: java.lang.Throwable -> L10f
            java.lang.String r15 = r15.getMaskId()     // Catch: java.lang.Throwable -> L10f
            r0.add(r15)     // Catch: java.lang.Throwable -> L10f
            goto L12e
        L142:
            java.util.HashSet r14 = new java.util.HashSet     // Catch: java.lang.Throwable -> L10f
            r14.<init>(r0)     // Catch: java.lang.Throwable -> L10f
            int r0 = r12.size()     // Catch: java.lang.Throwable -> L10f
            java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L10f
            r15.<init>()     // Catch: java.lang.Throwable -> L10f
            java.lang.String r2 = "[DIAG] rebuildFilterCache: masks="
            r15.append(r2)     // Catch: java.lang.Throwable -> L10f
            r15.append(r0)     // Catch: java.lang.Throwable -> L10f
            java.lang.String r0 = " items="
            r15.append(r0)     // Catch: java.lang.Throwable -> L10f
            r15.append(r9)     // Catch: java.lang.Throwable -> L10f
            java.lang.String r0 = r15.toString()     // Catch: java.lang.Throwable -> L10f
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch: java.lang.Throwable -> L10f
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r4)     // Catch: java.lang.Throwable -> L10f
            a.C0453x1.b(r0)     // Catch: java.lang.Throwable -> L10f
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L10f
            r2.<init>()     // Catch: java.lang.Throwable -> L10f
            r15 = r3
            r16 = r15
        L177:
            java.lang.String r13 = "wxid_"
            if (r15 >= r9) goto L1ee
            if (r11 == 0) goto L195
            java.lang.Integer r0 = java.lang.Integer.valueOf(r15)     // Catch: java.lang.Throwable -> L18a
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch: java.lang.Throwable -> L18a
            java.lang.Object r0 = r11.invoke(r8, r0)     // Catch: java.lang.Throwable -> L18a
            goto L18f
        L18a:
            r0 = move-exception
            a.wd$a r0 = a.C0465xd.a(r0)     // Catch: java.lang.Throwable -> L10f
        L18f:
            boolean r4 = r0 instanceof a.C0447wd.a     // Catch: java.lang.Throwable -> L10f
            if (r4 == 0) goto L1ae
        L193:
            r0 = 0
            goto L1ae
        L195:
            java.lang.String r0 = "getItem"
            java.lang.Integer r4 = java.lang.Integer.valueOf(r15)     // Catch: java.lang.Throwable -> L1a4
            java.lang.Object[] r4 = new java.lang.Object[]{r4}     // Catch: java.lang.Throwable -> L1a4
            java.lang.Object r0 = a.A1.a(r8, r0, r4)     // Catch: java.lang.Throwable -> L1a4
            goto L1a9
        L1a4:
            r0 = move-exception
            a.wd$a r0 = a.C0465xd.a(r0)     // Catch: java.lang.Throwable -> L10f
        L1a9:
            boolean r4 = r0 instanceof a.C0447wd.a     // Catch: java.lang.Throwable -> L10f
            if (r4 == 0) goto L1ae
            goto L193
        L1ae:
            if (r0 == 0) goto L1e1
            java.lang.String r0 = r5.a(r0)     // Catch: java.lang.Throwable -> L10f
            if (r0 == 0) goto L1bc
            boolean r4 = r14.contains(r0)     // Catch: java.lang.Throwable -> L10f
            if (r4 != 0) goto L1bf
        L1bc:
            r17 = 1
            goto L1e4
        L1bf:
            r4 = 5
            if (r3 >= r4) goto L1e1
            r4 = 1
            boolean r13 = a.Ae.H(r0, r13, r4)     // Catch: java.lang.Throwable -> L10f
            if (r13 != 0) goto L1e1
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L10f
            r4.<init>()     // Catch: java.lang.Throwable -> L10f
            r4.append(r0)     // Catch: java.lang.Throwable -> L10f
            java.lang.String r0 = ", "
            r4.append(r0)     // Catch: java.lang.Throwable -> L10f
            java.lang.String r0 = r4.toString()     // Catch: java.lang.Throwable -> L10f
            r2.append(r0)     // Catch: java.lang.Throwable -> L10f
            r17 = 1
            int r3 = r3 + 1
        L1e1:
            r17 = 1
            goto L1ea
        L1e4:
            int r4 = r16 + 1
            r10[r16] = r15     // Catch: java.lang.Throwable -> L10f
            r16 = r4
        L1ea:
            int r15 = r15 + 1
            r4 = 1
            goto L177
        L1ee:
            if (r3 <= 0) goto L20d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L10f
            r0.<init>()     // Catch: java.lang.Throwable -> L10f
            java.lang.String r3 = "[DIAG] non-standard wxid in mask: "
            r0.append(r3)     // Catch: java.lang.Throwable -> L10f
            r0.append(r2)     // Catch: java.lang.Throwable -> L10f
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L10f
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch: java.lang.Throwable -> L10f
            r4 = 1
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r4)     // Catch: java.lang.Throwable -> L10f
            a.C0453x1.b(r0)     // Catch: java.lang.Throwable -> L10f
        L20d:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L10f
            r0.<init>()     // Catch: java.lang.Throwable -> L10f
            java.util.Iterator r2 = r12.iterator()     // Catch: java.lang.Throwable -> L10f
        L216:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L10f
            if (r3 == 0) goto L232
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L10f
            r4 = r3
            top.mmjz.floatingclouds.bean.MaskItemBean r4 = (top.mmjz.floatingclouds.bean.MaskItemBean) r4     // Catch: java.lang.Throwable -> L10f
            java.lang.String r4 = r4.getMaskId()     // Catch: java.lang.Throwable -> L10f
            r9 = 1
            boolean r4 = a.Ae.H(r4, r13, r9)     // Catch: java.lang.Throwable -> L10f
            if (r4 != 0) goto L216
            r0.add(r3)     // Catch: java.lang.Throwable -> L10f
            goto L216
        L232:
            boolean r2 = r0.isEmpty()     // Catch: java.lang.Throwable -> L10f
            if (r2 != 0) goto L278
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L10f
            r3 = 10
            int r3 = a.C0312p3.g0(r0, r3)     // Catch: java.lang.Throwable -> L10f
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L10f
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L10f
        L247:
            boolean r3 = r0.hasNext()     // Catch: java.lang.Throwable -> L10f
            if (r3 == 0) goto L25b
            java.lang.Object r3 = r0.next()     // Catch: java.lang.Throwable -> L10f
            top.mmjz.floatingclouds.bean.MaskItemBean r3 = (top.mmjz.floatingclouds.bean.MaskItemBean) r3     // Catch: java.lang.Throwable -> L10f
            java.lang.String r3 = r3.getMaskId()     // Catch: java.lang.Throwable -> L10f
            r2.add(r3)     // Catch: java.lang.Throwable -> L10f
            goto L247
        L25b:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L10f
            r0.<init>()     // Catch: java.lang.Throwable -> L10f
            java.lang.String r3 = "[DIAG] non-standard wxid in scan: "
            r0.append(r3)     // Catch: java.lang.Throwable -> L10f
            r0.append(r2)     // Catch: java.lang.Throwable -> L10f
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L10f
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch: java.lang.Throwable -> L10f
            r4 = 1
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r4)     // Catch: java.lang.Throwable -> L10f
            a.C0453x1.b(r0)     // Catch: java.lang.Throwable -> L10f
        L278:
            java.util.concurrent.ConcurrentHashMap<java.lang.Object, int[]> r0 = r5.m     // Catch: java.lang.Throwable -> L10f
            r0.put(r8, r10)     // Catch: java.lang.Throwable -> L10f
            java.lang.Integer r0 = java.lang.Integer.valueOf(r16)     // Catch: java.lang.Throwable -> L10f
            java.util.concurrent.ConcurrentHashMap<java.lang.Object, java.lang.Integer> r2 = r5.o     // Catch: java.lang.Throwable -> L10f
            r2.put(r8, r0)     // Catch: java.lang.Throwable -> L10f
            java.util.concurrent.ConcurrentHashMap<java.lang.Object, java.lang.Integer> r0 = r5.p     // Catch: java.lang.Throwable -> L10f
            r0.put(r8, r6)     // Catch: java.lang.Throwable -> L10f
            java.util.concurrent.ConcurrentHashMap<java.lang.Object, java.lang.Boolean> r0 = r5.n     // Catch: java.lang.Throwable -> L10f
            java.lang.Boolean r2 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L10f
            r0.put(r8, r2)     // Catch: java.lang.Throwable -> L10f
            java.lang.ThreadLocal<java.lang.Boolean> r0 = r5.v
        L294:
            r0.set(r2)
            goto L2a5
        L298:
            java.lang.ThreadLocal<java.lang.Boolean> r0 = r5.v
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            goto L294
        L29d:
            java.lang.ThreadLocal<java.lang.Boolean> r2 = r5.v
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            r2.set(r3)
            throw r0
        L2a5:
            java.util.concurrent.ConcurrentHashMap<java.lang.Object, int[]> r0 = r5.m
            java.lang.Object r0 = r0.get(r8)
            int[] r0 = (int[]) r0
            if (r0 != 0) goto L2b5
            java.lang.Object r0 = r7.proceed()
            goto L39c
        L2b5:
            java.util.List r2 = r7.getArgs()
            r3 = 0
            java.lang.Object r2 = r2.get(r3)
            boolean r3 = r2 instanceof java.lang.Integer
            if (r3 == 0) goto L2c5
            java.lang.Integer r2 = (java.lang.Integer) r2
            goto L2c6
        L2c5:
            r2 = 0
        L2c6:
            if (r2 == 0) goto L393
            int r2 = r2.intValue()
            java.util.concurrent.ConcurrentHashMap<java.lang.Object, java.lang.Integer> r3 = r5.o
            java.lang.Object r3 = r3.get(r8)
            java.lang.Integer r3 = (java.lang.Integer) r3
            if (r3 == 0) goto L2db
            int r3 = r3.intValue()
            goto L2dc
        L2db:
            int r3 = r0.length
        L2dc:
            if (r2 < 0) goto L38e
            if (r2 < r3) goto L2e2
            goto L38e
        L2e2:
            if (r2 < 0) goto L2ee
            int r3 = r0.length
            if (r2 >= r3) goto L2ee
            r0 = r0[r2]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L2ef
        L2ee:
            r0 = 0
        L2ef:
            if (r0 == 0) goto L2f5
            int r2 = r0.intValue()
        L2f5:
            java.util.List r0 = r7.getArgs()
            int r0 = r0.size()
            r3 = 3
            if (r0 >= r3) goto L306
            java.lang.Object r0 = r7.proceed()
            goto L39c
        L306:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            java.util.List r3 = r7.getArgs()
            r4 = 1
            java.lang.Object r3 = r3.get(r4)
            java.util.List r4 = r7.getArgs()
            r6 = 2
            java.lang.Object r4 = r4.get(r6)
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r3, r4}
            java.lang.Object r3 = r7.proceed(r0)
            boolean r0 = r3 instanceof android.view.View
            if (r0 != 0) goto L32b
        L328:
            r0 = r3
            goto L39c
        L32b:
            boolean r0 = r8 instanceof android.widget.ListAdapter     // Catch: java.lang.Throwable -> L332
            if (r0 == 0) goto L334
            android.widget.ListAdapter r8 = (android.widget.ListAdapter) r8     // Catch: java.lang.Throwable -> L332
            goto L335
        L332:
            r0 = move-exception
            goto L33e
        L334:
            r8 = 0
        L335:
            if (r8 == 0) goto L33c
            java.lang.Object r0 = r8.getItem(r2)     // Catch: java.lang.Throwable -> L332
            goto L342
        L33c:
            r0 = 0
            goto L342
        L33e:
            a.wd$a r0 = a.C0465xd.a(r0)
        L342:
            boolean r2 = r0 instanceof a.C0447wd.a
            if (r2 == 0) goto L348
            r2 = 0
            goto L349
        L348:
            r2 = r0
        L349:
            if (r2 == 0) goto L350
            java.lang.String r0 = r5.a(r2)
            goto L351
        L350:
            r0 = 0
        L351:
            if (r0 == 0) goto L328
            java.util.concurrent.ExecutorService r4 = a.fh.G
            boolean r0 = a.fh.a.a(r0)
            if (r0 == 0) goto L328
            java.lang.reflect.Field r0 = a.C0366s4.P
            java.lang.String r4 = ""
            if (r0 == 0) goto L36c
            r0.set(r2, r4)     // Catch: java.lang.Throwable -> L367
            a.Wf r0 = a.Wf.f330a     // Catch: java.lang.Throwable -> L367
            goto L378
        L367:
            r0 = move-exception
            a.C0465xd.a(r0)
            goto L378
        L36c:
            java.lang.String r0 = "field_content"
            a.A1.i(r2, r0, r4)     // Catch: java.lang.Throwable -> L374
            a.Wf r0 = a.Wf.f330a     // Catch: java.lang.Throwable -> L374
            goto L378
        L374:
            r0 = move-exception
            a.C0465xd.a(r0)
        L378:
            java.lang.String r0 = "field_digest"
            a.A1.i(r2, r0, r4)     // Catch: java.lang.Throwable -> L380
            a.Wf r0 = a.Wf.f330a     // Catch: java.lang.Throwable -> L380
            goto L384
        L380:
            r0 = move-exception
            a.C0465xd.a(r0)
        L384:
            r0 = r3
            android.view.View r0 = (android.view.View) r0
            r5.m(r0)
            r5.l(r0)
            goto L328
        L38e:
            java.lang.Object r0 = r7.proceed()
            goto L39c
        L393:
            java.lang.Object r0 = r7.proceed()
            goto L39c
        L398:
            java.lang.Object r0 = r7.proceed()
        L39c:
            return r0
        L39d:
            r2 = r19
            io.github.libxposed.api.XposedInterface$Chain r2 = (io.github.libxposed.api.XposedInterface.Chain) r2
            a.C0193i9.e(r2, r0)
            java.lang.Object r0 = r2.proceed()
            java.util.List r3 = r2.getArgs()
            r4 = 0
            java.lang.Object r3 = r3.get(r4)
            if (r3 != 0) goto L3b4
            goto L407
        L3b4:
            java.lang.Class r4 = r3.getClass()
            java.lang.String r4 = r4.getName()
            java.lang.String r5 = "[DIAG-T3-LV] ListView.setAdapter called, adapter="
            java.lang.String r5 = r5.concat(r4)
            java.lang.Object[] r5 = new java.lang.Object[]{r5}
            a.C0453x1.b(r5)
            a.s4 r5 = r1.b
            boolean r6 = r5.s(r3)
            if (r6 != 0) goto L3d2
            goto L407
        L3d2:
            java.lang.String r6 = "com.tencent.mm.ui.contact"
            r7 = 0
            boolean r6 = a.Ae.H(r4, r6, r7)
            if (r6 == 0) goto L3dc
            goto L407
        L3dc:
            java.lang.String r6 = "[DIAG-T3-LV] target adapter matched: "
            java.lang.String r4 = r6.concat(r4)
            java.lang.Object[] r4 = new java.lang.Object[]{r4}
            a.C0453x1.b(r4)
            java.lang.Object r2 = r2.getThisObject()
            boolean r4 = r2 instanceof android.widget.ListView
            if (r4 == 0) goto L3f4
            android.widget.ListView r2 = (android.widget.ListView) r2
            goto L3f5
        L3f4:
            r2 = 0
        L3f5:
            if (r2 == 0) goto L3fe
            java.lang.ref.WeakReference r4 = new java.lang.ref.WeakReference
            r4.<init>(r2)
            r5.j = r4
        L3fe:
            java.lang.Class r2 = r3.getClass()
            a.J8 r3 = r1.c
            r5.n(r3, r2)
        L407:
            return r0
        L408:
            r2 = r19
            io.github.libxposed.api.XposedInterface$Chain r2 = (io.github.libxposed.api.XposedInterface.Chain) r2
            a.C0193i9.e(r2, r0)
            java.lang.Object r0 = r2.proceed()
            java.util.List r2 = r2.getArgs()
            r3 = 0
            java.lang.Object r2 = r2.get(r3)
            if (r2 != 0) goto L41f
            goto L43a
        L41f:
            java.lang.Class r4 = r2.getClass()
            java.lang.String r4 = r4.getName()
            java.lang.String r5 = "com.tencent.mm.ui.conversation"
            boolean r3 = a.Ae.H(r4, r5, r3)
            if (r3 == 0) goto L43a
            java.lang.Class r2 = r2.getClass()
            a.J8 r3 = r1.c
            a.s4 r4 = r1.b
            r4.p(r3, r2)
        L43a:
            return r0
    }
}
