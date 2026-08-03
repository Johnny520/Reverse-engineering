package androidx.recyclerview.widget;

/* JADX INFO: renamed from: androidx.recyclerview.widget.ۥ۟۟۠ۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7806<T2> extends androidx.recyclerview.widget.C7803.AbstractC7805<T2> {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final androidx.recyclerview.widget.RecyclerView.AbstractC7678 f30092;

    public AbstractC7806(androidx.recyclerview.widget.RecyclerView.AbstractC7678 r1) {
            r0 = this;
            r0.<init>()
            r0.f30092 = r1
            return
    }

    @Override // Yue.InterfaceC3643
    /* JADX INFO: renamed from: ۥ */
    public void mo4605(int r2, int r3) {
            r1 = this;
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۟ۡ r0 = r1.f30092
            r0.notifyItemMoved(r2, r3)
            return
    }

    @Override // Yue.InterfaceC3643
    /* JADX INFO: renamed from: ۥ۟ */
    public void mo4606(int r2, int r3) {
            r1 = this;
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۟ۡ r0 = r1.f30092
            r0.notifyItemRangeInserted(r2, r3)
            return
    }

    @Override // Yue.InterfaceC3643
    /* JADX INFO: renamed from: ۥ۟۟ */
    public void mo4607(int r2, int r3) {
            r1 = this;
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۟ۡ r0 = r1.f30092
            r0.notifyItemRangeRemoved(r2, r3)
            return
    }

    @Override // androidx.recyclerview.widget.C7803.AbstractC7805, Yue.InterfaceC3643
    /* JADX INFO: renamed from: ۥ۟۟۟ */
    public void mo4608(int r2, int r3, java.lang.Object r4) {
            r1 = this;
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۟ۡ r0 = r1.f30092
            r0.notifyItemRangeChanged(r2, r3, r4)
            return
    }

    @Override // androidx.recyclerview.widget.C7803.AbstractC7805
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ */
    public void mo30326(int r2, int r3) {
            r1 = this;
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۟ۡ r0 = r1.f30092
            r0.notifyItemRangeChanged(r2, r3)
            return
    }
}
