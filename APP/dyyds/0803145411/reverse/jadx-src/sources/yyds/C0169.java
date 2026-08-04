package yyds;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* JADX INFO: renamed from: yyds.ᛱᛷᛷᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0169 implements InterfaceC1590 {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public int f992;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final C2066 f993;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public boolean f994;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final Inflater f995;

    public C0169(C2066 c2066, Inflater inflater) {
        this.f993 = c2066;
        this.f995 = inflater;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f994) {
            return;
        }
        this.f995.end();
        this.f994 = true;
        this.f993.close();
    }

    @Override // yyds.InterfaceC1590
    /* JADX INFO: renamed from: ᛶᛸᲀᲁ */
    public final long mo692(long j, C1507 c1507) throws IOException {
        long j2;
        Inflater inflater = this.f995;
        while (!this.f994) {
            try {
                C0502 c0502M3039 = c1507.m3039(1);
                int iMin = (int) Math.min(8192L, 8192 - c0502M3039.f2446);
                boolean zNeedsInput = inflater.needsInput();
                C2066 c2066 = this.f993;
                if (zNeedsInput && !c2066.m3920()) {
                    C0502 c0502 = c2066.f10220.f7086;
                    int i = c0502.f2446;
                    int i2 = c0502.f2444;
                    int i3 = i - i2;
                    this.f992 = i3;
                    inflater.setInput(c0502.f2443, i2, i3);
                }
                int iInflate = inflater.inflate(c0502M3039.f2443, c0502M3039.f2446, iMin);
                int i4 = this.f992;
                if (i4 != 0) {
                    int remaining = i4 - inflater.getRemaining();
                    this.f992 -= remaining;
                    c2066.m3928(remaining);
                }
                if (iInflate > 0) {
                    c0502M3039.f2446 += iInflate;
                    j2 = iInflate;
                    c1507.f7087 += j2;
                } else {
                    if (c0502M3039.f2444 == c0502M3039.f2446) {
                        c1507.f7086 = c0502M3039.m1350();
                        AbstractC1478.m2976(c0502M3039);
                    }
                    j2 = 0;
                }
                if (j2 > 0) {
                    return j2;
                }
                if (inflater.finished() || inflater.needsDictionary()) {
                    return -1L;
                }
                if (c2066.m3920()) {
                    throw new EOFException("source exhausted prematurely");
                }
            } catch (DataFormatException e) {
                throw new IOException(e);
            }
        }
        C0188.m800("closed");
        return 0L;
    }

    @Override // yyds.InterfaceC1590
    /* JADX INFO: renamed from: ᲀᛲᛳᲀ */
    public final C2755 mo693() {
        return this.f993.f10219.mo693();
    }
}
