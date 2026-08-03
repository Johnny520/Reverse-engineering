package androidx.lifecycle;

/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\n\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0017¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\u000b¨\u0006\r"}, d2 = {"Landroidx/lifecycle/k;", "La/V5;", "Landroid/app/Activity;", "activity", "Landroid/os/Bundle;", "savedInstanceState", "La/Wf;", "onActivityPreCreated", "(Landroid/app/Activity;Landroid/os/Bundle;)V", "onActivityCreated", "onActivityPaused", "(Landroid/app/Activity;)V", "onActivityStopped", "lifecycle-process_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class k extends a.V5 {
    final /* synthetic */ androidx.lifecycle.j this$0;

    @kotlin.Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"androidx/lifecycle/k$a", "La/V5;", "Landroid/app/Activity;", "activity", "La/Wf;", "onActivityPostStarted", "(Landroid/app/Activity;)V", "onActivityPostResumed", "lifecycle-process_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a extends a.V5 {
        final /* synthetic */ androidx.lifecycle.j this$0;

        public a(androidx.lifecycle.j r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(android.app.Activity r2) {
                r1 = this;
                java.lang.String r0 = "activity"
                a.C0193i9.e(r2, r0)
                androidx.lifecycle.j r2 = r1.this$0
                r2.a()
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(android.app.Activity r3) {
                r2 = this;
                java.lang.String r0 = "activity"
                a.C0193i9.e(r3, r0)
                androidx.lifecycle.j r3 = r2.this$0
                int r0 = r3.f936a
                r1 = 1
                int r0 = r0 + r1
                r3.f936a = r0
                if (r0 != r1) goto L1d
                boolean r0 = r3.d
                if (r0 == 0) goto L1d
                androidx.lifecycle.h r0 = r3.f
                androidx.lifecycle.e$a r1 = androidx.lifecycle.e.a.ON_START
                r0.f(r1)
                r0 = 0
                r3.d = r0
            L1d:
                return
        }
    }

    public k(androidx.lifecycle.j r1) {
            r0 = this;
            r0.this$0 = r1
            r0.<init>()
            return
    }

    @Override // a.V5, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(android.app.Activity r2, android.os.Bundle r3) {
            r1 = this;
            java.lang.String r3 = "activity"
            a.C0193i9.e(r2, r3)
            int r3 = android.os.Build.VERSION.SDK_INT
            r0 = 29
            if (r3 >= r0) goto L24
            int r3 = androidx.lifecycle.l.b
            android.app.FragmentManager r2 = r2.getFragmentManager()
            java.lang.String r3 = "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag"
            android.app.Fragment r2 = r2.findFragmentByTag(r3)
            java.lang.String r3 = "null cannot be cast to non-null type androidx.lifecycle.ReportFragment"
            a.C0193i9.c(r2, r3)
            androidx.lifecycle.l r2 = (androidx.lifecycle.l) r2
            androidx.lifecycle.j r3 = r1.this$0
            androidx.lifecycle.j$b r3 = r3.h
            r2.f938a = r3
        L24:
            return
    }

    @Override // a.V5, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(android.app.Activity r4) {
            r3 = this;
            java.lang.String r0 = "activity"
            a.C0193i9.e(r4, r0)
            androidx.lifecycle.j r4 = r3.this$0
            int r0 = r4.b
            int r0 = r0 + (-1)
            r4.b = r0
            if (r0 != 0) goto L1b
            android.os.Handler r0 = r4.e
            a.C0193i9.b(r0)
            a.M2 r4 = r4.g
            r1 = 700(0x2bc, double:3.46E-321)
            r0.postDelayed(r4, r1)
        L1b:
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(android.app.Activity r2, android.os.Bundle r3) {
            r1 = this;
            java.lang.String r3 = "activity"
            a.C0193i9.e(r2, r3)
            androidx.lifecycle.k$a r3 = new androidx.lifecycle.k$a
            androidx.lifecycle.j r0 = r1.this$0
            r3.<init>(r0)
            androidx.lifecycle.j.a.a(r2, r3)
            return
    }

    @Override // a.V5, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(android.app.Activity r3) {
            r2 = this;
            java.lang.String r0 = "activity"
            a.C0193i9.e(r3, r0)
            androidx.lifecycle.j r3 = r2.this$0
            int r0 = r3.f936a
            int r0 = r0 + (-1)
            r3.f936a = r0
            if (r0 != 0) goto L1d
            boolean r0 = r3.c
            if (r0 == 0) goto L1d
            androidx.lifecycle.h r0 = r3.f
            androidx.lifecycle.e$a r1 = androidx.lifecycle.e.a.ON_STOP
            r0.f(r1)
            r0 = 1
            r3.d = r0
        L1d:
            return
    }
}
