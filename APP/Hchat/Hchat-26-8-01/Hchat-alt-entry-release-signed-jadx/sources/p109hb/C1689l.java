package p109hb;

import java.util.List;

/* JADX INFO: renamed from: hb.l */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1689l {

    /* JADX INFO: renamed from: a */
    public final List f5613a;

    /* JADX INFO: renamed from: b */
    public final long f5614b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1689l(List list, long j3) {
        this.f5613a = list;
        this.f5614b = j3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final boolean m4306a() {
        return !this.f5613a.isEmpty() && System.currentTimeMillis() - this.f5614b <= 300000;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1689l)) {
            return false;
        }
        C1689l c1689l = (C1689l) obj;
        return this.f5613a.equals(c1689l.f5613a) && this.f5614b == c1689l.f5614b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Long.hashCode(this.f5614b) + (this.f5613a.hashCode() * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "CachedContacts(items=" + this.f5613a + ", savedAt=" + this.f5614b + ")";
    }
}
