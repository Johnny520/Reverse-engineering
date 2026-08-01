package p076P;

import p000A.C0066i0;
import p041H0.AbstractC0601k;
import p056K2.C0891q;
import p071O.AbstractC1027f;
import p071O.C1022a;
import p112W2.InterfaceC1599a;
import p203n.C2650d0;
import p232s.C3162i;

/* JADX INFO: renamed from: P.w */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1110w implements InterfaceC1599a {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f3619d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C1111x f3620e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C1110w(C1111x c1111x, int i5) {
        this.f3619d = i5;
        this.f3620e = c1111x;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p112W2.InterfaceC1599a
    /* JADX INFO: renamed from: a */
    public final Object mo6a() {
        int i5 = this.f3619d;
        C1111x c1111x = this.f3620e;
        switch (i5) {
            case 0:
                if (((C1071Q) AbstractC0601k.m1032h(c1111x, AbstractC1074U.f3342a)) == null) {
                    C1022a c1022a = c1111x.f3625x;
                    if (c1022a != null) {
                        c1111x.m1022K0(c1022a);
                    }
                    c1111x.f3625x = null;
                } else if (c1111x.f3625x == null) {
                    C0066i0 c0066i0 = new C0066i0(13, c1111x);
                    C1110w c1110w = new C1110w(c1111x, 1);
                    C3162i c3162i = c1111x.f3621t;
                    boolean z5 = c1111x.f3622u;
                    float f2 = c1111x.f3623v;
                    C2650d0 c2650d0 = AbstractC1027f.f3194a;
                    C1022a c1022a2 = new C1022a(c3162i, z5, f2, c0066i0, c1110w);
                    c1111x.m1021J0(c1022a2);
                    c1111x.f3625x = c1022a2;
                }
                return C0891q.f2780a;
            default:
                return AbstractC1072S.f3340a;
        }
    }
}
