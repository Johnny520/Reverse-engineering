package p000;

/* JADX INFO: loaded from: classes.dex */
public final class c3 implements p000.bb {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final android.content.Context f239;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final java.lang.String f240;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final ۟.bb.a f241;

    /* JADX INFO: renamed from: ۥ۟۠, reason: contains not printable characters */
    public final boolean f242;

    /* JADX INFO: renamed from: ۥ۟ۡ, reason: contains not printable characters */
    public final java.lang.Object f243;

    /* JADX INFO: renamed from: ۥ۟ۢ, reason: contains not printable characters */
    public ۟.c3.a f244;

    /* JADX INFO: renamed from: ۥۣ۟, reason: contains not printable characters */
    public boolean f245;

    public static class a extends android.database.sqlite.SQLiteOpenHelper {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final p000.b3[] f246;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public final ۟.bb.a f247;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public boolean f248;

        /* JADX INFO: renamed from: ۟.c3$a$a, reason: collision with other inner class name */
        public class C0009a implements android.database.DatabaseErrorHandler {

            /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
            public final /* synthetic */ ۟.bb.a f249;

            /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
            public final /* synthetic */ p000.b3[] f250;

            public C0009a(۟.bb.a r1, p000.b3[] r2) {
                    r0 = this;
                    r0.f249 = r1
                    r0.f250 = r2
                    r0.<init>()
                    return
            }

            @Override // android.database.DatabaseErrorHandler
            public final void onCorruption(android.database.sqlite.SQLiteDatabase r5) {
                    r4 = this;
                    ۟.bb$a r0 = r4.f249
                    ۟.b3[] r1 = r4.f250
                    r2 = 0
                    r3 = r1[r2]
                    if (r3 == 0) goto L12
                    android.database.sqlite.SQLiteDatabase r3 = r3.f149
                    if (r3 != r5) goto Lf
                    r3 = 1
                    goto L10
                Lf:
                    r3 = r2
                L10:
                    if (r3 != 0) goto L19
                L12:
                    ۟.b3 r3 = new ۟.b3
                    r3.<init>(r5)
                    r1[r2] = r3
                L19:
                    r5 = r1[r2]
                    r0.getClass()
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    r0.<init>()
                    java.lang.String r1 = "Corruption reported by sqlite on database: "
                    r0.append(r1)
                    java.lang.String r1 = r5.m61()
                    r0.append(r1)
                    java.lang.String r0 = r0.toString()
                    java.lang.String r1 = "SupportSQLite"
                    android.util.Log.e(r1, r0)
                    boolean r0 = r5.isOpen()
                    if (r0 != 0) goto L3f
                    goto L87
                L3f:
                    r0 = 0
                    java.util.List r0 = r5.m60()     // Catch: java.lang.Throwable -> L45 android.database.sqlite.SQLiteException -> L47
                    goto L47
                L45:
                    r1 = move-exception
                    goto L4b
                L47:
                    r5.close()     // Catch: java.lang.Throwable -> L45 java.io.IOException -> L6d
                    goto L6d
                L4b:
                    if (r0 == 0) goto L65
                    java.util.Iterator r5 = r0.iterator()
                L51:
                    boolean r0 = r5.hasNext()
                    if (r0 == 0) goto L6c
                    java.lang.Object r0 = r5.next()
                    android.util.Pair r0 = (android.util.Pair) r0
                    java.lang.Object r0 = r0.second
                    java.lang.String r0 = (java.lang.String) r0
                    ۟.bb.a.m85(r0)
                    goto L51
                L65:
                    java.lang.String r5 = r5.m61()
                    ۟.bb.a.m85(r5)
                L6c:
                    throw r1
                L6d:
                    if (r0 == 0) goto L87
                    java.util.Iterator r5 = r0.iterator()
                L73:
                    boolean r0 = r5.hasNext()
                    if (r0 == 0) goto L8e
                    java.lang.Object r0 = r5.next()
                    android.util.Pair r0 = (android.util.Pair) r0
                    java.lang.Object r0 = r0.second
                    java.lang.String r0 = (java.lang.String) r0
                    ۟.bb.a.m85(r0)
                    goto L73
                L87:
                    java.lang.String r5 = r5.m61()
                    ۟.bb.a.m85(r5)
                L8e:
                    return
            }
        }

