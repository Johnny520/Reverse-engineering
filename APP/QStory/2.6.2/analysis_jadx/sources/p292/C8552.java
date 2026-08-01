package p292;

import p316.C8675;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰苏世.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C8552 implements Comparable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final int f23819;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C8566 f23820;

    public C8552(C8566 c8566, int i) {
        this.f23820 = c8566;
        this.f23819 = i;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return C8675.m14367(this.f23819, ((C8552) obj).f23819);
    }

    public final String toString() {
        int i = this.f23819;
        C8566 c8566 = this.f23820;
        return c8566 == null ? String.valueOf(i) : ((C8560) c8566.f23901.get(i)).toString();
    }
}
