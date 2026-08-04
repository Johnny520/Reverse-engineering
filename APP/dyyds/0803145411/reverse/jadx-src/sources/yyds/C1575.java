package yyds;

import android.graphics.Bitmap;
import android.util.Log;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: renamed from: yyds.ᛷᛶᛵᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1575 {

    /* JADX INFO: renamed from: ᛱᛳᲇ, reason: contains not printable characters */
    public final boolean f7979;

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public byte[] f7980;

    /* JADX INFO: renamed from: ᛲᛲᲈᲈ, reason: contains not printable characters */
    public Bitmap f7981;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public byte[] f7982;

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public byte[] f7983;

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public int[] f7984;

    /* JADX INFO: renamed from: ᛳᲁᲁᲇ, reason: contains not printable characters */
    public int f7986;

    /* JADX INFO: renamed from: ᛵᛶᛲᲀ, reason: contains not printable characters */
    public final int f7987;

    /* JADX INFO: renamed from: ᛶᛳᛶᛵ, reason: contains not printable characters */
    public final int f7989;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public byte[] f7990;

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public int f7991;

    /* JADX INFO: renamed from: ᛷᛵᲇᲀ, reason: contains not printable characters */
    public C0069 f7992;

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public final int[] f7993;

    /* JADX INFO: renamed from: ᲀᛲᛲᲇ, reason: contains not printable characters */
    public Boolean f7994;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final C2133 f7995;

    /* JADX INFO: renamed from: ᲇᛱᛲ, reason: contains not printable characters */
    public final int f7996;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public short[] f7997;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public ByteBuffer f7998;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final int[] f7988 = new int[256];

    /* JADX INFO: renamed from: ᛳᛸᛴᛶ, reason: contains not printable characters */
    public Bitmap.Config f7985 = Bitmap.Config.ARGB_8888;

    public C1575(C2133 c2133, C0069 c0069, ByteBuffer byteBuffer, int i) {
        this.f7995 = c2133;
        this.f7992 = new C0069();
        synchronized (this) {
            try {
                if (i <= 0) {
                    throw new IllegalArgumentException("Sample size must be >=0, not: " + i);
                }
                int iHighestOneBit = Integer.highestOneBit(i);
                this.f7986 = 0;
                this.f7992 = c0069;
                this.f7991 = -1;
                ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
                this.f7998 = byteBufferAsReadOnlyBuffer;
                byteBufferAsReadOnlyBuffer.position(0);
                this.f7998.order(ByteOrder.LITTLE_ENDIAN);
                this.f7979 = false;
                Iterator it = c0069.f610.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (((C0829) it.next()).f3769 == 3) {
                        this.f7979 = true;
                        break;
                    }
                }
                this.f7996 = iHighestOneBit;
                int i2 = c0069.f617;
                this.f7987 = i2 / iHighestOneBit;
                int i3 = c0069.f613;
                this.f7989 = i3 / iHighestOneBit;
                int i4 = i2 * i3;
                C2267 c2267 = (C2267) this.f7995.f10553;
                this.f7982 = c2267 == null ? new byte[i4] : (byte[]) c2267.m4272(byte[].class, i4);
                C2133 c21332 = this.f7995;
                int i5 = this.f7987 * this.f7989;
                C2267 c22672 = (C2267) c21332.f10553;
                this.f7993 = c22672 == null ? new int[i5] : (int[]) c22672.m4272(int[].class, i5);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final Bitmap m3218() {
        Boolean bool = this.f7994;
        Bitmap bitmapMo1863 = ((InterfaceC2587) this.f7995.f10555).mo1863(this.f7987, this.f7989, (bool == null || bool.booleanValue()) ? Bitmap.Config.ARGB_8888 : this.f7985);
        bitmapMo1863.setHasAlpha(true);
        return bitmapMo1863;
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final synchronized Bitmap m3219() {
        try {
            if (this.f7992.f616 <= 0 || this.f7991 < 0) {
                if (Log.isLoggable("ᛷᛶᛵᛵ", 3)) {
                    Log.d("ᛷᛶᛵᛵ", "Unable to decode frame, frameCount=" + this.f7992.f616 + ", framePointer=" + this.f7991);
                }
                this.f7986 = 1;
            }
            int i = this.f7986;
            if (i != 1 && i != 2) {
                this.f7986 = 0;
                if (this.f7983 == null) {
                    C2267 c2267 = (C2267) this.f7995.f10553;
                    this.f7983 = c2267 == null ? new byte[255] : (byte[]) c2267.m4272(byte[].class, 255);
                }
                C0829 c0829 = (C0829) this.f7992.f610.get(this.f7991);
                int i2 = this.f7991 - 1;
                C0829 c08292 = i2 >= 0 ? (C0829) this.f7992.f610.get(i2) : null;
                int[] iArr = c0829.f3770;
                if (iArr == null) {
                    iArr = this.f7992.f611;
                }
                this.f7984 = iArr;
                if (iArr == null) {
                    if (Log.isLoggable("ᛷᛶᛵᛵ", 3)) {
                        Log.d("ᛷᛶᛵᛵ", "No valid color table found for frame #" + this.f7991);
                    }
                    this.f7986 = 1;
                    return null;
                }
                if (c0829.f3773) {
                    System.arraycopy(iArr, 0, this.f7988, 0, iArr.length);
                    int[] iArr2 = this.f7988;
                    this.f7984 = iArr2;
                    iArr2[c0829.f3764] = 0;
                    if (c0829.f3769 == 2 && this.f7991 == 0) {
                        this.f7994 = Boolean.TRUE;
                    }
                }
                return m3221(c0829, c08292);
            }
            if (Log.isLoggable("ᛷᛶᛵᛵ", 3)) {
                Log.d("ᛷᛶᛵᛵ", "Unable to decode frame, status=" + this.f7986);
            }
            return null;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final void m3220(Bitmap.Config config) {
        Bitmap.Config config2;
        Bitmap.Config config3 = Bitmap.Config.ARGB_8888;
        if (config == config3 || config == (config2 = Bitmap.Config.RGB_565)) {
            this.f7985 = config;
            return;
        }
        throw new IllegalArgumentException("Unsupported format: " + config + ", must be one of " + config3 + " or " + config2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01e1 A[PHI: r6
  0x01e1: PHI (r6v17 int) = (r6v11 int), (r6v19 int), (r6v19 int) binds: [B:95:0x01cd, B:97:0x01d8, B:98:0x01da] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004b  */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v29, types: [short] */
    /* JADX WARN: Type inference failed for: r8v31 */
    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Bitmap m3221(C0829 c0829, C0829 c08292) {
        int[] iArr;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int[] iArr2;
        int i6;
        short[] sArr;
        byte[] bArr;
        short s;
        int i7;
        C2133 c2133 = this.f7995;
        byte b = 0;
        int[] iArr3 = this.f7993;
        if (c08292 == null) {
            Bitmap bitmap = this.f7981;
            if (bitmap != null) {
                ((InterfaceC2587) c2133.f10555).mo1856(bitmap);
            }
            this.f7981 = null;
            Arrays.fill(iArr3, 0);
        }
        if (c08292 != null && c08292.f3769 == 3 && this.f7981 == null) {
            Arrays.fill(iArr3, 0);
        }
        int i8 = this.f7987;
        int i9 = this.f7996;
        if (c08292 != null && (i7 = c08292.f3769) > 0) {
            if (i7 == 2) {
                if (!c0829.f3773) {
                    C0069 c0069 = this.f7992;
                    int i10 = c0069.f614;
                    if (c0829.f3770 != null && c0069.f615 == c0829.f3764) {
                        i10 = 0;
                    }
                    int i11 = c08292.f3774 / i9;
                    int i12 = c08292.f3768 / i9;
                    int i13 = c08292.f3772 / i9;
                    int i14 = (i12 * i8) + (c08292.f3767 / i9);
                    int i15 = (i11 * i8) + i14;
                    while (i14 < i15) {
                        int i16 = i14 + i13;
                        for (int i17 = i14; i17 < i16; i17++) {
                            iArr3[i17] = i10;
                        }
                        i14 += i8;
                    }
                }
            } else if (i7 == 3) {
                Bitmap bitmap2 = this.f7981;
                if (bitmap2 != null) {
                    int i18 = this.f7989;
                    int i19 = this.f7987;
                    bitmap2.getPixels(iArr3, 0, i19, 0, 0, i19, i18);
                }
            }
        }
        this.f7998.position(c0829.f3771);
        int i20 = c0829.f3772 * c0829.f3774;
        byte[] bArr2 = this.f7982;
        if (bArr2 == null || bArr2.length < i20) {
            C2267 c2267 = (C2267) c2133.f10553;
            bArr2 = c2267 == null ? new byte[i20] : (byte[]) c2267.m4272(byte[].class, i20);
            this.f7982 = bArr2;
        }
        short[] sArr2 = this.f7997;
        if (sArr2 == null) {
            sArr2 = new short[4096];
            this.f7997 = sArr2;
        }
        byte[] bArr3 = this.f7990;
        if (bArr3 == null) {
            bArr3 = new byte[4096];
            this.f7990 = bArr3;
        }
        byte[] bArr4 = this.f7980;
        if (bArr4 == null) {
            bArr4 = new byte[4097];
            this.f7980 = bArr4;
        }
        int i21 = this.f7998.get() & 255;
        int i22 = 1 << i21;
        int i23 = i22 + 1;
        int i24 = i22 + 2;
        int i25 = i21 + 1;
        int i26 = (1 << i25) - 1;
        for (int i27 = 0; i27 < i22; i27++) {
            sArr2[i27] = 0;
            bArr3[i27] = (byte) i27;
        }
        byte[] bArr5 = this.f7983;
        int i28 = 0;
        int i29 = 0;
        int i30 = 0;
        int i31 = 0;
        int i32 = 0;
        int i33 = 0;
        int i34 = 0;
        int i35 = 0;
        int i36 = i25;
        int i37 = i24;
        int i38 = i26;
        int i39 = -1;
        int i40 = -1;
        while (true) {
            if (i28 >= i20) {
                iArr = iArr3;
                break;
            }
            if (i29 == 0) {
                int i41 = this.f7998.get() & 255;
                if (i41 <= 0) {
                    sArr = sArr2;
                    i29 = i41;
                    iArr = iArr3;
                    bArr = bArr5;
                } else {
                    sArr = sArr2;
                    ByteBuffer byteBuffer = this.f7998;
                    iArr = iArr3;
                    bArr = bArr5;
                    i29 = i41;
                    byteBuffer.get(this.f7983, 0, Math.min(i41, byteBuffer.remaining()));
                }
                if (i29 <= 0) {
                    this.f7986 = 3;
                    b = 0;
                    break;
                }
                i30 = 0;
            } else {
                sArr = sArr2;
                iArr = iArr3;
                bArr = bArr5;
            }
            i32 += (bArr[i30] & 255) << i31;
            i30++;
            i29--;
            int i42 = i40;
            int i43 = i31 + 8;
            int i44 = i37;
            int i45 = i36;
            byte[] bArr6 = bArr3;
            int i46 = i34;
            while (true) {
                i31 = i43;
                if (i43 < i45) {
                    i34 = i46;
                    bArr3 = bArr6;
                    i36 = i45;
                    bArr5 = bArr;
                    b = 0;
                    i39 = -1;
                    i40 = i42;
                    i37 = i44;
                    sArr2 = sArr;
                    iArr3 = iArr;
                    break;
                }
                int i47 = i32 & i38;
                i32 >>= i45;
                i31 -= i45;
                if (i47 == i22) {
                    i45 = i25;
                    i44 = i24;
                    i38 = i26;
                    i42 = i39;
                    i43 = i31;
                } else {
                    if (i47 == i23) {
                        i37 = i44;
                        i36 = i45;
                        i34 = i46;
                        bArr3 = bArr6;
                        iArr3 = iArr;
                        bArr5 = bArr;
                        b = 0;
                        i40 = i42;
                        sArr2 = sArr;
                        break;
                    }
                    int i48 = i45;
                    if (i42 == i39) {
                        bArr2[i33] = bArr6[i47];
                        i33++;
                        i28++;
                        i42 = i47;
                        i46 = i42;
                        i43 = i31;
                        i45 = i48;
                    } else {
                        if (i47 >= i44) {
                            bArr4[i35] = (byte) i46;
                            i35++;
                            s = i42;
                        } else {
                            s = i47;
                        }
                        while (s >= i22) {
                            bArr4[i35] = bArr6[s];
                            i35++;
                            s = sArr[s];
                        }
                        i46 = bArr6[s] & 255;
                        byte b2 = (byte) i46;
                        bArr2[i33] = b2;
                        while (true) {
                            i33++;
                            i28++;
                            if (i35 <= 0) {
                                break;
                            }
                            i35--;
                            bArr2[i33] = bArr4[i35];
                        }
                        int i49 = i22;
                        if (i44 < 4096) {
                            sArr[i44] = (short) i42;
                            bArr6[i44] = b2;
                            i44++;
                            if ((i44 & i38) != 0 || i44 >= 4096) {
                                i45 = i48;
                            } else {
                                i45 = i48 + 1;
                                i38 += i44;
                            }
                            i42 = i47;
                            i43 = i31;
                            i22 = i49;
                        }
                    }
                    i39 = -1;
                }
            }
        }
        Arrays.fill(bArr2, i33, i20, b);
        boolean z = c0829.f3766;
        int[] iArr4 = this.f7993;
        if (z || i9 != 1) {
            int i50 = c0829.f3774 / i9;
            int i51 = c0829.f3768 / i9;
            int i52 = c0829.f3772 / i9;
            int i53 = c0829.f3767 / i9;
            boolean z2 = this.f7991 == 0;
            byte[] bArr7 = this.f7982;
            int[] iArr5 = this.f7984;
            Boolean bool = this.f7994;
            int i54 = 8;
            int i55 = 0;
            int i56 = 0;
            int i57 = 1;
            while (i55 < i50) {
                int i58 = i51;
                if (c0829.f3766) {
                    if (i56 >= i50) {
                        i57++;
                        if (i57 == 2) {
                            i56 = 4;
                        } else if (i57 == 3) {
                            i54 = 4;
                            i56 = 2;
                        } else if (i57 == 4) {
                            i56 = 1;
                            i54 = 2;
                        }
                    }
                    i = i56 + i54;
                } else {
                    i = i56;
                    i56 = i55;
                }
                int i59 = i56 + i58;
                int i60 = i50;
                boolean z3 = i9 == 1;
                if (i59 < this.f7989) {
                    int i61 = i59 * i8;
                    int i62 = i61 + i53;
                    int i63 = i62 + i52;
                    int i64 = i61 + i8;
                    if (i64 < i63) {
                        i63 = i64;
                    }
                    i2 = i;
                    int i65 = i55 * i9 * c0829.f3772;
                    if (z3) {
                        int i66 = i62;
                        while (i66 < i63) {
                            int i67 = i66;
                            int i68 = iArr5[bArr7[i65] & 255];
                            if (i68 != 0) {
                                iArr4[i67] = i68;
                            } else if (z2 && bool == null) {
                                bool = Boolean.TRUE;
                            }
                            i65 += i9;
                            i66 = i67 + 1;
                        }
                    } else {
                        int i69 = ((i63 - i62) * i9) + i65;
                        Boolean bool2 = bool;
                        int i70 = i65;
                        int i71 = i62;
                        while (i71 < i63) {
                            int i72 = i63;
                            int i73 = c0829.f3772;
                            int i74 = i52;
                            int i75 = i70;
                            int i76 = 0;
                            int i77 = 0;
                            int i78 = 0;
                            int i79 = 0;
                            int i80 = 0;
                            while (true) {
                                if (i75 >= i70 + i9) {
                                    i5 = i53;
                                    break;
                                }
                                byte[] bArr8 = this.f7982;
                                i5 = i53;
                                if (i75 >= bArr8.length || i75 >= i69) {
                                    break;
                                }
                                int i81 = this.f7984[bArr8[i75] & 255];
                                if (i81 != 0) {
                                    i76 += (i81 >> 24) & 255;
                                    i77 += (i81 >> 16) & 255;
                                    i78 += (i81 >> 8) & 255;
                                    i79 += i81 & 255;
                                    i80++;
                                }
                                i75++;
                                i53 = i5;
                            }
                            int i82 = i70 + i73;
                            int i83 = i82;
                            while (i83 < i82 + i9) {
                                byte[] bArr9 = this.f7982;
                                int i84 = i82;
                                if (i83 >= bArr9.length || i83 >= i69) {
                                    break;
                                }
                                int i85 = this.f7984[bArr9[i83] & 255];
                                if (i85 != 0) {
                                    i76 += (i85 >> 24) & 255;
                                    i77 += (i85 >> 16) & 255;
                                    i78 += (i85 >> 8) & 255;
                                    i79 += i85 & 255;
                                    i80++;
                                }
                                i83++;
                                i82 = i84;
                            }
                            int i86 = i80 == 0 ? 0 : ((i76 / i80) << 24) | ((i77 / i80) << 16) | ((i78 / i80) << 8) | (i79 / i80);
                            if (i86 != 0) {
                                iArr4[i71] = i86;
                            } else if (z2 && bool2 == null) {
                                bool2 = Boolean.TRUE;
                            }
                            i70 += i9;
                            i71++;
                            i63 = i72;
                            i52 = i74;
                            i53 = i5;
                        }
                        i4 = i52;
                        i3 = i53;
                        bool = bool2;
                        i55++;
                        i51 = i58;
                        i50 = i60;
                        i56 = i2;
                        i52 = i4;
                        i53 = i3;
                    }
                } else {
                    i2 = i;
                }
                i4 = i52;
                i3 = i53;
                i55++;
                i51 = i58;
                i50 = i60;
                i56 = i2;
                i52 = i4;
                i53 = i3;
            }
            if (this.f7994 == null) {
                this.f7994 = Boolean.valueOf(bool == null ? false : bool.booleanValue());
            }
        } else {
            int i87 = c0829.f3774;
            int i88 = c0829.f3768;
            int i89 = c0829.f3772;
            int i90 = c0829.f3767;
            byte b3 = this.f7991 == 0 ? (byte) 1 : b;
            byte[] bArr10 = this.f7982;
            int[] iArr6 = this.f7984;
            byte b4 = -1;
            for (int i91 = b; i91 < i87; i91++) {
                int i92 = (i91 + i88) * i8;
                int i93 = i92 + i90;
                int i94 = i93 + i89;
                int i95 = i92 + i8;
                if (i95 < i94) {
                    i94 = i95;
                }
                int i96 = c0829.f3772 * i91;
                while (i93 < i94) {
                    int i97 = i87;
                    byte b5 = bArr10[i96];
                    int[] iArr7 = iArr4;
                    int i98 = b5 & 255;
                    if (i98 != b4) {
                        int i99 = iArr6[i98];
                        if (i99 != 0) {
                            iArr7[i93] = i99;
                        } else {
                            b4 = b5;
                        }
                    }
                    i96++;
                    i93++;
                    i87 = i97;
                    iArr4 = iArr7;
                }
            }
            Boolean bool3 = this.f7994;
            this.f7994 = Boolean.valueOf((bool3 != null && bool3.booleanValue()) || !(this.f7994 != null || b3 == 0 || b4 == -1));
        }
        if (this.f7979 && ((i6 = c0829.f3769) == 0 || i6 == 1)) {
            Bitmap bitmapM3218 = this.f7981;
            if (bitmapM3218 == null) {
                bitmapM3218 = m3218();
                this.f7981 = bitmapM3218;
            }
            int i100 = this.f7989;
            int i101 = this.f7987;
            iArr2 = iArr;
            bitmapM3218.setPixels(iArr2, 0, i101, 0, 0, i101, i100);
        } else {
            iArr2 = iArr;
        }
        Bitmap bitmapM32182 = m3218();
        int i102 = this.f7989;
        int i103 = this.f7987;
        bitmapM32182.setPixels(iArr2, 0, i103, 0, 0, i103, i102);
        return bitmapM32182;
    }
}
