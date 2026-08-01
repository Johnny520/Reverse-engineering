package p000A;

import p049I2.C0793k;
import p056K2.C0891q;
import p095T.AbstractC1385s;
import p095T.C1383r;
import p095T.InterfaceC1373m;
import p112W2.InterfaceC1603e;
import p136b0.C1843e;
import p169h0.InterfaceC2207p;
import p255w.C3377h;
import p260x.C3426i;

/* JADX INFO: renamed from: A.d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0055d implements InterfaceC1603e {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f222d = 0;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f223e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Object f224f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0055d(InterfaceC2207p interfaceC2207p, int i5, int i6) {
        this.f224f = interfaceC2207p;
        this.f223e = i6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p112W2.InterfaceC1603e
    /* JADX INFO: renamed from: g */
    public final Object mo0g(Object obj, Object obj2) {
        switch (this.f222d) {
            case 0:
                ((Integer) obj2).getClass();
                AbstractC0063h.m62b((InterfaceC2207p) this.f224f, (InterfaceC1373m) obj, AbstractC1385s.m2609A(1), this.f223e);
                break;
            default:
                C3377h c3377h = (C3377h) this.f224f;
                InterfaceC1373m interfaceC1373m = (InterfaceC1373m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                C1383r c1383r = (C1383r) interfaceC1373m;
                if (c1383r.m2560O(iIntValue & 1, (iIntValue & 3) != 2)) {
                    C0793k c0793k = c3377h.f10496b.f10490a;
                    int i5 = this.f223e;
                    C3426i c3426iM1341e = c0793k.m1341e(i5);
                    ((C1843e) c3426iM1341e.f10708c.f309g).mo1949l(c3377h.f10497c, Integer.valueOf(i5 - c3426iM1341e.f10706a), c1383r, 0);
                } else {
                    c1383r.m2563R();
                }
                break;
        }
        return C0891q.f2780a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public /* synthetic */ C0055d(C3377h c3377h, int i5) {
        this.f224f = c3377h;
        this.f223e = i5;
    }
}
