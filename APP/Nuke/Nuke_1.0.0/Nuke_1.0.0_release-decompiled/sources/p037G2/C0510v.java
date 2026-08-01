package p037G2;

import java.util.LinkedHashMap;
import java.util.List;
import p000A.C0010F;
import p056K2.C0891q;
import p095T.AbstractC1385s;
import p095T.C1371l;
import p095T.C1383r;
import p095T.InterfaceC1347Y;
import p095T.InterfaceC1373m;
import p112W2.InterfaceC1601c;
import p112W2.InterfaceC1603e;
import p112W2.InterfaceC1604f;
import p117X2.AbstractC1665j;
import p136b0.AbstractC1848j;
import p136b0.C1843e;
import p197m.AbstractC2523H;
import p197m.AbstractC2563w;
import p197m.C2528M;
import p197m.C2529N;
import p197m.C2530O;
import p197m.C2535U;
import p197m.C2538X;
import p197m.C2540Z;
import p197m.InterfaceC2564x;
import p203n.AbstractC2649d;
import p203n.C2620C;
import p211o0.AbstractC2767z;

/* JADX INFO: renamed from: G2.v */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0510v implements InterfaceC1603e {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f1619d = 0;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f1620e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ int f1621f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Object f1622g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f1623h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f1624i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Object f1625j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Object f1626k;

    public /* synthetic */ C0510v(int i5, InterfaceC1347Y interfaceC1347Y, InterfaceC1601c interfaceC1601c, InterfaceC1601c interfaceC1601c2, Object obj, List list, C2620C c2620c) {
        this.f1622g = c2620c;
        this.f1623h = interfaceC1347Y;
        this.f1624i = list;
        this.f1620e = obj;
        this.f1625j = interfaceC1601c;
        this.f1626k = interfaceC1601c2;
        this.f1621f = i5;
    }

    @Override // p112W2.InterfaceC1603e
    /* JADX INFO: renamed from: g */
    public final Object mo0g(Object obj, Object obj2) {
        switch (this.f1619d) {
            case 0:
                final C2620C c2620c = (C2620C) this.f1622g;
                final InterfaceC1347Y interfaceC1347Y = (InterfaceC1347Y) this.f1623h;
                final List list = (List) this.f1624i;
                final InterfaceC1601c interfaceC1601c = (InterfaceC1601c) this.f1625j;
                final InterfaceC1601c interfaceC1601c2 = (InterfaceC1601c) this.f1626k;
                InterfaceC1373m interfaceC1373m = (InterfaceC1373m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                C1383r c1383r = (C1383r) interfaceC1373m;
                if (c1383r.m2560O(iIntValue & 1, (iIntValue & 3) != 2)) {
                    C2528M c2528mM4465a = AbstractC2523H.m4465a(AbstractC2649d.m4618k(90, 0, null, 6), 2);
                    C2529N c2529nM4469a = AbstractC2523H.m4466b(AbstractC2649d.m4618k(120, 0, null, 6), 2).m4469a(new C2529N(new C2540Z((C2530O) null, (C2538X) null, (AbstractC2563w) null, new C2535U(0.96f, AbstractC2767z.m4938h(0.82f, ((Boolean) interfaceC1347Y.getValue()).booleanValue() ? 1.0f : 0.0f), AbstractC2649d.m4618k(120, 0, null, 6)), (LinkedHashMap) null, 119)));
                    final int i5 = this.f1621f;
                    final Object obj3 = this.f1620e;
                    AbstractC2563w.m4479b(c2620c, null, c2528mM4465a, c2529nM4469a, null, AbstractC1848j.m3314c(159255744, new InterfaceC1604f() { // from class: G2.s
                        @Override // p112W2.InterfaceC1604f
                        /* JADX INFO: renamed from: f */
                        public final Object mo5f(Object obj4, Object obj5, Object obj6) {
                            ((Integer) obj6).getClass();
                            AbstractC1665j.m2985e((InterfaceC2564x) obj4, "$this$AnimatedVisibility");
                            C1383r c1383r2 = (C1383r) ((InterfaceC1373m) obj5);
                            InterfaceC1601c interfaceC1601c3 = interfaceC1601c;
                            boolean zM2582f = c1383r2.m2582f(interfaceC1601c3);
                            C2620C c2620c2 = c2620c;
                            boolean zM2586h = zM2582f | c1383r2.m2586h(c2620c2);
                            Object objM2558L = c1383r2.m2558L();
                            if (zM2586h || objM2558L == C1371l.f4833a) {
                                objM2558L = new C0010F(1, interfaceC1601c3, c2620c2);
                                c1383r2.m2585g0(objM2558L);
                            }
                            AbstractC0489a.m758h(list, obj3, (InterfaceC1601c) objM2558L, interfaceC1601c2, ((Boolean) interfaceC1347Y.getValue()).booleanValue(), c1383r2, ((i5 >> 6) & 8) << 3);
                            return C0891q.f2780a;
                        }
                    }, c1383r), c1383r, 196992);
                } else {
                    c1383r.m2563R();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                ((C1843e) this.f1622g).m3303i(this.f1620e, (Boolean) this.f1623h, this.f1624i, this.f1625j, this.f1626k, (InterfaceC1373m) obj, AbstractC1385s.m2609A(this.f1621f) | 1);
                break;
        }
        return C0891q.f2780a;
    }

    public /* synthetic */ C0510v(C1843e c1843e, Object obj, Boolean bool, Object obj2, Object obj3, Object obj4, int i5) {
        this.f1622g = c1843e;
        this.f1620e = obj;
        this.f1623h = bool;
        this.f1624i = obj2;
        this.f1625j = obj3;
        this.f1626k = obj4;
        this.f1621f = i5;
    }
}
