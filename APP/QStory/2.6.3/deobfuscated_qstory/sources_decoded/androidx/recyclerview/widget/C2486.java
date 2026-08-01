package androidx.recyclerview.widget;

import android.view.View;
import java.util.ArrayList;
import p009.AbstractC6183;

/* JADX INFO: renamed from: androidx.recyclerview.widget.飘花落叶言子哲苏世兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2486 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final /* synthetic */ StaggeredGridLayoutManager f7440;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final int f7441;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final ArrayList f7445 = new ArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public int f7444 = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public int f7443 = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public int f7442 = 0;

    public C2486(StaggeredGridLayoutManager staggeredGridLayoutManager, int i) {
        this.f7440 = staggeredGridLayoutManager;
        this.f7441 = i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final int m4900() {
        return this.f7440.f7266 ? m4908(0, this.f7445.size()) : m4908(r1.size() - 1, -1);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final int m4901() {
        return this.f7440.f7266 ? m4908(r1.size() - 1, -1) : m4908(0, this.f7445.size());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m4902() {
        this.f7445.clear();
        this.f7444 = Integer.MIN_VALUE;
        this.f7443 = Integer.MIN_VALUE;
        this.f7442 = 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m4903() {
        StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem staggeredGridLayoutManager$LazySpanLookup$FullSpanItemM4928;
        View view = (View) this.f7445.get(0);
        C2475 c2475 = (C2475) view.getLayoutParams();
        StaggeredGridLayoutManager staggeredGridLayoutManager = this.f7440;
        this.f7444 = staggeredGridLayoutManager.f7273.mo4836(view);
        if (c2475.f7424 && (staggeredGridLayoutManager$LazySpanLookup$FullSpanItemM4928 = staggeredGridLayoutManager.f7261.m4928(c2475.f7579.getLayoutPosition())) != null && staggeredGridLayoutManager$LazySpanLookup$FullSpanItemM4928.f7283 == -1) {
            int i = this.f7444;
            int[] iArr = staggeredGridLayoutManager$LazySpanLookup$FullSpanItemM4928.f7284;
            this.f7444 = i - (iArr != null ? iArr[this.f7441] : 0);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m4904() {
        StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem staggeredGridLayoutManager$LazySpanLookup$FullSpanItemM4928;
        View view = (View) AbstractC6183.m11586(1, this.f7445);
        C2475 c2475 = (C2475) view.getLayoutParams();
        StaggeredGridLayoutManager staggeredGridLayoutManager = this.f7440;
        this.f7443 = staggeredGridLayoutManager.f7273.mo4839(view);
        if (c2475.f7424 && (staggeredGridLayoutManager$LazySpanLookup$FullSpanItemM4928 = staggeredGridLayoutManager.f7261.m4928(c2475.f7579.getLayoutPosition())) != null && staggeredGridLayoutManager$LazySpanLookup$FullSpanItemM4928.f7283 == 1) {
            int i = this.f7443;
            int[] iArr = staggeredGridLayoutManager$LazySpanLookup$FullSpanItemM4928.f7284;
            this.f7443 = i + (iArr == null ? 0 : iArr[this.f7441]);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m4905(View view) {
        C2475 c2475 = (C2475) view.getLayoutParams();
        c2475.f7423 = this;
        ArrayList arrayList = this.f7445;
        arrayList.add(view);
        this.f7443 = Integer.MIN_VALUE;
        if (arrayList.size() == 1) {
            this.f7444 = Integer.MIN_VALUE;
        }
        if (c2475.f7579.isRemoved() || c2475.f7579.isUpdated()) {
            this.f7442 = this.f7440.f7273.mo4838(view) + this.f7442;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final void m4906(View view) {
        C2475 c2475 = (C2475) view.getLayoutParams();
        c2475.f7423 = this;
        ArrayList arrayList = this.f7445;
        arrayList.add(0, view);
        this.f7444 = Integer.MIN_VALUE;
        if (arrayList.size() == 1) {
            this.f7443 = Integer.MIN_VALUE;
        }
        if (c2475.f7579.isRemoved() || c2475.f7579.isUpdated()) {
            this.f7442 = this.f7440.f7273.mo4838(view) + this.f7442;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final int m4907(int i) {
        int i2 = this.f7443;
        if (i2 != Integer.MIN_VALUE) {
            return i2;
        }
        if (this.f7445.size() == 0) {
            return i;
        }
        m4904();
        return this.f7443;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final int m4908(int i, int i2) {
        StaggeredGridLayoutManager staggeredGridLayoutManager = this.f7440;
        int iMo4845 = staggeredGridLayoutManager.f7273.mo4845();
        int iMo4844 = staggeredGridLayoutManager.f7273.mo4844();
        int i3 = i2 > i ? 1 : -1;
        while (i != i2) {
            View view = (View) this.f7445.get(i);
            int iMo4836 = staggeredGridLayoutManager.f7273.mo4836(view);
            int iMo4839 = staggeredGridLayoutManager.f7273.mo4839(view);
            boolean z = iMo4836 <= iMo4844;
            boolean z2 = iMo4839 >= iMo4845;
            if (z && z2 && (iMo4836 < iMo4845 || iMo4839 > iMo4844)) {
                return AbstractC2519.m4983(view);
            }
            i += i3;
        }
        return -1;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final void m4909() {
        ArrayList arrayList = this.f7445;
        int size = arrayList.size();
        View view = (View) arrayList.remove(size - 1);
        C2475 c2475 = (C2475) view.getLayoutParams();
        c2475.f7423 = null;
        if (c2475.f7579.isRemoved() || c2475.f7579.isUpdated()) {
            this.f7442 -= this.f7440.f7273.mo4838(view);
        }
        if (size == 1) {
            this.f7444 = Integer.MIN_VALUE;
        }
        this.f7443 = Integer.MIN_VALUE;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final void m4910() {
        ArrayList arrayList = this.f7445;
        View view = (View) arrayList.remove(0);
        C2475 c2475 = (C2475) view.getLayoutParams();
        c2475.f7423 = null;
        if (arrayList.size() == 0) {
            this.f7443 = Integer.MIN_VALUE;
        }
        if (c2475.f7579.isRemoved() || c2475.f7579.isUpdated()) {
            this.f7442 -= this.f7440.f7273.mo4838(view);
        }
        this.f7444 = Integer.MIN_VALUE;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final View m4911(int i, int i2) {
        StaggeredGridLayoutManager staggeredGridLayoutManager = this.f7440;
        View view = null;
        ArrayList arrayList = this.f7445;
        if (i2 != -1) {
            int size = arrayList.size() - 1;
            while (size >= 0) {
                View view2 = (View) arrayList.get(size);
                if ((staggeredGridLayoutManager.f7266 && AbstractC2519.m4983(view2) >= i) || ((!staggeredGridLayoutManager.f7266 && AbstractC2519.m4983(view2) <= i) || !view2.hasFocusable())) {
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
            if ((staggeredGridLayoutManager.f7266 && AbstractC2519.m4983(view3) <= i) || ((!staggeredGridLayoutManager.f7266 && AbstractC2519.m4983(view3) >= i) || !view3.hasFocusable())) {
                break;
            }
            i3++;
            view = view3;
        }
        return view;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final int m4912(int i) {
        int i2 = this.f7444;
        if (i2 != Integer.MIN_VALUE) {
            return i2;
        }
        if (this.f7445.size() == 0) {
            return i;
        }
        m4903();
        return this.f7444;
    }
}
