package p092S0;

/* JADX INFO: renamed from: S0.v */
/* JADX INFO: loaded from: classes.dex */
public final class C1284v {

    /* JADX INFO: renamed from: a */
    public final boolean f4616a;

    /* JADX INFO: renamed from: b */
    public final int f4617b;

    public C1284v() {
        this.f4616a = false;
        this.f4617b = 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1284v)) {
            return false;
        }
        C1284v c1284v = (C1284v) obj;
        return this.f4616a == c1284v.f4616a && this.f4617b == c1284v.f4617b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f4617b) + (Boolean.hashCode(this.f4616a) * 31);
    }

    public final String toString() {
        return "PlatformParagraphStyle(includeFontPadding=" + this.f4616a + ", emojiSupportMatch=" + ((Object) C1272j.m2358a(this.f4617b)) + ')';
    }

    public C1284v(int i5, boolean z5) {
        this.f4616a = z5;
        this.f4617b = i5;
    }
}
