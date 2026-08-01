package p073O1;

import android.graphics.Bitmap;
import android.util.Log;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Iterator;
import p000A.C0038T0;
import p093S1.C1294f;
import p093S1.InterfaceC1289a;

/* JADX INFO: renamed from: O1.d */
/* JADX INFO: loaded from: classes.dex */
public final class C1042d {

    /* JADX INFO: renamed from: a */
    public int[] f3261a;

    /* JADX INFO: renamed from: c */
    public final C0038T0 f3263c;

    /* JADX INFO: renamed from: d */
    public ByteBuffer f3264d;

    /* JADX INFO: renamed from: e */
    public byte[] f3265e;

    /* JADX INFO: renamed from: f */
    public short[] f3266f;

    /* JADX INFO: renamed from: g */
    public byte[] f3267g;

    /* JADX INFO: renamed from: h */
    public byte[] f3268h;

    /* JADX INFO: renamed from: i */
    public byte[] f3269i;

    /* JADX INFO: renamed from: j */
    public final int[] f3270j;

    /* JADX INFO: renamed from: k */
    public int f3271k;

    /* JADX INFO: renamed from: l */
    public C1040b f3272l;

    /* JADX INFO: renamed from: m */
    public Bitmap f3273m;

    /* JADX INFO: renamed from: n */
    public final boolean f3274n;

    /* JADX INFO: renamed from: o */
    public int f3275o;

    /* JADX INFO: renamed from: p */
    public final int f3276p;

    /* JADX INFO: renamed from: q */
    public final int f3277q;

    /* JADX INFO: renamed from: r */
    public final int f3278r;

    /* JADX INFO: renamed from: s */
    public Boolean f3279s;

    /* JADX INFO: renamed from: b */
    public final int[] f3262b = new int[256];

