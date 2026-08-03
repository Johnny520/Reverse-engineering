package p000;

import java.util.List;
import kotlinx.serialization.json.C2155a;

/* JADX INFO: renamed from: om */
/* JADX INFO: loaded from: classes.dex */
public final class C2328om implements InterfaceC0717Qm {

    /* JADX INFO: renamed from: a */
    public static final C2328om f8172a = null;

    /* JADX INFO: renamed from: b */
    public static final C2285nm f8173b = null;

    static {
        f8172a = new C2328om();
        f8173b = C2285nm.f8020b;
    }

    @Override // p000.InterfaceC0717Qm
    public final Object deserialize(InterfaceC0406Jc r4) {
        AbstractC0714Qj.m1479a(r4);
        return new C2155a((List) new C0263G4(C2637vm.f9146a).m5004d(r4));
    }

    @Override // p000.InterfaceC0717Qm
    public final InterfaceC0126Cx getDescriptor() {
        return f8173b;
    }

    @Override // p000.InterfaceC0717Qm
    public final void serialize(InterfaceC0624Of r1, Object r2) {
        C2155a r22 = (C2155a) r2;
        throw null;
    }
}
