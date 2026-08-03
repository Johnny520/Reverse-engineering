package p119i2;

/* JADX INFO: renamed from: i2.w */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1952w {

    /* JADX INFO: renamed from: a */
    public final boolean f6617a;

    /* JADX INFO: renamed from: b */
    public final int f6618b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1952w(int i9, boolean z9) {
        this.f6617a = z9;
        this.f6618b = i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1952w)) {
            return false;
        }
        C1952w c1952w = (C1952w) obj;
        return this.f6617a == c1952w.f6617a && this.f6618b == c1952w.f6618b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Integer.hashCode(this.f6618b) + (Boolean.hashCode(this.f6617a) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "PlatformParagraphStyle(includeFontPadding=" + this.f6617a + ", emojiSupportMatch=" + ((Object) C1932j.m4799a(this.f6618b)) + ')';
    }
}
