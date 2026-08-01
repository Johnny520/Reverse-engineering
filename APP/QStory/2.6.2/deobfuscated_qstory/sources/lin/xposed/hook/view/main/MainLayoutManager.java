package lin.xposed.hook.view.main;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.AbstractC2519;
import androidx.recyclerview.widget.C2518;
import androidx.recyclerview.widget.C2525;
import androidx.recyclerview.widget.C2531;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public class MainLayoutManager extends AbstractC2519 {

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public int f15328 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public int f15329;

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏 */
    public final C2518 mo4591() {
        return new C2518(-2, -2);
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪世兰 */
    public final int mo4605(int i, C2531 c2531, C2525 c2525) {
        int i2 = this.f15329;
        int i3 = i2 + i;
        int paddingBottom = i3 < 0 ? -i2 : i3 > this.f15328 - ((this.f7579 - getPaddingBottom()) - getPaddingTop()) ? (this.f15328 - ((this.f7579 - getPaddingBottom()) - getPaddingTop())) - this.f15329 : i;
        this.f15329 += paddingBottom;
        mo4775(-paddingBottom);
        return i;
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public final boolean mo4665() {
        return true;
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子苏兰世哲楪 */
    public final void mo4610(C2531 c2531, C2525 c2525) {
        int i = 0;
        int i2 = 0;
        while (i < m4984()) {
            View viewM5021 = c2531.m5021(i);
            m5005(viewM5021);
            mo5009(viewM5021);
            int iM4974 = AbstractC2519.m4974(viewM5021);
            int iM4977 = AbstractC2519.m4977(viewM5021) + i2;
            Rect rect = ((C2518) viewM5021.getLayoutParams()).f7576;
            viewM5021.layout(rect.left, i2 + rect.top, iM4974 - rect.right, iM4977 - rect.bottom);
            i++;
            i2 = iM4977;
        }
        this.f15328 = Math.max(i2, (this.f7579 - getPaddingBottom()) - getPaddingTop());
    }
}
