package a;

/* JADX INFO: renamed from: a.h0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0166h0 implements java.lang.Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f489a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;
    public final /* synthetic */ java.lang.Object d;

    public /* synthetic */ RunnableC0166h0(a.fh r1, java.lang.String r2, top.mmjz.floatingclouds.plugin.IPlugin r3, a.J8 r4) {
            r0 = this;
            r1 = 4
            r0.f489a = r1
            r0.<init>()
            r0.b = r2
            r0.c = r3
            r0.d = r4
            return
    }

    public /* synthetic */ RunnableC0166h0(java.lang.Object r1, java.lang.Object r2, java.lang.Object r3, int r4) {
            r0 = this;
            r0.f489a = r4
            r0.b = r1
            r0.c = r2
            r0.d = r3
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r23 = this;
            r1 = r23
            r2 = 0
            r3 = 0
            r4 = 2
            r5 = 1
            int r0 = r1.f489a
            switch(r0) {
                case 0: goto L27e;
                case 1: goto L25d;
                case 2: goto L21d;
                case 3: goto L9d;
                case 4: goto L33;
                default: goto Lb;
            }
        Lb:
            java.lang.Object r0 = r1.b
            a.fh r0 = (a.fh) r0
            java.lang.Object r2 = r1.c
            a.J8 r2 = (a.J8) r2
            java.lang.Object r3 = r1.d
            java.util.List r3 = (java.util.List) r3
            a.fh.b(r2, r3)
            a.r8 r0 = r0.c     // Catch: java.lang.Throwable -> L20
            r0.handleHook(r2)     // Catch: java.lang.Throwable -> L20
            goto L2e
        L20:
            r0 = move-exception
            java.lang.String r2 = "WXMaskPlugin: handleHook -> hideSearchListPluginPart FAIL"
            java.lang.Object[] r0 = new java.lang.Object[]{r2, r0}
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r4)
            a.C0453x1.a(r0)
        L2e:
            boolean r0 = a.C0279n6.f595a
            a.C0279n6.q = r5
            return
        L33:
            java.lang.Object r0 = r1.b
            r2 = r0
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r0 = r1.c
            top.mmjz.floatingclouds.plugin.IPlugin r0 = (top.mmjz.floatingclouds.plugin.IPlugin) r0
            java.lang.Object r3 = r1.d
            a.J8 r3 = (a.J8) r3
            java.lang.String r6 = "WXMaskPlugin: async init -> "
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L80
            r7.<init>(r6)     // Catch: java.lang.Throwable -> L80
            r7.append(r2)     // Catch: java.lang.Throwable -> L80
            java.lang.String r8 = " START"
            r7.append(r8)     // Catch: java.lang.Throwable -> L80
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> L80
            java.lang.Object[] r7 = new java.lang.Object[]{r7}     // Catch: java.lang.Throwable -> L80
            java.lang.Object[] r7 = java.util.Arrays.copyOf(r7, r5)     // Catch: java.lang.Throwable -> L80
            a.C0453x1.b(r7)     // Catch: java.lang.Throwable -> L80
            r0.handleHook(r3)     // Catch: java.lang.Throwable -> L80
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L80
            r0.<init>(r6)     // Catch: java.lang.Throwable -> L80
            r0.append(r2)     // Catch: java.lang.Throwable -> L80
            java.lang.String r3 = " DONE"
            r0.append(r3)     // Catch: java.lang.Throwable -> L80
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L80
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch: java.lang.Throwable -> L80
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r5)     // Catch: java.lang.Throwable -> L80
            a.C0453x1.b(r0)     // Catch: java.lang.Throwable -> L80
            a.Wf r0 = a.Wf.f330a     // Catch: java.lang.Throwable -> L80
            goto L85
        L80:
            r0 = move-exception
            a.wd$a r0 = a.C0465xd.a(r0)
        L85:
            java.lang.Throwable r0 = a.C0447wd.a(r0)
            if (r0 == 0) goto L9c
            java.lang.String r3 = " FAIL"
            java.lang.String r2 = a.C0487z.g(r6, r2, r3)
            java.lang.Object[] r0 = new java.lang.Object[]{r2, r0}
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r4)
            a.C0453x1.a(r0)
        L9c:
            return
        L9d:
            java.lang.Object r0 = r1.b
            r6 = r0
            a.h8 r6 = (a.C0174h8) r6
            java.lang.Object r7 = r1.c
            java.lang.Object r8 = r1.d
            java.lang.String r0 = "HideContactList: refreshContactList BLOCKED in-handler, adapter="
            boolean r9 = r6.e(r7)     // Catch: java.lang.Throwable -> Ld8
            if (r9 != 0) goto Ldb
            java.lang.Class r3 = r7.getClass()     // Catch: java.lang.Throwable -> Ld8
            java.lang.String r3 = r3.getName()     // Catch: java.lang.Throwable -> Ld8
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Ld8
            r7.<init>(r0)     // Catch: java.lang.Throwable -> Ld8
            r7.append(r3)     // Catch: java.lang.Throwable -> Ld8
            java.lang.String r0 = " data not compatible"
            r7.append(r0)     // Catch: java.lang.Throwable -> Ld8
            java.lang.String r0 = r7.toString()     // Catch: java.lang.Throwable -> Ld8
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch: java.lang.Throwable -> Ld8
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r5)     // Catch: java.lang.Throwable -> Ld8
            a.C0453x1.e(r0)     // Catch: java.lang.Throwable -> Ld8
            r6.d = r2     // Catch: java.lang.Throwable -> Ld8
            r6.e = r2     // Catch: java.lang.Throwable -> Ld8
            goto L202
        Ld8:
            r0 = move-exception
            goto L205
        Ldb:
            a.a5$c r0 = r6.b     // Catch: java.lang.Throwable -> Ld8
            java.lang.String r9 = ""
            if (r0 == 0) goto Le4
            java.lang.String r0 = r0.f387a     // Catch: java.lang.Throwable -> Ld8
            goto Le5
        Le4:
            r0 = r9
        Le5:
            java.lang.Object r0 = a.C0174h8.d(r8, r0)     // Catch: java.lang.Throwable -> Ld8
            boolean r10 = a.Kf.b(r0)     // Catch: java.lang.Throwable -> Ld8
            if (r10 == 0) goto Lf2
            java.util.List r0 = (java.util.List) r0     // Catch: java.lang.Throwable -> Ld8
            goto Lf3
        Lf2:
            r0 = r2
        Lf3:
            if (r0 != 0) goto Lfa
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Ld8
            r0.<init>()     // Catch: java.lang.Throwable -> Ld8
        Lfa:
            r10 = r0
            a.a5$c r0 = r6.b     // Catch: java.lang.Throwable -> Ld8
            if (r0 == 0) goto L102
            java.lang.String r0 = r0.b     // Catch: java.lang.Throwable -> Ld8
            goto L103
        L102:
            r0 = r9
        L103:
            java.lang.Object r0 = a.C0174h8.d(r8, r0)     // Catch: java.lang.Throwable -> Ld8
            boolean r11 = r0 instanceof java.util.List     // Catch: java.lang.Throwable -> Ld8
            if (r11 == 0) goto L10e
            java.util.List r0 = (java.util.List) r0     // Catch: java.lang.Throwable -> Ld8
            goto L10f
        L10e:
            r0 = r2
        L10f:
            if (r0 == 0) goto L11c
            boolean r11 = r0.isEmpty()     // Catch: java.lang.Throwable -> Ld8
            if (r11 != 0) goto L118
            goto L119
        L118:
            r0 = r2
        L119:
            if (r0 == 0) goto L11c
            goto L11e
        L11c:
            java.util.ArrayList r0 = r6.f     // Catch: java.lang.Throwable -> Ld8
        L11e:
            if (r0 == 0) goto L170
            boolean r11 = r0.isEmpty()     // Catch: java.lang.Throwable -> Ld8
            if (r11 != 0) goto L170
            java.lang.reflect.Method r11 = r6.h     // Catch: java.lang.Throwable -> Ld8
            if (r11 == 0) goto L170
            java.lang.reflect.Method r11 = r6.h     // Catch: java.lang.Throwable -> L14b
            a.C0193i9.b(r11)     // Catch: java.lang.Throwable -> L14b
            r11.setAccessible(r5)     // Catch: java.lang.Throwable -> L14b
            java.lang.reflect.Method r11 = r6.h     // Catch: java.lang.Throwable -> L14b
            a.C0193i9.b(r11)     // Catch: java.lang.Throwable -> L14b
            java.util.ArrayList r12 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L14b
            r12.<init>(r0)     // Catch: java.lang.Throwable -> L14b
            java.lang.Object[] r0 = new java.lang.Object[]{r12}     // Catch: java.lang.Throwable -> L14b
            java.lang.Object r0 = r11.invoke(r8, r0)     // Catch: java.lang.Throwable -> L14b
            boolean r11 = r0 instanceof java.util.List     // Catch: java.lang.Throwable -> L14b
            if (r11 == 0) goto L14d
            java.util.List r0 = (java.util.List) r0     // Catch: java.lang.Throwable -> L14b
            goto L14e
        L14b:
            r0 = move-exception
            goto L158
        L14d:
            r0 = r2
        L14e:
            if (r0 == 0) goto L156
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L14b
            r11.<init>(r0)     // Catch: java.lang.Throwable -> L14b
            goto L15c
        L156:
            r11 = r2
            goto L15c
        L158:
            a.wd$a r11 = a.C0465xd.a(r0)     // Catch: java.lang.Throwable -> Ld8
        L15c:
            boolean r0 = r11 instanceof a.C0447wd.a     // Catch: java.lang.Throwable -> Ld8
            if (r0 == 0) goto L161
            r11 = r2
        L161:
            java.util.ArrayList r11 = (java.util.ArrayList) r11     // Catch: java.lang.Throwable -> Ld8
            if (r11 == 0) goto L166
            goto L179
        L166:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Ld8
            r0.<init>(r10)     // Catch: java.lang.Throwable -> Ld8
            java.util.ArrayList r11 = r6.c(r0)     // Catch: java.lang.Throwable -> Ld8
            goto L179
        L170:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Ld8
            r0.<init>(r10)     // Catch: java.lang.Throwable -> Ld8
            java.util.ArrayList r11 = r6.c(r0)     // Catch: java.lang.Throwable -> Ld8
        L179:
            java.util.ArrayList r0 = a.C0174h8.i(r7)     // Catch: java.lang.Throwable -> Ld8
            a.a5$c r6 = r6.b     // Catch: java.lang.Throwable -> Ld8
            if (r6 == 0) goto L183
            java.lang.String r9 = r6.f387a     // Catch: java.lang.Throwable -> Ld8
        L183:
            java.lang.Object r6 = a.C0174h8.d(r8, r9)     // Catch: java.lang.Throwable -> Ld8
            boolean r8 = a.Kf.b(r6)     // Catch: java.lang.Throwable -> Ld8
            if (r8 == 0) goto L190
            java.util.List r6 = (java.util.List) r6     // Catch: java.lang.Throwable -> Ld8
            goto L191
        L190:
            r6 = r2
        L191:
            if (r0 == 0) goto L19a
            r0.clear()     // Catch: java.lang.Throwable -> Ld8
            r0.addAll(r11)     // Catch: java.lang.Throwable -> Ld8
            goto L1a2
        L19a:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Ld8
            r0.<init>(r11)     // Catch: java.lang.Throwable -> Ld8
            a.C0174h8.l(r7, r0)     // Catch: java.lang.Throwable -> Ld8
        L1a2:
            if (r6 == 0) goto L1aa
            r6.clear()     // Catch: java.lang.Throwable -> Ld8
            r6.addAll(r11)     // Catch: java.lang.Throwable -> Ld8
        L1aa:
            java.lang.Class r0 = r7.getClass()     // Catch: java.lang.Throwable -> Ld8
            java.lang.reflect.Method[] r0 = r0.getMethods()     // Catch: java.lang.Throwable -> Ld8
            java.lang.String r6 = "getMethods(...)"
            a.C0193i9.d(r0, r6)     // Catch: java.lang.Throwable -> Ld8
            int r6 = r0.length     // Catch: java.lang.Throwable -> Ld8
        L1b8:
            if (r3 >= r6) goto L1d7
            r8 = r0[r3]     // Catch: java.lang.Throwable -> Ld8
            java.lang.String r9 = r8.getName()     // Catch: java.lang.Throwable -> Ld8
            java.lang.String r10 = "notifyDataSetChanged"
            boolean r9 = a.C0193i9.a(r9, r10)     // Catch: java.lang.Throwable -> Ld8
            if (r9 == 0) goto L1d5
            java.lang.Class[] r9 = r8.getParameterTypes()     // Catch: java.lang.Throwable -> Ld8
            java.lang.String r10 = "getParameterTypes(...)"
            a.C0193i9.d(r9, r10)     // Catch: java.lang.Throwable -> Ld8
            int r9 = r9.length     // Catch: java.lang.Throwable -> Ld8
            if (r9 != 0) goto L1d5
            goto L1d8
        L1d5:
            int r3 = r3 + r5
            goto L1b8
        L1d7:
            r8 = r2
        L1d8:
            if (r8 == 0) goto L1dd
            r8.setAccessible(r5)     // Catch: java.lang.Throwable -> Ld8
        L1dd:
            if (r8 == 0) goto L1e2
            r8.invoke(r7, r2)     // Catch: java.lang.Throwable -> Ld8
        L1e2:
            int r0 = r11.size()     // Catch: java.lang.Throwable -> Ld8
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Ld8
            r2.<init>()     // Catch: java.lang.Throwable -> Ld8
            java.lang.String r3 = "HideContactList: refreshContactList -> e() re-run + notifyDataSetChanged (in-place), newSize="
            r2.append(r3)     // Catch: java.lang.Throwable -> Ld8
            r2.append(r0)     // Catch: java.lang.Throwable -> Ld8
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> Ld8
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch: java.lang.Throwable -> Ld8
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r5)     // Catch: java.lang.Throwable -> Ld8
            a.C0453x1.b(r0)     // Catch: java.lang.Throwable -> Ld8
        L202:
            a.Wf r0 = a.Wf.f330a     // Catch: java.lang.Throwable -> Ld8
            goto L209
        L205:
            a.wd$a r0 = a.C0465xd.a(r0)
        L209:
            java.lang.Throwable r0 = a.C0447wd.a(r0)
            if (r0 == 0) goto L21c
            java.lang.String r2 = "HideContactList: refreshContactList failed"
            java.lang.Object[] r0 = new java.lang.Object[]{r2, r0}
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r4)
            a.C0453x1.e(r0)
        L21c:
            return
        L21d:
            java.lang.Object r0 = r1.b
            androidx.emoji2.text.EmojiCompatInitializer$b r0 = (androidx.emoji2.text.EmojiCompatInitializer.b) r0
            java.lang.Object r2 = r1.c
            androidx.emoji2.text.c$h r2 = (androidx.emoji2.text.c.h) r2
            java.lang.Object r3 = r1.d
            java.util.concurrent.ThreadPoolExecutor r3 = (java.util.concurrent.ThreadPoolExecutor) r3
            r0.getClass()
            android.content.Context r0 = r0.f890a     // Catch: java.lang.Throwable -> L249
            androidx.emoji2.text.e r0 = androidx.emoji2.text.a.a(r0)     // Catch: java.lang.Throwable -> L249
            if (r0 == 0) goto L24e
            androidx.emoji2.text.c$g r4 = r0.f894a     // Catch: java.lang.Throwable -> L249
            androidx.emoji2.text.e$b r4 = (androidx.emoji2.text.e.b) r4     // Catch: java.lang.Throwable -> L249
            java.lang.Object r5 = r4.d     // Catch: java.lang.Throwable -> L249
            monitor-enter(r5)     // Catch: java.lang.Throwable -> L249
            r4.f = r3     // Catch: java.lang.Throwable -> L24b
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L24b
            androidx.emoji2.text.c$g r0 = r0.f894a     // Catch: java.lang.Throwable -> L249
            androidx.emoji2.text.d r4 = new androidx.emoji2.text.d     // Catch: java.lang.Throwable -> L249
            r4.<init>(r2, r3)     // Catch: java.lang.Throwable -> L249
            r0.a(r4)     // Catch: java.lang.Throwable -> L249
            goto L25c
        L249:
            r0 = move-exception
            goto L256
        L24b:
            r0 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L24b
            throw r0     // Catch: java.lang.Throwable -> L249
        L24e:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> L249
            java.lang.String r4 = "EmojiCompat font provider not available on this device."
            r0.<init>(r4)     // Catch: java.lang.Throwable -> L249
            throw r0     // Catch: java.lang.Throwable -> L249
        L256:
            r2.a(r0)
            r3.shutdown()
        L25c:
            return
        L25d:
            java.lang.String r0 = "$container"
            java.lang.Object r2 = r1.b
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            a.C0193i9.e(r2, r0)
            java.lang.String r0 = "this$0"
            java.lang.Object r3 = r1.d
            androidx.fragment.app.a$a r3 = (androidx.fragment.app.a.C0015a) r3
            a.C0193i9.e(r3, r0)
            java.lang.Object r0 = r1.c
            android.view.View r0 = (android.view.View) r0
            r2.endViewTransition(r0)
            androidx.fragment.app.a$b r0 = r3.c
            androidx.fragment.app.f$c r0 = r0.f904a
            r0.c(r3)
            return
        L27e:
            java.lang.String r6 = ""
            java.lang.Object r0 = r1.b
            r7 = r0
            a.c5 r7 = (a.C0081c5) r7
            java.lang.Object r0 = r1.c
            r8 = r0
            android.app.ProgressDialog r8 = (android.app.ProgressDialog) r8
            java.lang.Object r0 = r1.d
            r9 = r0
            android.app.Activity r9 = (android.app.Activity) r9
            a.i0 r10 = new a.i0
            r10.<init>(r3, r8)
            java.lang.String r11 = "FAIL"
            java.lang.String r0 = "DexKit: bridge="
            boolean r12 = a.C0081c5.g
            if (r12 == 0) goto L2a2
            java.lang.String r0 = "扫描已在运行中"
            a.C0081c5.h = r0
            goto L449
        L2a2:
            a.C0081c5.g = r5
            a.C0081c5.h = r2
            r12 = 5
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch: java.lang.Exception -> L3bb
            java.lang.String r13 = "初始化 DexKit..."
            r10.e(r12, r13)     // Catch: java.lang.Exception -> L3bb
            java.lang.String r12 = "dexkit"
            java.lang.System.loadLibrary(r12)     // Catch: java.lang.Throwable -> L2b6
            goto L2b9
        L2b6:
            java.lang.System.loadLibrary(r12)     // Catch: java.lang.Throwable -> L2c2
        L2b9:
            a.w1 r12 = a.C0435w1.k     // Catch: java.lang.Exception -> L3bb
            java.lang.String r13 = r7.b     // Catch: java.lang.Exception -> L3bb
            boolean r12 = r12.E(r13)     // Catch: java.lang.Exception -> L3bb
            goto L2c3
        L2c2:
            r12 = r3
        L2c3:
            java.lang.String r13 = "OK"
            if (r12 == 0) goto L2c9
            r14 = r13
            goto L2cb
        L2c9:
            java.lang.String r14 = "NULL (fallback to cache)"
        L2cb:
            java.lang.String r0 = r0.concat(r14)     // Catch: java.lang.Exception -> L3bb
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch: java.lang.Exception -> L3bb
            a.C0453x1.b(r0)     // Catch: java.lang.Exception -> L3bb
            boolean r0 = a.C0279n6.f595a     // Catch: java.lang.Exception -> L3bb
            java.lang.String r0 = "__bridge__"
            java.lang.String r14 = "SKIP"
            if (r12 == 0) goto L2e0
            r15 = r13
            goto L2e1
        L2e0:
            r15 = r14
        L2e1:
            a.C0279n6.c(r0, r15, r6)     // Catch: java.lang.Exception -> L3bb
            java.util.List<a.c5$a> r0 = r7.d     // Catch: java.lang.Exception -> L3bb
            java.util.Iterator r15 = r0.iterator()     // Catch: java.lang.Exception -> L3bb
            r16 = r3
        L2ec:
            boolean r0 = r15.hasNext()     // Catch: java.lang.Exception -> L3bb
            if (r0 == 0) goto L3eb
            java.lang.Object r0 = r15.next()     // Catch: java.lang.Exception -> L3bb
            r3 = r0
            a.c5$a r3 = (a.C0081c5.a) r3     // Catch: java.lang.Exception -> L3bb
            int r0 = r16 * 100
            int r2 = r7.e     // Catch: java.lang.Exception -> L3bb
            int r0 = r0 / r2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Exception -> L3bb
            java.lang.String r2 = r3.f417a     // Catch: java.lang.Exception -> L3bb
            r10.e(r0, r2)     // Catch: java.lang.Exception -> L3bb
            a.s7<org.json.JSONObject> r0 = r3.d     // Catch: java.lang.Exception -> L37e
            java.lang.Object r0 = r0.a()     // Catch: java.lang.Exception -> L37e
            org.json.JSONObject r0 = (org.json.JSONObject) r0     // Catch: java.lang.Exception -> L37e
            if (r0 == 0) goto L380
            java.lang.String r2 = r3.b     // Catch: java.lang.Exception -> L37e
            r7.a(r2, r0)     // Catch: java.lang.Exception -> L37e
            boolean r2 = a.C0279n6.f595a     // Catch: java.lang.Exception -> L37e
            java.lang.String r2 = r3.f417a     // Catch: java.lang.Exception -> L37e
            java.util.Iterator r0 = r0.keys()     // Catch: java.lang.Exception -> L37e
            r19 = r5
            java.lang.String r5 = "keys(...)"
            a.C0193i9.d(r0, r5)     // Catch: java.lang.Exception -> L37e
            a.M1 r5 = new a.M1     // Catch: java.lang.Exception -> L37e
            r5.<init>(r4, r0)     // Catch: java.lang.Exception -> L37e
            a.L3 r0 = new a.L3     // Catch: java.lang.Exception -> L37e
            r0.<init>(r5)     // Catch: java.lang.Exception -> L37e
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L37e
            r5.<init>()     // Catch: java.lang.Exception -> L37e
            r5.append(r6)     // Catch: java.lang.Exception -> L37e
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Exception -> L37e
            r20 = 0
        L33d:
            boolean r21 = r0.hasNext()     // Catch: java.lang.Exception -> L37e
            if (r21 == 0) goto L362
            java.lang.Object r4 = r0.next()     // Catch: java.lang.Exception -> L37e
            r22 = r0
            int r0 = r20 + 1
            r1 = r19
            if (r0 <= r1) goto L354
            java.lang.String r1 = ","
            r5.append(r1)     // Catch: java.lang.Exception -> L37e
        L354:
            r1 = 0
            a.C0282n9.e(r5, r4, r1)     // Catch: java.lang.Exception -> L37e
            r1 = r23
            r20 = r0
            r0 = r22
            r4 = 2
            r19 = 1
            goto L33d
        L362:
            r5.append(r6)     // Catch: java.lang.Exception -> L37e
            java.lang.String r0 = r5.toString()     // Catch: java.lang.Exception -> L37e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L37e
            r1.<init>()     // Catch: java.lang.Exception -> L37e
            java.lang.String r4 = "keys="
            r1.append(r4)     // Catch: java.lang.Exception -> L37e
            r1.append(r0)     // Catch: java.lang.Exception -> L37e
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Exception -> L37e
            a.C0279n6.c(r2, r13, r0)     // Catch: java.lang.Exception -> L37e
            goto L3c0
        L37e:
            r0 = move-exception
            goto L38f
        L380:
            boolean r0 = a.C0279n6.f595a     // Catch: java.lang.Exception -> L37e
            java.lang.String r0 = r3.f417a     // Catch: java.lang.Exception -> L37e
            if (r12 == 0) goto L388
            r1 = r11
            goto L389
        L388:
            r1 = r14
        L389:
            java.lang.String r2 = "no result"
            a.C0279n6.c(r0, r1, r2)     // Catch: java.lang.Exception -> L37e
            goto L3c0
        L38f:
            java.lang.String r1 = r3.f417a     // Catch: java.lang.Exception -> L3bb
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L3bb
            r2.<init>()     // Catch: java.lang.Exception -> L3bb
            java.lang.String r4 = "DexKit: "
            r2.append(r4)     // Catch: java.lang.Exception -> L3bb
            r2.append(r1)     // Catch: java.lang.Exception -> L3bb
            java.lang.String r1 = " scan error"
            r2.append(r1)     // Catch: java.lang.Exception -> L3bb
            java.lang.String r1 = r2.toString()     // Catch: java.lang.Exception -> L3bb
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r0}     // Catch: java.lang.Exception -> L3bb
            a.C0453x1.e(r1)     // Catch: java.lang.Exception -> L3bb
            boolean r1 = a.C0279n6.f595a     // Catch: java.lang.Exception -> L3bb
            java.lang.String r1 = r3.f417a     // Catch: java.lang.Exception -> L3bb
            java.lang.String r0 = r0.getMessage()     // Catch: java.lang.Exception -> L3bb
            if (r0 != 0) goto L3bd
            java.lang.String r0 = "unknown"
            goto L3bd
        L3bb:
            r0 = move-exception
            goto L424
        L3bd:
            a.C0279n6.c(r1, r11, r0)     // Catch: java.lang.Exception -> L3bb
        L3c0:
            int r0 = r3.c     // Catch: java.lang.Exception -> L3bb
            int r16 = r16 + r0
            int r0 = r16 * 100
            int r1 = r7.e     // Catch: java.lang.Exception -> L3bb
            int r0 = r0 / r1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Exception -> L3bb
            java.lang.String r1 = r3.f417a     // Catch: java.lang.Exception -> L3bb
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L3bb
            r2.<init>()     // Catch: java.lang.Exception -> L3bb
            r2.append(r1)     // Catch: java.lang.Exception -> L3bb
            java.lang.String r1 = " 完成"
            r2.append(r1)     // Catch: java.lang.Exception -> L3bb
            java.lang.String r1 = r2.toString()     // Catch: java.lang.Exception -> L3bb
            r10.e(r0, r1)     // Catch: java.lang.Exception -> L3bb
            r1 = r23
            r2 = 0
            r3 = 0
            r4 = 2
            r5 = 1
            goto L2ec
        L3eb:
            android.app.Activity r0 = r7.f416a     // Catch: java.lang.Exception -> L413
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch: java.lang.Exception -> L413
            java.lang.String r1 = "com.tencent.mm"
            r2 = 0
            android.content.pm.PackageInfo r0 = r0.getPackageInfo(r1, r2)     // Catch: java.lang.Exception -> L413
            int r0 = r0.versionCode     // Catch: java.lang.Exception -> L413
            android.content.SharedPreferences r1 = r7.c     // Catch: java.lang.Exception -> L413
            android.content.SharedPreferences$Editor r1 = r1.edit()     // Catch: java.lang.Exception -> L413
            java.lang.String r2 = "last_version_code"
            android.content.SharedPreferences$Editor r0 = r1.putInt(r2, r0)     // Catch: java.lang.Exception -> L413
            java.lang.String r1 = "scan_status"
            long r2 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> L413
            android.content.SharedPreferences$Editor r0 = r0.putLong(r1, r2)     // Catch: java.lang.Exception -> L413
            r0.apply()     // Catch: java.lang.Exception -> L413
        L413:
            boolean r0 = a.C0279n6.f595a     // Catch: java.lang.Exception -> L3bb
            r19 = 1
            a.C0279n6.n = r19     // Catch: java.lang.Exception -> L3bb
            r18 = 0
            a.C0279n6.p = r18     // Catch: java.lang.Exception -> L3bb
            r17 = 0
            a.C0081c5.g = r17     // Catch: java.lang.Exception -> L3bb
            r3 = r19
            goto L449
        L424:
            java.lang.String r1 = r0.getMessage()
            java.lang.String r2 = "扫描异常: "
            java.lang.String r1 = a.C0487z.k(r2, r1)
            a.C0081c5.h = r1
            java.lang.String r1 = "DexKit: scanAll failed"
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r0}
            a.C0453x1.a(r1)
            boolean r1 = a.C0279n6.f595a
            java.lang.String r0 = r0.getMessage()
            r17 = 0
            a.C0279n6.n = r17
            a.C0279n6.p = r0
            a.C0081c5.g = r17
            r3 = r17
        L449:
            java.lang.String r0 = a.C0081c5.h
            android.os.Handler r1 = a.C0255m0.b
            a.j0 r2 = new a.j0
            r2.<init>(r3, r9, r0, r8)
            r1.post(r2)
            return
    }
}
