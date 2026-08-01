package p142j9;

import p098g9.InterfaceC2558l;
import p142j9.AbstractC3708l2;
import p172l8.AbstractC4706m;
import p172l8.EnumC4708o;
import p172l8.InterfaceC4705l;
import p229p9.InterfaceC6055y0;

/* JADX INFO: renamed from: j9.c2 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public class C3663c2 extends AbstractC3708l2 implements InterfaceC2558l {

    /* JADX INFO: renamed from: E */
    public final InterfaceC4705l f10163E;

    /* JADX INFO: renamed from: F */
    public final InterfaceC4705l f10164F;

    /* JADX INFO: renamed from: j9.c2$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a extends AbstractC3708l2.c implements InterfaceC2558l.a {

        /* JADX INFO: renamed from: z */
        public final C3663c2 f10165z;

        public a(C3663c2 c3663c2) {
            c3663c2.getClass();
            this.f10165z = c3663c2;
        }

        @Override // p142j9.AbstractC3708l2.a
        /* JADX INFO: renamed from: g0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public C3663c2 mo13658a0() {
            return this.f10165z;
        }

        @Override // p010a9.InterfaceC0173a
        public Object invoke() {
            return mo9080a().get();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3663c2(AbstractC3672e1 abstractC3672e1, String str, String str2, Object obj) {
        super(abstractC3672e1, str, str2, obj);
        abstractC3672e1.getClass();
        str.getClass();
        str2.getClass();
        EnumC4708o enumC4708o = EnumC4708o.f13922r;
        this.f10163E = AbstractC4706m.m18788b(enumC4708o, new C3653a2(this));
        this.f10164F = AbstractC4706m.m18788b(enumC4708o, new C3658b2(this));
    }

    /* JADX INFO: renamed from: k0 */
    public static final a m13652k0(C3663c2 c3663c2) {
        return new a(c3663c2);
    }

    /* JADX INFO: renamed from: n0 */
    public static final Object m13655n0(C3663c2 c3663c2) {
        return c3663c2.m13788f0(c3663c2.m13786d0(), null, null);
    }

    @Override // p098g9.InterfaceC2558l
    public Object get() {
        return mo3772h().mo9075o(new Object[0]);
    }

    @Override // p010a9.InterfaceC0173a
    public Object invoke() {
        return get();
    }

    @Override // p142j9.AbstractC3708l2
    /* JADX INFO: renamed from: o0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public a mo13656h0() {
        return (a) this.f10163E.getValue();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3663c2(AbstractC3672e1 abstractC3672e1, InterfaceC6055y0 interfaceC6055y0) {
        super(abstractC3672e1, interfaceC6055y0);
        abstractC3672e1.getClass();
        interfaceC6055y0.getClass();
        EnumC4708o enumC4708o = EnumC4708o.f13922r;
        this.f10163E = AbstractC4706m.m18788b(enumC4708o, new C3653a2(this));
        this.f10164F = AbstractC4706m.m18788b(enumC4708o, new C3658b2(this));
    }
}
