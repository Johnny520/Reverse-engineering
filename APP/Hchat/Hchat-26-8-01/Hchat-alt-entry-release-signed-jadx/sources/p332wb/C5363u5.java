package p332wb;

/* JADX INFO: renamed from: wb.u5 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5363u5 extends AbstractC4740b6 {

    /* JADX INFO: renamed from: a */
    public final C4936h5 f20992a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C5363u5(C4936h5 c4936h5) {
        this.f20992a = c4936h5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C5363u5) && this.f20992a.equals(((C5363u5) obj).f20992a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f20992a.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "BatchBindingEditor(request=" + this.f20992a + ")";
    }
}
