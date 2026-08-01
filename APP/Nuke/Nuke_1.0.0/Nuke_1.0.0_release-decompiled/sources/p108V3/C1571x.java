package p108V3;

import me.dartcv.nuke.BuildConfig;
import p056K2.C0891q;
import p076P.AbstractC1072S;
import p095T.AbstractC1385s;
import p095T.C1383r;
import p095T.InterfaceC1373m;
import p112W2.InterfaceC1599a;
import p112W2.InterfaceC1603e;
import p276z3.AbstractC3518a;

/* JADX INFO: renamed from: V3.x */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1571x implements InterfaceC1603e {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f5463d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ InterfaceC1599a f5464e;

    public /* synthetic */ C1571x(int i5, int i6, InterfaceC1599a interfaceC1599a) {
        this.f5463d = i6;
        this.f5464e = interfaceC1599a;
    }

    @Override // p112W2.InterfaceC1603e
    /* JADX INFO: renamed from: g */
    public final Object mo0g(Object obj, Object obj2) {
        InterfaceC1373m interfaceC1373m = (InterfaceC1373m) obj;
        Integer num = (Integer) obj2;
        switch (this.f5463d) {
            case 0:
                num.getClass();
                AbstractC1543P.m2817b(this.f5464e, interfaceC1373m, AbstractC1385s.m2609A(1));
                break;
            case BuildConfig.VERSION_CODE /* 1 */:
                num.getClass();
                AbstractC3518a.m5769b(this.f5464e, interfaceC1373m, AbstractC1385s.m2609A(1));
                break;
            case 2:
                int iIntValue = num.intValue();
                C1383r c1383r = (C1383r) interfaceC1373m;
                if (c1383r.m2560O(iIntValue & 1, (iIntValue & 3) != 2)) {
                    AbstractC1072S.m2134d(this.f5464e, null, false, null, null, null, AbstractC3518a.f10970a, c1383r, 805306368);
                } else {
                    c1383r.m2563R();
                }
                return C0891q.f2780a;
            default:
                num.getClass();
                AbstractC3518a.m5772e(this.f5464e, interfaceC1373m, AbstractC1385s.m2609A(1));
                break;
        }
        return C0891q.f2780a;
    }

    public /* synthetic */ C1571x(InterfaceC1599a interfaceC1599a) {
        this.f5463d = 2;
        this.f5464e = interfaceC1599a;
    }
}
