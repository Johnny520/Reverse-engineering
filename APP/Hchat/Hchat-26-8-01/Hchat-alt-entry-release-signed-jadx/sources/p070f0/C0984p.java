package p070f0;

import p100h0.C1511d1;
import p117i0.AbstractC1874r;
import p117i0.C1845j1;
import p201o.AbstractC3026b;
import p321w.C4629q0;
import p339x1.AbstractC5614i1;
import p339x1.InterfaceC5609h;
import p339x1.InterfaceC5627n;
import p356y0.AbstractC5852n;

/* JADX INFO: renamed from: f0.p */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0984p extends AbstractC5852n implements InterfaceC5609h, InterfaceC5627n {

    /* JADX INFO: renamed from: u */
    public C0971c f3100u;

    /* JADX INFO: renamed from: v */
    public C4629q0 f3101v;

    /* JADX INFO: renamed from: w */
    public C1511d1 f3102w;

    /* JADX INFO: renamed from: x */
    public final C1845j1 f3103x = AbstractC1874r.m4639u(null);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0984p(C0971c c0971c, C4629q0 c4629q0, C1511d1 c1511d1) {
        this.f3100u = c0971c;
        this.f3101v = c4629q0;
        this.f3102w = c1511d1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p356y0.AbstractC5852n
    /* JADX INFO: renamed from: c1 */
    public final void mo1323c1() {
        C0971c c0971c = this.f3100u;
        if (c0971c.f3059a != null) {
            AbstractC3026b.m6430c("Expected textInputModifierNode to be null");
        }
        c0971c.f3059a = this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p356y0.AbstractC5852n
    /* JADX INFO: renamed from: d1 */
    public final void mo743d1() {
        this.f3100u.m2404k(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.InterfaceC5627n
    /* JADX INFO: renamed from: w */
    public final void mo1318w(AbstractC5614i1 abstractC5614i1) {
        this.f3103x.setValue(abstractC5614i1);
    }
}
