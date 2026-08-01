package p095T;

import java.util.Iterator;
import p117X2.AbstractC1665j;
import p122Y2.InterfaceC1766a;
import p163g0.InterfaceC2171c;

/* JADX INFO: renamed from: T.J0 */
/* JADX INFO: loaded from: classes.dex */
public final class C1320J0 implements InterfaceC2171c, Iterable, InterfaceC1766a {

    /* JADX INFO: renamed from: d */
    public final C1318I0 f4717d;

    /* JADX INFO: renamed from: e */
    public final int f4718e;

    /* JADX INFO: renamed from: f */
    public final int f4719f;

    public C1320J0(C1318I0 c1318i0, int i5, int i6) {
        this.f4717d = c1318i0;
        this.f4718e = i5;
        this.f4719f = i6;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1320J0)) {
            return false;
        }
        C1320J0 c1320j0 = (C1320J0) obj;
        return c1320j0.f4718e == this.f4718e && c1320j0.f4719f == this.f4719f && AbstractC1665j.m2981a(c1320j0.f4717d, this.f4717d);
    }

    public final int hashCode() {
        return (this.f4717d.hashCode() * 31) + this.f4718e;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        C1318I0 c1318i0 = this.f4717d;
        if (c1318i0.f4712k != this.f4719f) {
            AbstractC1322K0.m2447f();
        }
        int i5 = this.f4718e;
        c1318i0.m2441f(i5);
        return new C1325M(c1318i0, i5 + 1, c1318i0.f4705d[(i5 * 5) + 3] + i5);
    }
}
