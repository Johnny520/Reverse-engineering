package p129ib;

import gb.AbstractC2706r0;
import gb.InterfaceC2716u1;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import lb.AbstractC4734d;
import p185m8.AbstractC5065a1;
import p185m8.AbstractC5114x;
import p213oa.C5695f;
import p229p9.InterfaceC6005h0;
import p229p9.InterfaceC6019m;
import p229p9.InterfaceC6055y0;

/* JADX INFO: renamed from: ib.l */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3381l {

    /* JADX INFO: renamed from: a */
    public static final C3381l f9328a = new C3381l();

    /* JADX INFO: renamed from: b */
    public static final InterfaceC6005h0 f9329b = C3374e.f9209q;

    /* JADX INFO: renamed from: c */
    public static final C3370a f9330c;

    /* JADX INFO: renamed from: d */
    public static final AbstractC2706r0 f9331d;

    /* JADX INFO: renamed from: e */
    public static final AbstractC2706r0 f9332e;

    /* JADX INFO: renamed from: f */
    public static final InterfaceC6055y0 f9333f;

    /* JADX INFO: renamed from: g */
    public static final Set f9334g;

    static {
        C5695f c5695fM23029m = C5695f.m23029m(String.format(EnumC3371b.f9197r.m12634c(), Arrays.copyOf(new Object[]{"unknown class"}, 1)));
        c5695fM23029m.getClass();
        f9330c = new C3370a(c5695fM23029m);
        f9331d = m12703d(EnumC3380k.f9263L, new String[0]);
        f9332e = m12703d(EnumC3380k.f9256H0, new String[0]);
        C3375f c3375f = new C3375f();
        f9333f = c3375f;
        f9334g = AbstractC5065a1.m20479d(c3375f);
    }

    /* JADX INFO: renamed from: a */
    public static final C3376g m12701a(EnumC3377h enumC3377h, boolean z10, String... strArr) {
        enumC3377h.getClass();
        strArr.getClass();
        return z10 ? new C3382m(enumC3377h, (String[]) Arrays.copyOf(strArr, strArr.length)) : new C3376g(enumC3377h, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    /* JADX INFO: renamed from: b */
    public static final C3376g m12702b(EnumC3377h enumC3377h, String... strArr) {
        enumC3377h.getClass();
        strArr.getClass();
        return m12701a(enumC3377h, false, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    /* JADX INFO: renamed from: d */
    public static final C3378i m12703d(EnumC3380k enumC3380k, String... strArr) {
        enumC3380k.getClass();
        strArr.getClass();
        return f9328a.m12709g(enumC3380k, AbstractC5114x.m20800o(), (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    /* JADX INFO: renamed from: m */
    public static final boolean m12704m(InterfaceC6019m interfaceC6019m) {
        if (interfaceC6019m == null) {
            return false;
        }
        C3381l c3381l = f9328a;
        return c3381l.m12715n(interfaceC6019m) || c3381l.m12715n(interfaceC6019m.mo7443b()) || interfaceC6019m == f9329b;
    }

    /* JADX INFO: renamed from: o */
    public static final boolean m12705o(AbstractC2706r0 abstractC2706r0) {
        if (abstractC2706r0 == null) {
            return false;
        }
        InterfaceC2716u1 interfaceC2716u1Mo9332T0 = abstractC2706r0.mo9332T0();
        return (interfaceC2716u1Mo9332T0 instanceof C3379j) && ((C3379j) interfaceC2716u1Mo9332T0).m12696c() == EnumC3380k.f9269O;
    }

    /* JADX INFO: renamed from: c */
    public final C3378i m12706c(EnumC3380k enumC3380k, InterfaceC2716u1 interfaceC2716u1, String... strArr) {
        enumC3380k.getClass();
        interfaceC2716u1.getClass();
        strArr.getClass();
        return m12708f(enumC3380k, AbstractC5114x.m20800o(), interfaceC2716u1, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    /* JADX INFO: renamed from: e */
    public final C3379j m12707e(EnumC3380k enumC3380k, String... strArr) {
        enumC3380k.getClass();
        strArr.getClass();
        return new C3379j(enumC3380k, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    /* JADX INFO: renamed from: f */
    public final C3378i m12708f(EnumC3380k enumC3380k, List list, InterfaceC2716u1 interfaceC2716u1, String... strArr) {
        enumC3380k.getClass();
        list.getClass();
        interfaceC2716u1.getClass();
        strArr.getClass();
        return new C3378i(interfaceC2716u1, m12702b(EnumC3377h.f9227x, interfaceC2716u1.toString()), enumC3380k, list, false, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    /* JADX INFO: renamed from: g */
    public final C3378i m12709g(EnumC3380k enumC3380k, List list, String... strArr) {
        enumC3380k.getClass();
        list.getClass();
        strArr.getClass();
        return m12708f(enumC3380k, list, m12707e(enumC3380k, (String[]) Arrays.copyOf(strArr, strArr.length)), (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    /* JADX INFO: renamed from: h */
    public final C3370a m12710h() {
        return f9330c;
    }

    /* JADX INFO: renamed from: i */
    public final InterfaceC6005h0 m12711i() {
        return f9329b;
    }

    /* JADX INFO: renamed from: j */
    public final Set m12712j() {
        return f9334g;
    }

    /* JADX INFO: renamed from: k */
    public final AbstractC2706r0 m12713k() {
        return f9332e;
    }

    /* JADX INFO: renamed from: l */
    public final AbstractC2706r0 m12714l() {
        return f9331d;
    }

    /* JADX INFO: renamed from: n */
    public final boolean m12715n(InterfaceC6019m interfaceC6019m) {
        return interfaceC6019m instanceof C3370a;
    }

    /* JADX INFO: renamed from: p */
    public final String m12716p(AbstractC2706r0 abstractC2706r0) {
        abstractC2706r0.getClass();
        AbstractC4734d.m18931z(abstractC2706r0);
        InterfaceC2716u1 interfaceC2716u1Mo9332T0 = abstractC2706r0.mo9332T0();
        interfaceC2716u1Mo9332T0.getClass();
        return ((C3379j) interfaceC2716u1Mo9332T0).m12697e(0);
    }
}
