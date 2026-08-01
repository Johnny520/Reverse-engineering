package p099y;

import android.view.KeyEvent;
import android.view.View;
import com.p055lu.wxmask272.R;
import java.util.Objects;
import p000A.AbstractC0000a;
import p075l.C0753k;
import p090t0.AbstractC1008c;

/* JADX INFO: renamed from: y.E */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1041E {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static void m2256a(View view, final InterfaceC1046J interfaceC1046J) {
        C0753k c0753k = (C0753k) view.getTag(R.id.tag_unhandled_key_listeners);
        if (c0753k == null) {
            c0753k = new C0753k();
            view.setTag(R.id.tag_unhandled_key_listeners, c0753k);
        }
        Objects.requireNonNull(interfaceC1046J);
        View.OnUnhandledKeyEventListener onUnhandledKeyEventListener = new View.OnUnhandledKeyEventListener() { // from class: y.D
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // android.view.View.OnUnhandledKeyEventListener
            public final boolean onUnhandledKeyEvent(View view2, KeyEvent keyEvent) {
                return ((AbstractC1008c) interfaceC1046J).m2208f(view2, keyEvent);
            }
        };
        c0753k.put(interfaceC1046J, onUnhandledKeyEventListener);
        view.addOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static CharSequence m2257b(View view) {
        return view.getAccessibilityPaneTitle();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static boolean m2258c(View view) {
        return view.isAccessibilityHeading();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static boolean m2259d(View view) {
        return view.isScreenReaderFocusable();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static void m2260e(View view, InterfaceC1046J interfaceC1046J) {
        View.OnUnhandledKeyEventListener onUnhandledKeyEventListener;
        C0753k c0753k = (C0753k) view.getTag(R.id.tag_unhandled_key_listeners);
        if (c0753k == null || (onUnhandledKeyEventListener = (View.OnUnhandledKeyEventListener) c0753k.getOrDefault(interfaceC1046J, null)) == null) {
            return;
        }
        view.removeOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static <T> T m2261f(View view, int i2) {
        return (T) view.requireViewById(i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static void m2262g(View view, boolean z2) {
        view.setAccessibilityHeading(z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public static void m2263h(View view, CharSequence charSequence) {
        view.setAccessibilityPaneTitle(charSequence);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public static void m2264i(View view, AbstractC0000a abstractC0000a) {
        view.setAutofillId(null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public static void m2265j(View view, boolean z2) {
        view.setScreenReaderFocusable(z2);
    }
}
