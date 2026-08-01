package p244u;

import java.util.List;
import p029F0.AbstractC0389a0;
import p029F0.AbstractC0391b0;
import p029F0.InterfaceC0376N;
import p029F0.InterfaceC0377O;
import p029F0.InterfaceC0378P;
import p029F0.InterfaceC0379Q;
import p056K2.C0891q;
import p061L2.C0982v;
import p112W2.InterfaceC1601c;
import p117X2.AbstractC1665j;
import p117X2.C1673r;
import p153e1.AbstractC2006b;
import p153e1.AbstractC2013i;
import p153e1.C2005a;
import p169h0.InterfaceC2195d;
import p203n.C2654f0;

/* JADX INFO: renamed from: u.r */
/* JADX INFO: loaded from: classes.dex */
public final class C3285r implements InterfaceC0377O {

    /* JADX INFO: renamed from: a */
    public final InterfaceC2195d f10162a;

    /* JADX INFO: renamed from: b */
    public final boolean f10163b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3285r(InterfaceC2195d interfaceC2195d, boolean z5) {
        this.f10162a = interfaceC2195d;
        this.f10163b = z5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3285r)) {
            return false;
        }
        C3285r c3285r = (C3285r) obj;
        return AbstractC1665j.m2981a(this.f10162a, c3285r.f10162a) && this.f10163b == c3285r.f10163b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Boolean.hashCode(this.f10163b) + (this.f10162a.hashCode() * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p029F0.InterfaceC0377O
    /* JADX INFO: renamed from: i */
    public final InterfaceC0378P mo16i(final InterfaceC0379Q interfaceC0379Q, final List list, long j5) {
        int iM3682j;
        int iM3681i;
        AbstractC0391b0 abstractC0391b0Mo648e;
        boolean zIsEmpty = list.isEmpty();
        C0982v c0982v = C0982v.f3048d;
        if (zIsEmpty) {
            return interfaceC0379Q.mo604f0(C2005a.m3682j(j5), C2005a.m3681i(j5), c0982v, new C2654f0(22));
        }
        long j6 = this.f10163b ? j5 : j5 & (-8589934589L);
        if (list.size() == 1) {
            final InterfaceC0376N interfaceC0376N = (InterfaceC0376N) list.get(0);
            Object objMo650l = interfaceC0376N.mo650l();
            C3280m c3280m = objMo650l instanceof C3280m ? (C3280m) objMo650l : null;
            if (c3280m != null ? c3280m.f10143s : false) {
                iM3682j = C2005a.m3682j(j5);
                iM3681i = C2005a.m3681i(j5);
                int iM3682j2 = C2005a.m3682j(j5);
                int iM3681i2 = C2005a.m3681i(j5);
                if (!((iM3681i2 >= 0) & (iM3682j2 >= 0))) {
                    AbstractC2013i.m3698a("width and height must be >= 0");
                }
                abstractC0391b0Mo648e = interfaceC0376N.mo648e(AbstractC2006b.m3691h(iM3682j2, iM3682j2, iM3681i2, iM3681i2));
            } else {
                abstractC0391b0Mo648e = interfaceC0376N.mo648e(j6);
                iM3682j = Math.max(C2005a.m3682j(j5), abstractC0391b0Mo648e.f1206d);
                iM3681i = Math.max(C2005a.m3681i(j5), abstractC0391b0Mo648e.f1207e);
            }
            final int i5 = iM3681i;
            final int i6 = iM3682j;
            final AbstractC0391b0 abstractC0391b0 = abstractC0391b0Mo648e;
            return interfaceC0379Q.mo604f0(i6, i5, c0982v, new InterfaceC1601c() { // from class: u.p
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // p112W2.InterfaceC1601c
                /* JADX INFO: renamed from: h */
                public final Object mo1h(Object obj) {
                    AbstractC3282o.m5559b((AbstractC0389a0) obj, abstractC0391b0, interfaceC0376N, interfaceC0379Q.getLayoutDirection(), i6, i5, this.f10162a);
                    return C0891q.f2780a;
                }
            });
        }
        final AbstractC0391b0[] abstractC0391b0Arr = new AbstractC0391b0[list.size()];
        final C1673r c1673r = new C1673r();
        c1673r.f5707d = C2005a.m3682j(j5);
        final C1673r c1673r2 = new C1673r();
        c1673r2.f5707d = C2005a.m3681i(j5);
        int size = list.size();
        boolean z5 = false;
        for (int i7 = 0; i7 < size; i7++) {
            InterfaceC0376N interfaceC0376N2 = (InterfaceC0376N) list.get(i7);
            Object objMo650l2 = interfaceC0376N2.mo650l();
            C3280m c3280m2 = objMo650l2 instanceof C3280m ? (C3280m) objMo650l2 : null;
            if (c3280m2 != null ? c3280m2.f10143s : false) {
                z5 = true;
            } else {
                AbstractC0391b0 abstractC0391b0Mo648e2 = interfaceC0376N2.mo648e(j6);
                abstractC0391b0Arr[i7] = abstractC0391b0Mo648e2;
                c1673r.f5707d = Math.max(c1673r.f5707d, abstractC0391b0Mo648e2.f1206d);
                c1673r2.f5707d = Math.max(c1673r2.f5707d, abstractC0391b0Mo648e2.f1207e);
            }
        }
        if (z5) {
            int i8 = c1673r.f5707d;
            int i9 = i8 != Integer.MAX_VALUE ? i8 : 0;
            int i10 = c1673r2.f5707d;
            long jM3684a = AbstractC2006b.m3684a(i9, i8, i10 != Integer.MAX_VALUE ? i10 : 0, i10);
            int size2 = list.size();
            for (int i11 = 0; i11 < size2; i11++) {
                InterfaceC0376N interfaceC0376N3 = (InterfaceC0376N) list.get(i11);
                Object objMo650l3 = interfaceC0376N3.mo650l();
                C3280m c3280m3 = objMo650l3 instanceof C3280m ? (C3280m) objMo650l3 : null;
                if (c3280m3 != null ? c3280m3.f10143s : false) {
                    abstractC0391b0Arr[i11] = interfaceC0376N3.mo648e(jM3684a);
                }
            }
        }
        return interfaceC0379Q.mo604f0(c1673r.f5707d, c1673r2.f5707d, c0982v, new InterfaceC1601c() { // from class: u.q
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // p112W2.InterfaceC1601c
            /* JADX INFO: renamed from: h */
            public final Object mo1h(Object obj) {
                AbstractC0389a0 abstractC0389a0 = (AbstractC0389a0) obj;
                AbstractC0391b0[] abstractC0391b0Arr2 = abstractC0391b0Arr;
                int length = abstractC0391b0Arr2.length;
                int i12 = 0;
                int i13 = 0;
                while (i13 < length) {
                    int i14 = i12;
                    AbstractC0391b0 abstractC0391b02 = abstractC0391b0Arr2[i13];
                    AbstractC1665j.m2983c(abstractC0391b02, "null cannot be cast to non-null type androidx.compose.ui.layout.Placeable");
                    AbstractC3282o.m5559b(abstractC0389a0, abstractC0391b02, (InterfaceC0376N) list.get(i14), interfaceC0379Q.getLayoutDirection(), c1673r.f5707d, c1673r2.f5707d, this.f10162a);
                    i13++;
                    i12 = i14 + 1;
                }
                return C0891q.f2780a;
            }
        });
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "BoxMeasurePolicy(alignment=" + this.f10162a + ", propagateMinConstraints=" + this.f10163b + ')';
    }
}
