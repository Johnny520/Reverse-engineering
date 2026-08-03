package androidx.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;

/* JADX INFO: renamed from: androidx.lifecycle.w */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0118w extends AbstractC0102g {
    final /* synthetic */ C0120y this$0;

    /* JADX INFO: renamed from: androidx.lifecycle.w$a */
    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static final class a extends AbstractC0102g {
        final /* synthetic */ C0120y this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public a(C0120y c0120y) {
            this.this$0 = c0120y;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            activity.getClass();
            this.this$0.m616a();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            activity.getClass();
            C0120y c0120y = this.this$0;
            int i9 = c0120y.f312g + 1;
            c0120y.f312g = i9;
            if (i9 == 1 && c0120y.f315j) {
                c0120y.f317l.m555d(EnumC0106k.ON_START);
                c0120y.f315j = false;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0118w(C0120y c0120y) {
        this.this$0 = c0120y;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.lifecycle.AbstractC0102g, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        activity.getClass();
        if (Build.VERSION.SDK_INT < 29) {
            int i9 = FragmentC0096c0.f280h;
            Fragment fragmentFindFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            fragmentFindFragmentByTag.getClass();
            ((FragmentC0096c0) fragmentFindFragmentByTag).f281g = this.this$0.f319n;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.lifecycle.AbstractC0102g, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        activity.getClass();
        C0120y c0120y = this.this$0;
        int i9 = c0120y.f313h - 1;
        c0120y.f313h = i9;
        if (i9 == 0) {
            Handler handler = c0120y.f316k;
            handler.getClass();
            handler.postDelayed(c0120y.f318m, 700L);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        activity.getClass();
        AbstractC0117v.m562a(activity, new a(this.this$0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.lifecycle.AbstractC0102g, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        activity.getClass();
        C0120y c0120y = this.this$0;
        int i9 = c0120y.f312g - 1;
        c0120y.f312g = i9;
        if (i9 == 0 && c0120y.f314i) {
            c0120y.f317l.m555d(EnumC0106k.ON_STOP);
            c0120y.f315j = true;
        }
    }
}
