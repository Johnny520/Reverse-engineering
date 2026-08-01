package p299;

import androidx.collection.C1115;
import com.android.p002dx.p003cf.attrib.AttCode;
import com.android.p002dx.p003cf.attrib.AttConstantValue;
import com.android.p002dx.p003cf.attrib.AttDeprecated;
import com.android.p002dx.p003cf.attrib.AttExceptions;
import com.android.p002dx.p003cf.attrib.AttSignature;
import com.android.p002dx.p003cf.attrib.AttSynthetic;
import com.android.p002dx.p005io.Opcodes;
import p025.AbstractC7012;
import p160.C8376;
import p209.C8657;
import p332.C9496;

/* JADX INFO: renamed from: 飘花落叶言楪子世苏哲兰.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C9210 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public int f23531;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public int f23532;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public int f23533;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public int f23534;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public int f23536;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public C1115 f23538;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public int[] f23539;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public C9207 f23540;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public int f23541;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public C1115 f23542;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public C9207 f23543;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C9213 f23535 = new C9213(this);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public int f23537 = 4;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C9207 m14489(int i, String str, String str2) {
        C9207 c9207 = new C9207(this.f23535, i, str, str2, this.f23537);
        if (this.f23543 == null) {
            this.f23543 = c9207;
        } else {
            this.f23540.f23490 = c9207;
        }
        this.f23540 = c9207;
        return c9207;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m14490(int i, String str, String str2, String str3, String[] strArr) {
        this.f23536 = 52;
        this.f23534 = i;
        C9213 c9213 = this.f23535;
        c9213.f23565 = 52;
        c9213.f23564 = str;
        this.f23533 = c9213.m14503(7, str).f23478;
        if (str2 != null) {
            this.f23541 = c9213.m14504(str2);
        }
        this.f23532 = str3 == null ? 0 : c9213.m14503(7, str3).f23478;
        if (strArr != null && strArr.length > 0) {
            int length = strArr.length;
            this.f23531 = length;
            this.f23539 = new int[length];
            for (int i2 = 0; i2 < this.f23531; i2++) {
                this.f23539[i2] = c9213.m14503(7, strArr[i2]).f23478;
            }
        }
        if (this.f23537 == 1) {
            this.f23537 = 2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:160:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0366 A[SYNTHETIC] */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final byte[] m14491() {
        int i;
        int i2;
        int i3;
        C9213 c9213;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11 = 2;
        int i12 = (this.f23531 * 2) + 24;
        C1115 c1115 = this.f23538;
        int i13 = 0;
        while (true) {
            i = 131072;
            if (c1115 == null) {
                break;
            }
            i13++;
            int i14 = c1115.f1312;
            C9213 c92132 = (C9213) c1115.f1314;
            if (c1115.f1309 != 0) {
                c92132.m14504(AttConstantValue.ATTRIBUTE_NAME);
                i10 = 16;
            } else {
                i10 = 8;
            }
            if ((i14 & 4096) != 0 && c92132.f23565 < 49) {
                c92132.m14504(AttSynthetic.ATTRIBUTE_NAME);
                i10 += 6;
            }
            if ((i14 & 131072) != 0) {
                c92132.m14504(AttDeprecated.ATTRIBUTE_NAME);
                i10 += 6;
            }
            i12 += i10;
            c1115 = (C1115) c1115.f1308;
        }
        C9207 c9207 = this.f23543;
        int i15 = 0;
        while (true) {
            int i16 = i;
            int i17 = 8;
            if (c9207 == null) {
                int i18 = i12;
                int i19 = i11;
                int i20 = this.f23534 & 4096;
                C9213 c92133 = this.f23535;
                if (i20 == 0 || (this.f23536 & Opcodes.MAX_VALUE) >= 49) {
                    i2 = i18;
                    i3 = 0;
                } else {
                    i2 = i18 + 6;
                    c92133.m14504(AttSynthetic.ATTRIBUTE_NAME);
                    i3 = 1;
                }
                if (this.f23541 != 0) {
                    i3++;
                    i2 += 8;
                    c92133.m14504(AttSignature.ATTRIBUTE_NAME);
                }
                if ((this.f23534 & i16) != 0) {
                    i3++;
                    i2 += 6;
                    c92133.m14504(AttDeprecated.ATTRIBUTE_NAME);
                }
                c92133.getClass();
                C9211 c9211 = c92133.f23560;
                int i21 = i2 + c9211.f23544;
                if (c92133.f23561 > 65535) {
                    C8376.m13331("Class file too large!");
                    return null;
                }
                C9211 c92112 = new C9211(false);
                c92112.f23545 = new byte[i21];
                c92112.m14499(-889275714);
                c92112.m14499(this.f23536);
                c92112.m14498(c92133.f23561);
                c92112.m14492(c9211.f23545, c9211.f23544);
                c92112.m14498((~((this.f23536 & Opcodes.MAX_VALUE) < 49 ? 4096 : 0)) & this.f23534);
                c92112.m14498(this.f23533);
                c92112.m14498(this.f23532);
                c92112.m14498(this.f23531);
                for (int i22 = 0; i22 < this.f23531; i22++) {
                    c92112.m14498(this.f23539[i22]);
                }
                c92112.m14498(i13);
                C1115 c11152 = this.f23538;
                while (c11152 != null) {
                    int i23 = c11152.f1309;
                    int i24 = c11152.f1312;
                    C9213 c92134 = (C9213) c11152.f1314;
                    C9213 c92135 = c92133;
                    boolean z = c92134.f23565 < 49;
                    c92112.m14498((~(z ? 4096 : 0)) & i24);
                    c92112.m14498(c11152.f1311);
                    c92112.m14498(c11152.f1310);
                    int i25 = i23 != 0 ? 1 : 0;
                    boolean z2 = z;
                    int i26 = i24 & 4096;
                    if (i26 != 0 && z2) {
                        i25++;
                    }
                    int i27 = i24 & i16;
                    if (i27 != 0) {
                        i25++;
                    }
                    c92112.m14498(i25);
                    if (i23 != 0) {
                        c92112.m14498(c92134.m14504(AttConstantValue.ATTRIBUTE_NAME));
                        c92112.m14499(i19);
                        c92112.m14498(i23);
                    }
                    if (i26 == 0 || !z2) {
                        i8 = 0;
                    } else {
                        c92112.m14498(c92134.m14504(AttSynthetic.ATTRIBUTE_NAME));
                        i8 = 0;
                        c92112.m14499(0);
                    }
                    if (i27 != 0) {
                        c92112.m14498(c92134.m14504(AttDeprecated.ATTRIBUTE_NAME));
                        c92112.m14499(i8);
                    }
                    c11152 = (C1115) c11152.f1308;
                    c92133 = c92135;
                    i19 = 2;
                }
                C9213 c92136 = c92133;
                c92112.m14498(i15);
                C9207 c92072 = this.f23543;
                boolean z3 = false;
                boolean z4 = false;
                while (c92072 != null) {
                    boolean z5 = z4 | (c92072.f23505 > 0);
                    boolean z6 = z3 | c92072.f23484;
                    int i28 = c92072.f23501;
                    int i29 = c92072.f23498;
                    C9211 c92113 = c92072.f23507;
                    int i30 = c92072.f23488;
                    C9213 c92137 = c92072.f23489;
                    boolean z7 = c92137.f23565 < 49;
                    c92112.m14498((~(z7 ? 4096 : 0)) & i30);
                    c92112.m14498(c92072.f23487);
                    c92112.m14498(c92072.f23486);
                    int i31 = c92113.f23544 > 0 ? 1 : 0;
                    if (i29 > 0) {
                        i31++;
                    }
                    boolean z8 = z7;
                    int i32 = i30 & 4096;
                    if (i32 != 0 && z8) {
                        i31++;
                    }
                    if (i28 != 0) {
                        i31++;
                    }
                    int i33 = i30 & i16;
                    if (i33 != 0) {
                        i31++;
                    }
                    c92112.m14498(i31);
                    int i34 = c92113.f23544;
                    if (i34 > 0) {
                        int i35 = i34 + 10;
                        i4 = i32;
                        i5 = i33;
                        int i36 = 0;
                        for (C8657 c8657 = c92072.f23508; c8657 != null; c8657 = (C8657) c8657.f21712) {
                            i36++;
                        }
                        i6 = i17;
                        int iM12133 = AbstractC7012.m12133(i36, i6, 2, i35);
                        C9211 c92114 = c92072.f23506;
                        if (c92114 != null) {
                            iM12133 += c92114.f23544 + i6;
                            i7 = 1;
                        } else {
                            i7 = 0;
                        }
                        c92112.m14498(c92137.m14504(AttCode.ATTRIBUTE_NAME));
                        c92112.m14499(iM12133);
                        c92112.m14498(c92072.f23504);
                        c92112.m14498(c92072.f23503);
                        c92112.m14499(c92113.f23544);
                        c92112.m14492(c92113.f23545, c92113.f23544);
                        C8657 c86572 = c92072.f23508;
                        int i37 = 0;
                        for (C8657 c86573 = c86572; c86573 != null; c86573 = (C8657) c86573.f21712) {
                            i37++;
                        }
                        c92112.m14498(i37);
                        if (c86572 != null) {
                            c92112.m14498(((C9208) c86572.f21713).f23514);
                            c92112.m14498(((C9208) c86572.f21711).f23514);
                            throw null;
                        }
                        c92112.m14498(i7);
                        if (c92072.f23506 != null) {
                            c92112.m14498(c92137.m14504(c92137.f23565 >= 50 ? "StackMapTable" : "StackMap"));
                            c92112.m14499(c92072.f23506.f23544 + 2);
                            c92112.m14498(c92072.f23505);
                            C9211 c92115 = c92072.f23506;
                            c92112.m14492(c92115.f23545, c92115.f23544);
                        }
                        if (i29 > 0) {
                            c92112.m14498(c92137.m14504(AttExceptions.ATTRIBUTE_NAME));
                            c92112.m14499((i29 * 2) + 2);
                            c92112.m14498(i29);
                            for (int i38 : c92072.f23497) {
                                c92112.m14498(i38);
                            }
                        }
                        if (i4 != 0 && z8) {
                            c92112.m14498(c92137.m14504(AttSynthetic.ATTRIBUTE_NAME));
                            c92112.m14499(0);
                        }
                        if (i28 != 0) {
                            c92112.m14498(c92137.m14504(AttSignature.ATTRIBUTE_NAME));
                            c92112.m14499(2);
                            c92112.m14498(i28);
                        }
                        if (i5 == 0) {
                            c92112.m14498(c92137.m14504(AttDeprecated.ATTRIBUTE_NAME));
                            c92112.m14499(0);
                        }
                        c92072 = c92072.f23490;
                        i17 = i6;
                        z3 = z6;
                        z4 = z5;
                    } else {
                        i4 = i32;
                        i5 = i33;
                        i6 = i17;
                    }
                    if (i29 > 0) {
                    }
                    if (i4 != 0) {
                        c92112.m14498(c92137.m14504(AttSynthetic.ATTRIBUTE_NAME));
                        c92112.m14499(0);
                    }
                    if (i28 != 0) {
                    }
                    if (i5 == 0) {
                    }
                    c92072 = c92072.f23490;
                    i17 = i6;
                    z3 = z6;
                    z4 = z5;
                }
                c92112.m14498(i3);
                if ((this.f23534 & 4096) == 0 || (this.f23536 & Opcodes.MAX_VALUE) >= 49) {
                    c9213 = c92136;
                } else {
                    c9213 = c92136;
                    c92112.m14498(c9213.m14504(AttSynthetic.ATTRIBUTE_NAME));
                    c92112.m14499(0);
                }
                if (this.f23541 != 0) {
                    c92112.m14498(c9213.m14504(AttSignature.ATTRIBUTE_NAME));
                    c92112.m14499(2);
                    c92112.m14498(this.f23541);
                }
                if ((this.f23534 & i16) != 0) {
                    c92112.m14498(c9213.m14504(AttDeprecated.ATTRIBUTE_NAME));
                    c92112.m14499(0);
                }
                byte[] bArr = c92112.f23545;
                if (!z3) {
                    return bArr;
                }
                C9496[] c9496Arr = new C9496[6];
                for (C1115 c11153 = this.f23538; c11153 != null; c11153 = (C1115) c11153.f1308) {
                }
                for (C9207 c92073 = this.f23543; c92073 != null; c92073 = c92073.f23490) {
                }
                System.arraycopy(c9496Arr, 0, new C9496[0], 0, 0);
                this.f23538 = null;
                this.f23542 = null;
                this.f23543 = null;
                this.f23540 = null;
                this.f23537 = z4 ? 3 : 0;
                return m14491();
            }
            i15++;
            int i39 = i11;
            int i40 = c9207.f23488;
            int i41 = c9207.f23498;
            C9213 c92138 = c9207.f23489;
            C9211 c92116 = c9207.f23507;
            int i42 = i12;
            int i43 = c92116.f23544;
            if (i43 <= 0) {
                i9 = 8;
            } else {
                if (i43 > 65535) {
                    C8376.m13331("Method code too large!");
                    return null;
                }
                c92138.m14504(AttCode.ATTRIBUTE_NAME);
                int i44 = c92116.f23544 + 16;
                int i45 = 0;
                for (C8657 c86574 = c9207.f23508; c86574 != null; c86574 = (C8657) c86574.f21712) {
                    i45++;
                }
                i9 = (i45 * 8) + 2 + i44 + 8;
                if (c9207.f23506 != null) {
                    c92138.m14504(c92138.f23565 >= 50 ? "StackMapTable" : "StackMap");
                    i9 += c9207.f23506.f23544 + 8;
                }
            }
            if (i41 > 0) {
                c92138.m14504(AttExceptions.ATTRIBUTE_NAME);
                i9 += (i41 * 2) + 8;
            }
            boolean z9 = c92138.f23565 < 49;
            if ((i40 & 4096) != 0 && z9) {
                c92138.m14504(AttSynthetic.ATTRIBUTE_NAME);
                i9 += 6;
            }
            if (c9207.f23501 != 0) {
                c92138.m14504(AttSignature.ATTRIBUTE_NAME);
                i9 += 8;
            }
            if ((i40 & i16) != 0) {
                c92138.m14504(AttDeprecated.ATTRIBUTE_NAME);
                i9 += 6;
            }
            i12 = i42 + i9;
            c9207 = c9207.f23490;
            i = i16;
            i11 = i39;
        }
    }
}
