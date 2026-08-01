package kotlin.reflect.jvm.internal;

import kotlin.AbstractC6019;
import kotlin.InterfaceC6016;
import kotlin.LazyThreadSafetyMode;
import kotlin.reflect.InterfaceC5941;
import kotlin.reflect.InterfaceC5945;
import kotlin.reflect.InterfaceC5946;
import kotlin.reflect.jvm.internal.impl.p009km.C5368;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言子哲兰楪苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5829 extends C5797 implements InterfaceC5946 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final InterfaceC6016 f14760;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5829(AbstractC5835 abstractC5835, String str, Object obj, C5368 c5368) {
        super(abstractC5835, str, obj, c5368);
        abstractC5835.getClass();
        str.getClass();
        c5368.getClass();
        this.f14760 = AbstractC6019.m10774(LazyThreadSafetyMode.PUBLICATION, new C5844(this, 9));
    }

    @Override // kotlin.reflect.InterfaceC5939
    public final InterfaceC5941 getSetter() {
        return (C5828) this.f14760.getValue();
    }

    @Override // kotlin.reflect.InterfaceC5946, kotlin.reflect.InterfaceC5939
    public final InterfaceC5945 getSetter() {
        return (C5828) this.f14760.getValue();
    }
}
