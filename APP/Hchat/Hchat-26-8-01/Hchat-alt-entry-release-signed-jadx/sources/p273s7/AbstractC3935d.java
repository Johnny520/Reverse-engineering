package p273s7;

import java.io.IOException;
import p075f6.C1075b;
import p136j8.C2104o;
import p152k7.AbstractC2331a;
import p152k7.InterfaceC2335e;
import p152k7.InterfaceC2336f;
import p209o7.C3068b;
import p209o7.C3069c;
import p222p.AbstractC3199a;
import p241q7.C3445b;
import p257r7.AbstractC3721k;
import p257r7.C3711a;
import p257r7.C3716f;
import p257r7.InterfaceC3717g;

/* JADX INFO: renamed from: s7.d */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3935d extends C3068b {

    /* JADX INFO: renamed from: m */
    public final InterfaceC3717g f12914m;

    /* JADX INFO: renamed from: n */
    public final C3069c f12915n;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractC3935d(C3716f c3716f, C3069c c3069c) {
        super(null);
        this.f12914m = c3716f;
        this.f12915n = c3069c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p152k7.AbstractC2331a
    /* JADX INFO: renamed from: B */
    public final void mo1893B(C3445b c3445b) {
        if (mo8123l0().f9926k.size() != 0) {
            int i9 = this.f12914m.get();
            c3445b.m7230g(i9);
            C3445b c3445bM7226a = c3445b.m7226a(c3445b.available());
            mo6529Y(c3445bM7226a);
            int i10 = i9 + c3445bM7226a.f11162k;
            c3445bM7226a.close();
            c3445b.m7230g(i10);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p209o7.C3068b
    /* JADX INFO: renamed from: V */
    public void mo5143V() {
        mo8123l0().mo5557c0(this.f9926k.size());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p209o7.C3068b
    /* JADX INFO: renamed from: X */
    public void mo5141X() {
        m6528U();
        mo8128j0();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p209o7.C3068b
    /* JADX INFO: renamed from: Y */
    public void mo6529Y(C3445b c3445b) {
        C3069c c3069cMo8123l0 = mo8123l0();
        int size = c3069cMo8123l0.f9926k.size();
        super.mo6520d0(size, true);
        for (int i9 = 0; i9 < size; i9++) {
            AbstractC3721k abstractC3721k = (AbstractC3721k) c3069cMo8123l0.m6524Q(i9);
            AbstractC2331a abstractC2331aM6524Q = m6524Q(i9);
            boolean zMo7730O = abstractC3721k.mo7730O();
            int i10 = abstractC3721k.f12091m;
            if (!zMo7730O) {
                int iAvailable = c3445b.available() + c3445b.f11162k;
                if (i10 < 0 || i10 > iAvailable) {
                    C2104o.m5299y(AbstractC3199a.m6837j(i10, "Offset ", " is out of range ", iAvailable));
                    return;
                }
            }
            abstractC2331aM6524Q.mo5547I(zMo7730O);
            if (!zMo7730O) {
                int i11 = c3445b.f11162k;
                c3445b.m7230g(i10);
                try {
                    abstractC2331aM6524Q.m5545G(c3445b);
                    if (c3445b.f11162k < i11) {
                        c3445b.m7230g(i11);
                    }
                } catch (Exception e6) {
                    throw new IOException("Error at:" + abstractC3721k.toString() + e6.getMessage(), e6);
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p209o7.C3068b
    /* JADX INFO: renamed from: Z */
    public final void mo6530Z() {
        int size = this.f9926k.size();
        if (size != 0) {
            if (m6524Q(0) instanceof InterfaceC2335e) {
                for (int i9 = 0; i9 < size; i9++) {
                    ((InterfaceC2335e) m6524Q(i9)).mo5562c();
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p209o7.C3068b
    /* JADX INFO: renamed from: d0 */
    public final void mo6520d0(int i9, boolean z9) {
        super.mo6520d0(i9, true);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean isEmpty() {
        return this.f9926k.size() == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j0 */
    public int mo8128j0() {
        int i9;
        mo8123l0().mo5557c0(this.f9926k.size());
        AbstractC2331a abstractC2331a = this.f7658h;
        if (abstractC2331a == null || isEmpty()) {
            i9 = 0;
        } else {
            C1075b c1075b = new C1075b(this);
            abstractC2331a.mo5556z(c1075b);
            i9 = c1075b.f3460c;
        }
        this.f12914m.mo633k(i9);
        C3069c c3069cMo8123l0 = mo8123l0();
        int size = this.f9926k.size();
        c3069cMo8123l0.mo5557c0(size);
        int iMo5551p = 0;
        for (int i10 = 0; i10 < size; i10++) {
            AbstractC3721k abstractC3721k = (AbstractC3721k) c3069cMo8123l0.m6524Q(i10);
            AbstractC2331a abstractC2331aM6524Q = m6524Q(i10);
            abstractC3721k.getClass();
            boolean zMo5555y = abstractC2331aM6524Q.mo5555y();
            int i11 = abstractC3721k.f12091m;
            if (!zMo5555y) {
                if (iMo5551p != i11) {
                    abstractC3721k.mo7728S(iMo5551p);
                    abstractC3721k.f12091m = iMo5551p;
                }
                iMo5551p = abstractC2331aM6524Q.mo5551p() + iMo5551p;
            } else if (-1 != i11) {
                abstractC3721k.mo7728S(-1);
                abstractC3721k.f12091m = -1;
            }
        }
        C3711a c3711aMo8129k0 = mo8129k0();
        return c3711aMo8129k0 != null ? c3711aMo8129k0.m7713N(iMo5551p) + iMo5551p : iMo5551p;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k0 */
    public C3711a mo8129k0() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l0 */
    public C3069c mo8123l0() {
        return this.f12915n;
    }

    public AbstractC3935d(C3716f c3716f, C3069c c3069c, InterfaceC2336f interfaceC2336f) {
        super(interfaceC2336f);
        this.f12914m = c3716f;
        this.f12915n = c3069c;
    }
}
