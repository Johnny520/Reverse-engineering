package androidx.recyclerview.widget;

import android.os.Trace;
import android.view.ViewGroup;
import androidx.core.os.AbstractC2177;
import java.util.List;
import p144.C7547;

/* JADX INFO: renamed from: androidx.recyclerview.widget.飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2450 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C2451 f7298 = new C2451();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public boolean f7297 = false;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public RecyclerView$Adapter$StateRestorationPolicy f7296 = RecyclerView$Adapter$StateRestorationPolicy.ALLOW;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void m4791() {
        this.f7298.m4813();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public int mo4792(int i) {
        return 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public long mo4793(int i) {
        return -1L;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public abstract int mo4794();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public int mo4795(AbstractC2450 abstractC2450, AbstractC2484 abstractC2484, int i) {
        if (abstractC2450 == this) {
            return i;
        }
        return -1;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m4796(AbstractC2484 abstractC2484, int i) {
        boolean z = abstractC2484.mBindingAdapter == null;
        if (z) {
            abstractC2484.mPosition = i;
            if (this.f7297) {
                abstractC2484.mItemId = mo4793(i);
            }
            abstractC2484.setFlags(1, 519);
            if (AbstractC2177.m3973()) {
                Trace.beginSection(String.format("RV onBindViewHolder type=0x%X", Integer.valueOf(abstractC2484.mItemViewType)));
            }
        }
        abstractC2484.mBindingAdapter = this;
        if (RecyclerView.f7176) {
            if (abstractC2484.itemView.getParent() == null && abstractC2484.itemView.isAttachedToWindow() != abstractC2484.isTmpDetached()) {
                throw new IllegalStateException("Temp-detached state out of sync with reality. holder.isTmpDetached(): " + abstractC2484.isTmpDetached() + ", attached to window: " + abstractC2484.itemView.isAttachedToWindow() + ", holder: " + abstractC2484);
            }
            if (abstractC2484.itemView.getParent() == null && abstractC2484.itemView.isAttachedToWindow()) {
                C7547.m12774(abstractC2484, "Attempting to bind attached holder with no parent (AKA temp detached): ");
                return;
            }
        }
        mo4806(abstractC2484, i, abstractC2484.getUnmodifiedPayloads());
        if (z) {
            abstractC2484.clearPayload();
            ViewGroup.LayoutParams layoutParams = abstractC2484.itemView.getLayoutParams();
            if (layoutParams instanceof C2518) {
                ((C2518) layoutParams).f7578 = true;
            }
            Trace.endSection();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public abstract AbstractC2484 mo4798(int i, ViewGroup viewGroup);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public boolean mo4801(AbstractC2484 abstractC2484) {
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final void m4803(int i, int i2) {
        this.f7298.m4812(i, i2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void m4804(int i) {
        this.f7298.m4811(null, i, 1);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public abstract void mo4805(AbstractC2484 abstractC2484, int i);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public void mo4806(AbstractC2484 abstractC2484, int i, List list) {
        mo4805(abstractC2484, i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final void m4807(int i, int i2) {
        this.f7298.m4810(i, i2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public void mo4797(RecyclerView recyclerView) {
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public void mo4799(AbstractC2484 abstractC2484) {
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public void mo4800(AbstractC2484 abstractC2484) {
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public void mo4802(AbstractC2484 abstractC2484) {
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public void mo4808(RecyclerView recyclerView) {
    }
}
