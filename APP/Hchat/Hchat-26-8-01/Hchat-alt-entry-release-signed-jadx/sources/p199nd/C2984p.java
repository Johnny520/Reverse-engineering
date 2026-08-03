package p199nd;

import p351xe.AbstractC5798s;

/* JADX INFO: renamed from: nd.p */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2984p implements Comparable {

    /* JADX INFO: renamed from: g */
    public final String f9748g;

    /* JADX INFO: renamed from: h */
    public final Throwable f9749h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2984p(String str, Throwable th2) {
        this.f9748g = str;
        this.f9749h = th2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f9748g.compareTo(((C2984p) obj).f9748g);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2984p.class != obj.getClass()) {
            return false;
        }
        return this.f9748g.equals(((C2984p) obj).f9748g);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f9748g.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("JadxError: ");
        sb2.append(this.f9748g);
        sb2.append(' ');
        Throwable th2 = this.f9749h;
        if (th2 != null) {
            sb2.append(th2.getClass());
            sb2.append(':');
            sb2.append(th2.getMessage());
            sb2.append('\n');
            sb2.append(AbstractC5798s.m10513g(th2));
        }
        return sb2.toString();
    }
}
