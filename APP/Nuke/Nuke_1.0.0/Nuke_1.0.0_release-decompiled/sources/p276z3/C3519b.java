package p276z3;

import p000A.C0033Q0;
import p056K2.C0891q;
import p076P.AbstractC1072S;
import p095T.AbstractC1385s;
import p095T.C1383r;
import p095T.InterfaceC1373m;
import p112W2.InterfaceC1599a;
import p112W2.InterfaceC1603e;
import p136b0.AbstractC1848j;
import p264x3.C3452d;

/* JADX INFO: renamed from: z3.b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3519b implements InterfaceC1603e {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f10971d = 0;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C3452d f10972e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ InterfaceC1599a f10973f;

    public /* synthetic */ C3519b(InterfaceC1599a interfaceC1599a, C3452d c3452d) {
        this.f10973f = interfaceC1599a;
        this.f10972e = c3452d;
    }

    @Override // p112W2.InterfaceC1603e
    /* JADX INFO: renamed from: g */
    public final Object mo0g(Object obj, Object obj2) {
        InterfaceC1373m interfaceC1373m = (InterfaceC1373m) obj;
        Integer num = (Integer) obj2;
        switch (this.f10971d) {
            case 0:
                int iIntValue = num.intValue();
                C1383r c1383r = (C1383r) interfaceC1373m;
                if (c1383r.m2560O(iIntValue & 1, (iIntValue & 3) != 2)) {
                    AbstractC1072S.m2134d(this.f10973f, null, false, null, null, null, AbstractC1848j.m3314c(-637471759, new C0033Q0(10, this.f10972e), c1383r), c1383r, 805306368);
                } else {
                    c1383r.m2563R();
                }
                break;
            default:
                num.getClass();
                AbstractC3518a.m5773f(this.f10972e, this.f10973f, interfaceC1373m, AbstractC1385s.m2609A(7));
                break;
        }
        return C0891q.f2780a;
    }

    public /* synthetic */ C3519b(C3452d c3452d, InterfaceC1599a interfaceC1599a, int i5) {
        this.f10972e = c3452d;
        this.f10973f = interfaceC1599a;
    }
}
