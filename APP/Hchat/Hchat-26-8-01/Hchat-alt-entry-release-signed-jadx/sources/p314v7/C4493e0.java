package p314v7;

import java.util.HashMap;
import okhttp3.HttpUrl;
import p152k7.AbstractC2331a;
import p166l7.C2518f;
import p166l7.C2524l;
import p166l7.InterfaceC2519g;
import p195n7.AbstractC2908g;
import p285t7.C4135b;
import p332wb.AbstractC4855en;
import p363y7.AbstractC5999a;

/* JADX INFO: renamed from: v7.e0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4493e0 extends AbstractC4488c implements Comparable {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p314v7.AbstractC4503j0
    /* JADX INFO: renamed from: P */
    public final InterfaceC2519g mo6172P() {
        C4490d c4490d = (C4490d) m5553u(C4490d.class);
        if (c4490d != null) {
            return (C2518f) c4490d.m5553u(C2518f.class);
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p314v7.AbstractC4488c
    /* JADX INFO: renamed from: Y */
    public final String mo8923Y() {
        EnumC4484a[] enumC4484aArr;
        if (m8933a0() == EnumC4486b.FORMATS) {
            int iMo8928O = mo8928O() & 255;
            if (iMo8928O == 0) {
                return HttpUrl.FRAGMENT_ENCODE_SET;
            }
            EnumC4484a[] enumC4484aArr2 = EnumC4484a.f14837m;
            EnumC4484a[] enumC4484aArr3 = new EnumC4484a[enumC4484aArr2.length];
            int length = enumC4484aArr2.length;
            int i9 = 0;
            int i10 = 0;
            while (true) {
                if (i9 < length) {
                    EnumC4484a enumC4484a = enumC4484aArr2[i9];
                    int i11 = enumC4484a.f14839g;
                    if (i11 == iMo8928O) {
                        enumC4484aArr = new EnumC4484a[]{enumC4484a};
                        break;
                    }
                    if (enumC4484a != EnumC4484a.f14834j && (iMo8928O & i11) == i11) {
                        enumC4484aArr3[i10] = enumC4484a;
                        i10++;
                    }
                    i9++;
                } else if (i10 == 0) {
                    enumC4484aArr = null;
                } else {
                    enumC4484aArr = new EnumC4484a[i10];
                    System.arraycopy(enumC4484aArr3, 0, enumC4484aArr, 0, i10);
                }
            }
            if (enumC4484aArr != null && enumC4484aArr.length != 0) {
                StringBuilder sb2 = new StringBuilder();
                int i12 = 0;
                boolean z9 = false;
                for (EnumC4484a enumC4484a2 : enumC4484aArr) {
                    if (enumC4484a2 != EnumC4484a.f14835k && enumC4484a2 != EnumC4484a.f14836l) {
                        EnumC4484a enumC4484a3 = EnumC4484a.f14834j;
                        if (enumC4484a2 == enumC4484a3) {
                            return enumC4484a3.name().toLowerCase();
                        }
                        int i13 = enumC4484a2.f14839g;
                        if ((i12 & i13) != i13) {
                            if (z9) {
                                sb2.append('|');
                            }
                            sb2.append(enumC4484a2.name().toLowerCase());
                            i12 |= i13;
                            z9 = true;
                        }
                    }
                }
                return sb2.toString();
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p314v7.AbstractC4488c
    /* JADX INFO: renamed from: Z */
    public final int mo6174Z() {
        return AbstractC2331a.m5539s(this.f12076k, 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a0 */
    public final EnumC4486b m8933a0() {
        int iMo6174Z = mo6174Z();
        if (iMo6174Z == 0) {
            EnumC4486b enumC4486b = EnumC4486b.FORMATS;
            return null;
        }
        for (EnumC4486b enumC4486b2 : EnumC4486b.f14842i) {
            if (enumC4486b2.f14844g == iMo6174Z) {
                return enumC4486b2;
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        int iMo6174Z;
        int iMo6174Z2;
        C4493e0 c4493e0 = (C4493e0) obj;
        if (c4493e0 == null) {
            return -1;
        }
        if (c4493e0 == this || (iMo6174Z = mo6174Z()) == (iMo6174Z2 = c4493e0.mo6174Z())) {
            return 0;
        }
        if (iMo6174Z == 0) {
            return 1;
        }
        if (iMo6174Z2 == 0) {
            return -1;
        }
        return Integer.compare(iMo6174Z, iMo6174Z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0047  */
    @Override // p314v7.AbstractC4503j0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String toString() {
        String strMo5914V;
        C2524l c2524lMo5915Y;
        int iMo6174Z = mo6174Z();
        String strM10753p = null;
        c4135bM5928X = null;
        C4135b c4135bM5928X = null;
        strM10753p = null;
        if (iMo6174Z != 0 && (16711680 & iMo6174Z) != 0 && ((-16777216) & iMo6174Z) != 0) {
            C2518f c2518fM8939i = m8939i();
            if (c2518fM8939i != null && (c2524lMo5915Y = c2518fM8939i.mo5915Y()) != null) {
                c4135bM5928X = c2524lMo5915Y.m5928X(c2518fM8939i, iMo6174Z);
            }
            if (c4135bM5928X != null) {
                C2518f c2518f = c4135bM5928X.f13629h;
                if (c4135bM5928X.m8322b() != null) {
                    strM10753p = c4135bM5928X.m8322b();
                    if (c2518f != m8939i() && (strMo5914V = c2518f.mo5914V()) != null) {
                        strM10753p = AbstractC4855en.m9264h(strMo5914V, ":", strM10753p);
                    }
                } else {
                    HashMap map = AbstractC2908g.f9388a;
                    strM10753p = AbstractC5999a.m10753p(iMo6174Z, "r0x");
                }
            }
        } else if (iMo6174Z != 0 && m8933a0() == null) {
            HashMap map2 = AbstractC2908g.f9388a;
            strM10753p = AbstractC5999a.m10753p(iMo6174Z, "r0x");
        }
        String strMo8922N = mo8922N();
        if (strM10753p != null && strMo8922N != null) {
            return AbstractC4855en.m9265i(strM10753p, "=\"", strMo8922N, "\"");
        }
        return "name=" + AbstractC5999a.m10748k(mo6174Z(), 8) + ", " + super.toString();
    }
}
