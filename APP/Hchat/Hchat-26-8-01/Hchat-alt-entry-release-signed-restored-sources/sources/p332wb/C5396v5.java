package p332wb;

/* JADX INFO: renamed from: wb.v5 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5396v5 extends AbstractC4740b6 {

    /* JADX INFO: renamed from: a */
    public final C4969i5 f21276a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C5396v5(C4969i5 c4969i5) {
        this.f21276a = c4969i5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C5396v5) && this.f21276a.equals(((C5396v5) obj).f21276a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f21276a.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "BindingEditor(request=" + this.f21276a + ")";
    }
}
