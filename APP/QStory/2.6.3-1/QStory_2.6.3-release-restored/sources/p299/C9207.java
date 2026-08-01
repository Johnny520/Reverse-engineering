package p299;

import androidx.appcompat.widget.C0984;
import com.android.p002dx.p005io.Opcodes;
import lin.xposed.hook.javaplugin.C6385;
import net.bytebuddy.description.method.MethodDescription;
import net.bytebuddy.pool.TypePool;
import p209.C8657;

/* JADX INFO: renamed from: 飘花落叶言楪子世苏哲兰.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C9207 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public static final int[] f23482 = {0, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 1, 1, 1, 2, 2, 1, 1, 1, 0, 0, 1, 2, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, -1, 0, -1, -1, -1, -1, -1, -2, -1, -2, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -3, -4, -3, -4, -3, -3, -3, -3, -1, -2, 1, 1, 1, 2, 2, 2, 0, -1, -2, -1, -2, -1, -2, -1, -2, -1, -2, -1, -2, -1, -2, -1, -2, -1, -2, -1, -2, 0, 0, 0, 0, -1, -1, -1, -1, -1, -1, -1, -2, -1, -2, -1, -2, 0, 1, 0, 1, -1, -1, 0, 0, 1, 1, -1, 0, -1, 0, 0, 0, -3, -1, -1, -3, -3, -1, -1, -1, -1, -1, -1, -2, -2, -2, -2, -2, -2, -2, -2, 0, 1, 0, -1, -1, -1, -2, -1, -2, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, -1, -1, 0, 0, -1, -1, 0, 0};

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public int f23483;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public boolean f23484;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final String f23485;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final int f23486;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final int f23487;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int f23488;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C9213 f23489;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public int f23491;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public C9208 f23492;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public int[] f23493;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public boolean f23494;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public int f23495;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public int[] f23496;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final int[] f23497;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final int f23498;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C9208 f23499;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public C9208 f23500;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final int f23501;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final int f23502;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public int f23503;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public int f23504;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public int f23505;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public C9211 f23506;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public C8657 f23508;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public C9207 f23490 = null;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final C9211 f23507 = new C9211();

    public C9207(C9213 c9213, int i, String str, String str2, int i2) {
        this.f23489 = c9213;
        this.f23488 = MethodDescription.CONSTRUCTOR_INTERNAL_NAME.equals(str) ? 262144 | i : i;
        this.f23487 = c9213.m14504(str);
        this.f23486 = c9213.m14504(str2);
        this.f23485 = str2;
        this.f23501 = 0;
        this.f23498 = 0;
        this.f23497 = null;
        this.f23502 = i2;
        if (i2 != 0) {
            int iM14501 = C9212.m14501(str2) >> 2;
            this.f23503 = (i & 8) != 0 ? iM14501 - 1 : iM14501;
            C9208 c9208 = new C9208();
            this.f23499 = c9208;
            m14464(c9208);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void m14450(int i, int i2, int i3) {
        int i4 = i2 + 3 + i3;
        int[] iArr = this.f23493;
        if (iArr == null || iArr.length < i4) {
            this.f23493 = new int[i4];
        }
        int[] iArr2 = this.f23493;
        iArr2[0] = i;
        iArr2[1] = i2;
        iArr2[2] = i3;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0101  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m14451() {
        char c;
        int i;
        int[] iArr = this.f23496;
        if (iArr != null) {
            if (this.f23506 == null) {
                this.f23506 = new C9211();
            }
            int[] iArr2 = this.f23493;
            boolean z = true;
            int i2 = iArr2[1];
            int i3 = iArr2[2];
            int i4 = 0;
            int i5 = 3;
            if (this.f23489.f23565 < 50) {
                C9211 c9211 = this.f23506;
                c9211.m14498(iArr2[0]);
                c9211.m14498(i2);
                int i6 = i2 + 3;
                m14453(3, i6);
                this.f23506.m14498(i3);
                m14453(i6, i3 + i6);
            } else {
                int i7 = this.f23505 == 0 ? iArr2[0] : (iArr2[0] - iArr[0]) - 1;
                int i8 = iArr[1];
                int i9 = i2 - i8;
                if (i3 == 0) {
                    switch (i9) {
                        case -3:
                        case -2:
                        case -1:
                            c = 248;
                            break;
                        case 0:
                            c = i7 >= 64 ? (char) 251 : (char) 0;
                            break;
                        case 1:
                        case 2:
                        case 3:
                            c = 252;
                            break;
                        default:
                            c = 255;
                            break;
                    }
                } else {
                    c = (i9 == 0 && i3 == 1) ? i7 < 63 ? '@' : (char) 247 : (char) 255;
                }
                if (c != 255) {
                    int i10 = 3;
                    while (i4 < i8 && i4 < i2) {
                        boolean z2 = z;
                        i = i5;
                        if (this.f23493[i10] != this.f23496[i10]) {
                            c = 255;
                            if (c == 0) {
                                this.f23506.m14493(i7);
                            } else if (c == '@') {
                                this.f23506.m14493(i7 + 64);
                                m14453(i2 + 3, i2 + 4);
                            } else if (c != 247) {
                                C9211 c92112 = this.f23506;
                                if (c == 248) {
                                    c92112.m14493(i9 + Opcodes.INVOKE_POLYMORPHIC_RANGE);
                                    c92112.m14498(i7);
                                } else if (c == 251) {
                                    c92112.m14493(Opcodes.INVOKE_POLYMORPHIC_RANGE);
                                    c92112.m14498(i7);
                                } else if (c != 252) {
                                    c92112.m14493(Opcodes.CONST_METHOD_TYPE);
                                    c92112.m14498(i7);
                                    c92112.m14498(i2);
                                    int i11 = i2 + 3;
                                    m14453(i, i11);
                                    this.f23506.m14498(i3);
                                    m14453(i11, i3 + i11);
                                } else {
                                    int i12 = i;
                                    c92112.m14493(i9 + Opcodes.INVOKE_POLYMORPHIC_RANGE);
                                    c92112.m14498(i7);
                                    m14453(i8 + i12, i2 + i12);
                                }
                            } else {
                                C9211 c92113 = this.f23506;
                                c92113.m14493(247);
                                c92113.m14498(i7);
                                m14453(i2 + 3, i2 + 4);
                            }
                        } else {
                            i10++;
                            i4++;
                            z = z2;
                            i5 = i;
                        }
                    }
                    i = i5;
                    if (c == 0) {
                    }
                } else {
                    i = i5;
                    if (c == 0) {
                    }
                }
            }
            this.f23505++;
        }
        this.f23496 = this.f23493;
        this.f23493 = null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m14452(int i, String str, String str2, String str3) {
        int i2;
        int i3;
        C9211 c9211 = this.f23507;
        this.f23483 = c9211.f23544;
        C9213 c9213 = this.f23489;
        C9206 c9206M14505 = c9213.m14505(9, str, str2, str3);
        c9211.m14495(i, c9206M14505.f23478);
        C9208 c9208 = this.f23492;
        if (c9208 != null) {
            int i4 = this.f23502;
            if (i4 == 4 || i4 == 3) {
                c9208.f23516.m14475(i, 0, c9206M14505, c9213);
                return;
            }
            char cCharAt = str3.charAt(0);
            int i5 = -2;
            switch (i) {
                case 178:
                    i2 = this.f23491 + ((cCharAt == 'D' || cCharAt == 'J') ? 2 : 1);
                    break;
                case 179:
                    i3 = this.f23491;
                    if (cCharAt != 'D' && cCharAt != 'J') {
                        i5 = -1;
                    }
                    i2 = i3 + i5;
                    break;
                case 180:
                    i2 = this.f23491 + ((cCharAt == 'D' || cCharAt == 'J') ? 1 : 0);
                    break;
                default:
                    i3 = this.f23491;
                    if (cCharAt == 'D' || cCharAt == 'J') {
                        i5 = -3;
                    }
                    i2 = i3 + i5;
                    break;
            }
            if (i2 > this.f23495) {
                this.f23495 = i2;
            }
            this.f23491 = i2;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m14453(int i, int i2) {
        while (i < i2) {
            int i3 = this.f23493[i];
            C9211 c9211 = this.f23506;
            int i4 = ((-268435456) & i3) >> 28;
            C9213 c9213 = this.f23489;
            if (i4 == 0) {
                int i5 = i3 & 1048575;
                int i6 = i3 & 251658240;
                if (i6 == 16777216) {
                    c9211.m14493(i5);
                } else if (i6 == 33554432) {
                    c9211.m14493(7);
                    c9211.m14498(c9213.m14503(7, c9213.f23566[i5].f23474).f23478);
                } else if (i6 != 50331648) {
                    C6385.m11429();
                    return;
                } else {
                    c9211.m14493(8);
                    c9211.m14498((int) c9213.f23566[i5].f23473);
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
                            sb.append(c9213.f23566[i3 & 1048575].f23474);
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
                                        C6385.m11429();
                                        return;
                                }
                            } else {
                                sb.append('J');
                            }
                        }
                        c9211.m14493(7);
                        c9211.m14498(c9213.m14503(7, sb.toString()).f23478);
                    }
                }
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m14454() {
        int i = this.f23502;
        if (i != 4) {
            if (i == 1) {
                this.f23492.f23510 = (short) this.f23495;
                this.f23492 = null;
                return;
            }
            return;
        }
        C9208 c9208 = new C9208();
        c9208.f23516 = new C9209(c9208, 0);
        C9211 c9211 = this.f23507;
        c9208.m14465(c9211.f23545, c9211.f23544);
        this.f23500.f23519 = c9208;
        this.f23500 = c9208;
        this.f23492 = null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m14455(int i, C9208 c9208) {
        C9208 c92082 = this.f23492;
        c92082.f23520 = new C0984(i, c9208, c92082.f23520);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final void m14456(int i, String str) {
        C9211 c9211 = this.f23507;
        this.f23483 = c9211.f23544;
        C9213 c9213 = this.f23489;
        C9206 c9206M14503 = c9213.m14503(7, str);
        c9211.m14495(i, c9206M14503.f23478);
        C9208 c9208 = this.f23492;
        if (c9208 != null) {
            int i2 = this.f23502;
            if (i2 == 4 || i2 == 3) {
                c9208.f23516.m14475(i, this.f23483, c9206M14503, c9213);
            } else if (i == 187) {
                int i3 = this.f23491 + 1;
                if (i3 > this.f23495) {
                    this.f23495 = i3;
                }
                this.f23491 = i3;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final void m14457(int i, String str, String str2, String str3) {
        C9211 c9211 = this.f23507;
        this.f23483 = c9211.f23544;
        C9213 c9213 = this.f23489;
        C9206 c9206M14505 = c9213.m14505(10, str, str2, str3);
        String str4 = c9206M14505.f23474;
        int i2 = c9206M14505.f23478;
        if (i == 185) {
            c9211.m14495(185, i2);
            if (c9206M14505.f23480 == 0) {
                c9206M14505.f23480 = C9212.m14501(str4);
            }
            c9211.m14496(c9206M14505.f23480 >> 2, 0);
        } else {
            c9211.m14495(i, i2);
        }
        C9208 c9208 = this.f23492;
        if (c9208 != null) {
            int i3 = this.f23502;
            if (i3 == 4 || i3 == 3) {
                c9208.f23516.m14475(i, 0, c9206M14505, c9213);
                return;
            }
            if (c9206M14505.f23480 == 0) {
                c9206M14505.f23480 = C9212.m14501(str4);
            }
            int i4 = c9206M14505.f23480;
            int i5 = (i4 & 3) - (i4 >> 2);
            int i6 = this.f23491;
            int i7 = i == 184 ? i6 + i5 + 1 : i6 + i5;
            if (i7 > this.f23495) {
                this.f23495 = i7;
            }
            this.f23491 = i7;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final void m14458(int i, int i2) {
        C9211 c9211 = this.f23507;
        this.f23483 = c9211.f23544;
        if (i2 < 4 && i != 169) {
            c9211.m14493((i < 54 ? ((i - 21) << 2) + 26 : ((i - 54) << 2) + 59) + i2);
        } else if (i2 >= 256) {
            c9211.m14493(196);
            c9211.m14495(i, i2);
        } else {
            c9211.m14496(i, i2);
        }
        C9208 c9208 = this.f23492;
        int i3 = this.f23502;
        if (c9208 != null) {
            if (i3 == 4 || i3 == 3) {
                c9208.f23516.m14475(i, i2, null, null);
            } else if (i == 169) {
                c9208.f23515 = (short) (c9208.f23515 | 64);
                c9208.f23511 = (short) this.f23491;
                m14454();
            } else {
                int i4 = this.f23491 + f23482[i];
                if (i4 > this.f23495) {
                    this.f23495 = i4;
                }
                this.f23491 = i4;
            }
        }
        if (i3 != 0) {
            int i5 = (i == 22 || i == 24 || i == 55 || i == 57) ? i2 + 2 : i2 + 1;
            if (i5 > this.f23503) {
                this.f23503 = i5;
            }
        }
        if (i < 54 || i3 != 4 || this.f23508 == null) {
            return;
        }
        m14464(new C9208());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final void m14459(int i, int i2) {
        C9211 c9211 = this.f23507;
        this.f23483 = c9211.f23544;
        if (i == 17) {
            c9211.m14495(i, i2);
        } else {
            c9211.m14496(i, i2);
        }
        C9208 c9208 = this.f23492;
        if (c9208 != null) {
            int i3 = this.f23502;
            if (i3 == 4 || i3 == 3) {
                c9208.f23516.m14475(i, i2, null, null);
            } else if (i != 188) {
                int i4 = this.f23491 + 1;
                if (i4 > this.f23495) {
                    this.f23495 = i4;
                }
                this.f23491 = i4;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void m14460(int i) {
        C9211 c9211 = this.f23507;
        this.f23483 = c9211.f23544;
        c9211.m14493(i);
        C9208 c9208 = this.f23492;
        if (c9208 != null) {
            int i2 = this.f23502;
            if (i2 == 4 || i2 == 3) {
                c9208.f23516.m14475(i, 0, null, null);
            } else {
                int i3 = this.f23491 + f23482[i];
                if (i3 > this.f23495) {
                    this.f23495 = i3;
                }
                this.f23491 = i3;
            }
            if ((i < 172 || i > 177) && i != 191) {
                return;
            }
            m14454();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final void m14461(Object obj) {
        C9211 c9211 = this.f23507;
        this.f23483 = c9211.f23544;
        C9213 c9213 = this.f23489;
        C9206 c9206M14508 = c9213.m14508(obj);
        int i = c9206M14508.f23478;
        int i2 = c9206M14508.f23477;
        boolean z = i2 == 5 || i2 == 6;
        if (z) {
            c9211.m14495(20, i);
        } else if (i >= 256) {
            c9211.m14495(19, i);
        } else {
            c9211.m14496(18, i);
        }
        C9208 c9208 = this.f23492;
        if (c9208 != null) {
            int i3 = this.f23502;
            if (i3 == 4 || i3 == 3) {
                c9208.f23516.m14475(18, 0, c9206M14508, c9213);
                return;
            }
            int i4 = this.f23491 + (z ? 2 : 1);
            if (i4 > this.f23495) {
                this.f23495 = i4;
            }
            this.f23491 = i4;
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
    */
    public final void m14462() {
        int i;
        int i2;
        String str;
        int i3;
        char c;
        char c2;
        byte[] bArr;
        boolean zM14472;
        boolean zM144722;
        char c3;
        int iM14485;
        int i4;
        int i5;
        int i6;
        int i7;
        C9208 c9208 = this.f23499;
        C9208 c92082 = C9208.f23509;
        int i8 = this.f23502;
        if (i8 != 4) {
            if (i8 != 1) {
                if (i8 == 2) {
                    this.f23504 = this.f23495;
                    return;
                } else {
                    this.f23504 = 0;
                    this.f23503 = 0;
                    return;
                }
            }
            for (C8657 c8657 = this.f23508; c8657 != null; c8657 = (C8657) c8657.f21712) {
                C9208 c92083 = (C9208) c8657.f21711;
                for (C9208 c92084 = (C9208) c8657.f21713; c92084 != c92083; c92084 = c92084.f23519) {
                    int i9 = c92084.f23515 & 16;
                    C0984 c0984 = c92084.f23520;
                    if (i9 == 0) {
                        c92084.f23520 = new C0984(Integer.MAX_VALUE, (C9208) null, c0984);
                    } else {
                        C0984 c09842 = (C0984) c0984.f939;
                        c09842.f939 = new C0984(Integer.MAX_VALUE, (C9208) null, (C0984) c09842.f939);
                    }
                }
            }
            if (this.f23494) {
                c9208.f23518 = c92082;
                C9208 c9208M14467 = c9208;
                while (c9208M14467 != c92082) {
                    C9208 c92085 = c9208M14467.f23518;
                    c9208M14467.f23518 = null;
                    if (c9208M14467.f23517 == 0) {
                        c9208M14467.f23517 = (short) 1;
                        c9208M14467 = c9208M14467.m14467(c92085);
                    } else {
                        c9208M14467 = c92085;
                    }
                }
                i = 1;
                short s = 1;
                for (short s2 = 1; s2 <= s; s2 = (short) (s2 + 1)) {
                    for (C9208 c92086 = c9208; c92086 != null; c92086 = c92086.f23519) {
                        if ((c92086.f23515 & 16) != 0 && c92086.f23517 == s2) {
                            C9208 c9208M144672 = (C9208) ((C0984) c92086.f23520.f939).f940;
                            if (c9208M144672.f23517 == 0) {
                                s = (short) (s + 1);
                                c9208M144672.f23518 = c92082;
                                while (c9208M144672 != c92082) {
                                    C9208 c92087 = c9208M144672.f23518;
                                    c9208M144672.f23518 = null;
                                    if (c9208M144672.f23517 == 0) {
                                        c9208M144672.f23517 = s;
                                        c9208M144672 = c9208M144672.m14467(c92087);
                                    } else {
                                        c9208M144672 = c92087;
                                    }
                                }
                            }
                        }
                    }
                }
                for (C9208 c92088 = c9208; c92088 != null; c92088 = c92088.f23519) {
                    if ((c92088.f23515 & 16) != 0) {
                        C9208 c9208M144673 = (C9208) ((C0984) c92088.f23520.f939).f940;
                        c9208M144673.f23518 = c92082;
                        C9208 c92089 = c92082;
                        while (c9208M144673 != c92082) {
                            C9208 c920810 = c9208M144673.f23518;
                            c9208M144673.f23518 = c92089;
                            if ((c9208M144673.f23515 & 64) != 0 && c9208M144673.f23517 != c92088.f23517) {
                                c9208M144673.f23520 = new C0984(c9208M144673.f23511, (C9208) c92088.f23520.f940, c9208M144673.f23520);
                            }
                            c92089 = c9208M144673;
                            c9208M144673 = c9208M144673.m14467(c920810);
                        }
                        while (c92089 != c92082) {
                            C9208 c920811 = c92089.f23518;
                            c92089.f23518 = null;
                            c92089 = c920811;
                        }
                    }
                }
            } else {
                i = 1;
            }
            c9208.f23518 = c92082;
            int i10 = this.f23504;
            while (c9208 != c92082) {
                C9208 c920812 = c9208.f23518;
                short s3 = c9208.f23512;
                int i11 = c9208.f23510 + s3;
                if (i11 > i10) {
                    i10 = i11;
                }
                C0984 c09843 = c9208.f23520;
                if ((c9208.f23515 & 16) != 0) {
                    c09843 = (C0984) c09843.f939;
                }
                c9208 = c920812;
                while (c09843 != null) {
                    C9208 c920813 = (C9208) c09843.f940;
                    if (c920813.f23518 == null) {
                        int i12 = c09843.f941;
                        c920813.f23512 = (short) (i12 == Integer.MAX_VALUE ? i : i12 + s3);
                        c920813.f23518 = c9208;
                        c9208 = c920813;
                    }
                    c09843 = (C0984) c09843.f939;
                }
            }
            this.f23504 = i10;
            return;
        }
        C8657 c86572 = this.f23508;
        C9213 c9213 = this.f23489;
        if (c86572 != null) {
            c9213.m14510("java/lang/Throwable");
            throw null;
        }
        C9209 c9209 = c9208.f23516;
        int i13 = this.f23503;
        c9209.getClass();
        int[] iArr = new int[i13];
        c9209.f23525 = iArr;
        c9209.f23524 = new int[0];
        int i14 = this.f23488;
        int i15 = 33554432;
        if ((i14 & 8) == 0) {
            if ((i14 & 262144) == 0) {
                iArr[0] = c9213.m14510(c9213.f23564) | 33554432;
            } else {
                iArr[0] = 16777222;
            }
            i2 = 1;
        } else {
            i2 = 0;
        }
        int i16 = 0;
        int i17 = 1;
        while (true) {
            str = this.f23485;
            char cCharAt = str.charAt(i17);
            i3 = i15;
            c = TypePool.Default.LazyTypeDescription.GenericTypeToken.COMPONENT_TYPE_PATH;
            c2 = ')';
            if (cCharAt == ')') {
                break;
            }
            while (str.charAt(i17) == '[') {
                i17++;
            }
            int i18 = i17 + 1;
            if (str.charAt(i17) == 'L') {
                while (true) {
                    i7 = i18 + 1;
                    if (str.charAt(i18) == ';') {
                        break;
                    } else {
                        i18 = i7;
                    }
                }
                i17 = i7;
            } else {
                i17 = i18;
            }
            i16++;
            i15 = i3;
        }
        C9212[] c9212Arr = new C9212[i16];
        int i19 = 1;
        int i20 = 0;
        while (str.charAt(i19) != c2) {
            int i21 = i19;
            while (str.charAt(i21) == c) {
                i21++;
            }
            int i22 = i21 + 1;
            if (str.charAt(i21) == 'L') {
                while (true) {
                    i6 = i22 + 1;
                    if (str.charAt(i22) == ';') {
                        break;
                    } else {
                        i22 = i6;
                    }
                }
                i22 = i6;
            }
            c9212Arr[i20] = C9212.m14500(i19, i22, str);
            i19 = i22;
            i20++;
            c2 = ')';
            c = TypePool.Default.LazyTypeDescription.GenericTypeToken.COMPONENT_TYPE_PATH;
        }
        for (int i23 = 0; i23 < i16; i23++) {
            int iM14471 = C9209.m14471(c9213, c9212Arr[i23].m14502(), 0);
            int[] iArr2 = c9209.f23525;
            int i24 = i2 + 1;
            iArr2[i2] = iM14471;
            if (iM14471 == 16777220 || iM14471 == 16777219) {
                i2 += 2;
                iArr2[i24] = 16777216;
            } else {
                i2 = i24;
            }
        }
        while (i2 < i13) {
            c9209.f23525[i2] = 16777216;
            i2++;
        }
        c9209.m14477(this);
        c9208.f23518 = c92082;
        C9208 c920814 = c9208;
        int iMax = 0;
        while (c920814 != c92082) {
            C9208 c920815 = c920814.f23518;
            c920814.f23518 = null;
            c920814.f23515 = (short) (c920814.f23515 | 8);
            int length = c920814.f23516.f23524.length + c920814.f23510;
            if (length > iMax) {
                iMax = length;
            }
            C0984 c09844 = c920814.f23520;
            while (c09844 != null) {
                C9208 c9208M14468 = ((C9208) c09844.f940).m14468();
                C9209 c92092 = c920814.f23516;
                C9209 c92093 = c9208M14468.f23516;
                int i25 = c09844.f941;
                int length2 = c92092.f23525.length;
                int length3 = c92092.f23524.length;
                if (c92093.f23525 == null) {
                    c92093.f23525 = new int[length2];
                    zM14472 = true;
                } else {
                    zM14472 = false;
                }
                int i26 = iMax;
                C9208 c920816 = c920814;
                int i27 = 0;
                while (i27 < length2) {
                    int[] iArr3 = c92092.f23523;
                    int i28 = length3;
                    if (iArr3 == null || i27 >= iArr3.length || (i4 = iArr3[i27]) == 0) {
                        iM14485 = c92092.f23525[i27];
                    } else {
                        int i29 = i4 & (-268435456);
                        int i30 = i4 & 251658240;
                        if (i30 == 67108864) {
                            i5 = i29 + c92092.f23525[i4 & 1048575];
                            iM14485 = ((i4 & 1048576) == 0 || !(i5 == 16777220 || i5 == 16777219)) ? i5 : 16777216;
                        } else if (i30 == 83886080) {
                            i5 = i29 + c92092.f23524[i28 - (i4 & 1048575)];
                            if ((i4 & 1048576) == 0 || (i5 != 16777220 && i5 != 16777219)) {
                            }
                        } else {
                            iM14485 = i4;
                        }
                    }
                    if (c92092.f23529 != null) {
                        iM14485 = c92092.m14485(c9213, iM14485);
                    }
                    zM14472 |= C9209.m14472(c9213, iM14485, c92093.f23525, i27);
                    i27++;
                    length3 = i28;
                }
                int i31 = length3;
                if (i25 > 0) {
                    for (int i32 = 0; i32 < length2; i32++) {
                        zM14472 |= C9209.m14472(c9213, c92092.f23525[i32], c92093.f23525, i32);
                    }
                    if (c92093.f23524 == null) {
                        c92093.f23524 = new int[1];
                        zM14472 = true;
                    }
                    zM144722 = C9209.m14472(c9213, i25, c92093.f23524, 0) | zM14472;
                } else {
                    int length4 = c92092.f23524.length + c92092.f23521;
                    if (c92093.f23524 == null) {
                        c92093.f23524 = new int[c92092.f23528 + length4];
                        zM14472 = true;
                    }
                    for (int i33 = 0; i33 < length4; i33++) {
                        int iM144852 = c92092.f23524[i33];
                        if (c92092.f23529 != null) {
                            iM144852 = c92092.m14485(c9213, iM144852);
                        }
                        zM14472 |= C9209.m14472(c9213, iM144852, c92093.f23524, i33);
                    }
                    int i34 = 0;
                    while (i34 < c92092.f23528) {
                        int iM144853 = c92092.f23522[i34];
                        int i35 = iM144853 & (-268435456);
                        int i36 = iM144853 & 251658240;
                        int i37 = length4;
                        if (i36 == 67108864) {
                            int i38 = i35 + c92092.f23525[iM144853 & 1048575];
                            iM144853 = ((iM144853 & 1048576) == 0 || !(i38 == 16777220 || i38 == 16777219)) ? i38 : 16777216;
                        } else {
                            if (i36 == 83886080) {
                                int i39 = i35 + c92092.f23524[i31 - (iM144853 & 1048575)];
                                if ((iM144853 & 1048576) != 0) {
                                    c3 = 3;
                                    if (i39 == 16777220 || i39 == 16777219) {
                                        iM144853 = 16777216;
                                    }
                                } else {
                                    c3 = 3;
                                }
                                iM144853 = i39;
                            }
                            if (c92092.f23529 == null) {
                                iM144853 = c92092.m14485(c9213, iM144853);
                            }
                            zM14472 |= C9209.m14472(c9213, iM144853, c92093.f23524, i37 + i34);
                            i34++;
                            length4 = i37;
                        }
                        if (c92092.f23529 == null) {
                        }
                        zM14472 |= C9209.m14472(c9213, iM144853, c92093.f23524, i37 + i34);
                        i34++;
                        length4 = i37;
                    }
                    zM144722 = zM14472;
                }
                if (zM144722 && c9208M14468.f23518 == null) {
                    c9208M14468.f23518 = c920815;
                    c920815 = c9208M14468;
                }
                c09844 = (C0984) c09844.f939;
                iMax = i26;
                c920814 = c920816;
            }
            c920814 = c920815;
        }
        while (c9208 != null) {
            if ((c9208.f23515 & 10) == 10) {
                c9208.f23516.m14477(this);
            }
            if ((c9208.f23515 & 8) == 0) {
                C9208 c920817 = c9208.f23519;
                int i40 = c9208.f23514;
                C9211 c9211 = this.f23507;
                int i41 = (c920817 == null ? c9211.f23544 : c920817.f23514) - 1;
                if (i41 >= i40) {
                    int i42 = i40;
                    while (true) {
                        bArr = c9211.f23545;
                        if (i42 >= i41) {
                            break;
                        }
                        bArr[i42] = 0;
                        i42++;
                    }
                    bArr[i41] = -65;
                    m14450(i40, 0, 1);
                    this.f23493[3] = c9213.m14510("java/lang/Throwable") | i3;
                    m14451();
                    this.f23508 = C8657.m13748(this.f23508, c9208, c920817);
                    iMax = Math.max(iMax, 1);
                }
            }
            c9208 = c9208.f23519;
        }
        this.f23504 = iMax;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final void m14463(int i, C9208 c9208) {
        boolean z;
        C9211 c9211 = this.f23507;
        int i2 = c9211.f23544;
        this.f23483 = i2;
        int i3 = i >= 200 ? i - 33 : i;
        if ((c9208.f23515 & 4) == 0 || c9208.f23514 - i2 >= -32768) {
            if (i3 != i) {
                c9211.m14493(i);
                c9208.m14466(c9211, c9211.f23544 - 1, true);
            } else {
                c9211.m14493(i3);
                c9208.m14466(c9211, c9211.f23544 - 1, false);
            }
            z = false;
        } else {
            if (i3 == 167) {
                c9211.m14493(200);
            } else if (i3 == 168) {
                c9211.m14493(201);
            } else {
                c9211.m14493(i3 >= 198 ? i3 ^ 1 : ((i3 + 1) ^ 1) - 1);
                c9211.m14498(8);
                c9211.m14493(Opcodes.REM_INT_LIT8);
                this.f23484 = true;
                z = true;
                c9208.m14466(c9211, c9211.f23544 - 1, true);
            }
            z = false;
            c9208.m14466(c9211, c9211.f23544 - 1, true);
        }
        C9208 c92082 = this.f23492;
        if (c92082 != null) {
            C9208 c92083 = null;
            int i4 = this.f23502;
            if (i4 == 4) {
                c92082.f23516.m14475(i3, 0, null, null);
                C9208 c9208M14468 = c9208.m14468();
                c9208M14468.f23515 = (short) (c9208M14468.f23515 | 2);
                m14455(0, c9208);
                if (i3 != 167) {
                    c92083 = new C9208();
                }
            } else if (i4 == 3) {
                c92082.f23516.m14475(i3, 0, null, null);
            } else {
                int[] iArr = f23482;
                if (i4 == 2) {
                    this.f23491 += iArr[i3];
                } else if (i3 == 168) {
                    short s = c9208.f23515;
                    if ((s & 32) == 0) {
                        c9208.f23515 = (short) (s | 32);
                        this.f23494 = true;
                    }
                    c92082.f23515 = (short) (c92082.f23515 | 16);
                    m14455(this.f23491 + 1, c9208);
                    c92083 = new C9208();
                } else {
                    int i5 = this.f23491 + iArr[i3];
                    this.f23491 = i5;
                    m14455(i5, c9208);
                }
            }
            if (c92083 != null) {
                if (z) {
                    c92083.f23515 = (short) (c92083.f23515 | 2);
                }
                m14464(c92083);
            }
            if (i3 == 167) {
                m14454();
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final void m14464(C9208 c9208) {
        boolean z = this.f23484;
        C9211 c9211 = this.f23507;
        this.f23484 = z | c9208.m14465(c9211.f23545, c9211.f23544);
        short s = c9208.f23515;
        if ((s & 1) != 0) {
            return;
        }
        int i = 0;
        int i2 = this.f23502;
        if (i2 == 4) {
            C9208 c92082 = this.f23492;
            if (c92082 != null) {
                if (c9208.f23514 == c92082.f23514) {
                    c92082.f23515 = (short) (c92082.f23515 | (s & 2));
                    c9208.f23516 = c92082.f23516;
                    return;
                }
                m14455(0, c9208);
            }
            C9208 c92083 = this.f23500;
            if (c92083 != null) {
                if (c9208.f23514 == c92083.f23514) {
                    c92083.f23515 = (short) (c92083.f23515 | (c9208.f23515 & 2));
                    c9208.f23516 = c92083.f23516;
                    this.f23492 = c92083;
                    return;
                }
                c92083.f23519 = c9208;
            }
            this.f23500 = c9208;
            this.f23492 = c9208;
            c9208.f23516 = new C9209(c9208, i);
            return;
        }
        if (i2 == 3) {
            C9208 c92084 = this.f23492;
            if (c92084 == null) {
                this.f23492 = c9208;
                return;
            } else {
                c92084.f23516.f23530 = c9208;
                return;
            }
        }
        if (i2 != 1) {
            if (i2 == 2 && this.f23492 == null) {
                this.f23492 = c9208;
                return;
            }
            return;
        }
        C9208 c92085 = this.f23492;
        if (c92085 != null) {
            c92085.f23510 = (short) this.f23495;
            m14455(this.f23491, c9208);
        }
        this.f23492 = c9208;
        this.f23491 = 0;
        this.f23495 = 0;
        C9208 c92086 = this.f23500;
        if (c92086 != null) {
            c92086.f23519 = c9208;
        }
        this.f23500 = c9208;
    }
}
