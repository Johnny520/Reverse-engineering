package p292;

import p316.C8675;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰苏世.飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C8559 implements Comparable {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final int f23865;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final int f23866;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final int f23867;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C8566 f23868;

    public C8559(C8566 c8566, int i, int i2, int i3) {
        this.f23868 = c8566;
        this.f23866 = i;
        this.f23867 = i2;
        this.f23865 = i3;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C8559 c8559 = (C8559) obj;
        int i = c8559.f23866;
        int i2 = this.f23866;
        if (i2 != i) {
            return C8675.m14367(i2, i);
        }
        int i3 = c8559.f23865;
        int i4 = this.f23865;
        return i4 != i3 ? C8675.m14367(i4, i3) : C8675.m14367(this.f23867, c8559.f23867);
    }

    public final String toString() {
        int i = this.f23865;
        int i2 = this.f23867;
        int i3 = this.f23866;
        C8566 c8566 = this.f23868;
        if (c8566 == null) {
            return i3 + " " + i2 + " " + i;
        }
        StringBuilder sb = new StringBuilder();
        sb.append((String) c8566.f23894.get(i3));
        sb.append(".");
        sb.append(c8566.f23896.m14118(i));
        int i4 = ((C8560) c8566.f23901.get(i2)).f23869;
        sb.append(i4 == 0 ? C8556.f23857 : c8566.m14114(i4).m14103());
        return sb.toString();
    }
}
