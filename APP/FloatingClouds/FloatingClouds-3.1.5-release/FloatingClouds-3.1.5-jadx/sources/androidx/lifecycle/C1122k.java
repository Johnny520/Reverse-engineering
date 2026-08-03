package androidx.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import androidx.lifecycle.AbstractC1116e;
import androidx.lifecycle.C1121j;
import kotlin.Metadata;
import p000a.C0385V5;
import p000a.C0631i9;

/* JADX INFO: renamed from: androidx.lifecycle.k */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m3302d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\n\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0017¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\u000b¨\u0006\r"}, m3303d2 = {"Landroidx/lifecycle/k;", "La/V5;", "Landroid/app/Activity;", "activity", "Landroid/os/Bundle;", "savedInstanceState", "La/Wf;", "onActivityPreCreated", "(Landroid/app/Activity;Landroid/os/Bundle;)V", "onActivityCreated", "onActivityPaused", "(Landroid/app/Activity;)V", "onActivityStopped", "lifecycle-process_release"}, m3304k = 1, m3305mv = {1, 8, 0}, m3307xi = 48)
public final class C1122k extends C0385V5 {
    final /* synthetic */ C1121j this$0;

    /* JADX INFO: renamed from: androidx.lifecycle.k$a */
    @Metadata(m3302d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, m3303d2 = {"androidx/lifecycle/k$a", "La/V5;", "Landroid/app/Activity;", "activity", "La/Wf;", "onActivityPostStarted", "(Landroid/app/Activity;)V", "onActivityPostResumed", "lifecycle-process_release"}, m3304k = 1, m3305mv = {1, 8, 0}, m3307xi = 48)
    public static final class a extends C0385V5 {
        final /* synthetic */ C1121j this$0;

        public a(C1121j c1121j) {
            this.this$0 = c1121j;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            C0631i9.m1482e(activity, "activity");
            this.this$0.m2603a();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            C0631i9.m1482e(activity, "activity");
            C1121j c1121j = this.this$0;
            int i = c1121j.f4690a + 1;
            c1121j.f4690a = i;
            if (i == 1 && c1121j.f4693d) {
                c1121j.f4695f.m2598f(AbstractC1116e.a.ON_START);
                c1121j.f4693d = false;
            }
        }
    }

    public C1122k(C1121j c1121j) {
        this.this$0 = c1121j;
    }

    @Override // p000a.C0385V5, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle savedInstanceState) {
        C0631i9.m1482e(activity, "activity");
        if (Build.VERSION.SDK_INT < 29) {
            int i = FragmentC1124l.f4699b;
            Fragment fragmentFindFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            C0631i9.m1480c(fragmentFindFragmentByTag, "null cannot be cast to non-null type androidx.lifecycle.ReportFragment");
            ((FragmentC1124l) fragmentFindFragmentByTag).f4700a = this.this$0.f4697h;
        }
    }

    @Override // p000a.C0385V5, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        C0631i9.m1482e(activity, "activity");
        C1121j c1121j = this.this$0;
        int i = c1121j.f4691b - 1;
        c1121j.f4691b = i;
        if (i == 0) {
            Handler handler = c1121j.f4694e;
            C0631i9.m1479b(handler);
            handler.postDelayed(c1121j.f4696g, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle savedInstanceState) {
        C0631i9.m1482e(activity, "activity");
        C1121j.a.m2604a(activity, new a(this.this$0));
    }

    @Override // p000a.C0385V5, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        C0631i9.m1482e(activity, "activity");
        C1121j c1121j = this.this$0;
        int i = c1121j.f4690a - 1;
        c1121j.f4690a = i;
        if (i == 0 && c1121j.f4692c) {
            c1121j.f4695f.m2598f(AbstractC1116e.a.ON_STOP);
            c1121j.f4693d = true;
        }
    }
}
