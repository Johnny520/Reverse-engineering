package p142j9;

import java.lang.reflect.Member;
import p098g9.InterfaceC2559m;
import p142j9.AbstractC3708l2;
import p172l8.AbstractC4706m;
import p172l8.EnumC4708o;
import p172l8.InterfaceC4705l;
import p229p9.InterfaceC6055y0;

/* JADX INFO: renamed from: j9.f2 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public class C3678f2 extends AbstractC3708l2 implements InterfaceC2559m {

    /* JADX INFO: renamed from: E */
    public final InterfaceC4705l f10190E;

    /* JADX INFO: renamed from: F */
    public final InterfaceC4705l f10191F;

    /* JADX INFO: renamed from: j9.f2$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a extends AbstractC3708l2.c implements InterfaceC2559m.a {

        /* JADX INFO: renamed from: z */
        public final C3678f2 f10192z;

        public a(C3678f2 c3678f2) {
            c3678f2.getClass();
            this.f10192z = c3678f2;
        }

        @Override // p142j9.AbstractC3708l2.a
        /* JADX INFO: renamed from: g0, reason: merged with bridge method [inline-methods] */
        public C3678f2 mo13658a0() {
            return this.f10192z;
        }

        @Override // p010a9.InterfaceC0184l
        /* JADX INFO: renamed from: m */
        public Object mo27m(Object obj) {
            return mo13658a0().get(obj);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3678f2(AbstractC3672e1 abstractC3672e1, String str, String str2, Object obj) {
        super(abstractC3672e1, str, str2, obj);
        abstractC3672e1.getClass();
        str.getClass();
        str2.getClass();
        EnumC4708o enumC4708o = EnumC4708o.f13922r;
        this.f10190E = AbstractC4706m.m18788b(enumC4708o, new C3668d2(this));
        this.f10191F = AbstractC4706m.m18788b(enumC4708o, new C3673e2(this));
    }

    /* JADX INFO: renamed from: k0 */
    public static final a m13698k0(C3678f2 c3678f2) {
        return new a(c3678f2);
    }

    /* JADX INFO: renamed from: n0 */
    public static final Member m13701n0(C3678f2 c3678f2) {
        return c3678f2.m13786d0();
    }

    @Override // p098g9.InterfaceC2559m
    public Object get(Object obj) {
        return mo13656h0().mo9075o(obj);
    }

    @Override // p010a9.InterfaceC0184l
    /* JADX INFO: renamed from: m */
    public Object mo27m(Object obj) {
        return get(obj);
    }

    @Override // p142j9.AbstractC3708l2
    /* JADX INFO: renamed from: o0, reason: merged with bridge method [inline-methods] */
    public a mo13656h0() {
        return (a) this.f10190E.getValue();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3678f2(AbstractC3672e1 abstractC3672e1, InterfaceC6055y0 interfaceC6055y0) {
        super(abstractC3672e1, interfaceC6055y0);
        abstractC3672e1.getClass();
        interfaceC6055y0.getClass();
        EnumC4708o enumC4708o = EnumC4708o.f13922r;
        this.f10190E = AbstractC4706m.m18788b(enumC4708o, new C3668d2(this));
        this.f10191F = AbstractC4706m.m18788b(enumC4708o, new C3673e2(this));
    }
}
