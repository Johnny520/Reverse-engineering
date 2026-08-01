package androidx.window.area;

/* JADX INFO: renamed from: androidx.window.area.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2559 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C2560 f7701;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C2560 f7702;

    public C2559(C2560 c2560, C2560 c25602) {
        this.f7702 = c2560;
        this.f7701 = c25602;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2559)) {
            return false;
        }
        C2559 c2559 = (C2559) obj;
        return this.f7702 == c2559.f7702 && this.f7701 == c2559.f7701;
    }

    public final int hashCode() {
        return this.f7701.hashCode() + (this.f7702.hashCode() * 31);
    }

    public final String toString() {
        return "Operation: " + this.f7702 + ": Status: " + this.f7701;
    }
}
