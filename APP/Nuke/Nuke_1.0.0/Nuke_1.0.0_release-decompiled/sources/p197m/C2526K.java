package p197m;

import p112W2.InterfaceC1601c;
import p117X2.AbstractC1666k;
import p203n.C2626I;
import p203n.InterfaceC2637U;

/* JADX INFO: renamed from: m.K */
/* JADX INFO: loaded from: classes.dex */
public final class C2526K extends AbstractC1666k implements InterfaceC1601c {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f8074e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C2527L f8075f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2526K(C2527L c2527l, int i5) {
        super(1);
        this.f8074e = i5;
        this.f8075f = c2527l;
    }

    @Override // p112W2.InterfaceC1601c
    /* JADX INFO: renamed from: h */
    public final Object mo1h(Object obj) {
        switch (this.f8074e) {
            case 0:
                InterfaceC2637U interfaceC2637U = (InterfaceC2637U) obj;
                EnumC2517B enumC2517B = EnumC2517B.f8039d;
                EnumC2517B enumC2517B2 = EnumC2517B.f8040e;
                C2626I c2626i = null;
                if (!interfaceC2637U.m4585b(enumC2517B, enumC2517B2)) {
                    if (interfaceC2637U.m4585b(enumC2517B2, EnumC2517B.f8041f)) {
                        C2540Z c2540z = this.f8075f.f8084w.f8092a;
                    } else {
                        c2626i = AbstractC2523H.f8066d;
                    }
                }
                return c2626i == null ? AbstractC2523H.f8066d : c2626i;
            default:
                InterfaceC2637U interfaceC2637U2 = (InterfaceC2637U) obj;
                EnumC2517B enumC2517B3 = EnumC2517B.f8039d;
                EnumC2517B enumC2517B4 = EnumC2517B.f8040e;
                boolean zM4585b = interfaceC2637U2.m4585b(enumC2517B3, enumC2517B4);
                C2527L c2527l = this.f8075f;
                if (zM4585b) {
                    C2538X c2538x = c2527l.f8083v.f8089a.f8108b;
                    return c2538x != null ? c2538x.f8105b : AbstractC2523H.f8065c;
                }
                if (!interfaceC2637U2.m4585b(enumC2517B4, EnumC2517B.f8041f)) {
                    return AbstractC2523H.f8065c;
                }
                C2538X c2538x2 = c2527l.f8084w.f8092a.f8108b;
                return c2538x2 != null ? c2538x2.f8105b : AbstractC2523H.f8065c;
        }
    }
}
