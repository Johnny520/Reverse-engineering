package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class y90 {
    public static void a(android.view.WindowInsets r1, android.view.View r2) {
            r0 = 2131296653(0x7f09018d, float:1.8211229E38)
            java.lang.Object r0 = r2.getTag(r0)
            android.view.View$OnApplyWindowInsetsListener r0 = (android.view.View.OnApplyWindowInsetsListener) r0
            if (r0 == 0) goto Le
            r0.onApplyWindowInsets(r2, r1)
        Le:
            return
    }

    public static defpackage.wc0 b(android.view.View r1, defpackage.wc0 r2, android.graphics.Rect r3) {
            android.view.WindowInsets r0 = r2.f()
            if (r0 == 0) goto Lf
            android.view.WindowInsets r2 = r1.computeSystemWindowInsets(r0, r3)
            wc0 r1 = defpackage.wc0.g(r1, r2)
            return r1
        Lf:
            r3.setEmpty()
            return r2
    }

    public static boolean c(android.view.View r0, float r1, float r2, boolean r3) {
            boolean r0 = r0.dispatchNestedFling(r1, r2, r3)
            return r0
    }

    public static boolean d(android.view.View r0, float r1, float r2) {
            boolean r0 = r0.dispatchNestedPreFling(r1, r2)
            return r0
    }

    public static boolean e(android.view.View r0, int r1, int r2, int[] r3, int[] r4) {
            boolean r0 = r0.dispatchNestedPreScroll(r1, r2, r3, r4)
            return r0
    }

    public static boolean f(android.view.View r0, int r1, int r2, int r3, int r4, int[] r5) {
            boolean r0 = r0.dispatchNestedScroll(r1, r2, r3, r4, r5)
            return r0
    }

    public static android.content.res.ColorStateList g(android.view.View r0) {
            android.content.res.ColorStateList r0 = r0.getBackgroundTintList()
            return r0
    }

    public static android.graphics.PorterDuff.Mode h(android.view.View r0) {
            android.graphics.PorterDuff$Mode r0 = r0.getBackgroundTintMode()
            return r0
    }

    public static float i(android.view.View r0) {
            float r0 = r0.getElevation()
            return r0
    }

    public static defpackage.wc0 j(android.view.View r7) {
            boolean r0 = defpackage.hc0.d
            r1 = 0
            if (r0 == 0) goto L91
            boolean r0 = r7.isAttachedToWindow()
            if (r0 != 0) goto Ld
            goto L91
        Ld:
            android.view.View r0 = r7.getRootView()
            java.lang.reflect.Field r2 = defpackage.hc0.a     // Catch: java.lang.IllegalAccessException -> L79
            java.lang.Object r0 = r2.get(r0)     // Catch: java.lang.IllegalAccessException -> L79
            if (r0 == 0) goto L91
            java.lang.reflect.Field r2 = defpackage.hc0.b     // Catch: java.lang.IllegalAccessException -> L79
            java.lang.Object r2 = r2.get(r0)     // Catch: java.lang.IllegalAccessException -> L79
            android.graphics.Rect r2 = (android.graphics.Rect) r2     // Catch: java.lang.IllegalAccessException -> L79
            java.lang.reflect.Field r3 = defpackage.hc0.c     // Catch: java.lang.IllegalAccessException -> L79
            java.lang.Object r0 = r3.get(r0)     // Catch: java.lang.IllegalAccessException -> L79
            android.graphics.Rect r0 = (android.graphics.Rect) r0     // Catch: java.lang.IllegalAccessException -> L79
            if (r2 == 0) goto L91
            if (r0 == 0) goto L91
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.IllegalAccessException -> L79
            r4 = 30
            if (r3 < r4) goto L39
            lc0 r3 = new lc0     // Catch: java.lang.IllegalAccessException -> L79
            r3.<init>()     // Catch: java.lang.IllegalAccessException -> L79
            goto L48
        L39:
            r4 = 29
            if (r3 < r4) goto L43
            kc0 r3 = new kc0     // Catch: java.lang.IllegalAccessException -> L79
            r3.<init>()     // Catch: java.lang.IllegalAccessException -> L79
            goto L48
        L43:
            ic0 r3 = new ic0     // Catch: java.lang.IllegalAccessException -> L79
            r3.<init>()     // Catch: java.lang.IllegalAccessException -> L79
        L48:
            int r4 = r2.left     // Catch: java.lang.IllegalAccessException -> L79
            int r5 = r2.top     // Catch: java.lang.IllegalAccessException -> L79
            int r6 = r2.right     // Catch: java.lang.IllegalAccessException -> L79
            int r2 = r2.bottom     // Catch: java.lang.IllegalAccessException -> L79
            ep r2 = defpackage.ep.b(r4, r5, r6, r2)     // Catch: java.lang.IllegalAccessException -> L79
            r3.e(r2)     // Catch: java.lang.IllegalAccessException -> L79
            int r2 = r0.left     // Catch: java.lang.IllegalAccessException -> L79
            int r4 = r0.top     // Catch: java.lang.IllegalAccessException -> L79
            int r5 = r0.right     // Catch: java.lang.IllegalAccessException -> L79
            int r0 = r0.bottom     // Catch: java.lang.IllegalAccessException -> L79
            ep r0 = defpackage.ep.b(r2, r4, r5, r0)     // Catch: java.lang.IllegalAccessException -> L79
            r3.g(r0)     // Catch: java.lang.IllegalAccessException -> L79
            wc0 r0 = r3.b()     // Catch: java.lang.IllegalAccessException -> L79
            tc0 r2 = r0.a     // Catch: java.lang.IllegalAccessException -> L79
            r2.p(r0)     // Catch: java.lang.IllegalAccessException -> L79
            android.view.View r7 = r7.getRootView()     // Catch: java.lang.IllegalAccessException -> L79
            tc0 r2 = r0.a     // Catch: java.lang.IllegalAccessException -> L79
            r2.d(r7)     // Catch: java.lang.IllegalAccessException -> L79
            return r0
        L79:
            r7 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Failed to get insets from AttachInfo. "
            r0.<init>(r2)
            java.lang.String r2 = r7.getMessage()
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "WindowInsetsCompat"
            android.util.Log.w(r2, r0, r7)
        L91:
            return r1
    }

    public static java.lang.String k(android.view.View r0) {
            java.lang.String r0 = r0.getTransitionName()
            return r0
    }

    public static float l(android.view.View r0) {
            float r0 = r0.getTranslationZ()
            return r0
    }

    public static float m(android.view.View r0) {
            float r0 = r0.getZ()
            return r0
    }

    public static boolean n(android.view.View r0) {
            boolean r0 = r0.hasNestedScrollingParent()
            return r0
    }

    public static boolean o(android.view.View r0) {
            boolean r0 = r0.isImportantForAccessibility()
            return r0
    }

    public static boolean p(android.view.View r0) {
            boolean r0 = r0.isNestedScrollingEnabled()
            return r0
    }

    public static void q(android.view.View r0, android.content.res.ColorStateList r1) {
            r0.setBackgroundTintList(r1)
            return
    }

    public static void r(android.view.View r0, android.graphics.PorterDuff.Mode r1) {
            r0.setBackgroundTintMode(r1)
            return
    }

    public static void s(android.view.View r0, float r1) {
            r0.setElevation(r1)
            return
    }

    public static void t(android.view.View r0, boolean r1) {
            r0.setNestedScrollingEnabled(r1)
            return
    }

    public static void u(android.view.View r2, defpackage.qw r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 >= r1) goto Lc
            r0 = 2131296645(0x7f090185, float:1.8211213E38)
            r2.setTag(r0, r3)
        Lc:
            if (r3 != 0) goto L1b
            r3 = 2131296653(0x7f09018d, float:1.8211229E38)
            java.lang.Object r3 = r2.getTag(r3)
            android.view.View$OnApplyWindowInsetsListener r3 = (android.view.View.OnApplyWindowInsetsListener) r3
            r2.setOnApplyWindowInsetsListener(r3)
            return
        L1b:
            x90 r0 = new x90
            r0.<init>(r2, r3)
            r2.setOnApplyWindowInsetsListener(r0)
            return
    }

    public static void v(android.view.View r0, java.lang.String r1) {
            r0.setTransitionName(r1)
            return
    }

    public static void w(android.view.View r0, float r1) {
            r0.setTranslationZ(r1)
            return
    }

    public static void x(android.view.View r0, float r1) {
            r0.setZ(r1)
            return
    }

    public static boolean y(android.view.View r0, int r1) {
            boolean r0 = r0.startNestedScroll(r1)
            return r0
    }

    public static void z(android.view.View r0) {
            r0.stopNestedScroll()
            return
    }
}
