package p000;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* JADX INFO: renamed from: od */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0367od {

    /* JADX INFO: renamed from: bb */
    protected ByteBuffer f662bb;
    protected int bb_pos;
    AbstractC0570zd utf8;
    private int vtable_size;
    private int vtable_start;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractC0367od() {
        if (AbstractC0570zd.f1165a == null) {
            AbstractC0570zd.f1165a = new C0031be();
        }
        this.utf8 = AbstractC0570zd.f1165a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean __has_identifier(ByteBuffer byteBuffer, String str) {
        if (str.length() != 4) {
            throw new AssertionError("FlatBuffers: file identifier must be length 4");
        }
        for (int i = 0; i < 4; i++) {
            if (str.charAt(i) != ((char) byteBuffer.get(byteBuffer.position() + 4 + i))) {
                return false;
            }
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int __offset(int i, int i2, ByteBuffer byteBuffer) {
        int iCapacity = byteBuffer.capacity() - i2;
        return byteBuffer.getShort((i + iCapacity) - byteBuffer.getInt(iCapacity)) + iCapacity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String __string(int i, ByteBuffer byteBuffer, AbstractC0570zd abstractC0570zd) {
        int i2 = byteBuffer.getInt(i) + i;
        int i3 = byteBuffer.getInt(i2);
        int i4 = i2 + 4;
        ((C0031be) abstractC0570zd).getClass();
        if (!byteBuffer.hasArray()) {
            if ((i4 | i3 | ((byteBuffer.limit() - i4) - i3)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i4), Integer.valueOf(i3)));
            }
            int i5 = i4 + i3;
            char[] cArr = new char[i3];
            int i6 = 0;
            while (i4 < i5) {
                byte b = byteBuffer.get(i4);
                if (b < 0) {
                    break;
                }
                i4++;
                cArr[i6] = (char) b;
                i6++;
            }
            int i7 = i6;
            while (i4 < i5) {
                int i8 = i4 + 1;
                byte b2 = byteBuffer.get(i4);
                if (b2 >= 0) {
                    int i9 = i7 + 1;
                    cArr[i7] = (char) b2;
                    while (i8 < i5) {
                        byte b3 = byteBuffer.get(i8);
                        if (b3 < 0) {
                            break;
                        }
                        i8++;
                        cArr[i9] = (char) b3;
                        i9++;
                    }
                    i7 = i9;
                    i4 = i8;
                } else if (b2 < -32) {
                    if (i8 >= i5) {
                        throw new IllegalArgumentException("Invalid UTF-8");
                    }
                    i4 += 2;
                    AbstractC0486u9.m1058k(b2, byteBuffer.get(i8), cArr, i7);
                    i7++;
                } else if (b2 < -16) {
                    if (i8 >= i5 - 1) {
                        throw new IllegalArgumentException("Invalid UTF-8");
                    }
                    int i10 = i4 + 2;
                    i4 += 3;
                    AbstractC0486u9.m1057j(b2, byteBuffer.get(i8), byteBuffer.get(i10), cArr, i7);
                    i7++;
                } else {
                    if (i8 >= i5 - 2) {
                        throw new IllegalArgumentException("Invalid UTF-8");
                    }
                    byte b4 = byteBuffer.get(i8);
                    int i11 = i4 + 3;
                    byte b5 = byteBuffer.get(i4 + 2);
                    i4 += 4;
                    AbstractC0486u9.m1056i(b2, b4, b5, byteBuffer.get(i11), cArr, i7);
                    i7 += 2;
                }
            }
            return new String(cArr, 0, i7);
        }
        byte[] bArrArray = byteBuffer.array();
        int iArrayOffset = byteBuffer.arrayOffset() + i4;
        if ((iArrayOffset | i3 | ((bArrArray.length - iArrayOffset) - i3)) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArrArray.length), Integer.valueOf(iArrayOffset), Integer.valueOf(i3)));
        }
        int i12 = iArrayOffset + i3;
        char[] cArr2 = new char[i3];
        int i13 = 0;
        while (iArrayOffset < i12) {
            byte b6 = bArrArray[iArrayOffset];
            if (b6 < 0) {
                break;
            }
            iArrayOffset++;
            cArr2[i13] = (char) b6;
            i13++;
        }
        int i14 = i13;
        while (iArrayOffset < i12) {
            int i15 = iArrayOffset + 1;
            byte b7 = bArrArray[iArrayOffset];
            if (b7 >= 0) {
                int i16 = i14 + 1;
                cArr2[i14] = (char) b7;
                while (i15 < i12) {
                    byte b8 = bArrArray[i15];
                    if (b8 < 0) {
                        break;
                    }
                    i15++;
                    cArr2[i16] = (char) b8;
                    i16++;
                }
                i14 = i16;
                iArrayOffset = i15;
            } else if (b7 < -32) {
                if (i15 >= i12) {
                    throw new IllegalArgumentException("Invalid UTF-8");
                }
                iArrayOffset += 2;
                AbstractC0486u9.m1058k(b7, bArrArray[i15], cArr2, i14);
                i14++;
            } else if (b7 < -16) {
                if (i15 >= i12 - 1) {
                    throw new IllegalArgumentException("Invalid UTF-8");
                }
                int i17 = iArrayOffset + 2;
                iArrayOffset += 3;
                AbstractC0486u9.m1057j(b7, bArrArray[i15], bArrArray[i17], cArr2, i14);
                i14++;
            } else {
                if (i15 >= i12 - 2) {
                    throw new IllegalArgumentException("Invalid UTF-8");
                }
                byte b9 = bArrArray[i15];
                int i18 = iArrayOffset + 3;
                byte b10 = bArrArray[iArrayOffset + 2];
                iArrayOffset += 4;
                AbstractC0486u9.m1056i(b7, b9, b10, bArrArray[i18], cArr2, i14);
                i14 += 2;
            }
        }
        return new String(cArr2, 0, i14);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static AbstractC0367od __union(AbstractC0367od abstractC0367od, int i, ByteBuffer byteBuffer) {
        abstractC0367od.__reset(__indirect(i, byteBuffer), byteBuffer);
        return abstractC0367od;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int compareStrings(int i, int i2, ByteBuffer byteBuffer) {
        int i3 = byteBuffer.getInt(i) + i;
        int i4 = byteBuffer.getInt(i2) + i2;
        int i5 = byteBuffer.getInt(i3);
        int i6 = byteBuffer.getInt(i4);
        int i7 = i3 + 4;
        int i8 = i4 + 4;
        int iMin = Math.min(i5, i6);
        for (int i9 = 0; i9 < iMin; i9++) {
            int i10 = i9 + i7;
            int i11 = i9 + i8;
            if (byteBuffer.get(i10) != byteBuffer.get(i11)) {
                return byteBuffer.get(i10) - byteBuffer.get(i11);
            }
        }
        return i5 - i6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int __indirect(int i) {
        return this.f662bb.getInt(i) + i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void __reset(int i, ByteBuffer byteBuffer) {
        this.f662bb = byteBuffer;
        if (byteBuffer == null) {
            this.bb_pos = 0;
            this.vtable_start = 0;
            this.vtable_size = 0;
        } else {
            this.bb_pos = i;
            int i2 = i - byteBuffer.getInt(i);
            this.vtable_start = i2;
            this.vtable_size = this.f662bb.getShort(i2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int __vector(int i) {
        int i2 = i + this.bb_pos;
        return this.f662bb.getInt(i2) + i2 + 4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ByteBuffer __vector_as_bytebuffer(int i, int i2) {
        int i__offset = __offset(i);
        if (i__offset == 0) {
            return null;
        }
        ByteBuffer byteBufferOrder = this.f662bb.duplicate().order(ByteOrder.LITTLE_ENDIAN);
        int i__vector = __vector(i__offset);
        byteBufferOrder.position(i__vector);
        byteBufferOrder.limit((__vector_len(i__offset) * i2) + i__vector);
        return byteBufferOrder;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ByteBuffer __vector_in_bytebuffer(ByteBuffer byteBuffer, int i, int i2) {
        int i__offset = __offset(i);
        if (i__offset == 0) {
            return null;
        }
        int i__vector = __vector(i__offset);
        byteBuffer.rewind();
        byteBuffer.limit((__vector_len(i__offset) * i2) + i__vector);
        byteBuffer.position(i__vector);
        return byteBuffer;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int __vector_len(int i) {
        int i2 = i + this.bb_pos;
        return this.f662bb.getInt(this.f662bb.getInt(i2) + i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ByteBuffer getByteBuffer() {
        return this.f662bb;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int keysCompare(Integer num, Integer num2, ByteBuffer byteBuffer) {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void sortTables(int[] iArr, ByteBuffer byteBuffer) {
        Integer[] numArr = new Integer[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            numArr[i] = Integer.valueOf(iArr[i]);
        }
        Arrays.sort(numArr, new C0351nd(this, byteBuffer));
        for (int i2 = 0; i2 < iArr.length; i2++) {
            iArr[i2] = numArr[i2].intValue();
        }
    }

    public static int __indirect(int i, ByteBuffer byteBuffer) {
        return byteBuffer.getInt(i) + i;
    }

    public AbstractC0367od __union(AbstractC0367od abstractC0367od, int i) {
        return __union(abstractC0367od, i, this.f662bb);
    }

    public int __offset(int i) {
        if (i < this.vtable_size) {
            return this.f662bb.getShort(this.vtable_start + i);
        }
        return 0;
    }

    public void __reset() {
        __reset(0, null);
    }

    public static int compareStrings(int i, byte[] bArr, ByteBuffer byteBuffer) {
        int i2 = byteBuffer.getInt(i) + i;
        int i3 = byteBuffer.getInt(i2);
        int length = bArr.length;
        int i4 = i2 + 4;
        int iMin = Math.min(i3, length);
        for (int i5 = 0; i5 < iMin; i5++) {
            int i6 = i5 + i4;
            if (byteBuffer.get(i6) != bArr[i5]) {
                return byteBuffer.get(i6) - bArr[i5];
            }
        }
        return i3 - length;
    }

    public String __string(int i) {
        return __string(i, this.f662bb, this.utf8);
    }
}
