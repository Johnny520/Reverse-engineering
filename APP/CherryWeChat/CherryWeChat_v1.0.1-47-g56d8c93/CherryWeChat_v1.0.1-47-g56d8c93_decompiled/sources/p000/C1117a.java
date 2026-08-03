package p000;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: a */
/* JADX INFO: loaded from: classes.dex */
public final class C1117a {

    /* JADX INFO: renamed from: a */
    public int f3525a;

    /* JADX INFO: renamed from: b */
    public ByteBuffer f3526b;

    /* JADX INFO: renamed from: c */
    public int f3527c;

    /* JADX INFO: renamed from: d */
    public int f3528d;

    /* JADX INFO: renamed from: e */
    public final C1517hw f3529e;

    public C1117a() {
        if (C1517hw.f5366b == null) {
            C1517hw.f5366b = new C1517hw(19);
        }
        this.f3529e = C1517hw.f5366b;
    }

    /* JADX INFO: renamed from: a */
    public final int m2032a(int i) {
        return this.f3526b.getInt(i) + i;
    }

    /* JADX INFO: renamed from: b */
    public final int m2033b(int i) {
        if (i < this.f3528d) {
            return this.f3526b.getShort(this.f3527c + i);
        }
        return 0;
    }

    /* JADX INFO: renamed from: c */
    public final void m2034c(int i, ByteBuffer byteBuffer) {
        this.f3526b = byteBuffer;
        if (byteBuffer == null) {
            this.f3525a = 0;
            this.f3527c = 0;
            this.f3528d = 0;
        } else {
            this.f3525a = i;
            int i2 = i - byteBuffer.getInt(i);
            this.f3527c = i2;
            this.f3528d = this.f3526b.getShort(i2);
        }
    }

    /* JADX INFO: renamed from: d */
    public final String m2035d(int i) {
        ByteBuffer byteBuffer = this.f3526b;
        int i2 = byteBuffer.getInt(i) + i;
        int i3 = byteBuffer.getInt(i2);
        int i4 = i2 + 4;
        this.f3529e.getClass();
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
                    AbstractC0585Nj.m1124C(b2, byteBuffer.get(i8), cArr, i7);
                    i7++;
                } else if (b2 < -16) {
                    if (i8 >= i5 - 1) {
                        throw new IllegalArgumentException("Invalid UTF-8");
                    }
                    int i10 = i4 + 2;
                    i4 += 3;
                    AbstractC0585Nj.m1123B(b2, byteBuffer.get(i8), byteBuffer.get(i10), cArr, i7);
                    i7++;
                } else {
                    if (i8 >= i5 - 2) {
                        throw new IllegalArgumentException("Invalid UTF-8");
                    }
                    byte b4 = byteBuffer.get(i8);
                    int i11 = i4 + 3;
                    byte b5 = byteBuffer.get(i4 + 2);
                    i4 += 4;
                    AbstractC0585Nj.m1122A(b2, b4, b5, byteBuffer.get(i11), cArr, i7);
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
                AbstractC0585Nj.m1124C(b7, bArrArray[i15], cArr2, i14);
                i14++;
            } else if (b7 < -16) {
                if (i15 >= i12 - 1) {
                    throw new IllegalArgumentException("Invalid UTF-8");
                }
                int i17 = iArrayOffset + 2;
                iArrayOffset += 3;
                AbstractC0585Nj.m1123B(b7, bArrArray[i15], bArrArray[i17], cArr2, i14);
                i14++;
            } else {
                if (i15 >= i12 - 2) {
                    throw new IllegalArgumentException("Invalid UTF-8");
                }
                byte b9 = bArrArray[i15];
                int i18 = iArrayOffset + 3;
                byte b10 = bArrArray[iArrayOffset + 2];
                iArrayOffset += 4;
                AbstractC0585Nj.m1122A(b7, b9, b10, bArrArray[i18], cArr2, i14);
                i14 += 2;
            }
        }
        return new String(cArr2, 0, i14);
    }

    /* JADX INFO: renamed from: e */
    public final int m2036e(int i) {
        int i2 = i + this.f3525a;
        return this.f3526b.getInt(i2) + i2 + 4;
    }

    /* JADX INFO: renamed from: f */
    public final int m2037f(int i) {
        int i2 = i + this.f3525a;
        return this.f3526b.getInt(this.f3526b.getInt(i2) + i2);
    }

    /* JADX INFO: renamed from: g */
    public C1117a m2038g(int i) {
        C1117a c1117a = new C1117a();
        int iM2033b = m2033b(4);
        if (iM2033b == 0) {
            return null;
        }
        c1117a.m2034c(m2032a((i * 4) + m2036e(iM2033b)), this.f3526b);
        return c1117a;
    }
}
