package defpackage;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public class p00 extends Fragment {
    public static final /* synthetic */ int b = 0;
    public l0 a;

    public static final class a implements Application.ActivityLifecycleCallbacks {
        public static final o00 Companion = null;

        static {
            Companion = new o00();
        }

        public a() {
        }

        public static final void registerIn(Activity r1) {
            Companion.getClass();
            ip.o("activity", r1);
            f0.i(r1, new a());
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity r1, Bundle r2) {
            ip.o("activity", r1);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity r2) {
            ip.o("activity", r2);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity r2) {
            ip.o("activity", r2);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostCreated(Activity r1, Bundle r2) {
            ip.o("activity", r1);
            int r22 = p00.b;
            n00.a(r1, iq.ON_CREATE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity r2) {
            ip.o("activity", r2);
            int r0 = p00.b;
            n00.a(r2, iq.ON_RESUME);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity r2) {
            ip.o("activity", r2);
            int r0 = p00.b;
            n00.a(r2, iq.ON_START);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreDestroyed(Activity r2) {
            ip.o("activity", r2);
            int r0 = p00.b;
            n00.a(r2, iq.ON_DESTROY);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPrePaused(Activity r2) {
            ip.o("activity", r2);
            int r0 = p00.b;
            n00.a(r2, iq.ON_PAUSE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreStopped(Activity r2) {
            ip.o("activity", r2);
            int r0 = p00.b;
            n00.a(r2, iq.ON_STOP);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity r2) {
            ip.o("activity", r2);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity r2, Bundle r3) {
            ip.o("activity", r2);
            ip.o("bundle", r3);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity r2) {
            ip.o("activity", r2);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity r2) {
            ip.o("activity", r2);
        }
    }

    public p00() {
    }

    public final void a(iq r3) {
        if (Build.VERSION.SDK_INT >= 29) goto L6;
        Activity r0 = getActivity();
        ip.n("activity", r0);
        n00.a(r0, r3);
        return;
    }

    @Override // android.app.Fragment
    public final void onActivityCreated(Bundle r1) {
        super.onActivityCreated(r1);
        a(iq.ON_CREATE);
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        a(iq.ON_DESTROY);
        this.a = null;
    }

    @Override // android.app.Fragment
    public final void onPause() {
        super.onPause();
        a(iq.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        l0 r0 = this.a;
        if (r0 == null) goto L5;
        ((gy) r0.b).a();
    L5:
        a(iq.ON_RESUME);
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        l0 r0 = this.a;
        if (r0 == null) goto L9;
        gy r02 = (gy) r0.b;
        int r1 = r02.a + 1;
        r02.a = r1;
        if (r1 != 1) goto L9;
        if (r02.d == false) goto L9;
        r02.f.d(iq.ON_START);
        r02.d = false;
    L9:
        a(iq.ON_START);
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        a(iq.ON_STOP);
    }
}
