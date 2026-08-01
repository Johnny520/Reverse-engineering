package p076P;

import p056K2.C0891q;
import p095T.AbstractC1385s;
import p095T.InterfaceC1373m;
import p112W2.InterfaceC1603e;
import p169h0.InterfaceC2207p;
import p239t0.AbstractC3207b;
import p245u0.C3309f;

/* JADX INFO: renamed from: P.A */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1055A implements InterfaceC1603e {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f3292d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ String f3293e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ InterfaceC2207p f3294f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ long f3295g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f3296h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f3297i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C1055A(Object obj, String str, InterfaceC2207p interfaceC2207p, long j5, int i5, int i6) {
        this.f3292d = i6;
        this.f3297i = obj;
        this.f3293e = str;
        this.f3294f = interfaceC2207p;
        this.f3295g = j5;
        this.f3296h = i5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p112W2.InterfaceC1603e
    /* JADX INFO: renamed from: g */
    public final Object mo0g(Object obj, Object obj2) {
        switch (this.f3292d) {
            case 0:
                ((Integer) obj2).getClass();
                AbstractC1056B.m2125b((C3309f) this.f3297i, this.f3293e, this.f3294f, this.f3295g, (InterfaceC1373m) obj, AbstractC1385s.m2609A(this.f3296h | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                AbstractC1056B.m2124a((AbstractC3207b) this.f3297i, this.f3293e, this.f3294f, this.f3295g, (InterfaceC1373m) obj, AbstractC1385s.m2609A(this.f3296h | 1));
                break;
        }
        return C0891q.f2780a;
    }
}
