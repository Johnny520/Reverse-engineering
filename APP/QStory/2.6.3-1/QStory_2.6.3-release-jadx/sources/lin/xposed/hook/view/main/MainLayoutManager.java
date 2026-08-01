package lin.xposed.hook.view.main;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.AbstractC3352;
import androidx.recyclerview.widget.C3351;
import androidx.recyclerview.widget.C3358;
import androidx.recyclerview.widget.C3364;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class MainLayoutManager extends AbstractC3352 {

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public int f15673 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public int f15674;

    @Override // androidx.recyclerview.widget.AbstractC3352
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏 */
    public final C3351 mo5161() {
        return new C3351(-2, -2);
    }

    @Override // androidx.recyclerview.widget.AbstractC3352
    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪世兰 */
    public final int mo5175(int i, C3364 c3364, C3358 c3358) {
        int i2 = this.f15674;
        int i3 = i2 + i;
        int paddingBottom = i3 < 0 ? -i2 : i3 > this.f15673 - ((this.f7925 - getPaddingBottom()) - getPaddingTop()) ? (this.f15673 - ((this.f7925 - getPaddingBottom()) - getPaddingTop())) - this.f15674 : i;
        this.f15674 += paddingBottom;
        mo5345(-paddingBottom);
        return i;
    }

    @Override // androidx.recyclerview.widget.AbstractC3352
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public final boolean mo5235() {
        return true;
    }

    @Override // androidx.recyclerview.widget.AbstractC3352
    /* JADX INFO: renamed from: 飘花落叶言子苏兰世哲楪 */
    public final void mo5180(C3364 c3364, C3358 c3358) {
        int i = 0;
        int i2 = 0;
        while (i < m5554()) {
            View viewM5591 = c3364.m5591(i);
            m5575(viewM5591);
            mo5579(viewM5591);
            int iM5544 = AbstractC3352.m5544(viewM5591);
            int iM5547 = AbstractC3352.m5547(viewM5591) + i2;
            Rect rect = ((C3351) viewM5591.getLayoutParams()).f7922;
            viewM5591.layout(rect.left, i2 + rect.top, iM5544 - rect.right, iM5547 - rect.bottom);
            i++;
            i2 = iM5547;
        }
        this.f15673 = Math.max(i2, (this.f7925 - getPaddingBottom()) - getPaddingTop());
    }
}
