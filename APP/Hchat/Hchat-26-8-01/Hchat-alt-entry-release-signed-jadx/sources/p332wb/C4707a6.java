package p332wb;

/* JADX INFO: renamed from: wb.a6 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4707a6 extends AbstractC4740b6 {

    /* JADX INFO: renamed from: a */
    public final C4806d6 f15715a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4707a6(C4806d6 c4806d6) {
        this.f15715a = c4806d6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4707a6) && this.f15715a.equals(((C4707a6) obj).f15715a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f15715a.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "TemplateEditor(request=" + this.f15715a + ")";
    }
}
