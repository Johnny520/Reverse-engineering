package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: renamed from: kotlinx.coroutines.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6257 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f15409 = AtomicIntegerFieldUpdater.newUpdater(C6257.class, "notCompletedCount$volatile");
    private volatile /* synthetic */ int notCompletedCount$volatile;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC6240[] f15410;

    public C6257(InterfaceC6240[] interfaceC6240Arr) {
        this.f15410 = interfaceC6240Arr;
        this.notCompletedCount$volatile = interfaceC6240Arr.length;
    }
}
