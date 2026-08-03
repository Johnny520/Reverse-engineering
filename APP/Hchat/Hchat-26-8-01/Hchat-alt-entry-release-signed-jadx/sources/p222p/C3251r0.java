package p222p;

import p293u2.InterfaceC4233c;
import p339x1.InterfaceC5650u1;
import p356y0.AbstractC5852n;

/* JADX INFO: renamed from: p.r0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3251r0 extends AbstractC5852n implements InterfaceC5650u1 {

    /* JADX INFO: renamed from: u */
    public float f10355u;

    /* JADX INFO: renamed from: v */
    public boolean f10356v;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.InterfaceC5650u1
    /* JADX INFO: renamed from: R */
    public final Object mo6926R(InterfaceC4233c interfaceC4233c, Object obj) {
        C3207c1 c3207c1 = obj instanceof C3207c1 ? (C3207c1) obj : null;
        if (c3207c1 == null) {
            c3207c1 = new C3207c1();
        }
        c3207c1.f10243a = this.f10355u;
        c3207c1.f10244b = this.f10356v;
        return c3207c1;
    }
}
