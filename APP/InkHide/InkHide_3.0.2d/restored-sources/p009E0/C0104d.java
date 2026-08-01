package p009E0;

import java.io.Serializable;
import p027N0.AbstractC0223g;

/* JADX INFO: renamed from: E0.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0104d implements Serializable {

    /* JADX INFO: renamed from: a */
    public final Throwable f396a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0104d(Throwable th) {
        this.f396a = th;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (obj instanceof C0104d) {
            return AbstractC0223g.m414a(this.f396a, ((C0104d) obj).f396a);
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f396a.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "Failure(" + this.f396a + ')';
    }
}
