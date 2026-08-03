package p280t2;

/* JADX INFO: renamed from: t2.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4085a {

    /* JADX INFO: renamed from: a */
    public final float f13537a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (obj instanceof C4085a) {
            return Float.compare(this.f13537a, ((C4085a) obj).f13537a) == 0;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Float.hashCode(this.f13537a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "BaselineShift(multiplier=" + this.f13537a + ')';
    }
}
