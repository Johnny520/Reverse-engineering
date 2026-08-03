package p094g6;

import java.nio.ByteBuffer;
import p129ig.AbstractC2043a;
import p136j8.C2104o;

/* JADX INFO: renamed from: g6.c */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1355c {

    /* JADX INFO: renamed from: a */
    public int f4499a;

    /* JADX INFO: renamed from: b */
    public ByteBuffer f4500b;

    /* JADX INFO: renamed from: c */
    public int f4501c;

    /* JADX INFO: renamed from: d */
    public int f4502d;

    /* JADX INFO: renamed from: e */
    public final C1353a f4503e = C1353a.m3628a();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final int m3644a(int i9) {
        return this.f4500b.getInt(i9) + i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final int m3645b(int i9) {
        if (i9 < this.f4502d) {
            return this.f4500b.getShort(this.f4501c + i9);
        }
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final void m3646c(int i9, ByteBuffer byteBuffer) {
        this.f4500b = byteBuffer;
        if (byteBuffer == null) {
            this.f4499a = 0;
            this.f4501c = 0;
            this.f4502d = 0;
        } else {
            this.f4499a = i9;
            int i10 = i9 - byteBuffer.getInt(i9);
            this.f4501c = i10;
            this.f4502d = this.f4500b.getShort(i10);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final String m3647d(int i9) {
        ByteBuffer byteBuffer = this.f4500b;
        int i10 = byteBuffer.getInt(i9) + i9;
        int i11 = byteBuffer.getInt(i10);
        int i12 = i10 + 4;
        this.f4503e.getClass();
        if (!byteBuffer.hasArray()) {
            if ((i12 | i11 | ((byteBuffer.limit() - i12) - i11)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i12), Integer.valueOf(i11)));
            }
            int i13 = i12 + i11;
            char[] cArr = new char[i11];
            int i14 = 0;
            while (i12 < i13) {
                byte b10 = byteBuffer.get(i12);
                if (b10 < 0) {
                    break;
                }
                i12++;
                cArr[i14] = (char) b10;
                i14++;
            }
            int i15 = i14;
            while (i12 < i13) {
                int i16 = i12 + 1;
                byte b11 = byteBuffer.get(i12);
                if (b11 >= 0) {
                    int i17 = i15 + 1;
                    cArr[i15] = (char) b11;
                    while (i16 < i13) {
                        byte b12 = byteBuffer.get(i16);
                        if (b12 < 0) {
                            break;
                        }
                        i16++;
                        cArr[i17] = (char) b12;
                        i17++;
                    }
                    i15 = i17;
                    i12 = i16;
                } else if (b11 < -32) {
                    if (i16 >= i13) {
                        C2104o.m5294t("Invalid UTF-8");
                        return null;
                    }
                    i12 += 2;
                    AbstractC2043a.m5000F(b11, byteBuffer.get(i16), cArr, i15);
                    i15++;
                } else if (b11 < -16) {
                    if (i16 >= i13 - 1) {
                        C2104o.m5294t("Invalid UTF-8");
                        return null;
                    }
                    int i18 = i12 + 2;
                    i12 += 3;
                    AbstractC2043a.m4999E(b11, byteBuffer.get(i16), byteBuffer.get(i18), cArr, i15);
                    i15++;
                } else {
                    if (i16 >= i13 - 2) {
                        C2104o.m5294t("Invalid UTF-8");
                        return null;
                    }
                    byte b13 = byteBuffer.get(i16);
                    int i19 = i12 + 3;
                    byte b14 = byteBuffer.get(i12 + 2);
                    i12 += 4;
                    AbstractC2043a.m4998D(b11, b13, b14, byteBuffer.get(i19), cArr, i15);
                    i15 += 2;
                }
            }
            return new String(cArr, 0, i15);
        }
        byte[] bArrArray = byteBuffer.array();
        int iArrayOffset = byteBuffer.arrayOffset() + i12;
        if ((iArrayOffset | i11 | ((bArrArray.length - iArrayOffset) - i11)) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArrArray.length), Integer.valueOf(iArrayOffset), Integer.valueOf(i11)));
        }
        int i20 = iArrayOffset + i11;
        char[] cArr2 = new char[i11];
        int i21 = 0;
        while (iArrayOffset < i20) {
            byte b15 = bArrArray[iArrayOffset];
            if (b15 < 0) {
                break;
            }
            iArrayOffset++;
            cArr2[i21] = (char) b15;
            i21++;
        }
        int i22 = i21;
        while (iArrayOffset < i20) {
            int i23 = iArrayOffset + 1;
            byte b16 = bArrArray[iArrayOffset];
            if (b16 >= 0) {
                int i24 = i22 + 1;
                cArr2[i22] = (char) b16;
                while (i23 < i20) {
                    byte b17 = bArrArray[i23];
                    if (b17 < 0) {
                        break;
                    }
                    i23++;
                    cArr2[i24] = (char) b17;
                    i24++;
                }
                i22 = i24;
                iArrayOffset = i23;
            } else if (b16 < -32) {
                if (i23 >= i20) {
                    C2104o.m5294t("Invalid UTF-8");
                    return null;
                }
                iArrayOffset += 2;
                AbstractC2043a.m5000F(b16, bArrArray[i23], cArr2, i22);
                i22++;
            } else if (b16 < -16) {
                if (i23 >= i20 - 1) {
                    C2104o.m5294t("Invalid UTF-8");
                    return null;
                }
                int i25 = iArrayOffset + 2;
                iArrayOffset += 3;
                AbstractC2043a.m4999E(b16, bArrArray[i23], bArrArray[i25], cArr2, i22);
                i22++;
            } else {
                if (i23 >= i20 - 2) {
                    C2104o.m5294t("Invalid UTF-8");
                    return null;
                }
                byte b18 = bArrArray[i23];
                int i26 = iArrayOffset + 3;
                byte b19 = bArrArray[iArrayOffset + 2];
                iArrayOffset += 4;
                AbstractC2043a.m4998D(b16, b18, b19, bArrArray[i26], cArr2, i22);
                i22 += 2;
            }
        }
        return new String(cArr2, 0, i22);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final int m3648e(int i9) {
        int i10 = i9 + this.f4499a;
        return this.f4500b.getInt(i10) + i10 + 4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final int m3649f(int i9) {
        int i10 = i9 + this.f4499a;
        return this.f4500b.getInt(this.f4500b.getInt(i10) + i10);
    }
}
