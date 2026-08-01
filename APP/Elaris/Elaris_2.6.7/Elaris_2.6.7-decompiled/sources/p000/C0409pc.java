package p000;

import java.io.Serializable;

/* JADX INFO: renamed from: pc */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class C0409pc implements Serializable {

    /* JADX INFO: renamed from: a */
    public final Throwable f721a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0409pc(Throwable th) {
        th.getClass();
        this.f721a = th;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (obj instanceof C0409pc) {
            return AbstractC0260i5.m643p(this.f721a, ((C0409pc) obj).f721a);
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f721a.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "Failure(" + this.f721a + ')';
    }
}
