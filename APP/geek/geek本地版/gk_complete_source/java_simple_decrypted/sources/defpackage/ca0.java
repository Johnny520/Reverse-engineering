package defpackage;

import android.view.View;
import com.ljx.wechatmod.R;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public abstract class ca0 {
    public static void a(View r2, ha0 r3) {
        u30 r1 = (u30) r2.getTag(R.id.tag_unhandled_key_listeners);
        if (r1 != null) goto L5;
        r1 = new u30();
        r2.setTag(R.id.tag_unhandled_key_listeners, r1);
    L5:
        Objects.requireNonNull(r3);
        View.OnUnhandledKeyEventListener r0 = new ba0();
        r1.put(r3, r0);
        r2.addOnUnhandledKeyEventListener(r0);
    }

    public static CharSequence b(View r0) {
        return r0.getAccessibilityPaneTitle();
    }

    public static boolean c(View r0) {
        return r0.isAccessibilityHeading();
    }

    public static boolean d(View r0) {
        return r0.isScreenReaderFocusable();
    }

    public static void e(View r2, ha0 r3) {
        u30 r0 = (u30) r2.getTag(R.id.tag_unhandled_key_listeners);
        if (r0 == null) goto L10;
        View.OnUnhandledKeyEventListener r32 = (View.OnUnhandledKeyEventListener) r0.getOrDefault(r3, null);
        if (r32 == null) goto L9;
        r2.removeOnUnhandledKeyEventListener(r32);
        return;
    L9:
        return;
    }

    public static <T> T f(View r0, int r1) {
        return (T) r0.requireViewById(r1);
    }

    public static void g(View r0, boolean r1) {
        r0.setAccessibilityHeading(r1);
    }

    public static void h(View r0, CharSequence r1) {
        r0.setAccessibilityPaneTitle(r1);
    }

    public static void i(View r0, boolean r1) {
        r0.setScreenReaderFocusable(r1);
    }
}
