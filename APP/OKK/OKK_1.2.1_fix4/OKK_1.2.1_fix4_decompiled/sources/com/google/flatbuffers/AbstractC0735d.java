package com.google.flatbuffers;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import p037U.AbstractC0358S;

/* JADX INFO: renamed from: com.google.flatbuffers.d */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0735d {

    /* JADX INFO: renamed from: bb */
    protected ByteBuffer f2573bb;
    protected int bb_pos;
    AbstractC0736e utf8;
    private int vtable_size;
    private int vtable_start;

    public AbstractC0735d() {
        if (AbstractC0736e.f2574a == null) {
            AbstractC0736e.f2574a = new C0738g();
        }
        this.utf8 = AbstractC0736e.f2574a;
    }

    public static boolean __has_identifier(ByteBuffer byteBuffer, String str) {
        if (str.length() != 4) {
            throw new AssertionError("FlatBuffers: file identifier must be length 4");
        }
        for (int i2 = 0; i2 < 4; i2++) {
            if (str.charAt(i2) != ((char) byteBuffer.get(byteBuffer.position() + 4 + i2))) {
                return false;
            }
        }
        return true;
    }

    public static int compareStrings(int i2, int i3, ByteBuffer byteBuffer) {
        int i4 = byteBuffer.getInt(i2) + i2;
        int i5 = byteBuffer.getInt(i3) + i3;
        int i6 = byteBuffer.getInt(i4);
        int i7 = byteBuffer.getInt(i5);
        int i8 = i4 + 4;
        int i9 = i5 + 4;
        int iMin = Math.min(i6, i7);
        for (int i10 = 0; i10 < iMin; i10++) {
            int i11 = i10 + i8;
            int i12 = i10 + i9;
            if (byteBuffer.get(i11) != byteBuffer.get(i12)) {
                return byteBuffer.get(i11) - byteBuffer.get(i12);
            }
        }
        return i6 - i7;
    }

    public int __indirect(int i2) {
        return this.f2573bb.getInt(i2) + i2;
    }

    public int __offset(int i2) {
        if (i2 < this.vtable_size) {
            return this.f2573bb.getShort(this.vtable_start + i2);
        }
        return 0;
    }

    public void __reset(int i2, ByteBuffer byteBuffer) {
        this.f2573bb = byteBuffer;
        if (byteBuffer == null) {
            this.bb_pos = 0;
            this.vtable_start = 0;
            this.vtable_size = 0;
        } else {
            this.bb_pos = i2;
            int i3 = i2 - byteBuffer.getInt(i2);
            this.vtable_start = i3;
            this.vtable_size = this.f2573bb.getShort(i3);
        }
    }

    public String __string(int i2) {
        return __string(i2, this.f2573bb, this.utf8);
    }

    public AbstractC0735d __union(AbstractC0735d abstractC0735d, int i2) {
        return __union(abstractC0735d, i2, this.f2573bb);
    }

    public int __vector(int i2) {
        int i3 = i2 + this.bb_pos;
        return this.f2573bb.getInt(i3) + i3 + 4;
    }

    public ByteBuffer __vector_as_bytebuffer(int i2, int i3) {
        int i__offset = __offset(i2);
        if (i__offset == 0) {
            return null;
        }
        ByteBuffer byteBufferOrder = this.f2573bb.duplicate().order(ByteOrder.LITTLE_ENDIAN);
        int i__vector = __vector(i__offset);
        byteBufferOrder.position(i__vector);
        byteBufferOrder.limit((__vector_len(i__offset) * i3) + i__vector);
        return byteBufferOrder;
    }

    public ByteBuffer __vector_in_bytebuffer(ByteBuffer byteBuffer, int i2, int i3) {
        int i__offset = __offset(i2);
        if (i__offset == 0) {
            return null;
        }
        int i__vector = __vector(i__offset);
        byteBuffer.rewind();
        byteBuffer.limit((__vector_len(i__offset) * i3) + i__vector);
        byteBuffer.position(i__vector);
        return byteBuffer;
    }

    public int __vector_len(int i2) {
        int i3 = i2 + this.bb_pos;
        return this.f2573bb.getInt(this.f2573bb.getInt(i3) + i3);
    }

    public ByteBuffer getByteBuffer() {
        return this.f2573bb;
    }

    public int keysCompare(Integer num, Integer num2, ByteBuffer byteBuffer) {
        return 0;
    }

    public void sortTables(int[] iArr, ByteBuffer byteBuffer) {
        Integer[] numArr = new Integer[iArr.length];
        for (int i2 = 0; i2 < iArr.length; i2++) {
            numArr[i2] = Integer.valueOf(iArr[i2]);
        }
        Arrays.sort(numArr, new C0734c(this, byteBuffer));
        for (int i3 = 0; i3 < iArr.length; i3++) {
            iArr[i3] = numArr[i3].intValue();
        }
    }

    public static int __indirect(int i2, ByteBuffer byteBuffer) {
        return byteBuffer.getInt(i2) + i2;
    }

    public static int __offset(int i2, int i3, ByteBuffer byteBuffer) {
        int iCapacity = byteBuffer.capacity() - i3;
        return byteBuffer.getShort((i2 + iCapacity) - byteBuffer.getInt(iCapacity)) + iCapacity;
    }

    public static String __string(int i2, ByteBuffer byteBuffer, AbstractC0736e abstractC0736e) {
        int i3 = byteBuffer.getInt(i2) + i2;
        int i4 = byteBuffer.getInt(i3);
        int i5 = i3 + 4;
        ((C0738g) abstractC0736e).getClass();
        if (!byteBuffer.hasArray()) {
            if ((i5 | i4 | ((byteBuffer.limit() - i5) - i4)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i5), Integer.valueOf(i4)));
            }
            int i6 = i5 + i4;
            char[] cArr = new char[i4];
            int i7 = 0;
            while (i5 < i6) {
                byte b2 = byteBuffer.get(i5);
                if (!AbstractC0358S.m857G(b2)) {
                    break;
                }
                i5++;
                cArr[i7] = (char) b2;
                i7++;
            }
            int i8 = i7;
            while (i5 < i6) {
                int i9 = i5 + 1;
                byte b3 = byteBuffer.get(i5);
                if (AbstractC0358S.m857G(b3)) {
                    int i10 = i8 + 1;
                    cArr[i8] = (char) b3;
                    while (i9 < i6) {
                        byte b4 = byteBuffer.get(i9);
                        if (!AbstractC0358S.m857G(b4)) {
                            break;
                        }
                        i9++;
                        cArr[i10] = (char) b4;
                        i10++;
                    }
                    i8 = i10;
                    i5 = i9;
                } else if (b3 < -32) {
                    if (i9 >= i6) {
                        throw new IllegalArgumentException("Invalid UTF-8");
                    }
                    i5 += 2;
                    AbstractC0358S.m853C(b3, byteBuffer.get(i9), cArr, i8);
                    i8++;
                } else if (b3 < -16) {
                    if (i9 >= i6 - 1) {
                        throw new IllegalArgumentException("Invalid UTF-8");
                    }
                    int i11 = i5 + 2;
                    i5 += 3;
                    AbstractC0358S.m852B(b3, byteBuffer.get(i9), byteBuffer.get(i11), cArr, i8);
                    i8++;
                } else {
                    if (i9 >= i6 - 2) {
                        throw new IllegalArgumentException("Invalid UTF-8");
                    }
                    byte b5 = byteBuffer.get(i9);
                    int i12 = i5 + 3;
                    byte b6 = byteBuffer.get(i5 + 2);
                    i5 += 4;
                    AbstractC0358S.m851A(b3, b5, b6, byteBuffer.get(i12), cArr, i8);
                    i8 += 2;
                }
            }
            return new String(cArr, 0, i8);
        }
        byte[] bArrArray = byteBuffer.array();
        int iArrayOffset = byteBuffer.arrayOffset() + i5;
        if ((iArrayOffset | i4 | ((bArrArray.length - iArrayOffset) - i4)) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArrArray.length), Integer.valueOf(iArrayOffset), Integer.valueOf(i4)));
        }
        int i13 = iArrayOffset + i4;
        char[] cArr2 = new char[i4];
        int i14 = 0;
        while (iArrayOffset < i13) {
            byte b7 = bArrArray[iArrayOffset];
            if (!AbstractC0358S.m857G(b7)) {
                break;
            }
            iArrayOffset++;
            cArr2[i14] = (char) b7;
            i14++;
        }
        int i15 = i14;
        while (iArrayOffset < i13) {
            int i16 = iArrayOffset + 1;
            byte b8 = bArrArray[iArrayOffset];
            if (AbstractC0358S.m857G(b8)) {
                int i17 = i15 + 1;
                cArr2[i15] = (char) b8;
                while (i16 < i13) {
                    byte b9 = bArrArray[i16];
                    if (!AbstractC0358S.m857G(b9)) {
                        break;
                    }
                    i16++;
                    cArr2[i17] = (char) b9;
                    i17++;
                }
                i15 = i17;
                iArrayOffset = i16;
            } else if (b8 < -32) {
                if (i16 >= i13) {
                    throw new IllegalArgumentException("Invalid UTF-8");
                }
                iArrayOffset += 2;
                AbstractC0358S.m853C(b8, bArrArray[i16], cArr2, i15);
                i15++;
            } else if (b8 < -16) {
                if (i16 >= i13 - 1) {
                    throw new IllegalArgumentException("Invalid UTF-8");
                }
                int i18 = iArrayOffset + 2;
                iArrayOffset += 3;
                AbstractC0358S.m852B(b8, bArrArray[i16], bArrArray[i18], cArr2, i15);
                i15++;
            } else {
                if (i16 >= i13 - 2) {
                    throw new IllegalArgumentException("Invalid UTF-8");
                }
                byte b10 = bArrArray[i16];
                int i19 = iArrayOffset + 3;
                byte b11 = bArrArray[iArrayOffset + 2];
                iArrayOffset += 4;
                AbstractC0358S.m851A(b8, b10, b11, bArrArray[i19], cArr2, i15);
                i15 += 2;
            }
        }
        return new String(cArr2, 0, i15);
    }

    public static AbstractC0735d __union(AbstractC0735d abstractC0735d, int i2, ByteBuffer byteBuffer) {
        abstractC0735d.__reset(__indirect(i2, byteBuffer), byteBuffer);
        return abstractC0735d;
    }

    public static int compareStrings(int i2, byte[] bArr, ByteBuffer byteBuffer) {
        int i3 = byteBuffer.getInt(i2) + i2;
        int i4 = byteBuffer.getInt(i3);
        int length = bArr.length;
        int i5 = i3 + 4;
        int iMin = Math.min(i4, length);
        for (int i6 = 0; i6 < iMin; i6++) {
            int i7 = i6 + i5;
            if (byteBuffer.get(i7) != bArr[i6]) {
                return byteBuffer.get(i7) - bArr[i6];
            }
        }
        return i4 - length;
    }

    public void __reset() {
        __reset(0, null);
    }
}
