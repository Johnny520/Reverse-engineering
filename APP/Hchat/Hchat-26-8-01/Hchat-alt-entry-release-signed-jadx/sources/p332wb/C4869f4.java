package p332wb;

import gg.AbstractC1416l;

/* JADX INFO: renamed from: wb.f4 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4869f4 extends AbstractC4902g4 {

    /* JADX INFO: renamed from: a */
    public final C5292s0 f17049a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4869f4(C5292s0 c5292s0) {
        c5292s0.getClass();
        this.f17049a = c5292s0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4869f4) && AbstractC1416l.m3825a(this.f17049a, ((C4869f4) obj).f17049a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f17049a.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "Members(group=" + this.f17049a + ")";
    }
}
