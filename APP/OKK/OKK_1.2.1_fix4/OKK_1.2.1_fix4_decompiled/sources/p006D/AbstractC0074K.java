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
    public static void m257a(View view, InterfaceC0079P interfaceC0079P) {
        C0966k c0966k = (C0966k) view.getTag(C1031R.id.tag_unhandled_key_listeners);
        if (c0966k == null) {
            c0966k = new C0966k();
            view.setTag(C1031R.id.tag_unhandled_key_listeners, c0966k);
        }
        Objects.requireNonNull(interfaceC0079P);
        View.OnUnhandledKeyEventListener viewOnUnhandledKeyEventListenerC0073J = new ViewOnUnhandledKeyEventListenerC0073J();
        c0966k.put(interfaceC0079P, viewOnUnhandledKeyEventListenerC0073J);
        view.addOnUnhandledKeyEventListener(viewOnUnhandledKeyEventListenerC0073J);
    }

    /* JADX INFO: renamed from: b */
    public static CharSequence m258b(View view) {
        return view.getAccessibilityPaneTitle();
    }

    /* JADX INFO: renamed from: c */
    public static boolean m259c(View view) {
        return view.isAccessibilityHeading();
    }

    /* JADX INFO: renamed from: d */
    public static boolean m260d(View view) {
        return view.isScreenReaderFocusable();
    }

    /* JADX INFO: renamed from: e */
    public static void m261e(View view, InterfaceC0079P interfaceC0079P) {
        View.OnUnhandledKeyEventListener onUnhandledKeyEventListener;
        C0966k c0966k = (C0966k) view.getTag(C1031R.id.tag_unhandled_key_listeners);
        if (c0966k == null || (onUnhandledKeyEventListener = (View.OnUnhandledKeyEventListener) c0966k.getOrDefault(interfaceC0079P, null)) == null) {
            return;
        }
        view.removeOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
    }

    /* JADX INFO: renamed from: f */
    public static <T> T m262f(View view, int i2) {
        return (T) view.requireViewById(i2);
    }

    /* JADX INFO: renamed from: g */
    public static void m263g(View view, boolean z2) {
        view.setAccessibilityHeading(z2);
    }

    /* JADX INFO: renamed from: h */
    public static void m264h(View view, CharSequence charSequence) {
        view.setAccessibilityPaneTitle(charSequence);
    }

    /* JADX INFO: renamed from: i */
    public static void m265i(View view, AbstractC0200a abstractC0200a) {
        view.setAutofillId(null);
    }

    /* JADX INFO: renamed from: j */
    public static void m266j(View view, boolean z2) {
        view.setScreenReaderFocusable(z2);
    }
}
