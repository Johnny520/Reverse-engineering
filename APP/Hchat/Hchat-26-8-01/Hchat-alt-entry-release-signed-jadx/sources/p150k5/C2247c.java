package p150k5;

import p005a5.C0016a;
import p080fb.AbstractC1184v0;
import p327w5.InterfaceC4686a;

/* JADX INFO: renamed from: k5.c */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2247c implements Comparable {

    /* JADX INFO: renamed from: g */
    public final C2270u f7448g;

    /* JADX INFO: renamed from: h */
    public final int f7449h;

    /* JADX INFO: renamed from: i */
    public final InterfaceC4686a f7450i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2247c(C2270u c2270u, C0016a c0016a) {
        this.f7448g = c2270u;
        this.f7449h = c0016a.m211o(false);
        this.f7450i = AbstractC1184v0.m3183J(c2270u, c0016a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final String m5494a() {
        return this.f7448g.f7548r.m5521b(this.f7449h);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final InterfaceC4686a m5495b() {
        return this.f7450i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C2247c c2247c = (C2247c) obj;
        int iCompareTo = m5494a().compareTo(c2247c.m5494a());
        return iCompareTo != 0 ? iCompareTo : m5495b().compareTo(c2247c.m5495b());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C2247c)) {
            return false;
        }
        C2247c c2247c = (C2247c) obj;
        return m5494a().equals(c2247c.m5494a()) && m5495b().equals(c2247c.m5495b());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return m5495b().hashCode() + (m5494a().hashCode() * 31);
    }
}
