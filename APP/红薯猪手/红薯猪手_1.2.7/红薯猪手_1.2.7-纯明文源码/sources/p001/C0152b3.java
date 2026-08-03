package p001;

import android.database.Cursor;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.util.Pair;
import java.util.List;

/* JADX INFO: renamed from: ۟.b3 */
/* JADX INFO: loaded from: classes.dex */
public final class C0152b3 implements InterfaceC0146ab {

    /* JADX INFO: renamed from: ۥ۟ */
    public static final String[] f700 = new String[0];

    /* JADX INFO: renamed from: ۥ */
    public final SQLiteDatabase f701;

    /* JADX INFO: renamed from: ۟.b3$a */
    public class a implements SQLiteDatabase.CursorFactory {

        /* JADX INFO: renamed from: ۥ */
        public final /* synthetic */ InterfaceC0188db f702;

        public a(InterfaceC0188db interfaceC0188db) {
            this.f702 = interfaceC0188db;
        }

        @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
        public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
            this.f702.mo1041(new C0213f8(sQLiteQuery));
            return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
        }
    }

    public C0152b3(SQLiteDatabase sQLiteDatabase) {
        this.f701 = sQLiteDatabase;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f701.close();
    }

    @Override // p001.InterfaceC0146ab
    public final boolean isOpen() {
        return this.f701.isOpen();
    }

    @Override // p001.InterfaceC0146ab
    /* JADX INFO: renamed from: ۥ */
    public final void mo811() {
        this.f701.endTransaction();
    }

    @Override // p001.InterfaceC0146ab
    /* JADX INFO: renamed from: ۥ۟ */
    public final void mo812() {
        this.f701.beginTransaction();
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final List<Pair<String, String>> m1008() {
        return this.f701.getAttachedDbs();
    }

    @Override // p001.InterfaceC0146ab
    /* JADX INFO: renamed from: ۥ۟۠ */
    public final void mo996(String str) {
        this.f701.execSQL(str);
    }

    @Override // p001.InterfaceC0146ab
    /* JADX INFO: renamed from: ۥ۟ۢ */
    public final Cursor mo997(InterfaceC0188db interfaceC0188db) {
        return this.f701.rawQueryWithFactory(new a(interfaceC0188db), interfaceC0188db.mo1044(), f700, null);
    }

    @Override // p001.InterfaceC0146ab
    /* JADX INFO: renamed from: ۥ۟ۤ */
    public final InterfaceC0202eb mo998(String str) {
        return new C0194e3(this.f701.compileStatement(str));
    }

    /* JADX INFO: renamed from: ۥ۟ۦ, reason: contains not printable characters */
    public final String m1009() {
        return this.f701.getPath();
    }

    @Override // p001.InterfaceC0146ab
    /* JADX INFO: renamed from: ۥ۟ۧ */
    public final boolean mo999() {
        return this.f701.inTransaction();
    }

    @Override // p001.InterfaceC0146ab
    /* JADX INFO: renamed from: ۥ۟ۨ */
    public final boolean mo1000() {
        return this.f701.isWriteAheadLoggingEnabled();
    }

    @Override // p001.InterfaceC0146ab
    /* JADX INFO: renamed from: ۥ۠۟ */
    public final void mo1001() {
        this.f701.setTransactionSuccessful();
    }

    @Override // p001.InterfaceC0146ab
    /* JADX INFO: renamed from: ۥ۠۠ */
    public final void mo1002() {
        this.f701.beginTransactionNonExclusive();
    }

    /* JADX INFO: renamed from: ۥۣ۠, reason: contains not printable characters */
    public final Cursor m1010(String str) {
        return mo997(new C0251i4(str));
    }
}
