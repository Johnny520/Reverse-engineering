package p293u2;

/* JADX INFO: renamed from: u2.f */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4236f implements Comparable {

    /* JADX INFO: renamed from: g */
    public final float f13909g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static int m8519a(float f3, float f10) {
        if (Float.isNaN(f3) || Float.isNaN(f10)) {
            return 0;
        }
        return Float.compare(f3, f10);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static final boolean m8520b(float f3, float f10) {
        return Float.compare(f3, f10) == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static String m8521c(float f3) {
        if (Float.isNaN(f3)) {
            return "Dp.Unspecified";
        }
        return f3 + ".dp";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return m8519a(this.f13909g, ((C4236f) obj).f13909g);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (obj instanceof C4236f) {
            return Float.compare(this.f13909g, ((C4236f) obj).f13909g) == 0;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Float.hashCode(this.f13909g);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return m8521c(this.f13909g);
    }
}
