package androidx.core.util;

/* JADX INFO: renamed from: androidx.core.util.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2184 extends C2185 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final Object f6455;

    public C2184(int i) {
        super(i);
        this.f6455 = new Object();
    }

    @Override // androidx.core.util.C2185, androidx.core.util.InterfaceC2186
    public final Object acquire() {
        Object objAcquire;
        synchronized (this.f6455) {
            objAcquire = super.acquire();
        }
        return objAcquire;
    }

    @Override // androidx.core.util.C2185, androidx.core.util.InterfaceC2186
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final boolean mo3979(Object obj) {
        boolean zMo3979;
        obj.getClass();
        synchronized (this.f6455) {
            zMo3979 = super.mo3979(obj);
        }
        return zMo3979;
    }
}
