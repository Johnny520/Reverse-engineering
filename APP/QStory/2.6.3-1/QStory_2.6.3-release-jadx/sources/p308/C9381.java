package p308;

import androidx.window.area.AbstractC3400;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰苏世.飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C9381 implements Comparable {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final int f24205;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final int f24206;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final int f24207;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C9387 f24208;

    public C9381(C9387 c9387, int i, int i2, int i3) {
        this.f24208 = c9387;
        this.f24206 = i;
        this.f24207 = i2;
        this.f24205 = i3;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C9381 c9381 = (C9381) obj;
        int i = c9381.f24207;
        int i2 = this.f24207;
        return i2 != i ? AbstractC3400.m5653(i2, i) : AbstractC3400.m5653(this.f24205, c9381.f24205);
    }

    public final String toString() {
        int i = this.f24205;
        int i2 = this.f24207;
        int i3 = this.f24206;
        C9387 c9387 = this.f24208;
        if (c9387 == null) {
            return i3 + " " + i2 + " " + i;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(c9387.f24232.m14696(i3));
        sb.append(": ");
        sb.append((String) c9387.f24230.get(i2));
        sb.append(" ");
        sb.append(i == 0 ? C9377.f24193 : c9387.m14692(i).m14681());
        return sb.toString();
    }
}
