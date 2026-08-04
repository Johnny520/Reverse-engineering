package yyds;

import android.content.Context;

/* JADX INFO: renamed from: yyds.ᲀᛳᛲᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1958 implements InterfaceC1997 {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final C1760 f9814;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public boolean f9815;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final Context f9816;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final C0078 f9817 = new C0078(new C1223(10, this));

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final String f9818;

    public C1958(Context context, String str, C1760 c1760) {
        this.f9816 = context;
        this.f9818 = str;
        this.f9814 = c1760;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f9817.f651 != C1586.f8039) {
            ((C1689) this.f9817.getValue()).close();
        }
    }

    @Override // yyds.InterfaceC1997
    public final String getDatabaseName() {
        return this.f9818;
    }

    @Override // yyds.InterfaceC1997
    public final void setWriteAheadLoggingEnabled(boolean z) {
        if (this.f9817.f651 != C1586.f8039) {
            ((C1689) this.f9817.getValue()).setWriteAheadLoggingEnabled(z);
        }
        this.f9815 = z;
    }

    @Override // yyds.InterfaceC1997
    /* JADX INFO: renamed from: ᛲᛳᛴᛸ, reason: contains not printable characters */
    public final C0574 mo3773() {
        return ((C1689) this.f9817.getValue()).m3431(true);
    }
}
