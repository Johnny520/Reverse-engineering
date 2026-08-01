package p037G2;

import p056K2.C0891q;
import p095T.C1383r;
import p095T.InterfaceC1373m;
import p108V3.AbstractC1543P;
import p112W2.InterfaceC1604f;
import p117X2.AbstractC1665j;
import p244u.AbstractC3261c;
import p244u.C3290w;
import p255w.C3372c;

/* JADX INFO: renamed from: G2.j */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0498j implements InterfaceC1604f {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f1551d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ String f1552e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0498j(String str, int i5) {
        this.f1551d = i5;
        this.f1552e = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p112W2.InterfaceC1604f
    /* JADX INFO: renamed from: f */
    public final Object mo5f(Object obj, Object obj2, Object obj3) {
        switch (this.f1551d) {
            case 0:
                InterfaceC1373m interfaceC1373m = (InterfaceC1373m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                AbstractC1665j.m2985e((C3290w) obj, "$this$NukeDialog");
                C1383r c1383r = (C1383r) interfaceC1373m;
                if (c1383r.m2560O(iIntValue & 1, (iIntValue & 17) != 16)) {
                    AbstractC0489a.m755e(this.f1552e, null, c1383r, 0);
                } else {
                    c1383r.m2563R();
                }
                break;
            default:
                InterfaceC1373m interfaceC1373m2 = (InterfaceC1373m) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                AbstractC1665j.m2985e((C3372c) obj, "$this$item");
                C1383r c1383r2 = (C1383r) interfaceC1373m2;
                if (c1383r2.m2560O(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    AbstractC1543P.m2816a(this.f1552e, AbstractC3261c.m5531r(AbstractC3261c.f10087c, 0.0f, 16, 0.0f, 8, 5), c1383r2, 48);
                } else {
                    c1383r2.m2563R();
                }
                break;
        }
        return C0891q.f2780a;
    }
}
