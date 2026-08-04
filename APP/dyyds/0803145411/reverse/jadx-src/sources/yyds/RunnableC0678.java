package yyds;

import android.R;
import android.app.Activity;
import android.app.Application;
import android.view.WindowManager;

/* JADX INFO: renamed from: yyds.ᛳᲀᛶᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0678 implements Runnable {

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final /* synthetic */ int f3227;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final /* synthetic */ C0922 f3228;

    public /* synthetic */ RunnableC0678(C0922 c0922, int i) {
        this.f3227 = i;
        this.f3228 = c0922;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f3227;
        WindowManager windowManager = null;
        C0922 c0922 = this.f3228;
        switch (i) {
            case 0:
                C2763 c2763 = c0922.f4227;
                C1053 c1053 = c0922.f4228;
                Activity activity = c1053.f4788;
                if (activity == null) {
                    Application application = c1053.f4789;
                    if (application != null) {
                        windowManager = (WindowManager) application.getSystemService("window");
                    }
                } else if (!activity.isDestroyed()) {
                    windowManager = c1053.f4788.getWindowManager();
                }
                if (windowManager == null) {
                    return;
                }
                WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
                layoutParams.height = -2;
                layoutParams.width = -2;
                layoutParams.format = -3;
                layoutParams.flags = 152;
                layoutParams.packageName = c0922.f4230;
                layoutParams.gravity = c2763.f13493;
                layoutParams.x = 0;
                layoutParams.y = 0;
                layoutParams.verticalMargin = 0.0f;
                layoutParams.horizontalMargin = 0.0f;
                layoutParams.windowAnimations = R.style.Animation.Toast;
                layoutParams.setTitle("Toast");
                layoutParams.setFitInsetsIgnoringVisibility(true);
                if (c0922.f4226) {
                    layoutParams.type = 2038;
                    layoutParams.flags &= -17;
                }
                try {
                    windowManager.addView(c2763.f13491, layoutParams);
                    C0922.f4225.postDelayed(new RunnableC0309(18, this), c2763.f13495 == 1 ? 3500L : 2000L);
                    c1053.f4790 = c0922;
                    Activity activity2 = c1053.f4788;
                    if (activity2 != null) {
                        activity2.registerActivityLifecycleCallbacks(c1053);
                    }
                    c0922.f4232 = true;
                    C0922.m2038(c2763.f13491);
                    return;
                } catch (Exception e) {
                    e.printStackTrace();
                    return;
                }
            default:
                C1053 c10532 = c0922.f4228;
                try {
                    try {
                        Activity activity3 = c10532.f4788;
                        if (activity3 == null) {
                            Application application2 = c10532.f4789;
                            if (application2 != null) {
                                windowManager = (WindowManager) application2.getSystemService("window");
                            }
                        } else if (!activity3.isDestroyed()) {
                            windowManager = c10532.f4788.getWindowManager();
                        }
                        if (windowManager != null) {
                            windowManager.removeViewImmediate(c0922.f4227.f13491);
                        }
                        break;
                    } catch (Exception e2) {
                        e2.printStackTrace();
                        break;
                    }
                    return;
                } finally {
                    c10532.m2249();
                    c0922.f4232 = false;
                }
        }
    }
}
