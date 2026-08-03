package p332wb;

/* JADX INFO: renamed from: wb.z */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5520z extends AbstractC4701a0 {

    /* JADX INFO: renamed from: a */
    public final C5157nu f22308a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C5520z(C5157nu c5157nu) {
        this.f22308a = c5157nu;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C5520z) && this.f22308a.equals(((C5520z) obj).f22308a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f22308a.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "TemplateEditor(request=" + this.f22308a + ")";
    }
}
