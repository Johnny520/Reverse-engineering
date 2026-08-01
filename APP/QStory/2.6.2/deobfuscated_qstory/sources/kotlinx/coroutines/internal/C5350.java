package kotlinx.coroutines.internal;

import kotlin.coroutines.InterfaceC4359;
import kotlinx.coroutines.InterfaceC5400;

/* JADX INFO: renamed from: kotlinx.coroutines.internal.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C5350 implements InterfaceC5400 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC4359 f14921;

    public C5350(InterfaceC4359 interfaceC4359) {
        this.f14921 = interfaceC4359;
    }

    public final String toString() {
        return "CoroutineScope(coroutineContext=" + this.f14921 + ')';
    }

    @Override // kotlinx.coroutines.InterfaceC5400
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪 */
    public final InterfaceC4359 mo2420() {
        return this.f14921;
    }
}
