package kotlinx.coroutines.internal;

import kotlin.coroutines.InterfaceC4360;
import kotlinx.coroutines.InterfaceC5401;

/* JADX INFO: renamed from: kotlinx.coroutines.internal.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C5351 implements InterfaceC5401 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC4360 f14921;

    public C5351(InterfaceC4360 interfaceC4360) {
        this.f14921 = interfaceC4360;
    }

    public final String toString() {
        return "CoroutineScope(coroutineContext=" + this.f14921 + ')';
    }

    @Override // kotlinx.coroutines.InterfaceC5401
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰 */
    public final InterfaceC4360 mo2430() {
        return this.f14921;
    }
}
