package p000;

/* JADX INFO: renamed from: tC */
/* JADX INFO: loaded from: classes.dex */
public final class C2535tC implements InterfaceC0717Qm {

    /* JADX INFO: renamed from: a */
    public static final C2535tC f8840a = null;

    /* JADX INFO: renamed from: b */
    public static final C2378pl f8841b = null;

    static {
        f8840a = new C2535tC();
        f8841b = AbstractC0148Dc.m267a(C2120jy.f7449a, "kotlin.UShort");
    }

    @Override // p000.InterfaceC0717Qm
    public final Object deserialize(InterfaceC0406Jc r2) {
        return new C2355pC(r2.mo848u(f8841b).mo849x());
    }

    @Override // p000.InterfaceC0717Qm
    public final InterfaceC0126Cx getDescriptor() {
        return f8841b;
    }

    @Override // p000.InterfaceC0717Qm
    public final void serialize(InterfaceC0624Of r1, Object r2) {
        short r12 = ((C2355pC) r2).f8240a;
        throw null;
    }
}
