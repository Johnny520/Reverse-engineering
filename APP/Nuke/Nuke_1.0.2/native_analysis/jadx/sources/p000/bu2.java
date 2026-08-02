package p000;

import android.graphics.Bitmap;
import android.util.Log;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class bu2 {

    /* JADX INFO: renamed from: a */
    public int[] f1020a;

    /* JADX INFO: renamed from: c */
    public final sz0 f1022c;

    /* JADX INFO: renamed from: d */
    public ByteBuffer f1023d;

    /* JADX INFO: renamed from: e */
    public byte[] f1024e;

    /* JADX INFO: renamed from: f */
    public short[] f1025f;

    /* JADX INFO: renamed from: g */
    public byte[] f1026g;

    /* JADX INFO: renamed from: h */
    public byte[] f1027h;

    /* JADX INFO: renamed from: i */
    public byte[] f1028i;

    /* JADX INFO: renamed from: j */
    public final int[] f1029j;

    /* JADX INFO: renamed from: k */
    public int f1030k;

    /* JADX INFO: renamed from: l */
    public fp0 f1031l;

    /* JADX INFO: renamed from: m */
    public Bitmap f1032m;

    /* JADX INFO: renamed from: n */
    public final boolean f1033n;

    /* JADX INFO: renamed from: o */
    public int f1034o;

    /* JADX INFO: renamed from: p */
    public final int f1035p;

    /* JADX INFO: renamed from: q */
    public final int f1036q;

    /* JADX INFO: renamed from: r */
    public final int f1037r;

    /* JADX INFO: renamed from: s */
    public Boolean f1038s;

    /* JADX INFO: renamed from: b */
    public final int[] f1021b = new int[256];

    /* JADX INFO: renamed from: t */
    public Bitmap.Config f1039t = Bitmap.Config.ARGB_8888;

    public bu2(sz0 sz0Var, fp0 fp0Var, ByteBuffer byteBuffer, int i) {
        this.f1022c = sz0Var;
        this.f1031l = new fp0();
        synchronized (this) {
            try {
                if (i <= 0) {
                    throw new IllegalArgumentException("Sample size must be >=0, not: " + i);
                }
                int iHighestOneBit = Integer.highestOneBit(i);
                this.f1034o = 0;
                this.f1031l = fp0Var;
                this.f1030k = -1;
                ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
                this.f1023d = byteBufferAsReadOnlyBuffer;
                byteBufferAsReadOnlyBuffer.position(0);
                this.f1023d.order(ByteOrder.LITTLE_ENDIAN);
                this.f1033n = false;
                Iterator it = fp0Var.f3096e.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (((bp0) it.next()).f974g == 3) {
                        this.f1033n = true;
                        break;
                    }
                }
                this.f1035p = iHighestOneBit;
                int i2 = fp0Var.f3097f;
                this.f1037r = i2 / iHighestOneBit;
                int i3 = fp0Var.f3098g;
                this.f1036q = i3 / iHighestOneBit;
                int i4 = i2 * i3;
                td1 td1Var = (td1) this.f1022c.f10437j;
                this.f1028i = td1Var == null ? new byte[i4] : (byte[]) td1Var.m5167c(i4, byte[].class);
                sz0 sz0Var2 = this.f1022c;
                int i5 = this.f1037r * this.f1036q;
                td1 td1Var2 = (td1) sz0Var2.f10437j;
                this.f1029j = td1Var2 == null ? new int[i5] : (int[]) td1Var2.m5167c(i5, int[].class);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final Bitmap m593a() {
        Boolean bool = this.f1038s;
        Bitmap bitmapMo1323e = ((InterfaceC0965zk) this.f1022c.f10436i).mo1323e(this.f1037r, this.f1036q, (bool == null || bool.booleanValue()) ? Bitmap.Config.ARGB_8888 : this.f1039t);
        bitmapMo1323e.setHasAlpha(true);
        return bitmapMo1323e;
    }

    /* JADX INFO: renamed from: b */
    public final synchronized Bitmap m594b() {
        try {
            if (this.f1031l.f3094c <= 0 || this.f1030k < 0) {
                if (Log.isLoggable("bu2", 3)) {
                    Log.d("bu2", "Unable to decode frame, frameCount=" + this.f1031l.f3094c + ", framePointer=" + this.f1030k);
                }
                this.f1034o = 1;
            }
            int i = this.f1034o;
            if (i != 1 && i != 2) {
                this.f1034o = 0;
                if (this.f1024e == null) {
                    td1 td1Var = (td1) this.f1022c.f10437j;
                    this.f1024e = td1Var == null ? new byte[255] : (byte[]) td1Var.m5167c(255, byte[].class);
                }
                bp0 bp0Var = (bp0) this.f1031l.f3096e.get(this.f1030k);
                int i2 = this.f1030k - 1;
                bp0 bp0Var2 = i2 >= 0 ? (bp0) this.f1031l.f3096e.get(i2) : null;
                int[] iArr = bp0Var.f978k;
                if (iArr == null) {
                    iArr = this.f1031l.f3092a;
                }
                this.f1020a = iArr;
                if (iArr == null) {
                    if (Log.isLoggable("bu2", 3)) {
                        Log.d("bu2", "No valid color table found for frame #" + this.f1030k);
                    }
                    this.f1034o = 1;
                    return null;
                }
                if (bp0Var.f973f) {
                    System.arraycopy(iArr, 0, this.f1021b, 0, iArr.length);
                    int[] iArr2 = this.f1021b;
                    this.f1020a = iArr2;
                    iArr2[bp0Var.f975h] = 0;
                    if (bp0Var.f974g == 2 && this.f1030k == 0) {
                        this.f1038s = Boolean.TRUE;
                    }
                }
                return m596d(bp0Var, bp0Var2);
            }
            if (Log.isLoggable("bu2", 3)) {
                Log.d("bu2", "Unable to decode frame, status=" + this.f1034o);
            }
            return null;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m595c(Bitmap.Config config) {
        Bitmap.Config config2;
        Bitmap.Config config3 = Bitmap.Config.ARGB_8888;
        if (config == config3 || config == (config2 = Bitmap.Config.RGB_565)) {
            this.f1039t = config;
            return;
        }
        throw new IllegalArgumentException("Unsupported format: " + config + ", must be one of " + config3 + " or " + config2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01e7 A[PHI: r7
  0x01e7: PHI (r7v18 int) = (r7v12 int), (r7v20 int), (r7v20 int) binds: [B:95:0x01d3, B:97:0x01de, B:98:0x01e0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004b  */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v29, types: [short] */
    /* JADX WARN: Type inference failed for: r8v31 */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Bitmap m596d(bp0 bp0Var, bp0 bp0Var2) {
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
        sz0 sz0Var = this.f1022c;
        byte b = 0;
        int[] iArr3 = this.f1029j;
        if (bp0Var2 == null) {
            Bitmap bitmap = this.f1032m;
            if (bitmap != null) {
                ((InterfaceC0965zk) sz0Var.f10436i).mo1325h(bitmap);
            }
            this.f1032m = null;
            Arrays.fill(iArr3, 0);
        }
        if (bp0Var2 != null && bp0Var2.f974g == 3 && this.f1032m == null) {
            Arrays.fill(iArr3, 0);
        }
        int i8 = this.f1037r;
        int i9 = this.f1035p;
        if (bp0Var2 != null && (i7 = bp0Var2.f974g) > 0) {
            if (i7 == 2) {
                if (!bp0Var.f973f) {
                    fp0 fp0Var = this.f1031l;
                    int i10 = fp0Var.f3102k;
                    if (bp0Var.f978k != null && fp0Var.f3101j == bp0Var.f975h) {
                        i10 = 0;
                    }
                    int i11 = bp0Var2.f971d / i9;
                    int i12 = bp0Var2.f969b / i9;
                    int i13 = bp0Var2.f970c / i9;
                    int i14 = (i12 * i8) + (bp0Var2.f968a / i9);
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
                Bitmap bitmap2 = this.f1032m;
                if (bitmap2 != null) {
                    int i18 = this.f1036q;
                    int i19 = this.f1037r;
                    bitmap2.getPixels(iArr3, 0, i19, 0, 0, i19, i18);
                }
            }
        }
        this.f1023d.position(bp0Var.f977j);
        int i20 = bp0Var.f970c * bp0Var.f971d;
        byte[] bArr2 = this.f1028i;
        if (bArr2 == null || bArr2.length < i20) {
            td1 td1Var = (td1) sz0Var.f10437j;
            this.f1028i = td1Var == null ? new byte[i20] : (byte[]) td1Var.m5167c(i20, byte[].class);
        }
        byte[] bArr3 = this.f1028i;
        if (this.f1025f == null) {
            this.f1025f = new short[4096];
        }
        short[] sArr2 = this.f1025f;
        if (this.f1026g == null) {
            this.f1026g = new byte[4096];
        }
        byte[] bArr4 = this.f1026g;
        if (this.f1027h == null) {
            this.f1027h = new byte[4097];
        }
        byte[] bArr5 = this.f1027h;
        int i21 = this.f1023d.get() & 255;
        int i22 = 1 << i21;
        int i23 = i22 + 1;
        int i24 = i22 + 2;
        int i25 = i21 + 1;
        int i26 = (1 << i25) - 1;
        for (int i27 = 0; i27 < i22; i27++) {
            sArr2[i27] = 0;
            bArr4[i27] = (byte) i27;
        }
        byte[] bArr6 = this.f1024e;
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
                int i41 = this.f1023d.get() & 255;
                if (i41 <= 0) {
                    i29 = i41;
                    iArr = iArr3;
                    sArr = sArr2;
                    bArr = bArr6;
                } else {
                    iArr = iArr3;
                    ByteBuffer byteBuffer = this.f1023d;
                    sArr = sArr2;
                    bArr = bArr6;
                    i29 = i41;
                    byteBuffer.get(this.f1024e, 0, Math.min(i41, byteBuffer.remaining()));
                }
                if (i29 <= 0) {
                    this.f1034o = 3;
                    b = 0;
                    break;
                }
                i30 = 0;
            } else {
                iArr = iArr3;
                sArr = sArr2;
                bArr = bArr6;
            }
            i32 += (bArr[i30] & 255) << i31;
            i30++;
            i29--;
            int i42 = i40;
            int i43 = i31 + 8;
            int i44 = i37;
            int i45 = i36;
            byte[] bArr7 = bArr4;
            int i46 = i34;
            while (true) {
                i31 = i43;
                if (i43 < i45) {
                    i34 = i46;
                    bArr4 = bArr7;
                    i36 = i45;
                    iArr3 = iArr;
                    bArr6 = bArr;
                    i39 = -1;
                    i40 = i42;
                    i37 = i44;
                    sArr2 = sArr;
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
                        bArr4 = bArr7;
                        iArr3 = iArr;
                        sArr2 = sArr;
                        bArr6 = bArr;
                        i40 = i42;
                        break;
                    }
                    int i48 = i45;
                    if (i42 == i39) {
                        bArr3[i33] = bArr7[i47];
                        i33++;
                        i28++;
                        i42 = i47;
                        i46 = i42;
                        i43 = i31;
                        i45 = i48;
                    } else {
                        if (i47 >= i44) {
                            bArr5[i35] = (byte) i46;
                            i35++;
                            s = i42;
                        } else {
                            s = i47;
                        }
                        while (s >= i22) {
                            bArr5[i35] = bArr7[s];
                            i35++;
                            s = sArr[s];
                        }
                        i46 = bArr7[s] & 255;
                        byte b2 = (byte) i46;
                        bArr3[i33] = b2;
                        while (true) {
                            i33++;
                            i28++;
                            if (i35 <= 0) {
                                break;
                            }
                            i35--;
                            bArr3[i33] = bArr5[i35];
                        }
                        int i49 = i22;
                        if (i44 < 4096) {
                            sArr[i44] = (short) i42;
                            bArr7[i44] = b2;
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
            b = 0;
        }
        Arrays.fill(bArr3, i33, i20, b);
        boolean z = bp0Var.f972e;
        int[] iArr4 = this.f1029j;
        if (z || i9 != 1) {
            int i50 = bp0Var.f971d / i9;
            int i51 = bp0Var.f969b / i9;
            int i52 = bp0Var.f970c / i9;
            int i53 = bp0Var.f968a / i9;
            boolean z2 = this.f1030k == 0;
            byte[] bArr8 = this.f1028i;
            int[] iArr5 = this.f1020a;
            Boolean bool = this.f1038s;
            int i54 = 8;
            int i55 = 0;
            int i56 = 0;
            int i57 = 1;
            while (i55 < i50) {
                int i58 = i51;
                if (bp0Var.f972e) {
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
                if (i59 < this.f1036q) {
                    int i61 = i59 * i8;
                    int i62 = i61 + i53;
                    int i63 = i62 + i52;
                    int i64 = i61 + i8;
                    if (i64 < i63) {
                        i63 = i64;
                    }
                    i2 = i;
                    int i65 = i55 * i9 * bp0Var.f970c;
                    if (z3) {
                        int i66 = i62;
                        while (i66 < i63) {
                            int i67 = i66;
                            int i68 = iArr5[bArr8[i65] & 255];
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
                            int i73 = bp0Var.f970c;
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
                                byte[] bArr9 = this.f1028i;
                                i5 = i53;
                                if (i75 >= bArr9.length || i75 >= i69) {
                                    break;
                                }
                                int i81 = this.f1020a[bArr9[i75] & 255];
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
                                byte[] bArr10 = this.f1028i;
                                int i84 = i82;
                                if (i83 >= bArr10.length || i83 >= i69) {
                                    break;
                                }
                                int i85 = this.f1020a[bArr10[i83] & 255];
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
            if (this.f1038s == null) {
                this.f1038s = Boolean.valueOf(bool == null ? false : bool.booleanValue());
            }
        } else {
            int i87 = bp0Var.f971d;
            int i88 = bp0Var.f969b;
            int i89 = bp0Var.f970c;
            int i90 = bp0Var.f968a;
            byte b3 = this.f1030k == 0 ? (byte) 1 : b;
            byte[] bArr11 = this.f1028i;
            int[] iArr6 = this.f1020a;
            byte b4 = -1;
            for (int i91 = b; i91 < i87; i91++) {
                int i92 = (i91 + i88) * i8;
                int i93 = i92 + i90;
                int i94 = i93 + i89;
                int i95 = i92 + i8;
                if (i95 < i94) {
                    i94 = i95;
                }
                int i96 = bp0Var.f970c * i91;
                while (i93 < i94) {
                    int i97 = i87;
                    byte b5 = bArr11[i96];
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
            Boolean bool3 = this.f1038s;
            this.f1038s = Boolean.valueOf((bool3 != null && bool3.booleanValue()) || !(this.f1038s != null || b3 == 0 || b4 == -1));
        }
        if (this.f1033n && ((i6 = bp0Var.f974g) == 0 || i6 == 1)) {
            if (this.f1032m == null) {
                this.f1032m = m593a();
            }
            Bitmap bitmap3 = this.f1032m;
            int i100 = this.f1036q;
            int i101 = this.f1037r;
            iArr2 = iArr;
            bitmap3.setPixels(iArr2, 0, i101, 0, 0, i101, i100);
        } else {
            iArr2 = iArr;
        }
        Bitmap bitmapM593a = m593a();
        int i102 = this.f1036q;
        int i103 = this.f1037r;
        bitmapM593a.setPixels(iArr2, 0, i103, 0, 0, i103, i102);
        return bitmapM593a;
    }
}
