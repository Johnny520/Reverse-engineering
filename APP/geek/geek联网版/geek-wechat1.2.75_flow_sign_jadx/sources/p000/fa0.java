package p000;

import android.view.View;
import java.util.Collection;

/* JADX INFO: loaded from: classes.dex */
public abstract class fa0 {
    /* JADX INFO: renamed from: a */
    public static void m1075a(View view, Collection<View> collection, int i) {
        view.addKeyboardNavigationClusters(collection, i);
    }

    /* JADX INFO: renamed from: b */
    public static int m1076b(View view) {
        return view.getImportantForAutofill();
    }

    /* JADX INFO: renamed from: c */
    public static int m1077c(View view) {
        return view.getNextClusterForwardId();
    }

    /* JADX INFO: renamed from: d */
    public static boolean m1078d(View view) {
        return view.hasExplicitFocusable();
    }

    /* JADX INFO: renamed from: e */
    public static boolean m1079e(View view) {
        return view.isFocusedByDefault();
    }

    /* JADX INFO: renamed from: f */
    public static boolean m1080f(View view) {
        return view.isImportantForAutofill();
    }

    /* JADX INFO: renamed from: g */
    public static boolean m1081g(View view) {
        return view.isKeyboardNavigationCluster();
    }

    /* JADX INFO: renamed from: h */
    public static View m1082h(View view, View view2, int i) {
        return view.keyboardNavigationClusterSearch(view2, i);
    }

    /* JADX INFO: renamed from: i */
    public static boolean m1083i(View view) {
        return view.restoreDefaultFocus();
    }

    /* JADX INFO: renamed from: j */
    public static void m1084j(View view, String... strArr) {
        view.setAutofillHints(strArr);
    }

    /* JADX INFO: renamed from: k */
    public static void m1085k(View view, boolean z) {
        view.setFocusedByDefault(z);
    }

    /* JADX INFO: renamed from: l */
    public static void m1086l(View view, int i) {
        view.setImportantForAutofill(i);
    }

    /* JADX INFO: renamed from: m */
    public static void m1087m(View view, boolean z) {
        view.setKeyboardNavigationCluster(z);
    }

    /* JADX INFO: renamed from: n */
    public static void m1088n(View view, int i) {
        view.setNextClusterForwardId(i);
    }

    /* JADX INFO: renamed from: o */
    public static void m1089o(View view, CharSequence charSequence) {
        view.setTooltipText(charSequence);
    }
}
