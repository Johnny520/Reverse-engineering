package a;

/* JADX INFO: renamed from: a.g8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0156g8 implements top.mmjz.floatingclouds.plugin.IPlugin {
    @Override // top.mmjz.floatingclouds.plugin.IPlugin
    public final void handleHook(a.J8 r10) {
            r9 = this;
            java.lang.String r0 = "."
            java.lang.String r1 = "HideContactLabel: hooked "
            java.lang.String r2 = "session"
            a.C0193i9.e(r10, r2)
            java.lang.ClassLoader r2 = r10.f136a
            a.fd r3 = new a.fd
            int r4 = a.B1.f21a
            r5 = 0
            r6 = 1
            r7 = -1
            if (r4 != r7) goto L34
            android.content.Context r4 = a.C0435w1.p     // Catch: java.lang.Exception -> L26
            a.C0193i9.b(r4)     // Catch: java.lang.Exception -> L26
            android.content.pm.PackageManager r4 = r4.getPackageManager()     // Catch: java.lang.Exception -> L26
            java.lang.String r8 = "com.tencent.mm"
            android.content.pm.PackageInfo r4 = r4.getPackageInfo(r8, r5)     // Catch: java.lang.Exception -> L26
            int r7 = r4.versionCode     // Catch: java.lang.Exception -> L26
            goto L32
        L26:
            r4 = move-exception
            java.lang.Object[] r4 = new java.lang.Object[]{r4}
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r4, r6)
            a.C0453x1.a(r4)
        L32:
            a.B1.f21a = r7
        L34:
            int r4 = a.B1.f21a
            r3.<init>(r4, r2)
            a.hd r2 = a.C0179hd.f499a
            r2.getClass()
            java.lang.String r2 = "F005_hide_contact_label"
            a.gd r2 = a.C0179hd.a(r2, r3)
            boolean r3 = r2.f485a
            if (r3 == 0) goto L76
            java.lang.Class<?> r3 = r2.b
            if (r3 == 0) goto L76
            a.cd r4 = r2.d
            java.lang.String r3 = r3.getName()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "HideContactLabel: labelStorage resolved via "
            r7.<init>(r8)
            r7.append(r4)
            java.lang.String r4 = ": "
            r7.append(r4)
            r7.append(r3)
            java.lang.String r3 = r7.toString()
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r6)
            a.C0453x1.b(r3)
            java.lang.Class<?> r2 = r2.b
            goto L93
        L76:
            a.j6 r2 = r2.c
            r3 = 0
            if (r2 == 0) goto L7e
            java.lang.String r2 = r2.c
            goto L7f
        L7e:
            r2 = r3
        L7f:
            java.lang.String r4 = "HideContactLabel: labelStorage resolve FAILED (reason="
            java.lang.String r7 = ")"
            java.lang.String r2 = a.C0487z.g(r4, r2, r7)
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r6)
            a.C0453x1.e(r2)
            r2 = r3
        L93:
            if (r2 != 0) goto La3
            java.lang.String r10 = "HideContactLabel: label storage class not found (DexKit + fallback all failed)"
            java.lang.Object[] r10 = new java.lang.Object[]{r10}
            java.lang.Object[] r10 = java.util.Arrays.copyOf(r10, r6)
            a.C0453x1.e(r10)
            goto L118
        La3:
            java.lang.String r3 = r2.getName()
            java.lang.String r4 = "storage.g4"
            boolean r3 = a.Be.I(r3, r4, r5)
            if (r3 == 0) goto Lb2
            java.lang.String r3 = "s2"
            goto Lb4
        Lb2:
            java.lang.String r3 = "j"
        Lb4:
            java.lang.String r4 = r2.getName()     // Catch: java.lang.Throwable -> Leb
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            java.lang.Class[] r5 = new java.lang.Class[]{r5}     // Catch: java.lang.Throwable -> Leb
            a.J3 r7 = new a.J3     // Catch: java.lang.Throwable -> Leb
            r8 = 2
            r7.<init>(r3, r8)     // Catch: java.lang.Throwable -> Leb
            a.J8.a(r10, r4, r3, r5, r7)     // Catch: java.lang.Throwable -> Leb
            java.lang.String r10 = r2.getName()     // Catch: java.lang.Throwable -> Leb
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Leb
            r4.<init>(r1)     // Catch: java.lang.Throwable -> Leb
            r4.append(r10)     // Catch: java.lang.Throwable -> Leb
            r4.append(r0)     // Catch: java.lang.Throwable -> Leb
            r4.append(r3)     // Catch: java.lang.Throwable -> Leb
            java.lang.String r10 = r4.toString()     // Catch: java.lang.Throwable -> Leb
            java.lang.Object[] r10 = new java.lang.Object[]{r10}     // Catch: java.lang.Throwable -> Leb
            java.lang.Object[] r10 = java.util.Arrays.copyOf(r10, r6)     // Catch: java.lang.Throwable -> Leb
            a.C0453x1.b(r10)     // Catch: java.lang.Throwable -> Leb
            a.Wf r10 = a.Wf.f330a     // Catch: java.lang.Throwable -> Leb
            goto Lf0
        Leb:
            r10 = move-exception
            a.wd$a r10 = a.C0465xd.a(r10)
        Lf0:
            java.lang.Throwable r10 = a.C0447wd.a(r10)
            if (r10 == 0) goto L118
            java.lang.String r1 = r2.getName()
            java.lang.String r10 = r10.getMessage()
            java.lang.String r2 = "HideContactLabel: hook "
            java.lang.String r4 = " fail: "
            java.lang.StringBuilder r0 = a.C0487z.i(r2, r1, r0, r3, r4)
            r0.append(r10)
            java.lang.String r10 = r0.toString()
            java.lang.Object[] r10 = new java.lang.Object[]{r10}
            java.lang.Object[] r10 = java.util.Arrays.copyOf(r10, r6)
            a.C0453x1.a(r10)
        L118:
            return
    }
}
