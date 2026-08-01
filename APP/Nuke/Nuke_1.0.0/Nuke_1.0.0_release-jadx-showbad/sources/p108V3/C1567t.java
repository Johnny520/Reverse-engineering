package p108V3;

import me.dartcv.nuke.BuildConfig;
import p056K2.C0891q;
import p095T.AbstractC1385s;
import p095T.C1383r;
import p095T.InterfaceC1373m;
import p112W2.InterfaceC1603e;

/* JADX INFO: renamed from: V3.t */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1567t implements InterfaceC1603e {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f5454d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ String f5455e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C1567t(int i5, int i6, String str) {
        this.f5454d = i6;
        this.f5455e = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p112W2.InterfaceC1603e
    /* JADX INFO: renamed from: g */
    public final Object mo0g(Object obj, Object obj2) {
        InterfaceC1373m interfaceC1373m = (InterfaceC1373m) obj;
        Integer num = (Integer) obj2;
        switch (this.f5454d) {
            case 0:
                int iIntValue = num.intValue();
                C1383r c1383r = (C1383r) interfaceC1373m;
                if (c1383r.m2560O(iIntValue & 1, (iIntValue & 3) != 2)) {
                    AbstractC1543P.m2839x(this.f5455e, c1383r, 0);
                } else {
                    c1383r.m2563R();
                }
                return C0891q.f2780a;
            case BuildConfig.VERSION_CODE /* 1 */:
                num.getClass();
                AbstractC1543P.m2797D(this.f5455e, interfaceC1373m, AbstractC1385s.m2609A(1));
                break;
            case 2:
                num.getClass();
                AbstractC1543P.m2839x(this.f5455e, interfaceC1373m, AbstractC1385s.m2609A(1));
                break;
            case 3:
                int iIntValue2 = num.intValue();
                C1383r c1383r2 = (C1383r) interfaceC1373m;
                if (c1383r2.m2560O(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    AbstractC1543P.m2802I(AbstractC1543P.m2814U(this.f5455e), null, false, 22, null, c1383r2, 3072, 22);
                } else {
                    c1383r2.m2563R();
                }
                return C0891q.f2780a;
            default:
                num.getClass();
                AbstractC1543P.m2801H(this.f5455e, interfaceC1373m, AbstractC1385s.m2609A(1));
                break;
        }
        return C0891q.f2780a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public /* synthetic */ C1567t(String str, int i5) {
        this.f5454d = i5;
        this.f5455e = str;
    }
}
