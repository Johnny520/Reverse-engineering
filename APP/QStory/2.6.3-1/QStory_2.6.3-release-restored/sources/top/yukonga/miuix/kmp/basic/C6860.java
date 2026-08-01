package top.yukonga.miuix.kmp.basic;

import androidx.compose.p001ui.layout.AbstractC2505;
import androidx.compose.p001ui.layout.AbstractC2543;
import androidx.compose.p001ui.layout.AbstractC2559;
import androidx.compose.p001ui.layout.InterfaceC2488;
import androidx.compose.p001ui.layout.InterfaceC2490;
import androidx.compose.p001ui.layout.InterfaceC2492;
import androidx.compose.p001ui.layout.InterfaceC2493;
import androidx.window.area.AbstractC3400;
import io.ktor.util.C5043;
import java.util.Iterator;
import java.util.List;
import kotlin.C6008;
import kotlin.collections.AbstractC5171;
import kotlin.jvm.internal.AbstractC5227;
import p068.InterfaceC7387;
import p221.C8727;

/* JADX INFO: renamed from: top.yukonga.miuix.kmp.basic.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6860 implements InterfaceC2493 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C6860 f16806 = new C6860();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x023a  */
    @Override // androidx.compose.p001ui.layout.InterfaceC2493
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final InterfaceC2492 mo1666(InterfaceC2488 interfaceC2488, List list, long j) {
        Object next;
        Object next2;
        AbstractC2559 abstractC2559;
        InterfaceC2490 interfaceC2490;
        InterfaceC2490 interfaceC24902;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int iMo1903 = interfaceC2488.mo1903(8.0f);
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (AbstractC5227.m9466(AbstractC2505.m3674((InterfaceC2490) next), "start")) {
                break;
            }
        }
        InterfaceC2490 interfaceC24903 = (InterfaceC2490) next;
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            InterfaceC2490 interfaceC24904 = (InterfaceC2490) it2.next();
            if (AbstractC5227.m9466(AbstractC2505.m3674(interfaceC24904), "center")) {
                Iterator it3 = list.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it3.next();
                    if (AbstractC5227.m9466(AbstractC2505.m3674((InterfaceC2490) next2), "end")) {
                        break;
                    }
                }
                InterfaceC2490 interfaceC24905 = (InterfaceC2490) next2;
                final int iM13896 = C8727.m13896(j);
                int iM13897 = C8727.m13897(j);
                boolean z = interfaceC24903 != null;
                boolean z2 = interfaceC24905 != null;
                final int i13 = z ? iMo1903 : 0;
                if (!z2) {
                    iMo1903 = 0;
                }
                int i14 = (iM13896 - i13) - iMo1903;
                if (i14 < 0) {
                    i14 = 0;
                }
                int iMo3618 = interfaceC24903 != null ? interfaceC24903.mo3618(iM13897) : 0;
                int iMo36182 = interfaceC24904.mo3618(iM13897);
                int iMo36183 = interfaceC24905 != null ? interfaceC24905.mo3618(iM13897) : 0;
                int i15 = iMo3618 + iMo36182 + iMo36183;
                if (i15 <= i14) {
                    i5 = (i14 - iMo3618) - iMo36183;
                    if (i5 < 0) {
                        i5 = 0;
                    }
                    interfaceC2490 = interfaceC24904;
                    interfaceC24902 = interfaceC24905;
                    i6 = iMo36183;
                    abstractC2559 = null;
                    i4 = iMo3618;
                } else {
                    int iMo3619 = interfaceC24903 != null ? interfaceC24903.mo3619(iM13897) : 0;
                    abstractC2559 = null;
                    int iMo36192 = interfaceC24904.mo3619(iM13897);
                    int iMo36193 = interfaceC24905 != null ? interfaceC24905.mo3619(iM13897) : 0;
                    int i16 = z ? 2 : 0;
                    boolean z3 = z;
                    int i17 = z2 ? 3 : 0;
                    boolean z4 = z2;
                    int i18 = i16 + 5 + i17;
                    if (i18 > 0) {
                        interfaceC2490 = interfaceC24904;
                        interfaceC24902 = interfaceC24905;
                        long j2 = i14;
                        long j3 = ((long) i16) * j2;
                        long j4 = i18;
                        int i19 = (int) (j3 / j4);
                        int i20 = (int) ((5 * j2) / j4);
                        int i21 = (int) ((((long) i17) * j2) / j4);
                        int i22 = (!z3 || iMo3618 <= i19) ? 0 : 1;
                        int i23 = iMo36182 > i20 ? 1 : 0;
                        int i24 = (!z4 || iMo36183 <= i21) ? 0 : 1;
                        int i25 = i22 + i23 + i24;
                        if (i25 == 1) {
                            int i26 = i23;
                            if (i22 == 0) {
                                i7 = i14 - iMo3618;
                            } else {
                                i7 = i14;
                                iMo3618 = 0;
                            }
                            if (i26 == 0) {
                                i7 -= iMo36182;
                            } else {
                                iMo36182 = 0;
                            }
                            if (i24 == 0) {
                                int i27 = iMo36183;
                                iMo36183 = i7 - iMo36183;
                                i8 = i27;
                            } else {
                                iMo36183 = i7;
                                i8 = 0;
                            }
                            if (i22 != 0) {
                                iMo3618 = iMo36183;
                            }
                            if (i26 != 0) {
                                iMo36182 = iMo36183;
                            }
                            if (i24 == 0) {
                                iMo36183 = i8;
                            }
                        } else if (i25 == 2) {
                            if (i22 == 0) {
                                i9 = i14 - iMo3618;
                                i10 = iMo3618;
                            } else {
                                i9 = i14;
                                i10 = 0;
                            }
                            if (i23 == 0) {
                                i9 -= iMo36182;
                                i11 = iMo36182;
                            } else {
                                i11 = 0;
                            }
                            if (i24 == 0) {
                                i9 -= iMo36183;
                                i12 = iMo36183;
                            } else {
                                i12 = 0;
                            }
                            int i28 = i10;
                            int i29 = (i22 != 0 ? iMo3618 : 0) + (i23 != 0 ? iMo36182 : 0) + (i24 != 0 ? iMo36183 : 0);
                            if (i29 > 0) {
                                int i30 = i23;
                                iMo3618 = i22 != 0 ? (int) ((((long) iMo3618) * ((long) i9)) / ((long) i29)) : i28;
                                if (i30 != 0) {
                                    i11 = (int) ((((long) iMo36182) * ((long) i9)) / ((long) i29));
                                }
                                iMo36182 = i11;
                                iMo36183 = i24 != 0 ? (int) ((((long) iMo36183) * ((long) i9)) / ((long) i29)) : i12;
                            } else {
                                iMo36182 = i11;
                                iMo36183 = i12;
                                iMo3618 = i28;
                            }
                        } else if (i25 == 3) {
                            int i31 = i19 + i20 + i21;
                            if (i31 < i14) {
                                iMo36182 = (i14 - i31) + i20;
                                iMo36183 = i21;
                            } else {
                                iMo36183 = i21;
                                iMo36182 = i20;
                            }
                            iMo3618 = i19;
                        } else if (i15 < i14) {
                            iMo36182 += i14 - i15;
                        }
                    } else {
                        interfaceC2490 = interfaceC24904;
                        interfaceC24902 = interfaceC24905;
                        iMo36182 = i14;
                        iMo3618 = 0;
                        iMo36183 = 0;
                    }
                    if (iMo36182 + 1 > iMo36192 || iMo36192 > i14) {
                        i = iMo36192;
                        i2 = iMo36182;
                        i3 = iMo36183;
                        if (i3 + 1 <= iMo36193 || iMo36193 > i14) {
                            i4 = iMo3618;
                            i5 = i2;
                            i6 = i3;
                        } else {
                            int i32 = iMo36193 - i3;
                            int i33 = iMo3618 - iMo3619;
                            if (i33 < 0) {
                                i33 = 0;
                            }
                            int i34 = i2 - i;
                            if (i34 < 0) {
                                i34 = 0;
                            }
                            int i35 = i33 + i34;
                            if (i35 > 0) {
                                int i36 = (int) ((((long) i32) * ((long) i33)) / ((long) i35));
                                if (i36 <= i33) {
                                    i33 = i36;
                                }
                                int i37 = i32 - i33;
                                if (i37 < 0) {
                                    i37 = 0;
                                }
                                if (i37 <= i34) {
                                    i34 = i37;
                                }
                                i5 = i2 - i34;
                                i3 += i33 + i34;
                                i4 = iMo3618 - i33;
                            }
                            i6 = i3;
                        }
                    } else {
                        int i38 = iMo36192 - iMo36182;
                        int i39 = iMo3618 - iMo3619;
                        if (i39 < 0) {
                            i39 = 0;
                        }
                        int i40 = iMo36183 - iMo36193;
                        if (i40 < 0) {
                            i40 = 0;
                        }
                        int i41 = i39 + i40;
                        if (i41 > 0) {
                            int i42 = iMo36182;
                            int i43 = iMo36183;
                            i = iMo36192;
                            int i44 = (int) ((((long) i38) * ((long) i39)) / ((long) i41));
                            if (i44 <= i39) {
                                i39 = i44;
                            }
                            int i45 = i38 - i39;
                            if (i45 < 0) {
                                i45 = 0;
                            }
                            if (i45 <= i40) {
                                i40 = i45;
                            }
                            iMo3618 -= i39;
                            i3 = i43 - i40;
                            i2 = i39 + i40 + i42;
                        }
                        if (i3 + 1 <= iMo36193) {
                            i4 = iMo3618;
                            i5 = i2;
                            i6 = i3;
                        }
                    }
                }
                AbstractC2559 abstractC2559Mo3615 = interfaceC24903 != null ? interfaceC24903.mo3615(C8727.m13895(0, i4, 0, 0, 12, j)) : abstractC2559;
                final int i46 = abstractC2559Mo3615 != null ? abstractC2559Mo3615.f5344 : 0;
                int i47 = abstractC2559Mo3615 != null ? abstractC2559Mo3615.f5342 : 0;
                final AbstractC2559 abstractC2559Mo36152 = interfaceC2490.mo3615(C8727.m13895(0, i5, 0, 0, 12, j));
                final AbstractC2559 abstractC2559Mo36153 = interfaceC24902 != null ? interfaceC24902.mo3615(C8727.m13895(0, i6, 0, 0, 12, j)) : abstractC2559;
                final int i48 = abstractC2559Mo36153 != null ? abstractC2559Mo36153.f5342 : 0;
                final int iMax = Math.max(i47, Math.max(abstractC2559Mo36152.f5342, i48));
                int iM13899 = C8727.m13899(j);
                Integer numValueOf = Integer.valueOf(iM13897);
                if (iM13897 == Integer.MAX_VALUE) {
                    numValueOf = abstractC2559;
                }
                final AbstractC2559 abstractC25592 = abstractC2559Mo3615;
                final int i49 = i47;
                return interfaceC2488.mo2055(iM13896, AbstractC3400.m5650(iMax, iM13899, numValueOf != 0 ? numValueOf.intValue() : iMax), AbstractC5171.m9335(), new InterfaceC7387() { // from class: top.yukonga.miuix.kmp.basic.飘花落叶言子楪苏哲兰世
                    @Override // p068.InterfaceC7387
                    public final Object invoke(Object obj) {
                        AbstractC2543 abstractC2543 = (AbstractC2543) obj;
                        abstractC2543.getClass();
                        int i50 = iMax;
                        int i51 = i50 - i49;
                        if (i51 < 0) {
                            i51 = 0;
                        }
                        int i52 = i51 / 2;
                        AbstractC2559 abstractC25593 = abstractC2559Mo36152;
                        int i53 = (i50 - abstractC25593.f5342) / 2;
                        int i54 = i50 - i48;
                        if (i54 < 0) {
                            i54 = 0;
                        }
                        int i55 = i54 / 2;
                        AbstractC2559 abstractC25594 = abstractC25592;
                        if (abstractC25594 != null) {
                            AbstractC2543.m3692(abstractC2543, abstractC25594, 0, i52);
                        }
                        AbstractC2543.m3692(abstractC2543, abstractC25593, i46 + i13, i53);
                        AbstractC2559 abstractC25595 = abstractC2559Mo36153;
                        if (abstractC25595 != null) {
                            AbstractC2543.m3692(abstractC2543, abstractC25595, iM13896 - abstractC25595.f5344, i55);
                        }
                        return C6008.f15084;
                    }
                });
            }
        }
        C5043.m9176("Collection contains no element matching the predicate.");
        return null;
    }
}
