package defpackage;

/* JADX INFO: renamed from: ᲈᛴᛵᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C2223 implements defpackage.InterfaceC0267, defpackage.InterfaceC0468, defpackage.InterfaceC1429, defpackage.InterfaceC0702, defpackage.InterfaceC1914, defpackage.InterfaceC1401, defpackage.InterfaceC0696, defpackage.InterfaceC1343, defpackage.InterfaceC1029 {

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final /* synthetic */ int f9483;

    public /* synthetic */ C2223(int r1) {
            r0 = this;
            r0.f9483 = r1
            r0.<init>()
            return
    }

    @Override // defpackage.InterfaceC1401
    public void onScrollLimit(int r1, int r2, int r3, boolean r4) {
            r0 = this;
            return
    }

    @Override // defpackage.InterfaceC1401
    public void onScrollProgress(int r1, int r2, int r3, int r4) {
            r0 = this;
            return
    }

    @Override // defpackage.InterfaceC0702
    /* JADX INFO: renamed from: ᛲᛲᛵ */
    public java.lang.Object mo1591() {
            r1 = this;
            ᛶᛷᲀᛴ r1 = new ᛶᛷᲀᛴ     // Catch: java.security.NoSuchAlgorithmException -> Lc
            java.lang.String r0 = "SHA-256"
            java.security.MessageDigest r0 = java.security.MessageDigest.getInstance(r0)     // Catch: java.security.NoSuchAlgorithmException -> Lc
            r1.<init>(r0)     // Catch: java.security.NoSuchAlgorithmException -> Lc
            return r1
        Lc:
            r1 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
    }

    @Override // defpackage.InterfaceC1429
    /* JADX INFO: renamed from: ᛲᛴᲇᛳ */
    public void mo2293(int r1, java.lang.Object r2) {
            r0 = this;
            return
    }

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public void m3615(defpackage.InterfaceC0270 r4, java.lang.Object r5) {
            r3 = this;
            ᛷᛶᛷᛲ r5 = (defpackage.C1294) r5
            r0 = -215014937370158(0xffff3c71ef0961d2, double:NaN)
            r0 = -215057887043118(0xffff3c67ef0961d2, double:NaN)
            java.lang.String r3 = r5.f5750
            r0 = 1
            r4.mo527(r0, r3)
            r0 = 2
            java.lang.String r1 = r5.f5752
            r4.mo527(r0, r1)
            r0 = 3
            java.lang.String r1 = r5.f5749
            r4.mo527(r0, r1)
            r0 = 4
            java.lang.String r1 = r5.f5748
            r4.mo527(r0, r1)
            r0 = 5
            java.lang.String r1 = r5.f5747
            r4.mo527(r0, r1)
            r0 = 6
            java.lang.String r1 = r5.f5753
            r4.mo527(r0, r1)
            r0 = 7
            long r1 = r5.f5754
            r4.mo528(r1, r0)
            r0 = 8
            long r1 = r5.f5743
            r4.mo528(r1, r0)
            java.lang.String r0 = r5.f5746
            r1 = 9
            if (r0 != 0) goto L4d
            r4.mo529(r1)
            goto L50
        L4d:
            r4.mo527(r1, r0)
        L50:
            java.lang.String r0 = r5.f5751
            r1 = 10
            if (r0 != 0) goto L5a
            r4.mo529(r1)
            goto L5d
        L5a:
            r4.mo527(r1, r0)
        L5d:
            java.lang.String r0 = r5.f5744
            r1 = 11
            if (r0 != 0) goto L67
            r4.mo529(r1)
            goto L6a
        L67:
            r4.mo527(r1, r0)
        L6a:
            java.lang.String r5 = r5.f5745
            r0 = 12
            if (r5 != 0) goto L74
            r4.mo529(r0)
            goto L77
        L74:
            r4.mo527(r0, r5)
        L77:
            r5 = 13
            r4.mo527(r5, r3)
            return
    }

    @Override // defpackage.InterfaceC1029
    /* JADX INFO: renamed from: ᛷᛲᲇᲈ */
    public void mo1982(android.media.MediaExtractor r7, java.lang.Object r8) {
            r6 = this;
            int r6 = r6.f9483
            switch(r6) {
                case 12: goto Lf;
                default: goto L5;
            }
        L5:
            android.os.ParcelFileDescriptor r8 = (android.os.ParcelFileDescriptor) r8
            java.io.FileDescriptor r6 = r8.getFileDescriptor()
            r7.setDataSource(r6)
            return
        Lf:
            android.content.res.AssetFileDescriptor r8 = (android.content.res.AssetFileDescriptor) r8
            java.io.FileDescriptor r1 = r8.getFileDescriptor()
            long r2 = r8.getStartOffset()
            long r4 = r8.getLength()
            r0 = r7
            r0.setDataSource(r1, r2, r4)
            return
    }

    @Override // defpackage.InterfaceC1029
    /* JADX INFO: renamed from: ᛷᛸᛵᲇ */
    public void mo1983(android.media.MediaMetadataRetriever r7, java.lang.Object r8) {
            r6 = this;
            int r6 = r6.f9483
            switch(r6) {
                case 12: goto Lf;
                default: goto L5;
            }
        L5:
            android.os.ParcelFileDescriptor r8 = (android.os.ParcelFileDescriptor) r8
            java.io.FileDescriptor r6 = r8.getFileDescriptor()
            r7.setDataSource(r6)
            return
        Lf:
            android.content.res.AssetFileDescriptor r8 = (android.content.res.AssetFileDescriptor) r8
            java.io.FileDescriptor r1 = r8.getFileDescriptor()
            long r2 = r8.getStartOffset()
            long r4 = r8.getLength()
            r0 = r7
            r0.setDataSource(r1, r2, r4)
            return
    }

    @Override // defpackage.InterfaceC0267
    /* JADX INFO: renamed from: ᛷᲁᛳᛳ */
    public defpackage.InterfaceC0150 mo884(java.lang.String r1) {
            r0 = this;
            ᛵᛷᛳᛲ r0 = defpackage.C0925.f4184
            return r0
    }

    @Override // defpackage.InterfaceC0468
    /* JADX INFO: renamed from: ᲇᛶᛵᲇ */
    public void mo661(byte[] r1, java.lang.Object r2, java.security.MessageDigest r3) {
            r0 = this;
            return
    }

    @Override // defpackage.InterfaceC0696
    /* JADX INFO: renamed from: ᲇᛸᲁᛱ */
    public defpackage.InterfaceC2267 mo365(defpackage.C1326 r3) {
            r2 = this;
            int r2 = r2.f9483
            switch(r2) {
                case 9: goto L14;
                default: goto L5;
            }
        L5:
            ᲇᛱᛱᛷ r2 = new ᲇᛱᛱᛷ
            java.lang.Class<ᲈᛸᛳᛲ> r0 = defpackage.C2302.class
            java.lang.Class<java.io.InputStream> r1 = java.io.InputStream.class
            ᲈᛶᲀᛳ r3 = r3.m2475(r0, r1)
            r0 = 1
            r2.<init>(r3, r0)
            return r2
        L14:
            ᲇᛱᛱᛷ r2 = new ᲇᛱᛱᛷ
            java.lang.Class<android.net.Uri> r0 = android.net.Uri.class
            java.lang.Class<android.content.res.AssetFileDescriptor> r1 = android.content.res.AssetFileDescriptor.class
            ᲈᛶᲀᛳ r3 = r3.m2475(r0, r1)
            r0 = 0
            r2.<init>(r3, r0)
            return r2
    }

    @Override // defpackage.InterfaceC1429
    /* JADX INFO: renamed from: ᲈᲈᛸᲁ */
    public void mo2301() {
            r0 = this;
            return
    }
}
