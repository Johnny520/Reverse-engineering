package p000;

/* JADX INFO: loaded from: classes.dex */
public final class b3 implements p000.ab {

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final java.lang.String[] f148 = null;

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final android.database.sqlite.SQLiteDatabase f149;

    public class a implements android.database.sqlite.SQLiteDatabase.CursorFactory {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final /* synthetic */ p000.db f150;

        public a(p000.db r1) {
                r0 = this;
                r0.f150 = r1
                r0.<init>()
                return
        }

        @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
        public final android.database.Cursor newCursor(android.database.sqlite.SQLiteDatabase r2, android.database.sqlite.SQLiteCursorDriver r3, java.lang.String r4, android.database.sqlite.SQLiteQuery r5) {
                r1 = this;
                ۟.db r2 = r1.f150
                ۟.f8 r0 = new ۟.f8
                r0.<init>(r5)
                r2.mo112(r0)
                android.database.sqlite.SQLiteCursor r2 = new android.database.sqlite.SQLiteCursor
                r2.<init>(r3, r4, r5)
                return r2
        }
    }

    static {
            r0 = 0
            java.lang.String[] r0 = new java.lang.String[r0]
            p000.b3.f148 = r0
            return
    }

    public b3(android.database.sqlite.SQLiteDatabase r1) {
            r0 = this;
            r0.<init>()
            r0.f149 = r1
            return
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
            r1 = this;
            android.database.sqlite.SQLiteDatabase r0 = r1.f149
            r0.close()
            return
    }

    @Override // p000.ab
    public final boolean isOpen() {
            r1 = this;
            android.database.sqlite.SQLiteDatabase r0 = r1.f149
            boolean r0 = r0.isOpen()
            return r0
    }

    @Override // p000.ab
    /* JADX INFO: renamed from: ۥ */
    public final void mo40() {
            r1 = this;
            android.database.sqlite.SQLiteDatabase r0 = r1.f149
            r0.endTransaction()
            return
    }

    @Override // p000.ab
    /* JADX INFO: renamed from: ۥ۟ */
    public final void mo41() {
            r1 = this;
            android.database.sqlite.SQLiteDatabase r0 = r1.f149
            r0.beginTransaction()
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final java.util.List<android.util.Pair<java.lang.String, java.lang.String>> m60() {
            r1 = this;
            android.database.sqlite.SQLiteDatabase r0 = r1.f149
            java.util.List r0 = r0.getAttachedDbs()
            return r0
    }

    @Override // p000.ab
    /* JADX INFO: renamed from: ۥ۟۠ */
    public final void mo42(java.lang.String r2) {
            r1 = this;
            android.database.sqlite.SQLiteDatabase r0 = r1.f149
            r0.execSQL(r2)
            return
    }

    @Override // p000.ab
    /* JADX INFO: renamed from: ۥ۟ۢ */
    public final android.database.Cursor mo43(p000.db r5) {
            r4 = this;
            android.database.sqlite.SQLiteDatabase r0 = r4.f149
            ۟.b3$a r1 = new ۟.b3$a
            r1.<init>(r5)
            java.lang.String r5 = r5.mo115()
            java.lang.String[] r2 = p000.b3.f148
            r3 = 0
            android.database.Cursor r5 = r0.rawQueryWithFactory(r1, r5, r2, r3)
            return r5
    }

    @Override // p000.ab
    /* JADX INFO: renamed from: ۥ۟ۤ */
    public final p000.eb mo44(java.lang.String r3) {
            r2 = this;
            ۟.e3 r0 = new ۟.e3
            android.database.sqlite.SQLiteDatabase r1 = r2.f149
            android.database.sqlite.SQLiteStatement r3 = r1.compileStatement(r3)
            r0.<init>(r3)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟ۦ, reason: contains not printable characters */
    public final java.lang.String m61() {
            r1 = this;
            android.database.sqlite.SQLiteDatabase r0 = r1.f149
            java.lang.String r0 = r0.getPath()
            return r0
    }

    @Override // p000.ab
    /* JADX INFO: renamed from: ۥ۟ۧ */
    public final boolean mo45() {
            r1 = this;
            android.database.sqlite.SQLiteDatabase r0 = r1.f149
            boolean r0 = r0.inTransaction()
            return r0
    }

    @Override // p000.ab
    /* JADX INFO: renamed from: ۥ۟ۨ */
    public final boolean mo46() {
            r1 = this;
            android.database.sqlite.SQLiteDatabase r0 = r1.f149
            boolean r0 = r0.isWriteAheadLoggingEnabled()
            return r0
    }

    @Override // p000.ab
    /* JADX INFO: renamed from: ۥ۠۟ */
    public final void mo47() {
            r1 = this;
            android.database.sqlite.SQLiteDatabase r0 = r1.f149
            r0.setTransactionSuccessful()
            return
    }

    @Override // p000.ab
    /* JADX INFO: renamed from: ۥ۠۠ */
    public final void mo48() {
            r1 = this;
            android.database.sqlite.SQLiteDatabase r0 = r1.f149
            r0.beginTransactionNonExclusive()
            return
    }

    /* JADX INFO: renamed from: ۥۣ۠, reason: contains not printable characters */
    public final android.database.Cursor m62(java.lang.String r2) {
            r1 = this;
            ۟.i4 r0 = new ۟.i4
            r0.<init>(r2)
            android.database.Cursor r2 = r1.mo43(r0)
            return r2
    }
}
