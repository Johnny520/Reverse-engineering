package ci;

import p101h1.InterfaceC1567d;
import p116i.AbstractC1742d;
import p116i.C1739c;
import p187n.C2857k;
import p249qg.AbstractC3603v;
import p249qg.C3560e1;
import p339x1.C5610h0;
import p339x1.InterfaceC5624m;
import p356y0.AbstractC5852n;

/* JADX INFO: renamed from: ci.k */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0591k extends AbstractC5852n implements InterfaceC5624m {

    /* JADX INFO: renamed from: A */
    public final C1739c f1843A;

    /* JADX INFO: renamed from: B */
    public C3560e1 f1844B;

    /* JADX INFO: renamed from: C */
    public C3560e1 f1845C;

    /* JADX INFO: renamed from: u */
    public final C2857k f1846u;

    /* JADX INFO: renamed from: v */
    public final long f1847v;

    /* JADX INFO: renamed from: w */
    public boolean f1848w;

    /* JADX INFO: renamed from: x */
    public boolean f1849x;

    /* JADX INFO: renamed from: y */
    public boolean f1850y;

    /* JADX INFO: renamed from: z */
    public boolean f1851z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0591k(C2857k c2857k, long j3) {
        c2857k.getClass();
        this.f1846u = c2857k;
        this.f1847v = j3;
        this.f1843A = AbstractC1742d.m4365a(0.0f, 0.01f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.InterfaceC5624m
    /* JADX INFO: renamed from: B */
    public final void mo1326B(C5610h0 c5610h0) {
        c5610h0.m10064e();
        float fFloatValue = ((Number) this.f1843A.m4360d()).floatValue();
        if (fFloatValue > 0.0f) {
            InterfaceC1567d.m4087Z(c5610h0, this.f1847v, c5610h0.f22833g.mo4091a(), fFloatValue, 0, 114);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p356y0.AbstractC5852n
    /* JADX INFO: renamed from: c1 */
    public final void mo1323c1() {
        AbstractC3603v.m7563q(m10550Y0(), null, new C0575c(this, null, 1), 3);
    }
}
