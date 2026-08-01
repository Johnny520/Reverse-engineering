package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: renamed from: kotlinx.coroutines.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5424 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f15064 = AtomicIntegerFieldUpdater.newUpdater(C5424.class, "notCompletedCount$volatile");
    private volatile /* synthetic */ int notCompletedCount$volatile;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC5407[] f15065;

    public C5424(InterfaceC5407[] interfaceC5407Arr) {
        this.f15065 = interfaceC5407Arr;
        this.notCompletedCount$volatile = interfaceC5407Arr.length;
    }
}
