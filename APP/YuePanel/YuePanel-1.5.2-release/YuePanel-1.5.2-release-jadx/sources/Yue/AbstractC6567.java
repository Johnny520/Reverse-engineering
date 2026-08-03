package Yue;

/* JADX INFO: renamed from: Yue.ۥۣۣۡۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6567 {
    @InterfaceC6399
    public String toString() {
        return C4325.m1288(this) + '@' + C4325.m1289(this);
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ */
    public abstract AbstractC3450<?> mo528();

    /* JADX INFO: renamed from: ۥ۟ */
    public final boolean m3028(@InterfaceC6399 AbstractC6567 abstractC6567) {
        AbstractC3450<?> abstractC3450Mo528;
        AbstractC3450<?> abstractC3450Mo5282 = mo528();
        return (abstractC3450Mo5282 == null || (abstractC3450Mo528 = abstractC6567.mo528()) == null || abstractC3450Mo5282.mo9122() >= abstractC3450Mo528.mo9122()) ? false : true;
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟ */
    public abstract Object mo9118(@InterfaceC6489 Object obj);
}
