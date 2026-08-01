package androidx.core.view;

import android.view.KeyEvent;
import android.view.View;
import androidx.collection.C1130;
import com.davemorrissey.labs.subscaleview.C0328R;
import java.util.Objects;

/* JADX INFO: renamed from: androidx.core.view.飘花落叶言子苏楪世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3117 {
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static void m4833(View view, boolean z) {
        view.setAccessibilityHeading(z);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static void m4834(View view, InterfaceC3120 interfaceC3120) {
        View.OnUnhandledKeyEventListener onUnhandledKeyEventListener;
        C1130 c1130 = (C1130) view.getTag(C0328R.id.tag_unhandled_key_listeners);
        if (c1130 == null || (onUnhandledKeyEventListener = (View.OnUnhandledKeyEventListener) c1130.get(interfaceC3120)) == null) {
            return;
        }
        view.removeOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static boolean m4835(View view) {
        return view.isScreenReaderFocusable();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static boolean m4836(View view) {
        return view.isAccessibilityHeading();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static CharSequence m4837(View view) {
        return view.getAccessibilityPaneTitle();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static void m4838(View view, final InterfaceC3120 interfaceC3120) {
        C1130 c1130 = (C1130) view.getTag(C0328R.id.tag_unhandled_key_listeners);
        if (c1130 == null) {
            c1130 = new C1130(0);
            view.setTag(C0328R.id.tag_unhandled_key_listeners, c1130);
        }
        Objects.requireNonNull(interfaceC3120);
        View.OnUnhandledKeyEventListener onUnhandledKeyEventListener = new View.OnUnhandledKeyEventListener() { // from class: androidx.core.view.飘花落叶言子苏楪世哲兰
            @Override // android.view.View.OnUnhandledKeyEventListener
            public final boolean onUnhandledKeyEvent(View view2, KeyEvent keyEvent) {
                return interfaceC3120.onUnhandledKeyEvent(view2, keyEvent);
            }
        };
        c1130.put(interfaceC3120, onUnhandledKeyEventListener);
        view.addOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static void m4839(View view, boolean z) {
        view.setScreenReaderFocusable(z);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static void m4840(View view, CharSequence charSequence) {
        view.setAccessibilityPaneTitle(charSequence);
    }
}
