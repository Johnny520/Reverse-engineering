package p047I0;

import com.bumptech.glide.AbstractC1922d;
import me.dartcv.nuke.BuildConfig;
import p056K2.C0891q;
import p077P0.AbstractC1126m;
import p095T.AbstractC1385s;
import p095T.C1371l;
import p095T.C1383r;
import p095T.InterfaceC1347Y;
import p095T.InterfaceC1373m;
import p112W2.InterfaceC1601c;
import p112W2.InterfaceC1603e;
import p112W2.InterfaceC1604f;
import p117X2.AbstractC1666k;
import p117X2.AbstractC1678w;
import p169h0.AbstractC2192a;
import p169h0.C2202k;
import p169h0.C2204m;
import p169h0.InterfaceC2205n;
import p169h0.InterfaceC2207p;
import p176i1.C2287c;
import p176i1.C2306v;
import p176i1.C2310z;
import p197m.C2529N;
import p197m.EnumC2517B;

/* JADX INFO: renamed from: I0.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0710a extends AbstractC1666k implements InterfaceC1603e {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f2249e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Object f2250f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0710a(int i5, Object obj) {
        super(2);
        this.f2249e = i5;
        this.f2250f = obj;
    }

    @Override // p112W2.InterfaceC1603e
    /* JADX INFO: renamed from: g */
    public final Object mo0g(Object obj, Object obj2) {
        switch (this.f2249e) {
            case 0:
                InterfaceC1373m interfaceC1373m = (InterfaceC1373m) obj;
                int iIntValue = ((Number) obj2).intValue();
                C1383r c1383r = (C1383r) interfaceC1373m;
                if (c1383r.m2560O(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ((AbstractC0713b) this.f2250f).mo1210b(0, c1383r);
                } else {
                    c1383r.m2563R();
                }
                return C0891q.f2780a;
            case BuildConfig.VERSION_CODE /* 1 */:
                ((Number) obj2).intValue();
                ((C0755p0) this.f2250f).mo1210b(AbstractC1385s.m2609A(1), (InterfaceC1373m) obj);
                return C0891q.f2780a;
            case 2:
                InterfaceC2207p interfaceC2207p = (InterfaceC2207p) obj;
                InterfaceC2207p interfaceC2207pM4015b = (InterfaceC2205n) obj2;
                InterfaceC1373m interfaceC1373m2 = (InterfaceC1373m) this.f2250f;
                if (interfaceC2207pM4015b instanceof C2202k) {
                    InterfaceC1604f interfaceC1604f = ((C2202k) interfaceC2207pM4015b).f7183a;
                    AbstractC1678w.m2998b(3, interfaceC1604f);
                    interfaceC2207pM4015b = AbstractC2192a.m4015b(interfaceC1373m2, (InterfaceC2207p) interfaceC1604f.mo5f(C2204m.f7185a, interfaceC1373m2, 0));
                }
                return interfaceC2207p.mo4021c(interfaceC2207pM4015b);
            case 3:
                InterfaceC1373m interfaceC1373m3 = (InterfaceC1373m) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                C1383r c1383r2 = (C1383r) interfaceC1373m3;
                if (c1383r2.m2560O(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    Object objM2558L = c1383r2.m2558L();
                    if (objM2558L == C1371l.f4833a) {
                        objM2558L = C2287c.f7449f;
                        c1383r2.m2585g0(objM2558L);
                    }
                    AbstractC1922d.m3427f(AbstractC1126m.m2162a(C2204m.f7185a, false, (InterfaceC1601c) objM2558L), (InterfaceC1603e) ((InterfaceC1347Y) this.f2250f).getValue(), c1383r2, 0);
                } else {
                    c1383r2.m2563R();
                }
                return C0891q.f2780a;
            case 4:
                ((Number) obj2).intValue();
                ((C2306v) this.f2250f).mo1210b(AbstractC1385s.m2609A(1), (InterfaceC1373m) obj);
                return C0891q.f2780a;
            case 5:
                ((Number) obj2).intValue();
                ((C2310z) this.f2250f).mo1210b(AbstractC1385s.m2609A(1), (InterfaceC1373m) obj);
                return C0891q.f2780a;
            default:
                EnumC2517B enumC2517B = (EnumC2517B) obj;
                EnumC2517B enumC2517B2 = (EnumC2517B) obj2;
                EnumC2517B enumC2517B3 = EnumC2517B.f8041f;
                return Boolean.valueOf(enumC2517B == enumC2517B3 && enumC2517B2 == enumC2517B3 && !((C2529N) this.f2250f).f8092a.f8110d);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0710a(AbstractC0713b abstractC0713b, int i5, int i6) {
        super(2);
        this.f2249e = i6;
        this.f2250f = abstractC0713b;
    }
}
