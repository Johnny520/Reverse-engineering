package p292;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰苏世.飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8547 implements Comparable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final short f23847;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public int f23845 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public int f23846 = -1;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public int f23844 = 0;

    public C8547(int i) {
        this.f23847 = (short) i;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        int i = this.f23846;
        int i2 = ((C8547) obj).f23846;
        if (i != i2) {
            return i < i2 ? -1 : 1;
        }
        return 0;
    }

    public final String toString() {
        return String.format("Section[type=%#x,off=%#x,size=%#x]", Short.valueOf(this.f23847), Integer.valueOf(this.f23846), Integer.valueOf(this.f23845));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final boolean m14111() {
        return this.f23845 > 0;
    }
}
