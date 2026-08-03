package tf;

import gg.AbstractC1416l;

/* JADX INFO: renamed from: tf.w */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4176w {

    /* JADX INFO: renamed from: a */
    public final int f13713a;

    /* JADX INFO: renamed from: b */
    public final Object f13714b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4176w(int i9, Object obj) {
        this.f13713a = i9;
        this.f13714b = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4176w)) {
            return false;
        }
        C4176w c4176w = (C4176w) obj;
        return this.f13713a == c4176w.f13713a && AbstractC1416l.m3825a(this.f13714b, c4176w.f13714b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f13713a) * 31;
        Object obj = this.f13714b;
        return iHashCode + (obj == null ? 0 : obj.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "IndexedValue(index=" + this.f13713a + ", value=" + this.f13714b + ')';
    }
}
