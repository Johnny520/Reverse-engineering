package androidx.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import p031Q0.AbstractC0307g;

/* JADX INFO: renamed from: androidx.lifecycle.z */
/* JADX INFO: loaded from: classes.dex */
public final class C0549z extends AbstractC0529f {
    final /* synthetic */ C0512A this$0;

    public C0549z(C0512A c0512a) {
        this.this$0 = c0512a;
    }

    @Override // androidx.lifecycle.AbstractC0529f, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        AbstractC0307g.m703e(activity, "activity");
        if (Build.VERSION.SDK_INT < 29) {
            int i2 = FragmentC0515D.f1457b;
            Fragment fragmentFindFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            AbstractC0307g.m701c(fragmentFindFragmentByTag, "null cannot be cast to non-null type androidx.lifecycle.ReportFragment");
            ((FragmentC0515D) fragmentFindFragmentByTag).f1458a = this.this$0.f1455h;
        }
    }

    @Override // androidx.lifecycle.AbstractC0529f, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        AbstractC0307g.m703e(activity, "activity");
        C0512A c0512a = this.this$0;
        int i2 = c0512a.f1449b - 1;
        c0512a.f1449b = i2;
        if (i2 == 0) {
            Handler handler = c0512a.f1452e;
            AbstractC0307g.m700b(handler);
            handler.postDelayed(c0512a.f1454g, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        AbstractC0307g.m703e(activity, "activity");
        AbstractC0547x.m1262a(activity, new C0548y(this.this$0));
    }

    @Override // androidx.lifecycle.AbstractC0529f, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        AbstractC0307g.m703e(activity, "activity");
        C0512A c0512a = this.this$0;
        int i2 = c0512a.f1448a - 1;
        c0512a.f1448a = i2;
        if (i2 == 0 && c0512a.f1450c) {
            c0512a.f1453f.m1257d(EnumC0535l.ON_STOP);
            c0512a.f1451d = true;
        }
    }
}
