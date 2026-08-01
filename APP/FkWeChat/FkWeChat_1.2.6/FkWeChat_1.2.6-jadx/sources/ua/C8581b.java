package ua;

import gb.AbstractC2706r0;
import java.util.List;
import p010a9.InterfaceC0184l;
import p186m9.AbstractC5128i;
import p229p9.InterfaceC6005h0;

/* JADX INFO: renamed from: ua.b */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public class C8581b extends AbstractC8590g {

    /* JADX INFO: renamed from: b */
    public final InterfaceC0184l f28623b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8581b(List list, InterfaceC0184l interfaceC0184l) {
        super(list);
        list.getClass();
        interfaceC0184l.getClass();
        this.f28623b = interfaceC0184l;
    }

    @Override // ua.AbstractC8590g
    /* JADX INFO: renamed from: a */
    public AbstractC2706r0 mo32999a(InterfaceC6005h0 interfaceC6005h0) {
        interfaceC6005h0.getClass();
        AbstractC2706r0 abstractC2706r0 = (AbstractC2706r0) this.f28623b.mo27m(interfaceC6005h0);
        if (!AbstractC5128i.m20869d0(abstractC2706r0) && !AbstractC5128i.m20884r0(abstractC2706r0)) {
            AbstractC5128i.m20859E0(abstractC2706r0);
        }
        return abstractC2706r0;
    }
}
