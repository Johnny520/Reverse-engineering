package kotlin.reflect.jvm.internal;

import kotlin.AbstractC5187;
import kotlin.InterfaceC5184;
import kotlin.LazyThreadSafetyMode;
import kotlin.reflect.InterfaceC5097;
import kotlin.reflect.InterfaceC5098;
import kotlin.reflect.InterfaceC5106;
import kotlin.reflect.jvm.internal.impl.km.C4536;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言子兰世哲苏楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class C4965 extends AbstractC4982 implements InterfaceC5097 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final InterfaceC5184 f14351;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final InterfaceC5184 f14352;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4965(AbstractC5003 abstractC5003, String str, Object obj, C4536 c4536) {
        super(abstractC5003, str, obj, c4536);
        abstractC5003.getClass();
        str.getClass();
        c4536.getClass();
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        this.f14352 = AbstractC5187.m10215(lazyThreadSafetyMode, new C4968(this, 0));
        this.f14351 = AbstractC5187.m10215(lazyThreadSafetyMode, new C4968(this, 1));
    }

    @Override // kotlin.reflect.InterfaceC5097
    public final Object getDelegate() {
        return this.f14351.getValue();
    }

    @Override // kotlin.reflect.InterfaceC5088
    public final InterfaceC5106 getGetter() {
        return (C4964) this.f14352.getValue();
    }

    @Override // p052.InterfaceC6543
    public final Object invoke() {
        return ((C4964) this.f14352.getValue()).call(new Object[0]);
    }

    @Override // kotlin.reflect.jvm.internal.AbstractC4982
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final AbstractC4979 mo9960() {
        return (C4964) this.f14352.getValue();
    }

    @Override // kotlin.reflect.InterfaceC5088
    public final InterfaceC5098 getGetter() {
        return (C4964) this.f14352.getValue();
    }
}
