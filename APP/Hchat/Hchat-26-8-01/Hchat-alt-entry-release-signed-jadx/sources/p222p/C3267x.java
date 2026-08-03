package p222p;

import gg.AbstractC1416l;
import p356y0.C5844f;

/* JADX INFO: renamed from: p.x */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3267x {

    /* JADX INFO: renamed from: a */
    public final C5844f f10409a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3267x(C5844f c5844f) {
        this.f10409a = c5844f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3267x) && AbstractC1416l.m3825a(this.f10409a, ((C3267x) obj).f10409a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Float.hashCode(this.f10409a.f23779a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "VerticalCrossAxisAlignment(vertical=" + this.f10409a + ')';
    }
}
