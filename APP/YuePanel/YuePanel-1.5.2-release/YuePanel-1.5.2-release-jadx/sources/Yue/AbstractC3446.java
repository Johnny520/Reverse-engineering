package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۢ۟ۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3446 {

    /* JADX INFO: renamed from: ۥ */
    public AbstractC3450<?> f292;

    /* JADX INFO: renamed from: ۥ */
    public abstract void mo520(@InterfaceC6399 AbstractC3450<?> abstractC3450, @InterfaceC6489 Object obj);

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ */
    public final AbstractC3450<?> m521() {
        AbstractC3450<?> abstractC3450 = this.f292;
        if (abstractC3450 != null) {
            return abstractC3450;
        }
        C5499.m17132("atomicOp");
        return null;
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public abstract Object mo9104(@InterfaceC6399 AbstractC3450<?> abstractC3450);

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final void m9105(@InterfaceC6399 AbstractC3450<?> abstractC3450) {
        this.f292 = abstractC3450;
    }
}
