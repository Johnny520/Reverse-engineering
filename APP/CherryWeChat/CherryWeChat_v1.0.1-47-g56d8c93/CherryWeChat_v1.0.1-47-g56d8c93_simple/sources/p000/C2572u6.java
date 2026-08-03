package p000;

/* JADX INFO: renamed from: u6 */
/* JADX INFO: loaded from: classes.dex */
public final class C2572u6 implements InterfaceC0717Qm {

    /* JADX INFO: renamed from: a */
    public static final C2572u6 f8919a = null;

    /* JADX INFO: renamed from: b */
    public static final C2473ru f8920b = null;

    static {
        f8919a = new C2572u6();
        f8920b = new C2473ru("kotlin.Byte", C2250mu.f7957h);
    }

    @Override // p000.InterfaceC0717Qm
    public final Object deserialize(InterfaceC0406Jc r1) {
        return Byte.valueOf(r1.mo847t());
    }

    @Override // p000.InterfaceC0717Qm
    public final InterfaceC0126Cx getDescriptor() {
        return f8920b;
    }

    @Override // p000.InterfaceC0717Qm
    public final void serialize(InterfaceC0624Of r1, Object r2) {
        ((Number) r2).byteValue();
        throw null;
    }
}
