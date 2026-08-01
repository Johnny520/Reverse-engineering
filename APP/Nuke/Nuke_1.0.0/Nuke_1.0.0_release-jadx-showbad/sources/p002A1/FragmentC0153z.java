package p002A1;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import p117X2.AbstractC1665j;

/* JADX INFO: renamed from: A1.z */
/* JADX INFO: loaded from: classes.dex */
public class FragmentC0153z extends Fragment {

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ int f550d = 0;

    /* JADX INFO: renamed from: A1.z$a */
    public static final class a implements Application.ActivityLifecycleCallbacks {
        public static final C0152y Companion = new C0152y();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public static final void registerIn(Activity activity) {
            Companion.getClass();
            AbstractC1665j.m2985e(activity, "activity");
            activity.registerActivityLifecycleCallbacks(new a());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            AbstractC1665j.m2985e(activity, "activity");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            AbstractC1665j.m2985e(activity, "activity");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            AbstractC1665j.m2985e(activity, "activity");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostCreated(Activity activity, Bundle bundle) {
            AbstractC1665j.m2985e(activity, "activity");
            int i5 = FragmentC0153z.f550d;
            AbstractC0150w.m194a(activity, EnumC0140m.ON_CREATE);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            AbstractC1665j.m2985e(activity, "activity");
            int i5 = FragmentC0153z.f550d;
            AbstractC0150w.m194a(activity, EnumC0140m.ON_RESUME);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            AbstractC1665j.m2985e(activity, "activity");
            int i5 = FragmentC0153z.f550d;
            AbstractC0150w.m194a(activity, EnumC0140m.ON_START);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreDestroyed(Activity activity) {
            AbstractC1665j.m2985e(activity, "activity");
            int i5 = FragmentC0153z.f550d;
            AbstractC0150w.m194a(activity, EnumC0140m.ON_DESTROY);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPrePaused(Activity activity) {
            AbstractC1665j.m2985e(activity, "activity");
            int i5 = FragmentC0153z.f550d;
            AbstractC0150w.m194a(activity, EnumC0140m.ON_PAUSE);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreStopped(Activity activity) {
            AbstractC1665j.m2985e(activity, "activity");
            int i5 = FragmentC0153z.f550d;
            AbstractC0150w.m194a(activity, EnumC0140m.ON_STOP);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            AbstractC1665j.m2985e(activity, "activity");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            AbstractC1665j.m2985e(activity, "activity");
            AbstractC1665j.m2985e(bundle, "bundle");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            AbstractC1665j.m2985e(activity, "activity");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            AbstractC1665j.m2985e(activity, "activity");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m226a(EnumC0140m enumC0140m) {
        if (Build.VERSION.SDK_INT < 29) {
            Activity activity = getActivity();
            AbstractC1665j.m2984d(activity, "getActivity(...)");
            AbstractC0150w.m194a(activity, enumC0140m);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        m226a(EnumC0140m.ON_CREATE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        m226a(EnumC0140m.ON_DESTROY);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Fragment
    public final void onPause() {
        super.onPause();
        m226a(EnumC0140m.ON_PAUSE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        m226a(EnumC0140m.ON_RESUME);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        m226a(EnumC0140m.ON_START);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        m226a(EnumC0140m.ON_STOP);
    }
}
