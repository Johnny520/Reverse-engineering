package androidx.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import p027N0.AbstractC0223g;

/* JADX INFO: renamed from: androidx.lifecycle.A */
/* JADX INFO: loaded from: classes.dex */
public final class C0449A extends AbstractC0472g {
    final /* synthetic */ C0450B this$0;

    /* JADX INFO: renamed from: androidx.lifecycle.A$a */
    public static final class a extends AbstractC0472g {
        final /* synthetic */ C0450B this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public a(C0450B c0450b) {
            this.this$0 = c0450b;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            AbstractC0223g.m418e(activity, "activity");
            this.this$0.m904a();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            AbstractC0223g.m418e(activity, "activity");
            C0450B c0450b = this.this$0;
            int i2 = c0450b.f1457b + 1;
            c0450b.f1457b = i2;
            if (i2 == 1 && c0450b.f1460e) {
                c0450b.f1462g.m930d(EnumC0478m.ON_START);
                c0450b.f1460e = false;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0449A(C0450B c0450b) {
        this.this$0 = c0450b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.lifecycle.AbstractC0472g, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        AbstractC0223g.m418e(activity, "activity");
        if (Build.VERSION.SDK_INT < 29) {
            int i2 = FragmentC0453E.f1468c;
            Fragment fragmentFindFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            AbstractC0223g.m416c(fragmentFindFragmentByTag, "null cannot be cast to non-null type androidx.lifecycle.ReportFragment");
            ((FragmentC0453E) fragmentFindFragmentByTag).f1469b = this.this$0.f1464i;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.lifecycle.AbstractC0472g, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        AbstractC0223g.m418e(activity, "activity");
        C0450B c0450b = this.this$0;
        int i2 = c0450b.f1458c - 1;
        c0450b.f1458c = i2;
        if (i2 == 0) {
            Handler handler = c0450b.f1461f;
            AbstractC0223g.m415b(handler);
            handler.postDelayed(c0450b.f1463h, 700L);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        AbstractC0223g.m418e(activity, "activity");
        AbstractC0491z.m938a(activity, new a(this.this$0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.lifecycle.AbstractC0472g, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        AbstractC0223g.m418e(activity, "activity");
        C0450B c0450b = this.this$0;
        int i2 = c0450b.f1457b - 1;
        c0450b.f1457b = i2;
        if (i2 == 0 && c0450b.f1459d) {
            c0450b.f1462g.m930d(EnumC0478m.ON_STOP);
            c0450b.f1460e = true;
        }
    }
}
