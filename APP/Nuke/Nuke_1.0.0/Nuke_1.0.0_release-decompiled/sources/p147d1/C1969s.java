package p147d1;

/* JADX INFO: renamed from: d1.s */
/* JADX INFO: loaded from: classes.dex */
public final class C1969s {

    /* JADX INFO: renamed from: c */
    public static final C1969s f6653c = new C1969s(2, false);

    /* JADX INFO: renamed from: d */
    public static final C1969s f6654d = new C1969s(1, true);

    /* JADX INFO: renamed from: a */
    public final int f6655a;

    /* JADX INFO: renamed from: b */
    public final boolean f6656b;

    public C1969s(int i5, boolean z5) {
        this.f6655a = i5;
        this.f6656b = z5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1969s)) {
            return false;
        }
        C1969s c1969s = (C1969s) obj;
        return this.f6655a == c1969s.f6655a && this.f6656b == c1969s.f6656b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f6656b) + (Integer.hashCode(this.f6655a) * 31);
    }

    public final String toString() {
        return equals(f6653c) ? "TextMotion.Static" : equals(f6654d) ? "TextMotion.Animated" : "Invalid";
    }
}
