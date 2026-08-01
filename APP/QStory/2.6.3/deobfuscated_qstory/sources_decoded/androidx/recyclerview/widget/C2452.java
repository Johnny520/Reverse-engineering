package androidx.recyclerview.widget;

import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: androidx.recyclerview.widget.飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class C2452 extends AbstractC2516 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public C2456 f7299;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public C2456 f7300;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C2483 f7301 = new C2483(this);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public RecyclerView f7302;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static View m4816(AbstractC2519 abstractC2519, AbstractC2457 abstractC2457) {
        int iM4997 = abstractC2519.m4997();
        View view = null;
        if (iM4997 == 0) {
            return null;
        }
        int iMo4846 = (abstractC2457.mo4846() / 2) + abstractC2457.mo4845();
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < iM4997; i2++) {
            View viewM4998 = abstractC2519.m4998(i2);
            int iAbs = Math.abs(((abstractC2457.mo4838(viewM4998) / 2) + abstractC2457.mo4836(viewM4998)) - iMo4846);
            if (iAbs < i) {
                view = viewM4998;
                i = iAbs;
            }
        }
        return view;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static int m4817(View view, AbstractC2457 abstractC2457) {
        return ((abstractC2457.mo4838(view) / 2) + abstractC2457.mo4836(view)) - ((abstractC2457.mo4846() / 2) + abstractC2457.mo4845());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final AbstractC2457 m4818(AbstractC2519 abstractC2519) {
        C2456 c2456 = this.f7299;
        if (c2456 == null || ((AbstractC2519) c2456.f7309) != abstractC2519) {
            this.f7299 = new C2456(abstractC2519, 0);
        }
        return this.f7299;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public View mo4819(AbstractC2519 abstractC2519) {
        if (abstractC2519.mo4675()) {
            return m4816(abstractC2519, m4823(abstractC2519));
        }
        if (abstractC2519.mo4676()) {
            return m4816(abstractC2519, m4818(abstractC2519));
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int[] m4820(AbstractC2519 abstractC2519, View view) {
        int[] iArr = new int[2];
        if (abstractC2519.mo4676()) {
            iArr[0] = m4817(view, m4818(abstractC2519));
        } else {
            iArr[0] = 0;
        }
        if (abstractC2519.mo4675()) {
            iArr[1] = m4817(view, m4823(abstractC2519));
            return iArr;
        }
        iArr[1] = 0;
        return iArr;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m4821(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f7302;
        if (recyclerView2 == recyclerView) {
            return;
        }
        C2483 c2483 = this.f7301;
        if (recyclerView2 != null) {
            recyclerView2.removeOnScrollListener(c2483);
            this.f7302.setOnFlingListener(null);
        }
        this.f7302 = recyclerView;
        if (recyclerView != null) {
            if (recyclerView.getOnFlingListener() != null) {
                C5925.m11311("An instance of OnFlingListener already set.");
                return;
            }
            this.f7302.addOnScrollListener(c2483);
            this.f7302.setOnFlingListener(this);
            new Scroller(this.f7302.getContext(), new DecelerateInterpolator());
            m4822();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final void m4822() {
        AbstractC2519 layoutManager;
        View viewMo4819;
        RecyclerView recyclerView = this.f7302;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null || (viewMo4819 = mo4819(layoutManager)) == null) {
            return;
        }
        int[] iArrM4820 = m4820(layoutManager, viewMo4819);
        int i = iArrM4820[0];
        if (i == 0 && iArrM4820[1] == 0) {
            return;
        }
        this.f7302.m4748(i, iArrM4820[1], false);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final AbstractC2457 m4823(AbstractC2519 abstractC2519) {
        C2456 c2456 = this.f7300;
        if (c2456 == null || ((AbstractC2519) c2456.f7309) != abstractC2519) {
            this.f7300 = new C2456(abstractC2519, 1);
        }
        return this.f7300;
    }
}
