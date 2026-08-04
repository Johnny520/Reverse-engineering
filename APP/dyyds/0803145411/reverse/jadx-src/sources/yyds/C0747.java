package yyds;

import android.app.ActivityManager;
import android.content.Context;

/* JADX INFO: renamed from: yyds.ᛳᲈᛷᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0747 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final Context f3449;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final ActivityManager f3450;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final C2014 f3451;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final float f3452;

    public C0747(Context context) {
        this.f3452 = 1.0f;
        this.f3449 = context;
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        this.f3450 = activityManager;
        this.f3451 = new C2014(4, context.getResources().getDisplayMetrics());
        if (activityManager.isLowRamDevice()) {
            this.f3452 = 0.0f;
        }
    }
}
