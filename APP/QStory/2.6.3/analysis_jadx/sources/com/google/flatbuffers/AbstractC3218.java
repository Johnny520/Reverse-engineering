package com.google.flatbuffers;

import com.bumptech.glide.AbstractC3056;
import java.nio.ByteBuffer;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: com.google.flatbuffers.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3218 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C3220 f10851 = C3220.m7307();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public int f10852;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public int f10853;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public ByteBuffer f10854;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public int f10855;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final int m7285(int i) {
        int i2 = i + this.f10855;
        return this.f10854.getInt(this.f10854.getInt(i2) + i2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final int m7286(int i) {
        int i2 = i + this.f10855;
        return this.f10854.getInt(i2) + i2 + 4;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final String m7287(int i) {
        ByteBuffer byteBuffer = this.f10854;
        int i2 = byteBuffer.getInt(i) + i;
        int i3 = byteBuffer.getInt(i2);
        int i4 = i2 + 4;
        this.f10851.getClass();
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
                        C5925.m11310("Invalid UTF-8");
                        return null;
                    }
                    i4 += 2;
                    AbstractC3056.m6690(b2, byteBuffer.get(i8), cArr, i7);
                    i7++;
                } else if (b2 < -16) {
                    if (i8 >= i5 - 1) {
                        C5925.m11310("Invalid UTF-8");
                        return null;
                    }
                    int i10 = i4 + 2;
                    i4 += 3;
                    AbstractC3056.m6691(b2, byteBuffer.get(i8), byteBuffer.get(i10), cArr, i7);
                    i7++;
                } else {
                    if (i8 >= i5 - 2) {
                        C5925.m11310("Invalid UTF-8");
                        return null;
                    }
                    byte b4 = byteBuffer.get(i8);
                    int i11 = i4 + 3;
                    byte b5 = byteBuffer.get(i4 + 2);
                    i4 += 4;
                    AbstractC3056.m6692(b2, b4, b5, byteBuffer.get(i11), cArr, i7);
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
                    C5925.m11310("Invalid UTF-8");
                    return null;
                }
                iArrayOffset += 2;
                AbstractC3056.m6690(b7, bArrArray[i15], cArr2, i14);
                i14++;
            } else if (b7 < -16) {
                if (i15 >= i12 - 1) {
                    C5925.m11310("Invalid UTF-8");
                    return null;
                }
                int i17 = iArrayOffset + 2;
                iArrayOffset += 3;
                AbstractC3056.m6691(b7, bArrArray[i15], bArrArray[i17], cArr2, i14);
                i14++;
            } else {
                if (i15 >= i12 - 2) {
                    C5925.m11310("Invalid UTF-8");
                    return null;
                }
                byte b9 = bArrArray[i15];
                int i18 = iArrayOffset + 3;
                byte b10 = bArrArray[iArrayOffset + 2];
                iArrayOffset += 4;
                AbstractC3056.m6692(b7, b9, b10, bArrArray[i18], cArr2, i14);
                i14 += 2;
            }
        }
        return new String(cArr2, 0, i14);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m7288(ByteBuffer byteBuffer, int i) {
        this.f10854 = byteBuffer;
        if (byteBuffer == null) {
            this.f10855 = 0;
            this.f10853 = 0;
            this.f10852 = 0;
        } else {
            this.f10855 = i;
            int i2 = i - byteBuffer.getInt(i);
            this.f10853 = i2;
            this.f10852 = this.f10854.getShort(i2);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int m7289(int i) {
        if (i < this.f10852) {
            return this.f10854.getShort(this.f10853 + i);
        }
        return 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int m7290(int i) {
        return this.f10854.getInt(i) + i;
    }
}
