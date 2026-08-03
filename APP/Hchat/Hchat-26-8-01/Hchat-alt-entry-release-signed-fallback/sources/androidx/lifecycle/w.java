package androidx.lifecycle;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class w extends androidx.lifecycle.g {
    final /* synthetic */ androidx.lifecycle.y this$0;

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static final class a extends androidx.lifecycle.g {
        final /* synthetic */ androidx.lifecycle.y this$0;

        public a(androidx.lifecycle.y r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(android.app.Activity r1) {
                r0 = this;
                r1.getClass()
                androidx.lifecycle.y r1 = r0.this$0
                r1.a()
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(android.app.Activity r3) {
                r2 = this;
                r3.getClass()
                androidx.lifecycle.y r3 = r2.this$0
                int r0 = r3.f312g
                r1 = 1
                int r0 = r0 + r1
                r3.f312g = r0
                if (r0 != r1) goto L1b
                boolean r0 = r3.f315j
                if (r0 == 0) goto L1b
                androidx.lifecycle.s r0 = r3.f317l
                androidx.lifecycle.k r1 = androidx.lifecycle.k.ON_START
                r0.d(r1)
                r0 = 0
                r3.f315j = r0
            L1b:
                return
        }
    }

    public w(androidx.lifecycle.y r1) {
            r0 = this;
            r0.this$0 = r1
            r0.<init>()
            return
    }

    @Override // androidx.lifecycle.g, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(android.app.Activity r2, android.os.Bundle r3) {
            r1 = this;
            r2.getClass()
            int r3 = android.os.Build.VERSION.SDK_INT
            r0 = 29
            if (r3 >= r0) goto L20
            int r3 = androidx.lifecycle.c0.f280h
            android.app.FragmentManager r2 = r2.getFragmentManager()
            java.lang.String r3 = "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag"
            android.app.Fragment r2 = r2.findFragmentByTag(r3)
            r2.getClass()
            androidx.lifecycle.c0 r2 = (androidx.lifecycle.c0) r2
            androidx.lifecycle.y r3 = r1.this$0
            androidx.lifecycle.x r3 = r3.f319n
            r2.f281g = r3
        L20:
            return
    }

    @Override // androidx.lifecycle.g, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(android.app.Activity r4) {
            r3 = this;
            r4.getClass()
            androidx.lifecycle.y r4 = r3.this$0
            int r0 = r4.f313h
            int r0 = r0 + (-1)
            r4.f313h = r0
            if (r0 != 0) goto L19
            android.os.Handler r0 = r4.f316k
            r0.getClass()
            a1.a r4 = r4.f318m
            r1 = 700(0x2bc, double:3.46E-321)
            r0.postDelayed(r4, r1)
        L19:
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(android.app.Activity r2, android.os.Bundle r3) {
            r1 = this;
            r2.getClass()
            androidx.lifecycle.w$a r3 = new androidx.lifecycle.w$a
            androidx.lifecycle.y r0 = r1.this$0
            r3.<init>(r0)
            androidx.lifecycle.v.a(r2, r3)
            return
    }

    @Override // androidx.lifecycle.g, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(android.app.Activity r3) {
            r2 = this;
            r3.getClass()
            androidx.lifecycle.y r3 = r2.this$0
            int r0 = r3.f312g
            int r0 = r0 + (-1)
            r3.f312g = r0
            if (r0 != 0) goto L1b
            boolean r0 = r3.f314i
            if (r0 == 0) goto L1b
            androidx.lifecycle.s r0 = r3.f317l
            androidx.lifecycle.k r1 = androidx.lifecycle.k.ON_STOP
            r0.d(r1)
            r0 = 1
            r3.f315j = r0
        L1b:
            return
    }
}
