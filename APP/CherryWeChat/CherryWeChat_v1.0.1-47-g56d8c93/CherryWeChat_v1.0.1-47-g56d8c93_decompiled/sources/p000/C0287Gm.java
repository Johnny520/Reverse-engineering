package p000;

import java.util.Map;
import kotlinx.serialization.json.C2157c;

/* JADX INFO: renamed from: Gm */
/* JADX INFO: loaded from: classes.dex */
public final class C0287Gm implements InterfaceC0717Qm {

    /* JADX INFO: renamed from: a */
    public static final C0287Gm f931a = new C0287Gm();

    /* JADX INFO: renamed from: b */
    public static final C0244Fm f932b = C0244Fm.f798b;

    @Override // p000.InterfaceC0717Qm
    public final Object deserialize(InterfaceC0406Jc interfaceC0406Jc) {
        AbstractC0714Qj.m1479a(interfaceC0406Jc);
        C2521sz c2521sz = C2521sz.f8819a;
        C2637vm c2637vm = C2637vm.f9146a;
        return new C2157c((Map) new C2467ro().m5004d(interfaceC0406Jc));
    }

    @Override // p000.InterfaceC0717Qm
    public final InterfaceC0126Cx getDescriptor() {
        return f932b;
    }

    @Override // p000.InterfaceC0717Qm
    public final void serialize(InterfaceC0624Of interfaceC0624Of, Object obj) {
        throw null;
    }
}
