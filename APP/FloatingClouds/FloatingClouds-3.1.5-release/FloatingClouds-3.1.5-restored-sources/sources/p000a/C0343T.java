package p000a;

import android.app.Activity;
import android.app.SharedElementCallback;

/* JADX INFO: renamed from: a.T */
/* JADX INFO: loaded from: classes.dex */
public final class C0343T {
    /* JADX INFO: renamed from: a */
    public static void m939a(Object obj) {
        ((SharedElementCallback.OnSharedElementsReadyListener) obj).onSharedElementsReady();
    }

    /* JADX INFO: renamed from: b */
    public static void m940b(Activity activity, String[] strArr, int i) {
        activity.requestPermissions(strArr, i);
    }

    /* JADX INFO: renamed from: c */
    public static boolean m941c(Activity activity, String str) {
        return activity.shouldShowRequestPermissionRationale(str);
    }
}
