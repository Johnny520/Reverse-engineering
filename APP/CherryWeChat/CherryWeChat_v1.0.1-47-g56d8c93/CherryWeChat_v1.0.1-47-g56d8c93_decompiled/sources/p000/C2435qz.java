package p000;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: qz */
/* JADX INFO: loaded from: classes.dex */
public final class C2435qz extends AbstractC0828TB {

    /* JADX INFO: renamed from: l */
    public final String f8542l;

    /* JADX INFO: renamed from: m */
    public int f8543m;

    public C2435qz(String str, int i) {
        this.f8542l = str;
        this.f8543m = i;
    }

    /* JADX INFO: renamed from: N */
    public final int m4889N(C0110Ch c0110Ch) {
        char c;
        int i;
        int i2;
        int i3;
        int i4;
        char cCharAt;
        String str = this.f8542l;
        if (str == null) {
            throw new IllegalArgumentException("value must not be null");
        }
        if (str.length() == 0 && this.f8543m != 5) {
            this.f8543m = 5;
        }
        c0110Ch.f270m.getClass();
        int length = str.length();
        int i5 = 0;
        int i6 = 0;
        while (i6 < length && str.charAt(i6) < 128) {
            i6++;
        }
        int i7 = length;
        while (true) {
            c = 2048;
            if (i6 >= length) {
                break;
            }
            char cCharAt2 = str.charAt(i6);
            if (cCharAt2 < 2048) {
                i7 += (127 - cCharAt2) >>> 31;
                i6++;
            } else {
                int length2 = str.length();
                int i8 = 0;
                while (i6 < length2) {
                    char cCharAt3 = str.charAt(i6);
                    if (cCharAt3 < 2048) {
                        i8 += (127 - cCharAt3) >>> 31;
                    } else {
                        i8 += 2;
                        if (55296 <= cCharAt3 && cCharAt3 <= 57343) {
                            if (Character.codePointAt(str, i6) < 65536) {
                                throw new C0341Hx(i6, length2);
                            }
                            i6++;
                        }
                    }
                    i6++;
                }
                i7 += i8;
            }
        }
        if (i7 < length) {
            throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (((long) i7) + 4294967296L));
        }
        c0110Ch.m168g(1, 0);
        ByteBuffer byteBuffer = c0110Ch.f258a;
        int i9 = c0110Ch.f259b - 1;
        c0110Ch.f259b = i9;
        byteBuffer.put(i9, (byte) 0);
        if (c0110Ch.f263f) {
            throw new AssertionError("FlatBuffers: object serialization must not be nested.");
        }
        c0110Ch.f268k = i7;
        c0110Ch.m168g(4, i7);
        c0110Ch.m168g(1, i7);
        c0110Ch.f263f = true;
        ByteBuffer byteBuffer2 = c0110Ch.f258a;
        int i10 = c0110Ch.f259b - i7;
        c0110Ch.f259b = i10;
        byteBuffer2.position(i10);
        ByteBuffer byteBuffer3 = c0110Ch.f258a;
        if (byteBuffer3.hasArray()) {
            int iArrayOffset = byteBuffer3.arrayOffset();
            byte[] bArrArray = byteBuffer3.array();
            int iPosition = byteBuffer3.position() + iArrayOffset;
            int iRemaining = byteBuffer3.remaining();
            int length3 = str.length();
            i = 1;
            int i11 = iPosition + iRemaining;
            while (i5 < length3) {
                int i12 = i5 + iPosition;
                if (i12 >= i11 || (cCharAt = str.charAt(i5)) >= 128) {
                    break;
                }
                bArrArray[i12] = (byte) cCharAt;
                i5++;
            }
            if (i5 == length3) {
                i2 = iPosition + length3;
            } else {
                i2 = iPosition + i5;
                while (i5 < length3) {
                    char cCharAt4 = str.charAt(i5);
                    if (cCharAt4 < 128 && i2 < i11) {
                        bArrArray[i2] = (byte) cCharAt4;
                        i3 = iArrayOffset;
                        i2++;
                    } else if (cCharAt4 < c && i2 <= i11 - 2) {
                        int i13 = i2 + 1;
                        bArrArray[i2] = (byte) ((cCharAt4 >>> 6) | 960);
                        i2 += 2;
                        bArrArray[i13] = (byte) ((cCharAt4 & '?') | 128);
                        i3 = iArrayOffset;
                    } else {
                        if ((cCharAt4 >= 55296 && 57343 >= cCharAt4) || i2 > i11 - 3) {
                            i3 = iArrayOffset;
                            if (i2 > i11 - 4) {
                                if (55296 <= cCharAt4 && cCharAt4 <= 57343 && ((i4 = i5 + 1) == str.length() || !Character.isSurrogatePair(cCharAt4, str.charAt(i4)))) {
                                    throw new C0341Hx(i5, length3);
                                }
                                throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt4 + " at index " + i2);
                            }
                            int i14 = i5 + 1;
                            if (i14 != str.length()) {
                                char cCharAt5 = str.charAt(i14);
                                if (Character.isSurrogatePair(cCharAt4, cCharAt5)) {
                                    int codePoint = Character.toCodePoint(cCharAt4, cCharAt5);
                                    bArrArray[i2] = (byte) ((codePoint >>> 18) | 240);
                                    bArrArray[i2 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                                    int i15 = i2 + 3;
                                    bArrArray[i2 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                                    i2 += 4;
                                    bArrArray[i15] = (byte) ((codePoint & 63) | 128);
                                    i5 = i14;
                                } else {
                                    i5 = i14;
                                }
                            }
                            throw new C0341Hx(i5 - 1, length3);
                        }
                        bArrArray[i2] = (byte) ((cCharAt4 >>> '\f') | 480);
                        int i16 = i2 + 2;
                        i3 = iArrayOffset;
                        bArrArray[i2 + 1] = (byte) (((cCharAt4 >>> 6) & 63) | 128);
                        i2 += 3;
                        bArrArray[i16] = (byte) ((cCharAt4 & '?') | 128);
                    }
                    i5++;
                    iArrayOffset = i3;
                    c = 2048;
                }
            }
            byteBuffer3.position(i2 - iArrayOffset);
        } else {
            i = 1;
            int length4 = str.length();
            int iPosition2 = byteBuffer3.position();
            int i17 = 0;
            while (i17 < length4) {
                try {
                    char cCharAt6 = str.charAt(i17);
                    if (cCharAt6 >= 128) {
                        break;
                    }
                    byteBuffer3.put(iPosition2 + i17, (byte) cCharAt6);
                    i17++;
                } catch (IndexOutOfBoundsException unused) {
                }
            }
            if (i17 == length4) {
                byteBuffer3.position(iPosition2 + i17);
            } else {
                iPosition2 += i17;
                while (i17 < length4) {
                    char cCharAt7 = str.charAt(i17);
                    if (cCharAt7 >= 128) {
                        if (cCharAt7 < 2048) {
                            int i18 = iPosition2 + 1;
                            try {
                                byteBuffer3.put(iPosition2, (byte) ((cCharAt7 >>> 6) | 192));
                                byteBuffer3.put(i18, (byte) ((cCharAt7 & '?') | 128));
                                iPosition2 = i18;
                            } catch (IndexOutOfBoundsException unused2) {
                                iPosition2 = i18;
                            }
                        } else {
                            if (cCharAt7 >= 55296 && 57343 >= cCharAt7) {
                                int i19 = i17 + 1;
                                if (i19 != length4) {
                                    try {
                                        char cCharAt8 = str.charAt(i19);
                                        if (Character.isSurrogatePair(cCharAt7, cCharAt8)) {
                                            int codePoint2 = Character.toCodePoint(cCharAt7, cCharAt8);
                                            int i20 = iPosition2 + 1;
                                            try {
                                                byteBuffer3.put(iPosition2, (byte) ((codePoint2 >>> 18) | 240));
                                                int i21 = iPosition2 + 2;
                                                try {
                                                    byteBuffer3.put(i20, (byte) (((codePoint2 >>> 12) & 63) | 128));
                                                    iPosition2 += 3;
                                                    byteBuffer3.put(i21, (byte) (((codePoint2 >>> 6) & 63) | 128));
                                                    byteBuffer3.put(iPosition2, (byte) ((codePoint2 & 63) | 128));
                                                    i17 = i19;
                                                    i17++;
                                                    iPosition2++;
                                                } catch (IndexOutOfBoundsException unused3) {
                                                    i17 = i19;
                                                    iPosition2 = i21;
                                                }
                                            } catch (IndexOutOfBoundsException unused4) {
                                                iPosition2 = i20;
                                                i17 = i19;
                                            }
                                        } else {
                                            i17 = i19;
                                        }
                                    } catch (IndexOutOfBoundsException unused5) {
                                    }
                                }
                                throw new C0341Hx(i17, length4);
                            }
                            int i22 = iPosition2 + 1;
                            try {
                                byteBuffer3.put(iPosition2, (byte) ((cCharAt7 >>> '\f') | 224));
                                iPosition2 += 2;
                                byteBuffer3.put(i22, (byte) (((cCharAt7 >>> 6) & 63) | 128));
                                byteBuffer3.put(iPosition2, (byte) ((cCharAt7 & '?') | 128));
                                i17++;
                                iPosition2++;
                            } catch (IndexOutOfBoundsException unused6) {
                                iPosition2 = i22;
                            }
                        }
                        throw new ArrayIndexOutOfBoundsException("Failed writing " + str.charAt(i17) + " at index " + (Math.max(i17, (iPosition2 - byteBuffer3.position()) + 1) + byteBuffer3.position()));
                    }
                    byteBuffer3.put(iPosition2, (byte) cCharAt7);
                    i17++;
                    iPosition2++;
                }
                byteBuffer3.position(iPosition2);
            }
        }
        if (!c0110Ch.f263f) {
            throw new AssertionError("FlatBuffers: endVector called without startVector");
        }
        c0110Ch.f263f = false;
        int i23 = c0110Ch.f268k;
        ByteBuffer byteBuffer4 = c0110Ch.f258a;
        int i24 = c0110Ch.f259b - 4;
        c0110Ch.f259b = i24;
        byteBuffer4.putInt(i24, i23);
        int iM167f = c0110Ch.m167f();
        int i25 = this.f8543m;
        byte b = 1;
        if (i25 != 1) {
            byte b2 = 2;
            if (i25 != 2) {
                b = 3;
                if (i25 != 3) {
                    b2 = 4;
                    if (i25 != 4) {
                        if (i25 != 5) {
                            throw null;
                        }
                        b = b2;
                    }
                } else {
                    b = b2;
                }
            }
        } else {
            b = 0;
        }
        c0110Ch.m170i(3);
        c0110Ch.m162a(0, iM167f);
        if (b != 0) {
            int i26 = i;
            c0110Ch.m168g(i26, 0);
            ByteBuffer byteBuffer5 = c0110Ch.f258a;
            int i27 = c0110Ch.f259b - i26;
            c0110Ch.f259b = i27;
            byteBuffer5.put(i27, b);
            c0110Ch.f261d[i26] = c0110Ch.m167f();
        }
        int iM165d = c0110Ch.m165d();
        c0110Ch.m166e(iM165d);
        return iM165d;
    }
}
