package p000;

/* JADX INFO: renamed from: Hl */
/* JADX INFO: loaded from: classes.dex */
public final class C0329Hl implements InterfaceC0717Qm {

    /* JADX INFO: renamed from: a */
    public static final C0329Hl f1129a = new C0329Hl();

    /* JADX INFO: renamed from: b */
    public static final C2473ru f1130b = new C2473ru("kotlin.Int", C2250mu.f7961l);

    @Override // p000.InterfaceC0717Qm
    public final Object deserialize(InterfaceC0406Jc interfaceC0406Jc) {
        return Integer.valueOf(interfaceC0406Jc.mo846p());
    }

    @Override // p000.InterfaceC0717Qm
    public final InterfaceC0126Cx getDescriptor() {
        return f1130b;
    }

    @Override // p000.InterfaceC0717Qm
    public final void serialize(InterfaceC0624Of interfaceC0624Of, Object obj) {
        ((Number) obj).intValue();
        throw null;
    }
}
