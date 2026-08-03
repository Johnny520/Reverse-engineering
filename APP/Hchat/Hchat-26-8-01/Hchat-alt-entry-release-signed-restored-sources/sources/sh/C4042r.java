package sh;

import gg.AbstractC1416l;
import java.util.Iterator;
import java.util.List;
import p085fg.InterfaceC1231l;
import p136j8.C2104o;
import p259r9.AbstractC3754e0;
import p276sf.C3967n;
import p293u2.C4231a;
import p308v1.AbstractC4374a1;
import p308v1.AbstractC4377b1;
import p308v1.AbstractC4434w;
import p308v1.InterfaceC4409m0;
import p308v1.InterfaceC4412n0;
import p308v1.InterfaceC4415o0;
import p308v1.InterfaceC4418p0;
import tf.C4174u;

/* JADX INFO: renamed from: sh.r */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4042r implements InterfaceC4412n0 {

    /* JADX INFO: renamed from: a */
    public static final C4042r f13339a = new C4042r();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x02b3  */
    @Override // p308v1.InterfaceC4412n0
    /* JADX INFO: renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final InterfaceC4415o0 mo3994h(InterfaceC4418p0 interfaceC4418p0, List list, long j3) {
        Object next;
        Object next2;
        InterfaceC4409m0 interfaceC4409m0;
        InterfaceC4409m0 interfaceC4409m02;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int iMo1590G0 = interfaceC4418p0.mo1590G0(8);
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (AbstractC1416l.m3825a(AbstractC4434w.m8885i((InterfaceC4409m0) next), "start")) {
                break;
            }
        }
        InterfaceC4409m0 interfaceC4409m03 = (InterfaceC4409m0) next;
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            InterfaceC4409m0 interfaceC4409m04 = (InterfaceC4409m0) it2.next();
            if (AbstractC1416l.m3825a(AbstractC4434w.m8885i(interfaceC4409m04), "center")) {
                Iterator it3 = list.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it3.next();
                    if (AbstractC1416l.m3825a(AbstractC4434w.m8885i((InterfaceC4409m0) next2), "end")) {
                        break;
                    }
                }
                InterfaceC4409m0 interfaceC4409m05 = (InterfaceC4409m0) next2;
                final int iM8504h = C4231a.m8504h(j3);
                int iM8503g = C4231a.m8503g(j3);
                boolean z9 = interfaceC4409m03 != null;
                boolean z10 = interfaceC4409m05 != null;
                final int i23 = z9 ? iMo1590G0 : 0;
                if (!z10) {
                    iMo1590G0 = 0;
                }
                int i24 = (iM8504h - i23) - iMo1590G0;
                if (i24 < 0) {
                    i24 = 0;
                }
                int iMo8830M = interfaceC4409m03 != null ? interfaceC4409m03.mo8830M(iM8503g) : 0;
                int iMo8830M2 = interfaceC4409m04.mo8830M(iM8503g);
                int iMo8830M3 = interfaceC4409m05 != null ? interfaceC4409m05.mo8830M(iM8503g) : 0;
                int i25 = iMo8830M + iMo8830M2 + iMo8830M3;
                if (i25 > i24) {
                    int iMo8829G = interfaceC4409m03 != null ? interfaceC4409m03.mo8829G(iM8503g) : 0;
                    int iMo8829G2 = interfaceC4409m04.mo8829G(iM8503g);
                    int iMo8829G3 = interfaceC4409m05 != null ? interfaceC4409m05.mo8829G(iM8503g) : 0;
                    int i26 = z9 ? 2 : 0;
                    boolean z11 = z9;
                    int i27 = z10 ? 3 : 0;
                    boolean z12 = z10;
                    int i28 = i26 + 5 + i27;
                    if (i28 > 0) {
                        interfaceC4409m0 = interfaceC4409m04;
                        interfaceC4409m02 = interfaceC4409m05;
                        long j4 = i24;
                        long j5 = ((long) i26) * j4;
                        long j10 = i28;
                        int i29 = (int) (j5 / j10);
                        int i30 = (int) ((((long) 5) * j4) / j10);
                        int i31 = (int) ((((long) i27) * j4) / j10);
                        int i32 = (!z11 || iMo8830M <= i29) ? 0 : 1;
                        int i33 = iMo8830M2 > i30 ? 1 : 0;
                        int i34 = (!z12 || iMo8830M3 <= i31) ? 0 : 1;
                        int i35 = i32 + i33 + i34;
                        if (i35 == 1) {
                            int i36 = i33;
                            if (i32 == 0) {
                                i17 = i24 - iMo8830M;
                            } else {
                                i17 = i24;
                                iMo8830M = 0;
                            }
                            if (i36 == 0) {
                                i17 -= iMo8830M2;
                            } else {
                                iMo8830M2 = 0;
                            }
                            if (i34 == 0) {
                                int i37 = iMo8830M3;
                                iMo8830M3 = i17 - iMo8830M3;
                                i18 = i37;
                            } else {
                                iMo8830M3 = i17;
                                i18 = 0;
                            }
                            if (i32 != 0) {
                                iMo8830M = iMo8830M3;
                            }
                            if (i36 != 0) {
                                iMo8830M2 = iMo8830M3;
                            }
                            if (i34 == 0) {
                                iMo8830M3 = i18;
                            }
                        } else if (i35 == 2) {
                            if (i32 == 0) {
                                i19 = i24 - iMo8830M;
                                i20 = iMo8830M;
                            } else {
                                i19 = i24;
                                i20 = 0;
                            }
                            if (i33 == 0) {
                                i19 -= iMo8830M2;
                                i21 = iMo8830M2;
                            } else {
                                i21 = 0;
                            }
                            if (i34 == 0) {
                                i19 -= iMo8830M3;
                                i22 = iMo8830M3;
                            } else {
                                i22 = 0;
                            }
                            int i38 = i20;
                            int i39 = (i32 != 0 ? iMo8830M : 0) + (i33 != 0 ? iMo8830M2 : 0) + (i34 != 0 ? iMo8830M3 : 0);
                            if (i39 > 0) {
                                int i40 = i33;
                                iMo8830M = i32 != 0 ? (int) ((((long) iMo8830M) * ((long) i19)) / ((long) i39)) : i38;
                                if (i40 != 0) {
                                    i21 = (int) ((((long) iMo8830M2) * ((long) i19)) / ((long) i39));
                                }
                                iMo8830M2 = i21;
                                iMo8830M3 = i34 != 0 ? (int) ((((long) iMo8830M3) * ((long) i19)) / ((long) i39)) : i22;
                            } else {
                                iMo8830M2 = i21;
                                iMo8830M3 = i22;
                                iMo8830M = i38;
                            }
                        } else if (i35 == 3) {
                            int i41 = i29 + i30 + i31;
                            if (i41 < i24) {
                                iMo8830M2 = (i24 - i41) + i30;
                                iMo8830M3 = i31;
                            } else {
                                iMo8830M3 = i31;
                                iMo8830M2 = i30;
                            }
                            iMo8830M = i29;
                        } else if (i25 < i24) {
                            iMo8830M2 += i24 - i25;
                        }
                    } else {
                        interfaceC4409m0 = interfaceC4409m04;
                        interfaceC4409m02 = interfaceC4409m05;
                        iMo8830M2 = i24;
                        iMo8830M = 0;
                        iMo8830M3 = 0;
                    }
                    if (iMo8830M2 + 1 > iMo8829G2 || iMo8829G2 > i24) {
                        i9 = iMo8829G2;
                        i10 = iMo8830M2;
                        iMo8830M3 = iMo8830M3;
                        if (iMo8830M3 + 1 <= iMo8829G3 && iMo8829G3 <= i24) {
                            int i42 = iMo8829G3 - iMo8830M3;
                            i13 = iMo8830M - iMo8829G;
                            if (i13 < 0) {
                                i13 = 0;
                            }
                            i14 = i10 - i9;
                            if (i14 < 0) {
                                i14 = 0;
                            }
                            i15 = i13 + i14;
                            if (i15 > 0) {
                                int i43 = (int) ((((long) i42) * ((long) i13)) / ((long) i15));
                                if (i43 <= i13) {
                                    i13 = i43;
                                }
                                int i44 = i42 - i13;
                                if (i44 < 0) {
                                    i44 = 0;
                                }
                                if (i44 <= i14) {
                                    i14 = i44;
                                }
                                i16 = i10 - i14;
                                iMo8830M3 += i13 + i14;
                                i11 = iMo8830M - i13;
                            }
                        }
                        i11 = iMo8830M;
                        i12 = i10;
                    } else {
                        int i45 = iMo8829G2 - iMo8830M2;
                        int i46 = iMo8830M - iMo8829G;
                        if (i46 < 0) {
                            i46 = 0;
                        }
                        int i47 = iMo8830M3 - iMo8829G3;
                        if (i47 < 0) {
                            i47 = 0;
                        }
                        int i48 = i46 + i47;
                        if (i48 > 0) {
                            int i49 = iMo8830M2;
                            int i50 = iMo8830M3;
                            i9 = iMo8829G2;
                            int i51 = (int) ((((long) i45) * ((long) i46)) / ((long) i48));
                            if (i51 <= i46) {
                                i46 = i51;
                            }
                            int i52 = i45 - i46;
                            if (i52 < 0) {
                                i52 = 0;
                            }
                            if (i52 <= i47) {
                                i47 = i52;
                            }
                            iMo8830M -= i46;
                            iMo8830M3 = i50 - i47;
                            i10 = i46 + i47 + i49;
                        }
                        if (iMo8830M3 + 1 <= iMo8829G3) {
                            int i422 = iMo8829G3 - iMo8830M3;
                            i13 = iMo8830M - iMo8829G;
                            if (i13 < 0) {
                            }
                            i14 = i10 - i9;
                            if (i14 < 0) {
                            }
                            i15 = i13 + i14;
                            if (i15 > 0) {
                            }
                        }
                        i11 = iMo8830M;
                        i12 = i10;
                    }
                    int i53 = iMo8830M3;
                    final AbstractC4377b1 abstractC4377b1Mo8831Q = interfaceC4409m03 == null ? interfaceC4409m03.mo8831Q(C4231a.m8497a(j3, 0, i11, 0, 0, 12)) : null;
                    final int i54 = abstractC4377b1Mo8831Q == null ? abstractC4377b1Mo8831Q.f14593g : 0;
                    final int i55 = abstractC4377b1Mo8831Q == null ? abstractC4377b1Mo8831Q.f14594h : 0;
                    final AbstractC4377b1 abstractC4377b1Mo8831Q2 = interfaceC4409m0.mo8831Q(C4231a.m8497a(j3, 0, i12, 0, 0, 12));
                    final AbstractC4377b1 abstractC4377b1Mo8831Q3 = interfaceC4409m02 == null ? interfaceC4409m02.mo8831Q(C4231a.m8497a(j3, 0, i53, 0, 0, 12)) : null;
                    final int i56 = abstractC4377b1Mo8831Q3 == null ? abstractC4377b1Mo8831Q3.f14594h : 0;
                    final int iMax = Math.max(i55, Math.max(abstractC4377b1Mo8831Q2.f14594h, i56));
                    int iM8505i = C4231a.m8505i(j3);
                    Integer numValueOf = iM8503g == Integer.MAX_VALUE ? Integer.valueOf(iM8503g) : null;
                    return interfaceC4418p0.mo8010z(iM8504h, AbstractC3754e0.m7909r(iMax, iM8505i, numValueOf == null ? numValueOf.intValue() : iMax), C4174u.f13711g, new InterfaceC1231l() { // from class: sh.q
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                        @Override // p085fg.InterfaceC1231l
                        public final Object invoke(Object obj) {
                            AbstractC4374a1 abstractC4374a1 = (AbstractC4374a1) obj;
                            abstractC4374a1.getClass();
                            int i57 = iMax;
                            int i58 = i57 - i55;
                            if (i58 < 0) {
                                i58 = 0;
                            }
                            int i59 = i58 / 2;
                            AbstractC4377b1 abstractC4377b1 = abstractC4377b1Mo8831Q2;
                            int i60 = (i57 - abstractC4377b1.f14594h) / 2;
                            int i61 = i57 - i56;
                            if (i61 < 0) {
                                i61 = 0;
                            }
                            int i62 = i61 / 2;
                            AbstractC4377b1 abstractC4377b12 = abstractC4377b1Mo8831Q;
                            if (abstractC4377b12 != null) {
                                AbstractC4374a1.m8811E(abstractC4374a1, abstractC4377b12, 0, i59);
                            }
                            AbstractC4374a1.m8811E(abstractC4374a1, abstractC4377b1, i54 + i23, i60);
                            AbstractC4377b1 abstractC4377b13 = abstractC4377b1Mo8831Q3;
                            if (abstractC4377b13 != null) {
                                AbstractC4374a1.m8811E(abstractC4374a1, abstractC4377b13, iM8504h - abstractC4377b13.f14593g, i62);
                            }
                            return C3967n.f12976a;
                        }
                    });
                }
                i16 = (i24 - iMo8830M) - iMo8830M3;
                if (i16 < 0) {
                    i16 = 0;
                }
                i11 = iMo8830M;
                interfaceC4409m0 = interfaceC4409m04;
                interfaceC4409m02 = interfaceC4409m05;
                i12 = i16;
                int i532 = iMo8830M3;
                if (interfaceC4409m03 == null) {
                }
                if (abstractC4377b1Mo8831Q == null) {
                }
                if (abstractC4377b1Mo8831Q == null) {
                }
                final AbstractC4377b1 abstractC4377b1Mo8831Q22 = interfaceC4409m0.mo8831Q(C4231a.m8497a(j3, 0, i12, 0, 0, 12));
                if (interfaceC4409m02 == null) {
                }
                if (abstractC4377b1Mo8831Q3 == null) {
                }
                final int iMax2 = Math.max(i55, Math.max(abstractC4377b1Mo8831Q22.f14594h, i56));
                int iM8505i2 = C4231a.m8505i(j3);
                if (iM8503g == Integer.MAX_VALUE) {
                }
                return interfaceC4418p0.mo8010z(iM8504h, AbstractC3754e0.m7909r(iMax2, iM8505i2, numValueOf == null ? numValueOf.intValue() : iMax2), C4174u.f13711g, new InterfaceC1231l() { // from class: sh.q
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    @Override // p085fg.InterfaceC1231l
                    public final Object invoke(Object obj) {
                        AbstractC4374a1 abstractC4374a1 = (AbstractC4374a1) obj;
                        abstractC4374a1.getClass();
                        int i57 = iMax2;
                        int i58 = i57 - i55;
                        if (i58 < 0) {
                            i58 = 0;
                        }
                        int i59 = i58 / 2;
                        AbstractC4377b1 abstractC4377b1 = abstractC4377b1Mo8831Q22;
                        int i60 = (i57 - abstractC4377b1.f14594h) / 2;
                        int i61 = i57 - i56;
                        if (i61 < 0) {
                            i61 = 0;
                        }
                        int i62 = i61 / 2;
                        AbstractC4377b1 abstractC4377b12 = abstractC4377b1Mo8831Q;
                        if (abstractC4377b12 != null) {
                            AbstractC4374a1.m8811E(abstractC4374a1, abstractC4377b12, 0, i59);
                        }
                        AbstractC4374a1.m8811E(abstractC4374a1, abstractC4377b1, i54 + i23, i60);
                        AbstractC4377b1 abstractC4377b13 = abstractC4377b1Mo8831Q3;
                        if (abstractC4377b13 != null) {
                            AbstractC4374a1.m8811E(abstractC4374a1, abstractC4377b13, iM8504h - abstractC4377b13.f14593g, i62);
                        }
                        return C3967n.f12976a;
                    }
                });
            }
        }
        C2104o.m5287l("Collection contains no element matching the predicate.");
        return null;
    }
}
