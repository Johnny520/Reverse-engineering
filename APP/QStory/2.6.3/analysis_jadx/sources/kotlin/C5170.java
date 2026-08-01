package kotlin;

import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.InterfaceC4360;
import p052.InterfaceC6551;

/* JADX INFO: renamed from: kotlin.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5170 extends AbstractC5171 implements InterfaceC4357 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public InterfaceC4357 f14732;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public Object f14733;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public InterfaceC6551 f14734;

    @Override // kotlin.coroutines.InterfaceC4357
    public final InterfaceC4360 getContext() {
        return EmptyCoroutineContext.INSTANCE;
    }

    @Override // kotlin.coroutines.InterfaceC4357
    public final void resumeWith(Object obj) {
        this.f14732 = null;
        this.f14733 = obj;
    }
}
