package p000;

import java.io.Serializable;

/* JADX INFO: renamed from: qc */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class C0425qc implements Serializable {

    /* JADX INFO: renamed from: a */
    public final Object f766a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static final Throwable m819a(Object obj) {
        if (obj instanceof C0409pc) {
            return ((C0409pc) obj).f721a;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static String m820b(Object obj) {
        if (obj instanceof C0409pc) {
            return ((C0409pc) obj).toString();
        }
        return "Success(" + obj + ')';
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (obj instanceof C0425qc) {
            return AbstractC0260i5.m643p(this.f766a, ((C0425qc) obj).f766a);
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        Object obj = this.f766a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return m820b(this.f766a);
    }
}
