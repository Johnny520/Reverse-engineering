package androidx.recyclerview.widget;

import android.view.View;
import java.util.List;

/* JADX INFO: renamed from: androidx.recyclerview.widget.飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2469 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public int f7357;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public int f7358;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public int f7359;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public int f7360;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public int f7361;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public boolean f7362;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public int f7363;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public int f7364;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public List f7365;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public boolean f7366;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public int f7367;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public int f7368;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final View m4863(C2531 c2531) {
        List list = this.f7365;
        if (list == null) {
            View viewM5021 = c2531.m5021(this.f7359);
            this.f7359 += this.f7358;
            return viewM5021;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            View view = ((AbstractC2484) this.f7365.get(i)).itemView;
            C2518 c2518 = (C2518) view.getLayoutParams();
            if (!c2518.f7578.isRemoved() && this.f7359 == c2518.f7578.getLayoutPosition()) {
                m4864(view);
                return view;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m4864(View view) {
        int layoutPosition;
        int size = this.f7365.size();
        View view2 = null;
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < size; i2++) {
            View view3 = ((AbstractC2484) this.f7365.get(i2)).itemView;
            C2518 c2518 = (C2518) view3.getLayoutParams();
            if (view3 != view && !c2518.f7578.isRemoved() && (layoutPosition = (c2518.f7578.getLayoutPosition() - this.f7359) * this.f7358) >= 0 && layoutPosition < i) {
                view2 = view3;
                if (layoutPosition == 0) {
                    break;
                } else {
                    i = layoutPosition;
                }
            }
        }
        if (view2 == null) {
            this.f7359 = -1;
        } else {
            this.f7359 = ((C2518) view2.getLayoutParams()).f7578.getLayoutPosition();
        }
    }
}
