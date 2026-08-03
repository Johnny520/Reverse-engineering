package androidx.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import p006D.C0095d;
import p031Q0.AbstractC0307g;

/* JADX INFO: renamed from: androidx.lifecycle.z */
/* JADX INFO: loaded from: classes.dex */
public final class C0549z extends AbstractC0529f {
    final /* synthetic */ C0512A this$0;

    public C0549z(C0512A r1) {
        this.this$0 = r1;
    }

    @Override // androidx.lifecycle.AbstractC0529f, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity r2, Bundle r3) {
        AbstractC0307g.m703e(r2, "activity");
        if (Build.VERSION.SDK_INT >= 29) goto L6;
        int r32 = FragmentC0515D.f1457b;
        Fragment r22 = r2.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
        AbstractC0307g.m701c(r22, "null cannot be cast to non-null type androidx.lifecycle.ReportFragment");
        C0095d r33 = this.this$0.f1455h;
        ((FragmentC0515D) r22).f1458a = r33;
        return;
    }

    @Override // androidx.lifecycle.AbstractC0529f, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity r4) {
        AbstractC0307g.m703e(r4, "activity");
        C0512A r42 = this.this$0;
        int r02 = r42.f1449b - 1;
        r42.f1449b = r02;
        if (r02 != 0) goto L6;
        Handler r03 = r42.f1452e;
        AbstractC0307g.m700b(r03);
        r03.postDelayed(r42.f1454g, 700);
        return;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity r2, Bundle r3) {
        AbstractC0307g.m703e(r2, "activity");
        AbstractC0547x.m1262a(r2, new C0548y(this.this$0));
    }

    @Override // androidx.lifecycle.AbstractC0529f, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity r3) {
        AbstractC0307g.m703e(r3, "activity");
        C0512A r32 = this.this$0;
        int r02 = r32.f1448a - 1;
        r32.f1448a = r02;
        if (r02 == 0) goto L5;
        return;
    L5:
        if (r32.f1450c == false) goto L9;
        r32.f1453f.m1257d(EnumC0535l.ON_STOP);
        r32.f1451d = true;
        return;
    }
}
