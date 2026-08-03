package p222p;

import ca.C0524k;
import gg.AbstractC1416l;
import java.util.List;
import p077f8.AbstractC1089i;
import p293u2.AbstractC4232b;
import p293u2.C4231a;
import p308v1.AbstractC4377b1;
import p308v1.InterfaceC4409m0;
import p308v1.InterfaceC4412n0;
import p308v1.InterfaceC4414o;
import p308v1.InterfaceC4415o0;
import p308v1.InterfaceC4418p0;
import p356y0.C5844f;
import tf.C4174u;

/* JADX INFO: renamed from: p.e1 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3213e1 implements InterfaceC4412n0, InterfaceC3204b1 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC3217g f10264a;

    /* JADX INFO: renamed from: b */
    public final C5844f f10265b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3213e1(InterfaceC3217g interfaceC3217g, C5844f c5844f) {
        this.f10264a = interfaceC3217g;
        this.f10265b = c5844f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p308v1.InterfaceC4412n0
    /* JADX INFO: renamed from: a */
    public final int mo3991a(InterfaceC4414o interfaceC4414o, List list, int i9) {
        int iMo1590G0 = interfaceC4414o.mo1590G0(this.f10264a.mo6896a());
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int iMax = 0;
        int i10 = 0;
        float f3 = 0.0f;
        for (int i11 = 0; i11 < size; i11++) {
            InterfaceC4409m0 interfaceC4409m0 = (InterfaceC4409m0) list.get(i11);
            float fM6876f = AbstractC3208d.m6876f(AbstractC3208d.m6875e(interfaceC4409m0));
            int iMo8830M = interfaceC4409m0.mo8830M(i9);
            if (fM6876f == 0.0f) {
                i10 += iMo8830M;
            } else if (fM6876f > 0.0f) {
                f3 += fM6876f;
                iMax = Math.max(iMax, Math.round(iMo8830M / fM6876f));
            }
        }
        return ((list.size() - 1) * iMo1590G0) + Math.round(iMax * f3) + i10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p222p.InterfaceC3204b1
    /* JADX INFO: renamed from: b */
    public final long mo6861b(int i9, int i10, int i11, boolean z9) {
        return !z9 ? AbstractC4232b.m8508a(i9, i10, 0, i11) : AbstractC1089i.m2793u(i9, i10, 0, i11);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p308v1.InterfaceC4412n0
    /* JADX INFO: renamed from: c */
    public final int mo3992c(InterfaceC4414o interfaceC4414o, List list, int i9) {
        int iMo1590G0 = interfaceC4414o.mo1590G0(this.f10264a.mo6896a());
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int iMax = 0;
        int i10 = 0;
        float f3 = 0.0f;
        for (int i11 = 0; i11 < size; i11++) {
            InterfaceC4409m0 interfaceC4409m0 = (InterfaceC4409m0) list.get(i11);
            float fM6876f = AbstractC3208d.m6876f(AbstractC3208d.m6875e(interfaceC4409m0));
            int iMo8829G = interfaceC4409m0.mo8829G(i9);
            if (fM6876f == 0.0f) {
                i10 += iMo8829G;
            } else if (fM6876f > 0.0f) {
                f3 += fM6876f;
                iMax = Math.max(iMax, Math.round(iMo8829G / fM6876f));
            }
        }
        return ((list.size() - 1) * iMo1590G0) + Math.round(iMax * f3) + i10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p222p.InterfaceC3204b1
    /* JADX INFO: renamed from: d */
    public final int mo6862d(AbstractC4377b1 abstractC4377b1) {
        return abstractC4377b1.f14593g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p222p.InterfaceC3204b1
    /* JADX INFO: renamed from: e */
    public final int mo6863e(AbstractC4377b1 abstractC4377b1) {
        return abstractC4377b1.f14594h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3213e1)) {
            return false;
        }
        C3213e1 c3213e1 = (C3213e1) obj;
        return AbstractC1416l.m3825a(this.f10264a, c3213e1.f10264a) && AbstractC1416l.m3825a(this.f10265b, c3213e1.f10265b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p222p.InterfaceC3204b1
    /* JADX INFO: renamed from: f */
    public final InterfaceC4415o0 mo6864f(AbstractC4377b1[] abstractC4377b1Arr, InterfaceC4418p0 interfaceC4418p0, int[] iArr, int i9, int i10) {
        return interfaceC4418p0.mo8010z(i9, i10, C4174u.f13711g, new C0524k(abstractC4377b1Arr, this, i10, iArr));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p308v1.InterfaceC4412n0
    /* JADX INFO: renamed from: g */
    public final int mo3993g(InterfaceC4414o interfaceC4414o, List list, int i9) {
        int iMo1590G0 = interfaceC4414o.mo1590G0(this.f10264a.mo6896a());
        if (list.isEmpty()) {
            return 0;
        }
        int iMin = Math.min((list.size() - 1) * iMo1590G0, i9);
        int size = list.size();
        int iMax = 0;
        float f3 = 0.0f;
        for (int i10 = 0; i10 < size; i10++) {
            InterfaceC4409m0 interfaceC4409m0 = (InterfaceC4409m0) list.get(i10);
            float fM6876f = AbstractC3208d.m6876f(AbstractC3208d.m6875e(interfaceC4409m0));
            if (fM6876f == 0.0f) {
                int iMin2 = Math.min(interfaceC4409m0.mo8830M(Integer.MAX_VALUE), i9 == Integer.MAX_VALUE ? Integer.MAX_VALUE : i9 - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, interfaceC4409m0.mo8832j(iMin2));
            } else if (fM6876f > 0.0f) {
                f3 += fM6876f;
            }
        }
        int iRound = f3 == 0.0f ? 0 : i9 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(i9 - iMin, 0) / f3);
        int size2 = list.size();
        for (int i11 = 0; i11 < size2; i11++) {
            InterfaceC4409m0 interfaceC4409m02 = (InterfaceC4409m0) list.get(i11);
            float fM6876f2 = AbstractC3208d.m6876f(AbstractC3208d.m6875e(interfaceC4409m02));
            if (fM6876f2 > 0.0f) {
                iMax = Math.max(iMax, interfaceC4409m02.mo8832j(iRound != Integer.MAX_VALUE ? Math.round(iRound * fM6876f2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p308v1.InterfaceC4412n0
    /* JADX INFO: renamed from: h */
    public final InterfaceC4415o0 mo3994h(InterfaceC4418p0 interfaceC4418p0, List list, long j3) {
        return AbstractC3208d.m6878h(this, C4231a.m8506j(j3), C4231a.m8505i(j3), C4231a.m8504h(j3), C4231a.m8503g(j3), interfaceC4418p0.mo1590G0(this.f10264a.mo6896a()), interfaceC4418p0, list, new AbstractC4377b1[list.size()], list.size());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f10265b.hashCode() + (this.f10264a.hashCode() * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p308v1.InterfaceC4412n0
    /* JADX INFO: renamed from: i */
    public final int mo3995i(InterfaceC4414o interfaceC4414o, List list, int i9) {
        int iMo1590G0 = interfaceC4414o.mo1590G0(this.f10264a.mo6896a());
        if (list.isEmpty()) {
            return 0;
        }
        int iMin = Math.min((list.size() - 1) * iMo1590G0, i9);
        int size = list.size();
        int iMax = 0;
        float f3 = 0.0f;
        for (int i10 = 0; i10 < size; i10++) {
            InterfaceC4409m0 interfaceC4409m0 = (InterfaceC4409m0) list.get(i10);
            float fM6876f = AbstractC3208d.m6876f(AbstractC3208d.m6875e(interfaceC4409m0));
            if (fM6876f == 0.0f) {
                int iMin2 = Math.min(interfaceC4409m0.mo8830M(Integer.MAX_VALUE), i9 == Integer.MAX_VALUE ? Integer.MAX_VALUE : i9 - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, interfaceC4409m0.mo8833p0(iMin2));
            } else if (fM6876f > 0.0f) {
                f3 += fM6876f;
            }
        }
        int iRound = f3 == 0.0f ? 0 : i9 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(i9 - iMin, 0) / f3);
        int size2 = list.size();
        for (int i11 = 0; i11 < size2; i11++) {
            InterfaceC4409m0 interfaceC4409m02 = (InterfaceC4409m0) list.get(i11);
            float fM6876f2 = AbstractC3208d.m6876f(AbstractC3208d.m6875e(interfaceC4409m02));
            if (fM6876f2 > 0.0f) {
                iMax = Math.max(iMax, interfaceC4409m02.mo8833p0(iRound != Integer.MAX_VALUE ? Math.round(iRound * fM6876f2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p222p.InterfaceC3204b1
    /* JADX INFO: renamed from: j */
    public final void mo6865j(int i9, InterfaceC4418p0 interfaceC4418p0, int[] iArr, int[] iArr2) {
        this.f10264a.mo6870b(interfaceC4418p0, i9, iArr, interfaceC4418p0.getLayoutDirection(), iArr2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "RowMeasurePolicy(horizontalArrangement=" + this.f10264a + ", verticalAlignment=" + this.f10265b + ')';
    }
}
