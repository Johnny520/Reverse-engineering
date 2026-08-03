package p047d7;

import p152k7.AbstractC2331a;
import p209o7.AbstractC3070d;
import p241q7.C3445b;
import p257r7.AbstractC3712b;
import p257r7.C3716f;
import p257r7.C3718h;

/* JADX INFO: renamed from: d7.j */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0727j extends AbstractC3070d {

    /* JADX INFO: renamed from: m */
    public final AbstractC3712b f2167m;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractC0727j(int i9, boolean z9) {
        super(i9 + 1);
        AbstractC3712b c3718h = z9 ? new C3718h(false) : new C3716f(false);
        this.f2167m = c3718h;
        m6539P(c3718h);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p152k7.AbstractC2333c, p152k7.AbstractC2331a
    /* JADX INFO: renamed from: B */
    public final void mo1893B(C3445b c3445b) {
        if (c3445b.m7227b()) {
            AbstractC3712b abstractC3712b = this.f2167m;
            abstractC3712b.m5545G(c3445b);
            int iM1916Q = (int) m1916Q();
            if (iM1916Q <= 0) {
                mo1917R(0);
                return;
            }
            mo1917R(iM1916Q);
            C3445b c3445bM7226a = c3445b.m7226a(iM1916Q);
            for (AbstractC2331a abstractC2331a : this.f9930k) {
                if (abstractC2331a != abstractC3712b) {
                    abstractC2331a.m5545G(c3445bM7226a);
                }
            }
            c3445b.m7228c(iM1916Q);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p209o7.AbstractC3070d, p152k7.AbstractC2333c
    /* JADX INFO: renamed from: N */
    public final void mo1891N() {
        int iMo5551p = mo5551p();
        AbstractC3712b abstractC3712b = this.f2167m;
        long jMo5551p = iMo5551p - abstractC3712b.mo5551p();
        if (abstractC3712b instanceof C3718h) {
            ((C3718h) abstractC3712b).m7726N(jMo5551p);
        } else {
            ((C3716f) abstractC3712b).mo633k((int) jMo5551p);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: Q */
    public final long m1916Q() {
        AbstractC3712b abstractC3712b = this.f2167m;
        return abstractC3712b instanceof C3718h ? ((C3718h) abstractC3712b).f12085n : ((C3716f) abstractC3712b).f12083n;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        return "size=" + this.f2167m;
    }

    /* JADX INFO: renamed from: R */
    public void mo1917R(int i9) {
    }
}
