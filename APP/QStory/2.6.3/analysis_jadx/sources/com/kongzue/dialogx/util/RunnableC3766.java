package com.kongzue.dialogx.util;

import androidx.appcompat.app.RunnableC0062;
import com.kongzue.dialogx.util.views.C3759;
import com.kongzue.dialogx.util.views.C3762;

/* JADX INFO: renamed from: com.kongzue.dialogx.util.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC3766 implements Runnable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ RunnableC0062 f11724;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ float f11725;

    public RunnableC3766(RunnableC0062 runnableC0062, float f) {
        this.f11724 = runnableC0062;
        this.f11725 = f;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C3759 c3759 = ((C3765) this.f11724.f135).f11714;
        int i = c3759.f11679;
        float f = this.f11725;
        switch (i) {
            case 0:
                C3762 c3762 = c3759.f11678;
                c3762.f11705 = f;
                c3762.invalidate();
                break;
            case 1:
                C3762 c37622 = c3759.f11678;
                if (c37622.isAttachedToWindow()) {
                    c37622.f11705 = f;
                    c37622.invalidate();
                    break;
                }
                break;
            default:
                c3759.f11678.f11706 = f;
                break;
        }
    }
}
