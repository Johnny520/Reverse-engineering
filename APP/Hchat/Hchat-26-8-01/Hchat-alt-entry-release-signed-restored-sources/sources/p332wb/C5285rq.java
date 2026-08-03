package p332wb;

/* JADX INFO: renamed from: wb.rq */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5285rq extends AbstractC5351tq {

    /* JADX INFO: renamed from: a */
    public final C5132n5 f20520a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C5285rq(C5132n5 c5132n5) {
        this.f20520a = c5132n5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C5285rq) && this.f20520a.equals(((C5285rq) obj).f20520a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f20520a.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "RuleContactPicker(request=" + this.f20520a + ")";
    }
}
