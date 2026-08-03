package p150k5;

import androidx.lifecycle.C0119x;
import p005a5.C0016a;
import p046d6.AbstractC0707d;

/* JADX INFO: renamed from: k5.b */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2245b implements Comparable {

    /* JADX INFO: renamed from: g */
    public final C2270u f7441g;

    /* JADX INFO: renamed from: h */
    public final int f7442h;

    /* JADX INFO: renamed from: i */
    public final int f7443i;

    /* JADX INFO: renamed from: j */
    public final int f7444j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2245b(C2270u c2270u, int i9) {
        this.f7441g = c2270u;
        C0119x c0119x = c2270u.f7532b;
        c0119x.getClass();
        C0016a c0016a = new C0016a(i9, 5, c0119x);
        this.f7442h = c0016a.m210n();
        this.f7443i = c0016a.m211o(false);
        this.f7444j = c0016a.f55h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final C2243a m5493a() {
        C0119x c0119x = this.f7441g.f7532b;
        c0119x.getClass();
        C0016a c0016a = new C0016a(this.f7444j, 5, c0119x);
        return new C2243a(this, c0119x, c0016a.f55h, c0016a.m211o(false), 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C2245b c2245b = (C2245b) obj;
        int iCompare = Integer.compare(this.f7442h, c2245b.f7442h);
        if (iCompare != 0) {
            return iCompare;
        }
        int iCompareTo = getType().compareTo(c2245b.getType());
        return iCompareTo != 0 ? iCompareTo : AbstractC0707d.m1876c(m5493a(), c2245b.m5493a());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (!(obj instanceof C2245b)) {
            return false;
        }
        C2245b c2245b = (C2245b) obj;
        return this.f7442h == c2245b.f7442h && getType().equals(c2245b.getType()) && m5493a().equals(c2245b.m5493a());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String getType() {
        return this.f7441g.f7549s.m5521b(this.f7443i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return m5493a().hashCode() + ((getType().hashCode() + (this.f7442h * 31)) * 31);
    }
}
