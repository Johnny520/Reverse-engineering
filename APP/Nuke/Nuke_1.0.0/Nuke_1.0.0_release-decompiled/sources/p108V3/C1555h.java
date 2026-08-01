package p108V3;

import me.dartcv.nuke.BuildConfig;
import p056K2.C0891q;
import p095T.AbstractC1385s;
import p095T.InterfaceC1373m;
import p112W2.InterfaceC1603e;
import p169h0.InterfaceC2207p;
import p244u.AbstractC3282o;

/* JADX INFO: renamed from: V3.h */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1555h implements InterfaceC1603e {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f5409d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ InterfaceC2207p f5410e;

    public /* synthetic */ C1555h(InterfaceC2207p interfaceC2207p, int i5, int i6) {
        this.f5409d = i6;
        this.f5410e = interfaceC2207p;
    }

    @Override // p112W2.InterfaceC1603e
    /* JADX INFO: renamed from: g */
    public final Object mo0g(Object obj, Object obj2) {
        int i5 = this.f5409d;
        InterfaceC1373m interfaceC1373m = (InterfaceC1373m) obj;
        ((Integer) obj2).getClass();
        switch (i5) {
            case 0:
                AbstractC1543P.m2795B(this.f5410e, interfaceC1373m, AbstractC1385s.m2609A(7));
                break;
            case BuildConfig.VERSION_CODE /* 1 */:
                AbstractC1543P.m2832q(this.f5410e, interfaceC1373m, AbstractC1385s.m2609A(1));
                break;
            default:
                AbstractC3282o.m5558a(this.f5410e, interfaceC1373m, AbstractC1385s.m2609A(1));
                break;
        }
        return C0891q.f2780a;
    }
}
