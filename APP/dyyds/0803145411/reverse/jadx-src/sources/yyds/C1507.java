package yyds;

import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: yyds.ᛷᛲᲈᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1507 implements InterfaceC0981, InterfaceC0828, Cloneable, ByteChannel {

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public C0502 f7086;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public long f7087;

    public final Object clone() {
        C1507 c1507 = new C1507();
        if (this.f7087 == 0) {
            return c1507;
        }
        C0502 c0502 = this.f7086;
        C0502 c0502M1352 = c0502.m1352();
        c1507.f7086 = c0502M1352;
        c0502M1352.f2445 = c0502M1352;
        c0502M1352.f2447 = c0502M1352;
        for (C0502 c05022 = c0502.f2447; c05022 != c0502; c05022 = c05022.f2447) {
            c0502M1352.f2445.m1351(c05022.m1352());
        }
        c1507.f7087 = this.f7087;
        return c1507;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, yyds.InterfaceC1979
    public final void close() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1507)) {
            return false;
        }
        long j = this.f7087;
        C1507 c1507 = (C1507) obj;
        if (j != c1507.f7087) {
            return false;
        }
        if (j == 0) {
            return true;
        }
        C0502 c0502 = this.f7086;
        C0502 c05022 = c1507.f7086;
        int i = c0502.f2444;
        int i2 = c05022.f2444;
        long j2 = 0;
        while (j2 < this.f7087) {
            long jMin = Math.min(c0502.f2446 - i, c05022.f2446 - i2);
            long j3 = 0;
            while (j3 < jMin) {
                int i3 = i + 1;
                int i4 = i2 + 1;
                if (c0502.f2443[i] != c05022.f2443[i2]) {
                    return false;
                }
                j3++;
                i = i3;
                i2 = i4;
            }
            if (i == c0502.f2446) {
                c0502 = c0502.f2447;
                i = c0502.f2444;
            }
            if (i2 == c05022.f2446) {
                c05022 = c05022.f2447;
                i2 = c05022.f2444;
            }
            j2 += jMin;
        }
        return true;
    }

    @Override // yyds.InterfaceC1979, java.io.Flushable
    public final void flush() {
    }

    public final int hashCode() {
        C0502 c0502 = this.f7086;
        if (c0502 == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = c0502.f2446;
            for (int i3 = c0502.f2444; i3 < i2; i3++) {
                i = (i * 31) + c0502.f2443[i3];
            }
            c0502 = c0502.f2447;
        } while (c0502 != this.f7086);
        return i;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    public final int read(byte[] bArr, int i, int i2) {
        AbstractC2217.m4201(bArr.length, i, i2);
        C0502 c0502 = this.f7086;
        if (c0502 == null) {
            return -1;
        }
        int iMin = Math.min(i2, c0502.f2446 - c0502.f2444);
        byte[] bArr2 = c0502.f2443;
        int i3 = c0502.f2444;
        AbstractC2070.m3938(bArr2, bArr, i, i3, i3 + iMin);
        int i4 = c0502.f2444 + iMin;
        c0502.f2444 = i4;
        this.f7087 -= (long) iMin;
        if (i4 == c0502.f2446) {
            this.f7086 = c0502.m1350();
            AbstractC1478.m2976(c0502);
        }
        return iMin;
    }

    public final String toString() {
        long j = this.f7087;
        if (j <= 2147483647L) {
            return m3032((int) j).toString();
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + this.f7087).toString());
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        int iRemaining = byteBuffer.remaining();
        int i = iRemaining;
        while (i > 0) {
            C0502 c0502M3039 = m3039(1);
            int iMin = Math.min(i, 8192 - c0502M3039.f2446);
            byteBuffer.get(c0502M3039.f2443, c0502M3039.f2446, iMin);
            i -= iMin;
            c0502M3039.f2446 += iMin;
        }
        this.f7087 += (long) iRemaining;
        return iRemaining;
    }

    @Override // yyds.InterfaceC0981
    /* JADX INFO: renamed from: ᛱᛳᛶᛳ */
    public final String mo2132(Charset charset) {
        return m3031(this.f7087, charset);
    }

    @Override // yyds.InterfaceC1979
    /* JADX INFO: renamed from: ᛱᛳᲇ */
    public final void mo576(long j, C1507 c1507) {
        C0502 c0502M2977;
        if (c1507 == this) {
            C0188.m798("source == this");
            return;
        }
        AbstractC2217.m4201(c1507.f7087, 0L, j);
        while (j > 0) {
            C0502 c0502 = c1507.f7086;
            int i = c0502.f2446 - c0502.f2444;
            if (j < i) {
                C0502 c05022 = this.f7086;
                C0502 c05023 = c05022 != null ? c05022.f2445 : null;
                if (c05023 != null && c05023.f2442) {
                    if ((((long) c05023.f2446) + j) - ((long) (c05023.f2448 ? 0 : c05023.f2444)) <= 8192) {
                        c0502.m1353(c05023, (int) j);
                        c1507.f7087 -= j;
                        this.f7087 += j;
                        return;
                    }
                }
                int i2 = (int) j;
                if (i2 <= 0 || i2 > i) {
                    C0188.m798("byteCount out of range");
                    return;
                }
                if (i2 >= 1024) {
                    c0502M2977 = c0502.m1352();
                } else {
                    c0502M2977 = AbstractC1478.m2977();
                    byte[] bArr = c0502.f2443;
                    byte[] bArr2 = c0502M2977.f2443;
                    int i3 = c0502.f2444;
                    AbstractC2070.m3933(bArr, bArr2, 0, i3, i3 + i2, 2);
                }
                c0502M2977.f2446 = c0502M2977.f2444 + i2;
                c0502.f2444 += i2;
                c0502.f2445.m1351(c0502M2977);
                c1507.f7086 = c0502M2977;
                c0502 = c0502M2977;
            }
            long j2 = c0502.f2446 - c0502.f2444;
            c1507.f7086 = c0502.m1350();
            C0502 c05024 = this.f7086;
            if (c05024 == null) {
                this.f7086 = c0502;
                c0502.f2445 = c0502;
                c0502.f2447 = c0502;
            } else {
                c05024.f2445.m1351(c0502);
                C0502 c05025 = c0502.f2445;
                if (c05025 == c0502) {
                    C0188.m800("cannot compact");
                    return;
                } else if (c05025.f2442) {
                    int i4 = c0502.f2446 - c0502.f2444;
                    if (i4 <= (8192 - c05025.f2446) + (c05025.f2448 ? 0 : c05025.f2444)) {
                        c0502.m1353(c05025, i4);
                        c0502.m1350();
                        AbstractC1478.m2976(c0502);
                    }
                }
            }
            c1507.f7087 -= j2;
            this.f7087 += j2;
            j -= j2;
        }
    }

    /* JADX INFO: renamed from: ᛱᛸᲁᲇ, reason: contains not printable characters */
    public final void m3016(C2534 c2534) {
        c2534.mo4263(this, c2534.mo4261());
    }

    /* JADX INFO: renamed from: ᛱᲀᲈᛲ, reason: contains not printable characters */
    public final void m3017(int i) {
        if (i < 128) {
            m3036(i);
            return;
        }
        if (i < 2048) {
            C0502 c0502M3039 = m3039(2);
            byte[] bArr = c0502M3039.f2443;
            int i2 = c0502M3039.f2446;
            bArr[i2] = (byte) ((i >> 6) | 192);
            bArr[i2 + 1] = (byte) ((i & 63) | 128);
            c0502M3039.f2446 = i2 + 2;
            this.f7087 += 2;
            return;
        }
        if (55296 <= i && i < 57344) {
            m3036(63);
            return;
        }
        if (i < 65536) {
            C0502 c0502M30392 = m3039(3);
            byte[] bArr2 = c0502M30392.f2443;
            int i3 = c0502M30392.f2446;
            bArr2[i3] = (byte) ((i >> 12) | 224);
            bArr2[i3 + 1] = (byte) (((i >> 6) & 63) | 128);
            bArr2[i3 + 2] = (byte) ((i & 63) | 128);
            c0502M30392.f2446 = i3 + 3;
            this.f7087 += 3;
            return;
        }
        if (i > 1114111) {
            C0188.m798("Unexpected code point: 0x".concat(AbstractC2217.m4204(i)));
            return;
        }
        C0502 c0502M30393 = m3039(4);
        byte[] bArr3 = c0502M30393.f2443;
        int i4 = c0502M30393.f2446;
        bArr3[i4] = (byte) ((i >> 18) | 240);
        bArr3[i4 + 1] = (byte) (((i >> 12) & 63) | 128);
        bArr3[i4 + 2] = (byte) (((i >> 6) & 63) | 128);
        bArr3[i4 + 3] = (byte) ((i & 63) | 128);
        c0502M30393.f2446 = i4 + 4;
        this.f7087 += 4;
    }

    /* JADX INFO: renamed from: ᛲᛱᲁᛳ, reason: contains not printable characters */
    public final void m3018(int i, byte[] bArr) {
        long j = i;
        AbstractC2217.m4201(bArr.length, 0L, j);
        int i2 = 0;
        while (i2 < i) {
            C0502 c0502M3039 = m3039(1);
            int iMin = Math.min(i - i2, 8192 - c0502M3039.f2446);
            int i3 = i2 + iMin;
            AbstractC2070.m3938(bArr, c0502M3039.f2443, c0502M3039.f2446, i2, i3);
            c0502M3039.f2446 += iMin;
            i2 = i3;
        }
        this.f7087 += j;
    }

    @Override // yyds.InterfaceC0981
    /* JADX INFO: renamed from: ᛲᛲᲈᲈ */
    public final byte[] mo2133() {
        return m3023(this.f7087);
    }

    /* JADX INFO: renamed from: ᛲᲀᛲᛲ, reason: contains not printable characters */
    public final void m3019(String str) {
        m3026(str, 0, str.length());
    }

    /* JADX INFO: renamed from: ᛲᲀᛵᛷ, reason: contains not printable characters */
    public final void m3020(long j) {
        if (j == 0) {
            m3036(48);
            return;
        }
        long j2 = (j >>> 1) | j;
        long j3 = j2 | (j2 >>> 2);
        long j4 = j3 | (j3 >>> 4);
        long j5 = j4 | (j4 >>> 8);
        long j6 = j5 | (j5 >>> 16);
        long j7 = j6 | (j6 >>> 32);
        long j8 = j7 - ((j7 >>> 1) & 6148914691236517205L);
        long j9 = ((j8 >>> 2) & 3689348814741910323L) + (j8 & 3689348814741910323L);
        long j10 = ((j9 >>> 4) + j9) & 1085102592571150095L;
        long j11 = j10 + (j10 >>> 8);
        long j12 = j11 + (j11 >>> 16);
        int i = (int) ((((j12 & 63) + ((j12 >>> 32) & 63)) + 3) / 4);
        C0502 c0502M3039 = m3039(i);
        byte[] bArr = c0502M3039.f2443;
        int i2 = c0502M3039.f2446;
        for (int i3 = (i2 + i) - 1; i3 >= i2; i3--) {
            bArr[i3] = AbstractC1168.f5369[(int) (15 & j)];
            j >>>= 4;
        }
        c0502M3039.f2446 += i;
        this.f7087 += (long) i;
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final boolean m3021() {
        return this.f7087 == 0;
    }

    /* JADX INFO: renamed from: ᛳᛸᛴᛶ, reason: contains not printable characters */
    public final int m3022() throws EOFException {
        long j = this.f7087;
        if (j < 4) {
            throw new EOFException();
        }
        C0502 c0502 = this.f7086;
        int i = c0502.f2444;
        int i2 = c0502.f2446;
        if (i2 - i < 4) {
            return (m3033() & 255) | ((m3033() & 255) << 24) | ((m3033() & 255) << 16) | ((m3033() & 255) << 8);
        }
        byte[] bArr = c0502.f2443;
        int i3 = i + 3;
        int i4 = ((bArr[i + 1] & 255) << 16) | ((bArr[i] & 255) << 24) | ((bArr[i + 2] & 255) << 8);
        int i5 = i + 4;
        int i6 = (bArr[i3] & 255) | i4;
        this.f7087 = j - 4;
        if (i5 != i2) {
            c0502.f2444 = i5;
            return i6;
        }
        this.f7086 = c0502.m1350();
        AbstractC1478.m2976(c0502);
        return i6;
    }

    /* JADX INFO: renamed from: ᛳᲁᲁᲇ, reason: contains not printable characters */
    public final byte[] m3023(long j) throws EOFException {
        if (j < 0 || j > 2147483647L) {
            C0188.m803(j, "byteCount: ");
            return null;
        }
        if (this.f7087 < j) {
            throw new EOFException();
        }
        int i = (int) j;
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int i3 = read(bArr, i2, i - i2);
            if (i3 == -1) {
                throw new EOFException();
            }
            i2 += i3;
        }
        return bArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x009f A[EDGE_INSN: B:44:0x009f->B:38:0x009f BREAK  A[LOOP:0: B:5:0x000c->B:46:?], SYNTHETIC] */
    /* JADX INFO: renamed from: ᛵᛶᛲᲀ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long m3024() throws EOFException {
        int i;
        if (this.f7087 == 0) {
            throw new EOFException();
        }
        int i2 = 0;
        boolean z = false;
        long j = 0;
        do {
            C0502 c0502 = this.f7086;
            byte[] bArr = c0502.f2443;
            int i3 = c0502.f2444;
            int i4 = c0502.f2446;
            while (i3 < i4) {
                byte b = bArr[i3];
                if (b >= 48 && b <= 57) {
                    i = b - 48;
                } else if (b >= 97 && b <= 102) {
                    i = b - 87;
                } else if (b < 65 || b > 70) {
                    z = true;
                    if (i2 == 0) {
                        char[] cArr = AbstractC0181.f1027;
                        throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(new String(new char[]{cArr[(b >> 4) & 15], cArr[b & 15]})));
                    }
                    if (i3 != i4) {
                        this.f7086 = c0502.m1350();
                        AbstractC1478.m2976(c0502);
                    } else {
                        c0502.f2444 = i3;
                    }
                    if (!z) {
                        break;
                    }
                } else {
                    i = b - 55;
                }
                if (((-1152921504606846976L) & j) != 0) {
                    C1507 c1507 = new C1507();
                    c1507.m3020(j);
                    c1507.m3036(b);
                    throw new NumberFormatException("Number too large: ".concat(c1507.m3035()));
                }
                j = (j << 4) | ((long) i);
                i3++;
                i2++;
            }
            if (i3 != i4) {
            }
            if (!z) {
            }
        } while (this.f7086 != null);
        this.f7087 -= (long) i2;
        return j;
    }

    /* JADX INFO: renamed from: ᛵᲀᲈᛴ, reason: contains not printable characters */
    public final short m3025() throws EOFException {
        long j = this.f7087;
        if (j < 2) {
            throw new EOFException();
        }
        C0502 c0502 = this.f7086;
        int i = c0502.f2444;
        int i2 = c0502.f2446;
        if (i2 - i < 2) {
            return (short) ((m3033() & 255) | ((m3033() & 255) << 8));
        }
        byte[] bArr = c0502.f2443;
        int i3 = i + 1;
        int i4 = (bArr[i] & 255) << 8;
        int i5 = i + 2;
        int i6 = (bArr[i3] & 255) | i4;
        this.f7087 = j - 2;
        if (i5 == i2) {
            this.f7086 = c0502.m1350();
            AbstractC1478.m2976(c0502);
        } else {
            c0502.f2444 = i5;
        }
        return (short) i6;
    }

    /* JADX INFO: renamed from: ᛶᛴᛱᛲ, reason: contains not printable characters */
    public final void m3026(String str, int i, int i2) {
        char cCharAt;
        if (i < 0) {
            C0188.m806(AbstractC0897.m1989(i, "beginIndex < 0: "));
            return;
        }
        if (i2 < i) {
            C0188.m806(AbstractC0897.m1987(i2, i, "endIndex < beginIndex: ", " < "));
            return;
        }
        if (i2 > str.length()) {
            C0188.m790("endIndex > string.length: ", i2, " > ", str.length());
            return;
        }
        while (i < i2) {
            char cCharAt2 = str.charAt(i);
            if (cCharAt2 < 128) {
                C0502 c0502M3039 = m3039(1);
                byte[] bArr = c0502M3039.f2443;
                int i3 = c0502M3039.f2446 - i;
                int iMin = Math.min(i2, 8192 - i3);
                int i4 = i + 1;
                bArr[i + i3] = (byte) cCharAt2;
                while (true) {
                    i = i4;
                    if (i >= iMin || (cCharAt = str.charAt(i)) >= 128) {
                        break;
                    }
                    i4 = i + 1;
                    bArr[i + i3] = (byte) cCharAt;
                }
                int i5 = c0502M3039.f2446;
                int i6 = (i3 + i) - i5;
                c0502M3039.f2446 = i5 + i6;
                this.f7087 += (long) i6;
            } else {
                if (cCharAt2 < 2048) {
                    C0502 c0502M30392 = m3039(2);
                    byte[] bArr2 = c0502M30392.f2443;
                    int i7 = c0502M30392.f2446;
                    bArr2[i7] = (byte) ((cCharAt2 >> 6) | 192);
                    bArr2[i7 + 1] = (byte) ((cCharAt2 & '?') | 128);
                    c0502M30392.f2446 = i7 + 2;
                    this.f7087 += 2;
                } else if (cCharAt2 < 55296 || cCharAt2 > 57343) {
                    C0502 c0502M30393 = m3039(3);
                    byte[] bArr3 = c0502M30393.f2443;
                    int i8 = c0502M30393.f2446;
                    bArr3[i8] = (byte) ((cCharAt2 >> '\f') | 224);
                    bArr3[i8 + 1] = (byte) ((63 & (cCharAt2 >> 6)) | 128);
                    bArr3[i8 + 2] = (byte) ((cCharAt2 & '?') | 128);
                    c0502M30393.f2446 = i8 + 3;
                    this.f7087 += 3;
                } else {
                    int i9 = i + 1;
                    char cCharAt3 = i9 < i2 ? str.charAt(i9) : (char) 0;
                    if (cCharAt2 > 56319 || 56320 > cCharAt3 || cCharAt3 >= 57344) {
                        m3036(63);
                        i = i9;
                    } else {
                        int i10 = (((cCharAt2 & 1023) << 10) | (cCharAt3 & 1023)) + 65536;
                        C0502 c0502M30394 = m3039(4);
                        byte[] bArr4 = c0502M30394.f2443;
                        int i11 = c0502M30394.f2446;
                        bArr4[i11] = (byte) ((i10 >> 18) | 240);
                        bArr4[i11 + 1] = (byte) (((i10 >> 12) & 63) | 128);
                        bArr4[i11 + 2] = (byte) (((i10 >> 6) & 63) | 128);
                        bArr4[i11 + 3] = (byte) ((i10 & 63) | 128);
                        c0502M30394.f2446 = i11 + 4;
                        this.f7087 += 4;
                        i += 2;
                    }
                }
                i++;
            }
        }
    }

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final long m3027(C2534 c2534) {
        int i;
        int i2;
        C0502 c0502 = this.f7086;
        if (c0502 == null) {
            return -1L;
        }
        long j = this.f7087;
        long j2 = 0;
        if (j < 0) {
            while (j > 0) {
                c0502 = c0502.f2445;
                j -= (long) (c0502.f2446 - c0502.f2444);
            }
            if (c2534.mo4261() == 2) {
                byte bMo4259 = c2534.mo4259(0);
                byte bMo42592 = c2534.mo4259(1);
                while (j < this.f7087) {
                    byte[] bArr = c0502.f2443;
                    i = (int) ((((long) c0502.f2444) + j2) - j);
                    int i3 = c0502.f2446;
                    while (i < i3) {
                        byte b = bArr[i];
                        if (b == bMo4259 || b == bMo42592) {
                            i2 = c0502.f2444;
                        } else {
                            i++;
                        }
                    }
                    j2 = ((long) (c0502.f2446 - c0502.f2444)) + j;
                    c0502 = c0502.f2447;
                    j = j2;
                }
                return -1L;
            }
            byte[] bArrMo4267 = c2534.mo4267();
            while (j < this.f7087) {
                byte[] bArr2 = c0502.f2443;
                i = (int) ((((long) c0502.f2444) + j2) - j);
                int i4 = c0502.f2446;
                while (i < i4) {
                    byte b2 = bArr2[i];
                    for (byte b3 : bArrMo4267) {
                        if (b2 == b3) {
                            i2 = c0502.f2444;
                        }
                    }
                    i++;
                }
                j2 = ((long) (c0502.f2446 - c0502.f2444)) + j;
                c0502 = c0502.f2447;
                j = j2;
            }
            return -1L;
        }
        j = 0;
        while (true) {
            long j3 = ((long) (c0502.f2446 - c0502.f2444)) + j;
            if (j3 > 0) {
                break;
            }
            c0502 = c0502.f2447;
            j = j3;
        }
        if (c2534.mo4261() == 2) {
            byte bMo42593 = c2534.mo4259(0);
            byte bMo42594 = c2534.mo4259(1);
            while (j < this.f7087) {
                byte[] bArr3 = c0502.f2443;
                i = (int) ((((long) c0502.f2444) + j2) - j);
                int i5 = c0502.f2446;
                while (i < i5) {
                    byte b4 = bArr3[i];
                    if (b4 == bMo42593 || b4 == bMo42594) {
                        i2 = c0502.f2444;
                    } else {
                        i++;
                    }
                }
                j2 = ((long) (c0502.f2446 - c0502.f2444)) + j;
                c0502 = c0502.f2447;
                j = j2;
            }
            return -1L;
        }
        byte[] bArrMo42672 = c2534.mo4267();
        while (j < this.f7087) {
            byte[] bArr4 = c0502.f2443;
            i = (int) ((((long) c0502.f2444) + j2) - j);
            int i6 = c0502.f2446;
            while (i < i6) {
                byte b5 = bArr4[i];
                for (byte b6 : bArrMo42672) {
                    if (b5 == b6) {
                        i2 = c0502.f2444;
                    }
                }
                i++;
            }
            j2 = ((long) (c0502.f2446 - c0502.f2444)) + j;
            c0502 = c0502.f2447;
            j = j2;
        }
        return -1L;
        return ((long) (i - i2)) + j;
    }

    @Override // yyds.InterfaceC1590
    /* JADX INFO: renamed from: ᛶᛸᲀᲁ */
    public final long mo692(long j, C1507 c1507) {
        if (j < 0) {
            C0188.m803(j, "byteCount < 0: ");
            return 0L;
        }
        long j2 = this.f7087;
        if (j2 == 0) {
            return -1L;
        }
        if (j > j2) {
            j = j2;
        }
        c1507.mo576(j, this);
        return j;
    }

    /* JADX INFO: renamed from: ᛶᲀᲈᲇ, reason: contains not printable characters */
    public final void m3028(long j) {
        boolean z;
        if (j == 0) {
            m3036(48);
            return;
        }
        if (j < 0) {
            j = -j;
            if (j < 0) {
                m3019("-9223372036854775808");
                return;
            }
            z = true;
        } else {
            z = false;
        }
        byte[] bArr = AbstractC1168.f5369;
        int iNumberOfLeadingZeros = ((64 - Long.numberOfLeadingZeros(j)) * 10) >>> 5;
        int i = iNumberOfLeadingZeros + (j > AbstractC1168.f5370[iNumberOfLeadingZeros] ? 1 : 0);
        if (z) {
            i++;
        }
        C0502 c0502M3039 = m3039(i);
        byte[] bArr2 = c0502M3039.f2443;
        int i2 = c0502M3039.f2446 + i;
        while (j != 0) {
            i2--;
            bArr2[i2] = AbstractC1168.f5369[(int) (j % 10)];
            j /= 10;
        }
        if (z) {
            bArr2[i2 - 1] = 45;
        }
        c0502M3039.f2446 += i;
        this.f7087 += (long) i;
    }

    @Override // yyds.InterfaceC0981
    /* JADX INFO: renamed from: ᛷᛲᲈᛱ */
    public final int mo2134(C1662 c1662) throws EOFException {
        int iM2358 = AbstractC1168.m2358(this, c1662, false);
        if (iM2358 == -1) {
            return -1;
        }
        m3030(c1662.f8465[iM2358].mo4261());
        return iM2358;
    }

    /* JADX INFO: renamed from: ᛷᛴᛴᲁ, reason: contains not printable characters */
    public final void m3029(int i) {
        C0502 c0502M3039 = m3039(4);
        byte[] bArr = c0502M3039.f2443;
        int i2 = c0502M3039.f2446;
        bArr[i2] = (byte) ((i >>> 24) & 255);
        bArr[i2 + 1] = (byte) ((i >>> 16) & 255);
        bArr[i2 + 2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 3] = (byte) (i & 255);
        c0502M3039.f2446 = i2 + 4;
        this.f7087 += 4;
    }

    /* JADX INFO: renamed from: ᛷᛶᛷᲀ, reason: contains not printable characters */
    public final void m3030(long j) throws EOFException {
        while (j > 0) {
            C0502 c0502 = this.f7086;
            if (c0502 == null) {
                throw new EOFException();
            }
            int iMin = (int) Math.min(j, c0502.f2446 - c0502.f2444);
            long j2 = iMin;
            this.f7087 -= j2;
            j -= j2;
            int i = c0502.f2444 + iMin;
            c0502.f2444 = i;
            if (i == c0502.f2446) {
                this.f7086 = c0502.m1350();
                AbstractC1478.m2976(c0502);
            }
        }
    }

    /* JADX INFO: renamed from: ᛷᛸᲇᛶ, reason: contains not printable characters */
    public final String m3031(long j, Charset charset) throws EOFException {
        if (j < 0 || j > 2147483647L) {
            C0188.m803(j, "byteCount: ");
            return null;
        }
        if (this.f7087 < j) {
            throw new EOFException();
        }
        if (j == 0) {
            return "";
        }
        C0502 c0502 = this.f7086;
        int i = c0502.f2444;
        if (((long) i) + j > c0502.f2446) {
            return new String(m3023(j), charset);
        }
        int i2 = (int) j;
        String str = new String(c0502.f2443, i, i2, charset);
        int i3 = c0502.f2444 + i2;
        c0502.f2444 = i3;
        this.f7087 -= j;
        if (i3 == c0502.f2446) {
            this.f7086 = c0502.m1350();
            AbstractC1478.m2976(c0502);
        }
        return str;
    }

    /* JADX INFO: renamed from: ᛷᲇᛲᛱ, reason: contains not printable characters */
    public final C2534 m3032(int i) {
        if (i == 0) {
            return C2534.f12475;
        }
        AbstractC2217.m4201(this.f7087, 0L, i);
        C0502 c0502 = this.f7086;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            int i5 = c0502.f2446;
            int i6 = c0502.f2444;
            if (i5 == i6) {
                throw new AssertionError("s.limit == s.pos");
            }
            i3 += i5 - i6;
            i4++;
            c0502 = c0502.f2447;
        }
        byte[][] bArr = new byte[i4][];
        int[] iArr = new int[i4 * 2];
        C0502 c05022 = this.f7086;
        int i7 = 0;
        while (i2 < i) {
            bArr[i7] = c05022.f2443;
            i2 += c05022.f2446 - c05022.f2444;
            iArr[i7] = Math.min(i2, i);
            iArr[i7 + i4] = c05022.f2444;
            c05022.f2448 = true;
            i7++;
            c05022 = c05022.f2447;
        }
        return new C2263(bArr, iArr);
    }

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public final byte m3033() throws EOFException {
        long j = this.f7087;
        if (j == 0) {
            throw new EOFException();
        }
        C0502 c0502 = this.f7086;
        int i = c0502.f2444;
        int i2 = c0502.f2446;
        int i3 = i + 1;
        byte b = c0502.f2443[i];
        this.f7087 = j - 1;
        if (i3 != i2) {
            c0502.f2444 = i3;
            return b;
        }
        this.f7086 = c0502.m1350();
        AbstractC1478.m2976(c0502);
        return b;
    }

    /* JADX INFO: renamed from: ᛸᛴᛵᛶ, reason: contains not printable characters */
    public final void m3034(InterfaceC1590 interfaceC1590) {
        while (interfaceC1590.mo692(8192L, this) != -1) {
        }
    }

    /* JADX INFO: renamed from: ᛸᛸᛷᛱ, reason: contains not printable characters */
    public final String m3035() {
        return m3031(this.f7087, AbstractC0347.f1806);
    }

    @Override // yyds.InterfaceC1590
    /* JADX INFO: renamed from: ᲀᛲᛳᲀ */
    public final C2755 mo693() {
        return C2755.f13475;
    }

    @Override // yyds.InterfaceC0981
    /* JADX INFO: renamed from: ᲀᛴᲁᲈ */
    public final InputStream mo2135() {
        return new C2595(this, 0);
    }

    /* JADX INFO: renamed from: ᲁᛶᛴᛸ, reason: contains not printable characters */
    public final void m3036(int i) {
        C0502 c0502M3039 = m3039(1);
        byte[] bArr = c0502M3039.f2443;
        int i2 = c0502M3039.f2446;
        c0502M3039.f2446 = i2 + 1;
        bArr[i2] = (byte) i;
        this.f7087++;
    }

    /* JADX INFO: renamed from: ᲇᛱᛲ, reason: contains not printable characters */
    public final C2534 m3037(long j) throws EOFException {
        if (j < 0 || j > 2147483647L) {
            C0188.m803(j, "byteCount: ");
            return null;
        }
        if (this.f7087 < j) {
            throw new EOFException();
        }
        if (j < 4096) {
            return new C2534(m3023(j));
        }
        C2534 c2534M3032 = m3032((int) j);
        m3030(j);
        return c2534M3032;
    }

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final byte m3038(long j) {
        AbstractC2217.m4201(this.f7087, j, 1L);
        C0502 c0502 = this.f7086;
        c0502.getClass();
        long j2 = this.f7087;
        if (j2 - j < j) {
            while (j2 > j) {
                c0502 = c0502.f2445;
                j2 -= (long) (c0502.f2446 - c0502.f2444);
            }
            return c0502.f2443[(int) ((((long) c0502.f2444) + j) - j2)];
        }
        long j3 = 0;
        while (true) {
            int i = c0502.f2446;
            int i2 = c0502.f2444;
            long j4 = ((long) (i - i2)) + j3;
            if (j4 > j) {
                return c0502.f2443[(int) ((((long) i2) + j) - j3)];
            }
            c0502 = c0502.f2447;
            j3 = j4;
        }
    }

    /* JADX INFO: renamed from: ᲈᛷᲈᛶ, reason: contains not printable characters */
    public final C0502 m3039(int i) {
        if (i < 1 || i > 8192) {
            C0188.m798("unexpected capacity");
            return null;
        }
        C0502 c0502 = this.f7086;
        if (c0502 == null) {
            C0502 c0502M2977 = AbstractC1478.m2977();
            this.f7086 = c0502M2977;
            c0502M2977.f2445 = c0502M2977;
            c0502M2977.f2447 = c0502M2977;
            return c0502M2977;
        }
        C0502 c05022 = c0502.f2445;
        if (c05022.f2446 + i <= 8192 && c05022.f2442) {
            return c05022;
        }
        C0502 c0502M29772 = AbstractC1478.m2977();
        c05022.m1351(c0502M29772);
        return c0502M29772;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        C0502 c0502 = this.f7086;
        if (c0502 == null) {
            return -1;
        }
        int iMin = Math.min(byteBuffer.remaining(), c0502.f2446 - c0502.f2444);
        byteBuffer.put(c0502.f2443, c0502.f2444, iMin);
        int i = c0502.f2444 + iMin;
        c0502.f2444 = i;
        this.f7087 -= (long) iMin;
        if (i == c0502.f2446) {
            this.f7086 = c0502.m1350();
            AbstractC1478.m2976(c0502);
        }
        return iMin;
    }
}
