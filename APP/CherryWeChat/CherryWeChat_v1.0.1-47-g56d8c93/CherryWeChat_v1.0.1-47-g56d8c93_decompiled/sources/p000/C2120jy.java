package p000;

/* JADX INFO: renamed from: jy */
/* JADX INFO: loaded from: classes.dex */
public final class C2120jy implements InterfaceC0717Qm {

    /* JADX INFO: renamed from: a */
    public static final C2120jy f7449a = new C2120jy();

    /* JADX INFO: renamed from: b */
    public static final C2473ru f7450b = new C2473ru("kotlin.Short", C2250mu.f7963n);

    @Override // p000.InterfaceC0717Qm
    public final Object deserialize(InterfaceC0406Jc interfaceC0406Jc) {
        return Short.valueOf(interfaceC0406Jc.mo849x());
    }

    @Override // p000.InterfaceC0717Qm
    public final InterfaceC0126Cx getDescriptor() {
        return f7450b;
    }

    @Override // p000.InterfaceC0717Qm
    public final void serialize(InterfaceC0624Of interfaceC0624Of, Object obj) {
        ((Number) obj).shortValue();
        throw null;
    }
}
