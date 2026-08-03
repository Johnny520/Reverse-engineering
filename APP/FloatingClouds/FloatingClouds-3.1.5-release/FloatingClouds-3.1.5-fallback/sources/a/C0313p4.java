package a;

/* JADX INFO: renamed from: a.p4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0313p4 implements io.github.libxposed.api.XposedInterface.Hooker {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f633a;
    public final /* synthetic */ a.C0366s4 b;

    public /* synthetic */ C0313p4(a.C0366s4 r1, int r2) {
            r0 = this;
            r0.f633a = r2
            r0.b = r1
            r0.<init>()
            return
    }

    public /* synthetic */ C0313p4(a.C0366s4 r1, a.J8 r2) {
            r0 = this;
            r2 = 2
            r0.f633a = r2
            r0.<init>()
            r0.b = r1
            return
    }

    public final java.lang.Object intercept(io.github.libxposed.api.XposedInterface.Chain r26) {
            r25 = this;
            r1 = r25
            r2 = r26
            java.lang.String r3 = "1"
            java.lang.String r4 = "field_msgType"
            java.lang.String r5 = ""
            java.lang.String r6 = "field_digest"
            java.lang.String r7 = "field_content"
            java.lang.Class<java.lang.Object> r10 = java.lang.Object.class
            java.lang.String r0 = "c"
            a.s4 r11 = r1.b
            r12 = 1
            int r13 = r1.f633a
            switch(r13) {
                case 0: goto L3c3;
                case 1: goto L22;
                default: goto L1a;
            }
        L1a:
            a.C0193i9.e(r2, r0)
            java.lang.Object r0 = r11.b(r2)
            return r0
        L22:
            java.lang.String r13 = "\""
            a.C0193i9.e(r2, r0)
            java.lang.Object r14 = r2.proceed()
            a.x8 r0 = a.C0460x8.f762a
            boolean r0 = a.C0460x8.a()
            if (r0 != 0) goto L4a
            a.K3$a r0 = a.K3.f148a
            r0.getClass()
            java.util.ArrayList r0 = a.K3.a.f()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L4a
            a.jc r0 = a.K3.a.i()
            boolean r0 = r0.n
            if (r0 != 0) goto L4e
        L4a:
            r19 = r14
            goto L3c2
        L4e:
            java.util.List r0 = r2.getArgs()
            java.lang.String r15 = "getArgs(...)"
            a.C0193i9.d(r0, r15)
            java.lang.Object r0 = a.C0383t3.o0(r0, r12)
            boolean r15 = r0 instanceof java.lang.Integer
            if (r15 == 0) goto L62
            java.lang.Integer r0 = (java.lang.Integer) r0
            goto L63
        L62:
            r0 = 0
        L63:
            if (r0 == 0) goto L4a
            int r15 = r0.intValue()
            java.lang.Object r9 = r2.getThisObject()
            java.lang.Class r16 = r9.getClass()     // Catch: java.lang.Throwable -> L1a6
            r17 = 0
            java.lang.reflect.Method[] r8 = r16.getMethods()     // Catch: java.lang.Throwable -> Laf
            java.lang.String r12 = "getMethods(...)"
            a.C0193i9.d(r8, r12)     // Catch: java.lang.Throwable -> Laf
            int r12 = r8.length     // Catch: java.lang.Throwable -> Laf
            r18 = r0
            r0 = r17
        L81:
            if (r0 >= r12) goto Lb9
            r19 = r8[r0]     // Catch: java.lang.Throwable -> Laf
            r20 = r0
            java.lang.String r0 = r19.getName()     // Catch: java.lang.Throwable -> Laf
            java.lang.String r1 = "getItem"
            boolean r0 = a.C0193i9.a(r0, r1)     // Catch: java.lang.Throwable -> Laf
            if (r0 == 0) goto Lac
            java.lang.Class[] r0 = r19.getParameterTypes()     // Catch: java.lang.Throwable -> Laf
            int r0 = r0.length     // Catch: java.lang.Throwable -> Laf
            r1 = 1
            if (r0 != r1) goto Lb2
            java.lang.Class[] r0 = r19.getParameterTypes()     // Catch: java.lang.Throwable -> Laf
            r0 = r0[r17]     // Catch: java.lang.Throwable -> Laf
            java.lang.Class r1 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> Laf
            boolean r0 = a.C0193i9.a(r0, r1)     // Catch: java.lang.Throwable -> Laf
            if (r0 == 0) goto Lac
            r0 = r19
            goto Lba
        Lac:
            r16 = 1
            goto Lb4
        Laf:
            r0 = move-exception
            goto L1a9
        Lb2:
            r16 = r1
        Lb4:
            int r0 = r20 + 1
            r1 = r25
            goto L81
        Lb9:
            r0 = 0
        Lba:
            if (r0 == 0) goto Ld0
            r1 = 1
            r0.setAccessible(r1)     // Catch: java.lang.Throwable -> Laf
            java.lang.Object[] r1 = new java.lang.Object[]{r18}     // Catch: java.lang.Throwable -> Laf
            java.lang.Object r0 = r0.invoke(r9, r1)     // Catch: java.lang.Throwable -> Laf
            if (r0 == 0) goto Ld0
            boolean r1 = r0 instanceof android.view.View     // Catch: java.lang.Throwable -> Laf
            if (r1 != 0) goto Ld0
            goto L1ad
        Ld0:
            java.lang.String r0 = "data"
            java.lang.Object r0 = a.A1.h(r9, r0)     // Catch: java.lang.Throwable -> Laf
            boolean r1 = r0 instanceof java.util.List     // Catch: java.lang.Throwable -> Laf
            if (r1 == 0) goto Ldd
            java.util.List r0 = (java.util.List) r0     // Catch: java.lang.Throwable -> Laf
            goto Lde
        Ldd:
            r0 = 0
        Lde:
            if (r0 == 0) goto Lf4
            if (r15 < 0) goto Lf4
            int r1 = r0.size()     // Catch: java.lang.Throwable -> Laf
            if (r15 >= r1) goto Lf4
            java.lang.Object r0 = r0.get(r15)     // Catch: java.lang.Throwable -> Laf
            if (r0 == 0) goto Lf4
            boolean r1 = r0 instanceof android.view.View     // Catch: java.lang.Throwable -> Laf
            if (r1 != 0) goto Lf4
            goto L1ad
        Lf4:
            java.lang.String r0 = "e"
            java.lang.Object r0 = a.A1.h(r9, r0)     // Catch: java.lang.Throwable -> Laf
            boolean r1 = r0 instanceof java.util.List     // Catch: java.lang.Throwable -> Laf
            if (r1 == 0) goto L101
            java.util.List r0 = (java.util.List) r0     // Catch: java.lang.Throwable -> Laf
            goto L102
        L101:
            r0 = 0
        L102:
            if (r0 == 0) goto L118
            if (r15 < 0) goto L118
            int r1 = r0.size()     // Catch: java.lang.Throwable -> Laf
            if (r15 >= r1) goto L118
            java.lang.Object r0 = r0.get(r15)     // Catch: java.lang.Throwable -> Laf
            if (r0 == 0) goto L118
            boolean r1 = r0 instanceof android.view.View     // Catch: java.lang.Throwable -> Laf
            if (r1 != 0) goto L118
            goto L1ad
        L118:
            java.lang.Class r0 = r9.getClass()     // Catch: java.lang.Throwable -> Laf
            r1 = r0
            r8 = r17
        L11f:
            if (r1 == 0) goto L1a4
            boolean r0 = r1.equals(r10)     // Catch: java.lang.Throwable -> Laf
            if (r0 != 0) goto L1a4
            r0 = 5
            if (r8 >= r0) goto L1a4
            java.lang.reflect.Field[] r0 = r1.getDeclaredFields()     // Catch: java.lang.Throwable -> Laf
            a.G1 r12 = a.C0435w1.I(r0)     // Catch: java.lang.Throwable -> Laf
        L132:
            boolean r0 = r12.hasNext()     // Catch: java.lang.Throwable -> Laf
            if (r0 == 0) goto L196
            java.lang.Object r0 = r12.next()     // Catch: java.lang.Throwable -> Laf
            java.lang.reflect.Field r0 = (java.lang.reflect.Field) r0     // Catch: java.lang.Throwable -> Laf
            int r18 = r0.getModifiers()     // Catch: java.lang.Throwable -> Laf
            boolean r18 = java.lang.reflect.Modifier.isStatic(r18)     // Catch: java.lang.Throwable -> Laf
            if (r18 != 0) goto L132
            r18 = r1
            r1 = 1
            r0.setAccessible(r1)     // Catch: java.lang.Throwable -> Laf
            java.lang.Object r0 = r0.get(r9)     // Catch: java.lang.Throwable -> L153
            goto L158
        L153:
            r0 = move-exception
            a.wd$a r0 = a.C0465xd.a(r0)     // Catch: java.lang.Throwable -> Laf
        L158:
            boolean r1 = r0 instanceof a.C0447wd.a     // Catch: java.lang.Throwable -> Laf
            if (r1 == 0) goto L15d
            r0 = 0
        L15d:
            boolean r1 = r0 instanceof java.util.List     // Catch: java.lang.Throwable -> Laf
            if (r1 == 0) goto L193
            r1 = r0
            java.util.List r1 = (java.util.List) r1     // Catch: java.lang.Throwable -> Laf
            int r1 = r1.size()     // Catch: java.lang.Throwable -> Laf
            if (r15 >= r1) goto L193
            java.util.List r0 = (java.util.List) r0     // Catch: java.lang.Throwable -> Laf
            java.lang.Object r0 = r0.get(r15)     // Catch: java.lang.Throwable -> Laf
            if (r0 == 0) goto L193
            boolean r1 = r0 instanceof android.view.View     // Catch: java.lang.Throwable -> Laf
            if (r1 != 0) goto L193
            java.lang.Class r1 = r0.getClass()     // Catch: java.lang.Throwable -> Laf
            java.lang.String r1 = r1.getName()     // Catch: java.lang.Throwable -> Laf
            r19 = r0
            java.lang.String r0 = "ViewHolder"
            r20 = r8
            r8 = 1
            boolean r0 = a.Be.I(r1, r0, r8)     // Catch: java.lang.Throwable -> Laf
            if (r0 != 0) goto L18e
            r0 = r19
            goto L1ad
        L18e:
            r1 = r18
            r8 = r20
            goto L132
        L193:
            r1 = r18
            goto L132
        L196:
            r18 = r1
            r20 = r8
            java.lang.Class r1 = r18.getSuperclass()     // Catch: java.lang.Throwable -> Laf
            r16 = 1
            int r8 = r20 + 1
            goto L11f
        L1a4:
            r0 = 0
            goto L1ad
        L1a6:
            r0 = move-exception
            r17 = 0
        L1a9:
            a.wd$a r0 = a.C0465xd.a(r0)
        L1ad:
            boolean r1 = r0 instanceof a.C0447wd.a
            if (r1 == 0) goto L1b3
            r1 = 0
            goto L1b4
        L1b3:
            r1 = r0
        L1b4:
            if (r1 != 0) goto L1b8
            goto L4a
        L1b8:
            java.lang.String r8 = r11.a(r1)
            java.util.concurrent.ConcurrentHashMap<java.lang.Class<?>, java.lang.Boolean> r12 = r11.z
            java.lang.Class r0 = r9.getClass()
            boolean r0 = r12.containsKey(r0)
            if (r0 == 0) goto L1df
            java.lang.Class r0 = r9.getClass()
            java.lang.Object r0 = r12.get(r0)
            r18 = r9
            java.lang.Boolean r9 = java.lang.Boolean.FALSE
            boolean r0 = a.C0193i9.a(r0, r9)
            if (r0 == 0) goto L1db
            goto L1e1
        L1db:
            r19 = r14
            goto L33d
        L1df:
            r18 = r9
        L1e1:
            java.lang.Class r0 = r1.getClass()     // Catch: java.lang.Throwable -> L2d4
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2d4
            r9.<init>()     // Catch: java.lang.Throwable -> L2d4
            r19 = r14
            r2 = r17
            r14 = r0
        L1ef:
            if (r14 == 0) goto L2cf
            boolean r0 = r14.equals(r10)     // Catch: java.lang.Throwable -> L237
            if (r0 != 0) goto L2cf
            r0 = 3
            if (r2 >= r0) goto L2cf
            java.lang.reflect.Field[] r0 = r14.getDeclaredFields()     // Catch: java.lang.Throwable -> L237
            a.G1 r20 = a.C0435w1.I(r0)     // Catch: java.lang.Throwable -> L237
        L202:
            boolean r0 = r20.hasNext()     // Catch: java.lang.Throwable -> L237
            if (r0 == 0) goto L2b9
            java.lang.Object r0 = r20.next()     // Catch: java.lang.Throwable -> L237
            r21 = r2
            r2 = r0
            java.lang.reflect.Field r2 = (java.lang.reflect.Field) r2     // Catch: java.lang.Throwable -> L237
            int r0 = r2.getModifiers()     // Catch: java.lang.Throwable -> L237
            boolean r0 = java.lang.reflect.Modifier.isStatic(r0)     // Catch: java.lang.Throwable -> L237
            if (r0 != 0) goto L2b5
            r22 = r14
            r14 = 1
            r2.setAccessible(r14)     // Catch: java.lang.Throwable -> L237
            java.lang.Object r0 = r2.get(r1)     // Catch: java.lang.Throwable -> L226
            goto L22b
        L226:
            r0 = move-exception
            a.wd$a r0 = a.C0465xd.a(r0)     // Catch: java.lang.Throwable -> L237
        L22b:
            boolean r14 = r0 instanceof a.C0447wd.a     // Catch: java.lang.Throwable -> L237
            if (r14 == 0) goto L230
            r0 = 0
        L230:
            if (r0 != 0) goto L23a
            java.lang.String r0 = "null"
        L234:
            r23 = r2
            goto L27b
        L237:
            r0 = move-exception
            goto L2d7
        L23a:
            boolean r14 = r0 instanceof java.lang.String     // Catch: java.lang.Throwable -> L237
            if (r14 == 0) goto L259
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L237
            r14 = 30
            java.lang.String r0 = a.Ce.X(r0, r14)     // Catch: java.lang.Throwable -> L237
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L237
            r14.<init>()     // Catch: java.lang.Throwable -> L237
            r14.append(r13)     // Catch: java.lang.Throwable -> L237
            r14.append(r0)     // Catch: java.lang.Throwable -> L237
            r14.append(r13)     // Catch: java.lang.Throwable -> L237
            java.lang.String r0 = r14.toString()     // Catch: java.lang.Throwable -> L237
            goto L234
        L259:
            java.lang.Class r14 = r0.getClass()     // Catch: java.lang.Throwable -> L237
            java.lang.String r14 = r14.getSimpleName()     // Catch: java.lang.Throwable -> L237
            int r0 = java.lang.System.identityHashCode(r0)     // Catch: java.lang.Throwable -> L237
            r23 = r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L237
            r2.<init>()     // Catch: java.lang.Throwable -> L237
            r2.append(r14)     // Catch: java.lang.Throwable -> L237
            java.lang.String r14 = "@"
            r2.append(r14)     // Catch: java.lang.Throwable -> L237
            r2.append(r0)     // Catch: java.lang.Throwable -> L237
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> L237
        L27b:
            java.lang.String r2 = r22.getSimpleName()     // Catch: java.lang.Throwable -> L237
            java.lang.String r14 = r23.getName()     // Catch: java.lang.Throwable -> L237
            r23 = r13
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L237
            r13.<init>()     // Catch: java.lang.Throwable -> L237
            r24 = r10
            java.lang.String r10 = " "
            r13.append(r10)     // Catch: java.lang.Throwable -> L237
            r13.append(r2)     // Catch: java.lang.Throwable -> L237
            java.lang.String r2 = "."
            r13.append(r2)     // Catch: java.lang.Throwable -> L237
            r13.append(r14)     // Catch: java.lang.Throwable -> L237
            java.lang.String r2 = "="
            r13.append(r2)     // Catch: java.lang.Throwable -> L237
            r13.append(r0)     // Catch: java.lang.Throwable -> L237
            java.lang.String r0 = r13.toString()     // Catch: java.lang.Throwable -> L237
            r9.append(r0)     // Catch: java.lang.Throwable -> L237
            r2 = r21
            r14 = r22
            r13 = r23
            r10 = r24
            goto L202
        L2b5:
            r2 = r21
            goto L202
        L2b9:
            r21 = r2
            r24 = r10
            r23 = r13
            r22 = r14
            java.lang.Class r14 = r22.getSuperclass()     // Catch: java.lang.Throwable -> L237
            r16 = 1
            int r2 = r21 + 1
            r13 = r23
            r10 = r24
            goto L1ef
        L2cf:
            java.lang.String r0 = r9.toString()     // Catch: java.lang.Throwable -> L237
            goto L2db
        L2d4:
            r0 = move-exception
            r19 = r14
        L2d7:
            a.wd$a r0 = a.C0465xd.a(r0)
        L2db:
            boolean r2 = r0 instanceof a.C0447wd.a
            if (r2 == 0) goto L2e1
            java.lang.String r0 = "DUMP_FAIL"
        L2e1:
            java.lang.String r2 = "getOrDefault(...)"
            a.C0193i9.d(r0, r2)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Class r2 = r18.getClass()
            java.lang.String r2 = r2.getName()
            java.lang.Class r9 = r1.getClass()
            java.lang.String r9 = r9.getName()
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r13 = "onBindVH adapter="
            r10.<init>(r13)
            r10.append(r2)
            java.lang.String r2 = " pos="
            r10.append(r2)
            r10.append(r15)
            java.lang.String r2 = " item="
            r10.append(r2)
            r10.append(r9)
            java.lang.String r2 = " chatUser="
            r10.append(r2)
            r10.append(r8)
            java.lang.String r2 = " fields=["
            r10.append(r2)
            r10.append(r0)
            java.lang.String r0 = "]"
            r10.append(r0)
            java.lang.String r0 = r10.toString()
            java.lang.String r2 = "msg"
            a.C0193i9.e(r0, r2)
            java.lang.String r2 = "[ConvRV] "
            java.lang.String r0 = r2.concat(r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            a.C0453x1.b(r0)
        L33d:
            if (r8 == 0) goto L3c2
            java.util.concurrent.ExecutorService r0 = a.fh.G
            boolean r0 = a.fh.a.a(r8)
            if (r0 == 0) goto L3c2
            java.lang.Class r0 = r18.getClass()
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            r12.put(r0, r2)
            java.util.List r0 = r26.getArgs()
            r2 = r17
            java.lang.Object r0 = r0.get(r2)
            if (r0 != 0) goto L35d
            goto L3c2
        L35d:
            java.lang.String r2 = "itemView"
            java.lang.Object r0 = a.A1.h(r0, r2)     // Catch: java.lang.Throwable -> L36a
            boolean r2 = r0 instanceof android.view.View     // Catch: java.lang.Throwable -> L36a
            if (r2 == 0) goto L36c
            android.view.View r0 = (android.view.View) r0     // Catch: java.lang.Throwable -> L36a
            goto L372
        L36a:
            r0 = move-exception
            goto L36e
        L36c:
            r0 = 0
            goto L372
        L36e:
            a.wd$a r0 = a.C0465xd.a(r0)
        L372:
            boolean r2 = r0 instanceof a.C0447wd.a
            if (r2 == 0) goto L378
            r9 = 0
            goto L379
        L378:
            r9 = r0
        L379:
            android.view.View r9 = (android.view.View) r9
            if (r9 == 0) goto L3c2
            java.lang.String r0 = "field_msgContent"
            java.lang.String r2 = "field_summary"
            java.lang.String[] r0 = new java.lang.String[]{r7, r6, r0, r2}
            java.util.List r0 = a.C0294o3.d0(r0)
            java.util.Iterator r2 = r0.iterator()
        L38d:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L3a4
            java.lang.Object r0 = r2.next()
            java.lang.String r0 = (java.lang.String) r0
            a.A1.i(r1, r0, r5)     // Catch: java.lang.Throwable -> L39f
            a.Wf r0 = a.Wf.f330a     // Catch: java.lang.Throwable -> L39f
            goto L38d
        L39f:
            r0 = move-exception
            a.C0465xd.a(r0)
            goto L38d
        L3a4:
            a.A1.i(r1, r4, r3)     // Catch: java.lang.Throwable -> L3aa
            a.Wf r0 = a.Wf.f330a     // Catch: java.lang.Throwable -> L3aa
            goto L3ae
        L3aa:
            r0 = move-exception
            a.C0465xd.a(r0)
        L3ae:
            java.lang.String r0 = "setDigest"
            java.lang.Object[] r2 = new java.lang.Object[]{r5}     // Catch: java.lang.Throwable -> L3b8
            a.A1.a(r1, r0, r2)     // Catch: java.lang.Throwable -> L3b8
            goto L3bc
        L3b8:
            r0 = move-exception
            a.C0465xd.a(r0)
        L3bc:
            r11.l(r9)
            r11.m(r9)
        L3c2:
            return r19
        L3c3:
            r24 = r10
            java.lang.String r0 = "chain"
            r2 = r26
            a.C0193i9.e(r2, r0)
            java.lang.Object r1 = r2.proceed()
            a.K3$a r0 = a.K3.f148a
            r0.getClass()
            a.jc r0 = a.K3.a.i()
            boolean r0 = r0.n
            if (r0 == 0) goto L4c7
            java.util.ArrayList r0 = a.K3.a.f()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L3e9
            goto L4c7
        L3e9:
            java.lang.Object r0 = r2.getThisObject()
            boolean r8 = r0 instanceof android.widget.ListAdapter
            if (r8 == 0) goto L3f4
            android.widget.ListAdapter r0 = (android.widget.ListAdapter) r0
            goto L3f5
        L3f4:
            r0 = 0
        L3f5:
            if (r0 != 0) goto L3f9
            goto L4c7
        L3f9:
            java.util.List r2 = r2.getArgs()
            r8 = 0
            java.lang.Object r2 = r2.get(r8)
            boolean r8 = r2 instanceof java.lang.Integer
            if (r8 == 0) goto L409
            java.lang.Integer r2 = (java.lang.Integer) r2
            goto L40a
        L409:
            r2 = 0
        L40a:
            if (r2 == 0) goto L4c7
            int r2 = r2.intValue()
            java.lang.Object r2 = r0.getItem(r2)
            if (r2 != 0) goto L418
            goto L4c7
        L418:
            boolean r0 = r1 instanceof android.view.View
            if (r0 == 0) goto L421
            r0 = r1
            android.view.View r0 = (android.view.View) r0
            r8 = r0
            goto L422
        L421:
            r8 = 0
        L422:
            if (r8 != 0) goto L426
            goto L4c7
        L426:
            java.lang.Object r0 = a.A1.g(r2)
            boolean r9 = r0 instanceof java.lang.String
            if (r9 == 0) goto L431
            java.lang.String r0 = (java.lang.String) r0
            goto L432
        L431:
            r0 = 0
        L432:
            if (r0 != 0) goto L448
            java.lang.String r0 = "field_username"
            java.lang.Object r0 = a.A1.h(r2, r0)
            boolean r9 = r0 instanceof java.lang.String
            if (r9 == 0) goto L442
            r9 = r0
            java.lang.String r9 = (java.lang.String) r9
            goto L443
        L442:
            r9 = 0
        L443:
            if (r9 != 0) goto L447
            goto L4c7
        L447:
            r0 = r9
        L448:
            java.util.concurrent.ExecutorService r9 = a.fh.G
            boolean r0 = a.fh.a.a(r0)
            if (r0 == 0) goto L4c7
            java.lang.String[] r0 = new java.lang.String[]{r7, r6}
            java.util.List r0 = a.C0294o3.d0(r0)
            java.util.Iterator r6 = r0.iterator()
        L45c:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L499
            java.lang.Object r0 = r6.next()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Class r7 = r2.getClass()     // Catch: java.lang.Throwable -> L490
        L46c:
            if (r7 == 0) goto L48b
            r9 = r24
            boolean r10 = r7.equals(r9)     // Catch: java.lang.Throwable -> L482
            if (r10 != 0) goto L48d
            java.lang.reflect.Field r10 = r7.getDeclaredField(r0)     // Catch: java.lang.Throwable -> L482 java.lang.NoSuchFieldException -> L484
            r14 = 1
            r10.setAccessible(r14)     // Catch: java.lang.Throwable -> L482 java.lang.NoSuchFieldException -> L484
            r10.set(r2, r5)     // Catch: java.lang.Throwable -> L482 java.lang.NoSuchFieldException -> L484
            goto L48d
        L482:
            r0 = move-exception
            goto L493
        L484:
            java.lang.Class r7 = r7.getSuperclass()     // Catch: java.lang.Throwable -> L482
            r24 = r9
            goto L46c
        L48b:
            r9 = r24
        L48d:
            a.Wf r0 = a.Wf.f330a     // Catch: java.lang.Throwable -> L482
            goto L496
        L490:
            r0 = move-exception
            r9 = r24
        L493:
            a.C0465xd.a(r0)
        L496:
            r24 = r9
            goto L45c
        L499:
            r9 = r24
            java.lang.Class r0 = r2.getClass()     // Catch: java.lang.Throwable -> L4b3
        L49f:
            if (r0 == 0) goto L4bb
            boolean r5 = r0.equals(r9)     // Catch: java.lang.Throwable -> L4b3
            if (r5 != 0) goto L4bb
            java.lang.reflect.Field r5 = r0.getDeclaredField(r4)     // Catch: java.lang.Throwable -> L4b3 java.lang.NoSuchFieldException -> L4b5
            r14 = 1
            r5.setAccessible(r14)     // Catch: java.lang.Throwable -> L4b3 java.lang.NoSuchFieldException -> L4b6
            r5.set(r2, r3)     // Catch: java.lang.Throwable -> L4b3 java.lang.NoSuchFieldException -> L4b6
            goto L4bb
        L4b3:
            r0 = move-exception
            goto L4be
        L4b5:
            r14 = 1
        L4b6:
            java.lang.Class r0 = r0.getSuperclass()     // Catch: java.lang.Throwable -> L4b3
            goto L49f
        L4bb:
            a.Wf r0 = a.Wf.f330a     // Catch: java.lang.Throwable -> L4b3
            goto L4c1
        L4be:
            a.C0465xd.a(r0)
        L4c1:
            r11.m(r8)
            r11.l(r8)
        L4c7:
            return r1
    }
}
