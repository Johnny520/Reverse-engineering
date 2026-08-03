package p000;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import androidx.lifecycle.ProcessLifecycleOwner;

/* JADX INFO: renamed from: zu */
/* JADX INFO: loaded from: classes.dex */
public final class C2817zu extends AbstractC0323Hf {
    final /* synthetic */ ProcessLifecycleOwner this$0;

    /* JADX INFO: renamed from: zu$a */
    public static final class a extends AbstractC0323Hf {
        final /* synthetic */ ProcessLifecycleOwner this$0;

        public a(ProcessLifecycleOwner r1) {
            this.this$0 = r1;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity r1) {
            this.this$0.m2167a();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity r3) {
            ProcessLifecycleOwner r32 = this.this$0;
            int r0 = r32.f3965a + 1;
            r32.f3965a = r0;
            if (r0 == 1) goto L5;
            return;
        L5:
            if (r32.f3968d == false) goto L9;
            r32.f3970f.m2276e(EnumC0632On.ON_START);
            r32.f3968d = false;
            return;
        }
    }

    public C2817zu(ProcessLifecycleOwner r1) {
        this.this$0 = r1;
    }

    @Override // p000.AbstractC0323Hf, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity r2, Bundle r3) {
        if (Build.VERSION.SDK_INT >= 29) goto L6;
        int r32 = FragmentC0983Wv.f3092b;
        FragmentC0983Wv r22 = (FragmentC0983Wv) r2.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
        r22.f3093a = this.this$0.f3972h;
        return;
    }

    @Override // p000.AbstractC0323Hf, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity r4) {
        ProcessLifecycleOwner r42 = this.this$0;
        int r0 = r42.f3966b - 1;
        r42.f3966b = r0;
        if (r0 != 0) goto L6;
        r42.f3969e.postDelayed(r42.f3971g, 700);
        return;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity r2, Bundle r3) {
        AbstractC2774yu.m5346a(r2, new a(this.this$0));
    }

    @Override // p000.AbstractC0323Hf, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity r3) {
        ProcessLifecycleOwner r32 = this.this$0;
        int r0 = r32.f3965a - 1;
        r32.f3965a = r0;
        if (r0 == 0) goto L5;
        return;
    L5:
        if (r32.f3967c == false) goto L9;
        r32.f3970f.m2276e(EnumC0632On.ON_STOP);
        r32.f3968d = true;
        return;
    }
}
