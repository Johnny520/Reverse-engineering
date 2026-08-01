package com.kongzue.dialogx.util.views;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowInsetsController;

/* JADX INFO: renamed from: com.kongzue.dialogx.util.views.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC4587 implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ C4585 f12017;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ View f12018;

    public ViewTreeObserverOnGlobalLayoutListenerC4587(C4585 c4585, View view) {
        this.f12017 = c4585;
        this.f12018 = view;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        Rect rect = new Rect();
        View view = this.f12018;
        view.getWindowVisibleDisplayFrame(rect);
        int height = view.getHeight();
        int i = Build.VERSION.SDK_INT;
        C4585 c4585 = this.f12017;
        WindowInsetsController windowInsetsController = i >= 30 ? c4585.m8639().getWindowInsetsController() : null;
        if (i >= 30 && windowInsetsController != null && (windowInsetsController.getSystemBarsBehavior() & 16) == 0) {
            rect.bottom = height;
        }
        int i2 = height - rect.bottom;
        if (i2 != c4585.f12011) {
            c4585.f12011 = i2;
            int i3 = DialogXBaseRelativeLayout.f11968;
            C4586 c4586 = c4585.f12004;
            if (c4586 != null) {
                c4585.m8641(c4586);
            }
        }
    }
}
