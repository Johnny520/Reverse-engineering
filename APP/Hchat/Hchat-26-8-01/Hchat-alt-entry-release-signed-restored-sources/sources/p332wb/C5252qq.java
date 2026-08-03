package p332wb;

/* JADX INFO: renamed from: wb.qq */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5252qq extends AbstractC5351tq {

    /* JADX INFO: renamed from: a */
    public final C4792cp f20285a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C5252qq(C4792cp c4792cp) {
        this.f20285a = c4792cp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C5252qq) && this.f20285a.equals(((C5252qq) obj).f20285a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f20285a.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "OptionPicker(request=" + this.f20285a + ")";
    }
}
