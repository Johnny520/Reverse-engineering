package p006D;

import android.view.View;
import android.view.autofill.AutofillId;
import java.util.Collection;

/* JADX INFO: renamed from: D.I */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0072I {
    /* JADX INFO: renamed from: a */
    public static void m241a(View view, Collection<View> collection, int i2) {
        view.addKeyboardNavigationClusters(collection, i2);
    }

    /* JADX INFO: renamed from: b */
    public static AutofillId m242b(View view) {
        return view.getAutofillId();
    }

    /* JADX INFO: renamed from: c */
    public static int m243c(View view) {
        return view.getImportantForAutofill();
    }

    /* JADX INFO: renamed from: d */
    public static int m244d(View view) {
        return view.getNextClusterForwardId();
    }

    /* JADX INFO: renamed from: e */
    public static boolean m245e(View view) {
        return view.hasExplicitFocusable();
    }

    /* JADX INFO: renamed from: f */
    public static boolean m246f(View view) {
        return view.isFocusedByDefault();
    }

    /* JADX INFO: renamed from: g */
    public static boolean m247g(View view) {
        return view.isImportantForAutofill();
    }

    /* JADX INFO: renamed from: h */
    public static boolean m248h(View view) {
        return view.isKeyboardNavigationCluster();
    }

    /* JADX INFO: renamed from: i */
    public static View m249i(View view, View view2, int i2) {
        return view.keyboardNavigationClusterSearch(view2, i2);
    }

    /* JADX INFO: renamed from: j */
    public static boolean m250j(View view) {
        return view.restoreDefaultFocus();
    }

    /* JADX INFO: renamed from: k */
    public static void m251k(View view, String... strArr) {
        view.setAutofillHints(strArr);
    }

    /* JADX INFO: renamed from: l */
    public static void m252l(View view, boolean z2) {
        view.setFocusedByDefault(z2);
    }

    /* JADX INFO: renamed from: m */
    public static void m253m(View view, int i2) {
        view.setImportantForAutofill(i2);
    }

    /* JADX INFO: renamed from: n */
    public static void m254n(View view, boolean z2) {
        view.setKeyboardNavigationCluster(z2);
    }

    /* JADX INFO: renamed from: o */
    public static void m255o(View view, int i2) {
        view.setNextClusterForwardId(i2);
    }

    /* JADX INFO: renamed from: p */
    public static void m256p(View view, CharSequence charSequence) {
        view.setTooltipText(charSequence);
    }
}
