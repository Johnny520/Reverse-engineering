package androidx.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;

/* JADX INFO: renamed from: androidx.lifecycle.飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2367 extends AbstractC2404 {
    final /* synthetic */ C2431 this$0;

    /* JADX INFO: renamed from: androidx.lifecycle.飘花落叶言子世兰哲苏楪$飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    public static final class C2368 extends AbstractC2404 {
        final /* synthetic */ C2431 this$0;

        public C2368(C2431 c2431) {
            this.this$0 = c2431;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            activity.getClass();
            this.this$0.m4516();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            activity.getClass();
            C2431 c2431 = this.this$0;
            int i = c2431.f7094 + 1;
            c2431.f7094 = i;
            if (i == 1 && c2431.f7088) {
                c2431.f7090.m4489(Lifecycle$Event.ON_START);
                c2431.f7088 = false;
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
            int i = FragmentC2433.f7095;
            Fragment fragmentFindFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            fragmentFindFragmentByTag.getClass();
            ((FragmentC2433) fragmentFindFragmentByTag).f7096 = this.this$0.f7089;
        }
    }

    @Override // androidx.lifecycle.AbstractC2404, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        activity.getClass();
        C2431 c2431 = this.this$0;
        int i = c2431.f7092 - 1;
        c2431.f7092 = i;
        if (i == 0) {
            Handler handler = c2431.f7087;
            handler.getClass();
            handler.postDelayed(c2431.f7091, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        activity.getClass();
        AbstractC2366.m4480(activity, new C2368(this.this$0));
    }

    @Override // androidx.lifecycle.AbstractC2404, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        activity.getClass();
        C2431 c2431 = this.this$0;
        int i = c2431.f7094 - 1;
        c2431.f7094 = i;
        if (i == 0 && c2431.f7093) {
            c2431.f7090.m4489(Lifecycle$Event.ON_STOP);
            c2431.f7088 = true;
        }
    }
}
