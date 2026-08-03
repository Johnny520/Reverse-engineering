package p182m7;

import java.util.HashMap;
import java.util.Iterator;
import okhttp3.HttpUrl;
import p025bc.C0259i;
import p071f1.C1005h;
import p229p7.C3343m;
import p257r7.AbstractC3712b;
import p257r7.AbstractC3729s;
import p257r7.C3716f;
import p257r7.C3724n;
import p257r7.C3725o;
import p298u7.C4278a;
import p379z7.C6112h;
import p379z7.C6115k;
import p379z7.C6119o;

/* JADX INFO: renamed from: m7.w */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2810w extends AbstractC2789b {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2810w() {
        super(9, 1);
        m6539P(new C3716f(false));
        mo6171b0(0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00cf  */
    @Override // p152k7.AbstractC2333c
    /* JADX INFO: renamed from: M */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo5560M() {
        C4278a c4278aM6166W;
        Object next;
        C3724n c3724n;
        C3725o c3725oM6165V = m6165V(((C3343m) this.f8138m).f10759s.f12083n);
        if ((c3725oM6165V != null ? c3725oM6165V.f12101m : null) == null || m6202c0() != null || (c4278aM6166W = m6166W()) == null) {
            return;
        }
        c4278aM6166W.getClass();
        C0259i c0259i = new C0259i(HttpUrl.FRAGMENT_ENCODE_SET, 3);
        c4278aM6166W.m8599U();
        C1005h c1005h = c4278aM6166W.f14198r;
        synchronized (c1005h.f3182i) {
            try {
                HashMap map = (HashMap) c1005h.f3183j;
                next = null;
                if (map != null) {
                    Object obj = map.get(HttpUrl.FRAGMENT_ENCODE_SET);
                    if (obj != null) {
                        if (obj.getClass() == C6119o.class) {
                            C6119o c6119o = (C6119o) obj;
                            if (c6119o.isEmpty()) {
                                ((HashMap) c1005h.f3183j).remove(HttpUrl.FRAGMENT_ENCODE_SET);
                            } else {
                                Iterator it = c6119o.iterator();
                                Iterator c6115k = !it.hasNext() ? C6112h.f24664g : new C6115k(it, c0259i);
                                if (c6115k.hasNext()) {
                                    next = c6115k.next();
                                }
                            }
                        } else if (c0259i.test(obj)) {
                            next = obj;
                        }
                    }
                }
            } finally {
            }
        }
        C3725o c3725o = (C3725o) ((AbstractC3729s) next);
        if (c3725o == null) {
            AbstractC3729s abstractC3729s = (AbstractC3729s) c4278aM6166W.f14196p.m6523P();
            abstractC3729s.getClass();
            abstractC3729s.f7659i = false;
            String str = abstractC3729s.f12101m;
            if (abstractC3729s.mo5551p() == 0) {
                str = null;
            } else {
                if (!HttpUrl.FRAGMENT_ENCODE_SET.equals(str)) {
                }
                c3725o = (C3725o) abstractC3729s;
                c3724n = c3725o.f12097t;
                if (c3724n != null) {
                    c3725o.f12097t = null;
                    c3724n.f12096p = null;
                }
            }
            abstractC3729s.f12101m = HttpUrl.FRAGMENT_ENCODE_SET;
            byte[] bArrMo7724V = abstractC3729s.mo7724V(HttpUrl.FRAGMENT_ENCODE_SET);
            if (bArrMo7724V == null || bArrMo7724V.length == 0) {
                bArrMo7724V = AbstractC3712b.f12075l;
            }
            if (bArrMo7724V != abstractC3729s.f12076k) {
                abstractC3729s.f12076k = bArrMo7724V;
            }
            abstractC3729s.mo7725Z(str);
            c3725o = (C3725o) abstractC3729s;
            c3724n = c3725o.f12097t;
            if (c3724n != null) {
            }
        }
        mo6170a0(c3725o.f7657g);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c0 */
    public final String m6202c0() {
        C3725o c3725oM6165V = m6165V(this.f9036o.f12083n);
        if (c3725oM6165V != null) {
            return c3725oM6165V.m7744Y();
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p182m7.AbstractC2789b, p166l7.AbstractC2513a
    public final String toString() {
        String strM6202c0 = m6202c0();
        return strM6202c0 != null ? strM6202c0 : super.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p152k7.AbstractC2331a
    /* JADX INFO: renamed from: y */
    public final boolean mo5555y() {
        C3725o c3725oM6165V = m6165V(((C3343m) this.f8138m).f10759s.f12083n);
        return ((c3725oM6165V != null ? c3725oM6165V.f12101m : null) == null && m6202c0() == null) || this.f7659i;
    }
}
