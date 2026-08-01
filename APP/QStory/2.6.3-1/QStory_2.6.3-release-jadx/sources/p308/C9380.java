package p308;

import androidx.window.area.AbstractC3400;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰苏世.飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C9380 implements Comparable {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final int f24201;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final int f24202;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final int f24203;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C9387 f24204;

    public C9380(C9387 c9387, int i, int i2, int i3) {
        this.f24204 = c9387;
        this.f24202 = i;
        this.f24203 = i2;
        this.f24201 = i3;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C9380 c9380 = (C9380) obj;
        int i = c9380.f24202;
        int i2 = this.f24202;
        if (i2 != i) {
            return AbstractC3400.m5653(i2, i);
        }
        int i3 = c9380.f24201;
        int i4 = this.f24201;
        return i4 != i3 ? AbstractC3400.m5653(i4, i3) : AbstractC3400.m5653(this.f24203, c9380.f24203);
    }

    public final String toString() {
        int i = this.f24201;
        int i2 = this.f24203;
        int i3 = this.f24202;
        C9387 c9387 = this.f24204;
        if (c9387 == null) {
            return i3 + " " + i2 + " " + i;
        }
        StringBuilder sb = new StringBuilder();
        sb.append((String) c9387.f24230.get(i3));
        sb.append(".");
        sb.append(c9387.f24232.m14696(i));
        int i4 = ((C9381) c9387.f24237.get(i2)).f24205;
        sb.append(i4 == 0 ? C9377.f24193 : c9387.m14692(i4).m14681());
        return sb.toString();
    }
}
