package p177m2;

import gg.AbstractC1416l;
import p000a.AbstractC0000a;
import p204o2.AbstractC3042a;
import p222p.AbstractC3199a;

/* JADX INFO: renamed from: m2.k */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2767k implements Comparable {

    /* JADX INFO: renamed from: h */
    public static final C2767k f8998h;

    /* JADX INFO: renamed from: i */
    public static final C2767k f8999i;

    /* JADX INFO: renamed from: j */
    public static final C2767k f9000j;

    /* JADX INFO: renamed from: k */
    public static final C2767k f9001k;

    /* JADX INFO: renamed from: l */
    public static final C2767k f9002l;

    /* JADX INFO: renamed from: g */
    public final int f9003g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        C2767k c2767k = new C2767k(100);
        C2767k c2767k2 = new C2767k(200);
        C2767k c2767k3 = new C2767k(300);
        C2767k c2767k4 = new C2767k(400);
        C2767k c2767k5 = new C2767k(500);
        C2767k c2767k6 = new C2767k(600);
        f8998h = c2767k6;
        C2767k c2767k7 = new C2767k(700);
        C2767k c2767k8 = new C2767k(800);
        C2767k c2767k9 = new C2767k(900);
        f8999i = c2767k4;
        f9000j = c2767k5;
        f9001k = c2767k6;
        f9002l = c2767k7;
        AbstractC0000a.m101y0(c2767k, c2767k2, c2767k3, c2767k4, c2767k5, c2767k6, c2767k7, c2767k8, c2767k9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2767k(int i9) {
        this.f9003g = i9;
        boolean z9 = false;
        if (1 <= i9 && i9 < 1001) {
            z9 = true;
        }
        if (z9) {
            return;
        }
        AbstractC3042a.m6486a("Font weight can be in range [1, 1000]. Current value: " + i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return AbstractC1416l.m3827c(this.f9003g, ((C2767k) obj).f9003g);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2767k) {
            return this.f9003g == ((C2767k) obj).f9003g;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f9003g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return AbstractC3199a.m6841n(new StringBuilder("FontWeight(weight="), this.f9003g, ')');
    }
}
