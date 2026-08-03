package p222p;

import gg.C1423s;
import java.util.List;
import p065eb.C0886p;
import p085fg.InterfaceC1231l;
import p119i2.C1955z;
import p276sf.C3967n;
import p293u2.AbstractC4232b;
import p293u2.AbstractC4239i;
import p293u2.C4231a;
import p308v1.AbstractC4374a1;
import p308v1.AbstractC4377b1;
import p308v1.InterfaceC4409m0;
import p308v1.InterfaceC4412n0;
import p308v1.InterfaceC4415o0;
import p308v1.InterfaceC4418p0;
import p356y0.C5845g;
import tf.C4174u;

/* JADX INFO: renamed from: p.q */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3247q implements InterfaceC4412n0 {

    /* JADX INFO: renamed from: a */
    public final C5845g f10349a;

    /* JADX INFO: renamed from: b */
    public final boolean f10350b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3247q(C5845g c5845g, boolean z9) {
        this.f10349a = c5845g;
        this.f10350b = z9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3247q)) {
            return false;
        }
        C3247q c3247q = (C3247q) obj;
        return this.f10349a.equals(c3247q.f10349a) && this.f10350b == c3247q.f10350b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p308v1.InterfaceC4412n0
    /* JADX INFO: renamed from: h */
    public final InterfaceC4415o0 mo3994h(final InterfaceC4418p0 interfaceC4418p0, List list, long j3) {
        int iM8506j;
        int iM8505i;
        AbstractC4377b1 abstractC4377b1Mo8831Q;
        boolean zIsEmpty = list.isEmpty();
        C4174u c4174u = C4174u.f13711g;
        if (zIsEmpty) {
            return interfaceC4418p0.mo8010z(C4231a.m8506j(j3), C4231a.m8505i(j3), c4174u, new C1955z(14));
        }
        long j4 = this.f10350b ? j3 : j3 & (-8589934589L);
        if (list.size() == 1) {
            final InterfaceC4409m0 interfaceC4409m0 = (InterfaceC4409m0) list.get(0);
            Object objMo8824X = interfaceC4409m0.mo8824X();
            C3232l c3232l = objMo8824X instanceof C3232l ? (C3232l) objMo8824X : null;
            if (c3232l != null ? c3232l.f10316v : false) {
                iM8506j = C4231a.m8506j(j3);
                iM8505i = C4231a.m8505i(j3);
                int iM8506j2 = C4231a.m8506j(j3);
                int iM8505i2 = C4231a.m8505i(j3);
                if (!((iM8505i2 >= 0) & (iM8506j2 >= 0))) {
                    AbstractC4239i.m8525a("width and height must be >= 0");
                }
                abstractC4377b1Mo8831Q = interfaceC4409m0.mo8831Q(AbstractC4232b.m8515h(iM8506j2, iM8506j2, iM8505i2, iM8505i2));
            } else {
                abstractC4377b1Mo8831Q = interfaceC4409m0.mo8831Q(j4);
                iM8506j = Math.max(C4231a.m8506j(j3), abstractC4377b1Mo8831Q.f14593g);
                iM8505i = Math.max(C4231a.m8505i(j3), abstractC4377b1Mo8831Q.f14594h);
            }
            final int i9 = iM8505i;
            final int i10 = iM8506j;
            final AbstractC4377b1 abstractC4377b1 = abstractC4377b1Mo8831Q;
            return interfaceC4418p0.mo8010z(i10, i9, c4174u, new InterfaceC1231l() { // from class: p.p
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // p085fg.InterfaceC1231l
                public final Object invoke(Object obj) {
                    AbstractC3241o.m6928b((AbstractC4374a1) obj, abstractC4377b1, interfaceC4409m0, interfaceC4418p0.getLayoutDirection(), i10, i9, this.f10349a);
                    return C3967n.f12976a;
                }
            });
        }
        AbstractC4377b1[] abstractC4377b1Arr = new AbstractC4377b1[list.size()];
        C1423s c1423s = new C1423s();
        c1423s.f4736g = C4231a.m8506j(j3);
        C1423s c1423s2 = new C1423s();
        c1423s2.f4736g = C4231a.m8505i(j3);
        int size = list.size();
        boolean z9 = false;
        for (int i11 = 0; i11 < size; i11++) {
            InterfaceC4409m0 interfaceC4409m02 = (InterfaceC4409m0) list.get(i11);
            Object objMo8824X2 = interfaceC4409m02.mo8824X();
            C3232l c3232l2 = objMo8824X2 instanceof C3232l ? (C3232l) objMo8824X2 : null;
            if (c3232l2 != null ? c3232l2.f10316v : false) {
                z9 = true;
            } else {
                AbstractC4377b1 abstractC4377b1Mo8831Q2 = interfaceC4409m02.mo8831Q(j4);
                abstractC4377b1Arr[i11] = abstractC4377b1Mo8831Q2;
                c1423s.f4736g = Math.max(c1423s.f4736g, abstractC4377b1Mo8831Q2.f14593g);
                c1423s2.f4736g = Math.max(c1423s2.f4736g, abstractC4377b1Mo8831Q2.f14594h);
            }
        }
        if (z9) {
            int i12 = c1423s.f4736g;
            int i13 = i12 != Integer.MAX_VALUE ? i12 : 0;
            int i14 = c1423s2.f4736g;
            long jM8508a = AbstractC4232b.m8508a(i13, i12, i14 != Integer.MAX_VALUE ? i14 : 0, i14);
            int size2 = list.size();
            for (int i15 = 0; i15 < size2; i15++) {
                InterfaceC4409m0 interfaceC4409m03 = (InterfaceC4409m0) list.get(i15);
                Object objMo8824X3 = interfaceC4409m03.mo8824X();
                C3232l c3232l3 = objMo8824X3 instanceof C3232l ? (C3232l) objMo8824X3 : null;
                if (c3232l3 != null ? c3232l3.f10316v : false) {
                    abstractC4377b1Arr[i15] = interfaceC4409m03.mo8831Q(jM8508a);
                }
            }
        }
        return interfaceC4418p0.mo8010z(c1423s.f4736g, c1423s2.f4736g, c4174u, new C0886p(abstractC4377b1Arr, list, interfaceC4418p0, c1423s, c1423s2, this, 2));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Boolean.hashCode(this.f10350b) + (this.f10349a.hashCode() * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "BoxMeasurePolicy(alignment=" + this.f10349a + ", propagateMinConstraints=" + this.f10350b + ')';
    }
}
