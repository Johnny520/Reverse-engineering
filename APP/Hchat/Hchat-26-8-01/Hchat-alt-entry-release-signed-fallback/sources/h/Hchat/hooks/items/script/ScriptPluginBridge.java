package h.Hchat.hooks.items.script;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class ScriptPluginBridge {
    public static final int $stable = 8;
    public static final eb.q Companion = null;
    private final java.lang.Class<h.Hchat.hooks.api.core.WeChatApis> apis;
    private final java.lang.ClassLoader classLoader;
    private final java.lang.Object configLock;
    private final h.Hchat.hooks.items.script.ScriptDexKitBridge dexKit;
    private final android.content.Context hostContext;
    private final android.os.Handler mainHandler;
    private final java.util.concurrent.ConcurrentHashMap<java.lang.String, java.util.concurrent.CopyOnWriteArrayList<h.Hchat.hooks.items.script.ScriptFloatingGlassBarHandle>> pluginFloatingBars;
    private final java.util.concurrent.ConcurrentHashMap<java.lang.String, java.util.concurrent.CopyOnWriteArrayList<de.robv.android.xposed.XC_MethodHook.Unhook>> pluginHooks;
    private final java.io.File scriptDir;

    static {
            eb.q r0 = new eb.q
            r0.<init>()
            h.Hchat.hooks.items.script.ScriptPluginBridge.Companion = r0
            return
    }

    public ScriptPluginBridge(android.content.Context r1, java.lang.ClassLoader r2, java.io.File r3, h.Hchat.hooks.items.script.ScriptDexKitBridge r4) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            r3.getClass()
            r0.<init>()
            r0.hostContext = r1
            r0.classLoader = r2
            r0.scriptDir = r3
            r0.dexKit = r4
            java.lang.Class<h.Hchat.hooks.api.core.WeChatApis> r1 = h.Hchat.hooks.api.core.WeChatApis.class
            r0.apis = r1
            java.util.concurrent.ConcurrentHashMap r1 = new java.util.concurrent.ConcurrentHashMap
            r1.<init>()
            r0.pluginHooks = r1
            java.util.concurrent.ConcurrentHashMap r1 = new java.util.concurrent.ConcurrentHashMap
            r1.<init>()
            r0.pluginFloatingBars = r1
            java.lang.Object r1 = new java.lang.Object
            r1.<init>()
            r0.configLock = r1
            android.os.Handler r1 = new android.os.Handler
            android.os.Looper r2 = android.os.Looper.getMainLooper()
            r1.<init>(r2)
            r0.mainHandler = r1
            return
    }

    public /* synthetic */ ScriptPluginBridge(android.content.Context r1, java.lang.ClassLoader r2, java.io.File r3, h.Hchat.hooks.items.script.ScriptDexKitBridge r4, int r5, gg.g r6) {
            r0 = this;
            r5 = r5 & 8
            if (r5 == 0) goto L5
            r4 = 0
        L5:
            r0.<init>(r1, r2, r3, r4)
            return
    }

    public static /* synthetic */ sf.n a(h.Hchat.hooks.items.script.ScriptPluginBridge r0, java.util.function.Consumer r1, java.lang.String r2) {
            sf.n r0 = showModuleInputDialog$lambda$0$0(r0, r1, r2)
            return r0
    }

    private static final h.Hchat.hooks.items.script.ScriptFloatingGlassBarHandle applyModuleFloatingGlassBar$lambda$1(h.Hchat.hooks.items.script.ScriptPluginBridge r22, android.view.View r23, java.util.Map r24, java.lang.String r25) {
            r0 = r22
            r1 = r23
            r2 = r24
            r3 = r25
            android.content.Context r4 = r1.getContext()
            android.app.Activity r4 = r0.findActivity(r4)
            if (r4 == 0) goto L14
        L12:
            r8 = r4
            goto L23
        L14:
            q8.o r4 = h.Hchat.hooks.api.core.WeChatApis.currentActivity()
            if (r4 == 0) goto L1f
            android.app.Activity r4 = r4.a()
            goto L20
        L1f:
            r4 = 0
        L20:
            if (r4 == 0) goto L435
            goto L12
        L23:
            java.util.concurrent.atomic.AtomicReference r4 = new java.util.concurrent.atomic.AtomicReference
            r4.<init>()
            wb.fr r6 = wb.fr.f16252a
            ab.e r14 = new ab.e
            r6 = 5
            r14.<init>(r4, r0, r3, r6)
            android.os.Looper r6 = android.os.Looper.myLooper()
            android.os.Looper r7 = android.os.Looper.getMainLooper()
            boolean r6 = gg.l.a(r6, r7)
            if (r6 == 0) goto L42d
            boolean r6 = r8.isFinishing()
            if (r6 != 0) goto L53
            boolean r6 = r8.isDestroyed()
            if (r6 == 0) goto L4b
            goto L53
        L4b:
            boolean r6 = r1 instanceof android.view.SurfaceView
            if (r6 != 0) goto L53
            boolean r6 = r1 instanceof android.view.TextureView
            if (r6 == 0) goto L57
        L53:
            r21 = r4
            goto L3d0
        L57:
            boolean r6 = r1.isAttachedToWindow()
            if (r6 != 0) goto L64
            r21 = r4
        L5f:
            r5 = 0
            r20 = 0
            goto L3fc
        L64:
            r6 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r6 = r8.findViewById(r6)
            r15 = r6
            android.view.ViewGroup r15 = (android.view.ViewGroup) r15
            if (r15 == 0) goto L3f9
            android.view.ViewParent r6 = r1.getParent()
            boolean r7 = r6 instanceof android.view.ViewGroup
            if (r7 == 0) goto L7e
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            r16 = r4
            r4 = r6
            goto L81
        L7e:
            r16 = r4
            r4 = 0
        L81:
            if (r4 == 0) goto L3ce
            if (r1 == r15) goto L3f6
            r6 = r1
        L86:
            if (r6 == 0) goto L3f6
            if (r6 != r15) goto L3d8
            int r6 = r15.getChildCount()
            if (r6 != 0) goto L93
        L90:
            r21 = r16
            goto L5f
        L93:
            java.util.WeakHashMap r6 = wb.fr.f16254c
            monitor-enter(r6)
            java.lang.Object r7 = r6.get(r15)     // Catch: java.lang.Throwable -> L3d5
            wb.dr r7 = (wb.dr) r7     // Catch: java.lang.Throwable -> L3d5
            r9 = 1
            if (r7 == 0) goto La9
            java.util.concurrent.atomic.AtomicBoolean r7 = r7.f15787u     // Catch: java.lang.Throwable -> L3d5
            boolean r7 = r7.get()     // Catch: java.lang.Throwable -> L3d5
            if (r7 != r9) goto La9
            monitor-exit(r6)
            goto L90
        La9:
            monitor-exit(r6)
            wb.er r12 = new wb.er
            java.lang.String r6 = "glass"
            boolean r6 = ac.p.g(r6, r2)
            java.lang.String r7 = "clearBackground"
            boolean r7 = ac.p.g(r7, r2)
            java.lang.String r10 = "horizontalMarginDp"
            float r10 = ac.p.r(r10, r2)
            r11 = 0
            r13 = 1111490560(0x42400000, float:48.0)
            float r10 = r9.e0.q(r10, r11, r13)
            java.lang.String r9 = "bottomMarginDp"
            float r2 = ac.p.r(r9, r2)
            float r2 = r9.e0.q(r2, r11, r13)
            r12.<init>(r6, r7, r10, r2)
            int r2 = r4.indexOfChild(r1)
            if (r2 >= 0) goto Ld9
            goto L90
        Ld9:
            android.view.ViewGroup$LayoutParams r6 = r1.getLayoutParams()
            if (r6 == 0) goto L3ce
            android.graphics.drawable.Drawable r17 = r1.getBackground()
            int r7 = r1.getHeight()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r7)
            if (r7 <= 0) goto Lee
            goto Lef
        Lee:
            r9 = 0
        Lef:
            if (r9 == 0) goto Lf7
        Lf1:
            int r7 = r9.intValue()
        Lf5:
            r11 = r7
            goto L123
        Lf7:
            int r7 = r1.getMeasuredHeight()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r7)
            if (r7 <= 0) goto L102
            goto L103
        L102:
            r9 = 0
        L103:
            if (r9 == 0) goto L106
            goto Lf1
        L106:
            int r7 = r6.height
            java.lang.Integer r9 = java.lang.Integer.valueOf(r7)
            if (r7 <= 0) goto L10f
            goto L110
        L10f:
            r9 = 0
        L110:
            if (r9 == 0) goto L113
            goto Lf1
        L113:
            r7 = 56
            float r7 = (float) r7
            android.content.res.Resources r9 = r8.getResources()
            android.util.DisplayMetrics r9 = r9.getDisplayMetrics()
            float r9 = r9.density
            float r7 = r7 * r9
            int r7 = (int) r7
            goto Lf5
        L123:
            android.view.View r7 = new android.view.View
            r7.<init>(r8)
            r9 = 0
            r7.setBackgroundColor(r9)
            int r10 = r1.getWidth()
            if (r10 >= 0) goto L133
            r10 = r9
        L133:
            r7.setMinimumWidth(r10)
            r7.setMinimumHeight(r11)
            r10 = 4
            r7.setVisibility(r10)
            java.util.ArrayList r18 = new java.util.ArrayList
            r18.<init>()
            android.widget.FrameLayout r13 = new android.widget.FrameLayout
            r13.<init>(r8)
            r13.setBackgroundColor(r9)
            r13.setClipChildren(r9)
            r13.setClipToPadding(r9)
            android.widget.FrameLayout r10 = new android.widget.FrameLayout
            r10.<init>(r8)
            r10.setBackgroundColor(r9)
            r10.setClipChildren(r9)
            r10.setClipToPadding(r9)
            r4.removeView(r1)     // Catch: java.lang.Throwable -> L32b
            r4.addView(r7, r2, r6)     // Catch: java.lang.Throwable -> L32b
            int r9 = r15.getChildCount()     // Catch: java.lang.Throwable -> L32b
            r5 = 0
        L169:
            if (r5 < r9) goto L32f
            java.util.Iterator r5 = r18.iterator()     // Catch: java.lang.Throwable -> L32b
        L16f:
            boolean r9 = r5.hasNext()     // Catch: java.lang.Throwable -> L32b
            if (r9 == 0) goto L1a0
            java.lang.Object r9 = r5.next()     // Catch: java.lang.Throwable -> L19c
            wb.br r9 = (wb.br) r9     // Catch: java.lang.Throwable -> L19c
            r19 = r2
            android.view.View r2 = r9.f15284a     // Catch: java.lang.Throwable -> L18c
            r15.removeView(r2)     // Catch: java.lang.Throwable -> L18c
            android.view.View r2 = r9.f15284a     // Catch: java.lang.Throwable -> L18c
            android.view.ViewGroup$LayoutParams r9 = r9.f15286c     // Catch: java.lang.Throwable -> L18c
            r13.addView(r2, r9)     // Catch: java.lang.Throwable -> L18c
            r2 = r19
            goto L16f
        L18c:
            r0 = move-exception
        L18d:
            r12 = r0
            r1 = r7
            r11 = r13
            r3 = r15
            r7 = r17
            r13 = 0
            r14 = 0
        L195:
            r20 = 0
        L197:
            r15 = r10
            r10 = r18
            goto L371
        L19c:
            r0 = move-exception
            r19 = r2
            goto L18d
        L1a0:
            r19 = r2
            boolean r2 = r12.f16007b     // Catch: java.lang.Throwable -> L328
            if (r2 == 0) goto L1b8
            r2 = 0
            r1.setBackground(r2)     // Catch: java.lang.Throwable -> L1ab
            goto L1b9
        L1ab:
            r0 = move-exception
            r12 = r0
            r14 = r2
            r20 = r14
            r1 = r7
            r11 = r13
            r3 = r15
            r7 = r17
            r13 = r20
            goto L197
        L1b8:
            r2 = 0
        L1b9:
            android.widget.FrameLayout$LayoutParams r5 = new android.widget.FrameLayout$LayoutParams     // Catch: java.lang.Throwable -> L323
            r9 = -1
            r5.<init>(r9, r11)     // Catch: java.lang.Throwable -> L323
            r10.addView(r1, r5)     // Catch: java.lang.Throwable -> L323
            r5 = r7
            c9.a1 r7 = new c9.a1     // Catch: java.lang.Throwable -> L31a
            r2 = 4
            r7.<init>(r2)     // Catch: java.lang.Throwable -> L30e
            androidx.lifecycle.s r2 = r7.f1096h     // Catch: java.lang.Throwable -> L2ff
            boolean r9 = r7.f1100l     // Catch: java.lang.Throwable -> L2ff
            if (r9 != 0) goto L1da
            p4.t r9 = r7.f1097i     // Catch: java.lang.Throwable -> L2ff
            android.os.Bundle r1 = android.os.Bundle.EMPTY     // Catch: java.lang.Throwable -> L2ff
            r9.F(r1)     // Catch: java.lang.Throwable -> L2ff
            r1 = 1
            r7.f1100l = r1     // Catch: java.lang.Throwable -> L2ff
            goto L1db
        L1da:
            r1 = 1
        L1db:
            androidx.lifecycle.l r9 = androidx.lifecycle.l.f291i     // Catch: java.lang.Throwable -> L2ff
            java.lang.String r1 = "setCurrentState"
            r2.c(r1)     // Catch: java.lang.Throwable -> L2ff
            r2.e(r9)     // Catch: java.lang.Throwable -> L2ff
            androidx.lifecycle.l r1 = androidx.lifecycle.l.f292j     // Catch: java.lang.Throwable -> L2ff
            java.lang.String r9 = "setCurrentState"
            r2.c(r9)     // Catch: java.lang.Throwable -> L2ff
            r2.e(r1)     // Catch: java.lang.Throwable -> L2ff
            androidx.lifecycle.l r1 = androidx.lifecycle.l.f293k     // Catch: java.lang.Throwable -> L2ff
            java.lang.String r9 = "setCurrentState"
            r2.c(r9)     // Catch: java.lang.Throwable -> L2ff
            r2.e(r1)     // Catch: java.lang.Throwable -> L2ff
            y1.c1 r1 = new y1.c1     // Catch: java.lang.Throwable -> L2fd
            r1.<init>(r8)     // Catch: java.lang.Throwable -> L2fd
            x6.d.H(r1, r7, r7, r7, r7)     // Catch: java.lang.Throwable -> L2fd
            y1.r1 r2 = y1.r1.f22061h     // Catch: java.lang.Throwable -> L2fd
            r1.setViewCompositionStrategy(r2)     // Catch: java.lang.Throwable -> L2fd
            r2 = r6
            c9.c0 r6 = new c9.c0     // Catch: java.lang.Throwable -> L2f1
            r9 = r13
            r13 = 9
            r24 = r2
            r2 = 1
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)     // Catch: java.lang.Throwable -> L2eb
            r13 = r7
            s0.d r7 = new s0.d     // Catch: java.lang.Throwable -> L2df
            r11 = -1301351656(0xffffffffb26ef318, float:-1.3908696E-8)
            r7.<init>(r11, r6, r2)     // Catch: java.lang.Throwable -> L2df
            r1.setContent(r7)     // Catch: java.lang.Throwable -> L2cd
            android.view.ViewGroup$LayoutParams r2 = new android.view.ViewGroup$LayoutParams     // Catch: java.lang.Throwable -> L2c8
            r6 = -1
            r2.<init>(r6, r6)     // Catch: java.lang.Throwable -> L2c8
            r15.addView(r1, r2)     // Catch: java.lang.Throwable -> L2c8
            android.view.Window r2 = r8.getWindow()     // Catch: java.lang.Throwable -> L2c8
            if (r2 == 0) goto L23e
            android.view.View r2 = r2.getDecorView()     // Catch: java.lang.Throwable -> L232
            goto L23f
        L232:
            r0 = move-exception
            r6 = r24
            r12 = r0
            r14 = r1
            r1 = r5
            r11 = r9
            r3 = r15
            r7 = r17
            goto L195
        L23e:
            r2 = 0
        L23f:
            gg.u r6 = new gg.u     // Catch: java.lang.Throwable -> L2c8
            r6.<init>()     // Catch: java.lang.Throwable -> L2c8
            r12 = r1
            wb.dr r1 = new wb.dr     // Catch: java.lang.Throwable -> L2ba
            wb.zh r7 = new wb.zh     // Catch: java.lang.Throwable -> L2ba
            r8 = 8
            r7.<init>(r14, r15, r6, r8)     // Catch: java.lang.Throwable -> L2ba
            r14 = r2
            r8 = r5
            r0 = r6
            r11 = r10
            r3 = r15
            r21 = r16
            r5 = r19
            r20 = 0
            r2 = r23
            r6 = r24
            r15 = r7
            r10 = r9
            r7 = r17
            r9 = r18
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)     // Catch: java.lang.Throwable -> L2b2
            r2 = r1
            r19 = r5
            r1 = r8
            r15 = r11
            r11 = r10
            r10 = r9
            r0.f4564g = r2     // Catch: java.lang.Throwable -> L275
            if (r14 == 0) goto L27a
            r14.addOnAttachStateChangeListener(r2)     // Catch: java.lang.Throwable -> L275
            goto L27a
        L275:
            r0 = move-exception
        L276:
            r14 = r12
            r12 = r0
            goto L371
        L27a:
            if (r4 == r14) goto L28c
            java.lang.Object r2 = r0.f4564g     // Catch: java.lang.Throwable -> L275
            if (r2 == 0) goto L286
            wb.dr r2 = (wb.dr) r2     // Catch: java.lang.Throwable -> L275
            r4.addOnAttachStateChangeListener(r2)     // Catch: java.lang.Throwable -> L275
            goto L28c
        L286:
            java.lang.String r0 = "handle"
            gg.l.g(r0)     // Catch: java.lang.Throwable -> L275
            throw r20     // Catch: java.lang.Throwable -> L275
        L28c:
            java.util.WeakHashMap r2 = wb.fr.f16254c     // Catch: java.lang.Throwable -> L275
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L275
            java.lang.Object r5 = r0.f4564g     // Catch: java.lang.Throwable -> L2a8
            if (r5 == 0) goto L2aa
            wb.dr r5 = (wb.dr) r5     // Catch: java.lang.Throwable -> L2a8
            r2.put(r3, r5)     // Catch: java.lang.Throwable -> L2a8
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L275
            java.lang.Object r0 = r0.f4564g     // Catch: java.lang.Throwable -> L275
            if (r0 == 0) goto L2a2
            r5 = r0
            wb.dr r5 = (wb.dr) r5     // Catch: java.lang.Throwable -> L275
            goto L3fc
        L2a2:
            java.lang.String r0 = "handle"
            gg.l.g(r0)     // Catch: java.lang.Throwable -> L275
            throw r20     // Catch: java.lang.Throwable -> L275
        L2a8:
            r0 = move-exception
            goto L2b0
        L2aa:
            java.lang.String r0 = "handle"
            gg.l.g(r0)     // Catch: java.lang.Throwable -> L2a8
            throw r20     // Catch: java.lang.Throwable -> L2a8
        L2b0:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L275
            throw r0     // Catch: java.lang.Throwable -> L275
        L2b2:
            r0 = move-exception
            r19 = r5
            r1 = r8
            r15 = r11
            r11 = r10
            r10 = r9
            goto L276
        L2ba:
            r0 = move-exception
            r6 = r24
        L2bd:
            r1 = r5
            r11 = r9
            r3 = r15
            r7 = r17
            r20 = 0
            r15 = r10
            r10 = r18
            goto L276
        L2c8:
            r0 = move-exception
            r6 = r24
            r12 = r1
            goto L2bd
        L2cd:
            r0 = move-exception
            r6 = r24
            r1 = r5
        L2d1:
            r11 = r9
            r3 = r15
            r7 = r17
            r20 = 0
            r15 = r10
        L2d8:
            r10 = r18
            r12 = r0
            r14 = r20
            goto L371
        L2df:
            r0 = move-exception
            r6 = r24
            r1 = r5
            r11 = r9
            r3 = r15
            r7 = r17
            r20 = 0
            r15 = r10
            goto L2d8
        L2eb:
            r0 = move-exception
            r6 = r24
            r1 = r5
            r13 = r7
            goto L2d1
        L2f1:
            r0 = move-exception
            r6 = r2
        L2f3:
            r1 = r5
            r11 = r13
            r3 = r15
            r20 = 0
            r13 = r7
            r15 = r10
            r7 = r17
            goto L2d8
        L2fd:
            r0 = move-exception
            goto L2f3
        L2ff:
            r0 = move-exception
            r1 = r5
            r11 = r13
            r3 = r15
            r7 = r17
            r20 = 0
            goto L316
        L308:
            r12 = r0
            r13 = r20
            r14 = r13
            goto L371
        L30e:
            r0 = move-exception
            r1 = r5
        L310:
            r11 = r13
            r3 = r15
            r7 = r17
            r20 = 0
        L316:
            r15 = r10
            r10 = r18
            goto L308
        L31a:
            r0 = move-exception
            r20 = r2
            r1 = r5
        L31e:
            r11 = r13
            r3 = r15
            r7 = r17
            goto L316
        L323:
            r0 = move-exception
            r20 = r2
            r1 = r7
            goto L31e
        L328:
            r0 = move-exception
        L329:
            r1 = r7
            goto L310
        L32b:
            r0 = move-exception
            r19 = r2
            goto L329
        L32f:
            r19 = r2
            r1 = r7
            r0 = r11
            r11 = r13
            r3 = r15
            r21 = r16
            r7 = r17
            r13 = 4
            r20 = 0
            r15 = r10
            r10 = r18
            android.view.View r2 = r3.getChildAt(r5)     // Catch: java.lang.Throwable -> L36f
            wb.br r13 = new wb.br     // Catch: java.lang.Throwable -> L36f
            r2.getClass()     // Catch: java.lang.Throwable -> L36f
            r16 = r0
            android.view.ViewGroup$LayoutParams r0 = r2.getLayoutParams()     // Catch: java.lang.Throwable -> L36f
            r0.getClass()     // Catch: java.lang.Throwable -> L36f
            r13.<init>(r2, r5, r0)     // Catch: java.lang.Throwable -> L36f
            r10.add(r13)     // Catch: java.lang.Throwable -> L36f
            int r5 = r5 + 1
            r0 = r22
            r17 = r7
            r18 = r10
            r13 = r11
            r10 = r15
            r11 = r16
            r2 = r19
            r16 = r21
            r7 = r1
            r15 = r3
            r1 = r23
            r3 = r25
            goto L169
        L36f:
            r0 = move-exception
            goto L308
        L371:
            if (r14 == 0) goto L376
            r14.f()     // Catch: java.lang.Throwable -> L376
        L376:
            if (r14 == 0) goto L37d
            android.view.ViewParent r5 = r14.getParent()
            goto L37f
        L37d:
            r5 = r20
        L37f:
            boolean r0 = r5 instanceof android.view.ViewGroup
            if (r0 == 0) goto L386
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            goto L388
        L386:
            r5 = r20
        L388:
            if (r5 == 0) goto L38d
            r5.removeView(r14)
        L38d:
            r2 = r3
            r3 = r4
            r5 = r6
            r6 = r7
            r8 = r10
            r9 = r11
            r10 = r15
            r4 = r19
            r7 = r1
            r1 = r23
            wb.fr.c(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L39f
            sf.n r0 = sf.n.f12433a     // Catch: java.lang.Throwable -> L39f
            goto L3a6
        L39f:
            r0 = move-exception
            sf.f r1 = new sf.f
            r1.<init>(r0)
            r0 = r1
        L3a6:
            java.lang.Throwable r0 = sf.g.b(r0)
            if (r0 == 0) goto L3af
            r12.addSuppressed(r0)
        L3af:
            if (r14 == 0) goto L3b6
            if (r13 == 0) goto L3b6
            x6.d.p(r14)
        L3b6:
            if (r13 == 0) goto L3cd
            androidx.lifecycle.s r0 = r13.f1096h
            androidx.lifecycle.l r1 = r0.f300c
            androidx.lifecycle.l r2 = androidx.lifecycle.l.f289g
            if (r1 == r2) goto L3c3
            r0.g(r2)
        L3c3:
            r3.a r0 = r13.f1099k
            r0.a()
            androidx.lifecycle.e0 r0 = r13.f1098j
            r0.a()
        L3cd:
            throw r12
        L3ce:
            r21 = r16
        L3d0:
            r20 = 0
            r5 = r20
            goto L3fc
        L3d5:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        L3d8:
            r3 = r15
            r21 = r16
            r20 = 0
            android.view.ViewParent r0 = r6.getParent()
            boolean r1 = r0 instanceof android.view.View
            if (r1 == 0) goto L3e9
            android.view.View r0 = (android.view.View) r0
            r6 = r0
            goto L3eb
        L3e9:
            r6 = r20
        L3eb:
            r0 = r22
            r1 = r23
            r15 = r3
            r16 = r21
            r3 = r25
            goto L86
        L3f6:
            r21 = r16
            goto L3d0
        L3f9:
            r21 = r4
            goto L3d0
        L3fc:
            if (r5 == 0) goto L437
            h.Hchat.hooks.items.script.ScriptFloatingGlassBarHandle r0 = new h.Hchat.hooks.items.script.ScriptFloatingGlassBarHandle
            aa.c r1 = new aa.c
            r2 = 7
            r3 = r22
            r1.<init>(r3, r2, r5)
            r0.<init>(r5, r1)
            r1 = r21
            r1.set(r0)
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.util.concurrent.CopyOnWriteArrayList<h.Hchat.hooks.items.script.ScriptFloatingGlassBarHandle>> r1 = r3.pluginFloatingBars
            r3 = r25
            java.lang.Object r2 = r1.get(r3)
            if (r2 != 0) goto L427
            java.util.concurrent.CopyOnWriteArrayList r2 = new java.util.concurrent.CopyOnWriteArrayList
            r2.<init>()
            java.lang.Object r1 = r1.putIfAbsent(r3, r2)
            if (r1 != 0) goto L426
            goto L427
        L426:
            r2 = r1
        L427:
            java.util.concurrent.CopyOnWriteArrayList r2 = (java.util.concurrent.CopyOnWriteArrayList) r2
            r2.add(r0)
            return r0
        L42d:
            r20 = 0
            java.lang.String r0 = "悬浮底栏只能在主线程挂载"
            j8.o.A(r0)
            return r20
        L435:
            r20 = 0
        L437:
            return r20
    }

    private static final sf.n applyModuleFloatingGlassBar$lambda$1$0(java.util.concurrent.atomic.AtomicReference r3, h.Hchat.hooks.items.script.ScriptPluginBridge r4, java.lang.String r5) {
            java.lang.Object r3 = r3.get()
            h.Hchat.hooks.items.script.ScriptFloatingGlassBarHandle r3 = (h.Hchat.hooks.items.script.ScriptFloatingGlassBarHandle) r3
            sf.n r0 = sf.n.f12433a
            if (r3 == 0) goto L25
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.util.concurrent.CopyOnWriteArrayList<h.Hchat.hooks.items.script.ScriptFloatingGlassBarHandle>> r1 = r4.pluginFloatingBars
            java.lang.Object r1 = r1.get(r5)
            java.util.concurrent.CopyOnWriteArrayList r1 = (java.util.concurrent.CopyOnWriteArrayList) r1
            if (r1 == 0) goto L22
            r1.remove(r3)
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L22
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.util.concurrent.CopyOnWriteArrayList<h.Hchat.hooks.items.script.ScriptFloatingGlassBarHandle>> r4 = r4.pluginFloatingBars
            r4.remove(r5, r1)
        L22:
            r3.markRestored$app()
        L25:
            return r0
    }

    private static final sf.n applyModuleFloatingGlassBar$lambda$1$1(h.Hchat.hooks.items.script.ScriptPluginBridge r2, wb.p3 r3) {
            ab.a r0 = new ab.a
            r1 = 16
            r0.<init>(r3, r1)
            r2.callOnMainForResult(r0)
            sf.n r2 = sf.n.f12433a
            return r2
    }

    private static final java.lang.Boolean applyModuleFloatingGlassBar$lambda$1$1$0(wb.p3 r3) {
            wb.dr r3 = (wb.dr) r3
            r3.getClass()
            android.os.Looper r0 = android.os.Looper.myLooper()
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            boolean r0 = gg.l.a(r0, r1)
            if (r0 == 0) goto L17
            r3.a()
            goto L22
        L17:
            android.os.Handler r0 = wb.fr.f16253b
            wb.cr r1 = new wb.cr
            r2 = 0
            r1.<init>(r3, r2)
            r0.post(r1)
        L22:
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            return r3
    }

    private final boolean areAssignable(java.lang.Class<?>[] r6, java.lang.Object[] r7) {
            r5 = this;
            int r0 = r6.length
            int r1 = r7.length
            r2 = 0
            if (r0 == r1) goto L6
            return r2
        L6:
            lg.d r0 = tf.l.A0(r6)
            boolean r1 = r0 instanceof java.util.Collection
            r3 = 1
            if (r1 == 0) goto L19
            r1 = r0
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L19
            return r3
        L19:
            java.util.Iterator r0 = r0.iterator()
        L1d:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L40
            java.lang.Object r1 = r0.next()
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            r4 = r6[r1]
            r1 = r7[r1]
            boolean r1 = r5.isAssignable(r4, r1)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L1d
            return r2
        L40:
            return r3
    }

    public static /* synthetic */ void b(android.app.Activity r0, h.Hchat.hooks.items.script.ScriptPluginBridge r1, fg.l r2) {
            showOnMain$lambda$0(r0, r1, r2)
            return
    }

    private final java.lang.Class<?> boxType(java.lang.Class<?> r2) {
            r1 = this;
            boolean r0 = r2.isPrimitive()
            if (r0 != 0) goto L7
            goto L69
        L7:
            java.lang.Class r0 = java.lang.Integer.TYPE
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L12
            java.lang.Class<java.lang.Integer> r2 = java.lang.Integer.class
            return r2
        L12:
            java.lang.Class r0 = java.lang.Long.TYPE
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L1d
            java.lang.Class<java.lang.Long> r2 = java.lang.Long.class
            return r2
        L1d:
            java.lang.Class r0 = java.lang.Boolean.TYPE
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L28
            java.lang.Class<java.lang.Boolean> r2 = java.lang.Boolean.class
            return r2
        L28:
            java.lang.Class r0 = java.lang.Double.TYPE
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L33
            java.lang.Class<java.lang.Double> r2 = java.lang.Double.class
            return r2
        L33:
            java.lang.Class r0 = java.lang.Float.TYPE
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L3e
            java.lang.Class<java.lang.Float> r2 = java.lang.Float.class
            return r2
        L3e:
            java.lang.Class r0 = java.lang.Short.TYPE
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L49
            java.lang.Class<java.lang.Short> r2 = java.lang.Short.class
            return r2
        L49:
            java.lang.Class r0 = java.lang.Byte.TYPE
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L54
            java.lang.Class<java.lang.Byte> r2 = java.lang.Byte.class
            return r2
        L54:
            java.lang.Class r0 = java.lang.Character.TYPE
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L5f
            java.lang.Class<java.lang.Character> r2 = java.lang.Character.class
            return r2
        L5f:
            java.lang.Class r0 = java.lang.Void.TYPE
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L69
            java.lang.Class<java.lang.Void> r2 = java.lang.Void.class
        L69:
            return r2
    }

    public static /* synthetic */ sf.n c(java.lang.String r0, java.lang.String r1, java.util.ArrayList r2, java.lang.String r3, h.Hchat.hooks.items.script.ScriptPluginBridge r4, java.util.function.Consumer r5, android.app.Activity r6) {
            sf.n r0 = showModuleChoiceDialog$lambda$1(r0, r1, r2, r3, r4, r5, r6)
            return r0
    }

    private final <T> T callOnMainForResult(fg.a r14) {
            r13 = this;
            android.os.Looper r0 = android.os.Looper.myLooper()
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            boolean r0 = gg.l.a(r0, r1)
            java.lang.String r1 = "[Hchat:Script] 执行模块悬浮底栏操作失败: "
            r2 = 0
            if (r0 == 0) goto L32
            java.lang.Object r14 = r14.invoke()     // Catch: java.lang.Throwable -> L16
            goto L1e
        L16:
            r0 = move-exception
            r14 = r0
            sf.f r0 = new sf.f
            r0.<init>(r14)
            r14 = r0
        L1e:
            java.lang.Throwable r0 = sf.g.b(r14)
            if (r0 == 0) goto L2b
            java.lang.String r3 = r0.getMessage()
            eh.a.x(r1, r3, r0)
        L2b:
            boolean r0 = r14 instanceof sf.f
            if (r0 == 0) goto L30
            goto L31
        L30:
            r2 = r14
        L31:
            return r2
        L32:
            java.util.concurrent.atomic.AtomicInteger r4 = new java.util.concurrent.atomic.AtomicInteger
            r0 = 0
            r4.<init>(r0)
            java.util.concurrent.atomic.AtomicReference r6 = new java.util.concurrent.atomic.AtomicReference
            r6.<init>()
            java.util.concurrent.atomic.AtomicReference r8 = new java.util.concurrent.atomic.AtomicReference
            r8.<init>()
            java.util.concurrent.CountDownLatch r5 = new java.util.concurrent.CountDownLatch
            r10 = 1
            r5.<init>(r10)
            ca.x r3 = new ca.x
            r9 = 4
            r7 = r14
            r3.<init>(r4, r5, r6, r7, r8, r9)
            android.os.Handler r14 = r13.mainHandler
            boolean r14 = r14.post(r3)
            if (r14 != 0) goto L58
            goto L86
        L58:
            java.util.concurrent.TimeUnit r14 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.InterruptedException -> L62
            r11 = 5
            boolean r14 = r5.await(r11, r14)     // Catch: java.lang.InterruptedException -> L62
            r7 = r0
            goto L64
        L62:
            r14 = r0
            r7 = r10
        L64:
            if (r14 != 0) goto L94
            r14 = 3
            boolean r14 = r4.compareAndSet(r0, r14)
            if (r14 == 0) goto L87
            android.os.Handler r14 = r13.mainHandler
            r14.removeCallbacks(r3)
            if (r7 == 0) goto L81
            java.lang.Thread r14 = java.lang.Thread.currentThread()
            r14.interrupt()
            java.lang.String r14 = "[Hchat:Script] 等待模块悬浮底栏操作被中断"
            fb.v0.m(r14)
            goto L86
        L81:
            java.lang.String r14 = "[Hchat:Script] 执行模块悬浮底栏操作超时"
            fb.v0.m(r14)
        L86:
            return r2
        L87:
            int r14 = r4.get()
            r0 = 2
            if (r14 == r0) goto L94
            r5.await()     // Catch: java.lang.InterruptedException -> L92
            goto L87
        L92:
            r7 = r10
            goto L87
        L94:
            if (r7 == 0) goto L9d
            java.lang.Thread r14 = java.lang.Thread.currentThread()
            r14.interrupt()
        L9d:
            java.lang.Object r14 = r8.get()
            java.lang.Throwable r14 = (java.lang.Throwable) r14
            if (r14 == 0) goto Lad
            java.lang.String r0 = r14.getMessage()
            eh.a.x(r1, r0, r14)
            return r2
        Lad:
            java.lang.Object r14 = r6.get()
            return r14
    }

    private static final void callOnMainForResult$lambda$1(java.util.concurrent.atomic.AtomicInteger r0, int r1, int r2, java.util.concurrent.CountDownLatch r3, java.util.concurrent.atomic.AtomicReference r4, fg.a r5, java.util.concurrent.atomic.AtomicReference r6, int r7) {
            boolean r1 = r0.compareAndSet(r1, r2)
            if (r1 != 0) goto La
            r3.countDown()
            return
        La:
            java.lang.Object r1 = r5.invoke()     // Catch: java.lang.Throwable -> L18
            r4.set(r1)     // Catch: java.lang.Throwable -> L18
        L11:
            r0.set(r7)
            r3.countDown()
            return
        L18:
            r1 = move-exception
            r6.set(r1)     // Catch: java.lang.Throwable -> L1d
            goto L11
        L1d:
            r1 = move-exception
            r0.set(r7)
            r3.countDown()
            throw r1
    }

    private final java.lang.reflect.Method compatibleMethod(java.lang.Object r6, java.lang.String r7, int r8, java.lang.Object[] r9) {
            r5 = this;
            r0 = 0
            if (r7 == 0) goto L64
            boolean r1 = og.m.t0(r7)
            if (r1 == 0) goto La
            goto L64
        La:
            java.lang.Class r6 = r5.targetClass(r6)
        Le:
            if (r6 == 0) goto L64
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            boolean r1 = r6.equals(r1)
            if (r1 != 0) goto L64
            java.util.List r1 = h.Hchat.utils.KavaReflector.declaredMethods(r6)
            java.util.Iterator r1 = r1.iterator()
        L20:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L59
            java.lang.Object r2 = r1.next()
            r3 = r2
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3
            java.lang.String r4 = r3.getName()
            boolean r4 = gg.l.a(r4, r7)
            if (r4 == 0) goto L4d
            java.lang.Class[] r4 = r3.getParameterTypes()
            int r4 = r4.length
            if (r4 != r8) goto L4d
            java.lang.Class[] r3 = r3.getParameterTypes()
            r3.getClass()
            boolean r3 = r5.areAssignable(r3, r9)
            if (r3 == 0) goto L4d
            r3 = 1
            goto L4e
        L4d:
            r3 = 0
        L4e:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L20
            goto L5a
        L59:
            r2 = r0
        L5a:
            java.lang.reflect.Method r2 = (java.lang.reflect.Method) r2
            if (r2 == 0) goto L5f
            return r2
        L5f:
            java.lang.Class r6 = r6.getSuperclass()
            goto Le
        L64:
            return r0
    }

    private final java.io.File configFile(java.io.File r3) {
            r2 = this;
            if (r3 == 0) goto La
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "config.prop"
            r0.<init>(r3, r1)
            return r0
        La:
            r3 = 0
            return r3
    }

    public static /* synthetic */ void d(java.util.concurrent.atomic.AtomicInteger r8, java.util.concurrent.CountDownLatch r9, java.util.concurrent.atomic.AtomicReference r10, fg.a r11, java.util.concurrent.atomic.AtomicReference r12) {
            r2 = 1
            r7 = 2
            r1 = 0
            r0 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            callOnMainForResult$lambda$1(r0, r1, r2, r3, r4, r5, r6, r7)
            return
    }

    private final <T> void dispatchDialogCallback(java.util.function.Consumer<T> r2, T r3) {
            r1 = this;
            if (r2 == 0) goto Lf
            r2.accept(r3)     // Catch: java.lang.Throwable -> L8
            sf.n r2 = sf.n.f12433a     // Catch: java.lang.Throwable -> L8
            goto L10
        L8:
            r2 = move-exception
            sf.f r3 = new sf.f
            r3.<init>(r2)
            goto L11
        Lf:
            r2 = 0
        L10:
            r3 = r2
        L11:
            java.lang.Throwable r2 = sf.g.b(r3)
            if (r2 == 0) goto L20
            java.lang.String r3 = r2.getMessage()
            java.lang.String r0 = "[Hchat:Script] 模块弹窗回调失败: "
            eh.a.x(r0, r3, r2)
        L20:
            return
    }

    public static /* synthetic */ sf.n e(java.lang.String r0, java.lang.String r1, java.util.ArrayList r2, java.util.Set r3, java.lang.String r4, h.Hchat.hooks.items.script.ScriptPluginBridge r5, java.util.function.Consumer r6, android.app.Activity r7) {
            sf.n r0 = showModuleMultiChoiceDialog$lambda$3(r0, r1, r2, r3, r4, r5, r6, r7)
            return r0
    }

    public static /* synthetic */ sf.n f(h.Hchat.hooks.items.script.ScriptPluginBridge r0, java.util.function.Consumer r1, int r2) {
            sf.n r0 = showModuleChoiceDialog$lambda$1$1(r0, r1, r2)
            return r0
    }

    private final android.app.Activity findActivity(android.content.Context r2) {
            r1 = this;
        L0:
            boolean r0 = r2 instanceof android.content.ContextWrapper
            if (r0 == 0) goto L17
            boolean r0 = r2 instanceof android.app.Activity
            if (r0 == 0) goto Lb
            android.app.Activity r2 = (android.app.Activity) r2
            return r2
        Lb:
            r0 = r2
            android.content.ContextWrapper r0 = (android.content.ContextWrapper) r0
            android.content.Context r0 = r0.getBaseContext()
            if (r0 != r2) goto L15
            goto L17
        L15:
            r2 = r0
            goto L0
        L17:
            boolean r0 = r2 instanceof android.app.Activity
            if (r0 == 0) goto L1e
            android.app.Activity r2 = (android.app.Activity) r2
            return r2
        L1e:
            r2 = 0
            return r2
    }

    public static /* synthetic */ sf.n g() {
            sf.n r0 = showModuleDialog$lambda$0$0()
            return r0
    }

    public static /* synthetic */ sf.n h() {
            sf.n r0 = showModuleConfirmDialog$lambda$0$1()
            return r0
    }

    public static /* synthetic */ sf.n i(h.Hchat.hooks.items.script.ScriptPluginBridge r0, java.util.function.Consumer r1, java.util.Set r2) {
            sf.n r0 = showModuleMultiChoiceDialog$lambda$3$1(r0, r1, r2)
            return r0
    }

    private final boolean isAssignable(java.lang.Class<?> r1, java.lang.Object r2) {
            r0 = this;
            if (r2 != 0) goto L9
            boolean r1 = r1.isPrimitive()
            r1 = r1 ^ 1
            return r1
        L9:
            java.lang.Class r1 = r0.boxType(r1)
            java.lang.Class r2 = r2.getClass()
            boolean r1 = r1.isAssignableFrom(r2)
            return r1
    }

    public static /* synthetic */ sf.n j(java.lang.String r0, java.lang.String r1, java.lang.String r2, h.Hchat.hooks.items.script.ScriptPluginBridge r3, java.util.function.Consumer r4, android.app.Activity r5) {
            sf.n r0 = showModuleConfirmDialog$lambda$0(r0, r1, r2, r3, r4, r5)
            return r0
    }

    public static /* synthetic */ sf.n k() {
            sf.n r0 = showModuleInputDialog$lambda$0$1()
            return r0
    }

    public static /* synthetic */ sf.n l(h.Hchat.hooks.items.script.ScriptPluginBridge r0, wb.dr r1) {
            sf.n r0 = applyModuleFloatingGlassBar$lambda$1$1(r0, r1)
            return r0
    }

    private final java.util.Properties loadPluginConfig(java.io.File r11) {
            r10 = this;
            java.lang.String r0 = "[Hchat:Script] 读取插件配置失败: "
            java.lang.String r1 = "无法创建插件配置锁目录: "
            java.lang.String r2 = "无法创建插件配置目录: "
            java.util.Properties r3 = new java.util.Properties
            r3.<init>()
            java.io.File r4 = r10.configFile(r11)
            if (r4 == 0) goto L134
            boolean r5 = r4.isFile()
            if (r5 != 0) goto L19
            goto L134
        L19:
            java.lang.Object r5 = r10.configLock
            monitor-enter(r5)
            java.io.File r6 = r4.getParentFile()     // Catch: java.lang.Throwable -> L49
            if (r6 == 0) goto Lf3
            boolean r7 = r6.isDirectory()     // Catch: java.lang.Throwable -> L49
            if (r7 != 0) goto L4c
            boolean r7 = r6.mkdirs()     // Catch: java.lang.Throwable -> L49
            if (r7 == 0) goto L2f
            goto L4c
        L2f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L49
            java.lang.String r4 = r6.getAbsolutePath()     // Catch: java.lang.Throwable -> L49
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L49
            r6.<init>(r2)     // Catch: java.lang.Throwable -> L49
            r6.append(r4)     // Catch: java.lang.Throwable -> L49
            java.lang.String r2 = r6.toString()     // Catch: java.lang.Throwable -> L49
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L49
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L49
            throw r1     // Catch: java.lang.Throwable -> L49
        L49:
            r1 = move-exception
            goto Lfb
        L4c:
            java.io.File r2 = new java.io.File     // Catch: java.lang.Throwable -> L49
            android.content.Context r7 = r10.hostContext     // Catch: java.lang.Throwable -> L49
            java.io.File r7 = ub.b.d(r7)     // Catch: java.lang.Throwable -> L49
            java.lang.String r8 = "script_plugin_locks"
            r2.<init>(r7, r8)     // Catch: java.lang.Throwable -> L49
            boolean r7 = r2.isDirectory()     // Catch: java.lang.Throwable -> L49
            if (r7 != 0) goto L80
            boolean r7 = r2.mkdirs()     // Catch: java.lang.Throwable -> L49
            if (r7 == 0) goto L66
            goto L80
        L66:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L49
            java.lang.String r2 = r2.getAbsolutePath()     // Catch: java.lang.Throwable -> L49
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L49
            r6.<init>(r1)     // Catch: java.lang.Throwable -> L49
            r6.append(r2)     // Catch: java.lang.Throwable -> L49
            java.lang.String r1 = r6.toString()     // Catch: java.lang.Throwable -> L49
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L49
            r4.<init>(r1)     // Catch: java.lang.Throwable -> L49
            throw r4     // Catch: java.lang.Throwable -> L49
        L80:
            java.lang.String r1 = r6.getAbsolutePath()     // Catch: java.lang.Throwable -> L49
            int r1 = r1.hashCode()     // Catch: java.lang.Throwable -> L49
            java.lang.String r1 = java.lang.Integer.toHexString(r1)     // Catch: java.lang.Throwable -> L49
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L49
            r6.<init>()     // Catch: java.lang.Throwable -> L49
            r6.append(r1)     // Catch: java.lang.Throwable -> L49
            java.lang.String r1 = ".lock"
            r6.append(r1)     // Catch: java.lang.Throwable -> L49
            java.lang.String r1 = r6.toString()     // Catch: java.lang.Throwable -> L49
            java.io.File r6 = new java.io.File     // Catch: java.lang.Throwable -> L49
            r6.<init>(r2, r1)     // Catch: java.lang.Throwable -> L49
            java.io.RandomAccessFile r1 = new java.io.RandomAccessFile     // Catch: java.lang.Throwable -> L49
            java.lang.String r2 = "rw"
            r1.<init>(r6, r2)     // Catch: java.lang.Throwable -> L49
            java.nio.channels.FileChannel r2 = r1.getChannel()     // Catch: java.lang.Throwable -> Ldf
            java.nio.channels.FileLock r6 = r2.lock()     // Catch: java.lang.Throwable -> Le1
            boolean r7 = r4.isFile()     // Catch: java.lang.Throwable -> Lca
            if (r7 == 0) goto Ld3
            java.nio.charset.Charset r7 = og.a.f9804a     // Catch: java.lang.Throwable -> Lca
            java.io.InputStreamReader r8 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> Lca
            java.io.FileInputStream r9 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> Lca
            r9.<init>(r4)     // Catch: java.lang.Throwable -> Lca
            r8.<init>(r9, r7)     // Catch: java.lang.Throwable -> Lca
            r3.load(r8)     // Catch: java.lang.Throwable -> Lcc
            r8.close()     // Catch: java.lang.Throwable -> Lca
            goto Ld3
        Lca:
            r4 = move-exception
            goto Le3
        Lcc:
            r4 = move-exception
            throw r4     // Catch: java.lang.Throwable -> Lce
        Lce:
            r7 = move-exception
            ig.a.i(r8, r4)     // Catch: java.lang.Throwable -> Lca
            throw r7     // Catch: java.lang.Throwable -> Lca
        Ld3:
            r6.release()     // Catch: java.lang.Throwable -> Le1
            r2.close()     // Catch: java.lang.Throwable -> Ldf
            r1.close()     // Catch: java.lang.Throwable -> L49
            sf.n r1 = sf.n.f12433a     // Catch: java.lang.Throwable -> L49
            goto L101
        Ldf:
            r2 = move-exception
            goto Led
        Le1:
            r4 = move-exception
            goto Le7
        Le3:
            r6.release()     // Catch: java.lang.Throwable -> Le1
            throw r4     // Catch: java.lang.Throwable -> Le1
        Le7:
            throw r4     // Catch: java.lang.Throwable -> Le8
        Le8:
            r6 = move-exception
            ig.a.i(r2, r4)     // Catch: java.lang.Throwable -> Ldf
            throw r6     // Catch: java.lang.Throwable -> Ldf
        Led:
            throw r2     // Catch: java.lang.Throwable -> Lee
        Lee:
            r4 = move-exception
            ig.a.i(r1, r2)     // Catch: java.lang.Throwable -> L49
            throw r4     // Catch: java.lang.Throwable -> L49
        Lf3:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L49
            java.lang.String r2 = "插件配置目录不可用"
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L49
            throw r1     // Catch: java.lang.Throwable -> L49
        Lfb:
            sf.f r2 = new sf.f     // Catch: java.lang.Throwable -> L10e
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L10e
            r1 = r2
        L101:
            java.lang.Throwable r1 = sf.g.b(r1)     // Catch: java.lang.Throwable -> L10e
            if (r1 == 0) goto L130
            if (r11 == 0) goto L110
            java.lang.String r11 = r11.getName()     // Catch: java.lang.Throwable -> L10e
            goto L111
        L10e:
            r11 = move-exception
            goto L132
        L110:
            r11 = 0
        L111:
            if (r11 != 0) goto L115
            java.lang.String r11 = ""
        L115:
            java.lang.String r2 = r1.getMessage()     // Catch: java.lang.Throwable -> L10e
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L10e
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L10e
            r4.append(r11)     // Catch: java.lang.Throwable -> L10e
            java.lang.String r11 = " "
            r4.append(r11)     // Catch: java.lang.Throwable -> L10e
            r4.append(r2)     // Catch: java.lang.Throwable -> L10e
            java.lang.String r11 = r4.toString()     // Catch: java.lang.Throwable -> L10e
            fb.v0.n(r11, r1)     // Catch: java.lang.Throwable -> L10e
        L130:
            monitor-exit(r5)
            return r3
        L132:
            monitor-exit(r5)
            throw r11
        L134:
            return r3
    }

    public static /* synthetic */ sf.n m(java.lang.String r0, java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, h.Hchat.hooks.items.script.ScriptPluginBridge r5, java.util.function.Consumer r6, android.app.Activity r7) {
            sf.n r0 = showModuleInputDialog$lambda$0(r0, r1, r2, r3, r4, r5, r6, r7)
            return r0
    }

    public static /* synthetic */ sf.n n(h.Hchat.hooks.items.script.ScriptPluginBridge r0, java.util.function.Consumer r1, boolean r2) {
            sf.n r0 = showModuleConfirmDialog$lambda$0$0(r0, r1, r2)
            return r0
    }

    private final java.util.Set<java.lang.String> normalizeStringSet(java.util.Set<?> r4) {
            r3 = this;
            r0 = r4
            java.util.Collection r0 = (java.util.Collection) r0
            if (r0 == 0) goto L5d
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Lc
            goto L5d
        Lc:
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r4 = r4.iterator()
        L17:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L2f
            java.lang.Object r1 = r4.next()
            if (r1 == 0) goto L28
            java.lang.String r1 = r1.toString()
            goto L29
        L28:
            r1 = 0
        L29:
            if (r1 == 0) goto L17
            r0.add(r1)
            goto L17
        L2f:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r0 = r0.iterator()
        L38:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L54
            java.lang.Object r1 = r0.next()
            r2 = r1
            java.lang.String r2 = (java.lang.String) r2
            int r2 = r2.length()
            if (r2 <= 0) goto L4d
            r2 = 1
            goto L4e
        L4d:
            r2 = 0
        L4e:
            if (r2 == 0) goto L38
            r4.add(r1)
            goto L38
        L54:
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            tf.m.N1(r4, r0)
            return r0
        L5d:
            tf.v r4 = tf.v.f13169g
            return r4
    }

    public static /* synthetic */ java.lang.Boolean o(wb.p3 r0) {
            java.lang.Boolean r0 = applyModuleFloatingGlassBar$lambda$1$1$0(r0)
            return r0
    }

    public static /* synthetic */ java.lang.Boolean p(java.util.concurrent.CopyOnWriteArrayList r0) {
            java.lang.Boolean r0 = unhookPlugin$lambda$0$0(r0)
            return r0
    }

    private final void putConfigValue(java.io.File r12, java.lang.String r13, java.lang.String r14) {
            r11 = this;
            java.lang.String r0 = "[Hchat:Script] 写入插件配置失败: "
            java.lang.String r1 = "无法创建插件配置锁目录: "
            java.lang.String r2 = "无法创建插件配置目录: "
            if (r13 == 0) goto L156
            boolean r3 = og.m.t0(r13)
            r4 = 0
            if (r3 != 0) goto L10
            goto L11
        L10:
            r13 = r4
        L11:
            if (r13 == 0) goto L156
            java.io.File r3 = r11.configFile(r12)
            if (r3 == 0) goto L156
            java.lang.Object r5 = r11.configLock
            monitor-enter(r5)
            java.io.File r6 = r3.getParentFile()     // Catch: java.lang.Throwable -> L49
            if (r6 == 0) goto L116
            boolean r7 = r6.isDirectory()     // Catch: java.lang.Throwable -> L49
            if (r7 != 0) goto L4c
            boolean r7 = r6.mkdirs()     // Catch: java.lang.Throwable -> L49
            if (r7 == 0) goto L2f
            goto L4c
        L2f:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L49
            java.lang.String r14 = r6.getAbsolutePath()     // Catch: java.lang.Throwable -> L49
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L49
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L49
            r1.append(r14)     // Catch: java.lang.Throwable -> L49
            java.lang.String r14 = r1.toString()     // Catch: java.lang.Throwable -> L49
            java.lang.String r14 = r14.toString()     // Catch: java.lang.Throwable -> L49
            r13.<init>(r14)     // Catch: java.lang.Throwable -> L49
            throw r13     // Catch: java.lang.Throwable -> L49
        L49:
            r13 = move-exception
            goto L11e
        L4c:
            java.io.File r2 = new java.io.File     // Catch: java.lang.Throwable -> L49
            android.content.Context r7 = r11.hostContext     // Catch: java.lang.Throwable -> L49
            java.io.File r7 = ub.b.d(r7)     // Catch: java.lang.Throwable -> L49
            java.lang.String r8 = "script_plugin_locks"
            r2.<init>(r7, r8)     // Catch: java.lang.Throwable -> L49
            boolean r7 = r2.isDirectory()     // Catch: java.lang.Throwable -> L49
            if (r7 != 0) goto L80
            boolean r7 = r2.mkdirs()     // Catch: java.lang.Throwable -> L49
            if (r7 == 0) goto L66
            goto L80
        L66:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L49
            java.lang.String r14 = r2.getAbsolutePath()     // Catch: java.lang.Throwable -> L49
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L49
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L49
            r2.append(r14)     // Catch: java.lang.Throwable -> L49
            java.lang.String r14 = r2.toString()     // Catch: java.lang.Throwable -> L49
            java.lang.String r14 = r14.toString()     // Catch: java.lang.Throwable -> L49
            r13.<init>(r14)     // Catch: java.lang.Throwable -> L49
            throw r13     // Catch: java.lang.Throwable -> L49
        L80:
            java.lang.String r1 = r6.getAbsolutePath()     // Catch: java.lang.Throwable -> L49
            int r1 = r1.hashCode()     // Catch: java.lang.Throwable -> L49
            java.lang.String r1 = java.lang.Integer.toHexString(r1)     // Catch: java.lang.Throwable -> L49
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L49
            r6.<init>()     // Catch: java.lang.Throwable -> L49
            r6.append(r1)     // Catch: java.lang.Throwable -> L49
            java.lang.String r1 = ".lock"
            r6.append(r1)     // Catch: java.lang.Throwable -> L49
            java.lang.String r1 = r6.toString()     // Catch: java.lang.Throwable -> L49
            java.io.File r6 = new java.io.File     // Catch: java.lang.Throwable -> L49
            r6.<init>(r2, r1)     // Catch: java.lang.Throwable -> L49
            java.io.RandomAccessFile r1 = new java.io.RandomAccessFile     // Catch: java.lang.Throwable -> L49
            java.lang.String r2 = "rw"
            r1.<init>(r6, r2)     // Catch: java.lang.Throwable -> L49
            java.nio.channels.FileChannel r2 = r1.getChannel()     // Catch: java.lang.Throwable -> Lfb
            java.nio.channels.FileLock r6 = r2.lock()     // Catch: java.lang.Throwable -> Lfd
            java.util.Properties r7 = new java.util.Properties     // Catch: java.lang.Throwable -> Lcf
            r7.<init>()     // Catch: java.lang.Throwable -> Lcf
            boolean r8 = r3.isFile()     // Catch: java.lang.Throwable -> Lcf
            if (r8 == 0) goto Ld8
            java.nio.charset.Charset r8 = og.a.f9804a     // Catch: java.lang.Throwable -> Lcf
            java.io.InputStreamReader r9 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> Lcf
            java.io.FileInputStream r10 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> Lcf
            r10.<init>(r3)     // Catch: java.lang.Throwable -> Lcf
            r9.<init>(r10, r8)     // Catch: java.lang.Throwable -> Lcf
            r7.load(r9)     // Catch: java.lang.Throwable -> Ld1
            r9.close()     // Catch: java.lang.Throwable -> Lcf
            goto Ld8
        Lcf:
            r13 = move-exception
            goto L106
        Ld1:
            r13 = move-exception
            throw r13     // Catch: java.lang.Throwable -> Ld3
        Ld3:
            r14 = move-exception
            ig.a.i(r9, r13)     // Catch: java.lang.Throwable -> Lcf
            throw r14     // Catch: java.lang.Throwable -> Lcf
        Ld8:
            r7.setProperty(r13, r14)     // Catch: java.lang.Throwable -> Lcf
            java.nio.charset.Charset r13 = og.a.f9804a     // Catch: java.lang.Throwable -> Lcf
            java.io.OutputStreamWriter r14 = new java.io.OutputStreamWriter     // Catch: java.lang.Throwable -> Lcf
            java.io.FileOutputStream r8 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> Lcf
            r8.<init>(r3)     // Catch: java.lang.Throwable -> Lcf
            r14.<init>(r8, r13)     // Catch: java.lang.Throwable -> Lcf
            java.lang.String r13 = "Hchat script plugin config"
            r7.store(r14, r13)     // Catch: java.lang.Throwable -> Lff
            r14.close()     // Catch: java.lang.Throwable -> Lcf
            r6.release()     // Catch: java.lang.Throwable -> Lfd
            r2.close()     // Catch: java.lang.Throwable -> Lfb
            r1.close()     // Catch: java.lang.Throwable -> L49
            sf.n r13 = sf.n.f12433a     // Catch: java.lang.Throwable -> L49
            goto L124
        Lfb:
            r13 = move-exception
            goto L110
        Lfd:
            r13 = move-exception
            goto L10a
        Lff:
            r13 = move-exception
            throw r13     // Catch: java.lang.Throwable -> L101
        L101:
            r3 = move-exception
            ig.a.i(r14, r13)     // Catch: java.lang.Throwable -> Lcf
            throw r3     // Catch: java.lang.Throwable -> Lcf
        L106:
            r6.release()     // Catch: java.lang.Throwable -> Lfd
            throw r13     // Catch: java.lang.Throwable -> Lfd
        L10a:
            throw r13     // Catch: java.lang.Throwable -> L10b
        L10b:
            r14 = move-exception
            ig.a.i(r2, r13)     // Catch: java.lang.Throwable -> Lfb
            throw r14     // Catch: java.lang.Throwable -> Lfb
        L110:
            throw r13     // Catch: java.lang.Throwable -> L111
        L111:
            r14 = move-exception
            ig.a.i(r1, r13)     // Catch: java.lang.Throwable -> L49
            throw r14     // Catch: java.lang.Throwable -> L49
        L116:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L49
            java.lang.String r14 = "插件配置目录不可用"
            r13.<init>(r14)     // Catch: java.lang.Throwable -> L49
            throw r13     // Catch: java.lang.Throwable -> L49
        L11e:
            sf.f r14 = new sf.f     // Catch: java.lang.Throwable -> L131
            r14.<init>(r13)     // Catch: java.lang.Throwable -> L131
            r13 = r14
        L124:
            java.lang.Throwable r13 = sf.g.b(r13)     // Catch: java.lang.Throwable -> L131
            if (r13 == 0) goto L152
            if (r12 == 0) goto L133
            java.lang.String r4 = r12.getName()     // Catch: java.lang.Throwable -> L131
            goto L133
        L131:
            r12 = move-exception
            goto L154
        L133:
            if (r4 != 0) goto L137
            java.lang.String r4 = ""
        L137:
            java.lang.String r12 = r13.getMessage()     // Catch: java.lang.Throwable -> L131
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L131
            r14.<init>(r0)     // Catch: java.lang.Throwable -> L131
            r14.append(r4)     // Catch: java.lang.Throwable -> L131
            java.lang.String r0 = " "
            r14.append(r0)     // Catch: java.lang.Throwable -> L131
            r14.append(r12)     // Catch: java.lang.Throwable -> L131
            java.lang.String r12 = r14.toString()     // Catch: java.lang.Throwable -> L131
            fb.v0.n(r12, r13)     // Catch: java.lang.Throwable -> L131
        L152:
            monitor-exit(r5)
            return
        L154:
            monitor-exit(r5)
            throw r12
        L156:
            return
    }

    public static /* synthetic */ sf.n q(java.util.concurrent.atomic.AtomicReference r0, h.Hchat.hooks.items.script.ScriptPluginBridge r1, java.lang.String r2) {
            sf.n r0 = applyModuleFloatingGlassBar$lambda$1$0(r0, r1, r2)
            return r0
    }

    public static /* synthetic */ h.Hchat.hooks.items.script.ScriptFloatingGlassBarHandle r(h.Hchat.hooks.items.script.ScriptPluginBridge r0, android.view.View r1, java.util.Map r2, java.lang.String r3) {
            h.Hchat.hooks.items.script.ScriptFloatingGlassBarHandle r0 = applyModuleFloatingGlassBar$lambda$1(r0, r1, r2, r3)
            return r0
    }

    private final java.lang.Object receiverFor(java.lang.Object r2, java.lang.reflect.Field r3) {
            r1 = this;
            boolean r0 = r2 instanceof java.lang.Class
            if (r0 != 0) goto Lc
            boolean r3 = h.Hchat.utils.KavaReflector.isStatic(r3)
            if (r3 == 0) goto Lb
            goto Lc
        Lb:
            return r2
        Lc:
            r2 = 0
            return r2
    }

    private final java.lang.Object receiverFor(java.lang.Object r2, java.lang.reflect.Method r3) {
            r1 = this;
            boolean r0 = r2 instanceof java.lang.Class
            if (r0 != 0) goto Lc
            boolean r3 = h.Hchat.utils.KavaReflector.isStatic(r3)
            if (r3 == 0) goto Lb
            goto Lc
        Lb:
            return r2
        Lc:
            r2 = 0
            return r2
    }

    private final void rememberHook(java.lang.String r3, de.robv.android.xposed.XC_MethodHook.Unhook r4) {
            r2 = this;
            if (r3 == 0) goto L26
            boolean r0 = og.m.t0(r3)
            if (r0 == 0) goto L9
            goto L26
        L9:
            if (r4 != 0) goto Lc
            return
        Lc:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.util.concurrent.CopyOnWriteArrayList<de.robv.android.xposed.XC_MethodHook$Unhook>> r0 = r2.pluginHooks
            java.lang.Object r1 = r0.get(r3)
            if (r1 != 0) goto L21
            java.util.concurrent.CopyOnWriteArrayList r1 = new java.util.concurrent.CopyOnWriteArrayList
            r1.<init>()
            java.lang.Object r3 = r0.putIfAbsent(r3, r1)
            if (r3 != 0) goto L20
            goto L21
        L20:
            r1 = r3
        L21:
            java.util.concurrent.CopyOnWriteArrayList r1 = (java.util.concurrent.CopyOnWriteArrayList) r1
            r1.add(r4)
        L26:
            return
    }

    public static /* synthetic */ sf.n s() {
            sf.n r0 = showModuleChoiceDialog$lambda$1$2()
            return r0
    }

    private static final sf.n showModuleChoiceDialog$lambda$1(java.lang.String r5, java.lang.String r6, java.util.List r7, java.lang.String r8, h.Hchat.hooks.items.script.ScriptPluginBridge r9, java.util.function.Consumer r10, android.app.Activity r11) {
            r11.getClass()
            java.lang.String r0 = ""
            if (r5 != 0) goto L8
            r5 = r0
        L8:
            if (r6 != 0) goto Lb
            r6 = r0
        Lb:
            r1 = r8
            java.util.ArrayList r8 = new java.util.ArrayList
            int r2 = tf.n.e1(r7)
            r8.<init>(r2)
            java.util.Iterator r7 = r7.iterator()
        L19:
            boolean r2 = r7.hasNext()
            if (r2 == 0) goto L2e
            java.lang.Object r2 = r7.next()
            java.lang.String r2 = (java.lang.String) r2
            sf.e r3 = new sf.e
            r3.<init>(r2, r0)
            r8.add(r3)
            goto L19
        L2e:
            eb.n r7 = new eb.n
            r0 = 0
            r7.<init>(r9, r10, r0)
            bi.c r10 = new bi.c
            r9 = 14
            r10.<init>(r9)
            wb.y2 r9 = wb.lv.f17580g
            r9.getClass()
            wb.lv r9 = wb.y2.K1(r1)
            r4 = r6
            r6 = r5
            r5 = r11
            r11 = r9
            r9 = r7
            r7 = r4
            wb.y2.Q1(r5, r6, r7, r8, r9, r10, r11)
            sf.n r5 = sf.n.f12433a
            return r5
    }

    private static final sf.n showModuleChoiceDialog$lambda$1$1(h.Hchat.hooks.items.script.ScriptPluginBridge r0, java.util.function.Consumer r1, int r2) {
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.dispatchDialogCallback(r1, r2)
            sf.n r0 = sf.n.f12433a
            return r0
    }

    private static final sf.n showModuleChoiceDialog$lambda$1$2() {
            sf.n r0 = sf.n.f12433a
            return r0
    }

    private static final sf.n showModuleConfirmDialog$lambda$0(java.lang.String r3, java.lang.String r4, java.lang.String r5, h.Hchat.hooks.items.script.ScriptPluginBridge r6, java.util.function.Consumer r7, android.app.Activity r8) {
            r8.getClass()
            java.lang.String r0 = ""
            if (r3 != 0) goto L8
            r3 = r0
        L8:
            if (r4 != 0) goto Lb
            r4 = r0
        Lb:
            r0 = r6
            eb.n r6 = new eb.n
            r1 = 2
            r6.<init>(r0, r7, r1)
            bi.c r7 = new bi.c
            r0 = 17
            r7.<init>(r0)
            wb.y2 r0 = wb.lv.f17580g
            r0.getClass()
            wb.lv r5 = wb.y2.K1(r5)
            r2 = r4
            r4 = r3
            r3 = r8
            r8 = r5
            r5 = r2
            wb.y2.S1(r3, r4, r5, r6, r7, r8)
            sf.n r3 = sf.n.f12433a
            return r3
    }

    private static final sf.n showModuleConfirmDialog$lambda$0$0(h.Hchat.hooks.items.script.ScriptPluginBridge r0, java.util.function.Consumer r1, boolean r2) {
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r0.dispatchDialogCallback(r1, r2)
            sf.n r0 = sf.n.f12433a
            return r0
    }

    private static final sf.n showModuleConfirmDialog$lambda$0$1() {
            sf.n r0 = sf.n.f12433a
            return r0
    }

    private static final sf.n showModuleDialog$lambda$0(java.lang.String r2, java.lang.String r3, java.lang.String r4, android.app.Activity r5) {
            r5.getClass()
            java.lang.String r0 = ""
            if (r2 != 0) goto L8
            r2 = r0
        L8:
            if (r3 != 0) goto Lb
            r3 = r0
        Lb:
            bi.c r0 = new bi.c
            r1 = 16
            r0.<init>(r1)
            wb.y2 r1 = wb.lv.f17580g
            r1.getClass()
            wb.lv r4 = wb.y2.K1(r4)
            wb.su r1 = new wb.su
            r1.<init>(r2, r4, r3)
            s0.d r2 = new s0.d
            r3 = -1486742852(0xffffffffa7621abc, float:-3.1378293E-15)
            r4 = 1
            r2.<init>(r3, r1, r4)
            wb.y2.P1(r5, r0, r2)
            sf.n r2 = sf.n.f12433a
            return r2
    }

    private static final sf.n showModuleDialog$lambda$0$0() {
            sf.n r0 = sf.n.f12433a
            return r0
    }

    private static final sf.n showModuleInputDialog$lambda$0(java.lang.String r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, java.lang.String r15, h.Hchat.hooks.items.script.ScriptPluginBridge r16, java.util.function.Consumer r17, android.app.Activity r18) {
            r18.getClass()
            java.lang.String r0 = ""
            if (r11 != 0) goto L9
            r2 = r0
            goto La
        L9:
            r2 = r11
        La:
            if (r12 != 0) goto Le
            r3 = r0
            goto Lf
        Le:
            r3 = r12
        Lf:
            if (r13 != 0) goto L13
            r4 = r0
            goto L14
        L13:
            r4 = r13
        L14:
            if (r14 != 0) goto L18
            r5 = r0
            goto L19
        L18:
            r5 = r14
        L19:
            eb.n r8 = new eb.n
            r11 = 3
            r12 = r16
            r13 = r17
            r8.<init>(r12, r13, r11)
            bi.c r9 = new bi.c
            r11 = 18
            r9.<init>(r11)
            wb.y2 r11 = wb.lv.f17580g
            r11.getClass()
            wb.lv r10 = wb.y2.K1(r15)
            r6 = 4000(0xfa0, float:5.605E-42)
            r7 = 1
            r1 = r18
            wb.y2.b2(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            sf.n r11 = sf.n.f12433a
            return r11
    }

    private static final sf.n showModuleInputDialog$lambda$0$0(h.Hchat.hooks.items.script.ScriptPluginBridge r0, java.util.function.Consumer r1, java.lang.String r2) {
            r2.getClass()
            r0.dispatchDialogCallback(r1, r2)
            sf.n r0 = sf.n.f12433a
            return r0
    }

    private static final sf.n showModuleInputDialog$lambda$0$1() {
            sf.n r0 = sf.n.f12433a
            return r0
    }

    private static final sf.n showModuleMultiChoiceDialog$lambda$3(java.lang.String r10, java.lang.String r11, java.util.List r12, java.util.Set r13, java.lang.String r14, h.Hchat.hooks.items.script.ScriptPluginBridge r15, java.util.function.Consumer r16, android.app.Activity r17) {
            r17.getClass()
            java.lang.String r0 = ""
            if (r10 != 0) goto L9
            r2 = r0
            goto La
        L9:
            r2 = r10
        La:
            if (r11 != 0) goto Le
            r3 = r0
            goto Lf
        Le:
            r3 = r11
        Lf:
            java.util.ArrayList r4 = new java.util.ArrayList
            int r10 = tf.n.e1(r12)
            r4.<init>(r10)
            java.util.Iterator r10 = r12.iterator()
        L1c:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L31
            java.lang.Object r11 = r10.next()
            java.lang.String r11 = (java.lang.String) r11
            sf.e r12 = new sf.e
            r12.<init>(r11, r0)
            r4.add(r12)
            goto L1c
        L31:
            eb.n r7 = new eb.n
            r10 = 1
            r11 = r16
            r7.<init>(r15, r11, r10)
            bi.c r8 = new bi.c
            r10 = 15
            r8.<init>(r10)
            wb.y2 r10 = wb.lv.f17580g
            r10.getClass()
            wb.lv r9 = wb.y2.K1(r14)
            r6 = 1
            r5 = r13
            r1 = r17
            wb.y2.Y1(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            sf.n r10 = sf.n.f12433a
            return r10
    }

    private static final sf.n showModuleMultiChoiceDialog$lambda$3$1(h.Hchat.hooks.items.script.ScriptPluginBridge r0, java.util.function.Consumer r1, java.util.Set r2) {
            r2.getClass()
            r0.dispatchDialogCallback(r1, r2)
            sf.n r0 = sf.n.f12433a
            return r0
    }

    private static final sf.n showModuleMultiChoiceDialog$lambda$3$2() {
            sf.n r0 = sf.n.f12433a
            return r0
    }

    private final boolean showOnMain(fg.l r4) {
            r3 = this;
            q8.o r0 = h.Hchat.hooks.api.core.WeChatApis.currentActivity()
            if (r0 == 0) goto L37
            android.app.Activity r0 = r0.a()
            if (r0 == 0) goto L37
            boolean r1 = r0.isFinishing()
            if (r1 != 0) goto L37
            boolean r1 = r0.isDestroyed()
            if (r1 == 0) goto L19
            goto L37
        L19:
            ac.l r1 = new ac.l
            r2 = 12
            r1.<init>(r0, r3, r4, r2)
            android.os.Looper r4 = android.os.Looper.myLooper()
            android.os.Looper r2 = android.os.Looper.getMainLooper()
            boolean r4 = gg.l.a(r4, r2)
            if (r4 == 0) goto L32
            r1.run()
            goto L35
        L32:
            r0.runOnUiThread(r1)
        L35:
            r4 = 1
            return r4
        L37:
            r4 = 0
            return r4
    }

    private static final void showOnMain$lambda$0(android.app.Activity r0, h.Hchat.hooks.items.script.ScriptPluginBridge r1, fg.l r2) {
            boolean r1 = r0.isFinishing()
            if (r1 != 0) goto L29
            boolean r1 = r0.isDestroyed()
            if (r1 == 0) goto Ld
            goto L29
        Ld:
            r2.invoke(r0)     // Catch: java.lang.Throwable -> L13
            sf.n r0 = sf.n.f12433a     // Catch: java.lang.Throwable -> L13
            goto L1a
        L13:
            r0 = move-exception
            sf.f r1 = new sf.f
            r1.<init>(r0)
            r0 = r1
        L1a:
            java.lang.Throwable r0 = sf.g.b(r0)
            if (r0 == 0) goto L29
            java.lang.String r1 = r0.getMessage()
            java.lang.String r2 = "[Hchat:Script] 显示模块弹窗失败: "
            eh.a.x(r2, r1, r0)
        L29:
            return
    }

    public static /* synthetic */ sf.n t(java.lang.String r0, java.lang.String r1, java.lang.String r2, android.app.Activity r3) {
            sf.n r0 = showModuleDialog$lambda$0(r0, r1, r2, r3)
            return r0
    }

    private final java.lang.Class<?> targetClass(java.lang.Object r2) {
            r1 = this;
            if (r2 != 0) goto L4
            r2 = 0
            return r2
        L4:
            boolean r0 = r2 instanceof java.lang.Class
            if (r0 == 0) goto Lb
            java.lang.Class r2 = (java.lang.Class) r2
            return r2
        Lb:
            java.lang.Class r2 = r2.getClass()
            return r2
    }

    public static /* synthetic */ sf.n u() {
            sf.n r0 = showModuleMultiChoiceDialog$lambda$3$2()
            return r0
    }

    private static final java.lang.Boolean unhookPlugin$lambda$0$0(java.util.concurrent.CopyOnWriteArrayList r1) {
            java.util.Iterator r1 = r1.iterator()
        L4:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L14
            java.lang.Object r0 = r1.next()
            h.Hchat.hooks.items.script.ScriptFloatingGlassBarHandle r0 = (h.Hchat.hooks.items.script.ScriptFloatingGlassBarHandle) r0
            r0.restore()
            goto L4
        L14:
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            return r1
    }

    private final <T> T withConfigFileLock(java.io.File r4, fg.a r5) {
            r3 = this;
            java.io.File r4 = r4.getParentFile()
            if (r4 == 0) goto L8c
            boolean r0 = r4.isDirectory()
            if (r0 != 0) goto L1e
            boolean r0 = r4.mkdirs()
            if (r0 == 0) goto L13
            goto L1e
        L13:
            java.lang.String r4 = r4.getAbsolutePath()
            java.lang.String r5 = "无法创建插件配置目录: "
            g1.d.h(r4, r5)
        L1c:
            r4 = 0
            return r4
        L1e:
            java.io.File r0 = new java.io.File
            android.content.Context r1 = r3.hostContext
            java.io.File r1 = ub.b.d(r1)
            java.lang.String r2 = "script_plugin_locks"
            r0.<init>(r1, r2)
            boolean r1 = r0.isDirectory()
            if (r1 != 0) goto L42
            boolean r1 = r0.mkdirs()
            if (r1 == 0) goto L38
            goto L42
        L38:
            java.lang.String r4 = r0.getAbsolutePath()
            java.lang.String r5 = "无法创建插件配置锁目录: "
            g1.d.h(r4, r5)
            goto L1c
        L42:
            java.lang.String r4 = r4.getAbsolutePath()
            int r4 = r4.hashCode()
            java.lang.String r4 = java.lang.Integer.toHexString(r4)
            java.lang.String r1 = ".lock"
            java.lang.String r4 = bc.e.i(r4, r1)
            java.io.File r1 = new java.io.File
            r1.<init>(r0, r4)
            java.io.RandomAccessFile r4 = new java.io.RandomAccessFile
            java.lang.String r0 = "rw"
            r4.<init>(r1, r0)
            java.nio.channels.FileChannel r0 = r4.getChannel()     // Catch: java.lang.Throwable -> L77
            java.nio.channels.FileLock r1 = r0.lock()     // Catch: java.lang.Throwable -> L79
            java.lang.Object r5 = r5.invoke()     // Catch: java.lang.Throwable -> L7b
            r1.release()     // Catch: java.lang.Throwable -> L79
            r1 = 0
            ig.a.i(r0, r1)     // Catch: java.lang.Throwable -> L77
            r4.close()
            return r5
        L77:
            r5 = move-exception
            goto L86
        L79:
            r5 = move-exception
            goto L80
        L7b:
            r5 = move-exception
            r1.release()     // Catch: java.lang.Throwable -> L79
            throw r5     // Catch: java.lang.Throwable -> L79
        L80:
            throw r5     // Catch: java.lang.Throwable -> L81
        L81:
            r1 = move-exception
            ig.a.i(r0, r5)     // Catch: java.lang.Throwable -> L77
            throw r1     // Catch: java.lang.Throwable -> L77
        L86:
            throw r5     // Catch: java.lang.Throwable -> L87
        L87:
            r0 = move-exception
            ig.a.i(r4, r5)
            throw r0
        L8c:
            java.lang.String r4 = "插件配置目录不可用"
            j8.o.A(r4)
            goto L1c
    }

    public final h.Hchat.hooks.items.script.ScriptFloatingGlassBarHandle applyModuleFloatingGlassBar(java.lang.String r2, android.view.View r3) {
            r1 = this;
            r0 = 0
            h.Hchat.hooks.items.script.ScriptFloatingGlassBarHandle r2 = r1.applyModuleFloatingGlassBar(r2, r3, r0)
            return r2
    }

    public final h.Hchat.hooks.items.script.ScriptFloatingGlassBarHandle applyModuleFloatingGlassBar(java.lang.String r9, android.view.View r10, java.util.Map<?, ?> r11) {
            r8 = this;
            r0 = 0
            if (r9 == 0) goto L20
            boolean r1 = og.m.t0(r9)
            if (r1 != 0) goto Lb
            r4 = r9
            goto Lc
        Lb:
            r4 = r0
        Lc:
            if (r4 == 0) goto L20
            if (r10 == 0) goto L20
            c9.n0 r2 = new c9.n0
            r7 = 2
            r3 = r8
            r5 = r10
            r6 = r11
            r2.<init>(r3, r4, r5, r6, r7)
            java.lang.Object r9 = r8.callOnMainForResult(r2)
            h.Hchat.hooks.items.script.ScriptFloatingGlassBarHandle r9 = (h.Hchat.hooks.items.script.ScriptFloatingGlassBarHandle) r9
            return r9
        L20:
            r3 = r8
            return r0
    }

    public final java.lang.Object createInstance(java.lang.Object r2, int r3) {
            r1 = this;
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Object r2 = r1.createInstance(r2, r3, r0)
            return r2
    }

    public final java.lang.Object createInstance(java.lang.Object r6, int r7, java.lang.Object[] r8) {
            r5 = this;
            java.lang.Class r6 = r5.targetClass(r6)
            r0 = 0
            if (r6 == 0) goto L53
            r1 = 0
            if (r8 == 0) goto Lb
            goto Ld
        Lb:
            java.lang.Object[] r8 = new java.lang.Object[r1]
        Ld:
            java.util.List r6 = h.Hchat.utils.KavaReflector.declaredConstructors(r6)
            java.util.Iterator r6 = r6.iterator()
        L15:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L44
            java.lang.Object r2 = r6.next()
            r3 = r2
            java.lang.reflect.Constructor r3 = (java.lang.reflect.Constructor) r3
            java.lang.Class[] r4 = r3.getParameterTypes()
            int r4 = r4.length
            if (r4 != r7) goto L38
            java.lang.Class[] r3 = r3.getParameterTypes()
            r3.getClass()
            boolean r3 = r5.areAssignable(r3, r8)
            if (r3 == 0) goto L38
            r3 = 1
            goto L39
        L38:
            r3 = r1
        L39:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L15
            goto L45
        L44:
            r2 = r0
        L45:
            java.lang.reflect.Constructor r2 = (java.lang.reflect.Constructor) r2
            if (r2 == 0) goto L53
            int r6 = r8.length
            java.lang.Object[] r6 = java.util.Arrays.copyOf(r8, r6)
            java.lang.Object r6 = h.Hchat.utils.KavaReflector.newInstance(r2, r6)
            return r6
        L53:
            return r0
    }

    public final java.io.File file(java.lang.String r3) {
            r2 = this;
            r3.getClass()
            java.io.File r0 = new java.io.File
            java.io.File r1 = r2.scriptDir
            r0.<init>(r1, r3)
            return r0
    }

    public final java.lang.Class<?> findClass(java.lang.String r2) {
            r1 = this;
            r2.getClass()
            java.lang.ClassLoader r0 = r1.classLoader
            java.lang.Class r2 = de.robv.android.xposed.XposedHelpers.findClass(r2, r0)
            r2.getClass()
            return r2
    }

    public final java.lang.reflect.Constructor<?> firstConstructor(java.lang.Object r4, int r5) {
            r3 = this;
            java.lang.Class r4 = r3.targetClass(r4)
            r0 = 0
            if (r4 == 0) goto L33
            java.util.List r4 = h.Hchat.utils.KavaReflector.declaredConstructors(r4)
            java.util.Iterator r4 = r4.iterator()
        Lf:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L31
            java.lang.Object r1 = r4.next()
            r2 = r1
            java.lang.reflect.Constructor r2 = (java.lang.reflect.Constructor) r2
            java.lang.Class[] r2 = r2.getParameterTypes()
            int r2 = r2.length
            if (r2 != r5) goto L25
            r2 = 1
            goto L26
        L25:
            r2 = 0
        L26:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto Lf
            r0 = r1
        L31:
            java.lang.reflect.Constructor r0 = (java.lang.reflect.Constructor) r0
        L33:
            return r0
    }

    public final java.lang.reflect.Field firstField(java.lang.Object r2, java.lang.String r3) {
            r1 = this;
            if (r3 == 0) goto L12
            boolean r0 = og.m.t0(r3)
            if (r0 == 0) goto L9
            goto L12
        L9:
            java.lang.Class r2 = r1.targetClass(r2)
            java.lang.reflect.Field r2 = h.Hchat.utils.KavaReflector.findFieldRecursive(r2, r3)
            return r2
        L12:
            r2 = 0
            return r2
    }

    public final java.lang.reflect.Method firstMethod(java.lang.Object r2, java.lang.String r3) {
            r1 = this;
            r0 = -1
            java.lang.reflect.Method r2 = r1.firstMethod(r2, r3, r0)
            return r2
    }

    public final java.lang.reflect.Method firstMethod(java.lang.Object r6, java.lang.String r7, int r8) {
            r5 = this;
            r0 = 0
            if (r7 == 0) goto L59
            boolean r1 = og.m.t0(r7)
            if (r1 == 0) goto La
            goto L59
        La:
            java.lang.Class r6 = r5.targetClass(r6)
        Le:
            if (r6 == 0) goto L59
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            boolean r1 = r6.equals(r1)
            if (r1 != 0) goto L59
            java.util.List r1 = h.Hchat.utils.KavaReflector.declaredMethods(r6)
            java.util.Iterator r1 = r1.iterator()
        L20:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L4e
            java.lang.Object r2 = r1.next()
            r3 = r2
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3
            java.lang.String r4 = r3.getName()
            boolean r4 = gg.l.a(r4, r7)
            if (r4 == 0) goto L42
            if (r8 < 0) goto L40
            java.lang.Class[] r3 = r3.getParameterTypes()
            int r3 = r3.length
            if (r3 != r8) goto L42
        L40:
            r3 = 1
            goto L43
        L42:
            r3 = 0
        L43:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L20
            goto L4f
        L4e:
            r2 = r0
        L4f:
            java.lang.reflect.Method r2 = (java.lang.reflect.Method) r2
            if (r2 == 0) goto L54
            return r2
        L54:
            java.lang.Class r6 = r6.getSuperclass()
            goto Le
        L59:
            return r0
    }

    public final java.lang.Class<h.Hchat.hooks.api.core.WeChatApis> getApis() {
            r1 = this;
            java.lang.Class<h.Hchat.hooks.api.core.WeChatApis> r0 = r1.apis
            return r0
    }

    public final boolean getBoolean(java.io.File r2, java.lang.String r3, boolean r4) {
            r1 = this;
            r0 = 0
            java.lang.String r2 = r1.getString(r2, r3, r0)
            java.util.Locale r3 = java.util.Locale.US
            java.lang.String r2 = j8.b.l(r3, r2, r3)
            int r3 = r2.hashCode()
            switch(r3) {
                case 48: goto L66;
                case 49: goto L5b;
                case 110: goto L52;
                case 121: goto L49;
                case 3521: goto L40;
                case 3551: goto L37;
                case 109935: goto L2e;
                case 119527: goto L25;
                case 3569038: goto L1c;
                case 97196323: goto L13;
                default: goto L12;
            }
        L12:
            goto L6e
        L13:
            java.lang.String r3 = "false"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L6f
            goto L6e
        L1c:
            java.lang.String r3 = "true"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L64
            goto L6e
        L25:
            java.lang.String r3 = "yes"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L64
            goto L6e
        L2e:
            java.lang.String r3 = "off"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L6f
            goto L6e
        L37:
            java.lang.String r3 = "on"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L64
            goto L6e
        L40:
            java.lang.String r3 = "no"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L6f
            goto L6e
        L49:
            java.lang.String r3 = "y"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L64
            goto L6e
        L52:
            java.lang.String r3 = "n"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L6f
            goto L6e
        L5b:
            java.lang.String r3 = "1"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L64
            goto L6e
        L64:
            r2 = 1
            return r2
        L66:
            java.lang.String r3 = "0"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L6f
        L6e:
            return r4
        L6f:
            r2 = 0
            return r2
    }

    public final java.lang.ClassLoader getClassLoader() {
            r1 = this;
            java.lang.ClassLoader r0 = r1.classLoader
            return r0
    }

    public final h.Hchat.hooks.items.script.ScriptDexKitBridge getDexKit() {
            r1 = this;
            h.Hchat.hooks.items.script.ScriptDexKitBridge r0 = r1.dexKit
            return r0
    }

    public final java.lang.Object getField(java.lang.Object r1, java.lang.String r2) {
            r0 = this;
            java.lang.reflect.Field r2 = r0.firstField(r1, r2)
            if (r2 == 0) goto Lf
            java.lang.Object r1 = r0.receiverFor(r1, r2)
            java.lang.Object r1 = h.Hchat.utils.KavaReflector.readField(r2, r1)
            return r1
        Lf:
            r1 = 0
            return r1
    }

    public final float getFloat(java.io.File r2, java.lang.String r3, float r4) {
            r1 = this;
            r0 = 0
            java.lang.String r2 = r1.getString(r2, r3, r0)
            r2.getClass()
            boolean r3 = og.s.T(r2)     // Catch: java.lang.NumberFormatException -> L16
            if (r3 == 0) goto L16
            float r2 = java.lang.Float.parseFloat(r2)     // Catch: java.lang.NumberFormatException -> L16
            java.lang.Float r0 = java.lang.Float.valueOf(r2)     // Catch: java.lang.NumberFormatException -> L16
        L16:
            if (r0 == 0) goto L1d
            float r2 = r0.floatValue()
            return r2
        L1d:
            return r4
    }

    public final android.content.Context getHostContext() {
            r1 = this;
            android.content.Context r0 = r1.hostContext
            return r0
    }

    public final int getInt(java.io.File r2, java.lang.String r3, int r4) {
            r1 = this;
            r0 = 0
            java.lang.String r2 = r1.getString(r2, r3, r0)
            java.lang.Integer r2 = og.t.f0(r2)
            if (r2 == 0) goto L10
            int r2 = r2.intValue()
            return r2
        L10:
            return r4
    }

    public final long getLong(java.io.File r2, java.lang.String r3, long r4) {
            r1 = this;
            r0 = 0
            java.lang.String r2 = r1.getString(r2, r3, r0)
            java.lang.Long r2 = og.t.g0(r2)
            if (r2 == 0) goto L10
            long r2 = r2.longValue()
            return r2
        L10:
            return r4
    }

    public final java.io.File getScriptDir() {
            r1 = this;
            java.io.File r0 = r1.scriptDir
            return r0
    }

    public final java.lang.String getString(java.io.File r3, java.lang.String r4, java.lang.String r5) {
            r2 = this;
            java.lang.String r0 = ""
            if (r4 == 0) goto L27
            boolean r1 = og.m.t0(r4)
            r1 = r1 ^ 1
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L15
            goto L16
        L15:
            r4 = 0
        L16:
            if (r4 == 0) goto L27
            java.util.Properties r3 = r2.loadPluginConfig(r3)
            java.lang.String r3 = r3.getProperty(r4)
            if (r3 == 0) goto L23
            return r3
        L23:
            if (r5 != 0) goto L26
            return r0
        L26:
            return r5
        L27:
            if (r5 != 0) goto L2a
            return r0
        L2a:
            return r5
    }

    public final java.util.Set<java.lang.String> getStringSet(java.io.File r4, java.lang.String r5, java.util.Set<?> r6) {
            r3 = this;
            r0 = 0
            java.lang.String r4 = r3.getString(r4, r5, r0)
            int r5 = r4.length()
            r1 = 0
            r2 = 1
            if (r5 <= 0) goto Lf
            r5 = r2
            goto L10
        Lf:
            r5 = r1
        L10:
            if (r5 == 0) goto L13
            r0 = r4
        L13:
            if (r0 == 0) goto L4e
            char[] r4 = new char[r2]
            r5 = 10
            r4[r1] = r5
            r5 = 6
            java.util.List r4 = og.m.F0(r0, r4, r5)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r4 = r4.iterator()
        L29:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L45
            java.lang.Object r6 = r4.next()
            r0 = r6
            java.lang.String r0 = (java.lang.String) r0
            int r0 = r0.length()
            if (r0 <= 0) goto L3e
            r0 = r2
            goto L3f
        L3e:
            r0 = r1
        L3f:
            if (r0 == 0) goto L29
            r5.add(r6)
            goto L29
        L45:
            java.util.LinkedHashSet r4 = new java.util.LinkedHashSet
            r4.<init>()
            tf.m.N1(r5, r4)
            return r4
        L4e:
            java.util.Set r4 = r3.normalizeStringSet(r6)
            return r4
    }

    public final de.robv.android.xposed.XC_MethodHook.Unhook hookAfter(java.lang.String r4, java.lang.reflect.Member r5, java.util.function.Consumer<de.robv.android.xposed.XC_MethodHook.MethodHookParam> r6) {
            r3 = this;
            r5.getClass()
            r6.getClass()
            r8.i r0 = r8.i.f11631b
            eb.r r1 = new eb.r
            r2 = 0
            r1.<init>(r6, r2)
            de.robv.android.xposed.XC_MethodHook$Unhook r5 = r0.b(r5, r1)
            r3.rememberHook(r4, r5)
            return r5
    }

    public final de.robv.android.xposed.XC_MethodHook.Unhook hookAfter(java.lang.reflect.Member r2, java.util.function.Consumer<de.robv.android.xposed.XC_MethodHook.MethodHookParam> r3) {
            r1 = this;
            r2.getClass()
            r3.getClass()
            r0 = 0
            de.robv.android.xposed.XC_MethodHook$Unhook r2 = r1.hookAfter(r0, r2, r3)
            return r2
    }

    public final de.robv.android.xposed.XC_MethodHook.Unhook hookBefore(java.lang.String r4, java.lang.reflect.Member r5, java.util.function.Consumer<de.robv.android.xposed.XC_MethodHook.MethodHookParam> r6) {
            r3 = this;
            r5.getClass()
            r6.getClass()
            r8.i r0 = r8.i.f11631b
            eb.r r1 = new eb.r
            r2 = 1
            r1.<init>(r6, r2)
            de.robv.android.xposed.XC_MethodHook$Unhook r5 = r0.b(r5, r1)
            r3.rememberHook(r4, r5)
            return r5
    }

    public final de.robv.android.xposed.XC_MethodHook.Unhook hookBefore(java.lang.reflect.Member r2, java.util.function.Consumer<de.robv.android.xposed.XC_MethodHook.MethodHookParam> r3) {
            r1 = this;
            r2.getClass()
            r3.getClass()
            r0 = 0
            de.robv.android.xposed.XC_MethodHook$Unhook r2 = r1.hookBefore(r0, r2, r3)
            return r2
    }

    public final de.robv.android.xposed.XC_MethodHook.Unhook hookReplace(java.lang.String r4, java.lang.reflect.Member r5, java.util.function.Function<de.robv.android.xposed.XC_MethodHook.MethodHookParam, java.lang.Object> r6) {
            r3 = this;
            r5.getClass()
            r6.getClass()
            r8.i r0 = r8.i.f11631b
            b9.e r1 = new b9.e
            r2 = 8
            r1.<init>(r6, r2)
            de.robv.android.xposed.XC_MethodHook$Unhook r5 = r0.b(r5, r1)
            r3.rememberHook(r4, r5)
            return r5
    }

    public final de.robv.android.xposed.XC_MethodHook.Unhook hookReplace(java.lang.reflect.Member r2, java.util.function.Function<de.robv.android.xposed.XC_MethodHook.MethodHookParam, java.lang.Object> r3) {
            r1 = this;
            r2.getClass()
            r3.getClass()
            r0 = 0
            de.robv.android.xposed.XC_MethodHook$Unhook r2 = r1.hookReplace(r0, r2, r3)
            return r2
    }

    public final java.lang.Object invokeMethod(java.lang.Object r3, java.lang.String r4) {
            r2 = this;
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.Object r3 = r2.invokeMethod(r3, r4, r0, r1)
            return r3
    }

    public final java.lang.Object invokeMethod(java.lang.Object r2, java.lang.String r3, int r4) {
            r1 = this;
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Object r2 = r1.invokeMethod(r2, r3, r4, r0)
            return r2
    }

    public final java.lang.Object invokeMethod(java.lang.Object r1, java.lang.String r2, int r3, java.lang.Object[] r4) {
            r0 = this;
            if (r4 == 0) goto L3
            goto L6
        L3:
            r4 = 0
            java.lang.Object[] r4 = new java.lang.Object[r4]
        L6:
            java.lang.reflect.Method r2 = r0.compatibleMethod(r1, r2, r3, r4)
            if (r2 == 0) goto L1a
            java.lang.Object r1 = r0.receiverFor(r1, r2)
            int r3 = r4.length
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r4, r3)
            java.lang.Object r1 = h.Hchat.utils.KavaReflector.invoke(r2, r1, r3)
            return r1
        L1a:
            r1 = 0
            return r1
    }

    public final java.lang.Object invokeMethod(java.lang.Object r2, java.lang.String r3, java.lang.Object[] r4) {
            r1 = this;
            if (r4 == 0) goto L3
            goto L6
        L3:
            r4 = 0
            java.lang.Object[] r4 = new java.lang.Object[r4]
        L6:
            int r0 = r4.length
            java.lang.Object r2 = r1.invokeMethod(r2, r3, r0, r4)
            return r2
    }

    public final void log(java.lang.Object r3) {
            r2 = this;
            if (r3 == 0) goto L3
            goto L5
        L3:
            java.lang.String r3 = "null"
        L5:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "[Hchat:Script] "
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            de.robv.android.xposed.XposedBridge.log(r3)
            return
    }

    public final void log(java.lang.String r7, java.io.File r8, java.lang.Object r9) {
            r6 = this;
            java.lang.String r0 = "["
            if (r9 == 0) goto Lb
            java.lang.String r9 = r9.toString()
            if (r9 == 0) goto Lb
            goto Ld
        Lb:
            java.lang.String r9 = "null"
        Ld:
            java.lang.String r1 = ""
            if (r7 != 0) goto L13
            r2 = r1
            goto L14
        L13:
            r2 = r7
        L14:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "[Hchat:Script] ["
            r3.<init>(r4)
            r3.append(r2)
            java.lang.String r2 = "] "
            r3.append(r2)
            r3.append(r9)
            java.lang.String r3 = r3.toString()
            de.robv.android.xposed.XposedBridge.log(r3)
            if (r8 == 0) goto L8b
            boolean r3 = r8.isDirectory()     // Catch: java.lang.Throwable -> L39
            if (r3 != 0) goto L3b
            r8.mkdirs()     // Catch: java.lang.Throwable -> L39
            goto L3b
        L39:
            r8 = move-exception
            goto L71
        L3b:
            java.text.SimpleDateFormat r3 = new java.text.SimpleDateFormat     // Catch: java.lang.Throwable -> L39
            java.lang.String r4 = "yyyy-MM-dd HH:mm:ss.SSS"
            java.util.Locale r5 = java.util.Locale.US     // Catch: java.lang.Throwable -> L39
            r3.<init>(r4, r5)     // Catch: java.lang.Throwable -> L39
            java.util.Date r4 = new java.util.Date     // Catch: java.lang.Throwable -> L39
            r4.<init>()     // Catch: java.lang.Throwable -> L39
            java.lang.String r3 = r3.format(r4)     // Catch: java.lang.Throwable -> L39
            java.io.File r4 = new java.io.File     // Catch: java.lang.Throwable -> L39
            java.lang.String r5 = "log.txt"
            r4.<init>(r8, r5)     // Catch: java.lang.Throwable -> L39
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L39
            r8.<init>(r0)     // Catch: java.lang.Throwable -> L39
            r8.append(r3)     // Catch: java.lang.Throwable -> L39
            r8.append(r2)     // Catch: java.lang.Throwable -> L39
            r8.append(r9)     // Catch: java.lang.Throwable -> L39
            java.lang.String r9 = "\n"
            r8.append(r9)     // Catch: java.lang.Throwable -> L39
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L39
            dg.l.Z(r4, r8)     // Catch: java.lang.Throwable -> L39
            sf.n r8 = sf.n.f12433a     // Catch: java.lang.Throwable -> L39
            goto L77
        L71:
            sf.f r9 = new sf.f
            r9.<init>(r8)
            r8 = r9
        L77:
            java.lang.Throwable r8 = sf.g.b(r8)
            if (r8 == 0) goto L8b
            if (r7 != 0) goto L80
            r7 = r1
        L80:
            java.lang.String r9 = r8.getMessage()
            java.lang.String r0 = "[Hchat:Script] 写入插件日志失败: "
            java.lang.String r1 = " "
            eh.a.w(r0, r7, r1, r9, r8)
        L8b:
            return
    }

    public final android.content.SharedPreferences prefs(java.lang.String r2) {
            r1 = this;
            r2.getClass()
            android.content.Context r0 = r1.hostContext
            android.content.SharedPreferences r2 = ub.b.c(r0, r2)
            return r2
    }

    public final void putBoolean(java.io.File r1, java.lang.String r2, boolean r3) {
            r0 = this;
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r0.putConfigValue(r1, r2, r3)
            return
    }

    public final void putFloat(java.io.File r1, java.lang.String r2, float r3) {
            r0 = this;
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r0.putConfigValue(r1, r2, r3)
            return
    }

    public final void putInt(java.io.File r1, java.lang.String r2, int r3) {
            r0 = this;
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r0.putConfigValue(r1, r2, r3)
            return
    }

    public final void putLong(java.io.File r1, java.lang.String r2, long r3) {
            r0 = this;
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r0.putConfigValue(r1, r2, r3)
            return
    }

    public final void putString(java.io.File r1, java.lang.String r2, java.lang.String r3) {
            r0 = this;
            if (r3 != 0) goto L4
            java.lang.String r3 = ""
        L4:
            r0.putConfigValue(r1, r2, r3)
            return
    }

    public final void putStringSet(java.io.File r7, java.lang.String r8, java.util.Set<?> r9) {
            r6 = this;
            java.util.Set r9 = r6.normalizeStringSet(r9)
            r0 = r9
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            r4 = 0
            r5 = 62
            java.lang.String r1 = "\n"
            r2 = 0
            r3 = 0
            java.lang.String r9 = tf.m.A1(r0, r1, r2, r3, r4, r5)
            r6.putConfigValue(r7, r8, r9)
            return
    }

    public final void setField(java.lang.Object r1, java.lang.String r2, java.lang.Object r3) {
            r0 = this;
            java.lang.reflect.Field r2 = r0.firstField(r1, r2)
            if (r2 == 0) goto Ld
            java.lang.Object r1 = r0.receiverFor(r1, r2)
            h.Hchat.utils.KavaReflector.writeField(r2, r1, r3)
        Ld:
            return
    }

    public final boolean showModuleChoiceDialog(java.lang.String r8, java.lang.String r9, java.util.List<?> r10, java.lang.String r11, java.util.function.Consumer<java.lang.Integer> r12) {
            r7 = this;
            if (r10 != 0) goto L4
            tf.t r10 = tf.t.f13167g
        L4:
            java.util.ArrayList r3 = new java.util.ArrayList
            int r0 = tf.n.e1(r10)
            r3.<init>(r0)
            java.util.Iterator r10 = r10.iterator()
        L11:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L2b
            java.lang.Object r0 = r10.next()
            if (r0 == 0) goto L22
            java.lang.String r0 = r0.toString()
            goto L23
        L22:
            r0 = 0
        L23:
            if (r0 != 0) goto L27
            java.lang.String r0 = ""
        L27:
            r3.add(r0)
            goto L11
        L2b:
            boolean r10 = r3.isEmpty()
            if (r10 == 0) goto L33
            r8 = 0
            return r8
        L33:
            eb.p r0 = new eb.p
            r5 = r7
            r1 = r8
            r2 = r9
            r4 = r11
            r6 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6)
            boolean r8 = r7.showOnMain(r0)
            return r8
    }

    public final boolean showModuleChoiceDialog(java.lang.String r7, java.lang.String r8, java.util.List<?> r9, java.util.function.Consumer<java.lang.Integer> r10) {
            r6 = this;
            r4 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r5 = r10
            boolean r7 = r0.showModuleChoiceDialog(r1, r2, r3, r4, r5)
            return r7
    }

    public final boolean showModuleConfirmDialog(java.lang.String r8, java.lang.String r9, java.lang.String r10, java.util.function.Consumer<java.lang.Boolean> r11) {
            r7 = this;
            eb.o r0 = new eb.o
            r6 = 0
            r4 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r5 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6)
            boolean r8 = r7.showOnMain(r0)
            return r8
    }

    public final boolean showModuleConfirmDialog(java.lang.String r2, java.lang.String r3, java.util.function.Consumer<java.lang.Boolean> r4) {
            r1 = this;
            r0 = 0
            boolean r2 = r1.showModuleConfirmDialog(r2, r3, r0, r4)
            return r2
    }

    public final boolean showModuleDialog(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            r0 = 0
            boolean r2 = r1.showModuleDialog(r2, r3, r0)
            return r2
    }

    public final boolean showModuleDialog(java.lang.String r3, java.lang.String r4, java.lang.String r5) {
            r2 = this;
            eb.l r0 = new eb.l
            r1 = 0
            r0.<init>(r1, r3, r4, r5)
            boolean r3 = r2.showOnMain(r0)
            return r3
    }

    public final boolean showModuleInputDialog(java.lang.String r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, java.util.function.Consumer<java.lang.String> r15) {
            r9 = this;
            eb.m r0 = new eb.m
            r8 = 0
            r6 = r9
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r7 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            boolean r10 = r9.showOnMain(r0)
            return r10
    }

    public final boolean showModuleInputDialog(java.lang.String r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, java.util.function.Consumer<java.lang.String> r12) {
            r7 = this;
            r5 = 0
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r6 = r12
            boolean r8 = r0.showModuleInputDialog(r1, r2, r3, r4, r5, r6)
            return r8
    }

    public final boolean showModuleMultiChoiceDialog(java.lang.String r9, java.lang.String r10, java.util.List<?> r11, java.util.Set<?> r12, java.lang.String r13, java.util.function.Consumer<java.util.Set<java.lang.Integer>> r14) {
            r8 = this;
            if (r11 != 0) goto L4
            tf.t r11 = tf.t.f13167g
        L4:
            java.util.ArrayList r3 = new java.util.ArrayList
            int r0 = tf.n.e1(r11)
            r3.<init>(r0)
            java.util.Iterator r11 = r11.iterator()
        L11:
            boolean r0 = r11.hasNext()
            r1 = 0
            if (r0 == 0) goto L2a
            java.lang.Object r0 = r11.next()
            if (r0 == 0) goto L22
            java.lang.String r1 = r0.toString()
        L22:
            if (r1 != 0) goto L26
            java.lang.String r1 = ""
        L26:
            r3.add(r1)
            goto L11
        L2a:
            boolean r11 = r3.isEmpty()
            r0 = 0
            if (r11 == 0) goto L32
            return r0
        L32:
            if (r12 != 0) goto L36
            tf.v r12 = tf.v.f13169g
        L36:
            java.lang.Iterable r12 = (java.lang.Iterable) r12
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.Iterator r12 = r12.iterator()
        L41:
            boolean r2 = r12.hasNext()
            if (r2 == 0) goto L65
            java.lang.Object r2 = r12.next()
            boolean r4 = r2 instanceof java.lang.Number
            if (r4 == 0) goto L52
            java.lang.Number r2 = (java.lang.Number) r2
            goto L53
        L52:
            r2 = r1
        L53:
            if (r2 == 0) goto L5e
            int r2 = r2.intValue()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L5f
        L5e:
            r2 = r1
        L5f:
            if (r2 == 0) goto L41
            r11.add(r2)
            goto L41
        L65:
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.util.Iterator r11 = r11.iterator()
        L6e:
            boolean r1 = r11.hasNext()
            if (r1 == 0) goto L90
            java.lang.Object r1 = r11.next()
            r2 = r1
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            if (r2 < 0) goto L89
            int r4 = r3.size()
            if (r2 >= r4) goto L89
            r2 = 1
            goto L8a
        L89:
            r2 = r0
        L8a:
            if (r2 == 0) goto L6e
            r12.add(r1)
            goto L6e
        L90:
            java.util.Set r4 = tf.m.U1(r12)
            eb.m r0 = new eb.m
            r6 = r8
            r1 = r9
            r2 = r10
            r5 = r13
            r7 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            boolean r9 = r8.showOnMain(r0)
            return r9
    }

    public final boolean showModuleMultiChoiceDialog(java.lang.String r8, java.lang.String r9, java.util.List<?> r10, java.util.Set<?> r11, java.util.function.Consumer<java.util.Set<java.lang.Integer>> r12) {
            r7 = this;
            r5 = 0
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r6 = r12
            boolean r8 = r0.showModuleMultiChoiceDialog(r1, r2, r3, r4, r5, r6)
            return r8
    }

    public final void toast(java.lang.Object r5) {
            r4 = this;
            i8.b r0 = h.Hchat.hooks.api.core.WeChatApis.interaction()
            r0.getClass()
            q8.r r0 = h.Hchat.hooks.api.core.WeChatApis.n()
            if (r0 == 0) goto L31
            if (r5 == 0) goto L16
            java.lang.String r5 = r5.toString()
            if (r5 == 0) goto L16
            goto L18
        L16:
            java.lang.String r5 = "null"
        L18:
            boolean r1 = android.text.TextUtils.isEmpty(r5)
            if (r1 != 0) goto L31
            android.os.Handler r1 = new android.os.Handler
            android.os.Looper r2 = android.os.Looper.getMainLooper()
            r1.<init>(r2)
            a1.d r2 = new a1.d
            r3 = 27
            r2.<init>(r0, r3, r5)
            r1.post(r2)
        L31:
            return
    }

    public final void toast(java.lang.String r4, java.lang.Object r5) {
            r3 = this;
            r0 = 0
            if (r4 == 0) goto L15
            boolean r1 = og.m.t0(r4)
            if (r1 != 0) goto La
            goto Lb
        La:
            r4 = r0
        Lb:
            if (r4 == 0) goto L15
            java.lang.String r0 = "["
            java.lang.String r1 = "] "
            java.lang.String r0 = eh.a.n(r0, r4, r1)
        L15:
            if (r0 != 0) goto L19
            java.lang.String r0 = ""
        L19:
            i8.b r4 = h.Hchat.hooks.api.core.WeChatApis.interaction()
            r4.getClass()
            q8.r r4 = h.Hchat.hooks.api.core.WeChatApis.n()
            if (r4 == 0) goto L4e
            if (r5 == 0) goto L2f
            java.lang.String r5 = r5.toString()
            if (r5 == 0) goto L2f
            goto L31
        L2f:
            java.lang.String r5 = "null"
        L31:
            java.lang.String r5 = r0.concat(r5)
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 != 0) goto L4e
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            a1.d r1 = new a1.d
            r2 = 27
            r1.<init>(r4, r2, r5)
            r0.post(r1)
        L4e:
            return
    }

    public final void unhook(de.robv.android.xposed.XC_MethodHook.Unhook r1) {
            r0 = this;
            if (r1 == 0) goto L5
            r1.unhook()
        L5:
            return
    }

    public final void unhook(java.lang.String r2, de.robv.android.xposed.XC_MethodHook.Unhook r3) {
            r1 = this;
            if (r2 == 0) goto L11
            if (r3 == 0) goto L11
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.util.concurrent.CopyOnWriteArrayList<de.robv.android.xposed.XC_MethodHook$Unhook>> r0 = r1.pluginHooks
            java.lang.Object r2 = r0.get(r2)
            java.util.concurrent.CopyOnWriteArrayList r2 = (java.util.concurrent.CopyOnWriteArrayList) r2
            if (r2 == 0) goto L11
            r2.remove(r3)
        L11:
            r1.unhook(r3)
            return
    }

    public final void unhook(java.lang.String r2, java.lang.Object r3) {
            r1 = this;
            boolean r0 = r3 instanceof de.robv.android.xposed.XC_MethodHook.Unhook
            if (r0 == 0) goto L7
            de.robv.android.xposed.XC_MethodHook$Unhook r3 = (de.robv.android.xposed.XC_MethodHook.Unhook) r3
            goto L8
        L7:
            r3 = 0
        L8:
            r1.unhook(r2, r3)
            return
    }

    public final void unhookPlugin(java.lang.String r4) {
            r3 = this;
            if (r4 == 0) goto L40
            boolean r0 = og.m.t0(r4)
            if (r0 == 0) goto L9
            goto L40
        L9:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.util.concurrent.CopyOnWriteArrayList<h.Hchat.hooks.items.script.ScriptFloatingGlassBarHandle>> r0 = r3.pluginFloatingBars
            java.lang.Object r0 = r0.remove(r4)
            java.util.concurrent.CopyOnWriteArrayList r0 = (java.util.concurrent.CopyOnWriteArrayList) r0
            if (r0 == 0) goto L20
            ab.a r1 = new ab.a
            r2 = 15
            r1.<init>(r0, r2)
            java.lang.Object r0 = r3.callOnMainForResult(r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
        L20:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.util.concurrent.CopyOnWriteArrayList<de.robv.android.xposed.XC_MethodHook$Unhook>> r0 = r3.pluginHooks
            java.lang.Object r4 = r0.remove(r4)
            java.util.List r4 = (java.util.List) r4
            if (r4 != 0) goto L2c
            tf.t r4 = tf.t.f13167g
        L2c:
            java.util.Iterator r4 = r4.iterator()
        L30:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L40
            java.lang.Object r0 = r4.next()
            de.robv.android.xposed.XC_MethodHook$Unhook r0 = (de.robv.android.xposed.XC_MethodHook.Unhook) r0
            r0.unhook()     // Catch: java.lang.Throwable -> L30
            goto L30
        L40:
            return
    }
}
