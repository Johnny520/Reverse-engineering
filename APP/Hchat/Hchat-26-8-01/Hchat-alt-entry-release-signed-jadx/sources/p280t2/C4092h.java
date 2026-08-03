package p280t2;

/* JADX INFO: renamed from: t2.h */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4092h {

    /* JADX INFO: renamed from: a */
    public final int f13549a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (obj instanceof C4092h) {
            return this.f13549a == ((C4092h) obj).f13549a;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Integer.hashCode(this.f13549a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        int i9 = this.f13549a;
        return i9 == 1 ? "LineHeightStyle.Trim.FirstLineTop" : i9 == 16 ? "LineHeightStyle.Trim.LastLineBottom" : i9 == 17 ? "LineHeightStyle.Trim.Both" : i9 == 0 ? "LineHeightStyle.Trim.None" : "Invalid";
    }
}
