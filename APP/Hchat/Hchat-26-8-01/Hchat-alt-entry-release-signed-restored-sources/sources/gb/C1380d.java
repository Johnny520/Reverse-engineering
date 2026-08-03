package gb;

import gg.AbstractC1416l;

/* JADX INFO: renamed from: gb.d */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1380d {

    /* JADX INFO: renamed from: a */
    public final C1379c f4584a;

    /* JADX INFO: renamed from: b */
    public final long f4585b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1380d(C1379c c1379c, long j3) {
        this.f4584a = c1379c;
        this.f4585b = j3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1380d)) {
            return false;
        }
        C1380d c1380d = (C1380d) obj;
        return AbstractC1416l.m3825a(this.f4584a, c1380d.f4584a) && this.f4585b == c1380d.f4585b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        C1379c c1379c = this.f4584a;
        return Long.hashCode(this.f4585b) + ((c1379c == null ? 0 : c1379c.hashCode()) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "PluginMarketCommentMutation(comment=" + this.f4584a + ", commentCount=" + this.f4585b + ")";
    }
}
