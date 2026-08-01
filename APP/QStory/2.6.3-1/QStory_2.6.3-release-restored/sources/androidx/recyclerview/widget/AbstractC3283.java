package androidx.recyclerview.widget;

import android.os.Trace;
import android.view.ViewGroup;
import androidx.core.os.AbstractC3010;
import java.util.List;
import p160.C8376;

/* JADX INFO: renamed from: androidx.recyclerview.widget.飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3283 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C3284 f7643 = new C3284();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public boolean f7642 = false;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public RecyclerView$Adapter$StateRestorationPolicy f7641 = RecyclerView$Adapter$StateRestorationPolicy.ALLOW;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void m5351() {
        this.f7643.m5373();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public int mo5352(int i) {
        return 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public long mo5353(int i) {
        return -1L;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public abstract int mo5354();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public int mo5355(AbstractC3283 abstractC3283, AbstractC3317 abstractC3317, int i) {
        if (abstractC3283 == this) {
            return i;
        }
        return -1;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m5356(AbstractC3317 abstractC3317, int i) {
        boolean z = abstractC3317.mBindingAdapter == null;
        if (z) {
            abstractC3317.mPosition = i;
            if (this.f7642) {
                abstractC3317.mItemId = mo5353(i);
            }
            abstractC3317.setFlags(1, 519);
            if (AbstractC3010.m4533()) {
                Trace.beginSection(String.format("RV onBindViewHolder type=0x%X", Integer.valueOf(abstractC3317.mItemViewType)));
            }
        }
        abstractC3317.mBindingAdapter = this;
        if (RecyclerView.f7521) {
            if (abstractC3317.itemView.getParent() == null && abstractC3317.itemView.isAttachedToWindow() != abstractC3317.isTmpDetached()) {
                throw new IllegalStateException("Temp-detached state out of sync with reality. holder.isTmpDetached(): " + abstractC3317.isTmpDetached() + ", attached to window: " + abstractC3317.itemView.isAttachedToWindow() + ", holder: " + abstractC3317);
            }
            if (abstractC3317.itemView.getParent() == null && abstractC3317.itemView.isAttachedToWindow()) {
                C8376.m13333(abstractC3317, "Attempting to bind attached holder with no parent (AKA temp detached): ");
                return;
            }
        }
        mo5366(abstractC3317, i, abstractC3317.getUnmodifiedPayloads());
        if (z) {
            abstractC3317.clearPayload();
            ViewGroup.LayoutParams layoutParams = abstractC3317.itemView.getLayoutParams();
            if (layoutParams instanceof C3351) {
                ((C3351) layoutParams).f7923 = true;
            }
            Trace.endSection();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public abstract AbstractC3317 mo5358(int i, ViewGroup viewGroup);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public boolean mo5361(AbstractC3317 abstractC3317) {
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final void m5363(int i, int i2) {
        this.f7643.m5372(i, i2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void m5364(int i) {
        this.f7643.m5371(null, i, 1);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public abstract void mo5365(AbstractC3317 abstractC3317, int i);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public void mo5366(AbstractC3317 abstractC3317, int i, List list) {
        mo5365(abstractC3317, i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final void m5367(int i, int i2) {
        this.f7643.m5370(i, i2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public void mo5357(RecyclerView recyclerView) {
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public void mo5359(AbstractC3317 abstractC3317) {
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public void mo5360(AbstractC3317 abstractC3317) {
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public void mo5362(AbstractC3317 abstractC3317) {
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public void mo5368(RecyclerView recyclerView) {
    }
}
