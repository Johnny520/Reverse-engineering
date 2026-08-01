package p111;

/* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C7325 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int f19526;

    public final boolean equals(Object obj) {
        if (obj instanceof C7325) {
            return this.f19526 == ((C7325) obj).f19526;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f19526);
    }

    public final String toString() {
        int i = this.f19526;
        return i == 1 ? "Touch" : i == 2 ? "Keyboard" : "Error";
    }
}
