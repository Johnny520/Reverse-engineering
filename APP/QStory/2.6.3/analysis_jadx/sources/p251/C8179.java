package p251;

import androidx.activity.AbstractC0053;

/* JADX INFO: renamed from: 飘花落叶言楪兰子苏哲世.飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8179 implements Comparable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public int f22543;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public int f22544;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f22544 - ((C8179) obj).f22544;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Segment{start=");
        sb.append(this.f22544);
        sb.append(", end=");
        return AbstractC0053.m156(sb, this.f22543, '}');
    }
}
