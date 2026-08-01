package androidx.recyclerview.widget;

import android.view.View;
import java.util.ArrayList;
import p007.AbstractC6136;

/* JADX INFO: renamed from: androidx.recyclerview.widget.飘花落叶言子哲苏世兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2486 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final /* synthetic */ StaggeredGridLayoutManager f7439;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final int f7440;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final ArrayList f7444 = new ArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public int f7443 = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public int f7442 = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public int f7441 = 0;

    public C2486(StaggeredGridLayoutManager staggeredGridLayoutManager, int i) {
        this.f7439 = staggeredGridLayoutManager;
        this.f7440 = i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final int m4890() {
        return this.f7439.f7265 ? m4898(0, this.f7444.size()) : m4898(r1.size() - 1, -1);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final int m4891() {
        return this.f7439.f7265 ? m4898(r1.size() - 1, -1) : m4898(0, this.f7444.size());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m4892() {
        this.f7444.clear();
        this.f7443 = Integer.MIN_VALUE;
        this.f7442 = Integer.MIN_VALUE;
        this.f7441 = 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m4893() {
        StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem staggeredGridLayoutManager$LazySpanLookup$FullSpanItemM4918;
        View view = (View) this.f7444.get(0);
        C2475 c2475 = (C2475) view.getLayoutParams();
        StaggeredGridLayoutManager staggeredGridLayoutManager = this.f7439;
        this.f7443 = staggeredGridLayoutManager.f7272.mo4826(view);
        if (c2475.f7423 && (staggeredGridLayoutManager$LazySpanLookup$FullSpanItemM4918 = staggeredGridLayoutManager.f7260.m4918(c2475.f7578.getLayoutPosition())) != null && staggeredGridLayoutManager$LazySpanLookup$FullSpanItemM4918.f7282 == -1) {
            int i = this.f7443;
            int[] iArr = staggeredGridLayoutManager$LazySpanLookup$FullSpanItemM4918.f7283;
            this.f7443 = i - (iArr != null ? iArr[this.f7440] : 0);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m4894() {
        StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem staggeredGridLayoutManager$LazySpanLookup$FullSpanItemM4918;
        View view = (View) AbstractC6136.m11555(1, this.f7444);
        C2475 c2475 = (C2475) view.getLayoutParams();
        StaggeredGridLayoutManager staggeredGridLayoutManager = this.f7439;
        this.f7442 = staggeredGridLayoutManager.f7272.mo4829(view);
        if (c2475.f7423 && (staggeredGridLayoutManager$LazySpanLookup$FullSpanItemM4918 = staggeredGridLayoutManager.f7260.m4918(c2475.f7578.getLayoutPosition())) != null && staggeredGridLayoutManager$LazySpanLookup$FullSpanItemM4918.f7282 == 1) {
            int i = this.f7442;
            int[] iArr = staggeredGridLayoutManager$LazySpanLookup$FullSpanItemM4918.f7283;
            this.f7442 = i + (iArr == null ? 0 : iArr[this.f7440]);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m4895(View view) {
        C2475 c2475 = (C2475) view.getLayoutParams();
        c2475.f7422 = this;
        ArrayList arrayList = this.f7444;
        arrayList.add(view);
        this.f7442 = Integer.MIN_VALUE;
        if (arrayList.size() == 1) {
            this.f7443 = Integer.MIN_VALUE;
        }
        if (c2475.f7578.isRemoved() || c2475.f7578.isUpdated()) {
            this.f7441 = this.f7439.f7272.mo4828(view) + this.f7441;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final void m4896(View view) {
        C2475 c2475 = (C2475) view.getLayoutParams();
        c2475.f7422 = this;
        ArrayList arrayList = this.f7444;
        arrayList.add(0, view);
        this.f7443 = Integer.MIN_VALUE;
        if (arrayList.size() == 1) {
            this.f7442 = Integer.MIN_VALUE;
        }
        if (c2475.f7578.isRemoved() || c2475.f7578.isUpdated()) {
            this.f7441 = this.f7439.f7272.mo4828(view) + this.f7441;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final int m4897(int i) {
        int i2 = this.f7442;
        if (i2 != Integer.MIN_VALUE) {
            return i2;
        }
        if (this.f7444.size() == 0) {
            return i;
        }
        m4894();
        return this.f7442;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final int m4898(int i, int i2) {
        StaggeredGridLayoutManager staggeredGridLayoutManager = this.f7439;
        int iMo4835 = staggeredGridLayoutManager.f7272.mo4835();
        int iMo4834 = staggeredGridLayoutManager.f7272.mo4834();
        int i3 = i2 > i ? 1 : -1;
        while (i != i2) {
            View view = (View) this.f7444.get(i);
            int iMo4826 = staggeredGridLayoutManager.f7272.mo4826(view);
            int iMo4829 = staggeredGridLayoutManager.f7272.mo4829(view);
            boolean z = iMo4826 <= iMo4834;
            boolean z2 = iMo4829 >= iMo4835;
            if (z && z2 && (iMo4826 < iMo4835 || iMo4829 > iMo4834)) {
                return AbstractC2519.m4973(view);
            }
            i += i3;
        }
        return -1;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final void m4899() {
        ArrayList arrayList = this.f7444;
        int size = arrayList.size();
        View view = (View) arrayList.remove(size - 1);
        C2475 c2475 = (C2475) view.getLayoutParams();
        c2475.f7422 = null;
        if (c2475.f7578.isRemoved() || c2475.f7578.isUpdated()) {
            this.f7441 -= this.f7439.f7272.mo4828(view);
        }
        if (size == 1) {
            this.f7443 = Integer.MIN_VALUE;
        }
        this.f7442 = Integer.MIN_VALUE;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final void m4900() {
        ArrayList arrayList = this.f7444;
        View view = (View) arrayList.remove(0);
        C2475 c2475 = (C2475) view.getLayoutParams();
        c2475.f7422 = null;
        if (arrayList.size() == 0) {
            this.f7442 = Integer.MIN_VALUE;
        }
        if (c2475.f7578.isRemoved() || c2475.f7578.isUpdated()) {
            this.f7441 -= this.f7439.f7272.mo4828(view);
        }
        this.f7443 = Integer.MIN_VALUE;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final View m4901(int i, int i2) {
        StaggeredGridLayoutManager staggeredGridLayoutManager = this.f7439;
        View view = null;
        ArrayList arrayList = this.f7444;
        if (i2 != -1) {
            int size = arrayList.size() - 1;
            while (size >= 0) {
                View view2 = (View) arrayList.get(size);
                if ((staggeredGridLayoutManager.f7265 && AbstractC2519.m4973(view2) >= i) || ((!staggeredGridLayoutManager.f7265 && AbstractC2519.m4973(view2) <= i) || !view2.hasFocusable())) {
                    break;
                }
                size--;
                view = view2;
            }
            return view;
        }
        int size2 = arrayList.size();
        int i3 = 0;
        while (i3 < size2) {
            View view3 = (View) arrayList.get(i3);
            if ((staggeredGridLayoutManager.f7265 && AbstractC2519.m4973(view3) <= i) || ((!staggeredGridLayoutManager.f7265 && AbstractC2519.m4973(view3) >= i) || !view3.hasFocusable())) {
                break;
            }
            i3++;
            view = view3;
        }
        return view;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final int m4902(int i) {
        int i2 = this.f7443;
        if (i2 != Integer.MIN_VALUE) {
            return i2;
        }
        if (this.f7444.size() == 0) {
            return i;
        }
        m4893();
        return this.f7443;
    }
}
