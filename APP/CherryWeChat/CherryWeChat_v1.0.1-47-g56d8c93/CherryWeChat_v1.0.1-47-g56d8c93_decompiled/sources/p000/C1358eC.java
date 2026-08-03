package p000;

/* JADX INFO: renamed from: eC */
/* JADX INFO: loaded from: classes.dex */
public final class C1358eC implements InterfaceC0717Qm {

    /* JADX INFO: renamed from: a */
    public static final C1358eC f4859a = new C1358eC();

    /* JADX INFO: renamed from: b */
    public static final C2378pl f4860b = AbstractC0148Dc.m267a(C2572u6.f8919a, "kotlin.UByte");

    @Override // p000.InterfaceC0717Qm
    public final Object deserialize(InterfaceC0406Jc interfaceC0406Jc) {
        return new C1130aC(interfaceC0406Jc.mo848u(f4860b).mo847t());
    }

    @Override // p000.InterfaceC0717Qm
    public final InterfaceC0126Cx getDescriptor() {
        return f4860b;
    }

    @Override // p000.InterfaceC0717Qm
    public final void serialize(InterfaceC0624Of interfaceC0624Of, Object obj) {
        byte b = ((C1130aC) obj).f3580a;
        throw null;
    }
}
