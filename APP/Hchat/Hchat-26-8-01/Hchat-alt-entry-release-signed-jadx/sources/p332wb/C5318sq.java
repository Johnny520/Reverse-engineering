package p332wb;

/* JADX INFO: renamed from: wb.sq */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5318sq extends AbstractC5351tq {

    /* JADX INFO: renamed from: a */
    public final C5384uq f20711a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C5318sq(C5384uq c5384uq) {
        this.f20711a = c5384uq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C5318sq) && this.f20711a.equals(((C5318sq) obj).f20711a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f20711a.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "TemplateEditor(request=" + this.f20711a + ")";
    }
}
