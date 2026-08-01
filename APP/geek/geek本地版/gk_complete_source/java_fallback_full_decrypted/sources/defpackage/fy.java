package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class fy extends defpackage.vi {
    final /* synthetic */ defpackage.gy this$0;

    public static final class a extends defpackage.vi {
        final /* synthetic */ defpackage.gy this$0;

        public a(defpackage.gy r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(android.app.Activity r2) {
                r1 = this;
                java.lang.String r0 = "activity"
                defpackage.ip.o(r0, r2)
                gy r2 = r1.this$0
                r2.a()
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(android.app.Activity r3) {
                r2 = this;
                java.lang.String r0 = "activity"
                defpackage.ip.o(r0, r3)
                gy r3 = r2.this$0
                int r0 = r3.a
                r1 = 1
                int r0 = r0 + r1
                r3.a = r0
                if (r0 != r1) goto L1d
                boolean r0 = r3.d
                if (r0 == 0) goto L1d
                androidx.lifecycle.a r0 = r3.f
                iq r1 = defpackage.iq.ON_START
                r0.d(r1)
                r0 = 0
                r3.d = r0
            L1d:
                return
        }
    }

    public fy(defpackage.gy r1) {
            r0 = this;
            r0.this$0 = r1
            r0.<init>()
            return
    }

    @Override // defpackage.vi, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(android.app.Activity r2, android.os.Bundle r3) {
            r1 = this;
            java.lang.String r3 = "activity"
            defpackage.ip.o(r3, r2)
            int r3 = android.os.Build.VERSION.SDK_INT
            r0 = 29
            if (r3 >= r0) goto L24
            int r3 = defpackage.p00.b
            android.app.FragmentManager r2 = r2.getFragmentManager()
            java.lang.String r3 = "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag"
            android.app.Fragment r2 = r2.findFragmentByTag(r3)
            java.lang.String r3 = "null cannot be cast to non-null type androidx.lifecycle.ReportFragment"
            defpackage.ip.m(r3, r2)
            p00 r2 = (defpackage.p00) r2
            gy r3 = r1.this$0
            l0 r3 = r3.h
            r2.a = r3
        L24:
            return
    }

    @Override // defpackage.vi, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(android.app.Activity r4) {
            r3 = this;
            java.lang.String r0 = "activity"
            defpackage.ip.o(r0, r4)
            gy r4 = r3.this$0
            int r0 = r4.b
            int r0 = r0 + (-1)
            r4.b = r0
            if (r0 != 0) goto L1b
            android.os.Handler r0 = r4.e
            defpackage.ip.l(r0)
            p1 r4 = r4.g
            r1 = 700(0x2bc, double:3.46E-321)
            r0.postDelayed(r4, r1)
        L1b:
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(android.app.Activity r2, android.os.Bundle r3) {
            r1 = this;
            java.lang.String r3 = "activity"
            defpackage.ip.o(r3, r2)
            fy$a r3 = new fy$a
            gy r0 = r1.this$0
            r3.<init>(r0)
            defpackage.ey.a(r2, r3)
            return
    }

    @Override // defpackage.vi, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(android.app.Activity r3) {
            r2 = this;
            java.lang.String r0 = "activity"
            defpackage.ip.o(r0, r3)
            gy r3 = r2.this$0
            int r0 = r3.a
            int r0 = r0 + (-1)
            r3.a = r0
            if (r0 != 0) goto L1d
            boolean r0 = r3.c
            if (r0 == 0) goto L1d
            androidx.lifecycle.a r0 = r3.f
            iq r1 = defpackage.iq.ON_STOP
            r0.d(r1)
            r0 = 1
            r3.d = r0
        L1d:
            return
    }
}
