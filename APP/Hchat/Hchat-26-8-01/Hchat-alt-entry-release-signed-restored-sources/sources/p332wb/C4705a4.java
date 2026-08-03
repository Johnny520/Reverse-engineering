package p332wb;

/* JADX INFO: renamed from: wb.a4 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4705a4 extends AbstractC4738b4 {

    /* JADX INFO: renamed from: a */
    public final C4771c4 f15710a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4705a4(C4771c4 c4771c4) {
        this.f15710a = c4771c4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4705a4) && this.f15710a.equals(((C4705a4) obj).f15710a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f15710a.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "TemplateEditor(request=" + this.f15710a + ")";
    }
}
