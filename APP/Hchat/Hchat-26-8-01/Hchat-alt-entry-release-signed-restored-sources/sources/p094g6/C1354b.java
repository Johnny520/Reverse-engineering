package p094g6;

import bsh.org.objectweb.asm.Opcodes;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import p136j8.C2104o;

/* JADX INFO: renamed from: g6.b */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1354b {

    /* JADX INFO: renamed from: a */
    public ByteBuffer f4486a;

    /* JADX INFO: renamed from: b */
    public int f4487b;

    /* JADX INFO: renamed from: c */
    public int f4488c;

    /* JADX INFO: renamed from: d */
    public int[] f4489d;

    /* JADX INFO: renamed from: e */
    public int f4490e;

    /* JADX INFO: renamed from: f */
    public boolean f4491f;

    /* JADX INFO: renamed from: g */
    public boolean f4492g;

    /* JADX INFO: renamed from: h */
    public int f4493h;

    /* JADX INFO: renamed from: i */
    public int[] f4494i;

    /* JADX INFO: renamed from: j */
    public int f4495j;

    /* JADX INFO: renamed from: k */
    public int f4496k;

    /* JADX INFO: renamed from: l */
    public final C1353a f4497l;

    /* JADX INFO: renamed from: m */
    public final C1353a f4498m;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1354b() {
        C1353a c1353aM3628a = C1353a.m3628a();
        this.f4488c = 1;
        this.f4489d = null;
        this.f4490e = 0;
        this.f4491f = false;
        this.f4492g = false;
        this.f4494i = new int[16];
        this.f4495j = 0;
        this.f4496k = 0;
        this.f4497l = C1353a.f4484a;
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(1024).order(ByteOrder.LITTLE_ENDIAN);
        this.f4486a = byteBufferOrder;
        this.f4498m = c1353aM3628a;
        this.f4487b = byteBufferOrder.capacity();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m3629a(byte b10) {
        m3639k(1, 0);
        ByteBuffer byteBuffer = this.f4486a;
        int i9 = this.f4487b - 1;
        this.f4487b = i9;
        byteBuffer.put(i9, b10);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final void m3630b(int i9) {
        m3639k(4, 0);
        int iM3638j = (m3638j() - i9) + 4;
        ByteBuffer byteBuffer = this.f4486a;
        int i10 = this.f4487b - 4;
        this.f4487b = i10;
        byteBuffer.putInt(i10, iM3638j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final void m3631c(int i9, int i10) {
        if (i10 != 0) {
            m3630b(i10);
            m3641m(i9);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final void m3632d(short s10) {
        m3639k(2, 0);
        ByteBuffer byteBuffer = this.f4486a;
        int i9 = this.f4487b - 2;
        this.f4487b = i9;
        byteBuffer.putShort(i9, s10);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final int m3633e(CharSequence charSequence) {
        char c10;
        char c11;
        boolean z9;
        int i9;
        int i10;
        int i11;
        char cCharAt;
        C1353a c1353a = this.f4498m;
        c1353a.getClass();
        int length = charSequence.length();
        int i12 = 0;
        int i13 = 0;
        while (i13 < length && charSequence.charAt(i13) < 128) {
            i13++;
        }
        int i14 = length;
        while (true) {
            c10 = 55296;
            c11 = 2048;
            z9 = true;
            if (i13 >= length) {
                break;
            }
            char cCharAt2 = charSequence.charAt(i13);
            if (cCharAt2 < 2048) {
                i14 += (127 - cCharAt2) >>> 31;
                i13++;
            } else {
                int length2 = charSequence.length();
                int i15 = 0;
                while (i13 < length2) {
                    char cCharAt3 = charSequence.charAt(i13);
                    if (cCharAt3 < 2048) {
                        i15 += (127 - cCharAt3) >>> 31;
                    } else {
                        i15 += 2;
                        if (55296 <= cCharAt3 && cCharAt3 <= 57343) {
                            if (Character.codePointAt(charSequence, i13) < 65536) {
                                throw new C1356d(i13, length2);
                            }
                            i13++;
                        }
                    }
                    i13++;
                }
                i14 += i15;
            }
        }
        if (i14 < length) {
            throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (((long) i14) + 4294967296L));
        }
        m3629a((byte) 0);
        m3643o(1, i14, 1);
        ByteBuffer byteBuffer = this.f4486a;
        int i16 = this.f4487b - i14;
        this.f4487b = i16;
        byteBuffer.position(i16);
        ByteBuffer byteBuffer2 = this.f4486a;
        c1353a.getClass();
        if (byteBuffer2.hasArray()) {
            int iArrayOffset = byteBuffer2.arrayOffset();
            byte[] bArrArray = byteBuffer2.array();
            int iPosition = byteBuffer2.position() + iArrayOffset;
            int iRemaining = byteBuffer2.remaining();
            int length3 = charSequence.length();
            int i17 = iRemaining + iPosition;
            while (true) {
                boolean z10 = z9;
                if (i12 >= length3 || (i11 = i12 + iPosition) >= i17 || (cCharAt = charSequence.charAt(i12)) >= 128) {
                    break;
                }
                bArrArray[i11] = (byte) cCharAt;
                i12++;
                z9 = z10;
            }
            if (i12 == length3) {
                i9 = iPosition + length3;
            } else {
                i9 = iPosition + i12;
                while (i12 < length3) {
                    char cCharAt4 = charSequence.charAt(i12);
                    if (cCharAt4 < 128 && i9 < i17) {
                        bArrArray[i9] = (byte) cCharAt4;
                        i9++;
                    } else if (cCharAt4 < c11 && i9 <= i17 - 2) {
                        int i18 = i9 + 1;
                        bArrArray[i9] = (byte) ((cCharAt4 >>> 6) | 960);
                        i9 += 2;
                        bArrArray[i18] = (byte) ((cCharAt4 & '?') | 128);
                    } else {
                        if ((cCharAt4 >= c10 && 57343 >= cCharAt4) || i9 > i17 - 3) {
                            if (i9 > i17 - 4) {
                                if (55296 <= cCharAt4 && cCharAt4 <= 57343 && ((i10 = i12 + 1) == charSequence.length() || !Character.isSurrogatePair(cCharAt4, charSequence.charAt(i10)))) {
                                    throw new C1356d(i12, length3);
                                }
                                throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt4 + " at index " + i9);
                            }
                            int i19 = i12 + 1;
                            if (i19 != charSequence.length()) {
                                char cCharAt5 = charSequence.charAt(i19);
                                if (Character.isSurrogatePair(cCharAt4, cCharAt5)) {
                                    int codePoint = Character.toCodePoint(cCharAt4, cCharAt5);
                                    bArrArray[i9] = (byte) ((codePoint >>> 18) | 240);
                                    bArrArray[i9 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                                    int i20 = i9 + 3;
                                    bArrArray[i9 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                                    i9 += 4;
                                    bArrArray[i20] = (byte) ((codePoint & 63) | 128);
                                    i12 = i19;
                                } else {
                                    i12 = i19;
                                }
                            }
                            throw new C1356d(i12 - 1, length3);
                        }
                        bArrArray[i9] = (byte) ((cCharAt4 >>> '\f') | 480);
                        int i21 = i9 + 2;
                        bArrArray[i9 + 1] = (byte) (((cCharAt4 >>> 6) & 63) | 128);
                        i9 += 3;
                        bArrArray[i21] = (byte) ((cCharAt4 & '?') | 128);
                    }
                    i12++;
                    c10 = 55296;
                    c11 = 2048;
                }
            }
            byteBuffer2.position(i9 - iArrayOffset);
        } else {
            int length4 = charSequence.length();
            int iPosition2 = byteBuffer2.position();
            while (i12 < length4) {
                try {
                    char cCharAt6 = charSequence.charAt(i12);
                    if (cCharAt6 >= 128) {
                        break;
                    }
                    byteBuffer2.put(iPosition2 + i12, (byte) cCharAt6);
                    i12++;
                } catch (IndexOutOfBoundsException unused) {
                }
            }
            if (i12 == length4) {
                byteBuffer2.position(iPosition2 + i12);
            } else {
                iPosition2 += i12;
                while (i12 < length4) {
                    char cCharAt7 = charSequence.charAt(i12);
                    if (cCharAt7 >= 128) {
                        if (cCharAt7 < 2048) {
                            int i22 = iPosition2 + 1;
                            try {
                                byteBuffer2.put(iPosition2, (byte) ((cCharAt7 >>> 6) | Opcodes.CHECKCAST));
                                byteBuffer2.put(i22, (byte) ((cCharAt7 & '?') | 128));
                                iPosition2 = i22;
                            } catch (IndexOutOfBoundsException unused2) {
                                iPosition2 = i22;
                            }
                        } else {
                            if (cCharAt7 >= 55296 && 57343 >= cCharAt7) {
                                int i23 = i12 + 1;
                                if (i23 != length4) {
                                    try {
                                        char cCharAt8 = charSequence.charAt(i23);
                                        if (Character.isSurrogatePair(cCharAt7, cCharAt8)) {
                                            int codePoint2 = Character.toCodePoint(cCharAt7, cCharAt8);
                                            int i24 = iPosition2 + 1;
                                            try {
                                                byteBuffer2.put(iPosition2, (byte) ((codePoint2 >>> 18) | 240));
                                                int i25 = iPosition2 + 2;
                                                try {
                                                    byteBuffer2.put(i24, (byte) (((codePoint2 >>> 12) & 63) | 128));
                                                    iPosition2 += 3;
                                                    byteBuffer2.put(i25, (byte) (((codePoint2 >>> 6) & 63) | 128));
                                                    byteBuffer2.put(iPosition2, (byte) ((codePoint2 & 63) | 128));
                                                    i12 = i23;
                                                    i12++;
                                                    iPosition2++;
                                                } catch (IndexOutOfBoundsException unused3) {
                                                    i12 = i23;
                                                    iPosition2 = i25;
                                                }
                                            } catch (IndexOutOfBoundsException unused4) {
                                                iPosition2 = i24;
                                                i12 = i23;
                                            }
                                        } else {
                                            i12 = i23;
                                        }
                                    } catch (IndexOutOfBoundsException unused5) {
                                    }
                                }
                                throw new C1356d(i12, length4);
                            }
                            int i26 = iPosition2 + 1;
                            try {
                                byteBuffer2.put(iPosition2, (byte) ((cCharAt7 >>> '\f') | 224));
                                iPosition2 += 2;
                                byteBuffer2.put(i26, (byte) (((cCharAt7 >>> 6) & 63) | 128));
                                byteBuffer2.put(iPosition2, (byte) ((cCharAt7 & '?') | 128));
                                i12++;
                                iPosition2++;
                            } catch (IndexOutOfBoundsException unused6) {
                                iPosition2 = i26;
                            }
                        }
                        int iMax = Math.max(i12, (iPosition2 - byteBuffer2.position()) + 1) + byteBuffer2.position();
                        throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(i12) + " at index " + iMax);
                    }
                    byteBuffer2.put(iPosition2, (byte) cCharAt7);
                    i12++;
                    iPosition2++;
                }
                byteBuffer2.position(iPosition2);
            }
        }
        return m3636h();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final int m3634f(int[] iArr) {
        if (this.f4491f) {
            C2104o.m5281f("FlatBuffers: object serialization must not be nested.");
            return 0;
        }
        m3643o(4, iArr.length, 4);
        for (int length = iArr.length - 1; length >= 0; length--) {
            m3630b(iArr[length]);
        }
        return m3636h();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final int m3635g() {
        int i9;
        if (this.f4489d == null || !this.f4491f) {
            C2104o.m5281f("FlatBuffers: endTable called without startTable");
            return 0;
        }
        m3639k(4, 0);
        ByteBuffer byteBuffer = this.f4486a;
        int i10 = this.f4487b - 4;
        this.f4487b = i10;
        byteBuffer.putInt(i10, 0);
        int iM3638j = m3638j();
        int i11 = this.f4490e - 1;
        while (i11 >= 0 && this.f4489d[i11] == 0) {
            i11--;
        }
        for (int i12 = i11; i12 >= 0; i12--) {
            int i13 = this.f4489d[i12];
            m3632d((short) (i13 != 0 ? iM3638j - i13 : 0));
        }
        m3632d((short) (iM3638j - this.f4493h));
        m3632d((short) ((i11 + 3) * 2));
        int i14 = 0;
        loop2: while (true) {
            if (i14 >= this.f4495j) {
                i9 = 0;
                break;
            }
            int iCapacity = this.f4486a.capacity() - this.f4494i[i14];
            int i15 = this.f4487b;
            short s10 = this.f4486a.getShort(iCapacity);
            if (s10 == this.f4486a.getShort(i15)) {
                for (int i16 = 2; i16 < s10; i16 += 2) {
                    if (this.f4486a.getShort(iCapacity + i16) != this.f4486a.getShort(i15 + i16)) {
                        break;
                    }
                }
                i9 = this.f4494i[i14];
                break loop2;
            }
            i14++;
        }
        if (i9 != 0) {
            int iCapacity2 = this.f4486a.capacity() - iM3638j;
            this.f4487b = iCapacity2;
            this.f4486a.putInt(iCapacity2, i9 - iM3638j);
        } else {
            int i17 = this.f4495j;
            int[] iArr = this.f4494i;
            if (i17 == iArr.length) {
                this.f4494i = Arrays.copyOf(iArr, i17 * 2);
            }
            int[] iArr2 = this.f4494i;
            int i18 = this.f4495j;
            this.f4495j = i18 + 1;
            iArr2[i18] = m3638j();
            ByteBuffer byteBuffer2 = this.f4486a;
            byteBuffer2.putInt(byteBuffer2.capacity() - iM3638j, m3638j() - iM3638j);
        }
        this.f4491f = false;
        return iM3638j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public final int m3636h() {
        if (!this.f4491f) {
            C2104o.m5281f("FlatBuffers: endVector called without startVector");
            return 0;
        }
        this.f4491f = false;
        int i9 = this.f4496k;
        ByteBuffer byteBuffer = this.f4486a;
        int i10 = this.f4487b - 4;
        this.f4487b = i10;
        byteBuffer.putInt(i10, i9);
        return m3638j();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public final void m3637i(int i9) {
        m3639k(this.f4488c, 4);
        m3630b(i9);
        this.f4486a.position(this.f4487b);
        this.f4492g = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public final int m3638j() {
        return this.f4486a.capacity() - this.f4487b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public final void m3639k(int i9, int i10) {
        int i11;
        if (i9 > this.f4488c) {
            this.f4488c = i9;
        }
        int i12 = ((~((this.f4486a.capacity() - this.f4487b) + i10)) + 1) & (i9 - 1);
        while (this.f4487b < i12 + i9 + i10) {
            int iCapacity = this.f4486a.capacity();
            ByteBuffer byteBuffer = this.f4486a;
            int iCapacity2 = byteBuffer.capacity();
            if (iCapacity2 == 0) {
                i11 = 1024;
            } else {
                i11 = 2147483639;
                if (iCapacity2 == 2147483639) {
                    C2104o.m5281f("FlatBuffers: cannot grow buffer beyond 2 gigabytes.");
                    return;
                } else if (((-1073741824) & iCapacity2) == 0) {
                    i11 = iCapacity2 << 1;
                }
            }
            byteBuffer.position(0);
            this.f4497l.getClass();
            ByteBuffer byteBufferOrder = ByteBuffer.allocate(i11).order(ByteOrder.LITTLE_ENDIAN);
            byteBufferOrder.position(byteBufferOrder.clear().capacity() - iCapacity2);
            byteBufferOrder.put(byteBuffer);
            this.f4486a = byteBufferOrder;
            this.f4487b = (byteBufferOrder.capacity() - iCapacity) + this.f4487b;
        }
        for (int i13 = 0; i13 < i12; i13++) {
            ByteBuffer byteBuffer2 = this.f4486a;
            int i14 = this.f4487b - 1;
            this.f4487b = i14;
            byteBuffer2.put(i14, (byte) 0);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public final byte[] m3640l() {
        int i9 = this.f4487b;
        int iCapacity = this.f4486a.capacity() - this.f4487b;
        if (!this.f4492g) {
            C2104o.m5281f("FlatBuffers: you can only access the serialized buffer after it has been finished by FlatBufferBuilder.finish().");
            return null;
        }
        byte[] bArr = new byte[iCapacity];
        this.f4486a.position(i9);
        this.f4486a.get(bArr);
        return bArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public final void m3641m(int i9) {
        this.f4489d[i9] = m3638j();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public final void m3642n(int i9) {
        if (this.f4491f) {
            C2104o.m5281f("FlatBuffers: object serialization must not be nested.");
            return;
        }
        int[] iArr = this.f4489d;
        if (iArr == null || iArr.length < i9) {
            this.f4489d = new int[i9];
        }
        this.f4490e = i9;
        Arrays.fill(this.f4489d, 0, i9, 0);
        this.f4491f = true;
        this.f4493h = m3638j();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public final void m3643o(int i9, int i10, int i11) {
        if (this.f4491f) {
            C2104o.m5281f("FlatBuffers: object serialization must not be nested.");
            return;
        }
        this.f4496k = i10;
        int i12 = i9 * i10;
        m3639k(4, i12);
        m3639k(i11, i12);
        this.f4491f = true;
    }
}
