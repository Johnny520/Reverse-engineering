package yyds;

/* JADX INFO: renamed from: yyds.ᛵᛵᲀᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1102 {

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public final int[] f5068;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public final int[] f5069;

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final int[][] f5070;

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final byte[] f5071;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final int f5072;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final int[] f5073;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public int f5074;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final int[] f5075;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public int f5076;

    public C1102(int i, int i2, int i3, byte[] bArr) {
        int i4 = 0;
        switch (i3) {
            case 1:
                AbstractC2328.m4341(-1735514252804974L);
                this.f5071 = bArr;
                this.f5072 = i;
                this.f5074 = i2;
                int[][] iArr = new int[256][];
                for (int i5 = 0; i5 < 256; i5++) {
                    int i6 = (i5 << 12) / 256;
                    iArr[i5] = new int[]{i6, i6, i6, 0};
                }
                this.f5070 = iArr;
                this.f5075 = new int[256];
                this.f5073 = new int[256];
                int[] iArr2 = new int[256];
                while (i4 < 256) {
                    iArr2[i4] = 256;
                    i4++;
                }
                this.f5068 = iArr2;
                this.f5069 = new int[32];
                break;
            default:
                AbstractC2328.m4341(-1722964358366062L);
                this.f5071 = bArr;
                this.f5072 = i;
                this.f5074 = i2;
                int[][] iArr3 = new int[256][];
                for (int i7 = 0; i7 < 256; i7++) {
                    int i8 = (i7 << 12) / 256;
                    iArr3[i7] = new int[]{i8, i8, i8, 0};
                }
                this.f5070 = iArr3;
                this.f5075 = new int[256];
                this.f5073 = new int[256];
                int[] iArr4 = new int[256];
                while (i4 < 256) {
                    iArr4[i4] = 256;
                    i4++;
                }
                this.f5068 = iArr4;
                this.f5069 = new int[32];
                break;
        }
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public int m2305(int i, int i2, int i3) {
        int i4 = this.f5075[i2];
        int i5 = i4 - 1;
        int i6 = 1000;
        int i7 = -1;
        while (true) {
            if (i4 >= 256 && i5 < 0) {
                return i7;
            }
            int[][] iArr = this.f5070;
            if (i4 < 256) {
                int[] iArr2 = iArr[i4];
                int i8 = iArr2[1] - i2;
                if (i8 >= i6) {
                    i4 = 256;
                } else {
                    i4++;
                    if (i8 < 0) {
                        i8 = -i8;
                    }
                    int i9 = iArr2[0] - i;
                    if (i9 < 0) {
                        i9 = -i9;
                    }
                    int i10 = i8 + i9;
                    if (i10 < i6) {
                        int i11 = iArr2[2] - i3;
                        if (i11 < 0) {
                            i11 = -i11;
                        }
                        int i12 = i10 + i11;
                        if (i12 < i6) {
                            i7 = iArr2[3];
                            i6 = i12;
                        }
                    }
                }
            }
            if (i5 >= 0) {
                int[] iArr3 = iArr[i5];
                int i13 = i2 - iArr3[1];
                if (i13 >= i6) {
                    i5 = -1;
                } else {
                    i5--;
                    if (i13 < 0) {
                        i13 = -i13;
                    }
                    int i14 = iArr3[0] - i;
                    if (i14 < 0) {
                        i14 = -i14;
                    }
                    int i15 = i13 + i14;
                    if (i15 < i6) {
                        int i16 = iArr3[2] - i3;
                        if (i16 < 0) {
                            i16 = -i16;
                        }
                        int i17 = i16 + i15;
                        if (i17 < i6) {
                            i7 = iArr3[3];
                            i6 = i17;
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public byte[] m2306() {
        int[] iArr;
        int i;
        int i2;
        int[][] iArr2;
        int i3;
        int[] iArr3;
        int i4;
        int[] iArr4;
        int[] iArr5;
        int i5 = 1;
        int i6 = this.f5072;
        int i7 = 1509;
        if (i6 < 1509) {
            this.f5074 = 1;
        }
        int i8 = this.f5074;
        this.f5076 = ((i8 - 1) / 3) + 30;
        int i9 = i6 / (i8 * 3);
        int i10 = i9 / 100;
        int i11 = 0;
        while (true) {
            iArr = this.f5069;
            i = 256;
            i2 = 32;
            if (i11 >= 32) {
                break;
            }
            iArr[i11] = (((1024 - (i11 * i11)) * 256) / 1024) * 1024;
            i11++;
        }
        if (i6 < 1509) {
            i7 = 3;
        } else if (i6 % 499 != 0) {
            i7 = 1497;
        } else if (i6 % 491 != 0) {
            i7 = 1473;
        } else if (i6 % 487 != 0) {
            i7 = 1461;
        }
        int i12 = 2048;
        int i13 = 1024;
        int i14 = 0;
        int i15 = 0;
        while (true) {
            iArr2 = this.f5070;
            i3 = 4;
            if (i14 >= i9) {
                break;
            }
            int i16 = i5;
            byte[] bArr = this.f5071;
            int i17 = (bArr[i15] & 255) << 4;
            int i18 = (bArr[i15 + 1] & 255) << 4;
            int i19 = (bArr[i15 + 2] & 255) << 4;
            int i20 = i7;
            int i21 = i9;
            int i22 = 0;
            int i23 = Integer.MAX_VALUE;
            int i24 = -1;
            int i25 = -1;
            int i26 = Integer.MAX_VALUE;
            while (true) {
                iArr4 = this.f5068;
                iArr5 = this.f5073;
                if (i22 >= 256) {
                    break;
                }
                int[] iArr6 = iArr2[i22];
                int i27 = i22;
                int i28 = iArr6[0] - i17;
                if (i28 < 0) {
                    i28 = -i28;
                }
                int i29 = i28;
                int i30 = iArr6[i16] - i18;
                if (i30 < 0) {
                    i30 = -i30;
                }
                int i31 = i29 + i30;
                int i32 = iArr6[2] - i19;
                if (i32 < 0) {
                    i32 = -i32;
                }
                int i33 = i31 + i32;
                if (i33 < i23) {
                    i23 = i33;
                    i24 = i27;
                }
                int i34 = i33 - (iArr5[i27] >> 12);
                if (i34 < i26) {
                    i26 = i34;
                    i25 = i27;
                }
                int i35 = iArr4[i27];
                int i36 = i35 >> 10;
                iArr4[i27] = i35 - i36;
                iArr5[i27] = iArr5[i27] + (i36 << 10);
                i22 = i27 + 1;
            }
            iArr4[i24] = iArr4[i24] + 64;
            iArr5[i24] = iArr5[i24] - 65536;
            int[] iArr7 = iArr2[i25];
            int i37 = iArr7[0];
            iArr7[0] = i37 - (((i37 - i17) * i13) / 1024);
            int i38 = iArr7[i16];
            iArr7[i16] = i38 - (((i38 - i18) * i13) / 1024);
            int i39 = iArr7[2];
            iArr7[2] = i39 - (((i39 - i19) * i13) / 1024);
            if (i2 != 0) {
                int i40 = i25 - i2;
                if (i40 < -1) {
                    i40 = -1;
                }
                int i41 = i25 + i2;
                if (i41 > 256) {
                    i41 = 256;
                }
                int i42 = i25 + 1;
                int i43 = i16;
                int i44 = i25 - 1;
                while (true) {
                    if (i42 >= i41 && i44 <= i40) {
                        break;
                    }
                    int i45 = i43 + 1;
                    int i46 = iArr[i43];
                    if (i42 < i41) {
                        int i47 = i42 + 1;
                        int[] iArr8 = iArr2[i42];
                        try {
                            int i48 = iArr8[0];
                            iArr8[0] = i48 - (((i48 - i17) * i46) / 262144);
                            int i49 = iArr8[i16];
                            iArr8[i16] = i49 - (((i49 - i18) * i46) / 262144);
                            int i50 = iArr8[2];
                            iArr8[2] = i50 - (((i50 - i19) * i46) / 262144);
                        } catch (Exception unused) {
                        }
                        i42 = i47;
                    }
                    if (i44 > i40) {
                        int i51 = i44 - 1;
                        int[] iArr9 = iArr2[i44];
                        try {
                            int i52 = iArr9[0];
                            iArr9[0] = i52 - (((i52 - i17) * i46) / 262144);
                            int i53 = iArr9[i16];
                            iArr9[i16] = i53 - (((i53 - i18) * i46) / 262144);
                            int i54 = iArr9[2];
                            iArr9[2] = i54 - (((i54 - i19) * i46) / 262144);
                        } catch (Exception unused2) {
                        }
                        i43 = i45;
                        i44 = i51;
                    } else {
                        i43 = i45;
                    }
                }
            }
            i15 += i20;
            if (i15 >= i6) {
                i15 -= i6;
            }
            i14++;
            if (i10 == 0) {
                i10 = i16;
            }
            if (i14 % i10 == 0) {
                i13 -= i13 / this.f5076;
                i12 -= i12 / 30;
                int i55 = i12 >> 6;
                i2 = i55 <= i16 ? 0 : i55;
                int i56 = i2 * i2;
                for (int i57 = 0; i57 < i2; i57++) {
                    iArr[i57] = (((i56 - (i57 * i57)) * 256) / i56) * i13;
                }
            }
            i7 = i20;
            i9 = i21;
            i5 = 1;
            i = 256;
        }
        int i58 = 0;
        for (int i59 = i; i58 < i59; i59 = 256) {
            int[] iArr10 = iArr2[i58];
            iArr10[0] = iArr10[0] >> 4;
            iArr10[1] = iArr10[1] >> 4;
            iArr10[2] = iArr10[2] >> 4;
            iArr10[3] = i58;
            i58++;
        }
        int i60 = 0;
        int i61 = 0;
        int i62 = 0;
        while (true) {
            iArr3 = this.f5075;
            int i63 = 256;
            if (i60 >= 256) {
                break;
            }
            int[] iArr11 = iArr2[i60];
            char c = 1;
            int i64 = iArr11[1];
            int i65 = i60 + 1;
            int i66 = i60;
            int i67 = i65;
            while (i67 < i63) {
                int i68 = iArr2[i67][c];
                if (i68 < i64) {
                    i64 = i68;
                    i66 = i67;
                }
                i67++;
                i63 = 256;
                c = 1;
            }
            int[] iArr12 = iArr2[i66];
            if (i60 != i66) {
                i4 = i3;
                for (int i69 = 0; i69 < i4; i69++) {
                    int i70 = iArr12[i69];
                    iArr12[i69] = iArr11[i69];
                    iArr11[i69] = i70;
                }
            } else {
                i4 = i3;
            }
            if (i64 != i61) {
                iArr3[i61] = (i62 + i60) >> 1;
                while (true) {
                    i61++;
                    if (i61 >= i64) {
                        break;
                    }
                    iArr3[i61] = i60;
                }
                i62 = i60;
                i61 = i64;
            }
            i60 = i65;
            i3 = i4;
        }
        iArr3[i61] = (i62 + 255) >> 1;
        for (int i71 = i61 + 1; i71 < 256; i71++) {
            iArr3[i71] = 255;
        }
        byte[] bArr2 = new byte[768];
        int[] iArr13 = new int[256];
        for (int i72 = 0; i72 < 256; i72++) {
            iArr13[iArr2[i72][3]] = i72;
        }
        int i73 = 0;
        for (int i74 = 0; i74 < 256; i74++) {
            int[] iArr14 = iArr2[iArr13[i74]];
            bArr2[i73] = (byte) iArr14[0];
            int i75 = i73 + 2;
            bArr2[i73 + 1] = (byte) iArr14[1];
            i73 += 3;
            bArr2[i75] = (byte) iArr14[2];
        }
        return bArr2;
    }
}
