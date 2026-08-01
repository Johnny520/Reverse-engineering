package p232;

import android.view.View;
import android.view.ViewGroup;
import androidx.compose.material.ripple.RunnableC1945;
import androidx.profileinstaller.AbstractC3275;
import androidx.recyclerview.widget.AbstractC3283;
import androidx.recyclerview.widget.AbstractC3317;
import androidx.recyclerview.widget.C3284;
import androidx.recyclerview.widget.RecyclerView;
import com.davemorrissey.labs.subscaleview.C0328R;
import io.ktor.util.C5043;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.text.AbstractC5977;
import p120.AbstractC8107;
import p231.C8784;
import p231.C8785;
import p231.C8786;
import p231.C8787;
import p236.InterfaceC8804;
import p246.C8878;
import p402.C9904;

/* JADX INFO: renamed from: 飘花落叶言楪世兰哲苏子.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8788 extends AbstractC3283 implements InterfaceC8804 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public RecyclerView f22371;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public C8878 f22373;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public boolean f22376;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public AbstractC8107 f22372 = C8785.f22367;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final ArrayList f22370 = new ArrayList(0);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final boolean f22374 = true;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final boolean f22375 = true;

    public final String toString() {
        return AbstractC5977.m10737("\n            TrailingLoadStateAdapter ->\n            [isLoadEndDisplay: " + this.f22374 + "],\n            [isAutoLoadMore: " + this.f22375 + "],\n            [preloadSize: 0],\n            [loadState: " + this.f22372 + "]\n        ");
    }

    @Override // androidx.recyclerview.widget.AbstractC3283
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final int mo5352(int i) {
        this.f22372.getClass();
        return C0328R.layout.brvah_trailing_load_more;
    }

    @Override // androidx.recyclerview.widget.AbstractC3283
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final int mo5354() {
        return m14010(this.f22372) ? 1 : 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final void m14009(AbstractC8107 abstractC8107) {
        if (AbstractC5227.m9466(this.f22372, abstractC8107)) {
            return;
        }
        boolean zM14010 = m14010(this.f22372);
        boolean zM140102 = m14010(abstractC8107);
        C3284 c3284 = this.f7643;
        if (zM14010 && !zM140102) {
            c3284.m5369(0, 1);
        } else if (zM140102 && !zM14010) {
            c3284.m5370(0, 1);
        } else if (zM14010 && zM140102) {
            m5364(0);
        }
        this.f22372 = abstractC8107;
        Iterator it = this.f22370.iterator();
        if (it.hasNext()) {
            throw AbstractC3275.m5138(it);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final boolean m14010(AbstractC8107 abstractC8107) {
        abstractC8107.getClass();
        boolean z = abstractC8107.f19722;
        if ((abstractC8107 instanceof C8786) || (abstractC8107 instanceof C8787)) {
            return true;
        }
        boolean z2 = abstractC8107 instanceof C8784;
        if (!z2 || z) {
            return this.f22374 && z2 && z;
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.AbstractC3283
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public final void mo5357(RecyclerView recyclerView) {
        this.f22371 = null;
    }

    @Override // androidx.recyclerview.widget.AbstractC3283
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public final AbstractC3317 mo5358(int i, ViewGroup viewGroup) {
        this.f22372.getClass();
        C8789 c8789 = new C8789(viewGroup);
        final int i2 = 0;
        c8789.f22378.setOnClickListener(new View.OnClickListener(this) { // from class: 飘花落叶言楪世兰哲苏子.飘花落叶言子楪世苏哲兰

            /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
            public final /* synthetic */ C8788 f22381;

            {
                this.f22381 = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i3 = i2;
                C8786 c8786 = C8786.f22368;
                C8788 c8788 = this.f22381;
                switch (i3) {
                    case 0:
                        c8788.m14009(c8786);
                        C8878 c8878 = c8788.f22373;
                        if (c8878 != null) {
                            C9904.m15209((C9904) c8878.f22564);
                        }
                        break;
                    default:
                        c8788.m14009(c8786);
                        C8878 c88782 = c8788.f22373;
                        if (c88782 != null) {
                            C9904.m15209((C9904) c88782.f22564);
                        }
                        break;
                }
            }
        });
        final int i3 = 1;
        c8789.f22380.setOnClickListener(new View.OnClickListener(this) { // from class: 飘花落叶言楪世兰哲苏子.飘花落叶言子楪世苏哲兰

            /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
            public final /* synthetic */ C8788 f22381;

            {
                this.f22381 = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i32 = i3;
                C8786 c8786 = C8786.f22368;
                C8788 c8788 = this.f22381;
                switch (i32) {
                    case 0:
                        c8788.m14009(c8786);
                        C8878 c8878 = c8788.f22373;
                        if (c8878 != null) {
                            C9904.m15209((C9904) c8878.f22564);
                        }
                        break;
                    default:
                        c8788.m14009(c8786);
                        C8878 c88782 = c8788.f22373;
                        if (c88782 != null) {
                            C9904.m15209((C9904) c88782.f22564);
                        }
                        break;
                }
            }
        });
        return c8789;
    }

    @Override // androidx.recyclerview.widget.AbstractC3283
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public final void mo5362(AbstractC3317 abstractC3317) {
        RecyclerView recyclerView;
        if (this.f22375) {
            C8878 c8878 = this.f22373;
            if (c8878 != null) {
                C9904 c9904 = (C9904) c8878.f22564;
                if (c9904.f25778 || c9904.f25786 >= c9904.f25787) {
                    return;
                }
            }
            if (this.f22376) {
                return;
            }
            AbstractC8107 abstractC8107 = this.f22372;
            if (!(abstractC8107 instanceof C8784) || abstractC8107.f19722 || (recyclerView = this.f22371) == null) {
                return;
            }
            if (recyclerView.m5265()) {
                this.f22376 = true;
                recyclerView.post(new RunnableC1945(this, 24));
                return;
            }
            m14009(C8786.f22368);
            C8878 c88782 = this.f22373;
            if (c88782 != null) {
                C9904.m15209((C9904) c88782.f22564);
            }
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC3283
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final void mo5365(AbstractC3317 abstractC3317, int i) {
        AbstractC8107 abstractC8107 = this.f22372;
        C8789 c8789 = (C8789) abstractC3317;
        View view = c8789.f22380;
        View view2 = c8789.f22377;
        View view3 = c8789.f22378;
        View view4 = c8789.f22379;
        abstractC8107.getClass();
        if (abstractC8107 instanceof C8784) {
            if (abstractC8107.f19722) {
                view.setVisibility(8);
                view4.setVisibility(8);
                view3.setVisibility(8);
                view2.setVisibility(0);
                return;
            }
            view.setVisibility(0);
            view4.setVisibility(8);
            view3.setVisibility(8);
            view2.setVisibility(8);
            return;
        }
        if (abstractC8107 instanceof C8786) {
            view.setVisibility(8);
            view4.setVisibility(0);
            view3.setVisibility(8);
            view2.setVisibility(8);
            return;
        }
        if (abstractC8107 instanceof C8787) {
            view.setVisibility(8);
            view4.setVisibility(8);
            view3.setVisibility(0);
            view2.setVisibility(8);
            return;
        }
        if (!(abstractC8107 instanceof C8785)) {
            C5043.m9170();
            return;
        }
        view.setVisibility(8);
        view4.setVisibility(8);
        view3.setVisibility(8);
        view2.setVisibility(8);
    }

    @Override // androidx.recyclerview.widget.AbstractC3283
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世 */
    public final void mo5366(AbstractC3317 abstractC3317, int i, List list) {
        list.getClass();
        mo5365(abstractC3317, i);
    }

    @Override // androidx.recyclerview.widget.AbstractC3283
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final void mo5368(RecyclerView recyclerView) {
        this.f22371 = recyclerView;
    }
}
