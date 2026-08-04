package yyds;

/* JADX INFO: renamed from: yyds.ᛵᛲᛳᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1032 implements InterfaceC1212 {

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final InterfaceC1212 f4690;

    public C1032(InterfaceC1212 interfaceC1212) {
        this.f4690 = interfaceC1212;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        InterfaceC1212 interfaceC1212 = this.f4690;
        interfaceC1212.reset();
        interfaceC1212.mo431();
    }

    @Override // yyds.InterfaceC1212
    public final int getColumnCount() {
        return this.f4690.getColumnCount();
    }

    @Override // yyds.InterfaceC1212
    public final String getColumnName(int i) {
        return this.f4690.getColumnName(i);
    }

    @Override // yyds.InterfaceC1212
    public final long getLong(int i) {
        return this.f4690.getLong(i);
    }

    @Override // yyds.InterfaceC1212
    public final boolean isNull(int i) {
        return this.f4690.isNull(i);
    }

    @Override // yyds.InterfaceC1212
    public final void reset() {
        this.f4690.reset();
    }

    @Override // yyds.InterfaceC1212
    /* JADX INFO: renamed from: ᛱᲈᲁ */
    public final String mo430(int i) {
        return this.f4690.mo430(i);
    }

    @Override // yyds.InterfaceC1212
    /* JADX INFO: renamed from: ᛲᛴᛳᛲ */
    public final void mo431() {
        this.f4690.mo431();
    }

    @Override // yyds.InterfaceC1212
    /* JADX INFO: renamed from: ᛵᛸᛸᛷ */
    public final void mo432(int i) {
        this.f4690.mo432(i);
    }

    @Override // yyds.InterfaceC1212
    /* JADX INFO: renamed from: ᛵᲀᛵᛸ */
    public final boolean mo433() {
        return this.f4690.mo433();
    }

    @Override // yyds.InterfaceC1212
    /* JADX INFO: renamed from: ᛶᲈᛴᲈ, reason: contains not printable characters */
    public final boolean mo2234() {
        return this.f4690.mo2234();
    }

    @Override // yyds.InterfaceC1212
    /* JADX INFO: renamed from: ᲀᛲᛲᲇ */
    public final void mo434(int i, String str) {
        this.f4690.mo434(i, str);
    }

    @Override // yyds.InterfaceC1212
    /* JADX INFO: renamed from: ᲇᲈᛵᛷ */
    public final void mo435(int i, long j) {
        this.f4690.mo435(i, j);
    }
}
