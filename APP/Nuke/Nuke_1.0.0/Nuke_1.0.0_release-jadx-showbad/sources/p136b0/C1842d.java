package p136b0;

import p056K2.C0891q;
import p095T.InterfaceC1373m;
import p112W2.InterfaceC1603e;
import p117X2.AbstractC1656a;
import p153e1.C2021q;
import p160f3.AbstractC2162v;
import p227r.C3011r0;
import p227r.C3015t0;

/* JADX INFO: renamed from: b0.d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1842d extends AbstractC1656a implements InterfaceC1603e {

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ int f6240k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1842d(int i5, Object obj, Class cls, String str, String str2, int i6, int i7) {
        super(i5, i6, cls, obj, str, str2);
        this.f6240k = i7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p112W2.InterfaceC1603e
    /* JADX INFO: renamed from: g */
    public final Object mo0g(Object obj, Object obj2) {
        switch (this.f6240k) {
            case 0:
                int iIntValue = ((Number) obj2).intValue();
                ((C1843e) this.f5684d).m3300c(iIntValue, (InterfaceC1373m) obj);
                break;
            default:
                long j5 = ((C2021q) obj).f6750a;
                C3015t0 c3015t0 = (C3015t0) this.f5684d;
                AbstractC2162v.m3994p(c3015t0.f9549N.m139c(), null, new C3011r0(c3015t0, j5, null, 1), 3);
                break;
        }
        return C0891q.f2780a;
    }
}
