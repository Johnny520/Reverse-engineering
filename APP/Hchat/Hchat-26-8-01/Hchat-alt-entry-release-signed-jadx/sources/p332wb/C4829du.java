package p332wb;

/* JADX INFO: renamed from: wb.du */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4829du extends AbstractC4862eu {

    /* JADX INFO: renamed from: a */
    public final C4737b3 f16732a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4829du(C4737b3 c4737b3) {
        this.f16732a = c4737b3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4829du) && this.f16732a.equals(((C4829du) obj).f16732a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f16732a.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "FavoritePicker(request=" + this.f16732a + ")";
    }
}
