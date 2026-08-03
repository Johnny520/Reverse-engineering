package com.google.flatbuffers;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* JADX INFO: renamed from: com.google.flatbuffers.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0733b {

    /* JADX INFO: renamed from: a */
    public ByteBuffer f2558a;

    /* JADX INFO: renamed from: b */
    public int f2559b;

    /* JADX INFO: renamed from: c */
    public int f2560c;

    /* JADX INFO: renamed from: d */
    public int[] f2561d;

    /* JADX INFO: renamed from: e */
    public int f2562e;

    /* JADX INFO: renamed from: f */
    public boolean f2563f;

    /* JADX INFO: renamed from: g */
    public boolean f2564g;

    /* JADX INFO: renamed from: h */
    public int f2565h;

    /* JADX INFO: renamed from: i */
    public int[] f2566i;

    /* JADX INFO: renamed from: j */
    public int f2567j;

    /* JADX INFO: renamed from: k */
    public int f2568k;

    /* JADX INFO: renamed from: l */
    public final C0732a f2569l;

    /* JADX INFO: renamed from: m */
    public final AbstractC0736e f2570m;

    public C0733b() {
        C0732a c0732a = C0732a.f2557a;
        if (AbstractC0736e.f2574a == null) {
            AbstractC0736e.f2574a = new C0738g();
        }
        C0738g c0738g = AbstractC0736e.f2574a;
        this.f2560c = 1;
        this.f2561d = null;
        this.f2562e = 0;
        this.f2563f = false;
        this.f2564g = false;
        this.f2566i = new int[16];
        this.f2567j = 0;
        this.f2568k = 0;
        this.f2569l = c0732a;
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(1024).order(ByteOrder.LITTLE_ENDIAN);
        this.f2558a = byteBufferOrder;
        this.f2570m = c0738g;
        this.f2559b = byteBufferOrder.capacity();
    }

    /* JADX INFO: renamed from: a */
    public final void m1918a(int i2, boolean z2) {
        if (z2) {
            m1933p(1, 0);
            ByteBuffer byteBuffer = this.f2558a;
            int i3 = this.f2559b - 1;
            this.f2559b = i3;
            byteBuffer.put(i3, z2 ? (byte) 1 : (byte) 0);
            m1935r(i2);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m1919b(byte b2) {
        m1933p(1, 0);
        ByteBuffer byteBuffer = this.f2558a;
        int i2 = this.f2559b - 1;
        this.f2559b = i2;
        byteBuffer.put(i2, b2);
    }

    /* JADX INFO: renamed from: c */
    public final void m1920c(int i2, byte b2) {
        if (b2 != 0) {
            m1919b(b2);
            m1935r(i2);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m1921d(int i2) {
        m1933p(4, 0);
        ByteBuffer byteBuffer = this.f2558a;
        int i3 = this.f2559b - 4;
        this.f2559b = i3;
        byteBuffer.putInt(i3, i2);
    }

    /* JADX INFO: renamed from: e */
    public final void m1922e(int i2, int i3) {
        if (i3 != 0) {
            m1921d(i3);
            m1935r(i2);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m1923f(long j2) {
        m1933p(8, 0);
        ByteBuffer byteBuffer = this.f2558a;
        int i2 = this.f2559b - 8;
        this.f2559b = i2;
        byteBuffer.putLong(i2, j2);
    }

    /* JADX INFO: renamed from: g */
    public final void m1924g(int i2) {
        m1933p(4, 0);
        int iM1932o = (m1932o() - i2) + 4;
        ByteBuffer byteBuffer = this.f2558a;
        int i3 = this.f2559b - 4;
        this.f2559b = i3;
        byteBuffer.putInt(i3, iM1932o);
    }

    /* JADX INFO: renamed from: h */
    public final void m1925h(int i2, int i3) {
        if (i3 != 0) {
            m1924g(i3);
            m1935r(i2);
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m1926i(short s2) {
        m1933p(2, 0);
        ByteBuffer byteBuffer = this.f2558a;
        int i2 = this.f2559b - 2;
        this.f2559b = i2;
        byteBuffer.putShort(i2, s2);
    }

    /* JADX INFO: renamed from: j */
    public final int m1927j(CharSequence charSequence) {
        char c;
        char c2;
        int i2;
        int i3;
        int i4;
        int i5;
        char cCharAt;
        AbstractC0736e abstractC0736e = this.f2570m;
        ((C0738g) abstractC0736e).getClass();
        int length = charSequence.length();
        int i6 = 0;
        int i7 = 0;
        while (i7 < length && charSequence.charAt(i7) < 128) {
            i7++;
        }
        int i8 = length;
        while (true) {
            c = 55296;
            c2 = 2048;
            if (i7 >= length) {
                break;
            }
            char cCharAt2 = charSequence.charAt(i7);
            if (cCharAt2 < 2048) {
                i8 += (127 - cCharAt2) >>> 31;
                i7++;
            } else {
                int length2 = charSequence.length();
                int i9 = 0;
                while (i7 < length2) {
                    char cCharAt3 = charSequence.charAt(i7);
                    if (cCharAt3 < 2048) {
                        i9 += (127 - cCharAt3) >>> 31;
                    } else {
                        i9 += 2;
                        if (55296 <= cCharAt3 && cCharAt3 <= 57343) {
                            if (Character.codePointAt(charSequence, i7) < 65536) {
                                throw new C0737f(i7, length2);
                            }
                            i7++;
                        }
                    }
                    i7++;
                }
                i8 += i9;
            }
        }
        if (i8 < length) {
            throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (((long) i8) + 4294967296L));
        }
        m1919b((byte) 0);
        m1937t(1, i8, 1);
        ByteBuffer byteBuffer = this.f2558a;
        int i10 = this.f2559b - i8;
        this.f2559b = i10;
        byteBuffer.position(i10);
        ByteBuffer byteBuffer2 = this.f2558a;
        ((C0738g) abstractC0736e).getClass();
        if (byteBuffer2.hasArray()) {
            int iArrayOffset = byteBuffer2.arrayOffset();
            byte[] bArrArray = byteBuffer2.array();
            int iPosition = byteBuffer2.position() + iArrayOffset;
            int iRemaining = byteBuffer2.remaining();
            int length3 = charSequence.length();
            int i11 = iRemaining + iPosition;
            while (i6 < length3) {
                int i12 = i6 + iPosition;
                if (i12 >= i11 || (cCharAt = charSequence.charAt(i6)) >= 128) {
                    break;
                }
                bArrArray[i12] = (byte) cCharAt;
                i6++;
            }
            if (i6 == length3) {
                i3 = iPosition + length3;
            } else {
                i3 = iPosition + i6;
                while (i6 < length3) {
                    char cCharAt4 = charSequence.charAt(i6);
                    if (cCharAt4 < 128 && i3 < i11) {
                        bArrArray[i3] = (byte) cCharAt4;
                        i3++;
                    } else if (cCharAt4 < c2 && i3 <= i11 - 2) {
                        int i13 = i3 + 1;
                        bArrArray[i3] = (byte) ((cCharAt4 >>> 6) | 960);
                        i3 += 2;
                        bArrArray[i13] = (byte) ((cCharAt4 & '?') | 128);
                    } else {
                        if ((cCharAt4 >= c && 57343 >= cCharAt4) || i3 > i11 - 3) {
                            if (i3 > i11 - 4) {
                                if (55296 <= cCharAt4 && cCharAt4 <= 57343 && ((i4 = i6 + 1) == charSequence.length() || !Character.isSurrogatePair(cCharAt4, charSequence.charAt(i4)))) {
                                    throw new C0737f(i6, length3);
                                }
                                throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt4 + " at index " + i3);
                            }
                            int i14 = i6 + 1;
                            if (i14 != charSequence.length()) {
                                char cCharAt5 = charSequence.charAt(i14);
                                if (Character.isSurrogatePair(cCharAt4, cCharAt5)) {
                                    int codePoint = Character.toCodePoint(cCharAt4, cCharAt5);
                                    bArrArray[i3] = (byte) ((codePoint >>> 18) | 240);
                                    bArrArray[i3 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                                    int i15 = i3 + 3;
                                    bArrArray[i3 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                                    i3 += 4;
                                    bArrArray[i15] = (byte) ((codePoint & 63) | 128);
                                    i6 = i14;
                                } else {
                                    i5 = 1;
                                    i6 = i14;
                                }
                            } else {
                                i5 = 1;
                            }
                            throw new C0737f(i6 - i5, length3);
                        }
                        bArrArray[i3] = (byte) ((cCharAt4 >>> '\f') | 480);
                        int i16 = i3 + 2;
                        bArrArray[i3 + 1] = (byte) (((cCharAt4 >>> 6) & 63) | 128);
                        i3 += 3;
                        bArrArray[i16] = (byte) ((cCharAt4 & '?') | 128);
                    }
                    i6++;
                    c = 55296;
                    c2 = 2048;
                }
            }
            byteBuffer2.position(i3 - iArrayOffset);
        } else {
            int length4 = charSequence.length();
            int iPosition2 = byteBuffer2.position();
            while (i6 < length4) {
                try {
                    char cCharAt6 = charSequence.charAt(i6);
                    if (cCharAt6 >= 128) {
                        break;
                    }
                    byteBuffer2.put(iPosition2 + i6, (byte) cCharAt6);
                    i6++;
                } catch (IndexOutOfBoundsException unused) {
                }
            }
            if (i6 == length4) {
                byteBuffer2.position(iPosition2 + i6);
            } else {
                iPosition2 += i6;
                while (i6 < length4) {
                    char cCharAt7 = charSequence.charAt(i6);
                    if (cCharAt7 >= 128) {
                        if (cCharAt7 < 2048) {
                            int i17 = iPosition2 + 1;
                            try {
                                byteBuffer2.put(iPosition2, (byte) ((cCharAt7 >>> 6) | 192));
                                byteBuffer2.put(i17, (byte) ((cCharAt7 & '?') | 128));
                                iPosition2 = i17;
                                i2 = 1;
                            } catch (IndexOutOfBoundsException unused2) {
                                iPosition2 = i17;
                            }
                        } else {
                            if (cCharAt7 >= 55296 && 57343 >= cCharAt7) {
                                int i18 = i6 + 1;
                                if (i18 != length4) {
                                    try {
                                        char cCharAt8 = charSequence.charAt(i18);
                                        if (Character.isSurrogatePair(cCharAt7, cCharAt8)) {
                                            int codePoint2 = Character.toCodePoint(cCharAt7, cCharAt8);
                                            int i19 = iPosition2 + 1;
                                            try {
                                                byteBuffer2.put(iPosition2, (byte) ((codePoint2 >>> 18) | 240));
                                                int i20 = iPosition2 + 2;
                                                try {
                                                    byteBuffer2.put(i19, (byte) (((codePoint2 >>> 12) & 63) | 128));
                                                    iPosition2 += 3;
                                                    byteBuffer2.put(i20, (byte) (((codePoint2 >>> 6) & 63) | 128));
                                                    byteBuffer2.put(iPosition2, (byte) ((codePoint2 & 63) | 128));
                                                    i6 = i18;
                                                    i2 = 1;
                                                } catch (IndexOutOfBoundsException unused3) {
                                                    i6 = i18;
                                                    iPosition2 = i20;
                                                }
                                            } catch (IndexOutOfBoundsException unused4) {
                                                iPosition2 = i19;
                                                i6 = i18;
                                            }
                                        } else {
                                            i6 = i18;
                                        }
                                    } catch (IndexOutOfBoundsException unused5) {
                                    }
                                }
                                throw new C0737f(i6, length4);
                            }
                            int i21 = iPosition2 + 1;
                            try {
                                byteBuffer2.put(iPosition2, (byte) ((cCharAt7 >>> '\f') | 224));
                                iPosition2 += 2;
                                byteBuffer2.put(i21, (byte) (((cCharAt7 >>> 6) & 63) | 128));
                                byteBuffer2.put(iPosition2, (byte) ((cCharAt7 & '?') | 128));
                                i2 = 1;
                            } catch (IndexOutOfBoundsException unused6) {
                                iPosition2 = i21;
                            }
                            i6 += i2;
                            iPosition2 += i2;
                        }
                        throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(i6) + " at index " + (Math.max(i6, (iPosition2 - byteBuffer2.position()) + 1) + byteBuffer2.position()));
                    }
                    byteBuffer2.put(iPosition2, (byte) cCharAt7);
                    i2 = 1;
                    i6 += i2;
                    iPosition2 += i2;
                }
                byteBuffer2.position(iPosition2);
            }
        }
        return m1930m();
    }

    /* JADX INFO: renamed from: k */
    public final int m1928k(int[] iArr) {
        if (this.f2563f) {
            throw new AssertionError("FlatBuffers: object serialization must not be nested.");
        }
        m1937t(4, iArr.length, 4);
        for (int length = iArr.length - 1; length >= 0; length--) {
            m1924g(iArr[length]);
        }
        return m1930m();
    }

    /* JADX INFO: renamed from: l */
    public final int m1929l() {
        int i2;
        if (this.f2561d == null || !this.f2563f) {
            throw new AssertionError("FlatBuffers: endTable called without startTable");
        }
        m1921d(0);
        int iM1932o = m1932o();
        int i3 = this.f2562e - 1;
        while (i3 >= 0 && this.f2561d[i3] == 0) {
            i3--;
        }
        for (int i4 = i3; i4 >= 0; i4--) {
            int i5 = this.f2561d[i4];
            m1926i((short) (i5 != 0 ? iM1932o - i5 : 0));
        }
        m1926i((short) (iM1932o - this.f2565h));
        m1926i((short) ((i3 + 3) * 2));
        int i6 = 0;
        loop2: while (true) {
            if (i6 >= this.f2567j) {
                i2 = 0;
                break;
            }
            int iCapacity = this.f2558a.capacity() - this.f2566i[i6];
            int i7 = this.f2559b;
            short s2 = this.f2558a.getShort(iCapacity);
            if (s2 == this.f2558a.getShort(i7)) {
                for (int i8 = 2; i8 < s2; i8 += 2) {
                    if (this.f2558a.getShort(iCapacity + i8) != this.f2558a.getShort(i7 + i8)) {
                        break;
                    }
                }
                i2 = this.f2566i[i6];
                break loop2;
            }
            i6++;
        }
        if (i2 != 0) {
            int iCapacity2 = this.f2558a.capacity() - iM1932o;
            this.f2559b = iCapacity2;
            this.f2558a.putInt(iCapacity2, i2 - iM1932o);
        } else {
            int i9 = this.f2567j;
            int[] iArr = this.f2566i;
            if (i9 == iArr.length) {
                this.f2566i = Arrays.copyOf(iArr, i9 * 2);
            }
            int[] iArr2 = this.f2566i;
            int i10 = this.f2567j;
            this.f2567j = i10 + 1;
            iArr2[i10] = m1932o();
            ByteBuffer byteBuffer = this.f2558a;
            byteBuffer.putInt(byteBuffer.capacity() - iM1932o, m1932o() - iM1932o);
        }
        this.f2563f = false;
        return iM1932o;
    }

    /* JADX INFO: renamed from: m */
    public final int m1930m() {
        if (!this.f2563f) {
            throw new AssertionError("FlatBuffers: endVector called without startVector");
        }
        this.f2563f = false;
        int i2 = this.f2568k;
        ByteBuffer byteBuffer = this.f2558a;
        int i3 = this.f2559b - 4;
        this.f2559b = i3;
        byteBuffer.putInt(i3, i2);
        return m1932o();
    }

    /* JADX INFO: renamed from: n */
    public final void m1931n(int i2) {
        m1933p(this.f2560c, 4);
        m1924g(i2);
        this.f2558a.position(this.f2559b);
        this.f2564g = true;
    }

    /* JADX INFO: renamed from: o */
    public final int m1932o() {
        return this.f2558a.capacity() - this.f2559b;
    }

    /* JADX INFO: renamed from: p */
    public final void m1933p(int i2, int i3) {
        int i4;
        if (i2 > this.f2560c) {
            this.f2560c = i2;
        }
        int i5 = ((~((this.f2558a.capacity() - this.f2559b) + i3)) + 1) & (i2 - 1);
        while (this.f2559b < i5 + i2 + i3) {
            int iCapacity = this.f2558a.capacity();
            ByteBuffer byteBuffer = this.f2558a;
            int iCapacity2 = byteBuffer.capacity();
            if (iCapacity2 == 0) {
                i4 = 1024;
            } else {
                i4 = 2147483639;
                if (iCapacity2 == 2147483639) {
                    throw new AssertionError("FlatBuffers: cannot grow buffer beyond 2 gigabytes.");
                }
                if (((-1073741824) & iCapacity2) == 0) {
                    i4 = iCapacity2 << 1;
                }
            }
            byteBuffer.position(0);
            this.f2569l.getClass();
            ByteBuffer byteBufferOrder = ByteBuffer.allocate(i4).order(ByteOrder.LITTLE_ENDIAN);
            byteBufferOrder.position(byteBufferOrder.clear().capacity() - iCapacity2);
            byteBufferOrder.put(byteBuffer);
            this.f2558a = byteBufferOrder;
            this.f2559b = (byteBufferOrder.capacity() - iCapacity) + this.f2559b;
        }
        for (int i6 = 0; i6 < i5; i6++) {
            ByteBuffer byteBuffer2 = this.f2558a;
            int i7 = this.f2559b - 1;
            this.f2559b = i7;
            byteBuffer2.put(i7, (byte) 0);
        }
    }

    /* JADX INFO: renamed from: q */
    public final byte[] m1934q() {
        int i2 = this.f2559b;
        int iCapacity = this.f2558a.capacity() - this.f2559b;
        if (!this.f2564g) {
            throw new AssertionError("FlatBuffers: you can only access the serialized buffer after it has been finished by FlatBufferBuilder.finish().");
        }
        byte[] bArr = new byte[iCapacity];
        this.f2558a.position(i2);
        this.f2558a.get(bArr);
        return bArr;
    }

    /* JADX INFO: renamed from: r */
    public final void m1935r(int i2) {
        this.f2561d[i2] = m1932o();
    }

    /* JADX INFO: renamed from: s */
    public final void m1936s(int i2) {
        if (this.f2563f) {
            throw new AssertionError("FlatBuffers: object serialization must not be nested.");
        }
        int[] iArr = this.f2561d;
        if (iArr == null || iArr.length < i2) {
            this.f2561d = new int[i2];
        }
        this.f2562e = i2;
        Arrays.fill(this.f2561d, 0, i2, 0);
        this.f2563f = true;
        this.f2565h = m1932o();
    }

    /* JADX INFO: renamed from: t */
    public final void m1937t(int i2, int i3, int i4) {
        if (this.f2563f) {
            throw new AssertionError("FlatBuffers: object serialization must not be nested.");
        }
        this.f2568k = i3;
        int i5 = i2 * i3;
        m1933p(4, i5);
        m1933p(i4, i5);
        this.f2563f = true;
    }
}
