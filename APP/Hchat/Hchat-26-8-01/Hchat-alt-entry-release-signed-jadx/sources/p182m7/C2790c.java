package p182m7;

import java.util.Iterator;
import okhttp3.HttpUrl;
import p025bc.AbstractC0255e;
import p038ce.C0561n;
import p152k7.AbstractC2331a;
import p166l7.InterfaceC2519g;
import p241q7.C3445b;
import p257r7.AbstractC3729s;
import p257r7.C3722l;
import p257r7.C3724n;
import p257r7.C3725o;
import p257r7.C3731u;
import p257r7.InterfaceC3723m;
import p298u7.AbstractC4280c;
import p298u7.C4278a;
import p314v7.AbstractC4488c;
import p314v7.C4499h0;
import p314v7.EnumC4505k0;
import p332wb.AbstractC4855en;
import p363y7.AbstractC5999a;
import p379z7.C6112h;
import p379z7.C6115k;

/* JADX INFO: renamed from: m7.c */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2790c extends AbstractC4488c implements Comparable {

    /* JADX INFO: renamed from: o */
    public C3722l f9038o;

    /* JADX INFO: renamed from: p */
    public C3722l f9039p;

    /* JADX INFO: renamed from: q */
    public C3722l f9040q;

    /* JADX INFO: renamed from: r */
    public C3722l f9041r;

    /* JADX INFO: renamed from: s */
    public C2808u f9042s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p314v7.AbstractC4503j0, p257r7.AbstractC3712b, p152k7.AbstractC2331a
    /* JADX INFO: renamed from: B */
    public final void mo1893B(C3445b c3445b) {
        C4278a c4278aMo6180g;
        super.mo1893B(c3445b);
        if (m8936T() == EnumC4505k0.f14874u) {
            C4278a c4278aMo6180g2 = mo6180g();
            if (c4278aMo6180g2 != null && !c4278aMo6180g2.f14199s) {
                m8937U(c4278aMo6180g2);
            }
        } else {
            m8938W();
        }
        m6179e0(this.f9038o);
        this.f9038o = m6177c0(0);
        m6179e0(this.f9039p);
        this.f9039p = m6177c0(4);
        m6179e0(this.f9041r);
        this.f9041r = m6177c0(8);
        int iM5539s = AbstractC2331a.m5539s(this.f12076k, 4);
        C3725o c3725o = (C3725o) ((iM5539s >= 0 && (c4278aMo6180g = mo6180g()) != null) ? c4278aMo6180g.m8600V(iM5539s) : null);
        C3724n c3724n = c3725o != null ? c3725o.f12097t : null;
        if (c3724n != null) {
            if (this.f9040q != null) {
                Iterator itM10744g = AbstractC5999a.m10744g(c3724n.f12095o);
                while (itM10744g.hasNext()) {
                    if (((InterfaceC3723m) itM10744g.next()).mo7733d(C2790c.class) == this) {
                        break;
                    }
                }
                m6178d0(c3724n);
                C3722l c3722l = new C3722l(this, 4);
                c3724n.f12095o = AbstractC5999a.m10738a(c3724n.f12095o, c3722l);
                this.f9040q = c3722l;
            } else {
                m6178d0(c3724n);
                C3722l c3722l2 = new C3722l(this, 4);
                c3724n.f12095o = AbstractC5999a.m10738a(c3724n.f12095o, c3722l2);
                this.f9040q = c3722l2;
            }
        }
        C2808u c2808u = this.f9042s;
        if (c2808u != null) {
            this.f9042s = null;
            c2808u.f9074q.remove(this);
        }
        C2808u c2808uM6175a0 = m6175a0();
        if (c2808uM6175a0 == null) {
            return;
        }
        this.f9042s = c2808uM6175a0;
        c2808uM6175a0.f9074q.add(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p314v7.AbstractC4503j0
    /* JADX INFO: renamed from: P */
    public final InterfaceC2519g mo6172P() {
        C2797j c2797j = (C2797j) m5553u(C2797j.class);
        if (c2797j != null) {
            return (C2793f) c2797j.m5554v(C2793f.class);
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p314v7.AbstractC4503j0
    /* JADX INFO: renamed from: V */
    public final void mo6173V(C4499h0 c4499h0) {
        m6179e0(c4499h0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p314v7.AbstractC4488c
    /* JADX INFO: renamed from: Z */
    public final int mo6174Z() {
        C4278a c4278aMo6180g;
        int iM5539s = AbstractC2331a.m5539s(this.f12076k, 4);
        C3725o c3725o = (C3725o) ((iM5539s >= 0 && (c4278aMo6180g = mo6180g()) != null) ? c4278aMo6180g.m8600V(iM5539s) : null);
        C3724n c3724n = c3725o != null ? c3725o.f12097t : null;
        if (c3724n != null) {
            return c3724n.f12083n;
        }
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a0 */
    public final C2808u m6175a0() {
        int iM5539s = AbstractC2331a.m5539s(this.f12076k, 0);
        if (iM5539s < 0) {
            return null;
        }
        C2808u c2808u = this.f9042s;
        if (c2808u != null && c2808u.f9037p.f12083n == iM5539s) {
            return c2808u;
        }
        C2797j c2797j = (C2797j) m5553u(C2797j.class);
        if (c2797j != null) {
            return c2797j.m6196U(iM5539s);
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Method merged with bridge method: g()Lu7/c; */
    @Override // p314v7.AbstractC4503j0
    /* JADX INFO: renamed from: b0, reason: merged with bridge method [inline-methods] */
    public final C4278a mo6180g() {
        AbstractC4280c abstractC4280cMo6180g = super.mo6180g();
        if (abstractC4280cMo6180g instanceof C4278a) {
            return (C4278a) abstractC4280cMo6180g;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c0 */
    public final C3722l m6177c0(int i9) {
        C4278a c4278aMo6180g;
        AbstractC3729s abstractC3729sM8600V;
        if (i9 < 0 || (c4278aMo6180g = mo6180g()) == null || (abstractC3729sM8600V = c4278aMo6180g.m8600V(AbstractC2331a.m5539s(this.f12076k, i9))) == null) {
            return null;
        }
        C3722l c3722l = new C3722l(this, i9);
        abstractC3729sM8600V.m7743P(c3722l);
        return c3722l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0043  */
    @Override // java.lang.Comparable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int compareTo(Object obj) {
        String strM7746Q;
        C4278a c4278aMo6180g;
        String str;
        C4278a c4278aMo6180g2;
        C2790c c2790c = (C2790c) obj;
        int iMo6174Z = mo6174Z();
        int iMo6174Z2 = c2790c.mo6174Z();
        if (iMo6174Z == 0 && iMo6174Z2 != 0) {
            return 1;
        }
        if (iMo6174Z2 == 0 && iMo6174Z != 0) {
            return -1;
        }
        if (iMo6174Z != 0) {
            return Integer.compare(iMo6174Z, iMo6174Z2);
        }
        int iM5539s = AbstractC2331a.m5539s(this.f12076k, 4);
        String strM7746Q2 = null;
        if (mo6180g() != null) {
            AbstractC3729s abstractC3729sM8600V = (iM5539s >= 0 && (c4278aMo6180g2 = mo6180g()) != null) ? c4278aMo6180g2.m8600V(iM5539s) : null;
            if (abstractC3729sM8600V == null || (strM7746Q = abstractC3729sM8600V.f12101m) == null) {
                strM7746Q = null;
            } else {
                C3731u c3731u = abstractC3729sM8600V.f12106q;
                if (c3731u != null) {
                    strM7746Q = c3731u.m7746Q(strM7746Q, false);
                }
            }
        }
        String str2 = HttpUrl.FRAGMENT_ENCODE_SET;
        if (strM7746Q == null) {
            strM7746Q = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        int iM5539s2 = AbstractC2331a.m5539s(c2790c.f12076k, 4);
        if (c2790c.mo6180g() != null) {
            AbstractC3729s abstractC3729sM8600V2 = (iM5539s2 >= 0 && (c4278aMo6180g = c2790c.mo6180g()) != null) ? c4278aMo6180g.m8600V(iM5539s2) : null;
            if (abstractC3729sM8600V2 != null && (str = abstractC3729sM8600V2.f12101m) != null) {
                C3731u c3731u2 = abstractC3729sM8600V2.f12106q;
                strM7746Q2 = c3731u2 == null ? str : c3731u2.m7746Q(str, false);
            }
        }
        if (strM7746Q2 != null) {
            str2 = strM7746Q2;
        }
        return strM7746Q.compareTo(str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d0 */
    public final void m6178d0(C3724n c3724n) {
        C3725o c3725oM7734N;
        boolean zM7735O;
        C2793f c2793f;
        C3722l c3722l = this.f9040q;
        if (c3722l == null || c3724n == null) {
            return;
        }
        c3724n.f12095o = AbstractC5999a.m10746i(c3724n.f12095o, c3722l);
        this.f9040q = null;
        if (c3724n.m7735O()) {
            return;
        }
        C2797j c2797j = (C2797j) m5553u(C2797j.class);
        C2801n c2801n = (c2797j == null || (c2793f = (C2793f) c2797j.m5554v(C2793f.class)) == null) ? null : ((C2794g) c2793f.f9062k).f9047p;
        if (c2801n == null || c3724n.f7658h == null || c3724n.f7657g < 0 || c3724n.m7735O() || (c3725oM7734N = c3724n.m7734N()) == null || c3725oM7734N.f7658h == null || c3725oM7734N.f7657g < 0) {
            return;
        }
        Object obj = c3725oM7734N.f12105p;
        C0561n c0561n = new C0561n(25);
        Iterator itM10744g = AbstractC5999a.m10744g(obj);
        if ((!itM10744g.hasNext() ? C6112h.f24664g : new C6115k(itM10744g, c0561n)).hasNext()) {
            zM7735O = true;
        } else {
            C3724n c3724n2 = c3725oM7734N.f12097t;
            zM7735O = c3724n2 != null ? c3724n2.m7735O() : false;
        }
        if (zM7735O) {
            return;
        }
        C2793f c2793f2 = (C2793f) c2801n.m5554v(C2793f.class);
        C4278a c4278a = c2793f2 != null ? ((C2794g) c2793f2.f9062k).f9046o : null;
        if (c4278a == null) {
            return;
        }
        c3724n.mo633k(0);
        c2801n.f9059o.m6531a0(c3724n);
        c4278a.f14196p.m6531a0(c3725oM7734N);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e0 */
    public final void m6179e0(InterfaceC3723m interfaceC3723m) {
        C4278a c4278aMo6180g;
        if (interfaceC3723m == null || (c4278aMo6180g = mo6180g()) == null) {
            return;
        }
        c4278aMo6180g.m8603b0(interfaceC3723m);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0025  */
    @Override // p314v7.AbstractC4503j0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String toString() {
        String string;
        String strValueOf;
        C3725o c3725oM6165V;
        C4278a c4278aMo6180g;
        int iM5539s = AbstractC2331a.m5539s(this.f12076k, 4);
        String str = null;
        if (mo6180g() != null) {
            AbstractC3729s abstractC3729sM8600V = (iM5539s >= 0 && (c4278aMo6180g = mo6180g()) != null) ? c4278aMo6180g.m8600V(iM5539s) : null;
            if (abstractC3729sM8600V == null || (string = abstractC3729sM8600V.f12101m) == null) {
                string = null;
            } else {
                C3731u c3731u = abstractC3729sM8600V.f12106q;
                if (c3731u != null) {
                    string = c3731u.m7746Q(string, false);
                }
            }
        }
        if (string != null) {
            C2808u c2808uM6175a0 = m6175a0();
            if (c2808uM6175a0 != null && (c3725oM6165V = c2808uM6175a0.m6165V(c2808uM6175a0.f9036o.f12083n)) != null) {
                str = c3725oM6165V.f12101m;
            }
            if (str != null) {
                string = AbstractC4855en.m9264h(str, ":", string);
            }
        }
        if (string == null) {
            return C2790c.class.getSimpleName() + ": " + this.f7657g + "{NamespaceReference=" + AbstractC2331a.m5539s(this.f12076k, 0) + ", NameReference=" + AbstractC2331a.m5539s(this.f12076k, 4) + ", ValueStringReference=" + AbstractC2331a.m5539s(this.f12076k, 8) + ", ValueSize=" + mo8929Q() + ", ValueTypeByte=" + (mo8930R() & 255) + ", Data=" + mo8928O() + "}";
        }
        int iMo6174Z = mo6174Z();
        if (iMo6174Z != 0) {
            StringBuilder sbM1025n = AbstractC0255e.m1025n(string, "(@");
            sbM1025n.append(AbstractC5999a.m10748k(iMo6174Z, 8));
            sbM1025n.append(")");
            string = sbM1025n.toString();
        }
        EnumC4505k0 enumC4505k0M8936T = m8936T();
        if (enumC4505k0M8936T == EnumC4505k0.f14874u) {
            strValueOf = m8935S();
        } else if (enumC4505k0M8936T == EnumC4505k0.f14869p) {
            strValueOf = String.valueOf(mo8928O() != 0);
        } else if (enumC4505k0M8936T == EnumC4505k0.f14867n) {
            strValueOf = String.valueOf(mo8928O());
        } else {
            strValueOf = "[" + enumC4505k0M8936T + "] " + AbstractC5999a.m10748k(mo8928O(), 8);
        }
        if (strValueOf != null) {
            return AbstractC4855en.m9265i(string, "=\"", strValueOf, "\"");
        }
        return string + "[" + enumC4505k0M8936T + "]=\"" + mo8928O() + "\"";
    }
}
