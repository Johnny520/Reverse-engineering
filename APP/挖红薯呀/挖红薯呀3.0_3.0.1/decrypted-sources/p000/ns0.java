package p000;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class ns0 extends AbstractC0139ds {
    final /* synthetic */ os0 this$0;

    /* JADX INFO: renamed from: ns0$a */
    /* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
    public static final class C0524a extends AbstractC0139ds {
        final /* synthetic */ os0 this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public C0524a(os0 os0Var) {
            this.this$0 = os0Var;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            activity.getClass();
            os0 os0Var = this.this$0;
            int i = os0Var.f4623e + 1;
            os0Var.f4623e = i;
            if (i == 1) {
                if (os0Var.f4624f) {
                    os0Var.f4627i.m5461e(q90.ON_RESUME);
                    os0Var.f4624f = false;
                } else {
                    Handler handler = os0Var.f4626h;
                    handler.getClass();
                    handler.removeCallbacks(os0Var.f4628j);
                }
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            activity.getClass();
            os0 os0Var = this.this$0;
            int i = os0Var.f4622d + 1;
            os0Var.f4622d = i;
            if (i == 1 && os0Var.f4625g) {
                os0Var.f4627i.m5461e(q90.ON_START);
                os0Var.f4625g = false;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ns0(os0 os0Var) {
        this.this$0 = os0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0139ds, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        activity.getClass();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0139ds, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        activity.getClass();
        os0 os0Var = this.this$0;
        int i = os0Var.f4623e - 1;
        os0Var.f4623e = i;
        if (i == 0) {
            Handler handler = os0Var.f4626h;
            handler.getClass();
            handler.postDelayed(os0Var.f4628j, 700L);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        activity.getClass();
        activity.registerActivityLifecycleCallbacks(new C0524a(this.this$0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0139ds, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        activity.getClass();
        os0 os0Var = this.this$0;
        int i = os0Var.f4622d - 1;
        os0Var.f4622d = i;
        if (i == 0 && os0Var.f4624f) {
            os0Var.f4627i.m5461e(q90.ON_STOP);
            os0Var.f4625g = true;
        }
    }
}
