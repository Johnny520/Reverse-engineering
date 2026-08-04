package yyds;

import java.io.IOException;

/* JADX INFO: renamed from: yyds.ᲇᛱᛶᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2384 extends AbstractC0149 {

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public boolean f11757;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f928) {
            return;
        }
        if (!this.f11757) {
            m691(C0157.f963);
        }
        this.f928 = true;
    }

    @Override // yyds.AbstractC0149, yyds.InterfaceC1590
    /* JADX INFO: renamed from: ᛶᛸᲀᲁ */
    public final long mo692(long j, C1507 c1507) throws IOException {
        if (this.f928) {
            C0188.m800("closed");
            return 0L;
        }
        if (this.f11757) {
            return -1L;
        }
        long jMo692 = super.mo692(8192L, c1507);
        if (jMo692 != -1) {
            return jMo692;
        }
        this.f11757 = true;
        m691(C1605.f8173);
        return -1L;
    }
}
