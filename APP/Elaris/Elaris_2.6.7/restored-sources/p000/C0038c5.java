package p000;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* JADX INFO: renamed from: c5 */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class C0038c5 {

    /* JADX INFO: renamed from: a */
    public ByteBuffer f86a;

    /* JADX INFO: renamed from: b */
    public int f87b;

    /* JADX INFO: renamed from: c */
    public int f88c;

    /* JADX INFO: renamed from: d */
    public int[] f89d;

    /* JADX INFO: renamed from: e */
    public int f90e;

    /* JADX INFO: renamed from: f */
    public boolean f91f;

    /* JADX INFO: renamed from: g */
    public boolean f92g;

    /* JADX INFO: renamed from: h */
    public int f93h;

    /* JADX INFO: renamed from: i */
    public int[] f94i;

    /* JADX INFO: renamed from: j */
    public int f95j;

    /* JADX INFO: renamed from: k */
    public int f96k;

    /* JADX INFO: renamed from: l */
    public final C0022b5 f97l;

    /* JADX INFO: renamed from: m */
    public final AbstractC0570zd f98m;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0038c5() {
        C0022b5 c0022b5 = C0022b5.f58b;
        if (AbstractC0570zd.f1165a == null) {
            AbstractC0570zd.f1165a = new C0031be();
        }
        C0031be c0031be = AbstractC0570zd.f1165a;
        this.f88c = 1;
        this.f89d = null;
        this.f90e = 0;
        this.f91f = false;
        this.f92g = false;
        this.f94i = new int[16];
        this.f95j = 0;
        this.f96k = 0;
        this.f97l = c0022b5;
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(1024).order(ByteOrder.LITTLE_ENDIAN);
        this.f86a = byteBufferOrder;
        this.f98m = c0031be;
        this.f87b = byteBufferOrder.capacity();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m95a(int i, boolean z) {
        if (z) {
            m110p(1, 0);
            ByteBuffer byteBuffer = this.f86a;
            int i2 = this.f87b - 1;
            this.f87b = i2;
            byteBuffer.put(i2, z ? (byte) 1 : (byte) 0);
            m111q(i);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final void m96b(byte b) {
        m110p(1, 0);
        ByteBuffer byteBuffer = this.f86a;
        int i = this.f87b - 1;
        this.f87b = i;
        byteBuffer.put(i, b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final void m97c(int i, byte b) {
        if (b != 0) {
            m96b(b);
            m111q(i);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final void m98d(int i) {
        m110p(4, 0);
        ByteBuffer byteBuffer = this.f86a;
        int i2 = this.f87b - 4;
        this.f87b = i2;
        byteBuffer.putInt(i2, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final void m99e(int i, int i2) {
        if (i2 != 0) {
            m98d(i2);
            m111q(i);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final void m100f(long j) {
        m110p(8, 0);
        ByteBuffer byteBuffer = this.f86a;
        int i = this.f87b - 8;
        this.f87b = i;
        byteBuffer.putLong(i, j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final void m101g(int i) {
        m110p(4, 0);
        int iM109o = (m109o() - i) + 4;
        ByteBuffer byteBuffer = this.f86a;
        int i2 = this.f87b - 4;
        this.f87b = i2;
        byteBuffer.putInt(i2, iM109o);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public final void m102h(int i, int i2) {
        if (i2 != 0) {
            m101g(i2);
            m111q(i);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public final void m103i(short s) {
        m110p(2, 0);
        ByteBuffer byteBuffer = this.f86a;
        int i = this.f87b - 2;
        this.f87b = i;
        byteBuffer.putShort(i, s);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public final int m104j(CharSequence charSequence) {
        char c;
        char c2;
        boolean z;
        int i;
        int i2;
        int i3;
        char cCharAt;
        AbstractC0570zd abstractC0570zd = this.f98m;
        ((C0031be) abstractC0570zd).getClass();
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
                                throw new C0015ae(i5, length2);
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
        m96b((byte) 0);
        m113s(1, i6, 1);
        ByteBuffer byteBuffer = this.f86a;
        int i8 = this.f87b - i6;
        this.f87b = i8;
        byteBuffer.position(i8);
        ByteBuffer byteBuffer2 = this.f86a;
        ((C0031be) abstractC0570zd).getClass();
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
                                    throw new C0015ae(i4, length3);
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
                            throw new C0015ae(i4 - 1, length3);
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
                                throw new C0015ae(i4, length4);
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
        return m107m();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public final int m105k(int[] iArr) {
        if (this.f91f) {
            throw new AssertionError("FlatBuffers: object serialization must not be nested.");
        }
        m113s(4, iArr.length, 4);
        for (int length = iArr.length - 1; length >= 0; length--) {
            m101g(iArr[length]);
        }
        return m107m();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public final int m106l() {
        int i;
        if (this.f89d == null || !this.f91f) {
            throw new AssertionError("FlatBuffers: endTable called without startTable");
        }
        m98d(0);
        int iM109o = m109o();
        int i2 = this.f90e - 1;
        while (i2 >= 0 && this.f89d[i2] == 0) {
            i2--;
        }
        for (int i3 = i2; i3 >= 0; i3--) {
            int i4 = this.f89d[i3];
            m103i((short) (i4 != 0 ? iM109o - i4 : 0));
        }
        m103i((short) (iM109o - this.f93h));
        m103i((short) ((i2 + 3) * 2));
        int i5 = 0;
        loop2: while (true) {
            if (i5 >= this.f95j) {
                i = 0;
                break;
            }
            int iCapacity = this.f86a.capacity() - this.f94i[i5];
            int i6 = this.f87b;
            short s = this.f86a.getShort(iCapacity);
            if (s == this.f86a.getShort(i6)) {
                for (int i7 = 2; i7 < s; i7 += 2) {
                    if (this.f86a.getShort(iCapacity + i7) != this.f86a.getShort(i6 + i7)) {
                        break;
                    }
                }
                i = this.f94i[i5];
                break loop2;
            }
            i5++;
        }
        if (i != 0) {
            int iCapacity2 = this.f86a.capacity() - iM109o;
            this.f87b = iCapacity2;
            this.f86a.putInt(iCapacity2, i - iM109o);
        } else {
            int i8 = this.f95j;
            int[] iArr = this.f94i;
            if (i8 == iArr.length) {
                this.f94i = Arrays.copyOf(iArr, i8 * 2);
            }
            int[] iArr2 = this.f94i;
            int i9 = this.f95j;
            this.f95j = i9 + 1;
            iArr2[i9] = m109o();
            ByteBuffer byteBuffer = this.f86a;
            byteBuffer.putInt(byteBuffer.capacity() - iM109o, m109o() - iM109o);
        }
        this.f91f = false;
        return iM109o;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public final int m107m() {
        if (!this.f91f) {
            throw new AssertionError("FlatBuffers: endVector called without startVector");
        }
        this.f91f = false;
        int i = this.f96k;
        ByteBuffer byteBuffer = this.f86a;
        int i2 = this.f87b - 4;
        this.f87b = i2;
        byteBuffer.putInt(i2, i);
        return m109o();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public final void m108n(int i) {
        m110p(this.f88c, 4);
        m101g(i);
        this.f86a.position(this.f87b);
        this.f92g = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public final int m109o() {
        return this.f86a.capacity() - this.f87b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public final void m110p(int i, int i2) {
        int i3;
        if (i > this.f88c) {
            this.f88c = i;
        }
        int i4 = ((~((this.f86a.capacity() - this.f87b) + i2)) + 1) & (i - 1);
        while (this.f87b < i4 + i + i2) {
            int iCapacity = this.f86a.capacity();
            ByteBuffer byteBuffer = this.f86a;
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
            this.f97l.getClass();
            ByteBuffer byteBufferOrder = ByteBuffer.allocate(i3).order(ByteOrder.LITTLE_ENDIAN);
            byteBufferOrder.position(byteBufferOrder.clear().capacity() - iCapacity2);
            byteBufferOrder.put(byteBuffer);
            this.f86a = byteBufferOrder;
            this.f87b = (byteBufferOrder.capacity() - iCapacity) + this.f87b;
        }
        for (int i5 = 0; i5 < i4; i5++) {
            ByteBuffer byteBuffer2 = this.f86a;
            int i6 = this.f87b - 1;
            this.f87b = i6;
            byteBuffer2.put(i6, (byte) 0);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public final void m111q(int i) {
        this.f89d[i] = m109o();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r */
    public final void m112r(int i) {
        if (this.f91f) {
            throw new AssertionError("FlatBuffers: object serialization must not be nested.");
        }
        int[] iArr = this.f89d;
        if (iArr == null || iArr.length < i) {
            this.f89d = new int[i];
        }
        this.f90e = i;
        Arrays.fill(this.f89d, 0, i, 0);
        this.f91f = true;
        this.f93h = m109o();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s */
    public final void m113s(int i, int i2, int i3) {
        if (this.f91f) {
            throw new AssertionError("FlatBuffers: object serialization must not be nested.");
        }
        this.f96k = i2;
        int i4 = i * i2;
        m110p(4, i4);
        m110p(i3, i4);
        this.f91f = true;
    }
}
