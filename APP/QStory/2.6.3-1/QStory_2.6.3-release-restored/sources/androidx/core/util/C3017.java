package androidx.core.util;

/* JADX INFO: renamed from: androidx.core.util.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3017 extends C3018 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final Object f6801;

    public C3017(int i) {
        super(i);
        this.f6801 = new Object();
    }

    @Override // androidx.core.util.C3018, androidx.core.util.InterfaceC3019
    public final Object acquire() {
        Object objAcquire;
        synchronized (this.f6801) {
            objAcquire = super.acquire();
        }
        return objAcquire;
    }

    @Override // androidx.core.util.C3018, androidx.core.util.InterfaceC3019
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final boolean mo4549(Object obj) {
        boolean zMo4549;
        obj.getClass();
        synchronized (this.f6801) {
            zMo4549 = super.mo4549(obj);
        }
        return zMo4549;
    }
}
