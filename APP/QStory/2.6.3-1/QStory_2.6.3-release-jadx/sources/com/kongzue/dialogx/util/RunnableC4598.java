package com.kongzue.dialogx.util;

import androidx.appcompat.app.RunnableC0909;
import com.kongzue.dialogx.util.views.C4591;
import com.kongzue.dialogx.util.views.C4594;

/* JADX INFO: renamed from: com.kongzue.dialogx.util.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC4598 implements Runnable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ RunnableC0909 f12069;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ float f12070;

    public RunnableC4598(RunnableC0909 runnableC0909, float f) {
        this.f12069 = runnableC0909;
        this.f12070 = f;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4591 c4591 = ((C4597) this.f12069.f480).f12059;
        int i = c4591.f12024;
        float f = this.f12070;
        switch (i) {
            case 0:
                C4594 c4594 = c4591.f12023;
                c4594.f12050 = f;
                c4594.invalidate();
                break;
            case 1:
                C4594 c45942 = c4591.f12023;
                if (c45942.isAttachedToWindow()) {
                    c45942.f12050 = f;
                    c45942.invalidate();
                    break;
                }
                break;
            default:
                c4591.f12023.f12051 = f;
                break;
        }
    }
}