        public a(android.content.Context r7, java.lang.String r8, p000.b3[] r9, ۟.bb.a r10) {
                r6 = this;
                int r4 = r10.f166
                ۟.c3$a$a r5 = new ۟.c3$a$a
                r5.<init>(r10, r9)
                r3 = 0
                r0 = r6
                r1 = r7
                r2 = r8
                r0.<init>(r1, r2, r3, r4, r5)
                r6.f247 = r10
                r6.f246 = r9
                return
        }

        @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
        public final synchronized void close() {
                r3 = this;
                monitor-enter(r3)
                super.close()     // Catch: java.lang.Throwable -> Lc
                ۟.b3[] r0 = r3.f246     // Catch: java.lang.Throwable -> Lc
                r1 = 0
                r2 = 0
                r0[r1] = r2     // Catch: java.lang.Throwable -> Lc
                monitor-exit(r3)
                return
            Lc:
                r0 = move-exception
                monitor-exit(r3)
                throw r0
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onConfigure(android.database.sqlite.SQLiteDatabase r2) {
                r1 = this;
                ۟.bb$a r0 = r1.f247
                r1.m99(r2)
                r0.mo75()
                return
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onCreate(android.database.sqlite.SQLiteDatabase r2) {
                r1 = this;
                ۟.bb$a r0 = r1.f247
                ۟.b3 r2 = r1.m99(r2)
                r0.mo76(r2)
                return
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onDowngrade(android.database.sqlite.SQLiteDatabase r2, int r3, int r4) {
                r1 = this;
                r0 = 1
                r1.f248 = r0
                ۟.bb$a r0 = r1.f247
                ۟.b3 r2 = r1.m99(r2)
                r0.mo77(r2, r3, r4)
                return
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onOpen(android.database.sqlite.SQLiteDatabase r2) {
                r1 = this;
                boolean r0 = r1.f248
                if (r0 != 0) goto Ld
                ۟.bb$a r0 = r1.f247
                ۟.b3 r2 = r1.m99(r2)
                r0.mo78(r2)
            Ld:
                return
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onUpgrade(android.database.sqlite.SQLiteDatabase r2, int r3, int r4) {
                r1 = this;
                r0 = 1
                r1.f248 = r0
                ۟.bb$a r0 = r1.f247
                ۟.b3 r2 = r1.m99(r2)
                r0.mo79(r2, r3, r4)
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final p000.b3 m99(android.database.sqlite.SQLiteDatabase r4) {
                r3 = this;
                ۟.b3[] r0 = r3.f246
                r1 = 0
                r2 = r0[r1]
                if (r2 == 0) goto L10
                android.database.sqlite.SQLiteDatabase r2 = r2.f149
                if (r2 != r4) goto Ld
                r2 = 1
                goto Le
            Ld:
                r2 = r1
            Le:
                if (r2 != 0) goto L17
            L10:
                ۟.b3 r2 = new ۟.b3
                r2.<init>(r4)
                r0[r1] = r2
            L17:
                r4 = r0[r1]
                return r4
        }

        /* JADX INFO: renamed from: ۥ۟ۦ, reason: contains not printable characters */
        public final synchronized p000.ab m100() {
                r2 = this;
                monitor-enter(r2)
                r0 = 0
                r2.f248 = r0     // Catch: java.lang.Throwable -> L1b
                android.database.sqlite.SQLiteDatabase r0 = r2.getWritableDatabase()     // Catch: java.lang.Throwable -> L1b
                boolean r1 = r2.f248     // Catch: java.lang.Throwable -> L1b
                if (r1 == 0) goto L15
                r2.close()     // Catch: java.lang.Throwable -> L1b
                ۟.ab r0 = r2.m100()     // Catch: java.lang.Throwable -> L1b
                monitor-exit(r2)
                return r0
            L15:
                ۟.b3 r0 = r2.m99(r0)     // Catch: java.lang.Throwable -> L1b
                monitor-exit(r2)
                return r0
            L1b:
                r0 = move-exception
                monitor-exit(r2)
                throw r0
        }
    }

    public c3(android.content.Context r1, java.lang.String r2, ۟.bb.a r3, boolean r4) {
            r0 = this;
            r0.<init>()
            r0.f239 = r1
            r0.f240 = r2
            r0.f241 = r3
            r0.f242 = r4
            java.lang.Object r1 = new java.lang.Object
            r1.<init>()
            r0.f243 = r1
            return
    }

    @Override // p000.bb, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
            r1 = this;
            ۟.c3$a r0 = r1.m98()
            r0.close()
            return
    }

    @Override // p000.bb
    public final java.lang.String getDatabaseName() {
            r1 = this;
            java.lang.String r0 = r1.f240
            return r0
    }

    @Override // p000.bb
    public final void setWriteAheadLoggingEnabled(boolean r3) {
            r2 = this;
            java.lang.Object r0 = r2.f243
            monitor-enter(r0)
            ۟.c3$a r1 = r2.f244     // Catch: java.lang.Throwable -> Le
            if (r1 == 0) goto La
            r1.setWriteAheadLoggingEnabled(r3)     // Catch: java.lang.Throwable -> Le
        La:
            r2.f245 = r3     // Catch: java.lang.Throwable -> Le
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            return
        Le:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            throw r3
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final ۟.c3.a m98() {
            r6 = this;
            java.lang.Object r0 = r6.f243
            monitor-enter(r0)
            ۟.c3$a r1 = r6.f244     // Catch: java.lang.Throwable -> L47
            if (r1 != 0) goto L43
            r1 = 1
            ۟.b3[] r1 = new p000.b3[r1]     // Catch: java.lang.Throwable -> L47
            java.lang.String r2 = r6.f240     // Catch: java.lang.Throwable -> L47
            if (r2 == 0) goto L2f
            boolean r2 = r6.f242     // Catch: java.lang.Throwable -> L47
            if (r2 == 0) goto L2f
            java.io.File r2 = new java.io.File     // Catch: java.lang.Throwable -> L47
            android.content.Context r3 = r6.f239     // Catch: java.lang.Throwable -> L47
            java.io.File r3 = r3.getNoBackupFilesDir()     // Catch: java.lang.Throwable -> L47
            java.lang.String r4 = r6.f240     // Catch: java.lang.Throwable -> L47
            r2.<init>(r3, r4)     // Catch: java.lang.Throwable -> L47
            ۟.c3$a r3 = new ۟.c3$a     // Catch: java.lang.Throwable -> L47
            android.content.Context r4 = r6.f239     // Catch: java.lang.Throwable -> L47
            java.lang.String r2 = r2.getAbsolutePath()     // Catch: java.lang.Throwable -> L47
            ۟.bb$a r5 = r6.f241     // Catch: java.lang.Throwable -> L47
            r3.<init>(r4, r2, r1, r5)     // Catch: java.lang.Throwable -> L47
            r6.f244 = r3     // Catch: java.lang.Throwable -> L47
            goto L3c
        L2f:
            ۟.c3$a r2 = new ۟.c3$a     // Catch: java.lang.Throwable -> L47
            android.content.Context r3 = r6.f239     // Catch: java.lang.Throwable -> L47
            java.lang.String r4 = r6.f240     // Catch: java.lang.Throwable -> L47
            ۟.bb$a r5 = r6.f241     // Catch: java.lang.Throwable -> L47
            r2.<init>(r3, r4, r1, r5)     // Catch: java.lang.Throwable -> L47
            r6.f244 = r2     // Catch: java.lang.Throwable -> L47
        L3c:
            ۟.c3$a r1 = r6.f244     // Catch: java.lang.Throwable -> L47
            boolean r2 = r6.f245     // Catch: java.lang.Throwable -> L47
            r1.setWriteAheadLoggingEnabled(r2)     // Catch: java.lang.Throwable -> L47
        L43:
            ۟.c3$a r1 = r6.f244     // Catch: java.lang.Throwable -> L47
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L47
            return r1
        L47:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L47
            throw r1
    }

    @Override // p000.bb
    /* JADX INFO: renamed from: ۥ۠ۡ */
    public final p000.ab mo84() {
            r1 = this;
            ۟.c3$a r0 = r1.m98()
            ۟.ab r0 = r0.m100()
            return r0
    }
}
