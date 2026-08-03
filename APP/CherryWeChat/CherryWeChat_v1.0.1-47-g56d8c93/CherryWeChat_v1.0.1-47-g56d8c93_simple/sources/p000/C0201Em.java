package p000;

import kotlinx.serialization.json.JsonNull;

/* JADX INFO: renamed from: Em */
/* JADX INFO: loaded from: classes.dex */
public final class C0201Em implements InterfaceC0717Qm {

    /* JADX INFO: renamed from: a */
    public static final C0201Em f607a = null;

    /* JADX INFO: renamed from: b */
    public static final C0212Ex f608b = null;

    static {
        f607a = new C0201Em();
        C0255Fx r3 = C0255Fx.f828h;
        InterfaceC0126Cx[] r0 = new InterfaceC0126Cx[0];
        if (AbstractC2564tz.m5059T("kotlinx.serialization.json.JsonNull") == true) goto L11;
        if (r3.equals(C0128Cz.f298g) == true) goto L9;
        C0268G9 r6 = new C0268G9("kotlinx.serialization.json.JsonNull");
        f608b = new C0212Ex("kotlinx.serialization.json.JsonNull", r3, r6.f860b.size(), AbstractC0650P4.m1316K(r0), r6);
        return;
    L9:
        throw new IllegalArgumentException("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
    L11:
        throw new IllegalArgumentException("Blank serial names are prohibited");
    }

    @Override // p000.InterfaceC0717Qm
    public final Object deserialize(InterfaceC0406Jc r2) {
        AbstractC0714Qj.m1479a(r2);
        if (r2.mo843f() == true) goto L7;
        return JsonNull.INSTANCE;
    L7:
        throw new C2465rm("Expected 'null' literal");
    }

    @Override // p000.InterfaceC0717Qm
    public final InterfaceC0126Cx getDescriptor() {
        return f608b;
    }

    @Override // p000.InterfaceC0717Qm
    public final void serialize(InterfaceC0624Of r1, Object r2) {
        JsonNull r22 = (JsonNull) r2;
        throw null;
    }
}
