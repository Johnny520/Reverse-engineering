package com.kongzue.dialogx.util.views;

import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;

/* JADX INFO: renamed from: com.kongzue.dialogx.util.views.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC3761 implements Runnable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ C3762 f11680;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f11681;

    public /* synthetic */ RunnableC3761(C3762 c3762, int i) {
        this.f11681 = i;
        this.f11680 = c3762;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f11681;
        C3762 c3762 = this.f11680;
        switch (i) {
            case 0:
                c3762.performHapticFeedback(0);
                break;
            case 1:
                c3762.performHapticFeedback(3);
                break;
            case 2:
                c3762.m8085(1, new AccelerateDecelerateInterpolator());
                break;
            case 3:
                c3762.m8085(2, new AccelerateInterpolator(2.0f));
                break;
            case 4:
                c3762.m8085(3, new DecelerateInterpolator(2.0f));
                break;
            default:
                c3762.m8085(c3762.f11709, c3762.f11687);
                break;
        }
    }
}
