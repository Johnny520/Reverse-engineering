package p000;

import kotlinx.serialization.json.AbstractC2156b;
import kotlinx.serialization.json.AbstractC2158d;

/* JADX INFO: renamed from: Hm */
/* JADX INFO: loaded from: classes.dex */
public final class C0330Hm implements InterfaceC0717Qm {

    /* JADX INFO: renamed from: a */
    public static final C0330Hm f1131a = null;

    /* JADX INFO: renamed from: b */
    public static final C0212Ex f1132b = null;

    static {
        f1131a = new C0330Hm();
        C2250mu r3 = C2250mu.f7964o;
        InterfaceC0126Cx[] r0 = new InterfaceC0126Cx[0];
        if (AbstractC2564tz.m5059T("kotlinx.serialization.json.JsonPrimitive") == true) goto L11;
        if (r3.equals(C0128Cz.f298g) == true) goto L9;
        C0268G9 r6 = new C0268G9("kotlinx.serialization.json.JsonPrimitive");
        f1132b = new C0212Ex("kotlinx.serialization.json.JsonPrimitive", r3, r6.f860b.size(), AbstractC0650P4.m1316K(r0), r6);
        return;
    L9:
        throw new IllegalArgumentException("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
    L11:
        throw new IllegalArgumentException("Blank serial names are prohibited");
    }

    @Override // p000.InterfaceC0717Qm
    public final Object deserialize(InterfaceC0406Jc r3) {
        AbstractC2156b r32 = AbstractC0714Qj.m1479a(r3).m4370A0();
        if ((r32 instanceof AbstractC2158d) == false) goto L7;
        return (AbstractC2158d) r32;
    L7:
        throw AbstractC1293cr.m2543b(-1, r32.toString(), "Unexpected JSON element, expected JsonPrimitive, had " + AbstractC0425Jv.m881a(r32.getClass()));
    }

    @Override // p000.InterfaceC0717Qm
    public final InterfaceC0126Cx getDescriptor() {
        return f1132b;
    }

    @Override // p000.InterfaceC0717Qm
    public final void serialize(InterfaceC0624Of r1, Object r2) {
        AbstractC2158d r22 = (AbstractC2158d) r2;
        throw null;
    }
}
