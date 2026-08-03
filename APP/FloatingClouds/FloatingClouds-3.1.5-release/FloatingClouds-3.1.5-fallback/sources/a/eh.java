package a;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class eh implements java.util.concurrent.Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f463a;
    public final /* synthetic */ top.mmjz.floatingclouds.plugin.IPlugin b;
    public final /* synthetic */ a.J8 c;

    public /* synthetic */ eh(top.mmjz.floatingclouds.plugin.IPlugin r1, a.J8 r2, int r3) {
            r0 = this;
            r0.f463a = r3
            r0.b = r1
            r0.c = r2
            r0.<init>()
            return
    }

    @Override // java.util.concurrent.Callable
    public final java.lang.Object call() {
            r14 = this;
            java.lang.String r0 = "FAIL"
            r1 = 2
            r2 = 0
            java.lang.String r3 = "OK"
            java.lang.String r4 = "ms)"
            r5 = 1
            int r6 = r14.f463a
            switch(r6) {
                case 0: goto L2ed;
                case 1: goto L269;
                case 2: goto L1a4;
                case 3: goto L120;
                case 4: goto L9c;
                case 5: goto L18;
                default: goto Le;
            }
        Le:
            top.mmjz.floatingclouds.plugin.IPlugin r0 = r14.b
            a.J8 r1 = r14.c
            r0.handleHook(r1)
            a.Wf r0 = a.Wf.f330a
            return r0
        L18:
            top.mmjz.floatingclouds.plugin.IPlugin r6 = r14.b
            a.fh r6 = (a.fh) r6
            a.J8 r7 = r14.c
            java.lang.String r8 = "WXMaskPlugin: handleHook -> hideRecentForwardPluginPart START (separate thread)"
            java.lang.Object[] r8 = new java.lang.Object[]{r8}
            java.lang.Object[] r8 = java.util.Arrays.copyOf(r8, r5)
            a.C0453x1.b(r8)
            long r8 = java.lang.System.currentTimeMillis()
            a.q8 r6 = r6.p     // Catch: java.lang.Throwable -> L37
            r6.handleHook(r7)     // Catch: java.lang.Throwable -> L37
            a.Wf r6 = a.Wf.f330a     // Catch: java.lang.Throwable -> L37
            goto L3c
        L37:
            r6 = move-exception
            a.wd$a r6 = a.C0465xd.a(r6)
        L3c:
            boolean r7 = r6 instanceof a.C0447wd.a
            java.lang.String r10 = "hideRecentForwardPluginPart"
            if (r7 != 0) goto L69
            r7 = r6
            a.Wf r7 = (a.Wf) r7
            long r11 = java.lang.System.currentTimeMillis()
            long r11 = r11 - r8
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r13 = "WXMaskPlugin: handleHook -> hideRecentForwardPluginPart DONE ("
            r7.<init>(r13)
            r7.append(r11)
            r7.append(r4)
            java.lang.String r7 = r7.toString()
            java.lang.Object[] r7 = new java.lang.Object[]{r7}
            java.lang.Object[] r5 = java.util.Arrays.copyOf(r7, r5)
            a.C0453x1.b(r5)
            a.C0279n6.d(r10, r3, r11, r2)
        L69:
            java.lang.Throwable r2 = a.C0447wd.a(r6)
            if (r2 == 0) goto L99
            long r5 = java.lang.System.currentTimeMillis()
            long r5 = r5 - r8
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r7 = "WXMaskPlugin: handleHook -> hideRecentForwardPluginPart FAIL (separate thread) ("
            r3.<init>(r7)
            r3.append(r5)
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.Object[] r3 = new java.lang.Object[]{r3, r2}
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r3, r1)
            a.C0453x1.a(r1)
            boolean r1 = a.C0279n6.f595a
            java.lang.String r1 = r2.getMessage()
            a.C0279n6.d(r10, r0, r5, r1)
        L99:
            a.Wf r0 = a.Wf.f330a
            return r0
        L9c:
            top.mmjz.floatingclouds.plugin.IPlugin r6 = r14.b
            a.fh r6 = (a.fh) r6
            a.J8 r7 = r14.c
            java.lang.String r8 = "WXMaskPlugin: handleHook -> dotIndicator START (separate thread)"
            java.lang.Object[] r8 = new java.lang.Object[]{r8}
            java.lang.Object[] r8 = java.util.Arrays.copyOf(r8, r5)
            a.C0453x1.b(r8)
            long r8 = java.lang.System.currentTimeMillis()
            a.v5 r6 = r6.n     // Catch: java.lang.Throwable -> Lbb
            r6.handleHook(r7)     // Catch: java.lang.Throwable -> Lbb
            a.Wf r6 = a.Wf.f330a     // Catch: java.lang.Throwable -> Lbb
            goto Lc0
        Lbb:
            r6 = move-exception
            a.wd$a r6 = a.C0465xd.a(r6)
        Lc0:
            boolean r7 = r6 instanceof a.C0447wd.a
            java.lang.String r10 = "dotIndicator"
            if (r7 != 0) goto Led
            r7 = r6
            a.Wf r7 = (a.Wf) r7
            long r11 = java.lang.System.currentTimeMillis()
            long r11 = r11 - r8
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r13 = "WXMaskPlugin: handleHook -> dotIndicator DONE ("
            r7.<init>(r13)
            r7.append(r11)
            r7.append(r4)
            java.lang.String r7 = r7.toString()
            java.lang.Object[] r7 = new java.lang.Object[]{r7}
            java.lang.Object[] r5 = java.util.Arrays.copyOf(r7, r5)
            a.C0453x1.b(r5)
            a.C0279n6.d(r10, r3, r11, r2)
        Led:
            java.lang.Throwable r2 = a.C0447wd.a(r6)
            if (r2 == 0) goto L11d
            long r5 = java.lang.System.currentTimeMillis()
            long r5 = r5 - r8
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r7 = "WXMaskPlugin: handleHook -> dotIndicator FAIL (separate thread) ("
            r3.<init>(r7)
            r3.append(r5)
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.Object[] r3 = new java.lang.Object[]{r3, r2}
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r3, r1)
            a.C0453x1.a(r1)
            boolean r1 = a.C0279n6.f595a
            java.lang.String r1 = r2.getMessage()
            a.C0279n6.d(r10, r0, r5, r1)
        L11d:
            a.Wf r0 = a.Wf.f330a
            return r0
        L120:
            top.mmjz.floatingclouds.plugin.IPlugin r6 = r14.b
            a.fh r6 = (a.fh) r6
            a.J8 r7 = r14.c
            java.lang.String r8 = "WXMaskPlugin: handleHook -> boldBottomTab START (separate thread)"
            java.lang.Object[] r8 = new java.lang.Object[]{r8}
            java.lang.Object[] r8 = java.util.Arrays.copyOf(r8, r5)
            a.C0453x1.b(r8)
            long r8 = java.lang.System.currentTimeMillis()
            a.o2 r6 = r6.m     // Catch: java.lang.Throwable -> L13f
            r6.handleHook(r7)     // Catch: java.lang.Throwable -> L13f
            a.Wf r6 = a.Wf.f330a     // Catch: java.lang.Throwable -> L13f
            goto L144
        L13f:
            r6 = move-exception
            a.wd$a r6 = a.C0465xd.a(r6)
        L144:
            boolean r7 = r6 instanceof a.C0447wd.a
            java.lang.String r10 = "boldBottomTab"
            if (r7 != 0) goto L171
            r7 = r6
            a.Wf r7 = (a.Wf) r7
            long r11 = java.lang.System.currentTimeMillis()
            long r11 = r11 - r8
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r13 = "WXMaskPlugin: handleHook -> boldBottomTab DONE ("
            r7.<init>(r13)
            r7.append(r11)
            r7.append(r4)
            java.lang.String r7 = r7.toString()
            java.lang.Object[] r7 = new java.lang.Object[]{r7}
            java.lang.Object[] r5 = java.util.Arrays.copyOf(r7, r5)
            a.C0453x1.b(r5)
            a.C0279n6.d(r10, r3, r11, r2)
        L171:
            java.lang.Throwable r2 = a.C0447wd.a(r6)
            if (r2 == 0) goto L1a1
            long r5 = java.lang.System.currentTimeMillis()
            long r5 = r5 - r8
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r7 = "WXMaskPlugin: handleHook -> boldBottomTab FAIL (separate thread) ("
            r3.<init>(r7)
            r3.append(r5)
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.Object[] r3 = new java.lang.Object[]{r3, r2}
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r3, r1)
            a.C0453x1.a(r1)
            boolean r1 = a.C0279n6.f595a
            java.lang.String r1 = r2.getMessage()
            a.C0279n6.d(r10, r0, r5, r1)
        L1a1:
            a.Wf r0 = a.Wf.f330a
            return r0
        L1a4:
            top.mmjz.floatingclouds.plugin.IPlugin r6 = r14.b
            a.fh r6 = (a.fh) r6
            a.J8 r7 = r14.c
            java.lang.String r8 = "com.tencent.mm"
            java.lang.String r9 = "WXMaskPlugin: handleHook -> hideStorageParts START (separate thread)"
            java.lang.Object[] r9 = new java.lang.Object[]{r9}
            java.lang.Object[] r9 = java.util.Arrays.copyOf(r9, r5)
            a.C0453x1.b(r9)
            long r9 = java.lang.System.currentTimeMillis()
            org.luckypray.dexkit.DexKitBridge r11 = a.C0435w1.l     // Catch: java.lang.Throwable -> L1f6
            if (r11 == 0) goto L1c2
            goto L1f8
        L1c2:
            android.content.Context r11 = a.C0435w1.p     // Catch: java.lang.Throwable -> L1f6
            if (r11 == 0) goto L1f8
            java.lang.String r12 = r7.b     // Catch: java.lang.Throwable -> L1f6
            boolean r12 = a.C0193i9.a(r12, r8)     // Catch: java.lang.Throwable -> L1f6
            if (r12 == 0) goto L1f8
            android.content.pm.PackageManager r11 = r11.getPackageManager()     // Catch: java.lang.Throwable -> L1da
            r12 = 0
            android.content.pm.ApplicationInfo r8 = r11.getApplicationInfo(r8, r12)     // Catch: java.lang.Throwable -> L1da
            java.lang.String r8 = r8.sourceDir     // Catch: java.lang.Throwable -> L1da
            goto L1df
        L1da:
            r8 = move-exception
            a.wd$a r8 = a.C0465xd.a(r8)     // Catch: java.lang.Throwable -> L1f6
        L1df:
            boolean r11 = r8 instanceof a.C0447wd.a     // Catch: java.lang.Throwable -> L1f6
            if (r11 == 0) goto L1e4
            r8 = r2
        L1e4:
            java.lang.String r8 = (java.lang.String) r8     // Catch: java.lang.Throwable -> L1f6
            if (r8 == 0) goto L1f8
            a.w1 r11 = a.C0435w1.k     // Catch: java.lang.Throwable -> L1f6
            r11.E(r8)     // Catch: java.lang.Throwable -> L1f6
            a.if r8 = a.Cif.f512a     // Catch: java.lang.Throwable -> L1f6
            r8.getClass()     // Catch: java.lang.Throwable -> L1f6
            a.Cif.c()     // Catch: java.lang.Throwable -> L1f6
            goto L1f8
        L1f6:
            r6 = move-exception
            goto L205
        L1f8:
            a.A8 r8 = r6.k     // Catch: java.lang.Throwable -> L1f6
            r8.handleHook(r7)     // Catch: java.lang.Throwable -> L1f6
            a.z8 r6 = r6.D     // Catch: java.lang.Throwable -> L1f6
            r6.handleHook(r7)     // Catch: java.lang.Throwable -> L1f6
            a.Wf r6 = a.Wf.f330a     // Catch: java.lang.Throwable -> L1f6
            goto L209
        L205:
            a.wd$a r6 = a.C0465xd.a(r6)
        L209:
            boolean r7 = r6 instanceof a.C0447wd.a
            java.lang.String r8 = "hideStorageParts"
            if (r7 != 0) goto L236
            r7 = r6
            a.Wf r7 = (a.Wf) r7
            long r11 = java.lang.System.currentTimeMillis()
            long r11 = r11 - r9
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r13 = "WXMaskPlugin: handleHook -> hideStorageParts DONE ("
            r7.<init>(r13)
            r7.append(r11)
            r7.append(r4)
            java.lang.String r7 = r7.toString()
            java.lang.Object[] r7 = new java.lang.Object[]{r7}
            java.lang.Object[] r5 = java.util.Arrays.copyOf(r7, r5)
            a.C0453x1.b(r5)
            a.C0279n6.d(r8, r3, r11, r2)
        L236:
            java.lang.Throwable r2 = a.C0447wd.a(r6)
            if (r2 == 0) goto L266
            long r5 = java.lang.System.currentTimeMillis()
            long r5 = r5 - r9
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r7 = "WXMaskPlugin: handleHook -> hideStorageParts FAIL (separate thread) ("
            r3.<init>(r7)
            r3.append(r5)
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.Object[] r3 = new java.lang.Object[]{r3, r2}
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r3, r1)
            a.C0453x1.a(r1)
            boolean r1 = a.C0279n6.f595a
            java.lang.String r1 = r2.getMessage()
            a.C0279n6.d(r8, r0, r5, r1)
        L266:
            a.Wf r0 = a.Wf.f330a
            return r0
        L269:
            top.mmjz.floatingclouds.plugin.IPlugin r6 = r14.b
            a.fh r6 = (a.fh) r6
            a.J8 r7 = r14.c
            java.lang.String r8 = "WXMaskPlugin: handleHook -> muteNotificationPluginPart START (separate thread)"
            java.lang.Object[] r8 = new java.lang.Object[]{r8}
            java.lang.Object[] r8 = java.util.Arrays.copyOf(r8, r5)
            a.C0453x1.b(r8)
            long r8 = java.lang.System.currentTimeMillis()
            a.Db r6 = r6.E     // Catch: java.lang.Throwable -> L288
            r6.handleHook(r7)     // Catch: java.lang.Throwable -> L288
            a.Wf r6 = a.Wf.f330a     // Catch: java.lang.Throwable -> L288
            goto L28d
        L288:
            r6 = move-exception
            a.wd$a r6 = a.C0465xd.a(r6)
        L28d:
            boolean r7 = r6 instanceof a.C0447wd.a
            java.lang.String r10 = "muteNotificationPluginPart"
            if (r7 != 0) goto L2ba
            r7 = r6
            a.Wf r7 = (a.Wf) r7
            long r11 = java.lang.System.currentTimeMillis()
            long r11 = r11 - r8
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r13 = "WXMaskPlugin: handleHook -> muteNotificationPluginPart DONE ("
            r7.<init>(r13)
            r7.append(r11)
            r7.append(r4)
            java.lang.String r7 = r7.toString()
            java.lang.Object[] r7 = new java.lang.Object[]{r7}
            java.lang.Object[] r5 = java.util.Arrays.copyOf(r7, r5)
            a.C0453x1.b(r5)
            a.C0279n6.d(r10, r3, r11, r2)
        L2ba:
            java.lang.Throwable r2 = a.C0447wd.a(r6)
            if (r2 == 0) goto L2ea
            long r5 = java.lang.System.currentTimeMillis()
            long r5 = r5 - r8
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r7 = "WXMaskPlugin: handleHook -> muteNotificationPluginPart FAIL ("
            r3.<init>(r7)
            r3.append(r5)
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.Object[] r3 = new java.lang.Object[]{r3, r2}
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r3, r1)
            a.C0453x1.a(r1)
            boolean r1 = a.C0279n6.f595a
            java.lang.String r1 = r2.getMessage()
            a.C0279n6.d(r10, r0, r5, r1)
        L2ea:
            a.Wf r0 = a.Wf.f330a
            return r0
        L2ed:
            top.mmjz.floatingclouds.plugin.IPlugin r6 = r14.b
            a.fh r6 = (a.fh) r6
            a.J8 r7 = r14.c
            java.lang.String r8 = "WXMaskPlugin: handleHook -> ignoreVoipCallPluginPart START (separate thread)"
            java.lang.Object[] r8 = new java.lang.Object[]{r8}
            java.lang.Object[] r8 = java.util.Arrays.copyOf(r8, r5)
            a.C0453x1.b(r8)
            long r8 = java.lang.System.currentTimeMillis()
            a.R8 r6 = r6.j     // Catch: java.lang.Throwable -> L30c
            r6.handleHook(r7)     // Catch: java.lang.Throwable -> L30c
            a.Wf r6 = a.Wf.f330a     // Catch: java.lang.Throwable -> L30c
            goto L311
        L30c:
            r6 = move-exception
            a.wd$a r6 = a.C0465xd.a(r6)
        L311:
            boolean r7 = r6 instanceof a.C0447wd.a
            java.lang.String r10 = "ignoreVoipCallPluginPart"
            if (r7 != 0) goto L33e
            r7 = r6
            a.Wf r7 = (a.Wf) r7
            long r11 = java.lang.System.currentTimeMillis()
            long r11 = r11 - r8
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r13 = "WXMaskPlugin: handleHook -> ignoreVoipCallPluginPart DONE ("
            r7.<init>(r13)
            r7.append(r11)
            r7.append(r4)
            java.lang.String r7 = r7.toString()
            java.lang.Object[] r7 = new java.lang.Object[]{r7}
            java.lang.Object[] r5 = java.util.Arrays.copyOf(r7, r5)
            a.C0453x1.b(r5)
            a.C0279n6.d(r10, r3, r11, r2)
        L33e:
            java.lang.Throwable r2 = a.C0447wd.a(r6)
            if (r2 == 0) goto L36e
            long r5 = java.lang.System.currentTimeMillis()
            long r5 = r5 - r8
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r7 = "WXMaskPlugin: handleHook -> ignoreVoipCallPluginPart FAIL (separate thread) ("
            r3.<init>(r7)
            r3.append(r5)
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.Object[] r3 = new java.lang.Object[]{r3, r2}
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r3, r1)
            a.C0453x1.a(r1)
            boolean r1 = a.C0279n6.f595a
            java.lang.String r1 = r2.getMessage()
            a.C0279n6.d(r10, r0, r5, r1)
        L36e:
            a.Wf r0 = a.Wf.f330a
            return r0
    }
}
