package a;

/* JADX INFO: renamed from: a.m2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0257m2 implements io.github.libxposed.api.XposedInterface.Hooker {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f570a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ C0257m2(int r1, java.lang.Object r2) {
            r0 = this;
            r0.f570a = r1
            r0.b = r2
            r0.<init>()
            return
    }

    public /* synthetic */ C0257m2(a.C0442w8 r1, java.lang.Class r2) {
            r0 = this;
            r1 = 5
            r0.f570a = r1
            r0.<init>()
            r0.b = r2
            return
    }

    public final java.lang.Object intercept(io.github.libxposed.api.XposedInterface.Chain r11) {
            r10 = this;
            r0 = 2
            r1 = 0
            r2 = 1
            r3 = 0
            java.lang.String r4 = "chain"
            int r5 = r10.f570a
            switch(r5) {
                case 0: goto L381;
                case 1: goto L299;
                case 2: goto L1a5;
                case 3: goto Ldc;
                case 4: goto Lc0;
                case 5: goto L94;
                case 6: goto L1d;
                default: goto Lb;
            }
        Lb:
            a.C0193i9.e(r11, r4)
            a.A3 r0 = new a.A3
            r1 = 5
            r0.<init>(r1, r11)
            java.lang.Object r11 = r10.b
            a.o6 r11 = (a.C0297o6) r11
            java.lang.Object r11 = a.C0297o6.a(r11, r0)
            return r11
        L1d:
            a.C0193i9.e(r11, r4)
            java.lang.Object r11 = r11.proceed()
            boolean r0 = r11 instanceof android.database.Cursor
            if (r0 == 0) goto L2b
            r3 = r11
            android.database.Cursor r3 = (android.database.Cursor) r3
        L2b:
            if (r3 != 0) goto L2e
            goto L93
        L2e:
            java.lang.Object r11 = r10.b
            a.w8 r11 = (a.C0442w8) r11
            boolean r0 = a.C0442w8.c()
            if (r0 != 0) goto L39
            goto L3d
        L39:
            boolean r0 = r3 instanceof a.Re
            if (r0 == 0) goto L3f
        L3d:
            r11 = r3
            goto L93
        L3f:
            java.util.HashSet r0 = a.C0442w8.e()
            java.lang.String r1 = "[HideSnsInteraction] snsMsg filter "
            java.util.WeakHashMap<android.database.Cursor, a.Re> r11 = r11.f749a
            java.lang.Object r4 = r11.get(r3)     // Catch: java.lang.Throwable -> L57
            a.Re r4 = (a.Re) r4     // Catch: java.lang.Throwable -> L57
            if (r4 == 0) goto L59
            boolean r5 = r4.isClosed()     // Catch: java.lang.Throwable -> L57
            if (r5 != 0) goto L59
        L55:
            r11 = r4
            goto L93
        L57:
            r11 = move-exception
            goto L7d
        L59:
            a.Re r4 = new a.Re     // Catch: java.lang.Throwable -> L57
            r4.<init>(r3, r0)     // Catch: java.lang.Throwable -> L57
            r11.put(r3, r4)     // Catch: java.lang.Throwable -> L57
            int r11 = r4.b     // Catch: java.lang.Throwable -> L57
            if (r11 <= 0) goto L55
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L57
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L57
            r0.append(r11)     // Catch: java.lang.Throwable -> L57
            java.lang.String r11 = r0.toString()     // Catch: java.lang.Throwable -> L57
            java.lang.Object[] r11 = new java.lang.Object[]{r11}     // Catch: java.lang.Throwable -> L57
            java.lang.Object[] r11 = java.util.Arrays.copyOf(r11, r2)     // Catch: java.lang.Throwable -> L57
            a.C0453x1.b(r11)     // Catch: java.lang.Throwable -> L57
            goto L55
        L7d:
            java.lang.String r11 = r11.getMessage()
            java.lang.String r0 = "[HideSnsInteraction] snsMsg wrap fail: "
            java.lang.String r11 = a.C0487z.k(r0, r11)
            java.lang.Object[] r11 = new java.lang.Object[]{r11}
            java.lang.Object[] r11 = java.util.Arrays.copyOf(r11, r2)
            a.C0453x1.e(r11)
            goto L3d
        L93:
            return r11
        L94:
            a.C0193i9.e(r11, r4)
            java.lang.Object r0 = r11.getThisObject()
            boolean r1 = a.C0442w8.c()
            if (r1 == 0) goto Lbb
            java.lang.Object r1 = r10.b
            java.lang.Class r1 = (java.lang.Class) r1
            boolean r1 = r1.isInstance(r0)
            if (r1 != 0) goto Lac
            goto Lbb
        Lac:
            a.C0193i9.b(r0)
            java.util.HashSet r1 = a.C0442w8.e()
            a.C0442w8.a(r0, r1)
            java.lang.Object r11 = r11.proceed()
            goto Lbf
        Lbb:
            java.lang.Object r11 = r11.proceed()
        Lbf:
            return r11
        Lc0:
            a.C0193i9.e(r11, r4)
            r11.proceed()
            java.lang.Object r11 = r11.getThisObject()
            boolean r0 = r11 instanceof android.view.View
            if (r0 == 0) goto Ld1
            android.view.View r11 = (android.view.View) r11
            goto Ld2
        Ld1:
            r11 = r3
        Ld2:
            if (r11 == 0) goto Ldb
            java.lang.Object r0 = r10.b
            a.u8 r0 = (a.C0406u8) r0
            r0.c(r11)
        Ldb:
            return r3
        Ldc:
            java.lang.Object r0 = r10.b
            a.s8 r0 = (a.C0370s8) r0
            a.C0193i9.e(r11, r4)
            java.util.List r4 = r11.getArgs()
            java.lang.Object r2 = r4.get(r2)
            boolean r4 = r2 instanceof java.lang.Integer
            if (r4 == 0) goto Lf2
            java.lang.Integer r2 = (java.lang.Integer) r2
            goto Lf3
        Lf2:
            r2 = r3
        Lf3:
            if (r2 == 0) goto L1a0
            int r2 = r2.intValue()
            java.util.List r4 = r11.getArgs()
            java.lang.Object r4 = r4.get(r1)
            r11.proceed()
            boolean r11 = a.C0370s8.b()
            if (r11 == 0) goto L1a4
            if (r4 == 0) goto L1a4
            java.lang.Object r11 = r0.f683a
            if (r11 != 0) goto L112
            goto L1a4
        L112:
            java.lang.String r0 = "data"
            java.lang.Object r11 = a.A1.h(r11, r0)     // Catch: java.lang.Throwable -> L11f
            boolean r0 = r11 instanceof java.util.List     // Catch: java.lang.Throwable -> L11f
            if (r0 == 0) goto L121
            java.util.List r11 = (java.util.List) r11     // Catch: java.lang.Throwable -> L11f
            goto L127
        L11f:
            r11 = move-exception
            goto L123
        L121:
            r11 = r3
            goto L127
        L123:
            a.wd$a r11 = a.C0465xd.a(r11)
        L127:
            boolean r0 = r11 instanceof a.C0447wd.a
            if (r0 == 0) goto L12c
            r11 = r3
        L12c:
            java.util.List r11 = (java.util.List) r11
            if (r11 != 0) goto L132
            goto L1a4
        L132:
            int r0 = r11.size()
            if (r2 < r0) goto L13a
            goto L1a4
        L13a:
            java.lang.Object r11 = r11.get(r2)
            if (r11 != 0) goto L142
            goto L1a4
        L142:
            java.lang.Object[] r0 = new java.lang.Object[r1]
            java.lang.String r2 = "getUserName"
            java.lang.Object r0 = a.A1.a(r11, r2, r0)
            boolean r5 = r0 instanceof java.lang.String
            if (r5 == 0) goto L151
            java.lang.String r0 = (java.lang.String) r0
            goto L152
        L151:
            r0 = r3
        L152:
            if (r0 == 0) goto L155
            goto L172
        L155:
            java.lang.String r0 = "n"
            java.lang.Object[] r5 = new java.lang.Object[r1]
            java.lang.Object r11 = a.A1.a(r11, r0, r5)
            if (r11 == 0) goto L171
            java.lang.Object[] r0 = new java.lang.Object[r1]
            java.lang.Object r11 = a.A1.a(r11, r2, r0)
            boolean r0 = r11 instanceof java.lang.String
            if (r0 == 0) goto L16d
            java.lang.String r11 = (java.lang.String) r11
            r0 = r11
            goto L16e
        L16d:
            r0 = r3
        L16e:
            if (r0 == 0) goto L171
            goto L172
        L171:
            r0 = r3
        L172:
            if (r0 != 0) goto L175
            goto L1a4
        L175:
            java.util.concurrent.ExecutorService r11 = a.fh.G
            boolean r11 = a.fh.a.a(r0)
            if (r11 != 0) goto L17e
            goto L1a4
        L17e:
            java.lang.String r11 = "itemView"
            java.lang.Object r11 = a.A1.h(r4, r11)     // Catch: java.lang.Exception -> L1a4
            boolean r0 = r11 instanceof android.view.View     // Catch: java.lang.Exception -> L1a4
            if (r0 == 0) goto L18b
            android.view.View r11 = (android.view.View) r11     // Catch: java.lang.Exception -> L1a4
            goto L18c
        L18b:
            r11 = r3
        L18c:
            if (r11 != 0) goto L18f
            goto L1a4
        L18f:
            r0 = 8
            r11.setVisibility(r0)     // Catch: java.lang.Exception -> L1a4
            android.view.ViewGroup$LayoutParams r0 = r11.getLayoutParams()     // Catch: java.lang.Exception -> L1a4
            if (r0 == 0) goto L1a4
            r0.height = r1     // Catch: java.lang.Exception -> L1a4
            r11.setLayoutParams(r0)     // Catch: java.lang.Exception -> L1a4
            goto L1a4
        L1a0:
            java.lang.Object r3 = r11.proceed()
        L1a4:
            return r3
        L1a5:
            java.lang.Object r5 = r10.b
            a.h8 r5 = (a.C0174h8) r5
            a.C0193i9.e(r11, r4)
            java.lang.Object r4 = r11.getThisObject()
            r5.f495a = r4
            boolean r4 = r5.c
            if (r4 == 0) goto L1bc
            java.lang.Object r11 = r11.proceed()
            goto L298
        L1bc:
            java.util.List r4 = r11.getArgs()
            java.lang.Object r4 = r4.get(r1)
            boolean r6 = r4 instanceof java.util.List
            if (r6 == 0) goto L1d1
            java.util.ArrayList r6 = new java.util.ArrayList
            java.util.Collection r4 = (java.util.Collection) r4
            r6.<init>(r4)
            r5.f = r6
        L1d1:
            java.lang.Object r4 = r11.proceed()
            boolean r6 = a.Kf.b(r4)
            if (r6 == 0) goto L1de
            java.util.List r4 = (java.util.List) r4
            goto L1df
        L1de:
            r4 = r3
        L1df:
            if (r4 != 0) goto L1e7
            java.lang.Object r11 = r11.proceed()
            goto L298
        L1e7:
            a.K3$a r6 = a.K3.f148a
            r6.getClass()
            boolean r6 = a.K3.a.l()
            if (r6 == 0) goto L297
            a.jc r6 = a.K3.a.i()
            boolean r6 = r6.o
            if (r6 == 0) goto L297
            java.lang.Boolean r6 = a.K3.l
            if (r6 == 0) goto L203
            boolean r6 = r6.booleanValue()
            goto L211
        L203:
            java.util.ArrayList r6 = a.K3.a.f()
            boolean r6 = r6.isEmpty()
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r6)
            a.K3.l = r7
        L211:
            if (r6 != 0) goto L297
            a.x8 r6 = a.C0460x8.f762a
            boolean r6 = a.C0460x8.a()
            if (r6 != 0) goto L297
            java.util.ArrayList r6 = r5.c(r4)
            int r7 = r4.size()
            int r4 = r4.size()
            int r8 = r6.size()
            int r4 = r4 - r8
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "HideContactList: e() total="
            r8.<init>(r9)
            r8.append(r7)
            java.lang.String r7 = " hidden="
            r8.append(r7)
            r8.append(r4)
            java.lang.String r4 = r8.toString()
            java.lang.Object[] r4 = new java.lang.Object[]{r4}
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r4, r2)
            a.C0453x1.b(r4)
            boolean r4 = r6.isEmpty()
            if (r4 != 0) goto L283
            r5.c = r2
            java.lang.reflect.Method r2 = r5.h     // Catch: java.lang.Throwable -> L26b
            if (r2 == 0) goto L26d
            java.lang.Object r11 = r11.getThisObject()     // Catch: java.lang.Throwable -> L26b
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L26b
            r4.<init>(r6)     // Catch: java.lang.Throwable -> L26b
            java.lang.Object[] r4 = new java.lang.Object[]{r4}     // Catch: java.lang.Throwable -> L26b
            java.lang.Object r11 = r2.invoke(r11, r4)     // Catch: java.lang.Throwable -> L26b
            goto L26e
        L26b:
            r11 = move-exception
            goto L285
        L26d:
            r11 = r3
        L26e:
            boolean r2 = r11 instanceof java.util.List     // Catch: java.lang.Throwable -> L26b
            if (r2 == 0) goto L275
            r3 = r11
            java.util.List r3 = (java.util.List) r3     // Catch: java.lang.Throwable -> L26b
        L275:
            if (r3 == 0) goto L281
            boolean r11 = r3.isEmpty()     // Catch: java.lang.Throwable -> L26b
            if (r11 != 0) goto L281
            r5.c = r1
            r11 = r3
            goto L298
        L281:
            r5.c = r1
        L283:
            r11 = r6
            goto L298
        L285:
            java.lang.String r2 = "HideContactList: group-header remark failed, keep filtered"
            java.lang.Object[] r11 = new java.lang.Object[]{r2, r11}     // Catch: java.lang.Throwable -> L293
            java.lang.Object[] r11 = java.util.Arrays.copyOf(r11, r0)     // Catch: java.lang.Throwable -> L293
            a.C0453x1.e(r11)     // Catch: java.lang.Throwable -> L293
            goto L281
        L293:
            r11 = move-exception
            r5.c = r1
            throw r11
        L297:
            r11 = r4
        L298:
            return r11
        L299:
            a.C0193i9.e(r11, r4)
            a.K3$a r0 = a.K3.f148a
            r0.getClass()
            a.jc r0 = a.K3.a.i()
            boolean r3 = a.K3.a.l()
            if (r3 == 0) goto L37c
            boolean r0 = r0.f532a
            if (r0 != 0) goto L2b1
            goto L37c
        L2b1:
            java.util.List r0 = r11.getArgs()
            java.lang.Object r0 = r0.get(r2)
            java.lang.String r0 = r0.toString()
            java.util.ArrayList r3 = a.K3.a.f()
            java.util.ArrayList r4 = new java.util.ArrayList
            r5 = 10
            int r5 = a.C0312p3.g0(r3, r5)
            r4.<init>(r5)
            java.util.Iterator r3 = r3.iterator()
        L2d0:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L2e4
            java.lang.Object r5 = r3.next()
            top.mmjz.floatingclouds.bean.MaskItemBean r5 = (top.mmjz.floatingclouds.bean.MaskItemBean) r5
            java.lang.String r5 = r5.getMaskId()
            r4.add(r5)
            goto L2d0
        L2e4:
            boolean r3 = r4.isEmpty()
            if (r3 != 0) goto L377
            java.lang.Object r3 = r10.b
            a.x3 r3 = (a.C0455x3) r3
            a.Me r3 = r3.f757a
            java.lang.Object r3 = r3.a()
            a.Wc r3 = (a.Wc) r3
            r3.getClass()
            java.lang.String r5 = "input"
            a.C0193i9.e(r0, r5)
            java.util.regex.Pattern r3 = r3.f326a
            java.util.regex.Matcher r3 = r3.matcher(r0)
            boolean r3 = r3.find()
            if (r3 != 0) goto L31a
            java.lang.String r3 = "SELECT type, subtype, entity_id, aux_index, MAX(timestamp) as maxTime, count(aux_index) as msgCount, talker FROM FTS5MetaMessage"
            boolean r3 = a.Ae.H(r0, r3, r1)
            if (r3 != 0) goto L31a
            java.lang.String r3 = "SELECT FTS5MetaMessage.docid, type, subtype, entity_id, aux_index, timestamp, talker FROM FTS5MetaMessage"
            boolean r3 = a.Ae.H(r0, r3, r1)
            if (r3 == 0) goto L377
        L31a:
            java.util.List r3 = r11.getArgs()
            java.lang.String r5 = "getArgs(...)"
            a.C0193i9.d(r3, r5)
            java.util.ArrayList r3 = a.C0383t3.y0(r3)
            a.g2 r5 = new a.g2
            r6 = 4
            r5.<init>(r6)
            java.lang.String r6 = ","
            r7 = 30
            java.lang.String r4 = a.C0383t3.p0(r4, r6, r5, r7)
            java.lang.String r5 = ";"
            boolean r5 = r0.endsWith(r5)
            if (r5 == 0) goto L341
            java.lang.String r0 = a.Ce.W(r0)
        L341:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "SELECT * FROM ("
            r5.<init>(r6)
            r5.append(r0)
            java.lang.String r0 = ") AS a WHERE aux_index NOT IN ("
            r5.append(r0)
            r5.append(r4)
            java.lang.String r0 = ");"
            r5.append(r0)
            java.lang.String r0 = r5.toString()
            r3.set(r2, r0)
            java.lang.String r0 = "sql hide hit:"
            java.lang.Object r2 = r3.get(r2)
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r2}
            a.C0282n9.m(r0)
            java.lang.Object[] r0 = new java.lang.Object[r1]
            java.lang.Object[] r0 = r3.toArray(r0)
            java.lang.Object r11 = r11.proceed(r0)
            goto L380
        L377:
            java.lang.Object r11 = r11.proceed()
            goto L380
        L37c:
            java.lang.Object r11 = r11.proceed()
        L380:
            return r11
        L381:
            java.lang.Object r2 = r10.b
            a.o2 r2 = (a.C0293o2) r2
            a.C0193i9.e(r11, r4)
            r11.proceed()
            java.lang.Object r4 = r11.getThisObject()
            r2.b = r4
            boolean r4 = r2.f615a
            if (r4 == 0) goto L3b8
            boolean r4 = a.C0293o2.e()
            if (r4 == 0) goto L3b8
            java.lang.Object r11 = r11.getThisObject()
            java.lang.String r4 = "getThisObject(...)"
            a.C0193i9.d(r11, r4)
            a.K3$a r4 = a.K3.f148a
            r4.getClass()
            a.jc r4 = a.K3.a.i()
            int r4 = r4.G
            r5 = 100
            int r1 = a.Oc.C(r4, r1, r5)
            r2.a(r11, r1, r0)
        L3b8:
            return r3
    }
}
