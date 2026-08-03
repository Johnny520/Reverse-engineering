package p332wb;

import gg.AbstractC1416l;

/* JADX INFO: renamed from: wb.t2 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5327t2 extends AbstractC5459x2 {

    /* JADX INFO: renamed from: a */
    public final C4770c3 f20742a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C5327t2(C4770c3 c4770c3) {
        c4770c3.getClass();
        this.f20742a = c4770c3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C5327t2) && AbstractC1416l.m3825a(this.f20742a, ((C5327t2) obj).f20742a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f20742a.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "FeatureGroup(group=" + this.f20742a + ")";
    }
}
