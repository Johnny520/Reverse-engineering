package p244u;

import java.util.List;
import p029F0.AbstractC0389a0;
import p029F0.AbstractC0391b0;
import p029F0.InterfaceC0376N;
import p029F0.InterfaceC0377O;
import p029F0.InterfaceC0378P;
import p029F0.InterfaceC0379Q;
import p029F0.InterfaceC0420q;
import p056K2.C0891q;
import p061L2.C0982v;
import p112W2.InterfaceC1601c;
import p117X2.AbstractC1665j;
import p127Z2.AbstractC1784a;
import p153e1.AbstractC2006b;
import p153e1.C2005a;
import p153e1.EnumC2017m;
import p169h0.C2197f;

/* JADX INFO: renamed from: u.v */
/* JADX INFO: loaded from: classes.dex */
public final class C3289v implements InterfaceC0377O, InterfaceC3253W {

    /* JADX INFO: renamed from: a */
    public final InterfaceC3271h f10171a;

    /* JADX INFO: renamed from: b */
    public final C2197f f10172b;

    public C3289v(InterfaceC3271h interfaceC3271h, C2197f c2197f) {
        this.f10171a = interfaceC3271h;
        this.f10172b = c2197f;
    }

    @Override // p029F0.InterfaceC0377O
    /* JADX INFO: renamed from: a */
    public final int mo651a(InterfaceC0420q interfaceC0420q, List list, int i5) {
        int iMo270S = interfaceC0420q.mo270S(this.f10171a.mo5542a());
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
            int iMo649f = interfaceC0376N.mo649f(i5);
            if (fM5520g == 0.0f) {
                i6 += iMo649f;
            } else if (fM5520g > 0.0f) {
                f2 += fM5520g;
                iMax = Math.max(iMax, Math.round(iMo649f / fM5520g));
            }
        }
        return ((list.size() - 1) * iMo270S) + Math.round(iMax * f2) + i6;
    }

    @Override // p244u.InterfaceC3253W
    /* JADX INFO: renamed from: b */
    public final InterfaceC0378P mo5499b(final AbstractC0391b0[] abstractC0391b0Arr, final InterfaceC0379Q interfaceC0379Q, final int[] iArr, int i5, final int i6) {
        return interfaceC0379Q.mo604f0(i6, i5, C0982v.f3048d, new InterfaceC1601c() { // from class: u.u
            @Override // p112W2.InterfaceC1601c
            /* JADX INFO: renamed from: h */
            public final Object mo1h(Object obj) {
                AbstractC0389a0 abstractC0389a0 = (AbstractC0389a0) obj;
                AbstractC0391b0[] abstractC0391b0Arr2 = abstractC0391b0Arr;
                int length = abstractC0391b0Arr2.length;
                int i7 = 0;
                int i8 = 0;
                while (i7 < length) {
                    AbstractC0391b0 abstractC0391b0 = abstractC0391b0Arr2[i7];
                    int i9 = i8 + 1;
                    AbstractC1665j.m2982b(abstractC0391b0);
                    Object objMo650l = abstractC0391b0.mo650l();
                    C3254X c3254x = objMo650l instanceof C3254X ? (C3254X) objMo650l : null;
                    EnumC2017m layoutDirection = interfaceC0379Q.getLayoutDirection();
                    C3291x c3291x = c3254x != null ? c3254x.f10070c : null;
                    int i10 = i6;
                    AbstractC0389a0.m658i(abstractC0389a0, abstractC0391b0, c3291x != null ? c3291x.f10174a.m4018a(abstractC0391b0.f1206d, i10, layoutDirection) : this.f10172b.m4018a(abstractC0391b0.f1206d, i10, layoutDirection), iArr[i8]);
                    i7++;
                    i8 = i9;
                }
                return C0891q.f2780a;
            }
        });
    }

    @Override // p244u.InterfaceC3253W
    /* JADX INFO: renamed from: c */
    public final int mo5500c(AbstractC0391b0 abstractC0391b0) {
        return abstractC0391b0.f1207e;
    }

    @Override // p244u.InterfaceC3253W
    /* JADX INFO: renamed from: d */
    public final void mo5501d(int i5, InterfaceC0379Q interfaceC0379Q, int[] iArr, int[] iArr2) {
        this.f10171a.mo5541c(i5, interfaceC0379Q, iArr, iArr2);
    }

    @Override // p029F0.InterfaceC0377O
    /* JADX INFO: renamed from: e */
    public final int mo652e(InterfaceC0420q interfaceC0420q, List list, int i5) {
        int iMo270S = interfaceC0420q.mo270S(this.f10171a.mo5542a());
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
                int iMin2 = Math.min(interfaceC0376N.mo649f(Integer.MAX_VALUE), i5 == Integer.MAX_VALUE ? Integer.MAX_VALUE : i5 - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, interfaceC0376N.mo645T(iMin2));
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
                iMax = Math.max(iMax, interfaceC0376N2.mo645T(iRound != Integer.MAX_VALUE ? Math.round(iRound * fM5520g2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3289v)) {
            return false;
        }
        C3289v c3289v = (C3289v) obj;
        return this.f10171a.equals(c3289v.f10171a) && this.f10172b.equals(c3289v.f10172b);
    }

    @Override // p029F0.InterfaceC0377O
    /* JADX INFO: renamed from: f */
    public final int mo15f(InterfaceC0420q interfaceC0420q, List list, int i5) {
        int iMo270S = interfaceC0420q.mo270S(this.f10171a.mo5542a());
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
                int iMin2 = Math.min(interfaceC0376N.mo649f(Integer.MAX_VALUE), i5 == Integer.MAX_VALUE ? Integer.MAX_VALUE : i5 - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, interfaceC0376N.mo646X(iMin2));
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
                iMax = Math.max(iMax, interfaceC0376N2.mo646X(iRound != Integer.MAX_VALUE ? Math.round(iRound * fM5520g2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    @Override // p244u.InterfaceC3253W
    /* JADX INFO: renamed from: g */
    public final long mo5502g(int i5, int i6, int i7, boolean z5) {
        return !z5 ? AbstractC2006b.m3684a(0, i7, i5, i6) : AbstractC1784a.m3232r(0, i7, i5, i6);
    }

    @Override // p029F0.InterfaceC0377O
    /* JADX INFO: renamed from: h */
    public final int mo653h(InterfaceC0420q interfaceC0420q, List list, int i5) {
        int iMo270S = interfaceC0420q.mo270S(this.f10171a.mo5542a());
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
            int iMo647Z = interfaceC0376N.mo647Z(i5);
            if (fM5520g == 0.0f) {
                i6 += iMo647Z;
            } else if (fM5520g > 0.0f) {
                f2 += fM5520g;
                iMax = Math.max(iMax, Math.round(iMo647Z / fM5520g));
            }
        }
        return ((list.size() - 1) * iMo270S) + Math.round(iMax * f2) + i6;
    }

    public final int hashCode() {
        return Float.hashCode(this.f10172b.f7176a) + (this.f10171a.hashCode() * 31);
    }

    @Override // p029F0.InterfaceC0377O
    /* JADX INFO: renamed from: i */
    public final InterfaceC0378P mo16i(InterfaceC0379Q interfaceC0379Q, List list, long j5) {
        return AbstractC3261c.m5525l(this, C2005a.m3681i(j5), C2005a.m3682j(j5), C2005a.m3679g(j5), C2005a.m3680h(j5), interfaceC0379Q.mo270S(this.f10171a.mo5542a()), interfaceC0379Q, list, new AbstractC0391b0[list.size()], list.size());
    }

    @Override // p244u.InterfaceC3253W
    /* JADX INFO: renamed from: j */
    public final int mo5503j(AbstractC0391b0 abstractC0391b0) {
        return abstractC0391b0.f1206d;
    }

    public final String toString() {
        return "ColumnMeasurePolicy(verticalArrangement=" + this.f10171a + ", horizontalAlignment=" + this.f10172b + ')';
    }
}
