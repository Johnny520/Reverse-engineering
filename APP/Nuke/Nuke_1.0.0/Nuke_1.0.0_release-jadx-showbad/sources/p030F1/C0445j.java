package p030F1;

import p117X2.AbstractC1665j;
import p179i4.AbstractC2352g;

/* JADX INFO: renamed from: F1.j */
/* JADX INFO: loaded from: classes.dex */
public final class C0445j extends AbstractC2352g {

    /* JADX INFO: renamed from: b */
    public final C0437b f1340b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0445j(C0437b c0437b) {
        AbstractC1665j.m2985e(c0437b, "latestEvent");
        this.f1340b = c0437b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C0445j.class == obj.getClass() && AbstractC1665j.m2981a(this.f1340b, ((C0445j) obj).f1340b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f1340b.hashCode() - 31;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "InProgress(latestEvent=" + this.f1340b + ", direction=-1)";
    }
}
