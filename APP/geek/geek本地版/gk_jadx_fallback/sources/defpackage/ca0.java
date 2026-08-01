package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class ca0 {
    public static void a(android.view.View r2, defpackage.ha0 r3) {
            r0 = 2131296652(0x7f09018c, float:1.8211227E38)
            java.lang.Object r1 = r2.getTag(r0)
            u30 r1 = (defpackage.u30) r1
            if (r1 != 0) goto L13
            u30 r1 = new u30
            r1.<init>()
            r2.setTag(r0, r1)
        L13:
            java.util.Objects.requireNonNull(r3)
            ba0 r0 = new ba0
            r0.<init>()
            r1.put(r3, r0)
            r2.addOnUnhandledKeyEventListener(r0)
            return
    }

    public static java.lang.CharSequence b(android.view.View r0) {
            java.lang.CharSequence r0 = r0.getAccessibilityPaneTitle()
            return r0
    }

    public static boolean c(android.view.View r0) {
            boolean r0 = r0.isAccessibilityHeading()
            return r0
    }

    public static boolean d(android.view.View r0) {
            boolean r0 = r0.isScreenReaderFocusable()
            return r0
    }

    public static void e(android.view.View r2, defpackage.ha0 r3) {
            r0 = 2131296652(0x7f09018c, float:1.8211227E38)
            java.lang.Object r0 = r2.getTag(r0)
            u30 r0 = (defpackage.u30) r0
            if (r0 != 0) goto Lc
            goto L18
        Lc:
            r1 = 0
            java.lang.Object r3 = r0.getOrDefault(r3, r1)
            android.view.View$OnUnhandledKeyEventListener r3 = (android.view.View.OnUnhandledKeyEventListener) r3
            if (r3 == 0) goto L18
            r2.removeOnUnhandledKeyEventListener(r3)
        L18:
            return
    }

    public static <T> T f(android.view.View r0, int r1) {
            android.view.View r0 = r0.requireViewById(r1)
            return r0
    }

    public static void g(android.view.View r0, boolean r1) {
            r0.setAccessibilityHeading(r1)
            return
    }

    public static void h(android.view.View r0, java.lang.CharSequence r1) {
            r0.setAccessibilityPaneTitle(r1)
            return
    }

    public static void i(android.view.View r0, boolean r1) {
            r0.setScreenReaderFocusable(r1)
            return
    }
}
