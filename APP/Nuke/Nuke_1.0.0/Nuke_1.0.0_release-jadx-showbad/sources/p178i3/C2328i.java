package p178i3;

import p051J.C0810b;
import p056K2.C0891q;
import p074O2.InterfaceC1046d;
import p079P2.EnumC1152a;
import p084Q2.AbstractC1184i;
import p112W2.InterfaceC1604f;
import p127Z2.AbstractC1784a;

/* JADX INFO: renamed from: i3.i */
/* JADX INFO: loaded from: classes.dex */
public final class C2328i extends AbstractC1184i implements InterfaceC1604f {

    /* JADX INFO: renamed from: h */
    public int f7589h;

    /* JADX INFO: renamed from: i */
    public /* synthetic */ InterfaceC2324e f7590i;

    /* JADX INFO: renamed from: j */
    public /* synthetic */ Object f7591j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ C0810b f7592k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2328i(C0810b c0810b, InterfaceC1046d interfaceC1046d) {
        super(3, interfaceC1046d);
        this.f7592k = c0810b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p112W2.InterfaceC1604f
    /* JADX INFO: renamed from: f */
    public final Object mo5f(Object obj, Object obj2, Object obj3) {
        C2328i c2328i = new C2328i(this.f7592k, (InterfaceC1046d) obj3);
        c2328i.f7590i = (InterfaceC2324e) obj;
        c2328i.f7591j = obj2;
        return c2328i.mo8p(C0891q.f2780a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003b, code lost:
    
        if (r0.mo9c(r5, r4) == r3) goto L15;
     */
    @Override // p084Q2.AbstractC1176a
    /* JADX INFO: renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo8p(Object obj) throws Throwable {
        InterfaceC2324e interfaceC2324e;
        int i5 = this.f7589h;
        EnumC1152a enumC1152a = EnumC1152a.f3788d;
        if (i5 == 0) {
            AbstractC1784a.m3205S(obj);
            interfaceC2324e = this.f7590i;
            Object obj2 = this.f7591j;
            this.f7590i = interfaceC2324e;
            this.f7589h = 1;
            obj = this.f7592k.mo0g(obj2, this);
            if (obj != enumC1152a) {
            }
            return enumC1152a;
        }
        if (i5 != 1) {
            if (i5 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC1784a.m3205S(obj);
            return C0891q.f2780a;
        }
        interfaceC2324e = this.f7590i;
        AbstractC1784a.m3205S(obj);
        this.f7590i = null;
        this.f7589h = 2;
    }
}
