package com.kongzue.dialogx.util.views;

import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;

/* JADX INFO: renamed from: com.kongzue.dialogx.util.views.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC3760 implements Runnable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ C3761 f11675;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f11676;

    public /* synthetic */ RunnableC3760(C3761 c3761, int i) {
        this.f11676 = i;
        this.f11675 = c3761;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f11676;
        C3761 c3761 = this.f11675;
        switch (i) {
            case 0:
                c3761.performHapticFeedback(0);
                break;
            case 1:
                c3761.performHapticFeedback(3);
                break;
            case 2:
                c3761.m8098(1, new AccelerateDecelerateInterpolator());
                break;
            case 3:
                c3761.m8098(2, new AccelerateInterpolator(2.0f));
                break;
            case 4:
                c3761.m8098(3, new DecelerateInterpolator(2.0f));
                break;
            default:
                c3761.m8098(c3761.f11704, c3761.f11682);
                break;
        }
    }
}
