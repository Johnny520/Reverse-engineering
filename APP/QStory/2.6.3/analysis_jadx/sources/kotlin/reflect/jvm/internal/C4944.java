package kotlin.reflect.jvm.internal;

import kotlin.AbstractC5187;
import kotlin.InterfaceC5184;
import kotlin.LazyThreadSafetyMode;
import kotlin.reflect.InterfaceC5106;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4473;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class C4944 extends AbstractC4942 {

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public final InterfaceC5184 f14312;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4944(AbstractC5003 abstractC5003, InterfaceC4473 interfaceC4473, C5051 c5051) {
        super(abstractC5003, interfaceC4473, c5051);
        abstractC5003.getClass();
        interfaceC4473.getClass();
        c5051.getClass();
        this.f14312 = AbstractC5187.m10215(LazyThreadSafetyMode.PUBLICATION, new C5012(this, 7));
    }

    @Override // kotlin.reflect.InterfaceC5088
    public final InterfaceC5106 getGetter() {
        return (C4945) this.f14312.getValue();
    }

    @Override // kotlin.reflect.jvm.internal.AbstractC5024
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public C4944 mo9947(C5051 c5051) {
        return new C4944(this.f14308, mo9942(), c5051);
    }

    @Override // kotlin.reflect.jvm.internal.AbstractC4942
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲 */
    public final AbstractC4963 mo9936() {
        return (C4945) this.f14312.getValue();
    }
}
