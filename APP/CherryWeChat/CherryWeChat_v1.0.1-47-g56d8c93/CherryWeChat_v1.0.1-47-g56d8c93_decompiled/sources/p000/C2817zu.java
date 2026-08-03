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

        public a(ProcessLifecycleOwner processLifecycleOwner) {
            this.this$0 = processLifecycleOwner;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            this.this$0.m2167a();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            ProcessLifecycleOwner processLifecycleOwner = this.this$0;
            int i = processLifecycleOwner.f3965a + 1;
            processLifecycleOwner.f3965a = i;
            if (i == 1 && processLifecycleOwner.f3968d) {
                processLifecycleOwner.f3970f.m2276e(EnumC0632On.ON_START);
                processLifecycleOwner.f3968d = false;
            }
        }
    }

    public C2817zu(ProcessLifecycleOwner processLifecycleOwner) {
        this.this$0 = processLifecycleOwner;
    }

    @Override // p000.AbstractC0323Hf, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        if (Build.VERSION.SDK_INT < 29) {
            int i = FragmentC0983Wv.f3092b;
            ((FragmentC0983Wv) activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag")).f3093a = this.this$0.f3972h;
        }
    }

    @Override // p000.AbstractC0323Hf, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        ProcessLifecycleOwner processLifecycleOwner = this.this$0;
        int i = processLifecycleOwner.f3966b - 1;
        processLifecycleOwner.f3966b = i;
        if (i == 0) {
            processLifecycleOwner.f3969e.postDelayed(processLifecycleOwner.f3971g, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        AbstractC2774yu.m5346a(activity, new a(this.this$0));
    }

    @Override // p000.AbstractC0323Hf, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        ProcessLifecycleOwner processLifecycleOwner = this.this$0;
        int i = processLifecycleOwner.f3965a - 1;
        processLifecycleOwner.f3965a = i;
        if (i == 0 && processLifecycleOwner.f3967c) {
            processLifecycleOwner.f3970f.m2276e(EnumC0632On.ON_STOP);
            processLifecycleOwner.f3968d = true;
        }
    }
}
