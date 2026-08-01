package p292;

import androidx.window.area.AbstractC2567;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰苏世.飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8552 implements Comparable {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final int f23860;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final int f23861;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final int f23862;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C8558 f23863;

    public C8552(C8558 c8558, int i, int i2, int i3) {
        this.f23863 = c8558;
        this.f23861 = i;
        this.f23862 = i2;
        this.f23860 = i3;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C8552 c8552 = (C8552) obj;
        int i = c8552.f23862;
        int i2 = this.f23862;
        return i2 != i ? AbstractC2567.m5093(i2, i) : AbstractC2567.m5093(this.f23860, c8552.f23860);
    }

    public final String toString() {
        int i = this.f23860;
        int i2 = this.f23862;
        int i3 = this.f23861;
        C8558 c8558 = this.f23863;
        if (c8558 == null) {
            return i3 + " " + i2 + " " + i;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(c8558.f23887.m14137(i3));
        sb.append(": ");
        sb.append((String) c8558.f23885.get(i2));
        sb.append(" ");
        sb.append(i == 0 ? C8548.f23848 : c8558.m14133(i).m14122());
        return sb.toString();
    }
}
