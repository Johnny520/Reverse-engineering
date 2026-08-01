package kotlinx.coroutines.internal;

import kotlin.coroutines.InterfaceC5192;
import kotlinx.coroutines.InterfaceC6233;

/* JADX INFO: renamed from: kotlinx.coroutines.internal.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C6183 implements InterfaceC6233 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC5192 f15266;

    public C6183(InterfaceC5192 interfaceC5192) {
        this.f15266 = interfaceC5192;
    }

    public final String toString() {
        return "CoroutineScope(coroutineContext=" + this.f15266 + ')';
    }

    @Override // kotlinx.coroutines.InterfaceC6233
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰 */
    public final InterfaceC5192 mo2990() {
        return this.f15266;
    }
}
