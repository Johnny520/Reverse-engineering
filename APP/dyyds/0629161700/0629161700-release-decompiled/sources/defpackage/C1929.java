package defpackage;

/* JADX INFO: renamed from: ᲁᲁᛷᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1929 implements defpackage.InterfaceC0702, defpackage.InterfaceC1192, defpackage.InterfaceC1429, defpackage.InterfaceC1914, defpackage.InterfaceC0953, defpackage.InterfaceC0696, defpackage.InterfaceC1029, defpackage.InterfaceC2245 {

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final /* synthetic */ int f8368;

    public /* synthetic */ C1929(int r1) {
            r0 = this;
            r0.f8368 = r1
            r0.<init>()
            return
    }

    public /* synthetic */ C1929(int r1, java.lang.Object r2) {
            r0 = this;
            r0.f8368 = r1
            r0.<init>()
            return
    }

    @Override // defpackage.InterfaceC0702
    /* JADX INFO: renamed from: ᛲᛲᛵ */
    public java.lang.Object mo1591() {
            r0 = this;
            ᛵᛲᛲ r0 = new ᛵᛲᛲ
            r0.<init>()
            return r0
    }

    @Override // defpackage.InterfaceC1429
    /* JADX INFO: renamed from: ᛲᛴᲇᛳ */
    public void mo2293(int r3, java.lang.Object r4) {
            r2 = this;
            switch(r3) {
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
            java.lang.String r2 = ""
            goto L23
        L6:
            java.lang.String r2 = "RESULT_DELETE_SKIP_FILE_SUCCESS"
            goto L23
        L9:
            java.lang.String r2 = "RESULT_INSTALL_SKIP_FILE_SUCCESS"
            goto L23
        Lc:
            java.lang.String r2 = "RESULT_PARSE_EXCEPTION"
            goto L23
        Lf:
            java.lang.String r2 = "RESULT_IO_EXCEPTION"
            goto L23
        L12:
            java.lang.String r2 = "RESULT_BASELINE_PROFILE_NOT_FOUND"
            goto L23
        L15:
            java.lang.String r2 = "RESULT_DESIRED_FORMAT_UNSUPPORTED"
            goto L23
        L18:
            java.lang.String r2 = "RESULT_NOT_WRITABLE"
            goto L23
        L1b:
            java.lang.String r2 = "RESULT_UNSUPPORTED_ART_VERSION"
            goto L23
        L1e:
            java.lang.String r2 = "RESULT_ALREADY_INSTALLED"
            goto L23
        L21:
            java.lang.String r2 = "RESULT_INSTALL_SUCCESS"
        L23:
            r0 = 6
            java.lang.String r1 = "ProfileInstaller"
            if (r3 == r0) goto L33
            r0 = 7
            if (r3 == r0) goto L33
            r0 = 8
            if (r3 == r0) goto L33
            android.util.Log.d(r1, r2)
            return
        L33:
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            android.util.Log.e(r1, r2, r4)
            return
    }

    @Override // defpackage.InterfaceC1029
    /* JADX INFO: renamed from: ᛷᛲᲇᲈ */
    public void mo1982(android.media.MediaExtractor r1, java.lang.Object r2) {
            r0 = this;
            java.nio.ByteBuffer r2 = (java.nio.ByteBuffer) r2
            ᛶᛱᛴᛲ r0 = new ᛶᛱᛴᛲ
            r0.<init>(r2)
            r1.setDataSource(r0)
            return
    }

    @Override // defpackage.InterfaceC1029
    /* JADX INFO: renamed from: ᛷᛸᛵᲇ */
    public void mo1983(android.media.MediaMetadataRetriever r1, java.lang.Object r2) {
            r0 = this;
            java.nio.ByteBuffer r2 = (java.nio.ByteBuffer) r2
            ᛶᛱᛴᛲ r0 = new ᛶᛱᛴᛲ
            r0.<init>(r2)
            r1.setDataSource(r0)
            return
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public defpackage.C0682 m3354(android.content.Context r4) {
            r3 = this;
            r0 = -771707123441198(0xfffd4222ef0961d2, double:NaN)
            ᛴᛵᲇᲇ r0 = defpackage.C0682.f3281
            if (r0 != 0) goto L2b
            monitor-enter(r3)
            ᛴᛵᲇᲇ r0 = defpackage.C0682.f3281     // Catch: java.lang.Throwable -> L25
            if (r0 != 0) goto L27
            ᛴᛵᲇᲇ r0 = new ᛴᛵᲇᲇ     // Catch: java.lang.Throwable -> L25
            android.content.Context r4 = r4.getApplicationContext()     // Catch: java.lang.Throwable -> L25
            r1 = -771741483179566(0xfffd421aef0961d2, double:NaN)
            r0.<init>(r4)     // Catch: java.lang.Throwable -> L25
            defpackage.C0682.f3281 = r0     // Catch: java.lang.Throwable -> L25
            goto L27
        L25:
            r4 = move-exception
            goto L29
        L27:
            monitor-exit(r3)
            return r0
        L29:
            monitor-exit(r3)
            throw r4
        L2b:
            return r0
    }

    @Override // defpackage.InterfaceC0953
    /* JADX INFO: renamed from: ᛸᛵᛸᛷ */
    public boolean mo1902(java.lang.Object r1) {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // defpackage.InterfaceC2245
    /* JADX INFO: renamed from: ᲀᛳᲀᛵ */
    public void mo2296() {
            r0 = this;
            ᲈᛴᛵᲈ r0 = defpackage.AbstractC0042.f556
            return
    }

    @Override // defpackage.InterfaceC0696
    /* JADX INFO: renamed from: ᲇᛸᲁᛱ */
    public defpackage.InterfaceC2267 mo365(defpackage.C1326 r3) {
            r2 = this;
            int r2 = r2.f8368
            switch(r2) {
                case 9: goto L13;
                default: goto L5;
            }
        L5:
            ᲈᲇᲁᛳ r2 = new ᲈᲇᲁᛳ
            java.lang.Class<ᲈᛸᛳᛲ> r0 = defpackage.C2302.class
            java.lang.Class<java.io.InputStream> r1 = java.io.InputStream.class
            ᲈᛶᲀᛳ r3 = r3.m2475(r0, r1)
            r2.<init>(r3)
            return r2
        L13:
            ᲇᛱᛱᛷ r2 = new ᲇᛱᛱᛷ
            java.lang.Class<android.net.Uri> r0 = android.net.Uri.class
            java.lang.Class<android.os.ParcelFileDescriptor> r1 = android.os.ParcelFileDescriptor.class
            ᲈᛶᲀᛳ r3 = r3.m2475(r0, r1)
            r0 = 0
            r2.<init>(r3, r0)
            return r2
    }

    @Override // defpackage.InterfaceC1429
    /* JADX INFO: renamed from: ᲈᲈᛸᲁ */
    public void mo2301() {
            r1 = this;
            java.lang.String r1 = "DIAGNOSTIC_PROFILE_IS_COMPRESSED"
            java.lang.String r0 = "ProfileInstaller"
            android.util.Log.d(r0, r1)
            return
    }
}
