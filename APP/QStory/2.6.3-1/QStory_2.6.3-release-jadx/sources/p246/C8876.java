package p246;

import android.app.ActivityManager;
import android.content.Context;

/* JADX INFO: renamed from: 飘花落叶言楪世子苏兰哲.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8876 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final float f22558;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C8878 f22559;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final ActivityManager f22560;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Context f22561;

    public C8876(Context context) {
        this.f22558 = 1.0f;
        this.f22561 = context;
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        this.f22560 = activityManager;
        this.f22559 = new C8878(context.getResources().getDisplayMetrics(), 1);
        if (activityManager.isLowRamDevice()) {
            this.f22558 = 0.0f;
        }
    }
}
