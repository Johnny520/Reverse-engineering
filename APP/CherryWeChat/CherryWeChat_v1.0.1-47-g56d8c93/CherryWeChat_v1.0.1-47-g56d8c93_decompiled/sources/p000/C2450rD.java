package p000;

import java.nio.charset.Charset;
import java.util.Arrays;

/* JADX INFO: renamed from: rD */
/* JADX INFO: loaded from: classes.dex */
public final class C2450rD extends AbstractC0671Pj {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f8578g;

    public /* synthetic */ C2450rD(int i) {
        this.f8578g = i;
    }

    /* JADX INFO: renamed from: D */
    public static int m4892D(long j, byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            AbstractC0671Pj abstractC0671Pj = AbstractC2536tD.f8842a;
            if (i > -12) {
                return -1;
            }
            return i;
        }
        if (i2 == 1) {
            return AbstractC2536tD.m5017c(i, AbstractC2092jD.m4267g(j, bArr));
        }
        if (i2 == 2) {
            return AbstractC2536tD.m5018d(i, AbstractC2092jD.m4267g(j, bArr), AbstractC2092jD.m4267g(j + 1, bArr));
        }
        throw new AssertionError();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0049  */
    @Override // p000.AbstractC0671Pj
    /* JADX INFO: renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String mo1360i(byte[] bArr, int i, int i2) throws C0673Pl {
        switch (this.f8578g) {
            case 0:
                if ((i | i2 | ((bArr.length - i) - i2)) < 0) {
                    throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)));
                }
                int i3 = i + i2;
                char[] cArr = new char[i2];
                int i4 = 0;
                while (i < i3) {
                    byte b = bArr[i];
                    if (b < 0) {
                        while (i < i3) {
                            int i5 = i + 1;
                            byte b2 = bArr[i];
                            if (b2 >= 0) {
                                int i6 = i4 + 1;
                                cArr[i4] = (char) b2;
                                while (i5 < i3) {
                                    byte b3 = bArr[i5];
                                    if (b3 >= 0) {
                                        i5++;
                                        cArr[i6] = (char) b3;
                                        i6++;
                                    } else {
                                        i4 = i6;
                                        i = i5;
                                    }
                                }
                                i4 = i6;
                                i = i5;
                            } else if (b2 < -32) {
                                if (i5 >= i3) {
                                    throw C0673Pl.m1365b();
                                }
                                i += 2;
                                byte b4 = bArr[i5];
                                int i7 = i4 + 1;
                                if (b2 < -62 || AbstractC0628Oj.m1228I(b4)) {
                                    throw C0673Pl.m1365b();
                                }
                                cArr[i4] = (char) ((b4 & 63) | ((b2 & 31) << 6));
                                i4 = i7;
                            } else {
                                if (b2 >= -16) {
                                    if (i5 >= i3 - 2) {
                                        throw C0673Pl.m1365b();
                                    }
                                    byte b5 = bArr[i5];
                                    int i8 = i + 3;
                                    byte b6 = bArr[i + 2];
                                    i += 4;
                                    byte b7 = bArr[i8];
                                    int i9 = i4 + 1;
                                    if (!AbstractC0628Oj.m1228I(b5)) {
                                        if ((((b5 + 112) + (b2 << 28)) >> 30) == 0 && !AbstractC0628Oj.m1228I(b6) && !AbstractC0628Oj.m1228I(b7)) {
                                            int i10 = ((b5 & 63) << 12) | ((b2 & 7) << 18) | ((b6 & 63) << 6) | (b7 & 63);
                                            cArr[i4] = (char) ((i10 >>> 10) + 55232);
                                            cArr[i9] = (char) ((i10 & 1023) + 56320);
                                            i4 += 2;
                                        }
                                    }
                                    throw C0673Pl.m1365b();
                                }
                                if (i5 >= i3 - 1) {
                                    throw C0673Pl.m1365b();
                                }
                                int i11 = i + 2;
                                byte b8 = bArr[i5];
                                i += 3;
                                byte b9 = bArr[i11];
                                int i12 = i4 + 1;
                                if (AbstractC0628Oj.m1228I(b8) || ((b2 == -32 && b8 < -96) || ((b2 == -19 && b8 >= -96) || AbstractC0628Oj.m1228I(b9)))) {
                                    throw C0673Pl.m1365b();
                                }
                                cArr[i4] = (char) (((b8 & 63) << 6) | ((b2 & 15) << 12) | (b9 & 63));
                                i4 = i12;
                            }
                        }
                        return new String(cArr, 0, i4);
                    }
                    i++;
                    cArr[i4] = (char) b;
                    i4++;
                }
                while (i < i3) {
                }
                return new String(cArr, 0, i4);
            default:
                Charset charset = AbstractC0501Ll.f1637a;
                String str = new String(bArr, i, i2, charset);
                if (str.contains("�") && !Arrays.equals(str.getBytes(charset), Arrays.copyOfRange(bArr, i, i2 + i))) {
                    throw C0673Pl.m1365b();
                }
                return str;
        }
    }

    @Override // p000.AbstractC0671Pj
    /* JADX INFO: renamed from: j */
    public final int mo1361j(String str, byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        char cCharAt;
        long j;
        char c;
        long j2;
        long j3;
        char c2;
        int i5;
        char cCharAt2;
        switch (this.f8578g) {
            case 0:
                int length = str.length();
                int i6 = i2 + i;
                int i7 = 0;
                while (i7 < length && (i4 = i7 + i) < i6 && (cCharAt = str.charAt(i7)) < 128) {
                    bArr[i4] = (byte) cCharAt;
                    i7++;
                }
                if (i7 == length) {
                    return i + length;
                }
                int i8 = i + i7;
                while (i7 < length) {
                    char cCharAt3 = str.charAt(i7);
                    if (cCharAt3 < 128 && i8 < i6) {
                        bArr[i8] = (byte) cCharAt3;
                        i8++;
                    } else if (cCharAt3 < 2048 && i8 <= i6 - 2) {
                        int i9 = i8 + 1;
                        bArr[i8] = (byte) ((cCharAt3 >>> 6) | 960);
                        i8 += 2;
                        bArr[i9] = (byte) ((cCharAt3 & '?') | 128);
                    } else {
                        if ((cCharAt3 >= 55296 && 57343 >= cCharAt3) || i8 > i6 - 3) {
                            if (i8 > i6 - 4) {
                                if (55296 <= cCharAt3 && cCharAt3 <= 57343 && ((i3 = i7 + 1) == str.length() || !Character.isSurrogatePair(cCharAt3, str.charAt(i3)))) {
                                    throw new C2493sD(i7, length);
                                }
                                throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt3 + " at index " + i8);
                            }
                            int i10 = i7 + 1;
                            if (i10 != str.length()) {
                                char cCharAt4 = str.charAt(i10);
                                if (Character.isSurrogatePair(cCharAt3, cCharAt4)) {
                                    int codePoint = Character.toCodePoint(cCharAt3, cCharAt4);
                                    bArr[i8] = (byte) ((codePoint >>> 18) | 240);
                                    bArr[i8 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                                    int i11 = i8 + 3;
                                    bArr[i8 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                                    i8 += 4;
                                    bArr[i11] = (byte) ((codePoint & 63) | 128);
                                    i7 = i10;
                                } else {
                                    i7 = i10;
                                }
                            }
                            throw new C2493sD(i7 - 1, length);
                        }
                        bArr[i8] = (byte) ((cCharAt3 >>> '\f') | 480);
                        int i12 = i8 + 2;
                        bArr[i8 + 1] = (byte) (((cCharAt3 >>> 6) & 63) | 128);
                        i8 += 3;
                        bArr[i12] = (byte) ((cCharAt3 & '?') | 128);
                    }
                    i7++;
                }
                return i8;
            default:
                long j4 = i;
                long j5 = ((long) i2) + j4;
                int length2 = str.length();
                if (length2 > i2 || bArr.length - i2 < i) {
                    throw new ArrayIndexOutOfBoundsException("Failed writing " + str.charAt(length2 - 1) + " at index " + (i + i2));
                }
                int i13 = 0;
                while (true) {
                    j = 1;
                    c = 128;
                    if (i13 < length2 && (cCharAt2 = str.charAt(i13)) < 128) {
                        AbstractC2092jD.m4271k(bArr, j4, (byte) cCharAt2);
                        i13++;
                        j4 = 1 + j4;
                    }
                }
                if (i13 == length2) {
                    return (int) j4;
                }
                while (i13 < length2) {
                    char cCharAt5 = str.charAt(i13);
                    if (cCharAt5 < c && j4 < j5) {
                        AbstractC2092jD.m4271k(bArr, j4, (byte) cCharAt5);
                        c2 = c;
                        j2 = j;
                        j3 = j4 + j;
                    } else if (cCharAt5 >= 2048 || j4 > j5 - 2) {
                        j2 = j;
                        if ((cCharAt5 >= 55296 && 57343 >= cCharAt5) || j4 > j5 - 3) {
                            long j6 = j4;
                            if (j6 > j5 - 4) {
                                if (55296 <= cCharAt5 && cCharAt5 <= 57343 && ((i5 = i13 + 1) == length2 || !Character.isSurrogatePair(cCharAt5, str.charAt(i5)))) {
                                    throw new C2493sD(i13, length2);
                                }
                                throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt5 + " at index " + j6);
                            }
                            int i14 = i13 + 1;
                            if (i14 != length2) {
                                char cCharAt6 = str.charAt(i14);
                                if (Character.isSurrogatePair(cCharAt5, cCharAt6)) {
                                    int codePoint2 = Character.toCodePoint(cCharAt5, cCharAt6);
                                    AbstractC2092jD.m4271k(bArr, j6, (byte) ((codePoint2 >>> 18) | 240));
                                    c2 = 128;
                                    AbstractC2092jD.m4271k(bArr, j6 + j2, (byte) (((codePoint2 >>> 12) & 63) | 128));
                                    AbstractC2092jD.m4271k(bArr, j6 + 2, (byte) (((codePoint2 >>> 6) & 63) | 128));
                                    AbstractC2092jD.m4271k(bArr, j6 + 3, (byte) ((codePoint2 & 63) | 128));
                                    j3 = j6 + 4;
                                    i13 = i14;
                                } else {
                                    i13 = i14;
                                }
                            }
                            throw new C2493sD(i13 - 1, length2);
                        }
                        AbstractC2092jD.m4271k(bArr, j4, (byte) ((cCharAt5 >>> '\f') | 480));
                        long j7 = j4;
                        AbstractC2092jD.m4271k(bArr, j4 + j2, (byte) (((cCharAt5 >>> 6) & 63) | 128));
                        j3 = j7 + 3;
                        AbstractC2092jD.m4271k(bArr, j7 + 2, (byte) ((cCharAt5 & '?') | 128));
                        c2 = 128;
                    } else {
                        j2 = j;
                        AbstractC2092jD.m4271k(bArr, j4, (byte) ((cCharAt5 >>> 6) | 960));
                        AbstractC2092jD.m4271k(bArr, j4 + j2, (byte) ((cCharAt5 & '?') | c));
                        j3 = j4 + 2;
                        c2 = c;
                    }
                    i13++;
                    c = c2;
                    j4 = j3;
                    j = j2;
                }
                return (int) j4;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:75:0x00fa, code lost:
    
        return -1;
     */
    @Override // p000.AbstractC0671Pj
    /* JADX INFO: renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int mo1363v(byte[] bArr, int i, int i2) {
        int i3;
        long j;
        int i4 = i;
        switch (this.f8578g) {
            case 0:
                break;
            default:
                if ((i4 | i2 | (bArr.length - i2)) < 0) {
                    throw new ArrayIndexOutOfBoundsException(String.format("Array length=%d, index=%d, limit=%d", Integer.valueOf(bArr.length), Integer.valueOf(i4), Integer.valueOf(i2)));
                }
                long j2 = i4;
                int i5 = (int) (((long) i2) - j2);
                long j3 = 1;
                if (i5 < 16) {
                    i3 = 0;
                } else {
                    int i6 = 8 - (((int) j2) & 7);
                    long j4 = j2;
                    i3 = 0;
                    while (true) {
                        if (i3 < i6) {
                            long j5 = j4 + 1;
                            if (AbstractC2092jD.m4267g(j4, bArr) >= 0) {
                                i3++;
                                j4 = j5;
                            }
                        } else {
                            while (true) {
                                int i7 = i3 + 8;
                                if (i7 <= i5) {
                                    if ((AbstractC2092jD.f7366c.m2907h(AbstractC2092jD.f7369f + j4, bArr) & (-9187201950435737472L)) == 0) {
                                        j4 += 8;
                                        i3 = i7;
                                    }
                                }
                            }
                            while (true) {
                                if (i3 < i5) {
                                    long j6 = j4 + 1;
                                    if (AbstractC2092jD.m4267g(j4, bArr) >= 0) {
                                        i3++;
                                        j4 = j6;
                                    }
                                } else {
                                    i3 = i5;
                                }
                            }
                        }
                    }
                }
                int i8 = i5 - i3;
                long j7 = j2 + ((long) i3);
                while (true) {
                    byte bM4267g = 0;
                    while (true) {
                        if (i8 > 0) {
                            long j8 = j7 + j3;
                            bM4267g = AbstractC2092jD.m4267g(j7, bArr);
                            if (bM4267g >= 0) {
                                i8--;
                                j7 = j8;
                            } else {
                                j7 = j8;
                            }
                        }
                    }
                    if (i8 == 0) {
                        return 0;
                    }
                    int i9 = i8 - 1;
                    if (bM4267g >= -32) {
                        if (bM4267g >= -16) {
                            j = j3;
                            if (i9 < 3) {
                                return m4892D(j7, bArr, bM4267g, i9);
                            }
                            i8 -= 4;
                            long j9 = j7 + j;
                            byte bM4267g2 = AbstractC2092jD.m4267g(j7, bArr);
                            if (bM4267g2 <= -65) {
                                if ((((bM4267g2 + 112) + (bM4267g << 28)) >> 30) == 0) {
                                    long j10 = 2 + j7;
                                    if (AbstractC2092jD.m4267g(j9, bArr) <= -65) {
                                        j7 += 3;
                                        if (AbstractC2092jD.m4267g(j10, bArr) <= -65) {
                                            j3 = j;
                                        }
                                    }
                                }
                            }
                        } else {
                            if (i9 < 2) {
                                return m4892D(j7, bArr, bM4267g, i9);
                            }
                            i8 -= 3;
                            j = j3;
                            long j11 = j7 + j;
                            byte bM4267g3 = AbstractC2092jD.m4267g(j7, bArr);
                            if (bM4267g3 <= -65 && ((bM4267g != -32 || bM4267g3 >= -96) && (bM4267g != -19 || bM4267g3 < -96))) {
                                j7 += 2;
                                if (AbstractC2092jD.m4267g(j11, bArr) <= -65) {
                                    j3 = j;
                                }
                            }
                        }
                    } else {
                        if (i9 == 0) {
                            return bM4267g;
                        }
                        i8 -= 2;
                        if (bM4267g >= -62) {
                            long j12 = j7 + j3;
                            if (AbstractC2092jD.m4267g(j7, bArr) <= -65) {
                                j = j3;
                                j7 = j12;
                                j3 = j;
                            }
                        }
                    }
                    break;
                }
                break;
        }
        while (i4 < i2 && bArr[i4] >= 0) {
            i4++;
        }
        if (i4 < i2) {
            while (i4 < i2) {
                int i10 = i4 + 1;
                byte b = bArr[i4];
                if (b < 0) {
                    if (b < -32) {
                        if (i10 >= i2) {
                            return b;
                        }
                        if (b >= -62) {
                            i4 += 2;
                            if (bArr[i10] > -65) {
                            }
                        }
                        return -1;
                    }
                    if (b < -16) {
                        if (i10 >= i2 - 1) {
                            return AbstractC2536tD.m5015a(bArr, i10, i2);
                        }
                        int i11 = i4 + 2;
                        byte b2 = bArr[i10];
                        if (b2 <= -65 && ((b != -32 || b2 >= -96) && (b != -19 || b2 < -96))) {
                            i4 += 3;
                            if (bArr[i11] > -65) {
                            }
                        }
                        return -1;
                    }
                    if (i10 >= i2 - 2) {
                        return AbstractC2536tD.m5015a(bArr, i10, i2);
                    }
                    int i12 = i4 + 2;
                    byte b3 = bArr[i10];
                    if (b3 <= -65) {
                        if ((((b3 + 112) + (b << 28)) >> 30) == 0) {
                            int i13 = i4 + 3;
                            if (bArr[i12] <= -65) {
                                i4 += 4;
                                if (bArr[i13] > -65) {
                                }
                            }
                        }
                    }
                    return -1;
                }
                i4 = i10;
            }
        }
        return 0;
    }
}
