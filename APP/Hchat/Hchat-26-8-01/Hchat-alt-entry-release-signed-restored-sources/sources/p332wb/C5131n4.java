package p332wb;

/* JADX INFO: renamed from: wb.n4 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5131n4 extends AbstractC5230q4 {

    /* JADX INFO: renamed from: a */
    public final C5391v0 f19103a;

    /* JADX INFO: renamed from: b */
    public final boolean f19104b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C5131n4(C5391v0 c5391v0, boolean z9) {
        this.f19103a = c5391v0;
        this.f19104b = z9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5131n4)) {
            return false;
        }
        C5131n4 c5131n4 = (C5131n4) obj;
        return this.f19103a.equals(c5131n4.f19103a) && this.f19104b == c5131n4.f19104b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Boolean.hashCode(this.f19104b) + (this.f19103a.hashCode() * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "ContactPicker(request=" + this.f19103a + ", includeMode=" + this.f19104b + ")";
    }
}
