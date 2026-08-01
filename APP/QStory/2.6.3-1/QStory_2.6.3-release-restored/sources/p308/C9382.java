package p308;

import androidx.window.area.AbstractC3400;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰苏世.飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C9382 implements Comparable {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final int f24209;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final int f24210;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final int f24211;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C9387 f24212;

    public C9382(C9387 c9387, int i, int i2, int i3) {
        this.f24212 = c9387;
        this.f24210 = i;
        this.f24211 = i2;
        this.f24209 = i3;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C9382 c9382 = (C9382) obj;
        int i = c9382.f24210;
        int i2 = this.f24210;
        if (i2 != i) {
            return AbstractC3400.m5653(i2, i);
        }
        int i3 = c9382.f24209;
        int i4 = this.f24209;
        return i4 != i3 ? AbstractC3400.m5653(i4, i3) : AbstractC3400.m5653(this.f24211, c9382.f24211);
    }

    public final String toString() {
        int i = this.f24209;
        int i2 = this.f24211;
        C9387 c9387 = this.f24212;
        if (c9387 != null) {
            return ((String) c9387.f24230.get(i2)) + "." + ((String) c9387.f24232.get(i));
        }
        return this.f24210 + " " + i2 + " " + i;
    }
}
