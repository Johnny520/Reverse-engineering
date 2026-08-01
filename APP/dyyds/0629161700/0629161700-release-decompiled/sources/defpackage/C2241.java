package defpackage;

/* JADX INFO: renamed from: ᲈᛵᛵᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public class C2241 implements defpackage.InterfaceC0505 {

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final android.database.sqlite.SQLiteProgram f9548;

    public C2241(android.database.sqlite.SQLiteProgram r1) {
            r0 = this;
            r0.<init>()
            r0.f9548 = r1
            return
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
            r0 = this;
            android.database.sqlite.SQLiteProgram r0 = r0.f9548
            r0.close()
            return
    }

    @Override // defpackage.InterfaceC0505
    /* JADX INFO: renamed from: ᛵᛱᛵᛲ */
    public final void mo1283() {
            r0 = this;
            android.database.sqlite.SQLiteProgram r0 = r0.f9548
            r0.clearBindings()
            return
    }

    @Override // defpackage.InterfaceC0505
    /* JADX INFO: renamed from: ᛶᛷᛱᲀ */
    public final void mo1284(int r1, double r2) {
            r0 = this;
            android.database.sqlite.SQLiteProgram r0 = r0.f9548
            r0.bindDouble(r1, r2)
            return
    }

    @Override // defpackage.InterfaceC0505
    /* JADX INFO: renamed from: ᛷᛸᛵᲇ */
    public final void mo1285(long r1, int r3) {
            r0 = this;
            android.database.sqlite.SQLiteProgram r0 = r0.f9548
            r0.bindLong(r3, r1)
            return
    }

    @Override // defpackage.InterfaceC0505
    /* JADX INFO: renamed from: ᛸᛵᛸᛷ */
    public final void mo1286(int r1, java.lang.String r2) {
            r0 = this;
            android.database.sqlite.SQLiteProgram r0 = r0.f9548
            r0.bindString(r1, r2)
            return
    }

    @Override // defpackage.InterfaceC0505
    /* JADX INFO: renamed from: ᲁᛴᛵᛲ */
    public final void mo1287(int r1, byte[] r2) {
            r0 = this;
            android.database.sqlite.SQLiteProgram r0 = r0.f9548
            r0.bindBlob(r1, r2)
            return
    }

    @Override // defpackage.InterfaceC0505
    /* JADX INFO: renamed from: ᲇᛶᛵᲇ */
    public final void mo1288(int r1) {
            r0 = this;
            android.database.sqlite.SQLiteProgram r0 = r0.f9548
            r0.bindNull(r1)
            return
    }
}
