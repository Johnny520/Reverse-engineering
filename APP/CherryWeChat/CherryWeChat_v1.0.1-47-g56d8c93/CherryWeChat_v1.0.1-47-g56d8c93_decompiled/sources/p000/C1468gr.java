package p000;

import android.app.ActivityManager;
import android.content.Context;

/* JADX INFO: renamed from: gr */
/* JADX INFO: loaded from: classes.dex */
public final class C1468gr {

    /* JADX INFO: renamed from: a */
    public final Context f5203a;

    /* JADX INFO: renamed from: b */
    public final ActivityManager f5204b;

    /* JADX INFO: renamed from: c */
    public final C1017Xm f5205c;

    /* JADX INFO: renamed from: d */
    public final float f5206d;

    public C1468gr(Context context) {
        this.f5206d = 1;
        this.f5203a = context;
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        this.f5204b = activityManager;
        this.f5205c = new C1017Xm(5, context.getResources().getDisplayMetrics());
        if (activityManager.isLowRamDevice()) {
            this.f5206d = 0.0f;
        }
    }
}
