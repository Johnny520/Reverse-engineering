package com.lxj.xpopup.util;

import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.animation.LinearInterpolator;
import androidx.appcompat.app.RunnableC0909;
import com.lxj.xpopup.core.AbstractC4608;
import com.lxj.xpopup.core.C4607;

/* JADX INFO: renamed from: com.lxj.xpopup.util.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC4619 implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ int[] f12168;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ C4607 f12169;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ Window f12170;

    public ViewTreeObserverOnGlobalLayoutListenerC4619(Window window, int[] iArr, C4607 c4607) {
        this.f12170 = window;
        this.f12168 = iArr;
        this.f12169 = c4607;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int iM8660 = AbstractC4618.m8660(this.f12170);
        int[] iArr = this.f12168;
        if (iArr[0] != iM8660) {
            AbstractC4608 abstractC4608 = this.f12169.f12150;
            abstractC4608.onKeyboardHeightChange(iM8660);
            if (iM8660 == 0) {
                abstractC4608.getPopupContentView().animate().translationY(0.0f).setInterpolator(new LinearInterpolator()).setDuration(100L).start();
                abstractC4608.hasMoveUp = false;
            } else {
                AbstractC4620.f12179 = iM8660;
                abstractC4608.post(new RunnableC0909(abstractC4608, 11));
                abstractC4608.hasMoveUp = true;
            }
            iArr[0] = iM8660;
        }
    }
}
