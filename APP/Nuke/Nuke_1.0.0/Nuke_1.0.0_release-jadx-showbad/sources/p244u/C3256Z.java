package p244u;

import java.util.List;
import p000A.C0056d0;
import p029F0.AbstractC0391b0;
import p029F0.InterfaceC0376N;
import p029F0.InterfaceC0377O;
import p029F0.InterfaceC0378P;
import p029F0.InterfaceC0379Q;
import p029F0.InterfaceC0420q;
import p061L2.C0982v;
import p117X2.AbstractC1665j;
import p127Z2.AbstractC1784a;
import p153e1.AbstractC2006b;
import p153e1.C2005a;
import p169h0.C2198g;

/* JADX INFO: renamed from: u.Z */
/* JADX INFO: loaded from: classes.dex */
public final class C3256Z implements InterfaceC0377O, InterfaceC3253W {

    /* JADX INFO: renamed from: a */
    public final InterfaceC3267f f10072a;

    /* JADX INFO: renamed from: b */
    public final C2198g f10073b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3256Z(InterfaceC3267f interfaceC3267f, C2198g c2198g) {
        this.f10072a = interfaceC3267f;
        this.f10073b = c2198g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p029F0.InterfaceC0377O
    /* JADX INFO: renamed from: a */
    public final int mo651a(InterfaceC0420q interfaceC0420q, List list, int i5) {
        int iMo270S = interfaceC0420q.mo270S(this.f10072a.mo5542a());
        if (list.isEmpty()) {
            return 0;
        }
        int iMin = Math.min((list.size() - 1) * iMo270S, i5);
        int size = list.size();
        int iMax = 0;
        float f2 = 0.0f;
        for (int i6 = 0; i6 < size; i6++) {
            InterfaceC0376N interfaceC0376N = (InterfaceC0376N) list.get(i6);
            float fM5520g = AbstractC3261c.m5520g(AbstractC3261c.m5519f(interfaceC0376N));
            if (fM5520g == 0.0f) {
                int iMin2 = Math.min(interfaceC0376N.mo646X(Integer.MAX_VALUE), i5 == Integer.MAX_VALUE ? Integer.MAX_VALUE : i5 - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, interfaceC0376N.mo649f(iMin2));
            } else if (fM5520g > 0.0f) {
                f2 += fM5520g;
            }
        }
        int iRound = f2 == 0.0f ? 0 : i5 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(i5 - iMin, 0) / f2);
        int size2 = list.size();
        for (int i7 = 0; i7 < size2; i7++) {
            InterfaceC0376N interfaceC0376N2 = (InterfaceC0376N) list.get(i7);
            float fM5520g2 = AbstractC3261c.m5520g(AbstractC3261c.m5519f(interfaceC0376N2));
            if (fM5520g2 > 0.0f) {
                iMax = Math.max(iMax, interfaceC0376N2.mo649f(iRound != Integer.MAX_VALUE ? Math.round(iRound * fM5520g2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p244u.InterfaceC3253W
    /* JADX INFO: renamed from: b */
    public final InterfaceC0378P mo5499b(AbstractC0391b0[] abstractC0391b0Arr, InterfaceC0379Q interfaceC0379Q, int[] iArr, int i5, int i6) {
        return interfaceC0379Q.mo604f0(i5, i6, C0982v.f3048d, new C0056d0(abstractC0391b0Arr, this, i6, iArr));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p244u.InterfaceC3253W
    /* JADX INFO: renamed from: c */
    public final int mo5500c(AbstractC0391b0 abstractC0391b0) {
        return abstractC0391b0.f1206d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p244u.InterfaceC3253W
    /* JADX INFO: renamed from: d */
    public final void mo5501d(int i5, InterfaceC0379Q interfaceC0379Q, int[] iArr, int[] iArr2) {
        this.f10072a.mo5511b(interfaceC0379Q, i5, iArr, interfaceC0379Q.getLayoutDirection(), iArr2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p029F0.InterfaceC0377O
    /* JADX INFO: renamed from: e */
    public final int mo652e(InterfaceC0420q interfaceC0420q, List list, int i5) {
        int iMo270S = interfaceC0420q.mo270S(this.f10072a.mo5542a());
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int iMax = 0;
        int i6 = 0;
        float f2 = 0.0f;
        for (int i7 = 0; i7 < size; i7++) {
            InterfaceC0376N interfaceC0376N = (InterfaceC0376N) list.get(i7);
            float fM5520g = AbstractC3261c.m5520g(AbstractC3261c.m5519f(interfaceC0376N));
            int iMo645T = interfaceC0376N.mo645T(i5);
            if (fM5520g == 0.0f) {
                i6 += iMo645T;
            } else if (fM5520g > 0.0f) {
                f2 += fM5520g;
                iMax = Math.max(iMax, Math.round(iMo645T / fM5520g));
            }
        }
        return ((list.size() - 1) * iMo270S) + Math.round(iMax * f2) + i6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3256Z)) {
            return false;
        }
        C3256Z c3256z = (C3256Z) obj;
        return AbstractC1665j.m2981a(this.f10072a, c3256z.f10072a) && AbstractC1665j.m2981a(this.f10073b, c3256z.f10073b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p029F0.InterfaceC0377O
    /* JADX INFO: renamed from: f */
    public final int mo15f(InterfaceC0420q interfaceC0420q, List list, int i5) {
        int iMo270S = interfaceC0420q.mo270S(this.f10072a.mo5542a());
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int iMax = 0;
        int i6 = 0;
        float f2 = 0.0f;
        for (int i7 = 0; i7 < size; i7++) {
            InterfaceC0376N interfaceC0376N = (InterfaceC0376N) list.get(i7);
            float fM5520g = AbstractC3261c.m5520g(AbstractC3261c.m5519f(interfaceC0376N));
            int iMo646X = interfaceC0376N.mo646X(i5);
            if (fM5520g == 0.0f) {
                i6 += iMo646X;
            } else if (fM5520g > 0.0f) {
                f2 += fM5520g;
                iMax = Math.max(iMax, Math.round(iMo646X / fM5520g));
            }
        }
        return ((list.size() - 1) * iMo270S) + Math.round(iMax * f2) + i6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p244u.InterfaceC3253W
    /* JADX INFO: renamed from: g */
    public final long mo5502g(int i5, int i6, int i7, boolean z5) {
        return !z5 ? AbstractC2006b.m3684a(i5, i6, 0, i7) : AbstractC1784a.m3233s(i5, i6, 0, i7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p029F0.InterfaceC0377O
    /* JADX INFO: renamed from: h */
    public final int mo653h(InterfaceC0420q interfaceC0420q, List list, int i5) {
        int iMo270S = interfaceC0420q.mo270S(this.f10072a.mo5542a());
        if (list.isEmpty()) {
            return 0;
        }
        int iMin = Math.min((list.size() - 1) * iMo270S, i5);
        int size = list.size();
        int iMax = 0;
        float f2 = 0.0f;
        for (int i6 = 0; i6 < size; i6++) {
            InterfaceC0376N interfaceC0376N = (InterfaceC0376N) list.get(i6);
            float fM5520g = AbstractC3261c.m5520g(AbstractC3261c.m5519f(interfaceC0376N));
            if (fM5520g == 0.0f) {
                int iMin2 = Math.min(interfaceC0376N.mo646X(Integer.MAX_VALUE), i5 == Integer.MAX_VALUE ? Integer.MAX_VALUE : i5 - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, interfaceC0376N.mo647Z(iMin2));
            } else if (fM5520g > 0.0f) {
                f2 += fM5520g;
            }
        }
        int iRound = f2 == 0.0f ? 0 : i5 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(i5 - iMin, 0) / f2);
        int size2 = list.size();
        for (int i7 = 0; i7 < size2; i7++) {
            InterfaceC0376N interfaceC0376N2 = (InterfaceC0376N) list.get(i7);
            float fM5520g2 = AbstractC3261c.m5520g(AbstractC3261c.m5519f(interfaceC0376N2));
            if (fM5520g2 > 0.0f) {
                iMax = Math.max(iMax, interfaceC0376N2.mo647Z(iRound != Integer.MAX_VALUE ? Math.round(iRound * fM5520g2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f10073b.hashCode() + (this.f10072a.hashCode() * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p029F0.InterfaceC0377O
    /* JADX INFO: renamed from: i */
    public final InterfaceC0378P mo16i(InterfaceC0379Q interfaceC0379Q, List list, long j5) {
        return AbstractC3261c.m5525l(this, C2005a.m3682j(j5), C2005a.m3681i(j5), C2005a.m3680h(j5), C2005a.m3679g(j5), interfaceC0379Q.mo270S(this.f10072a.mo5542a()), interfaceC0379Q, list, new AbstractC0391b0[list.size()], list.size());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p244u.InterfaceC3253W
    /* JADX INFO: renamed from: j */
    public final int mo5503j(AbstractC0391b0 abstractC0391b0) {
        return abstractC0391b0.f1207e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "RowMeasurePolicy(horizontalArrangement=" + this.f10072a + ", verticalAlignment=" + this.f10073b + ')';
    }
}
