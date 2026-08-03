package p332wb;

/* JADX INFO: renamed from: wb.ro */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5283ro extends AbstractC5349to {

    /* JADX INFO: renamed from: a */
    public final int f20508a;

    /* JADX INFO: renamed from: b */
    public final C5391v0 f20509b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C5283ro(int i9, C5391v0 c5391v0) {
        this.f20508a = i9;
        this.f20509b = c5391v0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5283ro)) {
            return false;
        }
        C5283ro c5283ro = (C5283ro) obj;
        return this.f20508a == c5283ro.f20508a && this.f20509b.equals(c5283ro.f20509b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f20509b.hashCode() + (Integer.hashCode(this.f20508a) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "ContactPicker(listMode=" + this.f20508a + ", request=" + this.f20509b + ")";
    }
}
