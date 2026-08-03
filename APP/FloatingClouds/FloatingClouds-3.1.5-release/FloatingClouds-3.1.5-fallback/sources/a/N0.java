package a;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class N0 implements java.lang.Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f179a;
    public final /* synthetic */ android.content.Context b;

    public /* synthetic */ N0(android.content.Context r1, int r2) {
            r0 = this;
            r0.f179a = r2
            r0.b = r1
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r11 = this;
            int r0 = r11.f179a
            switch(r0) {
                case 0: goto L2f;
                case 1: goto L13;
                default: goto L5;
            }
        L5:
            a.Ic r0 = new a.Ic
            r0.<init>()
            androidx.profileinstaller.c$a r1 = androidx.profileinstaller.c.f948a
            r2 = 0
            android.content.Context r3 = r11.b
            androidx.profileinstaller.c.b(r3, r0, r1, r2)
            return
        L13:
            java.util.concurrent.ThreadPoolExecutor r4 = new java.util.concurrent.ThreadPoolExecutor
            java.util.concurrent.TimeUnit r9 = java.util.concurrent.TimeUnit.MILLISECONDS
            java.util.concurrent.LinkedBlockingQueue r10 = new java.util.concurrent.LinkedBlockingQueue
            r10.<init>()
            r6 = 1
            r7 = 0
            r5 = 0
            r4.<init>(r5, r6, r7, r9, r10)
            a.N0 r0 = new a.N0
            android.content.Context r1 = r11.b
            r2 = 2
            r0.<init>(r1, r2)
            r4.execute(r0)
            return
        L2f:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 1
            r2 = 33
            if (r0 < r2) goto Lb0
            android.content.ComponentName r3 = new android.content.ComponentName
            android.content.Context r4 = r11.b
            java.lang.String r5 = "androidx.appcompat.app.AppLocalesMetadataHolderService"
            r3.<init>(r4, r5)
            android.content.pm.PackageManager r5 = r4.getPackageManager()
            int r5 = r5.getComponentEnabledSetting(r3)
            if (r5 == r1) goto Lb0
            java.lang.String r5 = "locale"
            if (r0 < r2) goto L87
            a.L1<java.lang.ref.WeakReference<a.O0>> r0 = a.O0.g
            java.util.Iterator r0 = r0.iterator()
        L53:
            r2 = r0
            a.Z9$a r2 = (a.Z9.a) r2
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto L75
            java.lang.Object r2 = r2.next()
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2
            java.lang.Object r2 = r2.get()
            a.O0 r2 = (a.O0) r2
            if (r2 == 0) goto L53
            android.content.Context r2 = r2.f()
            if (r2 == 0) goto L53
            java.lang.Object r0 = r2.getSystemService(r5)
            goto L76
        L75:
            r0 = 0
        L76:
            if (r0 == 0) goto L8c
            android.os.LocaleList r0 = a.O0.b.a(r0)
            a.J9 r2 = new a.J9
            a.L9 r6 = new a.L9
            r6.<init>(r0)
            r2.<init>(r6)
            goto L8e
        L87:
            a.J9 r2 = a.O0.c
            if (r2 == 0) goto L8c
            goto L8e
        L8c:
            a.J9 r2 = a.J9.b
        L8e:
            a.L9 r0 = r2.f137a
            android.os.LocaleList r0 = r0.f163a
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto La9
            java.lang.String r0 = a.C0435w1.S(r4)
            java.lang.Object r2 = r4.getSystemService(r5)
            if (r2 == 0) goto La9
            android.os.LocaleList r0 = a.O0.a.a(r0)
            a.O0.b.b(r2, r0)
        La9:
            android.content.pm.PackageManager r0 = r4.getPackageManager()
            r0.setComponentEnabledSetting(r3, r1, r1)
        Lb0:
            a.O0.f = r1
            return
    }
}
