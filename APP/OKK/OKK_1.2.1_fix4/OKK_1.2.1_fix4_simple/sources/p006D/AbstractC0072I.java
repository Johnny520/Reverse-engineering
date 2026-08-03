package p006D;

import android.view.View;
import android.view.autofill.AutofillId;
import java.util.Collection;

/* JADX INFO: renamed from: D.I */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0072I {
    /* JADX INFO: renamed from: a */
    public static void m241a(View r02, Collection<View> r1, int r2) {
        r02.addKeyboardNavigationClusters(r1, r2);
    }

    /* JADX INFO: renamed from: b */
    public static AutofillId m242b(View r02) {
        return r02.getAutofillId();
    }

    /* JADX INFO: renamed from: c */
    public static int m243c(View r02) {
        return r02.getImportantForAutofill();
    }

    /* JADX INFO: renamed from: d */
    public static int m244d(View r02) {
        return r02.getNextClusterForwardId();
    }

    /* JADX INFO: renamed from: e */
    public static boolean m245e(View r02) {
        return r02.hasExplicitFocusable();
    }

    /* JADX INFO: renamed from: f */
    public static boolean m246f(View r02) {
        return r02.isFocusedByDefault();
    }

    /* JADX INFO: renamed from: g */
    public static boolean m247g(View r02) {
        return r02.isImportantForAutofill();
    }

    /* JADX INFO: renamed from: h */
    public static boolean m248h(View r02) {
        return r02.isKeyboardNavigationCluster();
    }

    /* JADX INFO: renamed from: i */
    public static View m249i(View r02, View r1, int r2) {
        return r02.keyboardNavigationClusterSearch(r1, r2);
    }

    /* JADX INFO: renamed from: j */
    public static boolean m250j(View r02) {
        return r02.restoreDefaultFocus();
    }

    /* JADX INFO: renamed from: k */
    public static void m251k(View r02, String... r1) {
        r02.setAutofillHints(r1);
    }

    /* JADX INFO: renamed from: l */
    public static void m252l(View r02, boolean r1) {
        r02.setFocusedByDefault(r1);
    }

    /* JADX INFO: renamed from: m */
    public static void m253m(View r02, int r1) {
        r02.setImportantForAutofill(r1);
    }

    /* JADX INFO: renamed from: n */
    public static void m254n(View r02, boolean r1) {
        r02.setKeyboardNavigationCluster(r1);
    }

    /* JADX INFO: renamed from: o */
    public static void m255o(View r02, int r1) {
        r02.setNextClusterForwardId(r1);
    }

    /* JADX INFO: renamed from: p */
    public static void m256p(View r02, CharSequence r1) {
        r02.setTooltipText(r1);
    }
}
