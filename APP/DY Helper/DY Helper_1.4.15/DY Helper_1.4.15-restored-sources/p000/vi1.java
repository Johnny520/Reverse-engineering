package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class vi1 extends p000.AbstractC0303fz {
    final /* synthetic */ p000.wi1 this$0;

    /* JADX INFO: renamed from: vi1$α */
    /* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
    public static final class C0911 extends p000.AbstractC0303fz {
        final /* synthetic */ p000.wi1 this$0;

        public C0911(p000.wi1 r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(android.app.Activity r2) {
                r1 = this;
                r2.getClass()
                wi1 r1 = r1.this$0
                int r2 = r1.f11736
                r0 = 1
                int r2 = r2 + r0
                r1.f11736 = r2
                if (r2 != r0) goto L26
                boolean r2 = r1.f11737
                if (r2 == 0) goto L1c
                jr0 r2 = r1.f11740
                br0 r0 = p000.br0.ON_RESUME
                r2.m2983(r0)
                r2 = 0
                r1.f11737 = r2
                return
            L1c:
                android.os.Handler r2 = r1.f11739
                r2.getClass()
                ν r1 = r1.f11741
                r2.removeCallbacks(r1)
            L26:
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(android.app.Activity r2) {
                r1 = this;
                r2.getClass()
                wi1 r1 = r1.this$0
                int r2 = r1.f11735
                r0 = 1
                int r2 = r2 + r0
                r1.f11735 = r2
                if (r2 != r0) goto L1b
                boolean r2 = r1.f11738
                if (r2 == 0) goto L1b
                jr0 r2 = r1.f11740
                br0 r0 = p000.br0.ON_START
                r2.m2983(r0)
                r2 = 0
                r1.f11738 = r2
            L1b:
                return
        }
    }

    public vi1(p000.wi1 r1) {
            r0 = this;
            r0.this$0 = r1
            r0.<init>()
            return
    }

    @Override // p000.AbstractC0303fz, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(android.app.Activity r1, android.os.Bundle r2) {
            r0 = this;
            r1.getClass()
            return
    }

    @Override // p000.AbstractC0303fz, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(android.app.Activity r3) {
            r2 = this;
            r3.getClass()
            wi1 r2 = r2.this$0
            int r3 = r2.f11736
            int r3 = r3 + (-1)
            r2.f11736 = r3
            if (r3 != 0) goto L19
            android.os.Handler r3 = r2.f11739
            r3.getClass()
            ν r2 = r2.f11741
            r0 = 700(0x2bc, double:3.46E-321)
            r3.postDelayed(r2, r0)
        L19:
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(android.app.Activity r1, android.os.Bundle r2) {
            r0 = this;
            r1.getClass()
            vi1$α r2 = new vi1$α
            wi1 r0 = r0.this$0
            r2.<init>(r0)
            r1.registerActivityLifecycleCallbacks(r2)
            return
    }

    @Override // p000.AbstractC0303fz, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(android.app.Activity r2) {
            r1 = this;
            r2.getClass()
            wi1 r1 = r1.this$0
            int r2 = r1.f11735
            int r2 = r2 + (-1)
            r1.f11735 = r2
            if (r2 != 0) goto L1b
            boolean r2 = r1.f11737
            if (r2 == 0) goto L1b
            jr0 r2 = r1.f11740
            br0 r0 = p000.br0.ON_STOP
            r2.m2983(r0)
            r2 = 1
            r1.f11738 = r2
        L1b:
            return
    }
}
