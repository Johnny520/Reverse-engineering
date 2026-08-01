package p292;

import p316.C8675;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰苏世.飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C8560 implements Comparable {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final int f23869;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final int f23870;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final int f23871;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C8566 f23872;

    public C8560(C8566 c8566, int i, int i2, int i3) {
        this.f23872 = c8566;
        this.f23870 = i;
        this.f23871 = i2;
        this.f23869 = i3;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C8560 c8560 = (C8560) obj;
        int i = c8560.f23871;
        int i2 = this.f23871;
        return i2 != i ? C8675.m14367(i2, i) : C8675.m14367(this.f23869, c8560.f23869);
    }

    public final String toString() {
        int i = this.f23869;
        int i2 = this.f23871;
        int i3 = this.f23870;
        C8566 c8566 = this.f23872;
        if (c8566 == null) {
            return i3 + " " + i2 + " " + i;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(c8566.f23896.m14118(i3));
        sb.append(": ");
        sb.append((String) c8566.f23894.get(i2));
        sb.append(" ");
        sb.append(i == 0 ? C8556.f23857 : c8566.m14114(i).m14103());
        return sb.toString();
    }
}
