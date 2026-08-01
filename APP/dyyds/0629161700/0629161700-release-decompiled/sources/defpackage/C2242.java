package defpackage;

/* JADX INFO: renamed from: ᲈᛵᛶᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C2242 implements defpackage.InterfaceC0204 {

    /* JADX INFO: renamed from: ᛶᛷᛱᲀ, reason: contains not printable characters */
    public static final java.lang.String[] f9549 = null;

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public final int f9550;

    /* JADX INFO: renamed from: ᛲᛲᛵ, reason: contains not printable characters */
    public volatile boolean f9551;

    /* JADX INFO: renamed from: ᛲᛴᛱᛶ, reason: contains not printable characters */
    public volatile defpackage.InterfaceC0204 f9552;

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public final defpackage.C0533 f9553;

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final defpackage.InterfaceC2267 f9554;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final defpackage.InterfaceC2267 f9555;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final android.content.Context f9556;

    /* JADX INFO: renamed from: ᛸᛵᛸᛷ, reason: contains not printable characters */
    public final java.lang.Class f9557;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public final android.net.Uri f9558;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public final int f9559;

    static {
            java.lang.String r0 = "_data"
            java.lang.String[] r0 = new java.lang.String[]{r0}
            defpackage.C2242.f9549 = r0
            return
    }

    public C2242(android.content.Context r1, defpackage.InterfaceC2267 r2, defpackage.InterfaceC2267 r3, android.net.Uri r4, int r5, int r6, defpackage.C0533 r7, java.lang.Class r8) {
            r0 = this;
            r0.<init>()
            android.content.Context r1 = r1.getApplicationContext()
            r0.f9556 = r1
            r0.f9555 = r2
            r0.f9554 = r3
            r0.f9558 = r4
            r0.f9559 = r5
            r0.f9550 = r6
            r0.f9553 = r7
            r0.f9557 = r8
            return
    }

    @Override // defpackage.InterfaceC0204
    public final void cancel() {
            r1 = this;
            r0 = 1
            r1.f9551 = r0
            ᛱᲇᲀᛴ r1 = r1.f9552
            if (r1 == 0) goto La
            r1.cancel()
        La:
            return
    }

    @Override // defpackage.InterfaceC0204
    /* JADX INFO: renamed from: ᛷᛲᲇᲈ */
    public final void mo753(defpackage.EnumC1307 r3, defpackage.InterfaceC0784 r4) {
            r2 = this;
            java.lang.String r0 = "Failed to build fetcher for: "
            ᛱᲇᲀᛴ r1 = r2.m3631()     // Catch: java.io.FileNotFoundException -> L1f
            if (r1 != 0) goto L21
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException     // Catch: java.io.FileNotFoundException -> L1f
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.io.FileNotFoundException -> L1f
            r1.<init>(r0)     // Catch: java.io.FileNotFoundException -> L1f
            android.net.Uri r2 = r2.f9558     // Catch: java.io.FileNotFoundException -> L1f
            r1.append(r2)     // Catch: java.io.FileNotFoundException -> L1f
            java.lang.String r2 = r1.toString()     // Catch: java.io.FileNotFoundException -> L1f
            r3.<init>(r2)     // Catch: java.io.FileNotFoundException -> L1f
            r4.mo1360(r3)     // Catch: java.io.FileNotFoundException -> L1f
            return
        L1f:
            r2 = move-exception
            goto L2f
        L21:
            r2.f9552 = r1     // Catch: java.io.FileNotFoundException -> L1f
            boolean r0 = r2.f9551     // Catch: java.io.FileNotFoundException -> L1f
            if (r0 == 0) goto L2b
            r2.cancel()     // Catch: java.io.FileNotFoundException -> L1f
            return
        L2b:
            r1.mo753(r3, r4)     // Catch: java.io.FileNotFoundException -> L1f
            return
        L2f:
            r4.mo1360(r2)
            return
    }

    @Override // defpackage.InterfaceC0204
    /* JADX INFO: renamed from: ᛷᛸᛵᲇ */
    public final void mo754() {
            r0 = this;
            ᛱᲇᲀᛴ r0 = r0.f9552
            if (r0 == 0) goto L7
            r0.mo754()
        L7:
            return
    }

    @Override // defpackage.InterfaceC0204
    /* JADX INFO: renamed from: ᛷᲁᛳᛳ */
    public final java.lang.Class mo646() {
            r0 = this;
            java.lang.Class r0 = r0.f9557
            return r0
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final defpackage.InterfaceC0204 m3631() {
            r12 = this;
            boolean r0 = android.os.Environment.isExternalStorageLegacy()
            android.net.Uri r2 = r12.f9558
            r7 = 0
            ᛳᛸᲁᛶ r8 = r12.f9553
            int r9 = r12.f9550
            int r10 = r12.f9559
            if (r0 == 0) goto L79
            java.lang.String r0 = "Failed to media store entry for: "
            java.lang.String r11 = "File path was empty in media store for: "
            android.content.Context r1 = r12.f9556     // Catch: java.lang.Throwable -> L71
            android.content.ContentResolver r1 = r1.getContentResolver()     // Catch: java.lang.Throwable -> L71
            java.lang.String[] r3 = defpackage.C2242.f9549     // Catch: java.lang.Throwable -> L71
            r5 = 0
            r6 = 0
            r4 = 0
            android.database.Cursor r1 = r1.query(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L71
            if (r1 == 0) goto L5f
            boolean r3 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L49
            if (r3 == 0) goto L5f
            java.lang.String r0 = "_data"
            int r0 = r1.getColumnIndexOrThrow(r0)     // Catch: java.lang.Throwable -> L49
            java.lang.String r0 = r1.getString(r0)     // Catch: java.lang.Throwable -> L49
            boolean r3 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L49
            if (r3 != 0) goto L4d
            java.io.File r2 = new java.io.File     // Catch: java.lang.Throwable -> L49
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L49
            r1.close()
            ᲈᛶᲀᛳ r12 = r12.f9555
            ᛳᛱᛱᛲ r12 = r12.mo1266(r2, r10, r9, r8)
            goto L7f
        L49:
            r0 = move-exception
            r12 = r0
            r7 = r1
            goto L73
        L4d:
            java.io.FileNotFoundException r12 = new java.io.FileNotFoundException     // Catch: java.lang.Throwable -> L49
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L49
            r0.<init>(r11)     // Catch: java.lang.Throwable -> L49
            r0.append(r2)     // Catch: java.lang.Throwable -> L49
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L49
            r12.<init>(r0)     // Catch: java.lang.Throwable -> L49
            throw r12     // Catch: java.lang.Throwable -> L49
        L5f:
            java.io.FileNotFoundException r12 = new java.io.FileNotFoundException     // Catch: java.lang.Throwable -> L49
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L49
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L49
            r3.append(r2)     // Catch: java.lang.Throwable -> L49
            java.lang.String r0 = r3.toString()     // Catch: java.lang.Throwable -> L49
            r12.<init>(r0)     // Catch: java.lang.Throwable -> L49
            throw r12     // Catch: java.lang.Throwable -> L49
        L71:
            r0 = move-exception
            r12 = r0
        L73:
            if (r7 == 0) goto L78
            r7.close()
        L78:
            throw r12
        L79:
            ᲈᛶᲀᛳ r12 = r12.f9554
            ᛳᛱᛱᛲ r12 = r12.mo1266(r2, r10, r9, r8)
        L7f:
            if (r12 == 0) goto L84
            ᛱᲇᲀᛴ r12 = r12.f2058
            return r12
        L84:
            return r7
    }

    @Override // defpackage.InterfaceC0204
    /* JADX INFO: renamed from: ᲈᲈᛸᲁ */
    public final int mo755() {
            r0 = this;
            r0 = 1
            return r0
    }
}
