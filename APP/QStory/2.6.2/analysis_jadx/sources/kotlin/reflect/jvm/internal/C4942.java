package kotlin.reflect.jvm.internal;

import com.bumptech.glide.AbstractC3056;
import java.lang.reflect.Member;
import kotlin.AbstractC5186;
import kotlin.InterfaceC5183;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.CallableReference;
import kotlin.reflect.InterfaceC5098;
import kotlin.reflect.InterfaceC5099;
import kotlin.reflect.InterfaceC5105;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4472;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public class C4942 extends AbstractC4941 implements InterfaceC5099 {

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public final InterfaceC5183 f14308;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public final InterfaceC5183 f14309;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4942(AbstractC5002 abstractC5002, InterfaceC4472 interfaceC4472, C5050 c5050) {
        super(abstractC5002, interfaceC4472, c5050);
        abstractC5002.getClass();
        interfaceC4472.getClass();
        c5050.getClass();
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        this.f14309 = AbstractC5186.m10211(lazyThreadSafetyMode, new C4945(this, 0));
        this.f14308 = AbstractC5186.m10211(lazyThreadSafetyMode, new C4945(this, 1));
    }

    @Override // kotlin.reflect.InterfaceC5099
    public final Object getDelegate(Object obj, Object obj2) {
        return AbstractC3056.m6687(this, (Member) this.f14308.getValue(), obj, obj2);
    }

    @Override // kotlin.reflect.InterfaceC5087
    public final InterfaceC5105 getGetter() {
        return (C4946) this.f14309.getValue();
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(Object obj, Object obj2) {
        return ((C4946) this.f14309.getValue()).call(obj, obj2);
    }

    @Override // kotlin.reflect.jvm.internal.AbstractC5023
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public C4942 mo9950(C5050 c5050) {
        return new C4942(this.f14306, mo9945(), c5050);
    }

    @Override // kotlin.reflect.jvm.internal.AbstractC4941
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲 */
    public final AbstractC4962 mo9939() {
        return (C4946) this.f14309.getValue();
    }

    @Override // kotlin.reflect.InterfaceC5087
    public final InterfaceC5098 getGetter() {
        return (C4946) this.f14309.getValue();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4942(AbstractC5002 abstractC5002, String str, String str2) {
        super(abstractC5002, str, str2, CallableReference.NO_RECEIVER);
        str.getClass();
        str2.getClass();
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        this.f14309 = AbstractC5186.m10211(lazyThreadSafetyMode, new C4945(this, 0));
        this.f14308 = AbstractC5186.m10211(lazyThreadSafetyMode, new C4945(this, 1));
    }
}
