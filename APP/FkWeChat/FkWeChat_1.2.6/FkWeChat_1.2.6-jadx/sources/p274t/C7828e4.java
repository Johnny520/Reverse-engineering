package p274t;

import p010a9.InterfaceC0184l;
import p010a9.InterfaceC0188p;
import p080f9.AbstractC2368o;
import p121i3.AbstractC3174d;
import p121i3.C3173c;
import p121i3.C3185o;
import p121i3.C3189s;
import p135j2.AbstractC3545l1;
import p135j2.InterfaceC3552n0;
import p135j2.InterfaceC3558p0;
import p135j2.InterfaceC3561q0;
import p165l1.InterfaceC4507m;
import p166l2.InterfaceC4534e0;
import p172l8.C4700i0;

/* JADX INFO: renamed from: t.e4 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C7828e4 extends InterfaceC4507m.c implements InterfaceC4534e0 {

    /* JADX INFO: renamed from: F */
    public EnumC7840h0 f26090F;

    /* JADX INFO: renamed from: G */
    public boolean f26091G;

    /* JADX INFO: renamed from: H */
    public InterfaceC0188p f26092H;

    public C7828e4(EnumC7840h0 enumC7840h0, boolean z10, InterfaceC0188p interfaceC0188p) {
        this.f26090F = enumC7840h0;
        this.f26091G = z10;
        this.f26092H = interfaceC0188p;
    }

    /* JADX INFO: renamed from: G2 */
    public static C4700i0 m30306G2(C7828e4 c7828e4, int i10, AbstractC3545l1 abstractC3545l1, int i11, InterfaceC3561q0 interfaceC3561q0, AbstractC3545l1.a aVar) {
        AbstractC3545l1.a.m13269B(aVar, abstractC3545l1, ((C3185o) c7828e4.f26092H.invoke(C3189s.m12081b(C3189s.m12082c((((long) (i10 - abstractC3545l1.m13264M0())) << 32) | (((long) (i11 - abstractC3545l1.m13259G0())) & 4294967295L))), interfaceC3561q0.getLayoutDirection())).m12056p(), 0.0f, 2, null);
        return C4700i0.f13910a;
    }

    /* JADX INFO: renamed from: H2 */
    public final void m30307H2(InterfaceC0188p interfaceC0188p) {
        this.f26092H = interfaceC0188p;
    }

    /* JADX INFO: renamed from: I2 */
    public final void m30308I2(EnumC7840h0 enumC7840h0) {
        this.f26090F = enumC7840h0;
    }

    /* JADX INFO: renamed from: J2 */
    public final void m30309J2(boolean z10) {
        this.f26091G = z10;
    }

    @Override // p166l2.InterfaceC4534e0
    /* JADX INFO: renamed from: d */
    public InterfaceC3558p0 mo1288d(final InterfaceC3561q0 interfaceC3561q0, InterfaceC3552n0 interfaceC3552n0, long j10) {
        EnumC7840h0 enumC7840h0 = this.f26090F;
        EnumC7840h0 enumC7840h02 = EnumC7840h0.f26150q;
        int iM11975n = enumC7840h0 != enumC7840h02 ? 0 : C3173c.m11975n(j10);
        EnumC7840h0 enumC7840h03 = this.f26090F;
        EnumC7840h0 enumC7840h04 = EnumC7840h0.f26151r;
        final AbstractC3545l1 abstractC3545l1Mo13148X = interfaceC3552n0.mo13148X(AbstractC3174d.m11984a(iM11975n, (this.f26090F == enumC7840h02 || !this.f26091G) ? C3173c.m11973l(j10) : Integer.MAX_VALUE, enumC7840h03 == enumC7840h04 ? C3173c.m11974m(j10) : 0, (this.f26090F == enumC7840h04 || !this.f26091G) ? C3173c.m11972k(j10) : Integer.MAX_VALUE));
        final int iM8586m = AbstractC2368o.m8586m(abstractC3545l1Mo13148X.m13264M0(), C3173c.m11975n(j10), C3173c.m11973l(j10));
        final int iM8586m2 = AbstractC2368o.m8586m(abstractC3545l1Mo13148X.m13259G0(), C3173c.m11974m(j10), C3173c.m11972k(j10));
        return InterfaceC3561q0.m13345n0(interfaceC3561q0, iM8586m, iM8586m2, null, new InterfaceC0184l() { // from class: t.d4
            @Override // p010a9.InterfaceC0184l
            /* JADX INFO: renamed from: m */
            public final Object mo27m(Object obj) {
                return C7828e4.m30306G2(this.f26040q, iM8586m, abstractC3545l1Mo13148X, iM8586m2, interfaceC3561q0, (AbstractC3545l1.a) obj);
            }
        }, 4, null);
    }
}
