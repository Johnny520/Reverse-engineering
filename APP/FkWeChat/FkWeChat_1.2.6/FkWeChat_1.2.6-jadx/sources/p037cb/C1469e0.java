package p037cb;

import p010a9.InterfaceC0173a;
import qa.InterfaceC6360q;

/* JADX INFO: renamed from: cb.e0 */
/* JADX INFO: loaded from: classes2.dex */
public class C1469e0 implements InterfaceC0173a {

    /* JADX INFO: renamed from: q */
    public final C1481k0 f4333q;

    /* JADX INFO: renamed from: r */
    public final InterfaceC6360q f4334r;

    /* JADX INFO: renamed from: s */
    public final EnumC1466d f4335s;

    public C1469e0(C1481k0 c1481k0, InterfaceC6360q interfaceC6360q, EnumC1466d enumC1466d) {
        this.f4333q = c1481k0;
        this.f4334r = interfaceC6360q;
        this.f4335s = enumC1466d;
    }

    @Override // p010a9.InterfaceC0173a
    public Object invoke() {
        return C1481k0.m5789k(this.f4333q, this.f4334r, this.f4335s);
    }
}
