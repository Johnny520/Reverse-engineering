package p280t2;

/* JADX INFO: renamed from: t2.g */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4091g {

    /* JADX INFO: renamed from: a */
    public final int f13548a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (obj instanceof C4091g) {
            return this.f13548a == ((C4091g) obj).f13548a;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Integer.hashCode(this.f13548a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        int i9 = this.f13548a;
        return i9 == 0 ? "LineHeightStyle.Mode.Fixed" : i9 == 1 ? "LineHeightStyle.Mode.Minimum" : i9 == 2 ? "LineHeightStyle.Mode.Tight" : "Invalid";
    }
}
