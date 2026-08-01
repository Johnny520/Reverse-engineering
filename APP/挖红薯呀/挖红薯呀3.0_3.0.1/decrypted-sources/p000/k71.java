package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class k71 {

    /* JADX INFO: renamed from: c */
    public static final k71 f3042c = new k71(2, false);

    /* JADX INFO: renamed from: d */
    public static final k71 f3043d = new k71(1, true);

    /* JADX INFO: renamed from: a */
    public final int f3044a;

    /* JADX INFO: renamed from: b */
    public final boolean f3045b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public k71(int i, boolean z) {
        this.f3044a = i;
        this.f3045b = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k71)) {
            return false;
        }
        k71 k71Var = (k71) obj;
        return this.f3044a == k71Var.f3044a && this.f3045b == k71Var.f3045b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Boolean.hashCode(this.f3045b) + (Integer.hashCode(this.f3044a) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return equals(f3042c) ? "TextMotion.Static" : equals(f3043d) ? "TextMotion.Animated" : "Invalid";
    }
}
