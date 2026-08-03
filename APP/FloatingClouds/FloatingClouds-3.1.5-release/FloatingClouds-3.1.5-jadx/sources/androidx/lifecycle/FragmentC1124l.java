package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Build;
import android.os.Bundle;
import androidx.lifecycle.AbstractC1116e;
import androidx.lifecycle.C1121j;
import kotlin.Metadata;
import p000a.C0631i9;
import p000a.InterfaceC0935y9;
import p000a.InterfaceC0954z9;

/* JADX INFO: renamed from: androidx.lifecycle.l */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m3302d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0017\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, m3303d2 = {"Landroidx/lifecycle/l;", "Landroid/app/Fragment;", "<init>", "()V", "a", "b", "lifecycle-runtime_release"}, m3304k = 1, m3305mv = {1, 8, 0}, m3307xi = 48)
public class FragmentC1124l extends Fragment {

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ int f4699b = 0;

    /* JADX INFO: renamed from: a */
    public C1121j.b f4700a;

    /* JADX INFO: renamed from: androidx.lifecycle.l$a */
    public static final class a {
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: android.app.Activity */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: a */
        public static void m2606a(Activity activity, AbstractC1116e.a aVar) {
            C0631i9.m1482e(aVar, "event");
            if (activity instanceof InterfaceC0954z9) {
                ((InterfaceC0954z9) activity).getLifecycle().m2598f(aVar);
            } else if (activity instanceof InterfaceC0935y9) {
                AbstractC1116e lifecycle = ((InterfaceC0935y9) activity).getLifecycle();
                if (lifecycle instanceof C1119h) {
                    ((C1119h) lifecycle).m2598f(aVar);
                }
            }
        }

        /* JADX INFO: renamed from: b */
        public static void m2607b(Activity activity) {
            if (Build.VERSION.SDK_INT >= 29) {
                b.INSTANCE.getClass();
                activity.registerActivityLifecycleCallbacks(new b());
            }
            FragmentManager fragmentManager = activity.getFragmentManager();
            if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
                fragmentManager.beginTransaction().add(new FragmentC1124l(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
                fragmentManager.executePendingTransactions();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.lifecycle.l$b */
    @Metadata(m3302d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0001\u0018\u0000 \u00192\u00020\u0001:\u0001\u001aB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ!\u0010\f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\f\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0011\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0012\u0010\u000eJ\u0017\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0013\u0010\u000eJ\u0017\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0014\u0010\u000eJ\u0017\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0015\u0010\u000eJ\u001f\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0016\u0010\nJ\u0017\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0017\u0010\u000eJ\u0017\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0018\u0010\u000e¨\u0006\u001b"}, m3303d2 = {"Landroidx/lifecycle/l$b;", "Landroid/app/Application$ActivityLifecycleCallbacks;", "<init>", "()V", "Landroid/app/Activity;", "activity", "Landroid/os/Bundle;", "bundle", "La/Wf;", "onActivityCreated", "(Landroid/app/Activity;Landroid/os/Bundle;)V", "savedInstanceState", "onActivityPostCreated", "onActivityStarted", "(Landroid/app/Activity;)V", "onActivityPostStarted", "onActivityResumed", "onActivityPostResumed", "onActivityPrePaused", "onActivityPaused", "onActivityPreStopped", "onActivityStopped", "onActivitySaveInstanceState", "onActivityPreDestroyed", "onActivityDestroyed", "Companion", "a", "lifecycle-runtime_release"}, m3304k = 1, m3305mv = {1, 8, 0}, m3307xi = 48)
    public static final class b implements Application.ActivityLifecycleCallbacks {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();

        /* JADX INFO: renamed from: androidx.lifecycle.l$b$a, reason: from kotlin metadata */
        public static final class Companion {
        }

        public static final void registerIn(Activity activity) {
            INSTANCE.getClass();
            C0631i9.m1482e(activity, "activity");
            activity.registerActivityLifecycleCallbacks(new b());
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            C0631i9.m1482e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            C0631i9.m1482e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            C0631i9.m1482e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostCreated(Activity activity, Bundle savedInstanceState) {
            C0631i9.m1482e(activity, "activity");
            int i = FragmentC1124l.f4699b;
            a.m2606a(activity, AbstractC1116e.a.ON_CREATE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            C0631i9.m1482e(activity, "activity");
            int i = FragmentC1124l.f4699b;
            a.m2606a(activity, AbstractC1116e.a.ON_RESUME);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            C0631i9.m1482e(activity, "activity");
            int i = FragmentC1124l.f4699b;
            a.m2606a(activity, AbstractC1116e.a.ON_START);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreDestroyed(Activity activity) {
            C0631i9.m1482e(activity, "activity");
            int i = FragmentC1124l.f4699b;
            a.m2606a(activity, AbstractC1116e.a.ON_DESTROY);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPrePaused(Activity activity) {
            C0631i9.m1482e(activity, "activity");
            int i = FragmentC1124l.f4699b;
            a.m2606a(activity, AbstractC1116e.a.ON_PAUSE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreStopped(Activity activity) {
            C0631i9.m1482e(activity, "activity");
            int i = FragmentC1124l.f4699b;
            a.m2606a(activity, AbstractC1116e.a.ON_STOP);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            C0631i9.m1482e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            C0631i9.m1482e(activity, "activity");
            C0631i9.m1482e(bundle, "bundle");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            C0631i9.m1482e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            C0631i9.m1482e(activity, "activity");
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m2605a(AbstractC1116e.a aVar) {
        if (Build.VERSION.SDK_INT < 29) {
            Activity activity = getActivity();
            C0631i9.m1481d(activity, "activity");
            a.m2606a(activity, aVar);
        }
    }

    @Override // android.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        m2605a(AbstractC1116e.a.ON_CREATE);
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        m2605a(AbstractC1116e.a.ON_DESTROY);
        this.f4700a = null;
    }

    @Override // android.app.Fragment
    public final void onPause() {
        super.onPause();
        m2605a(AbstractC1116e.a.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        C1121j.b bVar = this.f4700a;
        if (bVar != null) {
            C1121j.this.m2603a();
        }
        m2605a(AbstractC1116e.a.ON_RESUME);
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        C1121j.b bVar = this.f4700a;
        if (bVar != null) {
            C1121j c1121j = C1121j.this;
            int i = c1121j.f4690a + 1;
            c1121j.f4690a = i;
            if (i == 1 && c1121j.f4693d) {
                c1121j.f4695f.m2598f(AbstractC1116e.a.ON_START);
                c1121j.f4693d = false;
            }
        }
        m2605a(AbstractC1116e.a.ON_START);
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        m2605a(AbstractC1116e.a.ON_STOP);
    }
}
