package p001;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* JADX INFO: renamed from: ۟.da */
/* JADX INFO: loaded from: classes.dex */
public class C0187da implements Application.ActivityLifecycleCallbacks {
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        C0237h4.m1090(C0341oa.m915(new byte[]{79, 38, 126, -92, -69, 121, 90, 60}, new byte[]{46, 69, 10, -51, -51, 16}), activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        C0237h4.m1090(C0341oa.m915(new byte[]{-8, -27, 55, -50, -27, -70, -19, -1}, new byte[]{-103, -122, 67, -89, -109, -45}), activity);
        C0237h4.m1090(C0341oa.m915(new byte[]{-95, -69, 113, -126, 70, -6, -70, -85}, new byte[]{-50, -50, 5, -47, 50, -101}), bundle);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        C0237h4.m1090(C0341oa.m915(new byte[]{88, -1, -37, 51, 25, -107, 77, -27}, new byte[]{57, -100, -81, 90, 111, -4}), activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        C0237h4.m1090(C0341oa.m915(new byte[]{-127, -60, 31, -105, -22, -89, -108, -34}, new byte[]{-32, -89, 107, -2, -100, -50}), activity);
    }
}
