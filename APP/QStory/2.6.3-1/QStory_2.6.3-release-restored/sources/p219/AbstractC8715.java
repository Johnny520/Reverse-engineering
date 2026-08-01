package p219;

import androidx.constraintlayout.core.widgets.analyzer.AbstractC2990;
import androidx.constraintlayout.core.widgets.analyzer.C2989;
import java.util.ArrayList;

/* JADX INFO: renamed from: 飘花落叶言子苏兰楪哲世.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8715 extends C8708 {

    /* JADX INFO: renamed from: 飘花落叶言子苏兰世楪哲, reason: contains not printable characters */
    public C8708[] f22190 = new C8708[4];

    /* JADX INFO: renamed from: 飘花落叶言子苏兰世哲楪, reason: contains not printable characters */
    public int f22189 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public final void m13866(int i, C2989 c2989, ArrayList arrayList) {
        for (int i2 = 0; i2 < this.f22189; i2++) {
            C8708 c8708 = this.f22190[i2];
            ArrayList arrayList2 = c2989.f6719;
            if (!arrayList2.contains(c8708)) {
                arrayList2.add(c8708);
            }
        }
        for (int i3 = 0; i3 < this.f22189; i3++) {
            AbstractC2990.m4472(this.f22190[i3], i, arrayList, c2989);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲 */
    public void mo13859() {
    }
}
