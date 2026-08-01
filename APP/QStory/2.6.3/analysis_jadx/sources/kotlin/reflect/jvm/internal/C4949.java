package kotlin.reflect.jvm.internal;

import kotlin.AbstractC5187;
import kotlin.InterfaceC5184;
import kotlin.LazyThreadSafetyMode;
import kotlin.reflect.InterfaceC5097;
import kotlin.reflect.InterfaceC5098;
import kotlin.reflect.InterfaceC5106;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4473;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class C4949 extends AbstractC4942 implements InterfaceC5097 {

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public final InterfaceC5184 f14319;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public final InterfaceC5184 f14320;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4949(AbstractC5003 abstractC5003, InterfaceC4473 interfaceC4473, C5051 c5051) {
        super(abstractC5003, interfaceC4473, c5051);
        abstractC5003.getClass();
        interfaceC4473.getClass();
        c5051.getClass();
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        this.f14320 = AbstractC5187.m10215(lazyThreadSafetyMode, new C4959(this, 0));
        this.f14319 = AbstractC5187.m10215(lazyThreadSafetyMode, new C4959(this, 1));
    }

    @Override // kotlin.reflect.InterfaceC5097
    public final Object getDelegate() {
        return this.f14319.getValue();
    }

    @Override // kotlin.reflect.InterfaceC5088
    public final InterfaceC5106 getGetter() {
        return (C4958) this.f14320.getValue();
    }

    @Override // p052.InterfaceC6543
    public final Object invoke() {
        return ((C4958) this.f14320.getValue()).call(new Object[0]);
    }

    @Override // kotlin.reflect.jvm.internal.AbstractC5024
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public C4949 mo9947(C5051 c5051) {
        return new C4949(this.f14308, mo9942(), c5051);
    }

    @Override // kotlin.reflect.jvm.internal.AbstractC4942
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲 */
    public final AbstractC4963 mo9936() {
        return (C4958) this.f14320.getValue();
    }

    @Override // kotlin.reflect.InterfaceC5088
    public final InterfaceC5098 getGetter() {
        return (C4958) this.f14320.getValue();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4949(AbstractC5003 abstractC5003, String str, String str2, Object obj) {
        super(abstractC5003, str, str2, obj);
        str.getClass();
        str2.getClass();
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        this.f14320 = AbstractC5187.m10215(lazyThreadSafetyMode, new C4959(this, 0));
        this.f14319 = AbstractC5187.m10215(lazyThreadSafetyMode, new C4959(this, 1));
    }
}
