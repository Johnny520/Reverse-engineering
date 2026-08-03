package p091g3;

import android.view.View;
import android.view.WindowInsets;
import p018b3.C0171a;

/* JADX INFO: renamed from: g3.l0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class C1320l0 extends C1318k0 {

    /* JADX INFO: renamed from: r */
    public static final C1332r0 f4391r = C1332r0.m3558c(WindowInsets.CONSUMED, null);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1320l0(C1332r0 c1332r0, WindowInsets windowInsets) {
        super(c1332r0, windowInsets);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p091g3.C1312h0, p091g3.C1324n0
    /* JADX INFO: renamed from: g */
    public C0171a mo3501g(int i9) {
        return C0171a.m767c(this.f4376c.getInsets(AbstractC1328p0.m3553a(i9)));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p091g3.C1312h0, p091g3.C1324n0
    /* JADX INFO: renamed from: h */
    public C0171a mo3502h(int i9) {
        return C0171a.m767c(this.f4376c.getInsetsIgnoringVisibility(AbstractC1328p0.m3553a(i9)));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p091g3.C1312h0, p091g3.C1324n0
    /* JADX INFO: renamed from: q */
    public boolean mo3506q(int i9) {
        return this.f4376c.isVisible(AbstractC1328p0.m3553a(i9));
    }

    public C1320l0(C1332r0 c1332r0, C1320l0 c1320l0) {
        super(c1332r0, c1320l0);
    }

    @Override // p091g3.C1312h0, p091g3.C1324n0
    /* JADX INFO: renamed from: d */
    public final void mo3499d(View view) {
    }
}
