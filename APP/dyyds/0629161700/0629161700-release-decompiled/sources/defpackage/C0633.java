package defpackage;

/* JADX INFO: renamed from: ᛴᛲᲈᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0633 implements java.io.Closeable {

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public static final defpackage.InterfaceC0277 f3138 = null;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public static final java.lang.String[] f3139 = null;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public static final defpackage.InterfaceC0277 f3140 = null;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final android.database.sqlite.SQLiteDatabase f3141;

    static {
            r0 = 0
            java.lang.String[] r0 = new java.lang.String[r0]
            defpackage.C0633.f3139 = r0
            ᛷᛸᛵ r0 = new ᛷᛸᛵ
            r1 = 16
            r0.<init>(r1)
            ᛲᛴᛱᛵ r0 = defpackage.AbstractC0069.m514(r0)
            defpackage.C0633.f3138 = r0
            ᛷᛸᛵ r0 = new ᛷᛸᛵ
            r1 = 17
            r0.<init>(r1)
            ᛲᛴᛱᛵ r0 = defpackage.AbstractC0069.m514(r0)
            defpackage.C0633.f3140 = r0
            return
    }

    public C0633(android.database.sqlite.SQLiteDatabase r1) {
            r0 = this;
            r0.<init>()
            r0.f3141 = r1
            return
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
            r0 = this;
            android.database.sqlite.SQLiteDatabase r0 = r0.f3141
            r0.close()
            return
    }

    public final boolean isOpen() {
            r0 = this;
            android.database.sqlite.SQLiteDatabase r0 = r0.f3141
            boolean r0 = r0.isOpen()
            return r0
    }

    /* JADX INFO: renamed from: ᛲᛲᛵ, reason: contains not printable characters */
    public final void m1466(java.lang.String r1) {
            r0 = this;
            android.database.sqlite.SQLiteDatabase r0 = r0.f3141
            r0.execSQL(r1)
            return
    }

    /* JADX INFO: renamed from: ᛲᛴᛱᛶ, reason: contains not printable characters */
    public final void m1467() {
            r0 = this;
            android.database.sqlite.SQLiteDatabase r0 = r0.f3141
            r0.setTransactionSuccessful()
            return
    }

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public final void m1468() {
            r0 = this;
            android.database.sqlite.SQLiteDatabase r0 = r0.f3141
            r0.endTransaction()
            return
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final void m1469() {
            r0 = this;
            android.database.sqlite.SQLiteDatabase r0 = r0.f3141
            r0.beginTransaction()
            return
    }

    /* JADX INFO: renamed from: ᲁᲈᲇᲁ, reason: contains not printable characters */
    public final boolean m1470() {
            r0 = this;
            android.database.sqlite.SQLiteDatabase r0 = r0.f3141
            boolean r0 = r0.inTransaction()
            return r0
    }

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public final void m1471() {
            r0 = this;
            android.database.sqlite.SQLiteDatabase r0 = r0.f3141
            r0.beginTransactionNonExclusive()
            return
    }
}
