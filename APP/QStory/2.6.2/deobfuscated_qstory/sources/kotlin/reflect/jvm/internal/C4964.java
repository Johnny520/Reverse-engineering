package kotlin.reflect.jvm.internal;

import kotlin.AbstractC5186;
import kotlin.InterfaceC5183;
import kotlin.LazyThreadSafetyMode;
import kotlin.reflect.InterfaceC5096;
import kotlin.reflect.InterfaceC5097;
import kotlin.reflect.InterfaceC5105;
import kotlin.reflect.jvm.internal.impl.km.C4535;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言子兰世哲苏楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public class C4964 extends AbstractC4981 implements InterfaceC5096 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final InterfaceC5183 f14349;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final InterfaceC5183 f14350;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4964(AbstractC5002 abstractC5002, String str, Object obj, C4535 c4535) {
        super(abstractC5002, str, obj, c4535);
        abstractC5002.getClass();
        str.getClass();
        c4535.getClass();
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        this.f14350 = AbstractC5186.m10211(lazyThreadSafetyMode, new C4967(this, 0));
        this.f14349 = AbstractC5186.m10211(lazyThreadSafetyMode, new C4967(this, 1));
    }

    @Override // kotlin.reflect.InterfaceC5096
    public final Object getDelegate() {
        return this.f14349.getValue();
    }

    @Override // kotlin.reflect.InterfaceC5087
    public final InterfaceC5105 getGetter() {
        return (C4963) this.f14350.getValue();
    }

    @Override // p052.InterfaceC6542
    public final Object invoke() {
        return ((C4963) this.f14350.getValue()).call(new Object[0]);
    }

    @Override // kotlin.reflect.jvm.internal.AbstractC4981
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final AbstractC4978 mo9963() {
        return (C4963) this.f14350.getValue();
    }

    @Override // kotlin.reflect.InterfaceC5087
    public final InterfaceC5097 getGetter() {
        return (C4963) this.f14350.getValue();
    }
}
