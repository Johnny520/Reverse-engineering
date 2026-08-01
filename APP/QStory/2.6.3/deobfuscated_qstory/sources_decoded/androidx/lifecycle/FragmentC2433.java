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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0017\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, d2 = {"Landroidx/lifecycle/飘花落叶言子苏楪兰哲世;", "Landroid/app/Fragment;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "androidx/lifecycle/飘花落叶言子苏兰楪世哲", "飘花落叶言子楪世苏哲兰", "androidx/lifecycle/飘花落叶言子苏楪哲兰世", "lifecycle-runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class FragmentC2433 extends Fragment {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final /* synthetic */ int f7096 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public C2422 f7097;

    /* JADX INFO: renamed from: androidx.lifecycle.飘花落叶言子苏楪兰哲世$飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static final class C2434 implements Application.ActivityLifecycleCallbacks {
        public static final C2432 Companion = new C2432();

        public static final void registerIn(Activity activity) {
            Companion.getClass();
            activity.getClass();
            activity.registerActivityLifecycleCallbacks(new C2434());
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
            int i = FragmentC2433.f7096;
            AbstractC2436.m4537(activity, Lifecycle$Event.ON_CREATE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            activity.getClass();
            int i = FragmentC2433.f7096;
            AbstractC2436.m4537(activity, Lifecycle$Event.ON_RESUME);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            activity.getClass();
            int i = FragmentC2433.f7096;
            AbstractC2436.m4537(activity, Lifecycle$Event.ON_START);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreDestroyed(Activity activity) {
            activity.getClass();
            int i = FragmentC2433.f7096;
            AbstractC2436.m4537(activity, Lifecycle$Event.ON_DESTROY);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPrePaused(Activity activity) {
            activity.getClass();
            int i = FragmentC2433.f7096;
            AbstractC2436.m4537(activity, Lifecycle$Event.ON_PAUSE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreStopped(Activity activity) {
            activity.getClass();
            int i = FragmentC2433.f7096;
            AbstractC2436.m4537(activity, Lifecycle$Event.ON_STOP);
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
        m4527(Lifecycle$Event.ON_CREATE);
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        m4527(Lifecycle$Event.ON_DESTROY);
        this.f7097 = null;
    }

    @Override // android.app.Fragment
    public final void onPause() {
        super.onPause();
        m4527(Lifecycle$Event.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        C2422 c2422 = this.f7097;
        if (c2422 != null) {
            ((C2431) c2422.f7066).m4526();
        }
        m4527(Lifecycle$Event.ON_RESUME);
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        C2422 c2422 = this.f7097;
        if (c2422 != null) {
            C2431 c2431 = (C2431) c2422.f7066;
            int i = c2431.f7095 + 1;
            c2431.f7095 = i;
            if (i == 1 && c2431.f7089) {
                c2431.f7091.m4499(Lifecycle$Event.ON_START);
                c2431.f7089 = false;
            }
        }
        m4527(Lifecycle$Event.ON_START);
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        m4527(Lifecycle$Event.ON_STOP);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m4527(Lifecycle$Event lifecycle$Event) {
        if (Build.VERSION.SDK_INT < 29) {
            Activity activity = getActivity();
            activity.getClass();
            AbstractC2436.m4537(activity, lifecycle$Event);
        }
    }
}
