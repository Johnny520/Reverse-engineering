package androidx.window.area;

/* JADX INFO: renamed from: androidx.window.area.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3392 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C3393 f8046;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C3393 f8047;

    public C3392(C3393 c3393, C3393 c33932) {
        this.f8047 = c3393;
        this.f8046 = c33932;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C3392)) {
            return false;
        }
        C3392 c3392 = (C3392) obj;
        return this.f8047 == c3392.f8047 && this.f8046 == c3392.f8046;
    }

    public final int hashCode() {
        return this.f8046.hashCode() + (this.f8047.hashCode() * 31);
    }

    public final String toString() {
        return "Operation: " + this.f8047 + ": Status: " + this.f8046;
    }
}
