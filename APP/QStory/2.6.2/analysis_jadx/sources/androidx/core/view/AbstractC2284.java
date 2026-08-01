package androidx.core.view;

import android.view.KeyEvent;
import android.view.View;
import androidx.collection.C0283;
import com.davemorrissey.labs.subscaleview.R;
import java.util.Objects;

/* JADX INFO: renamed from: androidx.core.view.飘花落叶言子苏楪世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2284 {
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static void m4263(View view, boolean z) {
        view.setAccessibilityHeading(z);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static void m4264(View view, InterfaceC2287 interfaceC2287) {
        View.OnUnhandledKeyEventListener onUnhandledKeyEventListener;
        C0283 c0283 = (C0283) view.getTag(R.id.tag_unhandled_key_listeners);
        if (c0283 == null || (onUnhandledKeyEventListener = (View.OnUnhandledKeyEventListener) c0283.get(interfaceC2287)) == null) {
            return;
        }
        view.removeOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static boolean m4265(View view) {
        return view.isScreenReaderFocusable();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static boolean m4266(View view) {
        return view.isAccessibilityHeading();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static CharSequence m4267(View view) {
        return view.getAccessibilityPaneTitle();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static void m4268(View view, final InterfaceC2287 interfaceC2287) {
        C0283 c0283 = (C0283) view.getTag(R.id.tag_unhandled_key_listeners);
        if (c0283 == null) {
            c0283 = new C0283(0);
            view.setTag(R.id.tag_unhandled_key_listeners, c0283);
        }
        Objects.requireNonNull(interfaceC2287);
        View.OnUnhandledKeyEventListener onUnhandledKeyEventListener = new View.OnUnhandledKeyEventListener() { // from class: androidx.core.view.飘花落叶言子苏楪世哲兰
            @Override // android.view.View.OnUnhandledKeyEventListener
            public final boolean onUnhandledKeyEvent(View view2, KeyEvent keyEvent) {
                return interfaceC2287.onUnhandledKeyEvent(view2, keyEvent);
            }
        };
        c0283.put(interfaceC2287, onUnhandledKeyEventListener);
        view.addOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static void m4269(View view, boolean z) {
        view.setScreenReaderFocusable(z);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static void m4270(View view, CharSequence charSequence) {
        view.setAccessibilityPaneTitle(charSequence);
    }
}
