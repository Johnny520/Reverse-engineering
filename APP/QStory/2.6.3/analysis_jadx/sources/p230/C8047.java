package p230;

import android.app.ActivityManager;
import android.content.Context;

/* JADX INFO: renamed from: 飘花落叶言楪世子苏兰哲.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8047 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final float f22213;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C8049 f22214;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final ActivityManager f22215;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Context f22216;

    public C8047(Context context) {
        this.f22213 = 1.0f;
        this.f22216 = context;
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        this.f22215 = activityManager;
        this.f22214 = new C8049(context.getResources().getDisplayMetrics(), 1);
        if (activityManager.isLowRamDevice()) {
            this.f22213 = 0.0f;
        }
    }
}
