package p091g3;

import android.view.WindowInsets;
import p018b3.C0171a;
import p071f1.AbstractC0991a;

/* JADX INFO: renamed from: g3.d0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class C1304d0 extends AbstractC1310g0 {

    /* JADX INFO: renamed from: c */
    public final WindowInsets.Builder f4363c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1304d0(C1332r0 c1332r0) {
        super(c1332r0);
        WindowInsets windowInsetsM3559b = c1332r0.m3559b();
        this.f4363c = windowInsetsM3559b != null ? AbstractC0991a.m2459f(windowInsetsM3559b) : AbstractC0991a.m2458e();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p091g3.AbstractC1310g0
    /* JADX INFO: renamed from: b */
    public C1332r0 mo3453b() {
        m3462a();
        C1332r0 c1332r0M3558c = C1332r0.m3558c(this.f4363c.build(), null);
        c1332r0M3558c.f4398a.mo3507r(this.f4370b);
        return c1332r0M3558c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p091g3.AbstractC1310g0
    /* JADX INFO: renamed from: d */
    public void mo3457d(C0171a c0171a) {
        this.f4363c.setMandatorySystemGestureInsets(c0171a.m768d());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p091g3.AbstractC1310g0
    /* JADX INFO: renamed from: e */
    public void mo3454e(C0171a c0171a) {
        this.f4363c.setStableInsets(c0171a.m768d());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p091g3.AbstractC1310g0
    /* JADX INFO: renamed from: f */
    public void mo3458f(C0171a c0171a) {
        this.f4363c.setSystemGestureInsets(c0171a.m768d());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p091g3.AbstractC1310g0
    /* JADX INFO: renamed from: g */
    public void mo3455g(C0171a c0171a) {
        this.f4363c.setSystemWindowInsets(c0171a.m768d());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p091g3.AbstractC1310g0
    /* JADX INFO: renamed from: h */
    public void mo3459h(C0171a c0171a) {
        this.f4363c.setTappableElementInsets(c0171a.m768d());
    }

    public C1304d0() {
        this.f4363c = AbstractC0991a.m2458e();
    }
}
