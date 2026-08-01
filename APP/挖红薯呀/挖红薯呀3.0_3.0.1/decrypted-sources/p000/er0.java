package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class er0 {

    /* JADX INFO: renamed from: a */
    public final boolean f1521a;

    /* JADX INFO: renamed from: b */
    public final int f1522b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public er0() {
        this.f1521a = false;
        this.f1522b = 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof er0)) {
            return false;
        }
        er0 er0Var = (er0) obj;
        return this.f1521a == er0Var.f1521a && this.f1522b == er0Var.f1522b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Integer.hashCode(this.f1522b) + (Boolean.hashCode(this.f1521a) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "PlatformParagraphStyle(includeFontPadding=" + this.f1521a + ", emojiSupportMatch=" + ((Object) C0066bs.m362a(this.f1522b)) + ')';
    }

    public er0(int i, boolean z) {
        this.f1521a = z;
        this.f1522b = i;
    }
}