    /* JADX INFO: renamed from: t */
    public Bitmap.Config f3280t = Bitmap.Config.ARGB_8888;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1042d(C0038T0 c0038t0, C1040b c1040b, ByteBuffer byteBuffer, int i5) {
        this.f3263c = c0038t0;
        this.f3272l = new C1040b();
        synchronized (this) {
            try {
                if (i5 <= 0) {
                    throw new IllegalArgumentException("Sample size must be >=0, not: " + i5);
                }
                int iHighestOneBit = Integer.highestOneBit(i5);
                this.f3275o = 0;
                this.f3272l = c1040b;
                this.f3271k = -1;
                ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
                this.f3264d = byteBufferAsReadOnlyBuffer;
                byteBufferAsReadOnlyBuffer.position(0);
                this.f3264d.order(ByteOrder.LITTLE_ENDIAN);
                this.f3274n = false;
                Iterator it = c1040b.f3250e.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (((C1039a) it.next()).f3241g == 3) {
                        this.f3274n = true;
                        break;
                    }
                }
                this.f3276p = iHighestOneBit;
                int i6 = c1040b.f3251f;
                this.f3278r = i6 / iHighestOneBit;
                int i7 = c1040b.f3252g;
                this.f3277q = i7 / iHighestOneBit;
                int i8 = i6 * i7;
                C1294f c1294f = (C1294f) this.f3263c.f170f;
                this.f3269i = c1294f == null ? new byte[i8] : (byte[]) c1294f.m2384c(i8, byte[].class);
                C0038T0 c0038t02 = this.f3263c;
                int i9 = this.f3278r * this.f3277q;
                C1294f c1294f2 = (C1294f) c0038t02.f170f;
                this.f3270j = c1294f2 == null ? new int[i9] : (int[]) c1294f2.m2384c(i9, int[].class);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final Bitmap m2119a() {
        Boolean bool = this.f3279s;
        Bitmap bitmapMo151b = ((InterfaceC1289a) this.f3263c.f169e).mo151b(this.f3278r, this.f3277q, (bool == null || bool.booleanValue()) ? Bitmap.Config.ARGB_8888 : this.f3280t);
        bitmapMo151b.setHasAlpha(true);
        return bitmapMo151b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final synchronized Bitmap m2120b() {
        try {
            if (this.f3272l.f3248c <= 0 || this.f3271k < 0) {
                if (Log.isLoggable("d", 3)) {
                    Log.d("d", "Unable to decode frame, frameCount=" + this.f3272l.f3248c + ", framePointer=" + this.f3271k);
                }
                this.f3275o = 1;
            }
            int i5 = this.f3275o;
            if (i5 != 1 && i5 != 2) {
                this.f3275o = 0;
                if (this.f3265e == null) {
                    C1294f c1294f = (C1294f) this.f3263c.f170f;
                    this.f3265e = c1294f == null ? new byte[255] : (byte[]) c1294f.m2384c(255, byte[].class);
                }
                C1039a c1039a = (C1039a) this.f3272l.f3250e.get(this.f3271k);
                int i6 = this.f3271k - 1;
                C1039a c1039a2 = i6 >= 0 ? (C1039a) this.f3272l.f3250e.get(i6) : null;
                int[] iArr = c1039a.f3245k;
                if (iArr == null) {
                    iArr = this.f3272l.f3246a;
                }
                this.f3261a = iArr;
                if (iArr == null) {
                    if (Log.isLoggable("d", 3)) {
                        Log.d("d", "No valid color table found for frame #" + this.f3271k);
                    }
                    this.f3275o = 1;
                    return null;
                }
                if (c1039a.f3240f) {
                    System.arraycopy(iArr, 0, this.f3262b, 0, iArr.length);
                    int[] iArr2 = this.f3262b;
                    this.f3261a = iArr2;
                    iArr2[c1039a.f3242h] = 0;
                    if (c1039a.f3241g == 2 && this.f3271k == 0) {
                        this.f3279s = Boolean.TRUE;
                    }
                }
                return m2122d(c1039a, c1039a2);
            }
            if (Log.isLoggable("d", 3)) {
                Log.d("d", "Unable to decode frame, status=" + this.f3275o);
            }
            return null;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final void m2121c(Bitmap.Config config) {
        Bitmap.Config config2;
        Bitmap.Config config3 = Bitmap.Config.ARGB_8888;
        if (config == config3 || config == (config2 = Bitmap.Config.RGB_565)) {
            this.f3280t = config;
            return;
        }
        throw new IllegalArgumentException("Unsupported format: " + config + ", must be one of " + config3 + " or " + config2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:251:? */
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
    public final Bitmap m2122d(C1039a c1039a, C1039a c1039a2) {
        int[] iArr;
        byte b2;
        int i5;
        int i6;
        int i7;
        int i8;
        int[] iArr2;
        int i9;
        short[] sArr;
        int i10;
        short s5;
        int i11;
        Bitmap bitmap;
        C0038T0 c0038t0 = this.f3263c;
        byte b5 = 0;
        int[] iArr3 = this.f3270j;
        if (c1039a2 == null) {
            Bitmap bitmap2 = this.f3273m;
            if (bitmap2 != null) {
                ((InterfaceC1289a) c0038t0.f169e).mo154e(bitmap2);
            }
            this.f3273m = null;
            Arrays.fill(iArr3, 0);
        }
        if (c1039a2 != null && c1039a2.f3241g == 3 && this.f3273m == null) {
            Arrays.fill(iArr3, 0);
        }
        if (c1039a2 != null && (i11 = c1039a2.f3241g) > 0) {
            if (i11 == 2) {
                if (!c1039a.f3240f) {
                    C1040b c1040b = this.f3272l;
                    int i12 = c1040b.f3256k;
                    if (c1039a.f3245k != null && c1040b.f3255j == c1039a.f3242h) {
                        i12 = 0;
                    }
                    int i13 = c1039a2.f3238d;
                    int i14 = this.f3276p;
                    int i15 = i13 / i14;
                    int i16 = c1039a2.f3236b / i14;
                    int i17 = c1039a2.f3237c / i14;
                    int i18 = c1039a2.f3235a / i14;
                    int i19 = this.f3278r;
                    int i20 = (i16 * i19) + i18;
                    int i21 = (i15 * i19) + i20;
                    while (i20 < i21) {
                        int i22 = i20 + i17;
                        for (int i23 = i20; i23 < i22; i23++) {
                            iArr3[i23] = i12;
                        }
                        i20 += this.f3278r;
                    }
                }
            } else if (i11 == 3 && (bitmap = this.f3273m) != null) {
                int i24 = this.f3277q;
                int i25 = this.f3278r;
                bitmap.getPixels(iArr3, 0, i25, 0, 0, i25, i24);
            }
        }
        this.f3264d.position(c1039a.f3244j);
        int i26 = c1039a.f3237c * c1039a.f3238d;
        byte[] bArr = this.f3269i;
        if (bArr == null || bArr.length < i26) {
            C1294f c1294f = (C1294f) c0038t0.f170f;
            this.f3269i = c1294f == null ? new byte[i26] : (byte[]) c1294f.m2384c(i26, byte[].class);
        }
        byte[] bArr2 = this.f3269i;
        if (this.f3266f == null) {
            this.f3266f = new short[4096];
        }
        short[] sArr2 = this.f3266f;
        if (this.f3267g == null) {
            this.f3267g = new byte[4096];
        }
        byte[] bArr3 = this.f3267g;
        if (this.f3268h == null) {
            this.f3268h = new byte[4097];
        }
        byte[] bArr4 = this.f3268h;
        int i27 = this.f3264d.get() & 255;
        int i28 = 1;
        int i29 = 1 << i27;
        int i30 = i29 + 1;
        int i31 = i29 + 2;
        int i32 = i27 + 1;
        int i33 = (1 << i32) - 1;
        int i34 = 0;
        while (i34 < i29) {
            sArr2[i34] = 0;
            bArr3[i34] = (byte) i34;
            i34++;
            i28 = i28;
        }
        int i35 = i28;
        byte[] bArr5 = this.f3265e;
        int i36 = 0;
        int i37 = 0;
        int i38 = 0;
        int i39 = 0;
        int i40 = 0;
        int i41 = 0;
        int i42 = 0;
        int i43 = 0;
        int i44 = i32;
        int i45 = i31;
        int i46 = i33;
        int i47 = -1;
        while (true) {
            if (i36 >= i26) {
                iArr = iArr3;
                b2 = b5;
                break;
            }
            if (i37 == 0) {
                i10 = -1;
                int i48 = this.f3264d.get() & 255;
                if (i48 <= 0) {
                    sArr = sArr2;
                    iArr = iArr3;
                } else {
                    ByteBuffer byteBuffer = this.f3264d;
                    sArr = sArr2;
                    iArr = iArr3;
                    byteBuffer.get(this.f3265e, 0, Math.min(i48, byteBuffer.remaining()));
                }
                if (i48 <= 0) {
                    this.f3275o = 3;
                    b2 = 0;
                    break;
                }
                i37 = i48;
                i38 = 0;
            } else {
                sArr = sArr2;
                iArr = iArr3;
                i10 = -1;
            }
            i40 += (bArr5[i38] & 255) << i39;
            i38++;
            i37--;
            int i49 = i39 + 8;
            int i50 = i45;
            int i51 = i44;
            int i52 = i47;
            int i53 = i42;
            while (true) {
                i39 = i49;
                if (i49 < i51) {
                    i47 = i52;
                    i42 = i53;
                    i44 = i51;
                    iArr3 = iArr;
                    b5 = 0;
                    i45 = i50;
                    sArr2 = sArr;
                    break;
                }
                int i54 = i40 & i46;
                i40 >>= i51;
                i39 -= i51;
                if (i54 == i29) {
                    i51 = i32;
                    i50 = i31;
                    i46 = i33;
                    i49 = i39;
                    i52 = i10;
                } else {
                    if (i54 == i30) {
                        i45 = i50;
                        i44 = i51;
                        i47 = i52;
                        i42 = i53;
                        sArr2 = sArr;
                        iArr3 = iArr;
                        b5 = 0;
                        break;
                    }
                    int i55 = i51;
                    if (i52 == i10) {
                        bArr2[i41] = bArr3[i54];
                        i41++;
                        i36++;
                        i52 = i54;
                        i53 = i52;
                        i49 = i39;
                        i51 = i55;
                    } else {
                        if (i54 >= i50) {
                            bArr4[i43] = (byte) i53;
                            i43++;
                            s5 = i52;
                        } else {
                            s5 = i54;
                        }
                        while (s5 >= i29) {
                            bArr4[i43] = bArr3[s5];
                            i43++;
                            s5 = sArr[s5];
                        }
                        i53 = bArr3[s5] & 255;
                        byte b6 = (byte) i53;
                        bArr2[i41] = b6;
                        while (true) {
                            i41++;
                            i36++;
                            if (i43 <= 0) {
                                break;
                            }
                            i43--;
                            bArr2[i41] = bArr4[i43];
                        }
                        if (i50 < 4096) {
                            sArr[i50] = (short) i52;
                            bArr3[i50] = b6;
                            i50++;
                            if ((i50 & i46) != 0 || i50 >= 4096) {
                                i51 = i55;
                            } else {
                                i51 = i55 + 1;
                                i46 += i50;
                            }
                            i49 = i39;
                            i52 = i54;
                        }
                    }
                    i10 = -1;
                }
            }
        }
        Arrays.fill(bArr2, i41, i26, b2);
        if (c1039a.f3239e || this.f3276p != i35) {
            int i56 = c1039a.f3238d;
            int i57 = this.f3276p;
            int i58 = i56 / i57;
            int i59 = c1039a.f3236b / i57;
            int i60 = c1039a.f3237c / i57;
            int i61 = c1039a.f3235a / i57;
            boolean z5 = this.f3271k == 0;
            byte[] bArr6 = this.f3269i;
            int[] iArr4 = this.f3261a;
            Boolean bool = this.f3279s;
            int i62 = 8;
            int i63 = 0;
            int i64 = 1;
            int i65 = 0;
            while (i65 < i58) {
                if (c1039a.f3239e) {
                    if (i63 >= i58) {
                        i64++;
                        if (i64 == 2) {
                            i63 = 4;
                        } else if (i64 == 3) {
                            i62 = 4;
                            i63 = 2;
                        } else if (i64 == 4) {
                            i63 = 1;
                            i62 = 2;
                        }
                    }
                    i5 = i63 + i62;
                } else {
                    i5 = i63;
                    i63 = i65;
                }
                int i66 = i63 + i59;
                int i67 = i58;
                boolean z6 = i57 == 1;
                if (i66 < this.f3277q) {
                    int i68 = this.f3278r;
                    int i69 = i66 * i68;
                    int i70 = i69 + i61;
                    int i71 = i70 + i60;
                    int i72 = i69 + i68;
                    if (i72 < i71) {
                        i71 = i72;
                    }
                    i6 = i57;
                    int i73 = i65 * i57 * c1039a.f3237c;
                    int[] iArr5 = this.f3270j;
                    if (z6) {
                        int i74 = i70;
                        while (i74 < i71) {
                            int i75 = i74;
                            int i76 = iArr4[bArr6[i73] & 255];
                            if (i76 != 0) {
                                iArr5[i75] = i76;
                            } else if (z5 && bool == null) {
                                bool = Boolean.TRUE;
                            }
                            i73 += i6;
                            i74 = i75 + 1;
                        }
                    } else {
                        int i77 = ((i71 - i70) * i6) + i73;
                        i7 = i59;
                        int i78 = i70;
                        while (i78 < i71) {
                            int i79 = i71;
                            int i80 = c1039a.f3237c;
                            int i81 = i78;
                            int i82 = i73;
                            int i83 = 0;
                            int i84 = 0;
                            int i85 = 0;
                            int i86 = 0;
                            int i87 = 0;
                            while (true) {
                                if (i82 >= this.f3276p + i73) {
                                    i8 = i60;
                                    break;
                                }
                                byte[] bArr7 = this.f3269i;
                                i8 = i60;
                                if (i82 >= bArr7.length || i82 >= i77) {
                                    break;
                                }
                                int i88 = this.f3261a[bArr7[i82] & 255];
                                if (i88 != 0) {
                                    i83 += (i88 >> 24) & 255;
                                    i84 += (i88 >> 16) & 255;
                                    i85 += (i88 >> 8) & 255;
                                    i86 += i88 & 255;
                                    i87++;
                                }
                                i82++;
                                i60 = i8;
                            }
                            int i89 = i73 + i80;
                            int i90 = i89;
                            while (i90 < this.f3276p + i89) {
                                byte[] bArr8 = this.f3269i;
                                int i91 = i89;
                                if (i90 >= bArr8.length || i90 >= i77) {
                                    break;
                                }
                                int i92 = this.f3261a[bArr8[i90] & 255];
                                if (i92 != 0) {
                                    i83 += (i92 >> 24) & 255;
                                    i84 += (i92 >> 16) & 255;
                                    i85 += (i92 >> 8) & 255;
                                    i86 += i92 & 255;
                                    i87++;
                                }
                                i90++;
                                i89 = i91;
                            }
                            int i93 = i87 == 0 ? 0 : ((i83 / i87) << 24) | ((i84 / i87) << 16) | ((i85 / i87) << 8) | (i86 / i87);
                            if (i93 != 0) {
                                iArr5[i81] = i93;
                            } else if (z5 && bool == null) {
                                bool = Boolean.TRUE;
                            }
                            i73 += i6;
                            i78 = i81 + 1;
                            i71 = i79;
                            i60 = i8;
                        }
                        i65++;
                        i63 = i5;
                        i58 = i67;
                        i59 = i7;
                        i57 = i6;
                        i60 = i60;
                    }
                } else {
                    i6 = i57;
                }
                i7 = i59;
                i65++;
                i63 = i5;
                i58 = i67;
                i59 = i7;
                i57 = i6;
                i60 = i60;
            }
            if (this.f3279s == null) {
                this.f3279s = Boolean.valueOf(bool == null ? false : bool.booleanValue());
            }
        } else {
            int i94 = c1039a.f3238d;
            int i95 = c1039a.f3236b;
            int i96 = c1039a.f3237c;
            int i97 = c1039a.f3235a;
            byte b7 = this.f3271k == 0 ? (byte) 1 : b2;
            byte[] bArr9 = this.f3269i;
            int[] iArr6 = this.f3261a;
            byte b8 = -1;
            for (int i98 = b2; i98 < i94; i98++) {
                int i99 = this.f3278r;
                int i100 = (i98 + i95) * i99;
                int i101 = i100 + i97;
                int i102 = i101 + i96;
                int i103 = i100 + i99;
                if (i103 < i102) {
                    i102 = i103;
                }
                int i104 = c1039a.f3237c * i98;
                while (i101 < i102) {
                    byte b9 = bArr9[i104];
                    int i105 = b9 & 255;
                    if (i105 != b8) {
                        int i106 = iArr6[i105];
                        if (i106 != 0) {
                            this.f3270j[i101] = i106;
                        } else {
                            b8 = b9;
                        }
                    }
                    i104++;
                    i101++;
                }
            }
            Boolean bool2 = this.f3279s;
            this.f3279s = Boolean.valueOf((bool2 != null && bool2.booleanValue()) || !(this.f3279s != null || b7 == 0 || b8 == -1));
        }
        if (this.f3274n && ((i9 = c1039a.f3241g) == 0 || i9 == 1)) {
            if (this.f3273m == null) {
                this.f3273m = m2119a();
            }
            Bitmap bitmap3 = this.f3273m;
            int i107 = this.f3277q;
            int i108 = this.f3278r;
            iArr2 = iArr;
            bitmap3.setPixels(iArr2, 0, i108, 0, 0, i108, i107);
        } else {
            iArr2 = iArr;
        }
        Bitmap bitmapM2119a = m2119a();
        int i109 = this.f3277q;
        int i110 = this.f3278r;
        bitmapM2119a.setPixels(iArr2, 0, i110, 0, 0, i110, i109);
        return bitmapM2119a;
    }
}
