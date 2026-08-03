package p006D;

import android.view.View;
import java.util.Objects;
import org.luckypray.dexkit.C1031R;
import p012G.AbstractC0200a;
import p063j.C0966k;

/* JADX INFO: renamed from: D.K */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0074K {
    /* JADX INFO: renamed from: a */
    public static void m257a(View r2, InterfaceC0079P r3) {
        C0966k r1 = (C0966k) r2.getTag(C1031R.id.tag_unhandled_key_listeners);
        if (r1 != null) goto L5;
        r1 = new C0966k();
        r2.setTag(C1031R.id.tag_unhandled_key_listeners, r1);
    L5:
        Objects.requireNonNull(r3);
        View.OnUnhandledKeyEventListener r02 = new ViewOnUnhandledKeyEventListenerC0073J();
        r1.put(r3, r02);
        r2.addOnUnhandledKeyEventListener(r02);
    }

    /* JADX INFO: renamed from: b */
    public static CharSequence m258b(View r02) {
        return r02.getAccessibilityPaneTitle();
    }

    /* JADX INFO: renamed from: c */
    public static boolean m259c(View r02) {
        return r02.isAccessibilityHeading();
    }

    /* JADX INFO: renamed from: d */
    public static boolean m260d(View r02) {
        return r02.isScreenReaderFocusable();
    }

    /* JADX INFO: renamed from: e */
    public static void m261e(View r2, InterfaceC0079P r3) {
        C0966k r02 = (C0966k) r2.getTag(C1031R.id.tag_unhandled_key_listeners);
        if (r02 != null) goto L5;
        return;
    L5:
        View.OnUnhandledKeyEventListener r32 = (View.OnUnhandledKeyEventListener) r02.getOrDefault(r3, null);
        if (r32 == null) goto L9;
        r2.removeOnUnhandledKeyEventListener(r32);
        return;
    }

    /* JADX INFO: renamed from: f */
    public static <T> T m262f(View r02, int r1) {
        return (T) r02.requireViewById(r1);
    }

    /* JADX INFO: renamed from: g */
    public static void m263g(View r02, boolean r1) {
        r02.setAccessibilityHeading(r1);
    }

    /* JADX INFO: renamed from: h */
    public static void m264h(View r02, CharSequence r1) {
        r02.setAccessibilityPaneTitle(r1);
    }

    /* JADX INFO: renamed from: i */
    public static void m265i(View r02, AbstractC0200a r1) {
        r02.setAutofillId(null);
    }

    /* JADX INFO: renamed from: j */
    public static void m266j(View r02, boolean r1) {
        r02.setScreenReaderFocusable(r1);
    }
}
