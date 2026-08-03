package p049d9;

import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: d9.b */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0741b {

    /* JADX INFO: renamed from: a */
    public final float f2207a;

    /* JADX INFO: renamed from: b */
    public final WeakReference f2208b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0741b(float f3, WeakReference weakReference) {
        this.f2207a = f3;
        this.f2208b = weakReference;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0741b)) {
            return false;
        }
        C0741b c0741b = (C0741b) obj;
        return Float.compare(this.f2207a, c0741b.f2207a) == 0 && this.f2208b.equals(c0741b.f2208b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f2208b.hashCode() + (Float.hashCode(this.f2207a) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "Entry(factor=" + this.f2207a + ", bitmap=" + this.f2208b + ")";
    }
}
