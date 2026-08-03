package p001;

import android.database.sqlite.SQLiteStatement;

/* JADX INFO: renamed from: ۟.e3 */
/* JADX INFO: loaded from: classes.dex */
public final class C0194e3 extends C0213f8 implements InterfaceC0202eb {

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final SQLiteStatement f1423;

    public C0194e3(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement);
        this.f1423 = sQLiteStatement;
    }

    @Override // p001.InterfaceC0202eb
    /* JADX INFO: renamed from: ۥۣ۟, reason: contains not printable characters */
    public final int mo1055() {
        return this.f1423.executeUpdateDelete();
    }

    @Override // p001.InterfaceC0202eb
    /* JADX INFO: renamed from: ۥ۠ۢ, reason: contains not printable characters */
    public final long mo1056() {
        return this.f1423.executeInsert();
    }
}
