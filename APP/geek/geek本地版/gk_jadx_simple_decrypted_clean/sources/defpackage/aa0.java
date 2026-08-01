package defpackage;

import android.view.View;
import java.util.Collection;

/* JADX INFO: loaded from: classes.dex */
public abstract class aa0 {
    public static void a(View r0, Collection<View> r1, int r2) {
        r0.addKeyboardNavigationClusters(r1, r2);
    }

    public static int b(View r0) {
        return r0.getImportantForAutofill();
    }

    public static int c(View r0) {
        return r0.getNextClusterForwardId();
    }

    public static boolean d(View r0) {
        return r0.hasExplicitFocusable();
    }

    public static boolean e(View r0) {
        return r0.isFocusedByDefault();
    }

    public static boolean f(View r0) {
        return r0.isImportantForAutofill();
    }

    public static boolean g(View r0) {
        return r0.isKeyboardNavigationCluster();
    }

    public static View h(View r0, View r1, int r2) {
        return r0.keyboardNavigationClusterSearch(r1, r2);
    }

    public static boolean i(View r0) {
        return r0.restoreDefaultFocus();
    }

    public static void j(View r0, String... r1) {
        r0.setAutofillHints(r1);
    }

    public static void k(View r0, boolean r1) {
        r0.setFocusedByDefault(r1);
    }

    public static void l(View r0, int r1) {
        r0.setImportantForAutofill(r1);
    }

    public static void m(View r0, boolean r1) {
        r0.setKeyboardNavigationCluster(r1);
    }

    public static void n(View r0, int r1) {
        r0.setNextClusterForwardId(r1);
    }

    public static void o(View r0, CharSequence r1) {
        r0.setTooltipText(r1);
    }
}
