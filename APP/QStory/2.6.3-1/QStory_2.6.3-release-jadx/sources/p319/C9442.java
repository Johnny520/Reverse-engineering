package p319;

import android.view.View;
import androidx.appcompat.app.C0923;
import androidx.core.view.AbstractC3112;
import androidx.core.view.C3058;
import androidx.core.view.C3107;
import java.util.Iterator;
import java.util.List;
import p333.AbstractC9501;

/* JADX INFO: renamed from: 飘花落叶言楪苏世子哲兰.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C9442 extends AbstractC3112 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public int f24529;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public int f24530;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final int[] f24531;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final View f24532;

    public C9442(View view) {
        super(0);
        this.f24531 = new int[2];
        this.f24532 = view;
    }

    @Override // androidx.core.view.AbstractC3112
    /* JADX INFO: renamed from: 飘花落叶言子苏哲世兰楪 */
    public final C3058 mo2025(C3058 c3058, List list) {
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            if ((((C3107) it.next()).f6949.mo4814() & 8) != 0) {
                this.f24532.setTranslationY(AbstractC9501.m14955(this.f24529, r0.f6949.mo4815(), 0));
                break;
            }
        }
        return c3058;
    }

    @Override // androidx.core.view.AbstractC3112
    /* JADX INFO: renamed from: 飘花落叶言子苏哲世楪兰 */
    public final void mo2026(C3107 c3107) {
        View view = this.f24532;
        int[] iArr = this.f24531;
        view.getLocationOnScreen(iArr);
        this.f24530 = iArr[1];
    }

    @Override // androidx.core.view.AbstractC3112
    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰楪世 */
    public final C0923 mo2027(C3107 c3107, C0923 c0923) {
        View view = this.f24532;
        int[] iArr = this.f24531;
        view.getLocationOnScreen(iArr);
        int i = this.f24530 - iArr[1];
        this.f24529 = i;
        view.setTranslationY(i);
        return c0923;
    }

    @Override // androidx.core.view.AbstractC3112
    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪世兰 */
    public final void mo2028(C3107 c3107) {
        this.f24532.setTranslationY(0.0f);
    }
}
