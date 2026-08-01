package p303;

import android.view.View;
import androidx.appcompat.app.C0076;
import androidx.core.view.AbstractC2279;
import androidx.core.view.C2225;
import androidx.core.view.C2274;
import java.util.Iterator;
import java.util.List;
import p317.AbstractC8680;

/* JADX INFO: renamed from: 飘花落叶言楪苏世子哲兰.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C8621 extends AbstractC2279 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public int f24193;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public int f24194;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final int[] f24195;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final View f24196;

    public C8621(View view) {
        super(0);
        this.f24195 = new int[2];
        this.f24196 = view;
    }

    @Override // androidx.core.view.AbstractC2279
    /* JADX INFO: renamed from: 飘花落叶言子苏哲世兰楪 */
    public final C2225 mo1455(C2225 c2225, List list) {
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            if ((((C2274) it.next()).f6603.mo4244() & 8) != 0) {
                this.f24196.setTranslationY(AbstractC8680.m14376(this.f24193, r0.f6603.mo4245(), 0));
                break;
            }
        }
        return c2225;
    }

    @Override // androidx.core.view.AbstractC2279
    /* JADX INFO: renamed from: 飘花落叶言子苏哲世楪兰 */
    public final void mo1456(C2274 c2274) {
        View view = this.f24196;
        int[] iArr = this.f24195;
        view.getLocationOnScreen(iArr);
        this.f24194 = iArr[1];
    }

    @Override // androidx.core.view.AbstractC2279
    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰楪世 */
    public final C0076 mo1457(C2274 c2274, C0076 c0076) {
        View view = this.f24196;
        int[] iArr = this.f24195;
        view.getLocationOnScreen(iArr);
        int i = this.f24194 - iArr[1];
        this.f24193 = i;
        view.setTranslationY(i);
        return c0076;
    }

    @Override // androidx.core.view.AbstractC2279
    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪世兰 */
    public final void mo1458(C2274 c2274) {
        this.f24196.setTranslationY(0.0f);
    }
}
