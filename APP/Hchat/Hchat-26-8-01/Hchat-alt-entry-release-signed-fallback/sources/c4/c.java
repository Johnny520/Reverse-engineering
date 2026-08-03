package c4;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements c4.b, c4.e, c4.g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c4.c f1014c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c4.c f1015d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final c4.c f1016e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final c4.c f1017f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final c4.c f1018g = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1019b;

    static {
            c4.c r0 = new c4.c
            r1 = 0
            r0.<init>(r1)
            c4.c.f1014c = r0
            c4.c r0 = new c4.c
            r1 = 1
            r0.<init>(r1)
            c4.c.f1015d = r0
            c4.c r0 = new c4.c
            r1 = 2
            r0.<init>(r1)
            c4.c.f1016e = r0
            c4.c r0 = new c4.c
            r1 = 3
            r0.<init>(r1)
            c4.c.f1017f = r0
            c4.c r0 = new c4.c
            r1 = 4
            r0.<init>(r1)
            c4.c.f1018g = r0
            return
    }

    public /* synthetic */ c(int r1) {
            r0 = this;
            r0.f1019b = r1
            r0.<init>()
            return
    }

    @Override // c4.b
    public android.graphics.Rect a(android.app.Activity r13) {
            r12 = this;
            int r0 = r12.f1019b
            java.lang.String r1 = "android"
            java.lang.String r2 = "dimen"
            java.lang.String r3 = "navigation_bar_height"
            r4 = 0
            c4.a r5 = c4.b.f1013a
            java.lang.String r6 = "getBounds"
            r7 = 1
            java.lang.String r8 = "windowConfiguration"
            java.lang.Class<android.content.res.Configuration> r9 = android.content.res.Configuration.class
            r10 = 0
            switch(r0) {
                case 0: goto L1d4;
                case 1: goto L62;
                default: goto L16;
            }
        L16:
            android.content.res.Resources r0 = r13.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            java.lang.reflect.Field r1 = r9.getDeclaredField(r8)     // Catch: java.lang.Exception -> L40
            r1.setAccessible(r7)     // Catch: java.lang.Exception -> L40
            java.lang.Object r0 = r1.get(r0)     // Catch: java.lang.Exception -> L40
            java.lang.Class r1 = r0.getClass()     // Catch: java.lang.Exception -> L40
            java.lang.reflect.Method r1 = r1.getDeclaredMethod(r6, r10)     // Catch: java.lang.Exception -> L40
            android.graphics.Rect r2 = new android.graphics.Rect     // Catch: java.lang.Exception -> L40
            java.lang.Object r0 = r1.invoke(r0, r10)     // Catch: java.lang.Exception -> L40
            r0.getClass()     // Catch: java.lang.Exception -> L40
            android.graphics.Rect r0 = (android.graphics.Rect) r0     // Catch: java.lang.Exception -> L40
            r2.<init>(r0)     // Catch: java.lang.Exception -> L40
            goto L61
        L40:
            r0 = move-exception
            boolean r1 = r0 instanceof java.lang.NoSuchFieldException
            if (r1 != 0) goto L53
            boolean r1 = r0 instanceof java.lang.NoSuchMethodException
            if (r1 != 0) goto L53
            boolean r1 = r0 instanceof java.lang.IllegalAccessException
            if (r1 != 0) goto L53
            boolean r1 = r0 instanceof java.lang.reflect.InvocationTargetException
            if (r1 == 0) goto L52
            goto L53
        L52:
            throw r0
        L53:
            r5.getClass()
            java.lang.String r1 = c4.a.f1012b
            android.util.Log.w(r1, r0)
            c4.c r0 = c4.c.f1015d
            android.graphics.Rect r2 = r0.a(r13)
        L61:
            return r2
        L62:
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            android.content.res.Resources r11 = r13.getResources()
            android.content.res.Configuration r11 = r11.getConfiguration()
            java.lang.reflect.Field r8 = r9.getDeclaredField(r8)     // Catch: java.lang.Exception -> L95
            r8.setAccessible(r7)     // Catch: java.lang.Exception -> L95
            java.lang.Object r8 = r8.get(r11)     // Catch: java.lang.Exception -> L95
            boolean r9 = r13.isInMultiWindowMode()     // Catch: java.lang.Exception -> L95
            if (r9 == 0) goto L97
            java.lang.Class r9 = r8.getClass()     // Catch: java.lang.Exception -> L95
            java.lang.reflect.Method r6 = r9.getDeclaredMethod(r6, r10)     // Catch: java.lang.Exception -> L95
            java.lang.Object r6 = r6.invoke(r8, r10)     // Catch: java.lang.Exception -> L95
            r6.getClass()     // Catch: java.lang.Exception -> L95
            android.graphics.Rect r6 = (android.graphics.Rect) r6     // Catch: java.lang.Exception -> L95
            r0.set(r6)     // Catch: java.lang.Exception -> L95
            goto Ld3
        L95:
            r6 = move-exception
            goto Lae
        L97:
            java.lang.Class r6 = r8.getClass()     // Catch: java.lang.Exception -> L95
            java.lang.String r9 = "getAppBounds"
            java.lang.reflect.Method r6 = r6.getDeclaredMethod(r9, r10)     // Catch: java.lang.Exception -> L95
            java.lang.Object r6 = r6.invoke(r8, r10)     // Catch: java.lang.Exception -> L95
            r6.getClass()     // Catch: java.lang.Exception -> L95
            android.graphics.Rect r6 = (android.graphics.Rect) r6     // Catch: java.lang.Exception -> L95
            r0.set(r6)     // Catch: java.lang.Exception -> L95
            goto Ld3
        Lae:
            boolean r8 = r6 instanceof java.lang.NoSuchFieldException
            if (r8 != 0) goto Lc0
            boolean r8 = r6 instanceof java.lang.NoSuchMethodException
            if (r8 != 0) goto Lc0
            boolean r8 = r6 instanceof java.lang.IllegalAccessException
            if (r8 != 0) goto Lc0
            boolean r8 = r6 instanceof java.lang.reflect.InvocationTargetException
            if (r8 == 0) goto Lbf
            goto Lc0
        Lbf:
            throw r6
        Lc0:
            r5.getClass()
            java.lang.String r8 = c4.a.f1012b
            android.util.Log.w(r8, r6)
            android.view.WindowManager r6 = r13.getWindowManager()
            android.view.Display r6 = r6.getDefaultDisplay()
            r6.getRectSize(r0)
        Ld3:
            android.view.WindowManager r6 = r13.getWindowManager()
            android.view.Display r6 = r6.getDefaultDisplay()
            android.graphics.Point r8 = new android.graphics.Point
            r8.<init>()
            r6.getRealSize(r8)
            boolean r9 = r13.isInMultiWindowMode()
            if (r9 != 0) goto L113
            android.content.res.Resources r9 = r13.getResources()
            int r1 = r9.getIdentifier(r3, r2, r1)
            if (r1 <= 0) goto Lf8
            int r1 = r9.getDimensionPixelSize(r1)
            goto Lf9
        Lf8:
            r1 = r4
        Lf9:
            int r2 = r0.bottom
            int r2 = r2 + r1
            int r3 = r8.y
            if (r2 != r3) goto L103
            r0.bottom = r2
            goto L113
        L103:
            int r2 = r0.right
            int r2 = r2 + r1
            int r3 = r8.x
            if (r2 != r3) goto L10d
            r0.right = r2
            goto L113
        L10d:
            int r2 = r0.left
            if (r2 != r1) goto L113
            r0.left = r4
        L113:
            int r1 = r0.width()
            int r2 = r8.x
            if (r1 < r2) goto L123
            int r1 = r0.height()
            int r2 = r8.y
            if (r1 >= r2) goto L1d3
        L123:
            boolean r13 = r13.isInMultiWindowMode()
            if (r13 != 0) goto L1d3
            java.lang.String r13 = "android.view.DisplayInfo"
            java.lang.Class r13 = java.lang.Class.forName(r13)     // Catch: java.lang.Exception -> L172
            java.lang.reflect.Constructor r13 = r13.getConstructor(r10)     // Catch: java.lang.Exception -> L172
            r13.setAccessible(r7)     // Catch: java.lang.Exception -> L172
            java.lang.Object r13 = r13.newInstance(r10)     // Catch: java.lang.Exception -> L172
            java.lang.Class r1 = r6.getClass()     // Catch: java.lang.Exception -> L172
            java.lang.String r2 = "getDisplayInfo"
            java.lang.Class r3 = r13.getClass()     // Catch: java.lang.Exception -> L172
            java.lang.Class[] r3 = new java.lang.Class[]{r3}     // Catch: java.lang.Exception -> L172
            java.lang.reflect.Method r1 = r1.getDeclaredMethod(r2, r3)     // Catch: java.lang.Exception -> L172
            r1.setAccessible(r7)     // Catch: java.lang.Exception -> L172
            java.lang.Object[] r2 = new java.lang.Object[]{r13}     // Catch: java.lang.Exception -> L172
            r1.invoke(r6, r2)     // Catch: java.lang.Exception -> L172
            java.lang.Class r1 = r13.getClass()     // Catch: java.lang.Exception -> L172
            java.lang.String r2 = "displayCutout"
            java.lang.reflect.Field r1 = r1.getDeclaredField(r2)     // Catch: java.lang.Exception -> L172
            r1.setAccessible(r7)     // Catch: java.lang.Exception -> L172
            java.lang.Object r13 = r1.get(r13)     // Catch: java.lang.Exception -> L172
            boolean r1 = b0.b0.x(r13)     // Catch: java.lang.Exception -> L172
            if (r1 == 0) goto L195
            android.view.DisplayCutout r10 = b0.b0.d(r13)     // Catch: java.lang.Exception -> L172
            goto L195
        L172:
            r13 = move-exception
            boolean r1 = r13 instanceof java.lang.ClassNotFoundException
            if (r1 != 0) goto L18d
            boolean r1 = r13 instanceof java.lang.NoSuchMethodException
            if (r1 != 0) goto L18d
            boolean r1 = r13 instanceof java.lang.NoSuchFieldException
            if (r1 != 0) goto L18d
            boolean r1 = r13 instanceof java.lang.IllegalAccessException
            if (r1 != 0) goto L18d
            boolean r1 = r13 instanceof java.lang.reflect.InvocationTargetException
            if (r1 != 0) goto L18d
            boolean r1 = r13 instanceof java.lang.InstantiationException
            if (r1 == 0) goto L18c
            goto L18d
        L18c:
            throw r13
        L18d:
            r5.getClass()
            java.lang.String r1 = c4.a.f1012b
            android.util.Log.w(r1, r13)
        L195:
            if (r10 == 0) goto L1d3
            int r13 = r0.left
            int r1 = b0.b0.y(r10)
            if (r13 != r1) goto L1a1
            r0.left = r4
        L1a1:
            int r13 = r8.x
            int r1 = r0.right
            int r13 = r13 - r1
            int r1 = b0.b0.C(r10)
            if (r13 != r1) goto L1b5
            int r13 = r0.right
            int r1 = b0.b0.C(r10)
            int r1 = r1 + r13
            r0.right = r1
        L1b5:
            int r13 = r0.top
            int r1 = b0.b0.a(r10)
            if (r13 != r1) goto L1bf
            r0.top = r4
        L1bf:
            int r13 = r8.y
            int r1 = r0.bottom
            int r13 = r13 - r1
            int r1 = b0.b0.A(r10)
            if (r13 != r1) goto L1d3
            int r13 = r0.bottom
            int r1 = b0.b0.A(r10)
            int r1 = r1 + r13
            r0.bottom = r1
        L1d3:
            return r0
        L1d4:
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            android.view.WindowManager r5 = r13.getWindowManager()
            android.view.Display r5 = r5.getDefaultDisplay()
            r5.getRectSize(r0)
            boolean r6 = r13.isInMultiWindowMode()
            if (r6 != 0) goto L213
            android.graphics.Point r6 = new android.graphics.Point
            r6.<init>()
            r5.getRealSize(r6)
            android.content.res.Resources r13 = r13.getResources()
            int r1 = r13.getIdentifier(r3, r2, r1)
            if (r1 <= 0) goto L200
            int r4 = r13.getDimensionPixelSize(r1)
        L200:
            int r13 = r0.bottom
            int r13 = r13 + r4
            int r1 = r6.y
            if (r13 != r1) goto L20a
            r0.bottom = r13
            goto L213
        L20a:
            int r13 = r0.right
            int r13 = r13 + r4
            int r1 = r6.x
            if (r13 != r1) goto L213
            r0.right = r13
        L213:
            return r0
    }

    @Override // c4.e
    public float b(android.content.ContextWrapper r1) {
            r0 = this;
            android.content.res.Resources r1 = r1.getResources()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            float r1 = r1.density
            return r1
    }

    @Override // c4.g
    public b4.a c(android.content.ContextWrapper r5, c4.e r6) {
            r4 = this;
            r6.getClass()
            r0 = r5
        L4:
            boolean r1 = r0 instanceof android.content.ContextWrapper
            if (r1 == 0) goto L24
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto Ld
            goto L25
        Ld:
            boolean r1 = r0 instanceof android.inputmethodservice.InputMethodService
            if (r1 == 0) goto L12
            goto L25
        L12:
            r1 = r0
            android.content.ContextWrapper r1 = (android.content.ContextWrapper) r1
            android.content.Context r2 = r1.getBaseContext()
            if (r2 != 0) goto L1c
            goto L25
        L1c:
            android.content.Context r0 = r1.getBaseContext()
            r0.getClass()
            goto L4
        L24:
            r0 = r5
        L25:
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L5c
            android.app.Activity r0 = (android.app.Activity) r0
            b4.a r5 = new b4.a
            a4.a r1 = new a4.a
            c4.a r2 = c4.b.f1013a
            r2.getClass()
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 30
            if (r2 < r3) goto L3d
            c4.d r2 = c4.d.f1020b
            goto L4d
        L3d:
            r3 = 29
            if (r2 < r3) goto L44
            c4.c r2 = c4.c.f1016e
            goto L4d
        L44:
            r3 = 28
            if (r2 < r3) goto L4b
            c4.c r2 = c4.c.f1015d
            goto L4d
        L4b:
            c4.c r2 = c4.c.f1014c
        L4d:
            android.graphics.Rect r2 = r2.a(r0)
            r1.<init>(r2)
            float r6 = r6.b(r0)
            r5.<init>(r1, r6)
            return r5
        L5c:
            boolean r1 = r0 instanceof android.inputmethodservice.InputMethodService
            if (r1 != 0) goto L6c
            boolean r0 = r0 instanceof android.app.Application
            if (r0 == 0) goto L65
            goto L6c
        L65:
            java.lang.String r5 = "Must provide a UiContext or Application Context"
            j8.o.t(r5)
            r5 = 0
            return r5
        L6c:
            java.lang.String r0 = "window"
            java.lang.Object r0 = r5.getSystemService(r0)
            r0.getClass()
            android.view.WindowManager r0 = (android.view.WindowManager) r0
            android.view.Display r0 = r0.getDefaultDisplay()
            r0.getClass()
            android.graphics.Point r1 = new android.graphics.Point
            r1.<init>()
            r0.getRealSize(r1)
            android.graphics.Rect r0 = new android.graphics.Rect
            int r2 = r1.x
            int r1 = r1.y
            r3 = 0
            r0.<init>(r3, r3, r2, r1)
            b4.a r1 = new b4.a
            float r5 = r6.b(r5)
            r1.<init>(r0, r5)
            return r1
    }
}
