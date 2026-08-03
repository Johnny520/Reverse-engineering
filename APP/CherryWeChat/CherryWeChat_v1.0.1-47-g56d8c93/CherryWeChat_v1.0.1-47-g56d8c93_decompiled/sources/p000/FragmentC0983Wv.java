package p000;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import androidx.lifecycle.ProcessLifecycleOwner;

/* JADX INFO: renamed from: Wv */
/* JADX INFO: loaded from: classes.dex */
public class FragmentC0983Wv extends Fragment {

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ int f3092b = 0;

    /* JADX INFO: renamed from: a */
    public C1017Xm f3093a;

    /* JADX INFO: renamed from: Wv$a */
    public static final class a implements Application.ActivityLifecycleCallbacks {
        public static final C0940Vv Companion = new C0940Vv();

        public static final void registerIn(Activity activity) {
            Companion.getClass();
            activity.registerActivityLifecycleCallbacks(new a());
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostCreated(Activity activity, Bundle bundle) {
            int i = FragmentC0983Wv.f3092b;
            AbstractC0897Uv.m1750a(activity, EnumC0632On.ON_CREATE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            int i = FragmentC0983Wv.f3092b;
            AbstractC0897Uv.m1750a(activity, EnumC0632On.ON_RESUME);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            int i = FragmentC0983Wv.f3092b;
            AbstractC0897Uv.m1750a(activity, EnumC0632On.ON_START);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreDestroyed(Activity activity) {
            int i = FragmentC0983Wv.f3092b;
            AbstractC0897Uv.m1750a(activity, EnumC0632On.ON_DESTROY);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPrePaused(Activity activity) {
            int i = FragmentC0983Wv.f3092b;
            AbstractC0897Uv.m1750a(activity, EnumC0632On.ON_PAUSE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreStopped(Activity activity) {
            int i = FragmentC0983Wv.f3092b;
            AbstractC0897Uv.m1750a(activity, EnumC0632On.ON_STOP);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m1861a(EnumC0632On enumC0632On) {
        if (Build.VERSION.SDK_INT < 29) {
            AbstractC0897Uv.m1750a(getActivity(), enumC0632On);
        }
    }

    @Override // android.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        m1861a(EnumC0632On.ON_CREATE);
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        m1861a(EnumC0632On.ON_DESTROY);
        this.f3093a = null;
    }

    @Override // android.app.Fragment
    public final void onPause() {
        super.onPause();
        m1861a(EnumC0632On.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        C1017Xm c1017Xm = this.f3093a;
        if (c1017Xm != null) {
            ((ProcessLifecycleOwner) c1017Xm.f3226b).m2167a();
        }
        m1861a(EnumC0632On.ON_RESUME);
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        C1017Xm c1017Xm = this.f3093a;
        if (c1017Xm != null) {
            ProcessLifecycleOwner processLifecycleOwner = (ProcessLifecycleOwner) c1017Xm.f3226b;
            int i = processLifecycleOwner.f3965a + 1;
            processLifecycleOwner.f3965a = i;
            if (i == 1 && processLifecycleOwner.f3968d) {
                processLifecycleOwner.f3970f.m2276e(EnumC0632On.ON_START);
                processLifecycleOwner.f3968d = false;
            }
        }
        m1861a(EnumC0632On.ON_START);
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        m1861a(EnumC0632On.ON_STOP);
    }
}
