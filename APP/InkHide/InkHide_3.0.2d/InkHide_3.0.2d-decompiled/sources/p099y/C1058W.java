package p099y;

import android.view.WindowInsets;
import p028O.AbstractC0232a;
import p085r.C0811c;

/* JADX INFO: renamed from: y.W */
/* JADX INFO: loaded from: classes.dex */
public class C1058W extends AbstractC1060Y {

    /* JADX INFO: renamed from: a */
    public final WindowInsets.Builder f3680a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1058W() {
        this.f3680a = AbstractC0232a.m431b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p099y.AbstractC1060Y
    /* JADX INFO: renamed from: b */
    public C1075g0 mo2309b() {
        m2312a();
        C1075g0 c1075g0M2342c = C1075g0.m2342c(this.f3680a.build(), null);
        c1075g0M2342c.f3705a.mo2319k(null);
        return c1075g0M2342c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p099y.AbstractC1060Y
    /* JADX INFO: renamed from: c */
    public void mo2310c(C0811c c0811c) {
        this.f3680a.setStableInsets(c0811c.m1480b());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p099y.AbstractC1060Y
    /* JADX INFO: renamed from: d */
    public void mo2311d(C0811c c0811c) {
        this.f3680a.setSystemWindowInsets(c0811c.m1480b());
    }

    public C1058W(C1075g0 c1075g0) {
        WindowInsets.Builder builderM431b;
        super(c1075g0);
        WindowInsets windowInsetsM2343b = c1075g0.m2343b();
        if (windowInsetsM2343b != null) {
            builderM431b = AbstractC0232a.m432c(windowInsetsM2343b);
        } else {
            builderM431b = AbstractC0232a.m431b();
        }
        this.f3680a = builderM431b;
    }
}
