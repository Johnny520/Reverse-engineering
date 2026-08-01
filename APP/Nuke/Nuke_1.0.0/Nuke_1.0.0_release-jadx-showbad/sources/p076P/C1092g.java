package p076P;

import p056K2.C0891q;
import p095T.C1383r;
import p095T.InterfaceC1373m;
import p112W2.InterfaceC1603e;
import p136b0.AbstractC1848j;
import p136b0.C1843e;

/* JADX INFO: renamed from: P.g */
/* JADX INFO: loaded from: classes.dex */
public final class C1092g implements InterfaceC1603e {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f3475d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C1843e f3476e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C1092g(C1843e c1843e, int i5) {
        this.f3475d = i5;
        this.f3476e = c1843e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p112W2.InterfaceC1603e
    /* JADX INFO: renamed from: g */
    public final Object mo0g(Object obj, Object obj2) {
        int i5 = this.f3475d;
        C0891q c0891q = C0891q.f2780a;
        C1843e c1843e = this.f3476e;
        int i6 = 0;
        switch (i5) {
            case 0:
                InterfaceC1373m interfaceC1373m = (InterfaceC1373m) obj;
                int iIntValue = ((Number) obj2).intValue();
                C1383r c1383r = (C1383r) interfaceC1373m;
                if (!c1383r.m2560O(iIntValue & 1, (iIntValue & 3) != 2)) {
                    c1383r.m2563R();
                } else {
                    c1383r.m2568W(-1102039173);
                    c1383r.m2597p(false);
                    c1843e.mo0g(c1383r, 0);
                }
                break;
            default:
                InterfaceC1373m interfaceC1373m2 = (InterfaceC1373m) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                C1383r c1383r2 = (C1383r) interfaceC1373m2;
                if (!c1383r2.m2560O(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    c1383r2.m2563R();
                } else {
                    float f2 = AbstractC1096i.f3517a;
                    AbstractC1096i.m2150b(AbstractC1848j.m3314c(-459506658, new C1092g(c1843e, i6), c1383r2), c1383r2, 438);
                }
                break;
        }
        return c0891q;
    }
}
