package kotlin.reflect.jvm.internal;

import kotlin.AbstractC5186;
import kotlin.InterfaceC5183;
import kotlin.LazyThreadSafetyMode;
import kotlin.reflect.InterfaceC5096;
import kotlin.reflect.InterfaceC5097;
import kotlin.reflect.InterfaceC5105;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4472;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public class C4948 extends AbstractC4941 implements InterfaceC5096 {

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public final InterfaceC5183 f14317;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public final InterfaceC5183 f14318;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4948(AbstractC5002 abstractC5002, InterfaceC4472 interfaceC4472, C5050 c5050) {
        super(abstractC5002, interfaceC4472, c5050);
        abstractC5002.getClass();
        interfaceC4472.getClass();
        c5050.getClass();
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        this.f14318 = AbstractC5186.m10211(lazyThreadSafetyMode, new C4958(this, 0));
        this.f14317 = AbstractC5186.m10211(lazyThreadSafetyMode, new C4958(this, 1));
    }

    @Override // kotlin.reflect.InterfaceC5096
    public final Object getDelegate() {
        return this.f14317.getValue();
    }

    @Override // kotlin.reflect.InterfaceC5087
    public final InterfaceC5105 getGetter() {
        return (C4957) this.f14318.getValue();
    }

    @Override // p052.InterfaceC6542
    public final Object invoke() {
        return ((C4957) this.f14318.getValue()).call(new Object[0]);
    }

    @Override // kotlin.reflect.jvm.internal.AbstractC5023
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public C4948 mo9950(C5050 c5050) {
        return new C4948(this.f14306, mo9945(), c5050);
    }

    @Override // kotlin.reflect.jvm.internal.AbstractC4941
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲 */
    public final AbstractC4962 mo9939() {
        return (C4957) this.f14318.getValue();
    }

    @Override // kotlin.reflect.InterfaceC5087
    public final InterfaceC5097 getGetter() {
        return (C4957) this.f14318.getValue();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4948(AbstractC5002 abstractC5002, String str, String str2, Object obj) {
        super(abstractC5002, str, str2, obj);
        str.getClass();
        str2.getClass();
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        this.f14318 = AbstractC5186.m10211(lazyThreadSafetyMode, new C4958(this, 0));
        this.f14317 = AbstractC5186.m10211(lazyThreadSafetyMode, new C4958(this, 1));
    }
}
