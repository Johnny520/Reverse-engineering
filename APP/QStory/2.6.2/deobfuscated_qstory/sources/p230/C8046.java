package p230;

import android.app.ActivityManager;
import android.content.Context;

/* JADX INFO: renamed from: 飘花落叶言楪世子苏兰哲.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C8046 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final float f22216;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C8048 f22217;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final ActivityManager f22218;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Context f22219;

    public C8046(Context context) {
        this.f22216 = 1.0f;
        this.f22219 = context;
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        this.f22218 = activityManager;
        this.f22217 = new C8048(context.getResources().getDisplayMetrics(), 1);
        if (activityManager.isLowRamDevice()) {
            this.f22216 = 0.0f;
        }
    }
}
