package p037cb;

import p010a9.InterfaceC0173a;
import p143ja.C3789v;
import qa.InterfaceC6360q;

/* JADX INFO: renamed from: cb.h0 */
/* JADX INFO: loaded from: classes2.dex */
public class C1475h0 implements InterfaceC0173a {

    /* JADX INFO: renamed from: q */
    public final C1481k0 f4346q;

    /* JADX INFO: renamed from: r */
    public final AbstractC1487n0 f4347r;

    /* JADX INFO: renamed from: s */
    public final InterfaceC6360q f4348s;

    /* JADX INFO: renamed from: t */
    public final EnumC1466d f4349t;

    /* JADX INFO: renamed from: u */
    public final int f4350u;

    /* JADX INFO: renamed from: v */
    public final C3789v f4351v;

    public C1475h0(C1481k0 c1481k0, AbstractC1487n0 abstractC1487n0, InterfaceC6360q interfaceC6360q, EnumC1466d enumC1466d, int i10, C3789v c3789v) {
        this.f4346q = c1481k0;
        this.f4347r = abstractC1487n0;
        this.f4348s = interfaceC6360q;
        this.f4349t = enumC1466d;
        this.f4350u = i10;
        this.f4351v = c3789v;
    }

    @Override // p010a9.InterfaceC0173a
    public Object invoke() {
        return C1481k0.m5780C(this.f4346q, this.f4347r, this.f4348s, this.f4349t, this.f4350u, this.f4351v);
    }
}
