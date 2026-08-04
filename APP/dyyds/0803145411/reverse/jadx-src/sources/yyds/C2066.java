package yyds;

import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: yyds.ᲀᲀᛵᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2066 implements InterfaceC0981 {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public boolean f10218;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final InterfaceC1590 f10219;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final C1507 f10220 = new C1507();

    public C2066(InterfaceC1590 interfaceC1590) {
        this.f10219 = interfaceC1590;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
        if (this.f10218) {
            return;
        }
        this.f10218 = true;
        this.f10219.close();
        C1507 c1507 = this.f10220;
        c1507.m3030(c1507.f7087);
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f10218;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        C1507 c1507 = this.f10220;
        if (c1507.f7087 == 0 && this.f10219.mo692(8192L, c1507) == -1) {
            return -1;
        }
        return c1507.read(byteBuffer);
    }

    public final String toString() {
        return "buffer(" + this.f10219 + ')';
    }

    @Override // yyds.InterfaceC0981
    /* JADX INFO: renamed from: ᛱᛳᛶᛳ */
    public final String mo2132(Charset charset) {
        InterfaceC1590 interfaceC1590 = this.f10219;
        C1507 c1507 = this.f10220;
        c1507.m3034(interfaceC1590);
        return c1507.m3031(c1507.f7087, charset);
    }

    @Override // yyds.InterfaceC0981
    /* JADX INFO: renamed from: ᛲᛲᲈᲈ */
    public final byte[] mo2133() {
        InterfaceC1590 interfaceC1590 = this.f10219;
        C1507 c1507 = this.f10220;
        c1507.m3034(interfaceC1590);
        return c1507.m3023(c1507.f7087);
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final boolean m3920() {
        if (this.f10218) {
            C0188.m800("closed");
            return false;
        }
        C1507 c1507 = this.f10220;
        return c1507.m3021() && this.f10219.mo692(8192L, c1507) == -1;
    }

    /* JADX INFO: renamed from: ᛳᛸᛴᛶ, reason: contains not printable characters */
    public final String m3921(long j) {
        if (j < 0) {
            C0188.m803(j, "limit < 0: ");
            return null;
        }
        long j2 = j == Long.MAX_VALUE ? Long.MAX_VALUE : j + 1;
        long jM3930 = m3930((byte) 10, 0L, j2);
        C1507 c1507 = this.f10220;
        if (jM3930 != -1) {
            return AbstractC1168.m2357(jM3930, c1507);
        }
        if (j2 < Long.MAX_VALUE && m3924(j2) && c1507.m3038(j2 - 1) == 13 && m3924(j2 + 1) && c1507.m3038(j2) == 10) {
            return AbstractC1168.m2357(j2, c1507);
        }
        C1507 c15072 = new C1507();
        long jMin = Math.min(32L, c1507.f7087);
        long j3 = 0;
        AbstractC2217.m4201(c1507.f7087, 0L, jMin);
        if (jMin != 0) {
            c15072.f7087 += jMin;
            C0502 c0502 = c1507.f7086;
            while (true) {
                long j4 = c0502.f2446 - c0502.f2444;
                if (j3 < j4) {
                    break;
                }
                j3 -= j4;
                c0502 = c0502.f2447;
            }
            long j5 = j3;
            long j6 = jMin;
            while (j6 > 0) {
                C0502 c0502M1352 = c0502.m1352();
                int i = c0502M1352.f2444 + ((int) j5);
                c0502M1352.f2444 = i;
                c0502M1352.f2446 = Math.min(i + ((int) j6), c0502M1352.f2446);
                C0502 c05022 = c15072.f7086;
                if (c05022 == null) {
                    c0502M1352.f2445 = c0502M1352;
                    c0502M1352.f2447 = c0502M1352;
                    c15072.f7086 = c0502M1352;
                } else {
                    c05022.f2445.m1351(c0502M1352);
                }
                j6 -= (long) (c0502M1352.f2446 - c0502M1352.f2444);
                c0502 = c0502.f2447;
                j5 = 0;
            }
        }
        throw new EOFException("\\n not found: limit=" + Math.min(c1507.f7087, j) + " content=" + c15072.m3037(c15072.f7087).mo4265() + (char) 8230);
    }

    /* JADX INFO: renamed from: ᛳᲁᲁᲇ, reason: contains not printable characters */
    public final int m3922() throws EOFException {
        m3926(4L);
        return this.f10220.m3022();
    }

    /* JADX INFO: renamed from: ᛵᛶᛲᲀ, reason: contains not printable characters */
    public final short m3923() throws EOFException {
        m3926(2L);
        return this.f10220.m3025();
    }

    /* JADX INFO: renamed from: ᛵᲀᲈᛴ, reason: contains not printable characters */
    public final boolean m3924(long j) {
        C1507 c1507;
        if (j < 0) {
            C0188.m803(j, "byteCount < 0: ");
            return false;
        }
        if (this.f10218) {
            C0188.m800("closed");
            return false;
        }
        do {
            c1507 = this.f10220;
            if (c1507.f7087 >= j) {
                return true;
            }
        } while (this.f10219.mo692(8192L, c1507) != -1);
        return false;
    }

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final byte m3925() throws EOFException {
        m3926(1L);
        return this.f10220.m3033();
    }

    @Override // yyds.InterfaceC1590
    /* JADX INFO: renamed from: ᛶᛸᲀᲁ */
    public final long mo692(long j, C1507 c1507) {
        if (j < 0) {
            C0188.m803(j, "byteCount < 0: ");
            return 0L;
        }
        if (this.f10218) {
            C0188.m800("closed");
            return 0L;
        }
        C1507 c15072 = this.f10220;
        if (c15072.f7087 == 0) {
            if (j == 0) {
                return 0L;
            }
            if (this.f10219.mo692(8192L, c15072) == -1) {
                return -1L;
            }
        }
        return c15072.mo692(Math.min(j, c15072.f7087), c1507);
    }

    @Override // yyds.InterfaceC0981
    /* JADX INFO: renamed from: ᛷᛲᲈᛱ */
    public final int mo2134(C1662 c1662) throws EOFException {
        if (this.f10218) {
            C0188.m800("closed");
            return 0;
        }
        while (true) {
            C1507 c1507 = this.f10220;
            int iM2358 = AbstractC1168.m2358(c1507, c1662, true);
            if (iM2358 != -2) {
                if (iM2358 != -1) {
                    c1507.m3030(c1662.f8465[iM2358].mo4261());
                    return iM2358;
                }
            } else if (this.f10219.mo692(8192L, c1507) == -1) {
                break;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: ᛷᛸᲇᛶ, reason: contains not printable characters */
    public final void m3926(long j) throws EOFException {
        if (!m3924(j)) {
            throw new EOFException();
        }
    }

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public final C2534 m3927(long j) throws EOFException {
        m3926(j);
        return this.f10220.m3037(j);
    }

    /* JADX INFO: renamed from: ᛸᛸᛷᛱ, reason: contains not printable characters */
    public final void m3928(long j) throws EOFException {
        if (this.f10218) {
            C0188.m800("closed");
            return;
        }
        while (j > 0) {
            C1507 c1507 = this.f10220;
            if (c1507.f7087 == 0 && this.f10219.mo692(8192L, c1507) == -1) {
                throw new EOFException();
            }
            long jMin = Math.min(j, c1507.f7087);
            c1507.m3030(jMin);
            j -= jMin;
        }
    }

    @Override // yyds.InterfaceC1590
    /* JADX INFO: renamed from: ᲀᛲᛳᲀ */
    public final C2755 mo693() {
        return this.f10219.mo693();
    }

    @Override // yyds.InterfaceC0981
    /* JADX INFO: renamed from: ᲀᛴᲁᲈ */
    public final InputStream mo2135() {
        return new C2595(this, 1);
    }

    /* JADX INFO: renamed from: ᲇᛱᛲ, reason: contains not printable characters */
    public final int m3929() throws EOFException {
        m3926(4L);
        int iM3022 = this.f10220.m3022();
        return ((iM3022 & 255) << 24) | (((-16777216) & iM3022) >>> 24) | ((16711680 & iM3022) >>> 8) | ((65280 & iM3022) << 8);
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00e2 A[SYNTHETIC] */
    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long m3930(byte b, long j, long j2) {
        C0502 c0502;
        long j3;
        long j4;
        long j5;
        long j6 = 0;
        if (this.f10218) {
            C0188.m800("closed");
            return 0L;
        }
        if (0 > j2) {
            C0188.m803(j2, "fromIndex=0 toIndex=");
            return 0L;
        }
        long jMax = 0;
        while (jMax < j2) {
            C1507 c1507 = this.f10220;
            if (j6 > jMax || jMax > j2) {
                throw new IllegalArgumentException(("size=" + c1507.f7087 + " fromIndex=" + jMax + " toIndex=" + j2).toString());
            }
            long j7 = c1507.f7087;
            long j8 = j2 > j7 ? j7 : j2;
            if (jMax == j8 || (c0502 = c1507.f7086) == null) {
                j3 = j6;
            } else {
                if (j7 - jMax < jMax) {
                    while (j7 > jMax) {
                        c0502 = c0502.f2445;
                        j7 -= (long) (c0502.f2446 - c0502.f2444);
                        j6 = j6;
                    }
                    j3 = j6;
                    long j9 = jMax;
                    while (j7 < j8) {
                        j4 = -1;
                        byte[] bArr = c0502.f2443;
                        long j10 = j9;
                        int iMin = (int) Math.min(c0502.f2446, (((long) c0502.f2444) + j8) - j7);
                        for (int i = (int) ((((long) c0502.f2444) + j10) - j7); i < iMin; i++) {
                            if (bArr[i] == b) {
                                j5 = ((long) (i - c0502.f2444)) + j7;
                                break;
                            }
                        }
                        j9 = ((long) (c0502.f2446 - c0502.f2444)) + j7;
                        c0502 = c0502.f2447;
                        j7 = j9;
                    }
                } else {
                    j3 = j6;
                    j4 = -1;
                    while (true) {
                        long j11 = ((long) (c0502.f2446 - c0502.f2444)) + j6;
                        if (j11 > jMax) {
                            break;
                        }
                        c0502 = c0502.f2447;
                        j6 = j11;
                    }
                    long j12 = jMax;
                    while (j6 < j8) {
                        byte[] bArr2 = c0502.f2443;
                        long j13 = j6;
                        int iMin2 = (int) Math.min(c0502.f2446, (((long) c0502.f2444) + j8) - j13);
                        for (int i2 = (int) ((((long) c0502.f2444) + j12) - j13); i2 < iMin2; i2++) {
                            if (bArr2[i2] == b) {
                                j5 = ((long) (i2 - c0502.f2444)) + j13;
                                break;
                            }
                        }
                        j12 = j13 + ((long) (c0502.f2446 - c0502.f2444));
                        c0502 = c0502.f2447;
                        j6 = j12;
                    }
                    j5 = j4;
                }
                if (j5 == j4) {
                    return j5;
                }
                long j14 = c1507.f7087;
                if (j14 >= j2 || this.f10219.mo692(8192L, c1507) == j4) {
                    return j4;
                }
                jMax = Math.max(jMax, j14);
                j6 = j3;
            }
            j4 = -1;
            j5 = j4;
            if (j5 == j4) {
            }
        }
        return -1L;
    }
}
