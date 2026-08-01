package defpackage;

/* JADX INFO: renamed from: ᲀᛱᛵᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1619 implements java.lang.Runnable {

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ android.content.Context f7130;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final /* synthetic */ int f7131;

    public /* synthetic */ RunnableC1619(android.content.Context r1, int r2) {
            r0 = this;
            r0.f7131 = r2
            r0.f7130 = r1
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r10 = this;
            int r0 = r10.f7131
            r1 = 1
            android.content.Context r10 = r10.f7130
            switch(r0) {
                case 0: goto L2e;
                case 1: goto L14;
                default: goto L8;
            }
        L8:
            ᛶᲇᛱᛱ r0 = new ᛶᲇᛱᛱ
            r0.<init>(r1)
            ᲈᛴᛵᲈ r1 = defpackage.AbstractC2279.f9635
            r2 = 0
            defpackage.AbstractC2279.m3704(r10, r0, r1, r2)
            return
        L14:
            java.util.concurrent.ThreadPoolExecutor r3 = new java.util.concurrent.ThreadPoolExecutor
            java.util.concurrent.LinkedBlockingQueue r9 = new java.util.concurrent.LinkedBlockingQueue
            r9.<init>()
            r4 = 0
            r5 = 1
            r6 = 0
            java.util.concurrent.TimeUnit r8 = java.util.concurrent.TimeUnit.MILLISECONDS
            r3.<init>(r4, r5, r6, r8, r9)
            ᲀᛱᛵᛵ r0 = new ᲀᛱᛵᛵ
            r1 = 2
            r0.<init>(r10, r1)
            r3.execute(r0)
            return
        L2e:
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 33
            if (r0 < r2) goto Lb1
            android.content.ComponentName r0 = new android.content.ComponentName
            java.lang.String r2 = "androidx.appcompat.app.AppLocalesMetadataHolderService"
            r0.<init>(r10, r2)
            android.content.pm.PackageManager r2 = r10.getPackageManager()
            int r2 = r2.getComponentEnabledSetting(r0)
            if (r2 == r1) goto Lb1
            boolean r2 = defpackage.AbstractC0649.m1482()
            java.lang.String r3 = "locale"
            if (r2 == 0) goto L88
            ᲇᛵᛲᛲ r2 = defpackage.AbstractC2354.f10158
            r2.getClass()
            ᛴᛳᛵᲁ r4 = new ᛴᛳᛵᲁ
            r4.<init>(r2)
        L57:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L76
            java.lang.Object r2 = r4.next()
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2
            java.lang.Object r2 = r2.get()
            ᲈᲇᲀ r2 = (defpackage.AbstractC2354) r2
            if (r2 == 0) goto L57
            ᛸᛱᛱᛲ r2 = (defpackage.LayoutInflaterFactory2C1411) r2
            android.content.Context r2 = r2.f6153
            if (r2 == 0) goto L57
            java.lang.Object r2 = r2.getSystemService(r3)
            goto L77
        L76:
            r2 = 0
        L77:
            if (r2 == 0) goto L8d
            android.os.LocaleList r2 = defpackage.AbstractC1204.m2340(r2)
            ᛸᛶᛶᛸ r4 = new ᛸᛶᛶᛸ
            ᛳᲈᛲᛳ r5 = new ᛳᲈᛲᛳ
            r5.<init>(r2)
            r4.<init>(r5)
            goto L8f
        L88:
            ᛸᛶᛶᛸ r4 = defpackage.AbstractC2354.f10159
            if (r4 == 0) goto L8d
            goto L8f
        L8d:
            ᛸᛶᛶᛸ r4 = defpackage.C1509.f6669
        L8f:
            ᛳᲈᛲᛳ r2 = r4.f6670
            android.os.LocaleList r2 = r2.f2923
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto Laa
            java.lang.String r2 = defpackage.C0292.m942(r10)
            java.lang.Object r3 = r10.getSystemService(r3)
            if (r3 == 0) goto Laa
            android.os.LocaleList r2 = defpackage.AbstractC0512.m1302(r2)
            defpackage.AbstractC1204.m2341(r3, r2)
        Laa:
            android.content.pm.PackageManager r10 = r10.getPackageManager()
            r10.setComponentEnabledSetting(r0, r1, r1)
        Lb1:
            defpackage.AbstractC2354.f10156 = r1
            return
    }
}
