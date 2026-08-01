package kotlin.reflect.jvm.internal;

import kotlin.AbstractC6019;
import kotlin.InterfaceC6016;
import kotlin.LazyThreadSafetyMode;
import kotlin.reflect.InterfaceC5939;
import kotlin.reflect.InterfaceC5941;
import kotlin.reflect.jvm.internal.impl.p009km.C5368;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言子哲兰苏世楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5830 extends C5816 implements InterfaceC5939 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final InterfaceC6016 f14761;

    public C5830(AbstractC5835 abstractC5835, String str, Object obj, C5368 c5368) {
        super(abstractC5835, str, obj, c5368);
        this.f14761 = AbstractC6019.m10774(LazyThreadSafetyMode.PUBLICATION, new C5844(this, 11));
    }

    @Override // kotlin.reflect.InterfaceC5939
    public final InterfaceC5941 getSetter() {
        return (C5831) this.f14761.getValue();
    }
}
