package p308;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰苏世.飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C9376 implements Comparable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final short f24192;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public int f24190 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public int f24191 = -1;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public int f24189 = 0;

    public C9376(int i) {
        this.f24192 = (short) i;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        int i = this.f24191;
        int i2 = ((C9376) obj).f24191;
        if (i != i2) {
            return i < i2 ? -1 : 1;
        }
        return 0;
    }

    public final String toString() {
        return String.format("Section[type=%#x,off=%#x,size=%#x]", Short.valueOf(this.f24192), Integer.valueOf(this.f24191), Integer.valueOf(this.f24190));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final boolean m14670() {
        return this.f24190 > 0;
    }
}
