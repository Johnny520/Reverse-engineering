package kotlin.reflect.jvm.internal;

import kotlin.C5176;
import kotlin.reflect.InterfaceC5088;
import kotlin.reflect.InterfaceC5111;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言子哲兰世楪苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4994 extends AbstractC4969 implements InterfaceC5111 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final C4995 f14412;

    public C4994(C4995 c4995) {
        this.f14412 = c4995;
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(Object obj, Object obj2) {
        this.f14412.set(obj, obj2);
        return C5176.f14739;
    }

    @Override // kotlin.reflect.InterfaceC5105
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final InterfaceC5088 mo9950() {
        return this.f14412;
    }

    @Override // kotlin.reflect.jvm.internal.AbstractC4978
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    public final AbstractC4982 mo9959() {
        return this.f14412;
    }
}
