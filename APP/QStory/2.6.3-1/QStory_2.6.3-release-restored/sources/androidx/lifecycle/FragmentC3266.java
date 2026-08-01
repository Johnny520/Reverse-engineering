package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import kotlin.Metadata;
import net.bytebuddy.description.method.MethodDescription;

/* JADX INFO: renamed from: androidx.lifecycle.飘花落叶言子苏楪兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0017\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, m151d2 = {"Landroidx/lifecycle/飘花落叶言子苏楪兰哲世;", "Landroid/app/Fragment;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "androidx/lifecycle/飘花落叶言子苏兰楪世哲", "飘花落叶言子楪世苏哲兰", "androidx/lifecycle/飘花落叶言子苏楪哲兰世", "lifecycle-runtime"}, m152k = 1, m153mv = {2, 0, 0}, m155xi = 48)
public class FragmentC3266 extends Fragment {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final /* synthetic */ int f7441 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public C3255 f7442;

    /* JADX INFO: renamed from: androidx.lifecycle.飘花落叶言子苏楪兰哲世$飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static final class C3267 implements Application.ActivityLifecycleCallbacks {
        public static final C3265 Companion = new C3265();

        public static final void registerIn(Activity activity) {
            Companion.getClass();
            activity.getClass();
            activity.registerActivityLifecycleCallbacks(new C3267());
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
            int i = FragmentC3266.f7441;
            AbstractC3269.m5097(activity, Lifecycle$Event.ON_CREATE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            activity.getClass();
            int i = FragmentC3266.f7441;
            AbstractC3269.m5097(activity, Lifecycle$Event.ON_RESUME);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            activity.getClass();
            int i = FragmentC3266.f7441;
            AbstractC3269.m5097(activity, Lifecycle$Event.ON_START);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreDestroyed(Activity activity) {
            activity.getClass();
            int i = FragmentC3266.f7441;
            AbstractC3269.m5097(activity, Lifecycle$Event.ON_DESTROY);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPrePaused(Activity activity) {
            activity.getClass();
            int i = FragmentC3266.f7441;
            AbstractC3269.m5097(activity, Lifecycle$Event.ON_PAUSE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreStopped(Activity activity) {
            activity.getClass();
            int i = FragmentC3266.f7441;
            AbstractC3269.m5097(activity, Lifecycle$Event.ON_STOP);
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
    }

    @Override // android.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        m5087(Lifecycle$Event.ON_CREATE);
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        m5087(Lifecycle$Event.ON_DESTROY);
        this.f7442 = null;
    }

    @Override // android.app.Fragment
    public final void onPause() {
        super.onPause();
        m5087(Lifecycle$Event.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        C3255 c3255 = this.f7442;
        if (c3255 != null) {
            ((C3264) c3255.f7411).m5086();
        }
        m5087(Lifecycle$Event.ON_RESUME);
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        C3255 c3255 = this.f7442;
        if (c3255 != null) {
            C3264 c3264 = (C3264) c3255.f7411;
            int i = c3264.f7440 + 1;
            c3264.f7440 = i;
            if (i == 1 && c3264.f7434) {
                c3264.f7436.m5059(Lifecycle$Event.ON_START);
                c3264.f7434 = false;
            }
        }
        m5087(Lifecycle$Event.ON_START);
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        m5087(Lifecycle$Event.ON_STOP);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m5087(Lifecycle$Event lifecycle$Event) {
        if (Build.VERSION.SDK_INT < 29) {
            Activity activity = getActivity();
            activity.getClass();
            AbstractC3269.m5097(activity, lifecycle$Event);
        }
    }
}
