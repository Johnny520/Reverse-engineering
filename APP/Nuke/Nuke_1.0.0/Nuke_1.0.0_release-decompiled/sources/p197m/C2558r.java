package p197m;

import p029F0.AbstractC0391b0;
import p029F0.InterfaceC0376N;
import p029F0.InterfaceC0378P;
import p029F0.InterfaceC0379Q;
import p061L2.C0982v;
import p095T.InterfaceC1347Y;
import p153e1.C2016l;
import p203n.C2635S;
import p203n.C2636T;

/* JADX INFO: renamed from: m.r */
/* JADX INFO: loaded from: classes.dex */
public final class C2558r extends AbstractC2534T {

    /* JADX INFO: renamed from: r */
    public C2636T f8168r;

    /* JADX INFO: renamed from: s */
    public InterfaceC1347Y f8169s;

    /* JADX INFO: renamed from: t */
    public C2559s f8170t;

    /* JADX INFO: renamed from: u */
    public long f8171u;

    @Override // p169h0.AbstractC2206o
    /* JADX INFO: renamed from: D0 */
    public final void mo4022D0() {
        this.f8171u = AbstractC2550j.f8152a;
    }

    @Override // p041H0.InterfaceC0627x
    /* JADX INFO: renamed from: d */
    public final InterfaceC0378P mo687d(InterfaceC0379Q interfaceC0379Q, InterfaceC0376N interfaceC0376N, long j5) {
        long j6;
        AbstractC0391b0 abstractC0391b0Mo648e = interfaceC0376N.mo648e(j5);
        if (interfaceC0379Q.mo606z()) {
            j6 = (((long) abstractC0391b0Mo648e.f1206d) << 32) | (((long) abstractC0391b0Mo648e.f1207e) & 4294967295L);
        } else {
            C2636T c2636t = this.f8168r;
            if (c2636t == null) {
                j6 = (((long) abstractC0391b0Mo648e.f1206d) << 32) | (((long) abstractC0391b0Mo648e.f1207e) & 4294967295L);
                this.f8171u = j6;
            } else {
                long j7 = (((long) abstractC0391b0Mo648e.f1207e) & 4294967295L) | (((long) abstractC0391b0Mo648e.f1206d) << 32);
                C2635S c2635sM4584a = c2636t.m4584a(new C2557q(this, j7, 0), new C2557q(this, j7, 1));
                this.f8170t.getClass();
                j6 = ((C2016l) c2635sM4584a.getValue()).f6741a;
                this.f8171u = ((C2016l) c2635sM4584a.getValue()).f6741a;
            }
        }
        return interfaceC0379Q.mo604f0((int) (j6 >> 32), (int) (4294967295L & j6), C0982v.f3048d, new C2556p(this, abstractC0391b0Mo648e, j6));
    }
}
