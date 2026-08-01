package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Build;
import android.os.Bundle;
import androidx.lifecycle.AbstractC0668k;
import kotlin.Metadata;
import p024b9.AbstractC1043k;

/* JADX INFO: renamed from: androidx.lifecycle.z */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m16757d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0017\u0018\u0000 \u001c2\u00020\u0001:\u0003\u0018\u0015\u0013B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\u0003J\u000f\u0010\n\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\u0003J\u000f\u0010\u000b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\u0003J\u000f\u0010\f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\u0003J\u000f\u0010\r\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u0003J\u0017\u0010\u0010\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0013\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0013\u0010\u0011J\u0019\u0010\u0014\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0014\u0010\u0011J\u0019\u0010\u0015\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0015\u0010\u0011J\u0017\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, m16758d2 = {"Landroidx/lifecycle/z;", "Landroid/app/Fragment;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Ll8/i0;", "onActivityCreated", "(Landroid/os/Bundle;)V", "onStart", "onResume", "onPause", "onStop", "onDestroy", "Landroidx/lifecycle/z$a;", "processListener", "f", "(Landroidx/lifecycle/z$a;)V", "listener", "b", "d", "c", "Landroidx/lifecycle/k$a;", "event", "a", "(Landroidx/lifecycle/k$a;)V", "q", "Landroidx/lifecycle/z$a;", "r", "lifecycle-runtime_release"}, m16759k = 1, m16760mv = {2, 0, 0}, m16762xi = 48)
public class FragmentC0690z extends Fragment {

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    public a processListener;

    /* JADX INFO: renamed from: androidx.lifecycle.z$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo2702a();

        /* JADX INFO: renamed from: b */
        void mo2703b();

        /* JADX INFO: renamed from: c */
        void mo2704c();
    }

    /* JADX INFO: renamed from: e */
    public static final void m2705e(Activity activity) {
        INSTANCE.m2713c(activity);
    }

    /* JADX INFO: renamed from: a */
    public final void m2706a(AbstractC0668k.a event) {
        if (Build.VERSION.SDK_INT < 29) {
            Companion companion = INSTANCE;
            Activity activity = getActivity();
            activity.getClass();
            companion.m2711a(activity, event);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m2707b(a listener) {
        if (listener != null) {
            listener.mo2702a();
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m2708c(a listener) {
        if (listener != null) {
            listener.mo2703b();
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m2709d(a listener) {
        if (listener != null) {
            listener.mo2704c();
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m2710f(a processListener) {
        this.processListener = processListener;
    }

    @Override // android.app.Fragment
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        m2707b(this.processListener);
        m2706a(AbstractC0668k.a.ON_CREATE);
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        m2706a(AbstractC0668k.a.ON_DESTROY);
        this.processListener = null;
    }

    @Override // android.app.Fragment
    public void onPause() {
        super.onPause();
        m2706a(AbstractC0668k.a.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public void onResume() {
        super.onResume();
        m2708c(this.processListener);
        m2706a(AbstractC0668k.a.ON_RESUME);
    }

    @Override // android.app.Fragment
    public void onStart() {
        super.onStart();
        m2709d(this.processListener);
        m2706a(AbstractC0668k.a.ON_START);
    }

    @Override // android.app.Fragment
    public void onStop() {
        super.onStop();
        m2706a(AbstractC0668k.a.ON_STOP);
    }

    /* JADX INFO: renamed from: androidx.lifecycle.z$c */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class c implements Application.ActivityLifecycleCallbacks {
        public static final a Companion = new a(null);

        public static final void registerIn(Activity activity) {
            Companion.m2714a(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            activity.getClass();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            activity.getClass();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            activity.getClass();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostCreated(Activity activity, Bundle bundle) {
            activity.getClass();
            FragmentC0690z.INSTANCE.m2711a(activity, AbstractC0668k.a.ON_CREATE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            activity.getClass();
            FragmentC0690z.INSTANCE.m2711a(activity, AbstractC0668k.a.ON_RESUME);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            activity.getClass();
            FragmentC0690z.INSTANCE.m2711a(activity, AbstractC0668k.a.ON_START);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreDestroyed(Activity activity) {
            activity.getClass();
            FragmentC0690z.INSTANCE.m2711a(activity, AbstractC0668k.a.ON_DESTROY);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPrePaused(Activity activity) {
            activity.getClass();
            FragmentC0690z.INSTANCE.m2711a(activity, AbstractC0668k.a.ON_PAUSE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreStopped(Activity activity) {
            activity.getClass();
            FragmentC0690z.INSTANCE.m2711a(activity, AbstractC0668k.a.ON_STOP);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            activity.getClass();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            activity.getClass();
            bundle.getClass();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            activity.getClass();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            activity.getClass();
        }

        /* JADX INFO: renamed from: androidx.lifecycle.z$c$a */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public static final class a {
            public /* synthetic */ a(AbstractC1043k abstractC1043k) {
                this();
            }

            /* JADX INFO: renamed from: a */
            public final void m2714a(Activity activity) {
                activity.getClass();
                activity.registerActivityLifecycleCallbacks(new c());
            }

            public a() {
            }
        }
    }

    /* JADX INFO: renamed from: androidx.lifecycle.z$b, reason: from kotlin metadata */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: a */
        public final void m2711a(Activity activity, AbstractC0668k.a aVar) {
            activity.getClass();
            aVar.getClass();
            if (activity instanceof InterfaceC0676o) {
                AbstractC0668k lifecycle = ((InterfaceC0676o) activity).getLifecycle();
                if (lifecycle instanceof C0680q) {
                    ((C0680q) lifecycle).m2667h(aVar);
                }
            }
        }

        /* JADX INFO: renamed from: b */
        public final FragmentC0690z m2712b(Activity activity) {
            activity.getClass();
            Fragment fragmentFindFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            fragmentFindFragmentByTag.getClass();
            return (FragmentC0690z) fragmentFindFragmentByTag;
        }

        /* JADX INFO: renamed from: c */
        public final void m2713c(Activity activity) {
            activity.getClass();
            if (Build.VERSION.SDK_INT >= 29) {
                c.Companion.m2714a(activity);
            }
            FragmentManager fragmentManager = activity.getFragmentManager();
            if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
                fragmentManager.beginTransaction().add(new FragmentC0690z(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
                fragmentManager.executePendingTransactions();
            }
        }

        public Companion() {
        }
    }
}
