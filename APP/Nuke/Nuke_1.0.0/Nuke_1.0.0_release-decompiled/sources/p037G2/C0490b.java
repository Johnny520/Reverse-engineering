package p037G2;

import com.bumptech.glide.AbstractC1926h;
import p000A.AbstractC0070k0;
import p045H4.AbstractC0653e;
import p045H4.C0650b;
import p056K2.C0891q;
import p092S0.C1260M;
import p095T.C1383r;
import p095T.InterfaceC1373m;
import p110W0.C1587l;
import p112W2.InterfaceC1603e;
import p211o0.C2762u;

/* JADX INFO: renamed from: G2.b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0490b implements InterfaceC1603e {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f1513d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ String f1514e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ boolean f1515f;

    public /* synthetic */ C0490b(int i5, String str, boolean z5) {
        this.f1513d = i5;
        this.f1514e = str;
        this.f1515f = z5;
    }

    @Override // p112W2.InterfaceC1603e
    /* JADX INFO: renamed from: g */
    public final Object mo0g(Object obj, Object obj2) {
        long jM4920b;
        switch (this.f1513d) {
            case 0:
                InterfaceC1373m interfaceC1373m = (InterfaceC1373m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                C1383r c1383r = (C1383r) interfaceC1373m;
                if (c1383r.m2560O(iIntValue & 1, (iIntValue & 3) != 2)) {
                    AbstractC0070k0.m74a(this.f1514e, null, new C1260M(C2762u.m4920b(this.f1515f ? 1.0f : 0.45f, ((C0650b) c1383r.m2590j(AbstractC0653e.f2072a)).f2066g), AbstractC1926h.m3579v(14), C1587l.f5505i, 0L, 0, 0L, null, null, 16777208), 0, false, 0, 0, c1383r, 0, 1018);
                } else {
                    c1383r.m2563R();
                }
                break;
            default:
                InterfaceC1373m interfaceC1373m2 = (InterfaceC1373m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                C1383r c1383r2 = (C1383r) interfaceC1373m2;
                if (c1383r2.m2560O(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    if (this.f1515f) {
                        c1383r2.m2568W(1571240306);
                        jM4920b = ((C0650b) c1383r2.m2590j(AbstractC0653e.f2072a)).f2065f;
                        c1383r2.m2597p(false);
                    } else {
                        c1383r2.m2568W(1571316318);
                        jM4920b = C2762u.m4920b(0.45f, ((C0650b) c1383r2.m2590j(AbstractC0653e.f2072a)).f2065f);
                        c1383r2.m2597p(false);
                    }
                    AbstractC0070k0.m74a(this.f1514e, null, new C1260M(jM4920b, AbstractC1926h.m3579v(14), C1587l.f5504h, 0L, 0, 0L, null, null, 16777208), 0, false, 0, 0, c1383r2, 0, 1018);
                } else {
                    c1383r2.m2563R();
                }
                break;
        }
        return C0891q.f2780a;
    }
}
