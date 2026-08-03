package p000;

import android.graphics.Bitmap;
import android.util.Log;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: renamed from: Wy */
/* JADX INFO: loaded from: classes.dex */
public final class C0986Wy {

    /* JADX INFO: renamed from: a */
    public int[] f3101a;

    /* JADX INFO: renamed from: c */
    public final C0649P3 f3103c;

    /* JADX INFO: renamed from: d */
    public ByteBuffer f3104d;

    /* JADX INFO: renamed from: e */
    public byte[] f3105e;

    /* JADX INFO: renamed from: f */
    public short[] f3106f;

    /* JADX INFO: renamed from: g */
    public byte[] f3107g;

    /* JADX INFO: renamed from: h */
    public byte[] f3108h;

    /* JADX INFO: renamed from: i */
    public byte[] f3109i;

    /* JADX INFO: renamed from: j */
    public final int[] f3110j;

    /* JADX INFO: renamed from: k */
    public int f3111k;

    /* JADX INFO: renamed from: l */
    public C0370Ij f3112l;

    /* JADX INFO: renamed from: m */
    public Bitmap f3113m;

    /* JADX INFO: renamed from: n */
    public final boolean f3114n;

    /* JADX INFO: renamed from: o */
    public int f3115o;

    /* JADX INFO: renamed from: p */
    public final int f3116p;

    /* JADX INFO: renamed from: q */
    public final int f3117q;

    /* JADX INFO: renamed from: r */
    public final int f3118r;

    /* JADX INFO: renamed from: s */
    public Boolean f3119s;

    /* JADX INFO: renamed from: b */
    public final int[] f3102b = new int[256];

    /* JADX INFO: renamed from: t */
    public Bitmap.Config f3120t = Bitmap.Config.ARGB_8888;

