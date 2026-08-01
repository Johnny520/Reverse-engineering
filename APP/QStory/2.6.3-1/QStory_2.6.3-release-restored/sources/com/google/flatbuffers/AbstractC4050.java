package com.google.flatbuffers;

import com.bumptech.glide.AbstractC3888;
import java.nio.ByteBuffer;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: com.google.flatbuffers.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4050 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C4052 f11196 = C4052.m7866();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public int f11197;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public int f11198;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public ByteBuffer f11199;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public int f11200;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final int m7844(int i) {
        int i2 = i + this.f11200;
        return this.f11199.getInt(this.f11199.getInt(i2) + i2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final int m7845(int i) {
        int i2 = i + this.f11200;
        return this.f11199.getInt(i2) + i2 + 4;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final String m7846(int i) {
        ByteBuffer byteBuffer = this.f11199;
        int i2 = byteBuffer.getInt(i) + i;
        int i3 = byteBuffer.getInt(i2);
        int i4 = i2 + 4;
        this.f11196.getClass();
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
                        C6755.m11869("Invalid UTF-8");
                        return null;
                    }
                    i4 += 2;
                    AbstractC3888.m7250(b2, byteBuffer.get(i8), cArr, i7);
                    i7++;
                } else if (b2 < -16) {
                    if (i8 >= i5 - 1) {
                        C6755.m11869("Invalid UTF-8");
                        return null;
                    }
                    int i10 = i4 + 2;
                    i4 += 3;
                    AbstractC3888.m7251(b2, byteBuffer.get(i8), byteBuffer.get(i10), cArr, i7);
                    i7++;
                } else {
                    if (i8 >= i5 - 2) {
                        C6755.m11869("Invalid UTF-8");
                        return null;
                    }
                    byte b4 = byteBuffer.get(i8);
                    int i11 = i4 + 3;
                    byte b5 = byteBuffer.get(i4 + 2);
                    i4 += 4;
                    AbstractC3888.m7252(b2, b4, b5, byteBuffer.get(i11), cArr, i7);
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
                    C6755.m11869("Invalid UTF-8");
                    return null;
                }
                iArrayOffset += 2;
                AbstractC3888.m7250(b7, bArrArray[i15], cArr2, i14);
                i14++;
            } else if (b7 < -16) {
                if (i15 >= i12 - 1) {
                    C6755.m11869("Invalid UTF-8");
                    return null;
                }
                int i17 = iArrayOffset + 2;
                iArrayOffset += 3;
                AbstractC3888.m7251(b7, bArrArray[i15], bArrArray[i17], cArr2, i14);
                i14++;
            } else {
                if (i15 >= i12 - 2) {
                    C6755.m11869("Invalid UTF-8");
                    return null;
                }
                byte b9 = bArrArray[i15];
                int i18 = iArrayOffset + 3;
                byte b10 = bArrArray[iArrayOffset + 2];
                iArrayOffset += 4;
                AbstractC3888.m7252(b7, b9, b10, bArrArray[i18], cArr2, i14);
                i14 += 2;
            }
        }
        return new String(cArr2, 0, i14);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m7847(ByteBuffer byteBuffer, int i) {
        this.f11199 = byteBuffer;
        if (byteBuffer == null) {
            this.f11200 = 0;
            this.f11198 = 0;
            this.f11197 = 0;
        } else {
            this.f11200 = i;
            int i2 = i - byteBuffer.getInt(i);
            this.f11198 = i2;
            this.f11197 = this.f11199.getShort(i2);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int m7848(int i) {
        if (i < this.f11197) {
            return this.f11199.getShort(this.f11198 + i);
        }
        return 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int m7849(int i) {
        return this.f11199.getInt(i) + i;
    }
}
