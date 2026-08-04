package yyds;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: yyds.ᲁᲀᛴᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2311 implements InterfaceC1590 {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public int f11319;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public int f11320;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final C2066 f11321;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public int f11322;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public int f11323;

    public C2311(C2066 c2066) {
        this.f11321 = c2066;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // yyds.InterfaceC1590
    /* JADX INFO: renamed from: ᛶᛸᲀᲁ */
    public final long mo692(long j, C1507 c1507) throws IOException {
        int i;
        int iM3922;
        do {
            int i2 = this.f11322;
            C2066 c2066 = this.f11321;
            if (i2 == 0) {
                c2066.m3928(this.f11320);
                this.f11320 = 0;
                if ((this.f11323 & 4) == 0) {
                    i = this.f11319;
                    int iM2921 = AbstractC1429.m2921(c2066);
                    this.f11322 = iM2921;
                    int iM3925 = c2066.m3925() & 255;
                    this.f11323 = c2066.m3925() & 255;
                    Logger logger = C2188.f10752;
                    if (logger.isLoggable(Level.FINE)) {
                        C2534 c2534 = AbstractC0545.f2617;
                        logger.fine(AbstractC0545.m1380(true, this.f11319, iM2921, iM3925, this.f11323));
                    }
                    iM3922 = c2066.m3922() & Integer.MAX_VALUE;
                    this.f11319 = iM3922;
                    if (iM3925 != 9) {
                        throw new IOException(iM3925 + " != TYPE_CONTINUATION");
                    }
                }
            } else {
                long jMo692 = c2066.mo692(Math.min(8192L, i2), c1507);
                if (jMo692 != -1) {
                    this.f11322 -= (int) jMo692;
                    return jMo692;
                }
            }
            return -1L;
        } while (iM3922 == i);
        C0188.m804("TYPE_CONTINUATION streamId changed");
        return 0L;
    }

    @Override // yyds.InterfaceC1590
    /* JADX INFO: renamed from: ᲀᛲᛳᲀ */
    public final C2755 mo693() {
        return this.f11321.f10219.mo693();
    }
}
