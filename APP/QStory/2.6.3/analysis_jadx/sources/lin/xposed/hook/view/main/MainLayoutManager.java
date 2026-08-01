package lin.xposed.hook.view.main;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.AbstractC2519;
import androidx.recyclerview.widget.C2518;
import androidx.recyclerview.widget.C2525;
import androidx.recyclerview.widget.C2531;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class MainLayoutManager extends AbstractC2519 {

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public int f15328 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public int f15329;

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏 */
    public final C2518 mo4601() {
        return new C2518(-2, -2);
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪世兰 */
    public final int mo4615(int i, C2531 c2531, C2525 c2525) {
        int i2 = this.f15329;
        int i3 = i2 + i;
        int paddingBottom = i3 < 0 ? -i2 : i3 > this.f15328 - ((this.f7580 - getPaddingBottom()) - getPaddingTop()) ? (this.f15328 - ((this.f7580 - getPaddingBottom()) - getPaddingTop())) - this.f15329 : i;
        this.f15329 += paddingBottom;
        mo4785(-paddingBottom);
        return i;
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public final boolean mo4675() {
        return true;
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子苏兰世哲楪 */
    public final void mo4620(C2531 c2531, C2525 c2525) {
        int i = 0;
        int i2 = 0;
        while (i < m4994()) {
            View viewM5031 = c2531.m5031(i);
            m5015(viewM5031);
            mo5019(viewM5031);
            int iM4984 = AbstractC2519.m4984(viewM5031);
            int iM4987 = AbstractC2519.m4987(viewM5031) + i2;
            Rect rect = ((C2518) viewM5031.getLayoutParams()).f7577;
            viewM5031.layout(rect.left, i2 + rect.top, iM4984 - rect.right, iM4987 - rect.bottom);
            i++;
            i2 = iM4987;
        }
        this.f15328 = Math.max(i2, (this.f7580 - getPaddingBottom()) - getPaddingTop());
    }
}
