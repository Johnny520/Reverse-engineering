package defpackage;

/* JADX INFO: renamed from: ᛶᲈᛱᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1180 implements defpackage.InterfaceC0126, defpackage.InterfaceC0985, defpackage.InterfaceC2245, defpackage.InterfaceC1297, defpackage.InterfaceC1429, defpackage.InterfaceC0953, defpackage.InterfaceC0845, defpackage.InterfaceC1393, defpackage.InterfaceC0300 {

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public java.lang.Object f5356;

    public C1180(int r3, boolean r4) {
            r2 = this;
            switch(r3) {
                case 15: goto L10;
                default: goto L3;
            }
        L3:
            r2.<init>()
            ᛱᲀᛱᲀ r3 = new ᛱᲀᛱᲀ
            r0 = 500(0x1f4, double:2.47E-321)
            r3.<init>(r0)
            r2.f5356 = r3
            return
        L10:
            r2.<init>()
            java.util.LinkedHashSet r3 = new java.util.LinkedHashSet
            r3.<init>()
            r2.f5356 = r3
            return
    }

    public /* synthetic */ C1180(java.lang.Object r1) {
            r0 = this;
            r0.f5356 = r1
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: ᛴᛸᲈᲈ, reason: contains not printable characters */
    public static void m2291(defpackage.C1180 r1) {
            java.lang.Object r1 = r1.f5356
            ᛷᲇᛱᲈ r1 = (defpackage.C1380) r1
            r0 = 2
            r1.f6021 = r0
            return
    }

    @Override // defpackage.InterfaceC0300
    /* JADX INFO: renamed from: ᛲᛲᛵ */
    public boolean mo957() {
            r0 = this;
            r0 = 1
            return r0
    }

    @Override // defpackage.InterfaceC1297
    /* JADX INFO: renamed from: ᛲᛴᛱᛶ, reason: contains not printable characters */
    public float mo2292() {
            r0 = this;
            java.lang.Object r0 = r0.f5356
            androidx.core.widget.NestedScrollView r0 = (androidx.core.widget.NestedScrollView) r0
            float r0 = r0.getVerticalScrollFactorCompat()
            float r0 = -r0
            return r0
    }

    @Override // defpackage.InterfaceC1429
    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public void mo2293(int r4, java.lang.Object r5) {
            r3 = this;
            switch(r4) {
                case 1: goto L21;
                case 2: goto L1e;
                case 3: goto L1b;
                case 4: goto L18;
                case 5: goto L15;
                case 6: goto L12;
                case 7: goto Lf;
                case 8: goto Lc;
                case 9: goto L3;
                case 10: goto L9;
                case 11: goto L6;
                default: goto L3;
            }
        L3:
            java.lang.String r0 = ""
            goto L23
        L6:
            java.lang.String r0 = "RESULT_DELETE_SKIP_FILE_SUCCESS"
            goto L23
        L9:
            java.lang.String r0 = "RESULT_INSTALL_SKIP_FILE_SUCCESS"
            goto L23
        Lc:
            java.lang.String r0 = "RESULT_PARSE_EXCEPTION"
            goto L23
        Lf:
            java.lang.String r0 = "RESULT_IO_EXCEPTION"
            goto L23
        L12:
            java.lang.String r0 = "RESULT_BASELINE_PROFILE_NOT_FOUND"
            goto L23
        L15:
            java.lang.String r0 = "RESULT_DESIRED_FORMAT_UNSUPPORTED"
            goto L23
        L18:
            java.lang.String r0 = "RESULT_NOT_WRITABLE"
            goto L23
        L1b:
            java.lang.String r0 = "RESULT_UNSUPPORTED_ART_VERSION"
            goto L23
        L1e:
            java.lang.String r0 = "RESULT_ALREADY_INSTALLED"
            goto L23
        L21:
            java.lang.String r0 = "RESULT_INSTALL_SUCCESS"
        L23:
            r1 = 6
            java.lang.String r2 = "ProfileInstaller"
            if (r4 == r1) goto L33
            r1 = 7
            if (r4 == r1) goto L33
            r1 = 8
            if (r4 == r1) goto L33
            android.util.Log.d(r2, r0)
            goto L38
        L33:
            java.lang.Throwable r5 = (java.lang.Throwable) r5
            android.util.Log.e(r2, r0, r5)
        L38:
            java.lang.Object r3 = r3.f5356
            androidx.profileinstaller.ProfileInstallReceiver r3 = (androidx.profileinstaller.ProfileInstallReceiver) r3
            r3.setResultCode(r4)
            return
    }

    /* JADX INFO: renamed from: ᛴᛸᲀ, reason: contains not printable characters */
    public void m2294(defpackage.AbstractC1804 r2) {
            r1 = this;
            java.lang.Object r1 = r1.f5356
            ᲀᛳᲁᛵ r1 = (defpackage.C1650) r1
            ᲁᛱᲈᲁ r0 = r1.f7345
            r0.f7907 = r2
            r2.f7906 = r0
            r1.f7345 = r2
            return
    }

    @Override // defpackage.InterfaceC0985
    /* JADX INFO: renamed from: ᛵᛱᛵᛲ */
    public void mo1928(java.util.ArrayList r3) {
            r2 = this;
            r0 = -824999077649966(0xfffd11aaef0961d2, double:NaN)
            r0 = -825050617257518(0xfffd119eef0961d2, double:NaN)
            boolean r3 = r3.isEmpty()
            java.lang.Object r2 = r2.f5356
            com.ss.android.ugc.awemes.MainActivity r2 = (com.ss.android.ugc.awemes.MainActivity) r2
            if (r3 == 0) goto L1e
            com.ss.android.ugc.awemes.MainActivity.access$loadAdaptedApps(r2)
            return
        L1e:
            com.ss.android.ugc.awemes.MainActivity.access$showInstalledAppsPermissionDenied(r2)
            return
    }

    @Override // defpackage.InterfaceC1297
    /* JADX INFO: renamed from: ᛶᛷᛱᲀ, reason: contains not printable characters */
    public void mo2295() {
            r0 = this;
            java.lang.Object r0 = r0.f5356
            androidx.core.widget.NestedScrollView r0 = (androidx.core.widget.NestedScrollView) r0
            android.widget.OverScroller r0 = r0.f270
            r0.abortAnimation()
            return
    }

    @Override // defpackage.InterfaceC0845
    /* JADX INFO: renamed from: ᛷᛲᲇᲈ */
    public defpackage.C1075 mo634() {
            r0 = this;
            java.lang.Object r0 = r0.f5356
            ᛶᛵᛶᛶ r0 = (defpackage.C1075) r0
            return r0
    }

    @Override // defpackage.InterfaceC1393
    /* JADX INFO: renamed from: ᛷᛸᛵᲇ */
    public boolean mo1359(java.lang.Object r5, java.io.File r6, defpackage.C0533 r7) {
            r4 = this;
            java.io.InputStream r5 = (java.io.InputStream) r5
            java.lang.String r7 = "StreamEncoder"
            java.lang.Object r4 = r4.f5356
            ᲇᛶᛳᛱ r4 = (defpackage.C2063) r4
            r0 = 65536(0x10000, float:9.1835E-41)
            java.lang.Class<byte[]> r1 = byte[].class
            java.lang.Object r0 = r4.m3464(r1, r0)
            byte[] r0 = (byte[]) r0
            r1 = 0
            r2 = 0
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L35 java.io.IOException -> L37
            r3.<init>(r6)     // Catch: java.lang.Throwable -> L35 java.io.IOException -> L37
        L19:
            int r6 = r5.read(r0)     // Catch: java.lang.Throwable -> L24 java.io.IOException -> L27
            r2 = -1
            if (r6 == r2) goto L2a
            r3.write(r0, r1, r6)     // Catch: java.lang.Throwable -> L24 java.io.IOException -> L27
            goto L19
        L24:
            r5 = move-exception
            r2 = r3
            goto L4d
        L27:
            r5 = move-exception
            r2 = r3
            goto L38
        L2a:
            r3.close()     // Catch: java.lang.Throwable -> L24 java.io.IOException -> L27
            r3.close()     // Catch: java.io.IOException -> L30
        L30:
            r4.m3468(r0)
            r1 = 1
            goto L4c
        L35:
            r5 = move-exception
            goto L4d
        L37:
            r5 = move-exception
        L38:
            r6 = 3
            boolean r6 = android.util.Log.isLoggable(r7, r6)     // Catch: java.lang.Throwable -> L35
            if (r6 == 0) goto L44
            java.lang.String r6 = "Failed to encode data onto the OutputStream"
            android.util.Log.d(r7, r6, r5)     // Catch: java.lang.Throwable -> L35
        L44:
            if (r2 == 0) goto L49
            r2.close()     // Catch: java.io.IOException -> L49
        L49:
            r4.m3468(r0)
        L4c:
            return r1
        L4d:
            if (r2 == 0) goto L52
            r2.close()     // Catch: java.io.IOException -> L52
        L52:
            r4.m3468(r0)
            throw r5
    }

    @Override // defpackage.InterfaceC0300
    /* JADX INFO: renamed from: ᛷᲁᛳᛳ */
    public defpackage.InterfaceC1661 mo958(java.lang.String r5) {
            r4 = this;
            java.lang.Object r4 = r4.f5356
            ᲁᛱᲀᛲ r4 = (defpackage.InterfaceC1801) r4
            java.lang.String r0 = r4.getDatabaseName()
            r1 = 0
            java.lang.String r2 = "' was requested."
            if (r0 != 0) goto L20
            java.lang.String r0 = ":memory:"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L16
            goto L41
        L16:
            java.lang.String r4 = "This driver is configured to open an in-memory database but a file-based named '"
            java.lang.String r4 = defpackage.AbstractC0225.m817(r4, r5, r2)
            defpackage.C2264.m3678(r4)
            return r1
        L20:
            boolean r3 = r0.equals(r5)
            if (r3 != 0) goto L41
            java.lang.String r0 = defpackage.AbstractC1347.m2507(r0)
            java.lang.String r3 = defpackage.AbstractC1347.m2507(r5)
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L35
            goto L41
        L35:
            java.lang.String r4 = r4.getDatabaseName()
            java.lang.String r0 = "' but '"
            java.lang.String r3 = "This driver is configured to open a database named '"
            defpackage.C0086.m547(r3, r4, r0, r5, r2)
            return r1
        L41:
            ᛲᛳᛲᛸ r5 = new ᛲᛳᛲᛸ
            ᛴᛲᲈᲀ r4 = r4.mo3193()
            r5.<init>(r4)
            return r5
    }

    @Override // defpackage.InterfaceC0953
    /* JADX INFO: renamed from: ᛸᛵᛸᛷ */
    public boolean mo1902(java.lang.Object r1) {
            r0 = this;
            java.lang.Object r0 = r0.f5356
            ᛲᛷᛸ r0 = (defpackage.C0323) r0
            ᛶᲈᛵᛲ r0 = r0.f1684
            ᛸᲈᛸᲈ r0 = r0.f5376
            r0.getClass()
            boolean r0 = r1 instanceof java.util.List
            return r0
    }

    @Override // defpackage.InterfaceC2245
    /* JADX INFO: renamed from: ᲀᛳᲀᛵ, reason: contains not printable characters */
    public void mo2296() {
            r2 = this;
            java.lang.Object r2 = r2.f5356
            ᛷᛷᛸᛱ r2 = (defpackage.C1315) r2
            java.lang.Object r2 = r2.f5821
            ᛱᲁᲀᲁ r2 = (defpackage.C0185) r2
            boolean r0 = r2.mo725()
            if (r0 == 0) goto Lf
            goto L1e
        Lf:
            boolean r0 = r2.mo727()
            if (r0 == 0) goto L1e
            ᲈᛷᲀᛷ r0 = new ᲈᛷᲀᛷ
            r1 = 1
            r0.<init>(r2, r1)
            com.kongzue.dialogx.interfaces.AbstractC0008.m257(r0)
        L1e:
            return
    }

    /* JADX INFO: renamed from: ᲁᲈᲇᲁ, reason: contains not printable characters */
    public void m2297(java.util.Set r8) {
            r7 = this;
            ᛳᛴᛵᛱ r0 = defpackage.AbstractC0762.f3552
            boolean r1 = r8.isEmpty()
            if (r1 == 0) goto L9
            return
        L9:
            java.lang.Object r7 = r7.f5356
            ᲇᲇᛴᛱ r7 = (defpackage.C2141) r7
        Ld:
            sun.misc.Unsafe r1 = defpackage.AbstractC0051.f569
            long r2 = defpackage.C2141.f9114
            java.lang.Object r1 = r1.getObjectVolatile(r7, r2)
            if (r1 != r0) goto L18
            r1 = 0
        L18:
            r2 = r1
            int[] r2 = (int[]) r2
            int r3 = r2.length
            int[] r4 = new int[r3]
            r5 = 0
        L1f:
            if (r5 >= r3) goto L37
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
            boolean r6 = r8.contains(r6)
            if (r6 == 0) goto L30
            r6 = r2[r5]
            int r6 = r6 + 1
            goto L32
        L30:
            r6 = r2[r5]
        L32:
            r4[r5] = r6
            int r5 = r5 + 1
            goto L1f
        L37:
            if (r1 != 0) goto L3a
            r1 = r0
        L3a:
            monitor-enter(r7)
            sun.misc.Unsafe r2 = defpackage.AbstractC0051.f569     // Catch: java.lang.Throwable -> L73
            long r5 = defpackage.C2141.f9114     // Catch: java.lang.Throwable -> L73
            java.lang.Object r3 = r2.getObjectVolatile(r7, r5)     // Catch: java.lang.Throwable -> L73
            boolean r1 = defpackage.AbstractC0498.m1280(r3, r1)     // Catch: java.lang.Throwable -> L73
            if (r1 != 0) goto L4b
            monitor-exit(r7)
            goto Ld
        L4b:
            boolean r8 = defpackage.AbstractC0498.m1280(r3, r4)     // Catch: java.lang.Throwable -> L73
            if (r8 == 0) goto L53
            monitor-exit(r7)
            return
        L53:
            r2.putObjectVolatile(r7, r5, r4)     // Catch: java.lang.Throwable -> L73
            int r8 = r7.f9115     // Catch: java.lang.Throwable -> L73
            r0 = r8 & 1
            if (r0 != 0) goto L75
            int r8 = r8 + 1
            r7.f9115 = r8     // Catch: java.lang.Throwable -> L73
            monitor-exit(r7)
        L61:
            monitor-enter(r7)
            int r0 = r7.f9115     // Catch: java.lang.Throwable -> L6c
            if (r0 != r8) goto L6e
            int r8 = r8 + 1
            r7.f9115 = r8     // Catch: java.lang.Throwable -> L6c
            monitor-exit(r7)
            return
        L6c:
            r8 = move-exception
            goto L71
        L6e:
            monitor-exit(r7)
            r8 = r0
            goto L61
        L71:
            monitor-exit(r7)
            throw r8
        L73:
            r8 = move-exception
            goto L7b
        L75:
            int r8 = r8 + 2
            r7.f9115 = r8     // Catch: java.lang.Throwable -> L73
            monitor-exit(r7)
            return
        L7b:
            monitor-exit(r7)
            throw r8
    }

    /* JADX INFO: renamed from: ᲇᛱᛸᲇ, reason: contains not printable characters */
    public defpackage.C1085 m2298() {
            r1 = this;
            ᛶᛶᛲᛱ r0 = new ᛶᛶᛲᛱ
            r0.<init>()
            java.lang.Object r1 = r1.f5356
            ᛷᲇᛱᲈ r1 = (defpackage.C1380) r1
            r0.f4430 = r1
            return r0
    }

    @Override // defpackage.InterfaceC0845
    /* JADX INFO: renamed from: ᲇᛶᛵᲇ */
    public defpackage.C1894 mo637() {
            r5 = this;
            r0 = 0
            r1 = r0
        L2:
            java.lang.Object r2 = r5.f5356
            ᛶᛵᛶᛶ r2 = (defpackage.C1075) r2
            ᛶᛴᲈ r2 = r2.f4823
            boolean r2 = r2.f4731
            if (r2 != 0) goto L5d
            java.lang.Object r2 = r5.f5356     // Catch: java.io.IOException -> L30
            ᛶᛵᛶᛶ r2 = (defpackage.C1075) r2     // Catch: java.io.IOException -> L30
            ᛱᛴᛶᛳ r2 = r2.m2053()     // Catch: java.io.IOException -> L30
            boolean r3 = r2.mo535()     // Catch: java.io.IOException -> L30
            if (r3 != 0) goto L45
            ᛸᛴᛸᛵ r3 = r2.mo539()     // Catch: java.io.IOException -> L30
            ᛱᛴᛶᛳ r4 = r3.f6523     // Catch: java.io.IOException -> L30
            if (r4 != 0) goto L28
            java.lang.Throwable r4 = r3.f6521     // Catch: java.io.IOException -> L30
            if (r4 != 0) goto L28
            r4 = 1
            goto L29
        L28:
            r4 = 0
        L29:
            if (r4 == 0) goto L32
            ᛸᛴᛸᛵ r3 = r2.mo537()     // Catch: java.io.IOException -> L30
            goto L32
        L30:
            r2 = move-exception
            goto L4a
        L32:
            ᛱᛴᛶᛳ r4 = r3.f6523     // Catch: java.io.IOException -> L30
            java.lang.Throwable r3 = r3.f6521     // Catch: java.io.IOException -> L30
            if (r3 != 0) goto L44
            if (r4 == 0) goto L45
            java.lang.Object r2 = r5.f5356     // Catch: java.io.IOException -> L30
            ᛶᛵᛶᛶ r2 = (defpackage.C1075) r2     // Catch: java.io.IOException -> L30
            ᛶᲈᛷᛵ r2 = r2.f4836     // Catch: java.io.IOException -> L30
            r2.addFirst(r4)     // Catch: java.io.IOException -> L30
            goto L2
        L44:
            throw r3     // Catch: java.io.IOException -> L30
        L45:
            ᲁᛸᛲᛶ r5 = r2.mo536()     // Catch: java.io.IOException -> L30
            return r5
        L4a:
            if (r1 != 0) goto L4e
            r1 = r2
            goto L51
        L4e:
            defpackage.AbstractC2193.m3595(r1, r2)
        L51:
            java.lang.Object r2 = r5.f5356
            ᛶᛵᛶᛶ r2 = (defpackage.C1075) r2
            boolean r2 = r2.m2052(r0)
            if (r2 == 0) goto L5c
            goto L2
        L5c:
            throw r1
        L5d:
            java.lang.String r5 = "Canceled"
            defpackage.C2264.m3682(r5)
            return r0
    }

    @Override // defpackage.InterfaceC1297
    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public boolean mo2299(float r2) {
            r1 = this;
            r0 = 0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 != 0) goto L7
            r1 = 0
            return r1
        L7:
            r1.mo2295()
            java.lang.Object r1 = r1.f5356
            androidx.core.widget.NestedScrollView r1 = (androidx.core.widget.NestedScrollView) r1
            int r2 = (int) r2
            r1.m95(r2)
            r1 = 1
            return r1
    }

    /* JADX INFO: renamed from: ᲇᲀᛲᛱ, reason: contains not printable characters */
    public defpackage.C0930 m2300() {
            r1 = this;
            ᛵᛷᛶᲇ r0 = new ᛵᛷᛶᲇ
            r0.<init>()
            java.lang.Object r1 = r1.f5356
            ᛷᲇᛱᲈ r1 = (defpackage.C1380) r1
            r0.f4430 = r1
            return r0
    }

    @Override // defpackage.InterfaceC1429
    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public void mo2301() {
            r1 = this;
            java.lang.String r1 = "DIAGNOSTIC_PROFILE_IS_COMPRESSED"
            java.lang.String r0 = "ProfileInstaller"
            android.util.Log.d(r0, r1)
            return
    }
}
