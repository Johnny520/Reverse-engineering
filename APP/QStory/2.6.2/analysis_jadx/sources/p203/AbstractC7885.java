package p203;

import androidx.constraintlayout.core.widgets.analyzer.AbstractC2157;
import androidx.constraintlayout.core.widgets.analyzer.C2156;
import java.util.ArrayList;

/* JADX INFO: renamed from: 飘花落叶言子苏兰楪哲世.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7885 extends C7878 {

    /* JADX INFO: renamed from: 飘花落叶言子苏兰世楪哲, reason: contains not printable characters */
    public C7878[] f21848 = new C7878[4];

    /* JADX INFO: renamed from: 飘花落叶言子苏兰世哲楪, reason: contains not printable characters */
    public int f21847 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public final void m13279(int i, C2156 c2156, ArrayList arrayList) {
        for (int i2 = 0; i2 < this.f21847; i2++) {
            C7878 c7878 = this.f21848[i2];
            ArrayList arrayList2 = c2156.f6373;
            if (!arrayList2.contains(c7878)) {
                arrayList2.add(c7878);
            }
        }
        for (int i3 = 0; i3 < this.f21847; i3++) {
            AbstractC2157.m3902(this.f21848[i3], i, arrayList, c2156);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲 */
    public void mo13272() {
    }
}
