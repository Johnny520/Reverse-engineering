package p332wb;

/* JADX INFO: renamed from: wb.gu */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4928gu extends AbstractC4992iu {

    /* JADX INFO: renamed from: a */
    public final C5391v0 f17500a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4928gu(C5391v0 c5391v0) {
        this.f17500a = c5391v0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4928gu) && this.f17500a.equals(((C4928gu) obj).f17500a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f17500a.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "ContactPicker(request=" + this.f17500a + ")";
    }
}
