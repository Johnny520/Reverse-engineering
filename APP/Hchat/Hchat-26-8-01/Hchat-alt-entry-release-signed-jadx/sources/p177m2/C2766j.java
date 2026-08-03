package p177m2;

/* JADX INFO: renamed from: m2.j */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2766j {

    /* JADX INFO: renamed from: a */
    public final int f8997a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (obj instanceof C2766j) {
            return this.f8997a == ((C2766j) obj).f8997a;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Integer.hashCode(this.f8997a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        int i9 = this.f8997a;
        return i9 == 0 ? "None" : i9 == 1 ? "Weight" : i9 == 2 ? "Style" : i9 == 65535 ? "All" : "Invalid";
    }
}
