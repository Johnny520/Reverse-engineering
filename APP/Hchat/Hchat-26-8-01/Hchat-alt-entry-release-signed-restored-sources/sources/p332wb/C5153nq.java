package p332wb;

/* JADX INFO: renamed from: wb.nq */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5153nq extends AbstractC5351tq {

    /* JADX INFO: renamed from: a */
    public final C4957hq f19283a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C5153nq(C4957hq c4957hq) {
        this.f19283a = c4957hq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C5153nq) && this.f19283a.equals(((C5153nq) obj).f19283a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f19283a.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "BindingEditor(request=" + this.f19283a + ")";
    }
}
