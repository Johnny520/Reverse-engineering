package androidx.recyclerview.widget;

import android.view.View;
import java.util.List;

/* JADX INFO: renamed from: androidx.recyclerview.widget.飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3302 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public int f7703;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public int f7704;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public int f7705;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public int f7706;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public int f7707;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public boolean f7708;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public int f7709;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public int f7710;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public List f7711;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public boolean f7712;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public int f7713;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public int f7714;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final View m5433(C3364 c3364) {
        List list = this.f7711;
        if (list == null) {
            View viewM5591 = c3364.m5591(this.f7705);
            this.f7705 += this.f7704;
            return viewM5591;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            View view = ((AbstractC3317) this.f7711.get(i)).itemView;
            C3351 c3351 = (C3351) view.getLayoutParams();
            if (!c3351.f7924.isRemoved() && this.f7705 == c3351.f7924.getLayoutPosition()) {
                m5434(view);
                return view;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m5434(View view) {
        int layoutPosition;
        int size = this.f7711.size();
        View view2 = null;
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < size; i2++) {
            View view3 = ((AbstractC3317) this.f7711.get(i2)).itemView;
            C3351 c3351 = (C3351) view3.getLayoutParams();
            if (view3 != view && !c3351.f7924.isRemoved() && (layoutPosition = (c3351.f7924.getLayoutPosition() - this.f7705) * this.f7704) >= 0 && layoutPosition < i) {
                view2 = view3;
                if (layoutPosition == 0) {
                    break;
                } else {
                    i = layoutPosition;
                }
            }
        }
        if (view2 == null) {
            this.f7705 = -1;
        } else {
            this.f7705 = ((C3351) view2.getLayoutParams()).f7924.getLayoutPosition();
        }
    }
}
