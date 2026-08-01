package p292;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰苏世.飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C8555 implements Comparable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final short f23856;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public int f23854 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public int f23855 = -1;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public int f23853 = 0;

    public C8555(int i) {
        this.f23856 = (short) i;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        int i = this.f23855;
        int i2 = ((C8555) obj).f23855;
        if (i != i2) {
            return i < i2 ? -1 : 1;
        }
        return 0;
    }

    public final String toString() {
        return String.format("Section[type=%#x,off=%#x,size=%#x]", Short.valueOf(this.f23856), Integer.valueOf(this.f23855), Integer.valueOf(this.f23854));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final boolean m14092() {
        return this.f23854 > 0;
    }
}
