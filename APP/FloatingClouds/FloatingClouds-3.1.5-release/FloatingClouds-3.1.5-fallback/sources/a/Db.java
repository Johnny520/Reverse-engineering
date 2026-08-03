package a;

/* JADX INFO: loaded from: classes.dex */
public final class Db implements top.mmjz.floatingclouds.plugin.IPlugin {
    @Override // top.mmjz.floatingclouds.plugin.IPlugin
    public final void handleHook(a.J8 r8) {
            r7 = this;
            java.lang.String r0 = "session"
            a.C0193i9.e(r8, r0)
            a.K3$a r0 = a.K3.f148a
            r0.getClass()
            a.jc r0 = a.K3.a.i()
            boolean r0 = r0.r
            java.lang.String r1 = "MuteNotifPart"
            if (r0 != 0) goto L1e
            java.lang.String r8 = "disabled: hideMaskedMessageNotification=false"
            java.lang.Object[] r8 = new java.lang.Object[]{r1, r8}
            a.C0453x1.b(r8)
            return
        L1e:
            a.fd r0 = new a.fd
            int r2 = a.B1.f21a
            r3 = -1
            if (r2 != r3) goto L47
            android.content.Context r2 = a.C0435w1.p     // Catch: java.lang.Exception -> L38
            a.C0193i9.b(r2)     // Catch: java.lang.Exception -> L38
            android.content.pm.PackageManager r2 = r2.getPackageManager()     // Catch: java.lang.Exception -> L38
            java.lang.String r4 = "com.tencent.mm"
            r5 = 0
            android.content.pm.PackageInfo r2 = r2.getPackageInfo(r4, r5)     // Catch: java.lang.Exception -> L38
            int r3 = r2.versionCode     // Catch: java.lang.Exception -> L38
            goto L45
        L38:
            r2 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            r4 = 1
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r4)
            a.C0453x1.a(r2)
        L45:
            a.B1.f21a = r3
        L47:
            int r2 = a.B1.f21a
            java.lang.ClassLoader r3 = r8.f136a
            r0.<init>(r2, r3)
            a.hd r2 = a.C0179hd.f499a
            r2.getClass()
            java.lang.String r2 = "notification_precheck"
            a.gd r0 = a.C0179hd.a(r2, r0)
            java.lang.Class<?> r2 = r0.b
            r3 = 0
            if (r2 == 0) goto Lcf
            java.lang.String r2 = r2.getName()
            a.cd r0 = r0.d
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "notification_precheck via="
            r4.<init>(r5)
            r4.append(r0)
            java.lang.String r0 = " class="
            r4.append(r0)
            r4.append(r2)
            java.lang.String r0 = r4.toString()
            java.lang.Object[] r0 = new java.lang.Object[]{r1, r0}
            a.C0453x1.b(r0)
            java.lang.String r0 = "b"
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            java.lang.Class r5 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> La9
            a.C0193i9.b(r5)     // Catch: java.lang.Throwable -> La9
            java.lang.Class r6 = java.lang.Boolean.TYPE     // Catch: java.lang.Throwable -> La9
            a.C0193i9.b(r6)     // Catch: java.lang.Throwable -> La9
            java.lang.Class[] r4 = new java.lang.Class[]{r4, r3, r5, r6}     // Catch: java.lang.Throwable -> La9
            a.O8 r5 = new a.O8     // Catch: java.lang.Throwable -> La9
            r6 = 17
            r5.<init>(r6)     // Catch: java.lang.Throwable -> La9
            a.J8.a(r8, r2, r0, r4, r5)     // Catch: java.lang.Throwable -> La9
            java.lang.String r0 = "hook m0.b OK (preNotificationCheck)"
            java.lang.Object[] r0 = new java.lang.Object[]{r1, r0}     // Catch: java.lang.Throwable -> La9
            a.C0453x1.b(r0)     // Catch: java.lang.Throwable -> La9
            a.Wf r0 = a.Wf.f330a     // Catch: java.lang.Throwable -> La9
            goto Lae
        La9:
            r0 = move-exception
            a.wd$a r0 = a.C0465xd.a(r0)
        Lae:
            java.lang.Throwable r0 = a.C0447wd.a(r0)
            if (r0 == 0) goto Le4
            java.lang.String r2 = r0.getMessage()
            java.lang.String r4 = "hook m0.b FAILED: "
            java.lang.String r2 = a.C0487z.k(r4, r2)
            java.lang.Object[] r0 = new java.lang.Object[]{r1, r2, r0}
            a.C0453x1.a(r0)
            java.lang.String r0 = "DexKit fallback for m0.b not yet implemented"
            java.lang.Object[] r0 = new java.lang.Object[]{r1, r0}
            a.C0453x1.e(r0)
            goto Le4
        Lcf:
            a.j6 r0 = r0.c
            if (r0 == 0) goto Ld6
            java.lang.String r0 = r0.c
            goto Ld7
        Ld6:
            r0 = r3
        Ld7:
            java.lang.String r2 = "notification_precheck resolve FAILED: "
            java.lang.String r0 = a.C0487z.k(r2, r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r1, r0}
            a.C0453x1.e(r0)
        Le4:
            java.lang.String r0 = "com.tencent.mm.booter.notification.a"
            java.lang.String r2 = "a"
            java.lang.Class[] r3 = new java.lang.Class[]{r3, r3}     // Catch: java.lang.Throwable -> L102
            a.O8 r4 = new a.O8     // Catch: java.lang.Throwable -> L102
            r5 = 18
            r4.<init>(r7, r5)     // Catch: java.lang.Throwable -> L102
            a.J8.a(r8, r0, r2, r3, r4)     // Catch: java.lang.Throwable -> L102
            java.lang.String r8 = "hook a.a OK (notification base fallback)"
            java.lang.Object[] r8 = new java.lang.Object[]{r1, r8}     // Catch: java.lang.Throwable -> L102
            a.C0453x1.b(r8)     // Catch: java.lang.Throwable -> L102
            a.Wf r8 = a.Wf.f330a     // Catch: java.lang.Throwable -> L102
            goto L107
        L102:
            r8 = move-exception
            a.wd$a r8 = a.C0465xd.a(r8)
        L107:
            java.lang.Throwable r8 = a.C0447wd.a(r8)
            if (r8 == 0) goto L11e
            java.lang.String r8 = r8.getMessage()
            java.lang.String r0 = "hook a.a failed (non-critical): "
            java.lang.String r8 = a.C0487z.k(r0, r8)
            java.lang.Object[] r8 = new java.lang.Object[]{r1, r8}
            a.C0453x1.e(r8)
        L11e:
            return
    }
}
