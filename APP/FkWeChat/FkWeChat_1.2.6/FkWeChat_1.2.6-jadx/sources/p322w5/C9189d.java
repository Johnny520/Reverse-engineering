package p322w5;

import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import java.nio.ByteBuffer;
import p322w5.AbstractC9188c;
import p376zd.C9987e;

/* JADX INFO: renamed from: w5.d */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C9189d extends AbstractC9188c {

    /* JADX INFO: renamed from: w5.d$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class a extends IllegalArgumentException {
        public a(int i10, int i11) {
            super("Unpaired surrogate at index " + i10 + " of " + i11);
        }
    }

    /* JADX INFO: renamed from: e */
    public static int m35809e(CharSequence charSequence) {
        int length = charSequence.length();
        int i10 = 0;
        while (i10 < length && charSequence.charAt(i10) < 128) {
            i10++;
        }
        int iM35814j = length;
        while (true) {
            if (i10 < length) {
                char cCharAt = charSequence.charAt(i10);
                if (cCharAt >= 2048) {
                    iM35814j += m35814j(charSequence, i10);
                    break;
                }
                iM35814j += (127 - cCharAt) >>> 31;
                i10++;
            } else {
                break;
            }
        }
        if (iM35814j >= length) {
            return iM35814j;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (((long) iM35814j) + JSONWriter.MASK_IGNORE_NON_FIELD_GETTER));
    }

    /* JADX INFO: renamed from: f */
    public static String m35810f(byte[] bArr, int i10, int i11) {
        if ((i10 | i11 | ((bArr.length - i10) - i11)) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i10), Integer.valueOf(i11)));
        }
        int i12 = i10 + i11;
        char[] cArr = new char[i11];
        int i13 = 0;
        while (i10 < i12) {
            byte b10 = bArr[i10];
            if (!AbstractC9188c.a.m35804g(b10)) {
                break;
            }
            i10++;
            AbstractC9188c.a.m35799b(b10, cArr, i13);
            i13++;
        }
        int i14 = i13;
        while (i10 < i12) {
            int i15 = i10 + 1;
            byte b11 = bArr[i10];
            if (AbstractC9188c.a.m35804g(b11)) {
                int i16 = i14 + 1;
                AbstractC9188c.a.m35799b(b11, cArr, i14);
                int i17 = i15;
                while (i17 < i12) {
                    byte b12 = bArr[i17];
                    if (!AbstractC9188c.a.m35804g(b12)) {
                        break;
                    }
                    i17++;
                    AbstractC9188c.a.m35799b(b12, cArr, i16);
                    i16++;
                }
                i14 = i16;
                i10 = i17;
            } else if (AbstractC9188c.a.m35806i(b11)) {
                if (i15 >= i12) {
                    C9987e.m38645a("Invalid UTF-8");
                    return null;
                }
                i10 += 2;
                AbstractC9188c.a.m35801d(b11, bArr[i15], cArr, i14);
                i14++;
            } else if (AbstractC9188c.a.m35805h(b11)) {
                if (i15 >= i12 - 1) {
                    C9987e.m38645a("Invalid UTF-8");
                    return null;
                }
                int i18 = i10 + 2;
                i10 += 3;
                AbstractC9188c.a.m35800c(b11, bArr[i15], bArr[i18], cArr, i14);
                i14++;
            } else {
                if (i15 >= i12 - 2) {
                    C9987e.m38645a("Invalid UTF-8");
                    return null;
                }
                byte b13 = bArr[i15];
                int i19 = i10 + 3;
                byte b14 = bArr[i10 + 2];
                i10 += 4;
                AbstractC9188c.a.m35798a(b11, b13, b14, bArr[i19], cArr, i14);
                i14 += 2;
            }
        }
        return new String(cArr, 0, i14);
    }

    /* JADX INFO: renamed from: g */
    public static String m35811g(ByteBuffer byteBuffer, int i10, int i11) {
        if ((i10 | i11 | ((byteBuffer.limit() - i10) - i11)) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i10), Integer.valueOf(i11)));
        }
        int i12 = i10 + i11;
        char[] cArr = new char[i11];
        int i13 = 0;
        while (i10 < i12) {
            byte b10 = byteBuffer.get(i10);
            if (!AbstractC9188c.a.m35804g(b10)) {
                break;
            }
            i10++;
            AbstractC9188c.a.m35799b(b10, cArr, i13);
            i13++;
        }
        int i14 = i13;
        while (i10 < i12) {
            int i15 = i10 + 1;
            byte b11 = byteBuffer.get(i10);
            if (AbstractC9188c.a.m35804g(b11)) {
                int i16 = i14 + 1;
                AbstractC9188c.a.m35799b(b11, cArr, i14);
                int i17 = i15;
                while (i17 < i12) {
                    byte b12 = byteBuffer.get(i17);
                    if (!AbstractC9188c.a.m35804g(b12)) {
                        break;
                    }
                    i17++;
                    AbstractC9188c.a.m35799b(b12, cArr, i16);
                    i16++;
                }
                i14 = i16;
                i10 = i17;
            } else if (AbstractC9188c.a.m35806i(b11)) {
                if (i15 >= i12) {
                    C9987e.m38645a("Invalid UTF-8");
                    return null;
                }
                i10 += 2;
                AbstractC9188c.a.m35801d(b11, byteBuffer.get(i15), cArr, i14);
                i14++;
            } else if (AbstractC9188c.a.m35805h(b11)) {
                if (i15 >= i12 - 1) {
                    C9987e.m38645a("Invalid UTF-8");
                    return null;
                }
                int i18 = i10 + 2;
                i10 += 3;
                AbstractC9188c.a.m35800c(b11, byteBuffer.get(i15), byteBuffer.get(i18), cArr, i14);
                i14++;
            } else {
                if (i15 >= i12 - 2) {
                    C9987e.m38645a("Invalid UTF-8");
                    return null;
                }
                byte b13 = byteBuffer.get(i15);
                int i19 = i10 + 3;
                byte b14 = byteBuffer.get(i10 + 2);
                i10 += 4;
                AbstractC9188c.a.m35798a(b11, b13, b14, byteBuffer.get(i19), cArr, i14);
                i14 += 2;
            }
        }
        return new String(cArr, 0, i14);
    }

    /* JADX INFO: renamed from: h */
    public static int m35812h(CharSequence charSequence, byte[] bArr, int i10, int i11) {
        int i12;
        int i13;
        char cCharAt;
        int length = charSequence.length();
        int i14 = i11 + i10;
        int i15 = 0;
        while (i15 < length && (i13 = i15 + i10) < i14 && (cCharAt = charSequence.charAt(i15)) < 128) {
            bArr[i13] = (byte) cCharAt;
            i15++;
        }
        if (i15 == length) {
            return i10 + length;
        }
        int i16 = i10 + i15;
        while (i15 < length) {
            char cCharAt2 = charSequence.charAt(i15);
            if (cCharAt2 < 128 && i16 < i14) {
                bArr[i16] = (byte) cCharAt2;
                i16++;
            } else if (cCharAt2 < 2048 && i16 <= i14 - 2) {
                int i17 = i16 + 1;
                bArr[i16] = (byte) ((cCharAt2 >>> 6) | 960);
                i16 += 2;
                bArr[i17] = (byte) ((cCharAt2 & '?') | 128);
            } else {
                if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || i16 > i14 - 3) {
                    if (i16 > i14 - 4) {
                        if (55296 <= cCharAt2 && cCharAt2 <= 57343 && ((i12 = i15 + 1) == charSequence.length() || !Character.isSurrogatePair(cCharAt2, charSequence.charAt(i12)))) {
                            throw new a(i15, length);
                        }
                        throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt2 + " at index " + i16);
                    }
                    int i18 = i15 + 1;
                    if (i18 != charSequence.length()) {
                        char cCharAt3 = charSequence.charAt(i18);
                        if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                            int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                            bArr[i16] = (byte) ((codePoint >>> 18) | 240);
                            bArr[i16 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                            int i19 = i16 + 3;
                            bArr[i16 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                            i16 += 4;
                            bArr[i19] = (byte) ((codePoint & 63) | 128);
                            i15 = i18;
                        } else {
                            i15 = i18;
                        }
                    }
                    throw new a(i15 - 1, length);
                }
                bArr[i16] = (byte) ((cCharAt2 >>> '\f') | 480);
                int i20 = i16 + 2;
                bArr[i16 + 1] = (byte) (((cCharAt2 >>> 6) & 63) | 128);
                i16 += 3;
                bArr[i20] = (byte) ((cCharAt2 & '?') | 128);
            }
            i15++;
        }
        return i16;
    }

    /* JADX INFO: renamed from: i */
    public static void m35813i(CharSequence charSequence, ByteBuffer byteBuffer) {
        int i10;
        int length = charSequence.length();
        int iPosition = byteBuffer.position();
        int i11 = 0;
        while (i11 < length) {
            try {
                char cCharAt = charSequence.charAt(i11);
                if (cCharAt >= 128) {
                    break;
                }
                byteBuffer.put(iPosition + i11, (byte) cCharAt);
                i11++;
            } catch (IndexOutOfBoundsException unused) {
                int iPosition2 = byteBuffer.position() + Math.max(i11, (iPosition - byteBuffer.position()) + 1);
                throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(i11) + " at index " + iPosition2);
            }
        }
        if (i11 == length) {
            byteBuffer.position(iPosition + i11);
            return;
        }
        iPosition += i11;
        while (i11 < length) {
            char cCharAt2 = charSequence.charAt(i11);
            if (cCharAt2 < 128) {
                byteBuffer.put(iPosition, (byte) cCharAt2);
            } else if (cCharAt2 < 2048) {
                int i12 = iPosition + 1;
                try {
                    byteBuffer.put(iPosition, (byte) ((cCharAt2 >>> 6) | Opcodes.CHECKCAST));
                    byteBuffer.put(i12, (byte) ((cCharAt2 & '?') | 128));
                    iPosition = i12;
                } catch (IndexOutOfBoundsException unused2) {
                    iPosition = i12;
                    int iPosition22 = byteBuffer.position() + Math.max(i11, (iPosition - byteBuffer.position()) + 1);
                    throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(i11) + " at index " + iPosition22);
                }
            } else {
                if (cCharAt2 >= 55296 && 57343 >= cCharAt2) {
                    int i13 = i11 + 1;
                    if (i13 != length) {
                        try {
                            char cCharAt3 = charSequence.charAt(i13);
                            if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                int i14 = iPosition + 1;
                                try {
                                    byteBuffer.put(iPosition, (byte) ((codePoint >>> 18) | 240));
                                    i10 = iPosition + 2;
                                } catch (IndexOutOfBoundsException unused3) {
                                    iPosition = i14;
                                    i11 = i13;
                                    int iPosition222 = byteBuffer.position() + Math.max(i11, (iPosition - byteBuffer.position()) + 1);
                                    throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(i11) + " at index " + iPosition222);
                                }
                                try {
                                    byteBuffer.put(i14, (byte) (((codePoint >>> 12) & 63) | 128));
                                    iPosition += 3;
                                    byteBuffer.put(i10, (byte) (((codePoint >>> 6) & 63) | 128));
                                    byteBuffer.put(iPosition, (byte) ((codePoint & 63) | 128));
                                    i11 = i13;
                                } catch (IndexOutOfBoundsException unused4) {
                                    i11 = i13;
                                    iPosition = i10;
                                    int iPosition2222 = byteBuffer.position() + Math.max(i11, (iPosition - byteBuffer.position()) + 1);
                                    throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(i11) + " at index " + iPosition2222);
                                }
                            } else {
                                i11 = i13;
                            }
                        } catch (IndexOutOfBoundsException unused5) {
                        }
                    }
                    throw new a(i11, length);
                }
                int i15 = iPosition + 1;
                byteBuffer.put(iPosition, (byte) ((cCharAt2 >>> '\f') | 224));
                iPosition += 2;
                byteBuffer.put(i15, (byte) (((cCharAt2 >>> 6) & 63) | 128));
                byteBuffer.put(iPosition, (byte) ((cCharAt2 & '?') | 128));
            }
            i11++;
            iPosition++;
        }
        byteBuffer.position(iPosition);
    }

    /* JADX INFO: renamed from: j */
    public static int m35814j(CharSequence charSequence, int i10) {
        int length = charSequence.length();
        int i11 = 0;
        while (i10 < length) {
            char cCharAt = charSequence.charAt(i10);
            if (cCharAt < 2048) {
                i11 += (127 - cCharAt) >>> 31;
            } else {
                i11 += 2;
                if (55296 <= cCharAt && cCharAt <= 57343) {
                    if (Character.codePointAt(charSequence, i10) < 65536) {
                        throw new a(i10, length);
                    }
                    i10++;
                }
            }
            i10++;
        }
        return i11;
    }

    @Override // p322w5.AbstractC9188c
    /* JADX INFO: renamed from: a */
    public String mo35795a(ByteBuffer byteBuffer, int i10, int i11) {
        return byteBuffer.hasArray() ? m35810f(byteBuffer.array(), byteBuffer.arrayOffset() + i10, i11) : m35811g(byteBuffer, i10, i11);
    }

    @Override // p322w5.AbstractC9188c
    /* JADX INFO: renamed from: b */
    public void mo35796b(CharSequence charSequence, ByteBuffer byteBuffer) {
        if (!byteBuffer.hasArray()) {
            m35813i(charSequence, byteBuffer);
        } else {
            int iArrayOffset = byteBuffer.arrayOffset();
            byteBuffer.position(m35812h(charSequence, byteBuffer.array(), byteBuffer.position() + iArrayOffset, byteBuffer.remaining()) - iArrayOffset);
        }
    }

    @Override // p322w5.AbstractC9188c
    /* JADX INFO: renamed from: c */
    public int mo35797c(CharSequence charSequence) {
        return m35809e(charSequence);
    }
}
