package p229p7;

import okio.C3193a;
import p038ce.C0561n;
import p068eh.AbstractC0921a;
import p136j8.C2104o;
import p152k7.AbstractC2331a;
import p152k7.InterfaceC2336f;
import p241q7.C3445b;
import p257r7.AbstractC3721k;
import p257r7.C3711a;
import p257r7.C3713c;
import p257r7.C3716f;
import p273s7.C3932a;
import p273s7.C3933b;
import p273s7.C3934c;
import p314v7.C4519y;
import p363y7.AbstractC5999a;
import p379z7.C6107c;

/* JADX INFO: renamed from: p7.k */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3341k extends C3331a {

    /* JADX INFO: renamed from: r */
    public final C3713c f10751r;

    /* JADX INFO: renamed from: s */
    public final C3713c f10752s;

    /* JADX INFO: renamed from: t */
    public final C3716f f10753t;

    /* JADX INFO: renamed from: u */
    public final C3716f f10754u;

    /* JADX INFO: renamed from: v */
    public final C4519y f10755v;

    /* JADX INFO: renamed from: w */
    public C3932a f10756w;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3341k() {
        super((short) 513);
        C3713c c3713c = new C3713c(1, 1);
        this.f10751r = c3713c;
        C3713c c3713c2 = new C3713c(1, 1);
        this.f10752s = c3713c2;
        AbstractC2331a c3711a = new C3711a(1, false);
        C3716f c3716f = new C3716f(false);
        this.f10753t = c3716f;
        C3716f c3716f2 = new C3716f(false);
        this.f10754u = c3716f2;
        C4519y c4519y = new C4519y(64);
        this.f10755v = c4519y;
        m6539P(c3713c);
        m6539P(c3713c2);
        m6539P(c3711a);
        m6539P(c3716f);
        m6539P(c3716f2);
        m6539P(c4519y);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: U */
    public static C3341k m7056U(C3445b c3445b) {
        C3341k c3341k = new C3341k();
        C3713c c3713c = c3341k.f10752s;
        if ((c3713c.get() & 3) == 1) {
            c3341k.m7058V(0);
        }
        if ((c3713c.get() & 3) == 2) {
            c3341k.m7058V(0);
        }
        if (c3445b.available() < 36) {
            C2104o.m5295u(c3445b.available(), "Too few bytes to read type header, available = ");
            return null;
        }
        int i9 = c3445b.f11162k;
        c3341k.m5545G(c3445b);
        c3445b.m7230g(i9);
        return c3341k;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p229p7.C3331a, p152k7.AbstractC2333c, p152k7.AbstractC2331a
    /* JADX INFO: renamed from: B */
    public final void mo1893B(C3445b c3445b) {
        super.mo1893B(c3445b);
        m7057T();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: T */
    public final void m7057T() {
        C3932a c3932a = this.f10756w;
        if (c3932a != null) {
            int i9 = this.f10752s.get() & 3;
            C3933b c3933b = c3932a.f12911g;
            C3934c c3934c = (C3934c) c3933b.f12915n;
            InterfaceC2336f interfaceC2336f = c3934c.f9927l;
            int i10 = 0;
            C3193a c3193a = AbstractC3721k.f12090p;
            C3193a c3193a2 = AbstractC3721k.f12088n;
            if (i9 != (interfaceC2336f == c3193a2 ? 2 : interfaceC2336f == c3193a ? 1 : 0)) {
                if (i9 != 1) {
                    C3193a c3193a3 = AbstractC3721k.f12089o;
                    if (interfaceC2336f != c3193a) {
                        if (i9 == 2) {
                            c3934c.m6532b0(c3193a2);
                        } else {
                            c3934c.m6532b0(c3193a3);
                        }
                        if (!c3933b.isEmpty()) {
                            c3934c.m6521N();
                        }
                    } else if (i9 == 2) {
                        c3934c.m8127k0(c3933b, c3193a2);
                    } else {
                        c3934c.m8127k0(c3933b, c3193a3);
                    }
                } else if (c3933b.isEmpty()) {
                    c3934c.m6532b0(c3193a);
                } else {
                    C6107c c6107cM8126l0 = C3934c.m8126l0(c3933b);
                    int i11 = c6107cM8126l0.f24644i;
                    c3934c.m6521N();
                    c3934c.m6532b0(c3193a);
                    c3934c.mo5557c0(i11);
                    while (i10 < i11) {
                        ((AbstractC3721k) c3934c.m6524Q(i10)).mo7731Q(((Integer) c6107cM8126l0.f24642g[i10]).intValue());
                        i10++;
                    }
                    c3933b.removeIf(new C0561n(27));
                }
                i10 = !c3933b.isEmpty() ? 1 : 0;
            }
            if (i10 != 0) {
                c3933b.mo8128j0();
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: V */
    public final void m7058V(int i9) {
        C3713c c3713c = this.f10752s;
        if (i9 != (c3713c.get() & 3)) {
            if (i9 != 0 && i9 != 2 && i9 != 1) {
                C2104o.m5294t(AbstractC0921a.m2249l(i9, "Invalid offset type: "));
            } else {
                c3713c.m7719P((byte) (i9 | (c3713c.get() & 252)));
                m7057T();
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p229p7.C3331a
    public final String toString() {
        if (m7051Q() != 13) {
            return super.toString();
        }
        return C3341k.class.getSimpleName() + " {id=" + AbstractC5999a.m10751n(this.f10751r.f12076k[0]) + ", flags=" + AbstractC5999a.m10751n(this.f10752s.f12076k[0]) + ", count=" + this.f10753t + ", entriesStart=" + this.f10754u + ", config=" + this.f10755v + '}';
    }
}
