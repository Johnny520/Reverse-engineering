package p283;

import androidx.appcompat.widget.C0137;
import com.android.dx.io.Opcodes;
import lin.xposed.hook.javaplugin.C5554;
import net.bytebuddy.description.method.MethodDescription;
import net.bytebuddy.pool.TypePool;
import p193.C7828;

/* JADX INFO: renamed from: 飘花落叶言楪子世苏哲兰.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8378 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public static final int[] f23137 = {0, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 1, 1, 1, 2, 2, 1, 1, 1, 0, 0, 1, 2, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, -1, 0, -1, -1, -1, -1, -1, -2, -1, -2, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -3, -4, -3, -4, -3, -3, -3, -3, -1, -2, 1, 1, 1, 2, 2, 2, 0, -1, -2, -1, -2, -1, -2, -1, -2, -1, -2, -1, -2, -1, -2, -1, -2, -1, -2, -1, -2, 0, 0, 0, 0, -1, -1, -1, -1, -1, -1, -1, -2, -1, -2, -1, -2, 0, 1, 0, 1, -1, -1, 0, 0, 1, 1, -1, 0, -1, 0, 0, 0, -3, -1, -1, -3, -3, -1, -1, -1, -1, -1, -1, -2, -2, -2, -2, -2, -2, -2, -2, 0, 1, 0, -1, -1, -1, -2, -1, -2, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, -1, -1, 0, 0, -1, -1, 0, 0};

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public int f23138;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public boolean f23139;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final String f23140;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final int f23141;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final int f23142;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int f23143;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C8384 f23144;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public int f23146;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public C8379 f23147;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public int[] f23148;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public boolean f23149;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public int f23150;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public int[] f23151;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final int[] f23152;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final int f23153;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C8379 f23154;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public C8379 f23155;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final int f23156;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final int f23157;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public int f23158;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public int f23159;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public int f23160;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public C8382 f23161;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public C7828 f23163;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public C8378 f23145 = null;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final C8382 f23162 = new C8382();

    public C8378(C8384 c8384, int i, String str, String str2, int i2) {
        this.f23144 = c8384;
        this.f23143 = MethodDescription.CONSTRUCTOR_INTERNAL_NAME.equals(str) ? 262144 | i : i;
        this.f23142 = c8384.m13945(str);
        this.f23141 = c8384.m13945(str2);
        this.f23140 = str2;
        this.f23156 = 0;
        this.f23153 = 0;
        this.f23152 = null;
        this.f23157 = i2;
        if (i2 != 0) {
            int iM13942 = C8383.m13942(str2) >> 2;
            this.f23158 = (i & 8) != 0 ? iM13942 - 1 : iM13942;
            C8379 c8379 = new C8379();
            this.f23154 = c8379;
            m13905(c8379);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void m13891(int i, int i2, int i3) {
        int i4 = i2 + 3 + i3;
        int[] iArr = this.f23148;
        if (iArr == null || iArr.length < i4) {
            this.f23148 = new int[i4];
        }
        int[] iArr2 = this.f23148;
        iArr2[0] = i;
        iArr2[1] = i2;
        iArr2[2] = i3;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0101  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m13892() {
        /*
            Method dump skipped, instruction units count: 294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p283.C8378.m13892():void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m13893(int i, String str, String str2, String str3) {
        int i2;
        int i3;
        C8382 c8382 = this.f23162;
        this.f23138 = c8382.f23199;
        C8384 c8384 = this.f23144;
        C8377 c8377M13946 = c8384.m13946(9, str, str2, str3);
        c8382.m13936(i, c8377M13946.f23133);
        C8379 c8379 = this.f23147;
        if (c8379 != null) {
            int i4 = this.f23157;
            if (i4 == 4 || i4 == 3) {
                c8379.f23171.m13916(i, 0, c8377M13946, c8384);
                return;
            }
            char cCharAt = str3.charAt(0);
            int i5 = -2;
            switch (i) {
                case 178:
                    i2 = this.f23146 + ((cCharAt == 'D' || cCharAt == 'J') ? 2 : 1);
                    break;
                case 179:
                    i3 = this.f23146;
                    if (cCharAt != 'D' && cCharAt != 'J') {
                        i5 = -1;
                    }
                    i2 = i3 + i5;
                    break;
                case 180:
                    i2 = this.f23146 + ((cCharAt == 'D' || cCharAt == 'J') ? 1 : 0);
                    break;
                default:
                    i3 = this.f23146;
                    if (cCharAt == 'D' || cCharAt == 'J') {
                        i5 = -3;
                    }
                    i2 = i3 + i5;
                    break;
            }
            if (i2 > this.f23150) {
                this.f23150 = i2;
            }
            this.f23146 = i2;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m13894(int i, int i2) {
        while (i < i2) {
            int i3 = this.f23148[i];
            C8382 c8382 = this.f23161;
            int i4 = ((-268435456) & i3) >> 28;
            C8384 c8384 = this.f23144;
            if (i4 == 0) {
                int i5 = i3 & 1048575;
                int i6 = i3 & 251658240;
                if (i6 == 16777216) {
                    c8382.m13934(i5);
                } else if (i6 == 33554432) {
                    c8382.m13934(7);
                    c8382.m13939(c8384.m13944(7, c8384.f23221[i5].f23129).f23133);
                } else if (i6 != 50331648) {
                    C5554.m10870();
                    return;
                } else {
                    c8382.m13934(8);
                    c8382.m13939((int) c8384.f23221[i5].f23128);
                }
            } else {
                StringBuilder sb = new StringBuilder();
                while (true) {
                    int i7 = i4 - 1;
                    if (i4 > 0) {
                        sb.append(TypePool.Default.LazyTypeDescription.GenericTypeToken.COMPONENT_TYPE_PATH);
                        i4 = i7;
                    } else {
                        if ((i3 & 251658240) == 33554432) {
                            sb.append('L');
                            sb.append(c8384.f23221[i3 & 1048575].f23129);
                            sb.append(TypePool.Default.LazyTypeDescription.GenericTypeToken.INDEXED_TYPE_DELIMITER);
                        } else {
                            int i8 = i3 & 1048575;
                            if (i8 == 1) {
                                sb.append('I');
                            } else if (i8 == 2) {
                                sb.append('F');
                            } else if (i8 == 3) {
                                sb.append('D');
                            } else if (i8 != 4) {
                                switch (i8) {
                                    case 9:
                                        sb.append('Z');
                                        break;
                                    case 10:
                                        sb.append('B');
                                        break;
                                    case 11:
                                        sb.append('C');
                                        break;
                                    case 12:
                                        sb.append('S');
                                        break;
                                    default:
                                        C5554.m10870();
                                        return;
                                }
                            } else {
                                sb.append('J');
                            }
                        }
                        c8382.m13934(7);
                        c8382.m13939(c8384.m13944(7, sb.toString()).f23133);
                    }
                }
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m13895() {
        int i = this.f23157;
        if (i != 4) {
            if (i == 1) {
                this.f23147.f23165 = (short) this.f23150;
                this.f23147 = null;
                return;
            }
            return;
        }
        C8379 c8379 = new C8379();
        c8379.f23171 = new C8380(c8379, 0);
        C8382 c8382 = this.f23162;
        c8379.m13906(c8382.f23200, c8382.f23199);
        this.f23155.f23174 = c8379;
        this.f23155 = c8379;
        this.f23147 = null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m13896(int i, C8379 c8379) {
        C8379 c83792 = this.f23147;
        c83792.f23175 = new C0137(i, c8379, c83792.f23175);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final void m13897(int i, String str) {
        C8382 c8382 = this.f23162;
        this.f23138 = c8382.f23199;
        C8384 c8384 = this.f23144;
        C8377 c8377M13944 = c8384.m13944(7, str);
        c8382.m13936(i, c8377M13944.f23133);
        C8379 c8379 = this.f23147;
        if (c8379 != null) {
            int i2 = this.f23157;
            if (i2 == 4 || i2 == 3) {
                c8379.f23171.m13916(i, this.f23138, c8377M13944, c8384);
            } else if (i == 187) {
                int i3 = this.f23146 + 1;
                if (i3 > this.f23150) {
                    this.f23150 = i3;
                }
                this.f23146 = i3;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final void m13898(int i, String str, String str2, String str3) {
        C8382 c8382 = this.f23162;
        this.f23138 = c8382.f23199;
        C8384 c8384 = this.f23144;
        C8377 c8377M13946 = c8384.m13946(10, str, str2, str3);
        String str4 = c8377M13946.f23129;
        int i2 = c8377M13946.f23133;
        if (i == 185) {
            c8382.m13936(185, i2);
            if (c8377M13946.f23135 == 0) {
                c8377M13946.f23135 = C8383.m13942(str4);
            }
            c8382.m13937(c8377M13946.f23135 >> 2, 0);
        } else {
            c8382.m13936(i, i2);
        }
        C8379 c8379 = this.f23147;
        if (c8379 != null) {
            int i3 = this.f23157;
            if (i3 == 4 || i3 == 3) {
                c8379.f23171.m13916(i, 0, c8377M13946, c8384);
                return;
            }
            if (c8377M13946.f23135 == 0) {
                c8377M13946.f23135 = C8383.m13942(str4);
            }
            int i4 = c8377M13946.f23135;
            int i5 = (i4 & 3) - (i4 >> 2);
            int i6 = this.f23146;
            int i7 = i == 184 ? i6 + i5 + 1 : i6 + i5;
            if (i7 > this.f23150) {
                this.f23150 = i7;
            }
            this.f23146 = i7;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final void m13899(int i, int i2) {
        C8382 c8382 = this.f23162;
        this.f23138 = c8382.f23199;
        if (i2 < 4 && i != 169) {
            c8382.m13934((i < 54 ? ((i - 21) << 2) + 26 : ((i - 54) << 2) + 59) + i2);
        } else if (i2 >= 256) {
            c8382.m13934(196);
            c8382.m13936(i, i2);
        } else {
            c8382.m13937(i, i2);
        }
        C8379 c8379 = this.f23147;
        int i3 = this.f23157;
        if (c8379 != null) {
            if (i3 == 4 || i3 == 3) {
                c8379.f23171.m13916(i, i2, null, null);
            } else if (i == 169) {
                c8379.f23170 = (short) (c8379.f23170 | 64);
                c8379.f23166 = (short) this.f23146;
                m13895();
            } else {
                int i4 = this.f23146 + f23137[i];
                if (i4 > this.f23150) {
                    this.f23150 = i4;
                }
                this.f23146 = i4;
            }
        }
        if (i3 != 0) {
            int i5 = (i == 22 || i == 24 || i == 55 || i == 57) ? i2 + 2 : i2 + 1;
            if (i5 > this.f23158) {
                this.f23158 = i5;
            }
        }
        if (i < 54 || i3 != 4 || this.f23163 == null) {
            return;
        }
        m13905(new C8379());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final void m13900(int i, int i2) {
        C8382 c8382 = this.f23162;
        this.f23138 = c8382.f23199;
        if (i == 17) {
            c8382.m13936(i, i2);
        } else {
            c8382.m13937(i, i2);
        }
        C8379 c8379 = this.f23147;
        if (c8379 != null) {
            int i3 = this.f23157;
            if (i3 == 4 || i3 == 3) {
                c8379.f23171.m13916(i, i2, null, null);
            } else if (i != 188) {
                int i4 = this.f23146 + 1;
                if (i4 > this.f23150) {
                    this.f23150 = i4;
                }
                this.f23146 = i4;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void m13901(int i) {
        C8382 c8382 = this.f23162;
        this.f23138 = c8382.f23199;
        c8382.m13934(i);
        C8379 c8379 = this.f23147;
        if (c8379 != null) {
            int i2 = this.f23157;
            if (i2 == 4 || i2 == 3) {
                c8379.f23171.m13916(i, 0, null, null);
            } else {
                int i3 = this.f23146 + f23137[i];
                if (i3 > this.f23150) {
                    this.f23150 = i3;
                }
                this.f23146 = i3;
            }
            if ((i < 172 || i > 177) && i != 191) {
                return;
            }
            m13895();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final void m13902(Object obj) {
        C8382 c8382 = this.f23162;
        this.f23138 = c8382.f23199;
        C8384 c8384 = this.f23144;
        C8377 c8377M13949 = c8384.m13949(obj);
        int i = c8377M13949.f23133;
        int i2 = c8377M13949.f23132;
        boolean z = i2 == 5 || i2 == 6;
        if (z) {
            c8382.m13936(20, i);
        } else if (i >= 256) {
            c8382.m13936(19, i);
        } else {
            c8382.m13937(18, i);
        }
        C8379 c8379 = this.f23147;
        if (c8379 != null) {
            int i3 = this.f23157;
            if (i3 == 4 || i3 == 3) {
                c8379.f23171.m13916(18, 0, c8377M13949, c8384);
                return;
            }
            int i4 = this.f23146 + (z ? 2 : 1);
            if (i4 > this.f23150) {
                this.f23150 = i4;
            }
            this.f23146 = i4;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:146:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x0274 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0178 A[PHI: r3
  0x0178: PHI (r3v70 int) = (r3v69 int), (r3v69 int), (r3v72 int), (r3v72 int) binds: [B:89:0x018a, B:93:0x0194, B:79:0x0169, B:83:0x0173] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m13903() {
        /*
            Method dump skipped, instruction units count: 1082
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p283.C8378.m13903():void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final void m13904(int i, C8379 c8379) {
        boolean z;
        C8382 c8382 = this.f23162;
        int i2 = c8382.f23199;
        this.f23138 = i2;
        int i3 = i >= 200 ? i - 33 : i;
        if ((c8379.f23170 & 4) == 0 || c8379.f23169 - i2 >= -32768) {
            if (i3 != i) {
                c8382.m13934(i);
                c8379.m13907(c8382, c8382.f23199 - 1, true);
            } else {
                c8382.m13934(i3);
                c8379.m13907(c8382, c8382.f23199 - 1, false);
            }
            z = false;
        } else {
            if (i3 == 167) {
                c8382.m13934(200);
            } else if (i3 == 168) {
                c8382.m13934(201);
            } else {
                c8382.m13934(i3 >= 198 ? i3 ^ 1 : ((i3 + 1) ^ 1) - 1);
                c8382.m13939(8);
                c8382.m13934(Opcodes.REM_INT_LIT8);
                this.f23139 = true;
                z = true;
                c8379.m13907(c8382, c8382.f23199 - 1, true);
            }
            z = false;
            c8379.m13907(c8382, c8382.f23199 - 1, true);
        }
        C8379 c83792 = this.f23147;
        if (c83792 != null) {
            C8379 c83793 = null;
            int i4 = this.f23157;
            if (i4 == 4) {
                c83792.f23171.m13916(i3, 0, null, null);
                C8379 c8379M13909 = c8379.m13909();
                c8379M13909.f23170 = (short) (c8379M13909.f23170 | 2);
                m13896(0, c8379);
                if (i3 != 167) {
                    c83793 = new C8379();
                }
            } else if (i4 == 3) {
                c83792.f23171.m13916(i3, 0, null, null);
            } else {
                int[] iArr = f23137;
                if (i4 == 2) {
                    this.f23146 += iArr[i3];
                } else if (i3 == 168) {
                    short s = c8379.f23170;
                    if ((s & 32) == 0) {
                        c8379.f23170 = (short) (s | 32);
                        this.f23149 = true;
                    }
                    c83792.f23170 = (short) (c83792.f23170 | 16);
                    m13896(this.f23146 + 1, c8379);
                    c83793 = new C8379();
                } else {
                    int i5 = this.f23146 + iArr[i3];
                    this.f23146 = i5;
                    m13896(i5, c8379);
                }
            }
            if (c83793 != null) {
                if (z) {
                    c83793.f23170 = (short) (c83793.f23170 | 2);
                }
                m13905(c83793);
            }
            if (i3 == 167) {
                m13895();
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final void m13905(C8379 c8379) {
        boolean z = this.f23139;
        C8382 c8382 = this.f23162;
        this.f23139 = z | c8379.m13906(c8382.f23200, c8382.f23199);
        short s = c8379.f23170;
        if ((s & 1) != 0) {
            return;
        }
        int i = 0;
        int i2 = this.f23157;
        if (i2 == 4) {
            C8379 c83792 = this.f23147;
            if (c83792 != null) {
                if (c8379.f23169 == c83792.f23169) {
                    c83792.f23170 = (short) (c83792.f23170 | (s & 2));
                    c8379.f23171 = c83792.f23171;
                    return;
                }
                m13896(0, c8379);
            }
            C8379 c83793 = this.f23155;
            if (c83793 != null) {
                if (c8379.f23169 == c83793.f23169) {
                    c83793.f23170 = (short) (c83793.f23170 | (c8379.f23170 & 2));
                    c8379.f23171 = c83793.f23171;
                    this.f23147 = c83793;
                    return;
                }
                c83793.f23174 = c8379;
            }
            this.f23155 = c8379;
            this.f23147 = c8379;
            c8379.f23171 = new C8380(c8379, i);
            return;
        }
        if (i2 == 3) {
            C8379 c83794 = this.f23147;
            if (c83794 == null) {
                this.f23147 = c8379;
                return;
            } else {
                c83794.f23171.f23185 = c8379;
                return;
            }
        }
        if (i2 != 1) {
            if (i2 == 2 && this.f23147 == null) {
                this.f23147 = c8379;
                return;
            }
            return;
        }
        C8379 c83795 = this.f23147;
        if (c83795 != null) {
            c83795.f23165 = (short) this.f23150;
            m13896(this.f23146, c8379);
        }
        this.f23147 = c8379;
        this.f23146 = 0;
        this.f23150 = 0;
        C8379 c83796 = this.f23155;
        if (c83796 != null) {
            c83796.f23174 = c8379;
        }
        this.f23155 = c8379;
    }
}
