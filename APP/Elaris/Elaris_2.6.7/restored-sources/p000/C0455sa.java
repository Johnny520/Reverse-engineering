package p000;

import java.io.Serializable;

/* JADX INFO: renamed from: sa */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class C0455sa implements Serializable {

    /* JADX INFO: renamed from: a */
    public final Object f859a;

    /* JADX INFO: renamed from: b */
    public final Object f860b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0455sa(Serializable serializable, Serializable serializable2) {
        this.f859a = serializable;
        this.f860b = serializable2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0455sa)) {
            return false;
        }
        C0455sa c0455sa = (C0455sa) obj;
        return AbstractC0260i5.m643p(this.f859a, c0455sa.f859a) && AbstractC0260i5.m643p(this.f860b, c0455sa.f860b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        Object obj = this.f859a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f860b;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "(" + this.f859a + ", " + this.f860b + ')';
    }
}
