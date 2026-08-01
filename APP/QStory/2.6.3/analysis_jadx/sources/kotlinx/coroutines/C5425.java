package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: renamed from: kotlinx.coroutines.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5425 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f15064 = AtomicIntegerFieldUpdater.newUpdater(C5425.class, "notCompletedCount$volatile");
    private volatile /* synthetic */ int notCompletedCount$volatile;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC5408[] f15065;

    public C5425(InterfaceC5408[] interfaceC5408Arr) {
        this.f15065 = interfaceC5408Arr;
        this.notCompletedCount$volatile = interfaceC5408Arr.length;
    }
}
