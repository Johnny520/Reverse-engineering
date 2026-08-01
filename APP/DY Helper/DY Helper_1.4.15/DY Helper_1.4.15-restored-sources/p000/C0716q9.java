package p000;

/* JADX INFO: renamed from: q9 */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0716q9 implements android.app.Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: α */
    public final /* synthetic */ int f8906;

    public /* synthetic */ C0716q9(int r1) {
            r0 = this;
            r0.f8906 = r1
            r0.<init>()
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(android.app.Activity r1, android.os.Bundle r2) {
            r0 = this;
            int r0 = r0.f8906
            r1.getClass()
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(android.app.Activity r2) {
            r1 = this;
            int r1 = r1.f8906
            r0 = 0
            r2.getClass()
            switch(r1) {
                case 0: goto L12;
                case 1: goto L11;
                default: goto L9;
            }
        L9:
            android.app.Activity r1 = p000.u72.f10636
            if (r1 != r2) goto L11
            java.util.List r1 = p000.u72.f10628
            p000.u72.f10636 = r0
        L11:
            return
        L12:
            java.lang.ref.WeakReference r1 = p000.C0753r9.f9296
            if (r1 == 0) goto L1d
            java.lang.Object r1 = r1.get()
            android.app.Activity r1 = (android.app.Activity) r1
            goto L1e
        L1d:
            r1 = r0
        L1e:
            if (r1 != r2) goto L24
            android.os.Handler r1 = p000.C0753r9.f9291
            p000.C0753r9.f9296 = r0
        L24:
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(android.app.Activity r2) {
            r1 = this;
            int r1 = r1.f8906
            r0 = 0
            r2.getClass()
            switch(r1) {
                case 0: goto L12;
                case 1: goto L11;
                default: goto L9;
            }
        L9:
            android.app.Activity r1 = p000.u72.f10636
            if (r1 != r2) goto L11
            java.util.List r1 = p000.u72.f10628
            p000.u72.f10636 = r0
        L11:
            return
        L12:
            java.lang.ref.WeakReference r1 = p000.C0753r9.f9296
            if (r1 == 0) goto L1d
            java.lang.Object r1 = r1.get()
            android.app.Activity r1 = (android.app.Activity) r1
            goto L1e
        L1d:
            r1 = r0
        L1e:
            if (r1 != r2) goto L24
            android.os.Handler r1 = p000.C0753r9.f9291
            p000.C0753r9.f9296 = r0
        L24:
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(android.app.Activity r6) {
            r5 = this;
            int r5 = r5.f8906
            r6.getClass()
            switch(r5) {
                case 0: goto L65;
                case 1: goto L10;
                default: goto L8;
            }
        L8:
            java.util.List r5 = p000.u72.f10628
            p000.u72.f10636 = r6
            p000.u72.m5798(r6)
            return
        L10:
            com.example.dyhelper.beta.BlacklistVerifier r5 = com.example.dyhelper.beta.BlacklistVerifier.f2226
            java.lang.ref.WeakReference r5 = new java.lang.ref.WeakReference
            r5.<init>(r6)
            com.example.dyhelper.beta.BlacklistVerifier.f2236 = r5
            com.example.dyhelper.beta.BlacklistVerifier r5 = com.example.dyhelper.beta.BlacklistVerifier.f2226
            boolean r0 = r5.m1312()
            if (r0 == 0) goto L64
            java.lang.String r0 = com.example.dyhelper.beta.BlacklistVerifier.f2235
            boolean r1 = p000.q02.m4671(r0)
            if (r1 == 0) goto L2b
            java.lang.String r0 = "未知"
        L2b:
            java.lang.String r1 = r5.m1310()
            boolean r2 = p000.q02.m4671(r1)
            if (r2 == 0) goto L37
            java.lang.String r1 = "违规使用"
        L37:
            android.os.Handler r2 = p000.AbstractC0205da.f2995
            e9 r3 = new e9
            r4 = 1
            r3.<init>(r6, r0, r1, r4)
            r2.post(r3)
            java.lang.String r6 = "activity-resumed"
            r5.m1308(r6)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "blacklist enforced on activity resume uid="
            r5.<init>(r6)
            r5.append(r0)
            java.lang.String r6 = " reason="
            r5.append(r6)
            r5.append(r1)
            java.lang.String r5 = r5.toString()
            r6 = 4
            java.lang.String r0 = "rc2b948eb05c3593c"
            r1 = 0
            p000.C0888ux.m5988(r0, r5, r1, r6, r1)
        L64:
            return
        L65:
            android.os.Handler r5 = p000.C0753r9.f9291
            java.lang.ref.WeakReference r5 = new java.lang.ref.WeakReference
            r5.<init>(r6)
            p000.C0753r9.f9296 = r5
            android.os.Handler r5 = p000.C0753r9.f9291
            p000.C0753r9.m5073(r6)
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(android.app.Activity r1, android.os.Bundle r2) {
            r0 = this;
            int r0 = r0.f8906
            r1.getClass()
            r2.getClass()
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(android.app.Activity r1) {
            r0 = this;
            int r0 = r0.f8906
            r1.getClass()
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(android.app.Activity r1) {
            r0 = this;
            int r0 = r0.f8906
            r1.getClass()
            return
    }
}
