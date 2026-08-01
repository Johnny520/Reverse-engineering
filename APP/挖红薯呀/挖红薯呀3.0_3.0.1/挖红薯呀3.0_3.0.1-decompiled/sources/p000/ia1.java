package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class ia1 implements Comparable {

    /* JADX INFO: renamed from: d */
    public final byte f2502d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher.innerBuild(xt):int, org.luckypray.dexkit.query.matchers.MethodMatcher.innerBuild(xt):int] */
    public /* synthetic */ ia1(byte b) {
        this.f2502d = b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return p30.m3008r(this.f2502d & 255, ((ia1) obj).f2502d & 255);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (obj instanceof ia1) {
            return this.f2502d == ((ia1) obj).f2502d;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Byte.hashCode(this.f2502d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return String.valueOf(this.f2502d & 255);
    }
}
