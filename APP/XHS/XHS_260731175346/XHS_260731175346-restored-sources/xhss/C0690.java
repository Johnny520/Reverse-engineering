package xhss;

/* JADX INFO: renamed from: xhss.ᛷᛸᛸᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0690 extends xhss.AbstractC1186 {
    final /* synthetic */ xhss.C0684 this$0;

    /* JADX INFO: renamed from: xhss.ᛷᛸᛸᲀ$ᛷᛵᛵᲈ, reason: contains not printable characters */
    /* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
    public static final class C0691 extends xhss.AbstractC1186 {
        final /* synthetic */ xhss.C0684 this$0;

        public C0691(xhss.C0684 r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(android.app.Activity r2) {
                r1 = this;
                xhss.ᛷᛸᛴᛵ r1 = r1.this$0
                int r2 = r1.f2311
                r0 = 1
                int r2 = r2 + r0
                r1.f2311 = r2
                if (r2 != r0) goto L20
                boolean r2 = r1.f2312
                if (r2 == 0) goto L19
                androidx.lifecycle.ᛷᛵᛵᲈ r2 = r1.f2317
                xhss.ᲈᲀᛵᛸ r0 = xhss.EnumC1174.ON_RESUME
                r2.m28(r0)
                r2 = 0
                r1.f2312 = r2
                return
            L19:
                android.os.Handler r2 = r1.f2313
                xhss.ᛳᛶᲈᛲ r1 = r1.f2315
                r2.removeCallbacks(r1)
            L20:
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(android.app.Activity r2) {
                r1 = this;
                xhss.ᛷᛸᛴᛵ r1 = r1.this$0
                int r2 = r1.f2314
                r0 = 1
                int r2 = r2 + r0
                r1.f2314 = r2
                if (r2 != r0) goto L18
                boolean r2 = r1.f2316
                if (r2 == 0) goto L18
                androidx.lifecycle.ᛷᛵᛵᲈ r2 = r1.f2317
                xhss.ᲈᲀᛵᛸ r0 = xhss.EnumC1174.ON_START
                r2.m28(r0)
                r2 = 0
                r1.f2316 = r2
            L18:
                return
        }
    }

    public C0690(xhss.C0684 r1) {
            r0 = this;
            r0.this$0 = r1
            r0.<init>()
            return
    }

    @Override // xhss.AbstractC1186, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(android.app.Activity r1, android.os.Bundle r2) {
            r0 = this;
            return
    }

    @Override // xhss.AbstractC1186, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(android.app.Activity r3) {
            r2 = this;
            xhss.ᛷᛸᛴᛵ r2 = r2.this$0
            int r3 = r2.f2311
            int r3 = r3 + (-1)
            r2.f2311 = r3
            if (r3 != 0) goto L13
            android.os.Handler r3 = r2.f2313
            xhss.ᛳᛶᲈᛲ r2 = r2.f2315
            r0 = 700(0x2bc, double:3.46E-321)
            r3.postDelayed(r2, r0)
        L13:
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(android.app.Activity r1, android.os.Bundle r2) {
            r0 = this;
            xhss.ᛷᛸᛸᲀ$ᛷᛵᛵᲈ r2 = new xhss.ᛷᛸᛸᲀ$ᛷᛵᛵᲈ
            xhss.ᛷᛸᛴᛵ r0 = r0.this$0
            r2.<init>(r0)
            xhss.AbstractC0196.m459(r1, r2)
            return
    }

    @Override // xhss.AbstractC1186, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(android.app.Activity r2) {
            r1 = this;
            xhss.ᛷᛸᛴᛵ r1 = r1.this$0
            int r2 = r1.f2314
            int r2 = r2 + (-1)
            r1.f2314 = r2
            if (r2 != 0) goto L18
            boolean r2 = r1.f2312
            if (r2 == 0) goto L18
            androidx.lifecycle.ᛷᛵᛵᲈ r2 = r1.f2317
            xhss.ᲈᲀᛵᛸ r0 = xhss.EnumC1174.ON_STOP
            r2.m28(r0)
            r2 = 1
            r1.f2316 = r2
        L18:
            return
    }
}
