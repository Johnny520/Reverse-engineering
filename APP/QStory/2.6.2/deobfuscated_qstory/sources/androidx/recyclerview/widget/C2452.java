package androidx.recyclerview.widget;

import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: androidx.recyclerview.widget.飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public class C2452 extends AbstractC2516 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public C2456 f7298;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public C2456 f7299;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C2483 f7300 = new C2483(this);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public RecyclerView f7301;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static View m4806(AbstractC2519 abstractC2519, AbstractC2457 abstractC2457) {
        int iM4987 = abstractC2519.m4987();
        View view = null;
        if (iM4987 == 0) {
            return null;
        }
        int iMo4836 = (abstractC2457.mo4836() / 2) + abstractC2457.mo4835();
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < iM4987; i2++) {
            View viewM4988 = abstractC2519.m4988(i2);
            int iAbs = Math.abs(((abstractC2457.mo4828(viewM4988) / 2) + abstractC2457.mo4826(viewM4988)) - iMo4836);
            if (iAbs < i) {
                view = viewM4988;
                i = iAbs;
            }
        }
        return view;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static int m4807(View view, AbstractC2457 abstractC2457) {
        return ((abstractC2457.mo4828(view) / 2) + abstractC2457.mo4826(view)) - ((abstractC2457.mo4836() / 2) + abstractC2457.mo4835());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final AbstractC2457 m4808(AbstractC2519 abstractC2519) {
        C2456 c2456 = this.f7298;
        if (c2456 == null || ((AbstractC2519) c2456.f7308) != abstractC2519) {
            this.f7298 = new C2456(abstractC2519, 0);
        }
        return this.f7298;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public View mo4809(AbstractC2519 abstractC2519) {
        if (abstractC2519.mo4665()) {
            return m4806(abstractC2519, m4813(abstractC2519));
        }
        if (abstractC2519.mo4666()) {
            return m4806(abstractC2519, m4808(abstractC2519));
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int[] m4810(AbstractC2519 abstractC2519, View view) {
        int[] iArr = new int[2];
        if (abstractC2519.mo4666()) {
            iArr[0] = m4807(view, m4808(abstractC2519));
        } else {
            iArr[0] = 0;
        }
        if (abstractC2519.mo4665()) {
            iArr[1] = m4807(view, m4813(abstractC2519));
            return iArr;
        }
        iArr[1] = 0;
        return iArr;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m4811(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f7301;
        if (recyclerView2 == recyclerView) {
            return;
        }
        C2483 c2483 = this.f7300;
        if (recyclerView2 != null) {
            recyclerView2.removeOnScrollListener(c2483);
            this.f7301.setOnFlingListener(null);
        }
        this.f7301 = recyclerView;
        if (recyclerView != null) {
            if (recyclerView.getOnFlingListener() != null) {
                C5919.m11250("An instance of OnFlingListener already set.");
                return;
            }
            this.f7301.addOnScrollListener(c2483);
            this.f7301.setOnFlingListener(this);
            new Scroller(this.f7301.getContext(), new DecelerateInterpolator());
            m4812();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final void m4812() {
        AbstractC2519 layoutManager;
        View viewMo4809;
        RecyclerView recyclerView = this.f7301;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null || (viewMo4809 = mo4809(layoutManager)) == null) {
            return;
        }
        int[] iArrM4810 = m4810(layoutManager, viewMo4809);
        int i = iArrM4810[0];
        if (i == 0 && iArrM4810[1] == 0) {
            return;
        }
        this.f7301.m4738(i, iArrM4810[1], false);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final AbstractC2457 m4813(AbstractC2519 abstractC2519) {
        C2456 c2456 = this.f7299;
        if (c2456 == null || ((AbstractC2519) c2456.f7308) != abstractC2519) {
            this.f7299 = new C2456(abstractC2519, 1);
        }
        return this.f7299;
    }
}
