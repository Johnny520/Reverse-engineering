package gb;

import p112hb.AbstractC2949h;
import p172l8.AbstractC4706m;
import p172l8.EnumC4708o;
import p172l8.InterfaceC4705l;
import p229p9.InterfaceC6018l1;

/* JADX INFO: renamed from: gb.j1 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2678j1 extends AbstractC2647b2 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC6018l1 f7022a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC4705l f7023b;

    public C2678j1(InterfaceC6018l1 interfaceC6018l1) {
        interfaceC6018l1.getClass();
        this.f7022a = interfaceC6018l1;
        this.f7023b = AbstractC4706m.m18788b(EnumC4708o.f13922r, new C2674i1(this));
    }

    /* JADX INFO: renamed from: d */
    public static final AbstractC2706r0 m9480d(C2678j1 c2678j1) {
        return AbstractC2682k1.m9486b(c2678j1.f7022a);
    }

    @Override // gb.InterfaceC2643a2
    /* JADX INFO: renamed from: a */
    public InterfaceC2643a2 mo9334a(AbstractC2949h abstractC2949h) {
        abstractC2949h.getClass();
        return this;
    }

    @Override // gb.InterfaceC2643a2
    /* JADX INFO: renamed from: b */
    public EnumC2691m2 mo9335b() {
        return EnumC2691m2.f7044w;
    }

    @Override // gb.InterfaceC2643a2
    /* JADX INFO: renamed from: c */
    public boolean mo9336c() {
        return true;
    }

    /* JADX INFO: renamed from: f */
    public final AbstractC2706r0 m9482f() {
        return (AbstractC2706r0) this.f7023b.getValue();
    }

    @Override // gb.InterfaceC2643a2
    public AbstractC2706r0 getType() {
        return m9482f();
    }
}
