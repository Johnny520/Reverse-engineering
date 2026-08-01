package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class ys0 {

    /* JADX INFO: renamed from: b */
    public static final ys0 f7689b = new ys0(new C0800ue());

    /* JADX INFO: renamed from: a */
    public final C0800ue f7690a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ys0(C0800ue c0800ue) {
        this.f7690a = c0800ue;
        if (Float.isNaN(0.0f)) {
            C0921xc.m5131l("current must not be NaN");
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ys0) && this.f7690a.equals(((ys0) obj).f7690a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return (this.f7690a.hashCode() + (Float.hashCode(0.0f) * 31)) * 31;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "ProgressBarRangeInfo(current=0.0, range=" + this.f7690a + ", steps=0)";
    }
}
