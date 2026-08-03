package p332wb;

/* JADX INFO: renamed from: wb.jq */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5021jq extends AbstractC5120mq {

    /* JADX INFO: renamed from: a */
    public final C4737b3 f18211a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C5021jq(C4737b3 c4737b3) {
        this.f18211a = c4737b3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C5021jq) && this.f18211a.equals(((C5021jq) obj).f18211a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f18211a.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "FavoritePicker(request=" + this.f18211a + ")";
    }
}
