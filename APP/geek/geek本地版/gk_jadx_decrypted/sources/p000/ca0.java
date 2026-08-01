package p000;

import android.view.View;
import com.ljx.wechatmod.R;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public abstract class ca0 {
    /* JADX INFO: renamed from: a */
    public static void m648a(View view, ha0 ha0Var) {
        u30 u30Var = (u30) view.getTag(R.id.tag_unhandled_key_listeners);
        if (u30Var == null) {
            u30Var = new u30();
            view.setTag(R.id.tag_unhandled_key_listeners, u30Var);
        }
        Objects.requireNonNull(ha0Var);
        View.OnUnhandledKeyEventListener ba0Var = new ba0();
        u30Var.put(ha0Var, ba0Var);
        view.addOnUnhandledKeyEventListener(ba0Var);
    }

    /* JADX INFO: renamed from: b */
    public static CharSequence m649b(View view) {
        return view.getAccessibilityPaneTitle();
    }

    /* JADX INFO: renamed from: c */
    public static boolean m650c(View view) {
        return view.isAccessibilityHeading();
    }

    /* JADX INFO: renamed from: d */
    public static boolean m651d(View view) {
        return view.isScreenReaderFocusable();
    }

    /* JADX INFO: renamed from: e */
    public static void m652e(View view, ha0 ha0Var) {
        View.OnUnhandledKeyEventListener onUnhandledKeyEventListener;
        u30 u30Var = (u30) view.getTag(R.id.tag_unhandled_key_listeners);
        if (u30Var == null || (onUnhandledKeyEventListener = (View.OnUnhandledKeyEventListener) u30Var.getOrDefault(ha0Var, null)) == null) {
            return;
        }
        view.removeOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
    }

    /* JADX INFO: renamed from: f */
    public static <T> T m653f(View view, int i) {
        return (T) view.requireViewById(i);
    }

    /* JADX INFO: renamed from: g */
    public static void m654g(View view, boolean z) {
        view.setAccessibilityHeading(z);
    }

    /* JADX INFO: renamed from: h */
    public static void m655h(View view, CharSequence charSequence) {
        view.setAccessibilityPaneTitle(charSequence);
    }

    /* JADX INFO: renamed from: i */
    public static void m656i(View view, boolean z) {
        view.setScreenReaderFocusable(z);
    }
}
