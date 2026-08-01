package p045H4;

import me.dartcv.nuke.BuildConfig;
import p056K2.C0891q;
import p076P.AbstractC1096i;
import p095T.AbstractC1385s;
import p095T.C1383r;
import p095T.InterfaceC1373m;
import p108V3.AbstractC1543P;
import p112W2.InterfaceC1603e;
import p136b0.C1843e;
import p260x.AbstractC3429l;

/* JADX INFO: renamed from: H4.c */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0651c implements InterfaceC1603e {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f2067d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C1843e f2068e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0651c(C1843e c1843e, int i5) {
        this.f2067d = 2;
        float f2 = AbstractC1096i.f3517a;
        float f5 = AbstractC1096i.f3517a;
        this.f2068e = c1843e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p112W2.InterfaceC1603e
    /* JADX INFO: renamed from: g */
    public final Object mo0g(Object obj, Object obj2) {
        int i5 = this.f2067d;
        C0891q c0891q = C0891q.f2780a;
        C1843e c1843e = this.f2068e;
        switch (i5) {
            case 0:
                InterfaceC1373m interfaceC1373m = (InterfaceC1373m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                C1383r c1383r = (C1383r) interfaceC1373m;
                if (!c1383r.m2560O(iIntValue & 1, (iIntValue & 3) != 2)) {
                    c1383r.m2563R();
                } else {
                    c1843e.mo0g(c1383r, 0);
                }
                break;
            case BuildConfig.VERSION_CODE /* 1 */:
                InterfaceC1373m interfaceC1373m2 = (InterfaceC1373m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                C1383r c1383r2 = (C1383r) interfaceC1373m2;
                if (!c1383r2.m2560O(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    c1383r2.m2563R();
                } else {
                    c1843e.mo0g(c1383r2, 0);
                }
                break;
            case 2:
                float f2 = AbstractC1096i.f3517a;
                float f5 = AbstractC1096i.f3517a;
                ((Integer) obj2).getClass();
                AbstractC1096i.m2150b(c1843e, (InterfaceC1373m) obj, AbstractC1385s.m2609A(439));
                break;
            case 3:
                ((Integer) obj2).getClass();
                AbstractC1543P.m2794A(c1843e, (InterfaceC1373m) obj, AbstractC1385s.m2609A(7));
                break;
            default:
                ((Integer) obj2).getClass();
                AbstractC3429l.m5690c(c1843e, (InterfaceC1373m) obj, AbstractC1385s.m2609A(7));
                break;
        }
        return c0891q;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public /* synthetic */ C0651c(C1843e c1843e, int i5, byte b2) {
        this.f2067d = i5;
        this.f2068e = c1843e;
    }

    public /* synthetic */ C0651c(C1843e c1843e, int i5, int i6) {
        this.f2067d = i6;
        this.f2068e = c1843e;
    }
}
