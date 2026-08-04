package yyds;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: yyds.ᛴᛲᲀᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0809 implements InterfaceC1590 {

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final InputStream f3732;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final C2755 f3733;

    public C0809(InputStream inputStream, C2755 c2755) {
        this.f3732 = inputStream;
        this.f3733 = c2755;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f3732.close();
    }

    public final String toString() {
        return "source(" + this.f3732 + ')';
    }

    @Override // yyds.InterfaceC1590
    /* JADX INFO: renamed from: ᛶᛸᲀᲁ */
    public final long mo692(long j, C1507 c1507) throws IOException {
        try {
            this.f3733.mo2200();
            C0502 c0502M3039 = c1507.m3039(1);
            int i = this.f3732.read(c0502M3039.f2443, c0502M3039.f2446, (int) Math.min(8192L, 8192 - c0502M3039.f2446));
            if (i != -1) {
                c0502M3039.f2446 += i;
                long j2 = i;
                c1507.f7087 += j2;
                return j2;
            }
            if (c0502M3039.f2444 != c0502M3039.f2446) {
                return -1L;
            }
            c1507.f7086 = c0502M3039.m1350();
            AbstractC1478.m2976(c0502M3039);
            return -1L;
        } catch (AssertionError e) {
            if (AbstractC1124.m2315(e)) {
                throw new IOException(e);
            }
            throw e;
        }
    }

    @Override // yyds.InterfaceC1590
    /* JADX INFO: renamed from: ᲀᛲᛳᲀ */
    public final C2755 mo693() {
        return this.f3733;
    }
}
