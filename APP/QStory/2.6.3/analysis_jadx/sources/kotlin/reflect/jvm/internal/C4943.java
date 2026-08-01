package kotlin.reflect.jvm.internal;

import java.lang.reflect.Member;
import kotlin.AbstractC5187;
import kotlin.InterfaceC5184;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.CallableReference;
import kotlin.reflect.InterfaceC5099;
import kotlin.reflect.InterfaceC5100;
import kotlin.reflect.InterfaceC5106;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4473;
import p253.AbstractC8190;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class C4943 extends AbstractC4942 implements InterfaceC5100 {

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public final InterfaceC5184 f14310;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public final InterfaceC5184 f14311;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4943(AbstractC5003 abstractC5003, InterfaceC4473 interfaceC4473, C5051 c5051) {
        super(abstractC5003, interfaceC4473, c5051);
        abstractC5003.getClass();
        interfaceC4473.getClass();
        c5051.getClass();
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        this.f14311 = AbstractC5187.m10215(lazyThreadSafetyMode, new C4946(this, 0));
        this.f14310 = AbstractC5187.m10215(lazyThreadSafetyMode, new C4946(this, 1));
    }

    @Override // kotlin.reflect.InterfaceC5100
    public final Object getDelegate(Object obj, Object obj2) {
        return AbstractC8190.m13704(this, (Member) this.f14310.getValue(), obj, obj2);
    }

    @Override // kotlin.reflect.InterfaceC5088
    public final InterfaceC5106 getGetter() {
        return (C4947) this.f14311.getValue();
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(Object obj, Object obj2) {
        return ((C4947) this.f14311.getValue()).call(obj, obj2);
    }

    @Override // kotlin.reflect.jvm.internal.AbstractC5024
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public C4943 mo9947(C5051 c5051) {
        return new C4943(this.f14308, mo9942(), c5051);
    }

    @Override // kotlin.reflect.jvm.internal.AbstractC4942
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲 */
    public final AbstractC4963 mo9936() {
        return (C4947) this.f14311.getValue();
    }

    @Override // kotlin.reflect.InterfaceC5088
    public final InterfaceC5099 getGetter() {
        return (C4947) this.f14311.getValue();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4943(AbstractC5003 abstractC5003, String str, String str2) {
        super(abstractC5003, str, str2, CallableReference.NO_RECEIVER);
        str.getClass();
        str2.getClass();
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        this.f14311 = AbstractC5187.m10215(lazyThreadSafetyMode, new C4946(this, 0));
        this.f14310 = AbstractC5187.m10215(lazyThreadSafetyMode, new C4946(this, 1));
    }
}
