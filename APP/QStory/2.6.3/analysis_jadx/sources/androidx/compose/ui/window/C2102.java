package androidx.compose.ui.window;

import android.graphics.Rect;
import android.view.View;
import android.view.WindowManager;

/* JADX INFO: renamed from: androidx.compose.ui.window.飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2102 extends C2101 {
    @Override // androidx.compose.ui.window.C2099
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo3847(Rect rect, View view) {
        Object systemService = view.getContext().getSystemService("window");
        systemService.getClass();
        rect.set(((WindowManager) systemService).getCurrentWindowMetrics().getBounds());
    }
}
