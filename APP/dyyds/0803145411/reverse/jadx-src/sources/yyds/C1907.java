package yyds;

import android.database.sqlite.SQLiteProgram;

/* JADX INFO: renamed from: yyds.ᛸᲈᛲᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public class C1907 implements InterfaceC1523 {

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final SQLiteProgram f9645;

    public C1907(SQLiteProgram sQLiteProgram) {
        this.f9645 = sQLiteProgram;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f9645.close();
    }

    @Override // yyds.InterfaceC1523
    /* JADX INFO: renamed from: ᛲᛳᛶᲁ */
    public final void mo3148(int i, String str) {
        this.f9645.bindString(i, str);
    }

    @Override // yyds.InterfaceC1523
    /* JADX INFO: renamed from: ᛲᛴᛳᛲ */
    public final void mo3149() {
        this.f9645.clearBindings();
    }

    @Override // yyds.InterfaceC1523
    /* JADX INFO: renamed from: ᛵᛸᛸᛷ */
    public final void mo3150(int i) {
        this.f9645.bindNull(i);
    }

    @Override // yyds.InterfaceC1523
    /* JADX INFO: renamed from: ᛷᛵᲇᲀ */
    public final void mo3151(int i, double d) {
        this.f9645.bindDouble(i, d);
    }

    @Override // yyds.InterfaceC1523
    /* JADX INFO: renamed from: ᲇᲈᛵᛷ */
    public final void mo3152(int i, long j) {
        this.f9645.bindLong(i, j);
    }

    @Override // yyds.InterfaceC1523
    /* JADX INFO: renamed from: ᲈᲀᛲᲀ */
    public final void mo3153(int i, byte[] bArr) {
        this.f9645.bindBlob(i, bArr);
    }
}
