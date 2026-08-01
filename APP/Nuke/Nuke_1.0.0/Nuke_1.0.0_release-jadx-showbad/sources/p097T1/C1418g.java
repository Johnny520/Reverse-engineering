package p097T1;

import android.app.ActivityManager;
import android.content.Context;
import p000A.C0066i0;

/* JADX INFO: renamed from: T1.g */
/* JADX INFO: loaded from: classes.dex */
public final class C1418g {

    /* JADX INFO: renamed from: a */
    public final Context f5069a;

    /* JADX INFO: renamed from: b */
    public final ActivityManager f5070b;

    /* JADX INFO: renamed from: c */
    public final C0066i0 f5071c;

    /* JADX INFO: renamed from: d */
    public final float f5072d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1418g(Context context) {
        this.f5072d = 1;
        this.f5069a = context;
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        this.f5070b = activityManager;
        this.f5071c = new C0066i0(21, context.getResources().getDisplayMetrics());
        if (activityManager.isLowRamDevice()) {
            this.f5072d = 0.0f;
        }
    }
}
