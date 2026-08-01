package p209;

/* JADX INFO: renamed from: 飘花落叶言子苏哲楪兰世.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C7922 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final float f21944;

    public final boolean equals(Object obj) {
        if (obj instanceof C7922) {
            return Float.compare(this.f21944, ((C7922) obj).f21944) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f21944);
    }

    public final String toString() {
        return "BaselineShift(multiplier=" + this.f21944 + ')';
    }
}
