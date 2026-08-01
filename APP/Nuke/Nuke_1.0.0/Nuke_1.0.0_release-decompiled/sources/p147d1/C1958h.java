package p147d1;

/* JADX INFO: renamed from: d1.h */
/* JADX INFO: loaded from: classes.dex */
public final class C1958h {

    /* JADX INFO: renamed from: a */
    public final int f6631a;

    public final boolean equals(Object obj) {
        if (obj instanceof C1958h) {
            return this.f6631a == ((C1958h) obj).f6631a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f6631a);
    }

    public final String toString() {
        int i5 = this.f6631a;
        return i5 == 1 ? "LineHeightStyle.Trim.FirstLineTop" : i5 == 16 ? "LineHeightStyle.Trim.LastLineBottom" : i5 == 17 ? "LineHeightStyle.Trim.Both" : i5 == 0 ? "LineHeightStyle.Trim.None" : "Invalid";
    }
}
