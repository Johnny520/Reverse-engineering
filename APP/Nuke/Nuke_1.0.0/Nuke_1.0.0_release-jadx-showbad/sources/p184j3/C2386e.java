package p184j3;

import p056K2.C0891q;
import p074O2.InterfaceC1046d;
import p079P2.EnumC1152a;
import p084Q2.AbstractC1184i;
import p112W2.InterfaceC1603e;
import p127Z2.AbstractC1784a;
import p172h3.InterfaceC2256p;
import p178i3.InterfaceC2324e;

/* JADX INFO: renamed from: j3.e */
/* JADX INFO: loaded from: classes.dex */
public final class C2386e extends AbstractC1184i implements InterfaceC1603e {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f7731h;

    /* JADX INFO: renamed from: i */
    public int f7732i;

    /* JADX INFO: renamed from: j */
    public /* synthetic */ Object f7733j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ AbstractC2387f f7734k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2386e(AbstractC2387f abstractC2387f, InterfaceC1046d interfaceC1046d, int i5) {
        super(2, interfaceC1046d);
        this.f7731h = i5;
        this.f7734k = abstractC2387f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p112W2.InterfaceC1603e
    /* JADX INFO: renamed from: g */
    public final Object mo0g(Object obj, Object obj2) {
        switch (this.f7731h) {
            case 0:
                return ((C2386e) mo7n((InterfaceC1046d) obj2, (InterfaceC2256p) obj)).mo8p(C0891q.f2780a);
            default:
                return ((C2386e) mo7n((InterfaceC1046d) obj2, (InterfaceC2324e) obj)).mo8p(C0891q.f2780a);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p084Q2.AbstractC1176a
    /* JADX INFO: renamed from: n */
    public final InterfaceC1046d mo7n(InterfaceC1046d interfaceC1046d, Object obj) {
        switch (this.f7731h) {
            case 0:
                C2386e c2386e = new C2386e(this.f7734k, interfaceC1046d, 0);
                c2386e.f7733j = obj;
                return c2386e;
            default:
                C2386e c2386e2 = new C2386e(this.f7734k, interfaceC1046d, 1);
                c2386e2.f7733j = obj;
                return c2386e2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p084Q2.AbstractC1176a
    /* JADX INFO: renamed from: p */
    public final Object mo8p(Object obj) {
        switch (this.f7731h) {
            case 0:
                int i5 = this.f7732i;
                C0891q c0891q = C0891q.f2780a;
                if (i5 != 0) {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC1784a.m3205S(obj);
                    return c0891q;
                }
                AbstractC1784a.m3205S(obj);
                InterfaceC2256p interfaceC2256p = (InterfaceC2256p) this.f7733j;
                this.f7732i = 1;
                Object objMo4239c = this.f7734k.mo4239c(new C2400s(interfaceC2256p), this);
                EnumC1152a enumC1152a = EnumC1152a.f3788d;
                if (objMo4239c != enumC1152a) {
                    objMo4239c = c0891q;
                }
                return objMo4239c == enumC1152a ? enumC1152a : c0891q;
            default:
                int i6 = this.f7732i;
                if (i6 == 0) {
                    AbstractC1784a.m3205S(obj);
                    InterfaceC2324e interfaceC2324e = (InterfaceC2324e) this.f7733j;
                    this.f7732i = 1;
                    Object objMo4239c2 = this.f7734k.mo4239c(interfaceC2324e, this);
                    EnumC1152a enumC1152a2 = EnumC1152a.f3788d;
                    if (objMo4239c2 == enumC1152a2) {
                        return enumC1152a2;
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC1784a.m3205S(obj);
                }
                return C0891q.f2780a;
        }
    }
}
