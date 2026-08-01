package p251;

import androidx.activity.AbstractC0053;

/* JADX INFO: renamed from: 飘花落叶言楪兰子苏哲世.飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C8178 implements Comparable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public int f22544;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public int f22545;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f22545 - ((C8178) obj).f22545;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Segment{start=");
        sb.append(this.f22545);
        sb.append(", end=");
        return AbstractC0053.m154(sb, this.f22544, '}');
    }
}
