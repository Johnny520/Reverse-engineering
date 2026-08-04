package yyds;

import android.database.sqlite.SQLiteDatabase;
import java.io.Closeable;

/* JADX INFO: renamed from: yyds.ᛳᛴᲀᛷ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0574 implements Closeable {

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final SQLiteDatabase f2765;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public static final String[] f2764 = new String[0];

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public static final InterfaceC0826 f2762 = AbstractC1579.m3237(2, new C2307(18));

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public static final InterfaceC0826 f2763 = AbstractC1579.m3237(2, new C2307(19));

    public C0574(SQLiteDatabase sQLiteDatabase) {
        this.f2765 = sQLiteDatabase;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f2765.close();
    }

    public final boolean isOpen() {
        return this.f2765.isOpen();
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final void m1442() {
        this.f2765.beginTransaction();
    }

    /* JADX INFO: renamed from: ᛳᲁᲁᲇ, reason: contains not printable characters */
    public final void m1443() {
        this.f2765.setTransactionSuccessful();
    }

    /* JADX INFO: renamed from: ᛶᛳᛶᛵ, reason: contains not printable characters */
    public final boolean m1444() {
        return this.f2765.inTransaction();
    }

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final void m1445() {
        this.f2765.endTransaction();
    }

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public final void m1446(String str) {
        this.f2765.execSQL(str);
    }

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final void m1447() {
        this.f2765.beginTransactionNonExclusive();
    }
}
