package androidx.recyclerview.widget;

import android.view.View;
import java.util.ArrayList;
import p025.AbstractC7012;

/* JADX INFO: renamed from: androidx.recyclerview.widget.飘花落叶言子哲苏世兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3319 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final /* synthetic */ StaggeredGridLayoutManager f7785;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final int f7786;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final ArrayList f7790 = new ArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public int f7789 = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public int f7788 = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public int f7787 = 0;

    public C3319(StaggeredGridLayoutManager staggeredGridLayoutManager, int i) {
        this.f7785 = staggeredGridLayoutManager;
        this.f7786 = i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final int m5460() {
        return this.f7785.f7611 ? m5468(0, this.f7790.size()) : m5468(r1.size() - 1, -1);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final int m5461() {
        return this.f7785.f7611 ? m5468(r1.size() - 1, -1) : m5468(0, this.f7790.size());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m5462() {
        this.f7790.clear();
        this.f7789 = Integer.MIN_VALUE;
        this.f7788 = Integer.MIN_VALUE;
        this.f7787 = 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m5463() {
        StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem staggeredGridLayoutManager$LazySpanLookup$FullSpanItemM5488;
        View view = (View) this.f7790.get(0);
        C3308 c3308 = (C3308) view.getLayoutParams();
        StaggeredGridLayoutManager staggeredGridLayoutManager = this.f7785;
        this.f7789 = staggeredGridLayoutManager.f7618.mo5396(view);
        if (c3308.f7769 && (staggeredGridLayoutManager$LazySpanLookup$FullSpanItemM5488 = staggeredGridLayoutManager.f7606.m5488(c3308.f7924.getLayoutPosition())) != null && staggeredGridLayoutManager$LazySpanLookup$FullSpanItemM5488.f7628 == -1) {
            int i = this.f7789;
            int[] iArr = staggeredGridLayoutManager$LazySpanLookup$FullSpanItemM5488.f7629;
            this.f7789 = i - (iArr != null ? iArr[this.f7786] : 0);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m5464() {
        StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem staggeredGridLayoutManager$LazySpanLookup$FullSpanItemM5488;
        View view = (View) AbstractC7012.m12145(1, this.f7790);
        C3308 c3308 = (C3308) view.getLayoutParams();
        StaggeredGridLayoutManager staggeredGridLayoutManager = this.f7785;
        this.f7788 = staggeredGridLayoutManager.f7618.mo5399(view);
        if (c3308.f7769 && (staggeredGridLayoutManager$LazySpanLookup$FullSpanItemM5488 = staggeredGridLayoutManager.f7606.m5488(c3308.f7924.getLayoutPosition())) != null && staggeredGridLayoutManager$LazySpanLookup$FullSpanItemM5488.f7628 == 1) {
            int i = this.f7788;
            int[] iArr = staggeredGridLayoutManager$LazySpanLookup$FullSpanItemM5488.f7629;
            this.f7788 = i + (iArr == null ? 0 : iArr[this.f7786]);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m5465(View view) {
        C3308 c3308 = (C3308) view.getLayoutParams();
        c3308.f7768 = this;
        ArrayList arrayList = this.f7790;
        arrayList.add(view);
        this.f7788 = Integer.MIN_VALUE;
        if (arrayList.size() == 1) {
            this.f7789 = Integer.MIN_VALUE;
        }
        if (c3308.f7924.isRemoved() || c3308.f7924.isUpdated()) {
            this.f7787 = this.f7785.f7618.mo5398(view) + this.f7787;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final void m5466(View view) {
        C3308 c3308 = (C3308) view.getLayoutParams();
        c3308.f7768 = this;
        ArrayList arrayList = this.f7790;
        arrayList.add(0, view);
        this.f7789 = Integer.MIN_VALUE;
        if (arrayList.size() == 1) {
            this.f7788 = Integer.MIN_VALUE;
        }
        if (c3308.f7924.isRemoved() || c3308.f7924.isUpdated()) {
            this.f7787 = this.f7785.f7618.mo5398(view) + this.f7787;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final int m5467(int i) {
        int i2 = this.f7788;
        if (i2 != Integer.MIN_VALUE) {
            return i2;
        }
        if (this.f7790.size() == 0) {
            return i;
        }
        m5464();
        return this.f7788;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final int m5468(int i, int i2) {
        StaggeredGridLayoutManager staggeredGridLayoutManager = this.f7785;
        int iMo5405 = staggeredGridLayoutManager.f7618.mo5405();
        int iMo5404 = staggeredGridLayoutManager.f7618.mo5404();
        int i3 = i2 > i ? 1 : -1;
        while (i != i2) {
            View view = (View) this.f7790.get(i);
            int iMo5396 = staggeredGridLayoutManager.f7618.mo5396(view);
            int iMo5399 = staggeredGridLayoutManager.f7618.mo5399(view);
            boolean z = iMo5396 <= iMo5404;
            boolean z2 = iMo5399 >= iMo5405;
            if (z && z2 && (iMo5396 < iMo5405 || iMo5399 > iMo5404)) {
                return AbstractC3352.m5543(view);
            }
            i += i3;
        }
        return -1;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final void m5469() {
        ArrayList arrayList = this.f7790;
        int size = arrayList.size();
        View view = (View) arrayList.remove(size - 1);
        C3308 c3308 = (C3308) view.getLayoutParams();
        c3308.f7768 = null;
        if (c3308.f7924.isRemoved() || c3308.f7924.isUpdated()) {
            this.f7787 -= this.f7785.f7618.mo5398(view);
        }
        if (size == 1) {
            this.f7789 = Integer.MIN_VALUE;
        }
        this.f7788 = Integer.MIN_VALUE;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final void m5470() {
        ArrayList arrayList = this.f7790;
        View view = (View) arrayList.remove(0);
        C3308 c3308 = (C3308) view.getLayoutParams();
        c3308.f7768 = null;
        if (arrayList.size() == 0) {
            this.f7788 = Integer.MIN_VALUE;
        }
        if (c3308.f7924.isRemoved() || c3308.f7924.isUpdated()) {
            this.f7787 -= this.f7785.f7618.mo5398(view);
        }
        this.f7789 = Integer.MIN_VALUE;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final View m5471(int i, int i2) {
        StaggeredGridLayoutManager staggeredGridLayoutManager = this.f7785;
        View view = null;
        ArrayList arrayList = this.f7790;
        if (i2 != -1) {
            int size = arrayList.size() - 1;
            while (size >= 0) {
                View view2 = (View) arrayList.get(size);
                if ((staggeredGridLayoutManager.f7611 && AbstractC3352.m5543(view2) >= i) || ((!staggeredGridLayoutManager.f7611 && AbstractC3352.m5543(view2) <= i) || !view2.hasFocusable())) {
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
            if ((staggeredGridLayoutManager.f7611 && AbstractC3352.m5543(view3) <= i) || ((!staggeredGridLayoutManager.f7611 && AbstractC3352.m5543(view3) >= i) || !view3.hasFocusable())) {
                break;
            }
            i3++;
            view = view3;
        }
        return view;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final int m5472(int i) {
        int i2 = this.f7789;
        if (i2 != Integer.MIN_VALUE) {
            return i2;
        }
        if (this.f7790.size() == 0) {
            return i;
        }
        m5463();
        return this.f7789;
    }
}
