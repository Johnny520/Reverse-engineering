package p000;

/* JADX INFO: renamed from: v7 */
/* JADX INFO: loaded from: classes.dex */
public final class C2616v7 implements InterfaceC0717Qm {

    /* JADX INFO: renamed from: a */
    public static final C2616v7 f9071a = new C2616v7();

    /* JADX INFO: renamed from: b */
    public static final C2473ru f9072b = new C2473ru("kotlin.Char", C2250mu.f7958i);

    @Override // p000.InterfaceC0717Qm
    public final Object deserialize(InterfaceC0406Jc interfaceC0406Jc) {
        return Character.valueOf(interfaceC0406Jc.mo844g());
    }

    @Override // p000.InterfaceC0717Qm
    public final InterfaceC0126Cx getDescriptor() {
        return f9072b;
    }

    @Override // p000.InterfaceC0717Qm
    public final void serialize(InterfaceC0624Of interfaceC0624Of, Object obj) {
        ((Character) obj).getClass();
        throw null;
    }
}
