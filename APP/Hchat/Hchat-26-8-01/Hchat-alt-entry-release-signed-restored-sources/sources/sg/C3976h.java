package sg;

import gg.AbstractC1416l;

/* JADX INFO: renamed from: sg.h */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3976h extends C3977i {

    /* JADX INFO: renamed from: a */
    public final Throwable f13019a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3976h(Throwable th2) {
        this.f13019a = th2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (obj instanceof C3976h) {
            return AbstractC1416l.m3825a(this.f13019a, ((C3976h) obj).f13019a);
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        Throwable th2 = this.f13019a;
        if (th2 != null) {
            return th2.hashCode();
        }
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // sg.C3977i
    public final String toString() {
        return "Closed(" + this.f13019a + ')';
    }
}
