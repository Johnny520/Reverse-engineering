package p012ab;

import gb.AbstractC2706r0;
import p213oa.C5695f;
import p229p9.InterfaceC5983a;

/* JADX INFO: renamed from: ab.c */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0206c extends AbstractC0204a implements InterfaceC0209f {

    /* JADX INFO: renamed from: c */
    public final InterfaceC5983a f538c;

    /* JADX INFO: renamed from: d */
    public final C5695f f539d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0206c(InterfaceC5983a interfaceC5983a, AbstractC2706r0 abstractC2706r0, C5695f c5695f, InterfaceC0210g interfaceC0210g) {
        super(abstractC2706r0, interfaceC0210g);
        interfaceC5983a.getClass();
        abstractC2706r0.getClass();
        this.f538c = interfaceC5983a;
        this.f539d = c5695f;
    }

    @Override // p012ab.InterfaceC0209f
    /* JADX INFO: renamed from: a */
    public C5695f mo443a() {
        return this.f539d;
    }

    /* JADX INFO: renamed from: c */
    public InterfaceC5983a m444c() {
        return this.f538c;
    }

    public String toString() {
        return "Cxt { " + m444c() + " }";
    }
}
