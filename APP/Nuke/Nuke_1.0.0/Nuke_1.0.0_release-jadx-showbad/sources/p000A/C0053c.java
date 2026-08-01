package p000A;

import p037G2.AbstractC0489a;
import p037G2.EnumC0504p;
import p056K2.C0891q;
import p058L.InterfaceC0940l;
import p095T.AbstractC1385s;
import p095T.InterfaceC1373m;
import p112W2.InterfaceC1603e;
import p169h0.InterfaceC2207p;

/* JADX INFO: renamed from: A.c */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0053c implements InterfaceC1603e {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f215d = 0;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ InterfaceC2207p f216e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ long f217f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Object f218g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0053c(InterfaceC0940l interfaceC0940l, InterfaceC2207p interfaceC2207p, long j5, int i5) {
        this.f218g = interfaceC0940l;
        this.f216e = interfaceC2207p;
        this.f217f = j5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p112W2.InterfaceC1603e
    /* JADX INFO: renamed from: g */
    public final Object mo0g(Object obj, Object obj2) {
        switch (this.f215d) {
            case 0:
                ((Integer) obj2).getClass();
                int iM2609A = AbstractC1385s.m2609A(1);
                AbstractC0063h.m61a((InterfaceC0940l) this.f218g, this.f216e, this.f217f, (InterfaceC1373m) obj, iM2609A);
                break;
            default:
                ((Integer) obj2).getClass();
                int iM2609A2 = AbstractC1385s.m2609A(1);
                AbstractC0489a.m760j(this.f216e, this.f217f, (EnumC0504p) this.f218g, (InterfaceC1373m) obj, iM2609A2);
                break;
        }
        return C0891q.f2780a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public /* synthetic */ C0053c(InterfaceC2207p interfaceC2207p, long j5, EnumC0504p enumC0504p, int i5) {
        this.f216e = interfaceC2207p;
        this.f217f = j5;
        this.f218g = enumC0504p;
    }
}
