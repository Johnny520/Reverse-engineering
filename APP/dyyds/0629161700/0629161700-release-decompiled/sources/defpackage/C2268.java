package defpackage;

/* JADX INFO: renamed from: ᲈᛶᲀᛴ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C2268 implements defpackage.InterfaceC0204 {

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public static final java.lang.String[] f9607 = null;

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public java.lang.Object f9608;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final java.lang.Object f9609;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final /* synthetic */ int f9610;

    static {
            java.lang.String r0 = "_data"
            java.lang.String[] r0 = new java.lang.String[]{r0}
            defpackage.C2268.f9607 = r0
            return
    }

    public /* synthetic */ C2268(java.lang.Object r1, int r2, java.lang.Object r3) {
            r0 = this;
            r0.f9610 = r2
            r0.f9609 = r1
            r0.f9608 = r3
            r0.<init>()
            return
    }

    public C2268(java.lang.String r1, defpackage.C1654 r2) {
            r0 = this;
            r2 = 2
            r0.f9610 = r2
            r0.<init>()
            r0.f9609 = r1
            return
    }

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    private final void m3688() {
            r0 = this;
            return
    }

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    private final void m3689() {
            r0 = this;
            return
    }

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    private final void m3690() {
            r0 = this;
            return
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    private final void m3691() {
            r0 = this;
            return
    }

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    private final void m3692() {
            r0 = this;
            return
    }

    @Override // defpackage.InterfaceC0204
    public final void cancel() {
            r0 = this;
            int r0 = r0.f9610
            return
    }

    @Override // defpackage.InterfaceC0204
    /* JADX INFO: renamed from: ᛷᛲᲇᲈ */
    public final void mo753(defpackage.EnumC1307 r8, defpackage.InterfaceC0784 r9) {
            r7 = this;
            int r8 = r7.f9610
            java.lang.Object r0 = r7.f9609
            switch(r8) {
                case 0: goto L27;
                case 1: goto L19;
                default: goto L7;
            }
        L7:
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.IllegalArgumentException -> L13
            java.io.ByteArrayInputStream r8 = defpackage.C1654.m3038(r0)     // Catch: java.lang.IllegalArgumentException -> L13
            r7.f9608 = r8     // Catch: java.lang.IllegalArgumentException -> L13
            r9.mo1362(r8)     // Catch: java.lang.IllegalArgumentException -> L13
            goto L18
        L13:
            r0 = move-exception
            r7 = r0
            r9.mo1360(r7)
        L18:
            return
        L19:
            java.lang.Object r7 = r7.f9608
            ᛶᛷᲀᲈ r7 = (defpackage.InterfaceC1117) r7
            byte[] r0 = (byte[]) r0
            java.lang.Object r7 = r7.mo2132(r0)
            r9.mo1362(r7)
            return
        L27:
            android.content.Context r0 = (android.content.Context) r0
            android.content.ContentResolver r1 = r0.getContentResolver()
            java.lang.Object r7 = r7.f9608
            r2 = r7
            android.net.Uri r2 = (android.net.Uri) r2
            r5 = 0
            r6 = 0
            java.lang.String[] r3 = defpackage.C2268.f9607
            r4 = 0
            android.database.Cursor r7 = r1.query(r2, r3, r4, r5, r6)
            r8 = 0
            if (r7 == 0) goto L5a
            boolean r0 = r7.moveToFirst()     // Catch: java.lang.Throwable -> L4f
            if (r0 == 0) goto L52
            java.lang.String r8 = "_data"
            int r8 = r7.getColumnIndexOrThrow(r8)     // Catch: java.lang.Throwable -> L4f
            java.lang.String r8 = r7.getString(r8)     // Catch: java.lang.Throwable -> L4f
            goto L52
        L4f:
            r0 = move-exception
            r8 = r0
            goto L56
        L52:
            r7.close()
            goto L5a
        L56:
            r7.close()
            throw r8
        L5a:
            boolean r7 = android.text.TextUtils.isEmpty(r8)
            if (r7 == 0) goto L77
            java.io.FileNotFoundException r7 = new java.io.FileNotFoundException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r0 = "Failed to find file path for: "
            r8.<init>(r0)
            r8.append(r2)
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            r9.mo1360(r7)
            goto L7f
        L77:
            java.io.File r7 = new java.io.File
            r7.<init>(r8)
            r9.mo1362(r7)
        L7f:
            return
    }

    @Override // defpackage.InterfaceC0204
    /* JADX INFO: renamed from: ᛷᛸᛵᲇ */
    public final void mo754() {
            r1 = this;
            int r0 = r1.f9610
            switch(r0) {
                case 0: goto Lc;
                case 1: goto Lc;
                default: goto L5;
            }
        L5:
            java.lang.Object r1 = r1.f9608     // Catch: java.io.IOException -> Lc
            java.io.ByteArrayInputStream r1 = (java.io.ByteArrayInputStream) r1     // Catch: java.io.IOException -> Lc
            r1.close()     // Catch: java.io.IOException -> Lc
        Lc:
            return
    }

    @Override // defpackage.InterfaceC0204
    /* JADX INFO: renamed from: ᛷᲁᛳᛳ */
    public final java.lang.Class mo646() {
            r1 = this;
            int r0 = r1.f9610
            switch(r0) {
                case 0: goto L11;
                case 1: goto L8;
                default: goto L5;
            }
        L5:
            java.lang.Class<java.io.InputStream> r1 = java.io.InputStream.class
            return r1
        L8:
            java.lang.Object r1 = r1.f9608
            ᛶᛷᲀᲈ r1 = (defpackage.InterfaceC1117) r1
            java.lang.Class r1 = r1.mo1993()
            return r1
        L11:
            java.lang.Class<java.io.File> r1 = java.io.File.class
            return r1
    }

    @Override // defpackage.InterfaceC0204
    /* JADX INFO: renamed from: ᲈᲈᛸᲁ */
    public final int mo755() {
            r0 = this;
            int r0 = r0.f9610
            switch(r0) {
                case 0: goto L9;
                case 1: goto L7;
                default: goto L5;
            }
        L5:
            r0 = 1
            return r0
        L7:
            r0 = 1
            return r0
        L9:
            r0 = 1
            return r0
    }
}
