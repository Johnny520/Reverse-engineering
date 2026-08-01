package p264s0;

import java.util.LinkedHashMap;
import java.util.Map;
import p010a9.InterfaceC0184l;
import p049d9.AbstractC1927c;
import p080f9.AbstractC2368o;
import p121i3.C3179i;
import p135j2.AbstractC3545l1;
import p135j2.InterfaceC3552n0;
import p135j2.InterfaceC3558p0;
import p135j2.InterfaceC3561q0;
import p165l1.InterfaceC4507m;
import p166l2.AbstractC4549i;
import p166l2.InterfaceC4534e0;
import p166l2.InterfaceC4545h;
import p172l8.C4700i0;
import p185m8.AbstractC5109u0;

/* JADX INFO: renamed from: s0.j6 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C6790j6 extends InterfaceC4507m.c implements InterfaceC4545h, InterfaceC4534e0 {

    /* JADX INFO: renamed from: F */
    public Map f21752F;

    /* JADX INFO: renamed from: G2 */
    public static C4700i0 m26964G2(int i10, AbstractC3545l1 abstractC3545l1, int i11, AbstractC3545l1.a aVar) {
        AbstractC3545l1.a.m13281x(aVar, abstractC3545l1, AbstractC1927c.m6980d((i10 - abstractC3545l1.m13264M0()) / 2.0f), AbstractC1927c.m6980d((i11 - abstractC3545l1.m13259G0()) / 2.0f), 0.0f, 4, null);
        return C4700i0.f13910a;
    }

    /* JADX INFO: renamed from: H2 */
    public final Map m26965H2() {
        Map map = this.f21752F;
        if (map != null) {
            return map;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(2);
        this.f21752F = linkedHashMap;
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: I2 */
    public final void m26966I2(int i10, AbstractC3545l1 abstractC3545l1) {
        Map mapM26965H2 = m26965H2();
        mapM26965H2.put(AbstractC6932s5.m27501d(), Integer.valueOf(AbstractC2368o.m8578e(Math.round((i10 - abstractC3545l1.m13264M0()) / 2.0f), 0)));
        mapM26965H2.put(AbstractC6932s5.m27502e(), Integer.valueOf(AbstractC2368o.m8578e(Math.round((i10 - abstractC3545l1.m13259G0()) / 2.0f), 0)));
    }

    @Override // p166l2.InterfaceC4534e0
    /* JADX INFO: renamed from: d */
    public InterfaceC3558p0 mo1288d(InterfaceC3561q0 interfaceC3561q0, InterfaceC3552n0 interfaceC3552n0, long j10) {
        float f10 = 0;
        float fM12003k = C3179i.m12003k(AbstractC2368o.m8577d(((C3179i) AbstractC4549i.m17816a(this, AbstractC6932s5.m27500c())).m12009r(), C3179i.m12003k(f10)));
        final AbstractC3545l1 abstractC3545l1Mo13148X = interfaceC3552n0.mo13148X(j10);
        boolean z10 = m17461m2() && !Float.isNaN(fM12003k) && C3179i.m12002j(fM12003k, C3179i.m12003k(f10)) > 0;
        int iMo1236x1 = Float.isNaN(fM12003k) ? 0 : interfaceC3561q0.mo1236x1(fM12003k);
        final int iMax = z10 ? Math.max(abstractC3545l1Mo13148X.m13264M0(), iMo1236x1) : abstractC3545l1Mo13148X.m13264M0();
        final int iMax2 = z10 ? Math.max(abstractC3545l1Mo13148X.m13259G0(), iMo1236x1) : abstractC3545l1Mo13148X.m13259G0();
        if (z10) {
            m26966I2(iMo1236x1, abstractC3545l1Mo13148X);
        }
        Map mapM20768i = this.f21752F;
        if (mapM20768i == null) {
            mapM20768i = AbstractC5109u0.m20768i();
        }
        return interfaceC3561q0.mo1235x0(iMax, iMax2, mapM20768i, new InterfaceC0184l() { // from class: s0.i6
            @Override // p010a9.InterfaceC0184l
            /* JADX INFO: renamed from: m */
            public final Object mo27m(Object obj) {
                return C6790j6.m26964G2(iMax, abstractC3545l1Mo13148X, iMax2, (AbstractC3545l1.a) obj);
            }
        });
    }
}
