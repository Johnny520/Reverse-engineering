package yyds;

import android.graphics.Bitmap;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: renamed from: yyds.ᛴᛶᲈᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0884 {

    /* JADX INFO: renamed from: ᛱᛳᲇ, reason: contains not printable characters */
    public byte[] f4042;

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public boolean f4043;

    /* JADX INFO: renamed from: ᛲᛲᲈᲈ, reason: contains not printable characters */
    public int f4044;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public int f4045;

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public int f4046;

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final BufferedOutputStream f4047;

    /* JADX INFO: renamed from: ᛳᲁᲁᲇ, reason: contains not printable characters */
    public C1102 f4048;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public int f4049;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public boolean f4050;

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public boolean f4051;

    /* JADX INFO: renamed from: ᛷᛵᲇᲀ, reason: contains not printable characters */
    public int f4052;

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public int f4053;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public int f4054;

    /* JADX INFO: renamed from: ᲇᛱᛲ, reason: contains not printable characters */
    public boolean f4055;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public boolean f4056;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public int f4057;

    public C0884(BufferedOutputStream bufferedOutputStream) {
        AbstractC2328.m4341(-1721443939943278L);
        this.f4047 = bufferedOutputStream;
        this.f4057 = -1;
        this.f4050 = true;
        this.f4045 = 10;
        this.f4053 = -1;
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public static void m1973(C0884 c0884, ArrayList arrayList) {
        AbstractC2328.m4341(-1721461119812462L);
        if (arrayList.isEmpty()) {
            return;
        }
        int iMin = Math.min(arrayList.size(), Integer.MAX_VALUE);
        int size = iMin >= arrayList.size() ? 1 : arrayList.size() / iMin;
        ArrayList arrayList2 = new ArrayList();
        int size2 = arrayList.size() - 1;
        if (size <= 0) {
            C0188.m798(AbstractC0897.m1999(new StringBuilder(AbstractC2328.m4341(-1721491184583534L)), size, '.'));
            return;
        }
        int i = 0;
        int iM3792 = AbstractC1960.m3792(0, size2, size);
        if (iM3792 >= 0) {
            int i2 = 0;
            while (true) {
                Bitmap bitmap = (Bitmap) arrayList.get(i2);
                int width = bitmap.getWidth();
                int height = bitmap.getHeight();
                int i3 = width * height;
                int[] iArr = new int[i3];
                bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
                int iMax = Math.max(1, i3 / 10000);
                int i4 = i3 - 1;
                if (iMax <= 0) {
                    C0188.m798(AbstractC0897.m1999(new StringBuilder(AbstractC2328.m4341(-1721615738635118L)), iMax, '.'));
                    return;
                }
                int iM37922 = AbstractC1960.m3792(i, i4, iMax);
                if (iM37922 >= 0) {
                    int i5 = i;
                    while (true) {
                        int i6 = iArr[i5];
                        int i7 = (i6 >> 24) & 255;
                        if (!c0884.f4051 || i7 >= 128) {
                            arrayList2.add(Integer.valueOf(i6));
                        }
                        if (i5 == iM37922) {
                            break;
                        } else {
                            i5 += iMax;
                        }
                    }
                }
                if (i2 == iM3792) {
                    break;
                }
                i2 += size;
                i = 0;
            }
        }
        if (arrayList2.isEmpty()) {
            c0884.f4042 = new byte[768];
            c0884.f4048 = null;
            c0884.f4055 = true;
            return;
        }
        byte[] bArr = new byte[arrayList2.size() * 3];
        int size3 = arrayList2.size();
        for (int i8 = 0; i8 < size3; i8++) {
            int iIntValue = ((Number) arrayList2.get(i8)).intValue();
            int i9 = i8 * 3;
            bArr[i9] = (byte) (iIntValue & 255);
            bArr[i9 + 1] = (byte) ((iIntValue >> 8) & 255);
            bArr[i9 + 2] = (byte) ((iIntValue >> 16) & 255);
        }
        C1102 c1102 = new C1102(arrayList2.size() * 3, c0884.f4045, 0, bArr);
        byte[] bArrM2306 = c1102.m2306();
        C2536 c2536M1484 = AbstractC0598.m1484(AbstractC0598.m1485(0, 768), 3);
        int i10 = c2536M1484.f12492;
        int i11 = c2536M1484.f12493;
        int i12 = c2536M1484.f12491;
        if ((i12 > 0 && i10 <= i11) || (i12 < 0 && i11 <= i10)) {
            while (true) {
                byte b = bArrM2306[i10];
                int i13 = i10 + 2;
                bArrM2306[i10] = bArrM2306[i13];
                bArrM2306[i13] = b;
                if (i10 == i11) {
                    break;
                } else {
                    i10 += i12;
                }
            }
        }
        if (c0884.f4051) {
            c0884.f4052 = 255;
            int i14 = bArrM2306[765] & 255;
            int i15 = bArrM2306[766] & 255;
            int i16 = bArrM2306[767] & 255;
            int i17 = Integer.MAX_VALUE;
            int i18 = 0;
            for (int i19 = 0; i19 < 256; i19++) {
                if (i19 != 255) {
                    int i20 = i19 * 3;
                    int i21 = (bArrM2306[i20] & 255) - i14;
                    int i22 = (bArrM2306[i20 + 1] & 255) - i15;
                    int i23 = (bArrM2306[i20 + 2] & 255) - i16;
                    int i24 = (i23 * i23) + (i22 * i22) + (i21 * i21);
                    if (i24 < i17) {
                        i18 = i19;
                        i17 = i24;
                    }
                }
            }
            c0884.f4044 = i18;
            int i25 = c0884.f4052 * 3;
            bArrM2306[i25] = 0;
            bArrM2306[i25 + 1] = 0;
            bArrM2306[i25 + 2] = 0;
        }
        c0884.f4042 = bArrM2306;
        c0884.f4048 = c1102;
        c0884.f4055 = true;
    }

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final void m1974() throws IOException {
        BufferedOutputStream bufferedOutputStream = this.f4047;
        bufferedOutputStream.write(33);
        bufferedOutputStream.write(249);
        bufferedOutputStream.write(4);
        int i = this.f4053;
        if (i < 0) {
            i = this.f4051 ? 2 : 0;
        }
        bufferedOutputStream.write((i << 2) | (this.f4051 ? 1 : 0));
        int i2 = this.f4046 / 10;
        m1976(i2 >= 2 ? i2 : 2);
        bufferedOutputStream.write(this.f4051 ? this.f4052 : 0);
        bufferedOutputStream.write(0);
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final void m1975(Bitmap bitmap) {
        AbstractC2328.m4341(-1721830486999918L);
        if (this.f4056) {
            try {
                if (!this.f4043) {
                    this.f4049 = bitmap.getWidth();
                    this.f4054 = bitmap.getHeight();
                    this.f4043 = true;
                }
                int width = bitmap.getWidth();
                int height = bitmap.getHeight();
                int[] iArr = new int[width * height];
                bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
                byte[] bArrM1977 = m1977(iArr);
                boolean z = this.f4050;
                BufferedOutputStream bufferedOutputStream = this.f4047;
                if (z) {
                    m1976(this.f4049);
                    m1976(this.f4054);
                    bufferedOutputStream.write(247);
                    bufferedOutputStream.write(0);
                    bufferedOutputStream.write(0);
                    byte[] bArr = this.f4042;
                    if (bArr != null) {
                        bufferedOutputStream.write(bArr, 0, bArr.length);
                        int length = 768 - bArr.length;
                        for (int i = 0; i < length; i++) {
                            bufferedOutputStream.write(0);
                        }
                    }
                    if (this.f4057 >= 0) {
                        bufferedOutputStream.write(33);
                        bufferedOutputStream.write(255);
                        bufferedOutputStream.write(11);
                        byte[] bytes = AbstractC2328.m4341(-1721860551770990L).getBytes(AbstractC0347.f1806);
                        AbstractC2328.m4341(-1721912091378542L);
                        bufferedOutputStream.write(bytes);
                        bufferedOutputStream.write(3);
                        bufferedOutputStream.write(1);
                        m1976(this.f4057);
                        bufferedOutputStream.write(0);
                    }
                }
                m1974();
                bufferedOutputStream.write(44);
                m1976(0);
                m1976(0);
                m1976(this.f4049);
                m1976(this.f4054);
                bufferedOutputStream.write(0);
                m1978(bArrM1977);
                this.f4050 = false;
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final void m1976(int i) throws IOException {
        BufferedOutputStream bufferedOutputStream = this.f4047;
        bufferedOutputStream.write(i & 255);
        bufferedOutputStream.write((i >> 8) & 255);
    }

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final byte[] m1977(int[] iArr) {
        int length = iArr.length;
        byte[] bArr = new byte[length];
        C1102 c1102 = this.f4048;
        int i = 0;
        if (c1102 != null) {
            if (!this.f4055) {
                byte[] bArr2 = new byte[length];
                int i2 = length * 3;
                byte[] bArr3 = new byte[i2];
                for (int i3 = 0; i3 < length; i3++) {
                    int i4 = iArr[i3];
                    int i5 = i3 * 3;
                    bArr3[i5] = (byte) (i4 & 255);
                    bArr3[i5 + 1] = (byte) ((i4 >> 8) & 255);
                    bArr3[i5 + 2] = (byte) ((i4 >> 16) & 255);
                }
                C1102 c11022 = new C1102(i2, this.f4045, 0, bArr3);
                byte[] bArrM2306 = c11022.m2306();
                C2536 c2536M1484 = AbstractC0598.m1484(AbstractC0598.m1485(0, 768), 3);
                int i6 = c2536M1484.f12492;
                int i7 = c2536M1484.f12493;
                int i8 = c2536M1484.f12491;
                if ((i8 > 0 && i6 <= i7) || (i8 < 0 && i7 <= i6)) {
                    while (true) {
                        byte b = bArrM2306[i6];
                        int i9 = i6 + 2;
                        bArrM2306[i6] = bArrM2306[i9];
                        bArrM2306[i9] = b;
                        if (i6 == i7) {
                            break;
                        }
                        i6 += i8;
                    }
                }
                this.f4042 = bArrM2306;
                while (i < length) {
                    int i10 = iArr[i];
                    bArr2[i] = (byte) c11022.m2305(i10 & 255, (i10 >> 8) & 255, (i10 >> 16) & 255);
                    i++;
                }
                return bArr2;
            }
            while (i < length) {
                int i11 = iArr[i];
                int i12 = (i11 >> 24) & 255;
                if (!this.f4051 || i12 >= 128) {
                    int iM2305 = c1102.m2305(i11 & 255, (i11 >> 8) & 255, (i11 >> 16) & 255);
                    if (this.f4051 && iM2305 == this.f4052) {
                        iM2305 = this.f4044;
                    }
                    bArr[i] = (byte) iM2305;
                } else {
                    bArr[i] = (byte) this.f4052;
                }
                i++;
            }
        } else if (this.f4051) {
            while (i < length) {
                bArr[i] = (byte) this.f4052;
                i++;
            }
        }
        return bArr;
    }

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final void m1978(byte[] bArr) throws IOException {
        int i;
        int[] iArr;
        int i2;
        C0372 c0372 = new C0372(0, bArr);
        AbstractC2328.m4341(-1721431055041390L);
        BufferedOutputStream bufferedOutputStream = this.f4047;
        int i3 = c0372.f1910;
        bufferedOutputStream.write(i3);
        int i4 = i3 + 1;
        c0372.f1909 = i4;
        c0372.f1900 = false;
        c0372.f1913 = i4;
        c0372.f1901 = (1 << i4) - 1;
        int i5 = 1 << i3;
        c0372.f1907 = i5;
        c0372.f1908 = i5 + 1;
        c0372.f1898 = i5 + 2;
        c0372.f1911 = 0;
        int[] iArr2 = c0372.f1904;
        if (iArr2.length == 0) {
            c0372.m1071(i5, bufferedOutputStream);
            c0372.m1071(c0372.f1908, bufferedOutputStream);
        } else {
            int i6 = iArr2[0];
            int i7 = 0;
            for (int i8 = 5003; i8 < 65536; i8 *= 2) {
                i7++;
            }
            int i9 = 8 - i7;
            int i10 = 0;
            while (true) {
                i = -1;
                iArr = c0372.f1912;
                if (i10 >= 5003) {
                    break;
                }
                iArr[i10] = -1;
                i10++;
            }
            c0372.m1071(c0372.f1907, bufferedOutputStream);
            int length = iArr2.length;
            int i11 = 1;
            while (i11 < length) {
                int i12 = iArr2[i11];
                int i13 = (i12 << 12) + i6;
                int i14 = (i12 << i9) ^ i6;
                int i15 = iArr[i14];
                int[] iArr3 = c0372.f1906;
                if (i15 == i13) {
                    i6 = iArr3[i14];
                    i2 = i;
                } else {
                    if (i15 >= 0) {
                        int i16 = 5003 - i14;
                        if (i14 == 0) {
                            i16 = 1;
                        }
                        while (true) {
                            i14 -= i16;
                            if (i14 < 0) {
                                i14 += 5003;
                            }
                            i2 = i;
                            int i17 = iArr[i14];
                            if (i17 == i13) {
                                i6 = iArr3[i14];
                                break;
                            } else if (i17 < 0) {
                                break;
                            } else {
                                i = i2;
                            }
                        }
                    } else {
                        i2 = i;
                    }
                    c0372.m1071(i6, bufferedOutputStream);
                    i6 = iArr2[i11];
                    int i18 = c0372.f1898;
                    if (i18 < 4096) {
                        c0372.f1898 = i18 + 1;
                        iArr3[i14] = i18;
                        iArr[i14] = i13;
                    } else {
                        for (int i19 = 0; i19 < 5003; i19++) {
                            iArr[i19] = i2;
                        }
                        int i20 = c0372.f1907;
                        c0372.f1898 = i20 + 2;
                        c0372.f1900 = true;
                        c0372.m1071(i20, bufferedOutputStream);
                    }
                }
                i11++;
                i = i2;
            }
            c0372.m1071(i6, bufferedOutputStream);
            c0372.m1071(c0372.f1908, bufferedOutputStream);
        }
        bufferedOutputStream.write(0);
    }

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final void m1979() {
        try {
            BufferedOutputStream bufferedOutputStream = this.f4047;
            byte[] bytes = AbstractC2328.m4341(-1721740292686702L).getBytes(AbstractC0347.f1806);
            AbstractC2328.m4341(-1721770357457774L);
            bufferedOutputStream.write(bytes);
            this.f4056 = true;
        } catch (Exception unused) {
            this.f4056 = false;
        }
    }
}
