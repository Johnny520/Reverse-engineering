package p314v7;

import bsh.C0353j;
import java.util.HashMap;
import okhttp3.HttpUrl;
import p152k7.AbstractC2331a;
import p166l7.C2518f;
import p166l7.C2524l;
import p166l7.InterfaceC2514b;
import p166l7.InterfaceC2519g;
import p195n7.AbstractC2902a;
import p195n7.AbstractC2908g;
import p241q7.C3445b;
import p257r7.AbstractC3712b;
import p257r7.AbstractC3729s;
import p257r7.C3731u;
import p285t7.C4135b;
import p298u7.AbstractC4280c;
import p363y7.AbstractC5999a;

/* JADX INFO: renamed from: v7.j0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4503j0 extends AbstractC3712b {

    /* JADX INFO: renamed from: m */
    public C4499h0 f14857m;

    /* JADX INFO: renamed from: n */
    public final int f14858n;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractC4503j0(int i9, int i10) {
        super(i9);
        this.f14858n = i10;
        AbstractC2331a.m5536F(this.f12076k, i10, (short) (mo5551p() - i10));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p257r7.AbstractC3712b, p152k7.AbstractC2331a
    /* JADX INFO: renamed from: B */
    public void mo1893B(C3445b c3445b) {
        int i9 = c3445b.f11162k;
        int i10 = this.f14858n;
        c3445b.m7228c(i10);
        int i11 = 65535 & c3445b.readShort();
        int i12 = (i11 >= 8 || c3445b.available() < 8) ? i11 : 8;
        c3445b.m7230g(i9);
        m7715M(i12 + i10, false);
        super.mo1893B(c3445b);
        if (i11 < 8) {
            m7715M(i10 + 8, false);
            AbstractC2331a.m5536F(this.f12076k, i10, (short) (mo5551p() - i10));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    /* JADX INFO: renamed from: N */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String mo8922N() {
        C4135b c4135bM5917W;
        C2518f c2518fM8939i;
        C2524l c2524lMo5915Y;
        EnumC4505k0 enumC4505k0M8936T = m8936T();
        if (enumC4505k0M8936T != null) {
            EnumC4505k0 enumC4505k0 = EnumC4505k0.f14876w;
            EnumC4505k0 enumC4505k02 = EnumC4505k0.f14875v;
            EnumC4505k0 enumC4505k03 = EnumC4505k0.f14863j;
            String str = "@null";
            EnumC4505k0 enumC4505k04 = EnumC4505k0.f14862i;
            if (enumC4505k0M8936T == enumC4505k04 || enumC4505k0M8936T == enumC4505k03 || enumC4505k0M8936T == enumC4505k02 || enumC4505k0M8936T == enumC4505k0) {
                int iMo8928O = mo8928O();
                if (iMo8928O != 0) {
                    EnumC4505k0 enumC4505k0M8936T2 = m8936T();
                    if (enumC4505k0M8936T2 == null || (!(enumC4505k0M8936T2 == enumC4505k04 || enumC4505k0M8936T2 == enumC4505k03 || enumC4505k0M8936T2 == enumC4505k02 || enumC4505k0M8936T2 == enumC4505k0) || (c2518fM8939i = m8939i()) == null)) {
                        c4135bM5917W = null;
                    } else {
                        int iMo8928O2 = mo8928O();
                        c4135bM5917W = c2518fM8939i.m5917W(iMo8928O2);
                        if (c4135bM5917W == null && (c2524lMo5915Y = c2518fM8939i.mo5915Y()) != null) {
                            c4135bM5917W = c2524lMo5915Y.m5928X(c2518fM8939i, iMo8928O2);
                        }
                    }
                    if (c4135bM5917W == null && m8939i() == null) {
                        C0353j.m1305c("Parent package block is null");
                        return null;
                    }
                    if (c4135bM5917W != null && c4135bM5917W.m8322b() != null) {
                        return c4135bM5917W.m8321a(m8939i(), enumC4505k0M8936T);
                    }
                    boolean z9 = enumC4505k0M8936T == enumC4505k04;
                    HashMap map = AbstractC2908g.f9388a;
                    return z9 ? AbstractC5999a.m10753p(iMo8928O, "@0x") : AbstractC5999a.m10753p(iMo8928O, "?0x");
                }
                HashMap map2 = AbstractC2908g.f9388a;
                if (iMo8928O != 0) {
                    throw null;
                }
                if (enumC4505k0M8936T == enumC4505k04) {
                    if (iMo8928O == 0) {
                        return "@null";
                    }
                } else if (iMo8928O == 0) {
                    return "?null";
                }
            } else {
                if (enumC4505k0M8936T == EnumC4505k0.f14874u) {
                    return m8935S();
                }
                int iMo8928O3 = mo8928O();
                HashMap map3 = AbstractC2908g.f9388a;
                if (iMo8928O3 == 0 || iMo8928O3 == 1) {
                    if (enumC4505k0M8936T == EnumC4505k0.f14861h) {
                        if (iMo8928O3 != 0) {
                            str = "@empty";
                        }
                    } else if (iMo8928O3 == 0) {
                        if (enumC4505k0M8936T == enumC4505k03) {
                            str = iMo8928O3 != 0 ? null : "?null";
                        } else if (enumC4505k0M8936T != enumC4505k04 || iMo8928O3 != 0) {
                            str = null;
                        }
                    }
                    if (str != null) {
                        return str;
                    }
                    AbstractC2902a abstractC2902a = (AbstractC2902a) AbstractC2908g.f9388a.get(enumC4505k0M8936T);
                    if (abstractC2902a != null) {
                        return abstractC2902a.mo6306a(iMo8928O3);
                    }
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: O */
    public int mo8928O() {
        return AbstractC2331a.m5539s(this.f12076k, this.f14858n + 4);
    }

    /* JADX INFO: renamed from: P */
    public abstract InterfaceC2519g mo6172P();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: Q */
    public int mo8929Q() {
        return AbstractC2331a.m5541w(this.f12076k, this.f14858n) & 65535;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: R */
    public byte mo8930R() {
        return this.f12076k[this.f14858n + 3];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: S */
    public final String m8935S() {
        AbstractC4280c abstractC4280cMo6180g;
        AbstractC3729s abstractC3729sM8600V = (m8936T() == EnumC4505k0.f14874u && (abstractC4280cMo6180g = mo6180g()) != null) ? abstractC4280cMo6180g.m8600V(mo8928O()) : null;
        if (abstractC3729sM8600V == null) {
            return null;
        }
        String strM7744Y = abstractC3729sM8600V.m7744Y();
        return strM7744Y == null ? HttpUrl.FRAGMENT_ENCODE_SET : strM7744Y;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: T */
    public final EnumC4505k0 m8936T() {
        EnumC4505k0[] enumC4505k0Arr;
        int iMo8930R = mo8930R() & 255;
        if (iMo8930R < 0) {
            return null;
        }
        EnumC4505k0[] enumC4505k0Arr2 = EnumC4505k0.f14877x;
        if (enumC4505k0Arr2 == null) {
            synchronized (EnumC4505k0.class) {
                try {
                    enumC4505k0Arr = new EnumC4505k0[32];
                    for (EnumC4505k0 enumC4505k0 : EnumC4505k0.values()) {
                        enumC4505k0Arr[enumC4505k0.f14879g & 255] = enumC4505k0;
                    }
                    EnumC4505k0.f14877x = enumC4505k0Arr;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            enumC4505k0Arr2 = enumC4505k0Arr;
        }
        if (iMo8930R < enumC4505k0Arr2.length) {
            return enumC4505k0Arr2[iMo8930R];
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: U */
    public final void m8937U(AbstractC4280c abstractC4280c) {
        AbstractC3729s abstractC3729sM8600V = abstractC4280c.m8600V(mo8928O());
        if (abstractC3729sM8600V == null) {
            m8938W();
            return;
        }
        if (this.f14857m != null) {
            m8938W();
        }
        C4499h0 c4499h0 = new C4499h0(this, 1);
        this.f14857m = c4499h0;
        abstractC3729sM8600V.m7743P(c4499h0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: V */
    public void mo6173V(C4499h0 c4499h0) {
        AbstractC4280c abstractC4280cMo6180g = mo6180g();
        if (abstractC4280cMo6180g == null) {
            return;
        }
        abstractC4280cMo6180g.m8603b0(c4499h0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: W */
    public final void m8938W() {
        C4499h0 c4499h0 = this.f14857m;
        if (c4499h0 == null) {
            return;
        }
        this.f14857m = null;
        mo6173V(c4499h0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: X */
    public void mo8931X(int i9) {
        AbstractC2331a.m5534D(this.f12076k, this.f14858n + 4, i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: k7.a */
    /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: k7.a */
    /* JADX DEBUG: Multi-variable search result rejected for r0v7, resolved type: k7.a */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: g */
    public AbstractC4280c mo6180g() {
        for (AbstractC2331a abstractC2331a = this.f7658h; abstractC2331a != 0; abstractC2331a = abstractC2331a.f7658h) {
            if (abstractC2331a instanceof InterfaceC2514b) {
                return ((InterfaceC2514b) abstractC2331a).mo5909g();
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public final C2518f m8939i() {
        InterfaceC2519g interfaceC2519gMo6172P = mo6172P();
        if (interfaceC2519gMo6172P != null) {
            return interfaceC2519gMo6172P.mo5921i();
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        AbstractC4280c abstractC4280cMo6180g;
        if (m8939i() != null) {
            return m8936T() + ":" + AbstractC5999a.m10748k(mo8928O(), 8) + " " + mo8922N();
        }
        StringBuilder sb2 = new StringBuilder();
        if (mo8929Q() != 8) {
            sb2.append("size=");
            sb2.append(mo8929Q());
            sb2.append(", ");
        }
        sb2.append("type=");
        EnumC4505k0 enumC4505k0M8936T = m8936T();
        if (enumC4505k0M8936T != null) {
            sb2.append(enumC4505k0M8936T);
        } else {
            sb2.append(AbstractC5999a.m10751n(mo8930R()));
        }
        sb2.append(", data=");
        int iMo8928O = mo8928O();
        EnumC4505k0 enumC4505k0 = EnumC4505k0.f14874u;
        if (enumC4505k0M8936T == enumC4505k0) {
            String strM7746Q = null;
            AbstractC3729s abstractC3729sM8600V = (m8936T() == enumC4505k0 && (abstractC4280cMo6180g = mo6180g()) != null) ? abstractC4280cMo6180g.m8600V(mo8928O()) : null;
            if (abstractC3729sM8600V != null) {
                String str = abstractC3729sM8600V.f12101m;
                if (str != null) {
                    C3731u c3731u = abstractC3729sM8600V.f12106q;
                    strM7746Q = c3731u == null ? str : c3731u.m7746Q(str, false);
                }
                sb2.append(strM7746Q);
            } else {
                sb2.append(AbstractC5999a.m10748k(iMo8928O, 8));
            }
        } else {
            sb2.append(AbstractC5999a.m10748k(iMo8928O, 8));
        }
        return sb2.toString();
    }
}
