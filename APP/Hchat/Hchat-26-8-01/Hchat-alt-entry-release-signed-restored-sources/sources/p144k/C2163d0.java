package p144k;

import ci.C0575c;
import p071f1.C1034w;
import p101h1.C1565b;
import p101h1.InterfaceC1567d;
import p187n.C2857k;
import p249qg.AbstractC3603v;
import p339x1.C5610h0;
import p339x1.InterfaceC5624m;
import p356y0.AbstractC5852n;

/* JADX INFO: renamed from: k.d0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2163d0 extends AbstractC5852n implements InterfaceC5624m {

    /* JADX INFO: renamed from: u */
    public final C2857k f7169u;

    /* JADX INFO: renamed from: v */
    public boolean f7170v;

    /* JADX INFO: renamed from: w */
    public boolean f7171w;

    /* JADX INFO: renamed from: x */
    public boolean f7172x;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2163d0(C2857k c2857k) {
        this.f7169u = c2857k;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.InterfaceC5624m
    /* JADX INFO: renamed from: B */
    public final void mo1326B(C5610h0 c5610h0) {
        c5610h0.m10064e();
        C1565b c1565b = c5610h0.f22833g;
        if (this.f7170v) {
            InterfaceC1567d.m4087Z(c5610h0, C1034w.m2634b(C1034w.f3258b, 0.3f), c1565b.mo4091a(), 0.0f, 0, 122);
        } else if (this.f7171w || this.f7172x) {
            InterfaceC1567d.m4087Z(c5610h0, C1034w.m2634b(C1034w.f3258b, 0.1f), c1565b.mo4091a(), 0.0f, 0, 122);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p356y0.AbstractC5852n
    /* JADX INFO: renamed from: c1 */
    public final void mo1323c1() {
        AbstractC3603v.m7563q(m10550Y0(), null, new C0575c(this, null, 4), 3);
    }
}
