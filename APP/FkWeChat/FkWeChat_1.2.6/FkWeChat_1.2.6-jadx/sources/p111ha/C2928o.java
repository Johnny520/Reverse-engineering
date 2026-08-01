package p111ha;

import p024b9.AbstractC1061t;
import p037cb.C1476i;
import p037cb.InterfaceC1478j;
import p213oa.C5691b;

/* JADX INFO: renamed from: ha.o */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2928o implements InterfaceC1478j {

    /* JADX INFO: renamed from: a */
    public final InterfaceC2935v f7742a;

    /* JADX INFO: renamed from: b */
    public final C2927n f7743b;

    public C2928o(InterfaceC2935v interfaceC2935v, C2927n c2927n) {
        interfaceC2935v.getClass();
        c2927n.getClass();
        this.f7742a = interfaceC2935v;
        this.f7743b = c2927n;
    }

    @Override // p037cb.InterfaceC1478j
    /* JADX INFO: renamed from: a */
    public C1476i mo5779a(C5691b c5691b) {
        c5691b.getClass();
        InterfaceC2937x interfaceC2937xM10731b = AbstractC2936w.m10731b(this.f7742a, c5691b, this.f7743b.m10677f().m5829g().mo5860g());
        if (interfaceC2937xM10731b == null) {
            return null;
        }
        AbstractC1061t.m3842c(interfaceC2937xM10731b.mo10736h(), c5691b);
        return this.f7743b.m10683l(interfaceC2937xM10731b);
    }
}
