package p206n2;

import com.bumptech.glide.AbstractC1925g;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: n2.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2691c {

    /* JADX INFO: renamed from: a */
    public int f8591a;

    /* JADX INFO: renamed from: b */
    public ByteBuffer f8592b;

    /* JADX INFO: renamed from: c */
    public int f8593c;

    /* JADX INFO: renamed from: d */
    public int f8594d;

    /* JADX INFO: renamed from: e */
    public final C2689a f8595e = C2689a.m4670a();

    /* JADX INFO: renamed from: a */
    public final int m4684a(int i5) {
        return this.f8592b.getInt(i5) + i5;
    }

    /* JADX INFO: renamed from: b */
    public final int m4685b(int i5) {
        if (i5 < this.f8594d) {
            return this.f8592b.getShort(this.f8593c + i5);
        }
        return 0;
    }

    /* JADX INFO: renamed from: c */
    public final void m4686c(int i5, ByteBuffer byteBuffer) {
        this.f8592b = byteBuffer;
        if (byteBuffer == null) {
            this.f8591a = 0;
            this.f8593c = 0;
            this.f8594d = 0;
        } else {
            this.f8591a = i5;
            int i6 = i5 - byteBuffer.getInt(i5);
            this.f8593c = i6;
            this.f8594d = this.f8592b.getShort(i6);
        }
    }

    /* JADX INFO: renamed from: d */
    public final String m4687d(int i5) {
        ByteBuffer byteBuffer = this.f8592b;
        int i6 = byteBuffer.getInt(i5) + i5;
        int i7 = byteBuffer.getInt(i6);
        int i8 = i6 + 4;
        this.f8595e.getClass();
        if (!byteBuffer.hasArray()) {
            if ((i8 | i7 | ((byteBuffer.limit() - i8) - i7)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i8), Integer.valueOf(i7)));
            }
            int i9 = i8 + i7;
            char[] cArr = new char[i7];
            int i10 = 0;
            while (i8 < i9) {
                byte b2 = byteBuffer.get(i8);
                if (b2 < 0) {
                    break;
                }
                i8++;
                cArr[i10] = (char) b2;
                i10++;
            }
            int i11 = i10;
            while (i8 < i9) {
                int i12 = i8 + 1;
                byte b5 = byteBuffer.get(i8);
                if (b5 >= 0) {
                    int i13 = i11 + 1;
                    cArr[i11] = (char) b5;
                    while (i12 < i9) {
                        byte b6 = byteBuffer.get(i12);
                        if (b6 < 0) {
                            break;
                        }
                        i12++;
                        cArr[i13] = (char) b6;
                        i13++;
                    }
                    i11 = i13;
                    i8 = i12;
                } else if (b5 < -32) {
                    if (i12 >= i9) {
                        throw new IllegalArgumentException("Invalid UTF-8");
                    }
                    i8 += 2;
                    AbstractC1925g.m3543t(b5, byteBuffer.get(i12), cArr, i11);
                    i11++;
                } else if (b5 < -16) {
                    if (i12 >= i9 - 1) {
                        throw new IllegalArgumentException("Invalid UTF-8");
                    }
                    int i14 = i8 + 2;
                    i8 += 3;
                    AbstractC1925g.m3542s(b5, byteBuffer.get(i12), byteBuffer.get(i14), cArr, i11);
                    i11++;
                } else {
                    if (i12 >= i9 - 2) {
                        throw new IllegalArgumentException("Invalid UTF-8");
                    }
                    byte b7 = byteBuffer.get(i12);
                    int i15 = i8 + 3;
                    byte b8 = byteBuffer.get(i8 + 2);
                    i8 += 4;
                    AbstractC1925g.m3541r(b5, b7, b8, byteBuffer.get(i15), cArr, i11);
                    i11 += 2;
                }
            }
            return new String(cArr, 0, i11);
        }
        byte[] bArrArray = byteBuffer.array();
        int iArrayOffset = byteBuffer.arrayOffset() + i8;
        if ((iArrayOffset | i7 | ((bArrArray.length - iArrayOffset) - i7)) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArrArray.length), Integer.valueOf(iArrayOffset), Integer.valueOf(i7)));
        }
        int i16 = iArrayOffset + i7;
        char[] cArr2 = new char[i7];
        int i17 = 0;
        while (iArrayOffset < i16) {
            byte b9 = bArrArray[iArrayOffset];
            if (b9 < 0) {
                break;
            }
            iArrayOffset++;
            cArr2[i17] = (char) b9;
            i17++;
        }
        int i18 = i17;
        while (iArrayOffset < i16) {
            int i19 = iArrayOffset + 1;
            byte b10 = bArrArray[iArrayOffset];
            if (b10 >= 0) {
                int i20 = i18 + 1;
                cArr2[i18] = (char) b10;
                while (i19 < i16) {
                    byte b11 = bArrArray[i19];
                    if (b11 < 0) {
                        break;
                    }
                    i19++;
                    cArr2[i20] = (char) b11;
                    i20++;
                }
                i18 = i20;
                iArrayOffset = i19;
            } else if (b10 < -32) {
                if (i19 >= i16) {
                    throw new IllegalArgumentException("Invalid UTF-8");
                }
                iArrayOffset += 2;
                AbstractC1925g.m3543t(b10, bArrArray[i19], cArr2, i18);
                i18++;
            } else if (b10 < -16) {
                if (i19 >= i16 - 1) {
                    throw new IllegalArgumentException("Invalid UTF-8");
                }
                int i21 = iArrayOffset + 2;
                iArrayOffset += 3;
                AbstractC1925g.m3542s(b10, bArrArray[i19], bArrArray[i21], cArr2, i18);
                i18++;
            } else {
                if (i19 >= i16 - 2) {
                    throw new IllegalArgumentException("Invalid UTF-8");
                }
                byte b12 = bArrArray[i19];
                int i22 = iArrayOffset + 3;
                byte b13 = bArrArray[iArrayOffset + 2];
                iArrayOffset += 4;
                AbstractC1925g.m3541r(b10, b12, b13, bArrArray[i22], cArr2, i18);
                i18 += 2;
            }
        }
        return new String(cArr2, 0, i18);
    }

    /* JADX INFO: renamed from: e */
    public final int m4688e(int i5) {
        int i6 = i5 + this.f8591a;
        return this.f8592b.getInt(i6) + i6 + 4;
    }

    /* JADX INFO: renamed from: f */
    public final int m4689f(int i5) {
        int i6 = i5 + this.f8591a;
        return this.f8592b.getInt(this.f8592b.getInt(i6) + i6);
    }
}
