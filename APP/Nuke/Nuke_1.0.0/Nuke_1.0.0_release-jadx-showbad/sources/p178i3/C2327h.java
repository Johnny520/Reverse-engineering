package p178i3;

import me.dartcv.nuke.BuildConfig;
import p000A.C0039U;
import p056K2.C0891q;
import p074O2.InterfaceC1046d;
import p074O2.InterfaceC1051i;
import p079P2.EnumC1152a;
import p095T.C1382q0;
import p095T.C1394w0;
import p095T.InterfaceC1347Y;
import p112W2.InterfaceC1603e;
import p117X2.C1671p;
import p127Z2.AbstractC1784a;
import p184j3.AbstractC2384c;
import p190k3.AbstractC2453a;
import p203n.C2642Z;

/* JADX INFO: renamed from: i3.h */
/* JADX INFO: loaded from: classes.dex */
public final class C2327h implements InterfaceC2324e {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f7585d;

    /* JADX INFO: renamed from: e */
    public final Object f7586e;

    /* JADX INFO: renamed from: f */
    public final Object f7587f;

    /* JADX INFO: renamed from: g */
    public final Object f7588g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C2327h(Object obj, Object obj2, Object obj3, int i5) {
        this.f7585d = i5;
        this.f7586e = obj;
        this.f7587f = obj2;
        this.f7588g = obj3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0068  */
    @Override // p178i3.InterfaceC2324e
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo9c(Object obj, InterfaceC1046d interfaceC1046d) {
        C2326g c2326g;
        C2327h c2327h;
        switch (this.f7585d) {
            case 0:
                if (interfaceC1046d instanceof C2326g) {
                    c2326g = (C2326g) interfaceC1046d;
                    int i5 = c2326g.f7584k;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        c2326g.f7584k = i5 - Integer.MIN_VALUE;
                    } else {
                        c2326g = new C2326g(this, interfaceC1046d);
                    }
                }
                Object objMo0g = c2326g.f7582i;
                int i6 = c2326g.f7584k;
                C0891q c0891q = C0891q.f2780a;
                EnumC1152a enumC1152a = EnumC1152a.f3788d;
                if (i6 != 0) {
                    if (i6 != 1) {
                        if (i6 == 2) {
                            obj = c2326g.f7581h;
                            c2327h = c2326g.f7580g;
                            AbstractC1784a.m3205S(objMo0g);
                        } else if (i6 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    }
                    AbstractC1784a.m3205S(objMo0g);
                    return c0891q;
                }
                AbstractC1784a.m3205S(objMo0g);
                if (((C1671p) this.f7586e).f5705d) {
                    InterfaceC2324e interfaceC2324e = (InterfaceC2324e) this.f7587f;
                    c2326g.f7584k = 1;
                    if (interfaceC2324e.mo9c(obj, c2326g) != enumC1152a) {
                        return c0891q;
                    }
                } else {
                    C1394w0 c1394w0 = (C1394w0) this.f7588g;
                    c2326g.f7580g = this;
                    c2326g.f7581h = obj;
                    c2326g.f7584k = 2;
                    objMo0g = c1394w0.mo0g(obj, c2326g);
                    if (objMo0g != enumC1152a) {
                        c2327h = this;
                    }
                }
                return enumC1152a;
                if (((Boolean) objMo0g).booleanValue()) {
                    return c0891q;
                }
                ((C1671p) c2327h.f7586e).f5705d = true;
                InterfaceC2324e interfaceC2324e2 = (InterfaceC2324e) c2327h.f7587f;
                c2326g.f7580g = null;
                c2326g.f7581h = null;
                c2326g.f7584k = 3;
                if (interfaceC2324e2.mo9c(obj, c2326g) != enumC1152a) {
                    return c0891q;
                }
                return enumC1152a;
            case BuildConfig.VERSION_CODE /* 1 */:
                Object objM4236a = AbstractC2384c.m4236a((InterfaceC1051i) this.f7586e, obj, this.f7587f, (C0039U) this.f7588g, interfaceC1046d);
                return objM4236a == EnumC1152a.f3788d ? objM4236a : C0891q.f2780a;
            default:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                C2642Z c2642z = (C2642Z) this.f7587f;
                ((C1382q0) this.f7586e).setValue(Boolean.valueOf(zBooleanValue ? ((Boolean) ((InterfaceC1603e) ((InterfaceC1347Y) this.f7588g).getValue()).mo0g(c2642z.m4593c(), c2642z.f8404d.getValue())).booleanValue() : false));
                return C0891q.f2780a;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C2327h(InterfaceC2324e interfaceC2324e, InterfaceC1051i interfaceC1051i) {
        this.f7585d = 1;
        this.f7586e = interfaceC1051i;
        this.f7587f = AbstractC2453a.m4383k(interfaceC1051i);
        this.f7588g = new C0039U(interfaceC2324e, (InterfaceC1046d) null, 15);
    }
}
