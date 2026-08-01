package p035S;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* JADX INFO: renamed from: S.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0246b {

    /* JADX INFO: renamed from: a */
    public ByteBuffer f593a;

    /* JADX INFO: renamed from: b */
    public int f594b;

    /* JADX INFO: renamed from: c */
    public int f595c;

    /* JADX INFO: renamed from: d */
    public int[] f596d;

    /* JADX INFO: renamed from: e */
    public int f597e;

    /* JADX INFO: renamed from: f */
    public boolean f598f;

    /* JADX INFO: renamed from: g */
    public boolean f599g;

    /* JADX INFO: renamed from: h */
    public int f600h;

    /* JADX INFO: renamed from: i */
    public int[] f601i;

    /* JADX INFO: renamed from: j */
    public int f602j;

    /* JADX INFO: renamed from: k */
    public int f603k;

    /* JADX INFO: renamed from: l */
    public final C0245a f604l;

    /* JADX INFO: renamed from: m */
    public final C0245a f605m;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0246b() {
        C0245a c0245a = C0245a.f591a;
        C0245a c0245aM460a = C0245a.m460a();
        this.f595c = 1;
        this.f596d = null;
        this.f597e = 0;
        this.f598f = false;
        this.f599g = false;
        this.f601i = new int[16];
        this.f602j = 0;
        this.f603k = 0;
        this.f604l = c0245a;
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(1024).order(ByteOrder.LITTLE_ENDIAN);
        this.f593a = byteBufferOrder;
        this.f605m = c0245aM460a;
        this.f594b = byteBufferOrder.capacity();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m461a(int i2, int i3) {
        if (i3 != 0) {
            m468h(4, 0);
            int iM467g = (m467g() - i3) + 4;
            ByteBuffer byteBuffer = this.f593a;
            int i4 = this.f594b - 4;
            this.f594b = i4;
            byteBuffer.putInt(i4, iM467g);
            this.f596d[i2] = m467g();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final void m462b(short s2) {
        m468h(2, 0);
        ByteBuffer byteBuffer = this.f593a;
        int i2 = this.f594b - 2;
        this.f594b = i2;
        byteBuffer.putShort(i2, s2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final int m463c(CharSequence charSequence) {
        char c2;
        char c3;
        int i2;
        int i3;
        char cCharAt;
        this.f605m.getClass();
        int length = charSequence.length();
        int i4 = 0;
        while (i4 < length && charSequence.charAt(i4) < 128) {
            i4++;
        }
        int i5 = length;
        while (true) {
            c2 = 55296;
            c3 = 2048;
            if (i4 >= length) {
                break;
            }
            char cCharAt2 = charSequence.charAt(i4);
            if (cCharAt2 < 2048) {
                i5 += (127 - cCharAt2) >>> 31;
                i4++;
            } else {
                int length2 = charSequence.length();
                int i6 = 0;
                while (i4 < length2) {
                    char cCharAt3 = charSequence.charAt(i4);
                    if (cCharAt3 < 2048) {
                        i6 += (127 - cCharAt3) >>> 31;
                    } else {
                        i6 += 2;
                        if (55296 <= cCharAt3 && cCharAt3 <= 57343) {
                            if (Character.codePointAt(charSequence, i4) < 65536) {
                                throw new C0247c(i4, length2);
                            }
                            i4++;
                        }
                    }
                    i4++;
                }
                i5 += i6;
            }
        }
        if (i5 < length) {
            throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (((long) i5) + 4294967296L));
        }
        m468h(1, 0);
        ByteBuffer byteBuffer = this.f593a;
        int i7 = this.f594b - 1;
        this.f594b = i7;
        byteBuffer.put(i7, (byte) 0);
        if (this.f598f) {
            throw new AssertionError("FlatBuffers: object serialization must not be nested.");
        }
        this.f603k = i5;
        m468h(4, i5);
        m468h(1, i5);
        this.f598f = true;
        ByteBuffer byteBuffer2 = this.f593a;
        int i8 = this.f594b - i5;
        this.f594b = i8;
        byteBuffer2.position(i8);
        ByteBuffer byteBuffer3 = this.f593a;
        if (byteBuffer3.hasArray()) {
            int iArrayOffset = byteBuffer3.arrayOffset();
            byte[] bArrArray = byteBuffer3.array();
            int iPosition = byteBuffer3.position() + iArrayOffset;
            int iRemaining = byteBuffer3.remaining();
            int length3 = charSequence.length();
            int i9 = iRemaining + iPosition;
            int i10 = 0;
            while (i10 < length3) {
                int i11 = i10 + iPosition;
                if (i11 >= i9 || (cCharAt = charSequence.charAt(i10)) >= 128) {
                    break;
                }
                bArrArray[i11] = (byte) cCharAt;
                i10++;
            }
            if (i10 == length3) {
                i2 = iPosition + length3;
            } else {
                i2 = iPosition + i10;
                while (i10 < length3) {
                    char cCharAt4 = charSequence.charAt(i10);
                    if (cCharAt4 < 128 && i2 < i9) {
                        bArrArray[i2] = (byte) cCharAt4;
                        i2++;
                    } else if (cCharAt4 < c3 && i2 <= i9 - 2) {
                        int i12 = i2 + 1;
                        bArrArray[i2] = (byte) ((cCharAt4 >>> 6) | 960);
                        i2 += 2;
                        bArrArray[i12] = (byte) ((cCharAt4 & '?') | 128);
                    } else {
                        if ((cCharAt4 >= c2 && 57343 >= cCharAt4) || i2 > i9 - 3) {
                            if (i2 > i9 - 4) {
                                if (55296 <= cCharAt4 && cCharAt4 <= 57343 && ((i3 = i10 + 1) == charSequence.length() || !Character.isSurrogatePair(cCharAt4, charSequence.charAt(i3)))) {
                                    throw new C0247c(i10, length3);
                                }
                                throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt4 + " at index " + i2);
                            }
                            int i13 = i10 + 1;
                            if (i13 != charSequence.length()) {
                                char cCharAt5 = charSequence.charAt(i13);
                                if (Character.isSurrogatePair(cCharAt4, cCharAt5)) {
                                    int codePoint = Character.toCodePoint(cCharAt4, cCharAt5);
                                    bArrArray[i2] = (byte) ((codePoint >>> 18) | 240);
                                    bArrArray[i2 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                                    int i14 = i2 + 3;
                                    bArrArray[i2 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                                    i2 += 4;
                                    bArrArray[i14] = (byte) ((codePoint & 63) | 128);
                                    i10 = i13;
                                } else {
                                    i10 = i13;
                                }
                            }
                            throw new C0247c(i10 - 1, length3);
                        }
                        bArrArray[i2] = (byte) ((cCharAt4 >>> '\f') | 480);
                        int i15 = i2 + 2;
                        bArrArray[i2 + 1] = (byte) (((cCharAt4 >>> 6) & 63) | 128);
                        i2 += 3;
                        bArrArray[i15] = (byte) ((cCharAt4 & '?') | 128);
                    }
                    i10++;
                    c2 = 55296;
                    c3 = 2048;
                }
            }
            byteBuffer3.position(i2 - iArrayOffset);
        } else {
            int length4 = charSequence.length();
            int iPosition2 = byteBuffer3.position();
            int i16 = 0;
            while (i16 < length4) {
                try {
                    char cCharAt6 = charSequence.charAt(i16);
                    if (cCharAt6 >= 128) {
                        break;
                    }
                    byteBuffer3.put(iPosition2 + i16, (byte) cCharAt6);
                    i16++;
                } catch (IndexOutOfBoundsException unused) {
                }
            }
            if (i16 == length4) {
                byteBuffer3.position(iPosition2 + i16);
            } else {
                iPosition2 += i16;
                while (i16 < length4) {
                    char cCharAt7 = charSequence.charAt(i16);
                    if (cCharAt7 >= 128) {
                        if (cCharAt7 < 2048) {
                            int i17 = iPosition2 + 1;
                            try {
                                byteBuffer3.put(iPosition2, (byte) ((cCharAt7 >>> 6) | 192));
                                byteBuffer3.put(i17, (byte) ((cCharAt7 & '?') | 128));
                                iPosition2 = i17;
                            } catch (IndexOutOfBoundsException unused2) {
                                iPosition2 = i17;
                            }
                        } else {
                            if (cCharAt7 >= 55296 && 57343 >= cCharAt7) {
                                int i18 = i16 + 1;
                                if (i18 != length4) {
                                    try {
                                        char cCharAt8 = charSequence.charAt(i18);
                                        if (Character.isSurrogatePair(cCharAt7, cCharAt8)) {
                                            int codePoint2 = Character.toCodePoint(cCharAt7, cCharAt8);
                                            int i19 = iPosition2 + 1;
                                            try {
                                                byteBuffer3.put(iPosition2, (byte) ((codePoint2 >>> 18) | 240));
                                                int i20 = iPosition2 + 2;
                                                try {
                                                    byteBuffer3.put(i19, (byte) (((codePoint2 >>> 12) & 63) | 128));
                                                    iPosition2 += 3;
                                                    byteBuffer3.put(i20, (byte) (((codePoint2 >>> 6) & 63) | 128));
                                                    byteBuffer3.put(iPosition2, (byte) ((codePoint2 & 63) | 128));
                                                    i16 = i18;
                                                    i16++;
                                                    iPosition2++;
                                                } catch (IndexOutOfBoundsException unused3) {
                                                    i16 = i18;
                                                    iPosition2 = i20;
                                                }
                                            } catch (IndexOutOfBoundsException unused4) {
                                                iPosition2 = i19;
                                                i16 = i18;
                                            }
                                        } else {
                                            i16 = i18;
                                        }
                                    } catch (IndexOutOfBoundsException unused5) {
                                    }
                                }
                                throw new C0247c(i16, length4);
                            }
                            int i21 = iPosition2 + 1;
                            try {
                                byteBuffer3.put(iPosition2, (byte) ((cCharAt7 >>> '\f') | 224));
                                iPosition2 += 2;
                                byteBuffer3.put(i21, (byte) (((cCharAt7 >>> 6) & 63) | 128));
                                byteBuffer3.put(iPosition2, (byte) ((cCharAt7 & '?') | 128));
                                i16++;
                                iPosition2++;
                            } catch (IndexOutOfBoundsException unused6) {
                                iPosition2 = i21;
                            }
                        }
                        throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(i16) + " at index " + (Math.max(i16, (iPosition2 - byteBuffer3.position()) + 1) + byteBuffer3.position()));
                    }
                    byteBuffer3.put(iPosition2, (byte) cCharAt7);
                    i16++;
                    iPosition2++;
                }
                byteBuffer3.position(iPosition2);
            }
        }
        if (!this.f598f) {
            throw new AssertionError("FlatBuffers: endVector called without startVector");
        }
        this.f598f = false;
        int i22 = this.f603k;
        ByteBuffer byteBuffer4 = this.f593a;
        int i23 = this.f594b - 4;
        this.f594b = i23;
        byteBuffer4.putInt(i23, i22);
        return m467g();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final int m464d(int[] iArr) {
        boolean z2 = this.f598f;
        if (z2) {
            throw new AssertionError("FlatBuffers: object serialization must not be nested.");
        }
        int length = iArr.length;
        if (z2) {
            throw new AssertionError("FlatBuffers: object serialization must not be nested.");
        }
        this.f603k = length;
        int i2 = length * 4;
        m468h(4, i2);
        m468h(4, i2);
        this.f598f = true;
        for (int length2 = iArr.length - 1; length2 >= 0; length2--) {
            int i3 = iArr[length2];
            m468h(4, 0);
            int iM467g = (m467g() - i3) + 4;
            ByteBuffer byteBuffer = this.f593a;
            int i4 = this.f594b - 4;
            this.f594b = i4;
            byteBuffer.putInt(i4, iM467g);
        }
        if (!this.f598f) {
            throw new AssertionError("FlatBuffers: endVector called without startVector");
        }
        this.f598f = false;
        int i5 = this.f603k;
        ByteBuffer byteBuffer2 = this.f593a;
        int i6 = this.f594b - 4;
        this.f594b = i6;
        byteBuffer2.putInt(i6, i5);
        return m467g();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final int m465e() {
        int i2;
        if (this.f596d == null || !this.f598f) {
            throw new AssertionError("FlatBuffers: endTable called without startTable");
        }
        m468h(4, 0);
        ByteBuffer byteBuffer = this.f593a;
        int i3 = this.f594b - 4;
        this.f594b = i3;
        byteBuffer.putInt(i3, 0);
        int iM467g = m467g();
        int i4 = this.f597e - 1;
        while (i4 >= 0 && this.f596d[i4] == 0) {
            i4--;
        }
        for (int i5 = i4; i5 >= 0; i5--) {
            int i6 = this.f596d[i5];
            m462b((short) (i6 != 0 ? iM467g - i6 : 0));
        }
        m462b((short) (iM467g - this.f600h));
        m462b((short) ((i4 + 3) * 2));
        int i7 = 0;
        loop2: while (true) {
            if (i7 >= this.f602j) {
                i2 = 0;
                break;
            }
            int iCapacity = this.f593a.capacity() - this.f601i[i7];
            int i8 = this.f594b;
            short s2 = this.f593a.getShort(iCapacity);
            if (s2 == this.f593a.getShort(i8)) {
                for (int i9 = 2; i9 < s2; i9 += 2) {
                    if (this.f593a.getShort(iCapacity + i9) != this.f593a.getShort(i8 + i9)) {
                        break;
                    }
                }
                i2 = this.f601i[i7];
                break loop2;
            }
            i7++;
        }
        if (i2 != 0) {
            int iCapacity2 = this.f593a.capacity() - iM467g;
            this.f594b = iCapacity2;
            this.f593a.putInt(iCapacity2, i2 - iM467g);
        } else {
            int i10 = this.f602j;
            int[] iArr = this.f601i;
            if (i10 == iArr.length) {
                this.f601i = Arrays.copyOf(iArr, i10 * 2);
            }
            int[] iArr2 = this.f601i;
            int i11 = this.f602j;
            this.f602j = i11 + 1;
            iArr2[i11] = m467g();
            ByteBuffer byteBuffer2 = this.f593a;
            byteBuffer2.putInt(byteBuffer2.capacity() - iM467g, m467g() - iM467g);
        }
        this.f598f = false;
        return iM467g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final void m466f(int i2) {
        m468h(this.f595c, 4);
        m468h(4, 0);
        int iM467g = (m467g() - i2) + 4;
        ByteBuffer byteBuffer = this.f593a;
        int i3 = this.f594b - 4;
        this.f594b = i3;
        byteBuffer.putInt(i3, iM467g);
        this.f593a.position(this.f594b);
        this.f599g = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final int m467g() {
        return this.f593a.capacity() - this.f594b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public final void m468h(int i2, int i3) {
        int i4;
        if (i2 > this.f595c) {
            this.f595c = i2;
        }
        int i5 = ((~((this.f593a.capacity() - this.f594b) + i3)) + 1) & (i2 - 1);
        while (this.f594b < i5 + i2 + i3) {
            int iCapacity = this.f593a.capacity();
            ByteBuffer byteBuffer = this.f593a;
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
            this.f604l.getClass();
            ByteBuffer byteBufferOrder = ByteBuffer.allocate(i4).order(ByteOrder.LITTLE_ENDIAN);
            byteBufferOrder.position(byteBufferOrder.clear().capacity() - iCapacity2);
            byteBufferOrder.put(byteBuffer);
            this.f593a = byteBufferOrder;
            this.f594b = (byteBufferOrder.capacity() - iCapacity) + this.f594b;
        }
        for (int i6 = 0; i6 < i5; i6++) {
            ByteBuffer byteBuffer2 = this.f593a;
            int i7 = this.f594b - 1;
            this.f594b = i7;
            byteBuffer2.put(i7, (byte) 0);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public final byte[] m469i() {
        int i2 = this.f594b;
        int iCapacity = this.f593a.capacity() - this.f594b;
        if (!this.f599g) {
            throw new AssertionError("FlatBuffers: you can only access the serialized buffer after it has been finished by FlatBufferBuilder.finish().");
        }
        byte[] bArr = new byte[iCapacity];
        this.f593a.position(i2);
        this.f593a.get(bArr);
        return bArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public final void m470j(int i2) {
        if (this.f598f) {
            throw new AssertionError("FlatBuffers: object serialization must not be nested.");
        }
        int[] iArr = this.f596d;
        if (iArr == null || iArr.length < i2) {
            this.f596d = new int[i2];
        }
        this.f597e = i2;
        Arrays.fill(this.f596d, 0, i2, 0);
        this.f598f = true;
        this.f600h = m467g();
    }
}
