package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b3 implements java.lang.Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ android.content.Context b;

    public /* synthetic */ b3(android.content.Context r1, int r2) {
            r0 = this;
            r0.a = r2
            r0.b = r1
            r0.<init>()
            return
    }

    public /* synthetic */ b3(androidx.profileinstaller.ProfileInstallerInitializer r1, android.content.Context r2) {
            r0 = this;
            r1 = 1
            r0.a = r1
            r0.<init>()
            r0.b = r2
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r11 = this;
            int r0 = r11.a
            switch(r0) {
                case 0: goto L66;
                case 1: goto L2f;
                case 2: goto L13;
                default: goto L5;
            }
        L5:
            hy r0 = new hy
            r0.<init>()
            iy r1 = defpackage.ff.t
            r2 = 0
            android.content.Context r3 = r11.b
            defpackage.ff.X(r3, r0, r1, r2)
            return
        L13:
            java.util.concurrent.ThreadPoolExecutor r4 = new java.util.concurrent.ThreadPoolExecutor
            java.util.concurrent.TimeUnit r9 = java.util.concurrent.TimeUnit.MILLISECONDS
            java.util.concurrent.LinkedBlockingQueue r10 = new java.util.concurrent.LinkedBlockingQueue
            r10.<init>()
            r5 = 0
            r6 = 1
            r7 = 0
            r4.<init>(r5, r6, r7, r9, r10)
            b3 r0 = new b3
            r1 = 3
            android.content.Context r2 = r11.b
            r0.<init>(r2, r1)
            r4.execute(r0)
            return
        L2f:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto L3e
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            android.os.Handler r0 = defpackage.my.a(r0)
            goto L47
        L3e:
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
        L47:
            java.util.Random r1 = new java.util.Random
            r1.<init>()
            r2 = 1000(0x3e8, float:1.401E-42)
            r3 = 1
            int r2 = java.lang.Math.max(r2, r3)
            int r1 = r1.nextInt(r2)
            b3 r2 = new b3
            r3 = 2
            android.content.Context r4 = r11.b
            r2.<init>(r4, r3)
            int r1 = r1 + 5000
            long r3 = (long) r1
            r0.postDelayed(r2, r3)
            return
        L66:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            r2 = 1
            if (r0 < r1) goto Leb
            android.content.ComponentName r0 = new android.content.ComponentName
            java.lang.String r1 = "androidx.appcompat.app.AppLocalesMetadataHolderService"
            android.content.Context r3 = r11.b
            r0.<init>(r3, r1)
            android.content.pm.PackageManager r1 = r3.getPackageManager()
            int r1 = r1.getComponentEnabledSetting(r0)
            if (r1 == r2) goto Leb
            boolean r1 = defpackage.ip.A()
            java.lang.String r4 = "locale"
            if (r1 == 0) goto Lc2
            q6 r1 = defpackage.e3.g
            java.util.Iterator r1 = r1.iterator()
        L8e:
            r5 = r1
            ss r5 = (defpackage.ss) r5
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto Lb0
            java.lang.Object r5 = r5.next()
            java.lang.ref.WeakReference r5 = (java.lang.ref.WeakReference) r5
            java.lang.Object r5 = r5.get()
            e3 r5 = (defpackage.e3) r5
            if (r5 == 0) goto L8e
            r3 r5 = (defpackage.r3) r5
            android.content.Context r5 = r5.k
            if (r5 == 0) goto L8e
            java.lang.Object r1 = r5.getSystemService(r4)
            goto Lb1
        Lb0:
            r1 = 0
        Lb1:
            if (r1 == 0) goto Lc7
            android.os.LocaleList r1 = defpackage.d3.a(r1)
            sr r5 = new sr
            tr r6 = new tr
            r6.<init>(r1)
            r5.<init>(r6)
            goto Lc9
        Lc2:
            sr r5 = defpackage.e3.c
            if (r5 == 0) goto Lc7
            goto Lc9
        Lc7:
            sr r5 = defpackage.sr.b
        Lc9:
            tr r1 = r5.a
            android.os.LocaleList r1 = r1.a
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto Le4
            java.lang.String r1 = defpackage.ip.L(r3)
            java.lang.Object r4 = r3.getSystemService(r4)
            if (r4 == 0) goto Le4
            android.os.LocaleList r1 = defpackage.c3.a(r1)
            defpackage.d3.b(r4, r1)
        Le4:
            android.content.pm.PackageManager r1 = r3.getPackageManager()
            r1.setComponentEnabledSetting(r0, r2, r2)
        Leb:
            defpackage.e3.f = r2
            return
    }
}
