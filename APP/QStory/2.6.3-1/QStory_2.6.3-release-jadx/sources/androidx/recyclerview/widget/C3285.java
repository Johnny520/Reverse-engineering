package androidx.recyclerview.widget;

import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: androidx.recyclerview.widget.飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class C3285 extends AbstractC3349 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public C3289 f7644;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public C3289 f7645;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C3316 f7646 = new C3316(this);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public RecyclerView f7647;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static View m5376(AbstractC3352 abstractC3352, AbstractC3290 abstractC3290) {
        int iM5557 = abstractC3352.m5557();
        View view = null;
        if (iM5557 == 0) {
            return null;
        }
        int iMo5406 = (abstractC3290.mo5406() / 2) + abstractC3290.mo5405();
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < iM5557; i2++) {
            View viewM5558 = abstractC3352.m5558(i2);
            int iAbs = Math.abs(((abstractC3290.mo5398(viewM5558) / 2) + abstractC3290.mo5396(viewM5558)) - iMo5406);
            if (iAbs < i) {
                view = viewM5558;
                i = iAbs;
            }
        }
        return view;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static int m5377(View view, AbstractC3290 abstractC3290) {
        return ((abstractC3290.mo5398(view) / 2) + abstractC3290.mo5396(view)) - ((abstractC3290.mo5406() / 2) + abstractC3290.mo5405());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final AbstractC3290 m5378(AbstractC3352 abstractC3352) {
        C3289 c3289 = this.f7644;
        if (c3289 == null || ((AbstractC3352) c3289.f7654) != abstractC3352) {
            this.f7644 = new C3289(abstractC3352, 0);
        }
        return this.f7644;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public View mo5379(AbstractC3352 abstractC3352) {
        if (abstractC3352.mo5235()) {
            return m5376(abstractC3352, m5383(abstractC3352));
        }
        if (abstractC3352.mo5236()) {
            return m5376(abstractC3352, m5378(abstractC3352));
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int[] m5380(AbstractC3352 abstractC3352, View view) {
        int[] iArr = new int[2];
        if (abstractC3352.mo5236()) {
            iArr[0] = m5377(view, m5378(abstractC3352));
        } else {
            iArr[0] = 0;
        }
        if (abstractC3352.mo5235()) {
            iArr[1] = m5377(view, m5383(abstractC3352));
            return iArr;
        }
        iArr[1] = 0;
        return iArr;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m5381(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f7647;
        if (recyclerView2 == recyclerView) {
            return;
        }
        C3316 c3316 = this.f7646;
        if (recyclerView2 != null) {
            recyclerView2.removeOnScrollListener(c3316);
            this.f7647.setOnFlingListener(null);
        }
        this.f7647 = recyclerView;
        if (recyclerView != null) {
            if (recyclerView.getOnFlingListener() != null) {
                C6755.m11870("An instance of OnFlingListener already set.");
                return;
            }
            this.f7647.addOnScrollListener(c3316);
            this.f7647.setOnFlingListener(this);
            new Scroller(this.f7647.getContext(), new DecelerateInterpolator());
            m5382();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final void m5382() {
        AbstractC3352 layoutManager;
        View viewMo5379;
        RecyclerView recyclerView = this.f7647;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null || (viewMo5379 = mo5379(layoutManager)) == null) {
            return;
        }
        int[] iArrM5380 = m5380(layoutManager, viewMo5379);
        int i = iArrM5380[0];
        if (i == 0 && iArrM5380[1] == 0) {
            return;
        }
        this.f7647.m5308(i, iArrM5380[1], false);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final AbstractC3290 m5383(AbstractC3352 abstractC3352) {
        C3289 c3289 = this.f7645;
        if (c3289 == null || ((AbstractC3352) c3289.f7654) != abstractC3352) {
            this.f7645 = new C3289(abstractC3352, 1);
        }
        return this.f7645;
    }
}
