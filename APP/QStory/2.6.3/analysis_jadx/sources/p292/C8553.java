package p292;

import androidx.window.area.AbstractC2567;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰苏世.飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8553 implements Comparable {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final int f23864;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final int f23865;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final int f23866;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C8558 f23867;

    public C8553(C8558 c8558, int i, int i2, int i3) {
        this.f23867 = c8558;
        this.f23865 = i;
        this.f23866 = i2;
        this.f23864 = i3;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C8553 c8553 = (C8553) obj;
        int i = c8553.f23865;
        int i2 = this.f23865;
        if (i2 != i) {
            return AbstractC2567.m5093(i2, i);
        }
        int i3 = c8553.f23864;
        int i4 = this.f23864;
        return i4 != i3 ? AbstractC2567.m5093(i4, i3) : AbstractC2567.m5093(this.f23866, c8553.f23866);
    }

    public final String toString() {
        int i = this.f23864;
        int i2 = this.f23866;
        C8558 c8558 = this.f23867;
        if (c8558 != null) {
            return ((String) c8558.f23885.get(i2)) + "." + ((String) c8558.f23887.get(i));
        }
        return this.f23865 + " " + i2 + " " + i;
    }
}
