package p000;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ox2 {

    /* JADX INFO: renamed from: a */
    public int f7868a;

    /* JADX INFO: renamed from: b */
    public ByteBuffer f7869b;

    /* JADX INFO: renamed from: c */
    public int f7870c;

    /* JADX INFO: renamed from: d */
    public int f7871d;

    /* JADX INFO: renamed from: e */
    public final jx2 f7872e = jx2.m2594d();

    /* JADX INFO: renamed from: a */
    public final int m3660a(int i) {
        return this.f7869b.getInt(i) + i;
    }

    /* JADX INFO: renamed from: b */
    public final int m3661b(int i) {
        if (i < this.f7871d) {
            return this.f7869b.getShort(this.f7870c + i);
        }
        return 0;
    }

    /* JADX INFO: renamed from: c */
    public final void m3662c(int i, ByteBuffer byteBuffer) {
        this.f7869b = byteBuffer;
        if (byteBuffer == null) {
            this.f7868a = 0;
            this.f7870c = 0;
            this.f7871d = 0;
        } else {
            this.f7868a = i;
            int i2 = i - byteBuffer.getInt(i);
            this.f7870c = i2;
            this.f7871d = this.f7869b.getShort(i2);
        }
    }

    /* JADX INFO: renamed from: d */
    public final String m3663d(int i) {
        ByteBuffer byteBuffer = this.f7869b;
        int i2 = byteBuffer.getInt(i) + i;
        int i3 = byteBuffer.getInt(i2);
        int i4 = i2 + 4;
        this.f7872e.getClass();
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
                        C0676s.m4651j("Invalid UTF-8");
                        return null;
                    }
                    i4 += 2;
                    gg3.m1913d(b2, byteBuffer.get(i8), cArr, i7);
                    i7++;
                } else if (b2 < -16) {
                    if (i8 >= i5 - 1) {
                        C0676s.m4651j("Invalid UTF-8");
                        return null;
                    }
                    int i10 = i4 + 2;
                    i4 += 3;
                    gg3.m1912c(b2, byteBuffer.get(i8), byteBuffer.get(i10), cArr, i7);
                    i7++;
                } else {
                    if (i8 >= i5 - 2) {
                        C0676s.m4651j("Invalid UTF-8");
                        return null;
                    }
                    byte b4 = byteBuffer.get(i8);
                    int i11 = i4 + 3;
                    byte b5 = byteBuffer.get(i4 + 2);
                    i4 += 4;
                    gg3.m1911b(b2, b4, b5, byteBuffer.get(i11), cArr, i7);
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
                    C0676s.m4651j("Invalid UTF-8");
                    return null;
                }
                iArrayOffset += 2;
                gg3.m1913d(b7, bArrArray[i15], cArr2, i14);
                i14++;
            } else if (b7 < -16) {
                if (i15 >= i12 - 1) {
                    C0676s.m4651j("Invalid UTF-8");
                    return null;
                }
                int i17 = iArrayOffset + 2;
                iArrayOffset += 3;
                gg3.m1912c(b7, bArrArray[i15], bArrArray[i17], cArr2, i14);
                i14++;
            } else {
                if (i15 >= i12 - 2) {
                    C0676s.m4651j("Invalid UTF-8");
                    return null;
                }
                byte b9 = bArrArray[i15];
                int i18 = iArrayOffset + 3;
                byte b10 = bArrArray[iArrayOffset + 2];
                iArrayOffset += 4;
                gg3.m1911b(b7, b9, b10, bArrArray[i18], cArr2, i14);
                i14 += 2;
            }
        }
        return new String(cArr2, 0, i14);
    }

    /* JADX INFO: renamed from: e */
    public final int m3664e(int i) {
        int i2 = i + this.f7868a;
        return this.f7869b.getInt(i2) + i2 + 4;
    }

    /* JADX INFO: renamed from: f */
    public final int m3665f(int i) {
        int i2 = i + this.f7868a;
        return this.f7869b.getInt(this.f7869b.getInt(i2) + i2);
    }
}
