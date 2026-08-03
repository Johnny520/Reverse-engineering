package p091g3;

import android.view.WindowInsets;
import p018b3.C0171a;

/* JADX INFO: renamed from: g3.i0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class C1314i0 extends C1312h0 {

    /* JADX INFO: renamed from: n */
    public C0171a f4383n;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1314i0(C1332r0 c1332r0, C1314i0 c1314i0) {
        super(c1332r0, c1314i0);
        this.f4383n = null;
        this.f4383n = c1314i0.f4383n;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p091g3.C1324n0
    /* JADX INFO: renamed from: b */
    public C1332r0 mo3512b() {
        return C1332r0.m3558c(this.f4376c.consumeStableInsets(), null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p091g3.C1324n0
    /* JADX INFO: renamed from: c */
    public C1332r0 mo3513c() {
        return C1332r0.m3558c(this.f4376c.consumeSystemWindowInsets(), null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p091g3.C1324n0
    /* JADX INFO: renamed from: j */
    public final C0171a mo3514j() {
        if (this.f4383n == null) {
            WindowInsets windowInsets = this.f4376c;
            this.f4383n = C0171a.m766b(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.f4383n;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p091g3.C1324n0
    /* JADX INFO: renamed from: o */
    public boolean mo3515o() {
        return this.f4376c.isConsumed();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p091g3.C1324n0
    /* JADX INFO: renamed from: u */
    public void mo3516u(C0171a c0171a) {
        this.f4383n = c0171a;
    }

    public C1314i0(C1332r0 c1332r0, WindowInsets windowInsets) {
        super(c1332r0, windowInsets);
        this.f4383n = null;
    }
}
