package p000;

import kotlinx.serialization.json.JsonNull;

/* JADX INFO: renamed from: Em */
/* JADX INFO: loaded from: classes.dex */
public final class C0201Em implements InterfaceC0717Qm {

    /* JADX INFO: renamed from: a */
    public static final C0201Em f607a = new C0201Em();

    /* JADX INFO: renamed from: b */
    public static final C0212Ex f608b;

    static {
        C0255Fx c0255Fx = C0255Fx.f828h;
        InterfaceC0126Cx[] interfaceC0126CxArr = new InterfaceC0126Cx[0];
        if (AbstractC2564tz.m5059T("kotlinx.serialization.json.JsonNull")) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        if (c0255Fx.equals(C0128Cz.f298g)) {
            throw new IllegalArgumentException("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
        }
        C0268G9 c0268g9 = new C0268G9("kotlinx.serialization.json.JsonNull");
        f608b = new C0212Ex("kotlinx.serialization.json.JsonNull", c0255Fx, c0268g9.f860b.size(), AbstractC0650P4.m1316K(interfaceC0126CxArr), c0268g9);
    }

    @Override // p000.InterfaceC0717Qm
    public final Object deserialize(InterfaceC0406Jc interfaceC0406Jc) {
        AbstractC0714Qj.m1479a(interfaceC0406Jc);
        if (interfaceC0406Jc.mo843f()) {
            throw new C2465rm("Expected 'null' literal");
        }
        return JsonNull.INSTANCE;
    }

    @Override // p000.InterfaceC0717Qm
    public final InterfaceC0126Cx getDescriptor() {
        return f608b;
    }

    @Override // p000.InterfaceC0717Qm
    public final void serialize(InterfaceC0624Of interfaceC0624Of, Object obj) {
        throw null;
    }
}
