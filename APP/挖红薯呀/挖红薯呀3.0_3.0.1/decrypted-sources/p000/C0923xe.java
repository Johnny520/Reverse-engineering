package p000;

/* JADX INFO: renamed from: xe */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0923xe {

    /* JADX INFO: renamed from: a */
    public final int f7334a;

    /* JADX INFO: renamed from: b */
    public final int f7335b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0923xe(int i, int i2) {
        this.f7334a = i;
        this.f7335b = i2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0923xe)) {
            return false;
        }
        C0923xe c0923xe = (C0923xe) obj;
        return this.f7334a == c0923xe.f7334a && this.f7335b == c0923xe.f7335b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Integer.hashCode(this.f7335b) + (Integer.hashCode(this.f7334a) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "CollectionInfo(rowCount=" + this.f7334a + ", columnCount=" + this.f7335b + ')';
    }
}
