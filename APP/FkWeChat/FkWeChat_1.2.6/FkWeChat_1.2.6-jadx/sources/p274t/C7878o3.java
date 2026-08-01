package p274t;

import p010a9.InterfaceC0184l;
import p024b9.AbstractC1043k;
import p121i3.AbstractC3174d;
import p121i3.C3173c;
import p135j2.AbstractC3545l1;
import p135j2.InterfaceC3552n0;
import p135j2.InterfaceC3558p0;
import p135j2.InterfaceC3561q0;
import p135j2.InterfaceC3563r;
import p135j2.InterfaceC3566s;
import p165l1.InterfaceC4507m;
import p166l2.InterfaceC4534e0;
import p172l8.C4700i0;

/* JADX INFO: renamed from: t.o3 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C7878o3 extends InterfaceC4507m.c implements InterfaceC4534e0 {

    /* JADX INFO: renamed from: F */
    public float f26241F;

    /* JADX INFO: renamed from: G */
    public float f26242G;

    public C7878o3(float f10, float f11) {
        this.f26241F = f10;
        this.f26242G = f11;
    }

    /* JADX INFO: renamed from: G2 */
    public static C4700i0 m30461G2(AbstractC3545l1 abstractC3545l1, AbstractC3545l1.a aVar) {
        AbstractC3545l1.a.m13270O(aVar, abstractC3545l1, 0, 0, 0.0f, 4, null);
        return C4700i0.f13910a;
    }

    @Override // p166l2.InterfaceC4534e0
    /* JADX INFO: renamed from: G */
    public int mo15345G(InterfaceC3566s interfaceC3566s, InterfaceC3563r interfaceC3563r, int i10) {
        int iMo13151z0 = interfaceC3563r.mo13151z0(i10);
        int iMo1236x1 = !Float.isNaN(this.f26242G) ? interfaceC3566s.mo1236x1(this.f26242G) : 0;
        return iMo13151z0 < iMo1236x1 ? iMo1236x1 : iMo13151z0;
    }

    /* JADX INFO: renamed from: H2 */
    public final void m30462H2(float f10) {
        this.f26242G = f10;
    }

    /* JADX INFO: renamed from: I2 */
    public final void m30463I2(float f10) {
        this.f26241F = f10;
    }

    @Override // p166l2.InterfaceC4534e0
    /* JADX INFO: renamed from: d */
    public InterfaceC3558p0 mo1288d(InterfaceC3561q0 interfaceC3561q0, InterfaceC3552n0 interfaceC3552n0, long j10) {
        int iM11975n;
        int iM11974m;
        if (Float.isNaN(this.f26241F) || C3173c.m11975n(j10) != 0) {
            iM11975n = C3173c.m11975n(j10);
        } else {
            int iMo1236x1 = interfaceC3561q0.mo1236x1(this.f26241F);
            iM11975n = C3173c.m11973l(j10);
            if (iMo1236x1 < 0) {
                iMo1236x1 = 0;
            }
            if (iMo1236x1 <= iM11975n) {
                iM11975n = iMo1236x1;
            }
        }
        int iM11973l = C3173c.m11973l(j10);
        if (Float.isNaN(this.f26242G) || C3173c.m11974m(j10) != 0) {
            iM11974m = C3173c.m11974m(j10);
        } else {
            int iMo1236x12 = interfaceC3561q0.mo1236x1(this.f26242G);
            iM11974m = C3173c.m11972k(j10);
            int i10 = iMo1236x12 >= 0 ? iMo1236x12 : 0;
            if (i10 <= iM11974m) {
                iM11974m = i10;
            }
        }
        final AbstractC3545l1 abstractC3545l1Mo13148X = interfaceC3552n0.mo13148X(AbstractC3174d.m11984a(iM11975n, iM11973l, iM11974m, C3173c.m11972k(j10)));
        return InterfaceC3561q0.m13345n0(interfaceC3561q0, abstractC3545l1Mo13148X.m13264M0(), abstractC3545l1Mo13148X.m13259G0(), null, new InterfaceC0184l() { // from class: t.n3
            @Override // p010a9.InterfaceC0184l
            /* JADX INFO: renamed from: m */
            public final Object mo27m(Object obj) {
                return C7878o3.m30461G2(abstractC3545l1Mo13148X, (AbstractC3545l1.a) obj);
            }
        }, 4, null);
    }

    @Override // p166l2.InterfaceC4534e0
    /* JADX INFO: renamed from: g */
    public int mo15346g(InterfaceC3566s interfaceC3566s, InterfaceC3563r interfaceC3563r, int i10) {
        int iMo13150t = interfaceC3563r.mo13150t(i10);
        int iMo1236x1 = !Float.isNaN(this.f26242G) ? interfaceC3566s.mo1236x1(this.f26242G) : 0;
        return iMo13150t < iMo1236x1 ? iMo1236x1 : iMo13150t;
    }

    @Override // p166l2.InterfaceC4534e0
    /* JADX INFO: renamed from: t */
    public int mo15347t(InterfaceC3566s interfaceC3566s, InterfaceC3563r interfaceC3563r, int i10) {
        int iMo13146S = interfaceC3563r.mo13146S(i10);
        int iMo1236x1 = !Float.isNaN(this.f26241F) ? interfaceC3566s.mo1236x1(this.f26241F) : 0;
        return iMo13146S < iMo1236x1 ? iMo1236x1 : iMo13146S;
    }

    @Override // p166l2.InterfaceC4534e0
    /* JADX INFO: renamed from: v */
    public int mo15348v(InterfaceC3566s interfaceC3566s, InterfaceC3563r interfaceC3563r, int i10) {
        int iMo13147W = interfaceC3563r.mo13147W(i10);
        int iMo1236x1 = !Float.isNaN(this.f26241F) ? interfaceC3566s.mo1236x1(this.f26241F) : 0;
        return iMo13147W < iMo1236x1 ? iMo1236x1 : iMo13147W;
    }

    public /* synthetic */ C7878o3(float f10, float f11, AbstractC1043k abstractC1043k) {
        this(f10, f11);
    }
}
