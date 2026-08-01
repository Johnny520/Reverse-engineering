package p048;

/* JADX INFO: renamed from: 飘花落叶言世子兰楪苏哲.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6519 extends C6512 implements InterfaceC6513 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final C6519 f17827 = new C6519(1, 0, 1);

    @Override // p048.C6512
    public final boolean equals(Object obj) {
        if (!(obj instanceof C6519)) {
            return false;
        }
        if (isEmpty() && ((C6519) obj).isEmpty()) {
            return true;
        }
        C6519 c6519 = (C6519) obj;
        return this.f17818 == c6519.f17818 && this.f17816 == c6519.f17816;
    }

    @Override // p048.C6512
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f17818 * 31) + this.f17816;
    }

    @Override // p048.C6512
    public final boolean isEmpty() {
        return this.f17818 > this.f17816;
    }

    @Override // p048.C6512
    public final String toString() {
        return this.f17818 + ".." + this.f17816;
    }
}
