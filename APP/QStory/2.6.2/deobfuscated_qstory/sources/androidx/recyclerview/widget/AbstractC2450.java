package androidx.recyclerview.widget;

import android.os.Trace;
import android.view.ViewGroup;
import androidx.core.os.AbstractC2177;
import java.util.List;
import p144.C7546;

/* JADX INFO: renamed from: androidx.recyclerview.widget.飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2450 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C2451 f7297 = new C2451();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public boolean f7296 = false;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public RecyclerView$Adapter$StateRestorationPolicy f7295 = RecyclerView$Adapter$StateRestorationPolicy.ALLOW;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void m4781() {
        this.f7297.m4803();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public int mo4782(int i) {
        return 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public long mo4783(int i) {
        return -1L;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public abstract int mo4784();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public int mo4785(AbstractC2450 abstractC2450, AbstractC2484 abstractC2484, int i) {
        if (abstractC2450 == this) {
            return i;
        }
        return -1;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m4786(AbstractC2484 abstractC2484, int i) {
        boolean z = abstractC2484.mBindingAdapter == null;
        if (z) {
            abstractC2484.mPosition = i;
            if (this.f7296) {
                abstractC2484.mItemId = mo4783(i);
            }
            abstractC2484.setFlags(1, 519);
            if (AbstractC2177.m3963()) {
                Trace.beginSection(String.format("RV onBindViewHolder type=0x%X", Integer.valueOf(abstractC2484.mItemViewType)));
            }
        }
        abstractC2484.mBindingAdapter = this;
        if (RecyclerView.f7175) {
            if (abstractC2484.itemView.getParent() == null && abstractC2484.itemView.isAttachedToWindow() != abstractC2484.isTmpDetached()) {
                throw new IllegalStateException("Temp-detached state out of sync with reality. holder.isTmpDetached(): " + abstractC2484.isTmpDetached() + ", attached to window: " + abstractC2484.itemView.isAttachedToWindow() + ", holder: " + abstractC2484);
            }
            if (abstractC2484.itemView.getParent() == null && abstractC2484.itemView.isAttachedToWindow()) {
                C7546.m12745(abstractC2484, "Attempting to bind attached holder with no parent (AKA temp detached): ");
                return;
            }
        }
        mo4796(abstractC2484, i, abstractC2484.getUnmodifiedPayloads());
        if (z) {
            abstractC2484.clearPayload();
            ViewGroup.LayoutParams layoutParams = abstractC2484.itemView.getLayoutParams();
            if (layoutParams instanceof C2518) {
                ((C2518) layoutParams).f7577 = true;
            }
            Trace.endSection();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public abstract AbstractC2484 mo4788(int i, ViewGroup viewGroup);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public boolean mo4791(AbstractC2484 abstractC2484) {
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final void m4793(int i, int i2) {
        this.f7297.m4802(i, i2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void m4794(int i) {
        this.f7297.m4801(null, i, 1);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public abstract void mo4795(AbstractC2484 abstractC2484, int i);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public void mo4796(AbstractC2484 abstractC2484, int i, List list) {
        mo4795(abstractC2484, i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final void m4797(int i, int i2) {
        this.f7297.m4800(i, i2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public void mo4787(RecyclerView recyclerView) {
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public void mo4789(AbstractC2484 abstractC2484) {
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public void mo4790(AbstractC2484 abstractC2484) {
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public void mo4792(AbstractC2484 abstractC2484) {
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public void mo4798(RecyclerView recyclerView) {
    }
}
