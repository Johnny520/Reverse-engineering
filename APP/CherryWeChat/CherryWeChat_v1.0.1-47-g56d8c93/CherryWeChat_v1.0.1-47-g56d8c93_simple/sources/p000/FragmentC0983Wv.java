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
        public static final C0940Vv Companion = null;

        static {
            Companion = new C0940Vv();
        }

        public a() {
        }

        public static final void registerIn(Activity r1) {
            Companion.getClass();
            AbstractC0688Q.m1410n(r1, new a());
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity r1, Bundle r2) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity r1) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity r1) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostCreated(Activity r1, Bundle r2) {
            int r22 = FragmentC0983Wv.f3092b;
            AbstractC0897Uv.m1750a(r1, EnumC0632On.ON_CREATE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity r2) {
            int r0 = FragmentC0983Wv.f3092b;
            AbstractC0897Uv.m1750a(r2, EnumC0632On.ON_RESUME);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity r2) {
            int r0 = FragmentC0983Wv.f3092b;
            AbstractC0897Uv.m1750a(r2, EnumC0632On.ON_START);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreDestroyed(Activity r2) {
            int r0 = FragmentC0983Wv.f3092b;
            AbstractC0897Uv.m1750a(r2, EnumC0632On.ON_DESTROY);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPrePaused(Activity r2) {
            int r0 = FragmentC0983Wv.f3092b;
            AbstractC0897Uv.m1750a(r2, EnumC0632On.ON_PAUSE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreStopped(Activity r2) {
            int r0 = FragmentC0983Wv.f3092b;
            AbstractC0897Uv.m1750a(r2, EnumC0632On.ON_STOP);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity r1) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity r1, Bundle r2) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity r1) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity r1) {
        }
    }

    public FragmentC0983Wv() {
    }

    /* JADX INFO: renamed from: a */
    public final void m1861a(EnumC0632On r3) {
        if (Build.VERSION.SDK_INT >= 29) goto L6;
        AbstractC0897Uv.m1750a(getActivity(), r3);
        return;
    }

    @Override // android.app.Fragment
    public final void onActivityCreated(Bundle r1) {
        super.onActivityCreated(r1);
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
        C1017Xm r0 = this.f3093a;
        if (r0 == null) goto L5;
        ((ProcessLifecycleOwner) r0.f3226b).m2167a();
    L5:
        m1861a(EnumC0632On.ON_RESUME);
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        C1017Xm r0 = this.f3093a;
        if (r0 == null) goto L9;
        ProcessLifecycleOwner r02 = (ProcessLifecycleOwner) r0.f3226b;
        int r1 = r02.f3965a + 1;
        r02.f3965a = r1;
        if (r1 != 1) goto L9;
        if (r02.f3968d == false) goto L9;
        r02.f3970f.m2276e(EnumC0632On.ON_START);
        r02.f3968d = false;
    L9:
        m1861a(EnumC0632On.ON_START);
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        m1861a(EnumC0632On.ON_STOP);
    }
}
