package p081Q;

import com.bumptech.glide.AbstractC1924f;
import p056K2.C0891q;
import p092S0.C1260M;
import p095T.AbstractC1385s;
import p095T.InterfaceC1373m;
import p108V3.AbstractC1543P;
import p112W2.InterfaceC1603e;
import p136b0.C1843e;
import p169h0.InterfaceC2207p;
import p245u0.C3309f;

/* JADX INFO: renamed from: Q.i */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1166i implements InterfaceC1603e {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f3812d = 0;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ long f3813e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ int f3814f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Object f3815g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f3816h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C1166i(long j5, C1260M c1260m, C1843e c1843e, int i5) {
        this.f3813e = j5;
        this.f3815g = c1260m;
        this.f3816h = c1843e;
        this.f3814f = i5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p112W2.InterfaceC1603e
    /* JADX INFO: renamed from: g */
    public final Object mo0g(Object obj, Object obj2) {
        switch (this.f3812d) {
            case 0:
                ((Integer) obj2).getClass();
                AbstractC1924f.m3492a(this.f3813e, (C1260M) this.f3815g, (C1843e) this.f3816h, (InterfaceC1373m) obj, AbstractC1385s.m2609A(this.f3814f | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                int iM2609A = AbstractC1385s.m2609A(1);
                AbstractC1543P.m2838w((C3309f) this.f3815g, (InterfaceC2207p) this.f3816h, this.f3813e, (InterfaceC1373m) obj, iM2609A, this.f3814f);
                break;
        }
        return C0891q.f2780a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public /* synthetic */ C1166i(C3309f c3309f, InterfaceC2207p interfaceC2207p, long j5, int i5, int i6) {
        this.f3815g = c3309f;
        this.f3816h = interfaceC2207p;
        this.f3813e = j5;
        this.f3814f = i6;
    }
}
