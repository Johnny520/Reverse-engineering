package p332wb;

/* JADX INFO: renamed from: wb.yq */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5515yq extends AbstractC5547zq {

    /* JADX INFO: renamed from: a */
    public final int f22238a;

    /* JADX INFO: renamed from: b */
    public final C4737b3 f22239b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C5515yq(int i9, C4737b3 c4737b3) {
        this.f22238a = i9;
        this.f22239b = c4737b3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5515yq)) {
            return false;
        }
        C5515yq c5515yq = (C5515yq) obj;
        return this.f22238a == c5515yq.f22238a && this.f22239b.equals(c5515yq.f22239b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f22239b.hashCode() + (Integer.hashCode(this.f22238a) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "FavoritePicker(index=" + this.f22238a + ", request=" + this.f22239b + ")";
    }
}
