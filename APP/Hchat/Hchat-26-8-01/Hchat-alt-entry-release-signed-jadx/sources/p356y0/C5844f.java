package p356y0;

import p068eh.AbstractC0921a;

/* JADX INFO: renamed from: y0.f */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5844f {

    /* JADX INFO: renamed from: a */
    public final float f23779a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C5844f(float f3) {
        this.f23779a = f3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final int m10546a(int i9, int i10) {
        return Math.round((1 + this.f23779a) * ((i10 - i9) / 2.0f));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C5844f) && Float.compare(this.f23779a, ((C5844f) obj).f23779a) == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Float.hashCode(this.f23779a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return AbstractC0921a.m2252o(new StringBuilder("Vertical(bias="), this.f23779a, ')');
    }
}
