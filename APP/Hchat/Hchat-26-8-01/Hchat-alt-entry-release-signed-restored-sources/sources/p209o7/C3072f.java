package p209o7;

import java.io.IOException;
import java.util.Iterator;
import p047d7.C0719b;
import p135j7.C2085a;
import p135j7.C2088d;
import p135j7.C2089e;
import p136j8.C2104o;
import p166l7.C2515c;
import p166l7.C2522j;
import p166l7.C2523k;
import p166l7.C2525m;
import p229p7.C3332b;
import p229p7.C3333c;
import p229p7.C3337g;
import p229p7.C3341k;
import p241q7.C3445b;
import p273s7.C3936e;
import p314v7.C4496g;

/* JADX INFO: renamed from: o7.f */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3072f extends AbstractC3071e {

    /* JADX INFO: renamed from: m */
    public final C2088d f9934m;

    /* JADX INFO: renamed from: n */
    public final C2515c f9935n;

    /* JADX INFO: renamed from: o */
    public final C0719b f9936o;

    /* JADX INFO: renamed from: p */
    public final C3936e f9937p;

    /* JADX INFO: renamed from: q */
    public final C3068b f9938q;

    /* JADX INFO: renamed from: r */
    public final C3068b f9939r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3072f() {
        super(6);
        C2088d c2088d = new C2088d();
        this.f9934m = c2088d;
        C2515c c2515c = new C2515c(1);
        this.f9935n = c2515c;
        C0719b c0719b = new C0719b(null, 3);
        this.f9936o = c0719b;
        C3936e c3936e = new C3936e(null);
        this.f9937p = c3936e;
        C3068b c3068b = new C3068b(null);
        this.f9938q = c3068b;
        C3068b c3068b2 = new C3068b(null);
        this.f9939r = c3068b2;
        m6540P(0, c2088d);
        m6540P(1, c2515c);
        m6540P(2, c0719b);
        m6540P(3, c3936e);
        m6540P(4, c3068b);
        m6540P(5, c3068b2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p152k7.AbstractC2333c, p152k7.AbstractC2331a
    /* JADX INFO: renamed from: B */
    public final void mo1893B(C3445b c3445b) throws IOException {
        int i9;
        C2089e c2089e;
        do {
            c3445b.getClass();
            C3332b c3332bM7054T = C3332b.m7054T(c3445b);
            if (c3332bM7054T == null) {
                return;
            }
            i9 = c3445b.f11162k;
            int iM7051Q = c3332bM7054T.m7051Q();
            C2088d c2088d = this.f9934m;
            if (iM7051Q == 14) {
                C3337g c3337g = new C3337g();
                if (c3445b.available() < c3337g.mo5551p()) {
                    C2104o.m5295u(c3445b.available(), "Too few bytes to read spec header, available = ");
                    return;
                }
                int i10 = c3445b.f11162k;
                c3337g.m5545G(c3445b);
                c3445b.m7230g(i10);
                byte b10 = c3337g.f10739r.f12076k[0];
                C3076j c3076jM5144k0 = c2088d.m5144k0(b10);
                if (c3076jM5144k0 == null) {
                    c3076jM5144k0 = (C3076j) c2088d.m6523P();
                    C2522j c2522j = c3076jM5144k0.f9948l;
                    ((C3337g) c2522j.f8138m).f10739r.m7719P(b10);
                    C3076j c3076j = (C3076j) c2522j.m5553u(C3076j.class);
                    c2089e = c3076j != null ? c3076j.f9949m : null;
                    c2089e.f6993m = b10;
                    Iterator it = c2089e.f9926k.iterator();
                    while (it.hasNext()) {
                        ((C3341k) ((C2525m) it.next()).f8138m).f10751r.m7719P(b10);
                    }
                    C2089e c2089e2 = c3076jM5144k0.f9949m;
                    c2089e2.f6993m = b10;
                    Iterator it2 = c2089e2.f9926k.iterator();
                    while (it2.hasNext()) {
                        ((C3341k) ((C2525m) it2.next()).f8138m).f10751r.m7719P(b10);
                    }
                }
                c3076jM5144k0.f9948l.m5545G(c3445b);
            } else if (iM7051Q == 13) {
                byte b11 = C3341k.m7056U(c3445b).f10751r.f12076k[0];
                C3076j c3076jM5144k02 = c2088d.m5144k0(b11);
                if (c3076jM5144k02 == null) {
                    c3076jM5144k02 = (C3076j) c2088d.m6523P();
                    C2522j c2522j2 = c3076jM5144k02.f9948l;
                    ((C3337g) c2522j2.f8138m).f10739r.m7719P(b11);
                    C3076j c3076j2 = (C3076j) c2522j2.m5553u(C3076j.class);
                    c2089e = c3076j2 != null ? c3076j2.f9949m : null;
                    c2089e.f6993m = b11;
                    Iterator it3 = c2089e.f9926k.iterator();
                    while (it3.hasNext()) {
                        ((C3341k) ((C2525m) it3.next()).f8138m).f10751r.m7719P(b11);
                    }
                    C2089e c2089e3 = c3076jM5144k02.f9949m;
                    c2089e3.f6993m = b11;
                    Iterator it4 = c2089e3.f9926k.iterator();
                    while (it4.hasNext()) {
                        ((C3341k) ((C2525m) it4.next()).f8138m).f10751r.m7719P(b11);
                    }
                }
                ((C2525m) c3076jM5144k02.f9949m.m6523P()).m5545G(c3445b);
            } else if (iM7051Q == 15) {
                C2515c c2515c = new C2515c(1);
                c2515c.m5545G(c3445b);
                C2515c c2515c2 = this.f9935n;
                c2515c2.getClass();
                C2085a c2085a = (C2085a) c2515c.f8142p;
                c2085a.getClass();
                Iterator itM5558j0 = c2085a.m5558j0(false);
                while (itM5558j0.hasNext()) {
                    C4496g c4496g = (C4496g) itM5558j0.next();
                    C2085a c2085a2 = (C2085a) c2515c2.f8142p;
                    if (c4496g != null) {
                        c2085a2.mo6519M(c4496g);
                        ((C3333c) c2515c2.f8138m).f10726r.mo633k(c2085a2.f9926k.size());
                    }
                }
            } else if (iM7051Q == 16) {
                C3936e c3936e = this.f9937p;
                c3936e.getClass();
                C2515c c2515c3 = new C2515c(2);
                c3936e.mo6519M(c2515c3);
                c2515c3.m5545G(c3445b);
            } else if (iM7051Q == 17) {
                C2515c c2515c4 = new C2515c(0);
                this.f9938q.mo6519M(c2515c4);
                c2515c4.m5545G(c3445b);
            } else if (iM7051Q == 18) {
                C2523k c2523k = new C2523k();
                c2523k.m5545G(c3445b);
                this.f9936o.mo6519M(c2523k);
            } else {
                C2522j c2522j3 = new C2522j(1);
                c2522j3.m5545G(c3445b);
                this.f9939r.mo6519M(c2522j3);
            }
        } while (i9 != c3445b.f11162k);
    }
}
