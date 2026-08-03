package p195n7;

import bsh.org.objectweb.asm.Opcodes;
import com.alibaba.fastjson2.JSONB;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CoderResult;
import java.nio.charset.StandardCharsets;
import okio.Utf8;

/* JADX INFO: renamed from: n7.e */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2906e extends CharsetDecoder {

    /* JADX INFO: renamed from: a */
    public static final C2906e f9385a = new C2906e(StandardCharsets.UTF_8, 1.0f, 1.0f);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static boolean m6307a(int i9, int i10, int i11) {
        return ((i9 != -32 || (i10 & 224) != 128) && (i10 & Opcodes.CHECKCAST) == 128 && (i11 & Opcodes.CHECKCAST) == 128) ? false : true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static boolean m6308b(int i9) {
        return (i9 & Opcodes.CHECKCAST) != 128;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static CoderResult m6309c(int i9, ByteBuffer byteBuffer) {
        int i10 = 1;
        if (i9 == 1 || i9 == 2) {
            return CoderResult.malformedForLength(1);
        }
        if (i9 != 3) {
            if (i9 != 4) {
                return null;
            }
            int i11 = byteBuffer.get() & 255;
            byte b10 = byteBuffer.get();
            int i12 = b10 & 255;
            return (i11 > 244 || (i11 == 240 && (i12 < 144 || i12 > 191)) || ((i11 == 244 && (b10 & JSONB.Constants.BC_INT32_NUM_MIN) != 128) || m6308b(i12))) ? CoderResult.malformedForLength(1) : m6308b(byteBuffer.get()) ? CoderResult.malformedForLength(2) : CoderResult.malformedForLength(3);
        }
        byte b11 = byteBuffer.get();
        byte b12 = byteBuffer.get();
        if ((b11 != -32 || (b12 & 224) != 128) && !m6308b(b12)) {
            i10 = 2;
        }
        return CoderResult.malformedForLength(i10);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static void m6310d(Buffer buffer, int i9, Buffer buffer2, int i10) {
        buffer.position(i9 - buffer.arrayOffset());
        buffer2.position(i10 - buffer2.arrayOffset());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static CoderResult m6311e(ByteBuffer byteBuffer, int i9, int i10) {
        byteBuffer.position(i9);
        return (i10 == 0 || byteBuffer.remaining() < i10) ? CoderResult.UNDERFLOW : CoderResult.OVERFLOW;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static CoderResult m6312f(ByteBuffer byteBuffer, int i9, int i10, CharBuffer charBuffer, int i11, int i12) {
        m6310d(byteBuffer, i9, charBuffer, i11);
        return (i12 == 0 || i10 - i9 < i12) ? CoderResult.UNDERFLOW : CoderResult.OVERFLOW;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.nio.charset.CharsetDecoder
    public final CoderResult decodeLoop(ByteBuffer byteBuffer, CharBuffer charBuffer) {
        byte[] bArr;
        int i9;
        int i10;
        ByteBuffer byteBuffer2 = byteBuffer;
        CharBuffer charBuffer2 = charBuffer;
        int i11 = 2;
        if (!byteBuffer2.hasArray() || !charBuffer2.hasArray()) {
            int iPosition = byteBuffer2.position();
            int iLimit = byteBuffer2.limit();
            while (iPosition < iLimit) {
                byte b10 = byteBuffer2.get();
                if (b10 < 0) {
                    if ((b10 >> 5) == -2 && (b10 & 30) != 0) {
                        int i12 = 2;
                        if (iLimit - iPosition >= 2) {
                            if (charBuffer2.remaining() < 1) {
                                i12 = 2;
                            } else {
                                byte b11 = byteBuffer2.get();
                                if (m6308b(b11)) {
                                    byteBuffer2.position(iPosition);
                                    return CoderResult.malformedForLength(1);
                                }
                                charBuffer2.put((char) (((b10 << 6) ^ b11) ^ Utf8.MASK_2BYTES));
                                iPosition += 2;
                            }
                        }
                        return m6311e(byteBuffer2, iPosition, i12);
                    }
                    if ((b10 >> 4) != -2) {
                        byteBuffer2.position(iPosition);
                        CoderResult coderResultMalformedForLength = CoderResult.malformedForLength(1);
                        byteBuffer2.position(iPosition);
                        return coderResultMalformedForLength;
                    }
                    int i13 = iLimit - iPosition;
                    if (i13 < 3 || charBuffer2.remaining() < 1) {
                        if (i13 > 1) {
                            byte b12 = byteBuffer2.get();
                            if ((b10 == -32 && (b12 & 224) == 128) || (b12 & JSONB.Constants.BC_INT64_SHORT_MIN) != 128) {
                                byteBuffer2.position(iPosition);
                                return CoderResult.malformedForLength(1);
                            }
                        }
                        return m6311e(byteBuffer2, iPosition, 3);
                    }
                    byte b13 = byteBuffer2.get();
                    byte b14 = byteBuffer2.get();
                    if (m6307a(b10, b13, b14)) {
                        byteBuffer2.position(iPosition);
                        CoderResult coderResultM6309c = m6309c(3, byteBuffer2);
                        byteBuffer2.position(iPosition);
                        return coderResultM6309c;
                    }
                    charBuffer2.put((char) ((((b10 << 12) ^ (b13 << 6)) ^ b14) ^ Utf8.MASK_3BYTES));
                    iPosition += 3;
                } else {
                    if (charBuffer2.remaining() < 1) {
                        return m6311e(byteBuffer2, iPosition, 1);
                    }
                    charBuffer2.put((char) b10);
                    iPosition++;
                }
            }
            return m6311e(byteBuffer2, iPosition, 0);
        }
        byte[] bArrArray = byteBuffer2.array();
        int iPosition2 = byteBuffer2.position() + byteBuffer2.arrayOffset();
        int iLimit2 = byteBuffer2.limit() + byteBuffer2.arrayOffset();
        char[] cArrArray = charBuffer2.array();
        int iPosition3 = charBuffer2.position() + charBuffer2.arrayOffset();
        int iLimit3 = charBuffer2.limit() + charBuffer2.arrayOffset();
        int i14 = iLimit2 - iPosition2;
        int i15 = iLimit3 - iPosition3;
        if (i15 < i14) {
            i14 = i15;
        }
        int i16 = i14 + iPosition3;
        while (iPosition3 < i16) {
            byte b15 = bArrArray[iPosition2];
            if (b15 < 0) {
                break;
            }
            iPosition2++;
            cArrArray[iPosition3] = (char) b15;
            iPosition3++;
        }
        while (iPosition2 < iLimit2) {
            byte b16 = bArrArray[iPosition2];
            if (b16 < 0) {
                if ((b16 >> 5) != -2 || (b16 & 30) == 0) {
                    int i17 = iPosition2;
                    bArr = bArrArray;
                    if ((b16 >> 4) != -2) {
                        byteBuffer2.position(i17 - byteBuffer2.arrayOffset());
                        CoderResult coderResultM6309c2 = m6309c(1, byteBuffer2);
                        m6310d(byteBuffer2, i17, charBuffer2, iPosition3);
                        return coderResultM6309c2;
                    }
                    int i18 = iLimit2 - i17;
                    if (i18 < 3 || iPosition3 >= iLimit3) {
                        if (i18 > 1) {
                            byte b17 = bArr[i17 + 1];
                            if ((b16 == -32 && (b17 & 224) == 128) || (b17 & JSONB.Constants.BC_INT64_SHORT_MIN) != 128) {
                                m6310d(byteBuffer2, i17, charBuffer2, iPosition3);
                                return CoderResult.malformedForLength(1);
                            }
                        }
                        return m6312f(byteBuffer2, i17, iLimit2, charBuffer2, iPosition3, 3);
                    }
                    byte b18 = bArr[i17 + 1];
                    byte b19 = bArr[i17 + 2];
                    if (m6307a(b16, b18, b19)) {
                        byteBuffer2.position(i17 - byteBuffer2.arrayOffset());
                        CoderResult coderResultM6309c3 = m6309c(3, byteBuffer2);
                        m6310d(byteBuffer2, i17, charBuffer2, iPosition3);
                        return coderResultM6309c3;
                    }
                    i10 = iPosition3 + 1;
                    cArrArray[iPosition3] = (char) ((((b16 << 12) ^ (b18 << 6)) ^ b19) ^ Utf8.MASK_3BYTES);
                    i9 = i17 + 3;
                } else {
                    if (iLimit2 - iPosition2 < i11 || iPosition3 >= iLimit3) {
                        return m6312f(byteBuffer2, iPosition2, iLimit2, charBuffer2, iPosition3, 2);
                    }
                    byte b20 = bArrArray[iPosition2 + 1];
                    if (m6308b(b20)) {
                        m6310d(byteBuffer2, iPosition2, charBuffer2, iPosition3);
                        return CoderResult.malformedForLength(1);
                    }
                    i10 = iPosition3 + 1;
                    cArrArray[iPosition3] = (char) (((b16 << 6) ^ b20) ^ Utf8.MASK_2BYTES);
                    int i19 = iPosition2 + 2;
                    bArr = bArrArray;
                    i9 = i19;
                }
                iPosition3 = i10;
            } else {
                int i20 = iPosition2;
                bArr = bArrArray;
                if (iPosition3 >= iLimit3) {
                    return m6312f(byteBuffer, i20, iLimit2, charBuffer, iPosition3, 1);
                }
                cArrArray[iPosition3] = (char) b16;
                i9 = i20 + 1;
                iPosition3++;
            }
            byte[] bArr2 = bArr;
            iPosition2 = i9;
            bArrArray = bArr2;
            byteBuffer2 = byteBuffer;
            charBuffer2 = charBuffer;
            i11 = 2;
        }
        return m6312f(byteBuffer, iPosition2, iLimit2, charBuffer, iPosition3, 0);
    }
}
