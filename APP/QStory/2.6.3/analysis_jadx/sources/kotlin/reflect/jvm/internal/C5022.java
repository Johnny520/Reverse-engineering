package kotlin.reflect.jvm.internal;

import kotlin.AbstractC5187;
import kotlin.InterfaceC5184;
import kotlin.LazyThreadSafetyMode;
import kotlin.reflect.InterfaceC5109;
import kotlin.reflect.InterfaceC5111;
import kotlin.reflect.InterfaceC5112;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4473;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5022 extends C4950 implements InterfaceC5112 {

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public final InterfaceC5184 f14483;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5022(AbstractC5003 abstractC5003, InterfaceC4473 interfaceC4473, C5051 c5051) {
        super(abstractC5003, interfaceC4473, c5051);
        abstractC5003.getClass();
        interfaceC4473.getClass();
        c5051.getClass();
        this.f14483 = AbstractC5187.m10215(LazyThreadSafetyMode.PUBLICATION, new C5012(this, 4));
    }

    @Override // kotlin.reflect.InterfaceC5107
    public final InterfaceC5109 getSetter() {
        return (C5018) this.f14483.getValue();
    }

    @Override // kotlin.reflect.InterfaceC5112
    public final void set(Object obj, Object obj2) {
        ((C5018) this.f14483.getValue()).call(obj, obj2);
    }

    @Override // kotlin.reflect.jvm.internal.C4950
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏 */
    public final C4950 mo9947(C5051 c5051) {
        return new C5022(this.f14308, mo9942(), c5051);
    }

    @Override // kotlin.reflect.jvm.internal.C4950, kotlin.reflect.jvm.internal.AbstractC5024
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲 */
    public final AbstractC5024 mo9947(C5051 c5051) {
        return new C5022(this.f14308, mo9942(), c5051);
    }

    @Override // kotlin.reflect.InterfaceC5112, kotlin.reflect.InterfaceC5107
    public final InterfaceC5111 getSetter() {
        return (C5018) this.f14483.getValue();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5022(AbstractC5003 abstractC5003, String str, String str2, Object obj) {
        super(abstractC5003, str, str2, obj);
        str.getClass();
        str2.getClass();
        this.f14483 = AbstractC5187.m10215(LazyThreadSafetyMode.PUBLICATION, new C5012(this, 4));
    }
}
