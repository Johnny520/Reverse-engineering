package kotlin.reflect.jvm.internal;

import kotlin.C5176;
import kotlin.reflect.InterfaceC5088;
import kotlin.reflect.InterfaceC5111;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5018 extends AbstractC4960 implements InterfaceC5111 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final C5022 f14479;

    public C5018(C5022 c5022) {
        this.f14479 = c5022;
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(Object obj, Object obj2) {
        this.f14479.set(obj, obj2);
        return C5176.f14739;
    }

    @Override // kotlin.reflect.jvm.internal.AbstractC4953
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏 */
    public final AbstractC4942 mo9949() {
        return this.f14479;
    }

    @Override // kotlin.reflect.InterfaceC5105
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final InterfaceC5088 mo9950() {
        return this.f14479;
    }
}
