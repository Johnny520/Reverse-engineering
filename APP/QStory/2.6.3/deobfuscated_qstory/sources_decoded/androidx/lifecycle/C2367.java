package androidx.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;

/* JADX INFO: renamed from: androidx.lifecycle.飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2367 extends AbstractC2404 {
    final /* synthetic */ C2431 this$0;

    /* JADX INFO: renamed from: androidx.lifecycle.飘花落叶言子世兰哲苏楪$飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static final class C2368 extends AbstractC2404 {
        final /* synthetic */ C2431 this$0;

        public C2368(C2431 c2431) {
            this.this$0 = c2431;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            activity.getClass();
            this.this$0.m4526();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            activity.getClass();
            C2431 c2431 = this.this$0;
            int i = c2431.f7095 + 1;
            c2431.f7095 = i;
            if (i == 1 && c2431.f7089) {
                c2431.f7091.m4499(Lifecycle$Event.ON_START);
                c2431.f7089 = false;
            }
        }
    }

    public C2367(C2431 c2431) {
        this.this$0 = c2431;
    }

    @Override // androidx.lifecycle.AbstractC2404, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        activity.getClass();
        if (Build.VERSION.SDK_INT < 29) {
            int i = FragmentC2433.f7096;
            Fragment fragmentFindFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            fragmentFindFragmentByTag.getClass();
            ((FragmentC2433) fragmentFindFragmentByTag).f7097 = this.this$0.f7090;
        }
    }

    @Override // androidx.lifecycle.AbstractC2404, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        activity.getClass();
        C2431 c2431 = this.this$0;
        int i = c2431.f7093 - 1;
        c2431.f7093 = i;
        if (i == 0) {
            Handler handler = c2431.f7088;
            handler.getClass();
            handler.postDelayed(c2431.f7092, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        activity.getClass();
        AbstractC2366.m4490(activity, new C2368(this.this$0));
    }

    @Override // androidx.lifecycle.AbstractC2404, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        activity.getClass();
        C2431 c2431 = this.this$0;
        int i = c2431.f7095 - 1;
        c2431.f7095 = i;
        if (i == 0 && c2431.f7094) {
            c2431.f7091.m4499(Lifecycle$Event.ON_STOP);
            c2431.f7089 = true;
        }
    }
}
