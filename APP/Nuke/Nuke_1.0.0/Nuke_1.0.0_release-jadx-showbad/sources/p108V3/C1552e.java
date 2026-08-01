package p108V3;

import me.dartcv.nuke.BuildConfig;
import p056K2.C0891q;
import p095T.AbstractC1385s;
import p095T.C1383r;
import p095T.InterfaceC1373m;
import p112W2.InterfaceC1603e;

/* JADX INFO: renamed from: V3.e */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1552e implements InterfaceC1603e {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f5403d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ EnumC1545S f5404e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C1552e(EnumC1545S enumC1545S) {
        this.f5403d = 2;
        this.f5404e = enumC1545S;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p112W2.InterfaceC1603e
    /* JADX INFO: renamed from: g */
    public final Object mo0g(Object obj, Object obj2) {
        InterfaceC1373m interfaceC1373m = (InterfaceC1373m) obj;
        Integer num = (Integer) obj2;
        switch (this.f5403d) {
            case 0:
                num.getClass();
                AbstractC1543P.m2829n(this.f5404e, interfaceC1373m, AbstractC1385s.m2609A(1));
                break;
            case BuildConfig.VERSION_CODE /* 1 */:
                num.getClass();
                AbstractC1543P.m2828m(this.f5404e, interfaceC1373m, AbstractC1385s.m2609A(1));
                break;
            default:
                int iIntValue = num.intValue();
                C1383r c1383r = (C1383r) interfaceC1373m;
                if (c1383r.m2560O(iIntValue & 1, (iIntValue & 3) != 2)) {
                    AbstractC1543P.m2828m(this.f5404e, c1383r, 0);
                } else {
                    c1383r.m2563R();
                }
                return C0891q.f2780a;
        }
        return C0891q.f2780a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public /* synthetic */ C1552e(EnumC1545S enumC1545S, int i5, int i6) {
        this.f5403d = i6;
        this.f5404e = enumC1545S;
    }
}
