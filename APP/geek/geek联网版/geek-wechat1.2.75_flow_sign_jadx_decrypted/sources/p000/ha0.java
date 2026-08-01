package p000;

import android.view.View;
import com.ljx.wechatmod.R;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public abstract class ha0 {
    /* JADX INFO: renamed from: a */
    public static void m1363a(View view, ma0 ma0Var) {
        b40 b40Var = (b40) view.getTag(R.id.tag_unhandled_key_listeners);
        if (b40Var == null) {
            b40Var = new b40();
            view.setTag(R.id.tag_unhandled_key_listeners, b40Var);
        }
        Objects.requireNonNull(ma0Var);
        View.OnUnhandledKeyEventListener ga0Var = new ga0();
        b40Var.put(ma0Var, ga0Var);
        view.addOnUnhandledKeyEventListener(ga0Var);
    }

    /* JADX INFO: renamed from: b */
    public static CharSequence m1364b(View view) {
        return view.getAccessibilityPaneTitle();
    }

    /* JADX INFO: renamed from: c */
    public static boolean m1365c(View view) {
        return view.isAccessibilityHeading();
    }

    /* JADX INFO: renamed from: d */
    public static boolean m1366d(View view) {
        return view.isScreenReaderFocusable();
    }

    /* JADX INFO: renamed from: e */
    public static void m1367e(View view, ma0 ma0Var) {
        View.OnUnhandledKeyEventListener onUnhandledKeyEventListener;
        b40 b40Var = (b40) view.getTag(R.id.tag_unhandled_key_listeners);
        if (b40Var == null || (onUnhandledKeyEventListener = (View.OnUnhandledKeyEventListener) b40Var.getOrDefault(ma0Var, null)) == null) {
            return;
        }
        view.removeOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
    }

    /* JADX INFO: renamed from: f */
    public static <T> T m1368f(View view, int i) {
        return (T) view.requireViewById(i);
    }

    /* JADX INFO: renamed from: g */
    public static void m1369g(View view, boolean z) {
        view.setAccessibilityHeading(z);
    }

    /* JADX INFO: renamed from: h */
    public static void m1370h(View view, CharSequence charSequence) {
        view.setAccessibilityPaneTitle(charSequence);
    }

    /* JADX INFO: renamed from: i */
    public static void m1371i(View view, boolean z) {
        view.setScreenReaderFocusable(z);
    }
}
