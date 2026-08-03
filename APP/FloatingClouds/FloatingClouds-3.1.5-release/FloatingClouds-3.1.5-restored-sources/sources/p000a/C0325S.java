package p000a;

import android.app.Activity;
import android.app.SharedElementCallback;

/* JADX INFO: renamed from: a.S */
/* JADX INFO: loaded from: classes.dex */
public final class C0325S {
    /* JADX INFO: renamed from: a */
    public static void m897a(Activity activity) {
        activity.finishAfterTransition();
    }

    /* JADX INFO: renamed from: b */
    public static void m898b(Activity activity) {
        activity.postponeEnterTransition();
    }

    /* JADX INFO: renamed from: c */
    public static void m899c(Activity activity, SharedElementCallback sharedElementCallback) {
        activity.setEnterSharedElementCallback(sharedElementCallback);
    }

    /* JADX INFO: renamed from: d */
    public static void m900d(Activity activity, SharedElementCallback sharedElementCallback) {
        activity.setExitSharedElementCallback(sharedElementCallback);
    }

    /* JADX INFO: renamed from: e */
    public static void m901e(Activity activity) {
        activity.startPostponedEnterTransition();
    }
}
