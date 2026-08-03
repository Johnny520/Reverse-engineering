package p182m7;

import p014b.C0126e;
import p025bc.AbstractC0255e;
import p075f6.C1075b;
import p152k7.AbstractC2331a;
import p174m.C2571a;
import p209o7.C3073g;
import p257r7.C3711a;
import p257r7.C3725o;
import p332wb.AbstractC4855en;
import p363y7.AbstractC5999a;

/* JADX INFO: renamed from: m7.t */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2807t extends AbstractC2789b {

    /* JADX INFO: renamed from: q */
    public final C3711a f9065q;

    /* JADX INFO: renamed from: r */
    public final C0126e f9066r;

    /* JADX INFO: renamed from: s */
    public final C3711a f9067s;

    /* JADX INFO: renamed from: t */
    public final C2792e f9068t;

    /* JADX INFO: renamed from: u */
    public final C2792e f9069u;

    /* JADX INFO: renamed from: v */
    public final C2792e f9070v;

    /* JADX INFO: renamed from: w */
    public final C2791d f9071w;

    /* JADX INFO: renamed from: x */
    public final C2799l f9072x;

    /* JADX INFO: renamed from: y */
    public final C2571a f9073y;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2807t(C2799l c2799l) {
        super(7, null, 9);
        this.f9072x = c2799l;
        C3711a c3711a = new C3711a((short) 20);
        this.f9065q = c3711a;
        AbstractC2331a c3711a2 = new C3711a((short) 20);
        C3711a c3711a3 = new C3711a(1, false);
        this.f9067s = c3711a3;
        C2792e c2792e = new C2792e(1, false);
        this.f9068t = c2792e;
        C2792e c2792e2 = new C2792e(1, false);
        this.f9069u = c2792e2;
        C2792e c2792e3 = new C2792e(1, false);
        this.f9070v = c2792e3;
        AbstractC2331a c3073g = new C3073g();
        this.f9073y = new C2571a(this, 3);
        AbstractC2331a c2806s = new C2806s(this);
        C0126e c0126e = new C0126e(this, 26, c3711a2);
        this.f9066r = c0126e;
        C2791d c2791d = new C2791d(new C2571a(c0126e, 2), c3711a3);
        this.f9071w = c2791d;
        m6539P(c3711a);
        m6539P(c3711a2);
        m6539P(c3711a3);
        m6539P(c2792e);
        m6539P(c2792e2);
        m6539P(c2792e3);
        m6539P(c3073g);
        m6539P(c2806s);
        m6539P(c2791d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p152k7.AbstractC2333c
    /* JADX INFO: renamed from: M */
    public final void mo5560M() {
        this.f9071w.m6181k0();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p182m7.AbstractC2789b, p166l7.AbstractC2513a
    /* JADX INFO: renamed from: S */
    public final void mo5907S() {
        if (this.f9067s.f12074o != 0) {
            C1075b c1075b = new C1075b(this.f9071w);
            mo5556z(c1075b);
            this.f9073y.mo633k(c1075b.f3460c);
        }
        this.f9068t.m6184c();
        this.f9069u.m6184c();
        this.f9070v.m6184c();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p182m7.AbstractC2789b
    /* JADX INFO: renamed from: Y */
    public final void mo6168Y() {
        super.mo6168Y();
        this.f9072x.mo6168Y();
        C2808u c2808uM6201d0 = m6201d0();
        if (c2808uM6201d0 != null) {
            c2808uM6201d0.f9075r.add(this);
        }
        this.f9068t.m6182P();
        this.f9069u.m6182P();
        this.f9070v.m6182P();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p182m7.AbstractC2789b
    /* JADX INFO: renamed from: Z */
    public final void mo6169Z() {
        super.mo6169Z();
        C2808u c2808uM6201d0 = m6201d0();
        if (c2808uM6201d0 != null) {
            c2808uM6201d0.f9075r.remove(this);
        }
        C2791d c2791d = this.f9071w;
        c2791d.m6521N();
        c2791d.f9929n.mo633k(c2791d.f9926k.size());
        this.f9072x.mo6169Z();
        C2792e c2792e = this.f9068t;
        c2792e.f9043p = null;
        c2792e.m6183Q(-1);
        C2792e c2792e2 = this.f9069u;
        c2792e2.f9043p = null;
        c2792e2.m6183Q(-1);
        C2792e c2792e3 = this.f9070v;
        c2792e3.f9043p = null;
        c2792e3.m6183Q(-1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p182m7.AbstractC2789b
    /* JADX INFO: renamed from: a0 */
    public final void mo6170a0(int i9) {
        super.mo6170a0(i9);
        this.f9072x.mo6170a0(i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p182m7.AbstractC2789b
    /* JADX INFO: renamed from: b0 */
    public final void mo6171b0(int i9) {
        super.mo6171b0(i9);
        this.f9072x.mo6171b0(i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c0 */
    public final String m6200c0(boolean z9) {
        C3725o c3725oM6165V;
        String strM6164U = m6164U();
        if (z9) {
            C2808u c2808uM6201d0 = m6201d0();
            String str = null;
            if (c2808uM6201d0 != null && (c3725oM6165V = c2808uM6201d0.m6165V(c2808uM6201d0.f9036o.f12083n)) != null) {
                str = c3725oM6165V.f12101m;
            }
            if (str != null) {
                return AbstractC4855en.m9264h(str, ":", strM6164U);
            }
        }
        return strM6164U;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d0 */
    public final C2808u m6201d0() {
        C2797j c2797j;
        int i9 = this.f9036o.f12083n;
        if (i9 == -1 || (c2797j = (C2797j) m5554v(C2797j.class)) == null) {
            return null;
        }
        return c2797j.m6196U(i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p182m7.AbstractC2789b, p166l7.AbstractC2513a
    public final String toString() {
        String strM6200c0 = m6200c0(true);
        if (strM6200c0 == null) {
            return super.toString();
        }
        StringBuilder sbM1025n = AbstractC0255e.m1025n(strM6200c0, " ");
        sbM1025n.append(AbstractC5999a.m10745h(this.f9071w.f9926k.iterator()));
        return sbM1025n.toString();
    }
}
