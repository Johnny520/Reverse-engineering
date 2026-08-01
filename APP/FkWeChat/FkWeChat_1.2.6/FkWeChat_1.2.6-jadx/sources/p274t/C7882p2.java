package p274t;

import p010a9.InterfaceC0184l;
import p024b9.AbstractC1043k;
import p121i3.AbstractC3174d;
import p135j2.AbstractC3545l1;
import p135j2.InterfaceC3552n0;
import p135j2.InterfaceC3558p0;
import p135j2.InterfaceC3561q0;
import p165l1.InterfaceC4507m;
import p166l2.InterfaceC4534e0;
import p172l8.C4700i0;

/* JADX INFO: renamed from: t.p2 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C7882p2 extends InterfaceC4507m.c implements InterfaceC4534e0 {

    /* JADX INFO: renamed from: F */
    public float f26261F;

    /* JADX INFO: renamed from: G */
    public float f26262G;

    /* JADX INFO: renamed from: H */
    public float f26263H;

    /* JADX INFO: renamed from: I */
    public float f26264I;

    /* JADX INFO: renamed from: J */
    public boolean f26265J;

    public C7882p2(float f10, float f11, float f12, float f13, boolean z10) {
        this.f26261F = f10;
        this.f26262G = f11;
        this.f26263H = f12;
        this.f26264I = f13;
        this.f26265J = z10;
    }

    /* JADX INFO: renamed from: G2 */
    public static C4700i0 m30466G2(C7882p2 c7882p2, AbstractC3545l1 abstractC3545l1, AbstractC3545l1.a aVar) {
        boolean z10 = c7882p2.f26265J;
        float f10 = c7882p2.f26261F;
        if (z10) {
            AbstractC3545l1.a.m13270O(aVar, abstractC3545l1, aVar.mo1236x1(f10), aVar.mo1236x1(c7882p2.f26262G), 0.0f, 4, null);
        } else {
            AbstractC3545l1.a.m13281x(aVar, abstractC3545l1, aVar.mo1236x1(f10), aVar.mo1236x1(c7882p2.f26262G), 0.0f, 4, null);
        }
        return C4700i0.f13910a;
    }

    /* JADX INFO: renamed from: H2 */
    public final void m30467H2(float f10) {
        this.f26264I = f10;
    }

    /* JADX INFO: renamed from: I2 */
    public final void m30468I2(float f10) {
        this.f26263H = f10;
    }

    /* JADX INFO: renamed from: J2 */
    public final void m30469J2(boolean z10) {
        this.f26265J = z10;
    }

    /* JADX INFO: renamed from: K2 */
    public final void m30470K2(float f10) {
        this.f26261F = f10;
    }

    /* JADX INFO: renamed from: L2 */
    public final void m30471L2(float f10) {
        this.f26262G = f10;
    }

    @Override // p166l2.InterfaceC4534e0
    /* JADX INFO: renamed from: d */
    public InterfaceC3558p0 mo1288d(InterfaceC3561q0 interfaceC3561q0, InterfaceC3552n0 interfaceC3552n0, long j10) {
        int iMo1236x1 = interfaceC3561q0.mo1236x1(this.f26261F) + interfaceC3561q0.mo1236x1(this.f26263H);
        int iMo1236x12 = interfaceC3561q0.mo1236x1(this.f26262G) + interfaceC3561q0.mo1236x1(this.f26264I);
        final AbstractC3545l1 abstractC3545l1Mo13148X = interfaceC3552n0.mo13148X(AbstractC3174d.m11992i(j10, -iMo1236x1, -iMo1236x12));
        return InterfaceC3561q0.m13345n0(interfaceC3561q0, AbstractC3174d.m11990g(j10, abstractC3545l1Mo13148X.m13264M0() + iMo1236x1), AbstractC3174d.m11989f(j10, abstractC3545l1Mo13148X.m13259G0() + iMo1236x12), null, new InterfaceC0184l() { // from class: t.o2
            @Override // p010a9.InterfaceC0184l
            /* JADX INFO: renamed from: m */
            public final Object mo27m(Object obj) {
                return C7882p2.m30466G2(this.f26239q, abstractC3545l1Mo13148X, (AbstractC3545l1.a) obj);
            }
        }, 4, null);
    }

    public /* synthetic */ C7882p2(float f10, float f11, float f12, float f13, boolean z10, AbstractC1043k abstractC1043k) {
        this(f10, f11, f12, f13, z10);
    }
}
