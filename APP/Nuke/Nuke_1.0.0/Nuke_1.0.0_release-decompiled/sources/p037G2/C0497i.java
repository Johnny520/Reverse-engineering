package p037G2;

import p056K2.C0891q;
import p095T.AbstractC1385s;
import p095T.C1383r;
import p095T.InterfaceC1373m;
import p112W2.InterfaceC1603e;
import p112W2.InterfaceC1604f;
import p136b0.C1843e;
import p169h0.InterfaceC2207p;

/* JADX INFO: renamed from: G2.i */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0497i implements InterfaceC1603e {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f1545d = 1;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ InterfaceC2207p f1546e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ boolean f1547f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ String f1548g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ InterfaceC1604f f1549h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C1843e f1550i;

    public /* synthetic */ C0497i(InterfaceC2207p interfaceC2207p, boolean z5, String str, InterfaceC1604f interfaceC1604f, C1843e c1843e) {
        this.f1546e = interfaceC2207p;
        this.f1547f = z5;
        this.f1548g = str;
        this.f1549h = interfaceC1604f;
        this.f1550i = c1843e;
    }

    @Override // p112W2.InterfaceC1603e
    /* JADX INFO: renamed from: g */
    public final Object mo0g(Object obj, Object obj2) {
        switch (this.f1545d) {
            case 0:
                ((Integer) obj2).getClass();
                AbstractC0489a.m756f(this.f1546e, this.f1547f, this.f1548g, this.f1549h, this.f1550i, (InterfaceC1373m) obj, AbstractC1385s.m2609A(1));
                break;
            default:
                InterfaceC1373m interfaceC1373m = (InterfaceC1373m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                C1383r c1383r = (C1383r) interfaceC1373m;
                if (c1383r.m2560O(iIntValue & 1, (iIntValue & 3) != 2)) {
                    AbstractC0489a.m756f(this.f1546e, this.f1547f, this.f1548g, this.f1549h, this.f1550i, c1383r, 0);
                } else {
                    c1383r.m2563R();
                }
                break;
        }
        return C0891q.f2780a;
    }

    public /* synthetic */ C0497i(InterfaceC2207p interfaceC2207p, boolean z5, String str, InterfaceC1604f interfaceC1604f, C1843e c1843e, int i5) {
        this.f1546e = interfaceC2207p;
        this.f1547f = z5;
        this.f1548g = str;
        this.f1549h = interfaceC1604f;
        this.f1550i = c1843e;
    }
}
