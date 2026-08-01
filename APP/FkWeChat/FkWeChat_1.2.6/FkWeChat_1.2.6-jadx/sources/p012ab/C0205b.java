package p012ab;

import gb.AbstractC2706r0;
import p213oa.C5695f;
import p229p9.InterfaceC5995e;

/* JADX INFO: renamed from: ab.b */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0205b extends AbstractC0204a implements InterfaceC0209f {

    /* JADX INFO: renamed from: c */
    public final InterfaceC5995e f536c;

    /* JADX INFO: renamed from: d */
    public final C5695f f537d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0205b(InterfaceC5995e interfaceC5995e, AbstractC2706r0 abstractC2706r0, C5695f c5695f, InterfaceC0210g interfaceC0210g) {
        super(abstractC2706r0, interfaceC0210g);
        interfaceC5995e.getClass();
        abstractC2706r0.getClass();
        this.f536c = interfaceC5995e;
        this.f537d = c5695f;
    }

    @Override // p012ab.InterfaceC0209f
    /* JADX INFO: renamed from: a */
    public C5695f mo443a() {
        return this.f537d;
    }

    public String toString() {
        return getType() + ": Ctx { " + this.f536c + " }";
    }
}
