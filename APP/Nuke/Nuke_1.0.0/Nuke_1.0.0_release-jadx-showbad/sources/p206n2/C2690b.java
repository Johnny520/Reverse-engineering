package p206n2;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* JADX INFO: renamed from: n2.b */
/* JADX INFO: loaded from: classes.dex */
public final class C2690b {

    /* JADX INFO: renamed from: a */
    public ByteBuffer f8578a;

    /* JADX INFO: renamed from: b */
    public int f8579b;

    /* JADX INFO: renamed from: c */
    public int f8580c;

    /* JADX INFO: renamed from: d */
    public int[] f8581d;

    /* JADX INFO: renamed from: e */
    public int f8582e;

    /* JADX INFO: renamed from: f */
    public boolean f8583f;

    /* JADX INFO: renamed from: g */
    public boolean f8584g;

    /* JADX INFO: renamed from: h */
    public int f8585h;

    /* JADX INFO: renamed from: i */
    public int[] f8586i;

    /* JADX INFO: renamed from: j */
    public int f8587j;

    /* JADX INFO: renamed from: k */
    public int f8588k;

    /* JADX INFO: renamed from: l */
    public final C2689a f8589l;

    /* JADX INFO: renamed from: m */
    public final C2689a f8590m;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2690b() {
        C2689a c2689aM4670a = C2689a.m4670a();
        this.f8580c = 1;
        this.f8581d = null;
        this.f8582e = 0;
        this.f8583f = false;
        this.f8584g = false;
        this.f8586i = new int[16];
        this.f8587j = 0;
        this.f8588k = 0;
        this.f8589l = C2689a.f8576a;
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(1024).order(ByteOrder.LITTLE_ENDIAN);
        this.f8578a = byteBufferOrder;
        this.f8590m = c2689aM4670a;
        this.f8579b = byteBufferOrder.capacity();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m4671a(byte b2) {
        m4680j(1, 0);
        ByteBuffer byteBuffer = this.f8578a;
        int i5 = this.f8579b - 1;
        this.f8579b = i5;
        byteBuffer.put(i5, b2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final void m4672b(int i5) {
        m4680j(4, 0);
        int iM4679i = (m4679i() - i5) + 4;
        ByteBuffer byteBuffer = this.f8578a;
        int i6 = this.f8579b - 4;
        this.f8579b = i6;
        byteBuffer.putInt(i6, iM4679i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final void m4673c(int i5, int i6) {
        if (i6 != 0) {
            m4672b(i6);
            m4681k(i5);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final void m4674d(short s5) {
        m4680j(2, 0);
        ByteBuffer byteBuffer = this.f8578a;
        int i5 = this.f8579b - 2;
        this.f8579b = i5;
        byteBuffer.putShort(i5, s5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final int m4675e(CharSequence charSequence) {
        char c5;
        char c6;
        boolean z5;
        int i5;
        int i6;
        int i7;
        char cCharAt;
        C2689a c2689a = this.f8590m;
        c2689a.getClass();
        int length = charSequence.length();
        int i8 = 0;
        int i9 = 0;
        while (i9 < length && charSequence.charAt(i9) < 128) {
            i9++;
        }
        int i10 = length;
        while (true) {
            c5 = 55296;
            c6 = 2048;
            z5 = true;
            if (i9 >= length) {
                break;
            }
            char cCharAt2 = charSequence.charAt(i9);
            if (cCharAt2 < 2048) {
                i10 += (127 - cCharAt2) >>> 31;
                i9++;
            } else {
                int length2 = charSequence.length();
                int i11 = 0;
                while (i9 < length2) {
                    char cCharAt3 = charSequence.charAt(i9);
                    if (cCharAt3 < 2048) {
                        i11 += (127 - cCharAt3) >>> 31;
                    } else {
                        i11 += 2;
                        if (55296 <= cCharAt3 && cCharAt3 <= 57343) {
                            if (Character.codePointAt(charSequence, i9) < 65536) {
                                throw new C2692d(i9, length2);
                            }
                            i9++;
                        }
                    }
                    i9++;
                }
                i10 += i11;
            }
        }
        if (i10 < length) {
            throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (((long) i10) + 4294967296L));
        }
        m4671a((byte) 0);
        m4683m(1, i10, 1);
        ByteBuffer byteBuffer = this.f8578a;
        int i12 = this.f8579b - i10;
        this.f8579b = i12;
        byteBuffer.position(i12);
        ByteBuffer byteBuffer2 = this.f8578a;
        c2689a.getClass();
        if (byteBuffer2.hasArray()) {
            int iArrayOffset = byteBuffer2.arrayOffset();
            byte[] bArrArray = byteBuffer2.array();
            int iPosition = byteBuffer2.position() + iArrayOffset;
            int iRemaining = byteBuffer2.remaining();
            int length3 = charSequence.length();
            int i13 = iRemaining + iPosition;
            while (true) {
                boolean z6 = z5;
                if (i8 >= length3 || (i7 = i8 + iPosition) >= i13 || (cCharAt = charSequence.charAt(i8)) >= 128) {
                    break;
                }
                bArrArray[i7] = (byte) cCharAt;
                i8++;
                z5 = z6;
            }
            if (i8 == length3) {
                i5 = iPosition + length3;
            } else {
                i5 = iPosition + i8;
                while (i8 < length3) {
                    char cCharAt4 = charSequence.charAt(i8);
                    if (cCharAt4 < 128 && i5 < i13) {
                        bArrArray[i5] = (byte) cCharAt4;
                        i5++;
                    } else if (cCharAt4 < c6 && i5 <= i13 - 2) {
                        int i14 = i5 + 1;
                        bArrArray[i5] = (byte) ((cCharAt4 >>> 6) | 960);
                        i5 += 2;
                        bArrArray[i14] = (byte) ((cCharAt4 & '?') | 128);
                    } else {
                        if ((cCharAt4 >= c5 && 57343 >= cCharAt4) || i5 > i13 - 3) {
                            if (i5 > i13 - 4) {
                                if (55296 <= cCharAt4 && cCharAt4 <= 57343 && ((i6 = i8 + 1) == charSequence.length() || !Character.isSurrogatePair(cCharAt4, charSequence.charAt(i6)))) {
                                    throw new C2692d(i8, length3);
                                }
                                throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt4 + " at index " + i5);
                            }
                            int i15 = i8 + 1;
                            if (i15 != charSequence.length()) {
                                char cCharAt5 = charSequence.charAt(i15);
                                if (Character.isSurrogatePair(cCharAt4, cCharAt5)) {
                                    int codePoint = Character.toCodePoint(cCharAt4, cCharAt5);
                                    bArrArray[i5] = (byte) ((codePoint >>> 18) | 240);
                                    bArrArray[i5 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                                    int i16 = i5 + 3;
                                    bArrArray[i5 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                                    i5 += 4;
                                    bArrArray[i16] = (byte) ((codePoint & 63) | 128);
                                    i8 = i15;
                                } else {
                                    i8 = i15;
                                }
                            }
                            throw new C2692d(i8 - 1, length3);
                        }
                        bArrArray[i5] = (byte) ((cCharAt4 >>> '\f') | 480);
                        int i17 = i5 + 2;
                        bArrArray[i5 + 1] = (byte) (((cCharAt4 >>> 6) & 63) | 128);
                        i5 += 3;
                        bArrArray[i17] = (byte) ((cCharAt4 & '?') | 128);
                    }
                    i8++;
                    c5 = 55296;
                    c6 = 2048;
                }
            }
            byteBuffer2.position(i5 - iArrayOffset);
        } else {
            int length4 = charSequence.length();
            int iPosition2 = byteBuffer2.position();
            while (i8 < length4) {
                try {
                    char cCharAt6 = charSequence.charAt(i8);
                    if (cCharAt6 >= 128) {
                        break;
                    }
                    byteBuffer2.put(iPosition2 + i8, (byte) cCharAt6);
                    i8++;
                } catch (IndexOutOfBoundsException unused) {
                }
            }
            if (i8 == length4) {
                byteBuffer2.position(iPosition2 + i8);
            } else {
                iPosition2 += i8;
                while (i8 < length4) {
                    char cCharAt7 = charSequence.charAt(i8);
                    if (cCharAt7 >= 128) {
                        if (cCharAt7 < 2048) {
                            int i18 = iPosition2 + 1;
                            try {
                                byteBuffer2.put(iPosition2, (byte) ((cCharAt7 >>> 6) | 192));
                                byteBuffer2.put(i18, (byte) ((cCharAt7 & '?') | 128));
                                iPosition2 = i18;
                            } catch (IndexOutOfBoundsException unused2) {
                                iPosition2 = i18;
                            }
                        } else {
                            if (cCharAt7 >= 55296 && 57343 >= cCharAt7) {
                                int i19 = i8 + 1;
                                if (i19 != length4) {
                                    try {
                                        char cCharAt8 = charSequence.charAt(i19);
                                        if (Character.isSurrogatePair(cCharAt7, cCharAt8)) {
                                            int codePoint2 = Character.toCodePoint(cCharAt7, cCharAt8);
                                            int i20 = iPosition2 + 1;
                                            try {
                                                byteBuffer2.put(iPosition2, (byte) ((codePoint2 >>> 18) | 240));
                                                int i21 = iPosition2 + 2;
                                                try {
                                                    byteBuffer2.put(i20, (byte) (((codePoint2 >>> 12) & 63) | 128));
                                                    iPosition2 += 3;
                                                    byteBuffer2.put(i21, (byte) (((codePoint2 >>> 6) & 63) | 128));
                                                    byteBuffer2.put(iPosition2, (byte) ((codePoint2 & 63) | 128));
                                                    i8 = i19;
                                                    i8++;
                                                    iPosition2++;
                                                } catch (IndexOutOfBoundsException unused3) {
                                                    i8 = i19;
                                                    iPosition2 = i21;
                                                }
                                            } catch (IndexOutOfBoundsException unused4) {
                                                iPosition2 = i20;
                                                i8 = i19;
                                            }
                                        } else {
                                            i8 = i19;
                                        }
                                    } catch (IndexOutOfBoundsException unused5) {
                                    }
                                }
                                throw new C2692d(i8, length4);
                            }
                            int i22 = iPosition2 + 1;
                            try {
                                byteBuffer2.put(iPosition2, (byte) ((cCharAt7 >>> '\f') | 224));
                                iPosition2 += 2;
                                byteBuffer2.put(i22, (byte) (((cCharAt7 >>> 6) & 63) | 128));
                                byteBuffer2.put(iPosition2, (byte) ((cCharAt7 & '?') | 128));
                                i8++;
                                iPosition2++;
                            } catch (IndexOutOfBoundsException unused6) {
                                iPosition2 = i22;
                            }
                        }
                        throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(i8) + " at index " + (Math.max(i8, (iPosition2 - byteBuffer2.position()) + 1) + byteBuffer2.position()));
                    }
                    byteBuffer2.put(iPosition2, (byte) cCharAt7);
                    i8++;
                    iPosition2++;
                }
                byteBuffer2.position(iPosition2);
            }
        }
        return m4677g();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final int m4676f() {
        int i5;
        if (this.f8581d == null || !this.f8583f) {
            throw new AssertionError("FlatBuffers: endTable called without startTable");
        }
        m4680j(4, 0);
        ByteBuffer byteBuffer = this.f8578a;
        int i6 = this.f8579b - 4;
        this.f8579b = i6;
        byteBuffer.putInt(i6, 0);
        int iM4679i = m4679i();
        int i7 = this.f8582e - 1;
        while (i7 >= 0 && this.f8581d[i7] == 0) {
            i7--;
        }
        for (int i8 = i7; i8 >= 0; i8--) {
            int i9 = this.f8581d[i8];
            m4674d((short) (i9 != 0 ? iM4679i - i9 : 0));
        }
        m4674d((short) (iM4679i - this.f8585h));
        m4674d((short) ((i7 + 3) * 2));
        int i10 = 0;
        loop2: while (true) {
            if (i10 >= this.f8587j) {
                i5 = 0;
                break;
            }
            int iCapacity = this.f8578a.capacity() - this.f8586i[i10];
            int i11 = this.f8579b;
            short s5 = this.f8578a.getShort(iCapacity);
            if (s5 == this.f8578a.getShort(i11)) {
                for (int i12 = 2; i12 < s5; i12 += 2) {
                    if (this.f8578a.getShort(iCapacity + i12) != this.f8578a.getShort(i11 + i12)) {
                        break;
                    }
                }
                i5 = this.f8586i[i10];
                break loop2;
            }
            i10++;
        }
        if (i5 != 0) {
            int iCapacity2 = this.f8578a.capacity() - iM4679i;
            this.f8579b = iCapacity2;
            this.f8578a.putInt(iCapacity2, i5 - iM4679i);
        } else {
            int i13 = this.f8587j;
            int[] iArr = this.f8586i;
            if (i13 == iArr.length) {
                this.f8586i = Arrays.copyOf(iArr, i13 * 2);
            }
            int[] iArr2 = this.f8586i;
            int i14 = this.f8587j;
            this.f8587j = i14 + 1;
            iArr2[i14] = m4679i();
            ByteBuffer byteBuffer2 = this.f8578a;
            byteBuffer2.putInt(byteBuffer2.capacity() - iM4679i, m4679i() - iM4679i);
        }
        this.f8583f = false;
        return iM4679i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final int m4677g() {
        if (!this.f8583f) {
            throw new AssertionError("FlatBuffers: endVector called without startVector");
        }
        this.f8583f = false;
        int i5 = this.f8588k;
        ByteBuffer byteBuffer = this.f8578a;
        int i6 = this.f8579b - 4;
        this.f8579b = i6;
        byteBuffer.putInt(i6, i5);
        return m4679i();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public final void m4678h(int i5) {
        m4680j(this.f8580c, 4);
        m4672b(i5);
        this.f8578a.position(this.f8579b);
        this.f8584g = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public final int m4679i() {
        return this.f8578a.capacity() - this.f8579b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public final void m4680j(int i5, int i6) {
        int i7;
        if (i5 > this.f8580c) {
            this.f8580c = i5;
        }
        int i8 = ((~((this.f8578a.capacity() - this.f8579b) + i6)) + 1) & (i5 - 1);
        while (this.f8579b < i8 + i5 + i6) {
            int iCapacity = this.f8578a.capacity();
            ByteBuffer byteBuffer = this.f8578a;
            int iCapacity2 = byteBuffer.capacity();
            if (iCapacity2 == 0) {
                i7 = 1024;
            } else {
                i7 = 2147483639;
                if (iCapacity2 == 2147483639) {
                    throw new AssertionError("FlatBuffers: cannot grow buffer beyond 2 gigabytes.");
                }
                if (((-1073741824) & iCapacity2) == 0) {
                    i7 = iCapacity2 << 1;
                }
            }
            byteBuffer.position(0);
            this.f8589l.getClass();
            ByteBuffer byteBufferOrder = ByteBuffer.allocate(i7).order(ByteOrder.LITTLE_ENDIAN);
            byteBufferOrder.position(byteBufferOrder.clear().capacity() - iCapacity2);
            byteBufferOrder.put(byteBuffer);
            this.f8578a = byteBufferOrder;
            this.f8579b = (byteBufferOrder.capacity() - iCapacity) + this.f8579b;
        }
        for (int i9 = 0; i9 < i8; i9++) {
            ByteBuffer byteBuffer2 = this.f8578a;
            int i10 = this.f8579b - 1;
            this.f8579b = i10;
            byteBuffer2.put(i10, (byte) 0);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public final void m4681k(int i5) {
        this.f8581d[i5] = m4679i();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public final void m4682l(int i5) {
        if (this.f8583f) {
            throw new AssertionError("FlatBuffers: object serialization must not be nested.");
        }
        int[] iArr = this.f8581d;
        if (iArr == null || iArr.length < i5) {
            this.f8581d = new int[i5];
        }
        this.f8582e = i5;
        Arrays.fill(this.f8581d, 0, i5, 0);
        this.f8583f = true;
        this.f8585h = m4679i();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public final void m4683m(int i5, int i6, int i7) {
        if (this.f8583f) {
            throw new AssertionError("FlatBuffers: object serialization must not be nested.");
        }
        this.f8588k = i6;
        int i8 = i5 * i6;
        m4680j(4, i8);
        m4680j(i7, i8);
        this.f8583f = true;
    }
}
