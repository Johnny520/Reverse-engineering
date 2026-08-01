package p308;

import androidx.window.area.AbstractC3400;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰苏世.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C9373 implements Comparable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final int f24155;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C9387 f24156;

    public C9373(C9387 c9387, int i) {
        this.f24156 = c9387;
        this.f24155 = i;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return AbstractC3400.m5653(this.f24155, ((C9373) obj).f24155);
    }

    public final String toString() {
        int i = this.f24155;
        C9387 c9387 = this.f24156;
        return c9387 == null ? String.valueOf(i) : ((C9381) c9387.f24237.get(i)).toString();
    }
}
