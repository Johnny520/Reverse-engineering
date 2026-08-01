package kotlin.reflect.jvm.internal;

import kotlin.AbstractC6019;
import kotlin.InterfaceC6016;
import kotlin.LazyThreadSafetyMode;
import kotlin.reflect.InterfaceC5941;
import kotlin.reflect.InterfaceC5943;
import kotlin.reflect.InterfaceC5944;
import kotlin.reflect.jvm.internal.impl.p009km.C5368;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言子哲兰世苏楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5827 extends C5815 implements InterfaceC5944 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final InterfaceC6016 f14758;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5827(AbstractC5835 abstractC5835, String str, Object obj, C5368 c5368) {
        super(abstractC5835, str, obj, c5368);
        str.getClass();
        c5368.getClass();
        this.f14758 = AbstractC6019.m10774(LazyThreadSafetyMode.PUBLICATION, new C5844(this, 10));
    }

    @Override // kotlin.reflect.InterfaceC5939
    public final InterfaceC5941 getSetter() {
        return (C5826) this.f14758.getValue();
    }

    @Override // kotlin.reflect.InterfaceC5944
    public final void set(Object obj, Object obj2) {
        ((C5826) this.f14758.getValue()).call(obj, obj2);
    }

    @Override // kotlin.reflect.InterfaceC5944, kotlin.reflect.InterfaceC5939
    public final InterfaceC5943 getSetter() {
        return (C5826) this.f14758.getValue();
    }
}
