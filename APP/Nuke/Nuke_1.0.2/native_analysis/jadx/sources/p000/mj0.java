package p000;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class mj0 {

    /* JADX INFO: renamed from: a */
    public ByteBuffer f6673a;

    /* JADX INFO: renamed from: b */
    public int f6674b;

    /* JADX INFO: renamed from: c */
    public int f6675c;

    /* JADX INFO: renamed from: d */
    public int[] f6676d;

    /* JADX INFO: renamed from: e */
    public int f6677e;

    /* JADX INFO: renamed from: f */
    public boolean f6678f;

    /* JADX INFO: renamed from: g */
    public boolean f6679g;

    /* JADX INFO: renamed from: h */
    public int f6680h;

    /* JADX INFO: renamed from: i */
    public int[] f6681i;

    /* JADX INFO: renamed from: j */
    public int f6682j;

    /* JADX INFO: renamed from: k */
    public int f6683k;

    /* JADX INFO: renamed from: l */
    public final C0700sn f6684l;

    /* JADX INFO: renamed from: m */
    public final jx2 f6685m;

    public mj0() {
        C0700sn c0700sn = C0700sn.f10204H;
        jx2 jx2VarM2594d = jx2.m2594d();
        this.f6675c = 1;
        this.f6676d = null;
        this.f6677e = 0;
        this.f6678f = false;
        this.f6679g = false;
        this.f6681i = new int[16];
        this.f6682j = 0;
        this.f6683k = 0;
        this.f6684l = c0700sn;
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(1024).order(ByteOrder.LITTLE_ENDIAN);
        this.f6673a = byteBufferOrder;
        this.f6685m = jx2VarM2594d;
        this.f6674b = byteBufferOrder.capacity();
    }

    /* JADX INFO: renamed from: a */
    public final void m3110a(byte b) {
        m3120k(1, 0);
        ByteBuffer byteBuffer = this.f6673a;
        int i = this.f6674b - 1;
        this.f6674b = i;
        byteBuffer.put(i, b);
    }

    /* JADX INFO: renamed from: b */
    public final void m3111b(int i) {
        m3120k(4, 0);
        int iM3119j = (m3119j() - i) + 4;
        ByteBuffer byteBuffer = this.f6673a;
        int i2 = this.f6674b - 4;
        this.f6674b = i2;
        byteBuffer.putInt(i2, iM3119j);
    }

    /* JADX INFO: renamed from: c */
    public final void m3112c(int i, int i2) {
        if (i2 != 0) {
            m3111b(i2);
            m3121l(i);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m3113d(short s) {
        m3120k(2, 0);
        ByteBuffer byteBuffer = this.f6673a;
        int i = this.f6674b - 2;
        this.f6674b = i;
        byteBuffer.putShort(i, s);
    }

    /* JADX INFO: renamed from: e */
    public final int m3114e(CharSequence charSequence) {
        char c;
        char c2;
        boolean z;
        int i;
        int i2;
        int i3;
        char cCharAt;
        jx2 jx2Var = this.f6685m;
        jx2Var.getClass();
        int length = charSequence.length();
        int i4 = 0;
        int i5 = 0;
        while (i5 < length && charSequence.charAt(i5) < 128) {
            i5++;
        }
        int i6 = length;
        while (true) {
            c = 55296;
            c2 = 2048;
            z = true;
            if (i5 >= length) {
                break;
            }
            char cCharAt2 = charSequence.charAt(i5);
            if (cCharAt2 < 2048) {
                i6 += (127 - cCharAt2) >>> 31;
                i5++;
            } else {
                int length2 = charSequence.length();
                int i7 = 0;
                while (i5 < length2) {
                    char cCharAt3 = charSequence.charAt(i5);
                    if (cCharAt3 < 2048) {
                        i7 += (127 - cCharAt3) >>> 31;
                    } else {
                        i7 += 2;
                        if (55296 <= cCharAt3 && cCharAt3 <= 57343) {
                            if (Character.codePointAt(charSequence, i5) < 65536) {
                                throw new o01(i5, length2);
                            }
                            i5++;
                        }
                    }
                    i5++;
                }
                i6 += i7;
            }
        }
        if (i6 < length) {
            throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (((long) i6) + 4294967296L));
        }
        m3110a((byte) 0);
        m3123n(1, i6, 1);
        ByteBuffer byteBuffer = this.f6673a;
        int i8 = this.f6674b - i6;
        this.f6674b = i8;
        byteBuffer.position(i8);
        ByteBuffer byteBuffer2 = this.f6673a;
        jx2Var.getClass();
        if (byteBuffer2.hasArray()) {
            int iArrayOffset = byteBuffer2.arrayOffset();
            byte[] bArrArray = byteBuffer2.array();
            int iPosition = byteBuffer2.position() + iArrayOffset;
            int iRemaining = byteBuffer2.remaining();
            int length3 = charSequence.length();
            int i9 = iRemaining + iPosition;
            while (true) {
                boolean z2 = z;
                if (i4 >= length3 || (i3 = i4 + iPosition) >= i9 || (cCharAt = charSequence.charAt(i4)) >= 128) {
                    break;
                }
                bArrArray[i3] = (byte) cCharAt;
                i4++;
                z = z2;
            }
            if (i4 == length3) {
                i = iPosition + length3;
            } else {
                i = iPosition + i4;
                while (i4 < length3) {
                    char cCharAt4 = charSequence.charAt(i4);
                    if (cCharAt4 < 128 && i < i9) {
                        bArrArray[i] = (byte) cCharAt4;
                        i++;
                    } else if (cCharAt4 < c2 && i <= i9 - 2) {
                        int i10 = i + 1;
                        bArrArray[i] = (byte) ((cCharAt4 >>> 6) | 960);
                        i += 2;
                        bArrArray[i10] = (byte) ((cCharAt4 & '?') | 128);
                    } else {
                        if ((cCharAt4 >= c && 57343 >= cCharAt4) || i > i9 - 3) {
                            if (i > i9 - 4) {
                                if (55296 <= cCharAt4 && cCharAt4 <= 57343 && ((i2 = i4 + 1) == charSequence.length() || !Character.isSurrogatePair(cCharAt4, charSequence.charAt(i2)))) {
                                    throw new o01(i4, length3);
                                }
                                throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt4 + " at index " + i);
                            }
                            int i11 = i4 + 1;
                            if (i11 != charSequence.length()) {
                                char cCharAt5 = charSequence.charAt(i11);
                                if (Character.isSurrogatePair(cCharAt4, cCharAt5)) {
                                    int codePoint = Character.toCodePoint(cCharAt4, cCharAt5);
                                    bArrArray[i] = (byte) ((codePoint >>> 18) | 240);
                                    bArrArray[i + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                                    int i12 = i + 3;
                                    bArrArray[i + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                                    i += 4;
                                    bArrArray[i12] = (byte) ((codePoint & 63) | 128);
                                    i4 = i11;
                                } else {
                                    i4 = i11;
                                }
                            }
                            throw new o01(i4 - 1, length3);
                        }
                        bArrArray[i] = (byte) ((cCharAt4 >>> '\f') | 480);
                        int i13 = i + 2;
                        bArrArray[i + 1] = (byte) (((cCharAt4 >>> 6) & 63) | 128);
                        i += 3;
                        bArrArray[i13] = (byte) ((cCharAt4 & '?') | 128);
                    }
                    i4++;
                    c = 55296;
                    c2 = 2048;
                }
            }
            byteBuffer2.position(i - iArrayOffset);
        } else {
            int length4 = charSequence.length();
            int iPosition2 = byteBuffer2.position();
            while (i4 < length4) {
                try {
                    char cCharAt6 = charSequence.charAt(i4);
                    if (cCharAt6 >= 128) {
                        break;
                    }
                    byteBuffer2.put(iPosition2 + i4, (byte) cCharAt6);
                    i4++;
                } catch (IndexOutOfBoundsException unused) {
                }
            }
            if (i4 == length4) {
                byteBuffer2.position(iPosition2 + i4);
            } else {
                iPosition2 += i4;
                while (i4 < length4) {
                    char cCharAt7 = charSequence.charAt(i4);
                    if (cCharAt7 >= 128) {
                        if (cCharAt7 < 2048) {
                            int i14 = iPosition2 + 1;
                            try {
                                byteBuffer2.put(iPosition2, (byte) ((cCharAt7 >>> 6) | 192));
                                byteBuffer2.put(i14, (byte) ((cCharAt7 & '?') | 128));
                                iPosition2 = i14;
                            } catch (IndexOutOfBoundsException unused2) {
                                iPosition2 = i14;
                            }
                        } else {
                            if (cCharAt7 >= 55296 && 57343 >= cCharAt7) {
                                int i15 = i4 + 1;
                                if (i15 != length4) {
                                    try {
                                        char cCharAt8 = charSequence.charAt(i15);
                                        if (Character.isSurrogatePair(cCharAt7, cCharAt8)) {
                                            int codePoint2 = Character.toCodePoint(cCharAt7, cCharAt8);
                                            int i16 = iPosition2 + 1;
                                            try {
                                                byteBuffer2.put(iPosition2, (byte) ((codePoint2 >>> 18) | 240));
                                                int i17 = iPosition2 + 2;
                                                try {
                                                    byteBuffer2.put(i16, (byte) (((codePoint2 >>> 12) & 63) | 128));
                                                    iPosition2 += 3;
                                                    byteBuffer2.put(i17, (byte) (((codePoint2 >>> 6) & 63) | 128));
                                                    byteBuffer2.put(iPosition2, (byte) ((codePoint2 & 63) | 128));
                                                    i4 = i15;
                                                    i4++;
                                                    iPosition2++;
                                                } catch (IndexOutOfBoundsException unused3) {
                                                    i4 = i15;
                                                    iPosition2 = i17;
                                                }
                                            } catch (IndexOutOfBoundsException unused4) {
                                                iPosition2 = i16;
                                                i4 = i15;
                                            }
                                        } else {
                                            i4 = i15;
                                        }
                                    } catch (IndexOutOfBoundsException unused5) {
                                    }
                                }
                                throw new o01(i4, length4);
                            }
                            int i18 = iPosition2 + 1;
                            try {
                                byteBuffer2.put(iPosition2, (byte) ((cCharAt7 >>> '\f') | 224));
                                iPosition2 += 2;
                                byteBuffer2.put(i18, (byte) (((cCharAt7 >>> 6) & 63) | 128));
                                byteBuffer2.put(iPosition2, (byte) ((cCharAt7 & '?') | 128));
                                i4++;
                                iPosition2++;
                            } catch (IndexOutOfBoundsException unused6) {
                                iPosition2 = i18;
                            }
                        }
                        int iMax = Math.max(i4, (iPosition2 - byteBuffer2.position()) + 1) + byteBuffer2.position();
                        throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(i4) + " at index " + iMax);
                    }
                    byteBuffer2.put(iPosition2, (byte) cCharAt7);
                    i4++;
                    iPosition2++;
                }
                byteBuffer2.position(iPosition2);
            }
        }
        return m3117h();
    }

    /* JADX INFO: renamed from: f */
    public final int m3115f(int[] iArr) {
        if (this.f6678f) {
            C0676s.m4650i("FlatBuffers: object serialization must not be nested.");
            return 0;
        }
        m3123n(4, iArr.length, 4);
        for (int length = iArr.length - 1; length >= 0; length--) {
            m3111b(iArr[length]);
        }
        return m3117h();
    }

    /* JADX INFO: renamed from: g */
    public final int m3116g() {
        int i;
        if (this.f6676d == null || !this.f6678f) {
            C0676s.m4650i("FlatBuffers: endTable called without startTable");
            return 0;
        }
        m3120k(4, 0);
        ByteBuffer byteBuffer = this.f6673a;
        int i2 = this.f6674b - 4;
        this.f6674b = i2;
        byteBuffer.putInt(i2, 0);
        int iM3119j = m3119j();
        int i3 = this.f6677e - 1;
        while (i3 >= 0 && this.f6676d[i3] == 0) {
            i3--;
        }
        for (int i4 = i3; i4 >= 0; i4--) {
            int i5 = this.f6676d[i4];
            m3113d((short) (i5 != 0 ? iM3119j - i5 : 0));
        }
        m3113d((short) (iM3119j - this.f6680h));
        m3113d((short) ((i3 + 3) * 2));
        int i6 = 0;
        loop2: while (true) {
            if (i6 >= this.f6682j) {
                i = 0;
                break;
            }
            int iCapacity = this.f6673a.capacity() - this.f6681i[i6];
            int i7 = this.f6674b;
            short s = this.f6673a.getShort(iCapacity);
            if (s == this.f6673a.getShort(i7)) {
                for (int i8 = 2; i8 < s; i8 += 2) {
                    if (this.f6673a.getShort(iCapacity + i8) != this.f6673a.getShort(i7 + i8)) {
                        break;
                    }
                }
                i = this.f6681i[i6];
                break loop2;
            }
            i6++;
        }
        if (i != 0) {
            int iCapacity2 = this.f6673a.capacity() - iM3119j;
            this.f6674b = iCapacity2;
            this.f6673a.putInt(iCapacity2, i - iM3119j);
        } else {
            int i9 = this.f6682j;
            int[] iArr = this.f6681i;
            if (i9 == iArr.length) {
                this.f6681i = Arrays.copyOf(iArr, i9 * 2);
            }
            int[] iArr2 = this.f6681i;
            int i10 = this.f6682j;
            this.f6682j = i10 + 1;
            iArr2[i10] = m3119j();
            ByteBuffer byteBuffer2 = this.f6673a;
            byteBuffer2.putInt(byteBuffer2.capacity() - iM3119j, m3119j() - iM3119j);
        }
        this.f6678f = false;
        return iM3119j;
    }

    /* JADX INFO: renamed from: h */
    public final int m3117h() {
        if (!this.f6678f) {
            C0676s.m4650i("FlatBuffers: endVector called without startVector");
            return 0;
        }
        this.f6678f = false;
        int i = this.f6683k;
        ByteBuffer byteBuffer = this.f6673a;
        int i2 = this.f6674b - 4;
        this.f6674b = i2;
        byteBuffer.putInt(i2, i);
        return m3119j();
    }

    /* JADX INFO: renamed from: i */
    public final void m3118i(int i) {
        m3120k(this.f6675c, 4);
        m3111b(i);
        this.f6673a.position(this.f6674b);
        this.f6679g = true;
    }

    /* JADX INFO: renamed from: j */
    public final int m3119j() {
        return this.f6673a.capacity() - this.f6674b;
    }

    /* JADX INFO: renamed from: k */
    public final void m3120k(int i, int i2) {
        int i3;
        if (i > this.f6675c) {
            this.f6675c = i;
        }
        int i4 = ((~((this.f6673a.capacity() - this.f6674b) + i2)) + 1) & (i - 1);
        while (this.f6674b < i4 + i + i2) {
            int iCapacity = this.f6673a.capacity();
            ByteBuffer byteBuffer = this.f6673a;
            int iCapacity2 = byteBuffer.capacity();
            if (iCapacity2 == 0) {
                i3 = 1024;
            } else {
                i3 = 2147483639;
                if (iCapacity2 == 2147483639) {
                    C0676s.m4650i("FlatBuffers: cannot grow buffer beyond 2 gigabytes.");
                    return;
                } else if (((-1073741824) & iCapacity2) == 0) {
                    i3 = iCapacity2 << 1;
                }
            }
            byteBuffer.position(0);
            this.f6684l.getClass();
            ByteBuffer byteBufferOrder = ByteBuffer.allocate(i3).order(ByteOrder.LITTLE_ENDIAN);
            byteBufferOrder.position(byteBufferOrder.clear().capacity() - iCapacity2);
            byteBufferOrder.put(byteBuffer);
            this.f6673a = byteBufferOrder;
            this.f6674b = (byteBufferOrder.capacity() - iCapacity) + this.f6674b;
        }
        for (int i5 = 0; i5 < i4; i5++) {
            ByteBuffer byteBuffer2 = this.f6673a;
            int i6 = this.f6674b - 1;
            this.f6674b = i6;
            byteBuffer2.put(i6, (byte) 0);
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m3121l(int i) {
        this.f6676d[i] = m3119j();
    }

    /* JADX INFO: renamed from: m */
    public final void m3122m(int i) {
        if (this.f6678f) {
            C0676s.m4650i("FlatBuffers: object serialization must not be nested.");
            return;
        }
        int[] iArr = this.f6676d;
        if (iArr == null || iArr.length < i) {
            this.f6676d = new int[i];
        }
        this.f6677e = i;
        Arrays.fill(this.f6676d, 0, i, 0);
        this.f6678f = true;
        this.f6680h = m3119j();
    }

    /* JADX INFO: renamed from: n */
    public final void m3123n(int i, int i2, int i3) {
        if (this.f6678f) {
            C0676s.m4650i("FlatBuffers: object serialization must not be nested.");
            return;
        }
        this.f6683k = i2;
        int i4 = i * i2;
        m3120k(4, i4);
        m3120k(i3, i4);
        this.f6678f = true;
    }
}
