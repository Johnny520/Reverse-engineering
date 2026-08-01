package ua;

import gb.AbstractC2650c1;
import gb.AbstractC2706r0;
import p129ib.C3381l;
import p129ib.EnumC3380k;
import p186m9.C5135p;
import p229p9.AbstractC6054y;
import p229p9.InterfaceC5995e;
import p229p9.InterfaceC6005h0;

/* JADX INFO: renamed from: ua.d0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8586d0 extends AbstractC8588e0 {
    public C8586d0(short s10) {
        super(Short.valueOf(s10));
    }

    @Override // ua.AbstractC8590g
    /* JADX INFO: renamed from: a */
    public AbstractC2706r0 mo32999a(InterfaceC6005h0 interfaceC6005h0) {
        AbstractC2650c1 abstractC2650c1Mo7508x;
        interfaceC6005h0.getClass();
        InterfaceC5995e interfaceC5995eM24112b = AbstractC6054y.m24112b(interfaceC6005h0, C5135p.a.f15533E0);
        return (interfaceC5995eM24112b == null || (abstractC2650c1Mo7508x = interfaceC5995eM24112b.mo7508x()) == null) ? C3381l.m12703d(EnumC3380k.f9266M0, "UShort") : abstractC2650c1Mo7508x;
    }

    @Override // ua.AbstractC8590g
    public String toString() {
        return ((Number) mo33009b()).intValue() + ".toUShort()";
    }
}
