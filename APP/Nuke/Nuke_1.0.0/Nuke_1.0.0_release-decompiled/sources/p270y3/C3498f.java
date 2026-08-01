package p270y3;

import java.util.List;
import p004A3.C0157b;
import p049I2.AbstractC0797o;
import p056K2.C0891q;
import p076P.AbstractC1072S;
import p095T.C1383r;
import p095T.InterfaceC1373m;
import p112W2.InterfaceC1605g;
import p169h0.C2204m;
import p179i4.AbstractC2352g;
import p244u.AbstractC3261c;
import p255w.C3372c;
import p264x3.C3453e;
import p276z3.AbstractC3518a;

/* JADX INFO: renamed from: y3.f */
/* JADX INFO: loaded from: classes.dex */
public final class C3498f implements InterfaceC1605g {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f10902d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ List f10903e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ List f10904f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C0157b f10905g;

    public /* synthetic */ C3498f(List list, List list2, C0157b c0157b, int i5) {
        this.f10902d = i5;
        this.f10903e = list;
        this.f10904f = list2;
        this.f10905g = c0157b;
    }

    @Override // p112W2.InterfaceC1605g
    /* JADX INFO: renamed from: l */
    public final Object mo1949l(Object obj, Object obj2, Object obj3, Object obj4) {
        int i5;
        int i6;
        switch (this.f10902d) {
            case 0:
                C3372c c3372c = (C3372c) obj;
                int iIntValue = ((Number) obj2).intValue();
                InterfaceC1373m interfaceC1373m = (InterfaceC1373m) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                if ((iIntValue2 & 6) == 0) {
                    i5 = (((C1383r) interfaceC1373m).m2582f(c3372c) ? 4 : 2) | iIntValue2;
                } else {
                    i5 = iIntValue2;
                }
                if ((iIntValue2 & 48) == 0) {
                    i5 |= ((C1383r) interfaceC1373m).m2578d(iIntValue) ? 32 : 16;
                }
                C1383r c1383r = (C1383r) interfaceC1373m;
                if (c1383r.m2560O(i5 & 1, (i5 & 147) != 146)) {
                    C3493a c3493a = (C3493a) this.f10903e.get(iIntValue);
                    c1383r.m2568W(-417651962);
                    AbstractC0797o.m1382f(c3493a, null, c1383r, 0);
                    if (iIntValue < AbstractC2352g.m4208u(this.f10904f)) {
                        c1383r.m2568W(-417563148);
                        AbstractC1072S.m2133c(AbstractC3261c.m5530q(C2204m.f7185a, 18, 0.0f, 2), 1, this.f10905g.f576m, c1383r, 54, 0);
                        c1383r.m2597p(false);
                    } else {
                        c1383r.m2568W(-417346365);
                        c1383r.m2597p(false);
                    }
                    c1383r.m2597p(false);
                } else {
                    c1383r.m2563R();
                }
                break;
            default:
                C3372c c3372c2 = (C3372c) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                InterfaceC1373m interfaceC1373m2 = (InterfaceC1373m) obj3;
                int iIntValue4 = ((Number) obj4).intValue();
                if ((iIntValue4 & 6) == 0) {
                    i6 = (((C1383r) interfaceC1373m2).m2582f(c3372c2) ? 4 : 2) | iIntValue4;
                } else {
                    i6 = iIntValue4;
                }
                if ((iIntValue4 & 48) == 0) {
                    i6 |= ((C1383r) interfaceC1373m2).m2578d(iIntValue3) ? 32 : 16;
                }
                C1383r c1383r2 = (C1383r) interfaceC1373m2;
                if (c1383r2.m2560O(i6 & 1, (i6 & 147) != 146)) {
                    C3453e c3453e = (C3453e) this.f10903e.get(iIntValue3);
                    c1383r2.m2568W(432549498);
                    AbstractC3518a.m5771d(c3453e, null, c1383r2, 0);
                    if (iIntValue3 < AbstractC2352g.m4208u(this.f10904f)) {
                        c1383r2.m2568W(432670738);
                        AbstractC1072S.m2133c(AbstractC3261c.m5530q(C2204m.f7185a, 18, 0.0f, 2), 1, this.f10905g.f576m, c1383r2, 54, 0);
                        c1383r2.m2597p(false);
                    } else {
                        c1383r2.m2568W(432926209);
                        c1383r2.m2597p(false);
                    }
                    c1383r2.m2597p(false);
                } else {
                    c1383r2.m2563R();
                }
                break;
        }
        return C0891q.f2780a;
    }
}
