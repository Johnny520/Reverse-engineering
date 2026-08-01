package p303v;

import androidx.compose.runtime.InterfaceC0564p5;
import p010a9.InterfaceC0184l;
import p121i3.AbstractC3174d;
import p121i3.C3173c;
import p135j2.AbstractC3545l1;
import p135j2.InterfaceC3552n0;
import p135j2.InterfaceC3558p0;
import p135j2.InterfaceC3561q0;
import p165l1.InterfaceC4507m;
import p166l2.InterfaceC4534e0;
import p172l8.C4700i0;

/* JADX INFO: renamed from: v.a1 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C8684a1 extends InterfaceC4507m.c implements InterfaceC4534e0 {

    /* JADX INFO: renamed from: F */
    public float f28807F;

    /* JADX INFO: renamed from: G */
    public InterfaceC0564p5 f28808G;

    /* JADX INFO: renamed from: H */
    public InterfaceC0564p5 f28809H;

    public C8684a1(float f10, InterfaceC0564p5 interfaceC0564p5, InterfaceC0564p5 interfaceC0564p52) {
        this.f28807F = f10;
        this.f28808G = interfaceC0564p5;
        this.f28809H = interfaceC0564p52;
    }

    /* JADX INFO: renamed from: G2 */
    public static C4700i0 m33366G2(AbstractC3545l1 abstractC3545l1, AbstractC3545l1.a aVar) {
        AbstractC3545l1.a.m13281x(aVar, abstractC3545l1, 0, 0, 0.0f, 4, null);
        return C4700i0.f13910a;
    }

    /* JADX INFO: renamed from: H2 */
    public final void m33367H2(float f10) {
        this.f28807F = f10;
    }

    /* JADX INFO: renamed from: I2 */
    public final void m33368I2(InterfaceC0564p5 interfaceC0564p5) {
        this.f28809H = interfaceC0564p5;
    }

    /* JADX INFO: renamed from: J2 */
    public final void m33369J2(InterfaceC0564p5 interfaceC0564p5) {
        this.f28808G = interfaceC0564p5;
    }

    @Override // p166l2.InterfaceC4534e0
    /* JADX INFO: renamed from: d */
    public InterfaceC3558p0 mo1288d(InterfaceC3561q0 interfaceC3561q0, InterfaceC3552n0 interfaceC3552n0, long j10) {
        InterfaceC0564p5 interfaceC0564p5 = this.f28808G;
        int iRound = (interfaceC0564p5 == null || ((Number) interfaceC0564p5.getValue()).intValue() == Integer.MAX_VALUE) ? Integer.MAX_VALUE : Math.round(((Number) interfaceC0564p5.getValue()).floatValue() * this.f28807F);
        InterfaceC0564p5 interfaceC0564p52 = this.f28809H;
        int iRound2 = (interfaceC0564p52 == null || ((Number) interfaceC0564p52.getValue()).intValue() == Integer.MAX_VALUE) ? Integer.MAX_VALUE : Math.round(((Number) interfaceC0564p52.getValue()).floatValue() * this.f28807F);
        int iM11975n = iRound != Integer.MAX_VALUE ? iRound : C3173c.m11975n(j10);
        int iM11974m = iRound2 != Integer.MAX_VALUE ? iRound2 : C3173c.m11974m(j10);
        if (iRound == Integer.MAX_VALUE) {
            iRound = C3173c.m11973l(j10);
        }
        if (iRound2 == Integer.MAX_VALUE) {
            iRound2 = C3173c.m11972k(j10);
        }
        final AbstractC3545l1 abstractC3545l1Mo13148X = interfaceC3552n0.mo13148X(AbstractC3174d.m11984a(iM11975n, iRound, iM11974m, iRound2));
        return InterfaceC3561q0.m13345n0(interfaceC3561q0, abstractC3545l1Mo13148X.m13264M0(), abstractC3545l1Mo13148X.m13259G0(), null, new InterfaceC0184l() { // from class: v.z0
            @Override // p010a9.InterfaceC0184l
            /* JADX INFO: renamed from: m */
            public final Object mo27m(Object obj) {
                return C8684a1.m33366G2(abstractC3545l1Mo13148X, (AbstractC3545l1.a) obj);
            }
        }, 4, null);
    }
}
