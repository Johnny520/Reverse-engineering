package p000A;

import p056K2.C0891q;
import p074O2.InterfaceC1046d;
import p084Q2.AbstractC1184i;
import p095T.InterfaceC1347Y;
import p112W2.InterfaceC1603e;
import p127Z2.AbstractC1784a;
import p160f3.InterfaceC2160t;
import p227r.C2940A0;
import p227r.C3025y0;
import p232s.C3164k;

/* JADX INFO: renamed from: A.H0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0015H0 extends AbstractC1184i implements InterfaceC1603e {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f74h = 1;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ long f75i;

    /* JADX INFO: renamed from: j */
    public /* synthetic */ Object f76j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0015H0(long j5, InterfaceC1046d interfaceC1046d) {
        super(2, interfaceC1046d);
        this.f75i = j5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p112W2.InterfaceC1603e
    /* JADX INFO: renamed from: g */
    public final Object mo0g(Object obj, Object obj2) {
        switch (this.f74h) {
            case 0:
                C0015H0 c0015h0 = (C0015H0) mo7n((InterfaceC1046d) obj2, (InterfaceC2160t) obj);
                C0891q c0891q = C0891q.f2780a;
                c0015h0.mo8p(c0891q);
                return c0891q;
            default:
                C0015H0 c0015h02 = (C0015H0) mo7n((InterfaceC1046d) obj2, (C3025y0) obj);
                C0891q c0891q2 = C0891q.f2780a;
                c0015h02.mo8p(c0891q2);
                return c0891q2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p084Q2.AbstractC1176a
    /* JADX INFO: renamed from: n */
    public final InterfaceC1046d mo7n(InterfaceC1046d interfaceC1046d, Object obj) {
        switch (this.f74h) {
            case 0:
                return new C0015H0((InterfaceC1347Y) this.f76j, this.f75i, interfaceC1046d);
            default:
                C0015H0 c0015h0 = new C0015H0(this.f75i, interfaceC1046d);
                c0015h0.f76j = obj;
                return c0015h0;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p084Q2.AbstractC1176a
    /* JADX INFO: renamed from: p */
    public final Object mo8p(Object obj) {
        switch (this.f74h) {
            case 0:
                InterfaceC1347Y interfaceC1347Y = (InterfaceC1347Y) this.f76j;
                AbstractC1784a.m3205S(obj);
                if (((C3164k) interfaceC1347Y.getValue()) != null) {
                    interfaceC1347Y.setValue(null);
                }
                interfaceC1347Y.setValue(new C3164k(this.f75i));
                break;
            default:
                AbstractC1784a.m3205S(obj);
                C2940A0 c2940a0 = ((C3025y0) this.f76j).f9592a;
                c2940a0.m5143c(c2940a0.f9280k, this.f75i, 1);
                break;
        }
        return C0891q.f2780a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0015H0(InterfaceC1347Y interfaceC1347Y, long j5, InterfaceC1046d interfaceC1046d) {
        super(2, interfaceC1046d);
        this.f76j = interfaceC1347Y;
        this.f75i = j5;
    }
}
