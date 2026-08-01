package p292;

import p316.C8675;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰苏世.飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C8561 implements Comparable {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final int f23873;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final int f23874;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final int f23875;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C8566 f23876;

    public C8561(C8566 c8566, int i, int i2, int i3) {
        this.f23876 = c8566;
        this.f23874 = i;
        this.f23875 = i2;
        this.f23873 = i3;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C8561 c8561 = (C8561) obj;
        int i = c8561.f23874;
        int i2 = this.f23874;
        if (i2 != i) {
            return C8675.m14367(i2, i);
        }
        int i3 = c8561.f23873;
        int i4 = this.f23873;
        return i4 != i3 ? C8675.m14367(i4, i3) : C8675.m14367(this.f23875, c8561.f23875);
    }

    public final String toString() {
        int i = this.f23873;
        int i2 = this.f23875;
        C8566 c8566 = this.f23876;
        if (c8566 != null) {
            return ((String) c8566.f23894.get(i2)) + "." + ((String) c8566.f23896.get(i));
        }
        return this.f23874 + " " + i2 + " " + i;
    }
}
