package p110W0;

import p117X2.AbstractC1665j;
import p120Y0.AbstractC1732a;
import p179i4.AbstractC2352g;
import p237s4.AbstractC3202a;

/* JADX INFO: renamed from: W0.l */
/* JADX INFO: loaded from: classes.dex */
public final class C1587l implements Comparable {

    /* JADX INFO: renamed from: e */
    public static final C1587l f5501e;

    /* JADX INFO: renamed from: f */
    public static final C1587l f5502f;

    /* JADX INFO: renamed from: g */
    public static final C1587l f5503g;

    /* JADX INFO: renamed from: h */
    public static final C1587l f5504h;

    /* JADX INFO: renamed from: i */
    public static final C1587l f5505i;

    /* JADX INFO: renamed from: j */
    public static final C1587l f5506j;

    /* JADX INFO: renamed from: d */
    public final int f5507d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        C1587l c1587l = new C1587l(100);
        C1587l c1587l2 = new C1587l(200);
        C1587l c1587l3 = new C1587l(300);
        C1587l c1587l4 = new C1587l(400);
        C1587l c1587l5 = new C1587l(500);
        C1587l c1587l6 = new C1587l(600);
        f5501e = c1587l6;
        C1587l c1587l7 = new C1587l(700);
        C1587l c1587l8 = new C1587l(800);
        C1587l c1587l9 = new C1587l(900);
        f5502f = c1587l4;
        f5503g = c1587l5;
        f5504h = c1587l6;
        f5505i = c1587l7;
        f5506j = c1587l9;
        AbstractC2352g.m4212z(c1587l, c1587l2, c1587l3, c1587l4, c1587l5, c1587l6, c1587l7, c1587l8, c1587l9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1587l(int i5) {
        this.f5507d = i5;
        boolean z5 = false;
        if (1 <= i5 && i5 < 1001) {
            z5 = true;
        }
        if (z5) {
            return;
        }
        AbstractC1732a.m3085a("Font weight can be in range [1, 1000]. Current value: " + i5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return AbstractC1665j.m2987g(this.f5507d, ((C1587l) obj).f5507d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1587l) {
            return this.f5507d == ((C1587l) obj).f5507d;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f5507d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return AbstractC3202a.m5466a(new StringBuilder("FontWeight(weight="), this.f5507d, ')');
    }
}
