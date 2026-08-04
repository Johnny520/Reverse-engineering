package yyds;

import android.app.Activity;
import android.app.Application;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: yyds.ᛷᲈᛴᛷ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1681 {

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public static final Handler f8569 = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public Application f8570;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public WeakReference f8571;

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static Activity m3426() {
        Activity activity = C2675.m4769().f13124;
        Activity activity2 = C2675.m4769().f13123;
        if (activity2 == null || activity == null || activity2 != activity || activity.isFinishing() || activity.isDestroyed()) {
            return null;
        }
        long j = C2675.m4769().f13125;
        if (Build.VERSION.SDK_INT < 36 || System.currentTimeMillis() - j >= 200) {
            return activity;
        }
        return null;
    }
}
