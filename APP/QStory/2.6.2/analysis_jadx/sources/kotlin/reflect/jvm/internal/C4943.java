package kotlin.reflect.jvm.internal;

import kotlin.AbstractC5186;
import kotlin.InterfaceC5183;
import kotlin.LazyThreadSafetyMode;
import kotlin.reflect.InterfaceC5105;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4472;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public class C4943 extends AbstractC4941 {

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public final InterfaceC5183 f14310;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4943(AbstractC5002 abstractC5002, InterfaceC4472 interfaceC4472, C5050 c5050) {
        super(abstractC5002, interfaceC4472, c5050);
        abstractC5002.getClass();
        interfaceC4472.getClass();
        c5050.getClass();
        this.f14310 = AbstractC5186.m10211(LazyThreadSafetyMode.PUBLICATION, new C5011(this, 7));
    }

    @Override // kotlin.reflect.InterfaceC5087
    public final InterfaceC5105 getGetter() {
        return (C4944) this.f14310.getValue();
    }

    @Override // kotlin.reflect.jvm.internal.AbstractC5023
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public C4943 mo9950(C5050 c5050) {
        return new C4943(this.f14306, mo9945(), c5050);
    }

    @Override // kotlin.reflect.jvm.internal.AbstractC4941
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲 */
    public final AbstractC4962 mo9939() {
        return (C4944) this.f14310.getValue();
    }
}
