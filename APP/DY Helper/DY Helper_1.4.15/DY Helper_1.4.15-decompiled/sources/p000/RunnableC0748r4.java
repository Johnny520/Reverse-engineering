package p000;

/* JADX INFO: renamed from: r4 */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0748r4 implements java.lang.Runnable {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f9255;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ android.content.Context f9256;

    public /* synthetic */ RunnableC0748r4(android.content.Context r1, int r2) {
            r0 = this;
            r0.f9255 = r2
            r0.f9256 = r1
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r10 = this;
            int r0 = r10.f9255
            r1 = 0
            android.content.Context r10 = r10.f9256
            switch(r0) {
                case 0: goto L5d;
                case 1: goto L43;
                case 2: goto L37;
                default: goto L8;
            }
        L8:
            java.util.concurrent.atomic.AtomicBoolean r0 = p000.AbstractC0976x9.f12071     // Catch: java.lang.Throwable -> L18
            android.content.Context r0 = r10.getApplicationContext()     // Catch: java.lang.Throwable -> L18
            if (r0 != 0) goto L11
            goto L12
        L11:
            r10 = r0
        L12:
            p000.AbstractC0976x9.m6537(r10)     // Catch: java.lang.Throwable -> L18
            s62 r10 = p000.s62.f9751     // Catch: java.lang.Throwable -> L18
            goto L20
        L18:
            r0 = move-exception
            r10 = r0
            eo1 r0 = new eo1
            r0.<init>(r10)
            r10 = r0
        L20:
            java.lang.Throwable r10 = p000.fo1.m2190(r10)
            if (r10 == 0) goto L36
            java.lang.String r10 = r10.getMessage()
            java.lang.String r0 = "beta verifier warm-up failed: "
            java.lang.String r10 = p000.lz1.m3687(r0, r10)
            r0 = 4
            java.lang.String r2 = "DYHelper"
            p000.C0888ux.m5988(r2, r10, r1, r0, r1)
        L36:
            return
        L37:
            gj1 r0 = new gj1
            r0.<init>()
            rk0 r1 = p000.AbstractC0978xb.f12109
            r2 = 0
            p000.AbstractC0978xb.m6605(r10, r0, r1, r2)
            return
        L43:
            java.util.concurrent.ThreadPoolExecutor r3 = new java.util.concurrent.ThreadPoolExecutor
            java.util.concurrent.LinkedBlockingQueue r9 = new java.util.concurrent.LinkedBlockingQueue
            r9.<init>()
            r4 = 0
            r5 = 1
            r6 = 0
            java.util.concurrent.TimeUnit r8 = java.util.concurrent.TimeUnit.MILLISECONDS
            r3.<init>(r4, r5, r6, r8, r9)
            r4 r0 = new r4
            r1 = 2
            r0.<init>(r10, r1)
            r3.execute(r0)
            return
        L5d:
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 1
            r3 = 33
            if (r0 < r3) goto Ldb
            android.content.ComponentName r4 = new android.content.ComponentName
            java.lang.String r5 = "androidx.appcompat.app.AppLocalesMetadataHolderService"
            r4.<init>(r10, r5)
            android.content.pm.PackageManager r5 = r10.getPackageManager()
            int r5 = r5.getComponentEnabledSetting(r4)
            if (r5 == r2) goto Ldb
            java.lang.String r5 = "locale"
            if (r0 < r3) goto Lb2
            d7 r0 = androidx.appcompat.app.AbstractC0025.f367
            r0.getClass()
            y6 r3 = new y6
            r3.<init>(r0)
        L83:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto La1
            java.lang.Object r0 = r3.next()
            java.lang.ref.WeakReference r0 = (java.lang.ref.WeakReference) r0
            java.lang.Object r0 = r0.get()
            androidx.appcompat.app.α r0 = (androidx.appcompat.app.AbstractC0025) r0
            if (r0 == 0) goto L83
            androidx.appcompat.app.β r0 = (androidx.appcompat.app.LayoutInflaterFactory2C0026) r0
            android.content.Context r0 = r0.f398
            if (r0 == 0) goto L83
            java.lang.Object r1 = r0.getSystemService(r5)
        La1:
            if (r1 == 0) goto Lb7
            android.os.LocaleList r0 = p000.AbstractC0822t4.m5604(r1)
            cv0 r1 = new cv0
            dv0 r3 = new dv0
            r3.<init>(r0)
            r1.<init>(r3)
            goto Lb9
        Lb2:
            cv0 r1 = androidx.appcompat.app.AbstractC0025.f363
            if (r1 == 0) goto Lb7
            goto Lb9
        Lb7:
            cv0 r1 = p000.cv0.f2778
        Lb9:
            dv0 r0 = r1.f2779
            android.os.LocaleList r0 = r0.f3300
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Ld4
            java.lang.String r0 = p000.AbstractC1021yh.m6908(r10)
            java.lang.Object r1 = r10.getSystemService(r5)
            if (r1 == 0) goto Ld4
            android.os.LocaleList r0 = p000.AbstractC0785s4.m5363(r0)
            p000.AbstractC0822t4.m5605(r1, r0)
        Ld4:
            android.content.pm.PackageManager r10 = r10.getPackageManager()
            r10.setComponentEnabledSetting(r4, r2, r2)
        Ldb:
            androidx.appcompat.app.AbstractC0025.f366 = r2
            return
    }
}
