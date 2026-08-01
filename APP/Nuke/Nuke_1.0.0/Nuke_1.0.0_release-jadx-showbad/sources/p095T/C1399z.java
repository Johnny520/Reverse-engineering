package p095T;

import me.dartcv.nuke.BuildConfig;
import p056K2.C0891q;
import p108V3.AbstractC1543P;
import p108V3.EnumC1545S;
import p112W2.InterfaceC1601c;
import p112W2.InterfaceC1603e;
import p136b0.C1843e;
import p169h0.InterfaceC2207p;
import p203n.C2642Z;
import p216p.AbstractC2856m;

/* JADX INFO: renamed from: T.z */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1399z implements InterfaceC1603e {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f4989d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f4990e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Object f4991f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Object f4992g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C1399z(int i5, int i6, Object obj, Object obj2) {
        this.f4989d = i6;
        this.f4991f = obj;
        this.f4992g = obj2;
        this.f4990e = i5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p112W2.InterfaceC1603e
    /* JADX INFO: renamed from: g */
    public final Object mo0g(Object obj, Object obj2) {
        switch (this.f4989d) {
            case 0:
                ((Integer) obj2).getClass();
                AbstractC1385s.m2611a((C1386s0) this.f4991f, (C1843e) this.f4992g, (InterfaceC1373m) obj, AbstractC1385s.m2609A(this.f4990e | 1));
                break;
            case BuildConfig.VERSION_CODE /* 1 */:
                ((Integer) obj2).intValue();
                AbstractC1385s.m2612b((C1386s0[]) this.f4991f, (InterfaceC1603e) this.f4992g, (InterfaceC1373m) obj, AbstractC1385s.m2609A(this.f4990e | 1));
                break;
            case 2:
                ((Integer) obj2).intValue();
                AbstractC1543P.m2824i((String) this.f4991f, (EnumC1545S) this.f4992g, (InterfaceC1373m) obj, AbstractC1385s.m2609A(this.f4990e | 1));
                break;
            case 3:
                ((Integer) obj2).intValue();
                int iM2609A = AbstractC1385s.m2609A(this.f4990e) | 1;
                ((C1843e) this.f4992g).m3302e(this.f4991f, (InterfaceC1373m) obj, iM2609A);
                break;
            case 4:
                ((Integer) obj2).getClass();
                int iM2609A2 = AbstractC1385s.m2609A(this.f4990e | 1);
                ((C2642Z) this.f4991f).m4591a(this.f4992g, (InterfaceC1373m) obj, iM2609A2);
                break;
            default:
                ((Integer) obj2).getClass();
                AbstractC2856m.m5047a((InterfaceC2207p) this.f4991f, (InterfaceC1601c) this.f4992g, (InterfaceC1373m) obj, AbstractC1385s.m2609A(this.f4990e | 1));
                break;
        }
        return C0891q.f2780a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public /* synthetic */ C1399z(int i5, C1843e c1843e, Object obj) {
        this.f4989d = 3;
        this.f4992g = c1843e;
        this.f4991f = obj;
        this.f4990e = i5;
    }
}
