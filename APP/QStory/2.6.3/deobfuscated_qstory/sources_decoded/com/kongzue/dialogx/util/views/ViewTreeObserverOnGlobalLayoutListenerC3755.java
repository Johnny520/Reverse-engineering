package com.kongzue.dialogx.util.views;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowInsetsController;

/* JADX INFO: renamed from: com.kongzue.dialogx.util.views.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC3755 implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ C3753 f11672;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ View f11673;

    public ViewTreeObserverOnGlobalLayoutListenerC3755(C3753 c3753, View view) {
        this.f11672 = c3753;
        this.f11673 = view;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        Rect rect = new Rect();
        View view = this.f11673;
        view.getWindowVisibleDisplayFrame(rect);
        int height = view.getHeight();
        int i = Build.VERSION.SDK_INT;
        C3753 c3753 = this.f11672;
        WindowInsetsController windowInsetsController = i >= 30 ? c3753.m8080().getWindowInsetsController() : null;
        if (i >= 30 && windowInsetsController != null && (windowInsetsController.getSystemBarsBehavior() & 16) == 0) {
            rect.bottom = height;
        }
        int i2 = height - rect.bottom;
        if (i2 != c3753.f11666) {
            c3753.f11666 = i2;
            int i3 = DialogXBaseRelativeLayout.f11623;
            C3754 c3754 = c3753.f11659;
            if (c3754 != null) {
                c3753.m8082(c3754);
            }
        }
    }
}
