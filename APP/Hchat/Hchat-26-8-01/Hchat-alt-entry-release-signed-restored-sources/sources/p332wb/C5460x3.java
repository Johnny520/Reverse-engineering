package p332wb;

/* JADX INFO: renamed from: wb.x3 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5460x3 extends AbstractC4738b4 {

    /* JADX INFO: renamed from: a */
    public final C5391v0 f21847a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C5460x3(C5391v0 c5391v0) {
        this.f21847a = c5391v0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C5460x3) && this.f21847a.equals(((C5460x3) obj).f21847a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f21847a.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "ContactPicker(request=" + this.f21847a + ")";
    }
}
