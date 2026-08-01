package p274t;

import p010a9.InterfaceC0184l;
import p121i3.EnumC3191u;
import p135j2.AbstractC3545l1;
import p135j2.InterfaceC3558p0;
import p135j2.InterfaceC3561q0;
import p172l8.C4700i0;
import p274t.C7823e;

/* JADX INFO: renamed from: t.b1 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC7807b1 extends InterfaceC7917w2 {
    /* JADX INFO: renamed from: l */
    static C4700i0 m30246l(int[] iArr, int i10, int i11, int i12, AbstractC3545l1[] abstractC3545l1Arr, InterfaceC7807b1 interfaceC7807b1, int i13, EnumC3191u enumC3191u, int i14, int[] iArr2, AbstractC3545l1.a aVar) {
        int i15 = iArr != null ? iArr[i10] : 0;
        for (int i16 = i11; i16 < i12; i16++) {
            AbstractC3545l1 abstractC3545l1 = abstractC3545l1Arr[i16];
            abstractC3545l1.getClass();
            int iM30248m = interfaceC7807b1.m30248m(abstractC3545l1, i13, enumC3191u, i14) + i15;
            if (interfaceC7807b1.mo30251q()) {
                AbstractC3545l1.a.m13281x(aVar, abstractC3545l1, iArr2[i16 - i11], iM30248m, 0.0f, 4, null);
            } else {
                AbstractC3545l1.a.m13281x(aVar, abstractC3545l1, iM30248m, iArr2[i16 - i11], 0.0f, 4, null);
            }
        }
        return C4700i0.f13910a;
    }

    @Override // p274t.InterfaceC7917w2
    /* JADX INFO: renamed from: a */
    default int mo30240a(AbstractC3545l1 abstractC3545l1) {
        return mo30251q() ? abstractC3545l1.mo13260H0() : abstractC3545l1.mo13262K0();
    }

    @Override // p274t.InterfaceC7917w2
    /* JADX INFO: renamed from: f */
    default long mo30241f(int i10, int i11, int i12, int i13, boolean z10) {
        return mo30251q() ? AbstractC7932z2.m30627a(z10, i10, i11, i12, i13) : AbstractC7929z.m30624b(z10, i10, i11, i12, i13);
    }

    @Override // p274t.InterfaceC7917w2
    /* JADX INFO: renamed from: g */
    default InterfaceC3558p0 mo30242g(final AbstractC3545l1[] abstractC3545l1Arr, InterfaceC3561q0 interfaceC3561q0, final int i10, final int[] iArr, int i11, final int i12, final int[] iArr2, final int i13, final int i14, final int i15) {
        int i16;
        int i17;
        if (mo30251q()) {
            i17 = i11;
            i16 = i12;
        } else {
            i16 = i11;
            i17 = i12;
        }
        final EnumC3191u layoutDirection = mo30251q() ? EnumC3191u.f8484q : interfaceC3561q0.getLayoutDirection();
        return InterfaceC3561q0.m13345n0(interfaceC3561q0, i17, i16, null, new InterfaceC0184l() { // from class: t.a1
            @Override // p010a9.InterfaceC0184l
            /* JADX INFO: renamed from: m */
            public final Object mo27m(Object obj) {
                return InterfaceC7807b1.m30246l(iArr2, i13, i14, i15, abstractC3545l1Arr, this, i12, layoutDirection, i10, iArr, (AbstractC3545l1.a) obj);
            }
        }, 4, null);
    }

    @Override // p274t.InterfaceC7917w2
    /* JADX INFO: renamed from: i */
    default void mo30243i(int i10, int[] iArr, int[] iArr2, InterfaceC3561q0 interfaceC3561q0) {
        if (mo30251q()) {
            mo30249o().mo30291b(interfaceC3561q0, i10, iArr, interfaceC3561q0.getLayoutDirection(), iArr2);
        } else {
            mo30250p().mo30292c(interfaceC3561q0, i10, iArr, iArr2);
        }
    }

    @Override // p274t.InterfaceC7917w2
    /* JADX INFO: renamed from: j */
    default int mo30244j(AbstractC3545l1 abstractC3545l1) {
        return mo30251q() ? abstractC3545l1.mo13262K0() : abstractC3545l1.mo13260H0();
    }

    /* JADX INFO: renamed from: k */
    AbstractC7835g0 mo30247k();

    /* JADX INFO: renamed from: m */
    default int m30248m(AbstractC3545l1 abstractC3545l1, int i10, EnumC3191u enumC3191u, int i11) {
        AbstractC7835g0 abstractC7835g0Mo30247k;
        C7927y2 c7927y2M30548d = AbstractC7912v2.m30548d(abstractC3545l1);
        if (c7927y2M30548d == null || (abstractC7835g0Mo30247k = c7927y2M30548d.m30612a()) == null) {
            abstractC7835g0Mo30247k = mo30247k();
        }
        return abstractC7835g0Mo30247k.mo30361a(i10 - mo30240a(abstractC3545l1), enumC3191u, abstractC3545l1, i11);
    }

    /* JADX INFO: renamed from: o */
    C7823e.e mo30249o();

    /* JADX INFO: renamed from: p */
    C7823e.m mo30250p();

    /* JADX INFO: renamed from: q */
    boolean mo30251q();
}
