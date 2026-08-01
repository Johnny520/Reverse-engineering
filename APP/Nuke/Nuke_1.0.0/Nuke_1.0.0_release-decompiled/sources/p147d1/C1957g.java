package p147d1;

/* JADX INFO: renamed from: d1.g */
/* JADX INFO: loaded from: classes.dex */
public final class C1957g {

    /* JADX INFO: renamed from: a */
    public final int f6630a;

    public final boolean equals(Object obj) {
        if (obj instanceof C1957g) {
            return this.f6630a == ((C1957g) obj).f6630a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f6630a);
    }

    public final String toString() {
        int i5 = this.f6630a;
        return i5 == 0 ? "LineHeightStyle.Mode.Fixed" : i5 == 1 ? "LineHeightStyle.Mode.Minimum" : i5 == 2 ? "LineHeightStyle.Mode.Tight" : "Invalid";
    }
}
