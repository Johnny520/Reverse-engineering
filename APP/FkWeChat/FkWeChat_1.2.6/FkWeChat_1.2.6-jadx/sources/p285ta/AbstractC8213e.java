package p285ta;

import gb.AbstractC2655d2;
import gb.AbstractC2706r0;
import gb.AbstractC2729z;
import gb.C2651c2;
import gb.C2689m0;
import gb.C2724x0;
import gb.EnumC2691m2;
import gb.InterfaceC2643a2;
import java.util.ArrayList;
import java.util.List;
import p082fb.C2404f;
import p082fb.InterfaceC2412n;
import p172l8.C4711r;
import p185m8.AbstractC5106t;
import p185m8.AbstractC5116y;
import p229p9.InterfaceC6004h;
import p229p9.InterfaceC6018l1;

/* JADX INFO: renamed from: ta.e */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC8213e {

    /* JADX INFO: renamed from: ta.e$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a extends AbstractC2729z {

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ boolean f27527d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AbstractC2655d2 abstractC2655d2, boolean z10) {
            super(abstractC2655d2);
            this.f27527d = z10;
        }

        @Override // gb.AbstractC2655d2
        /* JADX INFO: renamed from: b */
        public boolean mo9356b() {
            return this.f27527d;
        }

        @Override // gb.AbstractC2729z, gb.AbstractC2655d2
        /* JADX INFO: renamed from: e */
        public InterfaceC2643a2 mo7021e(AbstractC2706r0 abstractC2706r0) {
            abstractC2706r0.getClass();
            InterfaceC2643a2 interfaceC2643a2Mo7021e = super.mo7021e(abstractC2706r0);
            if (interfaceC2643a2Mo7021e == null) {
                return null;
            }
            InterfaceC6004h interfaceC6004hMo5602u = abstractC2706r0.mo9332T0().mo5602u();
            return AbstractC8213e.m31907c(interfaceC2643a2Mo7021e, interfaceC6004hMo5602u instanceof InterfaceC6018l1 ? (InterfaceC6018l1) interfaceC6004hMo5602u : null);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final InterfaceC2643a2 m31907c(InterfaceC2643a2 interfaceC2643a2, InterfaceC6018l1 interfaceC6018l1) {
        if (interfaceC6018l1 == null || interfaceC2643a2.mo9335b() == EnumC2691m2.f7042u) {
            return interfaceC2643a2;
        }
        if (interfaceC6018l1.mo23995s() != interfaceC2643a2.mo9335b()) {
            return new C2651c2(m31909e(interfaceC2643a2));
        }
        if (!interfaceC2643a2.mo9336c()) {
            return new C2651c2(interfaceC2643a2.getType());
        }
        InterfaceC2412n interfaceC2412n = C2404f.f6516e;
        interfaceC2412n.getClass();
        return new C2651c2(new C2724x0(interfaceC2412n, new C8212d(interfaceC2643a2)));
    }

    /* JADX INFO: renamed from: d */
    public static final AbstractC2706r0 m31908d(InterfaceC2643a2 interfaceC2643a2) {
        AbstractC2706r0 type = interfaceC2643a2.getType();
        type.getClass();
        return type;
    }

    /* JADX INFO: renamed from: e */
    public static final AbstractC2706r0 m31909e(InterfaceC2643a2 interfaceC2643a2) {
        interfaceC2643a2.getClass();
        return new C8209a(interfaceC2643a2, null, false, null, 14, null);
    }

    /* JADX INFO: renamed from: f */
    public static final boolean m31910f(AbstractC2706r0 abstractC2706r0) {
        abstractC2706r0.getClass();
        return abstractC2706r0.mo9332T0() instanceof InterfaceC8210b;
    }

    /* JADX INFO: renamed from: g */
    public static final AbstractC2655d2 m31911g(AbstractC2655d2 abstractC2655d2, boolean z10) {
        abstractC2655d2.getClass();
        if (!(abstractC2655d2 instanceof C2689m0)) {
            return new a(abstractC2655d2, z10);
        }
        C2689m0 c2689m0 = (C2689m0) abstractC2655d2;
        InterfaceC6018l1[] interfaceC6018l1ArrM9512j = c2689m0.m9512j();
        List<C4711r> listM20745l1 = AbstractC5106t.m20745l1(c2689m0.m9511i(), c2689m0.m9512j());
        ArrayList arrayList = new ArrayList(AbstractC5116y.m20814z(listM20745l1, 10));
        for (C4711r c4711r : listM20745l1) {
            arrayList.add(m31907c((InterfaceC2643a2) c4711r.m18795e(), (InterfaceC6018l1) c4711r.m18796f()));
        }
        return new C2689m0(interfaceC6018l1ArrM9512j, (InterfaceC2643a2[]) arrayList.toArray(new InterfaceC2643a2[0]), z10);
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ AbstractC2655d2 m31912h(AbstractC2655d2 abstractC2655d2, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        return m31911g(abstractC2655d2, z10);
    }
}
