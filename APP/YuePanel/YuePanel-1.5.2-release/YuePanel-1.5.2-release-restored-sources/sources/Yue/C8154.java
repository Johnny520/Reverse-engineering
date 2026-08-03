package Yue;

import Yue.AbstractC8148;
import Yue.C3229;
import com.android.p001dx.p004io.Opcodes;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: Yue.ۥۣۢۤۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C8154 extends AbstractC8148 {

    /* JADX INFO: renamed from: Yue.ۥۣۢۤۦ$ۥ */
    public static class C1444 extends IllegalArgumentException {
        public C1444(int i, int i2) {
            super("Unpaired surrogate at index " + i + " of " + i2);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static int m26821(CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        while (i < length && charSequence.charAt(i) < 128) {
            i++;
        }
        int iM26826 = length;
        while (true) {
            if (i < length) {
                char cCharAt = charSequence.charAt(i);
                if (cCharAt >= 2048) {
                    iM26826 += m26826(charSequence, i);
                    break;
                }
                iM26826 += (127 - cCharAt) >>> 31;
                i++;
            } else {
                break;
            }
        }
        if (iM26826 >= length) {
            return iM26826;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (((long) iM26826) + C3229.C3230.f4962));
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static String m26822(byte[] bArr, int i, int i2) {
        if ((i | i2 | ((bArr.length - i) - i2)) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)));
        }
        int i3 = i + i2;
        char[] cArr = new char[i2];
        int i4 = 0;
        while (i < i3) {
            byte b = bArr[i];
            if (!AbstractC8148.C1441.m26804(b)) {
                break;
            }
            i++;
            AbstractC8148.C1441.m4178(b, cArr, i4);
            i4++;
        }
        int i5 = i4;
        while (i < i3) {
            int i6 = i + 1;
            byte b2 = bArr[i];
            if (AbstractC8148.C1441.m26804(b2)) {
                int i7 = i5 + 1;
                AbstractC8148.C1441.m4178(b2, cArr, i5);
                while (i6 < i3) {
                    byte b3 = bArr[i6];
                    if (!AbstractC8148.C1441.m26804(b3)) {
                        break;
                    }
                    i6++;
                    AbstractC8148.C1441.m4178(b3, cArr, i7);
                    i7++;
                }
                i5 = i7;
                i = i6;
            } else if (AbstractC8148.C1441.m26806(b2)) {
                if (i6 >= i3) {
                    throw new IllegalArgumentException("Invalid UTF-8");
                }
                i += 2;
                AbstractC8148.C1441.m26801(b2, bArr[i6], cArr, i5);
                i5++;
            } else if (AbstractC8148.C1441.m26805(b2)) {
                if (i6 >= i3 - 1) {
                    throw new IllegalArgumentException("Invalid UTF-8");
                }
                int i8 = i + 2;
                i += 3;
                AbstractC8148.C1441.m26800(b2, bArr[i6], bArr[i8], cArr, i5);
                i5++;
            } else {
                if (i6 >= i3 - 2) {
                    throw new IllegalArgumentException("Invalid UTF-8");
                }
                byte b4 = bArr[i6];
                int i9 = i + 3;
                byte b5 = bArr[i + 2];
                i += 4;
                AbstractC8148.C1441.m4177(b2, b4, b5, bArr[i9], cArr, i5);
                i5 += 2;
            }
        }
        return new String(cArr, 0, i5);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static String m26823(ByteBuffer byteBuffer, int i, int i2) {
        if ((i | i2 | ((byteBuffer.limit() - i) - i2)) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i), Integer.valueOf(i2)));
        }
        int i3 = i + i2;
        char[] cArr = new char[i2];
        int i4 = 0;
        while (i < i3) {
            byte b = byteBuffer.get(i);
            if (!AbstractC8148.C1441.m26804(b)) {
                break;
            }
            i++;
            AbstractC8148.C1441.m4178(b, cArr, i4);
            i4++;
        }
        int i5 = i4;
        while (i < i3) {
            int i6 = i + 1;
            byte b2 = byteBuffer.get(i);
            if (AbstractC8148.C1441.m26804(b2)) {
                int i7 = i5 + 1;
                AbstractC8148.C1441.m4178(b2, cArr, i5);
                while (i6 < i3) {
                    byte b3 = byteBuffer.get(i6);
                    if (!AbstractC8148.C1441.m26804(b3)) {
                        break;
                    }
                    i6++;
                    AbstractC8148.C1441.m4178(b3, cArr, i7);
                    i7++;
                }
                i5 = i7;
                i = i6;
            } else if (AbstractC8148.C1441.m26806(b2)) {
                if (i6 >= i3) {
                    throw new IllegalArgumentException("Invalid UTF-8");
                }
                i += 2;
                AbstractC8148.C1441.m26801(b2, byteBuffer.get(i6), cArr, i5);
                i5++;
            } else if (AbstractC8148.C1441.m26805(b2)) {
                if (i6 >= i3 - 1) {
                    throw new IllegalArgumentException("Invalid UTF-8");
                }
                int i8 = i + 2;
                i += 3;
                AbstractC8148.C1441.m26800(b2, byteBuffer.get(i6), byteBuffer.get(i8), cArr, i5);
                i5++;
            } else {
                if (i6 >= i3 - 2) {
                    throw new IllegalArgumentException("Invalid UTF-8");
                }
                byte b4 = byteBuffer.get(i6);
                int i9 = i + 3;
                byte b5 = byteBuffer.get(i + 2);
                i += 4;
                AbstractC8148.C1441.m4177(b2, b4, b5, byteBuffer.get(i9), cArr, i5);
                i5 += 2;
            }
        }
        return new String(cArr, 0, i5);
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static int m26824(CharSequence charSequence, byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        char cCharAt;
        int length = charSequence.length();
        int i5 = i2 + i;
        int i6 = 0;
        while (i6 < length && (i4 = i6 + i) < i5 && (cCharAt = charSequence.charAt(i6)) < 128) {
            bArr[i4] = (byte) cCharAt;
            i6++;
        }
        if (i6 == length) {
            return i + length;
        }
        int i7 = i + i6;
        while (i6 < length) {
            char cCharAt2 = charSequence.charAt(i6);
            if (cCharAt2 < 128 && i7 < i5) {
                bArr[i7] = (byte) cCharAt2;
                i7++;
            } else if (cCharAt2 < 2048 && i7 <= i5 - 2) {
                int i8 = i7 + 1;
                bArr[i7] = (byte) ((cCharAt2 >>> 6) | 960);
                i7 += 2;
                bArr[i8] = (byte) ((cCharAt2 & '?') | 128);
            } else {
                if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || i7 > i5 - 3) {
                    if (i7 > i5 - 4) {
                        if (55296 <= cCharAt2 && cCharAt2 <= 57343 && ((i3 = i6 + 1) == charSequence.length() || !Character.isSurrogatePair(cCharAt2, charSequence.charAt(i3)))) {
                            throw new C1444(i6, length);
                        }
                        throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt2 + " at index " + i7);
                    }
                    int i9 = i6 + 1;
                    if (i9 != charSequence.length()) {
                        char cCharAt3 = charSequence.charAt(i9);
                        if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                            int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                            bArr[i7] = (byte) ((codePoint >>> 18) | C3464.f305);
                            bArr[i7 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                            int i10 = i7 + 3;
                            bArr[i7 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                            i7 += 4;
                            bArr[i10] = (byte) ((codePoint & 63) | 128);
                            i6 = i9;
                        } else {
                            i6 = i9;
                        }
                    }
                    throw new C1444(i6 - 1, length);
                }
                bArr[i7] = (byte) ((cCharAt2 >>> '\f') | 480);
                int i11 = i7 + 2;
                bArr[i7 + 1] = (byte) (((cCharAt2 >>> 6) & 63) | 128);
                i7 += 3;
                bArr[i11] = (byte) ((cCharAt2 & '?') | 128);
            }
            i6++;
        }
        return i7;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static void m26825(CharSequence charSequence, ByteBuffer byteBuffer) {
        int i;
        int length = charSequence.length();
        int iPosition = byteBuffer.position();
        int i2 = 0;
        while (i2 < length) {
            try {
                char cCharAt = charSequence.charAt(i2);
                if (cCharAt >= 128) {
                    break;
                }
                byteBuffer.put(iPosition + i2, (byte) cCharAt);
                i2++;
            } catch (IndexOutOfBoundsException unused) {
                throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(i2) + " at index " + (byteBuffer.position() + Math.max(i2, (iPosition - byteBuffer.position()) + 1)));
            }
        }
        if (i2 == length) {
            byteBuffer.position(iPosition + i2);
            return;
        }
        iPosition += i2;
        while (i2 < length) {
            char cCharAt2 = charSequence.charAt(i2);
            if (cCharAt2 < 128) {
                byteBuffer.put(iPosition, (byte) cCharAt2);
            } else if (cCharAt2 < 2048) {
                int i3 = iPosition + 1;
                try {
                    byteBuffer.put(iPosition, (byte) ((cCharAt2 >>> 6) | 192));
                    byteBuffer.put(i3, (byte) ((cCharAt2 & '?') | 128));
                    iPosition = i3;
                } catch (IndexOutOfBoundsException unused2) {
                    iPosition = i3;
                    throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(i2) + " at index " + (byteBuffer.position() + Math.max(i2, (iPosition - byteBuffer.position()) + 1)));
                }
            } else {
                if (cCharAt2 >= 55296 && 57343 >= cCharAt2) {
                    int i4 = i2 + 1;
                    if (i4 != length) {
                        try {
                            char cCharAt3 = charSequence.charAt(i4);
                            if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                int i5 = iPosition + 1;
                                try {
                                    byteBuffer.put(iPosition, (byte) ((codePoint >>> 18) | C3464.f305));
                                    i = iPosition + 2;
                                } catch (IndexOutOfBoundsException unused3) {
                                    iPosition = i5;
                                    i2 = i4;
                                    throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(i2) + " at index " + (byteBuffer.position() + Math.max(i2, (iPosition - byteBuffer.position()) + 1)));
                                }
                                try {
                                    byteBuffer.put(i5, (byte) (((codePoint >>> 12) & 63) | 128));
                                    iPosition += 3;
                                    byteBuffer.put(i, (byte) (((codePoint >>> 6) & 63) | 128));
                                    byteBuffer.put(iPosition, (byte) ((codePoint & 63) | 128));
                                    i2 = i4;
                                } catch (IndexOutOfBoundsException unused4) {
                                    i2 = i4;
                                    iPosition = i;
                                    throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(i2) + " at index " + (byteBuffer.position() + Math.max(i2, (iPosition - byteBuffer.position()) + 1)));
                                }
                            } else {
                                i2 = i4;
                            }
                        } catch (IndexOutOfBoundsException unused5) {
                        }
                    }
                    throw new C1444(i2, length);
                }
                int i6 = iPosition + 1;
                byteBuffer.put(iPosition, (byte) ((cCharAt2 >>> '\f') | Opcodes.SHL_INT_LIT8));
                iPosition += 2;
                byteBuffer.put(i6, (byte) (((cCharAt2 >>> 6) & 63) | 128));
                byteBuffer.put(iPosition, (byte) ((cCharAt2 & '?') | 128));
            }
            i2++;
            iPosition++;
        }
        byteBuffer.position(iPosition);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static int m26826(CharSequence charSequence, int i) {
        int length = charSequence.length();
        int i2 = 0;
        while (i < length) {
            char cCharAt = charSequence.charAt(i);
            if (cCharAt < 2048) {
                i2 += (127 - cCharAt) >>> 31;
            } else {
                i2 += 2;
                if (55296 <= cCharAt && cCharAt <= 57343) {
                    if (Character.codePointAt(charSequence, i) < 65536) {
                        throw new C1444(i, length);
                    }
                    i++;
                }
            }
            i++;
        }
        return i2;
    }

    @Override // Yue.AbstractC8148
    /* JADX INFO: renamed from: ۥ */
    public String mo4175(ByteBuffer byteBuffer, int i, int i2) throws IllegalArgumentException {
        return byteBuffer.hasArray() ? m26822(byteBuffer.array(), byteBuffer.arrayOffset() + i, i2) : m26823(byteBuffer, i, i2);
    }

    @Override // Yue.AbstractC8148
    /* JADX INFO: renamed from: ۥ۟ */
    public void mo4176(CharSequence charSequence, ByteBuffer byteBuffer) {
        if (!byteBuffer.hasArray()) {
            m26825(charSequence, byteBuffer);
        } else {
            int iArrayOffset = byteBuffer.arrayOffset();
            byteBuffer.position(m26824(charSequence, byteBuffer.array(), byteBuffer.position() + iArrayOffset, byteBuffer.remaining()) - iArrayOffset);
        }
    }

    @Override // Yue.AbstractC8148
    /* JADX INFO: renamed from: ۥ۟۟ */
    public int mo26799(CharSequence charSequence) {
        return m26821(charSequence);
    }
}
