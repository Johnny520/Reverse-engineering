package gb;

import p010a9.InterfaceC0173a;
import p082fb.InterfaceC2407i;
import p082fb.InterfaceC2412n;
import p112hb.AbstractC2949h;
import p160kb.InterfaceC4229i;

/* JADX INFO: renamed from: gb.x0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2724x0 extends AbstractC2695n2 {

    /* JADX INFO: renamed from: r */
    public final InterfaceC2412n f7121r;

    /* JADX INFO: renamed from: s */
    public final InterfaceC0173a f7122s;

    /* JADX INFO: renamed from: t */
    public final InterfaceC2407i f7123t;

    public C2724x0(InterfaceC2412n interfaceC2412n, InterfaceC0173a interfaceC0173a) {
        interfaceC2412n.getClass();
        interfaceC0173a.getClass();
        this.f7121r = interfaceC2412n;
        this.f7122s = interfaceC0173a;
        this.f7123t = interfaceC2412n.mo8663f(interfaceC0173a);
    }

    /* JADX INFO: renamed from: b1 */
    public static final AbstractC2706r0 m9655b1(AbstractC2949h abstractC2949h, C2724x0 c2724x0) {
        return abstractC2949h.mo9586a((InterfaceC4229i) c2724x0.f7122s.invoke());
    }

    @Override // gb.AbstractC2695n2
    /* JADX INFO: renamed from: X0 */
    public AbstractC2706r0 mo9525X0() {
        return (AbstractC2706r0) this.f7123t.invoke();
    }

    @Override // gb.AbstractC2695n2
    /* JADX INFO: renamed from: Y0 */
    public boolean mo9526Y0() {
        return this.f7123t.m8698b();
    }

    @Override // gb.AbstractC2706r0
    /* JADX INFO: renamed from: a1, reason: merged with bridge method [inline-methods] */
    public C2724x0 mo9325d1(AbstractC2949h abstractC2949h) {
        abstractC2949h.getClass();
        return new C2724x0(this.f7121r, new C2721w0(abstractC2949h, this));
    }
}
