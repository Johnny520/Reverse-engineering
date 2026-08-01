package p292;

import androidx.window.area.AbstractC2567;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰苏世.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8544 implements Comparable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final int f23810;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C8558 f23811;

    public C8544(C8558 c8558, int i) {
        this.f23811 = c8558;
        this.f23810 = i;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return AbstractC2567.m5093(this.f23810, ((C8544) obj).f23810);
    }

    public final String toString() {
        int i = this.f23810;
        C8558 c8558 = this.f23811;
        return c8558 == null ? String.valueOf(i) : ((C8552) c8558.f23892.get(i)).toString();
    }
}
