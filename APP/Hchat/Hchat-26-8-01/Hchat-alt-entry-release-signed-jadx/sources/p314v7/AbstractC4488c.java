package p314v7;

import java.util.Iterator;
import p135j7.C2087c;
import p166l7.C2518f;
import p166l7.C2524l;
import p166l7.C2525m;
import p174m.C2571a;
import p229p7.C3341k;
import p285t7.C4135b;
import p379z7.C6107c;

/* JADX INFO: renamed from: v7.c */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4488c extends AbstractC4503j0 {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01e3 A[EDGE_INSN: B:181:0x01e3->B:155:0x01e3 BREAK  A[LOOP:4: B:131:0x019b->B:152:0x01d9]] */
    /* JADX WARN: Removed duplicated region for block: B:180:0x01dc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:181:0x01e3 A[EDGE_INSN: B:181:0x01e3->B:155:0x01e3 BREAK  A[LOOP:4: B:131:0x019b->B:152:0x01d9], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00cc  */
    @Override // p314v7.AbstractC4503j0
    /* JADX INFO: renamed from: N */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String mo8922N() {
        C2571a c2571a;
        C2571a c2571a2;
        C2571a[] c2571aArr;
        int length;
        String strM8322b;
        C2524l c2524lMo5915Y;
        int iMo8928O;
        C2571a[] c2571aArr2;
        C2524l c2524lMo5915Y2;
        EnumC4484a enumC4484a = EnumC4484a.f14833i;
        EnumC4505k0 enumC4505k0M8936T = m8936T();
        EnumC4505k0[] enumC4505k0Arr = enumC4484a.f14840h;
        int i9 = 0;
        int i10 = 0;
        while (true) {
            if (i10 >= enumC4505k0Arr.length) {
                break;
            }
            if (enumC4505k0M8936T == enumC4505k0Arr[i10]) {
                String strMo8923Y = mo8923Y();
                if (strMo8923Y == null) {
                    int iMo6174Z = mo6174Z();
                    C2518f c2518fM8939i = m8939i();
                    C4135b c4135bM5928X = (c2518fM8939i == null || (c2524lMo5915Y2 = c2518fM8939i.mo5915Y()) == null) ? null : c2524lMo5915Y2.m5928X(c2518fM8939i, iMo6174Z);
                    if (c4135bM5928X != null) {
                        int iMo8928O2 = mo8928O();
                        Iterator itM8324d = c4135bM5928X.m8324d(true);
                        C4490d c4490d = null;
                        while (true) {
                            if (!itM8324d.hasNext()) {
                                break;
                            }
                            C4490d c4490d2 = (C4490d) itM8324d.next();
                            C2525m c2525m = (C2525m) c4490d2.m5553u(C2525m.class);
                            C4519y c4519y = c2525m != null ? ((C3341k) c2525m.f8138m).f10755v : null;
                            if (c4519y != null ? AbstractC4520z.m8944R(c4519y.f14896n.mo5552r()) : false) {
                                c4490d = c4490d2;
                                break;
                            }
                            if (c4490d == null) {
                                c4490d = c4490d2;
                            }
                        }
                        if (c4490d == null) {
                            strMo8923Y = null;
                        } else {
                            AbstractC4497g0 abstractC4497g0 = c4490d.f14846k;
                            C4489c0 c4489c0 = abstractC4497g0 instanceof C4489c0 ? (C4489c0) abstractC4497g0 : null;
                            C2087c c2087c = c4489c0 != null ? (C2087c) c4489c0.f14850l : null;
                            if (c2087c == null || c2087c.f9926k.size() == 0) {
                                c2571a = null;
                                if (c2571a != null) {
                                    C2571a[] c2571aArr3 = (C2571a[]) c2571a.f8339h;
                                    C4493e0 c4493e0 = (C4493e0) c2571a.m6034p().f8339h;
                                    if (c4493e0.m8933a0() == EnumC4486b.FORMATS) {
                                        EnumC4484a enumC4484a2 = EnumC4484a.f14836l;
                                        int iMo8928O3 = c4493e0.mo8928O();
                                        int i11 = enumC4484a2.f14839g;
                                        if ((iMo8928O3 & i11) == i11) {
                                            int length2 = c2571aArr3.length;
                                            C2571a[] c2571aArr4 = new C2571a[length2];
                                            int i12 = 0;
                                            while (true) {
                                                if (i12 < length2) {
                                                    C2571a c2571a3 = c2571aArr3[i12];
                                                    if (!(((C4493e0) c2571a3.f8339h).m8933a0() != null)) {
                                                        int iMo8928O4 = ((C4493e0) c2571a3.f8339h).mo8928O();
                                                        if ((iMo8928O2 & iMo8928O4) != iMo8928O4) {
                                                            continue;
                                                        } else {
                                                            if (iMo8928O2 == iMo8928O4) {
                                                                c2571aArr = new C2571a[]{c2571a3};
                                                                break;
                                                            }
                                                            int i13 = 0;
                                                            while (i13 < length2) {
                                                                C2571a c2571a4 = c2571aArr4[i13];
                                                                if (c2571a4 == null || (iMo8928O = ((C4493e0) c2571a4.f8339h).mo8928O()) == 0) {
                                                                    break;
                                                                }
                                                                int i14 = iMo8928O & iMo8928O4;
                                                                if (i14 == iMo8928O4) {
                                                                    break;
                                                                }
                                                                if (i14 == iMo8928O) {
                                                                    break;
                                                                }
                                                                i13++;
                                                            }
                                                            i13 = -1;
                                                            if (i13 >= 0) {
                                                                c2571aArr4[i13] = c2571a3;
                                                            }
                                                        }
                                                    }
                                                    i12++;
                                                } else {
                                                    int i15 = 0;
                                                    for (int i16 = 0; i16 < length2; i16++) {
                                                        if (c2571aArr4[i16] != null) {
                                                            i15++;
                                                        }
                                                    }
                                                    if (i15 != 0) {
                                                        C2571a[] c2571aArr5 = new C2571a[i15];
                                                        int i17 = 0;
                                                        for (int i18 = 0; i18 < length2; i18++) {
                                                            C2571a c2571a5 = c2571aArr4[i18];
                                                            if (c2571a5 != null) {
                                                                c2571aArr5[i17] = c2571a5;
                                                                i17++;
                                                            }
                                                        }
                                                        c2571aArr = c2571aArr5;
                                                    }
                                                }
                                            }
                                            if (c2571aArr != null && (length = c2571aArr.length) != 0) {
                                                StringBuilder sb2 = new StringBuilder();
                                                boolean z9 = false;
                                                while (true) {
                                                    if (i9 < length) {
                                                        C2571a c2571a6 = c2571aArr[i9];
                                                        if (c2571a6 != null) {
                                                            if (z9) {
                                                                sb2.append("|");
                                                            }
                                                            C4493e0 c4493e02 = (C4493e0) c2571a6.f8339h;
                                                            if (c4493e02.m8933a0() != null) {
                                                                strM8322b = null;
                                                                if (strM8322b != null) {
                                                                    break;
                                                                }
                                                                sb2.append(strM8322b);
                                                                z9 = true;
                                                            } else {
                                                                int iMo6174Z2 = c4493e02.mo6174Z();
                                                                C2518f c2518fM8939i2 = c4493e02.m8939i();
                                                                C4135b c4135bM5928X2 = (c2518fM8939i2 == null || (c2524lMo5915Y = c2518fM8939i2.mo5915Y()) == null) ? null : c2524lMo5915Y.m5928X(c2518fM8939i2, iMo6174Z2);
                                                                if (c4135bM5928X2 != null) {
                                                                    strM8322b = c4135bM5928X2.m8322b();
                                                                }
                                                                if (strM8322b != null) {
                                                                }
                                                            }
                                                        }
                                                        i9++;
                                                    } else if (z9) {
                                                        strMo8923Y = sb2.toString();
                                                    }
                                                }
                                                strMo8923Y = null;
                                            }
                                        } else {
                                            int length3 = c2571aArr3.length;
                                            int i19 = 0;
                                            while (true) {
                                                if (i19 >= length3) {
                                                    c2571a2 = null;
                                                    break;
                                                }
                                                c2571a2 = c2571aArr3[i19];
                                                if (!(((C4493e0) c2571a2.f8339h).m8933a0() != null) && iMo8928O2 == ((C4493e0) c2571a2.f8339h).mo8928O()) {
                                                    break;
                                                }
                                                i19++;
                                            }
                                            c2571aArr = c2571a2 != null ? new C2571a[]{c2571a2} : null;
                                            if (c2571aArr != null) {
                                                StringBuilder sb22 = new StringBuilder();
                                                boolean z92 = false;
                                                while (true) {
                                                    if (i9 < length) {
                                                    }
                                                    i9++;
                                                }
                                                strMo8923Y = null;
                                            }
                                        }
                                    }
                                }
                            } else {
                                C6107c c6107c = c2087c.f9926k;
                                if (c6107c == null) {
                                    c2571aArr2 = null;
                                    if (c2571aArr2 == null) {
                                        c2571a = new C2571a(c2571aArr2, 25);
                                    }
                                    if (c2571a != null) {
                                    }
                                } else {
                                    int size = c6107c.size();
                                    c2571aArr2 = new C2571a[size];
                                    C2571a c2571a7 = null;
                                    for (int i20 = 0; i20 < size; i20++) {
                                        C4493e0 c4493e03 = (C4493e0) c6107c.f24642g[i20];
                                        C2571a c2571a8 = new C2571a(c4493e03, 26);
                                        c2571aArr2[i20] = c2571a8;
                                        if (c2571a7 == null && EnumC4486b.FORMATS == c4493e03.m8933a0()) {
                                            c2571a7 = c2571a8;
                                        }
                                    }
                                    if (c2571a7 == null) {
                                    }
                                    if (c2571aArr2 == null) {
                                    }
                                    if (c2571a != null) {
                                    }
                                }
                            }
                        }
                    }
                }
                if (strMo8923Y != null) {
                    return strMo8923Y;
                }
            } else {
                i10++;
            }
        }
        return super.mo8922N();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: Y */
    public String mo8923Y() {
        return null;
    }

    /* JADX INFO: renamed from: Z */
    public abstract int mo6174Z();
}
