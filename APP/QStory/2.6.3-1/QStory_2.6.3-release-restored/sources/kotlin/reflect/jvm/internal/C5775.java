package kotlin.reflect.jvm.internal;

import java.lang.reflect.Member;
import kotlin.AbstractC6019;
import kotlin.InterfaceC6016;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.CallableReference;
import kotlin.reflect.InterfaceC5931;
import kotlin.reflect.InterfaceC5932;
import kotlin.reflect.InterfaceC5938;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5305;
import p269.AbstractC9019;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class C5775 extends AbstractC5774 implements InterfaceC5932 {

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public final InterfaceC6016 f14655;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public final InterfaceC6016 f14656;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5775(AbstractC5835 abstractC5835, InterfaceC5305 interfaceC5305, C5883 c5883) {
        super(abstractC5835, interfaceC5305, c5883);
        abstractC5835.getClass();
        interfaceC5305.getClass();
        c5883.getClass();
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        this.f14656 = AbstractC6019.m10774(lazyThreadSafetyMode, new C5778(this, 0));
        this.f14655 = AbstractC6019.m10774(lazyThreadSafetyMode, new C5778(this, 1));
    }

    @Override // kotlin.reflect.InterfaceC5932
    public final Object getDelegate(Object obj, Object obj2) {
        return AbstractC9019.m14263(this, (Member) this.f14655.getValue(), obj, obj2);
    }

    @Override // kotlin.reflect.InterfaceC5920
    public final InterfaceC5938 getGetter() {
        return (C5779) this.f14656.getValue();
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(Object obj, Object obj2) {
        return ((C5779) this.f14656.getValue()).call(obj, obj2);
    }

    @Override // kotlin.reflect.jvm.internal.AbstractC5856
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public C5775 mo10506(C5883 c5883) {
        return new C5775(this.f14653, mo10501(), c5883);
    }

    @Override // kotlin.reflect.jvm.internal.AbstractC5774
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲 */
    public final AbstractC5795 mo10495() {
        return (C5779) this.f14656.getValue();
    }

    @Override // kotlin.reflect.InterfaceC5920
    public final InterfaceC5931 getGetter() {
        return (C5779) this.f14656.getValue();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5775(AbstractC5835 abstractC5835, String str, String str2) {
        super(abstractC5835, str, str2, CallableReference.NO_RECEIVER);
        str.getClass();
        str2.getClass();
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        this.f14656 = AbstractC6019.m10774(lazyThreadSafetyMode, new C5778(this, 0));
        this.f14655 = AbstractC6019.m10774(lazyThreadSafetyMode, new C5778(this, 1));
    }
}
