package com.kongzue.dialogx.util.views;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowInsetsController;

/* JADX INFO: renamed from: com.kongzue.dialogx.util.views.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC3754 implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ C3752 f11667;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ View f11668;

    public ViewTreeObserverOnGlobalLayoutListenerC3754(C3752 c3752, View view) {
        this.f11667 = c3752;
        this.f11668 = view;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        Rect rect = new Rect();
        View view = this.f11668;
        view.getWindowVisibleDisplayFrame(rect);
        int height = view.getHeight();
        int i = Build.VERSION.SDK_INT;
        C3752 c3752 = this.f11667;
        WindowInsetsController windowInsetsController = i >= 30 ? c3752.m8093().getWindowInsetsController() : null;
        if (i >= 30 && windowInsetsController != null && (windowInsetsController.getSystemBarsBehavior() & 16) == 0) {
            rect.bottom = height;
        }
        int i2 = height - rect.bottom;
        if (i2 != c3752.f11661) {
            c3752.f11661 = i2;
            int i3 = DialogXBaseRelativeLayout.f11618;
            C3753 c3753 = c3752.f11654;
            if (c3753 != null) {
                c3752.m8095(c3753);
            }
        }
    }
}
