package p080fb;

import gg.AbstractC1416l;
import p285t7.C4135b;

/* JADX INFO: renamed from: fb.k0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1140k0 {

    /* JADX INFO: renamed from: a */
    public final C4135b f3760a;

    /* JADX INFO: renamed from: b */
    public final C1144l0 f3761b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1140k0(C4135b c4135b, C1144l0 c1144l0) {
        c4135b.getClass();
        c1144l0.getClass();
        this.f3760a = c4135b;
        this.f3761b = c1144l0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1140k0)) {
            return false;
        }
        C1140k0 c1140k0 = (C1140k0) obj;
        return AbstractC1416l.m3825a(this.f3760a, c1140k0.f3760a) && AbstractC1416l.m3825a(this.f3761b, c1140k0.f3761b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f3761b.hashCode() + (this.f3760a.f13628g * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "ResourceHit(resource=" + this.f3760a + ", value=" + this.f3761b + ")";
    }
}
