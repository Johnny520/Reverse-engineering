package yyds;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

/* JADX INFO: renamed from: yyds.ᲇᲀᛵᛴ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2512 implements InterfaceC1590 {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final Inflater f12375;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final CRC32 f12376;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public byte f12377;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final C0169 f12378;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final C2066 f12379;

    public C2512(InterfaceC0981 interfaceC0981) {
        C2066 c2066 = new C2066(interfaceC0981);
        this.f12379 = c2066;
        Inflater inflater = new Inflater(true);
        this.f12375 = inflater;
        this.f12378 = new C0169(c2066, inflater);
        this.f12376 = new CRC32();
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static void m4557(String str, int i, int i2) throws IOException {
        if (i2 == i) {
            return;
        }
        throw new IOException(str + ": actual 0x" + AbstractC0473.m1293(AbstractC2217.m4204(i2)) + " != expected 0x" + AbstractC0473.m1293(AbstractC2217.m4204(i)));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f12378.close();
    }

    @Override // yyds.InterfaceC1590
    /* JADX INFO: renamed from: ᛶᛸᲀᲁ */
    public final long mo692(long j, C1507 c1507) throws IOException {
        long j2;
        C1507 c15072;
        long j3;
        C1507 c15073;
        C2512 c2512 = this;
        C2066 c2066 = c2512.f12379;
        C1507 c15074 = c2066.f10220;
        byte b = c2512.f12377;
        CRC32 crc32 = c2512.f12376;
        if (b == 0) {
            c2066.m3926(10L);
            byte bM3038 = c15074.m3038(3L);
            boolean z = ((bM3038 >> 1) & 1) == 1;
            if (z) {
                c2512.m4558(c15074, 0L, 10L);
            }
            m4557("ID1ID2", 8075, c2066.m3923());
            c2066.m3928(8L);
            if (((bM3038 >> 2) & 1) == 1) {
                c2066.m3926(2L);
                if (z) {
                    j2 = -1;
                    j3 = 2;
                    m4558(c15074, 0L, 2L);
                } else {
                    j3 = 2;
                    j2 = -1;
                }
                short sM3025 = c15074.m3025();
                long j4 = ((short) (((sM3025 & 255) << 8) | ((sM3025 & 65280) >>> 8))) & 65535;
                c2066.m3926(j4);
                if (z) {
                    m4558(c15074, 0L, j4);
                }
                c15072 = c15074;
                c2066.m3928(j4);
            } else {
                c15072 = c15074;
                j3 = 2;
                j2 = -1;
            }
            if (((bM3038 >> 3) & 1) == 1) {
                long jM3930 = c2066.m3930((byte) 0, 0L, Long.MAX_VALUE);
                if (jM3930 == j2) {
                    throw new EOFException();
                }
                if (z) {
                    m4558(c15072, 0L, jM3930 + 1);
                }
                c2066.m3928(jM3930 + 1);
            }
            if (((bM3038 >> 4) & 1) == 1) {
                long jM39302 = c2066.m3930((byte) 0, 0L, Long.MAX_VALUE);
                if (jM39302 == j2) {
                    throw new EOFException();
                }
                if (z) {
                    c2512 = this;
                    c15073 = c15072;
                    c2512.m4558(c15073, 0L, jM39302 + 1);
                } else {
                    c2512 = this;
                    c15073 = c15072;
                }
                c2066.m3928(jM39302 + 1);
            } else {
                c2512 = this;
                c15073 = c15072;
            }
            if (z) {
                c2066.m3926(j3);
                short sM30252 = c15073.m3025();
                m4557("FHCRC", (short) (((sM30252 & 255) << 8) | ((sM30252 & 65280) >>> 8)), (short) crc32.getValue());
                crc32.reset();
            }
            c2512.f12377 = (byte) 1;
            b = 1;
        } else {
            j2 = -1;
        }
        if (b == 1) {
            long j5 = c1507.f7087;
            long jMo692 = c2512.f12378.mo692(8192L, c1507);
            if (jMo692 != j2) {
                c2512.m4558(c1507, j5, jMo692);
                return jMo692;
            }
            c2512.f12377 = (byte) 2;
            b = 2;
        }
        if (b == 2) {
            m4557("CRC", c2066.m3929(), (int) crc32.getValue());
            m4557("ISIZE", c2066.m3929(), (int) c2512.f12375.getBytesWritten());
            c2512.f12377 = (byte) 3;
            if (!c2066.m3920()) {
                C0188.m804("gzip finished without exhausting source");
                return 0L;
            }
        }
        return j2;
    }

    @Override // yyds.InterfaceC1590
    /* JADX INFO: renamed from: ᲀᛲᛳᲀ */
    public final C2755 mo693() {
        return this.f12379.f10219.mo693();
    }

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final void m4558(C1507 c1507, long j, long j2) {
        C0502 c0502 = c1507.f7086;
        while (true) {
            long j3 = c0502.f2446 - c0502.f2444;
            if (j < j3) {
                break;
            }
            j -= j3;
            c0502 = c0502.f2447;
        }
        while (j2 > 0) {
            int i = (int) (((long) c0502.f2444) + j);
            int iMin = (int) Math.min(c0502.f2446 - i, j2);
            this.f12376.update(c0502.f2443, i, iMin);
            j2 -= (long) iMin;
            c0502 = c0502.f2447;
            j = 0;
        }
    }
}
