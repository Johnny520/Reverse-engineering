package p000;

/* JADX INFO: renamed from: U5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0865U5 implements InterfaceC0717Qm {

    /* JADX INFO: renamed from: a */
    public static final C0865U5 f2734a = null;

    /* JADX INFO: renamed from: b */
    public static final C2473ru f2735b = null;

    static {
        f2734a = new C0865U5();
        f2735b = new C2473ru("kotlin.Boolean", C2250mu.f7956g);
    }

    @Override // p000.InterfaceC0717Qm
    public final Object deserialize(InterfaceC0406Jc r1) {
        return Boolean.valueOf(r1.mo842e());
    }

    @Override // p000.InterfaceC0717Qm
    public final InterfaceC0126Cx getDescriptor() {
        return f2735b;
    }

    @Override // p000.InterfaceC0717Qm
    public final void serialize(InterfaceC0624Of r1, Object r2) {
        ((Boolean) r2).getClass();
        throw null;
    }
}
