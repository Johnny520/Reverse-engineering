package p119i2;

import gg.AbstractC1416l;

/* JADX INFO: renamed from: i2.x */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1953x {

    /* JADX INFO: renamed from: a */
    public final C1952w f6619a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1953x(C1952w c1952w) {
        this.f6619a = c1952w;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1953x) {
            return AbstractC1416l.m3825a(this.f6619a, ((C1953x) obj).f6619a);
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        C1952w c1952w = this.f6619a;
        if (c1952w != null) {
            return c1952w.hashCode();
        }
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "PlatformTextStyle(spanStyle=null, paragraphSyle=" + this.f6619a + ')';
    }
}
