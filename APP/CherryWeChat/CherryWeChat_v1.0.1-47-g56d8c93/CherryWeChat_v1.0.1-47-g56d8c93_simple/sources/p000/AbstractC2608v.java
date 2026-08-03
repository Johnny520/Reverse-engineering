package p000;

import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: v */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2608v implements InterfaceC1049Yb {

    /* JADX INFO: renamed from: a */
    public final InterfaceC1092Zb f8994a;

    public AbstractC2608v(InterfaceC1092Zb r1) {
        this.f8994a = r1;
    }

    @Override // p000.InterfaceC1049Yb
    public final InterfaceC1092Zb getKey() {
        return this.f8994a;
    }

    @Override // p000.InterfaceC1137ac
    /* JADX INFO: renamed from: l */
    public final InterfaceC1137ac mo23l(InterfaceC1137ac r1) {
        return AbstractC1406fG.m2700Z(this, r1);
    }

    @Override // p000.InterfaceC1137ac
    /* JADX INFO: renamed from: m */
    public InterfaceC1049Yb mo24m(InterfaceC1092Zb r2) {
        if (AbstractC0585Nj.m1134a(getKey(), r2) == false) goto L5;
        return this;
    L5:
        return null;
    }

    @Override // p000.InterfaceC1137ac
    /* JADX INFO: renamed from: q */
    public final Object mo25q(Object r1, Function2 r2) {
        return r2.mo446d(r1, this);
    }

    @Override // p000.InterfaceC1137ac
    /* JADX INFO: renamed from: s */
    public InterfaceC1137ac mo26s(InterfaceC1092Zb r2) {
        if (AbstractC0585Nj.m1134a(getKey(), r2) == true) goto L5;
        return this;
    L5:
        return C0366If.f1247a;
    }
}
