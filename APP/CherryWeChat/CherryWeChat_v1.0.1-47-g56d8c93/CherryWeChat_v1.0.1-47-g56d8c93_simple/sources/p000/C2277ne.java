package p000;

/* JADX INFO: renamed from: ne */
/* JADX INFO: loaded from: classes.dex */
public final class C2277ne implements InterfaceC0717Qm {

    /* JADX INFO: renamed from: a */
    public static final C2277ne f8014a = null;

    /* JADX INFO: renamed from: b */
    public static final C2473ru f8015b = null;

    static {
        f8014a = new C2277ne();
        f8015b = new C2473ru("kotlin.Double", C2250mu.f7959j);
    }

    @Override // p000.InterfaceC0717Qm
    public final Object deserialize(InterfaceC0406Jc r3) {
        return Double.valueOf(r3.mo840D());
    }

    @Override // p000.InterfaceC0717Qm
    public final InterfaceC0126Cx getDescriptor() {
        return f8015b;
    }

    @Override // p000.InterfaceC0717Qm
    public final void serialize(InterfaceC0624Of r1, Object r2) {
        ((Number) r2).doubleValue();
        throw null;
    }
}
