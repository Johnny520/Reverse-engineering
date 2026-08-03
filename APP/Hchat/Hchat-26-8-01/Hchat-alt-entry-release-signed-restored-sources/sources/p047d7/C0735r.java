package p047d7;

import p241q7.C3445b;
import p257r7.C3713c;

/* JADX INFO: renamed from: d7.r */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class C0735r extends AbstractC0734q {

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ int f2188n = 1;

    /* JADX INFO: renamed from: o */
    public final C3713c f2189o;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0735r() {
        super(C0732o.f2180o);
        C3713c c3713c = new C3713c(0, 0);
        this.f2189o = c3713c;
        m6539P(c3713c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p152k7.AbstractC2333c, p152k7.AbstractC2331a
    /* JADX INFO: renamed from: B */
    public final void mo1893B(C3445b c3445b) {
        switch (this.f2188n) {
            case 0:
                this.f2189o.m7720Q(((int) ((C0733p) m5553u(C0733p.class)).m1916Q()) - 4);
                super.mo1893B(c3445b);
                break;
            default:
                this.f2189o.m7720Q(((int) ((C0733p) m5553u(C0733p.class)).m1916Q()) - 4);
                super.mo1893B(c3445b);
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p047d7.AbstractC0734q
    public String toString() {
        switch (this.f2188n) {
            case 1:
                return "padding = " + this.f2189o.f12076k.length;
            default:
                return super.toString();
        }
    }

    public C0735r(C0732o c0732o) {
        super(c0732o);
        C3713c c3713c = new C3713c(0, 0);
        this.f2189o = c3713c;
        m6539P(c3713c);
    }
}
