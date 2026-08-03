package p056e0;

import p027c0.C0362g;
import p041d1.EnumC0680z;
import p041d1.InterfaceC0661g;
import p041d1.InterfaceC0678x;
import p085fg.InterfaceC1220a;
import p267s1.AbstractC3898h0;
import p267s1.C3903k;
import p267s1.C3906l0;
import p267s1.EnumC3905l;
import p293u2.InterfaceC4233c;
import p339x1.AbstractC5592c2;
import p339x1.AbstractC5615j;
import p339x1.AbstractC5618k;
import p339x1.C5595d1;
import p339x1.C5621l;
import p339x1.InterfaceC5656w1;

/* JADX INFO: renamed from: e0.d */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0804d extends AbstractC5615j implements InterfaceC5656w1, InterfaceC0661g, InterfaceC0678x {

    /* JADX INFO: renamed from: w */
    public InterfaceC1220a f2406w;

    /* JADX INFO: renamed from: x */
    public boolean f2407x;

    /* JADX INFO: renamed from: y */
    public final C3906l0 f2408y;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0804d(InterfaceC1220a interfaceC1220a) {
        this.f2406w = interfaceC1220a;
        C0362g c0362g = new C0362g(this, 2);
        C3903k c3903k = AbstractC3898h0.f12782a;
        C3906l0 c3906l0 = new C3906l0(null, null, null, c0362g);
        m10122k1(c3906l0);
        this.f2408y = c3906l0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p041d1.InterfaceC0661g
    /* JADX INFO: renamed from: E */
    public final void mo1835E(EnumC0680z enumC0680z) {
        this.f2407x = enumC0680z.m1860a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.InterfaceC5656w1
    /* JADX INFO: renamed from: H */
    public final long mo2034H() {
        C5621l c5621l = AbstractC0802b.f2399a;
        InterfaceC4233c interfaceC4233c = AbstractC5618k.m10167w(this).f22771E;
        c5621l.getClass();
        int i9 = AbstractC5592c2.f22729b;
        return C5595d1.m9992h(interfaceC4233c.mo1590G0(c5621l.f22902a), interfaceC4233c.mo1590G0(c5621l.f22903b), interfaceC4233c.mo1590G0(c5621l.f22904c), interfaceC4233c.mo1590G0(c5621l.f22905d));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.InterfaceC5656w1
    /* JADX INFO: renamed from: P */
    public final void mo1608P(C3903k c3903k, EnumC3905l enumC3905l, long j3) {
        this.f2408y.mo1608P(c3903k, enumC3905l, j3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.InterfaceC5656w1
    /* JADX INFO: renamed from: b0 */
    public final void mo1611b0() {
        this.f2408y.mo1611b0();
    }
}
