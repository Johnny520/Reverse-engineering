package p332wb;

/* JADX INFO: renamed from: wb.lo */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5085lo extends AbstractC5151no {

    /* JADX INFO: renamed from: a */
    public final int f18767a;

    /* JADX INFO: renamed from: b */
    public final C5391v0 f18768b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C5085lo(int i9, C5391v0 c5391v0) {
        this.f18767a = i9;
        this.f18768b = c5391v0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5085lo)) {
            return false;
        }
        C5085lo c5085lo = (C5085lo) obj;
        return this.f18767a == c5085lo.f18767a && this.f18768b.equals(c5085lo.f18768b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f18768b.hashCode() + (Integer.hashCode(this.f18767a) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "ContactPicker(listMode=" + this.f18767a + ", request=" + this.f18768b + ")";
    }
}
