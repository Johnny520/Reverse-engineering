package p000;

/* JADX INFO: renamed from: up */
/* JADX INFO: loaded from: classes.dex */
public final class C2597up implements InterfaceC0717Qm {

    /* JADX INFO: renamed from: a */
    public static final C2597up f8972a = null;

    /* JADX INFO: renamed from: b */
    public static final C2473ru f8973b = null;

    static {
        f8972a = new C2597up();
        f8973b = new C2473ru("kotlin.Long", C2250mu.f7962m);
    }

    @Override // p000.InterfaceC0717Qm
    public final Object deserialize(InterfaceC0406Jc r3) {
        return Long.valueOf(r3.mo841a());
    }

    @Override // p000.InterfaceC0717Qm
    public final InterfaceC0126Cx getDescriptor() {
        return f8973b;
    }

    @Override // p000.InterfaceC0717Qm
    public final void serialize(InterfaceC0624Of r1, Object r2) {
        ((Number) r2).longValue();
        throw null;
    }
}
