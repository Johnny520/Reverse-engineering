package androidx.core.util;

/* JADX INFO: renamed from: androidx.core.util.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2184 extends C2185 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final Object f6456;

    public C2184(int i) {
        super(i);
        this.f6456 = new Object();
    }

    @Override // androidx.core.util.C2185, androidx.core.util.InterfaceC2186
    public final Object acquire() {
        Object objAcquire;
        synchronized (this.f6456) {
            objAcquire = super.acquire();
        }
        return objAcquire;
    }

    @Override // androidx.core.util.C2185, androidx.core.util.InterfaceC2186
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final boolean mo3989(Object obj) {
        boolean zMo3989;
        obj.getClass();
        synchronized (this.f6456) {
            zMo3989 = super.mo3989(obj);
        }
        return zMo3989;
    }
}
