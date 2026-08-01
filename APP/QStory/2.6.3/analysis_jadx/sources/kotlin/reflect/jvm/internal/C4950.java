package kotlin.reflect.jvm.internal;

import java.lang.reflect.Member;
import kotlin.AbstractC5187;
import kotlin.InterfaceC5184;
import kotlin.LazyThreadSafetyMode;
import kotlin.reflect.InterfaceC5101;
import kotlin.reflect.InterfaceC5102;
import kotlin.reflect.InterfaceC5106;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4473;
import p253.AbstractC8190;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class C4950 extends AbstractC4942 implements InterfaceC5102 {

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public final InterfaceC5184 f14321;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public final InterfaceC5184 f14322;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4950(AbstractC5003 abstractC5003, InterfaceC4473 interfaceC4473, C5051 c5051) {
        super(abstractC5003, interfaceC4473, c5051);
        abstractC5003.getClass();
        interfaceC4473.getClass();
        c5051.getClass();
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        this.f14322 = AbstractC5187.m10215(lazyThreadSafetyMode, new C4948(this, 0));
        this.f14321 = AbstractC5187.m10215(lazyThreadSafetyMode, new C4948(this, 1));
    }

    @Override // kotlin.reflect.InterfaceC5102
    public final Object get(Object obj) {
        return ((C4951) this.f14322.getValue()).call(obj);
    }

    @Override // kotlin.reflect.InterfaceC5102
    public final Object getDelegate(Object obj) {
        return AbstractC8190.m13704(this, (Member) this.f14321.getValue(), obj, null);
    }

    @Override // kotlin.reflect.InterfaceC5088
    public final InterfaceC5106 getGetter() {
        return (C4951) this.f14322.getValue();
    }

    @Override // p052.InterfaceC6558
    public final Object invoke(Object obj) {
        return get(obj);
    }

    @Override // kotlin.reflect.jvm.internal.AbstractC5024
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public C4950 mo9947(C5051 c5051) {
        return new C4950(this.f14308, mo9942(), c5051);
    }

    @Override // kotlin.reflect.jvm.internal.AbstractC4942
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲 */
    public final AbstractC4963 mo9936() {
        return (C4951) this.f14322.getValue();
    }

    @Override // kotlin.reflect.InterfaceC5088
    public final InterfaceC5101 getGetter() {
        return (C4951) this.f14322.getValue();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4950(AbstractC5003 abstractC5003, String str, String str2, Object obj) {
        super(abstractC5003, str, str2, obj);
        str.getClass();
        str2.getClass();
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        this.f14322 = AbstractC5187.m10215(lazyThreadSafetyMode, new C4948(this, 0));
        this.f14321 = AbstractC5187.m10215(lazyThreadSafetyMode, new C4948(this, 1));
    }
}
