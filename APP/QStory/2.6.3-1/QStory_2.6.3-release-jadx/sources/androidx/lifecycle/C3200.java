package androidx.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;

/* JADX INFO: renamed from: androidx.lifecycle.飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3200 extends AbstractC3237 {
    final /* synthetic */ C3264 this$0;

    /* JADX INFO: renamed from: androidx.lifecycle.飘花落叶言子世兰哲苏楪$飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static final class C3201 extends AbstractC3237 {
        final /* synthetic */ C3264 this$0;

        public C3201(C3264 c3264) {
            this.this$0 = c3264;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            activity.getClass();
            this.this$0.m5086();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            activity.getClass();
            C3264 c3264 = this.this$0;
            int i = c3264.f7440 + 1;
            c3264.f7440 = i;
            if (i == 1 && c3264.f7434) {
                c3264.f7436.m5059(Lifecycle$Event.ON_START);
                c3264.f7434 = false;
            }
        }
    }

    public C3200(C3264 c3264) {
        this.this$0 = c3264;
    }

    @Override // androidx.lifecycle.AbstractC3237, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        activity.getClass();
        if (Build.VERSION.SDK_INT < 29) {
            int i = FragmentC3266.f7441;
            Fragment fragmentFindFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            fragmentFindFragmentByTag.getClass();
            ((FragmentC3266) fragmentFindFragmentByTag).f7442 = this.this$0.f7435;
        }
    }

    @Override // androidx.lifecycle.AbstractC3237, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        activity.getClass();
        C3264 c3264 = this.this$0;
        int i = c3264.f7438 - 1;
        c3264.f7438 = i;
        if (i == 0) {
            Handler handler = c3264.f7433;
            handler.getClass();
            handler.postDelayed(c3264.f7437, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        activity.getClass();
        AbstractC3199.m5050(activity, new C3201(this.this$0));
    }

    @Override // androidx.lifecycle.AbstractC3237, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        activity.getClass();
        C3264 c3264 = this.this$0;
        int i = c3264.f7440 - 1;
        c3264.f7440 = i;
        if (i == 0 && c3264.f7439) {
            c3264.f7436.m5059(Lifecycle$Event.ON_STOP);
            c3264.f7434 = true;
        }
    }
}
