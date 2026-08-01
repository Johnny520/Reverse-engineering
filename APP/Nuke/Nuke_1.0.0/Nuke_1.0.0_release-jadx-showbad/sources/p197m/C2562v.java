package p197m;

import p029F0.AbstractC0391b0;
import p029F0.C0397e0;
import p029F0.InterfaceC0376N;
import p029F0.InterfaceC0379Q;
import p061L2.C0982v;
import p112W2.InterfaceC1601c;
import p112W2.InterfaceC1604f;
import p117X2.AbstractC1666k;
import p153e1.C2005a;
import p203n.C2642Z;

/* JADX INFO: renamed from: m.v */
/* JADX INFO: loaded from: classes.dex */
public final class C2562v extends AbstractC1666k implements InterfaceC1604f {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ InterfaceC1601c f8185e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C2642Z f8186f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2562v(InterfaceC1601c interfaceC1601c, C2642Z c2642z) {
        super(3);
        this.f8185e = interfaceC1601c;
        this.f8186f = c2642z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0032  */
    @Override // p112W2.InterfaceC1604f
    /* JADX INFO: renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo5f(Object obj, Object obj2, Object obj3) {
        long j5;
        InterfaceC0379Q interfaceC0379Q = (InterfaceC0379Q) obj;
        AbstractC0391b0 abstractC0391b0Mo648e = ((InterfaceC0376N) obj2).mo648e(((C2005a) obj3).f6726a);
        if (interfaceC0379Q.mo606z()) {
            if (((Boolean) this.f8185e.mo1h(this.f8186f.f8404d.getValue())).booleanValue()) {
                j5 = (((long) abstractC0391b0Mo648e.f1206d) << 32) | (((long) abstractC0391b0Mo648e.f1207e) & 4294967295L);
            } else {
                j5 = 0;
            }
        }
        return interfaceC0379Q.mo604f0((int) (j5 >> 32), (int) (4294967295L & j5), C0982v.f3048d, new C0397e0(abstractC0391b0Mo648e, 4));
    }
}
