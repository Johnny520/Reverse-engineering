package p182m7;

import p136j8.AbstractC2091b;
import p152k7.AbstractC2331a;
import p166l7.AbstractC2513a;
import p209o7.C3073g;
import p229p7.C3343m;
import p257r7.C3716f;
import p257r7.C3725o;
import p298u7.C4278a;

/* JADX INFO: renamed from: m7.b */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2789b extends AbstractC2513a {

    /* JADX INFO: renamed from: o */
    public final C3716f f9036o;

    /* JADX INFO: renamed from: p */
    public final C3716f f9037p;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractC2789b(int i9, C3073g c3073g, int i10) {
        super(new C3343m(i9), c3073g, i10 + 2);
        C3716f c3716f = new C3716f(-1);
        this.f9036o = c3716f;
        C3716f c3716f2 = new C3716f(-1);
        this.f9037p = c3716f2;
        m6539P(c3716f);
        m6539P(c3716f2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: U */
    public String m6164U() {
        C3725o c3725oM6165V = m6165V(this.f9037p.f12083n);
        if (c3725oM6165V != null) {
            return c3725oM6165V.f12101m;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: V */
    public final C3725o m6165V(int i9) {
        C4278a c4278aM6166W;
        if (i9 == -1 || (c4278aM6166W = m6166W()) == null) {
            return null;
        }
        return (C3725o) c4278aM6166W.m8600V(i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: W */
    public final C4278a m6166W() {
        for (AbstractC2331a abstractC2331a = this.f7658h; abstractC2331a != null; abstractC2331a = abstractC2331a.f7658h) {
            if (abstractC2331a instanceof C2793f) {
                return ((C2794g) ((C2793f) abstractC2331a).f9062k).f9046o;
            }
            if (abstractC2331a instanceof C2797j) {
                C2793f c2793f = (C2793f) ((C2797j) abstractC2331a).m5554v(C2793f.class);
                if (c2793f != null) {
                    return ((C2794g) c2793f.f9062k).f9046o;
                }
                return null;
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: X */
    public final void m6167X(C3716f c3716f) {
        C3725o c3725oM6165V = m6165V(c3716f.f12083n);
        if (c3725oM6165V != null) {
            c3725oM6165V.m7743P(c3716f);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: Y */
    public void mo6168Y() {
        m6167X(((C3343m) this.f8138m).f10759s);
        m6167X(this.f9036o);
        m6167X(this.f9037p);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: Z */
    public void mo6169Z() {
        C4278a c4278aM6166W = m6166W();
        if (c4278aM6166W == null) {
            return;
        }
        c4278aM6166W.m8603b0(((C3343m) this.f8138m).f10759s);
        c4278aM6166W.m8603b0(this.f9036o);
        c4278aM6166W.m8603b0(this.f9037p);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a0 */
    public void mo6170a0(int i9) {
        C3716f c3716f = this.f9036o;
        int i10 = c3716f.f12083n;
        if (i9 == i10) {
            return;
        }
        C3725o c3725oM6165V = m6165V(i10);
        if (c3725oM6165V != null) {
            c3725oM6165V.m7745a0(c3716f);
        }
        c3716f.mo633k(i9);
        m6167X(c3716f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b0 */
    public void mo6171b0(int i9) {
        C3716f c3716f = this.f9037p;
        int i10 = c3716f.f12083n;
        if (i9 == i10) {
            return;
        }
        C3725o c3725oM6165V = m6165V(i10);
        if (c3725oM6165V != null) {
            c3725oM6165V.m7745a0(c3716f);
        }
        c3716f.mo633k(i9);
        m6167X(c3716f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p166l7.AbstractC2513a
    public String toString() {
        C3343m c3343m = (C3343m) this.f8138m;
        int iM7051Q = c3343m.m7051Q();
        if (iM7051Q == 0) {
            return super.toString();
        }
        return AbstractC2091b.m5155b(iM7051Q) + ": line=" + c3343m.f10758r.f12083n + " {" + m6164U() + "}";
    }

    @Override // p166l7.AbstractC2513a
    /* JADX INFO: renamed from: S */
    public void mo5907S() {
    }

    public AbstractC2789b(int i9, int i10) {
        this(i9, new C3073g(), i10);
    }
}
