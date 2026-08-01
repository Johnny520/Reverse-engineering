package p203;

import androidx.constraintlayout.core.widgets.analyzer.AbstractC2157;
import androidx.constraintlayout.core.widgets.analyzer.C2156;
import java.util.ArrayList;

/* JADX INFO: renamed from: 飘花落叶言子苏兰楪哲世.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7886 extends C7879 {

    /* JADX INFO: renamed from: 飘花落叶言子苏兰世楪哲, reason: contains not printable characters */
    public C7879[] f21845 = new C7879[4];

    /* JADX INFO: renamed from: 飘花落叶言子苏兰世哲楪, reason: contains not printable characters */
    public int f21844 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public final void m13307(int i, C2156 c2156, ArrayList arrayList) {
        for (int i2 = 0; i2 < this.f21844; i2++) {
            C7879 c7879 = this.f21845[i2];
            ArrayList arrayList2 = c2156.f6374;
            if (!arrayList2.contains(c7879)) {
                arrayList2.add(c7879);
            }
        }
        for (int i3 = 0; i3 < this.f21844; i3++) {
            AbstractC2157.m3912(this.f21845[i3], i, arrayList, c2156);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲 */
    public void mo13300() {
    }
}
