package androidx.recyclerview.widget;

/* JADX INFO: renamed from: androidx.recyclerview.widget.ۥ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C7729 implements Yue.InterfaceC3643 {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @Yue.InterfaceC4410
    public final androidx.recyclerview.widget.RecyclerView.AbstractC7678 f29762;

    public C7729(@Yue.InterfaceC4410 androidx.recyclerview.widget.RecyclerView.AbstractC7678 r1) {
            r0 = this;
            r0.<init>()
            r0.f29762 = r1
            return
    }

    @Override // Yue.InterfaceC3643
    /* JADX INFO: renamed from: ۥ */
    public void mo4605(int r2, int r3) {
            r1 = this;
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۟ۡ r0 = r1.f29762
            r0.notifyItemMoved(r2, r3)
            return
    }

    @Override // Yue.InterfaceC3643
    /* JADX INFO: renamed from: ۥ۟ */
    public void mo4606(int r2, int r3) {
            r1 = this;
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۟ۡ r0 = r1.f29762
            r0.notifyItemRangeInserted(r2, r3)
            return
    }

    @Override // Yue.InterfaceC3643
    /* JADX INFO: renamed from: ۥ۟۟ */
    public void mo4607(int r2, int r3) {
            r1 = this;
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۟ۡ r0 = r1.f29762
            r0.notifyItemRangeRemoved(r2, r3)
            return
    }

    @Override // Yue.InterfaceC3643
    /* JADX INFO: renamed from: ۥ۟۟۟ */
    public void mo4608(int r2, int r3, java.lang.Object r4) {
            r1 = this;
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۟ۡ r0 = r1.f29762
            r0.notifyItemRangeChanged(r2, r3, r4)
            return
    }
}
