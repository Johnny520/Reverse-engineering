package p182m7;

import be.C0285i;
import java.io.IOException;
import okio.C3193a;
import p038ce.C0561n;
import p047d7.C0719b;
import p068eh.AbstractC0921a;
import p136j8.C2104o;
import p166l7.AbstractC2513a;
import p166l7.C2518f;
import p229p7.C3331a;
import p229p7.C3332b;
import p241q7.C3445b;
import p298u7.C4278a;
import p344x7.C5705b;

/* JADX INFO: renamed from: m7.g */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2794g extends AbstractC2513a {

    /* JADX INFO: renamed from: s */
    public static boolean f9045s;

    /* JADX INFO: renamed from: o */
    public final C4278a f9046o;

    /* JADX INFO: renamed from: p */
    public final C2801n f9047p;

    /* JADX INFO: renamed from: q */
    public final C0719b f9048q;

    /* JADX INFO: renamed from: r */
    public C2518f f9049r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2794g() {
        super(new C3331a((short) 3), 3);
        C4278a c4278a = new C4278a(true, false, new C3193a(16));
        this.f9046o = c4278a;
        C2801n c2801n = new C2801n();
        this.f9047p = c2801n;
        C0719b c0719b = new C0719b(null, 2);
        this.f9048q = c0719b;
        m6539P(c4278a);
        m6539P(c2801n);
        m6539P(c0719b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0077  */
    @Override // p166l7.AbstractC2513a, p152k7.AbstractC2333c, p152k7.AbstractC2331a
    /* JADX INFO: renamed from: B */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo1893B(C3445b c3445b) throws IOException {
        c3445b.getClass();
        C3332b c3332bM7054T = C3332b.m7054T(c3445b);
        if (c3332bM7054T == null) {
            C2104o.m5285j(c3445b, "Not bin xml: ");
            return;
        }
        int i9 = c3332bM7054T.f10723o.f12083n;
        if (i9 < 0) {
            C2104o.m5299y(AbstractC0921a.m2249l(i9, "Negative chunk size: "));
            return;
        }
        if (i9 > c3445b.available()) {
            StringBuilder sbM2257t = AbstractC0921a.m2257t(i9, "Higher chunk size: ", ", available = ");
            sbM2257t.append(c3445b.available());
            throw new IOException(sbM2257t.toString());
        }
        if (i9 < c3332bM7054T.f10722n.f12074o) {
            C2104o.m5285j(c3332bM7054T, "Higher header size: ");
            return;
        }
        C3445b c3445bM7226a = c3445b.m7226a(i9);
        C3331a c3331a = this.f8138m;
        c3331a.m5545G(c3445bM7226a);
        c3331a.f10721m.mo633k(3);
        m6187U().mo6185R().m6521N();
        while (c3445bM7226a.m7227b()) {
            boolean zM7227b = false;
            if (c3445bM7226a.m7227b()) {
                int i10 = c3445bM7226a.f11162k;
                C3332b c3332bM7054T2 = C3332b.m7054T(c3445bM7226a);
                if (c3332bM7054T2 != null) {
                    int iM7051Q = c3332bM7054T2.m7051Q();
                    if (iM7051Q == 2) {
                        C4278a c4278a = this.f9046o;
                        if (c4278a.size() == 0) {
                            c4278a.m5545G(c3445bM7226a);
                        } else if (iM7051Q == 11) {
                            C2801n c2801n = this.f9047p;
                            if (c2801n.f9059o.f9926k.size() == 0) {
                                c2801n.m5545G(c3445bM7226a);
                            } else if (iM7051Q == 9) {
                                C2793f c2793fM6187U = m6187U();
                                c2793fM6187U.getClass();
                                C2811x c2811x = new C2811x(new C2810w(), 0);
                                c2793fM6187U.mo6185R().mo6519M(c2811x);
                                c2811x.m5545G(c3445bM7226a);
                                zM7227b = c3445bM7226a.m7227b();
                            } else if (iM7051Q == 4) {
                                C2793f c2793fM6187U2 = m6187U();
                                c2793fM6187U2.getClass();
                                C2793f c2793f = new C2793f();
                                c2793fM6187U2.mo6185R().mo6519M(c2793f);
                                c2793f.m5545G(c3445bM7226a);
                                zM7227b = c3445bM7226a.m7227b();
                            } else if (iM7051Q == 7 || iM7051Q == 5) {
                                C2793f c2793fM6187U3 = m6187U();
                                c2793fM6187U3.getClass();
                                C2797j c2797j = new C2797j(new C2798k());
                                c2793fM6187U3.mo6185R().mo6519M(c2797j);
                                c2797j.m5545G(c3445bM7226a);
                                zM7227b = c3445bM7226a.m7227b();
                            } else {
                                if (!f9045s) {
                                    f9045s = true;
                                    System.err.println("Read unknown chunk: " + c3332bM7054T2);
                                }
                                m6187U().m6195T(iM7051Q).m5545G(c3445bM7226a);
                            }
                        }
                        if (c3445bM7226a.m7227b() && i10 != c3445bM7226a.f11162k) {
                            zM7227b = true;
                        }
                    }
                }
            }
            if (!zM7227b) {
                break;
            }
        }
        c3445b.m7228c(c3331a.f10723o.f12083n);
        c3445bM7226a.close();
        mo5906R();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p152k7.AbstractC2333c
    /* JADX INFO: renamed from: M */
    public final void mo5560M() {
        C2793f c2793fM6187U = m6187U();
        C0561n c0561n = new C0561n(17);
        c2793fM6187U.getClass();
        c2793fM6187U.mo6185R().removeIf(new C0285i(c0561n, 16));
        this.f9048q.mo5562c();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p166l7.AbstractC2513a
    /* JADX INFO: renamed from: R */
    public final void mo5906R() {
        m6187U().mo6189M();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: U */
    public final C2793f m6187U() {
        return (C2793f) m5554v(C2793f.class);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p152k7.AbstractC2333c, p152k7.AbstractC2331a
    /* JADX INFO: renamed from: r */
    public final byte[] mo5552r() {
        C5705b c5705b = new C5705b(this.f8138m.f10723o.f12083n);
        try {
            m5549K(c5705b);
            c5705b.close();
        } catch (IOException unused) {
        }
        return c5705b.toByteArray();
    }

    @Override // p166l7.AbstractC2513a
    /* JADX INFO: renamed from: S */
    public final void mo5907S() {
    }
}
