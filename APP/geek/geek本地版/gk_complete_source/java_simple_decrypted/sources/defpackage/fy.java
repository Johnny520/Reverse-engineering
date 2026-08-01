package defpackage;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;

/* JADX INFO: loaded from: classes.dex */
public final class fy extends vi {
    final /* synthetic */ gy this$0;

    public static final class a extends vi {
        final /* synthetic */ gy this$0;

        public a(gy r1) {
            this.this$0 = r1;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity r2) {
            ip.o("activity", r2);
            this.this$0.a();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity r3) {
            ip.o("activity", r3);
            gy r32 = this.this$0;
            int r0 = r32.a + 1;
            r32.a = r0;
            if (r0 == 1) goto L5;
            return;
        L5:
            if (r32.d == false) goto L9;
            r32.f.d(iq.ON_START);
            r32.d = false;
            return;
        }
    }

    public fy(gy r1) {
        this.this$0 = r1;
    }

    @Override // defpackage.vi, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity r2, Bundle r3) {
        ip.o("activity", r2);
        if (Build.VERSION.SDK_INT >= 29) goto L6;
        int r32 = p00.b;
        Fragment r22 = r2.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
        ip.m("null cannot be cast to non-null type androidx.lifecycle.ReportFragment", r22);
        l0 r33 = this.this$0.h;
        ((p00) r22).a = r33;
        return;
    }

    @Override // defpackage.vi, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity r4) {
        ip.o("activity", r4);
        gy r42 = this.this$0;
        int r0 = r42.b - 1;
        r42.b = r0;
        if (r0 != 0) goto L6;
        Handler r02 = r42.e;
        ip.l(r02);
        r02.postDelayed(r42.g, 700);
        return;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity r2, Bundle r3) {
        ip.o("activity", r2);
        ey.a(r2, new a(this.this$0));
    }

    @Override // defpackage.vi, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity r3) {
        ip.o("activity", r3);
        gy r32 = this.this$0;
        int r0 = r32.a - 1;
        r32.a = r0;
        if (r0 == 0) goto L5;
        return;
    L5:
        if (r32.c == false) goto L9;
        r32.f.d(iq.ON_STOP);
        r32.d = true;
        return;
    }
}
