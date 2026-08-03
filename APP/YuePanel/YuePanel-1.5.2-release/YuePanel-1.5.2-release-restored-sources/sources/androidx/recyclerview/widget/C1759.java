package androidx.recyclerview.widget;

import Yue.InterfaceC5736;
import Yue.InterfaceC6391;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: androidx.recyclerview.widget.ۥ۟ */
/* JADX INFO: loaded from: classes.dex */
public final class C1759 implements InterfaceC5736 {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @InterfaceC6391
    public final RecyclerView.AbstractC8909 f30085;

    public C1759(@InterfaceC6391 RecyclerView.AbstractC8909 abstractC8909) {
        this.f30085 = abstractC8909;
    }

    @Override // Yue.InterfaceC5736
    /* JADX INFO: renamed from: ۥ */
    public void mo595(int i, int i2) {
        this.f30085.notifyItemMoved(i, i2);
    }

    @Override // Yue.InterfaceC5736
    /* JADX INFO: renamed from: ۥ۟ */
    public void mo596(int i, int i2) {
        this.f30085.notifyItemRangeInserted(i, i2);
    }

    @Override // Yue.InterfaceC5736
    /* JADX INFO: renamed from: ۥ۟۟ */
    public void mo9454(int i, int i2) {
        this.f30085.notifyItemRangeRemoved(i, i2);
    }

    @Override // Yue.InterfaceC5736
    /* JADX INFO: renamed from: ۥ۟۟۟ */
    public void mo9455(int i, int i2, Object obj) {
        this.f30085.notifyItemRangeChanged(i, i2, obj);
    }
}
