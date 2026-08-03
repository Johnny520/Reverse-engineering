package p000;

import kotlinx.serialization.json.AbstractC2156b;
import kotlinx.serialization.json.AbstractC2158d;

/* JADX INFO: renamed from: Hm */
/* JADX INFO: loaded from: classes.dex */
public final class C0330Hm implements InterfaceC0717Qm {

    /* JADX INFO: renamed from: a */
    public static final C0330Hm f1131a = new C0330Hm();

    /* JADX INFO: renamed from: b */
    public static final C0212Ex f1132b;

    static {
        C2250mu c2250mu = C2250mu.f7964o;
        InterfaceC0126Cx[] interfaceC0126CxArr = new InterfaceC0126Cx[0];
        if (AbstractC2564tz.m5059T("kotlinx.serialization.json.JsonPrimitive")) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        if (c2250mu.equals(C0128Cz.f298g)) {
            throw new IllegalArgumentException("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
        }
        C0268G9 c0268g9 = new C0268G9("kotlinx.serialization.json.JsonPrimitive");
        f1132b = new C0212Ex("kotlinx.serialization.json.JsonPrimitive", c2250mu, c0268g9.f860b.size(), AbstractC0650P4.m1316K(interfaceC0126CxArr), c0268g9);
    }

    @Override // p000.InterfaceC0717Qm
    public final Object deserialize(InterfaceC0406Jc interfaceC0406Jc) {
        AbstractC2156b abstractC2156bM4370A0 = AbstractC0714Qj.m1479a(interfaceC0406Jc).m4370A0();
        if (abstractC2156bM4370A0 instanceof AbstractC2158d) {
            return (AbstractC2158d) abstractC2156bM4370A0;
        }
        throw AbstractC1293cr.m2543b(-1, abstractC2156bM4370A0.toString(), "Unexpected JSON element, expected JsonPrimitive, had " + AbstractC0425Jv.m881a(abstractC2156bM4370A0.getClass()));
    }

    @Override // p000.InterfaceC0717Qm
    public final InterfaceC0126Cx getDescriptor() {
        return f1132b;
    }

    @Override // p000.InterfaceC0717Qm
    public final void serialize(InterfaceC0624Of interfaceC0624Of, Object obj) {
        throw null;
    }
}
