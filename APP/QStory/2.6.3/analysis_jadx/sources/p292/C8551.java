package p292;

import androidx.window.area.AbstractC2567;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰苏世.飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8551 implements Comparable {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final int f23856;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final int f23857;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final int f23858;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C8558 f23859;

    public C8551(C8558 c8558, int i, int i2, int i3) {
        this.f23859 = c8558;
        this.f23857 = i;
        this.f23858 = i2;
        this.f23856 = i3;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C8551 c8551 = (C8551) obj;
        int i = c8551.f23857;
        int i2 = this.f23857;
        if (i2 != i) {
            return AbstractC2567.m5093(i2, i);
        }
        int i3 = c8551.f23856;
        int i4 = this.f23856;
        return i4 != i3 ? AbstractC2567.m5093(i4, i3) : AbstractC2567.m5093(this.f23858, c8551.f23858);
    }

    public final String toString() {
        int i = this.f23856;
        int i2 = this.f23858;
        int i3 = this.f23857;
        C8558 c8558 = this.f23859;
        if (c8558 == null) {
            return i3 + " " + i2 + " " + i;
        }
        StringBuilder sb = new StringBuilder();
        sb.append((String) c8558.f23885.get(i3));
        sb.append(".");
        sb.append(c8558.f23887.m14137(i));
        int i4 = ((C8552) c8558.f23892.get(i2)).f23860;
        sb.append(i4 == 0 ? C8548.f23848 : c8558.m14133(i4).m14122());
        return sb.toString();
    }
}
