package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class aa0 {
    public static void a(android.view.View r0, java.util.Collection<android.view.View> r1, int r2) {
            r0.addKeyboardNavigationClusters(r1, r2)
            return
    }

    public static int b(android.view.View r0) {
            int r0 = r0.getImportantForAutofill()
            return r0
    }

    public static int c(android.view.View r0) {
            int r0 = r0.getNextClusterForwardId()
            return r0
    }

    public static boolean d(android.view.View r0) {
            boolean r0 = r0.hasExplicitFocusable()
            return r0
    }

    public static boolean e(android.view.View r0) {
            boolean r0 = r0.isFocusedByDefault()
            return r0
    }

    public static boolean f(android.view.View r0) {
            boolean r0 = r0.isImportantForAutofill()
            return r0
    }

    public static boolean g(android.view.View r0) {
            boolean r0 = r0.isKeyboardNavigationCluster()
            return r0
    }

    public static android.view.View h(android.view.View r0, android.view.View r1, int r2) {
            android.view.View r0 = r0.keyboardNavigationClusterSearch(r1, r2)
            return r0
    }

    public static boolean i(android.view.View r0) {
            boolean r0 = r0.restoreDefaultFocus()
            return r0
    }

    public static void j(android.view.View r0, java.lang.String... r1) {
            r0.setAutofillHints(r1)
            return
    }

    public static void k(android.view.View r0, boolean r1) {
            r0.setFocusedByDefault(r1)
            return
    }

    public static void l(android.view.View r0, int r1) {
            r0.setImportantForAutofill(r1)
            return
    }

    public static void m(android.view.View r0, boolean r1) {
            r0.setKeyboardNavigationCluster(r1)
            return
    }

    public static void n(android.view.View r0, int r1) {
            r0.setNextClusterForwardId(r1)
            return
    }

    public static void o(android.view.View r0, java.lang.CharSequence r1) {
            r0.setTooltipText(r1)
            return
    }
}
