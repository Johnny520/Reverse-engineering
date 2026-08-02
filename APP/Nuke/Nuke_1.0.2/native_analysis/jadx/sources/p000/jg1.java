package p000;

import android.app.ActivityManager;
import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class jg1 {

    /* JADX INFO: renamed from: a */
    public final Context f5023a;

    /* JADX INFO: renamed from: b */
    public final ActivityManager f5024b;

    /* JADX INFO: renamed from: c */
    public final C0485n4 f5025c;

    /* JADX INFO: renamed from: d */
    public final float f5026d;

    public jg1(Context context) {
        this.f5026d = 1.0f;
        this.f5023a = context;
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        this.f5024b = activityManager;
        this.f5025c = new C0485n4(29, context.getResources().getDisplayMetrics());
        if (activityManager.isLowRamDevice()) {
            this.f5026d = 0.0f;
        }
    }
}
