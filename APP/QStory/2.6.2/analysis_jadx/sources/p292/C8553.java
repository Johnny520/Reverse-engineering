package p292;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰苏世.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C8553 implements Comparable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final byte f23821;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C8558 f23822;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C8566 f23823;

    public C8553(C8566 c8566, byte b, C8558 c8558) {
        this.f23823 = c8566;
        this.f23821 = b;
        this.f23822 = c8558;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f23822.compareTo(((C8553) obj).f23822);
    }

    public final String toString() {
        C8558 c8558 = this.f23822;
        C8566 c8566 = this.f23823;
        byte b = this.f23821;
        if (c8566 == null) {
            StringBuilder sb = new StringBuilder();
            sb.append((int) b);
            sb.append(" ");
            C8557 c8557 = new C8557(c8558, 29);
            c8557.m14096();
            sb.append(c8557.f23861);
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append((int) b);
        sb2.append(" ");
        C8568 c8568 = c8566.f23894;
        C8557 c85572 = new C8557(c8558, 29);
        c85572.m14096();
        sb2.append((String) c8568.get(c85572.f23861));
        return sb2.toString();
    }
}
