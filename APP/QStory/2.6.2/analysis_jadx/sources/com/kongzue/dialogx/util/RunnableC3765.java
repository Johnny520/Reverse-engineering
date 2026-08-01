package com.kongzue.dialogx.util;

import androidx.appcompat.app.RunnableC0062;
import com.kongzue.dialogx.util.views.C3758;
import com.kongzue.dialogx.util.views.C3761;

/* JADX INFO: renamed from: com.kongzue.dialogx.util.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC3765 implements Runnable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ RunnableC0062 f11719;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ float f11720;

    public RunnableC3765(RunnableC0062 runnableC0062, float f) {
        this.f11719 = runnableC0062;
        this.f11720 = f;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C3758 c3758 = ((C3764) this.f11719.f135).f11709;
        int i = c3758.f11674;
        float f = this.f11720;
        switch (i) {
            case 0:
                C3761 c3761 = c3758.f11673;
                c3761.f11700 = f;
                c3761.invalidate();
                break;
            case 1:
                C3761 c37612 = c3758.f11673;
                if (c37612.isAttachedToWindow()) {
                    c37612.f11700 = f;
                    c37612.invalidate();
                    break;
                }
                break;
            default:
                c3758.f11673.f11701 = f;
                break;
        }
    }
}
