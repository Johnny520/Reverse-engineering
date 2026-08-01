package p308;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰苏世.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C9374 implements Comparable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final byte f24157;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C9379 f24158;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C9387 f24159;

    public C9374(C9387 c9387, byte b, C9379 c9379) {
        this.f24159 = c9387;
        this.f24157 = b;
        this.f24158 = c9379;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f24158.compareTo(((C9374) obj).f24158);
    }

    public final String toString() {
        C9379 c9379 = this.f24158;
        C9387 c9387 = this.f24159;
        byte b = this.f24157;
        if (c9387 == null) {
            StringBuilder sb = new StringBuilder();
            sb.append((int) b);
            sb.append(" ");
            C9378 c9378 = new C9378(c9379, 29);
            c9378.m14674();
            sb.append(c9378.f24197);
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append((int) b);
        sb2.append(" ");
        C9389 c9389 = c9387.f24230;
        C9378 c93782 = new C9378(c9379, 29);
        c93782.m14674();
        sb2.append((String) c9389.get(c93782.f24197));
        return sb2.toString();
    }
}
