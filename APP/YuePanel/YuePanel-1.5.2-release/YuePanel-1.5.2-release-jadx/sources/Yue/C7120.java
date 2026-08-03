package Yue;

import Yue.InterfaceC7144;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: renamed from: Yue.ۥۡۦۦ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
public final class C7120<V> extends AbstractC3000<V> {
    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static <V> C7120<V> m22230() {
        return new C7120<>();
    }

    @Override // Yue.AbstractC3000
    /* JADX INFO: renamed from: ۥ۟۟۠۟ */
    public boolean mo5833(@InterfaceC6490 V v) {
        return super.mo5833(v);
    }

    @Override // Yue.AbstractC3000
    /* JADX INFO: renamed from: ۥ۟۟۠۠ */
    public boolean mo5834(Throwable th) {
        return super.mo5834(th);
    }

    @Override // Yue.AbstractC3000
    /* JADX INFO: renamed from: ۥ۟۟۠ۡ */
    public boolean mo5835(ListenableFuture<? extends V> listenableFuture) {
        return super.mo5835(listenableFuture);
    }
}
