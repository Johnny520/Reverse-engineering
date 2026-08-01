package com.lxj.xpopup.util;

import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.animation.LinearInterpolator;
import androidx.appcompat.app.RunnableC0062;
import com.lxj.xpopup.core.AbstractC3775;
import com.lxj.xpopup.core.C3774;

/* JADX INFO: renamed from: com.lxj.xpopup.util.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC3786 implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ int[] f11818;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ C3774 f11819;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ Window f11820;

    public ViewTreeObserverOnGlobalLayoutListenerC3786(Window window, int[] iArr, C3774 c3774) {
        this.f11820 = window;
        this.f11818 = iArr;
        this.f11819 = c3774;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int iM8114 = AbstractC3785.m8114(this.f11820);
        int[] iArr = this.f11818;
        if (iArr[0] != iM8114) {
            AbstractC3775 abstractC3775 = this.f11819.f11800;
            abstractC3775.onKeyboardHeightChange(iM8114);
            if (iM8114 == 0) {
                abstractC3775.getPopupContentView().animate().translationY(0.0f).setInterpolator(new LinearInterpolator()).setDuration(100L).start();
                abstractC3775.hasMoveUp = false;
            } else {
                AbstractC3787.f11829 = iM8114;
                abstractC3775.post(new RunnableC0062(abstractC3775, 11));
                abstractC3775.hasMoveUp = true;
            }
            iArr[0] = iM8114;
        }
    }
}
