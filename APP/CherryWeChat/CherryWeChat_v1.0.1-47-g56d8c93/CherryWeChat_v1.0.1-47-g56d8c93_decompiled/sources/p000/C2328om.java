package p000;

import java.util.List;
import kotlinx.serialization.json.C2155a;

/* JADX INFO: renamed from: om */
/* JADX INFO: loaded from: classes.dex */
public final class C2328om implements InterfaceC0717Qm {

    /* JADX INFO: renamed from: a */
    public static final C2328om f8172a = new C2328om();

    /* JADX INFO: renamed from: b */
    public static final C2285nm f8173b = C2285nm.f8020b;

    @Override // p000.InterfaceC0717Qm
    public final Object deserialize(InterfaceC0406Jc interfaceC0406Jc) {
        AbstractC0714Qj.m1479a(interfaceC0406Jc);
        return new C2155a((List) new C0263G4(C2637vm.f9146a).m5004d(interfaceC0406Jc));
    }

    @Override // p000.InterfaceC0717Qm
    public final InterfaceC0126Cx getDescriptor() {
        return f8173b;
    }

    @Override // p000.InterfaceC0717Qm
    public final void serialize(InterfaceC0624Of interfaceC0624Of, Object obj) {
        throw null;
    }
}
