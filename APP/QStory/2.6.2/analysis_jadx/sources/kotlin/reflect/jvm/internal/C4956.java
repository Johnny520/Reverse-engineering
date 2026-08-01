package kotlin.reflect.jvm.internal;

import kotlin.AbstractC5186;
import kotlin.InterfaceC5183;
import kotlin.LazyThreadSafetyMode;
import kotlin.reflect.InterfaceC5106;
import kotlin.reflect.InterfaceC5108;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4472;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4956 extends C4943 implements InterfaceC5106 {

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public final InterfaceC5183 f14333;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4956(AbstractC5002 abstractC5002, InterfaceC4472 interfaceC4472, C5050 c5050) {
        super(abstractC5002, interfaceC4472, c5050);
        abstractC5002.getClass();
        interfaceC4472.getClass();
        c5050.getClass();
        this.f14333 = AbstractC5186.m10211(LazyThreadSafetyMode.PUBLICATION, new C5011(this, 6));
    }

    @Override // kotlin.reflect.InterfaceC5106
    public final InterfaceC5108 getSetter() {
        return (C5020) this.f14333.getValue();
    }

    @Override // kotlin.reflect.jvm.internal.C4943
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏 */
    public final C4943 mo9950(C5050 c5050) {
        return new C4956(this.f14306, mo9945(), c5050);
    }

    @Override // kotlin.reflect.jvm.internal.C4943, kotlin.reflect.jvm.internal.AbstractC5023
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲 */
    public final AbstractC5023 mo9950(C5050 c5050) {
        return new C4956(this.f14306, mo9945(), c5050);
    }
}
