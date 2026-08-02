package defpackage;

import android.app.ActivityManager;
import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class jg1 {
    public final Context a;
    public final ActivityManager b;
    public final n4 c;
    public final float d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public jg1(Context context) {
        this.d = 1.0f;
        this.a = context;
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        this.b = activityManager;
        this.c = new n4(29, context.getResources().getDisplayMetrics());
        if (activityManager.isLowRamDevice()) {
            this.d = 0.0f;
        }
    }
}
