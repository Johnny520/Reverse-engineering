package p153k8;

import gg.AbstractC1416l;

/* JADX INFO: renamed from: k8.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2337a {

    /* JADX INFO: renamed from: a */
    public final Object f7661a;

    /* JADX INFO: renamed from: b */
    public final int f7662b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2337a(Object obj, int i9) {
        obj.getClass();
        this.f7661a = obj;
        this.f7662b = i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2337a)) {
            return false;
        }
        C2337a c2337a = (C2337a) obj;
        return AbstractC1416l.m3825a(this.f7661a, c2337a.f7661a) && this.f7662b == c2337a.f7662b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Integer.hashCode(this.f7662b) + (this.f7661a.hashCode() * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "SearchNode(value=" + this.f7661a + ", depth=" + this.f7662b + ")";
    }
}
