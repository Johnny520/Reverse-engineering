package p265s;

import gg.AbstractC1416l;
import mg.InterfaceC2842d;
import p016b1.C0166f;
import p072f2.AbstractC1049l;
import p072f2.AbstractC1058u;
import p072f2.AbstractC1060w;
import p072f2.C1038a;
import p072f2.C1041d;
import p072f2.C1047j;
import p072f2.C1061x;
import p072f2.InterfaceC1062y;
import p085fg.InterfaceC1220a;
import p117i0.C1892x;
import p174m.EnumC2640p1;
import p251r.C3621f;
import p339x1.InterfaceC5665z1;
import p356y0.AbstractC5852n;

/* JADX INFO: renamed from: s.w0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3864w0 extends AbstractC5852n implements InterfaceC5665z1 {

    /* JADX INFO: renamed from: A */
    public C3858t0 f12658A;

    /* JADX INFO: renamed from: u */
    public InterfaceC1220a f12659u;

    /* JADX INFO: renamed from: v */
    public C3621f f12660v;

    /* JADX INFO: renamed from: w */
    public EnumC2640p1 f12661w;

    /* JADX INFO: renamed from: x */
    public boolean f12662x;

    /* JADX INFO: renamed from: y */
    public C1047j f12663y;

    /* JADX INFO: renamed from: z */
    public final C3858t0 f12664z = new C3858t0(this, 0);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3864w0(InterfaceC1220a interfaceC1220a, C3621f c3621f, EnumC2640p1 enumC2640p1, boolean z9) {
        this.f12659u = interfaceC1220a;
        this.f12660v = c3621f;
        this.f12661w = enumC2640p1;
        this.f12662x = z9;
        m8033k1();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.InterfaceC5665z1
    /* JADX INFO: renamed from: X0 */
    public final void mo1610X0(InterfaceC1062y interfaceC1062y) {
        AbstractC1060w.m2683f(interfaceC1062y);
        interfaceC1062y.mo2644a(AbstractC1058u.f3372M, this.f12664z);
        EnumC2640p1 enumC2640p1 = this.f12661w;
        C1047j c1047j = this.f12663y;
        if (enumC2640p1 == EnumC2640p1.f8622g) {
            if (c1047j == null) {
                AbstractC1416l.m3831g("scrollAxisRange");
                throw null;
            }
            C1061x c1061x = AbstractC1058u.f3397v;
            InterfaceC2842d interfaceC2842d = AbstractC1060w.f3404a[13];
            interfaceC1062y.mo2644a(c1061x, c1047j);
        } else {
            if (c1047j == null) {
                AbstractC1416l.m3831g("scrollAxisRange");
                throw null;
            }
            C1061x c1061x2 = AbstractC1058u.f3396u;
            InterfaceC2842d interfaceC2842d2 = AbstractC1060w.f3404a[12];
            interfaceC1062y.mo2644a(c1061x2, c1047j);
        }
        C3858t0 c3858t0 = this.f12658A;
        if (c3858t0 != null) {
            interfaceC1062y.mo2644a(AbstractC1049l.f3320f, new C1038a(null, c3858t0));
        }
        interfaceC1062y.mo2644a(AbstractC1049l.f3314C, new C1038a(null, new C0166f(new C3860u0(this, 2), 10)));
        C3621f c3621f = this.f12660v;
        boolean z9 = c3621f.f11681c;
        C1892x c1892x = c3621f.f11679a;
        C1041d c1041d = z9 ? new C1041d(((Number) c1892x.getValue()).intValue(), 1) : new C1041d(1, ((Number) c1892x.getValue()).intValue());
        C1061x c1061x3 = AbstractC1058u.f3381f;
        InterfaceC2842d interfaceC2842d3 = AbstractC1060w.f3404a[24];
        interfaceC1062y.mo2644a(c1061x3, c1041d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p356y0.AbstractC5852n
    /* JADX INFO: renamed from: Z0 */
    public final boolean mo1349Z0() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k1 */
    public final void m8033k1() {
        this.f12663y = new C1047j(new C3860u0(this, 0), new C3860u0(this, 1));
        this.f12658A = this.f12662x ? new C3858t0(this, 1) : null;
    }
}
