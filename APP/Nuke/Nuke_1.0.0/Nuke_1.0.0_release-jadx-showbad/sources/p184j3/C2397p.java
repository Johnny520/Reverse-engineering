package p184j3;

import p000A.C0002B;
import p056K2.AbstractC0885k;
import p056K2.C0891q;
import p074O2.C1052j;
import p074O2.InterfaceC1046d;
import p074O2.InterfaceC1051i;
import p079P2.EnumC1152a;
import p084Q2.AbstractC1178c;
import p084Q2.InterfaceC1179d;
import p092S0.C1287y;
import p112W2.InterfaceC1604f;
import p117X2.AbstractC1665j;
import p149d3.AbstractC1977e;
import p160f3.AbstractC2162v;
import p178i3.InterfaceC2324e;

/* JADX INFO: renamed from: j3.p */
/* JADX INFO: loaded from: classes.dex */
public final class C2397p extends AbstractC1178c implements InterfaceC2324e {

    /* JADX INFO: renamed from: g */
    public final InterfaceC2324e f7755g;

    /* JADX INFO: renamed from: h */
    public final InterfaceC1051i f7756h;

    /* JADX INFO: renamed from: i */
    public final int f7757i;

    /* JADX INFO: renamed from: j */
    public InterfaceC1051i f7758j;

    /* JADX INFO: renamed from: k */
    public InterfaceC1046d f7759k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2397p(InterfaceC2324e interfaceC2324e, InterfaceC1051i interfaceC1051i) {
        super(C2395n.f7753d, C1052j.f3286d);
        this.f7755g = interfaceC2324e;
        this.f7756h = interfaceC1051i;
        this.f7757i = ((Number) interfaceC1051i.mo1165A(new C1287y((byte) 0, 19), 0)).intValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p178i3.InterfaceC2324e
    /* JADX INFO: renamed from: c */
    public final Object mo9c(Object obj, InterfaceC1046d interfaceC1046d) {
        try {
            Object objM4241r = m4241r(interfaceC1046d, obj);
            return objM4241r == EnumC1152a.f3788d ? objM4241r : C0891q.f2780a;
        } catch (Throwable th) {
            this.f7758j = new C2393l(interfaceC1046d.mo275e(), th);
            throw th;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p084Q2.AbstractC1176a, p084Q2.InterfaceC1179d
    /* JADX INFO: renamed from: d */
    public final InterfaceC1179d mo2123d() {
        InterfaceC1046d interfaceC1046d = this.f7759k;
        if (interfaceC1046d instanceof InterfaceC1179d) {
            return (InterfaceC1179d) interfaceC1046d;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p084Q2.AbstractC1178c, p074O2.InterfaceC1046d
    /* JADX INFO: renamed from: e */
    public final InterfaceC1051i mo275e() {
        InterfaceC1051i interfaceC1051i = this.f7758j;
        return interfaceC1051i == null ? C1052j.f3286d : interfaceC1051i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p084Q2.AbstractC1176a
    /* JADX INFO: renamed from: o */
    public final StackTraceElement mo2227o() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p084Q2.AbstractC1176a
    /* JADX INFO: renamed from: p */
    public final Object mo8p(Object obj) {
        Throwable thM1902a = AbstractC0885k.m1902a(obj);
        if (thM1902a != null) {
            this.f7758j = new C2393l(mo275e(), thM1902a);
        }
        InterfaceC1046d interfaceC1046d = this.f7759k;
        if (interfaceC1046d != null) {
            interfaceC1046d.mo278i(obj);
        }
        return EnumC1152a.f3788d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r */
    public final Object m4241r(InterfaceC1046d interfaceC1046d, Object obj) {
        InterfaceC1051i interfaceC1051iMo275e = interfaceC1046d.mo275e();
        AbstractC2162v.m3984f(interfaceC1051iMo275e);
        InterfaceC1051i interfaceC1051i = this.f7758j;
        if (interfaceC1051i != interfaceC1051iMo275e) {
            if (interfaceC1051i instanceof C2393l) {
                throw new IllegalStateException(AbstractC1977e.m3648K("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((C2393l) interfaceC1051i).f7752e + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
            }
            if (((Number) interfaceC1051iMo275e.mo1165A(new C0002B(17, this), 0)).intValue() != this.f7757i) {
                throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + this.f7756h + ",\n\t\tbut emission happened in " + interfaceC1051iMo275e + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
            }
            this.f7758j = interfaceC1051iMo275e;
        }
        this.f7759k = interfaceC1046d;
        InterfaceC1604f interfaceC1604f = AbstractC2399r.f7761a;
        InterfaceC2324e interfaceC2324e = this.f7755g;
        AbstractC1665j.m2983c(interfaceC2324e, "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>");
        Object objMo5f = interfaceC1604f.mo5f(interfaceC2324e, obj, this);
        if (!AbstractC1665j.m2981a(objMo5f, EnumC1152a.f3788d)) {
            this.f7759k = null;
        }
        return objMo5f;
    }
}
