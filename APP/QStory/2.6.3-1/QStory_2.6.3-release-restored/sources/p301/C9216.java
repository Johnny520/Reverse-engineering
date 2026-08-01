package p301;

import android.graphics.Bitmap;
import android.util.Log;
import androidx.activity.AbstractC0900;
import com.android.p002dx.p005io.Opcodes;
import com.bumptech.glide.load.engine.bitmap_recycle.C3806;
import com.bumptech.glide.load.engine.bitmap_recycle.InterfaceC3811;
import com.esotericsoftware.kryo.util.DefaultClassResolver;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Iterator;
import p246.C8882;
import top.linl.dexparser.bean.DexMap;

/* JADX INFO: renamed from: 飘花落叶言楪子兰哲世苏.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C9216 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public short[] f23568;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public byte[] f23569;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public ByteBuffer f23570;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C8882 f23571;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public int[] f23573;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public Boolean f23575;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final boolean f23576;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public Bitmap f23577;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final int f23578;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final int f23579;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public int f23580;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final int f23581;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public byte[] f23582;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public byte[] f23583;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public int f23584;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public C9218 f23585;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public byte[] f23586;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final int[] f23587;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int[] f23572 = new int[256];

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public Bitmap.Config f23574 = Bitmap.Config.ARGB_8888;

    public C9216(C8882 c8882, C9218 c9218, ByteBuffer byteBuffer, int i) {
        this.f23571 = c8882;
        this.f23585 = new C9218();
        synchronized (this) {
            try {
                if (i <= 0) {
                    throw new IllegalArgumentException("Sample size must be >=0, not: " + i);
                }
                int iHighestOneBit = Integer.highestOneBit(i);
                this.f23580 = 0;
                this.f23585 = c9218;
                this.f23584 = -1;
                ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
                this.f23570 = byteBufferAsReadOnlyBuffer;
                byteBufferAsReadOnlyBuffer.position(0);
                this.f23570.order(ByteOrder.LITTLE_ENDIAN);
                this.f23576 = false;
                Iterator it = c9218.f23593.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (((C9219) it.next()).f23610 == 3) {
                        this.f23576 = true;
                        break;
                    }
                }
                this.f23581 = iHighestOneBit;
                int i2 = c9218.f23592;
                this.f23579 = i2 / iHighestOneBit;
                int i3 = c9218.f23599;
                this.f23578 = i3 / iHighestOneBit;
                int i4 = i2 * i3;
                C3806 c3806 = (C3806) this.f23571.f22569;
                this.f23586 = c3806 == null ? new byte[i4] : (byte[]) c3806.m7006(i4, byte[].class);
                C8882 c88822 = this.f23571;
                int i5 = this.f23579 * this.f23578;
                C3806 c38062 = (C3806) c88822.f22569;
                this.f23587 = c38062 == null ? new int[i5] : (int[]) c38062.m7006(i5, int[].class);
            } catch (Throwable th) {
                throw th;
            }
        }
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
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Bitmap m14513(C9219 c9219, C9219 c92192) {
        int[] iArr;
        int i;
        int i2;
        int i3;
        int i4;
        int[] iArr2;
        int i5;
        short[] sArr;
        byte[] bArr;
        short s;
        int i6;
        C8882 c8882 = this.f23571;
        byte b = 0;
        int[] iArr3 = this.f23587;
        if (c92192 == null) {
            Bitmap bitmap = this.f23577;
            if (bitmap != null) {
                ((InterfaceC3811) c8882.f22570).mo7015(bitmap);
            }
            this.f23577 = null;
            Arrays.fill(iArr3, 0);
        }
        if (c92192 != null && c92192.f23610 == 3 && this.f23577 == null) {
            Arrays.fill(iArr3, 0);
        }
        int i7 = this.f23579;
        int i8 = this.f23581;
        if (c92192 != null && (i6 = c92192.f23610) > 0) {
            if (i6 == 2) {
                if (!c9219.f23603) {
                    C9218 c9218 = this.f23585;
                    int i9 = c9218.f23600;
                    if (c9219.f23611 != null && c9218.f23602 == c9219.f23609) {
                        i9 = 0;
                    }
                    int i10 = c92192.f23605 / i8;
                    int i11 = c92192.f23607 / i8;
                    int i12 = c92192.f23606 / i8;
                    int i13 = (i11 * i7) + (c92192.f23608 / i8);
                    int i14 = (i10 * i7) + i13;
                    while (i13 < i14) {
                        int i15 = i13 + i12;
                        for (int i16 = i13; i16 < i15; i16++) {
                            iArr3[i16] = i9;
                        }
                        i13 += i7;
                    }
                }
            } else if (i6 == 3) {
                Bitmap bitmap2 = this.f23577;
                if (bitmap2 != null) {
                    int i17 = this.f23578;
                    int i18 = this.f23579;
                    bitmap2.getPixels(iArr3, 0, i18, 0, 0, i18, i17);
                }
            }
        }
        this.f23570.position(c9219.f23613);
        int i19 = c9219.f23606 * c9219.f23605;
        byte[] bArr2 = this.f23586;
        if (bArr2 == null || bArr2.length < i19) {
            C3806 c3806 = (C3806) c8882.f22569;
            this.f23586 = c3806 == null ? new byte[i19] : (byte[]) c3806.m7006(i19, byte[].class);
        }
        byte[] bArr3 = this.f23586;
        if (this.f23568 == null) {
            this.f23568 = new short[4096];
        }
        short[] sArr2 = this.f23568;
        if (this.f23583 == null) {
            this.f23583 = new byte[4096];
        }
        byte[] bArr4 = this.f23583;
        if (this.f23582 == null) {
            this.f23582 = new byte[DexMap.TYPE_TYPE_LIST];
        }
        byte[] bArr5 = this.f23582;
        int i20 = this.f23570.get() & DefaultClassResolver.NAME;
        int i21 = 1 << i20;
        int i22 = i21 + 1;
        int i23 = i21 + 2;
        int i24 = i20 + 1;
        int i25 = (1 << i24) - 1;
        for (int i26 = 0; i26 < i21; i26++) {
            sArr2[i26] = 0;
            bArr4[i26] = (byte) i26;
        }
        byte[] bArr6 = this.f23569;
        int i27 = 0;
        int i28 = 0;
        int i29 = 0;
        int i30 = 0;
        int i31 = 0;
        int i32 = 0;
        int i33 = 0;
        int i34 = 0;
        int i35 = i24;
        int i36 = i23;
        int i37 = i25;
        int i38 = -1;
        int i39 = -1;
        while (true) {
            if (i27 >= i19) {
                iArr = iArr3;
                break;
            }
            if (i28 == 0) {
                int i40 = this.f23570.get() & DefaultClassResolver.NAME;
                if (i40 <= 0) {
                    i28 = i40;
                    iArr = iArr3;
                    sArr = sArr2;
                    bArr = bArr6;
                } else {
                    iArr = iArr3;
                    ByteBuffer byteBuffer = this.f23570;
                    sArr = sArr2;
                    bArr = bArr6;
                    i28 = i40;
                    byteBuffer.get(this.f23569, 0, Math.min(i40, byteBuffer.remaining()));
                }
                if (i28 <= 0) {
                    this.f23580 = 3;
                    b = 0;
                    break;
                }
                i29 = 0;
            } else {
                iArr = iArr3;
                sArr = sArr2;
                bArr = bArr6;
            }
            i31 += (bArr[i29] & DefaultClassResolver.NAME) << i30;
            i29++;
            i28--;
            int i41 = i39;
            int i42 = i30 + 8;
            int i43 = i36;
            int i44 = i35;
            byte[] bArr7 = bArr4;
            int i45 = i33;
            while (true) {
                i30 = i42;
                if (i42 < i44) {
                    i33 = i45;
                    bArr4 = bArr7;
                    i35 = i44;
                    iArr3 = iArr;
                    bArr6 = bArr;
                    i38 = -1;
                    i39 = i41;
                    i36 = i43;
                    sArr2 = sArr;
                    break;
                }
                int i46 = i31 & i37;
                i31 >>= i44;
                i30 -= i44;
                if (i46 == i21) {
                    i44 = i24;
                    i43 = i23;
                    i37 = i25;
                    i41 = i38;
                    i42 = i30;
                } else {
                    if (i46 == i22) {
                        i36 = i43;
                        i35 = i44;
                        i33 = i45;
                        bArr4 = bArr7;
                        iArr3 = iArr;
                        sArr2 = sArr;
                        bArr6 = bArr;
                        i39 = i41;
                        break;
                    }
                    int i47 = i44;
                    if (i41 == i38) {
                        bArr3[i32] = bArr7[i46];
                        i32++;
                        i27++;
                        i41 = i46;
                        i45 = i41;
                        i42 = i30;
                        i44 = i47;
                    } else {
                        if (i46 >= i43) {
                            bArr5[i34] = (byte) i45;
                            i34++;
                            s = i41;
                        } else {
                            s = i46;
                        }
                        while (s >= i21) {
                            bArr5[i34] = bArr7[s];
                            i34++;
                            s = sArr[s];
                        }
                        i45 = bArr7[s] & DefaultClassResolver.NAME;
                        byte b2 = (byte) i45;
                        bArr3[i32] = b2;
                        while (true) {
                            i32++;
                            i27++;
                            if (i34 <= 0) {
                                break;
                            }
                            i34--;
                            bArr3[i32] = bArr5[i34];
                        }
                        int i48 = i21;
                        if (i43 < 4096) {
                            sArr[i43] = (short) i41;
                            bArr7[i43] = b2;
                            i43++;
                            if ((i43 & i37) != 0 || i43 >= 4096) {
                                i44 = i47;
                            } else {
                                i44 = i47 + 1;
                                i37 += i43;
                            }
                            i41 = i46;
                            i42 = i30;
                            i21 = i48;
                        }
                    }
                    i38 = -1;
                }
            }
            b = 0;
        }
        Arrays.fill(bArr3, i32, i19, b);
        boolean z = c9219.f23604;
        int[] iArr4 = this.f23587;
        if (z || i8 != 1) {
            int i49 = c9219.f23605 / i8;
            int i50 = c9219.f23607 / i8;
            int i51 = c9219.f23606 / i8;
            int i52 = c9219.f23608 / i8;
            boolean z2 = this.f23584 == 0;
            byte[] bArr8 = this.f23586;
            int[] iArr5 = this.f23573;
            Boolean bool = this.f23575;
            int i53 = 8;
            int i54 = 0;
            int i55 = 0;
            int i56 = 1;
            while (i54 < i49) {
                int i57 = i50;
                if (c9219.f23604) {
                    if (i55 >= i49) {
                        i56++;
                        if (i56 == 2) {
                            i55 = 4;
                        } else if (i56 == 3) {
                            i53 = 4;
                            i55 = 2;
                        } else if (i56 == 4) {
                            i55 = 1;
                            i53 = 2;
                        }
                    }
                    i = i55 + i53;
                } else {
                    i = i55;
                    i55 = i54;
                }
                int i58 = i55 + i57;
                int i59 = i49;
                boolean z3 = i8 == 1;
                if (i58 < this.f23578) {
                    int i60 = i58 * i7;
                    int i61 = i60 + i52;
                    i2 = i;
                    int i62 = i61 + i51;
                    int i63 = i60 + i7;
                    if (i63 < i62) {
                        i62 = i63;
                    }
                    i3 = i51;
                    int i64 = i54 * i8 * c9219.f23606;
                    if (z3) {
                        while (i61 < i62) {
                            int i65 = iArr5[bArr8[i64] & DefaultClassResolver.NAME];
                            if (i65 != 0) {
                                iArr4[i61] = i65;
                            } else if (z2 && bool == null) {
                                bool = Boolean.TRUE;
                            }
                            i64 += i8;
                            i61++;
                        }
                    } else {
                        int iM703 = AbstractC0900.m703(i62, i61, i8, i64);
                        while (i61 < i62) {
                            int i66 = i61;
                            int i67 = c9219.f23606;
                            int i68 = i62;
                            int i69 = i64;
                            int i70 = 0;
                            int i71 = 0;
                            int i72 = 0;
                            int i73 = 0;
                            int i74 = 0;
                            while (true) {
                                if (i69 >= i64 + i8) {
                                    i4 = i52;
                                    break;
                                }
                                byte[] bArr9 = this.f23586;
                                i4 = i52;
                                if (i69 >= bArr9.length || i69 >= iM703) {
                                    break;
                                }
                                int i75 = this.f23573[bArr9[i69] & DefaultClassResolver.NAME];
                                if (i75 != 0) {
                                    i70 += (i75 >> 24) & Opcodes.CONST_METHOD_TYPE;
                                    i71 += (i75 >> 16) & Opcodes.CONST_METHOD_TYPE;
                                    i72 += (i75 >> 8) & Opcodes.CONST_METHOD_TYPE;
                                    i73 += i75 & Opcodes.CONST_METHOD_TYPE;
                                    i74++;
                                }
                                i69++;
                                i52 = i4;
                            }
                            int i76 = i64 + i67;
                            int i77 = i76;
                            while (i77 < i76 + i8) {
                                byte[] bArr10 = this.f23586;
                                int i78 = i76;
                                if (i77 >= bArr10.length || i77 >= iM703) {
                                    break;
                                }
                                int i79 = this.f23573[bArr10[i77] & DefaultClassResolver.NAME];
                                if (i79 != 0) {
                                    i70 += (i79 >> 24) & Opcodes.CONST_METHOD_TYPE;
                                    i71 += (i79 >> 16) & Opcodes.CONST_METHOD_TYPE;
                                    i72 += (i79 >> 8) & Opcodes.CONST_METHOD_TYPE;
                                    i73 += i79 & Opcodes.CONST_METHOD_TYPE;
                                    i74++;
                                }
                                i77++;
                                i76 = i78;
                            }
                            int i80 = i74 == 0 ? 0 : ((i70 / i74) << 24) | ((i71 / i74) << 16) | ((i72 / i74) << 8) | (i73 / i74);
                            if (i80 != 0) {
                                iArr4[i66] = i80;
                            } else if (z2 && bool == null) {
                                bool = Boolean.TRUE;
                            }
                            i64 += i8;
                            i61 = i66 + 1;
                            i62 = i68;
                            i52 = i4;
                        }
                    }
                } else {
                    i2 = i;
                    i3 = i51;
                }
                i54++;
                i50 = i57;
                i49 = i59;
                i55 = i2;
                i51 = i3;
                i52 = i52;
            }
            if (this.f23575 == null) {
                this.f23575 = Boolean.valueOf(bool == null ? false : bool.booleanValue());
            }
        } else {
            int i81 = c9219.f23605;
            int i82 = c9219.f23607;
            int i83 = c9219.f23606;
            int i84 = c9219.f23608;
            byte b3 = this.f23584 == 0 ? (byte) 1 : b;
            byte[] bArr11 = this.f23586;
            int[] iArr6 = this.f23573;
            byte b4 = -1;
            for (int i85 = b; i85 < i81; i85++) {
                int i86 = (i85 + i82) * i7;
                int i87 = i86 + i84;
                int i88 = i87 + i83;
                int i89 = i86 + i7;
                if (i89 < i88) {
                    i88 = i89;
                }
                int i90 = c9219.f23606 * i85;
                while (i87 < i88) {
                    int i91 = i81;
                    byte b5 = bArr11[i90];
                    int[] iArr7 = iArr4;
                    int i92 = b5 & DefaultClassResolver.NAME;
                    if (i92 != b4) {
                        int i93 = iArr6[i92];
                        if (i93 != 0) {
                            iArr7[i87] = i93;
                        } else {
                            b4 = b5;
                        }
                    }
                    i90++;
                    i87++;
                    i81 = i91;
                    iArr4 = iArr7;
                }
            }
            Boolean bool2 = this.f23575;
            this.f23575 = Boolean.valueOf((bool2 != null && bool2.booleanValue()) || !(this.f23575 != null || b3 == 0 || b4 == -1));
        }
        if (this.f23576 && ((i5 = c9219.f23610) == 0 || i5 == 1)) {
            if (this.f23577 == null) {
                this.f23577 = m14516();
            }
            Bitmap bitmap3 = this.f23577;
            int i94 = this.f23578;
            int i95 = this.f23579;
            iArr2 = iArr;
            bitmap3.setPixels(iArr2, 0, i95, 0, 0, i95, i94);
        } else {
            iArr2 = iArr;
        }
        Bitmap bitmapM14516 = m14516();
        int i96 = this.f23578;
        int i97 = this.f23579;
        bitmapM14516.setPixels(iArr2, 0, i97, 0, 0, i97, i96);
        return bitmapM14516;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m14514(Bitmap.Config config) {
        Bitmap.Config config2;
        Bitmap.Config config3 = Bitmap.Config.ARGB_8888;
        if (config == config3 || config == (config2 = Bitmap.Config.RGB_565)) {
            this.f23574 = config;
            return;
        }
        throw new IllegalArgumentException("Unsupported format: " + config + ", must be one of " + config3 + " or " + config2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final synchronized Bitmap m14515() {
        try {
            if (this.f23585.f23595 <= 0 || this.f23584 < 0) {
                if (Log.isLoggable("飘花落叶言子楪世哲兰苏", 3)) {
                    Log.d("飘花落叶言子楪世哲兰苏", "Unable to decode frame, frameCount=" + this.f23585.f23595 + ", framePointer=" + this.f23584);
                }
                this.f23580 = 1;
            }
            int i = this.f23580;
            if (i != 1 && i != 2) {
                this.f23580 = 0;
                if (this.f23569 == null) {
                    C3806 c3806 = (C3806) this.f23571.f22569;
                    this.f23569 = c3806 == null ? new byte[Opcodes.CONST_METHOD_TYPE] : (byte[]) c3806.m7006(Opcodes.CONST_METHOD_TYPE, byte[].class);
                }
                C9219 c9219 = (C9219) this.f23585.f23593.get(this.f23584);
                int i2 = this.f23584 - 1;
                C9219 c92192 = i2 >= 0 ? (C9219) this.f23585.f23593.get(i2) : null;
                int[] iArr = c9219.f23611;
                if (iArr == null) {
                    iArr = this.f23585.f23597;
                }
                this.f23573 = iArr;
                if (iArr == null) {
                    if (Log.isLoggable("飘花落叶言子楪世哲兰苏", 3)) {
                        Log.d("飘花落叶言子楪世哲兰苏", "No valid color table found for frame #" + this.f23584);
                    }
                    this.f23580 = 1;
                    return null;
                }
                if (c9219.f23603) {
                    System.arraycopy(iArr, 0, this.f23572, 0, iArr.length);
                    int[] iArr2 = this.f23572;
                    this.f23573 = iArr2;
                    iArr2[c9219.f23609] = 0;
                    if (c9219.f23610 == 2 && this.f23584 == 0) {
                        this.f23575 = Boolean.TRUE;
                    }
                }
                return m14513(c9219, c92192);
            }
            if (Log.isLoggable("飘花落叶言子楪世哲兰苏", 3)) {
                Log.d("飘花落叶言子楪世哲兰苏", "Unable to decode frame, status=" + this.f23580);
            }
            return null;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Bitmap m14516() {
        Boolean bool = this.f23575;
        Bitmap bitmapMo7016 = ((InterfaceC3811) this.f23571.f22570).mo7016(this.f23579, this.f23578, (bool == null || bool.booleanValue()) ? Bitmap.Config.ARGB_8888 : this.f23574);
        bitmapMo7016.setHasAlpha(true);
        return bitmapMo7016;
    }
}
