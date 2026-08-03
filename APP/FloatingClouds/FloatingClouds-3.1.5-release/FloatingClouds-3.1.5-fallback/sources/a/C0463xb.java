package a;

/* JADX INFO: renamed from: a.xb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0463xb implements top.mmjz.floatingclouds.plugin.IPlugin {
    @Override // top.mmjz.floatingclouds.plugin.IPlugin
    public final void handleHook(a.J8 r11) {
            r10 = this;
            java.lang.String r0 = "session"
            a.C0193i9.e(r11, r0)
            java.lang.ClassLoader r1 = r11.f136a
            a.fd r2 = new a.fd
            int r0 = a.B1.f21a
            r3 = 1
            r4 = -1
            if (r0 != r4) goto L30
            android.content.Context r0 = a.C0435w1.p     // Catch: java.lang.Exception -> L22
            a.C0193i9.b(r0)     // Catch: java.lang.Exception -> L22
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch: java.lang.Exception -> L22
            java.lang.String r5 = "com.tencent.mm"
            r6 = 0
            android.content.pm.PackageInfo r0 = r0.getPackageInfo(r5, r6)     // Catch: java.lang.Exception -> L22
            int r4 = r0.versionCode     // Catch: java.lang.Exception -> L22
            goto L2e
        L22:
            r0 = move-exception
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r3)
            a.C0453x1.a(r0)
        L2e:
            a.B1.f21a = r4
        L30:
            int r0 = a.B1.f21a
            r2.<init>(r0, r1)
            a.hd r0 = a.C0179hd.f499a
            r0.getClass()
            java.lang.String r0 = "F017_msg_storage"
            a.gd r0 = a.C0179hd.a(r0, r2)
            java.lang.Class<?> r1 = r0.b
            if (r1 == 0) goto L4a
            java.lang.String r1 = r1.getName()
        L48:
            r6 = r1
            goto L4d
        L4a:
            java.lang.String r1 = "com.tencent.mm.storage.f9"
            goto L48
        L4d:
            java.lang.String r1 = "insertMethod"
            java.lang.String r1 = r0.b(r1)
            if (r1 != 0) goto L57
            java.lang.String r1 = "H9"
        L57:
            r7 = r1
            java.lang.String r1 = "msgInfoClass"
            java.lang.Class r1 = r0.a(r1)
            a.cd r0 = r0.d
            if (r1 == 0) goto L67
            java.lang.String r2 = r1.getName()
            goto L68
        L67:
            r2 = 0
        L68:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "MsgInsertDisp: resolve via="
            r4.<init>(r5)
            r4.append(r0)
            java.lang.String r0 = " storage="
            r4.append(r0)
            r4.append(r6)
            java.lang.String r0 = " method="
            r4.append(r0)
            r4.append(r7)
            java.lang.String r0 = " msgInfo="
            r4.append(r0)
            r4.append(r2)
            java.lang.String r0 = r4.toString()
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r3)
            a.C0453x1.b(r0)
            java.lang.String r0 = "."
            java.lang.String r2 = "MsgInsertDisp: hooked "
            if (r1 != 0) goto Lb0
            java.lang.String r11 = "MsgInsertDisp: msgInfoClass is null, cannot hook"
            java.lang.Object[] r11 = new java.lang.Object[]{r11}     // Catch: java.lang.Throwable -> Lad
            java.lang.Object[] r11 = java.util.Arrays.copyOf(r11, r3)     // Catch: java.lang.Throwable -> Lad
            a.C0453x1.a(r11)     // Catch: java.lang.Throwable -> Lad
            goto L120
        Lad:
            r0 = move-exception
            r11 = r0
            goto L101
        Lb0:
            java.lang.String r5 = "F030"
            java.lang.Class[] r8 = new java.lang.Class[]{r1}     // Catch: java.lang.Throwable -> Lad
            a.O8 r9 = new a.O8     // Catch: java.lang.Throwable -> Lad
            r1 = 16
            r9.<init>(r1)     // Catch: java.lang.Throwable -> Lad
            r4 = r11
            a.J8.d(r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> Lad
            java.util.concurrent.ConcurrentHashMap<java.lang.String, a.F8> r11 = a.E8.f71a     // Catch: java.lang.Throwable -> Lad
            java.lang.String r11 = "F030"
            java.lang.String r1 = "msgInsertDispatch"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lad
            r4.<init>()     // Catch: java.lang.Throwable -> Lad
            r4.append(r6)     // Catch: java.lang.Throwable -> Lad
            r4.append(r0)     // Catch: java.lang.Throwable -> Lad
            r4.append(r7)     // Catch: java.lang.Throwable -> Lad
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> Lad
            a.E8.b(r11, r1, r4)     // Catch: java.lang.Throwable -> Lad
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lad
            r11.<init>(r2)     // Catch: java.lang.Throwable -> Lad
            r11.append(r6)     // Catch: java.lang.Throwable -> Lad
            r11.append(r0)     // Catch: java.lang.Throwable -> Lad
            r11.append(r7)     // Catch: java.lang.Throwable -> Lad
            java.lang.String r0 = " — unified dispatch active"
            r11.append(r0)     // Catch: java.lang.Throwable -> Lad
            java.lang.String r11 = r11.toString()     // Catch: java.lang.Throwable -> Lad
            java.lang.Object[] r11 = new java.lang.Object[]{r11}     // Catch: java.lang.Throwable -> Lad
            java.lang.Object[] r11 = java.util.Arrays.copyOf(r11, r3)     // Catch: java.lang.Throwable -> Lad
            a.C0453x1.b(r11)     // Catch: java.lang.Throwable -> Lad
            a.Wf r11 = a.Wf.f330a     // Catch: java.lang.Throwable -> Lad
            goto L105
        L101:
            a.wd$a r11 = a.C0465xd.a(r11)
        L105:
            java.lang.Throwable r11 = a.C0447wd.a(r11)
            if (r11 == 0) goto L120
            java.lang.String r11 = r11.getMessage()
            java.lang.String r0 = "MsgInsertDisp: hook FAILED: "
            java.lang.String r11 = a.C0487z.k(r0, r11)
            java.lang.Object[] r11 = new java.lang.Object[]{r11}
            java.lang.Object[] r11 = java.util.Arrays.copyOf(r11, r3)
            a.C0453x1.a(r11)
        L120:
            return
    }
}
