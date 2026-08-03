package p246qd;

import gf.C1402a;
import java.util.Objects;
import md.AbstractC2828e;
import md.EnumC2824a;
import mh.AbstractC2846d;
import mh.InterfaceC2844b;
import p012ah.C0086a;
import p233pd.EnumC3400k;
import p302ud.C4320p;
import p302ud.C4322r;
import p351xe.C5791l;

/* JADX INFO: renamed from: qd.l */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3508l extends AbstractC2828e {

    /* JADX INFO: renamed from: k */
    public static final InterfaceC2844b f11418k = AbstractC2846d.m6274b(AbstractC3508l.class);

    /* JADX INFO: renamed from: i */
    public AbstractC3506j f11419i;

    /* JADX INFO: renamed from: j */
    public C4320p f11420j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: S */
    public static C3510n m7368S(long j3, AbstractC3506j abstractC3506j) {
        if (j3 != 0 && !abstractC3506j.mo7345w() && !abstractC3506j.mo7349a(EnumC3513q.LONG) && !abstractC3506j.mo7349a(EnumC3513q.DOUBLE)) {
            abstractC3506j = j3 == 1 ? AbstractC3506j.f11409z : j3 < 0 ? AbstractC3506j.f11378C : AbstractC3506j.f11377B;
        }
        return new C3510n(j3, abstractC3506j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: T */
    public static C3514r m7369T(int i9, AbstractC3506j abstractC3506j, boolean z9) {
        C3514r c3514r = new C3514r(i9, abstractC3506j);
        if (z9) {
            c3514r.m6231w(EnumC2824a.f9128N);
        }
        return c3514r;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: U */
    public static C3514r m7370U(C1402a c1402a, int i9, AbstractC3506j abstractC3506j) {
        return new C3514r(c1402a.f4667i[i9], abstractC3506j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: Y */
    public static C3514r m7371Y(C1402a c1402a, int i9, AbstractC3506j abstractC3506j) {
        return abstractC3506j.mo7345w() ? m7369T(c1402a.f4667i[i9], abstractC3506j, true) : new C3514r(c1402a.f4667i[i9], abstractC3506j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: Z */
    public static C3509m m7372Z(C4320p c4320p) {
        C3514r c3514r = c4320p.f14397l;
        c4320p.m6231w(EnumC2824a.f9133S);
        C3509m c3509m = new C3509m(c4320p);
        int iOrdinal = c4320p.f14396k.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                C3501e c3501e = AbstractC3506j.f11396m;
                c3509m.f11419i = c3501e;
                if (c3514r != null) {
                    c3514r.mo7386W(c3501e);
                }
            } else if (iOrdinal == 2) {
                C3501e c3501e2 = AbstractC3506j.f11395l;
                c3509m.f11419i = c3501e2;
                if (c3514r != null) {
                    c3514r.mo7386W(c3501e2);
                    return c3509m;
                }
            } else if (iOrdinal != 6) {
                if (c3514r != null) {
                    c3509m.f11419i = c3514r.mo7375I();
                    return c3509m;
                }
            }
            return c3509m;
        }
        C0086a.m452k("Don't wrap MOVE or CONST insns: ".concat(String.valueOf(c4320p)));
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a0 */
    public static AbstractC3508l m7373a0(C4320p c4320p) {
        EnumC3400k enumC3400k = c4320p.f14396k;
        if (enumC3400k != EnumC3400k.f10977g && enumC3400k != EnumC3400k.f10983m) {
            return m7372Z(c4320p);
        }
        if (!c4320p.f9217g.mo6235a(EnumC2824a.f9129O)) {
            AbstractC3508l abstractC3508lMo7179S = c4320p.mo7179S(0);
            c4320p.m6231w(EnumC2824a.f9166s);
            return abstractC3508lMo7179S;
        }
        C3514r c3514r = c4320p.f14397l;
        c4320p.m6231w(EnumC2824a.f9133S);
        C3509m c3509m = new C3509m(c4320p);
        if (c3514r != null) {
            c3509m.f11419i = c3514r.mo7375I();
        }
        return c3509m;
    }

    /* JADX INFO: renamed from: H */
    public abstract AbstractC3508l mo7374H();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: I */
    public AbstractC3506j mo7375I() {
        return this.f11419i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: J */
    public final boolean m7376J() {
        if (this.f9217g.mo6235a(EnumC2824a.f9124J)) {
            return true;
        }
        C4320p c4320p = this instanceof C3509m ? ((C3509m) this).f11421l : null;
        if (c4320p == null || c4320p.f14396k != EnumC3400k.f10959K) {
            return false;
        }
        return c4320p.mo7179S(0).m7376J();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: K */
    public final boolean m7377K() {
        if (this instanceof C3510n) {
            return true;
        }
        return (this instanceof C3509m) && ((C3509m) this).f11421l.m8686W();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: L */
    public final boolean m7378L() {
        if (!(this instanceof C3510n)) {
            return false;
        }
        C3510n c3510n = (C3510n) this;
        return c3510n.f11422l == 0 && Objects.equals(c3510n.f11419i, AbstractC3506j.f11386c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: M */
    public final boolean m7379M(C3514r c3514r) {
        if (c3514r != null && (this instanceof C3514r)) {
            return ((C3514r) this).m7396h0(c3514r);
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: N */
    public final boolean m7380N() {
        return this.f9217g.mo6235a(EnumC2824a.f9124J);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: O */
    public final boolean m7381O() {
        if (!(this instanceof C3510n)) {
            return false;
        }
        C3510n c3510n = (C3510n) this;
        return c3510n.f11422l == 1 && Objects.equals(c3510n.f11419i, AbstractC3506j.f11386c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: P */
    public boolean mo7382P() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: Q */
    public final boolean m7383Q() {
        if (mo7384R()) {
            return true;
        }
        if (this instanceof C3509m) {
            C4320p c4320p = ((C3509m) this).f11421l;
            if (c4320p.f14396k == EnumC3400k.f10977g) {
                return c4320p.mo7179S(0).mo7384R();
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: R */
    public boolean mo7384R() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: V */
    public void mo7385V(C4320p c4320p) {
        this.f11420j = c4320p;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: W */
    public void mo7386W(AbstractC3506j abstractC3506j) {
        this.f11419i = abstractC3506j;
    }

    /* JADX INFO: renamed from: X */
    public abstract String mo7387X();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b0 */
    public final AbstractC3508l m7388b0(C4322r c4322r, C4320p c4320p, boolean z9) {
        String name;
        C3514r c3514r;
        C4320p c4320p2 = this.f11420j;
        if (c4320p2 != null) {
            if (c4320p2 == c4320p) {
                f11418k.mo6270x(c4320p, "Can't wrap instruction info itself: {}");
                return null;
            }
            int size = c4320p2.f14398m.size();
            int i9 = 0;
            while (true) {
                if (i9 >= size) {
                    i9 = -1;
                    break;
                }
                if (c4320p2.mo7179S(i9) == this) {
                    break;
                }
                i9++;
            }
            if (i9 != -1) {
                if (c4320p.f14396k == EnumC3400k.f10983m && (this instanceof C3514r) && (name = ((C3514r) this).getName()) != null) {
                    AbstractC3508l abstractC3508lMo7179S = c4320p.mo7179S(0);
                    abstractC3508lMo7179S.getClass();
                    if (abstractC3508lMo7179S instanceof C3514r) {
                        C3514r c3514r2 = (C3514r) abstractC3508lMo7179S;
                        if (c3514r2.getName() == null) {
                            c3514r2.mo7390p(name);
                        }
                    } else if ((abstractC3508lMo7179S instanceof C3509m) && (c3514r = ((C3509m) abstractC3508lMo7179S).f11421l.f14397l) != null && c3514r.getName() == null) {
                        c3514r.mo7390p(name);
                    }
                }
                AbstractC3508l abstractC3508lM7373a0 = m7373a0(c4320p);
                AbstractC3508l abstractC3508lMo7179S2 = c4320p2.mo7179S(i9);
                if (abstractC3508lM7373a0.mo7375I() == AbstractC3506j.f11404u) {
                    abstractC3508lM7373a0.mo7386W(abstractC3508lMo7179S2.mo7375I());
                }
                c4320p2.mo7182c0(i9, abstractC3508lM7373a0);
                C5791l.m10477i(c4322r, abstractC3508lMo7179S2);
                if (z9) {
                    C5791l.m10477i(c4322r, this);
                    C5791l.m10480l(c4322r, c4320p);
                    c4320p.f14397l = null;
                }
                return abstractC3508lM7373a0;
            }
        }
        return null;
    }
}
