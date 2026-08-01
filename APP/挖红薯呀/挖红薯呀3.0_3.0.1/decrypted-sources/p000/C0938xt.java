package p000;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* JADX INFO: renamed from: xt */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0938xt {

    /* JADX INFO: renamed from: a */
    public ByteBuffer f7410a;

    /* JADX INFO: renamed from: b */
    public int f7411b;

    /* JADX INFO: renamed from: c */
    public int f7412c;

    /* JADX INFO: renamed from: d */
    public int[] f7413d;

    /* JADX INFO: renamed from: e */
    public int f7414e;

    /* JADX INFO: renamed from: f */
    public boolean f7415f;

    /* JADX INFO: renamed from: g */
    public boolean f7416g;

    /* JADX INFO: renamed from: h */
    public int f7417h;

    /* JADX INFO: renamed from: i */
    public int[] f7418i;

    /* JADX INFO: renamed from: j */
    public int f7419j;

    /* JADX INFO: renamed from: k */
    public int f7420k;

    /* JADX INFO: renamed from: l */
    public final C0496n2 f7421l;

    /* JADX INFO: renamed from: m */
    public final ya1 f7422m;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0938xt() {
        C0496n2 c0496n2 = C0496n2.f4125E;
        if (ya1.f7591a == null) {
            ya1.f7591a = new ab1();
        }
        ab1 ab1Var = ya1.f7591a;
        this.f7412c = 1;
        this.f7413d = null;
        this.f7414e = 0;
        this.f7415f = false;
        this.f7416g = false;
        this.f7418i = new int[16];
        this.f7419j = 0;
        this.f7420k = 0;
        this.f7421l = c0496n2;
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(1024).order(ByteOrder.LITTLE_ENDIAN);
        this.f7410a = byteBufferOrder;
        this.f7422m = ab1Var;
        this.f7411b = byteBufferOrder.capacity();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m5152a(int i, boolean z) {
        if (z) {
            m5167p(1, 0);
            ByteBuffer byteBuffer = this.f7410a;
            int i2 = this.f7411b - 1;
            this.f7411b = i2;
            byteBuffer.put(i2, z ? (byte) 1 : (byte) 0);
            m5168q(i);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final void m5153b(byte b) {
        m5167p(1, 0);
        ByteBuffer byteBuffer = this.f7410a;
        int i = this.f7411b - 1;
        this.f7411b = i;
        byteBuffer.put(i, b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final void m5154c(int i, byte b) {
        if (b != 0) {
            m5153b(b);
            m5168q(i);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final void m5155d(int i) {
        m5167p(4, 0);
        ByteBuffer byteBuffer = this.f7410a;
        int i2 = this.f7411b - 4;
        this.f7411b = i2;
        byteBuffer.putInt(i2, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final void m5156e(int i, int i2) {
        if (i2 != 0) {
            m5155d(i2);
            m5168q(i);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final void m5157f(long j) {
        m5167p(8, 0);
        ByteBuffer byteBuffer = this.f7410a;
        int i = this.f7411b - 8;
        this.f7411b = i;
        byteBuffer.putLong(i, j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final void m5158g(int i) {
        m5167p(4, 0);
        int iM5166o = (m5166o() - i) + 4;
        ByteBuffer byteBuffer = this.f7410a;
        int i2 = this.f7411b - 4;
        this.f7411b = i2;
        byteBuffer.putInt(i2, iM5166o);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public final void m5159h(int i, int i2) {
        if (i2 != 0) {
            m5158g(i2);
            m5168q(i);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public final void m5160i(short s) {
        m5167p(2, 0);
        ByteBuffer byteBuffer = this.f7410a;
        int i = this.f7411b - 2;
        this.f7411b = i;
        byteBuffer.putShort(i, s);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public final int m5161j(CharSequence charSequence) {
        char c;
        char c2;
        boolean z;
        int i;
        int i2;
        int i3;
        char cCharAt;
        ya1 ya1Var = this.f7422m;
        ((ab1) ya1Var).getClass();
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
                                throw new za1(i5, length2);
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
        m5153b((byte) 0);
        m5170s(1, i6, 1);
        ByteBuffer byteBuffer = this.f7410a;
        int i8 = this.f7411b - i6;
        this.f7411b = i8;
        byteBuffer.position(i8);
        ByteBuffer byteBuffer2 = this.f7410a;
        ((ab1) ya1Var).getClass();
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
                                    throw new za1(i4, length3);
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
                            throw new za1(i4 - 1, length3);
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
                                throw new za1(i4, length4);
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
        return m5164m();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public final int m5162k(int[] iArr) {
        if (this.f7415f) {
            throw new AssertionError("FlatBuffers: object serialization must not be nested.");
        }
        m5170s(4, iArr.length, 4);
        for (int length = iArr.length - 1; length >= 0; length--) {
            m5158g(iArr[length]);
        }
        return m5164m();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public final int m5163l() {
        int i;
        if (this.f7413d == null || !this.f7415f) {
            throw new AssertionError("FlatBuffers: endTable called without startTable");
        }
        m5155d(0);
        int iM5166o = m5166o();
        int i2 = this.f7414e - 1;
        while (i2 >= 0 && this.f7413d[i2] == 0) {
            i2--;
        }
        for (int i3 = i2; i3 >= 0; i3--) {
            int i4 = this.f7413d[i3];
            m5160i((short) (i4 != 0 ? iM5166o - i4 : 0));
        }
        m5160i((short) (iM5166o - this.f7417h));
        m5160i((short) ((i2 + 3) * 2));
        int i5 = 0;
        loop2: while (true) {
            if (i5 >= this.f7419j) {
                i = 0;
                break;
            }
            int iCapacity = this.f7410a.capacity() - this.f7418i[i5];
            int i6 = this.f7411b;
            short s = this.f7410a.getShort(iCapacity);
            if (s == this.f7410a.getShort(i6)) {
                for (int i7 = 2; i7 < s; i7 += 2) {
                    if (this.f7410a.getShort(iCapacity + i7) != this.f7410a.getShort(i6 + i7)) {
                        break;
                    }
                }
                i = this.f7418i[i5];
                break loop2;
            }
            i5++;
        }
        if (i != 0) {
            int iCapacity2 = this.f7410a.capacity() - iM5166o;
            this.f7411b = iCapacity2;
            this.f7410a.putInt(iCapacity2, i - iM5166o);
        } else {
            int i8 = this.f7419j;
            int[] iArr = this.f7418i;
            if (i8 == iArr.length) {
                this.f7418i = Arrays.copyOf(iArr, i8 * 2);
            }
            int[] iArr2 = this.f7418i;
            int i9 = this.f7419j;
            this.f7419j = i9 + 1;
            iArr2[i9] = m5166o();
            ByteBuffer byteBuffer = this.f7410a;
            byteBuffer.putInt(byteBuffer.capacity() - iM5166o, m5166o() - iM5166o);
        }
        this.f7415f = false;
        return iM5166o;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public final int m5164m() {
        if (!this.f7415f) {
            throw new AssertionError("FlatBuffers: endVector called without startVector");
        }
        this.f7415f = false;
        int i = this.f7420k;
        ByteBuffer byteBuffer = this.f7410a;
        int i2 = this.f7411b - 4;
        this.f7411b = i2;
        byteBuffer.putInt(i2, i);
        return m5166o();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public final void m5165n(int i) {
        m5167p(this.f7412c, 4);
        m5158g(i);
        this.f7410a.position(this.f7411b);
        this.f7416g = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public final int m5166o() {
        return this.f7410a.capacity() - this.f7411b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public final void m5167p(int i, int i2) {
        int i3;
        if (i > this.f7412c) {
            this.f7412c = i;
        }
        int i4 = ((~((this.f7410a.capacity() - this.f7411b) + i2)) + 1) & (i - 1);
        while (this.f7411b < i4 + i + i2) {
            int iCapacity = this.f7410a.capacity();
            ByteBuffer byteBuffer = this.f7410a;
            int iCapacity2 = byteBuffer.capacity();
            if (iCapacity2 == 0) {
                i3 = 1024;
            } else {
                i3 = 2147483639;
                if (iCapacity2 == 2147483639) {
                    throw new AssertionError("FlatBuffers: cannot grow buffer beyond 2 gigabytes.");
                }
                if (((-1073741824) & iCapacity2) == 0) {
                    i3 = iCapacity2 << 1;
                }
            }
            byteBuffer.position(0);
            this.f7421l.getClass();
            ByteBuffer byteBufferOrder = ByteBuffer.allocate(i3).order(ByteOrder.LITTLE_ENDIAN);
            byteBufferOrder.position(byteBufferOrder.clear().capacity() - iCapacity2);
            byteBufferOrder.put(byteBuffer);
            this.f7410a = byteBufferOrder;
            this.f7411b = (byteBufferOrder.capacity() - iCapacity) + this.f7411b;
        }
        for (int i5 = 0; i5 < i4; i5++) {
            ByteBuffer byteBuffer2 = this.f7410a;
            int i6 = this.f7411b - 1;
            this.f7411b = i6;
            byteBuffer2.put(i6, (byte) 0);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public final void m5168q(int i) {
        this.f7413d[i] = m5166o();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r */
    public final void m5169r(int i) {
        if (this.f7415f) {
            throw new AssertionError("FlatBuffers: object serialization must not be nested.");
        }
        int[] iArr = this.f7413d;
        if (iArr == null || iArr.length < i) {
            this.f7413d = new int[i];
        }
        this.f7414e = i;
        Arrays.fill(this.f7413d, 0, i, 0);
        this.f7415f = true;
        this.f7417h = m5166o();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s */
    public final void m5170s(int i, int i2, int i3) {
        if (this.f7415f) {
            throw new AssertionError("FlatBuffers: object serialization must not be nested.");
        }
        this.f7420k = i2;
        int i4 = i * i2;
        m5167p(4, i4);
        m5167p(i3, i4);
        this.f7415f = true;
    }
}
