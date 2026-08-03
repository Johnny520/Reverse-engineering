package p047d7;

import java.util.Iterator;
import p152k7.AbstractC2331a;
import p152k7.InterfaceC2334d;
import p209o7.AbstractC3071e;
import p209o7.C3068b;
import p209o7.C3073g;
import p241q7.C3445b;
import p257r7.AbstractC3712b;
import p257r7.C3716f;
import p257r7.C3718h;

/* JADX INFO: renamed from: d7.l */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0729l extends AbstractC3071e implements InterfaceC2334d, Iterable {

    /* JADX INFO: renamed from: m */
    public final AbstractC3712b f2169m;

    /* JADX INFO: renamed from: n */
    public final C3068b f2170n;

    /* JADX INFO: renamed from: o */
    public final C3073g f2171o;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractC0729l(boolean z9) {
        super(3);
        AbstractC3712b c3718h = z9 ? new C3718h(false) : new C3716f(false);
        this.f2169m = c3718h;
        C3068b c3068b = new C3068b(null);
        this.f2170n = c3068b;
        C3073g c3073g = new C3073g();
        this.f2171o = c3073g;
        m6540P(0, c3718h);
        m6540P(1, c3068b);
        m6540P(2, c3073g);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p152k7.AbstractC2333c, p152k7.AbstractC2331a
    /* JADX INFO: renamed from: B */
    public final void mo1893B(C3445b c3445b) {
        if (c3445b.m7227b()) {
            AbstractC3712b abstractC3712b = this.f2169m;
            abstractC3712b.m5545G(c3445b);
            int i9 = (int) (abstractC3712b instanceof C3718h ? ((C3718h) abstractC3712b).f12085n : ((C3716f) abstractC3712b).f12083n);
            if (i9 <= 0) {
                return;
            }
            C3445b c3445bM7226a = c3445b.m7226a(i9);
            C3073g c3073g = this.f2171o;
            int iMo5551p = c3073g.mo5551p() + 4;
            while (c3445bM7226a.available() > iMo5551p) {
                int i10 = c3445bM7226a.f11162k;
                AbstractC2331a abstractC2331aMo1892n = mo1892n();
                this.f2170n.mo6519M(abstractC2331aMo1892n);
                abstractC2331aMo1892n.m5545G(c3445bM7226a);
                if (i10 == c3445bM7226a.f11162k) {
                    break;
                }
            }
            c3073g.m5545G(c3445bM7226a);
            c3445b.m7228c(i9);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p209o7.AbstractC3071e, p152k7.AbstractC2333c
    /* JADX INFO: renamed from: N */
    public void mo1891N() {
        int iMo5551p = mo5551p();
        AbstractC3712b abstractC3712b = this.f2169m;
        long jMo5551p = iMo5551p - abstractC3712b.mo5551p();
        if (abstractC3712b instanceof C3718h) {
            ((C3718h) abstractC3712b).m7726N(jMo5551p);
        } else {
            ((C3716f) abstractC3712b).mo633k((int) jMo5551p);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f2170n.f9926k.iterator();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "size=" + this.f2169m + ", count=" + this.f2170n.f9926k.size();
    }
}
