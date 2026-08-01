package gb;

import p024b9.AbstractC1043k;
import p243q9.InterfaceC6333h;

/* JADX INFO: renamed from: gb.d0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2653d0 extends AbstractC2655d2 {

    /* JADX INFO: renamed from: e */
    public static final a f6967e = new a(null);

    /* JADX INFO: renamed from: c */
    public final AbstractC2655d2 f6968c;

    /* JADX INFO: renamed from: d */
    public final AbstractC2655d2 f6969d;

    public C2653d0(AbstractC2655d2 abstractC2655d2, AbstractC2655d2 abstractC2655d22) {
        this.f6968c = abstractC2655d2;
        this.f6969d = abstractC2655d22;
    }

    /* JADX INFO: renamed from: i */
    public static final AbstractC2655d2 m9354i(AbstractC2655d2 abstractC2655d2, AbstractC2655d2 abstractC2655d22) {
        return f6967e.m9359a(abstractC2655d2, abstractC2655d22);
    }

    @Override // gb.AbstractC2655d2
    /* JADX INFO: renamed from: a */
    public boolean mo9355a() {
        return this.f6968c.mo9355a() || this.f6969d.mo9355a();
    }

    @Override // gb.AbstractC2655d2
    /* JADX INFO: renamed from: b */
    public boolean mo9356b() {
        return this.f6968c.mo9356b() || this.f6969d.mo9356b();
    }

    @Override // gb.AbstractC2655d2
    /* JADX INFO: renamed from: d */
    public InterfaceC6333h mo9357d(InterfaceC6333h interfaceC6333h) {
        interfaceC6333h.getClass();
        return this.f6969d.mo9357d(this.f6968c.mo9357d(interfaceC6333h));
    }

    @Override // gb.AbstractC2655d2
    /* JADX INFO: renamed from: e */
    public InterfaceC2643a2 mo7021e(AbstractC2706r0 abstractC2706r0) {
        abstractC2706r0.getClass();
        InterfaceC2643a2 interfaceC2643a2Mo7021e = this.f6968c.mo7021e(abstractC2706r0);
        return interfaceC2643a2Mo7021e == null ? this.f6969d.mo7021e(abstractC2706r0) : interfaceC2643a2Mo7021e;
    }

    @Override // gb.AbstractC2655d2
    /* JADX INFO: renamed from: f */
    public boolean mo7022f() {
        return false;
    }

    @Override // gb.AbstractC2655d2
    /* JADX INFO: renamed from: g */
    public AbstractC2706r0 mo9358g(AbstractC2706r0 abstractC2706r0, EnumC2691m2 enumC2691m2) {
        abstractC2706r0.getClass();
        enumC2691m2.getClass();
        return this.f6969d.mo9358g(this.f6968c.mo9358g(abstractC2706r0, enumC2691m2), enumC2691m2);
    }

    /* JADX INFO: renamed from: gb.d0$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final AbstractC2655d2 m9359a(AbstractC2655d2 abstractC2655d2, AbstractC2655d2 abstractC2655d22) {
            abstractC2655d2.getClass();
            abstractC2655d22.getClass();
            return abstractC2655d2.mo7022f() ? abstractC2655d22 : abstractC2655d22.mo7022f() ? abstractC2655d2 : new C2653d0(abstractC2655d2, abstractC2655d22, null);
        }

        public a() {
        }
    }

    public /* synthetic */ C2653d0(AbstractC2655d2 abstractC2655d2, AbstractC2655d2 abstractC2655d22, AbstractC1043k abstractC1043k) {
        this(abstractC2655d2, abstractC2655d22);
    }
}
