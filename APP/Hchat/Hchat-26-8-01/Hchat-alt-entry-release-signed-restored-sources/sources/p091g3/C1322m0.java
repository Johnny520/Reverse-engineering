package p091g3;

import android.view.WindowInsets;
import p018b3.C0171a;

/* JADX INFO: renamed from: g3.m0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1322m0 extends C1320l0 {

    /* JADX INFO: renamed from: s */
    public static final C1332r0 f4392s = C1332r0.m3558c(WindowInsets.CONSUMED, null);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1322m0(C1332r0 c1332r0, WindowInsets windowInsets) {
        super(c1332r0, windowInsets);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p091g3.C1320l0, p091g3.C1312h0, p091g3.C1324n0
    /* JADX INFO: renamed from: g */
    public C0171a mo3501g(int i9) {
        return C0171a.m767c(this.f4376c.getInsets(AbstractC1330q0.m3556a(i9)));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p091g3.C1320l0, p091g3.C1312h0, p091g3.C1324n0
    /* JADX INFO: renamed from: h */
    public C0171a mo3502h(int i9) {
        return C0171a.m767c(this.f4376c.getInsetsIgnoringVisibility(AbstractC1330q0.m3556a(i9)));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p091g3.C1320l0, p091g3.C1312h0, p091g3.C1324n0
    /* JADX INFO: renamed from: q */
    public boolean mo3506q(int i9) {
        return this.f4376c.isVisible(AbstractC1330q0.m3556a(i9));
    }

    public C1322m0(C1332r0 c1332r0, C1322m0 c1322m0) {
        super(c1332r0, c1322m0);
    }
}
