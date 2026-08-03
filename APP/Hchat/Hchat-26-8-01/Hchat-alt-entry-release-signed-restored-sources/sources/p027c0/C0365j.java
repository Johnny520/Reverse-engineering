package p027c0;

import p100h0.C1553u0;
import p117i0.C1823e;
import p117i0.C1845j1;
import p267s1.AbstractC3898h0;
import p267s1.C3903k;
import p267s1.C3906l0;
import p339x1.AbstractC5614i1;
import p339x1.AbstractC5615j;
import p339x1.InterfaceC5609h;
import p339x1.InterfaceC5627n;

/* JADX INFO: renamed from: c0.j */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0365j extends AbstractC5615j implements InterfaceC5609h, InterfaceC5627n {

    /* JADX INFO: renamed from: w */
    public C1553u0 f1023w;

    /* JADX INFO: renamed from: x */
    public final C1845j1 f1024x = new C1845j1(null, C1823e.f6049j);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0365j(C1553u0 c1553u0) {
        this.f1023w = c1553u0;
        C0362g c0362g = new C0362g(this, 0);
        C3903k c3903k = AbstractC3898h0.f12782a;
        m10122k1(new C3906l0(null, null, null, c0362g));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.InterfaceC5627n
    /* JADX INFO: renamed from: w */
    public final void mo1318w(AbstractC5614i1 abstractC5614i1) {
        this.f1024x.setValue(abstractC5614i1);
    }
}
