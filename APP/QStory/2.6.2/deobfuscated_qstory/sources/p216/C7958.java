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
import io.ktor.util.C4210;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC4394;
import kotlin.text.AbstractC5144;
import p104.AbstractC7277;
import p215.C7954;
import p215.C7955;
import p215.C7956;
import p215.C7957;
import p220.InterfaceC7974;
import p230.C8048;
import p385.C9088;

/* JADX INFO: renamed from: 飘花落叶言楪世兰哲苏子.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C7958 extends AbstractC2450 implements InterfaceC7974 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public RecyclerView f22029;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public C8048 f22031;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public boolean f22034;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public AbstractC7277 f22030 = C7955.f22025;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final ArrayList f22028 = new ArrayList(0);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final boolean f22032 = true;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final boolean f22033 = true;

    public final String toString() {
        return AbstractC5144.m10174("\n            TrailingLoadStateAdapter ->\n            [isLoadEndDisplay: " + this.f22032 + "],\n            [isAutoLoadMore: " + this.f22033 + "],\n            [preloadSize: 0],\n            [loadState: " + this.f22030 + "]\n        ");
    }

    @Override // androidx.recyclerview.widget.AbstractC2450
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final int mo4782(int i) {
        this.f22030.getClass();
        return R.layout.brvah_trailing_load_more;
    }

    @Override // androidx.recyclerview.widget.AbstractC2450
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final int mo4784() {
        return m13423(this.f22030) ? 1 : 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final void m13422(AbstractC7277 abstractC7277) {
        if (AbstractC4394.m8917(this.f22030, abstractC7277)) {
            return;
        }
        boolean zM13423 = m13423(this.f22030);
        boolean zM134232 = m13423(abstractC7277);
        C2451 c2451 = this.f7297;
        if (zM13423 && !zM134232) {
            c2451.m4799(0, 1);
        } else if (zM134232 && !zM13423) {
            c2451.m4800(0, 1);
        } else if (zM13423 && zM134232) {
            m4794(0);
        }
        this.f22030 = abstractC7277;
        Iterator it = this.f22028.iterator();
        if (it.hasNext()) {
            throw AbstractC2442.m4568(it);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final boolean m13423(AbstractC7277 abstractC7277) {
        abstractC7277.getClass();
        boolean z = abstractC7277.f19382;
        if ((abstractC7277 instanceof C7956) || (abstractC7277 instanceof C7957)) {
            return true;
        }
        boolean z2 = abstractC7277 instanceof C7954;
        if (!z2 || z) {
            return this.f22032 && z2 && z;
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.AbstractC2450
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public final void mo4787(RecyclerView recyclerView) {
        this.f22029 = null;
    }

    @Override // androidx.recyclerview.widget.AbstractC2450
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public final AbstractC2484 mo4788(int i, ViewGroup viewGroup) {
        this.f22030.getClass();
        C7959 c7959 = new C7959(viewGroup);
        final int i2 = 0;
        c7959.f22036.setOnClickListener(new View.OnClickListener(this) { // from class: 飘花落叶言楪世兰哲苏子.飘花落叶言子楪世苏哲兰

            /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
            public final /* synthetic */ C7958 f22039;

            {
                this.f22039 = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i3 = i2;
                C7956 c7956 = C7956.f22026;
                C7958 c7958 = this.f22039;
                switch (i3) {
                    case 0:
                        c7958.m13422(c7956);
                        C8048 c8048 = c7958.f22031;
                        if (c8048 != null) {
                            C9088.m14593((C9088) c8048.f22221);
                        }
                        break;
                    default:
                        c7958.m13422(c7956);
                        C8048 c80482 = c7958.f22031;
                        if (c80482 != null) {
                            C9088.m14593((C9088) c80482.f22221);
                        }
                        break;
                }
            }
        });
        final int i3 = 1;
        c7959.f22038.setOnClickListener(new View.OnClickListener(this) { // from class: 飘花落叶言楪世兰哲苏子.飘花落叶言子楪世苏哲兰

            /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
            public final /* synthetic */ C7958 f22039;

            {
                this.f22039 = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i32 = i3;
                C7956 c7956 = C7956.f22026;
                C7958 c7958 = this.f22039;
                switch (i32) {
                    case 0:
                        c7958.m13422(c7956);
                        C8048 c8048 = c7958.f22031;
                        if (c8048 != null) {
                            C9088.m14593((C9088) c8048.f22221);
                        }
                        break;
                    default:
                        c7958.m13422(c7956);
                        C8048 c80482 = c7958.f22031;
                        if (c80482 != null) {
                            C9088.m14593((C9088) c80482.f22221);
                        }
                        break;
                }
            }
        });
        return c7959;
    }

    @Override // androidx.recyclerview.widget.AbstractC2450
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public final void mo4792(AbstractC2484 abstractC2484) {
        RecyclerView recyclerView;
        if (this.f22033) {
            C8048 c8048 = this.f22031;
            if (c8048 != null) {
                C9088 c9088 = (C9088) c8048.f22221;
                if (c9088.f25383 || c9088.f25391 >= c9088.f25392) {
                    return;
                }
            }
            if (this.f22034) {
                return;
            }
            AbstractC7277 abstractC7277 = this.f22030;
            if (!(abstractC7277 instanceof C7954) || abstractC7277.f19382 || (recyclerView = this.f22029) == null) {
                return;
            }
            if (recyclerView.m4695()) {
                this.f22034 = true;
                recyclerView.post(new RunnableC1107(this, 24));
                return;
            }
            m13422(C7956.f22026);
            C8048 c80482 = this.f22031;
            if (c80482 != null) {
                C9088.m14593((C9088) c80482.f22221);
            }
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC2450
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final void mo4795(AbstractC2484 abstractC2484, int i) {
        AbstractC7277 abstractC7277 = this.f22030;
        C7959 c7959 = (C7959) abstractC2484;
        View view = c7959.f22038;
        View view2 = c7959.f22035;
        View view3 = c7959.f22036;
        View view4 = c7959.f22037;
        abstractC7277.getClass();
        if (abstractC7277 instanceof C7954) {
            if (abstractC7277.f19382) {
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
        if (abstractC7277 instanceof C7956) {
            view.setVisibility(8);
            view4.setVisibility(0);
            view3.setVisibility(8);
            view2.setVisibility(8);
            return;
        }
        if (abstractC7277 instanceof C7957) {
            view.setVisibility(8);
            view4.setVisibility(8);
            view3.setVisibility(0);
            view2.setVisibility(8);
            return;
        }
        if (!(abstractC7277 instanceof C7955)) {
            C4210.m8621();
            return;
        }
        view.setVisibility(8);
        view4.setVisibility(8);
        view3.setVisibility(8);
        view2.setVisibility(8);
    }

    @Override // androidx.recyclerview.widget.AbstractC2450
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世 */
    public final void mo4796(AbstractC2484 abstractC2484, int i, List list) {
        list.getClass();
        mo4795(abstractC2484, i);
    }

    @Override // androidx.recyclerview.widget.AbstractC2450
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final void mo4798(RecyclerView recyclerView) {
        this.f22029 = recyclerView;
    }
}