    public C0986Wy(C0649P3 c0649p3, C0370Ij c0370Ij, ByteBuffer byteBuffer, int i) {
        this.f3103c = c0649p3;
        this.f3112l = new C0370Ij();
        synchronized (this) {
            try {
                if (i <= 0) {
                    throw new IllegalArgumentException("Sample size must be >=0, not: " + i);
                }
                int iHighestOneBit = Integer.highestOneBit(i);
                this.f3115o = 0;
                this.f3112l = c0370Ij;
                this.f3111k = -1;
                ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
                this.f3104d = byteBufferAsReadOnlyBuffer;
                byteBufferAsReadOnlyBuffer.position(0);
                this.f3104d.order(ByteOrder.LITTLE_ENDIAN);
                this.f3114n = false;
                Iterator it = c0370Ij.f1289e.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (((C0155Dj) it.next()).f425g == 3) {
                        this.f3114n = true;
                        break;
                    }
                }
                this.f3116p = iHighestOneBit;
                int i2 = c0370Ij.f1290f;
                this.f3118r = i2 / iHighestOneBit;
                int i3 = c0370Ij.f1291g;
                this.f3117q = i3 / iHighestOneBit;
                int i4 = i2 * i3;
                C2812zp c2812zp = (C2812zp) this.f3103c.f2090c;
                this.f3109i = c2812zp == null ? new byte[i4] : (byte[]) c2812zp.m5441c(i4, byte[].class);
                C0649P3 c0649p32 = this.f3103c;
                int i5 = this.f3118r * this.f3117q;
                C2812zp c2812zp2 = (C2812zp) c0649p32.f2090c;
                this.f3110j = c2812zp2 == null ? new int[i5] : (int[]) c2812zp2.m5441c(i5, int[].class);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final Bitmap m1863a() {
        Boolean bool = this.f3119s;
        Bitmap bitmapMo51e = ((InterfaceC0565N5) this.f3103c.f2089b).mo51e(this.f3118r, this.f3117q, (bool == null || bool.booleanValue()) ? Bitmap.Config.ARGB_8888 : this.f3120t);
        bitmapMo51e.setHasAlpha(true);
        return bitmapMo51e;
    }

    /* JADX INFO: renamed from: b */
    public final synchronized Bitmap m1864b() {
        try {
            if (this.f3112l.f1287c <= 0 || this.f3111k < 0) {
                if (Log.isLoggable("Wy", 3)) {
                    int i = this.f3112l.f1287c;
                }
                this.f3115o = 1;
            }
            int i2 = this.f3115o;
            if (i2 != 1 && i2 != 2) {
                this.f3115o = 0;
                if (this.f3105e == null) {
                    C2812zp c2812zp = (C2812zp) this.f3103c.f2090c;
                    this.f3105e = c2812zp == null ? new byte[255] : (byte[]) c2812zp.m5441c(255, byte[].class);
                }
                C0155Dj c0155Dj = (C0155Dj) this.f3112l.f1289e.get(this.f3111k);
                int i3 = this.f3111k - 1;
                C0155Dj c0155Dj2 = i3 >= 0 ? (C0155Dj) this.f3112l.f1289e.get(i3) : null;
                int[] iArr = c0155Dj.f429k;
                if (iArr == null) {
                    iArr = this.f3112l.f1285a;
                }
                this.f3101a = iArr;
                if (iArr == null) {
                    this.f3115o = 1;
                    return null;
                }
                if (c0155Dj.f424f) {
                    System.arraycopy(iArr, 0, this.f3102b, 0, iArr.length);
                    int[] iArr2 = this.f3102b;
                    this.f3101a = iArr2;
                    iArr2[c0155Dj.f426h] = 0;
                    if (c0155Dj.f425g == 2 && this.f3111k == 0) {
                        this.f3119s = Boolean.TRUE;
                    }
                }
                return m1866d(c0155Dj, c0155Dj2);
            }
            return null;
        } finally {
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m1865c(Bitmap.Config config) {
        Bitmap.Config config2;
        Bitmap.Config config3 = Bitmap.Config.ARGB_8888;
        if (config == config3 || config == (config2 = Bitmap.Config.RGB_565)) {
            this.f3120t = config;
            return;
        }
        throw new IllegalArgumentException("Unsupported format: " + config + ", must be one of " + config3 + " or " + config2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01dc A[PHI: r5
  0x01dc: PHI (r5v44 int) = (r5v38 int), (r5v46 int), (r5v46 int) binds: [B:93:0x01c8, B:95:0x01d3, B:96:0x01d5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v31, types: [short] */
    /* JADX WARN: Type inference failed for: r6v33 */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Bitmap m1866d(C0155Dj c0155Dj, C0155Dj c0155Dj2) {
        int[] iArr;
        byte b;
        int i;
        int i2;
        int i3;
        int i4;
        int[] iArr2;
        int i5;
        short[] sArr;
        int i6;
        short s;
        int i7;
        Bitmap bitmap;
        C0649P3 c0649p3 = this.f3103c;
        byte b2 = 0;
        int[] iArr3 = this.f3110j;
        if (c0155Dj2 == null) {
            Bitmap bitmap2 = this.f3113m;
            if (bitmap2 != null) {
                ((InterfaceC0565N5) c0649p3.f2089b).mo53h(bitmap2);
            }
            this.f3113m = null;
            Arrays.fill(iArr3, 0);
        }
        if (c0155Dj2 != null && c0155Dj2.f425g == 3 && this.f3113m == null) {
            Arrays.fill(iArr3, 0);
        }
        if (c0155Dj2 != null && (i7 = c0155Dj2.f425g) > 0) {
            if (i7 == 2) {
                if (!c0155Dj.f424f) {
                    C0370Ij c0370Ij = this.f3112l;
                    int i8 = c0370Ij.f1295k;
                    if (c0155Dj.f429k != null && c0370Ij.f1294j == c0155Dj.f426h) {
                        i8 = 0;
                    }
                    int i9 = c0155Dj2.f422d;
                    int i10 = this.f3116p;
                    int i11 = i9 / i10;
                    int i12 = c0155Dj2.f420b / i10;
                    int i13 = c0155Dj2.f421c / i10;
                    int i14 = c0155Dj2.f419a / i10;
                    int i15 = this.f3118r;
                    int i16 = (i12 * i15) + i14;
                    int i17 = (i11 * i15) + i16;
                    while (i16 < i17) {
                        int i18 = i16 + i13;
                        for (int i19 = i16; i19 < i18; i19++) {
                            iArr3[i19] = i8;
                        }
                        i16 += this.f3118r;
                    }
                }
            } else if (i7 == 3 && (bitmap = this.f3113m) != null) {
                int i20 = this.f3117q;
                int i21 = this.f3118r;
                bitmap.getPixels(iArr3, 0, i21, 0, 0, i21, i20);
            }
        }
        this.f3104d.position(c0155Dj.f428j);
        int i22 = c0155Dj.f421c * c0155Dj.f422d;
        byte[] bArr = this.f3109i;
        if (bArr == null || bArr.length < i22) {
            C2812zp c2812zp = (C2812zp) c0649p3.f2090c;
            this.f3109i = c2812zp == null ? new byte[i22] : (byte[]) c2812zp.m5441c(i22, byte[].class);
        }
        byte[] bArr2 = this.f3109i;
        if (this.f3106f == null) {
            this.f3106f = new short[4096];
        }
        short[] sArr2 = this.f3106f;
        if (this.f3107g == null) {
            this.f3107g = new byte[4096];
        }
        byte[] bArr3 = this.f3107g;
        if (this.f3108h == null) {
            this.f3108h = new byte[4097];
        }
        byte[] bArr4 = this.f3108h;
        int i23 = this.f3104d.get() & 255;
        int i24 = 1;
        int i25 = 1 << i23;
        int i26 = i25 + 1;
        int i27 = i25 + 2;
        int i28 = i23 + 1;
        int i29 = (1 << i28) - 1;
        int i30 = 0;
        while (i30 < i25) {
            sArr2[i30] = 0;
            bArr3[i30] = (byte) i30;
            i30++;
            i24 = i24;
        }
        int i31 = i24;
        byte[] bArr5 = this.f3105e;
        int i32 = 0;
        int i33 = 0;
        int i34 = 0;
        int i35 = 0;
        int i36 = 0;
        int i37 = 0;
        int i38 = 0;
        int i39 = 0;
        int i40 = i28;
        int i41 = i27;
        int i42 = i29;
        int i43 = -1;
        while (true) {
            if (i32 >= i22) {
                iArr = iArr3;
                b = b2;
                break;
            }
            if (i33 == 0) {
                i6 = -1;
                int i44 = this.f3104d.get() & 255;
                if (i44 <= 0) {
                    sArr = sArr2;
                    iArr = iArr3;
                } else {
                    ByteBuffer byteBuffer = this.f3104d;
                    sArr = sArr2;
                    iArr = iArr3;
                    byteBuffer.get(this.f3105e, 0, Math.min(i44, byteBuffer.remaining()));
                }
                if (i44 <= 0) {
                    this.f3115o = 3;
                    b = 0;
                    break;
                }
                i33 = i44;
                i34 = 0;
            } else {
                sArr = sArr2;
                iArr = iArr3;
                i6 = -1;
            }
            i36 += (bArr5[i34] & 255) << i35;
            i34++;
            i33--;
            int i45 = i35 + 8;
            int i46 = i41;
            int i47 = i40;
            int i48 = i43;
            int i49 = i38;
            while (true) {
                i35 = i45;
                if (i45 < i47) {
                    i43 = i48;
                    i38 = i49;
                    i40 = i47;
                    iArr3 = iArr;
                    b2 = 0;
                    i41 = i46;
                    sArr2 = sArr;
                    break;
                }
                int i50 = i36 & i42;
                i36 >>= i47;
                i35 -= i47;
                if (i50 == i25) {
                    i47 = i28;
                    i46 = i27;
                    i42 = i29;
                    i45 = i35;
                    i48 = i6;
                } else {
                    if (i50 == i26) {
                        i41 = i46;
                        i40 = i47;
                        i43 = i48;
                        i38 = i49;
                        sArr2 = sArr;
                        iArr3 = iArr;
                        b2 = 0;
                        break;
                    }
                    int i51 = i47;
                    if (i48 == i6) {
                        bArr2[i37] = bArr3[i50];
                        i37++;
                        i32++;
                        i48 = i50;
                        i49 = i48;
                        i45 = i35;
                        i47 = i51;
                    } else {
                        if (i50 >= i46) {
                            bArr4[i39] = (byte) i49;
                            i39++;
                            s = i48;
                        } else {
                            s = i50;
                        }
                        while (s >= i25) {
                            bArr4[i39] = bArr3[s];
                            i39++;
                            s = sArr[s];
                        }
                        i49 = bArr3[s] & 255;
                        byte b3 = (byte) i49;
                        bArr2[i37] = b3;
                        while (true) {
                            i37++;
                            i32++;
                            if (i39 <= 0) {
                                break;
                            }
                            i39--;
                            bArr2[i37] = bArr4[i39];
                        }
                        if (i46 < 4096) {
                            sArr[i46] = (short) i48;
                            bArr3[i46] = b3;
                            i46++;
                            if ((i46 & i42) != 0 || i46 >= 4096) {
                                i47 = i51;
                            } else {
                                i47 = i51 + 1;
                                i42 += i46;
                            }
                            i45 = i35;
                            i48 = i50;
                        }
                    }
                    i6 = -1;
                }
            }
        }
        Arrays.fill(bArr2, i37, i22, b);
        if (c0155Dj.f423e || this.f3116p != i31) {
            int i52 = c0155Dj.f422d;
            int i53 = this.f3116p;
            int i54 = i52 / i53;
            int i55 = c0155Dj.f420b / i53;
            int i56 = c0155Dj.f421c / i53;
            int i57 = c0155Dj.f419a / i53;
            boolean z = this.f3111k == 0;
            byte[] bArr6 = this.f3109i;
            int[] iArr4 = this.f3101a;
            Boolean bool = this.f3119s;
            int i58 = 8;
            int i59 = 0;
            int i60 = 1;
            int i61 = 0;
            while (i61 < i54) {
                if (c0155Dj.f423e) {
                    if (i59 >= i54) {
                        i60++;
                        if (i60 == 2) {
                            i59 = 4;
                        } else if (i60 == 3) {
                            i58 = 4;
                            i59 = 2;
                        } else if (i60 == 4) {
                            i59 = 1;
                            i58 = 2;
                        }
                    }
                    i = i59 + i58;
                } else {
                    i = i59;
                    i59 = i61;
                }
                int i62 = i59 + i55;
                int i63 = i54;
                boolean z2 = i53 == 1;
                if (i62 < this.f3117q) {
                    int i64 = this.f3118r;
                    int i65 = i62 * i64;
                    int i66 = i65 + i57;
                    int i67 = i66 + i56;
                    int i68 = i65 + i64;
                    if (i68 < i67) {
                        i67 = i68;
                    }
                    i2 = i53;
                    int i69 = i61 * i53 * c0155Dj.f421c;
                    int[] iArr5 = this.f3110j;
                    if (z2) {
                        int i70 = i66;
                        while (i70 < i67) {
                            int i71 = i70;
                            int i72 = iArr4[bArr6[i69] & 255];
                            if (i72 != 0) {
                                iArr5[i71] = i72;
                            } else if (z && bool == null) {
                                bool = Boolean.TRUE;
                            }
                            i69 += i2;
                            i70 = i71 + 1;
                        }
                    } else {
                        int i73 = ((i67 - i66) * i2) + i69;
                        i3 = i55;
                        int i74 = i66;
                        while (i74 < i67) {
                            int i75 = i67;
                            int i76 = c0155Dj.f421c;
                            int i77 = i74;
                            int i78 = i69;
                            int i79 = 0;
                            int i80 = 0;
                            int i81 = 0;
                            int i82 = 0;
                            int i83 = 0;
                            while (true) {
                                if (i78 >= this.f3116p + i69) {
                                    i4 = i56;
                                    break;
                                }
                                byte[] bArr7 = this.f3109i;
                                i4 = i56;
                                if (i78 >= bArr7.length || i78 >= i73) {
                                    break;
                                }
                                int i84 = this.f3101a[bArr7[i78] & 255];
                                if (i84 != 0) {
                                    i79 += (i84 >> 24) & 255;
                                    i80 += (i84 >> 16) & 255;
                                    i81 += (i84 >> 8) & 255;
                                    i82 += i84 & 255;
                                    i83++;
                                }
                                i78++;
                                i56 = i4;
                            }
                            int i85 = i69 + i76;
                            int i86 = i85;
                            while (i86 < this.f3116p + i85) {
                                byte[] bArr8 = this.f3109i;
                                int i87 = i85;
                                if (i86 >= bArr8.length || i86 >= i73) {
                                    break;
                                }
                                int i88 = this.f3101a[bArr8[i86] & 255];
                                if (i88 != 0) {
                                    i79 += (i88 >> 24) & 255;
                                    i80 += (i88 >> 16) & 255;
                                    i81 += (i88 >> 8) & 255;
                                    i82 += i88 & 255;
                                    i83++;
                                }
                                i86++;
                                i85 = i87;
                            }
                            int i89 = i83 == 0 ? 0 : ((i79 / i83) << 24) | ((i80 / i83) << 16) | ((i81 / i83) << 8) | (i82 / i83);
                            if (i89 != 0) {
                                iArr5[i77] = i89;
                            } else if (z && bool == null) {
                                bool = Boolean.TRUE;
                            }
                            i69 += i2;
                            i74 = i77 + 1;
                            i67 = i75;
                            i56 = i4;
                        }
                        i61++;
                        i59 = i;
                        i54 = i63;
                        i55 = i3;
                        i53 = i2;
                        i56 = i56;
                    }
                } else {
                    i2 = i53;
                }
                i3 = i55;
                i61++;
                i59 = i;
                i54 = i63;
                i55 = i3;
                i53 = i2;
                i56 = i56;
            }
            if (this.f3119s == null) {
                this.f3119s = Boolean.valueOf(bool == null ? false : bool.booleanValue());
            }
        } else {
            int i90 = c0155Dj.f422d;
            int i91 = c0155Dj.f420b;
            int i92 = c0155Dj.f421c;
            int i93 = c0155Dj.f419a;
            byte b4 = this.f3111k == 0 ? (byte) 1 : b;
            byte[] bArr9 = this.f3109i;
            int[] iArr6 = this.f3101a;
            byte b5 = -1;
            for (int i94 = b; i94 < i90; i94++) {
                int i95 = this.f3118r;
                int i96 = (i94 + i91) * i95;
                int i97 = i96 + i93;
                int i98 = i97 + i92;
                int i99 = i96 + i95;
                if (i99 < i98) {
                    i98 = i99;
                }
                int i100 = c0155Dj.f421c * i94;
                while (i97 < i98) {
                    byte b6 = bArr9[i100];
                    int i101 = b6 & 255;
                    if (i101 != b5) {
                        int i102 = iArr6[i101];
                        if (i102 != 0) {
                            this.f3110j[i97] = i102;
                        } else {
                            b5 = b6;
                        }
                    }
                    i100++;
                    i97++;
                }
            }
            Boolean bool2 = this.f3119s;
            this.f3119s = Boolean.valueOf((bool2 != null && bool2.booleanValue()) || !(this.f3119s != null || b4 == 0 || b5 == -1));
        }
        if (this.f3114n && ((i5 = c0155Dj.f425g) == 0 || i5 == 1)) {
            if (this.f3113m == null) {
                this.f3113m = m1863a();
            }
            Bitmap bitmap3 = this.f3113m;
            int i103 = this.f3117q;
            int i104 = this.f3118r;
            iArr2 = iArr;
            bitmap3.setPixels(iArr2, 0, i104, 0, 0, i104, i103);
        } else {
            iArr2 = iArr;
        }
        Bitmap bitmapM1863a = m1863a();
        int i105 = this.f3117q;
        int i106 = this.f3118r;
        bitmapM1863a.setPixels(iArr2, 0, i106, 0, 0, i106, i105);
        return bitmapM1863a;
    }
}
