package com.kongzue.dialogx.util.views;

import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;

/* JADX INFO: renamed from: com.kongzue.dialogx.util.views.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC4593 implements Runnable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ C4594 f12025;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f12026;

    public /* synthetic */ RunnableC4593(C4594 c4594, int i) {
        this.f12026 = i;
        this.f12025 = c4594;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f12026;
        C4594 c4594 = this.f12025;
        switch (i) {
            case 0:
                c4594.performHapticFeedback(0);
                break;
            case 1:
                c4594.performHapticFeedback(3);
                break;
            case 2:
                c4594.m8644(1, new AccelerateDecelerateInterpolator());
                break;
            case 3:
                c4594.m8644(2, new AccelerateInterpolator(2.0f));
                break;
            case 4:
                c4594.m8644(3, new DecelerateInterpolator(2.0f));
                break;
            default:
                c4594.m8644(c4594.f12054, c4594.f12032);
                break;
        }
    }
}
