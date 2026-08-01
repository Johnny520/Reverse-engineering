package p303;

import android.view.View;
import androidx.appcompat.app.C0076;
import androidx.core.view.AbstractC2279;
import androidx.core.view.C2225;
import androidx.core.view.C2274;
import java.util.Iterator;
import java.util.List;
import p317.AbstractC8672;

/* JADX INFO: renamed from: 飘花落叶言楪苏世子哲兰.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8613 extends AbstractC2279 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public int f24184;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public int f24185;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final int[] f24186;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final View f24187;

    public C8613(View view) {
        super(0);
        this.f24186 = new int[2];
        this.f24187 = view;
    }

    @Override // androidx.core.view.AbstractC2279
    /* JADX INFO: renamed from: 飘花落叶言子苏哲世兰楪 */
    public final C2225 mo1465(C2225 c2225, List list) {
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            if ((((C2274) it.next()).f6604.mo4254() & 8) != 0) {
                this.f24187.setTranslationY(AbstractC8672.m14396(this.f24184, r0.f6604.mo4255(), 0));
                break;
            }
        }
        return c2225;
    }

    @Override // androidx.core.view.AbstractC2279
    /* JADX INFO: renamed from: 飘花落叶言子苏哲世楪兰 */
    public final void mo1466(C2274 c2274) {
        View view = this.f24187;
        int[] iArr = this.f24186;
        view.getLocationOnScreen(iArr);
        this.f24185 = iArr[1];
    }

    @Override // androidx.core.view.AbstractC2279
    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰楪世 */
    public final C0076 mo1467(C2274 c2274, C0076 c0076) {
        View view = this.f24187;
        int[] iArr = this.f24186;
        view.getLocationOnScreen(iArr);
        int i = this.f24185 - iArr[1];
        this.f24184 = i;
        view.setTranslationY(i);
        return c0076;
    }

    @Override // androidx.core.view.AbstractC2279
    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪世兰 */
    public final void mo1468(C2274 c2274) {
        this.f24187.setTranslationY(0.0f);
    }
}
