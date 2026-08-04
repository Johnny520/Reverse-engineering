package yyds;

import android.graphics.Rect;
import android.view.View;
import android.view.WindowInsets;
import com.p000ss.android.ugc.aweme.yyds.R;

/* JADX INFO: renamed from: yyds.ᲈᛷᲇᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2709 {
    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static C2693 m4819(View view, C2693 c2693, Rect rect) {
        WindowInsets windowInsetsM4784 = c2693.m4784();
        if (windowInsetsM4784 != null) {
            return C2693.m4783(view, view.computeSystemWindowInsets(windowInsetsM4784, rect));
        }
        rect.setEmpty();
        return c2693;
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public static void m4820(View view, InterfaceC2208 interfaceC2208) {
        ViewOnApplyWindowInsetsListenerC0761 viewOnApplyWindowInsetsListenerC0761 = interfaceC2208 != null ? new ViewOnApplyWindowInsetsListenerC0761(view, interfaceC2208) : null;
        if (view.getTag(R.id.tag_compat_insets_dispatch) != null) {
            return;
        }
        if (viewOnApplyWindowInsetsListenerC0761 != null) {
            view.setOnApplyWindowInsetsListener(viewOnApplyWindowInsetsListenerC0761);
        } else {
            view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback));
        }
    }
}
