package p273s7;

import java.util.Iterator;
import p038ce.C0561n;
import p152k7.AbstractC2331a;
import p257r7.AbstractC3729s;
import p257r7.C3731u;
import p257r7.C3732v;
import p257r7.C3733w;
import p298u7.AbstractC4280c;

/* JADX INFO: renamed from: s7.h */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3939h extends AbstractC3935d {

    /* JADX INFO: renamed from: o */
    public boolean f12919o;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p209o7.C3068b
    /* JADX INFO: renamed from: W */
    public final void mo1894W(AbstractC2331a abstractC2331a) {
        ((C3731u) abstractC2331a).m7747R();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p273s7.AbstractC3935d, p209o7.C3068b
    /* JADX INFO: renamed from: X */
    public final void mo5141X() {
        super.mo5141X();
        m8133n0();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m0 */
    public final void m8132m0() {
        if (this.f12919o) {
            return;
        }
        this.f12919o = true;
        int size = this.f9926k.size();
        for (int i9 = 0; i9 < size; i9++) {
            Iterator it = ((C3731u) m6524Q(i9)).iterator();
            while (it.hasNext()) {
                C3732v c3732v = ((C3733w) it.next()).f12114m;
                AbstractC3729s abstractC3729sM7749a = c3732v.m7749a();
                if (abstractC3729sM7749a != null) {
                    abstractC3729sM7749a.m7743P(c3732v);
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n0 */
    public final void m8133n0() {
        int i9;
        boolean z9 = false;
        if (((AbstractC4280c) m5554v(AbstractC4280c.class)) != null ? !r1.f14196p.f12918q : false) {
            super.m6533e0();
            Iterator itM10866b = this.f9926k.m10866b();
            while (itM10866b.hasNext()) {
                C3731u c3731u = (C3731u) itM10866b.next();
                AbstractC3729s abstractC3729s = c3731u.f12113p;
                if (abstractC3729s != null && (i9 = abstractC3729s.f7657g) != c3731u.f7657g) {
                    m6527T(i9, c3731u);
                    z9 = true;
                }
            }
            if (z9) {
                ((AbstractC4280c) m5554v(AbstractC4280c.class)).m8601X();
            }
            if (z9) {
                super.m6533e0();
            }
            m6534f0(new C0561n(29));
        }
    }
}
