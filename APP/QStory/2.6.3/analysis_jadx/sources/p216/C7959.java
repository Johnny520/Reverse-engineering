package p216;

import android.view.View;
import android.view.ViewGroup;
import androidx.compose.material.ripple.RunnableC1107;
import androidx.profileinstaller.AbstractC2442;
import androidx.recyclerview.widget.AbstractC2450;
import androidx.recyclerview.widget.AbstractC2484;
import androidx.recyclerview.widget.C2451;
import androidx.recyclerview.widget.RecyclerView;
import com.davemorrissey.labs.subscaleview.R;
import io.ktor.util.C4211;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.text.AbstractC5145;
import p104.AbstractC7278;
import p215.C7955;
import p215.C7956;
import p215.C7957;
import p215.C7958;
import p220.InterfaceC7975;
import p230.C8049;
import p386.C9075;

/* JADX INFO: renamed from: 飘花落叶言楪世兰哲苏子.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C7959 extends AbstractC2450 implements InterfaceC7975 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public RecyclerView f22026;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public C8049 f22028;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public boolean f22031;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public AbstractC7278 f22027 = C7956.f22022;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final ArrayList f22025 = new ArrayList(0);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final boolean f22029 = true;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final boolean f22030 = true;

    public final String toString() {
        return AbstractC5145.m10178("\n            TrailingLoadStateAdapter ->\n            [isLoadEndDisplay: " + this.f22029 + "],\n            [isAutoLoadMore: " + this.f22030 + "],\n            [preloadSize: 0],\n            [loadState: " + this.f22027 + "]\n        ");
    }

    @Override // androidx.recyclerview.widget.AbstractC2450
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final int mo4792(int i) {
        this.f22027.getClass();
        return R.layout.brvah_trailing_load_more;
    }

    @Override // androidx.recyclerview.widget.AbstractC2450
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final int mo4794() {
        return m13451(this.f22027) ? 1 : 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final void m13450(AbstractC7278 abstractC7278) {
        if (AbstractC4395.m8907(this.f22027, abstractC7278)) {
            return;
        }
        boolean zM13451 = m13451(this.f22027);
        boolean zM134512 = m13451(abstractC7278);
        C2451 c2451 = this.f7298;
        if (zM13451 && !zM134512) {
            c2451.m4809(0, 1);
        } else if (zM134512 && !zM13451) {
            c2451.m4810(0, 1);
        } else if (zM13451 && zM134512) {
            m4804(0);
        }
        this.f22027 = abstractC7278;
        Iterator it = this.f22025.iterator();
        if (it.hasNext()) {
            throw AbstractC2442.m4578(it);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final boolean m13451(AbstractC7278 abstractC7278) {
        abstractC7278.getClass();
        boolean z = abstractC7278.f19377;
        if ((abstractC7278 instanceof C7957) || (abstractC7278 instanceof C7958)) {
            return true;
        }
        boolean z2 = abstractC7278 instanceof C7955;
        if (!z2 || z) {
            return this.f22029 && z2 && z;
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.AbstractC2450
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public final void mo4797(RecyclerView recyclerView) {
        this.f22026 = null;
    }

    @Override // androidx.recyclerview.widget.AbstractC2450
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public final AbstractC2484 mo4798(int i, ViewGroup viewGroup) {
        this.f22027.getClass();
        C7960 c7960 = new C7960(viewGroup);
        final int i2 = 0;
        c7960.f22033.setOnClickListener(new View.OnClickListener(this) { // from class: 飘花落叶言楪世兰哲苏子.飘花落叶言子楪世苏哲兰

            /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
            public final /* synthetic */ C7959 f22036;

            {
                this.f22036 = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i3 = i2;
                C7957 c7957 = C7957.f22023;
                C7959 c7959 = this.f22036;
                switch (i3) {
                    case 0:
                        c7959.m13450(c7957);
                        C8049 c8049 = c7959.f22028;
                        if (c8049 != null) {
                            C9075.m14650((C9075) c8049.f22219);
                        }
                        break;
                    default:
                        c7959.m13450(c7957);
                        C8049 c80492 = c7959.f22028;
                        if (c80492 != null) {
                            C9075.m14650((C9075) c80492.f22219);
                        }
                        break;
                }
            }
        });
        final int i3 = 1;
        c7960.f22035.setOnClickListener(new View.OnClickListener(this) { // from class: 飘花落叶言楪世兰哲苏子.飘花落叶言子楪世苏哲兰

            /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
            public final /* synthetic */ C7959 f22036;

            {
                this.f22036 = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i32 = i3;
                C7957 c7957 = C7957.f22023;
                C7959 c7959 = this.f22036;
                switch (i32) {
                    case 0:
                        c7959.m13450(c7957);
                        C8049 c8049 = c7959.f22028;
                        if (c8049 != null) {
                            C9075.m14650((C9075) c8049.f22219);
                        }
                        break;
                    default:
                        c7959.m13450(c7957);
                        C8049 c80492 = c7959.f22028;
                        if (c80492 != null) {
                            C9075.m14650((C9075) c80492.f22219);
                        }
                        break;
                }
            }
        });
        return c7960;
    }

    @Override // androidx.recyclerview.widget.AbstractC2450
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public final void mo4802(AbstractC2484 abstractC2484) {
        RecyclerView recyclerView;
        if (this.f22030) {
            C8049 c8049 = this.f22028;
            if (c8049 != null) {
                C9075 c9075 = (C9075) c8049.f22219;
                if (c9075.f25433 || c9075.f25441 >= c9075.f25442) {
                    return;
                }
            }
            if (this.f22031) {
                return;
            }
            AbstractC7278 abstractC7278 = this.f22027;
            if (!(abstractC7278 instanceof C7955) || abstractC7278.f19377 || (recyclerView = this.f22026) == null) {
                return;
            }
            if (recyclerView.m4705()) {
                this.f22031 = true;
                recyclerView.post(new RunnableC1107(this, 24));
                return;
            }
            m13450(C7957.f22023);
            C8049 c80492 = this.f22028;
            if (c80492 != null) {
                C9075.m14650((C9075) c80492.f22219);
            }
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC2450
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final void mo4805(AbstractC2484 abstractC2484, int i) {
        AbstractC7278 abstractC7278 = this.f22027;
        C7960 c7960 = (C7960) abstractC2484;
        View view = c7960.f22035;
        View view2 = c7960.f22032;
        View view3 = c7960.f22033;
        View view4 = c7960.f22034;
        abstractC7278.getClass();
        if (abstractC7278 instanceof C7955) {
            if (abstractC7278.f19377) {
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
        if (abstractC7278 instanceof C7957) {
            view.setVisibility(8);
            view4.setVisibility(0);
            view3.setVisibility(8);
            view2.setVisibility(8);
            return;
        }
        if (abstractC7278 instanceof C7958) {
            view.setVisibility(8);
            view4.setVisibility(8);
            view3.setVisibility(0);
            view2.setVisibility(8);
            return;
        }
        if (!(abstractC7278 instanceof C7956)) {
            C4211.m8611();
            return;
        }
        view.setVisibility(8);
        view4.setVisibility(8);
        view3.setVisibility(8);
        view2.setVisibility(8);
    }

    @Override // androidx.recyclerview.widget.AbstractC2450
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世 */
    public final void mo4806(AbstractC2484 abstractC2484, int i, List list) {
        list.getClass();
        mo4805(abstractC2484, i);
    }

    @Override // androidx.recyclerview.widget.AbstractC2450
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final void mo4808(RecyclerView recyclerView) {
        this.f22026 = recyclerView;
    }
}
