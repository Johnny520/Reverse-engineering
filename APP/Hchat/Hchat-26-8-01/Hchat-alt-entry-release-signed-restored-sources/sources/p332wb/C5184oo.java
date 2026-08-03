package p332wb;

/* JADX INFO: renamed from: wb.oo */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5184oo extends AbstractC5250qo {

    /* JADX INFO: renamed from: a */
    public final C5391v0 f19480a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C5184oo(C5391v0 c5391v0) {
        this.f19480a = c5391v0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C5184oo) && this.f19480a.equals(((C5184oo) obj).f19480a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f19480a.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "ContactPicker(request=" + this.f19480a + ")";
    }
}
