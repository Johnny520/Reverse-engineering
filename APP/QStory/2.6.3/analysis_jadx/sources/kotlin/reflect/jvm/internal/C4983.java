package kotlin.reflect.jvm.internal;

import java.lang.reflect.Member;
import kotlin.AbstractC5187;
import kotlin.InterfaceC5184;
import kotlin.LazyThreadSafetyMode;
import kotlin.reflect.InterfaceC5101;
import kotlin.reflect.InterfaceC5102;
import kotlin.reflect.InterfaceC5106;
import kotlin.reflect.jvm.internal.impl.km.C4536;
import p253.AbstractC8190;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言子兰苏世楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class C4983 extends AbstractC4982 implements InterfaceC5102 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final InterfaceC5184 f14386;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final InterfaceC5184 f14387;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4983(AbstractC5003 abstractC5003, String str, Object obj, C4536 c4536) {
        super(abstractC5003, str, obj, c4536);
        str.getClass();
        c4536.getClass();
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        this.f14387 = AbstractC5187.m10215(lazyThreadSafetyMode, new C4986(this, 0));
        this.f14386 = AbstractC5187.m10215(lazyThreadSafetyMode, new C4986(this, 1));
    }

    @Override // kotlin.reflect.InterfaceC5102
    public final Object get(Object obj) {
        return ((C4987) this.f14387.getValue()).call(obj);
    }

    @Override // kotlin.reflect.InterfaceC5102
    public final Object getDelegate(Object obj) {
        return AbstractC8190.m13704(this, (Member) this.f14386.getValue(), obj, null);
    }

    @Override // kotlin.reflect.InterfaceC5088
    public final InterfaceC5106 getGetter() {
        return (C4987) this.f14387.getValue();
    }

    @Override // p052.InterfaceC6558
    public final Object invoke(Object obj) {
        return get(obj);
    }

    @Override // kotlin.reflect.jvm.internal.AbstractC4982
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    public final AbstractC4979 mo9960() {
        return (C4987) this.f14387.getValue();
    }

    @Override // kotlin.reflect.InterfaceC5088
    public final InterfaceC5101 getGetter() {
        return (C4987) this.f14387.getValue();
    }
}
