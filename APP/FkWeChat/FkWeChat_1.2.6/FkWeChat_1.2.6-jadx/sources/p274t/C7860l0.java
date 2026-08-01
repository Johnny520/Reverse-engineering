package p274t;

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

/* JADX INFO: renamed from: t.l0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C7860l0 extends InterfaceC4507m.c implements InterfaceC4534e0 {

    /* JADX INFO: renamed from: F */
    public EnumC7840h0 f26196F;

    /* JADX INFO: renamed from: G */
    public float f26197G;

    public C7860l0(EnumC7840h0 enumC7840h0, float f10) {
        this.f26196F = enumC7840h0;
        this.f26197G = f10;
    }

    /* JADX INFO: renamed from: G2 */
    public static C4700i0 m30410G2(AbstractC3545l1 abstractC3545l1, AbstractC3545l1.a aVar) {
        AbstractC3545l1.a.m13270O(aVar, abstractC3545l1, 0, 0, 0.0f, 4, null);
        return C4700i0.f13910a;
    }

    /* JADX INFO: renamed from: H2 */
    public final void m30411H2(EnumC7840h0 enumC7840h0) {
        this.f26196F = enumC7840h0;
    }

    /* JADX INFO: renamed from: I2 */
    public final void m30412I2(float f10) {
        this.f26197G = f10;
    }

    @Override // p166l2.InterfaceC4534e0
    /* JADX INFO: renamed from: d */
    public InterfaceC3558p0 mo1288d(InterfaceC3561q0 interfaceC3561q0, InterfaceC3552n0 interfaceC3552n0, long j10) {
        int iM11975n;
        int iM11973l;
        int iM11972k;
        int iM11972k2;
        if (!C3173c.m11969h(j10) || this.f26196F == EnumC7840h0.f26150q) {
            iM11975n = C3173c.m11975n(j10);
            iM11973l = C3173c.m11973l(j10);
        } else {
            int iRound = Math.round(C3173c.m11973l(j10) * this.f26197G);
            int iM11975n2 = C3173c.m11975n(j10);
            iM11975n = C3173c.m11973l(j10);
            if (iRound < iM11975n2) {
                iRound = iM11975n2;
            }
            if (iRound <= iM11975n) {
                iM11975n = iRound;
            }
            iM11973l = iM11975n;
        }
        if (!C3173c.m11968g(j10) || this.f26196F == EnumC7840h0.f26151r) {
            int iM11974m = C3173c.m11974m(j10);
            iM11972k = C3173c.m11972k(j10);
            iM11972k2 = iM11974m;
        } else {
            int iRound2 = Math.round(C3173c.m11972k(j10) * this.f26197G);
            int iM11974m2 = C3173c.m11974m(j10);
            iM11972k2 = C3173c.m11972k(j10);
            if (iRound2 < iM11974m2) {
                iRound2 = iM11974m2;
            }
            if (iRound2 <= iM11972k2) {
                iM11972k2 = iRound2;
            }
            iM11972k = iM11972k2;
        }
        final AbstractC3545l1 abstractC3545l1Mo13148X = interfaceC3552n0.mo13148X(AbstractC3174d.m11984a(iM11975n, iM11973l, iM11972k2, iM11972k));
        return InterfaceC3561q0.m13345n0(interfaceC3561q0, abstractC3545l1Mo13148X.m13264M0(), abstractC3545l1Mo13148X.m13259G0(), null, new InterfaceC0184l() { // from class: t.k0
            @Override // p010a9.InterfaceC0184l
            /* JADX INFO: renamed from: m */
            public final Object mo27m(Object obj) {
                return C7860l0.m30410G2(abstractC3545l1Mo13148X, (AbstractC3545l1.a) obj);
            }
        }, 4, null);
    }
}
