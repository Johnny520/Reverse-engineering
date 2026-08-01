package p000;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;

/* JADX INFO: renamed from: ny */
/* JADX INFO: loaded from: classes.dex */
public final class C0539ny extends AbstractC0894xi {
    final /* synthetic */ C0576oy this$0;

    /* JADX INFO: renamed from: ny$a */
    public static final class a extends AbstractC0894xi {
        final /* synthetic */ C0576oy this$0;

        public a(C0576oy c0576oy) {
            this.this$0 = c0576oy;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            AbstractC0493mp.m1857g("activity", activity);
            this.this$0.m2059a();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            AbstractC0493mp.m1857g("activity", activity);
            C0576oy c0576oy = this.this$0;
            int i = c0576oy.f3549a + 1;
            c0576oy.f3549a = i;
            if (i == 1 && c0576oy.f3552d) {
                c0576oy.f3554f.m262d(EnumC0494mq.ON_START);
                c0576oy.f3552d = false;
            }
        }
    }

    public C0539ny(C0576oy c0576oy) {
        this.this$0 = c0576oy;
    }

    @Override // p000.AbstractC0894xi, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        AbstractC0493mp.m1857g("activity", activity);
        if (Build.VERSION.SDK_INT < 29) {
            int i = w00.f5023b;
            Fragment fragmentFindFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            AbstractC0493mp.m1855e("null cannot be cast to non-null type androidx.lifecycle.ReportFragment", fragmentFindFragmentByTag);
            ((w00) fragmentFindFragmentByTag).f5024a = this.this$0.f3556h;
        }
    }

    @Override // p000.AbstractC0894xi, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        AbstractC0493mp.m1857g("activity", activity);
        C0576oy c0576oy = this.this$0;
        int i = c0576oy.f3550b - 1;
        c0576oy.f3550b = i;
        if (i == 0) {
            Handler handler = c0576oy.f3553e;
            AbstractC0493mp.m1854d(handler);
            handler.postDelayed(c0576oy.f3555g, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        AbstractC0493mp.m1857g("activity", activity);
        AbstractC0502my.m1907a(activity, new a(this.this$0));
    }

    @Override // p000.AbstractC0894xi, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        AbstractC0493mp.m1857g("activity", activity);
        C0576oy c0576oy = this.this$0;
        int i = c0576oy.f3549a - 1;
        c0576oy.f3549a = i;
        if (i == 0 && c0576oy.f3551c) {
            c0576oy.f3554f.m262d(EnumC0494mq.ON_STOP);
            c0576oy.f3552d = true;
        }
    }
}
