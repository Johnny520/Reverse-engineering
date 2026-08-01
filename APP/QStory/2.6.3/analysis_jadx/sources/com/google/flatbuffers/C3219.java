package com.google.flatbuffers;

import com.android.dx.io.Opcodes;
import com.esotericsoftware.kryo.util.Util;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import p009.AbstractC6183;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: com.google.flatbuffers.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3219 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public boolean f10856;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public int f10857;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public int[] f10858;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public int f10859;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public int f10860;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public ByteBuffer f10861;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final C3220 f10862;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public int f10863;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public boolean f10864;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public int f10865;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final C3220 f10866;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public int[] f10867;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public int f10868;

    public C3219() {
        C3220 c3220M7307 = C3220.m7307();
        this.f10859 = 1;
        this.f10858 = null;
        this.f10857 = 0;
        this.f10856 = false;
        this.f10864 = false;
        this.f10867 = new int[16];
        this.f10868 = 0;
        this.f10865 = 0;
        this.f10866 = C3220.f10870;
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(1024).order(ByteOrder.LITTLE_ENDIAN);
        this.f10861 = byteBufferOrder;
        this.f10862 = c3220M7307;
        this.f10860 = byteBufferOrder.capacity();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void m7291(short s) {
        m7298(2, 0);
        ByteBuffer byteBuffer = this.f10861;
        int i = this.f10860 - 2;
        this.f10860 = i;
        byteBuffer.putShort(i, s);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m7292(int i, int i2) {
        if (i2 != 0) {
            m7293(i2);
            m7297(i);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m7293(int i) {
        m7298(4, 0);
        int iM7304 = (m7304() - i) + 4;
        ByteBuffer byteBuffer = this.f10861;
        int i2 = this.f10860 - 4;
        this.f10860 = i2;
        byteBuffer.putInt(i2, iM7304);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m7294(long j) {
        m7298(8, 0);
        ByteBuffer byteBuffer = this.f10861;
        int i = this.f10860 - 8;
        this.f10860 = i;
        byteBuffer.putLong(i, j);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m7295(byte b, int i) {
        if (b != 0) {
            m7296(b);
            m7297(i);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m7296(byte b) {
        m7298(1, 0);
        ByteBuffer byteBuffer = this.f10861;
        int i = this.f10860 - 1;
        this.f10860 = i;
        byteBuffer.put(i, b);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final void m7297(int i) {
        this.f10858[i] = m7304();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final void m7298(int i, int i2) {
        int i3;
        if (i > this.f10859) {
            this.f10859 = i;
        }
        int i4 = ((~((this.f10861.capacity() - this.f10860) + i2)) + 1) & (i - 1);
        while (this.f10860 < i4 + i + i2) {
            int iCapacity = this.f10861.capacity();
            ByteBuffer byteBuffer = this.f10861;
            int iCapacity2 = byteBuffer.capacity();
            if (iCapacity2 == 0) {
                i3 = 1024;
            } else {
                i3 = Util.maxArraySize;
                if (iCapacity2 == 2147483639) {
                    C5925.m11304("FlatBuffers: cannot grow buffer beyond 2 gigabytes.");
                    return;
                } else if (((-1073741824) & iCapacity2) == 0) {
                    i3 = iCapacity2 << 1;
                }
            }
            byteBuffer.position(0);
            this.f10866.getClass();
            ByteBuffer byteBufferOrder = ByteBuffer.allocate(i3).order(ByteOrder.LITTLE_ENDIAN);
            byteBufferOrder.position(byteBufferOrder.clear().capacity() - iCapacity2);
            byteBufferOrder.put(byteBuffer);
            this.f10861 = byteBufferOrder;
            this.f10860 = (byteBufferOrder.capacity() - iCapacity) + this.f10860;
        }
        for (int i5 = 0; i5 < i4; i5++) {
            ByteBuffer byteBuffer2 = this.f10861;
            int i6 = this.f10860 - 1;
            this.f10860 = i6;
            byteBuffer2.put(i6, (byte) 0);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final void m7299(int i) {
        if (this.f10856) {
            C5925.m11304("FlatBuffers: object serialization must not be nested.");
            return;
        }
        int[] iArr = this.f10858;
        if (iArr == null || iArr.length < i) {
            this.f10858 = new int[i];
        }
        this.f10857 = i;
        Arrays.fill(this.f10858, 0, i, 0);
        this.f10856 = true;
        this.f10863 = m7304();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final void m7300(int i, int i2, int i3) {
        if (this.f10856) {
            C5925.m11304("FlatBuffers: object serialization must not be nested.");
            return;
        }
        this.f10865 = i2;
        int i4 = i * i2;
        m7298(4, i4);
        m7298(i3, i4);
        this.f10856 = true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final int m7301(int[] iArr) {
        if (this.f10856) {
            C5925.m11304("FlatBuffers: object serialization must not be nested.");
            return 0;
        }
        m7300(4, iArr.length, 4);
        for (int length = iArr.length - 1; length >= 0; length--) {
            m7293(iArr[length]);
        }
        return m7306();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final int m7302(CharSequence charSequence) {
        char c;
        char c2;
        boolean z;
        int i;
        int i2;
        int i3;
        char cCharAt;
        C3220 c3220 = this.f10862;
        c3220.getClass();
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
                                        super(AbstractC6183.m11591(i5, length2, "Unpaired surrogate at index ", " of "));
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
        m7296((byte) 0);
        m7300(1, i6, 1);
        ByteBuffer byteBuffer = this.f10861;
        int i8 = this.f10860 - i6;
        this.f10860 = i8;
        byteBuffer.position(i8);
        ByteBuffer byteBuffer2 = this.f10861;
        c3220.getClass();
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
                                            super(AbstractC6183.m11591(i4, length3, "Unpaired surrogate at index ", " of "));
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
                                    super(AbstractC6183.m11591(i13, length3, "Unpaired surrogate at index ", " of "));
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
                                        super(AbstractC6183.m11591(i4, length4, "Unpaired surrogate at index ", " of "));
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
        return m7306();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final void m7303(int i) {
        m7298(this.f10859, 4);
        m7293(i);
        this.f10861.position(this.f10860);
        this.f10864 = true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final int m7304() {
        return this.f10861.capacity() - this.f10860;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final int m7305() {
        int i;
        if (this.f10858 == null || !this.f10856) {
            C5925.m11304("FlatBuffers: endTable called without startTable");
            return 0;
        }
        m7298(4, 0);
        ByteBuffer byteBuffer = this.f10861;
        int i2 = this.f10860 - 4;
        this.f10860 = i2;
        byteBuffer.putInt(i2, 0);
        int iM7304 = m7304();
        int i3 = this.f10857 - 1;
        while (i3 >= 0 && this.f10858[i3] == 0) {
            i3--;
        }
        for (int i4 = i3; i4 >= 0; i4--) {
            int i5 = this.f10858[i4];
            m7291((short) (i5 != 0 ? iM7304 - i5 : 0));
        }
        m7291((short) (iM7304 - this.f10863));
        m7291((short) ((i3 + 3) * 2));
        int i6 = 0;
        loop2: while (true) {
            if (i6 >= this.f10868) {
                i = 0;
                break;
            }
            int iCapacity = this.f10861.capacity() - this.f10867[i6];
            int i7 = this.f10860;
            short s = this.f10861.getShort(iCapacity);
            if (s == this.f10861.getShort(i7)) {
                for (int i8 = 2; i8 < s; i8 += 2) {
                    if (this.f10861.getShort(iCapacity + i8) != this.f10861.getShort(i7 + i8)) {
                        break;
                    }
                }
                i = this.f10867[i6];
                break loop2;
            }
            i6++;
        }
        if (i != 0) {
            int iCapacity2 = this.f10861.capacity() - iM7304;
            this.f10860 = iCapacity2;
            this.f10861.putInt(iCapacity2, i - iM7304);
        } else {
            int i9 = this.f10868;
            int[] iArr = this.f10867;
            if (i9 == iArr.length) {
                this.f10867 = Arrays.copyOf(iArr, i9 * 2);
            }
            int[] iArr2 = this.f10867;
            int i10 = this.f10868;
            this.f10868 = i10 + 1;
            iArr2[i10] = m7304();
            ByteBuffer byteBuffer2 = this.f10861;
            byteBuffer2.putInt(byteBuffer2.capacity() - iM7304, m7304() - iM7304);
        }
        this.f10856 = false;
        return iM7304;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final int m7306() {
        if (!this.f10856) {
            C5925.m11304("FlatBuffers: endVector called without startVector");
            return 0;
        }
        this.f10856 = false;
        int i = this.f10865;
        ByteBuffer byteBuffer = this.f10861;
        int i2 = this.f10860 - 4;
        this.f10860 = i2;
        byteBuffer.putInt(i2, i);
        return m7304();
    }
}
