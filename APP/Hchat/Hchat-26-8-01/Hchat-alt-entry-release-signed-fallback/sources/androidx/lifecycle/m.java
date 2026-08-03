package androidx.lifecycle;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class m extends androidx.lifecycle.g {
    public m() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // androidx.lifecycle.g, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(android.app.Activity r3, android.os.Bundle r4) {
            r2 = this;
            r3.getClass()
            int r4 = androidx.lifecycle.c0.f280h
            int r4 = android.os.Build.VERSION.SDK_INT
            r0 = 29
            if (r4 < r0) goto L18
            androidx.lifecycle.b0 r4 = androidx.lifecycle.c0.a.Companion
            r4.getClass()
            androidx.lifecycle.c0$a r4 = new androidx.lifecycle.c0$a
            r4.<init>()
            androidx.lifecycle.a0.d(r3, r4)
        L18:
            android.app.FragmentManager r3 = r3.getFragmentManager()
            java.lang.String r4 = "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag"
            android.app.Fragment r0 = r3.findFragmentByTag(r4)
            if (r0 != 0) goto L37
            android.app.FragmentTransaction r0 = r3.beginTransaction()
            androidx.lifecycle.c0 r1 = new androidx.lifecycle.c0
            r1.<init>()
            android.app.FragmentTransaction r4 = r0.add(r1, r4)
            r4.commit()
            r3.executePendingTransactions()
        L37:
            return
    }
}
