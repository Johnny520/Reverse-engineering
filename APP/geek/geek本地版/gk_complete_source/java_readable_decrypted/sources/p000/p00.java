package p000;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public class p00 extends Fragment {

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ int f3627b = 0;

    /* JADX INFO: renamed from: a */
    public C0431l0 f3628a;

    /* JADX INFO: renamed from: p00$a */
    public static final class C0580a implements Application.ActivityLifecycleCallbacks {
        public static final o00 Companion = new o00();

        public static final void registerIn(Activity activity) {
            Companion.getClass();
            AbstractC0346ip.m1503o("activity", activity);
            activity.registerActivityLifecycleCallbacks(new C0580a());
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            AbstractC0346ip.m1503o("activity", activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            AbstractC0346ip.m1503o("activity", activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            AbstractC0346ip.m1503o("activity", activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostCreated(Activity activity, Bundle bundle) {
            AbstractC0346ip.m1503o("activity", activity);
            int i = p00.f3627b;
            n00.m1880a(activity, EnumC0347iq.ON_CREATE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            AbstractC0346ip.m1503o("activity", activity);
            int i = p00.f3627b;
            n00.m1880a(activity, EnumC0347iq.ON_RESUME);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            AbstractC0346ip.m1503o("activity", activity);
            int i = p00.f3627b;
            n00.m1880a(activity, EnumC0347iq.ON_START);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreDestroyed(Activity activity) {
            AbstractC0346ip.m1503o("activity", activity);
            int i = p00.f3627b;
            n00.m1880a(activity, EnumC0347iq.ON_DESTROY);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPrePaused(Activity activity) {
            AbstractC0346ip.m1503o("activity", activity);
            int i = p00.f3627b;
            n00.m1880a(activity, EnumC0347iq.ON_PAUSE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreStopped(Activity activity) {
            AbstractC0346ip.m1503o("activity", activity);
            int i = p00.f3627b;
            n00.m1880a(activity, EnumC0347iq.ON_STOP);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            AbstractC0346ip.m1503o("activity", activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            AbstractC0346ip.m1503o("activity", activity);
            AbstractC0346ip.m1503o("bundle", bundle);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            AbstractC0346ip.m1503o("activity", activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            AbstractC0346ip.m1503o("activity", activity);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m2030a(EnumC0347iq enumC0347iq) {
        if (Build.VERSION.SDK_INT < 29) {
            Activity activity = getActivity();
            AbstractC0346ip.m1502n("activity", activity);
            n00.m1880a(activity, enumC0347iq);
        }
    }

    @Override // android.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        m2030a(EnumC0347iq.ON_CREATE);
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        m2030a(EnumC0347iq.ON_DESTROY);
        this.f3628a = null;
    }

    @Override // android.app.Fragment
    public final void onPause() {
        super.onPause();
        m2030a(EnumC0347iq.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        C0431l0 c0431l0 = this.f3628a;
        if (c0431l0 != null) {
            ((C0278gy) c0431l0.f2980b).m1333a();
        }
        m2030a(EnumC0347iq.ON_RESUME);
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        C0431l0 c0431l0 = this.f3628a;
        if (c0431l0 != null) {
            C0278gy c0278gy = (C0278gy) c0431l0.f2980b;
            int i = c0278gy.f2171a + 1;
            c0278gy.f2171a = i;
            if (i == 1 && c0278gy.f2174d) {
                c0278gy.f2176f.m277d(EnumC0347iq.ON_START);
                c0278gy.f2174d = false;
            }
        }
        m2030a(EnumC0347iq.ON_START);
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        m2030a(EnumC0347iq.ON_STOP);
    }
}
