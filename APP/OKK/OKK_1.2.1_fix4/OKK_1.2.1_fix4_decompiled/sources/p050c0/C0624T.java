package p050c0;

/* JADX INFO: renamed from: c0.T */
/* JADX INFO: loaded from: classes.dex */
public final class C0624T {

    /* JADX INFO: renamed from: a */
    public final int f1923a;

    /* JADX INFO: renamed from: b */
    public final int f1924b;

    public C0624T(int i2, int i3) {
        this.f1923a = i2;
        this.f1924b = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0624T)) {
            return false;
        }
        C0624T c0624t = (C0624T) obj;
        return this.f1923a == c0624t.f1923a && this.f1924b == c0624t.f1924b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f1924b) + (Integer.hashCode(this.f1923a) * 31);
    }

    public final String toString() {
        return "Range(start=" + this.f1923a + ", end=" + this.f1924b + ")";
    }
}
