package p166l7;

import java.io.IOException;
import p136j8.C2104o;
import p152k7.AbstractC2331a;
import p209o7.AbstractC3070d;
import p209o7.C3073g;
import p229p7.C3331a;
import p229p7.C3332b;
import p241q7.C3445b;
import p257r7.C3711a;

/* JADX INFO: renamed from: l7.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2513a extends AbstractC3070d {

    /* JADX INFO: renamed from: m */
    public final C3331a f8138m;

    /* JADX INFO: renamed from: n */
    public C3711a f8139n;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractC2513a(C3331a c3331a, C3073g c3073g, int i9) {
        super(i9 + (c3073g == null ? 2 : 3));
        this.f8138m = c3331a;
        m6539P(c3331a);
        if (c3073g != null) {
            m6539P(c3073g);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p152k7.AbstractC2333c, p152k7.AbstractC2331a
    /* JADX INFO: renamed from: B */
    public void mo1893B(C3445b c3445b) throws IOException {
        c3445b.getClass();
        C3332b c3332bM7054T = C3332b.m7054T(c3445b);
        mo5905Q(c3332bM7054T);
        C3445b c3445bM7226a = c3445b.m7226a(c3332bM7054T.f10723o.f12083n);
        m5908T(c3445bM7226a);
        c3445b.m7228c(c3332bM7054T.f10723o.f12083n);
        c3445bM7226a.close();
        mo5906R();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p209o7.AbstractC3070d, p152k7.AbstractC2333c
    /* JADX INFO: renamed from: N */
    public final void mo1891N() {
        C3711a c3711a = this.f8139n;
        if (c3711a == null) {
            c3711a = new C3711a(0, false);
            m6539P(c3711a);
            this.f8139n = c3711a;
        }
        c3711a.m7714O(0);
        c3711a.m7715M(0, false);
        c3711a.m7713N(mo5551p());
        C3331a c3331a = this.f8138m;
        c3331a.f10722n.mo633k(((short) c3331a.mo5551p()) & 65535);
        AbstractC2331a abstractC2331a = c3331a.f7658h;
        if (abstractC2331a != null) {
            c3331a.f10723o.mo633k(abstractC2331a.mo5551p());
        }
        mo5907S();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: Q */
    public void mo5905Q(C3332b c3332b) {
        int iM7051Q = c3332b.m7051Q();
        if (iM7051Q == 0 || iM7051Q == 1) {
            C2104o.m5285j(c3332b, "Invalid chunk: ");
        }
    }

    /* JADX INFO: renamed from: S */
    public abstract void mo5907S();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: T */
    public final void m5908T(C3445b c3445b) throws IOException {
        C3711a c3711a = this.f8139n;
        if (c3711a == null) {
            c3711a = new C3711a(0, false);
            m6539P(c3711a);
            this.f8139n = c3711a;
        }
        c3711a.m7714O(0);
        super.mo1893B(c3445b);
        c3711a.m7713N(c3445b.f11162k);
        int iMo5551p = c3711a.mo5551p();
        int iAvailable = c3445b.available();
        if (iMo5551p == 0 || iAvailable < iMo5551p) {
            return;
        }
        c3445b.m7229e(c3711a.f12076k, iMo5551p);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        return getClass().getSimpleName() + ": " + this.f8138m;
    }

    public AbstractC2513a(C3331a c3331a, int i9) {
        this(c3331a, new C3073g(), i9);
    }

    /* JADX INFO: renamed from: R */
    public void mo5906R() {
    }
}
