package p000;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;

/* JADX INFO: renamed from: fy */
/* JADX INFO: loaded from: classes.dex */
public final class C0241fy extends AbstractC0820vi {
    final /* synthetic */ C0278gy this$0;

    /* JADX INFO: renamed from: fy$a */
    public static final class a extends AbstractC0820vi {
        final /* synthetic */ C0278gy this$0;

        public a(C0278gy c0278gy) {
            this.this$0 = c0278gy;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            AbstractC0346ip.m1503o("activity", activity);
            this.this$0.m1333a();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            AbstractC0346ip.m1503o("activity", activity);
            C0278gy c0278gy = this.this$0;
            int i = c0278gy.f2171a + 1;
            c0278gy.f2171a = i;
            if (i == 1 && c0278gy.f2174d) {
                c0278gy.f2176f.m277d(EnumC0347iq.ON_START);
                c0278gy.f2174d = false;
            }
        }
    }

    public C0241fy(C0278gy c0278gy) {
        this.this$0 = c0278gy;
    }

    @Override // p000.AbstractC0820vi, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        AbstractC0346ip.m1503o("activity", activity);
        if (Build.VERSION.SDK_INT < 29) {
            int i = p00.f3627b;
            Fragment fragmentFindFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            AbstractC0346ip.m1501m("null cannot be cast to non-null type androidx.lifecycle.ReportFragment", fragmentFindFragmentByTag);
            ((p00) fragmentFindFragmentByTag).f3628a = this.this$0.f2178h;
        }
    }

    @Override // p000.AbstractC0820vi, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        AbstractC0346ip.m1503o("activity", activity);
        C0278gy c0278gy = this.this$0;
        int i = c0278gy.f2172b - 1;
        c0278gy.f2172b = i;
        if (i == 0) {
            Handler handler = c0278gy.f2175e;
            AbstractC0346ip.m1500l(handler);
            handler.postDelayed(c0278gy.f2177g, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        AbstractC0346ip.m1503o("activity", activity);
        AbstractC0204ey.m1092a(activity, new a(this.this$0));
    }

    @Override // p000.AbstractC0820vi, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        AbstractC0346ip.m1503o("activity", activity);
        C0278gy c0278gy = this.this$0;
        int i = c0278gy.f2171a - 1;
        c0278gy.f2171a = i;
        if (i == 0 && c0278gy.f2173c) {
            c0278gy.f2176f.m277d(EnumC0347iq.ON_STOP);
            c0278gy.f2174d = true;
        }
    }
}
