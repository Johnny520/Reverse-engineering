package androidx.compose.ui.window;

import android.graphics.Rect;
import android.view.View;
import android.view.WindowManager;

/* JADX INFO: renamed from: androidx.compose.ui.window.飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2102 extends C2101 {
    @Override // androidx.compose.ui.window.C2099
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo3837(Rect rect, View view) {
        Object systemService = view.getContext().getSystemService("window");
        systemService.getClass();
        rect.set(((WindowManager) systemService).getCurrentWindowMetrics().getBounds());
    }
}
