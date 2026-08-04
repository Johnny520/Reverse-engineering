package yyds;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: yyds.ᛶᛷᲀᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1383 {

    /* JADX INFO: renamed from: ᛱᛳᲇ, reason: contains not printable characters */
    public boolean f6430;

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public int f6431;

    /* JADX INFO: renamed from: ᛲᛲᲈᲈ, reason: contains not printable characters */
    public C1102 f6432;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public int f6433;

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public boolean f6434;

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final BufferedOutputStream f6435;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public int f6436;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public boolean f6437;

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public int f6438;

    /* JADX INFO: renamed from: ᛷᛵᲇᲀ, reason: contains not printable characters */
    public byte[] f6439;

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public boolean f6440;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public int f6441;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public boolean f6442;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public int f6443;

    public C1383(BufferedOutputStream bufferedOutputStream) {
        AbstractC2328.m4341(-1734045373989742L);
        this.f6435 = bufferedOutputStream;
        this.f6442 = true;
        this.f6431 = 10;
        this.f6433 = -1;
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public static void m2795(C1383 c1383, List list) {
        int i;
        char c;
        int i2;
        int[] iArr;
        char c2;
        int i3;
        int[][] iArr2;
        int[] iArr3;
        char c3;
        int i4;
        int[] iArr4;
        int[] iArr5;
        AbstractC2328.m4341(-1734062553858926L);
        if (list.isEmpty()) {
            return;
        }
        int iMin = Math.min(list.size(), Integer.MAX_VALUE);
        int i5 = 1;
        int size = iMin >= list.size() ? 1 : list.size() / iMin;
        ArrayList arrayList = new ArrayList();
        int size2 = list.size() - 1;
        if (size <= 0) {
            C0188.m798(AbstractC0897.m1999(new StringBuilder(AbstractC2328.m4341(-1734092618629998L)), size, '.'));
            return;
        }
        int i6 = 0;
        int iM3792 = AbstractC1960.m3792(0, size2, size);
        int i7 = 255;
        if (iM3792 >= 0) {
            int i8 = 0;
            while (true) {
                Bitmap bitmap = (Bitmap) list.get(i8);
                int width = bitmap.getWidth();
                int height = bitmap.getHeight();
                int i9 = width * height;
                int[] iArr6 = new int[i9];
                bitmap.getPixels(iArr6, 0, width, 0, 0, width, height);
                int iMax = Math.max(1, i9 / 10000);
                int i10 = i9 - 1;
                if (iMax <= 0) {
                    C0188.m798(AbstractC0897.m1999(new StringBuilder(AbstractC2328.m4341(-1734217172681582L)), iMax, '.'));
                    return;
                }
                int iM37922 = AbstractC1960.m3792(i6, i10, iMax);
                if (iM37922 >= 0) {
                    int i11 = i6;
                    while (true) {
                        int i12 = iArr6[i11];
                        i = i6;
                        if (!c1383.f6440 || ((i12 >>> 24) & 255) >= 128) {
                            arrayList.add(Integer.valueOf(i12));
                        }
                        if (i11 == iM37922) {
                            break;
                        }
                        i11 += iMax;
                        i6 = i;
                    }
                } else {
                    i = i6;
                }
                if (i8 == iM3792) {
                    break;
                }
                i8 += size;
                i6 = i;
            }
        } else {
            i = 0;
        }
        if (c1383.f6440 && arrayList.isEmpty()) {
            Iterator it = list.iterator();
            loop2: while (it.hasNext()) {
                Bitmap bitmap2 = (Bitmap) it.next();
                int width2 = bitmap2.getWidth();
                int[] iArr7 = new int[width2];
                int height2 = bitmap2.getHeight();
                int i13 = i;
                while (i13 < height2) {
                    int[] iArr8 = iArr7;
                    int i14 = i13;
                    bitmap2.getPixels(iArr8, 0, bitmap2.getWidth(), 0, i14, bitmap2.getWidth(), 1);
                    for (int i15 = i; i15 < width2; i15++) {
                        int i16 = iArr8[i15];
                        if (((i16 >>> 24) & 255) >= 128) {
                            arrayList.add(Integer.valueOf(i16));
                            if (arrayList.size() >= 10000) {
                                break loop2;
                            }
                        }
                    }
                    i13 = i14 + 1;
                    iArr7 = iArr8;
                }
            }
        }
        if (arrayList.isEmpty()) {
            c1383.f6439 = new byte[768];
            c1383.f6432 = null;
            c1383.f6430 = true;
            return;
        }
        int size3 = arrayList.size() * 3;
        byte[] bArr = new byte[size3];
        int size4 = arrayList.size();
        int i17 = i;
        while (true) {
            c = 2;
            if (i17 >= size4) {
                break;
            }
            int iIntValue = ((Number) arrayList.get(i17)).intValue();
            int i18 = i17 * 3;
            bArr[i18] = (byte) (iIntValue & 255);
            bArr[i18 + 1] = (byte) ((iIntValue >> 8) & 255);
            bArr[i18 + 2] = (byte) ((iIntValue >> 16) & 255);
            i17++;
        }
        C1102 c1102 = new C1102(size3, c1383.f6431, 1, bArr);
        int i19 = c1102.f5072;
        int i20 = 1509;
        if (i19 < 1509) {
            c1102.f5074 = 1;
        }
        int i21 = c1102.f5074;
        c1102.f5076 = ((i21 - 1) / 3) + 30;
        int i22 = i19 / (i21 * 3);
        int i23 = i22 / 100;
        int i24 = i;
        while (true) {
            i2 = 256;
            iArr = c1102.f5069;
            c2 = c;
            i3 = 32;
            if (i24 >= 32) {
                break;
            }
            iArr[i24] = (((1024 - (i24 * i24)) * 256) / 1024) * 1024;
            i24++;
            c = c2;
        }
        if (i19 < 1509) {
            i20 = 3;
        } else if (i19 % 499 != 0) {
            i20 = 1497;
        } else if (i19 % 491 != 0) {
            i20 = 1473;
        } else if (i19 % 487 != 0) {
            i20 = 1461;
        }
        int i25 = 2048;
        int i26 = 1024;
        int i27 = i;
        int i28 = i27;
        while (true) {
            iArr2 = c1102.f5070;
            int i29 = i5;
            if (i27 >= i22) {
                break;
            }
            byte[] bArr2 = c1102.f5071;
            int i30 = (bArr2[i28] & i7) << 4;
            int i31 = (bArr2[i28 + 1] & i7) << 4;
            int i32 = (bArr2[i28 + 2] & i7) << 4;
            int i33 = i;
            int i34 = -1;
            int i35 = -1;
            int i36 = Integer.MAX_VALUE;
            int i37 = Integer.MAX_VALUE;
            while (true) {
                iArr4 = c1102.f5068;
                iArr5 = c1102.f5073;
                if (i33 >= i2) {
                    break;
                }
                int[] iArr9 = iArr2[i33];
                int i38 = iArr9[i] - i30;
                if (i38 < 0) {
                    i38 = -i38;
                }
                int i39 = iArr9[i29] - i31;
                if (i39 < 0) {
                    i39 = -i39;
                }
                int i40 = i38 + i39;
                int i41 = iArr9[c2] - i32;
                if (i41 < 0) {
                    i41 = -i41;
                }
                int i42 = i40 + i41;
                int i43 = i36;
                if (i42 < i43) {
                    i34 = i33;
                    i36 = i42;
                } else {
                    i36 = i43;
                }
                int i44 = i42 - (iArr5[i33] >> 12);
                int i45 = i37;
                if (i44 < i45) {
                    i35 = i33;
                    i37 = i44;
                } else {
                    i37 = i45;
                }
                int i46 = iArr4[i33];
                int i47 = i46 >> 10;
                iArr4[i33] = i46 - i47;
                iArr5[i33] = iArr5[i33] + (i47 << 10);
                i33++;
                i2 = 256;
            }
            iArr4[i34] = iArr4[i34] + 64;
            iArr5[i34] = iArr5[i34] - 65536;
            int[] iArr10 = iArr2[i35];
            int i48 = iArr10[i];
            iArr10[i] = i48 - (((i48 - i30) * i26) / 1024);
            int i49 = iArr10[i29];
            iArr10[i29] = i49 - (((i49 - i31) * i26) / 1024);
            int i50 = iArr10[c2];
            iArr10[c2] = i50 - (((i50 - i32) * i26) / 1024);
            if (i3 != 0) {
                int i51 = i35 - i3;
                if (i51 < -1) {
                    i51 = -1;
                }
                int i52 = i35 + i3;
                if (i52 > 256) {
                    i52 = 256;
                }
                int i53 = i35 + 1;
                int i54 = i35 - 1;
                int i55 = i29;
                while (true) {
                    if (i53 >= i52 && i54 <= i51) {
                        break;
                    }
                    int i56 = i55 + 1;
                    int i57 = iArr[i55];
                    if (i53 < i52) {
                        int i58 = i53 + 1;
                        int[] iArr11 = iArr2[i53];
                        try {
                            int i59 = iArr11[i];
                            iArr11[i] = i59 - (((i59 - i30) * i57) / 262144);
                            int i60 = iArr11[i29];
                            iArr11[i29] = i60 - (((i60 - i31) * i57) / 262144);
                            int i61 = iArr11[c2];
                            iArr11[c2] = i61 - (((i61 - i32) * i57) / 262144);
                        } catch (Exception unused) {
                        }
                        i53 = i58;
                    }
                    if (i54 > i51) {
                        int i62 = i54 - 1;
                        int[] iArr12 = iArr2[i54];
                        try {
                            int i63 = iArr12[i];
                            iArr12[i] = i63 - (((i63 - i30) * i57) / 262144);
                            int i64 = iArr12[i29];
                            iArr12[i29] = i64 - (((i64 - i31) * i57) / 262144);
                            int i65 = iArr12[c2];
                            iArr12[c2] = i65 - (((i65 - i32) * i57) / 262144);
                        } catch (Exception unused2) {
                        }
                        i55 = i56;
                        i54 = i62;
                    } else {
                        i55 = i56;
                    }
                }
            }
            int i66 = i28 + i20;
            if (i66 >= i19) {
                i66 -= i19;
            }
            i28 = i66;
            i27++;
            if (i23 == 0) {
                i23 = i29;
            }
            if (i27 % i23 == 0) {
                i26 -= i26 / c1102.f5076;
                i25 -= i25 / 30;
                int i67 = i25 >> 6;
                i3 = i67 <= i29 ? i : i67;
                int i68 = i3 * i3;
                for (int i69 = i; i69 < i3; i69++) {
                    iArr[i69] = (((i68 - (i69 * i69)) * 256) / i68) * i26;
                }
            }
            i5 = 1;
            i7 = 255;
            i2 = 256;
        }
        int i70 = 4;
        int i71 = i;
        while (i71 < i2) {
            int[] iArr13 = iArr2[i71];
            iArr13[i] = iArr13[i] >> 4;
            iArr13[1] = iArr13[1] >> 4;
            iArr13[c2] = iArr13[c2] >> 4;
            iArr13[3] = i71;
            i71++;
            i2 = 256;
        }
        int i72 = i;
        int i73 = i72;
        int i74 = i73;
        while (true) {
            iArr3 = c1102.f5075;
            int i75 = 256;
            if (i72 >= 256) {
                break;
            }
            int[] iArr14 = iArr2[i72];
            char c4 = 1;
            int i76 = iArr14[1];
            int i77 = i72 + 1;
            int i78 = i72;
            int i79 = i77;
            while (i79 < i75) {
                int i80 = iArr2[i79][c4];
                if (i80 < i76) {
                    i78 = i79;
                    i76 = i80;
                }
                i79++;
                i75 = 256;
                c4 = 1;
            }
            int[] iArr15 = iArr2[i78];
            if (i72 != i78) {
                i4 = i70;
                for (int i81 = i; i81 < i4; i81++) {
                    int i82 = iArr15[i81];
                    iArr15[i81] = iArr14[i81];
                    iArr14[i81] = i82;
                }
            } else {
                i4 = i70;
            }
            if (i76 != i73) {
                iArr3[i73] = (i74 + i72) >> 1;
                while (true) {
                    i73++;
                    if (i73 >= i76) {
                        break;
                    } else {
                        iArr3[i73] = i72;
                    }
                }
                i74 = i72;
                i73 = i76;
            }
            i72 = i77;
            i70 = i4;
        }
        int i83 = 255;
        iArr3[i73] = (i74 + 255) >> 1;
        int i84 = i73 + 1;
        while (i84 < 256) {
            iArr3[i84] = i83;
            i84++;
            i83 = 255;
        }
        byte[] bArr3 = new byte[768];
        int[] iArr16 = new int[256];
        for (int i85 = i; i85 < 256; i85++) {
            iArr16[iArr2[i85][3]] = i85;
        }
        int i86 = i;
        int i87 = i86;
        for (int i88 = 256; i86 < i88; i88 = 256) {
            int[] iArr17 = iArr2[iArr16[i86]];
            bArr3[i87] = (byte) iArr17[i];
            int i89 = i87 + 2;
            bArr3[i87 + 1] = (byte) iArr17[1];
            i87 += 3;
            bArr3[i89] = (byte) iArr17[c2];
            i86++;
        }
        char c5 = 767;
        int iM37923 = AbstractC1960.m3792(i, 767, 3);
        if (iM37923 >= 0) {
            int i90 = 0;
            while (true) {
                byte b = bArr3[i90];
                int i91 = i90 + 2;
                bArr3[i90] = bArr3[i91];
                bArr3[i91] = b;
                if (i90 == iM37923) {
                    break;
                } else {
                    i90 += 3;
                }
            }
        }
        if (c1383.f6440) {
            int i92 = bArr3[765] & 255;
            int i93 = bArr3[766] & 255;
            int i94 = bArr3[767] & 255;
            int i95 = Integer.MAX_VALUE;
            int i96 = 0;
            int i97 = 0;
            while (i96 < 256) {
                if (i96 != 255) {
                    int i98 = i96 * 3;
                    int i99 = (bArr3[i98] & 255) - i92;
                    c3 = c5;
                    int i100 = (bArr3[i98 + 1] & 255) - i93;
                    int i101 = (bArr3[i98 + 2] & 255) - i94;
                    int i102 = (i101 * i101) + (i100 * i100) + (i99 * i99);
                    if (i102 < i95) {
                        i97 = i96;
                        i95 = i102;
                    }
                } else {
                    c3 = c5;
                }
                i96++;
                c5 = c3;
            }
            c1383.f6438 = i97;
            bArr3[765] = 0;
            bArr3[766] = 0;
            bArr3[c5] = 0;
        }
        c1383.f6439 = bArr3;
        c1383.f6432 = c1102;
        c1383.f6430 = true;
    }

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final void m2796(int i) throws IOException {
        BufferedOutputStream bufferedOutputStream = this.f6435;
        bufferedOutputStream.write(i & 255);
        bufferedOutputStream.write((i >> 8) & 255);
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final boolean m2797(Bitmap bitmap) {
        AbstractC2328.m4341(-1734371791504238L);
        if (!this.f6434) {
            C0188.m800(AbstractC2328.m4341(-1734401856275310L));
            return false;
        }
        try {
            if (!this.f6437) {
                int width = bitmap.getWidth();
                int height = bitmap.getHeight();
                if (width < 1) {
                    width = 320;
                }
                this.f6436 = width;
                if (height < 1) {
                    height = 240;
                }
                this.f6441 = height;
                this.f6437 = true;
            }
            if (!this.f6430) {
                m2795(this, Collections.singletonList(bitmap));
            }
            byte[] bArrM2798 = m2798(bitmap);
            boolean z = this.f6442;
            int i = 255;
            BufferedOutputStream bufferedOutputStream = this.f6435;
            if (z) {
                m2796(this.f6436);
                m2796(this.f6441);
                bufferedOutputStream.write(247);
                bufferedOutputStream.write(this.f6440 ? 255 : 0);
                bufferedOutputStream.write(0);
                byte[] bArr = this.f6439;
                if (bArr != null) {
                    bufferedOutputStream.write(bArr, 0, bArr.length);
                    int length = 768 - bArr.length;
                    for (int i2 = 0; i2 < length; i2++) {
                        bufferedOutputStream.write(0);
                    }
                }
                bufferedOutputStream.write(33);
                bufferedOutputStream.write(255);
                bufferedOutputStream.write(11);
                byte[] bytes = AbstractC2328.m4341(-1734577949934446L).getBytes(AbstractC0347.f1806);
                AbstractC2328.m4341(-1734629489541998L);
                bufferedOutputStream.write(bytes);
                bufferedOutputStream.write(3);
                bufferedOutputStream.write(1);
                m2796(0);
                bufferedOutputStream.write(0);
            }
            bufferedOutputStream.write(33);
            bufferedOutputStream.write(249);
            bufferedOutputStream.write(4);
            int i3 = this.f6433;
            int i4 = 2;
            if (i3 < 0) {
                i3 = this.f6440 ? 2 : 0;
            }
            bufferedOutputStream.write((i3 << 2) | (this.f6440 ? 1 : 0));
            int i5 = this.f6443 / 10;
            if (i5 >= 2) {
                i4 = i5;
            }
            m2796(i4);
            if (!this.f6440) {
                i = 0;
            }
            bufferedOutputStream.write(i);
            bufferedOutputStream.write(0);
            bufferedOutputStream.write(44);
            m2796(0);
            m2796(0);
            m2796(this.f6436);
            m2796(this.f6441);
            bufferedOutputStream.write(0);
            m2799(bArrM2798);
            this.f6442 = false;
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final byte[] m2798(Bitmap bitmap) {
        Bitmap bitmap2;
        char c;
        C1383 c1383 = this;
        if (bitmap.getWidth() == c1383.f6436 && bitmap.getHeight() == c1383.f6441) {
            bitmap2 = bitmap;
        } else {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(c1383.f6436, c1383.f6441, Bitmap.Config.ARGB_8888);
            new Canvas(bitmapCreateBitmap).drawBitmap(bitmap, 0.0f, 0.0f, new Paint());
            bitmap2 = bitmapCreateBitmap;
        }
        int i = c1383.f6436;
        int i2 = c1383.f6441;
        int i3 = i * i2;
        int[] iArr = new int[i3];
        bitmap2.getPixels(iArr, 0, i, 0, 0, i, i2);
        if (bitmap2 != bitmap) {
            bitmap2.recycle();
        }
        byte[] bArr = new byte[i3];
        C1102 c1102 = c1383.f6432;
        byte b = -1;
        char c2 = 0;
        if (c1102 != null) {
            int i4 = 0;
            while (i4 < i3) {
                int i5 = iArr[i4];
                char c3 = 255;
                int i6 = (i5 >>> 24) & 255;
                if (!c1383.f6440 || i6 >= 128) {
                    int i7 = i5 & 255;
                    int i8 = (i5 >> 8) & 255;
                    int i9 = (i5 >> 16) & 255;
                    int[][] iArr2 = c1102.f5070;
                    int i10 = c1102.f5075[i8];
                    int i11 = i10 - 1;
                    int i12 = 1000;
                    c = c2;
                    while (true) {
                        if (i10 >= 256 && i11 < 0) {
                            break;
                        }
                        b = b;
                        if (i10 < 256) {
                            int[] iArr3 = iArr2[i10];
                            int i13 = iArr3[1] - i8;
                            if (i13 >= i12) {
                                i10 = 256;
                                b = b;
                            } else {
                                i10++;
                                if (i13 < 0) {
                                    i13 = -i13;
                                }
                                int i14 = iArr3[c] - i7;
                                if (i14 < 0) {
                                    i14 = -i14;
                                }
                                int i15 = i13 + i14;
                                b = b;
                                if (i15 < i12) {
                                    int i16 = iArr3[2] - i9;
                                    if (i16 < 0) {
                                        i16 = -i16;
                                    }
                                    int i17 = i15 + i16;
                                    b = b;
                                    if (i17 < i12) {
                                        i12 = i17;
                                        b = iArr3[3];
                                    }
                                }
                            }
                        }
                        if (i11 >= 0) {
                            int[] iArr4 = iArr2[i11];
                            int i18 = i8 - iArr4[1];
                            if (i18 >= i12) {
                                c3 = 255;
                                i11 = -1;
                            } else {
                                i11--;
                                if (i18 < 0) {
                                    i18 = -i18;
                                }
                                int i19 = iArr4[c] - i7;
                                if (i19 < 0) {
                                    i19 = -i19;
                                }
                                int i20 = i18 + i19;
                                if (i20 < i12) {
                                    int i21 = iArr4[2] - i9;
                                    if (i21 < 0) {
                                        i21 = -i21;
                                    }
                                    int i22 = i21 + i20;
                                    if (i22 < i12) {
                                        c3 = 255;
                                        i12 = i22;
                                        b = iArr4[3];
                                    }
                                    c1383 = this;
                                }
                            }
                        }
                        c3 = 255;
                        b = b;
                        c1383 = this;
                    }
                    int i23 = b;
                    i23 = b;
                    if (c1383.f6440 && b == c3) {
                        i23 = c1383.f6438;
                    }
                    bArr[i4] = (byte) i23;
                } else {
                    bArr[i4] = b;
                    c = c2;
                }
                i4++;
                c2 = c;
                b = -1;
            }
        } else if (c1383.f6440) {
            Arrays.fill(bArr, 0, i3, (byte) -1);
            return bArr;
        }
        return bArr;
    }

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final void m2799(byte[] bArr) throws IOException {
        int i;
        int[] iArr;
        int i2;
        C0372 c0372 = new C0372(1, bArr);
        AbstractC2328.m4341(-1726091094557550L);
        BufferedOutputStream bufferedOutputStream = this.f6435;
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
}
