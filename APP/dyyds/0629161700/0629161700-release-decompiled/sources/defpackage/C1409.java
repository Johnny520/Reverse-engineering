package defpackage;

/* JADX INFO: renamed from: ᛸᛱᛱ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1409 extends defpackage.AbstractC1915 {
    final /* synthetic */ defpackage.C0755 this$0;

    /* JADX INFO: renamed from: ᛸᛱᛱ$ᛷᲁᛳᛳ, reason: contains not printable characters */
    /* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
    public static final class C1410 extends defpackage.AbstractC1915 {
        final /* synthetic */ defpackage.C0755 this$0;

        public C1410(defpackage.C0755 r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(android.app.Activity r2) {
                r1 = this;
                ᛴᲀᲁᛲ r1 = r1.this$0
                int r2 = r1.f3540
                r0 = 1
                int r2 = r2 + r0
                r1.f3540 = r2
                if (r2 != r0) goto L20
                boolean r2 = r1.f3539
                if (r2 == 0) goto L19
                androidx.lifecycle.ᛷᲁᛳᛳ r2 = r1.f3537
                ᲈᛶᛱᛲ r0 = defpackage.EnumC2255.ON_RESUME
                r2.m108(r0)
                r2 = 0
                r1.f3539 = r2
                return
            L19:
                android.os.Handler r2 = r1.f3543
                ᲁᲈᛳ r1 = r1.f3538
                r2.removeCallbacks(r1)
            L20:
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(android.app.Activity r2) {
                r1 = this;
                ᛴᲀᲁᛲ r1 = r1.this$0
                int r2 = r1.f3541
                r0 = 1
                int r2 = r2 + r0
                r1.f3541 = r2
                if (r2 != r0) goto L18
                boolean r2 = r1.f3542
                if (r2 == 0) goto L18
                androidx.lifecycle.ᛷᲁᛳᛳ r2 = r1.f3537
                ᲈᛶᛱᛲ r0 = defpackage.EnumC2255.ON_START
                r2.m108(r0)
                r2 = 0
                r1.f3542 = r2
            L18:
                return
        }
    }

    public C1409(defpackage.C0755 r1) {
            r0 = this;
            r0.this$0 = r1
            r0.<init>()
            return
    }

    @Override // defpackage.AbstractC1915, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(android.app.Activity r1, android.os.Bundle r2) {
            r0 = this;
            return
    }

    @Override // defpackage.AbstractC1915, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(android.app.Activity r3) {
            r2 = this;
            ᛴᲀᲁᛲ r2 = r2.this$0
            int r3 = r2.f3540
            int r3 = r3 + (-1)
            r2.f3540 = r3
            if (r3 != 0) goto L13
            android.os.Handler r3 = r2.f3543
            ᲁᲈᛳ r2 = r2.f3538
            r0 = 700(0x2bc, double:3.46E-321)
            r3.postDelayed(r2, r0)
        L13:
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(android.app.Activity r1, android.os.Bundle r2) {
            r0 = this;
            ᛸᛱᛱ$ᛷᲁᛳᛳ r2 = new ᛸᛱᛱ$ᛷᲁᛳᛳ
            ᛴᲀᲁᛲ r0 = r0.this$0
            r2.<init>(r0)
            defpackage.AbstractC1693.m3072(r1, r2)
            return
    }

    @Override // defpackage.AbstractC1915, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(android.app.Activity r2) {
            r1 = this;
            ᛴᲀᲁᛲ r1 = r1.this$0
            int r2 = r1.f3541
            int r2 = r2 + (-1)
            r1.f3541 = r2
            if (r2 != 0) goto L18
            boolean r2 = r1.f3539
            if (r2 == 0) goto L18
            androidx.lifecycle.ᛷᲁᛳᛳ r2 = r1.f3537
            ᲈᛶᛱᛲ r0 = defpackage.EnumC2255.ON_STOP
            r2.m108(r0)
            r2 = 1
            r1.f3542 = r2
        L18:
            return
    }
}
