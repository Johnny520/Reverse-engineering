package com.lxj.xpopup.util;

import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.animation.LinearInterpolator;
import androidx.appcompat.app.RunnableC0062;
import com.lxj.xpopup.core.AbstractC3776;
import com.lxj.xpopup.core.C3775;

/* JADX INFO: renamed from: com.lxj.xpopup.util.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC3787 implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ int[] f11823;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ C3775 f11824;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ Window f11825;

    public ViewTreeObserverOnGlobalLayoutListenerC3787(Window window, int[] iArr, C3775 c3775) {
        this.f11825 = window;
        this.f11823 = iArr;
        this.f11824 = c3775;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int iM8101 = AbstractC3786.m8101(this.f11825);
        int[] iArr = this.f11823;
        if (iArr[0] != iM8101) {
            AbstractC3776 abstractC3776 = this.f11824.f11805;
            abstractC3776.onKeyboardHeightChange(iM8101);
            if (iM8101 == 0) {
                abstractC3776.getPopupContentView().animate().translationY(0.0f).setInterpolator(new LinearInterpolator()).setDuration(100L).start();
                abstractC3776.hasMoveUp = false;
            } else {
                AbstractC3788.f11834 = iM8101;
                abstractC3776.post(new RunnableC0062(abstractC3776, 11));
                abstractC3776.hasMoveUp = true;
            }
            iArr[0] = iM8101;
        }
    }
}
