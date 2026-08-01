package p000;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public class w00 extends Fragment {

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ int f5023b = 0;

    /* JADX INFO: renamed from: a */
    public C0431l0 f5024a;

    /* JADX INFO: renamed from: w00$a */
    public static final class C0839a implements Application.ActivityLifecycleCallbacks {
        public static final v00 Companion = new v00();

        public static final void registerIn(Activity activity) {
            Companion.getClass();
            AbstractC0493mp.m1857g("activity", activity);
            activity.registerActivityLifecycleCallbacks(new C0839a());
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            AbstractC0493mp.m1857g("activity", activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            AbstractC0493mp.m1857g("activity", activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            AbstractC0493mp.m1857g("activity", activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostCreated(Activity activity, Bundle bundle) {
            AbstractC0493mp.m1857g("activity", activity);
            int i = w00.f5023b;
            u00.m2423a(activity, EnumC0494mq.ON_CREATE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            AbstractC0493mp.m1857g("activity", activity);
            int i = w00.f5023b;
            u00.m2423a(activity, EnumC0494mq.ON_RESUME);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            AbstractC0493mp.m1857g("activity", activity);
            int i = w00.f5023b;
            u00.m2423a(activity, EnumC0494mq.ON_START);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreDestroyed(Activity activity) {
            AbstractC0493mp.m1857g("activity", activity);
            int i = w00.f5023b;
            u00.m2423a(activity, EnumC0494mq.ON_DESTROY);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPrePaused(Activity activity) {
            AbstractC0493mp.m1857g("activity", activity);
            int i = w00.f5023b;
            u00.m2423a(activity, EnumC0494mq.ON_PAUSE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreStopped(Activity activity) {
            AbstractC0493mp.m1857g("activity", activity);
            int i = w00.f5023b;
            u00.m2423a(activity, EnumC0494mq.ON_STOP);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            AbstractC0493mp.m1857g("activity", activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            AbstractC0493mp.m1857g("activity", activity);
            AbstractC0493mp.m1857g("bundle", bundle);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            AbstractC0493mp.m1857g("activity", activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            AbstractC0493mp.m1857g("activity", activity);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m2589a(EnumC0494mq enumC0494mq) {
        if (Build.VERSION.SDK_INT < 29) {
            Activity activity = getActivity();
            AbstractC0493mp.m1856f("activity", activity);
            u00.m2423a(activity, enumC0494mq);
        }
    }

    @Override // android.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        m2589a(EnumC0494mq.ON_CREATE);
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        m2589a(EnumC0494mq.ON_DESTROY);
        this.f5024a = null;
    }

    @Override // android.app.Fragment
    public final void onPause() {
        super.onPause();
        m2589a(EnumC0494mq.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        C0431l0 c0431l0 = this.f5024a;
        if (c0431l0 != null) {
            ((C0576oy) c0431l0.f2886b).m2059a();
        }
        m2589a(EnumC0494mq.ON_RESUME);
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        C0431l0 c0431l0 = this.f5024a;
        if (c0431l0 != null) {
            C0576oy c0576oy = (C0576oy) c0431l0.f2886b;
            int i = c0576oy.f3549a + 1;
            c0576oy.f3549a = i;
            if (i == 1 && c0576oy.f3552d) {
                c0576oy.f3554f.m262d(EnumC0494mq.ON_START);
                c0576oy.f3552d = false;
            }
        }
        m2589a(EnumC0494mq.ON_START);
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        m2589a(EnumC0494mq.ON_STOP);
    }
}
