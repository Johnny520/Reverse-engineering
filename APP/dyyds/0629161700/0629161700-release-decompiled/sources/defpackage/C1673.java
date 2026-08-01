package defpackage;

/* JADX INFO: renamed from: ᲀᛵᛴᛴ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1673 extends android.database.sqlite.SQLiteOpenHelper {

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public static final /* synthetic */ int f7459 = 0;

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public boolean f7460;

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final defpackage.C2073 f7461;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final defpackage.C1606 f7462;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final android.content.Context f7463;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public boolean f7464;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public final defpackage.C1080 f7465;

    public C1673(android.content.Context r7, java.lang.String r8, defpackage.C1606 r9, defpackage.C2073 r10) {
            r6 = this;
            int r4 = r10.f8901
            ᛴᛸᛸᛲ r5 = new ᛴᛸᛸᛲ
            r5.<init>(r10, r9)
            r3 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            r0.<init>(r1, r2, r3, r4, r5)
            r0.f7463 = r1
            r0.f7462 = r9
            r0.f7461 = r10
            ᛶᛵᲁᲀ r6 = new ᛶᛵᲁᲀ
            if (r2 != 0) goto L21
            java.util.UUID r7 = java.util.UUID.randomUUID()
            java.lang.String r8 = r7.toString()
            goto L22
        L21:
            r8 = r2
        L22:
            java.io.File r7 = r1.getCacheDir()
            r9 = 0
            r6.<init>(r8, r7, r9)
            r0.f7465 = r6
            return
    }

    @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
    public final void close() {
            r3 = this;
            ᛶᛵᲁᲀ r0 = r3.f7465
            boolean r1 = r0.f4861     // Catch: java.lang.Throwable -> L16
            r0.m2059(r1)     // Catch: java.lang.Throwable -> L16
            super.close()     // Catch: java.lang.Throwable -> L16
            ᛸᲈᛸᲈ r1 = r3.f7462     // Catch: java.lang.Throwable -> L16
            r2 = 0
            r1.f7101 = r2     // Catch: java.lang.Throwable -> L16
            r1 = 0
            r3.f7460 = r1     // Catch: java.lang.Throwable -> L16
            r0.m2060()
            return
        L16:
            r3 = move-exception
            r0.m2060()
            throw r3
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(android.database.sqlite.SQLiteDatabase r4) {
            r3 = this;
            boolean r0 = r3.f7464
            r1 = 1
            if (r0 != 0) goto L12
            ᲇᛶᲀᛸ r0 = r3.f7461
            int r0 = r0.f8901
            int r2 = r4.getVersion()
            if (r0 == r2) goto L12
            r4.setMaxSqlCacheSize(r1)
        L12:
            r3.m3066(r4)     // Catch: java.lang.Throwable -> L16
            return
        L16:
            r3 = move-exception
            ᛳᲀᛴᛵ r4 = new ᛳᲀᛴᛵ
            r4.<init>(r1, r3)
            throw r4
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(android.database.sqlite.SQLiteDatabase r2) {
            r1 = this;
            ᲇᛶᲀᛸ r0 = r1.f7461     // Catch: java.lang.Throwable -> L13
            ᛴᛲᲈᲀ r1 = r1.m3066(r2)     // Catch: java.lang.Throwable -> L13
            java.lang.Object r2 = r0.f8900     // Catch: java.lang.Throwable -> L13
            ᲁᛸᲀᛸ r2 = (defpackage.C1902) r2     // Catch: java.lang.Throwable -> L13
            ᛲᛳᛲᛸ r0 = new ᛲᛳᛲᛸ     // Catch: java.lang.Throwable -> L13
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L13
            r2.m3334(r0)     // Catch: java.lang.Throwable -> L13
            return
        L13:
            r1 = move-exception
            ᛳᲀᛴᛵ r2 = new ᛳᲀᛴᛵ
            r0 = 2
            r2.<init>(r0, r1)
            throw r2
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(android.database.sqlite.SQLiteDatabase r2, int r3, int r4) {
            r1 = this;
            r0 = 1
            r1.f7464 = r0
            ᲇᛶᲀᛸ r0 = r1.f7461     // Catch: java.lang.Throwable -> Ld
            ᛴᛲᲈᲀ r1 = r1.m3066(r2)     // Catch: java.lang.Throwable -> Ld
            r0.m3498(r1, r3, r4)     // Catch: java.lang.Throwable -> Ld
            return
        Ld:
            r1 = move-exception
            ᛳᲀᛴᛵ r2 = new ᛳᲀᛴᛵ
            r3 = 4
            r2.<init>(r3, r1)
            throw r2
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(android.database.sqlite.SQLiteDatabase r3) {
            r2 = this;
            boolean r0 = r2.f7464
            if (r0 != 0) goto L21
            ᲇᛶᲀᛸ r0 = r2.f7461     // Catch: java.lang.Throwable -> L19
            ᛴᛲᲈᲀ r3 = r2.m3066(r3)     // Catch: java.lang.Throwable -> L19
            java.lang.Object r0 = r0.f8900     // Catch: java.lang.Throwable -> L19
            ᲁᛸᲀᛸ r0 = (defpackage.C1902) r0     // Catch: java.lang.Throwable -> L19
            ᛲᛳᛲᛸ r1 = new ᛲᛳᛲᛸ     // Catch: java.lang.Throwable -> L19
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L19
            r0.m3332(r1)     // Catch: java.lang.Throwable -> L19
            r0.f8257 = r3     // Catch: java.lang.Throwable -> L19
            goto L21
        L19:
            r2 = move-exception
            ᛳᲀᛴᛵ r3 = new ᛳᲀᛴᛵ
            r0 = 5
            r3.<init>(r0, r2)
            throw r3
        L21:
            r3 = 1
            r2.f7460 = r3
            return
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(android.database.sqlite.SQLiteDatabase r2, int r3, int r4) {
            r1 = this;
            r0 = 1
            r1.f7464 = r0
            ᲇᛶᲀᛸ r0 = r1.f7461     // Catch: java.lang.Throwable -> Ld
            ᛴᛲᲈᲀ r1 = r1.m3066(r2)     // Catch: java.lang.Throwable -> Ld
            r0.m3498(r1, r3, r4)     // Catch: java.lang.Throwable -> Ld
            return
        Ld:
            r1 = move-exception
            ᛳᲀᛴᛵ r2 = new ᛳᲀᛴᛵ
            r3 = 3
            r2.<init>(r3, r1)
            throw r2
    }

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public final android.database.sqlite.SQLiteDatabase m3064(boolean r4) {
            r3 = this;
            java.lang.String r0 = r3.getDatabaseName()
            boolean r1 = r3.f7460
            if (r0 == 0) goto L32
            if (r1 != 0) goto L32
            android.content.Context r1 = r3.f7463
            java.io.File r0 = r1.getDatabasePath(r0)
            java.io.File r0 = r0.getParentFile()
            if (r0 == 0) goto L32
            r0.mkdirs()
            boolean r1 = r0.isDirectory()
            if (r1 != 0) goto L32
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Invalid database parent file, not a directory: "
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.String r1 = "SupportSQLite"
            android.util.Log.w(r1, r0)
        L32:
            if (r4 == 0) goto L39
            android.database.sqlite.SQLiteDatabase r3 = r3.getWritableDatabase()     // Catch: java.lang.Throwable -> L3e
            return r3
        L39:
            android.database.sqlite.SQLiteDatabase r3 = r3.getReadableDatabase()     // Catch: java.lang.Throwable -> L3e
            return r3
        L3e:
            r0 = 500(0x1f4, double:2.47E-321)
            java.lang.Thread.sleep(r0)     // Catch: java.lang.InterruptedException -> L43
        L43:
            if (r4 == 0) goto L4a
            android.database.sqlite.SQLiteDatabase r3 = r3.getWritableDatabase()     // Catch: java.lang.Throwable -> L4f
            goto L4e
        L4a:
            android.database.sqlite.SQLiteDatabase r3 = r3.getReadableDatabase()     // Catch: java.lang.Throwable -> L4f
        L4e:
            return r3
        L4f:
            r3 = move-exception
            boolean r4 = r3 instanceof defpackage.C0541
            if (r4 == 0) goto L79
            ᛳᲀᛴᛵ r3 = (defpackage.C0541) r3
            int r4 = r3.f2667
            int r4 = defpackage.AbstractC0225.m812(r4)
            java.lang.Throwable r3 = r3.f2666
            if (r4 == 0) goto L78
            r0 = 1
            if (r4 == r0) goto L78
            r0 = 2
            if (r4 == r0) goto L78
            r0 = 3
            if (r4 == r0) goto L78
            r0 = 4
            if (r4 != r0) goto L72
            boolean r4 = r3 instanceof android.database.sqlite.SQLiteException
            if (r4 == 0) goto L71
            goto L79
        L71:
            throw r3
        L72:
            ᛸᛵᛳᲀ r3 = new ᛸᛵᛳᲀ
            r3.<init>()
            throw r3
        L78:
            throw r3
        L79:
            throw r3
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final defpackage.C0633 m3065(boolean r4) {
            r3 = this;
            ᛶᛵᲁᲀ r0 = r3.f7465
            boolean r1 = r3.f7460     // Catch: java.lang.Throwable -> Lf
            r2 = 0
            if (r1 != 0) goto L11
            java.lang.String r1 = r3.getDatabaseName()     // Catch: java.lang.Throwable -> Lf
            if (r1 == 0) goto L11
            r1 = 1
            goto L12
        Lf:
            r3 = move-exception
            goto L32
        L11:
            r1 = r2
        L12:
            r0.m2059(r1)     // Catch: java.lang.Throwable -> Lf
            r3.f7464 = r2     // Catch: java.lang.Throwable -> Lf
            android.database.sqlite.SQLiteDatabase r1 = r3.m3064(r4)     // Catch: java.lang.Throwable -> Lf
            boolean r2 = r3.f7464     // Catch: java.lang.Throwable -> Lf
            if (r2 == 0) goto L2a
            r3.close()     // Catch: java.lang.Throwable -> Lf
            ᛴᛲᲈᲀ r3 = r3.m3065(r4)     // Catch: java.lang.Throwable -> Lf
            r0.m2060()
            return r3
        L2a:
            ᛴᛲᲈᲀ r3 = r3.m3066(r1)     // Catch: java.lang.Throwable -> Lf
            r0.m2060()
            return r3
        L32:
            r0.m2060()
            throw r3
    }

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public final defpackage.C0633 m3066(android.database.sqlite.SQLiteDatabase r3) {
            r2 = this;
            ᛸᲈᛸᲈ r2 = r2.f7462
            java.lang.Object r0 = r2.f7101
            ᛴᛲᲈᲀ r0 = (defpackage.C0633) r0
            if (r0 == 0) goto L12
            android.database.sqlite.SQLiteDatabase r1 = r0.f3141
            boolean r1 = defpackage.AbstractC0498.m1280(r1, r3)
            if (r1 != 0) goto L11
            goto L12
        L11:
            return r0
        L12:
            ᛴᛲᲈᲀ r0 = new ᛴᛲᲈᲀ
            r0.<init>(r3)
            r2.f7101 = r0
            return r0
    }
}
