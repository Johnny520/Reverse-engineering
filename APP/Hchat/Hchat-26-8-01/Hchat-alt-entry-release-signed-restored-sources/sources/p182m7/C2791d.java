package p182m7;

import p152k7.AbstractC2331a;
import p209o7.C3069c;
import p241q7.C3445b;
import p257r7.C3725o;
import p298u7.C4278a;

/* JADX INFO: renamed from: m7.d */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2791d extends C3069c {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p209o7.C3069c, p152k7.AbstractC2331a
    /* JADX INFO: renamed from: B */
    public final void mo1893B(C3445b c3445b) {
        int i9 = this.f9929n.get();
        mo5557c0(i9);
        if (i9 != 0) {
            int i10 = ((C2807t) m5554v(C2807t.class)).f9066r.get();
            for (int i11 = 0; i11 < i9; i11++) {
                C2790c c2790c = (C2790c) m6524Q(i11);
                int i12 = c2790c.f14858n;
                c2790c.m7715M((i10 - 12) + i12, false);
                AbstractC2331a.m5536F(c2790c.f12076k, i12, (short) (c2790c.mo5551p() - i12));
                int i13 = c3445b.f11162k;
                c2790c.m5545G(c3445b);
                c3445b.m7230g(i13 + i10);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p209o7.C3068b
    /* JADX INFO: renamed from: W */
    public final void mo1894W(AbstractC2331a abstractC2331a) {
        C4278a c4278aMo6180g;
        C2790c c2790c = (C2790c) abstractC2331a;
        C2807t c2807t = (C2807t) m5554v(C2807t.class);
        C2792e c2792e = c2807t.f9068t;
        if (c2792e.f9043p != c2790c) {
            c2792e = c2807t.f9069u;
            if (c2792e.f9043p != c2790c) {
                c2792e = c2807t.f9070v;
                if (c2792e.f9043p != c2790c) {
                    c2792e = null;
                }
            }
        }
        if (c2792e != null) {
            c2792e.f9043p = null;
            c2792e.m6183Q(-1);
        }
        c2790c.m8938W();
        C2808u c2808u = c2790c.f9042s;
        if (c2808u != null) {
            c2790c.f9042s = null;
            c2808u.f9074q.remove(c2790c);
        }
        c2790c.m6179e0(c2790c.f9038o);
        c2790c.m6179e0(c2790c.f9039p);
        c2790c.m6179e0(c2790c.f9041r);
        c2790c.f9038o = null;
        c2790c.f9039p = null;
        c2790c.f9041r = null;
        int iM5539s = AbstractC2331a.m5539s(c2790c.f12076k, 4);
        C3725o c3725o = (C3725o) ((iM5539s >= 0 && (c4278aMo6180g = c2790c.mo6180g()) != null) ? c4278aMo6180g.m8600V(iM5539s) : null);
        c2790c.m6178d0(c3725o != null ? c3725o.f12097t : null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p209o7.C3069c, p209o7.C3068b
    /* JADX INFO: renamed from: c0 */
    public final void mo5557c0(int i9) {
        if (i9 != this.f9926k.size()) {
            this.f9929n.mo633k(i9);
            mo6520d0(i9, false);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k0 */
    public final void m6181k0() {
        if (super.m6533e0()) {
            C2807t c2807t = (C2807t) m5554v(C2807t.class);
            c2807t.f9068t.m6184c();
            c2807t.f9069u.m6184c();
            c2807t.f9070v.m6184c();
        }
    }
}
