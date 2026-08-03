package p340x2;

import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import p014b.C0126e;
import p018b3.C0171a;
import p091g3.AbstractC1333s;
import p091g3.C1300b0;
import p091g3.C1332r0;
import p129ig.AbstractC2043a;
import p308v1.AbstractC4434w;
import p339x1.C5639r;
import p358y2.C5985t;

/* JADX INFO: renamed from: x2.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5666a extends AbstractC1333s {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f23057j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ ViewGroup f23058k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5666a(ViewGroup viewGroup, int i9) {
        super(1);
        this.f23057j = i9;
        this.f23058k = viewGroup;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p091g3.AbstractC1333s
    /* JADX INFO: renamed from: d */
    public final C1332r0 mo3562d(C1332r0 c1332r0, List list) {
        switch (this.f23057j) {
            case 0:
                return ((C5687v) this.f23058k).m10233g(c1332r0);
            default:
                C5985t c5985t = (C5985t) this.f23058k;
                if (c5985t.f24304s) {
                    return c1332r0;
                }
                View childAt = c5985t.getChildAt(0);
                int iMax = Math.max(0, childAt.getLeft());
                int iMax2 = Math.max(0, childAt.getTop());
                int iMax3 = Math.max(0, c5985t.getWidth() - childAt.getRight());
                int iMax4 = Math.max(0, c5985t.getHeight() - childAt.getBottom());
                return (iMax == 0 && iMax2 == 0 && iMax3 == 0 && iMax4 == 0) ? c1332r0 : c1332r0.f4398a.mo3504n(iMax, iMax2, iMax3, iMax4);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p091g3.AbstractC1333s
    /* JADX INFO: renamed from: e */
    public final C0126e mo3563e(C1300b0 c1300b0, C0126e c0126e) {
        switch (this.f23057j) {
            case 0:
                C5639r c5639r = ((C5687v) this.f23058k).f23084F.f22778L.f22716c;
                if (!c5639r.f22950Y.f23801t) {
                    return c0126e;
                }
                long jM5017W = AbstractC2043a.m5017W(c5639r.mo8868m0(0L));
                int i9 = (int) (jM5017W >> 32);
                if (i9 < 0) {
                    i9 = 0;
                }
                int i10 = (int) (jM5017W & 4294967295L);
                if (i10 < 0) {
                    i10 = 0;
                }
                long jMo8858F = AbstractC4434w.m8884h(c5639r).mo8858F();
                int i11 = (int) (jMo8858F >> 32);
                int i12 = (int) (jMo8858F & 4294967295L);
                long j3 = c5639r.f14595i;
                long jM5017W2 = AbstractC2043a.m5017W(c5639r.mo8868m0((((long) Float.floatToRawIntBits((int) (j3 >> 32))) << 32) | (((long) Float.floatToRawIntBits((int) (j3 & 4294967295L))) & 4294967295L)));
                int i13 = i11 - ((int) (jM5017W2 >> 32));
                if (i13 < 0) {
                    i13 = 0;
                }
                int i14 = i12 - ((int) (4294967295L & jM5017W2));
                int i15 = i14 >= 0 ? i14 : 0;
                if (i9 == 0 && i10 == 0 && i13 == 0 && i15 == 0) {
                    return c0126e;
                }
                return new C0126e(AbstractC5673h.m10232f((C0171a) c0126e.f332h, i9, i10, i13, i15), 6, AbstractC5673h.m10232f((C0171a) c0126e.f333i, i9, i10, i13, i15));
            default:
                C5985t c5985t = (C5985t) this.f23058k;
                if (c5985t.f24304s) {
                    return c0126e;
                }
                View childAt = c5985t.getChildAt(0);
                int iMax = Math.max(0, childAt.getLeft());
                int iMax2 = Math.max(0, childAt.getTop());
                int iMax3 = Math.max(0, c5985t.getWidth() - childAt.getRight());
                int iMax4 = Math.max(0, c5985t.getHeight() - childAt.getBottom());
                if (iMax == 0 && iMax2 == 0 && iMax3 == 0 && iMax4 == 0) {
                    return c0126e;
                }
                C0171a c0171aM766b = C0171a.m766b(iMax, iMax2, iMax3, iMax4);
                int i16 = c0171aM766b.f445a;
                C0171a c0171a = (C0171a) c0126e.f332h;
                int i17 = c0171aM766b.f446b;
                int i18 = c0171aM766b.f447c;
                int i19 = c0171aM766b.f448d;
                return new C0126e(C1332r0.m3557a(c0171a, i16, i17, i18, i19), 6, C1332r0.m3557a((C0171a) c0126e.f333i, i16, i17, i18, i19));
        }
    }
}
