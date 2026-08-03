package androidx.recyclerview.widget;

import androidx.recyclerview.widget.C8993;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: androidx.recyclerview.widget.ۥ۟۟۠ۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8994<T2> extends C8993.AbstractC1787<T2> {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final RecyclerView.AbstractC8909 f30338;

    public AbstractC8994(RecyclerView.AbstractC8909 abstractC8909) {
        this.f30338 = abstractC8909;
    }

    @Override // Yue.InterfaceC5736
    /* JADX INFO: renamed from: ۥ */
    public void mo595(int i, int i2) {
        this.f30338.notifyItemMoved(i, i2);
    }

    @Override // Yue.InterfaceC5736
    /* JADX INFO: renamed from: ۥ۟ */
    public void mo596(int i, int i2) {
        this.f30338.notifyItemRangeInserted(i, i2);
    }

    @Override // Yue.InterfaceC5736
    /* JADX INFO: renamed from: ۥ۟۟ */
    public void mo9454(int i, int i2) {
        this.f30338.notifyItemRangeRemoved(i, i2);
    }

    @Override // androidx.recyclerview.widget.C8993.AbstractC1787, Yue.InterfaceC5736
    /* JADX INFO: renamed from: ۥ۟۟۟ */
    public void mo9455(int i, int i2, Object obj) {
        this.f30338.notifyItemRangeChanged(i, i2, obj);
    }

    @Override // androidx.recyclerview.widget.C8993.AbstractC1787
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ */
    public void mo30778(int i, int i2) {
        this.f30338.notifyItemRangeChanged(i, i2);
    }
}
