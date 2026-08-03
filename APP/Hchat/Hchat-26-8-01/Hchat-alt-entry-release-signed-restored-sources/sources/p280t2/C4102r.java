package p280t2;

/* JADX INFO: renamed from: t2.r */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4102r {

    /* JADX INFO: renamed from: a */
    public final int f13570a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (obj instanceof C4102r) {
            return this.f13570a == ((C4102r) obj).f13570a;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Integer.hashCode(this.f13570a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        int i9 = this.f13570a;
        return i9 == 1 ? "Linearity.Linear" : i9 == 2 ? "Linearity.FontHinting" : i9 == 3 ? "Linearity.None" : "Invalid";
    }
}
