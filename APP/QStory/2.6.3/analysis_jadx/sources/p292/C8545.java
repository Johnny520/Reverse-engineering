package p292;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰苏世.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8545 implements Comparable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final byte f23812;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C8550 f23813;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C8558 f23814;

    public C8545(C8558 c8558, byte b, C8550 c8550) {
        this.f23814 = c8558;
        this.f23812 = b;
        this.f23813 = c8550;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f23813.compareTo(((C8545) obj).f23813);
    }

    public final String toString() {
        C8550 c8550 = this.f23813;
        C8558 c8558 = this.f23814;
        byte b = this.f23812;
        if (c8558 == null) {
            StringBuilder sb = new StringBuilder();
            sb.append((int) b);
            sb.append(" ");
            C8549 c8549 = new C8549(c8550, 29);
            c8549.m14115();
            sb.append(c8549.f23852);
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append((int) b);
        sb2.append(" ");
        C8560 c8560 = c8558.f23885;
        C8549 c85492 = new C8549(c8550, 29);
        c85492.m14115();
        sb2.append((String) c8560.get(c85492.f23852));
        return sb2.toString();
    }
}
