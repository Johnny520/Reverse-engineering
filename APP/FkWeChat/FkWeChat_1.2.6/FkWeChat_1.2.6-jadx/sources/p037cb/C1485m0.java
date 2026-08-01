package p037cb;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import la.AbstractC4721a;
import la.InterfaceC4724d;
import p010a9.InterfaceC0184l;
import p080f9.AbstractC2368o;
import p143ja.C3770c;
import p143ja.C3781n;
import p185m8.AbstractC5107t0;
import p185m8.AbstractC5116y;
import p213oa.C5691b;
import p229p9.InterfaceC6003g1;

/* JADX INFO: renamed from: cb.m0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1485m0 implements InterfaceC1478j {

    /* JADX INFO: renamed from: a */
    public final InterfaceC4724d f4374a;

    /* JADX INFO: renamed from: b */
    public final AbstractC4721a f4375b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC0184l f4376c;

    /* JADX INFO: renamed from: d */
    public final Map f4377d;

    public C1485m0(C3781n c3781n, InterfaceC4724d interfaceC4724d, AbstractC4721a abstractC4721a, InterfaceC0184l interfaceC0184l) {
        c3781n.getClass();
        interfaceC4724d.getClass();
        abstractC4721a.getClass();
        interfaceC0184l.getClass();
        this.f4374a = interfaceC4724d;
        this.f4375b = abstractC4721a;
        this.f4376c = interfaceC0184l;
        List listM14589J = c3781n.m14589J();
        listM14589J.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC2368o.m8578e(AbstractC5107t0.m20763e(AbstractC5116y.m20814z(listM14589J, 10)), 16));
        for (Object obj : listM14589J) {
            linkedHashMap.put(AbstractC1483l0.m5818a(this.f4374a, ((C3770c) obj).m14162I0()), obj);
        }
        this.f4377d = linkedHashMap;
    }

    @Override // p037cb.InterfaceC1478j
    /* JADX INFO: renamed from: a */
    public C1476i mo5779a(C5691b c5691b) {
        c5691b.getClass();
        C3770c c3770c = (C3770c) this.f4377d.get(c5691b);
        if (c3770c == null) {
            return null;
        }
        return new C1476i(this.f4374a, c3770c, this.f4375b, (InterfaceC6003g1) this.f4376c.mo27m(c5691b));
    }

    /* JADX INFO: renamed from: b */
    public final Collection m5822b() {
        return this.f4377d.keySet();
    }
}
