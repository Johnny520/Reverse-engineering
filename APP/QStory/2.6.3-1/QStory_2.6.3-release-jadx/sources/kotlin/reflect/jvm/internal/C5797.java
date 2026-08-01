package kotlin.reflect.jvm.internal;

import kotlin.AbstractC6019;
import kotlin.InterfaceC6016;
import kotlin.LazyThreadSafetyMode;
import kotlin.reflect.InterfaceC5929;
import kotlin.reflect.InterfaceC5930;
import kotlin.reflect.InterfaceC5938;
import kotlin.reflect.jvm.internal.impl.p009km.C5368;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言子兰世哲苏楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class C5797 extends AbstractC5814 implements InterfaceC5929 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final InterfaceC6016 f14696;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final InterfaceC6016 f14697;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5797(AbstractC5835 abstractC5835, String str, Object obj, C5368 c5368) {
        super(abstractC5835, str, obj, c5368);
        abstractC5835.getClass();
        str.getClass();
        c5368.getClass();
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        this.f14697 = AbstractC6019.m10774(lazyThreadSafetyMode, new C5800(this, 0));
        this.f14696 = AbstractC6019.m10774(lazyThreadSafetyMode, new C5800(this, 1));
    }

    @Override // kotlin.reflect.InterfaceC5929
    public final Object getDelegate() {
        return this.f14696.getValue();
    }

    @Override // kotlin.reflect.InterfaceC5920
    public final InterfaceC5938 getGetter() {
        return (C5796) this.f14697.getValue();
    }

    @Override // p068.InterfaceC7372
    public final Object invoke() {
        return ((C5796) this.f14697.getValue()).call(new Object[0]);
    }

    @Override // kotlin.reflect.jvm.internal.AbstractC5814
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final AbstractC5811 mo10519() {
        return (C5796) this.f14697.getValue();
    }

    @Override // kotlin.reflect.InterfaceC5920
    public final InterfaceC5930 getGetter() {
        return (C5796) this.f14697.getValue();
    }
}
