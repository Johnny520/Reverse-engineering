package p037cb;

import p010a9.InterfaceC0173a;
import qa.InterfaceC6360q;

/* JADX INFO: renamed from: cb.g0 */
/* JADX INFO: loaded from: classes2.dex */
public class C1473g0 implements InterfaceC0173a {

    /* JADX INFO: renamed from: q */
    public final C1481k0 f4343q;

    /* JADX INFO: renamed from: r */
    public final InterfaceC6360q f4344r;

    /* JADX INFO: renamed from: s */
    public final EnumC1466d f4345s;

    public C1473g0(C1481k0 c1481k0, InterfaceC6360q interfaceC6360q, EnumC1466d enumC1466d) {
        this.f4343q = c1481k0;
        this.f4344r = interfaceC6360q;
        this.f4345s = enumC1466d;
    }

    @Override // p010a9.InterfaceC0173a
    public Object invoke() {
        return C1481k0.m5791p(this.f4343q, this.f4344r, this.f4345s);
    }
}
