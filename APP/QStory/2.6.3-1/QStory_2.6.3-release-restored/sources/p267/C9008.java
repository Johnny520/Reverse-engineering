package p267;

import androidx.activity.AbstractC0900;

/* JADX INFO: renamed from: 飘花落叶言楪兰子苏哲世.飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C9008 implements Comparable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public int f22888;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public int f22889;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f22889 - ((C9008) obj).f22889;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Segment{start=");
        sb.append(this.f22889);
        sb.append(", end=");
        return AbstractC0900.m716(sb, this.f22888, '}');
    }
}
