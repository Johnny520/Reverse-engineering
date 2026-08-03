package p276sf;

import gg.AbstractC1416l;
import java.io.Serializable;

/* JADX INFO: renamed from: sf.f */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3959f implements Serializable {

    /* JADX INFO: renamed from: g */
    public final Throwable f12963g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3959f(Throwable th2) {
        th2.getClass();
        this.f12963g = th2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (obj instanceof C3959f) {
            return AbstractC1416l.m3825a(this.f12963g, ((C3959f) obj).f12963g);
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f12963g.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "Failure(" + this.f12963g + ')';
    }
}
