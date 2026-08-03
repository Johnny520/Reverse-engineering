package p000;

/* JADX INFO: renamed from: Gh */
/* JADX INFO: loaded from: classes.dex */
public final class C0282Gh implements InterfaceC0717Qm {

    /* JADX INFO: renamed from: a */
    public static final C0282Gh f908a = new C0282Gh();

    /* JADX INFO: renamed from: b */
    public static final C2473ru f909b = new C2473ru("kotlin.Float", C2250mu.f7960k);

    @Override // p000.InterfaceC0717Qm
    public final Object deserialize(InterfaceC0406Jc interfaceC0406Jc) {
        return Float.valueOf(interfaceC0406Jc.mo851z());
    }

    @Override // p000.InterfaceC0717Qm
    public final InterfaceC0126Cx getDescriptor() {
        return f909b;
    }

    @Override // p000.InterfaceC0717Qm
    public final void serialize(InterfaceC0624Of interfaceC0624Of, Object obj) {
        ((Number) obj).floatValue();
        throw null;
    }
}
