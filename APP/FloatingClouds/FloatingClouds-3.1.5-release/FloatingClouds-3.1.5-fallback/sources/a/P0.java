package a;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class P0 implements java.lang.Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f204a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;

    public /* synthetic */ P0(a.fh r1, a.J8 r2, android.content.Context r3) {
            r0 = this;
            r1 = 17
            r0.f204a = r1
            r0.<init>()
            r0.b = r2
            r0.c = r3
            return
    }

    public /* synthetic */ P0(java.lang.Object r1, int r2, java.lang.Object r3) {
            r0 = this;
            r0.f204a = r2
            r0.b = r1
            r0.c = r3
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r12 = this;
            java.lang.String r0 = "readReportStorage"
            r1 = 3000(0xbb8, double:1.482E-320)
            java.lang.String r3 = "."
            r4 = 0
            r5 = 2
            r6 = 0
            r7 = 1
            java.lang.Object r8 = r12.c
            java.lang.Object r9 = r12.b
            int r10 = r12.f204a
            switch(r10) {
                case 0: goto L437;
                case 1: goto L3e0;
                case 2: goto L35a;
                case 3: goto L34e;
                case 4: goto L33c;
                case 5: goto L2b6;
                case 6: goto L273;
                case 7: goto L26d;
                case 8: goto L252;
                case 9: goto L222;
                case 10: goto L118;
                case 11: goto Lf8;
                case 12: goto Ld8;
                case 13: goto Lae;
                case 14: goto La6;
                case 15: goto L84;
                case 16: goto L5f;
                default: goto L13;
            }
        L13:
            a.J8 r9 = (a.J8) r9
            android.content.Context r8 = (android.content.Context) r8
            java.lang.String r0 = "WXMaskPlugin: snapshot saved with "
            r1 = 8000(0x1f40, double:3.9525E-320)
            java.lang.Thread.sleep(r1)     // Catch: java.lang.Throwable -> L50
            java.util.LinkedHashMap r1 = a.fh.a(r9)     // Catch: java.lang.Throwable -> L50
            boolean r2 = r1.isEmpty()     // Catch: java.lang.Throwable -> L50
            if (r2 != 0) goto L5e
            java.lang.String r2 = a.B1.a.a()     // Catch: java.lang.Throwable -> L50
            a.C0394te.a(r8, r2, r1)     // Catch: java.lang.Throwable -> L50
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L50
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L50
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L50
            r2.append(r1)     // Catch: java.lang.Throwable -> L50
            java.lang.String r0 = " classes"
            r2.append(r0)     // Catch: java.lang.Throwable -> L50
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> L50
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch: java.lang.Throwable -> L50
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r7)     // Catch: java.lang.Throwable -> L50
            a.C0453x1.b(r0)     // Catch: java.lang.Throwable -> L50
            goto L5e
        L50:
            r0 = move-exception
            java.lang.String r1 = "WXMaskPlugin: snapshot save failed"
            java.lang.Object[] r0 = new java.lang.Object[]{r1, r0}
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r5)
            a.C0453x1.a(r0)
        L5e:
            return
        L5f:
            a.fh r9 = (a.fh) r9
            a.J8 r8 = (a.J8) r8
            a.r8 r0 = r9.c     // Catch: java.lang.Throwable -> L6b
            r0.handleHook(r8)     // Catch: java.lang.Throwable -> L6b
            a.Wf r0 = a.Wf.f330a     // Catch: java.lang.Throwable -> L6b
            goto L70
        L6b:
            r0 = move-exception
            a.wd$a r0 = a.C0465xd.a(r0)
        L70:
            java.lang.Throwable r0 = a.C0447wd.a(r0)
            if (r0 == 0) goto L83
            java.lang.String r1 = "WXMaskPlugin: async init -> hideSearchListPluginPart FAIL"
            java.lang.Object[] r0 = new java.lang.Object[]{r1, r0}
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r5)
            a.C0453x1.a(r0)
        L83:
            return
        L84:
            android.view.View r8 = (android.view.View) r8
            a.Ue r9 = (a.Ue) r9
            r9.e(r8)
            java.lang.ref.WeakReference<android.view.View> r0 = r9.f294a
            if (r0 == 0) goto L96
            java.lang.Object r0 = r0.get()
            r4 = r0
            android.view.View r4 = (android.view.View) r4
        L96:
            if (r4 != 0) goto La2
            java.lang.String r0 = "TempUnhideTrigger: 3s fallback — title still not found"
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            a.C0453x1.b(r0)
            goto La5
        La2:
            r9.f()
        La5:
            return
        La6:
            a.qd$e r9 = (a.C0340qd.e) r9
            android.graphics.Typeface r8 = (android.graphics.Typeface) r8
            r9.c(r8)
            return
        Lae:
            androidx.profileinstaller.ProfileInstallerInitializer r9 = (androidx.profileinstaller.ProfileInstallerInitializer) r9
            r9.getClass()
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            android.os.Handler r0 = androidx.profileinstaller.ProfileInstallerInitializer.b.a(r0)
            java.util.Random r1 = new java.util.Random
            r1.<init>()
            r2 = 1000(0x3e8, float:1.401E-42)
            int r2 = java.lang.Math.max(r2, r7)
            int r1 = r1.nextInt(r2)
            a.N0 r2 = new a.N0
            android.content.Context r8 = (android.content.Context) r8
            r2.<init>(r8, r7)
            int r1 = r1 + 5000
            long r3 = (long) r1
            r0.postDelayed(r2, r3)
            return
        Ld8:
            a.ra r9 = (a.C0354ra) r9
            android.app.Activity r0 = r9.f669a
            java.lang.Throwable r8 = (java.lang.Throwable) r8
            java.lang.String r1 = r8.getMessage()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "模拟失败: "
            r2.<init>(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            android.widget.Toast r0 = android.widget.Toast.makeText(r0, r1, r7)
            r0.show()
            return
        Lf8:
            a.Qc r9 = (a.Qc) r9
            boolean r0 = r9.f231a
            a.ra r8 = (a.C0354ra) r8
            if (r0 == 0) goto L10c
            android.app.Activity r0 = r8.f669a
            java.lang.String r1 = "已注入模拟基线，请打开版本详情验证"
            android.widget.Toast r0 = android.widget.Toast.makeText(r0, r1, r7)
            r0.show()
            goto L117
        L10c:
            android.app.Activity r0 = r8.f669a
            java.lang.String r1 = "未找到 tag 语义字段，注入失败"
            android.widget.Toast r0 = android.widget.Toast.makeText(r0, r1, r6)
            r0.show()
        L117:
            return
        L118:
            a.ra r9 = (a.C0354ra) r9
            java.lang.ClassLoader r8 = (java.lang.ClassLoader) r8
            java.lang.String r0 = "[SimulateHotUpdate] mp0 class loaded: "
            java.lang.String r1 = "[SimulateHotUpdate] locate result: mp0Class="
            a.jg r2 = a.C0217jg.f537a     // Catch: java.lang.Throwable -> L13c
            r2.getClass()     // Catch: java.lang.Throwable -> L13c
            a.kg r2 = a.C0217jg.d()     // Catch: java.lang.Throwable -> L13c
            if (r2 == 0) goto L12e
            java.lang.String r3 = r2.c     // Catch: java.lang.Throwable -> L13c
            goto L12f
        L12e:
            r3 = r4
        L12f:
            if (r2 == 0) goto L13f
            java.lang.Object r5 = r2.e     // Catch: java.lang.Throwable -> L13c
            int r5 = r5.size()     // Catch: java.lang.Throwable -> L13c
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Throwable -> L13c
            goto L140
        L13c:
            r0 = move-exception
            goto L20c
        L13f:
            r5 = r4
        L140:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L13c
            r10.<init>(r1)     // Catch: java.lang.Throwable -> L13c
            r10.append(r3)     // Catch: java.lang.Throwable -> L13c
            java.lang.String r1 = " fields="
            r10.append(r1)     // Catch: java.lang.Throwable -> L13c
            r10.append(r5)     // Catch: java.lang.Throwable -> L13c
            java.lang.String r1 = r10.toString()     // Catch: java.lang.Throwable -> L13c
            java.lang.Object[] r1 = new java.lang.Object[]{r1}     // Catch: java.lang.Throwable -> L13c
            a.C0453x1.b(r1)     // Catch: java.lang.Throwable -> L13c
            if (r2 == 0) goto L201
            java.lang.String r1 = r2.c     // Catch: java.lang.Throwable -> L13c
            if (r1 != 0) goto L163
            goto L201
        L163:
            java.lang.Class r1 = java.lang.Class.forName(r1, r6, r8)     // Catch: java.lang.Throwable -> L13c
            java.lang.String r3 = r1.getName()     // Catch: java.lang.Throwable -> L13c
            java.lang.String r0 = r0.concat(r3)     // Catch: java.lang.Throwable -> L13c
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch: java.lang.Throwable -> L13c
            a.C0453x1.b(r0)     // Catch: java.lang.Throwable -> L13c
            a.Qc r0 = new a.Qc     // Catch: java.lang.Throwable -> L13c
            r0.<init>()     // Catch: java.lang.Throwable -> L13c
            java.lang.Object r2 = r2.e     // Catch: java.lang.Throwable -> L13c
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L13c
        L181:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L13c
            if (r3 == 0) goto L1f4
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L13c
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L13c
            java.lang.reflect.Field r5 = r1.getDeclaredField(r3)     // Catch: java.lang.Throwable -> L13c
            r5.setAccessible(r7)     // Catch: java.lang.Throwable -> L13c
            java.lang.Object r6 = r5.get(r4)     // Catch: java.lang.Throwable -> L13c
            boolean r8 = r6 instanceof java.lang.String     // Catch: java.lang.Throwable -> L13c
            if (r8 == 0) goto L19f
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Throwable -> L13c
            goto L1a0
        L19f:
            r6 = r4
        L1a0:
            if (r6 != 0) goto L1a3
            goto L181
        L1a3:
            r8 = 30
            java.lang.String r8 = a.Ce.X(r6, r8)     // Catch: java.lang.Throwable -> L13c
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L13c
            r10.<init>()     // Catch: java.lang.Throwable -> L13c
            java.lang.String r11 = "[SimulateHotUpdate] field="
            r10.append(r11)     // Catch: java.lang.Throwable -> L13c
            r10.append(r3)     // Catch: java.lang.Throwable -> L13c
            java.lang.String r11 = " value="
            r10.append(r11)     // Catch: java.lang.Throwable -> L13c
            r10.append(r8)     // Catch: java.lang.Throwable -> L13c
            java.lang.String r8 = r10.toString()     // Catch: java.lang.Throwable -> L13c
            java.lang.Object[] r8 = new java.lang.Object[]{r8}     // Catch: java.lang.Throwable -> L13c
            a.C0453x1.b(r8)     // Catch: java.lang.Throwable -> L13c
            java.lang.String r6 = a.C0235kg.a.a(r6)     // Catch: java.lang.Throwable -> L13c
            java.lang.String r8 = "tag"
            boolean r6 = a.C0193i9.a(r6, r8)     // Catch: java.lang.Throwable -> L13c
            if (r6 == 0) goto L181
            java.lang.String r1 = "FAKE_BASELINE_#0000"
            r5.set(r4, r1)     // Catch: java.lang.Throwable -> L13c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L13c
            r1.<init>()     // Catch: java.lang.Throwable -> L13c
            java.lang.String r2 = "[SimulateHotUpdate] injected FAKE_BASELINE_#0000 into "
            r1.append(r2)     // Catch: java.lang.Throwable -> L13c
            r1.append(r3)     // Catch: java.lang.Throwable -> L13c
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L13c
            java.lang.Object[] r1 = new java.lang.Object[]{r1}     // Catch: java.lang.Throwable -> L13c
            a.C0453x1.b(r1)     // Catch: java.lang.Throwable -> L13c
            r0.f231a = r7     // Catch: java.lang.Throwable -> L13c
        L1f4:
            android.app.Activity r1 = r9.f669a     // Catch: java.lang.Throwable -> L13c
            a.P0 r2 = new a.P0     // Catch: java.lang.Throwable -> L13c
            r3 = 11
            r2.<init>(r0, r3, r9)     // Catch: java.lang.Throwable -> L13c
            r1.runOnUiThread(r2)     // Catch: java.lang.Throwable -> L13c
            goto L221
        L201:
            android.app.Activity r0 = r9.f669a     // Catch: java.lang.Throwable -> L13c
            a.ma r1 = new a.ma     // Catch: java.lang.Throwable -> L13c
            r1.<init>(r9, r7)     // Catch: java.lang.Throwable -> L13c
            r0.runOnUiThread(r1)     // Catch: java.lang.Throwable -> L13c
            goto L221
        L20c:
            java.lang.String r1 = "[SimulateHotUpdate] FAILED"
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r0}
            a.C0453x1.e(r1)
            android.app.Activity r1 = r9.f669a
            a.P0 r2 = new a.P0
            r3 = 12
            r2.<init>(r9, r3, r0)
            r1.runOnUiThread(r2)
        L221:
            return
        L222:
            a.T9 r9 = (a.T9) r9
            android.app.Activity r8 = (android.app.Activity) r8
            android.view.Window r0 = r8.getWindow()     // Catch: java.lang.Throwable -> L239
            android.view.View r0 = r0.getDecorView()     // Catch: java.lang.Throwable -> L239
            java.lang.String r1 = "getDecorView(...)"
            a.C0193i9.d(r0, r1)     // Catch: java.lang.Throwable -> L239
            r9.e(r8, r0)     // Catch: java.lang.Throwable -> L239
            a.Wf r0 = a.Wf.f330a     // Catch: java.lang.Throwable -> L239
            goto L23e
        L239:
            r0 = move-exception
            a.wd$a r0 = a.C0465xd.a(r0)
        L23e:
            java.lang.Throwable r0 = a.C0447wd.a(r0)
            if (r0 == 0) goto L251
            java.lang.String r1 = "LongClickInject: injectAlbumViewLongClick FAILED"
            java.lang.Object[] r0 = new java.lang.Object[]{r1, r0}
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r5)
            a.C0453x1.a(r0)
        L251:
            return
        L252:
            a.u8 r9 = (a.C0406u8) r9
            a.K3$a r0 = a.K3.f148a
            r0.getClass()
            boolean r0 = a.K3.a.l()
            if (r0 == 0) goto L26c
            a.jc r0 = a.K3.a.i()
            boolean r0 = r0.m
            if (r0 == 0) goto L26c
            android.view.View r8 = (android.view.View) r8
            r9.a(r8)
        L26c:
            return
        L26d:
            a.q8 r9 = (a.C0335q8) r9
            r9.n(r8)
            return
        L273:
            a.m8 r9 = (a.C0263m8) r9
            java.lang.String r8 = (java.lang.String) r8
            java.util.Map<java.lang.Object, java.lang.String> r0 = r9.g     // Catch: java.lang.Throwable -> L2ad
            java.lang.String r1 = "prefUserNames"
            a.C0193i9.d(r0, r1)     // Catch: java.lang.Throwable -> L2ad
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Throwable -> L2ad
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L2ad
        L286:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L2ad
            if (r1 == 0) goto L2af
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L2ad
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch: java.lang.Throwable -> L2ad
            java.lang.Object r2 = r1.getKey()     // Catch: java.lang.Throwable -> L2ad
            java.lang.Object r1 = r1.getValue()     // Catch: java.lang.Throwable -> L2ad
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L2ad
            boolean r1 = a.C0193i9.a(r1, r8)     // Catch: java.lang.Throwable -> L2ad
            if (r1 == 0) goto L286
            java.lang.String r1 = "N"
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L2ad
            r3.<init>()     // Catch: java.lang.Throwable -> L2ad
            a.C0263m8.d(r2, r1, r3)     // Catch: java.lang.Throwable -> L2ad
            goto L286
        L2ad:
            r0 = move-exception
            goto L2b2
        L2af:
            a.Wf r0 = a.Wf.f330a     // Catch: java.lang.Throwable -> L2ad
            goto L2b5
        L2b2:
            a.C0465xd.a(r0)
        L2b5:
            return
        L2b6:
            java.lang.String r4 = "F026"
            a.v5 r9 = (a.C0421v5) r9
            a.J8 r8 = (a.J8) r8
            java.lang.Thread.sleep(r1)     // Catch: java.lang.Throwable -> L33b
            boolean r1 = a.C0421v5.f()     // Catch: java.lang.Throwable -> L33b
            if (r1 != 0) goto L2c6
            goto L33b
        L2c6:
            a.Pc r1 = a.Pc.f211a     // Catch: java.lang.Throwable -> L33b
            java.lang.ClassLoader r2 = r8.f136a     // Catch: java.lang.Throwable -> L33b
            r1.getClass()     // Catch: java.lang.Throwable -> L33b
            java.util.List r1 = a.Pc.b(r2)     // Catch: java.lang.Throwable -> L33b
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L33b
        L2d5:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L33b
            if (r2 == 0) goto L33b
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L33b
            java.lang.reflect.Method r2 = (java.lang.reflect.Method) r2     // Catch: java.lang.Throwable -> L33b
            a.q5 r5 = new a.q5     // Catch: java.lang.Throwable -> L33b
            r5.<init>(r9, r6)     // Catch: java.lang.Throwable -> L33b
            a.J8.h(r8, r4, r2, r5)     // Catch: java.lang.Throwable -> L33b
            java.util.concurrent.ConcurrentHashMap<java.lang.String, a.F8> r5 = a.E8.f71a     // Catch: java.lang.Throwable -> L33b
            java.lang.Class r5 = r2.getDeclaringClass()     // Catch: java.lang.Throwable -> L33b
            java.lang.String r5 = r5.getName()     // Catch: java.lang.Throwable -> L33b
            java.lang.String r10 = r2.getName()     // Catch: java.lang.Throwable -> L33b
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L33b
            r11.<init>()     // Catch: java.lang.Throwable -> L33b
            r11.append(r5)     // Catch: java.lang.Throwable -> L33b
            r11.append(r3)     // Catch: java.lang.Throwable -> L33b
            r11.append(r10)     // Catch: java.lang.Throwable -> L33b
            java.lang.String r5 = r11.toString()     // Catch: java.lang.Throwable -> L33b
            a.E8.b(r4, r0, r5)     // Catch: java.lang.Throwable -> L33b
            java.lang.Class r5 = r2.getDeclaringClass()     // Catch: java.lang.Throwable -> L33b
            java.lang.String r5 = r5.getName()     // Catch: java.lang.Throwable -> L33b
            java.lang.String r2 = r2.getName()     // Catch: java.lang.Throwable -> L33b
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L33b
            r10.<init>()     // Catch: java.lang.Throwable -> L33b
            java.lang.String r11 = "DotIndicator: hooked storage clear trigger "
            r10.append(r11)     // Catch: java.lang.Throwable -> L33b
            r10.append(r5)     // Catch: java.lang.Throwable -> L33b
            r10.append(r3)     // Catch: java.lang.Throwable -> L33b
            r10.append(r2)     // Catch: java.lang.Throwable -> L33b
            java.lang.String r2 = r10.toString()     // Catch: java.lang.Throwable -> L33b
            java.lang.Object[] r2 = new java.lang.Object[]{r2}     // Catch: java.lang.Throwable -> L33b
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r7)     // Catch: java.lang.Throwable -> L33b
            a.C0453x1.b(r2)     // Catch: java.lang.Throwable -> L33b
            goto L2d5
        L33b:
            return
        L33c:
            java.lang.String r0 = "this$0"
            androidx.fragment.app.a r9 = (androidx.fragment.app.a) r9
            a.C0193i9.e(r9, r0)
            java.lang.String r0 = "$operation"
            androidx.fragment.app.f$c r8 = (androidx.fragment.app.f.c) r8
            a.C0193i9.e(r8, r0)
            r9.a(r8)
            return
        L34e:
            java.lang.String r8 = (java.lang.String) r8
            java.util.List r0 = a.C0435w1.K(r8)
            java.lang.ClassLoader r9 = (java.lang.ClassLoader) r9
            a.C0435w1.V(r9, r0)
            return
        L35a:
            java.lang.String r4 = "F025"
            a.o2 r9 = (a.C0293o2) r9
            a.J8 r8 = (a.J8) r8
            java.lang.Thread.sleep(r1)     // Catch: java.lang.Throwable -> L3df
            boolean r1 = a.C0293o2.e()     // Catch: java.lang.Throwable -> L3df
            if (r1 != 0) goto L36a
            goto L3df
        L36a:
            a.Pc r1 = a.Pc.f211a     // Catch: java.lang.Throwable -> L3df
            java.lang.ClassLoader r2 = r8.f136a     // Catch: java.lang.Throwable -> L3df
            r1.getClass()     // Catch: java.lang.Throwable -> L3df
            java.util.List r1 = a.Pc.b(r2)     // Catch: java.lang.Throwable -> L3df
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L3df
        L379:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L3df
            if (r2 == 0) goto L3df
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L3df
            java.lang.reflect.Method r2 = (java.lang.reflect.Method) r2     // Catch: java.lang.Throwable -> L3df
            a.k2 r5 = new a.k2     // Catch: java.lang.Throwable -> L3df
            r5.<init>(r9, r6)     // Catch: java.lang.Throwable -> L3df
            a.J8.h(r8, r4, r2, r5)     // Catch: java.lang.Throwable -> L3df
            java.util.concurrent.ConcurrentHashMap<java.lang.String, a.F8> r5 = a.E8.f71a     // Catch: java.lang.Throwable -> L3df
            java.lang.Class r5 = r2.getDeclaringClass()     // Catch: java.lang.Throwable -> L3df
            java.lang.String r5 = r5.getName()     // Catch: java.lang.Throwable -> L3df
            java.lang.String r10 = r2.getName()     // Catch: java.lang.Throwable -> L3df
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3df
            r11.<init>()     // Catch: java.lang.Throwable -> L3df
            r11.append(r5)     // Catch: java.lang.Throwable -> L3df
            r11.append(r3)     // Catch: java.lang.Throwable -> L3df
            r11.append(r10)     // Catch: java.lang.Throwable -> L3df
            java.lang.String r5 = r11.toString()     // Catch: java.lang.Throwable -> L3df
            a.E8.b(r4, r0, r5)     // Catch: java.lang.Throwable -> L3df
            java.lang.Class r5 = r2.getDeclaringClass()     // Catch: java.lang.Throwable -> L3df
            java.lang.String r5 = r5.getName()     // Catch: java.lang.Throwable -> L3df
            java.lang.String r2 = r2.getName()     // Catch: java.lang.Throwable -> L3df
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3df
            r10.<init>()     // Catch: java.lang.Throwable -> L3df
            java.lang.String r11 = "BoldBottomTab: hooked storage clear trigger "
            r10.append(r11)     // Catch: java.lang.Throwable -> L3df
            r10.append(r5)     // Catch: java.lang.Throwable -> L3df
            r10.append(r3)     // Catch: java.lang.Throwable -> L3df
            r10.append(r2)     // Catch: java.lang.Throwable -> L3df
            java.lang.String r2 = r10.toString()     // Catch: java.lang.Throwable -> L3df
            java.lang.Object[] r2 = new java.lang.Object[]{r2}     // Catch: java.lang.Throwable -> L3df
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r7)     // Catch: java.lang.Throwable -> L3df
            a.C0453x1.b(r2)     // Catch: java.lang.Throwable -> L3df
            goto L379
        L3df:
            return
        L3e0:
            a.o2 r9 = (a.C0293o2) r9
            r9.getClass()
            java.util.ArrayList r0 = a.C0293o2.c(r8)
            java.util.Iterator r0 = r0.iterator()
        L3ed:
            boolean r1 = r0.hasNext()
            java.util.HashMap<android.widget.TextView, java.lang.Float> r2 = r9.d
            if (r1 == 0) goto L433
            java.lang.Object r1 = r0.next()
            android.widget.TextView r1 = (android.widget.TextView) r1
            android.text.TextPaint r3 = r1.getPaint()     // Catch: java.lang.Throwable -> L427
            android.graphics.Paint$Style r4 = android.graphics.Paint.Style.FILL     // Catch: java.lang.Throwable -> L427
            r3.setStyle(r4)     // Catch: java.lang.Throwable -> L427
            android.text.TextPaint r3 = r1.getPaint()     // Catch: java.lang.Throwable -> L427
            r4 = 0
            r3.setStrokeWidth(r4)     // Catch: java.lang.Throwable -> L427
            java.lang.Object r2 = r2.get(r1)     // Catch: java.lang.Throwable -> L427
            java.lang.Float r2 = (java.lang.Float) r2     // Catch: java.lang.Throwable -> L427
            if (r2 == 0) goto L429
            float r2 = r2.floatValue()     // Catch: java.lang.Throwable -> L427
            android.content.res.Resources r3 = r1.getResources()     // Catch: java.lang.Throwable -> L427
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()     // Catch: java.lang.Throwable -> L427
            float r3 = r3.scaledDensity     // Catch: java.lang.Throwable -> L427
            float r2 = r2 / r3
            r1.setTextSize(r2)     // Catch: java.lang.Throwable -> L427
            goto L429
        L427:
            r1 = move-exception
            goto L42f
        L429:
            r1.invalidate()     // Catch: java.lang.Throwable -> L427
            a.Wf r1 = a.Wf.f330a     // Catch: java.lang.Throwable -> L427
            goto L3ed
        L42f:
            a.C0465xd.a(r1)
            goto L3ed
        L433:
            r2.clear()
            return
        L437:
            java.lang.Runnable r8 = (java.lang.Runnable) r8
            a.O0$c r9 = (a.O0.c) r9
            r9.getClass()
            r8.run()     // Catch: java.lang.Throwable -> L445
            r9.b()
            return
        L445:
            r0 = move-exception
            r9.b()
            throw r0
    }
}
