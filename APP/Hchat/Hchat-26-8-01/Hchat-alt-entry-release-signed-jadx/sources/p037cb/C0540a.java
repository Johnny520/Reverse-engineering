package p037cb;

import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: cb.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0540a {

    /* JADX INFO: renamed from: a */
    public final float f1705a;

    /* JADX INFO: renamed from: b */
    public final WeakReference f1706b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0540a(float f3, WeakReference weakReference) {
        this.f1705a = f3;
        this.f1706b = weakReference;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0540a)) {
            return false;
        }
        C0540a c0540a = (C0540a) obj;
        return Float.compare(this.f1705a, c0540a.f1705a) == 0 && this.f1706b.equals(c0540a.f1706b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f1706b.hashCode() + (Float.hashCode(this.f1705a) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "CacheEntry(factor=" + this.f1705a + ", bitmap=" + this.f1706b + ")";
    }
}
