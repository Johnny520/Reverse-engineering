package kotlin.reflect.jvm.internal;

import com.bumptech.glide.AbstractC3056;
import java.lang.reflect.Member;
import kotlin.AbstractC5186;
import kotlin.InterfaceC5183;
import kotlin.LazyThreadSafetyMode;
import kotlin.reflect.InterfaceC5100;
import kotlin.reflect.InterfaceC5101;
import kotlin.reflect.InterfaceC5105;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4472;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public class C4949 extends AbstractC4941 implements InterfaceC5101 {

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public final InterfaceC5183 f14319;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public final InterfaceC5183 f14320;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4949(AbstractC5002 abstractC5002, InterfaceC4472 interfaceC4472, C5050 c5050) {
        super(abstractC5002, interfaceC4472, c5050);
        abstractC5002.getClass();
        interfaceC4472.getClass();
        c5050.getClass();
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        this.f14320 = AbstractC5186.m10211(lazyThreadSafetyMode, new C4947(this, 0));
        this.f14319 = AbstractC5186.m10211(lazyThreadSafetyMode, new C4947(this, 1));
    }

    @Override // kotlin.reflect.InterfaceC5101
    public final Object get(Object obj) {
        return ((C4950) this.f14320.getValue()).call(obj);
    }

    @Override // kotlin.reflect.InterfaceC5101
    public final Object getDelegate(Object obj) {
        return AbstractC3056.m6687(this, (Member) this.f14319.getValue(), obj, null);
    }

    @Override // kotlin.reflect.InterfaceC5087
    public final InterfaceC5105 getGetter() {
        return (C4950) this.f14320.getValue();
    }

    @Override // p052.InterfaceC6557
    public final Object invoke(Object obj) {
        return get(obj);
    }

    @Override // kotlin.reflect.jvm.internal.AbstractC5023
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public C4949 mo9950(C5050 c5050) {
        return new C4949(this.f14306, mo9945(), c5050);
    }

    @Override // kotlin.reflect.jvm.internal.AbstractC4941
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲 */
    public final AbstractC4962 mo9939() {
        return (C4950) this.f14320.getValue();
    }

    @Override // kotlin.reflect.InterfaceC5087
    public final InterfaceC5100 getGetter() {
        return (C4950) this.f14320.getValue();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4949(AbstractC5002 abstractC5002, String str, String str2, Object obj) {
        super(abstractC5002, str, str2, obj);
        str.getClass();
        str2.getClass();
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        this.f14320 = AbstractC5186.m10211(lazyThreadSafetyMode, new C4947(this, 0));
        this.f14319 = AbstractC5186.m10211(lazyThreadSafetyMode, new C4947(this, 1));
    }
}
