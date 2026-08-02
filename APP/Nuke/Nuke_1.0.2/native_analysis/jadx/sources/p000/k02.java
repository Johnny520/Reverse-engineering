package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class k02 {

    /* JADX INFO: renamed from: a */
    public final boolean f5294a;

    /* JADX INFO: renamed from: b */
    public final int f5295b;

    public k02() {
        this.f5294a = false;
        this.f5295b = 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k02)) {
            return false;
        }
        k02 k02Var = (k02) obj;
        return this.f5294a == k02Var.f5294a && this.f5295b == k02Var.f5295b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f5295b) + (Boolean.hashCode(this.f5294a) * 31);
    }

    public final String toString() {
        return "PlatformParagraphStyle(includeFontPadding=" + this.f5294a + ", emojiSupportMatch=" + ((Object) wd0.m5868a(this.f5295b)) + ')';
    }

    public k02(int i, boolean z) {
        this.f5294a = z;
        this.f5295b = i;
    }
}
