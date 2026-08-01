package com.google.flatbuffers;

import com.android.dx.io.Opcodes;
import com.esotericsoftware.kryo.util.Util;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import p007.AbstractC6136;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: com.google.flatbuffers.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3218 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public boolean f10851;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public int f10852;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public int[] f10853;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public int f10854;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public int f10855;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public ByteBuffer f10856;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final C3219 f10857;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public int f10858;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public boolean f10859;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public int f10860;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final C3219 f10861;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public int[] f10862;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public int f10863;

    public C3218() {
        C3219 c3219M7320 = C3219.m7320();
        this.f10854 = 1;
        this.f10853 = null;
        this.f10852 = 0;
        this.f10851 = false;
        this.f10859 = false;
        this.f10862 = new int[16];
        this.f10863 = 0;
        this.f10860 = 0;
        this.f10861 = C3219.f10865;
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(1024).order(ByteOrder.LITTLE_ENDIAN);
        this.f10856 = byteBufferOrder;
        this.f10857 = c3219M7320;
        this.f10855 = byteBufferOrder.capacity();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void m7304(short s) {
        m7311(2, 0);
        ByteBuffer byteBuffer = this.f10856;
        int i = this.f10855 - 2;
        this.f10855 = i;
        byteBuffer.putShort(i, s);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m7305(int i, int i2) {
        if (i2 != 0) {
            m7306(i2);
            m7310(i);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m7306(int i) {
        m7311(4, 0);
        int iM7317 = (m7317() - i) + 4;
        ByteBuffer byteBuffer = this.f10856;
        int i2 = this.f10855 - 4;
        this.f10855 = i2;
        byteBuffer.putInt(i2, iM7317);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m7307(long j) {
        m7311(8, 0);
        ByteBuffer byteBuffer = this.f10856;
        int i = this.f10855 - 8;
        this.f10855 = i;
        byteBuffer.putLong(i, j);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m7308(byte b, int i) {
        if (b != 0) {
            m7309(b);
            m7310(i);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m7309(byte b) {
        m7311(1, 0);
        ByteBuffer byteBuffer = this.f10856;
        int i = this.f10855 - 1;
        this.f10855 = i;
        byteBuffer.put(i, b);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final void m7310(int i) {
        this.f10853[i] = m7317();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final void m7311(int i, int i2) {
        int i3;
        if (i > this.f10854) {
            this.f10854 = i;
        }
        int i4 = ((~((this.f10856.capacity() - this.f10855) + i2)) + 1) & (i - 1);
        while (this.f10855 < i4 + i + i2) {
            int iCapacity = this.f10856.capacity();
            ByteBuffer byteBuffer = this.f10856;
            int iCapacity2 = byteBuffer.capacity();
            if (iCapacity2 == 0) {
                i3 = 1024;
            } else {
                i3 = Util.maxArraySize;
                if (iCapacity2 == 2147483639) {
                    C5919.m11243("FlatBuffers: cannot grow buffer beyond 2 gigabytes.");
                    return;
                } else if (((-1073741824) & iCapacity2) == 0) {
                    i3 = iCapacity2 << 1;
                }
            }
            byteBuffer.position(0);
            this.f10861.getClass();
            ByteBuffer byteBufferOrder = ByteBuffer.allocate(i3).order(ByteOrder.LITTLE_ENDIAN);
            byteBufferOrder.position(byteBufferOrder.clear().capacity() - iCapacity2);
            byteBufferOrder.put(byteBuffer);
            this.f10856 = byteBufferOrder;
            this.f10855 = (byteBufferOrder.capacity() - iCapacity) + this.f10855;
        }
        for (int i5 = 0; i5 < i4; i5++) {
            ByteBuffer byteBuffer2 = this.f10856;
            int i6 = this.f10855 - 1;
            this.f10855 = i6;
            byteBuffer2.put(i6, (byte) 0);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final void m7312(int i) {
        if (this.f10851) {
            C5919.m11243("FlatBuffers: object serialization must not be nested.");
            return;
        }
        int[] iArr = this.f10853;
        if (iArr == null || iArr.length < i) {
            this.f10853 = new int[i];
        }
        this.f10852 = i;
        Arrays.fill(this.f10853, 0, i, 0);
        this.f10851 = true;
        this.f10858 = m7317();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final void m7313(int i, int i2, int i3) {
        if (this.f10851) {
            C5919.m11243("FlatBuffers: object serialization must not be nested.");
            return;
        }
        this.f10860 = i2;
        int i4 = i * i2;
        m7311(4, i4);
        m7311(i3, i4);
        this.f10851 = true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final int m7314(int[] iArr) {
        if (this.f10851) {
            C5919.m11243("FlatBuffers: object serialization must not be nested.");
            return 0;
        }
        m7313(4, iArr.length, 4);
        for (int length = iArr.length - 1; length >= 0; length--) {
            m7306(iArr[length]);
        }
        return m7319();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final int m7315(CharSequence charSequence) {
        char c;
        char c2;
        boolean z;
        int i;
        int i2;
        int i3;
        char cCharAt;
        C3219 c3219 = this.f10857;
        c3219.getClass();
        int length = charSequence.length();
        final int i4 = 0;
        final int i5 = 0;
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
                final int length2 = charSequence.length();
                int i7 = 0;
                while (i5 < length2) {
                    char cCharAt3 = charSequence.charAt(i5);
                    if (cCharAt3 < 2048) {
                        i7 += (127 - cCharAt3) >>> 31;
                    } else {
                        i7 += 2;
                        if (55296 <= cCharAt3 && cCharAt3 <= 57343) {
                            if (Character.codePointAt(charSequence, i5) < 65536) {
                                throw new IllegalArgumentException(i5, length2) { // from class: com.google.flatbuffers.Utf8Safe$UnpairedSurrogateException
                                    {
                                        super(AbstractC6136.m11559(i5, length2, "Unpaired surrogate at index ", " of "));
                                    }
                                };
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
        m7309((byte) 0);
        m7313(1, i6, 1);
        ByteBuffer byteBuffer = this.f10856;
        int i8 = this.f10855 - i6;
        this.f10855 = i8;
        byteBuffer.position(i8);
        ByteBuffer byteBuffer2 = this.f10856;
        c3219.getClass();
        if (byteBuffer2.hasArray()) {
            int iArrayOffset = byteBuffer2.arrayOffset();
            byte[] bArrArray = byteBuffer2.array();
            int iPosition = byteBuffer2.position() + iArrayOffset;
            int iRemaining = byteBuffer2.remaining();
            final int length3 = charSequence.length();
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
                                    throw new IllegalArgumentException(i4, length3) { // from class: com.google.flatbuffers.Utf8Safe$UnpairedSurrogateException
                                        {
                                            super(AbstractC6136.m11559(i4, length3, "Unpaired surrogate at index ", " of "));
                                        }
                                    };
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
                            final int i13 = i4 - 1;
                            throw new IllegalArgumentException(i13, length3) { // from class: com.google.flatbuffers.Utf8Safe$UnpairedSurrogateException
                                {
                                    super(AbstractC6136.m11559(i13, length3, "Unpaired surrogate at index ", " of "));
                                }
                            };
                        }
                        bArrArray[i] = (byte) ((cCharAt4 >>> '\f') | 480);
                        int i14 = i + 2;
                        bArrArray[i + 1] = (byte) (((cCharAt4 >>> 6) & 63) | 128);
                        i += 3;
                        bArrArray[i14] = (byte) ((cCharAt4 & '?') | 128);
                    }
                    i4++;
                    c = 55296;
                    c2 = 2048;
                }
            }
            byteBuffer2.position(i - iArrayOffset);
        } else {
            final int length4 = charSequence.length();
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
                            int i15 = iPosition2 + 1;
                            try {
                                byteBuffer2.put(iPosition2, (byte) ((cCharAt7 >>> 6) | 192));
                                byteBuffer2.put(i15, (byte) ((cCharAt7 & '?') | 128));
                                iPosition2 = i15;
                            } catch (IndexOutOfBoundsException unused2) {
                                iPosition2 = i15;
                            }
                        } else {
                            if (cCharAt7 >= 55296 && 57343 >= cCharAt7) {
                                int i16 = i4 + 1;
                                if (i16 != length4) {
                                    try {
                                        char cCharAt8 = charSequence.charAt(i16);
                                        if (Character.isSurrogatePair(cCharAt7, cCharAt8)) {
                                            int codePoint2 = Character.toCodePoint(cCharAt7, cCharAt8);
                                            int i17 = iPosition2 + 1;
                                            try {
                                                byteBuffer2.put(iPosition2, (byte) ((codePoint2 >>> 18) | 240));
                                                int i18 = iPosition2 + 2;
                                                try {
                                                    byteBuffer2.put(i17, (byte) (((codePoint2 >>> 12) & 63) | 128));
                                                    iPosition2 += 3;
                                                    byteBuffer2.put(i18, (byte) (((codePoint2 >>> 6) & 63) | 128));
                                                    byteBuffer2.put(iPosition2, (byte) ((codePoint2 & 63) | 128));
                                                    i4 = i16;
                                                    i4++;
                                                    iPosition2++;
                                                } catch (IndexOutOfBoundsException unused3) {
                                                    i4 = i16;
                                                    iPosition2 = i18;
                                                }
                                            } catch (IndexOutOfBoundsException unused4) {
                                                iPosition2 = i17;
                                                i4 = i16;
                                            }
                                        } else {
                                            i4 = i16;
                                        }
                                    } catch (IndexOutOfBoundsException unused5) {
                                    }
                                }
                                throw new IllegalArgumentException(i4, length4) { // from class: com.google.flatbuffers.Utf8Safe$UnpairedSurrogateException
                                    {
                                        super(AbstractC6136.m11559(i4, length4, "Unpaired surrogate at index ", " of "));
                                    }
                                };
                            }
                            int i19 = iPosition2 + 1;
                            try {
                                byteBuffer2.put(iPosition2, (byte) ((cCharAt7 >>> '\f') | Opcodes.SHL_INT_LIT8));
                                iPosition2 += 2;
                                byteBuffer2.put(i19, (byte) (((cCharAt7 >>> 6) & 63) | 128));
                                byteBuffer2.put(iPosition2, (byte) ((cCharAt7 & '?') | 128));
                                i4++;
                                iPosition2++;
                            } catch (IndexOutOfBoundsException unused6) {
                                iPosition2 = i19;
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
        return m7319();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final void m7316(int i) {
        m7311(this.f10854, 4);
        m7306(i);
        this.f10856.position(this.f10855);
        this.f10859 = true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final int m7317() {
        return this.f10856.capacity() - this.f10855;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final int m7318() {
        int i;
        if (this.f10853 == null || !this.f10851) {
            C5919.m11243("FlatBuffers: endTable called without startTable");
            return 0;
        }
        m7311(4, 0);
        ByteBuffer byteBuffer = this.f10856;
        int i2 = this.f10855 - 4;
        this.f10855 = i2;
        byteBuffer.putInt(i2, 0);
        int iM7317 = m7317();
        int i3 = this.f10852 - 1;
        while (i3 >= 0 && this.f10853[i3] == 0) {
            i3--;
        }
        for (int i4 = i3; i4 >= 0; i4--) {
            int i5 = this.f10853[i4];
            m7304((short) (i5 != 0 ? iM7317 - i5 : 0));
        }
        m7304((short) (iM7317 - this.f10858));
        m7304((short) ((i3 + 3) * 2));
        int i6 = 0;
        loop2: while (true) {
            if (i6 >= this.f10863) {
                i = 0;
                break;
            }
            int iCapacity = this.f10856.capacity() - this.f10862[i6];
            int i7 = this.f10855;
            short s = this.f10856.getShort(iCapacity);
            if (s == this.f10856.getShort(i7)) {
                for (int i8 = 2; i8 < s; i8 += 2) {
                    if (this.f10856.getShort(iCapacity + i8) != this.f10856.getShort(i7 + i8)) {
                        break;
                    }
                }
                i = this.f10862[i6];
                break loop2;
            }
            i6++;
        }
        if (i != 0) {
            int iCapacity2 = this.f10856.capacity() - iM7317;
            this.f10855 = iCapacity2;
            this.f10856.putInt(iCapacity2, i - iM7317);
        } else {
            int i9 = this.f10863;
            int[] iArr = this.f10862;
            if (i9 == iArr.length) {
                this.f10862 = Arrays.copyOf(iArr, i9 * 2);
            }
            int[] iArr2 = this.f10862;
            int i10 = this.f10863;
            this.f10863 = i10 + 1;
            iArr2[i10] = m7317();
            ByteBuffer byteBuffer2 = this.f10856;
            byteBuffer2.putInt(byteBuffer2.capacity() - iM7317, m7317() - iM7317);
        }
        this.f10851 = false;
        return iM7317;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final int m7319() {
        if (!this.f10851) {
            C5919.m11243("FlatBuffers: endVector called without startVector");
            return 0;
        }
        this.f10851 = false;
        int i = this.f10860;
        ByteBuffer byteBuffer = this.f10856;
        int i2 = this.f10855 - 4;
        this.f10855 = i2;
        byteBuffer.putInt(i2, i);
        return m7317();
    }
}
