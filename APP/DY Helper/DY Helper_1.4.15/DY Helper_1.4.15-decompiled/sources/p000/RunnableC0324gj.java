package p000;

/* JADX INFO: renamed from: gj */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0324gj implements java.lang.Runnable {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f4383;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ android.view.ViewGroup f4384;

    public /* synthetic */ RunnableC0324gj(android.view.ViewGroup r1, int r2) {
            r0 = this;
            r0.f4383 = r2
            r0.f4384 = r1
            r0.<init>()
            return
    }

    public /* synthetic */ RunnableC0324gj(android.view.ViewGroup r1, long r2) {
            r0 = this;
            r2 = 4
            r0.f4383 = r2
            r0.<init>()
            r0.f4384 = r1
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r4 = this;
            int r0 = r4.f4383
            s62 r1 = p000.s62.f9751
            r2 = 1
            android.view.ViewGroup r4 = r4.f4384
            switch(r0) {
                case 0: goto L62;
                case 1: goto L5e;
                case 2: goto L5a;
                case 3: goto L2d;
                case 4: goto L10;
                default: goto La;
            }
        La:
            ht0 r0 = p000.ht0.f4800
            p000.ht0.m2535(r4)
            return
        L10:
            ql r0 = p000.C0728ql.f9031
            boolean r4 = p000.C0728ql.m4895(r4)     // Catch: java.lang.Throwable -> L1b
            if (r4 == 0) goto L21
            int r4 = com.example.dyhelper.MainHook.f2222     // Catch: java.lang.Throwable -> L1b
            goto L21
        L1b:
            r4 = move-exception
            eo1 r1 = new eo1
            r1.<init>(r4)
        L21:
            java.lang.Throwable r4 = p000.fo1.m2190(r1)
            if (r4 == 0) goto L2c
            r4.toString()
            int r4 = com.example.dyhelper.MainHook.f2222
        L2c:
            return
        L2d:
            r0 = 2114784003(0x7e0d0b03, float:4.686958E37)
            r3 = 0
            r4.setTag(r0, r3)
            p000.AbstractC0551mj.m3842(r4, r2)     // Catch: java.lang.Throwable -> L38
            goto L3e
        L38:
            r4 = move-exception
            eo1 r1 = new eo1
            r1.<init>(r4)
        L3e:
            java.lang.Throwable r4 = p000.fo1.m2190(r1)
            if (r4 == 0) goto L59
            java.lang.String r4 = r4.getMessage()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "retry apply failed: "
            r0.<init>(r1)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            p000.AbstractC0551mj.m3859(r4)
        L59:
            return
        L5a:
            p000.AbstractC0551mj.m3842(r4, r2)     // Catch: java.lang.Throwable -> L5d
        L5d:
            return
        L5e:
            p000.AbstractC0551mj.m3842(r4, r2)     // Catch: java.lang.Throwable -> L61
        L61:
            return
        L62:
            p000.AbstractC0551mj.m3842(r4, r2)     // Catch: java.lang.Throwable -> L65
        L65:
            return
    }
}
