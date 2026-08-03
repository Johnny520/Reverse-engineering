package p000;

import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: xC */
/* JADX INFO: loaded from: classes.dex */
public final class C2707xC implements InterfaceC1049Yb, InterfaceC1092Zb {

    /* JADX INFO: renamed from: a */
    public static final C2707xC f9282a = new C2707xC();

    @Override // p000.InterfaceC1049Yb
    public final InterfaceC1092Zb getKey() {
        return this;
    }

    @Override // p000.InterfaceC1137ac
    /* JADX INFO: renamed from: l */
    public final InterfaceC1137ac mo23l(InterfaceC1137ac interfaceC1137ac) {
        return AbstractC1406fG.m2700Z(this, interfaceC1137ac);
    }

    @Override // p000.InterfaceC1137ac
    /* JADX INFO: renamed from: m */
    public final InterfaceC1049Yb mo24m(InterfaceC1092Zb interfaceC1092Zb) {
        if (AbstractC0585Nj.m1134a(this, interfaceC1092Zb)) {
            return this;
        }
        return null;
    }

    @Override // p000.InterfaceC1137ac
    /* JADX INFO: renamed from: q */
    public final Object mo25q(Object obj, Function2 function2) {
        return function2.mo446d(obj, this);
    }

    @Override // p000.InterfaceC1137ac
    /* JADX INFO: renamed from: s */
    public final InterfaceC1137ac mo26s(InterfaceC1092Zb interfaceC1092Zb) {
        return AbstractC0585Nj.m1134a(this, interfaceC1092Zb) ? C0366If.f1247a : this;
    }
}
