package yyds;

/* JADX INFO: renamed from: yyds.ᛱᛱᲀᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0065 implements InterfaceC1212 {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final /* synthetic */ C1458 f595;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final InterfaceC1212 f596;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final long f597 = AbstractC0476.m1332();

    public C0065(C1458 c1458, InterfaceC1212 interfaceC1212) {
        this.f595 = c1458;
        this.f596 = interfaceC1212;
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws Exception {
        if (this.f595.f6954) {
            AbstractC2328.m4346(21, "Statement is recycled");
            throw null;
        }
        if (this.f597 == AbstractC0476.m1332()) {
            this.f596.close();
        } else {
            AbstractC2328.m4346(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    @Override // yyds.InterfaceC1212
    public final int getColumnCount() {
        if (this.f595.f6954) {
            AbstractC2328.m4346(21, "Statement is recycled");
            throw null;
        }
        if (this.f597 == AbstractC0476.m1332()) {
            return this.f596.getColumnCount();
        }
        AbstractC2328.m4346(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // yyds.InterfaceC1212
    public final String getColumnName(int i) {
        if (this.f595.f6954) {
            AbstractC2328.m4346(21, "Statement is recycled");
            throw null;
        }
        if (this.f597 == AbstractC0476.m1332()) {
            return this.f596.getColumnName(i);
        }
        AbstractC2328.m4346(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // yyds.InterfaceC1212
    public final long getLong(int i) {
        if (this.f595.f6954) {
            AbstractC2328.m4346(21, "Statement is recycled");
            throw null;
        }
        if (this.f597 == AbstractC0476.m1332()) {
            return this.f596.getLong(i);
        }
        AbstractC2328.m4346(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // yyds.InterfaceC1212
    public final boolean isNull(int i) {
        if (this.f595.f6954) {
            AbstractC2328.m4346(21, "Statement is recycled");
            throw null;
        }
        if (this.f597 == AbstractC0476.m1332()) {
            return this.f596.isNull(i);
        }
        AbstractC2328.m4346(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // yyds.InterfaceC1212
    public final void reset() {
        if (this.f595.f6954) {
            AbstractC2328.m4346(21, "Statement is recycled");
            throw null;
        }
        if (this.f597 == AbstractC0476.m1332()) {
            this.f596.reset();
        } else {
            AbstractC2328.m4346(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    @Override // yyds.InterfaceC1212
    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public final String mo430(int i) {
        if (this.f595.f6954) {
            AbstractC2328.m4346(21, "Statement is recycled");
            throw null;
        }
        if (this.f597 == AbstractC0476.m1332()) {
            return this.f596.mo430(i);
        }
        AbstractC2328.m4346(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // yyds.InterfaceC1212
    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final void mo431() {
        if (this.f595.f6954) {
            AbstractC2328.m4346(21, "Statement is recycled");
            throw null;
        }
        if (this.f597 == AbstractC0476.m1332()) {
            this.f596.mo431();
        } else {
            AbstractC2328.m4346(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    @Override // yyds.InterfaceC1212
    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final void mo432(int i) {
        if (this.f595.f6954) {
            AbstractC2328.m4346(21, "Statement is recycled");
            throw null;
        }
        if (this.f597 == AbstractC0476.m1332()) {
            this.f596.mo432(i);
        } else {
            AbstractC2328.m4346(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    @Override // yyds.InterfaceC1212
    /* JADX INFO: renamed from: ᛵᲀᛵᛸ, reason: contains not printable characters */
    public final boolean mo433() {
        if (this.f595.f6954) {
            AbstractC2328.m4346(21, "Statement is recycled");
            throw null;
        }
        if (this.f597 == AbstractC0476.m1332()) {
            return this.f596.mo433();
        }
        AbstractC2328.m4346(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // yyds.InterfaceC1212
    /* JADX INFO: renamed from: ᲀᛲᛲᲇ, reason: contains not printable characters */
    public final void mo434(int i, String str) {
        if (this.f595.f6954) {
            AbstractC2328.m4346(21, "Statement is recycled");
            throw null;
        }
        if (this.f597 == AbstractC0476.m1332()) {
            this.f596.mo434(i, str);
        } else {
            AbstractC2328.m4346(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    @Override // yyds.InterfaceC1212
    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final void mo435(int i, long j) {
        if (this.f595.f6954) {
            AbstractC2328.m4346(21, "Statement is recycled");
            throw null;
        }
        if (this.f597 == AbstractC0476.m1332()) {
            this.f596.mo435(i, j);
        } else {
            AbstractC2328.m4346(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }
}
