package defpackage;

/* JADX INFO: renamed from: ᛸᛶᛷᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1512 implements defpackage.InterfaceC0204 {

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final java.lang.Object f6678;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final java.lang.Comparable f6679;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final /* synthetic */ int f6680;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public java.lang.Object f6681;

    public /* synthetic */ C1512(java.lang.Comparable r1, java.lang.Object r2, int r3) {
            r0 = this;
            r0.f6680 = r3
            r0.f6679 = r1
            r0.f6678 = r2
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    private final void m2748() {
            r0 = this;
            return
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public static defpackage.C1512 m2749(android.content.Context r3, android.net.Uri r4, defpackage.C2220 r5) {
            com.bumptech.glide.ᛷᲁᛳᛳ r0 = com.bumptech.glide.ComponentCallbacks2C0007.m235(r3)
            ᲇᛶᛳᛱ r0 = r0.f355
            ᛲᛶᛲᲁ r1 = new ᛲᛶᛲᲁ
            com.bumptech.glide.ᛷᲁᛳᛳ r2 = com.bumptech.glide.ComponentCallbacks2C0007.m235(r3)
            ᛵᛶᛳᲇ r2 = r2.f352
            ᲈᲈᛲᲇ r2 = r2.m1877()
            java.util.ArrayList r2 = r2.m3867()
            android.content.ContentResolver r3 = r3.getContentResolver()
            r1.<init>(r2, r5, r0, r3)
            ᛸᛶᛷᛸ r3 = new ᛸᛶᛷᛸ
            r5 = 1
            r3.<init>(r4, r1, r5)
            return r3
    }

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    private final void m2750() {
            r0 = this;
            return
    }

    @Override // defpackage.InterfaceC0204
    public final void cancel() {
            r0 = this;
            int r0 = r0.f6680
            return
    }

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public java.io.InputStream m2751() {
            r11 = this;
            java.lang.Object r0 = r11.f6678
            ᛲᛶᛲᲁ r0 = (defpackage.C0302) r0
            java.lang.Object r1 = r0.f1618
            android.content.ContentResolver r1 = (android.content.ContentResolver) r1
            java.lang.Comparable r11 = r11.f6679
            android.net.Uri r11 = (android.net.Uri) r11
            java.lang.String r2 = "ThumbStreamOpener"
            java.lang.String r3 = "Failed to query for thumbnail for Uri: "
            r4 = 3
            r5 = 0
            java.lang.Object r6 = r0.f1616     // Catch: java.lang.Throwable -> L38 java.lang.SecurityException -> L3e
            ᲈᛴᛴᲇ r6 = (defpackage.C2220) r6     // Catch: java.lang.Throwable -> L38 java.lang.SecurityException -> L3e
            android.database.Cursor r6 = r6.m3611(r11)     // Catch: java.lang.Throwable -> L38 java.lang.SecurityException -> L3b
            if (r6 == 0) goto L31
            boolean r7 = r6.moveToFirst()     // Catch: java.lang.Throwable -> L2b java.lang.SecurityException -> L2f
            if (r7 == 0) goto L31
            r7 = 0
            java.lang.String r3 = r6.getString(r7)     // Catch: java.lang.Throwable -> L2b java.lang.SecurityException -> L2f
            r6.close()
            goto L59
        L2b:
            r11 = move-exception
            r5 = r6
            goto Leb
        L2f:
            r7 = move-exception
            goto L41
        L31:
            if (r6 == 0) goto L36
        L33:
            r6.close()
        L36:
            r3 = r5
            goto L59
        L38:
            r11 = move-exception
            goto Leb
        L3b:
            r7 = move-exception
        L3c:
            r6 = r5
            goto L41
        L3e:
            r6 = move-exception
            r7 = r6
            goto L3c
        L41:
            boolean r8 = android.util.Log.isLoggable(r2, r4)     // Catch: java.lang.Throwable -> L2b
            if (r8 == 0) goto L56
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2b
            r8.<init>(r3)     // Catch: java.lang.Throwable -> L2b
            r8.append(r11)     // Catch: java.lang.Throwable -> L2b
            java.lang.String r3 = r8.toString()     // Catch: java.lang.Throwable -> L2b
            android.util.Log.d(r2, r3, r7)     // Catch: java.lang.Throwable -> L2b
        L56:
            if (r6 == 0) goto L36
            goto L33
        L59:
            boolean r6 = android.text.TextUtils.isEmpty(r3)
            if (r6 == 0) goto L61
        L5f:
            r3 = r5
            goto La2
        L61:
            java.io.File r6 = new java.io.File
            r6.<init>(r3)
            boolean r3 = r6.exists()
            if (r3 == 0) goto L5f
            r7 = 0
            long r9 = r6.length()
            int r3 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r3 >= 0) goto L5f
            android.net.Uri r3 = android.net.Uri.fromFile(r6)
            java.io.InputStream r3 = r1.openInputStream(r3)     // Catch: java.lang.NullPointerException -> L7f
            goto La2
        L7f:
            r0 = move-exception
            java.io.FileNotFoundException r1 = new java.io.FileNotFoundException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "NPE opening uri: "
            r2.<init>(r4)
            r2.append(r11)
            java.lang.String r11 = " -> "
            r2.append(r11)
            r2.append(r3)
            java.lang.String r11 = r2.toString()
            r1.<init>(r11)
            java.lang.Throwable r11 = r1.initCause(r0)
            java.io.FileNotFoundException r11 = (java.io.FileNotFoundException) r11
            throw r11
        La2:
            r6 = -1
            if (r3 == 0) goto Le1
            java.lang.String r7 = "Failed to open uri: "
            java.io.InputStream r5 = r1.openInputStream(r11)     // Catch: java.lang.Throwable -> Lbd java.lang.Throwable -> Lbf
            java.lang.Object r1 = r0.f1619     // Catch: java.lang.Throwable -> Lbd java.lang.Throwable -> Lbf
            java.util.ArrayList r1 = (java.util.ArrayList) r1     // Catch: java.lang.Throwable -> Lbd java.lang.Throwable -> Lbf
            java.lang.Object r0 = r0.f1615     // Catch: java.lang.Throwable -> Lbd java.lang.Throwable -> Lbf
            ᲇᛶᛳᛱ r0 = (defpackage.C2063) r0     // Catch: java.lang.Throwable -> Lbd java.lang.Throwable -> Lbf
            int r11 = defpackage.AbstractC1849.m3257(r1, r5, r0)     // Catch: java.lang.Throwable -> Lbd java.lang.Throwable -> Lbf
            if (r5 == 0) goto Le2
            r5.close()     // Catch: java.io.IOException -> Le2
            goto Le2
        Lbd:
            r11 = move-exception
            goto Ldb
        Lbf:
            r0 = move-exception
            boolean r1 = android.util.Log.isLoggable(r2, r4)     // Catch: java.lang.Throwable -> Lbd
            if (r1 == 0) goto Ld5
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lbd
            r1.<init>(r7)     // Catch: java.lang.Throwable -> Lbd
            r1.append(r11)     // Catch: java.lang.Throwable -> Lbd
            java.lang.String r11 = r1.toString()     // Catch: java.lang.Throwable -> Lbd
            android.util.Log.d(r2, r11, r0)     // Catch: java.lang.Throwable -> Lbd
        Ld5:
            if (r5 == 0) goto Le1
            r5.close()     // Catch: java.io.IOException -> Le1
            goto Le1
        Ldb:
            if (r5 == 0) goto Le0
            r5.close()     // Catch: java.io.IOException -> Le0
        Le0:
            throw r11
        Le1:
            r11 = r6
        Le2:
            if (r11 == r6) goto Lea
            ᛶᲇᛱᛳ r0 = new ᛶᲇᛱᛳ
            r0.<init>(r3, r11)
            r3 = r0
        Lea:
            return r3
        Leb:
            if (r5 == 0) goto Lf0
            r5.close()
        Lf0:
            throw r11
    }

    @Override // defpackage.InterfaceC0204
    /* JADX INFO: renamed from: ᛷᛲᲇᲈ */
    public final void mo753(defpackage.EnumC1307 r3, defpackage.InterfaceC0784 r4) {
            r2 = this;
            int r3 = r2.f6680
            r0 = 3
            switch(r3) {
                case 0: goto L22;
                default: goto L6;
            }
        L6:
            java.io.InputStream r3 = r2.m2751()     // Catch: java.io.FileNotFoundException -> L10
            r2.f6681 = r3     // Catch: java.io.FileNotFoundException -> L10
            r4.mo1362(r3)     // Catch: java.io.FileNotFoundException -> L10
            goto L21
        L10:
            r2 = move-exception
            java.lang.String r3 = "MediaStoreThumbFetcher"
            boolean r0 = android.util.Log.isLoggable(r3, r0)
            if (r0 == 0) goto L1e
            java.lang.String r0 = "Failed to find thumbnail file"
            android.util.Log.d(r3, r0, r2)
        L1e:
            r4.mo1360(r2)
        L21:
            return
        L22:
            java.lang.Object r3 = r2.f6678     // Catch: java.io.FileNotFoundException -> L34
            ᛶᛳᛵᛵ r3 = (defpackage.InterfaceC1035) r3     // Catch: java.io.FileNotFoundException -> L34
            java.lang.Comparable r1 = r2.f6679     // Catch: java.io.FileNotFoundException -> L34
            java.io.File r1 = (java.io.File) r1     // Catch: java.io.FileNotFoundException -> L34
            java.lang.Object r3 = r3.mo1995(r1)     // Catch: java.io.FileNotFoundException -> L34
            r2.f6681 = r3     // Catch: java.io.FileNotFoundException -> L34
            r4.mo1362(r3)     // Catch: java.io.FileNotFoundException -> L34
            goto L45
        L34:
            r2 = move-exception
            java.lang.String r3 = "FileLoader"
            boolean r0 = android.util.Log.isLoggable(r3, r0)
            if (r0 == 0) goto L42
            java.lang.String r0 = "Failed to open file"
            android.util.Log.d(r3, r0, r2)
        L42:
            r4.mo1360(r2)
        L45:
            return
    }

    @Override // defpackage.InterfaceC0204
    /* JADX INFO: renamed from: ᛷᛸᛵᲇ */
    public final void mo754() {
            r1 = this;
            int r0 = r1.f6680
            switch(r0) {
                case 0: goto Lf;
                default: goto L5;
            }
        L5:
            java.lang.Object r1 = r1.f6681
            java.io.InputStream r1 = (java.io.InputStream) r1
            if (r1 == 0) goto Le
            r1.close()     // Catch: java.io.IOException -> Le
        Le:
            return
        Lf:
            java.lang.Object r0 = r1.f6681
            if (r0 == 0) goto L1a
            java.lang.Object r1 = r1.f6678     // Catch: java.io.IOException -> L1a
            ᛶᛳᛵᛵ r1 = (defpackage.InterfaceC1035) r1     // Catch: java.io.IOException -> L1a
            r1.mo1994(r0)     // Catch: java.io.IOException -> L1a
        L1a:
            return
    }

    @Override // defpackage.InterfaceC0204
    /* JADX INFO: renamed from: ᛷᲁᛳᛳ */
    public final java.lang.Class mo646() {
            r1 = this;
            int r0 = r1.f6680
            switch(r0) {
                case 0: goto L8;
                default: goto L5;
            }
        L5:
            java.lang.Class<java.io.InputStream> r1 = java.io.InputStream.class
            return r1
        L8:
            java.lang.Object r1 = r1.f6678
            ᛶᛳᛵᛵ r1 = (defpackage.InterfaceC1035) r1
            java.lang.Class r1 = r1.mo1993()
            return r1
    }

    @Override // defpackage.InterfaceC0204
    /* JADX INFO: renamed from: ᲈᲈᛸᲁ */
    public final int mo755() {
            r0 = this;
            int r0 = r0.f6680
            switch(r0) {
                case 0: goto L7;
                default: goto L5;
            }
        L5:
            r0 = 1
            return r0
        L7:
            r0 = 1
            return r0
    }
}
