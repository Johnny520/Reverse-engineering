package p060d1;

import java.nio.ByteBuffer;
import p006D.AbstractC0079h;
import p027N0.AbstractC0223g;
import p035S.C0245a;

/* JADX INFO: renamed from: d1.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0519a {

    /* JADX INFO: renamed from: a */
    public int f1663a;

    /* JADX INFO: renamed from: b */
    public ByteBuffer f1664b;

    /* JADX INFO: renamed from: c */
    public int f1665c;

    /* JADX INFO: renamed from: d */
    public int f1666d;

    /* JADX INFO: renamed from: e */
    public final C0245a f1667e = C0245a.m460a();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final int m1038a(int i2) {
        return this.f1664b.getInt(i2) + i2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final int m1039b(int i2) {
        if (i2 < this.f1666d) {
            return this.f1664b.getShort(this.f1665c + i2);
        }
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final void m1040c(int i2, ByteBuffer byteBuffer) {
        this.f1664b = byteBuffer;
        if (byteBuffer == null) {
            this.f1663a = 0;
            this.f1665c = 0;
            this.f1666d = 0;
        } else {
            this.f1663a = i2;
            int i3 = i2 - byteBuffer.getInt(i2);
            this.f1665c = i3;
            this.f1666d = this.f1664b.getShort(i3);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final String m1041d(int i2) {
        ByteBuffer byteBuffer = this.f1664b;
        int i3 = byteBuffer.getInt(i2) + i2;
        int i4 = byteBuffer.getInt(i3);
        int i5 = i3 + 4;
        this.f1667e.getClass();
        if (!byteBuffer.hasArray()) {
            if ((i5 | i4 | ((byteBuffer.limit() - i5) - i4)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i5), Integer.valueOf(i4)));
            }
            int i6 = i5 + i4;
            char[] cArr = new char[i4];
            int i7 = 0;
            while (i5 < i6) {
                byte b = byteBuffer.get(i5);
                if (b < 0) {
                    break;
                }
                i5++;
                cArr[i7] = (char) b;
                i7++;
            }
            int i8 = i7;
            while (i5 < i6) {
                int i9 = i5 + 1;
                byte b2 = byteBuffer.get(i5);
                if (b2 >= 0) {
                    int i10 = i8 + 1;
                    cArr[i8] = (char) b2;
                    while (i9 < i6) {
                        byte b3 = byteBuffer.get(i9);
                        if (b3 < 0) {
                            break;
                        }
                        i9++;
                        cArr[i10] = (char) b3;
                        i10++;
                    }
                    i8 = i10;
                    i5 = i9;
                } else if (b2 < -32) {
                    if (i9 >= i6) {
                        throw new IllegalArgumentException("Invalid UTF-8");
                    }
                    i5 += 2;
                    AbstractC0079h.m198z(b2, byteBuffer.get(i9), cArr, i8);
                    i8++;
                } else if (b2 < -16) {
                    if (i9 >= i6 - 1) {
                        throw new IllegalArgumentException("Invalid UTF-8");
                    }
                    int i11 = i5 + 2;
                    i5 += 3;
                    AbstractC0079h.m197y(b2, byteBuffer.get(i9), byteBuffer.get(i11), cArr, i8);
                    i8++;
                } else {
                    if (i9 >= i6 - 2) {
                        throw new IllegalArgumentException("Invalid UTF-8");
                    }
                    byte b4 = byteBuffer.get(i9);
                    int i12 = i5 + 3;
                    byte b5 = byteBuffer.get(i5 + 2);
                    i5 += 4;
                    AbstractC0079h.m196x(b2, b4, b5, byteBuffer.get(i12), cArr, i8);
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
            byte b6 = bArrArray[iArrayOffset];
            if (b6 < 0) {
                break;
            }
            iArrayOffset++;
            cArr2[i14] = (char) b6;
            i14++;
        }
        int i15 = i14;
        while (iArrayOffset < i13) {
            int i16 = iArrayOffset + 1;
            byte b7 = bArrArray[iArrayOffset];
            if (b7 >= 0) {
                int i17 = i15 + 1;
                cArr2[i15] = (char) b7;
                while (i16 < i13) {
                    byte b8 = bArrArray[i16];
                    if (b8 < 0) {
                        break;
                    }
                    i16++;
                    cArr2[i17] = (char) b8;
                    i17++;
                }
                i15 = i17;
                iArrayOffset = i16;
            } else if (b7 < -32) {
                if (i16 >= i13) {
                    throw new IllegalArgumentException("Invalid UTF-8");
                }
                iArrayOffset += 2;
                AbstractC0079h.m198z(b7, bArrArray[i16], cArr2, i15);
                i15++;
            } else if (b7 < -16) {
                if (i16 >= i13 - 1) {
                    throw new IllegalArgumentException("Invalid UTF-8");
                }
                int i18 = iArrayOffset + 2;
                iArrayOffset += 3;
                AbstractC0079h.m197y(b7, bArrArray[i16], bArrArray[i18], cArr2, i15);
                i15++;
            } else {
                if (i16 >= i13 - 2) {
                    throw new IllegalArgumentException("Invalid UTF-8");
                }
                byte b9 = bArrArray[i16];
                int i19 = iArrayOffset + 3;
                byte b10 = bArrArray[iArrayOffset + 2];
                iArrayOffset += 4;
                AbstractC0079h.m196x(b7, b9, b10, bArrArray[i19], cArr2, i15);
                i15 += 2;
            }
        }
        return new String(cArr2, 0, i15);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final int m1042e(int i2) {
        int i3 = i2 + this.f1663a;
        return this.f1664b.getInt(i3) + i3 + 4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final int m1043f(int i2) {
        int i3 = i2 + this.f1663a;
        return this.f1664b.getInt(this.f1664b.getInt(i3) + i3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public C0519a m1044g(int i2) {
        C0519a c0519a = new C0519a();
        int iM1039b = m1039b(4);
        if (iM1039b == 0) {
            return null;
        }
        int iM1038a = m1038a((i2 * 4) + m1042e(iM1039b));
        ByteBuffer byteBuffer = this.f1664b;
        AbstractC0223g.m417d(byteBuffer, "bb");
        c0519a.m1040c(iM1038a, byteBuffer);
        return c0519a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public int m1045h() {
        int iM1039b = m1039b(4);
        if (iM1039b != 0) {
            return m1043f(iM1039b);
        }
        return 0;
    }
}
