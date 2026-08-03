package p045d5;

import ac.C0058k;
import java.io.IOException;
import java.util.ArrayList;
import p005a5.C0016a;
import p020b5.C0184c;
import p020b5.C0187f;
import p020b5.C0189h;
import p020b5.C0190i;
import p021b6.C0198f;
import p061e5.C0826a;
import p164l5.C2481b0;
import p164l5.C2487e0;

/* JADX INFO: renamed from: d5.n */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0703n extends C0694e {

    /* JADX INFO: renamed from: j */
    public final ArrayList f2120j;

    /* JADX INFO: renamed from: k */
    public final boolean f2121k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0703n(C0190i c0190i, int i9, C2487e0 c2487e0) {
        super(c0190i, i9, c2487e0);
        int iM360k = ((C0058k) c0190i.f484j).m360k(i9);
        this.f2120j = new ArrayList();
        if (iM360k >= 0) {
            for (C2481b0 c2481b0 : c2487e0.mo5883s()) {
                this.f2120j.add(new C0700k(c2481b0.m5880a(), ((C0189h) c0190i.f482h).m833b(new C0187f((C0016a) ((C0184c) c0190i.f476b).f469a, c2481b0.m5881b() + iM360k, "sswitch_"))));
            }
            return;
        }
        this.f2121k = true;
        for (C2481b0 c2481b02 : c2487e0.mo5883s()) {
            this.f2120j.add(new C0701l(c2481b02.m5880a(), c2481b02.m5881b()));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p045d5.C0694e, p020b5.AbstractC0191j
    /* JADX INFO: renamed from: c */
    public final boolean mo776c(C0826a c0826a) throws IOException {
        if (this.f2121k) {
            c0826a = ((C0184c) this.f2109h.f476b).m820q(c0826a);
        }
        c0826a.write(".sparse-switch\n");
        c0826a.m2081w();
        for (AbstractC0702m abstractC0702m : this.f2120j) {
            c0826a.mo2076g(new C0198f(abstractC0702m.f2119a));
            c0826a.write(" -> ");
            abstractC0702m.mo1873a(c0826a);
            m1864f(c0826a, abstractC0702m.f2119a);
            c0826a.write(10);
        }
        c0826a.m2080u();
        c0826a.write(".end sparse-switch");
        return true;
    }
}
